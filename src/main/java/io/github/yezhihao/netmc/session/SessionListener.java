package io.github.yezhihao.netmc.session;

/**
 * @author yezhihao
 * home https://gitee.com/yezhihao/jt808-server
 */
public interface SessionListener {

    /** 客户端建立连接 */
    default void sessionCreated(Session session) {
    }

    /** 客户端完成注册或鉴权 */
    default void sessionRegistered(Session session) {
    }

    /** 客户端注销或离线 */
    default void sessionDestroyed(Session session) {
    }
}