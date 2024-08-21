package com.hbsites.commons.infrastructure.messages.incoming;

import com.hbsites.commons.domain.enumeration.EMicroservice;
import com.hbsites.commons.infrastructure.messages.BaseMessage;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@RegisterForReflection
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoRequestMessage extends BaseMessage {
    private List<UUID> userIds;

    @Builder
    public UserInfoRequestMessage(UUID userRequested, EMicroservice microservice, List<UUID> userIds) {
        this.setUserRequested(userRequested);
        this.setMicroservice(microservice);
        this.userIds = userIds;
    }
}
