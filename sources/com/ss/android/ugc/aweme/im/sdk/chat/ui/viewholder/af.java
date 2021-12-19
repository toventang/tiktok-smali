package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveEventContent;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class af extends ae {

    /* renamed from: a  reason: collision with root package name */
    private bg f101335a;

    static {
        Covode.recordClassIndex(64806);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ae
    public final void a() {
        super.a();
        this.f101319j = (TuxIconView) a(R.id.e_l);
        this.f101335a = new bg(this.f101319j);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final void a(View.OnClickListener onClickListener) {
        l.d(onClickListener, "");
        super.a(onClickListener);
        this.f101319j.setOnClickListener(onClickListener);
        this.t.a(this.f101319j);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public af(View view, b bVar) {
        super(view, bVar);
        l.d(view, "");
        l.d(bVar, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ae
    public final /* bridge */ /* synthetic */ void a(ai aiVar, ai aiVar2, ShareLiveEventContent shareLiveEventContent, int i2) {
        a(aiVar, aiVar2, shareLiveEventContent, i2);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ae
    public final void a(ai aiVar, ai aiVar2, ShareLiveEventContent shareLiveEventContent, int i2) {
        l.d(aiVar, "");
        l.d(shareLiveEventContent, "");
        super.a(aiVar, aiVar2, shareLiveEventContent, i2);
        bg bgVar = this.f101335a;
        if (bgVar == null) {
            l.a("statusIcon");
        }
        bgVar.a(this.s);
    }
}
