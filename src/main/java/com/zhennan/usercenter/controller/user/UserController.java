package com.zhennan.usercenter.controller.user;

import com.zhennan.usercenter.domain.entity.user.User;
import com.zhennan.usercenter.service.user.UserService;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
@Slf4j
public class UserController {

    private final UserService userService;
    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id) {
        return this.userService.findById(id);
    }
}
