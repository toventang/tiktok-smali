package com.bytedance.im.core.internal.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.internal.a.g;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.e.d;
import com.bytedance.im.core.internal.utils.f;
import com.bytedance.im.core.proto.ConversationOperationStatus;
import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.bytedance.im.core.proto.IMCMD;

public final class ap extends w<h> {
    static {
        Covode.recordClassIndex(22974);
    }

    ap() {
        super(IMCMD.SET_CONVERSATION_SETTING_INFO.getValue());
    }

    public ap(b<h> bVar) {
        super(IMCMD.SET_CONVERSATION_SETTING_INFO.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f.body == null || kVar.f38725f.body.set_conversation_setting_info_body == null || kVar.f38725f.body.set_conversation_setting_info_body.status == null || kVar.f38725f.body.set_conversation_setting_info_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue() || kVar.f38725f.body.set_conversation_setting_info_body.setting_info == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(final k kVar, final Runnable runnable) {
        final String str = (String) kVar.f38723d[0];
        final boolean booleanValue = ((Boolean) kVar.f38723d[1]).booleanValue();
        final String str2 = (String) kVar.f38723d[2];
        if (!kVar.l() || !a(kVar)) {
            b(kVar);
            runnable.run();
            e.a(kVar, false).a("conversation_id", str).a("keys", str2).a();
            return;
        }
        final ConversationSettingInfo conversationSettingInfo = kVar.f38725f.body.set_conversation_setting_info_body.setting_info;
        d.a(new c<h>() {
            /* class com.bytedance.im.core.internal.b.a.ap.AnonymousClass1 */

            static {
                Covode.recordClassIndex(22975);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.im.core.internal.e.c
            public final /* synthetic */ h a() {
                boolean a2 = g.a(f.a(g.a(conversationSettingInfo.conversation_id), conversationSettingInfo));
                if (booleanValue) {
                    h a3 = com.bytedance.im.core.internal.a.c.a(conversationSettingInfo.conversation_id, true);
                    if (!com.bytedance.im.core.a.d.a().b().E || a3 == null || a3.getLastMessage() == null) {
                        com.bytedance.im.core.internal.a.c.a(conversationSettingInfo.conversation_id, System.currentTimeMillis());
                    } else {
                        com.bytedance.im.core.internal.a.c.a(conversationSettingInfo.conversation_id, a3.getLastMessage().getCreatedAt());
                    }
                }
                if (a2) {
                    return com.bytedance.im.core.internal.a.c.a(conversationSettingInfo.conversation_id, true);
                }
                return null;
            }
        }, new com.bytedance.im.core.internal.e.b<h>() {
            /* class com.bytedance.im.core.internal.b.a.ap.AnonymousClass2 */

            static {
                Covode.recordClassIndex(22976);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.internal.e.b
            public final /* synthetic */ void a(h hVar) {
                h hVar2 = hVar;
                if (hVar2 != null) {
                    j.a().a(hVar2, 5);
                    ap.this.a(hVar2);
                    e.a(kVar, true).a("conversation_id", str).a("keys", str2).a();
                } else {
                    ap.this.b(k.a(-3001));
                    e.a(kVar, false).a("conversation_id", str).a("keys", str2).a();
                }
                runnable.run();
            }
        });
    }
}
