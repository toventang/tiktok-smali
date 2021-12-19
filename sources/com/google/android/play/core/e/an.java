package com.google.android.play.core.e;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

final class an implements z {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f53239a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Intent f53240b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f53241c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ap f53242d;

    static {
        Covode.recordClassIndex(32908);
    }

    an(ap apVar, f fVar, Intent intent, Context context) {
        this.f53242d = apVar;
        this.f53239a = fVar;
        this.f53240b = intent;
        this.f53241c = context;
    }

    @Override // com.google.android.play.core.e.z
    public final void a() {
        ap apVar;
        apVar.f53248b.post(new ao(this.f53242d, this.f53239a, 5, 0));
    }

    @Override // com.google.android.play.core.e.z
    public final void a(int i2) {
        ap apVar;
        apVar.f53248b.post(new ao(this.f53242d, this.f53239a, 6, i2));
    }

    @Override // com.google.android.play.core.e.z
    public final void b() {
        if (!this.f53240b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.f53240b.putExtra("triggered_from_app_after_verification", true);
            this.f53241c.sendBroadcast(this.f53240b);
            return;
        }
        this.f53242d.f53183d.b("Splits copied and verified more than once.", new Object[0]);
    }
}
