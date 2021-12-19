package com.bytedance.im.core.internal.b.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.i.g;
import com.bytedance.im.core.internal.a.i;
import com.bytedance.im.core.internal.b.a;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.b;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.e.d;
import com.bytedance.im.core.internal.utils.n;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetConversationInfoV2RequestBody;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.HashMap;

public final class o extends w<h> {

    /* renamed from: a  reason: collision with root package name */
    public h f38524a;

    static {
        Covode.recordClassIndex(23027);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(final k kVar, final Runnable runnable) {
        final int intValue = kVar.f38724e.inbox_type.intValue();
        final String str = (String) kVar.f38723d[0];
        ((Long) kVar.f38723d[1]).longValue();
        ((Integer) kVar.f38723d[2]).intValue();
        final long longValue = ((Long) kVar.f38723d[3]).longValue();
        a.f38228b.remove(str);
        f.b("imsdk", "Get Conversation Info finish: ".concat(String.valueOf(str)), (Throwable) null);
        if (!kVar.l() || !a(kVar)) {
            b(kVar);
            runnable.run();
            e.a(kVar, false).a("conversation_id", str).a();
            if (kVar.f38728i == -1000 && this.f38524a != null) {
                j.a().a(this.f38524a, 6);
                return;
            }
            return;
        }
        final ConversationInfoV2 conversationInfoV2 = kVar.f38725f.body.get_conversation_info_v2_body.conversation_info;
        d.a(new c<Pair<h, Boolean>>() {
            /* class com.bytedance.im.core.internal.b.a.o.AnonymousClass1 */

            static {
                Covode.recordClassIndex(23028);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.im.core.internal.e.c
            public final /* bridge */ /* synthetic */ Pair<h, Boolean> a() {
                return o.a(intValue, longValue, conversationInfoV2);
            }
        }, new b<Pair<h, Boolean>>() {
            /* class com.bytedance.im.core.internal.b.a.o.AnonymousClass2 */

            static {
                Covode.recordClassIndex(23029);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.internal.e.b
            public final /* synthetic */ void a(Pair<h, Boolean> pair) {
                Pair<h, Boolean> pair2 = pair;
                if (pair2 != null) {
                    j.a().a((h) pair2.first, 5);
                    if (!(conversationInfoV2.first_page_participants == null || conversationInfoV2.first_page_participants.has_more == null || !conversationInfoV2.first_page_participants.has_more.booleanValue())) {
                        new ad().a(((h) pair2.first).getConversationId(), 0, (com.bytedance.im.core.internal.d.j) null);
                    }
                    o.this.a(pair2.first);
                    a.b(intValue, str);
                    e.a(kVar, true).a("conversation_id", str).a();
                } else {
                    o.this.b(k.a(-3001));
                }
                runnable.run();
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        return (kVar.f38725f.body == null || kVar.f38725f.body.get_conversation_info_v2_body == null || kVar.f38725f.body.get_conversation_info_v2_body.conversation_info == null) ? false : true;
    }

    public final void a(String str) {
        h a2 = j.a().a(str);
        if (a2 == null || a2.isTemp()) {
            b(k.a(-1017));
        } else if (a.a(str)) {
            f.b("imsdk", "hasGettingConversation: ".concat(String.valueOf(str)), (Throwable) null);
            b(k.a(-1018));
        } else {
            a(a2.getInboxType(), str, a2.getConversationShortId(), a2.getConversationType(), a2.getUpdatedTime());
        }
    }

    public o() {
        super(IMCMD.GET_CONVERSATION_INFO_V2.getValue());
    }

    public o(com.bytedance.im.core.a.a.b<h> bVar) {
        super(IMCMD.GET_CONVERSATION_INFO_V2.getValue(), bVar);
    }

    public static h a(int i2, MessageBody messageBody) {
        if (messageBody == null) {
            return null;
        }
        return a(i2, messageBody.conversation_id, messageBody.conversation_short_id.longValue(), messageBody.conversation_type.intValue(), messageBody.create_time.longValue(), 0);
    }

    public static Pair<h, Boolean> a(int i2, long j2, ConversationInfoV2 conversationInfoV2) {
        int i3;
        boolean z;
        boolean z2;
        try {
            com.bytedance.im.core.internal.a.a.b.a("saveSingleConversation");
            h a2 = com.bytedance.im.core.internal.a.c.a(conversationInfoV2.conversation_id, true);
            if (a2 == null || a2.isMember() || conversationInfoV2.is_participant == null || conversationInfoV2.is_participant.booleanValue()) {
                com.bytedance.im.core.internal.a.e.d(conversationInfoV2.conversation_id);
                String str = conversationInfoV2.conversation_id;
                if (conversationInfoV2.conversation_type == null) {
                    i3 = -1;
                } else {
                    i3 = conversationInfoV2.conversation_type.intValue();
                }
                com.bytedance.im.core.internal.a.e.a(str, i3, com.bytedance.im.core.internal.utils.f.a(conversationInfoV2.conversation_id, conversationInfoV2.first_page_participants.participants));
                h a3 = com.bytedance.im.core.internal.utils.f.a(i2, a2, conversationInfoV2, j2);
                g.a(a3);
                if (a2 == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = com.bytedance.im.core.internal.a.c.a(a3);
                } else {
                    z2 = com.bytedance.im.core.internal.a.c.a(a3, true);
                }
                com.bytedance.im.core.internal.a.a.b.a("saveSingleConversation", true);
                if (z2) {
                    return new Pair<>(a3, Boolean.valueOf(z));
                }
                return null;
            }
            com.bytedance.im.core.internal.a.a.b.a("saveSingleConversation", true);
            return null;
        } catch (Exception e2) {
            f.b("imsdk", "GetConversationInfoHandler saveSingleConversation", e2);
            com.bytedance.im.core.internal.a.a.b.a("saveSingleConversation", false);
            return null;
        }
    }

    public final void a(int i2, ai aiVar, int i3) {
        a(i2, aiVar.getConversationId(), aiVar.getConversationShortId(), aiVar.getConversationType(), aiVar.getCreatedAt(), i3, false);
    }

    private synchronized void a(int i2, String str, long j2, int i3, long j3) {
        MethodCollector.i(9110);
        a(i2, str, j2, i3, j3, false);
        MethodCollector.o(9110);
    }

    public static h a(int i2, String str, long j2, int i3, long j3, int i4) {
        return a(i2, str, j2, i3, j3, i4, (ai) null);
    }

    public final synchronized void a(int i2, String str, long j2, int i3, long j3, boolean z) {
        MethodCollector.i(9294);
        a(i2, str, j2, i3, j3, 0, z);
        MethodCollector.o(9294);
    }

    public static h a(int i2, String str, long j2, int i3, long j3, int i4, ai aiVar) {
        Exception e2;
        h hVar = null;
        try {
            if (com.bytedance.im.core.internal.a.c.c(str)) {
                f.b("imsdk", "syncBuildLocalConversation: convId=" + str + ", already has local", (Throwable) null);
                return null;
            }
            f.b("imsdk", "syncBuildLocalConversation: convId=" + str + ", shortId=" + j2 + ", type=" + i3 + ", time=" + j3, (Throwable) null);
            h hVar2 = new h();
            try {
                hVar2.setInboxType(i2);
                hVar2.setConversationId(str);
                hVar2.setConversationShortId(j2);
                hVar2.setConversationType(i3);
                hVar2.setUpdatedTime(j3);
                if (hVar2.isSingleChat()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(com.bytedance.im.core.a.d.a().f37562b.a()));
                    arrayList.add(Long.valueOf(com.bytedance.im.core.d.k.a(str)));
                    hVar2.setMemberIds(arrayList);
                    hVar2.setMemberCount(2);
                }
                hVar2.setIsMember(true);
                if (aiVar != null) {
                    hVar2.setLastMessageIndex(n.d(aiVar));
                    hVar2.setLastMessage(aiVar);
                    hVar2.setMaxIndexV2(n.e(aiVar));
                } else {
                    hVar2.setLastMessageIndex(i.e(str));
                    hVar2.setLastMessage(i.h(str));
                    hVar2.setMaxIndexV2(i.f(str));
                }
                hVar2.setBadgeCount(i4);
                HashMap hashMap = new HashMap();
                hashMap.put("s:conv_wait_info", "1");
                hVar2.setLocalExt(hashMap);
                if (com.bytedance.im.core.internal.a.c.a(hVar2)) {
                    return hVar2;
                }
                return null;
            } catch (Exception e3) {
                e2 = e3;
                hVar = hVar2;
                f.b("imsdk", "GetConversationInfoHandler syncBuildLocalConversation", e2);
                return hVar;
            }
        } catch (Exception e4) {
            e2 = e4;
            f.b("imsdk", "GetConversationInfoHandler syncBuildLocalConversation", e2);
            return hVar;
        }
    }

    private synchronized void a(final int i2, final String str, final long j2, final int i3, final long j3, final int i4, boolean z) {
        MethodCollector.i(9479);
        if (z || !a.a(str)) {
            com.bytedance.im.core.internal.e.a.a().execute(new Runnable() {
                /* class com.bytedance.im.core.internal.b.a.o.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(23030);
                }

                public final void run() {
                    o.this.f38524a = o.a(i2, str, j2, i3, j3, i4);
                    RequestBody build = new RequestBody.Builder().get_conversation_info_v2_body(new GetConversationInfoV2RequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(j2)).conversation_type(Integer.valueOf(i3)).build()).build();
                    o.this.a(i2, build, null, str, Long.valueOf(j2), Integer.valueOf(i3), Long.valueOf(j3));
                    a.f38228b.add(str);
                }
            });
            MethodCollector.o(9479);
            return;
        }
        f.b("imsdk", "hasGettingConversation: ".concat(String.valueOf(str)), (Throwable) null);
        MethodCollector.o(9479);
    }
}
