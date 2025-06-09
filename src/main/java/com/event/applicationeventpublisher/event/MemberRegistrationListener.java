package com.event.applicationeventpublisher.event;

import com.event.applicationeventpublisher.service.MailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
@Log4j2
public class MemberRegistrationListener {

    private final MailService mailService;

    @Async
    @EventListener
    public void handleMemberRegistered(MemberRegisteredEvent event) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        mailService.sendMail(event.getMemberId());
    }
}
