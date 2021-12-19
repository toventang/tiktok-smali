package com.ss.android.ugc.aweme.music.presenter;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.component.f;

public final /* synthetic */ class o implements f {

    /* renamed from: a  reason: collision with root package name */
    private final n f111611a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f111612b;

    static {
        Covode.recordClassIndex(71719);
    }

    public o(n nVar, Activity activity) {
        this.f111611a = nVar;
        this.f111612b = activity;
    }

    @Override // com.ss.android.ugc.aweme.base.component.f
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.base.component.f
    public final void a() {
        n nVar = this.f111611a;
        nVar.a(this.f111612b);
        nVar.t.setValue(true);
    }
}
