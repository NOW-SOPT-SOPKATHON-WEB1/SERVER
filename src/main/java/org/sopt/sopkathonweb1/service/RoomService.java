package org.sopt.sopkathonweb1.service;

import org.sopt.sopkathonweb1.common.dto.ErrorMessage;
import org.sopt.sopkathonweb1.domain.Room;
import org.sopt.sopkathonweb1.domain.Member;
import org.sopt.sopkathonweb1.dto.request.RoomCreateRequest;
import org.sopt.sopkathonweb1.dto.request.UserEnterRequest;
import org.sopt.sopkathonweb1.dto.response.UserTmiResponse;
import org.sopt.sopkathonweb1.exception.NotFoundException;
import org.sopt.sopkathonweb1.repository.RoomRepository;
import org.sopt.sopkathonweb1.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class RoomService {
    private final RoomRepository roomRepository;
    private final UserRepository userRepository;

   /* public Member findMemberById(Long memberId) {
        Room room = roomRepository.findById(memberId).orElseThrow(
            () -> new NotFoundException(ErrorMessage.MEMBER_NOT_FOUND)
        );
        return userRepository.findById(memberId).orElseThrow(
            () -> new NotFoundException(ErrorMessage.MEMBER_NOT_FOUND)
        );
    }*/

    @Transactional
    public void createRoom(RoomCreateRequest request) {

        Room room = roomRepository.save(
            Room.builder()
                .peopleCount(request.peopleCount())
                .build()
        );
    }

    @Transactional
    public void enterRoom(
        UserEnterRequest request,
        Long roomId
    ) {

        Member member = userRepository.save(
            Member.builder()
                .name(request.name())
                .content(request.content())
                .build()
        );

    }





}
