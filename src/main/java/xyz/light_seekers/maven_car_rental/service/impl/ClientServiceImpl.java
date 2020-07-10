package xyz.light_seekers.maven_car_rental.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.light_seekers.maven_car_rental.bean.ClientInfo;
import xyz.light_seekers.maven_car_rental.bean.ClientInfoExample;
import xyz.light_seekers.maven_car_rental.bean.CompanyInfoExample;
import xyz.light_seekers.maven_car_rental.bean.EmployeeInfo;
import xyz.light_seekers.maven_car_rental.mapper.ClientInfoMapper;
import xyz.light_seekers.maven_car_rental.service.IClientService;
import xyz.light_seekers.maven_car_rental.util.MD5Util;
import xyz.light_seekers.maven_car_rental.util.MapUtil;
import xyz.light_seekers.maven_car_rental.util.StringUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/9 21:12
 */
@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private ClientInfoMapper clientInfoMapper;

    @Override
    public Map<String, Object> login(String phone, String password) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        ClientInfoExample clientInfoExample = new ClientInfoExample();
        clientInfoExample.createCriteria().andPhoneEqualTo(phone)
                .andPasswordEqualTo(MD5Util.createPassword(password));
        List<ClientInfo> clientInfos = clientInfoMapper.selectByExample(clientInfoExample);
        if (clientInfos.size() > 0) {
            result.put("success", true);
        } else {
            result.put("success", false);
        }
        return result;
    }

    @Override
    public Map<String, Object> rePassword(String phone, String oldPassword, String newPassword) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        ClientInfoExample clientInfoExample = new ClientInfoExample();
        clientInfoExample.createCriteria().andPhoneEqualTo(phone)
                .andPasswordEqualTo(MD5Util.createPassword(oldPassword));
        ClientInfo clientInfo = new ClientInfo();
        clientInfo.setPassword(MD5Util.createPassword(newPassword));
        int i = clientInfoMapper.updateByExampleSelective(clientInfo, clientInfoExample);
        MapUtil.mapOperation(result, i);
        return result;
    }

    @Override
    public Map<String, Object> selectCriteria(String phone, String name, Integer pageSize, Integer pageNum) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        ClientInfoExample clientInfoExample = new ClientInfoExample();
        if (StringUtil.notEmptyOrNull(phone)) {
            clientInfoExample.createCriteria()
                    .andPhoneLike("%" + phone + "%");
        }
        if (StringUtil.notEmptyOrNull(name)) {
            clientInfoExample.createCriteria()
                    .andNameLike("%" + name + "%");
        }
        List<ClientInfo> clientInfos = clientInfoMapper.selectByExample(clientInfoExample);
        MapUtil.mapSelect(result, clientInfos, pageNum, pageSize);
        return result;
    }

    @Override
    public Map<String, Object> addClientInfo(ClientInfo clientInfo) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        clientInfo.setPassword(MD5Util.createPassword(clientInfo.getPassword()));
        int i = clientInfoMapper.insertSelective(clientInfo);
        MapUtil.mapOperation(result, i);
        return result;
    }

    @Override
    public Map<String, Object> modifyClientInfo(ClientInfo clientInfo) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        clientInfo.setPassword(MD5Util.createPassword(clientInfo.getPassword()));
        int i = clientInfoMapper.updateByPrimaryKeySelective(clientInfo);
        MapUtil.mapOperation(result, i);
        return result;
    }

    @Override
    public Map<String, Object> deleteClientInfo(List<Integer> ids) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        ClientInfoExample clientInfoExample = new ClientInfoExample();
        clientInfoExample.createCriteria().andIdIn(ids);
        int i = clientInfoMapper.deleteByExample(clientInfoExample);
        MapUtil.mapOperation(result, i);
        return result;
    }
}
