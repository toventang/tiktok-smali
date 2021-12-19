package com.google.android.gms.common.api.internal;

import androidx.c.a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.c;
import com.google.android.gms.c.h;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import java.util.Collections;
import java.util.Map;

final class u implements c<Map<b<?>, String>> {

    /* renamed from: a  reason: collision with root package name */
    private p f50275a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ cs f50276b;

    static {
        Covode.recordClassIndex(31324);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f50275a.f();
    }

    @Override // com.google.android.gms.c.c
    public final void a(h<Map<b<?>, String>> hVar) {
        this.f50276b.f50189d.lock();
        try {
            if (!this.f50276b.f50192g) {
                this.f50275a.f();
                return;
            }
            if (hVar.b()) {
                this.f50276b.f50194i = new a(this.f50276b.f50187b.size());
                for (ct<?> ctVar : this.f50276b.f50187b.values()) {
                    this.f50276b.f50194i.put(ctVar.f49979d, ConnectionResult.f49941a);
                }
            } else if (hVar.e() instanceof f) {
                f fVar = (f) hVar.e();
                if (this.f50276b.f50191f) {
                    this.f50276b.f50194i = new a(this.f50276b.f50187b.size());
                    for (ct<?> ctVar2 : this.f50276b.f50187b.values()) {
                        b<O> bVar = ctVar2.f49979d;
                        ConnectionResult connectionResult = fVar.getConnectionResult((com.google.android.gms.common.api.h<? extends a.d>) ctVar2);
                        if (this.f50276b.a(ctVar2, connectionResult)) {
                            this.f50276b.f50194i.put(bVar, new ConnectionResult(16));
                        } else {
                            this.f50276b.f50194i.put(bVar, connectionResult);
                        }
                    }
                } else {
                    this.f50276b.f50194i = fVar.zaj();
                }
            } else {
                hVar.e();
                this.f50276b.f50194i = Collections.emptyMap();
            }
            if (this.f50276b.d()) {
                this.f50276b.f50193h.putAll(this.f50276b.f50194i);
                if (this.f50276b.h() == null) {
                    this.f50276b.c();
                    this.f50276b.g();
                    this.f50276b.f50190e.signalAll();
                }
            }
            this.f50275a.f();
            this.f50276b.f50189d.unlock();
        } finally {
            this.f50276b.f50189d.unlock();
        }
    }

    u(cs csVar, p pVar) {
        this.f50276b = csVar;
        this.f50275a = pVar;
    }
}
