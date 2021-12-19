package com.bytedance.lottie.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.f.g;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public float f40738a;

    /* renamed from: b  reason: collision with root package name */
    public float f40739b;

    static {
        Covode.recordClassIndex(24989);
    }

    public d() {
        this(1.0f, 1.0f);
    }

    public static class a extends g<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f40740a = new a();

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // com.bytedance.lottie.f.g
        public final /* bridge */ /* synthetic */ d[] a() {
            return new d[3];
        }

        static {
            Covode.recordClassIndex(24990);
        }
    }

    public final String toString() {
        return this.f40738a + "x" + this.f40739b;
    }

    public d(float f2, float f3) {
        this.f40738a = f2;
        this.f40739b = f3;
    }
}
