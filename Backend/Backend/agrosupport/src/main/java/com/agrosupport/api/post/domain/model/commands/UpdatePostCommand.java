package com.agrosupport.api.post.domain.model.commands;

public record UpdatePostCommand(Long id, String title, String description, String image) {
}
