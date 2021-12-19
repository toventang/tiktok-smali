package com.ss.android.ugc.asve.recorder;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.b;
import com.ss.android.ugc.asve.b.g;
import com.ss.android.ugc.asve.b.i;
import com.ss.android.ugc.asve.context.h;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.at;
import h.f.b.l;
import h.n;
import h.p;

public final class k {
    static {
        Covode.recordClassIndex(38286);
    }

    public static final VEAudioEncodeSettings a() {
        VEAudioEncodeSettings a2 = new VEAudioEncodeSettings.a().a();
        l.b(a2, "");
        return a2;
    }

    public static final VEVideoEncodeSettings a(h hVar) {
        VEVideoEncodeSettings.ENCODE_PROFILE encode_profile;
        l.d(hVar, "");
        VEVideoEncodeSettings.a aVar = new VEVideoEncodeSettings.a(1);
        String c2 = hVar.l().c();
        String b2 = hVar.l().b();
        if (c2.length() > 0) {
            b2.length();
        }
        aVar.c(hVar.n().c());
        p<Integer, Integer> f2 = hVar.f();
        aVar.b((int) (hVar.n().b() * 1024.0f * 1024.0f));
        g e2 = hVar.n().e();
        l.d(e2, "");
        int i2 = i.f61936a[e2.ordinal()];
        if (i2 == 1) {
            encode_profile = VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN;
        } else if (i2 == 2) {
            encode_profile = VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE;
        } else if (i2 == 3) {
            encode_profile = VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_MAIN;
        } else if (i2 == 4) {
            encode_profile = VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_HIGH;
        } else {
            throw new n();
        }
        aVar.a(encode_profile);
        aVar.d(hVar.n().d());
        int intValue = f2.getFirst().intValue();
        int intValue2 = f2.getSecond().intValue();
        b.f61927a.d("setVideoRes:  width = " + intValue + "  height = " + intValue2 + ' ');
        aVar.a(intValue, intValue2);
        aVar.d(hVar.n().f());
        aVar.b(hVar.n().g());
        aVar.e(hVar.A());
        VEVideoEncodeSettings d2 = aVar.d();
        l.b(d2, "");
        return d2;
    }

    public static final at b(h hVar) {
        VEDisplaySettings l2;
        l.d(hVar, "");
        at.a aVar = new at.a();
        aVar.a(hVar.q());
        boolean z = true;
        aVar.c(true);
        if (!hVar.r() || hVar.s() == 0) {
            aVar.d(true);
        } else {
            aVar.b();
            aVar.d(false);
            hVar.s();
            aVar.a(hVar.s());
        }
        aVar.a();
        aVar.b(hVar.i());
        int[] j2 = hVar.o().j();
        if (j2.length == 2) {
            aVar.a(new VESize(j2[0], j2[1]));
        }
        if (hVar.t() && (l2 = hVar.o().l()) != null) {
            aVar.a(l2);
        }
        aVar.e(hVar.p());
        aVar.c(!hVar.l().f());
        aVar.d();
        if (hVar.k().invoke().booleanValue()) {
            aVar.c();
            aVar.e();
            aVar.f();
        }
        if (hVar.u() <= 0) {
            z = false;
        }
        aVar.f(z);
        if (hVar.z()) {
            aVar.a(at.c.QR_CODE_GRAPH);
        }
        at atVar = aVar.f150958a;
        l.b(atVar, "");
        return atVar;
    }
}
