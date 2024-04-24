package com.curdoperation.operation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curdoperation.operation.model.Reader;
import com.curdoperation.operation.service.ReaderService;

@RestController
public class ReaderController {
@Autowired
ReaderService s;
@PostMapping("/insert")
public List<Reader> insertdata(@RequestBody List<Reader> data)
{
    return s.insertdatas(data);
}
}
