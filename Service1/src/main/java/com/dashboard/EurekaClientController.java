package com.dashboard;

import com.netflix.appinfo.ApplicationInfoManager;
import com.netflix.appinfo.InstanceInfo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.HashSet;
import java.util.Set;


@RestController
@CrossOrigin(origins = "http://localhost:4200/", allowedHeaders = "*")
@RequestMapping("EurekaClient")

public class EurekaClientController {
    @CrossOrigin(origins = "http://localhost:4200/", allowedHeaders = "*")
    @RequestMapping(value = "/up" ,method = RequestMethod.GET)
    public void up() {
        ApplicationInfoManager.getInstance().setInstanceStatus(InstanceInfo.InstanceStatus.UP);
        System.out.println("\n Current status :  \n" + ApplicationInfoManager.getInstance().getInfo().getStatus());
    }
    @CrossOrigin(origins = "http://localhost:4200/", allowedHeaders = "*")
    @RequestMapping(value = "/down" ,method = RequestMethod.GET)
    public void down() {
        ApplicationInfoManager.getInstance().setInstanceStatus(InstanceInfo.InstanceStatus.DOWN);
        System.out.println("\n Current status :  \n" + ApplicationInfoManager.getInstance().getInfo().getStatus());
    }
    @RequestMapping(value = "/shutdown" ,method = RequestMethod.GET)

    public void shutdown() {
        ApplicationInfoManager.getInstance().setInstanceStatus(InstanceInfo.InstanceStatus.DOWN);
        System.out.println("\n Current status :  \n" + ApplicationInfoManager.getInstance().getInfo().getStatus());
    }


}




