package com.szp.study.nacos.controller;

import com.xiaomi.nr.eiam.admin.dto.GetSingleEmployeeRequest;
import com.xiaomi.nr.eiam.admin.dto.GetStoreEmployeeRequest;
import com.xiaomi.nr.eiam.admin.dto.UpdateEmployeeRequest;
import com.xiaomi.nr.eiam.admin.service.StoreAdminService;
import com.xiaomi.nr.eiam.admin.vo.GetSingleEmployeeResponse;
import com.xiaomi.nr.eiam.admin.vo.GetStoreEmployeeResponse;
import com.xiaomi.youpin.infra.rpc.Result;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2021/6/16.
 *
 * @author SunZhiPeng
 */
@RestController
public class TestController {
    @Reference(group="staging")
    private StoreAdminService storeAdminService;

    @RequestMapping(value = "/test1",method = RequestMethod.POST)
    public Result<GetStoreEmployeeResponse> test1(@RequestBody GetStoreEmployeeRequest request){
        return storeAdminService.getStoreEmployeeInfo(request);
    }

    @RequestMapping(value = "/test2",method = RequestMethod.POST)
    public Result<GetSingleEmployeeResponse> test1(@RequestBody GetSingleEmployeeRequest request){
        return storeAdminService.getSingleEmployeeInfo(request);
    }

    @RequestMapping(value = "/test3",method = RequestMethod.POST)
    public Result<Boolean> test1(@RequestBody UpdateEmployeeRequest request){
        return storeAdminService.updateEmployee(request);
    }
}
