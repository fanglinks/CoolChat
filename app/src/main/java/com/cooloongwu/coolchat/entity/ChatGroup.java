package com.cooloongwu.coolchat.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 聊天的实体类
 * Created by CooLoongWu on 2016-9-15.
 */
@Entity
public class ChatGroup {

    @Id
    private Long id;
    private int fromId;             //用户ID
    private int toGroupId;          //要发送给群组的ID
    private String fromName;        //用户昵称
    private String fromAvatar;      //用户头像
    private String content;         //发送内容
    private String contentType;     //发送内容的类型
    private String time;            //发送时间
    private boolean isRead;         //消息是否已读

    @Generated(hash = 1344739701)
    public ChatGroup(Long id, int fromId, int toGroupId, String fromName,
                     String fromAvatar, String content, String contentType, String time,
                     boolean isRead) {
        this.id = id;
        this.fromId = fromId;
        this.toGroupId = toGroupId;
        this.fromName = fromName;
        this.fromAvatar = fromAvatar;
        this.content = content;
        this.contentType = contentType;
        this.time = time;
        this.isRead = isRead;
    }

    @Generated(hash = 266793083)
    public ChatGroup() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFromId() {
        return this.fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getToGroupId() {
        return this.toGroupId;
    }

    public void setToGroupId(int toGroupId) {
        this.toGroupId = toGroupId;
    }

    public String getFromName() {
        return this.fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getFromAvatar() {
        return this.fromAvatar;
    }

    public void setFromAvatar(String fromAvatar) {
        this.fromAvatar = fromAvatar;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentType() {
        return this.contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean getIsRead() {
        return this.isRead;
    }

    public void setIsRead(boolean isRead) {
        this.isRead = isRead;
    }


}
