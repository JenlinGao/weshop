package tech.wetech.weshop.wechat.service;

import tech.wetech.weshop.wechat.dto.CategoryDTO;
import tech.wetech.weshop.wechat.dto.CategoryIndexDTO;
import tech.wetech.weshop.enums.CategoryLevelEnum;
import tech.wetech.weshop.po.Category;
import tech.wetech.weshop.service.IService;

import java.util.List;

/**
 * @author cjbi@outlook.com
 */
public interface CategoryService extends IService<Category> {

    /**
     * 根据类目查询商品
     * @param categoryLevel
     * @return
     */
    List<Category> queryCategoryByLevel(CategoryLevelEnum categoryLevel);

    CategoryIndexDTO index(Integer cateogyId);

    CategoryDTO current(Integer id);
}
