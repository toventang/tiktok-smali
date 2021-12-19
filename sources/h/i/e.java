package h.i;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class e extends c implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static final a f158740a = new a((byte) 0);
    private static final long serialVersionUID = 0;
    private int addend;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    static {
        Covode.recordClassIndex(105263);
    }

    static final class a {
        static {
            Covode.recordClassIndex(105264);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // h.i.c
    public final int nextInt() {
        int i2 = this.x;
        int i3 = i2 ^ (i2 >>> 2);
        this.x = this.y;
        this.y = this.z;
        this.z = this.w;
        int i4 = this.v;
        this.w = i4;
        int i5 = ((i3 ^ (i3 << 1)) ^ i4) ^ (i4 << 4);
        this.v = i5;
        int i6 = this.addend + 362437;
        this.addend = i6;
        return i5 + i6;
    }

    @Override // h.i.c
    public final int nextBits(int i2) {
        return d.a(nextInt(), i2);
    }

    public e(int i2, int i3) {
        this(i2, i3, 0, 0, i2 ^ -1, (i2 << 10) ^ (i3 >>> 4));
    }

    public e(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.x = i2;
        this.y = i3;
        this.z = i4;
        this.w = i5;
        this.v = i6;
        this.addend = i7;
        int i8 = 0;
        if ((i2 | i3 | i4 | i5 | i6) != 0) {
            do {
                nextInt();
                i8++;
            } while (i8 < 64);
            return;
        }
        throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
    }
}
