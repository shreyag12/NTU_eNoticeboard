package com.noticeboard.services;

import com.noticeboard.model.Notice;

public interface NoticeService {

	public Notice[] searchByCategory(String categoryId);

	public Notice[] searchByDepartment(String departmentId);

	public void insertNotice(Notice notice);
}
