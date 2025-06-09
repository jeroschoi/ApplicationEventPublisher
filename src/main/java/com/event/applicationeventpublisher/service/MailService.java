package com.event.applicationeventpublisher.service;


import com.event.applicationeventpublisher.common.MemberMailConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MailService {

    public void sendMail(Long memberId) {
        String email = getMemberEmail(memberId);
        log.info("Member Mail selected : {}", email);
        if (email != null) {
            log.info("Send Mail Successfully");
        } else {
            log.info("Mail Not Selected");
        }
    }

    public String getMemberEmail(Long memberId) {
        return MemberMailConfig.MemberMailConfig.get(memberId);
    }
}
