package com.toutiao.proxyserver.a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public AtomicInteger f154762a;

    /* renamed from: b  reason: collision with root package name */
    public AtomicInteger f154763b;

    static {
        Covode.recordClassIndex(103096);
    }

    /* renamed from: com.toutiao.proxyserver.a.a$a  reason: collision with other inner class name */
    public static final class C4113a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f154764a = new a((byte) 0);

        static {
            Covode.recordClassIndex(103097);
        }
    }

    public final boolean a() {
        if (this.f154762a.get() == 2) {
            return true;
        }
        return false;
    }

    private a() {
        this.f154762a = new AtomicInteger(0);
        this.f154763b = new AtomicInteger(0);
    }

    /* synthetic */ a(byte b2) {
        this();
    }
}
