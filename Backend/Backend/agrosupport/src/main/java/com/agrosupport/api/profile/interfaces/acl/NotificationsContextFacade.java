package com.agrosupport.api.profile.interfaces.acl;

import com.agrosupport.api.profile.domain.model.commands.CreateNotificationCommand;
import com.agrosupport.api.profile.domain.services.NotificationCommandService;
import com.agrosupport.api.profile.domain.services.NotificationQueryService;
import com.agrosupport.api.profile.interfaces.rest.resources.CreateNotificationResource;
import org.springframework.stereotype.Service;

@Service
public class NotificationsContextFacade {
    private final NotificationQueryService notificationQueryService;
    private final NotificationCommandService notificationCommandService;

    public NotificationsContextFacade(NotificationQueryService notificationQueryService, NotificationCommandService notificationCommandService) {
        this.notificationQueryService = notificationQueryService;
        this.notificationCommandService = notificationCommandService;
    }

    public Long createNotification(CreateNotificationResource notification) {
        return notificationCommandService.handle(new CreateNotificationCommand(notification.userId(), notification.title(), notification.message(), notification.sendAt()));
    }
}
