package com.dashboard.model;

import lombok.*;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Service1Details {

    private  String name ;
    private  String status;
    private  String ipAddr;
    private  String port;
    private  String hostName;

}
