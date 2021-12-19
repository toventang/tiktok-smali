package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.EmojiContent;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class j extends k {

    /* renamed from: a  reason: collision with root package name */
    private bg f101444a;

    static {
        Covode.recordClassIndex(64869);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.k
    public final void a() {
        super.a();
        this.f101319j = (TuxIconView) this.itemView.findViewById(R.id.e_l);
        this.f101444a = new bg(this.f101319j);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.k
    public final void bD_() {
        super.bD_();
        this.t.a(this.f101319j);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final void a(View.OnClickListener onClickListener) {
        l.d(onClickListener, "");
        super.a(onClickListener);
        this.f101319j.setOnClickListener(onClickListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(View view, b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.k
    public final /* bridge */ /* synthetic */ void a(ai aiVar, ai aiVar2, EmojiContent emojiContent, int i2) {
        a(aiVar, aiVar2, emojiContent, i2);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.k
    public final void a(ai aiVar, ai aiVar2, EmojiContent emojiContent, int i2) {
        l.d(aiVar, "");
        l.d(emojiContent, "");
        super.a(aiVar, aiVar2, emojiContent, i2);
        bg bgVar = this.f101444a;
        if (bgVar == null) {
            l.a("statusIcon");
        }
        bgVar.a(this.s);
    }
}
