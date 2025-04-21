package com.night.sinara_learn_java.security;


import jakarta.annotation.security.RolesAllowed;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/public/api")
    public String publicApi() {
        return "Я доступен вообще всем пользователям";
    }

    @RolesAllowed("admin")
    @GetMapping("/admin/api")
    public UserDTO  adminApi(Authentication authentication) {
        String role  = authentication.getAuthorities().iterator().next().getAuthority().substring("ROLE_".length());
        return new UserDTO(authentication.getName(), role);
    }

    @RolesAllowed("support")
    @GetMapping("/support/api")
    public UserDTO supportApi(Authentication authentication) {
        String role  = authentication.getAuthorities().iterator().next().getAuthority().substring("ROLE_".length());
        return new UserDTO(authentication.getName(), role);
    }

}
