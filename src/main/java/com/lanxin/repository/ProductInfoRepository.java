package com.lanxin.repository;

import com.lanxin.bean.ProductInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ProductInfoRepository extends ElasticsearchRepository<ProductInfo,Long> {

    List<ProductInfo> findAllById(Long id);

    ProductInfo findProductInfoById(Long id);


}
