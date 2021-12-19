package com.benchmark.d;

import com.bytedance.covode.number.Covode;
import java.util.Date;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public a f6202a;

    /* renamed from: b  reason: collision with root package name */
    public int f6203b;

    /* renamed from: c  reason: collision with root package name */
    public long f6204c;

    /* renamed from: d  reason: collision with root package name */
    private Date f6205d;

    /* renamed from: e  reason: collision with root package name */
    private Date f6206e;

    static {
        Covode.recordClassIndex(3003);
    }

    public final d b() {
        this.f6205d = new Date();
        return this;
    }

    public final c a() {
        if (this.f6205d == null || this.f6202a == null) {
            throw new RuntimeException("mStartTime or job cant not be null");
        }
        c cVar = new c();
        Date date = this.f6206e;
        if (date != null && this.f6203b < 0 && this.f6204c > 0) {
            this.f6203b = (int) (((date.getTime() - this.f6205d.getTime()) / this.f6204c) + 1);
        }
        cVar.f6197a = this.f6205d;
        cVar.f6198b = this.f6206e;
        cVar.f6199c = this.f6202a;
        cVar.f6200d.set(this.f6203b);
        cVar.f6201e = this.f6204c;
        return cVar;
    }
}
