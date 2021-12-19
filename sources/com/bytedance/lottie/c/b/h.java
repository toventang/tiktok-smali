package com.bytedance.lottie.c.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.a.b;
import com.bytedance.lottie.a.a.k;
import com.bytedance.lottie.e;
import com.bytedance.lottie.i;

public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f40530a;

    /* renamed from: b  reason: collision with root package name */
    public final a f40531b;

    static {
        Covode.recordClassIndex(24897);
    }

    public final String toString() {
        return "MergePaths{mode=" + this.f40531b + '}';
    }

    public enum a {
        Merge,
        Add,
        Subtract,
        Intersect,
        ExcludeIntersections;

        static {
            Covode.recordClassIndex(24898);
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
        this.f40530a = str;
        this.f40531b = aVar;
    }

    @Override // com.bytedance.lottie.c.b.b
    public final b a(i iVar, com.bytedance.lottie.c.c.a aVar) {
        if (iVar.f40773k) {
            return new k(this);
        }
        e.a("Animation contains merge paths but they are disabled.");
        return null;
    }
}
