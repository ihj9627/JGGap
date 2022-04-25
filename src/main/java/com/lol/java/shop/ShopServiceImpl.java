package com.lol.java.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("shopService")
public class ShopServiceImpl implements ShopService{

	@Autowired
	ShopDAO shopDAO;

	@Override
	public int getUsablePoints(ShopVO vo) {
		return shopDAO.getUsablePoints(vo);
	}

	@Override
	public List<ShopVO> getItems() {
		return shopDAO.getItems();
	}

	@Override
	public void insertItem(ShopVO vo) {
		shopDAO.insertItem(vo);
	}

	@Override
	public int[] getCounts() {
		return shopDAO.getCounts();
	}

	@Override
	public void insertApply(ShopVO vo) {
		shopDAO.insertApply(vo);
	}
	
}
