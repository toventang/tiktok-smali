package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.a;
import com.google.gson.c.b;
import com.google.gson.i;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.r;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

public final class c extends a {

    /* renamed from: c  reason: collision with root package name */
    private static final Reader f54805c = new Reader() {
        /* class com.google.gson.internal.bind.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(33979);
        }

        @Override // java.io.Closeable, java.io.Reader, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private static final Object f54806d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private Object[] f54807e = new Object[32];

    /* renamed from: f  reason: collision with root package name */
    private int f54808f;

    /* renamed from: g  reason: collision with root package name */
    private String[] f54809g = new String[32];

    /* renamed from: h  reason: collision with root package name */
    private int[] f54810h = new int[32];

    private Object s() {
        Object[] objArr = this.f54807e;
        int i2 = this.f54808f - 1;
        this.f54808f = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    @Override // com.google.gson.c.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f54807e = new Object[]{f54806d};
        this.f54808f = 1;
    }

    @Override // com.google.gson.c.a
    public final boolean e() {
        b f2 = f();
        if (f2 == b.END_OBJECT || f2 == b.END_ARRAY) {
            return false;
        }
        return true;
    }

    public final Object g() {
        return this.f54807e[this.f54808f - 1];
    }

    @Override // com.google.gson.c.a
    public final String toString() {
        return getClass().getSimpleName();
    }

    static {
        Covode.recordClassIndex(33978);
    }

    private String t() {
        return " at path " + p();
    }

    @Override // com.google.gson.c.a
    public final void a() {
        a(b.BEGIN_ARRAY);
        a(((i) g()).iterator());
        this.f54810h[this.f54808f - 1] = 0;
    }

    @Override // com.google.gson.c.a
    public final void b() {
        a(b.END_ARRAY);
        s();
        s();
        int i2 = this.f54808f;
        if (i2 > 0) {
            int[] iArr = this.f54810h;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.c.a
    public final void c() {
        a(b.BEGIN_OBJECT);
        a(((o) g()).f54898a.entrySet().iterator());
    }

    @Override // com.google.gson.c.a
    public final void d() {
        a(b.END_OBJECT);
        s();
        s();
        int i2 = this.f54808f;
        if (i2 > 0) {
            int[] iArr = this.f54810h;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.c.a
    public final boolean j() {
        a(b.BOOLEAN);
        boolean h2 = ((l) s()).h();
        int i2 = this.f54808f;
        if (i2 > 0) {
            int[] iArr = this.f54810h;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return h2;
    }

    @Override // com.google.gson.c.a
    public final void k() {
        a(b.NULL);
        s();
        int i2 = this.f54808f;
        if (i2 > 0) {
            int[] iArr = this.f54810h;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.c.a
    public final String h() {
        a(b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) g()).next();
        String str = (String) entry.getKey();
        this.f54809g[this.f54808f - 1] = str;
        a(entry.getValue());
        return str;
    }

    @Override // com.google.gson.c.a
    public final void o() {
        if (f() == b.NAME) {
            h();
            this.f54809g[this.f54808f - 2] = "null";
        } else {
            s();
            int i2 = this.f54808f;
            if (i2 > 0) {
                this.f54809g[i2 - 1] = "null";
            }
        }
        int i3 = this.f54808f;
        if (i3 > 0) {
            int[] iArr = this.f54810h;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    @Override // com.google.gson.c.a
    public final String i() {
        b f2 = f();
        if (f2 == b.STRING || f2 == b.NUMBER) {
            String c2 = ((l) s()).c();
            int i2 = this.f54808f;
            if (i2 > 0) {
                int[] iArr = this.f54810h;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return c2;
        }
        throw new IllegalStateException("Expected " + b.STRING + " but was " + f2 + t());
    }

    @Override // com.google.gson.c.a
    public final double l() {
        b f2 = f();
        if (f2 == b.NUMBER || f2 == b.STRING) {
            double d2 = ((l) g()).d();
            if (this.f54668a || (!Double.isNaN(d2) && !Double.isInfinite(d2))) {
                s();
                int i2 = this.f54808f;
                if (i2 > 0) {
                    int[] iArr = this.f54810h;
                    int i3 = i2 - 1;
                    iArr[i3] = iArr[i3] + 1;
                }
                return d2;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: ".concat(String.valueOf(d2)));
        }
        throw new IllegalStateException("Expected " + b.NUMBER + " but was " + f2 + t());
    }

    @Override // com.google.gson.c.a
    public final long m() {
        b f2 = f();
        if (f2 == b.NUMBER || f2 == b.STRING) {
            long f3 = ((l) g()).f();
            s();
            int i2 = this.f54808f;
            if (i2 > 0) {
                int[] iArr = this.f54810h;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return f3;
        }
        throw new IllegalStateException("Expected " + b.NUMBER + " but was " + f2 + t());
    }

    @Override // com.google.gson.c.a
    public final int n() {
        b f2 = f();
        if (f2 == b.NUMBER || f2 == b.STRING) {
            int g2 = ((l) g()).g();
            s();
            int i2 = this.f54808f;
            if (i2 > 0) {
                int[] iArr = this.f54810h;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return g2;
        }
        throw new IllegalStateException("Expected " + b.NUMBER + " but was " + f2 + t());
    }

    @Override // com.google.gson.c.a
    public final String p() {
        StringBuilder sb = new StringBuilder("$");
        int i2 = 0;
        while (i2 < this.f54808f) {
            Object[] objArr = this.f54807e;
            if (objArr[i2] instanceof i) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('[').append(this.f54810h[i2]).append(']');
                }
            } else if (objArr[i2] instanceof o) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.f54809g;
                    if (strArr[i2] != null) {
                        sb.append(strArr[i2]);
                    }
                }
            }
            i2++;
        }
        return sb.toString();
    }

    @Override // com.google.gson.c.a
    public final b f() {
        while (this.f54808f != 0) {
            Object g2 = g();
            if (g2 instanceof Iterator) {
                boolean z = this.f54807e[this.f54808f - 2] instanceof o;
                Iterator it = (Iterator) g2;
                if (it.hasNext()) {
                    if (z) {
                        return b.NAME;
                    }
                    a(it.next());
                } else if (z) {
                    return b.END_OBJECT;
                } else {
                    return b.END_ARRAY;
                }
            } else if (g2 instanceof o) {
                return b.BEGIN_OBJECT;
            } else {
                if (g2 instanceof i) {
                    return b.BEGIN_ARRAY;
                }
                if (g2 instanceof r) {
                    r rVar = (r) g2;
                    if (rVar.f54900a instanceof String) {
                        return b.STRING;
                    }
                    if (rVar.f54900a instanceof Boolean) {
                        return b.BOOLEAN;
                    }
                    if (rVar.f54900a instanceof Number) {
                        return b.NUMBER;
                    }
                    throw new AssertionError();
                } else if (g2 instanceof n) {
                    return b.NULL;
                } else {
                    if (g2 == f54806d) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                    throw new AssertionError();
                }
            }
        }
        return b.END_DOCUMENT;
    }

    public c(l lVar) {
        super(f54805c);
        a(lVar);
    }

    public final void a(b bVar) {
        if (f() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + f() + t());
        }
    }

    public final void a(Object obj) {
        int i2 = this.f54808f;
        Object[] objArr = this.f54807e;
        if (i2 == objArr.length) {
            Object[] objArr2 = new Object[(i2 * 2)];
            int[] iArr = new int[(i2 * 2)];
            String[] strArr = new String[(i2 * 2)];
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            System.arraycopy(this.f54810h, 0, iArr, 0, this.f54808f);
            System.arraycopy(this.f54809g, 0, strArr, 0, this.f54808f);
            this.f54807e = objArr2;
            this.f54810h = iArr;
            this.f54809g = strArr;
        }
        Object[] objArr3 = this.f54807e;
        int i3 = this.f54808f;
        this.f54808f = i3 + 1;
        objArr3[i3] = obj;
    }
}
