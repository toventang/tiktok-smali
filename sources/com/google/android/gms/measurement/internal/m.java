package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;
import java.util.Iterator;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    final String f52028a;

    /* renamed from: b  reason: collision with root package name */
    final String f52029b;

    /* renamed from: c  reason: collision with root package name */
    final long f52030c;

    /* renamed from: d  reason: collision with root package name */
    final long f52031d;

    /* renamed from: e  reason: collision with root package name */
    final zzan f52032e;

    /* renamed from: f  reason: collision with root package name */
    private final String f52033f;

    static {
        Covode.recordClassIndex(32373);
    }

    public final String toString() {
        String str = this.f52028a;
        String str2 = this.f52029b;
        String valueOf = String.valueOf(this.f52032e);
        return new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length()).append("Event{appId='").append(str).append("', name='").append(str2).append("', params=").append(valueOf).append('}').toString();
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final m a(ff ffVar, long j2) {
        return new m(ffVar, this.f52033f, this.f52028a, this.f52029b, this.f52030c, j2, this.f52032e);
    }

    private m(ff ffVar, String str, String str2, String str3, long j2, long j3, zzan zzan) {
        r.a(str2);
        r.a(str3);
        r.a(zzan);
        this.f52028a = str2;
        this.f52029b = str3;
        this.f52033f = TextUtils.isEmpty(str) ? null : str;
        this.f52030c = j2;
        this.f52031d = j3;
        if (j3 != 0 && j3 > j2) {
            ffVar.q().f51471f.a("Event created with reverse previous/current timestamps. appId, name", eb.a(str2), eb.a(str3));
        }
        this.f52032e = zzan;
    }

    m(ff ffVar, String str, String str2, String str3, long j2, long j3, Bundle bundle) {
        zzan zzan;
        r.a(str2);
        r.a(str3);
        this.f52028a = str2;
        this.f52029b = str3;
        this.f52033f = TextUtils.isEmpty(str) ? null : str;
        this.f52030c = j2;
        this.f52031d = j3;
        if (j3 != 0 && j3 > j2) {
            ffVar.q().f51471f.a("Event created with reverse previous/current timestamps. appId", eb.a(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzan = new zzan(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    ffVar.q().f51468c.a("Param name can't be null");
                    it.remove();
                } else {
                    Object a2 = ffVar.e().a(next, a(bundle2, next));
                    if (a2 == null) {
                        ffVar.q().f51471f.a("Param value can't be null", ffVar.f().b(next));
                        it.remove();
                    } else {
                        ffVar.e().a(bundle2, next, a2);
                    }
                }
            }
            zzan = new zzan(bundle2);
        }
        this.f52032e = zzan;
    }
}
