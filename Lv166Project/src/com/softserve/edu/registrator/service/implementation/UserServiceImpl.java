package com.softserve.edu.registrator.service.implementation;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.softserve.edu.registrator.dao.daofactory.DaoFactory;
import com.softserve.edu.registrator.dao.utils.HibernateUtil;
import com.softserve.edu.registrator.dto.AddressDTO;
import com.softserve.edu.registrator.dto.PassportDTO;
import com.softserve.edu.registrator.dto.UserDTO;
import com.softserve.edu.registrator.entity.Address;
import com.softserve.edu.registrator.entity.PassportInfo;
import com.softserve.edu.registrator.entity.User;
import com.softserve.edu.registrator.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public void addUser(UserDTO user) {
		User userEntity = new User(user.getLogin(),user.getPassword(),user.getRole(),
				user.getFirstName(),user.getLastName(),user.getMiddleName(),user.getEmail(),user.getStatus());
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		//DaoFactory.get().getUserDao().add(userEntity);	
		
		Integer id = DaoFactory.get().getUserDao().add(userEntity);
		userEntity.setUserId(id);
		
		PassportDTO passDTO = user.getPassport().get(user.getPassport().size()-1); 
		AddressDTO addressDTO = user.getAddress().get(user.getAddress().size()-1); 
		
		PassportInfo pass = new PassportInfo(userEntity, passDTO.getSeria(), 
				passDTO.getNumber(), passDTO.getPublished_by_data());
		DaoFactory.get().getPassportInfoDao().add(pass);
		
		Address address = new Address(userEntity, addressDTO.getPostcode(), addressDTO.getRegion(), addressDTO.getDistrict(),
				addressDTO.getCity(), addressDTO.getStreet(), addressDTO.getBuilding(), addressDTO.getFlat());
		
		DaoFactory.get().getAddressDao().add(address);
		
		transaction.commit();

		
	}
}
