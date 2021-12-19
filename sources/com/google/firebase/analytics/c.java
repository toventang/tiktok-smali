package com.google.firebase.analytics;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.ab;
import com.google.android.gms.internal.measurement.ac;
import com.google.android.gms.internal.measurement.f;
import com.google.android.gms.internal.measurement.h;
import com.google.android.gms.internal.measurement.j;
import com.google.android.gms.internal.measurement.k;
import com.google.android.gms.internal.measurement.oy;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.t;
import com.google.android.gms.internal.measurement.u;
import com.google.android.gms.internal.measurement.w;
import com.google.android.gms.internal.measurement.x;
import com.google.android.gms.internal.measurement.y;
import com.google.android.gms.measurement.internal.hi;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class c implements hi {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ f f54267a;

    static {
        Covode.recordClassIndex(33693);
    }

    @Override // com.google.android.gms.measurement.internal.hi
    public final long e() {
        return this.f54267a.a();
    }

    @Override // com.google.android.gms.measurement.internal.hi
    public final String a() {
        f fVar = this.f54267a;
        oy oyVar = new oy();
        fVar.a(new y(fVar, oyVar));
        return oyVar.a(500);
    }

    @Override // com.google.android.gms.measurement.internal.hi
    public final String b() {
        f fVar = this.f54267a;
        oy oyVar = new oy();
        fVar.a(new x(fVar, oyVar));
        return oyVar.a(500);
    }

    @Override // com.google.android.gms.measurement.internal.hi
    public final String c() {
        f fVar = this.f54267a;
        oy oyVar = new oy();
        fVar.a(new w(fVar, oyVar));
        return oyVar.a(50);
    }

    @Override // com.google.android.gms.measurement.internal.hi
    public final String d() {
        f fVar = this.f54267a;
        oy oyVar = new oy();
        fVar.a(new t(fVar, oyVar));
        return oyVar.a(500);
    }

    c(f fVar) {
        this.f54267a = fVar;
    }

    @Override // com.google.android.gms.measurement.internal.hi
    public final void a(Bundle bundle) {
        f fVar = this.f54267a;
        fVar.a(new h(fVar, bundle));
    }

    @Override // com.google.android.gms.measurement.internal.hi
    public final void b(String str) {
        f fVar = this.f54267a;
        fVar.a(new u(fVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.hi
    public final int c(String str) {
        f fVar = this.f54267a;
        oy oyVar = new oy();
        fVar.a(new ac(fVar, str, oyVar));
        Integer num = (Integer) oy.a(oyVar.b(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.hi
    public final void a(String str) {
        f fVar = this.f54267a;
        fVar.a(new s(fVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.hi
    public final List<Bundle> a(String str, String str2) {
        f fVar = this.f54267a;
        oy oyVar = new oy();
        fVar.a(new j(fVar, str, str2, oyVar));
        List<Bundle> list = (List) oy.a(oyVar.b(5000), List.class);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    @Override // com.google.android.gms.measurement.internal.hi
    public final void a(String str, String str2, Bundle bundle) {
        this.f54267a.a(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.hi
    public final void b(String str, String str2, Bundle bundle) {
        f fVar = this.f54267a;
        fVar.a(new k(fVar, str, str2, bundle));
    }

    @Override // com.google.android.gms.measurement.internal.hi
    public final Map<String, Object> a(String str, String str2, boolean z) {
        f fVar = this.f54267a;
        oy oyVar = new oy();
        fVar.a(new ab(fVar, str, str2, z, oyVar));
        Bundle b2 = oyVar.b(5000);
        if (b2 == null || b2.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(b2.size());
        for (String str3 : b2.keySet()) {
            Object a2 = f.a(b2, str3);
            if ((a2 instanceof Double) || (a2 instanceof Long) || (a2 instanceof String)) {
                hashMap.put(str3, a2);
            }
        }
        return hashMap;
    }
}
