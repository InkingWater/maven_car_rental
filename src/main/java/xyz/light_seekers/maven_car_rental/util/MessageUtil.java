package xyz.light_seekers.maven_car_rental.util;

import java.util.Date;

/**
 * @Author: ZhiliangJia
 * @Description: return data
 * @Date:Create in 9:38 2020/7/3
 * @Modified User: ZhiliangJia
 */

public class MessageUtil {
    /**
     * 成功并返回数据实体类
     *
     * @param o
     * @param <E>
     * @return
     */
    public static <E> Message<E> success(E o) {
        return new Message<>(200, "success", o, new Date().getTime());
    }


    /**
     * 成功，但无数据实体类返回
     *
     * @return
     */
    public static <E> Message<E> success() {
        return new Message<>(200, "success", null, new Date().getTime());
    }

    /**
     * 失败，有自定义异常返回
     *
     * @param code
     * @param msg
     * @return
     */
    public static <E> Message<E> error(Integer code, String msg) {
        return new Message<>(code, msg, null, new Date().getTime());
    }

    public static class Message<T> {

        public Message() {
        }

        public Message(Integer status, String message, T data,  Long time) {
            this.status = status;
            this.message = message;
            this.data = data;
            this.time = time;

        }

        /**
         * 状态码
         */
        private Integer status;

        /**
         * 返回信息
         */
        private String message;

        /**
         * 返回的数据类
         */
        private T data;


        /**
         * 时间
         */
        private Long time;

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Long getTime() {
            return time;
        }

        public void setTime(Long time) {
            this.time = time;
        }
    }
}
