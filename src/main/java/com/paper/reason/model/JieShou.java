package com.paper.reason.model;

import java.io.Serializable;

/**
 * 描述:jieshou表的实体类
 * @version
 * @author:  栗星星
 * @创建时间: 2019-05-12
 */
public class JieShou implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String svcId;

    /**
     * 
     */
    private String svcName;

    /**
     * 
     */
    private String interfaceId;

    /**
     * 
     */
    private String interfaceName;

    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    /**
     * 
     * @return ID 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return SVC_ID 
     */
    public String getSvcId() {
        return svcId;
    }

    /**
     * 
     * @param svcId 
     */
    public void setSvcId(String svcId) {
        this.svcId = svcId == null ? null : svcId.trim();
    }

    /**
     * 
     * @return SVC_NAME 
     */
    public String getSvcName() {
        return svcName;
    }

    /**
     * 
     * @param svcName 
     */
    public void setSvcName(String svcName) {
        this.svcName = svcName == null ? null : svcName.trim();
    }

    /**
     * 
     * @return INTERFACE_ID 
     */
    public String getInterfaceId() {
        return interfaceId;
    }

    /**
     * 
     * @param interfaceId 
     */
    public void setInterfaceId(String interfaceId) {
        this.interfaceId = interfaceId == null ? null : interfaceId.trim();
    }

    /**
     * 
     * @return INTERFACE_NAME 
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    /**
     * 
     * @param interfaceName 
     */
    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName == null ? null : interfaceName.trim();
    }
}