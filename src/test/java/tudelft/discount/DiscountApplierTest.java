package tudelft.discount;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountApplierTest {

    @Test
    public void discountApplierTest(){
        List products = new ArrayList();
        products.add(new Product("a", 0, "AAA"));
        products.add(new Product("b", 100, "HOME"));
        products.add(new Product("c", 100, "BUSINESS"));
        products.add(new Product("b", -100, "HOME"));
        products.add(new Product("c", -100, "BUSINESS"));

        ProductDao productDao = Mockito.spy(ProductDao.class);
        productDao.setProductDao(products);
        Mockito.doReturn(products).when(productDao).all();

        DiscountApplier discountApplier = new DiscountApplier(productDao);
        discountApplier.setNewPrices();

        assertEquals(5, productDao.list.size());

        double expected[] = new double[]{0,110,90,-110,-90};

        int i =0;
        for(Product p : productDao.list){
            assertEquals(expected[i++], (int)(p.getPrice()*10)/10);
        }
    }

    @Test
    public void discountApplierEmptyTest(){
        List products = new ArrayList();
        ProductDao productDao = Mockito.spy(ProductDao.class);
    }
}
