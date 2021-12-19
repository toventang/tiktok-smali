package com.lynx.component.svg.a;

import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: c  reason: collision with root package name */
    public static final d f55216c = new d(null, null);

    /* renamed from: d  reason: collision with root package name */
    public static final d f55217d = new d(a.none, null);

    /* renamed from: e  reason: collision with root package name */
    public static final d f55218e = new d(a.xMidYMid, b.meet);

    /* renamed from: f  reason: collision with root package name */
    public static final d f55219f = new d(a.xMinYMin, b.meet);

    /* renamed from: g  reason: collision with root package name */
    public static final d f55220g = new d(a.xMaxYMax, b.meet);

    /* renamed from: h  reason: collision with root package name */
    public static final d f55221h = new d(a.xMidYMin, b.meet);

    /* renamed from: i  reason: collision with root package name */
    public static final d f55222i = new d(a.xMidYMax, b.meet);

    /* renamed from: j  reason: collision with root package name */
    public static final d f55223j = new d(a.xMidYMid, b.slice);

    /* renamed from: k  reason: collision with root package name */
    public static final d f55224k = new d(a.xMinYMin, b.slice);

    /* renamed from: a  reason: collision with root package name */
    public a f55225a;

    /* renamed from: b  reason: collision with root package name */
    public b f55226b;

    public final String toString() {
        return this.f55225a + " " + this.f55226b;
    }

    public enum b {
        meet,
        slice;

        static {
            Covode.recordClassIndex(34638);
        }
    }

    static {
        Covode.recordClassIndex(34636);
    }

    public enum a {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax;

        static {
            Covode.recordClassIndex(34637);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f55225a == dVar.f55225a && this.f55226b == dVar.f55226b) {
            return true;
        }
        return false;
    }

    d(a aVar, b bVar) {
        this.f55225a = aVar;
        this.f55226b = bVar;
    }
}
