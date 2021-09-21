import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GSTtest {

    Shop Products;

    @Test
    public void verifyAllProducts(){
        //Arrange
    Products = new Shop();
    Amazon Bike =new Bike("rx100","yamaha",2010,200000);
    Amazon Cycle = new Cycle("BMW cruise","BMW",2015,100000);
    Amazon Toy = new Toy("flight","HM",2017,3000);

    //Act
    Products.addProduct(Bike);
    Products.addProduct(Cycle);
    Products.addProduct(Toy);
    //Assert
        List<Amazon> Product = Products.getAllProduct();
        for (Amazon product1 : Product){
            Assert.assertTrue(product1 instanceof Bike||product1 instanceof Cycle|| product1 instanceof Toy);
        }

    }

    @Test
    public void getProductsWithGst() {
        //Arrange
        Products = new Shop();
        Amazon Bike = new Bike("rx100", "yamaha", 2010, 200000);
        Amazon Cycle = new Cycle("BMW cruise", "BMW", 2015, 100000);
        Amazon Toy = new Toy("flight", "HM", 2017,3000);

        //Act
        Products.addProduct(Bike);
        Products.addProduct(Cycle);
        Products.addProduct(Toy);
        //Assertion
        List<Amazon> Product = Products.getGSTProduct();
        for (Amazon product1 : Product) {
            Assert.assertTrue(product1 instanceof Bike || product1 instanceof Cycle || product1 instanceof Toy);
        }
    }
        @Test
        public void VerifyTotalPriceIncludingGstIsGreaterThan2000()
    {
            //Arrange
            Products =  new Shop();
            Amazon Bike = new Bike("rx100","yamaha",2010,200000);
            Amazon Cycle = new Cycle("BMW cruise","BMW",2015,100000);
            Amazon Toy = new Toy("flight","HM",2017,3000);
            //Act
            Products.addProduct(Bike);
            Products.addProduct(Cycle);
            Products.addProduct(Toy);

            //Assertion
           Assert.assertEquals(Products.getTotalPrice(Bike),200000);
           Assert.assertEquals(Products.getTotalPrice(Cycle), 100000);
           Assert.assertEquals(Products.getTotalPrice(Toy),3000);
            }
        }

