package com.example.springsecuritysix.secutity.controller;

import com.example.springsecuritysix.util.constant.UrlConstants;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UrlConstants.AUTHENTICATION_URL)
@RequiredArgsConstructor
public class AuthenticationController {

}
