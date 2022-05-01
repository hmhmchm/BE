package com.example.seesaw.controller;

import com.example.seesaw.dto.ChatMessageResponseDto;
import com.example.seesaw.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
public class ChatRoomController {
    private final ChatService chatService;

    // 메인페이지 채널 채팅 내역 조회
    @GetMapping("/mainchat/get/main")
    public List<ChatMessageResponseDto> getMainMessage() {
//        List<ChatMessageResponseDto> chatMessagedResponseDtoList = chatService.getMainMessage();
        return chatService.getMainMessage();
    }

}