/*
 * Copyright (c) 2016 Sixlab. All rights reserved.
 *
 * Under the GPLv3(AKA GNU GENERAL PUBLIC LICENSE Version 3).
 * see http://www.gnu.org/licenses/gpl-3.0-standalone.html
 *
 * For more information, please see
 * https://sixlab.cn/
 */
package cn.sixlab.web.server.module.tool;

import cn.sixlab.web.server.service.tool.RecordService;
import cn.sixlab.web.server.util.JsonMap;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;


/**
 * @author <a href="https://blog.sixlab.cn/">六楼的雨/Patrick Root</a>
 */
@IocBean
@At("/tool/record")
public class RecordModule {
    private static Logger logger = LoggerFactory.getLogger(RecordModule.class);

    @Inject
    private RecordService service;

    @At(value = {"/", "/index"})
    public String index() {
        return "tool/record/index";
    }

    @At("/choose")
    public String compare() {
        //service.index(model);
        return "tool/record/choose";
    }

    @At("/compare/?/?")
    public String compare(Date date1, Date date2) {
        //service.compare(date1, date2, model);
        return "tool/record/compare";
    }

    @At("/edit")
    public String edit() {
        //service.edit(model);
        return "tool/record/edit";
    }

    @At("/add")
    @Ok("json:compact")
    public JsonMap add() {
        JsonMap json = new JsonMap();


        return json;
    }

    @At("/del")
    @Ok("json:compact")
    public JsonMap del() {
        JsonMap json = new JsonMap();

        

        return json;
    }

    @At("/record")
    public String record() {
        return "tool/record/record";
    }

}
