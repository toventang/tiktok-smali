package h.i;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Random;

public abstract class a extends c {
    static {
        Covode.recordClassIndex(105255);
    }

    public abstract Random a();

    @Override // h.i.c
    public boolean nextBoolean() {
        return a().nextBoolean();
    }

    @Override // h.i.c
    public double nextDouble() {
        return a().nextDouble();
    }

    @Override // h.i.c
    public float nextFloat() {
        return a().nextFloat();
    }

    @Override // h.i.c
    public int nextInt() {
        return a().nextInt();
    }

    @Override // h.i.c
    public long nextLong() {
        return a().nextLong();
    }

    @Override // h.i.c
    public int nextBits(int i2) {
        return d.a(a().nextInt(), i2);
    }

    @Override // h.i.c
    public byte[] nextBytes(byte[] bArr) {
        l.d(bArr, "");
        a().nextBytes(bArr);
        return bArr;
    }

    @Override // h.i.c
    public int nextInt(int i2) {
        return a().nextInt(i2);
    }
}
