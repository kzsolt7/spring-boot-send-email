package com.example.sendmail;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MailRestController {

    private final EmailService emailService;

    @GetMapping("")
    public void index() {
        emailService.sendMail("example@gmail.com", "Happy Coding", "Email");
    }
}
