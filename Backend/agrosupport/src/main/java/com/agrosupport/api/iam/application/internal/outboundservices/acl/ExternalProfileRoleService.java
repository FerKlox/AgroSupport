package com.agrosupport.api.iam.application.internal.outboundservices.acl;

import com.agrosupport.api.iam.domain.model.aggregates.User;
import com.agrosupport.api.profile.interfaces.acl.ProfilesContextFacade;
import org.springframework.stereotype.Service;

@Service
public class ExternalProfileRoleService {
    private final ProfilesContextFacade profilesContextFacade;

    public ExternalProfileRoleService(ProfilesContextFacade profilesContextFacade) {
        this.profilesContextFacade = profilesContextFacade;
    }

    public Long createFarmer(Long userId, User user) {
        return profilesContextFacade.createFarmer(userId, user);
    }

    public Long createAdvisor(Long userId, User user) {
        return profilesContextFacade.createAdvisor(userId, user);
    }

}
