package com.agrosupport.api.profile.interfaces.rest.transform;

import com.agrosupport.api.profile.domain.model.entities.Advisor;
import com.agrosupport.api.profile.interfaces.rest.resources.AdvisorResource;

public class AdvisorResourceFromEntityAssembler {
    public static AdvisorResource toResourceFromEntity(Advisor entity) {
        return new AdvisorResource(
                entity.getId(),
                entity.getUserId(),
                entity.getRating());
    }
}
