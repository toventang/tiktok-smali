package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.ay;
import com.google.android.gms.internal.measurement.gm;
import com.google.android.gms.internal.measurement.mp;
import com.google.android.gms.internal.measurement.mq;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
public final class hl extends jp {
    static {
        Covode.recordClassIndex(32287);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.jp
    public final boolean d() {
        return false;
    }

    private static String e() {
        throw new SecurityException("This implementation should not be used.");
    }

    public hl(jo joVar) {
        super(joVar);
    }

    public final byte[] a(zzao zzao, String str) {
        jw jwVar;
        Bundle a2;
        l lVar;
        long j2;
        c();
        ff.u();
        r.a(zzao);
        r.a(str);
        if (!s().d(str, p.Y)) {
            q().f51475j.a("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        } else if ("_iap".equals(zzao.f52061a) || "_iapx".equals(zzao.f52061a)) {
            ay.f.a a3 = ay.f.a();
            J_().e();
            try {
                ec b2 = J_().b(str);
                if (b2 == null) {
                    q().f51475j.a("Log and bundle not available. package_name", str);
                    return new byte[0];
                } else if (!b2.q()) {
                    q().f51475j.a("Log and bundle disabled. package_name", str);
                    byte[] bArr = new byte[0];
                    J_().g();
                    return bArr;
                } else {
                    ay.g.a a4 = ay.g.c().a().a("android");
                    if (!TextUtils.isEmpty(b2.b())) {
                        a4.f(b2.b());
                    }
                    if (!TextUtils.isEmpty(b2.m())) {
                        a4.e(b2.m());
                    }
                    if (!TextUtils.isEmpty(b2.k())) {
                        a4.g(b2.k());
                    }
                    if (b2.l() != -2147483648L) {
                        a4.g((int) b2.l());
                    }
                    a4.f(b2.n()).j(b2.p());
                    mp.b();
                    if (s().d(b2.b(), p.ao)) {
                        if (!TextUtils.isEmpty(b2.d())) {
                            a4.k(b2.d());
                        } else if (!TextUtils.isEmpty(b2.f())) {
                            a4.o(b2.f());
                        } else if (!TextUtils.isEmpty(b2.e())) {
                            a4.n(b2.e());
                        }
                    } else if (!TextUtils.isEmpty(b2.d())) {
                        a4.k(b2.d());
                    } else if (!TextUtils.isEmpty(b2.e())) {
                        a4.n(b2.e());
                    }
                    a4.g(b2.o());
                    if (this.z.r() && s().f(a4.k())) {
                        a4.k();
                        if (!TextUtils.isEmpty(null)) {
                            a4.p();
                        }
                    }
                    Pair<String, Boolean> a5 = r().a(b2.b());
                    if (b2.x() && !TextUtils.isEmpty((CharSequence) a5.first)) {
                        try {
                            Object obj = a5.first;
                            Long.toString(zzao.f52064d);
                            a4.h(e());
                            if (a5.second != null) {
                                a4.a(((Boolean) a5.second).booleanValue());
                            }
                        } catch (SecurityException e2) {
                            q().f51475j.a("Resettable device id encryption failed", e2.getMessage());
                            byte[] bArr2 = new byte[0];
                            J_().g();
                            return bArr2;
                        }
                    }
                    k().x();
                    ay.g.a c2 = a4.c(Build.MODEL);
                    k().x();
                    c2.b(Build.VERSION.RELEASE).e((int) k().e()).d(k().f());
                    try {
                        b2.c();
                        Long.toString(zzao.f52064d);
                        a4.i(e());
                        if (!TextUtils.isEmpty(b2.h())) {
                            a4.l(b2.h());
                        }
                        String b3 = b2.b();
                        List<jw> a6 = J_().a(b3);
                        Iterator<jw> it = a6.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                jwVar = null;
                                break;
                            }
                            jwVar = it.next();
                            if ("_lte".equals(jwVar.f51967c)) {
                                break;
                            }
                        }
                        if (jwVar == null || jwVar.f51969e == null) {
                            jw jwVar2 = new jw(b3, "auto", "_lte", l().a(), 0L);
                            a6.add(jwVar2);
                            J_().a(jwVar2);
                        }
                        jv L_ = L_();
                        L_.q().f51476k.a("Checking account type status for ad personalization signals");
                        if (L_.k().h()) {
                            String b4 = b2.b();
                            if (b2.x() && L_.I_().e(b4)) {
                                L_.q().f51475j.a("Turning off ad personalization due to account type");
                                Iterator<jw> it2 = a6.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(it2.next().f51967c)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                a6.add(new jw(b4, "auto", "_npa", L_.l().a(), 1L));
                            }
                        }
                        ay.k[] kVarArr = new ay.k[a6.size()];
                        for (int i2 = 0; i2 < a6.size(); i2++) {
                            ay.k.a a7 = ay.k.d().a(a6.get(i2).f51967c).a(a6.get(i2).f51968d);
                            L_().a(a7, a6.get(i2).f51969e);
                            kVarArr[i2] = (ay.k) ((gm) a7.w());
                        }
                        a4.b(Arrays.asList(kVarArr));
                        mq.b();
                        if (!s().d(null, p.aO) || !s().d(null, p.aP)) {
                            a2 = zzao.f52062b.a();
                        } else {
                            eg a8 = eg.a(zzao);
                            o().a(a8.f51498b, J_().i(str));
                            o().a(a8, s().a(str));
                            a2 = a8.f51498b;
                        }
                        a2.putLong("_c", 1);
                        q().f51475j.a("Marking in-app purchase as real-time");
                        a2.putLong("_r", 1);
                        a2.putString("_o", zzao.f52063c);
                        if (o().f(a4.k())) {
                            o().a(a2, "_dbg", (Object) 1L);
                            o().a(a2, "_r", (Object) 1L);
                        }
                        l a9 = J_().a(str, zzao.f52061a);
                        if (a9 == null) {
                            lVar = new l(str, zzao.f52061a, zzao.f52064d);
                            j2 = 0;
                        } else {
                            j2 = a9.f52022f;
                            lVar = a9.a(zzao.f52064d);
                        }
                        J_().a(lVar);
                        m mVar = new m(this.z, zzao.f52063c, str, zzao.f52061a, zzao.f52064d, j2, a2);
                        ay.c.a b5 = ay.c.c().a(mVar.f52030c).a(mVar.f52029b).b(mVar.f52031d);
                        Iterator<String> it3 = mVar.f52032e.iterator();
                        while (it3.hasNext()) {
                            String next = it3.next();
                            ay.e.a a10 = ay.e.e().a(next);
                            L_().a(a10, mVar.f52032e.a(next));
                            b5.a(a10);
                        }
                        a4.a(b5).a(ay.h.a().a(ay.d.a().a(lVar.f52019c).a(zzao.f52061a)));
                        a4.c(K_().a(b2.b(), Collections.emptyList(), a4.e(), Long.valueOf(b5.f()), Long.valueOf(b5.f())));
                        if (b5.e()) {
                            a4.b(b5.f()).c(b5.f());
                        }
                        long j3 = b2.j();
                        if (j3 != 0) {
                            a4.e(j3);
                        }
                        long i3 = b2.i();
                        if (i3 != 0) {
                            a4.d(i3);
                        } else if (j3 != 0) {
                            a4.d(j3);
                        }
                        b2.u();
                        ay.g.a f2 = a4.f((int) b2.r());
                        s();
                        f2.l().a(l().a()).b(Boolean.TRUE.booleanValue());
                        a3.a(a4);
                        b2.a(a4.g());
                        b2.b(a4.h());
                        J_().a(b2);
                        J_().f();
                        J_().g();
                        try {
                            return L_().c(((gm) a3.w()).h());
                        } catch (IOException e3) {
                            q().f51468c.a("Data loss. Failed to bundle and serialize. appId", eb.a(str), e3);
                            return null;
                        }
                    } catch (SecurityException e4) {
                        q().f51475j.a("app instance id encryption failed", e4.getMessage());
                        byte[] bArr3 = new byte[0];
                        J_().g();
                        return bArr3;
                    }
                }
            } finally {
                J_().g();
            }
        } else {
            q().f51475j.a("Generating a payload for this event is not available. package_name, event_name", str, zzao.f52061a);
            return null;
        }
    }
}
