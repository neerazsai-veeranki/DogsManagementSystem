package com.veeranki.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.veeranki.DMS.Models.Dog;

/**
 * 
 * @author S549929
 *
 */

public interface DogRepository extends CrudRepository<Dog, Integer> {

	List<Dog> findByName(String name); 
}
