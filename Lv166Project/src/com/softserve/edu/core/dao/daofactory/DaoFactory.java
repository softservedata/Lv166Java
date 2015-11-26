package com.softserve.edu.core.dao.daofactory;

import com.softserve.edu.core.dao.AddressDao;
import com.softserve.edu.core.dao.AreaDao;
import com.softserve.edu.core.dao.DiscreteValueDao;
import com.softserve.edu.core.dao.InquiryDao;
import com.softserve.edu.core.dao.LineSizeDao;
import com.softserve.edu.core.dao.OwnerDao;
import com.softserve.edu.core.dao.PassportInfoDao;
import com.softserve.edu.core.dao.ResourceDao;
import com.softserve.edu.core.dao.ResourceParametersDao;
import com.softserve.edu.core.dao.ResourceTypeDao;
import com.softserve.edu.core.dao.RoleDao;
import com.softserve.edu.core.dao.StoreOfDiscreteValuesDao;
import com.softserve.edu.core.dao.StoreOfLineSizesDao;
import com.softserve.edu.core.dao.TomeDao;
import com.softserve.edu.core.dao.UserDao;

public final class DaoFactory {

	private AddressDao addressDao;
	private AreaDao areaDao;
	private DiscreteValueDao discreteValueDao;
	private InquiryDao inquiryDao;
	private LineSizeDao lineSizeDao;
	private OwnerDao ownerDao;
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
		ownerDao = new OwnerDao();
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

	public static DaoFactory get() {
		if (daoFactory == null) {
			daoFactory = new DaoFactory();
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

	public OwnerDao getOwnerDao() {
		return ownerDao;
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
