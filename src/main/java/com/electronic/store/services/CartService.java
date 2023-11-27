package com.electronic.store.services;

import com.electronic.store.dtos.AddItemToCartRequest;
import com.electronic.store.dtos.CartDto;

public interface CartService {
    //add item to cart
    //case 1 : cart is not available for user : first we create the cart and then perform the operations
    //case 1 : cart is available , add the items to tha cart
    CartDto addItemsToCart(String userId, AddItemToCartRequest request);

    //remove item from cart
    void removeItemFromCart(String UserId, int cartItem);
    //remove all items from cart
    void clearCart(String userId);
    CartDto getCartByUser(String userId);
}
