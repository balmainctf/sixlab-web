/*
 * Copyright (c) 2016 Sixlab. All rights reserved.
 *
 * Under the GPLv3(AKA GNU GENERAL PUBLIC LICENSE Version 3).
 * see http://www.gnu.org/licenses/gpl-3.0-standalone.html
 *
 * For more information, please see
 * http://sixlab.cn/
 * 
 * @author 六楼的雨/Patrick Root
 * @since 2.0.0
 */
package cn.sixlab.web.server.module;

import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 六楼的雨/Patrick Root
 * @since 2.0.0
 */
@IocBean
@At("/lab")
public class LabModule {
    private static Logger logger = LoggerFactory.getLogger(LabModule.class);
    
    public String index() {
        
        return "lab/index";
    }
}
