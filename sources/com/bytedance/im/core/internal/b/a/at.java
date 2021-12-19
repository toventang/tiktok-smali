package com.bytedance.im.core.internal.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.l;
import com.bytedance.im.core.internal.a.g;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.e.d;
import com.bytedance.im.core.internal.utils.f;
import com.bytedance.im.core.proto.ConversationOperationStatus;
import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.bytedance.im.core.proto.IMCMD;

public final class at extends w<h> {
    static {
        Covode.recordClassIndex(22982);
    }

    at() {
        super(IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO.getValue());
    }

    public at(b<h> bVar) {
        super(IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f.body == null || kVar.f38725f.body.upsert_conversation_setting_ext_info_body == null || kVar.f38725f.body.upsert_conversation_setting_ext_info_body.status == null || kVar.f38725f.body.upsert_conversation_setting_ext_info_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue() || kVar.f38725f.body.upsert_conversation_setting_ext_info_body.setting_info == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(final k kVar, final Runnable runnable) {
        final String str = (String) kVar.f38723d[0];
        if (!kVar.l() || !a(kVar)) {
            b(kVar);
            runnable.run();
            e.a(kVar, false).a("conversation_id", str).a();
            return;
        }
        final ConversationSettingInfo conversationSettingInfo = kVar.f38725f.body.upsert_conversation_setting_ext_info_body.setting_info;
        d.a(new c<h>() {
            /* class com.bytedance.im.core.internal.b.a.at.AnonymousClass1 */

            static {
                Covode.recordClassIndex(22983);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.im.core.internal.e.c
            public final /* synthetic */ h a() {
                h a2 = com.bytedance.im.core.internal.a.c.a(str, true);
                l a3 = f.a((l) null, conversationSettingInfo);
                if (a2 != null) {
                    a2.setSettingInfo(a3);
                }
                g.a(a3);
                return a2;
            }
        }, new com.bytedance.im.core.internal.e.b<h>() {
            /* class com.bytedance.im.core.internal.b.a.at.AnonymousClass2 */

            static {
                Covode.recordClassIndex(22984);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.internal.e.b
            public final /* synthetic */ void a(h hVar) {
                h hVar2 = hVar;
                if (hVar2 != null) {
                    j.a().a(hVar2, 5);
                    at.this.a(hVar2);
                    e.a(kVar, true).a("conversation_id", str).a();
                } else {
                    at.this.b(k.a(-1015));
                }
                runnable.run();
            }
        });
    }
}
