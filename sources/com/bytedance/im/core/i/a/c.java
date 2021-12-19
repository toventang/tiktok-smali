package com.bytedance.im.core.i.a;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.aw;
import com.bytedance.im.core.internal.b.a.w;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.a;
import com.bytedance.im.core.internal.e.d;
import com.bytedance.im.core.internal.utils.j;
import com.bytedance.im.core.proto.GetStrangerMessagesRequestBody;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class c extends w<List<ai>> {
    static {
        Covode.recordClassIndex(22840);
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a() {
        return true;
    }

    public c(b<List<ai>> bVar) {
        super(IMCMD.GET_STRANGER_MESSAGES_IN_CONVERSATION.getValue(), bVar);
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f.body == null || kVar.f38725f.body.get_stranger_messages_body == null) {
            return false;
        }
        return true;
    }

    public final void a(int i2, long j2) {
        f.b("imsdk", "StrangerMsgHandler get, inbox:" + i2 + ", shortId:" + j2, (Throwable) null);
        a(i2, new RequestBody.Builder().get_stranger_messages_body(new GetStrangerMessagesRequestBody.Builder().reset_unread_count(false).conversation_short_id(Long.valueOf(j2)).build()).build(), null, new Object[0]);
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(k kVar, Runnable runnable) {
        if (!kVar.l() || !a(kVar)) {
            b(kVar);
            e.a(kVar, false).a();
            return;
        }
        final List<MessageBody> list = kVar.f38725f.body.get_stranger_messages_body.messages;
        if (list == null || list.isEmpty()) {
            f.b("imsdk", "StrangerMsgHandler saveMsg, null or empty", (Throwable) null);
            a((Object) null);
        } else {
            d.a(new com.bytedance.im.core.internal.e.c<List<ai>>() {
                /* class com.bytedance.im.core.i.a.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(22841);
                }

                /* access modifiers changed from: private */
                /* renamed from: b */
                public List<ai> a() {
                    aw a2;
                    com.bytedance.im.core.internal.a.a.b.a("StrangerMsgHandler.saveMsg(String,List,boolean)");
                    ArrayList arrayList = new ArrayList();
                    try {
                        f.b("imsdk", "StrangerMsgHandler saveMsg start, messages:" + list.size(), (Throwable) null);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        for (MessageBody messageBody : list) {
                            if (!((messageBody.status != null && messageBody.status.intValue() == 1) || (a2 = com.bytedance.im.core.internal.b.a.ai.a(messageBody, true, (Pair<String, String>) null, 1)) == null || a2.f37849a == null)) {
                                arrayList.add(a2.f37849a);
                            }
                        }
                        f.b("imsdk", "StrangerMsgHandler saveMsg end, list:" + arrayList.size(), (Throwable) null);
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                            jSONObject.put("msg_count", list.size());
                            jSONObject.put("msg_source", 1);
                            e.a("im_save_msg_list_duration", jSONObject);
                        } catch (Exception unused) {
                        }
                        com.bytedance.im.core.internal.a.a.b.a("StrangerMsgHandler.saveMsg(String,List,boolean)", true);
                    } catch (Exception e2) {
                        com.bytedance.im.core.internal.a.a.b.a("StrangerMsgHandler.saveMsg(String,List,boolean)", false);
                        j.b("LoadHistoryHandler saveMsg", e2);
                    }
                    return arrayList;
                }
            }, new com.bytedance.im.core.internal.e.b<List<ai>>() {
                /* class com.bytedance.im.core.i.a.c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(22842);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.e.b
                public final /* bridge */ /* synthetic */ void a(List<ai> list) {
                    c.this.a(list);
                }
            }, a.c());
        }
        e.a(kVar, true).a();
    }
}
