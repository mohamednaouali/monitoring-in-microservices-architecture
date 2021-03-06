package com.dashboard.model;


import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class LogModel {

    private String name;
    private String port;
    private String className;
    private String method;
    private String level;
    private String message;
    private Long dateLog;
    private String lisibleDate;
}
