package h.i.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public final class a extends h.i.a {
    static {
        Covode.recordClassIndex(105256);
    }

    @Override // h.i.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        l.b(current, "");
        return current;
    }

    @Override // h.i.c
    public final double nextDouble(double d2) {
        return ThreadLocalRandom.current().nextDouble(d2);
    }

    @Override // h.i.c
    public final long nextLong(long j2) {
        return ThreadLocalRandom.current().nextLong(j2);
    }

    @Override // h.i.c
    public final int nextInt(int i2, int i3) {
        return ThreadLocalRandom.current().nextInt(i2, i3);
    }

    @Override // h.i.c
    public final long nextLong(long j2, long j3) {
        return ThreadLocalRandom.current().nextLong(j2, j3);
    }
}
