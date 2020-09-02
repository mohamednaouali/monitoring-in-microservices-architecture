package com.dashboard.controller;

import com.dashboard.model.Service1Details;
import com.dashboard.model.Service2Details;
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
@RequestMapping("MetadataProvider")
public class MetadataProviderController {
    @CrossOrigin(origins = "http://localhost:4200/", allowedHeaders = "*")
    @RequestMapping(value = "/Service1Info", method = RequestMethod.GET ,produces="application/json")
    @Produces(MediaType.APPLICATION_JSON)
    public Set<Service1Details> ServiceInfo () {

        Set<Service1Details> Service1Info;
        {
            Service1Info = new HashSet<>();
            try {

                String URL = ("http://localhost:8761/eureka/apps/");
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document doc = builder.parse(URL);
                doc.getDocumentElement().normalize();
                System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
                NodeList nList = doc.getElementsByTagName("applications");
                System.out.println("\n============= Services1  info   ============= \n ");

                for (int temp2 = 0; temp2 < nList.getLength(); temp2++) {
                    Node nNode2 = nList.item(temp2);

                    if (nNode2.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nNode2;
                        Service1Details service1Details = new Service1Details();
                        service1Details.setName(eElement.getElementsByTagName("app").item(2).getTextContent());
                        service1Details.setPort(eElement.getElementsByTagName("port").item(2).getTextContent());
                        service1Details.setIpAddr(eElement.getElementsByTagName("ipAddr").item(0).getTextContent());
                        service1Details.setStatus(eElement.getElementsByTagName("status").item(2).getTextContent());
                        service1Details.setHostName("DESKTOP-Naouali");
                        Service1Info.add(service1Details);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            Service1Info.forEach(System.out::println);
        }

        return Service1Info;
    }

    @CrossOrigin(origins = "http://localhost:4200/", allowedHeaders = "*")
    @RequestMapping(value = "/Service2Info", method = RequestMethod.GET ,produces="application/json")
    @Produces(MediaType.APPLICATION_JSON)
    public Set<Service2Details> Service2Info () {

        Set<Service2Details> Service2Info;
        {
            Service2Info = new HashSet<>();
            try {

                String URL = ("http://localhost:8761/eureka/apps/");
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document doc = builder.parse(URL);
                doc.getDocumentElement().normalize();
                System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
                NodeList nList = doc.getElementsByTagName("applications");
                System.out.println("\n============= Services2  info   ============= \n ");

                for (int temp = 0; temp < nList.getLength(); temp++) {
                    Node nNode = nList.item(temp);

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nNode;

                        Service2Details service2Details = new Service2Details();

                        service2Details.setName(eElement.getElementsByTagName("app").item(1).getTextContent());
                        service2Details.setPort(eElement.getElementsByTagName("port").item(1).getTextContent());
                        service2Details.setIpAddr(eElement.getElementsByTagName("ipAddr").item(0).getTextContent());
                        service2Details.setStatus(eElement.getElementsByTagName("status").item(1).getTextContent());
                        service2Details.setHostName("DESKTOP-Naouali");
                        Service2Info.add(service2Details);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            Service2Info.forEach(System.out::println);
        }

        return Service2Info;
    }
}
