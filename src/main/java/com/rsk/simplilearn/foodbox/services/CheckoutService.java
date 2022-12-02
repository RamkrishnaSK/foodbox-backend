package com.rsk.simplilearn.foodbox.services;

import com.rsk.simplilearn.foodbox.dto.Purchase;
import com.rsk.simplilearn.foodbox.dto.PurchaseResponse;

public interface CheckoutService {
	public PurchaseResponse placeOrder(Purchase purchase);
}
