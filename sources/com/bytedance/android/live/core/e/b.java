package com.bytedance.android.live.core.e;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final b f9010c = new b(a.RUNNING, null);

    /* renamed from: d  reason: collision with root package name */
    public static final b f9011d = new b(a.SUCCESS, null);

    /* renamed from: a  reason: collision with root package name */
    public a f9012a;

    /* renamed from: b  reason: collision with root package name */
    public Throwable f9013b;

    public final boolean a() {
        if (this.f9012a == a.RUNNING) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f9012a == a.FAILED) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(4590);
    }

    public enum a {
        RUNNING(0),
        SUCCESS(1),
        FAILED(-1);
        
        public final int mStatus;

        static {
            Covode.recordClassIndex(4591);
        }

        private a(int i2) {
            this.mStatus = i2;
        }
    }

    public static b a(Throwable th) {
        return new b(a.FAILED, th);
    }

    private b(a aVar, Throwable th) {
        this.f9012a = aVar;
        this.f9013b = th;
    }
}
