package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import java.io.Serializable;

public class BaseExtra implements Serializable {
    @c(a = "status_code")
    int statusCode;
    @c(a = "status_msg")
    StatusMessage statusMsg;

    static {
        Covode.recordClassIndex(64022);
    }

    public static class MessageContent {
        @c(a = "template")
        SystemContent.Key[] template;
        @c(a = "tips")
        String tips;

        static {
            Covode.recordClassIndex(64023);
        }

        public SystemContent.Key[] getTemplate() {
            return this.template;
        }

        public String getTips() {
            return this.tips;
        }

        public void setTemplate(SystemContent.Key[] keyArr) {
            this.template = keyArr;
        }

        public void setTips(String str) {
            this.tips = str;
        }

        public static SystemContent toSystemContent(MessageContent messageContent) {
            SystemContent systemContent = new SystemContent();
            systemContent.setType(100);
            systemContent.tips = messageContent.tips;
            systemContent.template = messageContent.template;
            return systemContent;
        }
    }

    public static class StatusMessage {
        @c(a = "msg_content")
        MessageContent msgContent;
        @c(a = "msg_type")
        int msgType;

        static {
            Covode.recordClassIndex(64024);
        }

        public MessageContent getMsgContent() {
            return this.msgContent;
        }

        public int getMsgType() {
            return this.msgType;
        }

        public void setMsgContent(MessageContent messageContent) {
            this.msgContent = messageContent;
        }

        public void setMsgType(int i2) {
            this.msgType = i2;
        }
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public StatusMessage getStatusMsg() {
        return this.statusMsg;
    }

    public void setStatusCode(int i2) {
        this.statusCode = i2;
    }

    public void setStatusMsg(StatusMessage statusMessage) {
        this.statusMsg = statusMessage;
    }
}
