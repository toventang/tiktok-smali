package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class kd extends jp {

    /* renamed from: a  reason: collision with root package name */
    private String f51984a;

    /* renamed from: b  reason: collision with root package name */
    private Set<Integer> f51985b;

    /* renamed from: c  reason: collision with root package name */
    private Map<Integer, kf> f51986c;

    /* renamed from: d  reason: collision with root package name */
    private Long f51987d;

    /* renamed from: e  reason: collision with root package name */
    private Long f51988e;

    static {
        Covode.recordClassIndex(32361);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.jp
    public final boolean d() {
        return false;
    }

    kd(jo joVar) {
        super(joVar);
    }

    private final kf a(int i2) {
        if (this.f51986c.containsKey(Integer.valueOf(i2))) {
            return this.f51986c.get(Integer.valueOf(i2));
        }
        kf kfVar = new kf(this, this.f51984a, (byte) 0);
        this.f51986c.put(Integer.valueOf(i2), kfVar);
        return kfVar;
    }

    private final boolean a(int i2, int i3) {
        if (this.f51986c.get(Integer.valueOf(i2)) == null) {
            return false;
        }
        return this.f51986c.get(Integer.valueOf(i2)).f51990a.get(i3);
    }

    /* JADX WARN: Type inference failed for: r0v171, types: [com.google.android.gms.internal.measurement.gm, java.lang.Object] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x05d9, code lost:
        if (r9.a() == false) goto L_0x05f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x05db, code lost:
        r0 = java.lang.Integer.valueOf(r9.zzd);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x05e1, code lost:
        r8.a("Invalid property filter ID. appId, id", r3, java.lang.String.valueOf(r0));
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x05f8, code lost:
        r0 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x03d8 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.internal.measurement.ay.a> a(java.lang.String r38, java.util.List<com.google.android.gms.internal.measurement.ay.c> r39, java.util.List<com.google.android.gms.internal.measurement.ay.k> r40, java.lang.Long r41, java.lang.Long r42) {
        /*
        // Method dump skipped, instructions count: 1755
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.kd.a(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
