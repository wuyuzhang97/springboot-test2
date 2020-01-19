package com.example.pojo;

import java.util.Date;

public class Source_goods {
    private Long id;

    private String order_no;

    private Short type;

    private String load_province;

    private String load_city;

    private String load_county;

    private String load_detail_address;

    private String unload_province;

    private String unload_city;

    private String unload_county;

    private String unload_detail_address;

    private Long freight;

    private Integer subscribe_num;

    private Integer call_num;

    private Integer browse_num;

    private Byte has_img;

    private Date release_date;

    private Byte is_top;

    private Integer complain_num;

    private Short status;

    private Date complain_time;

    private Date created;

    private Date modified;

    private String linkman;

    private String mobile;

    private String openid;

    private Byte flag;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no == null ? null : order_no.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getLoad_province() {
        return load_province;
    }

    public void setLoad_province(String load_province) {
        this.load_province = load_province == null ? null : load_province.trim();
    }

    public String getLoad_city() {
        return load_city;
    }

    public void setLoad_city(String load_city) {
        this.load_city = load_city == null ? null : load_city.trim();
    }

    public String getLoad_county() {
        return load_county;
    }

    public void setLoad_county(String load_county) {
        this.load_county = load_county == null ? null : load_county.trim();
    }

    public String getLoad_detail_address() {
        return load_detail_address;
    }

    public void setLoad_detail_address(String load_detail_address) {
        this.load_detail_address = load_detail_address == null ? null : load_detail_address.trim();
    }

    public String getUnload_province() {
        return unload_province;
    }

    public void setUnload_province(String unload_province) {
        this.unload_province = unload_province == null ? null : unload_province.trim();
    }

    public String getUnload_city() {
        return unload_city;
    }

    public void setUnload_city(String unload_city) {
        this.unload_city = unload_city == null ? null : unload_city.trim();
    }

    public String getUnload_county() {
        return unload_county;
    }

    public void setUnload_county(String unload_county) {
        this.unload_county = unload_county == null ? null : unload_county.trim();
    }

    public String getUnload_detail_address() {
        return unload_detail_address;
    }

    public void setUnload_detail_address(String unload_detail_address) {
        this.unload_detail_address = unload_detail_address == null ? null : unload_detail_address.trim();
    }

    public Long getFreight() {
        return freight;
    }

    public void setFreight(Long freight) {
        this.freight = freight;
    }

    public Integer getSubscribe_num() {
        return subscribe_num;
    }

    public void setSubscribe_num(Integer subscribe_num) {
        this.subscribe_num = subscribe_num;
    }

    public Integer getCall_num() {
        return call_num;
    }

    public void setCall_num(Integer call_num) {
        this.call_num = call_num;
    }

    public Integer getBrowse_num() {
        return browse_num;
    }

    public void setBrowse_num(Integer browse_num) {
        this.browse_num = browse_num;
    }

    public Byte getHas_img() {
        return has_img;
    }

    public void setHas_img(Byte has_img) {
        this.has_img = has_img;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public Byte getIs_top() {
        return is_top;
    }

    public void setIs_top(Byte is_top) {
        this.is_top = is_top;
    }

    public Integer getComplain_num() {
        return complain_num;
    }

    public void setComplain_num(Integer complain_num) {
        this.complain_num = complain_num;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getComplain_time() {
        return complain_time;
    }

    public void setComplain_time(Date complain_time) {
        this.complain_time = complain_time;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public Byte getFlag() {
        return flag;
    }

    public void setFlag(Byte flag) {
        this.flag = flag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}