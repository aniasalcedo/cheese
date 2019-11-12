package org.launchcode.Models.Data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CheeseDao extends CrudRepository<org.launchcode.models.Cheese, Integer> {
}
