package com.ylh.execute.common.modules.redis.listener;


import com.ylh.execute.common.base.BaseMap;

/**
 * 自定义消息监听
 */
public interface JeecgRedisListerer {

    void onMessage(BaseMap message);

}
