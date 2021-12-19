package com.ss.android.ugc.aweme.im.sdk.chat.ui.a;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.proto.MessageStatus;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.a.f;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.t;

final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final c.AnonymousClass2 f101143a;

    static {
        Covode.recordClassIndex(64704);
    }

    j(c.AnonymousClass2 r1) {
        this.f101143a = r1;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        c.AnonymousClass2 r3 = this.f101143a;
        ai aiVar = r3.f101131c;
        if (r3.f101129a == 1 || r3.f101129a == 2 || r3.f101129a == 9 || r3.f101129a == 10 || r3.f101129a == 14 || r3.f101129a == 11 || r3.f101129a == 16 || r3.f101129a == 45 || r3.f101129a == 17 || r3.f101129a == 18 || r3.f101129a == 15 || r3.f101129a == 20 || r3.f101129a == 21 || r3.f101129a == 22 || r3.f101129a == 23 || r3.f101129a == 33 || r3.f101129a == 34 || r3.f101129a == 35 || r3.f101129a == 37 || r3.f101129a == 38 || r3.f101129a == 39 || r3.f101129a == 47 || r3.f101129a == 42 || r3.f101129a == 43 || r3.f101129a == 46 || r3.f101129a == 48 || r3.f101129a == 49 || r3.f101129a == 51) {
            t.a(aiVar, new b<ai>() {
                /* class com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c.AnonymousClass2.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(64695);
                }

                @Override // com.bytedance.im.core.a.a.b
                public final void a(u uVar) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.a.a.b
                public final /* synthetic */ void a(ai aiVar) {
                    ai aiVar2 = aiVar;
                    int i2 = 0;
                    int i3 = -1;
                    for (int i4 = 0; i4 < c.this.f101101b.size(); i4++) {
                        ai aiVar3 = (ai) c.this.f101101b.get(i4);
                        if (aiVar3.getReferenceInfo() != null) {
                            ReferenceInfo referenceInfo = aiVar3.getReferenceInfo();
                            if (referenceInfo.referenced_message_id.longValue() == aiVar2.getMsgId()) {
                                aiVar3.setRefMsg(new ReferenceInfo.Builder().hint(referenceInfo.hint).ref_message_type(referenceInfo.ref_message_type).referenced_message_id(referenceInfo.referenced_message_id).referenced_message_status(MessageStatus.DELETED).build());
                                if (i3 == -1) {
                                    i3 = i4;
                                    i2 = 1;
                                } else {
                                    i2 = (i4 - i3) + 1;
                                }
                            }
                        }
                    }
                    com.ss.android.ugc.aweme.im.service.m.a.c("MessageAdapter", "Message deleted " + aiVar2.getMsgId());
                    c.this.notifyItemRangeChanged(i3, i2);
                }
            });
        }
        f.a(c.this.n.isGroupChat(), "delete");
    }
}
