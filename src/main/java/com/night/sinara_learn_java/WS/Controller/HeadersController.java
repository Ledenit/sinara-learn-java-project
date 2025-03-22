package com.night.sinara_learn_java.WS.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

@Controller
public class HeadersController {
    @GetMapping("/headers")
    public String showHeaders(HttpServletRequest request, Model model) {
        List<String> headers = new ArrayList<>();
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            headers.add(headerName + ": " + request.getHeader(headerName));
        }
        model.addAttribute("headers", headers);
        return "headers";
    }
}