package com.dashboard;


import com.netflix.appinfo.ApplicationInfoManager;
import com.netflix.appinfo.InstanceInfo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.HashSet;
import java.util.Set;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("EurekaClient")
public class EurekaClientController {

    @RequestMapping(value = "/up" ,method = RequestMethod.GET)

    public void up() {

        ApplicationInfoManager.getInstance().setInstanceStatus(InstanceInfo.InstanceStatus.UP);
        System.out.println("\n Current status :  \n" + ApplicationInfoManager.getInstance().getInfo().getStatus());

    }
    @RequestMapping(value = "/down" ,method = RequestMethod.GET)
    public void down() {

        ApplicationInfoManager.getInstance().setInstanceStatus(InstanceInfo.InstanceStatus.DOWN);
        System.out.println("\n Current status :  \n" + ApplicationInfoManager.getInstance().getInfo().getStatus());

    }
    @RequestMapping(value = "/shutdown" ,method = RequestMethod.GET)
    public void shutdown() {
        ApplicationInfoManager.getInstance().setInstanceStatus(InstanceInfo.InstanceStatus.DOWN);
    }

//    @RequestMapping(value = "/ClientInfo", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
//    public void ServiceInfo () {
//        Set<String > ClientInfo  = new HashSet<String>();
//
//        try {
//            String URL = ("http://localhost:8761/eureka/apps/");
//            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder builder = factory.newDocumentBuilder();
//            Document doc = builder.parse(URL);
//            doc.getDocumentElement().normalize();
//            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
//            NodeList nList = doc.getElementsByTagName("applications");
//            System.out.println("\n============= Services 2  info   ============= \n ");
//
//            for (int temp = 0; temp < nList.getLength(); temp++) {
//                Node nNode = nList.item(temp);
//
//                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//                    Element eElement = (Element) nNode;
//
//                    System.out.println("Applications Name : "+eElement.getElementsByTagName("name").item(2).getTextContent());
//                    System.out.println("Applications run on port :"+eElement.getElementsByTagName("port").item(1).getTextContent());
//                    System.out.println("Applications Status :"+eElement.getElementsByTagName("status").item(0).getTextContent());
//                    System.out.println("Applications Ip Address :"+eElement.getElementsByTagName("ipAddr").item(0).getTextContent());
//
//                    ClientInfo.add(eElement.getElementsByTagName("name").item(2).getTextContent());
//                    ClientInfo.add(eElement.getElementsByTagName("status").item(0).getTextContent());
//                    ClientInfo.add(eElement.getElementsByTagName("ipAddr").item(0).getTextContent());
//                    ClientInfo.add(eElement.getElementsByTagName("port").item(1).getTextContent());
//                }
//                ClientInfo.forEach(System.out::println);
//            }
//        } catch (Exception e) {
//
//        }
//   }
}
