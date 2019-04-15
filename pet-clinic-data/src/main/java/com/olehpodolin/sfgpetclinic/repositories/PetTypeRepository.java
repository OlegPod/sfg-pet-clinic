package com.olehpodolin.sfgpetclinic.repositories;

import com.olehpodolin.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
