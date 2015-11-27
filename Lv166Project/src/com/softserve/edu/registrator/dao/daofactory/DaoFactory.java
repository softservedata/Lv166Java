package com.softserve.edu.registrator.dao.daofactory;

import com.softserve.edu.registrator.dao.AddressDao;
import com.softserve.edu.registrator.dao.AreaDao;
import com.softserve.edu.registrator.dao.DiscreteValueDao;
import com.softserve.edu.registrator.dao.InquiryDao;
import com.softserve.edu.registrator.dao.LineSizeDao;
import com.softserve.edu.registrator.dao.PassportInfoDao;
import com.softserve.edu.registrator.dao.ResourceDao;
import com.softserve.edu.registrator.dao.ResourceParametersDao;
import com.softserve.edu.registrator.dao.ResourceTypeDao;
import com.softserve.edu.registrator.dao.RoleDao;
import com.softserve.edu.registrator.dao.StoreOfDiscreteValuesDao;
import com.softserve.edu.registrator.dao.StoreOfLineSizesDao;
import com.softserve.edu.registrator.dao.TomeDao;
import com.softserve.edu.registrator.dao.UserDao;

public final class DaoFactory {

	private AddressDao addressDao;
	private AreaDao areaDao;
	private DiscreteValueDao discreteValueDao;
	private InquiryDao inquiryDao;
	private LineSizeDao lineSizeDao;
	private PassportInfoDao passportInfoDao;
	private ResourceDao resourceDao;
	private ResourceParametersDao resourceParametersDao;
	private ResourceTypeDao resourceTypeDao;
	private RoleDao roleDao;
	private StoreOfDiscreteValuesDao storeOfDiscreteValuesDao;
	private StoreOfLineSizesDao storeOfLineSizesDao;
	private TomeDao tomeDao;
	private UserDao userDao;

	private static DaoFactory daoFactory;

	private DaoFactory() {
		addressDao = new AddressDao();
		areaDao = new AreaDao();
		discreteValueDao = new DiscreteValueDao();
		inquiryDao = new InquiryDao();
		lineSizeDao = new LineSizeDao();
		passportInfoDao = new PassportInfoDao();
		resourceDao = new ResourceDao();
		resourceParametersDao = new ResourceParametersDao();
		resourceTypeDao = new ResourceTypeDao();
		roleDao = new RoleDao();
		storeOfDiscreteValuesDao = new StoreOfDiscreteValuesDao();
		storeOfLineSizesDao = new StoreOfLineSizesDao();
		tomeDao = new TomeDao();
		userDao = new UserDao();

	}

	public static DaoFactory get(){
		if(daoFactory==null){
			daoFactory=new DaoFactory();
		}
		return daoFactory;
	}

	public AddressDao getAddressDao() {
		return addressDao;
	}

	public AreaDao getAreaDao() {
		return areaDao;
	}

	public DiscreteValueDao getDiscreteValueDao() {
		return discreteValueDao;
	}

	public InquiryDao getInquiryDao() {
		return inquiryDao;
	}

	public LineSizeDao getLineSizeDao() {
		return lineSizeDao;
	}

	public PassportInfoDao getPassportInfoDao() {
		return passportInfoDao;
	}

	public ResourceDao getResourceDao() {
		return resourceDao;
	}

	public ResourceParametersDao getResourceParametersDao() {
		return resourceParametersDao;
	}

	public ResourceTypeDao getResourceTypeDao() {
		return resourceTypeDao;
	}

	public RoleDao getRoleDao() {
		return roleDao;
	}

	public StoreOfDiscreteValuesDao getStoreOfDiscreteValuesDao() {
		return storeOfDiscreteValuesDao;
	}

	public StoreOfLineSizesDao getStoreOfLineSizesDao() {
		return storeOfLineSizesDao;
	}

	public TomeDao getTomeDao() {
		return tomeDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public static DaoFactory getDaoFactory() {
		return daoFactory;
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
