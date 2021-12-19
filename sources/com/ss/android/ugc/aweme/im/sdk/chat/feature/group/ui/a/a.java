package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.a;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.c;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.f;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.g;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.b.l;

public final class a extends com.ss.android.ugc.aweme.im.sdk.chat.ui.a.a.a {
    static {
        Covode.recordClassIndex(64340);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.a.a.a
    public final boolean b() {
        return this.n.isGroupChat();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.a.a$a  reason: collision with other inner class name */
    public static final class C2477a implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a f100586a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ai f100587b;

        static {
            Covode.recordClassIndex(64341);
        }

        C2477a(com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a aVar, ai aiVar) {
            this.f100586a = aVar;
            this.f100587b = aiVar;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.g
        public final void a(com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar, f fVar) {
            l.d(aVar, "");
            l.d(fVar, "");
            com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a aVar2 = this.f100586a;
            ai aiVar = this.f100587b;
            aVar2.v = null;
            if (aVar != null && aVar.getUser() != null && aVar.getUid().equals(String.valueOf(aVar2.s.getSender()))) {
                aVar2.a(aiVar, aVar);
                if (aVar2.f101317h == null) {
                    return;
                }
                if (aiVar.isSelf() || aiVar.getConversationType() != e.a.f37582b) {
                    aVar2.f101317h.setVisibility(8);
                    return;
                }
                aVar2.f101317h.setText(aVar.getDisplayName());
                aVar2.f101317h.setVisibility(0);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar, View view) {
        super(bVar, view);
        l.d(bVar, "");
        l.d(view, "");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c
    public final void a(com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a<?> aVar, ai aiVar) {
        boolean equals;
        l.d(aVar, "");
        l.d(aiVar, "");
        if (((com.ss.android.ugc.aweme.im.sdk.chat.ui.a.a.a) this).u == null) {
            equals = false;
        } else {
            equals = TextUtils.equals(((com.ss.android.ugc.aweme.im.sdk.chat.ui.a.a.a) this).u, aiVar.getUuid());
        }
        aVar.a(aiVar, equals);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c
    public final void a(com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a<?> aVar, IMUser iMUser, ai aiVar) {
        l.d(aVar, "");
        if (aiVar != null) {
            if (aiVar.isSelf()) {
                aVar.a(iMUser, aiVar);
                return;
            }
            com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.b bVar = com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.b.AT_MOST_DB;
            C2477a aVar2 = new C2477a(aVar, aiVar);
            l.d(bVar, "");
            l.d(aiVar, "");
            l.d(aVar2, "");
            com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.a.a(bVar, new c(aiVar.getConversationId(), String.valueOf(aiVar.getSender()), aiVar.getSecSender()), aVar2);
        }
    }
}
