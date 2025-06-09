package com.event.applicationeventpublisher.event;

import lombok.Getter;

@Getter
public class MemberRegisteredEvent {
    private final Long memberId;

    public MemberRegisteredEvent(Long memberId) {
        this.memberId = memberId;
    }

}
