package com.ss.android.ugc.aweme.notice.api.bean;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.f;
import com.ss.android.ugc.aweme.message.model.SimpleUser;
import java.util.HashMap;

public class StrangerNoticeMessage {
    @c(a = "client_msg_id")
    long clientMsgId;
    @c(a = "content")
    String content;
    @c(a = "create_time")
    long createTime;
    @c(a = "device_id")
    long deviceId;
    @c(a = "ext")
    String ext;
    @c(a = "from_user")
    SimpleUser fromUser;
    @c(a = "msg_type")
    int msgType;
    @c(a = "to_user")
    SimpleUser toUser;

    static {
        Covode.recordClassIndex(72415);
    }

    public long getClientMsgId() {
        return this.clientMsgId;
    }

    public String getContent() {
        return this.content;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public long getDeviceId() {
        return this.deviceId;
    }

    public String getExt() {
        return this.ext;
    }

    public SimpleUser getFromUser() {
        return this.fromUser;
    }

    public int getMsgType() {
        return this.msgType;
    }

    public SimpleUser getToUser() {
        return this.toUser;
    }

    public boolean isRecalled() {
        if (TextUtils.isEmpty(this.ext)) {
            return false;
        }
        try {
            if (TextUtils.equals("true", (CharSequence) ((HashMap) new f().a(this.ext, HashMap.class)).get("s:is_recalled"))) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public void setClientMsgId(long j2) {
        this.clientMsgId = j2;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCreateTime(long j2) {
        this.createTime = j2;
    }

    public void setDeviceId(long j2) {
        this.deviceId = j2;
    }

    public void setExt(String str) {
        this.ext = str;
    }

    public void setFromUser(SimpleUser simpleUser) {
        this.fromUser = simpleUser;
    }

    public void setMsgType(int i2) {
        this.msgType = i2;
    }

    public void setToUser(SimpleUser simpleUser) {
        this.toUser = simpleUser;
    }
}
