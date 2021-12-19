package com.ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class u implements androidx.lifecycle.u {

    /* renamed from: a  reason: collision with root package name */
    private final s f71433a;

    /* renamed from: b  reason: collision with root package name */
    private final View f71434b;

    static {
        Covode.recordClassIndex(43960);
    }

    u(s sVar, View view) {
        this.f71433a = sVar;
        this.f71434b = view;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f71433a.a(this.f71434b, (Boolean) obj);
    }
}
