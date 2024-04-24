package com.curdoperation.operation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curdoperation.operation.Repo.ReaderRepo;
import com.curdoperation.operation.model.Reader;

@Service
public class ReaderService {
@Autowired
ReaderRepo r;
public List<Reader> insertdatas(List<Reader> reader)
{
    return r.saveAll(reader);
}

}
