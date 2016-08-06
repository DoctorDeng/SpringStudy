package com.doctor.service;

import com.doctor.entity.Account;

public interface AccountService {
	/**
	 * 转账
	 * @param inAccount   转入账户
	 * @param outAccount  转出账户
	 * @return
	 */
	public int transferAccounts(Account inAccount,Account outAccount);
}
