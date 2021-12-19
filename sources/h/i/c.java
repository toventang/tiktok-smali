package h.i;

import com.bytedance.covode.number.Covode;
import h.d.b;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public abstract class c {
    public static final a Default = new a(null);
    public static final c defaultRandom = b.f158680a.a();

    public static final class a extends c implements Serializable {
        static {
            Covode.recordClassIndex(105260);
        }

        /* renamed from: h.i.c$a$a  reason: collision with other inner class name */
        static final class C4188a implements Serializable {

            /* renamed from: a  reason: collision with root package name */
            public static final C4188a f158739a = new C4188a();
            private static final long serialVersionUID = 0;

            private C4188a() {
            }

            private final Object readResolve() {
                return c.Default;
            }

            static {
                Covode.recordClassIndex(105261);
            }
        }

        private a() {
        }

        private final Object writeReplace() {
            return C4188a.f158739a;
        }

        @Override // h.i.c
        public final boolean nextBoolean() {
            return c.defaultRandom.nextBoolean();
        }

        @Override // h.i.c
        public final double nextDouble() {
            return c.defaultRandom.nextDouble();
        }

        @Override // h.i.c
        public final float nextFloat() {
            return c.defaultRandom.nextFloat();
        }

        @Override // h.i.c
        public final int nextInt() {
            return c.defaultRandom.nextInt();
        }

        @Override // h.i.c
        public final long nextLong() {
            return c.defaultRandom.nextLong();
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        @Override // h.i.c
        public final int nextBits(int i2) {
            return c.defaultRandom.nextBits(i2);
        }

        @Override // h.i.c
        public final byte[] nextBytes(int i2) {
            return c.defaultRandom.nextBytes(i2);
        }

        @Override // h.i.c
        public final byte[] nextBytes(byte[] bArr) {
            l.d(bArr, "");
            return c.defaultRandom.nextBytes(bArr);
        }

        @Override // h.i.c
        public final double nextDouble(double d2) {
            return c.defaultRandom.nextDouble(d2);
        }

        @Override // h.i.c
        public final int nextInt(int i2) {
            return c.defaultRandom.nextInt(i2);
        }

        @Override // h.i.c
        public final long nextLong(long j2) {
            return c.defaultRandom.nextLong(j2);
        }

        @Override // h.i.c
        public final double nextDouble(double d2, double d3) {
            return c.defaultRandom.nextDouble(d2, d3);
        }

        @Override // h.i.c
        public final int nextInt(int i2, int i3) {
            return c.defaultRandom.nextInt(i2, i3);
        }

        @Override // h.i.c
        public final long nextLong(long j2, long j3) {
            return c.defaultRandom.nextLong(j2, j3);
        }

        @Override // h.i.c
        public final byte[] nextBytes(byte[] bArr, int i2, int i3) {
            l.d(bArr, "");
            return c.defaultRandom.nextBytes(bArr, i2, i3);
        }
    }

    public abstract int nextBits(int i2);

    public int nextInt() {
        return nextBits(32);
    }

    public boolean nextBoolean() {
        if (nextBits(1) != 0) {
            return true;
        }
        return false;
    }

    public float nextFloat() {
        return ((float) nextBits(24)) / 1.6777216E7f;
    }

    public long nextLong() {
        return (((long) nextInt()) << 32) + ((long) nextInt());
    }

    static {
        Covode.recordClassIndex(105259);
    }

    public double nextDouble() {
        double nextBits = (double) ((((long) nextBits(26)) << 27) + ((long) nextBits(27)));
        Double.isNaN(nextBits);
        return nextBits / 9.007199254740992E15d;
    }

    public byte[] nextBytes(int i2) {
        return nextBytes(new byte[i2]);
    }

    public double nextDouble(double d2) {
        return nextDouble(0.0d, d2);
    }

    public long nextLong(long j2) {
        return nextLong(0, j2);
    }

    public byte[] nextBytes(byte[] bArr) {
        l.d(bArr, "");
        return nextBytes(bArr, 0, bArr.length);
    }

    public int nextInt(int i2) {
        return nextInt(0, i2);
    }

    public double nextDouble(double d2, double d3) {
        double nextDouble;
        if (d3 > d2) {
            double d4 = d3 - d2;
            if (!Double.isInfinite(d4) || Double.isInfinite(d2) || Double.isNaN(d2) || Double.isInfinite(d3) || Double.isNaN(d3)) {
                nextDouble = nextDouble() * d4;
            } else {
                nextDouble = nextDouble() * ((d3 / 2.0d) - (d2 / 2.0d));
                d2 += nextDouble;
            }
            double d5 = d2 + nextDouble;
            if (d5 >= d3) {
                return Math.nextAfter(d3, Double.NEGATIVE_INFINITY);
            }
            return d5;
        }
        throw new IllegalArgumentException(d.a(Double.valueOf(d2), Double.valueOf(d3)).toString());
    }

    public int nextInt(int i2, int i3) {
        int nextInt;
        int i4;
        if (i3 > i2) {
            int i5 = i3 - i2;
            if (i5 > 0 || i5 == Integer.MIN_VALUE) {
                if (((-i5) & i5) == i5) {
                    i4 = nextBits(31 - Integer.numberOfLeadingZeros(i5));
                } else {
                    do {
                        nextInt = nextInt() >>> 1;
                        i4 = nextInt % i5;
                    } while ((nextInt - i4) + (i5 - 1) < 0);
                }
                return i2 + i4;
            }
            while (true) {
                int nextInt2 = nextInt();
                if (i2 <= nextInt2 && i3 > nextInt2) {
                    return nextInt2;
                }
            }
        } else {
            throw new IllegalArgumentException(d.a(Integer.valueOf(i2), Integer.valueOf(i3)).toString());
        }
    }

    public long nextLong(long j2, long j3) {
        long nextLong;
        long j4;
        int nextInt;
        if (j3 > j2) {
            long j5 = j3 - j2;
            if (j5 > 0) {
                if (((-j5) & j5) == j5) {
                    int i2 = (int) j5;
                    int i3 = (int) (j5 >>> 32);
                    if (i2 != 0) {
                        nextInt = nextBits(31 - Integer.numberOfLeadingZeros(i2));
                    } else if (i3 == 1) {
                        nextInt = nextInt();
                    } else {
                        j4 = (((long) nextBits(31 - Integer.numberOfLeadingZeros(i3))) << 32) + ((long) nextInt());
                    }
                    j4 = ((long) nextInt) & 4294967295L;
                } else {
                    do {
                        nextLong = nextLong() >>> 1;
                        j4 = nextLong % j5;
                    } while ((nextLong - j4) + (j5 - 1) < 0);
                }
                return j2 + j4;
            }
            while (true) {
                long nextLong2 = nextLong();
                if (j2 <= nextLong2 && j3 > nextLong2) {
                    return nextLong2;
                }
            }
        } else {
            throw new IllegalArgumentException(d.a(Long.valueOf(j2), Long.valueOf(j3)).toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] nextBytes(byte[] r7, int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 178
        */
        throw new UnsupportedOperationException("Method not decompiled: h.i.c.nextBytes(byte[], int, int):byte[]");
    }

    public static /* synthetic */ byte[] nextBytes$default(c cVar, byte[] bArr, int i2, int i3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = bArr.length;
            }
            return cVar.nextBytes(bArr, i2, i3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
    }
}
