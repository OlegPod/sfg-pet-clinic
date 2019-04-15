package com.olehpodolin.sfgpetclinic.repositories;

import com.olehpodolin.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
