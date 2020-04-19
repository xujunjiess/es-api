package com.lanxin.service.impl;

import com.lanxin.bean.Product;
import com.lanxin.bean.ProductInfo;
import com.lanxin.dao.ProductMapper;
import com.lanxin.repository.ProductInfoRepository;
import com.lanxin.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Autowired
    private ProductMapper productMapper;

    public ProductInfo findById(Long id){

          return productInfoRepository.findProductInfoById(id);
    }



}
