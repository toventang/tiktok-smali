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

final class cu implements c<Map<b<?>, String>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ cs f50203a;

    static {
        Covode.recordClassIndex(31293);
    }

    private cu(cs csVar) {
        this.f50203a = csVar;
    }

    @Override // com.google.android.gms.c.c
    public final void a(h<Map<b<?>, String>> hVar) {
        this.f50203a.f50189d.lock();
        try {
            if (this.f50203a.f50192g) {
                if (hVar.b()) {
                    this.f50203a.f50193h = new a(this.f50203a.f50186a.size());
                    for (ct<?> ctVar : this.f50203a.f50186a.values()) {
                        this.f50203a.f50193h.put(ctVar.f49979d, ConnectionResult.f49941a);
                    }
                } else if (hVar.e() instanceof f) {
                    f fVar = (f) hVar.e();
                    if (this.f50203a.f50191f) {
                        this.f50203a.f50193h = new a(this.f50203a.f50186a.size());
                        for (ct<?> ctVar2 : this.f50203a.f50186a.values()) {
                            b<O> bVar = ctVar2.f49979d;
                            ConnectionResult connectionResult = fVar.getConnectionResult((com.google.android.gms.common.api.h<? extends a.d>) ctVar2);
                            if (this.f50203a.a(ctVar2, connectionResult)) {
                                this.f50203a.f50193h.put(bVar, new ConnectionResult(16));
                            } else {
                                this.f50203a.f50193h.put(bVar, connectionResult);
                            }
                        }
                    } else {
                        this.f50203a.f50193h = fVar.zaj();
                    }
                    cs csVar = this.f50203a;
                    csVar.f50195j = csVar.h();
                } else {
                    hVar.e();
                    this.f50203a.f50193h = Collections.emptyMap();
                    this.f50203a.f50195j = new ConnectionResult(8);
                }
                if (this.f50203a.f50194i != null) {
                    this.f50203a.f50193h.putAll(this.f50203a.f50194i);
                    cs csVar2 = this.f50203a;
                    csVar2.f50195j = csVar2.h();
                }
                if (this.f50203a.f50195j == null) {
                    this.f50203a.c();
                    this.f50203a.g();
                } else {
                    this.f50203a.f50192g = false;
                    this.f50203a.f50188c.a(this.f50203a.f50195j);
                }
                this.f50203a.f50190e.signalAll();
                this.f50203a.f50189d.unlock();
            }
        } finally {
            this.f50203a.f50189d.unlock();
        }
    }

    /* synthetic */ cu(cs csVar, byte b2) {
        this(csVar);
    }
}
