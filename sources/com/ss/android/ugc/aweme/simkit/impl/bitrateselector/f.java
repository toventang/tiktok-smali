package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bitrateselector.a.b;
import com.ss.android.ugc.aweme.bitrateselector.a.f;
import com.ss.android.ugc.aweme.bitrateselector.a.g;
import com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a;
import com.ss.android.ugc.aweme.simkit.impl.bitrateselector.r;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private b f133542a;

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.bitrateselector.a.f f133543b;

    /* renamed from: c  reason: collision with root package name */
    private int f133544c = b.f133532a;

    /* renamed from: d  reason: collision with root package name */
    private t f133545d = new t();

    static {
        Covode.recordClassIndex(87362);
    }

    public final synchronized boolean a() {
        MethodCollector.i(6540);
        if (this.f133543b == null || this.f133544c != b.f133532a) {
            RateSettingsResponse a2 = r.a.f133571a.a();
            com.ss.android.ugc.aweme.bitrateselector.a.f fVar = null;
            if (a2 != null) {
                int i2 = b.f133532a;
                if (i2 == 2) {
                    a2.getHighBitrateCurve();
                    f.a aVar = new f.a(a.f.a(a2.getAdaptiveGearGroup()));
                    aVar.f68709f = t.a();
                    aVar.f68707d = a.C3460a.a(a2.getHighBitrateCurve());
                    aVar.f68706c = a.b.a(a2.getBandwidthSet());
                    aVar.f68705b = a.h.a(a2.getGearSet());
                    fVar = aVar.a();
                } else if (i2 != 3) {
                    a2.getAutoBitrateSet();
                    f.a aVar2 = new f.a(a.f.a(a2.getAdaptiveGearGroup()));
                    aVar2.f68709f = t.a();
                    aVar2.f68707d = a.C3460a.a(a2.getAutoBitrateSet());
                    aVar2.f68706c = a.b.a(a2.getBandwidthSet());
                    aVar2.f68705b = a.h.a(a2.getGearSet());
                    fVar = aVar2.a();
                } else {
                    f.a aVar3 = new f.a(null);
                    aVar3.f68709f = g.LOWEST;
                    fVar = aVar3.a();
                }
            }
            this.f133543b = fVar;
            if (fVar == null) {
                MethodCollector.o(6540);
                return false;
            }
            this.f133542a.a(fVar);
            this.f133544c = b.f133532a;
            MethodCollector.o(6540);
            return true;
        }
        MethodCollector.o(6540);
        return true;
    }

    public f(b bVar) {
        this.f133542a = bVar;
    }
}
