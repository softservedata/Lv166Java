package com.softserve.edu.registrator.entity;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.softserve.edu.registrator.dao.RoleDao;
import com.softserve.edu.registrator.dao.daofactory.DaoFactory;
import com.softserve.edu.registrator.dto.AddressDTO;
import com.softserve.edu.registrator.dto.PassportDTO;
import com.softserve.edu.registrator.dto.UserDTO;
import com.softserve.edu.registrator.service.UserService;
import com.softserve.edu.registrator.service.implementation.UserServiceImpl;


public class Test {

	public static void main(String[] args) {

		Session session = HibernateSessionFactory.currentSession();
		Transaction tx = session.beginTransaction();
		
		List<AddressDTO> addressList = new ArrayList<AddressDTO>();
		AddressDTO address = new AddressDTO();
		List<PassportDTO> passportList = new ArrayList<PassportDTO>();
		PassportDTO passport = new PassportDTO();
		
		
		Role role = new Role("Admin","description");
		
		//Integer id = DaoFactory.get().getRoleDao().add(role);
		Integer id = (Integer) session.save(role);
		role.setRoleId(id);
		tx.commit();
		
/*		address.setBuilding("a");
		address.setCity("as");
		address.setDistrict("as");
		address.setFlat("as");
		address.setPostcode("as");
		address.setRegion("as");
		address.setStreet("as");
		
		addressList.add(address);
		
		passport.setNumber(1);
		passport.setPublished_by_data("a");
		passport.setSeria("a");
		passportList.add(passport);
		
		UserService user = new UserServiceImpl();
		UserDTO userDTO = new UserDTO();
		userDTO.setFirstName("a");
		userDTO.setLastName("a");
		userDTO.setMiddleName("a");
		userDTO.setLogin("a");
		userDTO.setPassword("a");
		userDTO.setStatus("block");
		userDTO.setEmail("asdasda");
		userDTO.setAddress(addressList);
		userDTO.setPassport(passportList);
		userDTO.setRole(role);
		
		user.addUser(userDTO);*/
	}

	public Test() {
	}

} 