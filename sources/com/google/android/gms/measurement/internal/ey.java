package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.c.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.aw;
import com.google.android.gms.internal.measurement.gm;
import com.google.android.gms.internal.measurement.gu;
import com.google.android.gms.internal.measurement.kx;
import java.util.ArrayList;
import java.util.Map;

public final class ey extends jp implements b {

    /* renamed from: a  reason: collision with root package name */
    private static int f51574a = 65535;

    /* renamed from: b  reason: collision with root package name */
    private static int f51575b = 2;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Map<String, String>> f51576c = new a();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f51577d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f51578e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, aw.b> f51579f = new a();

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, Map<String, Integer>> f51580g = new a();

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, String> f51581h = new a();

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.jp
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

    @Override // com.google.android.gms.measurement.internal.jm
    public final /* bridge */ /* synthetic */ ey I_() {
        return super.I_();
    }

    @Override // com.google.android.gms.measurement.internal.jm
    public final /* bridge */ /* synthetic */ e J_() {
        return super.J_();
    }

    @Override // com.google.android.gms.measurement.internal.jm
    public final /* bridge */ /* synthetic */ kd K_() {
        return super.K_();
    }

    @Override // com.google.android.gms.measurement.internal.jm
    public final /* bridge */ /* synthetic */ jv L_() {
        return super.L_();
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
        Covode.recordClassIndex(32219);
    }

    /* access modifiers changed from: protected */
    public final String b(String str) {
        c();
        return this.f51581h.get(str);
    }

    /* access modifiers changed from: protected */
    public final void c(String str) {
        c();
        this.f51581h.put(str, null);
    }

