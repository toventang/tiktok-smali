package com.google.c.b;

import com.bytedance.covode.number.Covode;
import com.google.c.a.q;
import java.util.concurrent.atomic.AtomicLong;

final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final q<h> f53842a;

    static final class a extends AtomicLong implements h {
        static {
            Covode.recordClassIndex(33335);
        }

        private a() {
        }

        @Override // com.google.c.b.h
        public final void a() {
            getAndIncrement();
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        @Override // com.google.c.b.h
        public final void a(long j2) {
            getAndAdd(j2);
        }
    }

    public static h a() {
        return f53842a.b();
    }

    static {
        q<h> qVar;
        Covode.recordClassIndex(33332);
        try {
            new j();
            qVar = new q<h>() {
                /* class com.google.c.b.i.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(33333);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.google.c.a.q
                public final /* synthetic */ h b() {
                    return new j();
                }
            };
        } catch (Throwable unused) {
            qVar = new q<h>() {
                /* class com.google.c.b.i.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(33334);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.google.c.a.q
                public final /* synthetic */ h b() {
                    return new a((byte) 0);
                }
            };
        }
        f53842a = qVar;
    }
}
