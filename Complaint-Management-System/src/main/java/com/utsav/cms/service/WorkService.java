package com.utsav.cms.service;

import java.util.List;

import com.utsav.cms.model_bean.User;
import com.utsav.cms.model_bean.Work;

public interface WorkService {
	Work saveWork(Work work);
	List<Work> getAllWork();
	Work getWorkById(long id);
	List<Work> getWorkByUserId(User userId);
	List<Work> getWorkByIdName(String idName);
	Work updateWork(Work work, long id);
	String deleteWork(long id);
	String deleteWorkByUserId(User userId);

}
