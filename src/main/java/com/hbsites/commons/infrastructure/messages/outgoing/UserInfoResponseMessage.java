package com.hbsites.commons.infrastructure.messages.outgoing;

import com.hbsites.commons.domain.dto.UserDTO;
import com.hbsites.commons.infrastructure.messages.incoming.UserInfoRequestMessage;
import com.hbsites.commons.infrastructure.messages.BaseMessage;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@RegisterForReflection
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoResponseMessage extends BaseMessage {
    private List<UserDTO> userInfos;

    @Builder(builderMethodName = "fromRequest")
    public UserInfoResponseMessage(UserInfoRequestMessage request, List<UserDTO> userInfos) {
        this.setUserRequested(request.getUserRequested());
        this.setMicroservice(request.getMicroservice());
        this.userInfos = userInfos;
    }
}
