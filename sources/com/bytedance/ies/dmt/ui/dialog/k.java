package com.bytedance.ies.dmt.ui.dialog;

import android.os.Handler;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f33446a;

    static {
        Covode.recordClassIndex(19957);
    }

    k(a aVar) {
        this.f33446a = aVar;
    }

    public final void onClick(View view) {
        a aVar = this.f33446a;
        a.a(false, aVar.f33390a);
        new Handler().postDelayed(new n(aVar), 100);
    }
}
