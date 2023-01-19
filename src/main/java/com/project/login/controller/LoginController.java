package com.project.login.controller;

import com.project.login.entity.TdPengguna;
import com.project.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/insert-data-pengguna")
    public ResponseEntity simpanDataPengguna(@RequestBody TdPengguna payload){
        ResponseEntity responseEntity = loginService.simpanPengguna(payload);
        return responseEntity;
    }
}
