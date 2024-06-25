package org.sopt.sopkathonweb1.controller;


import lombok.RequiredArgsConstructor;
import org.sopt.sopkathonweb1.common.dto.SuccessMessage;
import org.sopt.sopkathonweb1.controller.dto.BaseApiResponse;
import org.sopt.sopkathonweb1.controller.dto.BaseApiResponseNonData;
import org.sopt.sopkathonweb1.domain.Member;
import org.sopt.sopkathonweb1.dto.request.RoomCreateRequest;
import org.sopt.sopkathonweb1.dto.request.UserEnterRequest;
import org.sopt.sopkathonweb1.service.RoomService;
import org.sopt.sopkathonweb1.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/room")
@RequiredArgsConstructor
public class RoomController {

    private final RoomService roomService;
    private final UserService userService;

    @PostMapping("/create")
    public BaseApiResponseNonData createRoom(@RequestBody RoomCreateRequest request) {
        roomService.createRoom(request);
        return new BaseApiResponseNonData("방 생성 완료");
    }

    @PostMapping("/{roomId}/enter")
    public BaseApiResponseNonData enter (
        @RequestBody UserEnterRequest request,
        @PathVariable(value = "roomId") Long roomId
    ) {
        roomService.enterRoom(request, roomId);
        return new BaseApiResponseNonData("방 입장하기 완료");
    }

    @GetMapping("/{roomId}/{memberId}")
    public BaseApiResponse<Member> getMemberContent(
        @PathVariable(value = "roomId") Long roomId,
        @PathVariable(value = "memberId") Long memberId
    ) {
        return new BaseApiResponse<>(
            SuccessMessage.FIND_TMI_SUCCESS.getMessage(),
            userService.findTmibyId(memberId));
    }

}