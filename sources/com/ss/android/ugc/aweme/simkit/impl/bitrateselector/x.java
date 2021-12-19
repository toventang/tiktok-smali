package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bitrateselector.impl.c;
import com.ss.android.ugc.aweme.simkit.impl.bitrateselector.r;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.f.a.a.a.a.a;
import com.ss.android.ugc.f.a.a.a.b.c;
import com.ss.android.ugc.f.a.a.a.b.d;
import com.ss.android.ugc.f.a.a.a.b.e;
import com.ss.android.ugc.f.a.a.a.b.g;
import com.ss.android.ugc.playerkit.videoview.b.b;

public final class x implements b {

    /* renamed from: a  reason: collision with root package name */
    private g f133578a;

    /* renamed from: b  reason: collision with root package name */
    private int f133579b = b.f133532a;

    static {
        Covode.recordClassIndex(87383);
    }

    @Override // com.ss.android.ugc.playerkit.videoview.b.b
    public final synchronized g a() {
        MethodCollector.i(7315);
        if (r.a.f133571a.a() == null) {
            MethodCollector.o(7315);
            return null;
        }
        if (this.f133578a == null || this.f133579b != b.f133532a) {
            RateSettingsResponse a2 = r.a.f133571a.a();
            int i2 = b.f133532a;
            if (i2 == 2) {
                a(a2.getHighBitrateCurve());
                a2.getHighBitrateCurve();
            } else if (i2 == 3) {
                this.f133578a = new e();
            } else if (i2 != 4) {
                a(a2.getAutoBitrateSet());
                a2.getAutoBitrateSet();
            } else {
                this.f133578a = new c(a2.getLowQltyCurv(), a2.getAdaptiveGearGroup());
            }
            this.f133579b = b.f133532a;
        }
        g gVar = this.f133578a;
        MethodCollector.o(7315);
        return gVar;
    }

    private void a(a aVar) {
        RateSettingsResponse a2 = r.a.f133571a.a();
        if (com.ss.android.ugc.playerkit.model.c.f148702a.getBitrateModelThreshold() != -1.0d) {
            this.f133578a = new d.a(a2.getAdaptiveGearGroup()).a(a2.getGearSet()).b(a2.getBandwidthSet()).a(aVar).a();
        } else {
            this.f133578a = new c.a(a2.getAdaptiveGearGroup()).a(a2.getGearSet()).b(a2.getBandwidthSet()).a(aVar).a();
        }
    }
}
