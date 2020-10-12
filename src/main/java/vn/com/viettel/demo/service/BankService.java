package vn.com.viettel.demo.service;

import vn.com.viettel.demo.model.entity.CongDan;

public interface BankService {
	public CongDan findCongDanByID(Integer id);
	public boolean isVay() ;
	public void doVay();
}
