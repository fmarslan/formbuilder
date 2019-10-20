package com.fmarslan.application.formbuilder.repositories;

import com.fmarslan.application.formbuilder.entities.DataEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IDataRepository extends PagingAndSortingRepository<DataEntity,Integer>{

}