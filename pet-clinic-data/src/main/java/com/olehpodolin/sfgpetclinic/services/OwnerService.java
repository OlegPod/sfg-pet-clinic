package com.olehpodolin.sfgpetclinic.services;

import com.olehpodolin.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
