package com.bytedance.apm.block;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.apm.block.a.f;
import com.bytedance.apm.c;
import com.bytedance.apm.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.a;
import com.bytedance.services.apm.api.d;

public final class b extends a implements e, d {

    /* renamed from: b  reason: collision with root package name */
    public boolean f24642b;

    /* renamed from: c  reason: collision with root package name */
    public i f24643c = i.a();

    /* renamed from: d  reason: collision with root package name */
    private boolean f24644d;

    static {
        Covode.recordClassIndex(14493);
    }

    @Override // com.bytedance.services.apm.api.d
    public final void a(Activity activity, Bundle bundle) {
    }

    @Override // com.bytedance.services.apm.api.d
    public final void c(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.d
    public final void l_() {
    }

    public final void a() {
        if (this.f24642b && !this.f24644d) {
            this.f24644d = true;
            if (c.e()) {
                new String[]{"BlockDetector start: "};
            }
        }
    }

    @Override // com.bytedance.services.apm.api.d
    public final void b(Activity activity) {
        a();
    }

    @Override // com.bytedance.services.apm.api.d
    public final void a(Activity activity) {
        if (this.f24644d) {
            this.f24644d = false;
            this.f24643c.a(false);
            if (c.e()) {
                new String[]{"BlockDetector stop: "};
            }
        }
    }

    @Override // com.bytedance.apm.e
    public final void a(com.bytedance.apm.config.e eVar) {
        boolean z;
        if (eVar != null) {
            long j2 = eVar.f24844l;
            long j3 = eVar.f24840h;
            boolean z2 = eVar.f24837e;
            boolean z3 = eVar.f24836d;
            this.f24643c.o = z2;
            this.f24643c.a(j2);
            i iVar = this.f24643c;
            if (j3 < iVar.f24669c) {
                j3 = 5000;
            }
            iVar.f24670d = j3;
            iVar.c();
            this.f24643c.f24672h = z3;
            i iVar2 = this.f24643c;
            boolean z4 = false;
            if (c.p || eVar.n) {
                z = true;
            } else {
                z = false;
            }
            iVar2.p = z;
            i iVar3 = this.f24643c;
            if (c.p || eVar.f24839g) {
                z4 = true;
            }
            iVar3.q = z4;
        }
    }

    @Override // com.bytedance.apm.block.a
    public final void a(String str) {
        super.a(str);
        if (this.f24644d) {
            i iVar = this.f24643c;
            try {
                if (iVar.f24667a.a()) {
                    if (i.f24666f && iVar.f24671g) {
                        iVar.f24676l.f24652h = a.f41431b;
                        if (iVar.f24676l.f24652h - iVar.f24676l.f24651g > iVar.f24669c) {
                            iVar.f24676l.f24655k = true;
                            iVar.f24676l.f24648d = false;
                            iVar.f24676l.f24647c = iVar.n;
                            iVar.a(iVar.f24676l.a());
                        }
                    }
                    if (iVar.f24677m != null && f.r.f24583b.a()) {
                        iVar.f24677m.f24649e = true;
                    }
                    if (iVar.f24676l == null) {
                        iVar.f24676l = new c(a.f41431b, str);
                    } else {
                        iVar.f24676l.a(a.f41431b, str);
                    }
                    if (iVar.f24672h && iVar.p) {
                        iVar.f24667a.a(iVar.s, iVar.f24669c);
                        if (iVar.f24668b && iVar.q) {
                            iVar.f24667a.a(iVar.t, iVar.f24670d);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.apm.block.a
    public final void a(long j2, long j3, long j4, long j5, boolean z) {
        super.a(j2, j3, j4, j5, z);
        if (this.f24644d) {
            this.f24643c.a(z);
        }
    }
}
