package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* access modifiers changed from: package-private */
public final class jk {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f51067a = c();

    /* renamed from: b  reason: collision with root package name */
    static final boolean f51068b = b();

    /* renamed from: c  reason: collision with root package name */
    static final boolean f51069c;

    /* renamed from: d  reason: collision with root package name */
    private static final Logger f51070d = Logger.getLogger(jk.class.getName());

    /* renamed from: e  reason: collision with root package name */
    private static final Unsafe f51071e;

    /* renamed from: f  reason: collision with root package name */
    private static final Class<?> f51072f = ex.f50829a;

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f51073g;

    /* renamed from: h  reason: collision with root package name */
    private static final boolean f51074h;

    /* renamed from: i  reason: collision with root package name */
    private static final c f51075i;

    /* renamed from: j  reason: collision with root package name */
    private static final long f51076j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f51077k = ((long) b(boolean[].class));

    /* renamed from: l  reason: collision with root package name */
    private static final long f51078l = ((long) c(boolean[].class));

    /* renamed from: m  reason: collision with root package name */
    private static final long f51079m = ((long) b(int[].class));
    private static final long n = ((long) c(int[].class));
    private static final long o = ((long) b(long[].class));
    private static final long p = ((long) c(long[].class));
    private static final long q = ((long) b(float[].class));
    private static final long r = ((long) c(float[].class));
    private static final long s = ((long) b(double[].class));
    private static final long t = ((long) c(double[].class));
    private static final long u = ((long) b(Object[].class));
    private static final long v = ((long) c(Object[].class));
    private static final long w;
    private static final int x;

    private jk() {
    }

    static void a(Object obj, long j2, long j3) {
        f51075i.a(obj, j2, j3);
    }

    static void a(Object obj, long j2, boolean z) {
        f51075i.a(obj, j2, z);
    }

    static void a(Object obj, long j2, Object obj2) {
        f51075i.f51080a.putObject(obj, j2, obj2);
    }

    static void a(byte[] bArr, long j2, byte b2) {
        f51075i.a((Object) bArr, f51076j + j2, b2);
    }

    private static Field d() {
        Field a2;
        if (ex.a() && (a2 = a(Buffer.class, "effectiveDirectAddress")) != null) {
            return a2;
        }
        Field a3 = a(Buffer.class, "address");
        if (a3 == null || a3.getType() != Long.TYPE) {
            return null;
        }
        return a3;
    }

    static Unsafe a() {
        try {
            return (Unsafe) AccessController.doPrivileged(new jj());
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        long j2;
        boolean z;
        Covode.recordClassIndex(31904);
        Unsafe a2 = a();
        f51071e = a2;
        boolean d2 = d(Long.TYPE);
        f51073g = d2;
        boolean d3 = d(Integer.TYPE);
        f51074h = d3;
        c cVar = null;
        if (a2 != null) {
            if (!ex.a()) {
                cVar = new d(a2);
            } else if (d2) {
                cVar = new a(a2);
            } else if (d3) {
                cVar = new b(a2);
            }
        }
        f51075i = cVar;
        long b2 = (long) b(byte[].class);
        f51076j = b2;
        Field d4 = d();
        if (d4 == null || cVar == null) {
            j2 = -1;
        } else {
            j2 = cVar.f51080a.objectFieldOffset(d4);
        }
        w = j2;
        x = (int) (7 & b2);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f51069c = z;
    }

    private static boolean c() {
        Unsafe unsafe = f51071e;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (d() == null) {
                return false;
            }
            if (ex.a()) {
                return true;
            }
            cls.getMethod("getByte", Long.TYPE);
            cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
            cls.getMethod("getInt", Long.TYPE);
            cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Long.TYPE);
            cls.getMethod("putLong", Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = f51070d;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", new StringBuilder(String.valueOf(valueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(valueOf).toString());
            return false;
        }
    }

