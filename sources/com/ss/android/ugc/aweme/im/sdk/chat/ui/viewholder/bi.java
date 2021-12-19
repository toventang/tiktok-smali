package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.im.sdk.chat.b.d;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class bi extends a<SystemContent> {

    /* renamed from: a  reason: collision with root package name */
    private TextView f101407a;

    static {
        Covode.recordClassIndex(64849);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final void a() {
        super.a();
        Object a2 = a(R.id.cos);
        l.b(a2, "");
        this.f101407a = (TextView) a2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bi(View view, b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final /* synthetic */ void a(ai aiVar, ai aiVar2, SystemContent systemContent, int i2) {
        SystemContent systemContent2 = systemContent;
        l.d(aiVar, "");
        super.a(aiVar, aiVar2, systemContent2, i2);
        TextView textView = this.f101407a;
        if (textView == null) {
            l.a("textView");
        }
        int c2 = androidx.core.content.b.c(textView.getContext(), R.color.bx);
        TextView textView2 = this.f101407a;
        if (textView2 == null) {
            l.a("textView");
        }
        int c3 = androidx.core.content.b.c(textView2.getContext(), R.color.c9);
        TextView textView3 = this.f101407a;
        if (textView3 == null) {
            l.a("textView");
        }
        d.a(null, aiVar, systemContent2, textView3, this.f101322m, this.n, c2, c3, true, 0, "", null);
    }
}
