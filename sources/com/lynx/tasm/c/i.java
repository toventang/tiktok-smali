package com.lynx.tasm.c;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public class i extends d {

    /* renamed from: a  reason: collision with root package name */
    public a f56497a;

    /* renamed from: b  reason: collision with root package name */
    public a f56498b;

    /* renamed from: c  reason: collision with root package name */
    public a f56499c;

    static {
        Covode.recordClassIndex(35253);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public float f56500a;

        /* renamed from: b  reason: collision with root package name */
        public float f56501b;

        static {
            Covode.recordClassIndex(35254);
        }

        public a() {
        }

        public final int hashCode() {
            return Arrays.hashCode(new float[]{this.f56500a, this.f56501b});
        }

        public final String toString() {
            return "Point{x=" + this.f56500a + ", y=" + this.f56501b + '}';
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof a)) {
                a aVar = (a) obj;
                if (Float.compare(aVar.f56500a, this.f56500a) == 0 && Float.compare(aVar.f56501b, this.f56501b) == 0) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public a(float f2, float f3) {
            this.f56500a = f2;
            this.f56501b = f3;
        }
    }

    public i(int i2, String str, a aVar, a aVar2, a aVar3) {
        super(i2, str);
        this.f56497a = aVar;
        this.f56498b = aVar2;
        this.f56499c = aVar3;
    }
}
