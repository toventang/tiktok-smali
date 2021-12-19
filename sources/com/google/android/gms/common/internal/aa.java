package com.google.android.gms.common.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.q;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class aa implements k.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ k f50328a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ i f50329b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ q.a f50330c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ q.b f50331d;

    static {
        Covode.recordClassIndex(31365);
    }

    @Override // com.google.android.gms.common.api.k.a
    public final void a(Status status) {
        if (status.c()) {
            this.f50329b.a(this.f50330c.a(this.f50328a.a(TimeUnit.MILLISECONDS)));
            return;
        }
        this.f50329b.a((Exception) this.f50331d.a(status));
    }

    aa(k kVar, i iVar, q.a aVar, q.b bVar) {
        this.f50328a = kVar;
        this.f50329b = iVar;
        this.f50330c = aVar;
        this.f50331d = bVar;
    }
}
