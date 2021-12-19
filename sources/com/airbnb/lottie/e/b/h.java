package com.airbnb.lottie.e.b;

import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.l;
import com.airbnb.lottie.d;
import com.airbnb.lottie.g;
import com.bytedance.covode.number.Covode;

public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f5406a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5407b;

    static {
        Covode.recordClassIndex(2266);
    }

    public final String toString() {
        return "MergePaths{mode=" + this.f5407b + '}';
    }

    public enum a {
        Merge,
        Add,
        Subtract,
        Intersect,
        ExcludeIntersections;

        static {
            Covode.recordClassIndex(2267);
        }

        public static a forId(int i2) {
            if (i2 == 1) {
                return Merge;
            }
            if (i2 == 2) {
                return Add;
            }
            if (i2 == 3) {
                return Subtract;
            }
            if (i2 == 4) {
                return Intersect;
            }
            if (i2 != 5) {
                return Merge;
            }
            return ExcludeIntersections;
        }
    }

    public h(String str, a aVar) {
        this.f5406a = str;
        this.f5407b = aVar;
    }

    @Override // com.airbnb.lottie.e.b.b
    public final c a(g gVar, com.airbnb.lottie.e.c.a aVar) {
        if (gVar.f5565l) {
            return new l(this);
        }
        d.a("Animation contains merge paths but they are disabled.");
        return null;
    }
}
