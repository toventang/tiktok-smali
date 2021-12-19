package com.bytedance.im.core.f.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.g.b;
import com.bytedance.im.core.internal.b.a.ad;
import com.bytedance.im.core.internal.b.a.o;
import com.bytedance.im.core.internal.b.a.w;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.a;
import com.bytedance.im.core.proto.ClientMetricType;
import com.bytedance.im.core.proto.ConversationCheckInfo;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetConversationInfoListV2RequestBody;
import com.bytedance.im.core.proto.GetConversationInfoV2RequestBody;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class c extends w {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f38077a = false;

    /* renamed from: b  reason: collision with root package name */
    private int f38078b;

    static {
        Covode.recordClassIndex(22815);
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a() {
        return true;
    }

    public c(int i2) {
        super(IMCMD.GET_CONVERSATION_INFO_LIST_V2.getValue());
        this.f38078b = i2;
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f.body == null || kVar.f38725f.body.get_conversation_info_list_v2_body == null || kVar.f38725f.body.get_conversation_info_list_v2_body.conversation_info_list == null) {
            return false;
        }
        return true;
    }

    public final void a(int i2, List<ConversationCheckInfo> list) {
        if (!(list == null || list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (ConversationCheckInfo conversationCheckInfo : list) {
                if (conversationCheckInfo != null) {
                    arrayList.add(new GetConversationInfoV2RequestBody.Builder().conversation_id(conversationCheckInfo.conversation_id).conversation_short_id(conversationCheckInfo.conversation_short_id).conversation_type(conversationCheckInfo.conversation_type).build());
                    if (arrayList.size() == 50) {
                        a(i2, new RequestBody.Builder().get_conversation_info_list_v2_body(new GetConversationInfoListV2RequestBody(arrayList)).build(), null, new Object[0]);
                        arrayList = new ArrayList();
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                a(i2, new RequestBody.Builder().get_conversation_info_list_v2_body(new GetConversationInfoListV2RequestBody(arrayList)).build(), null, new Object[0]);
            }
        }
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(k kVar, Runnable runnable) {
        final int intValue = kVar.f38724e.inbox_type.intValue();
        if (!kVar.l() || !a(kVar)) {
            b.a("pull conversation_info error " + kVar.m(), -2001);
            return;
        }
        List<ConversationInfoV2> list = kVar.f38725f.body.get_conversation_info_list_v2_body.conversation_info_list;
        if (list == null || list.isEmpty()) {
            b.a("body isEmpty ", -2002);
            return;
        }
        for (final ConversationInfoV2 conversationInfoV2 : list) {
            if (conversationInfoV2 == null || (conversationInfoV2.is_participant != null && !conversationInfoV2.is_participant.booleanValue())) {
                b.a("not member", -2003);
            } else {
                new d(new com.bytedance.im.core.a.a.b<MessageBody>() {
                    /* class com.bytedance.im.core.f.a.c.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(22816);
                    }

                    @Override // com.bytedance.im.core.a.a.b
                    public final void a(u uVar) {
                        b.a("pull msg error " + uVar.toString(), -2004);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.bytedance.im.core.a.a.b
                    public final /* synthetic */ void a(MessageBody messageBody) {
                        final MessageBody messageBody2 = messageBody;
                        if (messageBody2 != null) {
                            if (messageBody2.status != null && messageBody2.status.intValue() == 1) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("conversation_id", messageBody2.conversation_id);
                                hashMap.put("msg_id", String.valueOf(messageBody2.server_message_id));
                                com.bytedance.im.core.g.c.a().a(ClientMetricType.COUNTER, "conversation_repair_last_msg_disable", hashMap);
                            }
                            a.a().execute(new Runnable() {
                                /* class com.bytedance.im.core.f.a.c.AnonymousClass1.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(22817);
                                }

                                public final void run() {
                                    Pair<h, Boolean> a2 = o.a(intValue, messageBody2.create_time.longValue(), conversationInfoV2);
                                    if (a2 == null || a2.first == null || !((Boolean) a2.second).booleanValue()) {
                                        b.a("save con failed pair = ".concat(String.valueOf(a2)), -2006);
                                        return;
                                    }
                                    h hVar = (h) a2.first;
                                    j.a().a(hVar);
                                    if (!(conversationInfoV2.first_page_participants == null || conversationInfoV2.first_page_participants.has_more == null || !conversationInfoV2.first_page_participants.has_more.booleanValue())) {
                                        new ad().a(hVar.getConversationId(), 0, (com.bytedance.im.core.internal.d.j) null);
                                    }
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("conversation_id", hVar.getConversationId());
                                    com.bytedance.im.core.g.c.a().a(ClientMetricType.COUNTER, "repaired_conversation", hashMap);
                                    if (!c.this.f38077a) {
                                        com.bytedance.im.core.g.c.a().a(ClientMetricType.COUNTER, "conversation_repair_performed", (Map<String, String>) null);
                                        b.a(1, false);
                                        c.this.f38077a = true;
                                    }
                                }
                            });
                            return;
                        }
                        b.a("pull msg result null", -2005);
                    }
                }).a(intValue, conversationInfoV2.conversation_id, conversationInfoV2.conversation_short_id.longValue(), conversationInfoV2.conversation_type.intValue(), 0);
            }
        }
    }
}
