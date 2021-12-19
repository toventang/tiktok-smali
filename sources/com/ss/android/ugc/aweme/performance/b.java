package com.ss.android.ugc.aweme.performance;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.apm.block.a;
import com.bytedance.apm.block.a.e;
import com.bytedance.apm.block.a.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.services.apm.api.d;
import com.ss.android.ugc.aweme.performance.a;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class b extends a implements d {

    /* renamed from: d  reason: collision with root package name */
    private static b f114782d;

    /* renamed from: b  reason: collision with root package name */
    final List<a> f114783b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public boolean f114784c;

    static {
        Covode.recordClassIndex(73846);
    }

    @Override // com.bytedance.services.apm.api.d
    public final void a(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.d
    public final void a(Activity activity, Bundle bundle) {
    }

    @Override // com.bytedance.services.apm.api.d
    public final void b(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.d
    public final void c(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.d
    public final void l_() {
    }

    private b() {
    }

    public static b a() {
        MethodCollector.i(9918);
        if (f114782d == null) {
            synchronized (b.class) {
                try {
                    if (f114782d == null) {
                        f114782d = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9918);
                    throw th;
                }
            }
        }
        b bVar = f114782d;
        MethodCollector.o(9918);
        return bVar;
    }

    @Override // com.bytedance.apm.block.a
    public final void a(String str) {
        super.a(str);
        if (this.f114784c) {
            for (a aVar : this.f114783b) {
                l.d(str, "");
                if (aVar.f114761d) {
                    try {
                        a.C2938a aVar2 = aVar.f114759b;
                        if (aVar2 != null) {
                            e eVar = f.r.f24583b;
                            l.b(eVar, "");
                            if (eVar.a()) {
                                aVar2.f114772b = true;
                            }
                        }
                        aVar.f114758a.a(com.bytedance.monitor.collector.a.f41431b, str);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override // com.bytedance.apm.block.a
    public final void a(long j2, long j3, long j4, long j5, boolean z) {
        super.a(j2, j3, j4, j5, z);
        if (this.f114784c) {
            for (a aVar : this.f114783b) {
                if (aVar.f114761d) {
                    try {
                        a.C2938a aVar2 = aVar.f114759b;
                        if (aVar2 != null) {
                            if (z) {
                                aVar2.f114773c = true;
                            }
                            if (aVar.f114760c.size() > 20000) {
                                aVar.f114760c.poll();
                            }
                            aVar.f114760c.add(aVar2);
                            aVar.f114759b = null;
                        }
                        if (aVar.f114758a.f114775e >= 0) {
                            aVar.f114758a.f114771a = com.bytedance.monitor.collector.a.f41431b;
                            if (aVar.f114758a.f114771a - aVar.f114758a.f114775e > ((long) aVar.f114763f)) {
                                a.C2938a aVar3 = aVar.f114758a;
                                a.C2938a aVar4 = new a.C2938a(aVar3.f114775e, aVar3.f114776f);
                                aVar4.f114771a = aVar3.f114771a;
                                aVar4.f114774d = aVar3.f114774d;
                                aVar4.f114772b = aVar3.f114772b;
                                aVar4.f114773c = aVar3.f114773c;
                                aVar.f114759b = aVar4;
                                String.valueOf(aVar.f114758a.f114771a - aVar.f114758a.f114775e);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}
