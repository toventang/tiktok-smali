package com.bytedance.im.core.internal.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.bd;
import com.bytedance.im.core.internal.a.i;
import com.bytedance.im.core.internal.utils.q;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessageType;
import com.bytedance.im.core.proto.NewP2PMessageNotify;
import com.bytedance.im.core.proto.ResponseBody;
import org.json.JSONObject;

public final class aj extends b {
    static {
        Covode.recordClassIndex(22956);
    }

    aj() {
        super(IMCMD.NEW_P2P_MSG_NOTIFY.getValue());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.b
    public final void a(int i2, ResponseBody responseBody, bd bdVar) {
        int value;
        ai a2;
        NewP2PMessageNotify newP2PMessageNotify = responseBody.has_new_p2p_message_notify;
        if (newP2PMessageNotify == null) {
            f.b("imsdk", "NewP2PMsgNotifyHandler receive NewP2PMessageNotify:null", (Throwable) null);
            return;
        }
        if (newP2PMessageNotify.send_type == null) {
            value = 0;
        } else {
            value = newP2PMessageNotify.send_type.getValue();
        }
        f.b("imsdk", "NewP2PMsgNotifyHandler receive NewP2PMessageNotify, inbox:" + i2 + ", sendType:" + value, (Throwable) null);
        ai aiVar = new ai();
        aiVar.setSender(newP2PMessageNotify.sender.longValue());
        aiVar.setSecSender(newP2PMessageNotify.sec_sender);
        aiVar.setConversationId(newP2PMessageNotify.conversation_id);
        aiVar.setConversationShortId(newP2PMessageNotify.conversation_short_id.longValue());
        aiVar.setConversationType(newP2PMessageNotify.conversation_type.intValue());
        aiVar.setMsgType(newP2PMessageNotify.message_type.intValue());
        aiVar.setContent(newP2PMessageNotify.content);
        aiVar.setExt(newP2PMessageNotify.ext);
        aiVar.setCreatedAt(newP2PMessageNotify.create_time.longValue());
        q.a().a(i2, value, aiVar);
        if (aiVar.getMsgType() == MessageType.MESSAGE_TYPE_READ_COMMAND.getValue()) {
            d a3 = d.a();
            if (aiVar.getMsgType() == MessageType.MESSAGE_TYPE_READ_COMMAND.getValue()) {
                try {
                    JSONObject jSONObject = new JSONObject(aiVar.getContent());
                    long optLong = jSONObject.optLong("UserId");
                    long optLong2 = jSONObject.optLong("MessageId");
                    jSONObject.optLong("ConShortId");
                    if (optLong > 0 && optLong2 > 0 && (a2 = i.a(optLong2)) != null) {
                        a3.f38425a.add(a2);
                        if (!a3.f38426b.hasMessages(100)) {
                            a3.f38426b.sendEmptyMessageDelayed(100, d.a().b().ax);
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
