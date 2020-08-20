package com.dashboard.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDetails {

    private long executionTime;
    private String userName;
    private String device;
    private String country;
    private String plateform;
    private String city;
    private String uri;
    private String controllerName;
    private String methodName;
    private String microService;
    private String port;
    private StringBuffer url;
    private Long startRequest;
    @Override
    public String toString() {
        return "UserRequestDetails{" +
                "executionTime=" + executionTime +
                ", userName='" + userName + '\'' +
                ", device='" + device + '\'' +
                ", country='" + country + '\'' +
                ", plateform='" + plateform + '\'' +
                ", city='" + city + '\'' +
                ", uri='" + uri + '\'' +
                ", controllerName='" + controllerName + '\'' +
                ", methodName='" + methodName + '\'' +
                ", url=" + url +
                ", startRequest=" + startRequest +
                '}';
    }
}
