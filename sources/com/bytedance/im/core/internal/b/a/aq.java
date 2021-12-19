package com.bytedance.im.core.internal.b.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.bc;
import com.bytedance.im.core.d.bd;
import com.bytedance.im.core.internal.utils.c;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.HashMap;
import java.util.UUID;

/* access modifiers changed from: package-private */
public final class aq extends b {
    static {
        Covode.recordClassIndex(22977);
    }

    aq() {
        super(IMCMD.STRANGER_NEW_MSG_NOTIFY.getValue());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.b
    public final void a(int i2, ResponseBody responseBody, bd bdVar) {
        String str;
        Long l2;
        String str2;
        int i3;
        HashMap hashMap;
        if (responseBody != null && responseBody.has_new_message_notify != null) {
            MessageBody messageBody = responseBody.has_new_message_notify.message;
            bc a2 = bc.a();
            if (messageBody != null) {
                if (messageBody.ext == null || !messageBody.ext.containsKey("s:client_message_id") || TextUtils.isEmpty(messageBody.ext.get("s:client_message_id"))) {
                    str2 = "";
                } else {
                    str2 = messageBody.ext.get("s:client_message_id");
                }
                ai aiVar = new ai();
                aiVar.setMsgId(messageBody.server_message_id.longValue());
                aiVar.setSecSender(messageBody.sec_sender);
                if (TextUtils.isEmpty(str2)) {
                    str2 = UUID.randomUUID().toString();
                }
                aiVar.setUuid(str2);
                if (messageBody.create_time != null) {
                    aiVar.setCreatedAt(messageBody.create_time.longValue());
                }
                aiVar.setMsgType(messageBody.message_type.intValue());
                aiVar.setConversationId(messageBody.conversation_id);
                aiVar.setConversationType(messageBody.conversation_type.intValue());
                aiVar.setSender(messageBody.sender.longValue());
                aiVar.setContent(messageBody.content);
                aiVar.setDeleted(0);
                aiVar.setMsgStatus(5);
                if (d.a().b().A) {
                    aiVar = c.b(aiVar);
                }
                aiVar.setConversationShortId(messageBody.conversation_short_id.longValue());
                if (messageBody.index_in_conversation != null) {
                    aiVar.setIndex(messageBody.index_in_conversation.longValue());
                    aiVar.getLocalExt().remove("s:message_index_is_local");
                }
                if (messageBody.index_in_conversation_v2 != null) {
                    aiVar.setIndexInConversationV2(messageBody.index_in_conversation_v2.longValue());
                }
                aiVar.setOrderIndex(0);
                if (messageBody.status != null) {
                    i3 = messageBody.status.intValue();
                } else {
                    i3 = 0;
                }
                aiVar.setSvrStatus(i3);
                aiVar.updatePropertyFromServer(messageBody);
                if (messageBody.version != null && messageBody.version.longValue() >= aiVar.getVersion()) {
                    aiVar.setVersion(messageBody.version.longValue());
                    if (messageBody.ext == null) {
                        hashMap = null;
                    } else {
                        hashMap = new HashMap(messageBody.ext);
                    }
                    aiVar.setExt(hashMap);
                }
                aiVar.setReadStatus(1);
                com.bytedance.im.core.a.c j2 = d.a().f37562b.j();
                if (aiVar.getSvrStatus() == 0 && j2 != null) {
                    aiVar.setSvrStatus(0);
                }
                if (messageBody.reference_info != null && aiVar.getReferenceInfo() == null) {
                    aiVar.setRefMsg(messageBody.reference_info);
                }
            }
            a2.b();
            StringBuilder sb = new StringBuilder("receive new stranger msg, cid:");
            if (messageBody == null) {
                str = null;
            } else {
                str = messageBody.conversation_id;
            }
            StringBuilder append = sb.append(str).append(", msgId:");
            if (messageBody == null) {
                l2 = null;
            } else {
                l2 = messageBody.server_message_id;
            }
            f.b("imsdk", append.append(l2).toString(), (Throwable) null);
            com.bytedance.im.core.i.f a3 = com.bytedance.im.core.i.f.a();
            if (responseBody.has_new_message_notify != null) {
                f.b("imsdk", "StrangerManager receiveStrangerMsg", (Throwable) null);
                a3.b();
            }
        }
    }
}
