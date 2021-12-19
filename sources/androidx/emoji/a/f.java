package androidx.emoji.a;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class f {

    interface c {
        static {
            Covode.recordClassIndex(988);
        }

        int a();

        void a(int i2);

        long b();

        int c();

        long d();
    }

    static {
        Covode.recordClassIndex(985);
    }

    static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f2809a;

        static {
            Covode.recordClassIndex(986);
        }

        @Override // androidx.emoji.a.f.c
        public final int c() {
            return this.f2809a.getInt();
        }

        @Override // androidx.emoji.a.f.c
        public final long d() {
            return (long) this.f2809a.position();
        }

        @Override // androidx.emoji.a.f.c
        public final int a() {
            return this.f2809a.getShort() & 65535;
        }

        @Override // androidx.emoji.a.f.c
        public final long b() {
            return ((long) this.f2809a.getInt()) & 4294967295L;
        }

        a(ByteBuffer byteBuffer) {
            this.f2809a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji.a.f.c
        public final void a(int i2) {
            ByteBuffer byteBuffer = this.f2809a;
            byteBuffer.position(byteBuffer.position() + i2);
        }
    }

    static b a(c cVar) {
        cVar.a(4);
        int a2 = cVar.a();
        if (a2 <= 100) {
            cVar.a(6);
            int i2 = 0;
            while (true) {
                if (i2 >= a2) {
                    break;
                }
                int c2 = cVar.c();
                cVar.a(4);
                long b2 = cVar.b();
                cVar.a(4);
                if (1835365473 != c2) {
                    i2++;
                } else if (b2 != -1) {
                    cVar.a((int) (b2 - cVar.d()));
                    cVar.a(12);
                    long b3 = cVar.b();
                    for (int i3 = 0; ((long) i3) < b3; i3++) {
                        int c3 = cVar.c();
                        long b4 = cVar.b();
                        long b5 = cVar.b();
                        if (1164798569 == c3 || 1701669481 == c3) {
                            return new b(b4 + b2, b5);
                        }
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public final long f2810a;

        /* renamed from: b  reason: collision with root package name */
        public final long f2811b;

        static {
            Covode.recordClassIndex(987);
        }

        b(long j2, long j3) {
            this.f2810a = j2;
            this.f2811b = j3;
        }
    }
}
