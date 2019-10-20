package com.fmarslan.application.formbuilder.repositories;

import com.fmarslan.application.formbuilder.entities.FieldEntity;

import org.springframework.data.repository.CrudRepository;

public interface IFieldRepository extends CrudRepository<FieldEntity,Integer>{

}