    private static boolean b() {
        Unsafe unsafe = f51071e;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
            if (ex.a()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, Long.TYPE);
            cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, Long.TYPE);
            cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, Long.TYPE);
            cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod("getDouble", Object.class, Long.TYPE);
            cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = f51070d;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", new StringBuilder(String.valueOf(valueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(valueOf).toString());
            return false;
        }
    }

    static final class a extends c {
        static {
            Covode.recordClassIndex(31905);
        }

        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.jk.c
        public final byte a(Object obj, long j2) {
            if (jk.f51069c) {
                return jk.g(obj, j2);
            }
            return jk.h(obj, j2);
        }

        @Override // com.google.android.gms.internal.measurement.jk.c
        public final boolean b(Object obj, long j2) {
            if (jk.f51069c) {
                return jk.i(obj, j2);
            }
            return jk.j(obj, j2);
        }

        @Override // com.google.android.gms.internal.measurement.jk.c
        public final float c(Object obj, long j2) {
            return Float.intBitsToFloat(e(obj, j2));
        }

        @Override // com.google.android.gms.internal.measurement.jk.c
        public final double d(Object obj, long j2) {
            return Double.longBitsToDouble(f(obj, j2));
        }

        @Override // com.google.android.gms.internal.measurement.jk.c
        public final void a(Object obj, long j2, float f2) {
            a(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // com.google.android.gms.internal.measurement.jk.c
        public final void a(Object obj, long j2, byte b2) {
            if (jk.f51069c) {
                jk.a(obj, j2, b2);
            } else {
                jk.b(obj, j2, b2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.jk.c
        public final void a(Object obj, long j2, double d2) {
            a(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.android.gms.internal.measurement.jk.c
        public final void a(Object obj, long j2, boolean z) {
            if (jk.f51069c) {
                jk.b(obj, j2, z);
            } else {
                jk.c(obj, j2, z);
            }
        }
    }

    static final class b extends c {
        static {
            Covode.recordClassIndex(31906);
        }

        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.jk.c
        public final byte a(Object obj, long j2) {
            if (jk.f51069c) {
                return jk.g(obj, j2);
            }
            return jk.h(obj, j2);
        }

        @Override // com.google.android.gms.internal.measurement.jk.c
        public final boolean b(Object obj, long j2) {
            if (jk.f51069c) {
                return jk.i(obj, j2);
            }
            return jk.j(obj, j2);
        }

        @Override // com.google.android.gms.internal.measurement.jk.c
        public final float c(Object obj, long j2) {
            return Float.intBitsToFloat(e(obj, j2));
        }

        @Override // com.google.android.gms.internal.measurement.jk.c
        public final double d(Object obj, long j2) {
            return Double.longBitsToDouble(f(obj, j2));
        }

        @Override // com.google.android.gms.internal.measurement.jk.c
        public final void a(Object obj, long j2, float f2) {
            a(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // com.google.android.gms.internal.measurement.jk.c
        public final void a(Object obj, long j2, byte b2) {
            if (jk.f51069c) {
                jk.a(obj, j2, b2);
            } else {
                jk.b(obj, j2, b2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.jk.c
        public final void a(Object obj, long j2, double d2) {
            a(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.android.gms.internal.measurement.jk.c
        public final void a(Object obj, long j2, boolean z) {
            if (jk.f51069c) {
                jk.b(obj, j2, z);
            } else {
                jk.c(obj, j2, z);
            }
        }
    }

    static final class d extends c {
        static {
            Covode.recordClassIndex(31908);
        }

        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.jk.c
        public final byte a(Object obj, long j2) {
            return this.f51080a.getByte(obj, j2);
        }

        @Override // com.google.android.gms.internal.measurement.jk.c
        public final boolean b(Object obj, long j2) {
            return this.f51080a.getBoolean(obj, j2);
        }

        @Override // com.google.android.gms.internal.measurement.jk.c
        public final float c(Object obj, long j2) {
            return this.f51080a.getFloat(obj, j2);
        }

        @Override // com.google.android.gms.internal.measurement.jk.c
        public final double d(Object obj, long j2) {
            return this.f51080a.getDouble(obj, j2);
        }

        @Override // com.google.android.gms.internal.measurement.jk.c
        public final void a(Object obj, long j2, byte b2) {
            this.f51080a.putByte(obj, j2, b2);
        }

        @Override // com.google.android.gms.internal.measurement.jk.c
        public final void a(Object obj, long j2, double d2) {
            this.f51080a.putDouble(obj, j2, d2);
        }

        @Override // com.google.android.gms.internal.measurement.jk.c
        public final void a(Object obj, long j2, float f2) {
            this.f51080a.putFloat(obj, j2, f2);
        }

        @Override // com.google.android.gms.internal.measurement.jk.c
        public final void a(Object obj, long j2, boolean z) {
            this.f51080a.putBoolean(obj, j2, z);
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f51080a;

        static {
            Covode.recordClassIndex(31907);
        }

        public abstract byte a(Object obj, long j2);

        public abstract void a(Object obj, long j2, byte b2);

        public abstract void a(Object obj, long j2, double d2);

        public abstract void a(Object obj, long j2, float f2);

        public abstract void a(Object obj, long j2, boolean z);

        public abstract boolean b(Object obj, long j2);

        public abstract float c(Object obj, long j2);

        public abstract double d(Object obj, long j2);

        c(Unsafe unsafe) {
            this.f51080a = unsafe;
        }

        public final int e(Object obj, long j2) {
            return this.f51080a.getInt(obj, j2);
        }

        public final long f(Object obj, long j2) {
            return this.f51080a.getLong(obj, j2);
        }

        public final void a(Object obj, long j2, int i2) {
            this.f51080a.putInt(obj, j2, i2);
        }

        public final void a(Object obj, long j2, long j3) {
            this.f51080a.putLong(obj, j2, j3);
        }
    }

    private static int b(Class<?> cls) {
        if (f51068b) {
            return f51075i.f51080a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int c(Class<?> cls) {
        if (f51068b) {
            return f51075i.f51080a.arrayIndexScale(cls);
        }
        return -1;
    }

    static <T> T a(Class<T> cls) {
        try {
            return (T) f51071e.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static boolean d(Class<?> cls) {
        if (!ex.a()) {
            return false;
        }
        try {
            Class<?> cls2 = f51072f;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static int a(Object obj, long j2) {
        return f51075i.e(obj, j2);
    }

    static long b(Object obj, long j2) {
        return f51075i.f(obj, j2);
    }

    static float d(Object obj, long j2) {
        return f51075i.c(obj, j2);
    }

    static double e(Object obj, long j2) {
        return f51075i.d(obj, j2);
    }

    static byte a(byte[] bArr, long j2) {
        return f51075i.a(bArr, f51076j + j2);
    }

    static Object f(Object obj, long j2) {
        return f51075i.f51080a.getObject(obj, j2);
    }

    static byte h(Object obj, long j2) {
        return (byte) (a(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    static /* synthetic */ boolean i(Object obj, long j2) {
        if (g(obj, j2) != 0) {
            return true;
        }
        return false;
    }

    static /* synthetic */ boolean j(Object obj, long j2) {
        if (h(obj, j2) != 0) {
            return true;
        }
        return false;
    }

    static boolean c(Object obj, long j2) {
        return f51075i.b(obj, j2);
    }

    static byte g(Object obj, long j2) {
        return (byte) (a(obj, -4 & j2) >>> ((int) (((j2 ^ -1) & 3) << 3)));
    }

    private static Field a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ void c(Object obj, long j2, boolean z) {
        b(obj, j2, z ? (byte) 1 : 0);
    }

    static void b(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = (((int) j2) & 3) << 3;
        a(obj, j3, ((255 & b2) << i2) | (a(obj, j3) & ((255 << i2) ^ -1)));
    }

    static /* synthetic */ void b(Object obj, long j2, boolean z) {
        a(obj, j2, z ? (byte) 1 : 0);
    }

    static void a(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = ((((int) j2) ^ -1) & 3) << 3;
        a(obj, j3, ((255 & b2) << i2) | (a(obj, j3) & ((255 << i2) ^ -1)));
    }

    static void a(Object obj, long j2, double d2) {
        f51075i.a(obj, j2, d2);
    }

    static void a(Object obj, long j2, float f2) {
        f51075i.a(obj, j2, f2);
    }

    static void a(Object obj, long j2, int i2) {
        f51075i.a(obj, j2, i2);
    }
}
