package com.gp.cms.repository;

import com.gp.cms.model.Photo;
import com.gp.cms.model.entity.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhotoMapper {
    /**
     * 查询
     *
     * @param albumId 相册id
     * @param page    分页
     * @return
     */
    List<Photo> queryByList(@Param("albumId") Long albumId, @Param("page") Page page);

    /**
     * 查询
     *
     * @param ids 照片id集合
     * @return
     */
    List<Photo> queryByIds(@Param("ids") List<String> ids);

    /**
     * 查询
     *
     * @param albumId 相册id
     * @return
     */
    List<Photo> queryByAlbumId(Long albumId);

    /**
     * 添加
     *
     * @param photo 照片
     */
    void add(@Param("photo") Photo photo);

    /**
     * 删除
     *
     * @param albumId 相册id
     */
    void deleteByAlbumId(Long albumId);

    /**
     * 删除
     *
     * @param ids 照片id集合
     */
    void deleteByIds(@Param("ids") List<String> ids);

    /**
     * 查询数量
     *
     * @param albumId 相册id
     * @return
     */
    Long count(Long albumId);
}
