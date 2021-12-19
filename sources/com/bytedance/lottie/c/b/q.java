package com.bytedance.lottie.c.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.a.r;
import com.bytedance.lottie.c.a.b;
import com.bytedance.lottie.i;

public final class q implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f40577a;

    /* renamed from: b  reason: collision with root package name */
    public final a f40578b;

    /* renamed from: c  reason: collision with root package name */
    public final b f40579c;

    /* renamed from: d  reason: collision with root package name */
    public final b f40580d;

    /* renamed from: e  reason: collision with root package name */
    public final b f40581e;

    static {
        Covode.recordClassIndex(24911);
    }

    public enum a {
        Simultaneously,
        Individually;

        static {
            Covode.recordClassIndex(24912);
        }

        public static a forId(int i2) {
            if (i2 == 1) {
                return Simultaneously;
            }
            if (i2 == 2) {
                return Individually;
            }
            throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i2)));
        }
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f40579c + ", end: " + this.f40580d + ", offset: " + this.f40581e + "}";
    }

    @Override // com.bytedance.lottie.c.b.b
    public final com.bytedance.lottie.a.a.b a(i iVar, com.bytedance.lottie.c.c.a aVar) {
        return new r(aVar, this);
    }

    public q(String str, a aVar, b bVar, b bVar2, b bVar3) {
        this.f40577a = str;
        this.f40578b = aVar;
        this.f40579c = bVar;
        this.f40580d = bVar2;
        this.f40581e = bVar3;
    }
}
