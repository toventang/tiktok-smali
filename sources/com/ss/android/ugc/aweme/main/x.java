package com.ss.android.ugc.aweme.main;

import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ca.i;

/* access modifiers changed from: package-private */
public final /* synthetic */ class x implements i.a {

    /* renamed from: a  reason: collision with root package name */
    private final MainActivity f109325a;

    static {
        Covode.recordClassIndex(70024);
    }

    x(MainActivity mainActivity) {
        this.f109325a = mainActivity;
    }

    @Override // com.ss.android.ugc.aweme.ca.i.a
    public final LayoutInflater a() {
        return this.f109325a.getLayoutInflater();
    }
}
