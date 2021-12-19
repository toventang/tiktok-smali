package com.bytedance.android.live.liveinteract.multilive.a.g;

import android.view.View;
import com.bytedance.android.live.core.f.f;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.multilive.a.e.a;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends com.bytedance.android.live.liveinteract.a.b.a.b<a> {

    /* renamed from: a  reason: collision with root package name */
    private final LiveTextView f11566a;

    static {
        Covode.recordClassIndex(6257);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.emz);
        l.b(findViewById, "");
        this.f11566a = (LiveTextView) findViewById;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.android.live.liveinteract.a.b.a.b
    public final /* synthetic */ void a(a aVar) {
        a aVar2 = aVar;
        l.d(aVar2, "");
        this.f11566a.setText(f.a(R.string.e55, Integer.valueOf(aVar2.f11553a)));
    }
}
