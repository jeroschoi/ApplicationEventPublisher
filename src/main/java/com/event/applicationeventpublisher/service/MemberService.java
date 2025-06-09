package com.event.applicationeventpublisher.service;

import com.event.applicationeventpublisher.common.MemberMailConfig;
import com.event.applicationeventpublisher.event.MemberRegisteredEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MemberService {

    private final ApplicationEventPublisher eventPublisher;

    public void registerMember() {
        Long memberId = 1L;
        log.info("[Member Id Created ] : {}", memberId);
        eventPublisher.publishEvent(new MemberRegisteredEvent(memberId));
        MemberMailConfig.MemberMailConfig.put(memberId , "TestEmail");
        log.info("[Member Registered]");
    }
}
