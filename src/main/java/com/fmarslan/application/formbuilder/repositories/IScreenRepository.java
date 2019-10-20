package com.fmarslan.application.formbuilder.repositories;

import com.fmarslan.application.formbuilder.entities.DataEntity;

import org.springframework.data.repository.CrudRepository;

public interface IScreenRepository extends CrudRepository<DataEntity,Integer>{

}