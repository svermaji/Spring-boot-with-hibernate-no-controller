package com.spring.experiments.repository;

import com.spring.experiments.model.Notebook;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.repository.annotation.RestResource;

import java.util.List;

/**
 * Created by shaiverm on 23-Nov-2015
 */
@RepositoryRestResource(collectionResourceRel = "notebook", path = "notebook")
public interface NotebookRepository extends PagingAndSortingRepository<Notebook, Long> {

    List<Notebook> findByName(@Param("name") String name);

}