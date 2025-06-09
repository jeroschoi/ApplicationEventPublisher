package com.event.applicationeventpublisher.controller;


import com.event.applicationeventpublisher.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Member;

@RestController
@RequiredArgsConstructor
public class EventTestController {

    private final MemberService memberService;

    @RequestMapping("/test")
    public void TestController() {
        memberService.registerMember();
    }
}
