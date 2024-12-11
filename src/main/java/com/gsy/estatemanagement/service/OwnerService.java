package com.gsy.estatemanagement.service;

import com.github.pagehelper.Page;
import com.gsy.estatemanagement.domain.Owner;

import java.util.List;
import java.util.Map;

public interface OwnerService {

    public List<Owner> getAllOwners();

    public Page<Owner> searchOwner(Map searchOwnerMapper);

}
