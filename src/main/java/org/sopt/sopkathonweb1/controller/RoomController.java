package org.sopt.sopkathonweb1.controller;


import lombok.RequiredArgsConstructor;
import org.sopt.sopkathonweb1.controller.dto.BaseApiResponse;
import org.sopt.sopkathonweb1.controller.dto.BaseApiResponseNonData;
import org.sopt.sopkathonweb1.dto.request.RoomCreateRequest;
import org.sopt.sopkathonweb1.dto.request.UserEnterRequest;
import org.sopt.sopkathonweb1.service.RoomService;
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

    @PostMapping("/create")
    public BaseApiResponse createRoom(@RequestBody RoomCreateRequest request) {
        roomService.createRoom(request);
        return new BaseApiResponse<>("방 생성 완료", null);
    }

    @PostMapping("/{roomId}/enter")
    public BaseApiResponseNonData enter (
        @RequestBody UserEnterRequest request,
        @PathVariable(value = "roomId") Long roomId
    ) {
        roomService.enterRoom(request, roomId);
        return new BaseApiResponseNonData("방 입장하기 완료");
    }

}