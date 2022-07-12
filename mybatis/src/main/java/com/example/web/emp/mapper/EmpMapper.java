package com.example.web.emp.mapper;

import java.util.List;

import com.example.web.service.EmpVO;

public interface EmpMapper {
	public EmpVO getEmp(EmpVO empVO);
	public List<EmpVO> getEmpList(EmpVO empVO);
	public void empInsert(EmpVO empVO);
}