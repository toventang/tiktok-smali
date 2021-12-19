package com.bytedance.im.core.internal.b.a;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.aw;
import com.bytedance.im.core.internal.a.a.b;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.a;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.e.d;
import com.bytedance.im.core.internal.utils.q;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesInConversationResponseBody;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public final class ac extends w {
    static {
        Covode.recordClassIndex(22922);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a() {
        return true;
    }

    public ac() {
        super(IMCMD.GET_MESSAGES_BY_CONVERSATION.getValue());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f.body == null || kVar.f38725f.body.messages_in_conversation_body == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(k kVar, Runnable runnable) {
        if (!kVar.l() || !a(kVar)) {
            e.a(kVar, false).a();
            return;
        }
        final String str = (String) kVar.f38723d[0];
        MessagesInConversationResponseBody messagesInConversationResponseBody = kVar.f38725f.body.messages_in_conversation_body;
        final List<MessageBody> list = messagesInConversationResponseBody.messages;
        final boolean booleanValue = messagesInConversationResponseBody.has_more.booleanValue();
        d.a(new c<List<ai>>() {
            /* class com.bytedance.im.core.internal.b.a.ac.AnonymousClass3 */

            static {
                Covode.recordClassIndex(22925);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public List<ai> a() {
                int i2;
                aw a2;
                b.a("LoadHistoryHandler.saveMsg(String,List,boolean)");
                ArrayList arrayList = new ArrayList();
                try {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    List<MessageBody> list = list;
                    if (list != null) {
                        for (MessageBody messageBody : list) {
                            if (!((messageBody.status != null && messageBody.status.intValue() == 1) || (a2 = ai.a(messageBody, true, (Pair<String, String>) null, 1)) == null || a2.f37849a == null)) {
                                arrayList.add(a2.f37849a);
                            }
                        }
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                        List list2 = list;
                        if (list2 != null) {
                            i2 = list2.size();
                        } else {
                            i2 = 0;
                        }
                        jSONObject.put("msg_count", i2);
                        jSONObject.put("msg_source", 1);
                        e.a("im_save_msg_list_duration", jSONObject);
                    } catch (Exception unused) {
                    }
                    if (!booleanValue) {
                        ai.a(str);
                    }
                    b.a("LoadHistoryHandler.saveMsg(String,List,boolean)", true);
                    Collections.sort(arrayList);
                } catch (Exception e2) {
                    b.a("LoadHistoryHandler.saveMsg(String,List,boolean)", false);
                    f.b("imsdk", "LoadHistoryHandler saveMsg", e2);
                    com.bytedance.im.core.g.b.a(1, e2);
                }
                return arrayList;
            }
        }, new com.bytedance.im.core.internal.e.b<List<ai>>() {
            /* class com.bytedance.im.core.internal.b.a.ac.AnonymousClass4 */

            static {
                Covode.recordClassIndex(22926);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.internal.e.b
            public final /* synthetic */ void a(List<ai> list) {
                q.a().b(str, list);
            }
        }, a.c());
        e.a(kVar, true).a();
    }
}
