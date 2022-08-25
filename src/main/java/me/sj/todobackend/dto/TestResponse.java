package me.sj.todobackend.dto;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;

@Data
public class TestResponse {
    private String title;
    private String content;
}
