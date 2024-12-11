package com.gsy.estatemanagement.service;

import com.github.pagehelper.Page;
import com.gsy.estatemanagement.domain.Community;

import java.util.List;
import java.util.Map;

public interface CommunityService {

    public List<Community> getAllCommunities();

    public Page<Community> searchCommunity(Map searchCommunityMap);
}
