package com.dao;

import java.io.IOException;

import com.model.Cart;

public interface CartDao {

	Cart getCartByCartId(Long CartId);
	
	Cart validate(Long cartId) throws IOException;
	
	void update(Cart cart);
}
