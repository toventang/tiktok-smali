package androidx.j.a.a;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public final class b extends c {
    static {
        Covode.recordClassIndex(1160);
    }

    public final int b() {
        int b2 = b(6);
        if (b2 != 0) {
            return c(b2);
        }
        return 0;
    }

    public final int a() {
        int b2 = b(4);
        if (b2 != 0) {
            return this.f3219c.getInt(b2 + this.f3218b);
        }
        return 0;
    }

    public final void a(int i2, ByteBuffer byteBuffer) {
        this.f3218b = i2;
        this.f3219c = byteBuffer;
    }

    public final a a(a aVar, int i2) {
        int b2 = b(6);
        if (b2 == 0) {
            return null;
        }
        int d2 = d(b2) + (i2 * 4);
        return aVar.a(d2 + this.f3219c.getInt(d2), this.f3219c);
    }
}
