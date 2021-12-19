package com.ss.android.ugc.aweme.setting.serverpush.ui;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.setting.serverpush.b.l;
import com.ss.android.ugc.aweme.setting.serverpush.ui.a;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class e implements u {

    /* renamed from: a  reason: collision with root package name */
    private final a f122615a;

    static {
        Covode.recordClassIndex(80456);
    }

    e(a aVar) {
        this.f122615a = aVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        a aVar = this.f122615a;
        if (a.AnonymousClass2.f122611a[((l) obj).ordinal()] != 1) {
            aVar.f122604j.a(false);
            aVar.y.a(false);
            aVar.z.a(true);
            return;
        }
        aVar.f122604j.a(true);
        aVar.y.a(true);
        aVar.z.a(false);
        aVar.f122604j.b(aVar.getString(R.string.frk));
    }
}
