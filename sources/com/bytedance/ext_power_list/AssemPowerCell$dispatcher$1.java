package com.bytedance.ext_power_list;

import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.b.x;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import h.f.b.l;

final class AssemPowerCell$dispatcher$1 implements k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AssemPowerCell f28665a;

    static {
        Covode.recordClassIndex(16866);
    }

    AssemPowerCell$dispatcher$1(AssemPowerCell assemPowerCell) {
        this.f28665a = assemPowerCell;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.c(mVar, "");
        l.c(aVar, "");
        switch (c.f28672a[aVar.ordinal()]) {
            case 1:
                x d2 = this.f28665a.d();
                if (d2.f25546d.a().compareTo((Enum) i.b.CREATED) < 0) {
                    d2.f();
                } else {
                    if (d2.f25546d.a().compareTo((Enum) i.b.STARTED) > 0) {
                        d2.l();
                    }
                    if (d2.f25546d.a().compareTo((Enum) i.b.CREATED) > 0) {
                        d2.n();
                    }
                }
                d2.f25546d.a(i.a.ON_CREATE);
                return;
            case 2:
                x d3 = this.f28665a.d();
                if (d3.f25546d.a().compareTo((Enum) i.b.STARTED) < 0) {
                    if (d3.f25546d.a().compareTo((Enum) i.b.CREATED) < 0) {
                        d3.f();
                    }
                    d3.bO_();
                } else if (d3.f25546d.a().compareTo((Enum) i.b.STARTED) > 0) {
                    d3.l();
                }
                d3.f25546d.a(i.a.ON_START);
                return;
            case 3:
                x d4 = this.f28665a.d();
                if (d4.f25546d.a().compareTo((Enum) i.b.RESUMED) < 0) {
                    if (d4.f25546d.a().compareTo((Enum) i.b.CREATED) < 0) {
                        d4.f();
                    }
                    if (d4.f25546d.a().compareTo((Enum) i.b.STARTED) < 0) {
                        d4.bO_();
                    }
                    d4.j();
                }
                d4.f25546d.a(i.a.ON_RESUME);
                return;
            case 4:
                x d5 = this.f28665a.d();
                d5.f25546d.a(i.a.ON_PAUSE);
                d5.l();
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                x d6 = this.f28665a.d();
                d6.f25546d.a(i.a.ON_STOP);
                d6.n();
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                x d7 = this.f28665a.d();
                d7.f25546d.a(i.a.ON_DESTROY);
                d7.p();
                return;
            default:
                return;
        }
    }
}
