package com.neuedu.service;

import com.neuedu.dao.ProductDao;
import com.neuedu.pojo.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/3/21.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    ProductDao productDao;
    @Override
    public List<Product> list() {
        return productDao.list();
    }
}
