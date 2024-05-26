package org.sopt.sopkathonweb1.service;

import org.sopt.sopkathonweb1.common.dto.ErrorMessage;
import org.sopt.sopkathonweb1.domain.Room;
import org.sopt.sopkathonweb1.domain.Member;
import org.sopt.sopkathonweb1.dto.request.RoomCreateRequest;
import org.sopt.sopkathonweb1.dto.request.UserEnterRequest;
import org.sopt.sopkathonweb1.repository.RoomRepository;
import org.sopt.sopkathonweb1.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class RoomService {
    private final RoomRepository roomRepository;
    private final UserRepository userRepository;

    @Transactional
    public void createRoom(RoomCreateRequest request) {

        Room room = roomRepository.save(
            Room.builder()
                    .code(request.code())
                    .peopleCount(request.peopleCount())
                    .build()
        );
    }

    @Transactional
    public ResponseEntity<?> enterRoom(UserEnterRequest request, Long roomId) {
        Room room = roomRepository.findRoomByIdAndCode(roomId, request.code())
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, ErrorMessage.ROOM_NOT_FOUND.getMessage()));

        int currentMembers = roomRepository.countMembersByRoomId(roomId);
        if (currentMembers >= room.getPeopleCount()) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Room is full");
        }

        Member member = userRepository.save(
                Member.builder()
                        .room(room)
                        .name(request.name())
                        .content(request.content())
                        .build()
        );

        return ResponseEntity.ok().build();
    }

}
