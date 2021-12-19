package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.simkit.impl.bitrateselector.r;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.f.a.a.a.a.a;
import com.ss.android.ugc.f.a.a.a.b.c;
import com.ss.android.ugc.f.a.a.a.b.d;
import com.ss.android.ugc.f.a.a.a.b.e;
import com.ss.android.ugc.f.a.a.a.b.f;
import com.ss.android.ugc.f.a.a.a.b.g;
import com.ss.android.ugc.playerkit.videoview.b.b;

public final class j implements b {

    /* renamed from: a  reason: collision with root package name */
    private g f133551a;

    /* renamed from: b  reason: collision with root package name */
    private int f133552b = b.f133532a;

    static {
        Covode.recordClassIndex(87366);
    }

    @Override // com.ss.android.ugc.playerkit.videoview.b.b
    public final synchronized g a() {
        MethodCollector.i(6439);
        if (r.a.f133571a.a() == null) {
            MethodCollector.o(6439);
            return null;
        }
        if (this.f133551a == null || this.f133552b != b.f133532a) {
            RateSettingsResponse a2 = r.a.f133571a.a();
            int i2 = b.f133532a;
            if (i2 == 2) {
                a(a2.getHighBitrateCurve());
                a2.getHighBitrateCurve();
            } else if (i2 == 3) {
                this.f133551a = new e();
            } else if (i2 != 4) {
                a(a2.getAutoBitrateSet());
                a2.getAutoBitrateSet();
            } else {
                this.f133551a = new c(a2.getLowQltyCurv(), a2.getAdaptiveGearGroup());
            }
            this.f133552b = b.f133532a;
        }
        g gVar = this.f133551a;
        MethodCollector.o(6439);
        return gVar;
    }

    private void a(a aVar) {
        RateSettingsResponse a2 = r.a.f133571a.a();
        if (com.ss.android.ugc.playerkit.model.c.f148702a.getBitrateModelThreshold() != -1.0d) {
            this.f133551a = new d.a(a2.getAdaptiveGearGroup()).a(a2.getGearSet()).b(a2.getBandwidthSet()).a(aVar).a();
        } else {
            this.f133551a = new k(new f.a(a2.getAdaptiveGearGroup()).a(a2.getGearSet()).b(a2.getBandwidthSet()).a(aVar).a(), aVar);
        }
    }
}
