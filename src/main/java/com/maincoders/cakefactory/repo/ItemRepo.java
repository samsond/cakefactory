package com.maincoders.cakefactory.repo;

import com.maincoders.cakefactory.entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepo extends CrudRepository<ItemEntity, String> {
}
