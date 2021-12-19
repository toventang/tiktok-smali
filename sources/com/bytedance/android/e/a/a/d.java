package com.bytedance.android.e.a.a;

import com.bytedance.covode.number.Covode;
import java.io.InputStream;
import java.nio.charset.Charset;

public final class d {

    public interface b {
        static {
            Covode.recordClassIndex(3330);
        }

        void a(long j2);

        boolean a();

        byte b();

        byte[] b(long j2);

        int c();

        String c(long j2);

        long d();
    }

    static {
        Covode.recordClassIndex(3328);
    }

    static abstract class a implements b {

        /* renamed from: a  reason: collision with root package name */
        static final Charset f6860a = Charset.forName("UTF-8");

        a() {
        }

        static {
            Covode.recordClassIndex(3329);
        }

        @Override // com.bytedance.android.e.a.a.d.b
        public final long d() {
            long j2 = 0;
            int i2 = 0;
            do {
                j2 |= (255 & ((long) b())) << (i2 * 8);
                i2++;
            } while (i2 < 8);
            return j2;
        }

        @Override // com.bytedance.android.e.a.a.d.b
        public final int c() {
            return (b() & 255) | ((b() & 255) << 8) | ((b() & 255) << 16) | ((b() & 255) << 24);
        }
    }

    public static b a(InputStream inputStream) {
        return new c(inputStream);
    }

    public static b a(byte[] bArr) {
        return new a(bArr);
    }
}
