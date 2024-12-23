package com.chat.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChatMessage {
    private Long id;

    @JsonProperty("sender")
    private String sender;
    @JsonProperty("content")
    private String content;
}
