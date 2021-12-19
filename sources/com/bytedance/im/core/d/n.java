package com.bytedance.im.core.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import com.google.gson.a.c;
import java.io.Serializable;

public class n implements Serializable {
    @c(a = "badge")
    public int badgeCount;
    @c(a = "cid")
    public String conversationId;
    @c(a = "short_id")
    public long conversationShortId;
    @c(a = "c_type")
    public int conversationType;
    @c(a = "inbox")
    public int inboxType;
    @c(a = "index")
    public long lastMsgIndex;
    @c(a = "index_v2")
    public long lastMsgIndexV2;
    @c(a = "retry_times")
    public int retryTimes;
    @c(a = "del_time")
    public long userDelTime;

    static {
        Covode.recordClassIndex(22790);
    }

    public DeleteConversationRequestBody toReqBody() {
        return new DeleteConversationRequestBody.Builder().conversation_id(this.conversationId).conversation_short_id(Long.valueOf(this.conversationShortId)).conversation_type(Integer.valueOf(this.conversationType)).last_message_index(Long.valueOf(this.lastMsgIndex)).last_message_index_v2(Long.valueOf(this.lastMsgIndexV2)).badge_count(Integer.valueOf(this.badgeCount)).build();
    }

    public static n fromReqBody(int i2, String str, DeleteConversationRequestBody deleteConversationRequestBody) {
        n nVar = new n();
        nVar.inboxType = i2;
        nVar.conversationId = str;
        nVar.conversationShortId = deleteConversationRequestBody.conversation_short_id.longValue();
        nVar.conversationType = deleteConversationRequestBody.conversation_type.intValue();
        nVar.lastMsgIndex = deleteConversationRequestBody.last_message_index.longValue();
        nVar.lastMsgIndexV2 = deleteConversationRequestBody.last_message_index_v2.longValue();
        nVar.badgeCount = deleteConversationRequestBody.badge_count.intValue();
        nVar.userDelTime = System.currentTimeMillis();
        return nVar;
    }
}
