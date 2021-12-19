package com.bytedance.ies.dmt.ui.dialog;

import android.os.Handler;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f33444a;

    static {
        Covode.recordClassIndex(19955);
    }

    i(a aVar) {
        this.f33444a = aVar;
    }

    public final void onClick(View view) {
        a aVar = this.f33444a;
        if (!aVar.f33394e) {
            a.a(false, aVar.f33390a);
            new Handler().postDelayed(new e(aVar), 100);
        }
        if (aVar.f33391b != null) {
            aVar.f33391b.onClick(aVar.f33397i, 1);
        }
    }
}
