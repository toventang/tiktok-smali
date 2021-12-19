package com.bytedance.im.core.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.proto.DeleteMessageRequestBody;
import com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody;
import com.google.gson.a.c;
import java.io.Serializable;

public class o implements Serializable {
    @c(a = "cid")
    public String conversationId;
    @c(a = "short_id")
    public Long conversationShortId;
    @c(a = "c_type")
    public Integer conversationType;
    @c(a = "inbox")
    public Integer inboxType;
    @c(a = "is_stranger")
    public boolean isStranger = false;
    @c(a = "retry_times")
    public Integer retryTimes = 0;
    @c(a = "server_message_id")
    public Long server_message_id;
    @c(a = "del_time")
    public Long userDelTime;

    static {
        Covode.recordClassIndex(22791);
    }

    public DeleteStrangerMessageRequestBody toStrangeMsgReqBody() {
        return new DeleteStrangerMessageRequestBody.Builder().conversation_short_id(this.conversationShortId).server_message_id(this.server_message_id).build();
    }

    public DeleteMessageRequestBody toMsgReqBody() {
        return new DeleteMessageRequestBody.Builder().conversation_id(this.conversationId).conversation_short_id(this.conversationShortId).conversation_type(this.conversationType).message_id(this.server_message_id).build();
    }

    public static o fromReqBody(int i2, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody) {
        o oVar = new o();
        oVar.inboxType = Integer.valueOf(i2);
        oVar.conversationShortId = deleteStrangerMessageRequestBody.conversation_short_id;
        oVar.isStranger = true;
        oVar.userDelTime = Long.valueOf(System.currentTimeMillis());
        return oVar;
    }

    public static o fromReqBody(int i2, DeleteMessageRequestBody deleteMessageRequestBody) {
        o oVar = new o();
        oVar.inboxType = Integer.valueOf(i2);
        oVar.conversationId = deleteMessageRequestBody.conversation_id;
        oVar.conversationShortId = deleteMessageRequestBody.conversation_short_id;
        oVar.conversationType = deleteMessageRequestBody.conversation_type;
        oVar.server_message_id = deleteMessageRequestBody.message_id;
        oVar.isStranger = false;
        oVar.userDelTime = Long.valueOf(System.currentTimeMillis());
        return oVar;
    }
}
