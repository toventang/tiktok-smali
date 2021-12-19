package androidx.j.a.a;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public final class a extends c {
    static {
        Covode.recordClassIndex(1159);
    }

    public final int f() {
        int b2 = b(16);
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

    public final boolean b() {
        int b2 = b(6);
        if (b2 == 0 || this.f3219c.get(b2 + this.f3218b) == 0) {
            return false;
        }
        return true;
    }

    public final short c() {
        int b2 = b(8);
        if (b2 != 0) {
            return this.f3219c.getShort(b2 + this.f3218b);
        }
        return 0;
    }

    public final short d() {
        int b2 = b(12);
        if (b2 != 0) {
            return this.f3219c.getShort(b2 + this.f3218b);
        }
        return 0;
    }

    public final short e() {
        int b2 = b(14);
        if (b2 != 0) {
            return this.f3219c.getShort(b2 + this.f3218b);
        }
        return 0;
    }

    public final int a(int i2) {
        int b2 = b(16);
        if (b2 != 0) {
            return this.f3219c.getInt(d(b2) + (i2 * 4));
        }
        return 0;
    }

    public final a a(int i2, ByteBuffer byteBuffer) {
        this.f3218b = i2;
        this.f3219c = byteBuffer;
        return this;
    }
}
