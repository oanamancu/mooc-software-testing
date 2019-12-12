package tudelft.discount;

import java.util.List;

public class ProductDao {

    List<Product> list;

    List<Product> all(){
        return list;
    }

    void setProductDao(List<Product> list){
        this.list = list;
    }
}
