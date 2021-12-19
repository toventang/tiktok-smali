package com.airbnb.lottie.e.b;

import android.graphics.PointF;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.n;
import com.airbnb.lottie.e.a.b;
import com.airbnb.lottie.e.a.m;
import com.airbnb.lottie.g;
import com.bytedance.covode.number.Covode;

public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f5409a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5410b;

    /* renamed from: c  reason: collision with root package name */
    public final b f5411c;

    /* renamed from: d  reason: collision with root package name */
    public final m<PointF, PointF> f5412d;

    /* renamed from: e  reason: collision with root package name */
    public final b f5413e;

    /* renamed from: f  reason: collision with root package name */
    public final b f5414f;

    /* renamed from: g  reason: collision with root package name */
    public final b f5415g;

    /* renamed from: h  reason: collision with root package name */
    public final b f5416h;

    /* renamed from: i  reason: collision with root package name */
    public final b f5417i;

    static {
        Covode.recordClassIndex(2268);
    }

    public enum a {
        Star(1),
        Polygon(2);
        
        private final int value;

        static {
            Covode.recordClassIndex(2269);
        }

        public static a forValue(int i2) {
            a[] values = values();
            for (a aVar : values) {
                if (aVar.value == i2) {
                    return aVar;
                }
            }
            return null;
        }

        private a(int i2) {
            this.value = i2;
        }
    }

    @Override // com.airbnb.lottie.e.b.b
    public final c a(g gVar, com.airbnb.lottie.e.c.a aVar) {
        return new n(gVar, aVar, this);
    }

    public i(String str, a aVar, b bVar, m<PointF, PointF> mVar, b bVar2, b bVar3, b bVar4, b bVar5, b bVar6) {
        this.f5409a = str;
        this.f5410b = aVar;
        this.f5411c = bVar;
        this.f5412d = mVar;
        this.f5413e = bVar2;
        this.f5414f = bVar3;
        this.f5415g = bVar4;
        this.f5416h = bVar5;
        this.f5417i = bVar6;
    }
}
