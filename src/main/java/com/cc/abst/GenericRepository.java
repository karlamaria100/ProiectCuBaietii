package com.cc.abst;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

/**
 * Created by Karla on 11-Jan-18.
 */
public interface GenericRepository<T, PK extends Serializable>
        extends JpaRepository<T, PK>,
        CrudRepository<T, PK>,
        PagingAndSortingRepository<T, PK>,
        JpaSpecificationExecutor<T> {


}