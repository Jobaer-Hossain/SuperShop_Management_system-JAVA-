package Interfaces;
import Product.*;
import Person.*;
public interface ProductOperation
{
	void addProduct(Product p);
	void removeProduct(Product p);
	Product searchProduct (int pId);
	void showProduct();
}