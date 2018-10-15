package com.manulife.gees.template_APIManagement_Mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemplateService {

    @Autowired
    MysqlRepository repository;

    public Response getResponse(int id) {

        return repository.findById(id);
    }

    public int createResponse(Response response) {
        repository.save(response);
        return response.getId();
    }

    public Response updateResponse(Response response) {
        repository.save(response);

        return response;
    }

    public void deleteResponse(int id) {
        repository.delete(id);
    }

}