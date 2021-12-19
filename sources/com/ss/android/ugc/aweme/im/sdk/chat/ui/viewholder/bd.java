package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.icon.TuxIconView;
import com.facebook.imagepipeline.o.d;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareUserContent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class bd extends bc {

    /* renamed from: b  reason: collision with root package name */
    private bg f101394b;

    static {
        Covode.recordClassIndex(64838);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bc
    public final void a() {
        super.a();
        this.f101319j = (TuxIconView) a(R.id.e_l);
        this.f101394b = new bg(this.f101319j);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bc
    public final void a(View.OnClickListener onClickListener) {
        l.d(onClickListener, "");
        super.a(onClickListener);
        this.f101319j.setOnClickListener(onClickListener);
        this.t.a(this.f101319j);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bc
    public final void a(ShareUserContent shareUserContent) {
        l.d(shareUserContent, "");
        a.a(i(), shareUserContent.getAvatar(), (d) null, 0, 0, (com.facebook.drawee.c.d) null, 60);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bd(View view, b bVar) {
        super(view, bVar);
        l.d(view, "");
        l.d(bVar, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bc
    public final /* bridge */ /* synthetic */ void a(ai aiVar, ai aiVar2, ShareUserContent shareUserContent, int i2) {
        a(aiVar, aiVar2, shareUserContent, i2);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bc
    public final void a(ai aiVar, ai aiVar2, ShareUserContent shareUserContent, int i2) {
        l.d(aiVar, "");
        l.d(shareUserContent, "");
        super.a(aiVar, aiVar2, shareUserContent, i2);
        bg bgVar = this.f101394b;
        if (bgVar == null) {
            l.b();
        }
        bgVar.a(this.s);
    }
}