    /* access modifiers changed from: package-private */
    public final void d(String str) {
        c();
        this.f51579f.remove(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean e(String str) {
        c();
        aw.b a2 = a(str);
        if (a2 == null) {
            return false;
        }
        return a2.zzk;
    }

    /* access modifiers changed from: package-private */
    public final boolean g(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    public final boolean h(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_public"));
    }

    /* access modifiers changed from: protected */
    public final aw.b a(String str) {
        B();
        c();
        r.a(str);
        i(str);
        return this.f51579f.get(str);
    }

    ey(jo joVar) {
        super(joVar);
    }

    private static Map<String, String> a(aw.b bVar) {
        a aVar = new a();
        if (bVar != null) {
            for (aw.c cVar : bVar.zzg) {
                aVar.put(cVar.zzd, cVar.zze);
            }
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public final long f(String str) {
        String a2 = a(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(a2)) {
            return 0;
        }
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException e2) {
            q().f51471f.a("Unable to parse timezone offset. appId", eb.a(str), e2);
            return 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.aw$b> */
    /* JADX WARN: Multi-variable type inference failed */
    private final void i(String str) {
        B();
        c();
        r.a(str);
        if (this.f51579f.get(str) == null) {
            byte[] d2 = J_().d(str);
            if (d2 == null) {
                this.f51576c.put(str, null);
                this.f51577d.put(str, null);
                this.f51578e.put(str, null);
                this.f51579f.put(str, null);
                this.f51581h.put(str, null);
                this.f51580g.put(str, null);
                return;
            }
            aw.b.a aVar = (aw.b.a) a(str, d2).l();
            a(str, aVar);
            this.f51576c.put(str, a((aw.b) ((gm) aVar.w())));
            this.f51579f.put(str, (gm) aVar.w());
            this.f51581h.put(str, null);
        }
    }

    /* access modifiers changed from: package-private */
    public final int d(String str, String str2) {
        Integer num;
        c();
        i(str);
        Map<String, Integer> map = this.f51580g.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    public final boolean b(String str, String str2) {
        Boolean bool;
        c();
        i(str);
        if (g(str) && jz.e(str2)) {
            return true;
        }
        if (h(str) && jz.a(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f51577d.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private final aw.b a(String str, byte[] bArr) {
        Long l2;
        if (bArr == null) {
            return aw.b.zzl;
        }
        try {
            aw.b bVar = (aw.b) ((gm) ((aw.b.a) jv.a(aw.b.b(), bArr)).w());
            ee eeVar = q().f51476k;
            String str2 = null;
            if (bVar.a()) {
                l2 = Long.valueOf(bVar.zzd);
            } else {
                l2 = null;
            }
            if ((bVar.zzc & 2) != 0) {
                str2 = bVar.zze;
            }
            eeVar.a("Parsed config. version, gmp_app_id", l2, str2);
            return bVar;
        } catch (gu e2) {
            q().f51471f.a("Unable to merge remote config. appId", eb.a(str), e2);
            return aw.b.zzl;
        } catch (RuntimeException e3) {
            q().f51471f.a("Unable to merge remote config. appId", eb.a(str), e3);
            return aw.b.zzl;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean c(String str, String str2) {
        Boolean bool;
        c();
        i(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        kx.b();
        if (s().d(null, p.aJ) && ("purchase".equals(str2) || "refund".equals(str2))) {
            return true;
        }
        Map<String, Boolean> map = this.f51578e.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private final void a(String str, aw.b.a aVar) {
        a aVar2 = new a();
        a aVar3 = new a();
        a aVar4 = new a();
        if (aVar != null) {
            for (int i2 = 0; i2 < aVar.a(); i2++) {
                aw.a.C1216a aVar5 = (aw.a.C1216a) aVar.a(i2).l();
                if (TextUtils.isEmpty(aVar5.a())) {
                    q().f51471f.a("EventConfig contained null event name");
                } else {
                    String a2 = ge.a(aVar5.a());
                    if (!TextUtils.isEmpty(a2)) {
                        aVar5 = aVar5.a(a2);
                        aVar.a(i2, aVar5);
                    }
                    aVar2.put(aVar5.a(), Boolean.valueOf(aVar5.b()));
                    aVar3.put(aVar5.a(), Boolean.valueOf(aVar5.c()));
                    if (aVar5.d()) {
                        if (aVar5.e() < f51575b || aVar5.e() > f51574a) {
                            q().f51471f.a("Invalid sampling rate. Event name, sample rate", aVar5.a(), Integer.valueOf(aVar5.e()));
                        } else {
                            aVar4.put(aVar5.a(), Integer.valueOf(aVar5.e()));
                        }
                    }
                }
            }
        }
        this.f51577d.put(str, aVar2);
        this.f51578e.put(str, aVar3);
        this.f51580g.put(str, aVar4);
    }

    @Override // com.google.android.gms.measurement.internal.b
    public final String a(String str, String str2) {
        c();
        i(str);
        Map<String, String> map = this.f51576c.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.aw$b> */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.aw$b> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    public final boolean a(String str, byte[] bArr, String str2) {
        MethodCollector.i(5672);
        B();
        c();
        r.a(str);
        aw.b.a aVar = (aw.b.a) a(str, bArr).l();
        if (aVar == null) {
            MethodCollector.o(5672);
            return false;
        }
        a(str, aVar);
        this.f51579f.put(str, (gm) aVar.w());
        this.f51581h.put(str, str2);
        this.f51576c.put(str, a((aw.b) ((gm) aVar.w())));
        J_().a(str, new ArrayList(aVar.b()));
        try {
            aVar.c();
            bArr = ((aw.b) ((gm) aVar.w())).h();
        } catch (RuntimeException e2) {
            q().f51471f.a("Unable to serialize reduced-size config. Storing full config instead. appId", eb.a(str), e2);
        }
        e J_ = J_();
        r.a(str);
        J_.c();
        J_.B();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        try {
            if (((long) J_.h().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                J_.q().f51468c.a("Failed to update remote config (got 0). appId", eb.a(str));
            }
        } catch (SQLiteException e3) {
            J_.q().f51468c.a("Error storing remote config. appId", eb.a(str), e3);
        }
        this.f51579f.put(str, (gm) aVar.w());
        MethodCollector.o(5672);
        return true;
    }
}
