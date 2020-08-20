package com.dashboard.controller;

import com.dashboard.aop.Rpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.netflix.appinfo.ApplicationInfoManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



    @RestController
    @RequestMapping("/test")
    public class WelcomeBackEndController {
        static final Logger lOGGER = LoggerFactory.getLogger(WelcomeBackEndController.class);
        @Rpc
        @RequestMapping(value = "/v1", method = RequestMethod.GET)
        public String info() {
            return "welcome " + String.valueOf(ApplicationInfoManager.getInstance().getInfo().getPort()) + " has responded";
        }

    }

