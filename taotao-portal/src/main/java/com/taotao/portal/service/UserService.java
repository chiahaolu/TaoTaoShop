package com.taotao.portal.service;

import com.taotao.pojo.TbUser;

/**
 * 获取用户信息
 * Created by lujiahao on 2016/11/1.
 */
public interface UserService {
    /**
     * 根据token查询用户信息
     * @param token
     * @return
     */
    TbUser getUserByToken(String token);
}
