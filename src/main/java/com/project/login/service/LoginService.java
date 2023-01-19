package com.project.login.service;

import com.project.login.entity.TdPengguna;
import com.project.login.repository.TdPenggunaRepository;
import com.project.login.utility.MessageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class LoginService {

    @Autowired
    private TdPenggunaRepository tdPenggunaRepository;

    public ResponseEntity simpanPengguna(TdPengguna payload) {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();

        try {
            payload.setCreatedDate(new Date());
            payload.setUpdatedDate(new Date());
            System.out.println("test 1"+payload);
            tdPenggunaRepository.save(payload);
            System.out.println("test 2");
            msg.setStatus(true);
            msg.setMessage("Data Tersimpan");
            result.put("Data:", payload);
            msg.setData(result);
            return ResponseEntity.ok().body(msg);
        } catch (Exception e) {
            e.printStackTrace();
            msg.setStatus(false);
            msg.setMessage(e.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(msg);
        }
    }
}
