package com.dashboard;

import com.netflix.appinfo.ApplicationInfoManager;
import com.netflix.appinfo.InstanceInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ChangeStatus")
public class EurekaClientController {
    @GetMapping("/up")
    public BooleanResponse up() {

        System.out.println(" Current status : " + ApplicationInfoManager.getInstance().getInfo().getStatus());
        ApplicationInfoManager.getInstance().setInstanceStatus(InstanceInfo.InstanceStatus.UP);
        return BooleanResponse.builder().StatusResp(Boolean.TRUE).build();
    }

    @GetMapping("/down")
    public BooleanResponse down() {
        System.out.println("Current status : " + ApplicationInfoManager.getInstance().getInfo().getStatus());
        ApplicationInfoManager.getInstance().setInstanceStatus(InstanceInfo.InstanceStatus.DOWN);
        return BooleanResponse.builder().StatusResp(Boolean.TRUE).build();
    }

    public void test() {

    }
}
