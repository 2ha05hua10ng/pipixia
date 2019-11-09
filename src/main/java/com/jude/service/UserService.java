package com.jude.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jude.controller.UserController;
import com.jude.entity.Log;
import com.jude.entity.Role;
import com.jude.util.StringUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.data.domain.Sort.Direction;

import com.jude.entity.User;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * 用户Service接口
 * @author jude
 *
 */
public interface UserService {

	/**
	 * 根据用户名查找用户实体
	 * @param userName
	 * @return
	 */
	public User findByUserName(String userName);
	
	/**
	 * 根据id查询用户实体
	 * @param id
	 * @return
	 */
	public User findById(Integer id);
	
	/**
	 * 修改或者修改用户信息
	 * @param user
	 */
	public void save(User user);
	
	/**
	 * 根据条件分页查询用户信息
	 * @param user
	 * @param page
	 * @param pageSize
	 * @param direction
	 * @param properties
	 * @return
	 */
	public List<User> list(User user,Integer page,Integer pageSize,Direction direction,String... properties);
	
	/**
	 * 获取总记录数
	 * @param user
	 * @return
	 */
	public Long getCount(User user);
	
	/**
	 * 根据id删除用户
	 * @param id
	 */
	public void delete(Integer id);


}
