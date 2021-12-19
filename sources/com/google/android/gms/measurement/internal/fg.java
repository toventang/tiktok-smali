package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.n;
import com.google.android.gms.internal.measurement.mq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class fg extends ds {

    /* renamed from: a  reason: collision with root package name */
    final jo f51608a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f51609b;

    /* renamed from: c  reason: collision with root package name */
    private String f51610c;

    static {
        Covode.recordClassIndex(32228);
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final void a(zzao zzao, zzn zzn) {
        r.a(zzao);
        e(zzn);
        a(new fr(this, zzao, zzn));
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final void a(zzao zzao, String str, String str2) {
        r.a(zzao);
        r.a(str);
        a(str, true);
        a(new fq(this, zzao, str));
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final byte[] a(zzao zzao, String str) {
        r.a(str);
        r.a(zzao);
        a(str, true);
        this.f51608a.q().f51475j.a("Log and bundle. event", this.f51608a.f51940b.f().a(zzao.f52061a));
        long c2 = this.f51608a.l().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f51608a.p().b(new ft(this, zzao, str)).get();
            if (bArr == null) {
                this.f51608a.q().f51468c.a("Log and bundle returned null. appId", eb.a(str));
                bArr = new byte[0];
            }
            this.f51608a.q().f51475j.a("Log and bundle processed. event, size, time_ms", this.f51608a.f51940b.f().a(zzao.f52061a), Integer.valueOf(bArr.length), Long.valueOf((this.f51608a.l().c() / 1000000) - c2));
            return bArr;
        } catch (InterruptedException | ExecutionException e2) {
            this.f51608a.q().f51468c.a("Failed to log and bundle. appId, event, error", eb.a(str), this.f51608a.f51940b.f().a(zzao.f52061a), e2);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final void a(zzkr zzkr, zzn zzn) {
        r.a(zzkr);
        e(zzn);
        a(new fs(this, zzkr, zzn));
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final void a(zzn zzn) {
        e(zzn);
        a(new fu(this, zzn));
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final void a(Bundle bundle, zzn zzn) {
        mq.b();
        if (this.f51608a.f51940b.f51600e.d(null, p.aO)) {
            e(zzn);
            a(new fj(this, zzn, bundle));
        }
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final void a(zzw zzw, zzn zzn) {
        r.a(zzw);
        r.a(zzw.f52088c);
        e(zzn);
        zzw zzw2 = new zzw(zzw);
        zzw2.f52086a = zzn.f52073a;
        a(new fw(this, zzw2, zzn));
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final void a(zzw zzw) {
        r.a(zzw);
        r.a(zzw.f52088c);
        a(zzw.f52086a, true);
        a(new fl(this, new zzw(zzw)));
    }

    public fg(jo joVar) {
        this(joVar, (byte) 0);
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final void b(zzn zzn) {
        e(zzn);
        a(new fi(this, zzn));
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final String c(zzn zzn) {
        e(zzn);
        return this.f51608a.d(zzn);
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final void d(zzn zzn) {
        a(zzn.f52073a, false);
        a(new fo(this, zzn));
    }

    private final void a(Runnable runnable) {
        r.a(runnable);
        if (this.f51608a.p().f()) {
            runnable.run();
        } else {
            this.f51608a.p().a(runnable);
        }
    }

    private final void e(zzn zzn) {
        r.a(zzn);
        a(zzn.f52073a, false);
        this.f51608a.f51940b.e().a(zzn.f52074b, zzn.r, zzn.v);
    }

    private fg(jo joVar, byte b2) {
        r.a(joVar);
        this.f51608a = joVar;
        this.f51610c = null;
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final List<zzkr> a(zzn zzn, boolean z) {
        e(zzn);
        try {
            List<jw> list = (List) this.f51608a.p().a(new fv(this, zzn)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (jw jwVar : list) {
                if (z || !jz.e(jwVar.f51967c)) {
                    arrayList.add(new zzkr(jwVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f51608a.q().f51468c.a("Failed to get user properties. appId", eb.a(zzn.f52073a), e2);
            return null;
        }
    }

    private final void a(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f51609b == null) {
                        if (!"com.google.android.gms".equals(this.f51610c) && !n.a(this.f51608a.m(), Binder.getCallingUid())) {
                            if (!h.a(this.f51608a.m()).a(Binder.getCallingUid())) {
                                z2 = false;
                                this.f51609b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f51609b = Boolean.valueOf(z2);
                    }
                    if (this.f51609b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e2) {
                    this.f51608a.q().f51468c.a("Measurement Service called with invalid calling package. appId", eb.a(str));
                    throw e2;
                }
            }
            if (this.f51610c == null && n.a(this.f51608a.m(), Binder.getCallingUid(), str)) {
                this.f51610c = str;
            }
            if (!str.equals(this.f51610c)) {
                throw new SecurityException(a.a("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f51608a.q().f51468c.a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final List<zzw> a(String str, String str2, zzn zzn) {
        e(zzn);
        try {
            return (List) this.f51608a.p().a(new fm(this, zzn, str, str2)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.f51608a.q().f51468c.a("Failed to get conditional user properties", e2);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final List<zzw> a(String str, String str2, String str3) {
        a(str, true);
        try {
            return (List) this.f51608a.p().a(new fp(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.f51608a.q().f51468c.a("Failed to get conditional user properties as", e2);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final void a(long j2, String str, String str2, String str3) {
        a(new fx(this, str2, str3, str, j2));
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final List<zzkr> a(String str, String str2, String str3, boolean z) {
        a(str, true);
        try {
            List<jw> list = (List) this.f51608a.p().a(new fn(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (jw jwVar : list) {
                if (z || !jz.e(jwVar.f51967c)) {
                    arrayList.add(new zzkr(jwVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f51608a.q().f51468c.a("Failed to get user properties as. appId", eb.a(str), e2);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final List<zzkr> a(String str, String str2, boolean z, zzn zzn) {
        e(zzn);
        try {
            List<jw> list = (List) this.f51608a.p().a(new fk(this, zzn, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (jw jwVar : list) {
                if (z || !jz.e(jwVar.f51967c)) {
                    arrayList.add(new zzkr(jwVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f51608a.q().f51468c.a("Failed to query user properties. appId", eb.a(zzn.f52073a), e2);
            return Collections.emptyList();
        }
    }
}
