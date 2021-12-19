package com.bytedance.im.core.f.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.am;
import com.bytedance.im.core.g.b;
import com.bytedance.im.core.g.c;
import com.bytedance.im.core.internal.b.a.w;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.proto.ClientMetricType;
import com.bytedance.im.core.proto.ConversationCheckInfo;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessageBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a extends w {
    static {
        Covode.recordClassIndex(22811);
    }

    public a() {
        super(IMCMD.GET_CONVERSATIONS_CHECKINFO.getValue());
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar == null || kVar.f38725f == null || kVar.f38725f.body == null || kVar.f38725f.body.get_conversations_checkinfo_body == null) {
            return false;
        }
        return true;
    }

    private static boolean a(String str) {
        if (com.bytedance.im.core.internal.b.a.a(str)) {
            return true;
        }
        Map<Integer, Map<String, MessageBody>> map = com.bytedance.im.core.internal.b.a.f38234h;
        if (map != null) {
            for (Map<String, MessageBody> map2 : map.values()) {
                if (map2 != null && map2.containsKey(str)) {
                    return true;
                }
            }
        }
        Map<Integer, List<String>> map3 = com.bytedance.im.core.internal.b.a.f38236j;
        if (map3 == null) {
            return false;
        }
        for (List<String> list : map3.values()) {
            if (list != null && list.contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r3 = r5.f38725f.body.get_conversations_checkinfo_body.conversation_checkinfo_list;
     */
    @Override // com.bytedance.im.core.internal.b.a.w
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.im.core.internal.d.k r5, java.lang.Runnable r6) {
        /*
            r4 = this;
            boolean r0 = r4.a(r5)
            if (r0 == 0) goto L_0x001c
            boolean r0 = r5.l()
            if (r0 == 0) goto L_0x001c
            com.bytedance.im.core.proto.Response r0 = r5.f38725f
            com.bytedance.im.core.proto.ResponseBody r0 = r0.body
            com.bytedance.im.core.proto.GetConversationsCheckInfoResponseBody r0 = r0.get_conversations_checkinfo_body
            java.util.List<com.bytedance.im.core.proto.ConversationCheckInfo> r3 = r0.conversation_checkinfo_list
            if (r3 == 0) goto L_0x001c
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            com.bytedance.im.core.proto.Request r0 = r5.f38724e
            java.lang.Integer r0 = r0.inbox_type
            int r2 = r0.intValue()
            java.util.concurrent.Executor r1 = com.bytedance.im.core.internal.e.a.a()
            com.bytedance.im.core.f.a.a$1 r0 = new com.bytedance.im.core.f.a.a$1
            r0.<init>(r2, r3)
            r1.execute(r0)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.f.a.a.a(com.bytedance.im.core.internal.d.k, java.lang.Runnable):void");
    }

    public static void a(int i2, List<ConversationCheckInfo> list, long j2) {
        List<ConversationCheckInfo> list2;
        int i3;
        if (list == null || list.isEmpty()) {
            list2 = list;
        } else {
            list2 = new ArrayList<>();
            for (ConversationCheckInfo conversationCheckInfo : list) {
                if (conversationCheckInfo != null && !a(conversationCheckInfo.conversation_id)) {
                    list2.add(conversationCheckInfo);
                }
            }
        }
        int i4 = 0;
        if (!com.bytedance.im.core.internal.a.n()) {
            if (list2 != null) {
                i3 = list2.size();
            } else {
                i3 = 0;
            }
            new c(i3).a(i2, list2);
        }
        ArrayList arrayList = new ArrayList();
        if (list2 != null && !list2.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put("leak_conversation_count", String.valueOf(list2.size()));
            arrayList.add(new am(ClientMetricType.COUNTER, "check_conversation_leak", 1, hashMap));
        }
        arrayList.add(new am(ClientMetricType.TIMER, "check_conversation_cost", System.currentTimeMillis() - j2, null));
        c.a().a(arrayList);
        if (list2 != null) {
            i4 = list2.size();
        }
        b.a(i4, true);
    }
}
