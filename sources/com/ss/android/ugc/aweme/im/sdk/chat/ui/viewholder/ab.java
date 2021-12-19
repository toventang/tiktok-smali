package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareCompilationContent;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ab extends ac {

    /* renamed from: a  reason: collision with root package name */
    private bg f101328a;

    static {
        Covode.recordClassIndex(64802);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ac
    public final void a() {
        super.a();
        this.f101319j = (TuxIconView) a(R.id.e_l);
        this.f101328a = new bg(this.f101319j);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ac
    public final void a(View.OnClickListener onClickListener) {
        l.d(onClickListener, "");
        super.a(onClickListener);
        this.f101319j.setOnClickListener(onClickListener);
        this.t.a(this.f101319j);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ab(View view, b bVar) {
        super(view, bVar);
        l.d(view, "");
        l.d(bVar, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ac
    public final /* bridge */ /* synthetic */ void a(ai aiVar, ai aiVar2, ShareCompilationContent shareCompilationContent, int i2) {
        a(aiVar, aiVar2, shareCompilationContent, i2);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ac
    public final void a(ai aiVar, ai aiVar2, ShareCompilationContent shareCompilationContent, int i2) {
        l.d(aiVar, "");
        super.a(aiVar, aiVar2, shareCompilationContent, i2);
        bg bgVar = this.f101328a;
        if (bgVar == null) {
            l.a("statusIcon");
        }
        bgVar.a(this.s);
    }
}
