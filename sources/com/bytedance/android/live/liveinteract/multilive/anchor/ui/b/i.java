package com.bytedance.android.live.liveinteract.multilive.anchor.ui.b;

import android.view.View;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.cohost.ui.d.f;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class i extends b<f> {

    /* renamed from: a  reason: collision with root package name */
    private LiveTextView f11665a;

    static {
        Covode.recordClassIndex(6356);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.b
    public final /* synthetic */ void a(f fVar) {
        f fVar2 = fVar;
        l.d(fVar2, "");
        this.f11665a.setText(fVar2.f10339a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.f0v);
        l.b(findViewById, "");
        this.f11665a = (LiveTextView) findViewById;
    }
}
