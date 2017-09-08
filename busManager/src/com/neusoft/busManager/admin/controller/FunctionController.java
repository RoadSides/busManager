package com.neusoft.busManager.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.busManager.admin.model.FunctionModel;
import com.neusoft.busManager.admin.service.IFunctionService;
import com.neusoft.busManager.util.ResultInfo;


@RestController
@RequestMapping("/function")
public class FunctionController {
	
	@Autowired
	private IFunctionService fs;
	
	@RequestMapping(value="/get",method=RequestMethod.GET)
	public FunctionModel get(@RequestParam int functionNo) throws Exception{
		return fs.get(functionNo);
	}
	
	
	
	//取得所有功能列表
	@RequestMapping(value="/list/all")
	public List<FunctionModel> getListByAll() throws Exception
	{
		List<FunctionModel> listByAll = fs.getListByAll();
		return listByAll;	
	}
	@RequestMapping(value="/list/all/grid")
	public ResultInfo<FunctionModel> getListByAllForGrid() throws Exception
	{
		ResultInfo<FunctionModel> result=new ResultInfo<FunctionModel>();
		List<FunctionModel> list=fs.getListByAll(); 
		result.setList(list);
		result.setCount(list.size());
		result.setPageCount(1);
		result.setRows(list.size());
		result.setPage(1);
		return result;
	}
	
	//取得指定用户的功能列表
	@RequestMapping(value="/list/user")
	public List<FunctionModel> getListByUser(@RequestParam String userid) throws Exception
	{
		return fs.getListByUser(userid);
	}

}
