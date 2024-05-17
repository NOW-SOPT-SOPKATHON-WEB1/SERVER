package org.sopt.sopkathonweb1.controller;

import org.sopt.sopkathonweb1.controller.dto.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "솝커톤 테스트 API 입니다!!";
    }

    @GetMapping("/test/json")
    public ApiResponse testJson() {
        return ApiResponse.create("솝커톤 API - JSON");
    }
}
