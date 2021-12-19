package com.ss.android.ugc.aweme.setting.serverpush.ui;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.setting.serverpush.b.l;
import com.ss.android.ugc.aweme.setting.serverpush.ui.g;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class k implements u {

    /* renamed from: a  reason: collision with root package name */
    private final g f122636a;

    static {
        Covode.recordClassIndex(80465);
    }

    k(g gVar) {
        this.f122636a = gVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        g gVar = this.f122636a;
        if (g.AnonymousClass2.f122629a[((l) obj).ordinal()] != 1) {
            gVar.f122619c.a(false);
            gVar.w.a(false);
            gVar.y.a(true);
            return;
        }
        gVar.f122619c.a(true);
        gVar.w.a(true);
        gVar.y.a(false);
        gVar.f122619c.b(gVar.getString(R.string.frk));
    }
}
