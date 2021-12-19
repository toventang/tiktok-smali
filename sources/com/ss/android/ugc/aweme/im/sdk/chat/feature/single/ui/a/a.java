package com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.a;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.b.l;

public final class a extends com.ss.android.ugc.aweme.im.sdk.chat.ui.a.a.a {
    private boolean x = true;
    private final com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a y;

    static {
        Covode.recordClassIndex(64624);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.a.a.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c
    public final void c() {
        super.c();
        if (this.x) {
            this.x = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.a.a.a
    public final boolean b() {
        if (this.n.isFriendChat() || this.n.isEnterpriseChat()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a aVar, View view) {
        super(aVar, view);
        l.d(aVar, "");
        l.d(view, "");
        this.y = aVar;
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
        c.a(this.y);
        aVar.a(aiVar, equals);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c
    public final void a(com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a<?> aVar, IMUser iMUser, ai aiVar) {
        l.d(aVar, "");
        if (aiVar == null || !aiVar.isSelf()) {
            aVar.a(this.n.getSingleChatFromUser(), aiVar);
        } else {
            aVar.a(iMUser, aiVar);
        }
    }
}
