package com.fmarslan.application.formbuilder.repositories;

import com.fmarslan.application.formbuilder.entities.HistoryEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IHistoryRepository extends PagingAndSortingRepository<HistoryEntity, Integer> {

}