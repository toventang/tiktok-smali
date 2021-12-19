package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupAnnouncementContent;
import com.zhiliaoapp.musically.R;

public final class l extends m {

    /* renamed from: a  reason: collision with root package name */
    private bg f101447a;

    static {
        Covode.recordClassIndex(64871);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.m
    public final void a() {
        super.a();
        this.f101319j = (TuxIconView) a(R.id.e_l);
        this.f101447a = new bg(this.f101319j);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final void a(View.OnClickListener onClickListener) {
        h.f.b.l.d(onClickListener, "");
        super.a(onClickListener);
        this.f101319j.setOnClickListener(onClickListener);
        this.t.a(this.f101319j);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(View view, b bVar) {
        super(view, bVar);
        h.f.b.l.d(view, "");
        h.f.b.l.d(bVar, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.m
    public final /* bridge */ /* synthetic */ void a(ai aiVar, ai aiVar2, GroupAnnouncementContent groupAnnouncementContent, int i2) {
        a(aiVar, aiVar2, groupAnnouncementContent, i2);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.m
    public final void a(ai aiVar, ai aiVar2, GroupAnnouncementContent groupAnnouncementContent, int i2) {
        h.f.b.l.d(aiVar, "");
        super.a(aiVar, aiVar2, groupAnnouncementContent, i2);
        bg bgVar = this.f101447a;
        if (bgVar == null) {
            h.f.b.l.a("statusIcon");
        }
        bgVar.a(this.s);
    }
}
