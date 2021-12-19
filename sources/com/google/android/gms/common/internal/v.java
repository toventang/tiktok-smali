package com.google.android.gms.common.internal;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.internal.j;

public final class v extends f {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Intent f50437a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ j f50438b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f50439c = 2;

    static {
        Covode.recordClassIndex(31432);
    }

    @Override // com.google.android.gms.common.internal.f
    public final void a() {
        Intent intent = this.f50437a;
        if (intent != null) {
            this.f50438b.startActivityForResult(intent, this.f50439c);
        }
    }

    public v(Intent intent, j jVar) {
        this.f50437a = intent;
        this.f50438b = jVar;
    }
}
