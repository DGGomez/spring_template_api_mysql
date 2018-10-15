package com.manulife.gees.template_APIManagement_Mysql;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MysqlRepository extends CrudRepository<Response, Integer> {
    List<Response> findAll();
    Response findById(int id);
}

