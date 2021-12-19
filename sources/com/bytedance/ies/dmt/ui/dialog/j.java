package com.bytedance.ies.dmt.ui.dialog;

import android.os.Handler;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f33445a;

    static {
        Covode.recordClassIndex(19956);
    }

    j(a aVar) {
        this.f33445a = aVar;
    }

    public final void onClick(View view) {
        a aVar = this.f33445a;
        if (!aVar.f33396g) {
            a.a(false, aVar.f33390a);
            new Handler().postDelayed(new d(aVar), 100);
        }
        if (aVar.f33393d != null) {
            aVar.f33393d.onClick(aVar.f33397i, 1);
        }
    }
}
