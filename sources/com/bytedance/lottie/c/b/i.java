package com.bytedance.lottie.c.b;

import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.c.a.b;
import com.bytedance.lottie.c.a.m;

public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f40533a;

    /* renamed from: b  reason: collision with root package name */
    public final a f40534b;

    /* renamed from: c  reason: collision with root package name */
    public final b f40535c;

    /* renamed from: d  reason: collision with root package name */
    public final m<PointF, PointF> f40536d;

    /* renamed from: e  reason: collision with root package name */
    public final b f40537e;

    /* renamed from: f  reason: collision with root package name */
    public final b f40538f;

    /* renamed from: g  reason: collision with root package name */
    public final b f40539g;

    /* renamed from: h  reason: collision with root package name */
    public final b f40540h;

    /* renamed from: i  reason: collision with root package name */
    public final b f40541i;

    static {
        Covode.recordClassIndex(24899);
    }

    public enum a {
        Star(1),
        Polygon(2);
        
        private final int value;

        static {
            Covode.recordClassIndex(24900);
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

    @Override // com.bytedance.lottie.c.b.b
    public final com.bytedance.lottie.a.a.b a(com.bytedance.lottie.i iVar, com.bytedance.lottie.c.c.a aVar) {
        return new com.bytedance.lottie.a.a.m(iVar, aVar, this);
    }

    public i(String str, a aVar, b bVar, m<PointF, PointF> mVar, b bVar2, b bVar3, b bVar4, b bVar5, b bVar6) {
        this.f40533a = str;
        this.f40534b = aVar;
        this.f40535c = bVar;
        this.f40536d = mVar;
        this.f40537e = bVar2;
        this.f40538f = bVar3;
        this.f40539g = bVar4;
        this.f40540h = bVar5;
        this.f40541i = bVar6;
    }
}
