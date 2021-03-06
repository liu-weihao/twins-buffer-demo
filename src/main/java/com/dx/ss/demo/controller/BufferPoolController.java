package com.dx.ss.demo.controller;

import com.dx.ss.buffer.core.BufferPool;
import com.dx.ss.demo.data.BufferData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class BufferPoolController {

    @Autowired
    private BufferPool bufferPool;

    @PostMapping(value = "/submit")
    public void submit(@RequestBody BufferData data) {
        bufferPool.submit(data);
    }
}
