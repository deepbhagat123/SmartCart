package com.smartcart.service;

import com.smartcart.exception.ProductNotFoundException;
import com.smartcart.model.Product;
import java.util.ArrayList;

public class ProductService {
       private ArrayList<Product> Products = new ArrayList<>();

       public void addProduct (Product product){
           Products.add(product);
       }

       public Product getProductByIndex(int index){
           if(index < 0 || index >= Products.size()){
               throw new ProductNotFoundException(
                       "Not found at the Index :" + index
               );
           }

           return Products.get(index);
       }

       public int getTotalProduct(){
           return Products.size();
       }
}
