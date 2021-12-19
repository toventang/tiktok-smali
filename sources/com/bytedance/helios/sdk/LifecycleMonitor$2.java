package com.bytedance.helios.sdk;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.f;
import com.bytedance.helios.sdk.utils.g;
import com.ss.android.ugc.aweme.au;

/* access modifiers changed from: package-private */
public class LifecycleMonitor$2 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f30727a;

    static {
        Covode.recordClassIndex(17867);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_START) {
            onStarted();
        } else if (aVar == i.a.ON_STOP) {
            onStopped();
        }
    }

    @v(a = i.a.ON_START)
    public void onStarted() {
        g.b().removeCallbacks(this.f30727a.f30956i);
        this.f30727a.f30951d.set(true);
        this.f30727a.f30955h.set(false);
        this.f30727a.f30951d.get();
        f.a("Helios-Log-Page-State", "EnterForeground");
        this.f30727a.a(null, 7);
    }

    @v(a = i.a.ON_STOP)
    public void onStopped() {
        this.f30727a.f30951d.set(false);
        g.b().postDelayed(this.f30727a.f30956i, HeliosEnvImpl.INSTANCE.getBackgroundFreezeDuration());
        this.f30727a.f30951d.get();
        f.a("Helios-Log-Page-State", "EnterBackground");
        f fVar = this.f30727a;
        fVar.f30953f = fVar.f30952e;
        f fVar2 = this.f30727a;
        fVar2.f30957j = fVar2.f30954g;
        this.f30727a.f30952e = "null";
        this.f30727a.f30954g = 0;
        this.f30727a.a(null, 6);
    }

    LifecycleMonitor$2(f fVar) {
        this.f30727a = fVar;
    }
}
