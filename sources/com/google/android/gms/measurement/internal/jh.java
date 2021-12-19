package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class jh implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final je f51927a;

    static {
        Covode.recordClassIndex(32337);
    }

    jh(je jeVar) {
        this.f51927a = jeVar;
    }

    public final void run() {
        je jeVar = this.f51927a;
        jf jfVar = jeVar.f51920c;
        long j2 = jeVar.f51918a;
        long j3 = jeVar.f51919b;
        jfVar.f51922b.c();
        jfVar.f51922b.q().f51475j.a("Application going to the background");
        boolean z = true;
        if (jfVar.f51922b.s().d(null, p.aD)) {
            jfVar.f51922b.r().s.a(true);
        }
        Bundle bundle = new Bundle();
        if (!jfVar.f51922b.s().h().booleanValue()) {
            jfVar.f51922b.f51904c.f51925c.c();
            if (jfVar.f51922b.s().d(null, p.as)) {
                bundle.putLong("_et", jfVar.f51922b.a(j3));
                hq.a(jfVar.f51922b.h().a(true), bundle, true);
            } else {
                z = false;
            }
            jfVar.f51922b.a(false, z, j3);
        }
        jfVar.f51922b.e().a("auto", "_ab", j2, bundle);
    }
}
