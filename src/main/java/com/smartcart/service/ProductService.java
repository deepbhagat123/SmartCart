package com.smartcart.service;

import com.smartcart.exception.ProductNotFoundException;
import com.smartcart.model.Electronics;
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

       public void printAllProducts(){
           Products.stream()
                   .forEach(p->System.out.println(p));
       }

       public void printElectronics(){
           Products.stream()
                   .filter(p->p instanceof Electronics)
                   .forEach(System.out::println);
       }

       public void printSortedByPrice(){
           Products.stream()
                   .sorted((p1,p2)-> Double.compare(p1.getPrice(),p2.getPrice()))
                   .forEach(p->System.out.println(p));
       }


}
