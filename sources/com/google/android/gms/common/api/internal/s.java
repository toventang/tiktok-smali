package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.i;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.internal.r;

public abstract class s<A extends a.b, ResultT> {

    /* renamed from: a  reason: collision with root package name */
    public final Feature[] f50270a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f50271b;

    static {
        Covode.recordClassIndex(31321);
    }

    /* access modifiers changed from: protected */
    public abstract void a(A a2, i<ResultT> iVar);

    public s() {
    }

    public static class a<A extends a.b, ResultT> {

        /* renamed from: a  reason: collision with root package name */
        public o<A, i<ResultT>> f50272a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f50273b;

        /* renamed from: c  reason: collision with root package name */
        public Feature[] f50274c;

        static {
            Covode.recordClassIndex(31322);
        }

        private a() {
            this.f50273b = true;
        }

        public final s<A, ResultT> a() {
            boolean z;
            if (this.f50272a != null) {
                z = true;
            } else {
                z = false;
            }
            r.b(z, "execute parameter required");
            return new bu(this, this.f50274c, this.f50273b);
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>((byte) 0);
    }

    private s(Feature[] featureArr, boolean z) {
        this.f50270a = featureArr;
        this.f50271b = z;
    }

    /* synthetic */ s(Feature[] featureArr, boolean z, byte b2) {
        this(featureArr, z);
    }
}
