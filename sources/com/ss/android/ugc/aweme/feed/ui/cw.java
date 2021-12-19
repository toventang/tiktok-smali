package com.ss.android.ugc.aweme.feed.ui;

import android.text.TextUtils;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import h.p;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cw implements u {

    /* renamed from: a  reason: collision with root package name */
    private final cv f94529a;

    static {
        Covode.recordClassIndex(60014);
    }

    cw(cv cvVar) {
        this.f94529a = cvVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        cv cvVar = this.f94529a;
        p pVar = (p) obj;
        if (cvVar.L != null && TextUtils.equals((CharSequence) pVar.getFirst(), cvVar.L.getAid()) && cvVar.f94516f != ((Long) pVar.getSecond()).longValue()) {
            cvVar.f94516f = ((Long) pVar.getSecond()).longValue();
            cvVar.f94512b.setText(cv.a(cvVar.f94516f, cvVar.L));
        }
    }
}
