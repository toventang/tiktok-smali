package com.vk.api.sdk;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.util.concurrent.CountDownLatch;

public interface f {
    static {
        Covode.recordClassIndex(103804);
    }

    void a(com.vk.api.sdk.c.b bVar, d dVar);

    void a(String str, a<String> aVar);

    void b(String str, a<b> aVar);

    void c(String str, a<Boolean> aVar);

    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public volatile T f156305a;

        /* renamed from: b  reason: collision with root package name */
        public final CountDownLatch f156306b;

        static {
            Covode.recordClassIndex(103805);
        }

        public final void a(T t) {
            this.f156305a = t;
            this.f156306b.countDown();
        }

        public a(CountDownLatch countDownLatch) {
            l.c(countDownLatch, "");
            this.f156306b = countDownLatch;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f156311a;

        /* renamed from: b  reason: collision with root package name */
        public final String f156312b;

        /* renamed from: c  reason: collision with root package name */
        public final String f156313c;

        /* renamed from: d  reason: collision with root package name */
        public final Integer f156314d;

        static {
            Covode.recordClassIndex(103806);
        }

        public b(String str, String str2, Integer num) {
            boolean z;
            this.f156312b = str;
            this.f156313c = str2;
            this.f156314d = num;
            if (str2 == null || p.a((CharSequence) str2)) {
                z = true;
            } else {
                z = false;
            }
            this.f156311a = true ^ z;
        }
    }
}
