package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

public final class u extends f {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Intent f50434a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Activity f50435b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f50436c;

    static {
        Covode.recordClassIndex(31431);
    }

    @Override // com.google.android.gms.common.internal.f
    public final void a() {
        Intent intent = this.f50434a;
        if (intent != null) {
            this.f50435b.startActivityForResult(intent, this.f50436c);
        }
    }

    public u(Intent intent, Activity activity, int i2) {
        this.f50434a = intent;
        this.f50435b = activity;
        this.f50436c = i2;
    }
}
