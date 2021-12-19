package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.gm;

final class il implements hr {

    /* renamed from: a  reason: collision with root package name */
    final ht f51021a;

    /* renamed from: b  reason: collision with root package name */
    public final String f51022b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f51023c;

    /* renamed from: d  reason: collision with root package name */
    private final int f51024d;

    static {
        Covode.recordClassIndex(31878);
    }

    @Override // com.google.android.gms.internal.measurement.hr
    public final ht c() {
        return this.f51021a;
    }

    @Override // com.google.android.gms.internal.measurement.hr
    public final int a() {
        if ((this.f51024d & 1) == 1) {
            return gm.e.f50948h;
        }
        return gm.e.f50949i;
    }

    @Override // com.google.android.gms.internal.measurement.hr
    public final boolean b() {
        if ((this.f51024d & 2) == 2) {
            return true;
        }
        return false;
    }

    il(ht htVar, String str, Object[] objArr) {
        this.f51021a = htVar;
        this.f51022b = str;
        this.f51023c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f51024d = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 13;
        int i4 = 1;
        while (true) {
            int i5 = i4 + 1;
            char charAt2 = str.charAt(i4);
            if (charAt2 >= 55296) {
                i2 |= (charAt2 & 8191) << i3;
                i3 += 13;
                i4 = i5;
            } else {
                this.f51024d = i2 | (charAt2 << i3);
                return;
            }
        }
    }
}
