package com.dashboard.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(indexName = "dashboard", type = "error_log")
public class LogModelToElastic {

    private String name;
    private String port;
    private String className;
    private String method;
    private String level;
    private String message;
    private Long dateLog;
    private String lisibleDate;
    @Id
    private Long dateCreation;


    @Override
    public String toString() {
        return "LogModelToElastic{" +
                ", name='" + name + '\'' +
                ", port='" + port + '\'' +
                ", className='" + className + '\'' +
                ", method='" + method + '\'' +
                ", level='" + level + '\'' +
                ", message='" + message + '\'' +
                ", dateLog=" + dateLog +
                ", lisibleDate='" + lisibleDate + '\'' +
                ", dateCreation=" + dateCreation +
                '}';
    }
}



