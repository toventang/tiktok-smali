package com.airbnb.lottie.e.b;

import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.s;
import com.airbnb.lottie.e.a.b;
import com.airbnb.lottie.g;
import com.bytedance.covode.number.Covode;

public final class q implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f5453a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5454b;

    /* renamed from: c  reason: collision with root package name */
    public final b f5455c;

    /* renamed from: d  reason: collision with root package name */
    public final b f5456d;

    /* renamed from: e  reason: collision with root package name */
    public final b f5457e;

    static {
        Covode.recordClassIndex(2280);
    }

    public enum a {
        Simultaneously,
        Individually;

        static {
            Covode.recordClassIndex(2281);
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
        return "Trim Path: {start: " + this.f5455c + ", end: " + this.f5456d + ", offset: " + this.f5457e + "}";
    }

    @Override // com.airbnb.lottie.e.b.b
    public final c a(g gVar, com.airbnb.lottie.e.c.a aVar) {
        return new s(aVar, this);
    }

    public q(String str, a aVar, b bVar, b bVar2, b bVar3) {
        this.f5453a = str;
        this.f5454b = aVar;
        this.f5455c = bVar;
        this.f5456d = bVar2;
        this.f5457e = bVar3;
    }
}
