package cn.yx.reggie_take_out.service;

import cn.yx.reggie_take_out.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpSession;

/*
@Auther：Y.
*@Date：2022/12/31  15:00
* 
**/
public interface UserService extends IService<User> {

    public void sendMsg(User user, HttpSession session);

}
