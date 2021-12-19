package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.kx;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class dz extends fy {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReference<String[]> f51447a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReference<String[]> f51448b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReference<String[]> f51449c = new AtomicReference<>();

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.fy
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ j k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ e l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ dz n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ jz o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ ex p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ eb q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ em r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ km s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ kl t() {
        return super.t();
    }

    static {
        Covode.recordClassIndex(32193);
    }

    private final boolean f() {
        t();
        if (!TextUtils.isEmpty(this.z.f51596a) || !this.z.q().a(3)) {
            return false;
        }
        return true;
    }

    dz(ff ffVar) {
        super(ffVar);
    }

    /* access modifiers changed from: protected */
    public final String a(String str) {
        if (str == null) {
            return null;
        }
        if (!f()) {
            return str;
        }
        return a(str, ge.f51670b, ge.f51669a, f51447a);
    }

    /* access modifiers changed from: protected */
    public final String b(String str) {
        if (str == null) {
            return null;
        }
        if (!f()) {
            return str;
        }
        return a(str, gd.f51666b, gd.f51665a, f51448b);
    }

    /* access modifiers changed from: protected */
    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!f()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return a(str, gg.f51673b, gg.f51672a, f51449c);
        }
        return "experiment_id" + "(" + str + ")";
    }

    private final String a(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = a((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(valueOf);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String a(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!f()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(b(str));
            sb.append("=");
            kx.b();
            if (s().d(null, p.aE)) {
                Object a2 = a(bundle, str);
                if (a2 instanceof Bundle) {
                    valueOf = a(new Object[]{a2});
                } else if (a2 instanceof Object[]) {
                    valueOf = a((Object[]) a2);
                } else if (a2 instanceof ArrayList) {
                    valueOf = a(((ArrayList) a2).toArray());
                } else {
                    valueOf = String.valueOf(a2);
                }
                sb.append(valueOf);
            } else {
                sb.append(a(bundle, str));
            }
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String a(zzao zzao) {
        String str = null;
        if (zzao == null) {
            return null;
        }
        if (!f()) {
            return zzao.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzao.f52063c);
        sb.append(",name=");
        sb.append(a(zzao.f52061a));
        sb.append(",params=");
        zzan zzan = zzao.f52062b;
        if (zzan != null) {
            if (!f()) {
                str = zzan.toString();
            } else {
                str = a(zzan.a());
            }
        }
        sb.append(str);
        return sb.toString();
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    private static String a(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        boolean z;
        String str2;
        MethodCollector.i(7173);
        r.a(strArr);
        r.a(strArr2);
        r.a(atomicReference);
        if (strArr.length == strArr2.length) {
            z = true;
        } else {
            z = false;
        }
        r.b(z);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (jz.c(str, strArr[i2])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i2] == null) {
                            strArr3[i2] = strArr2[i2] + "(" + strArr[i2] + ")";
                        }
                        str2 = strArr3[i2];
                    } finally {
                        MethodCollector.o(7173);
                    }
                }
                return str2;
            }
        }
        MethodCollector.o(7173);
        return str;
    }
}
