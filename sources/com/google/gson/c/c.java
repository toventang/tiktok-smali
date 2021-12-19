package com.google.gson.c;

import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

public class c implements Closeable, Flushable {

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f54681e = new String[128];

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f54682f;

    /* renamed from: a  reason: collision with root package name */
    public final Writer f54683a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f54684b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f54685c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f54686d;

    /* renamed from: g  reason: collision with root package name */
    private int[] f54687g = new int[32];

    /* renamed from: h  reason: collision with root package name */
    private int f54688h;

    /* renamed from: i  reason: collision with root package name */
    private String f54689i;

    /* renamed from: j  reason: collision with root package name */
    private String f54690j;

    /* renamed from: k  reason: collision with root package name */
    private String f54691k;

    public c a(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f54691k != null) {
            throw new IllegalStateException();
        } else if (this.f54688h != 0) {
            this.f54691k = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public c a(boolean z) {
        MethodCollector.i(6924);
        g();
        h();
        this.f54683a.write(z ? "true" : "false");
        MethodCollector.o(6924);
        return this;
    }

    public c a(Number number) {
        if (number == null) {
            return f();
        }
        g();
        String obj = number.toString();
        if (this.f54684b || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            h();
            this.f54683a.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(number)));
    }

    public c c() {
        return a(1, 2, "]");
    }

    public c d() {
        g();
        return a(3, "{");
    }

    public c e() {
        return a(3, 5, "}");
    }

    public final void g() {
        if (this.f54691k != null) {
            j();
            d(this.f54691k);
            this.f54691k = null;
        }
    }

    private int a() {
        int i2 = this.f54688h;
        if (i2 != 0) {
            return this.f54687g[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c b() {
        g();
        return a(1, "[");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f54683a.close();
        int i2 = this.f54688h;
        if (i2 > 1 || (i2 == 1 && this.f54687g[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f54688h = 0;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f54688h != 0) {
            this.f54683a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void i() {
        MethodCollector.i(7024);
        if (this.f54689i == null) {
            MethodCollector.o(7024);
            return;
        }
        this.f54683a.write("\n");
        int i2 = this.f54688h;
        for (int i3 = 1; i3 < i2; i3++) {
            this.f54683a.write(this.f54689i);
        }
        MethodCollector.o(7024);
    }

    private void j() {
        MethodCollector.i(7034);
        int a2 = a();
        if (a2 == 5) {
            this.f54683a.write(44);
        } else if (a2 != 3) {
            IllegalStateException illegalStateException = new IllegalStateException("Nesting problem.");
            MethodCollector.o(7034);
            throw illegalStateException;
        }
        i();
        b(4);
        MethodCollector.o(7034);
    }

    public c f() {
        MethodCollector.i(6922);
        if (this.f54691k != null) {
            if (this.f54686d) {
                g();
            } else {
                this.f54691k = null;
                MethodCollector.o(6922);
                return this;
            }
        }
        h();
        this.f54683a.write("null");
        MethodCollector.o(6922);
        return this;
    }

    static {
        Covode.recordClassIndex(33919);
        int i2 = 0;
        do {
            f54681e[i2] = a.a("\\u%04x", new Object[]{Integer.valueOf(i2)});
            i2++;
        } while (i2 <= 31);
        String[] strArr = f54681e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f54682f = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public final void h() {
        int a2 = a();
        if (a2 == 1) {
            b(2);
            i();
        } else if (a2 == 2) {
            this.f54683a.append(',');
            i();
        } else if (a2 != 4) {
            if (a2 != 6) {
                if (a2 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f54684b) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            b(7);
        } else {
            this.f54683a.append((CharSequence) this.f54690j);
            b(5);
        }
    }

    private void b(int i2) {
        this.f54687g[this.f54688h - 1] = i2;
    }

    public c(Writer writer) {
        a(6);
        this.f54690j = ":";
        this.f54686d = true;
        Objects.requireNonNull(writer, "out == null");
        this.f54683a = writer;
    }

    public final void c(String str) {
        if (str.length() == 0) {
            this.f54689i = null;
            this.f54690j = ":";
            return;
        }
        this.f54689i = str;
        this.f54690j = ": ";
    }

    public c b(String str) {
        if (str == null) {
            return f();
        }
        g();
        h();
        d(str);
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d(java.lang.String r10) {
        /*
            r9 = this;
            r8 = 6954(0x1b2a, float:9.745E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r8)
            boolean r0 = r9.f54685c
            if (r0 == 0) goto L_0x0047
            java.lang.String[] r7 = com.google.gson.c.c.f54682f
        L_0x000b:
            java.io.Writer r0 = r9.f54683a
            java.lang.String r6 = "\""
            r0.write(r6)
            int r5 = r10.length()
            r4 = 0
            r3 = 0
        L_0x0018:
            if (r4 >= r5) goto L_0x004a
            char r1 = r10.charAt(r4)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 >= r0) goto L_0x0029
            r2 = r7[r1]
            if (r2 != 0) goto L_0x002f
        L_0x0026:
            int r4 = r4 + 1
            goto L_0x0018
        L_0x0029:
            r0 = 8232(0x2028, float:1.1535E-41)
            if (r1 != r0) goto L_0x0040
            java.lang.String r2 = "\\u2028"
        L_0x002f:
            if (r3 >= r4) goto L_0x0038
            java.io.Writer r1 = r9.f54683a
            int r0 = r4 - r3
            r1.write(r10, r3, r0)
        L_0x0038:
            java.io.Writer r0 = r9.f54683a
            r0.write(r2)
            int r3 = r4 + 1
            goto L_0x0026
        L_0x0040:
            r0 = 8233(0x2029, float:1.1537E-41)
            if (r1 != r0) goto L_0x0026
            java.lang.String r2 = "\\u2029"
            goto L_0x002f
        L_0x0047:
            java.lang.String[] r7 = com.google.gson.c.c.f54681e
            goto L_0x000b
        L_0x004a:
            if (r3 >= r5) goto L_0x0052
            java.io.Writer r0 = r9.f54683a
            int r5 = r5 - r3
            r0.write(r10, r3, r5)
        L_0x0052:
            java.io.Writer r0 = r9.f54683a
            r0.write(r6)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.c.c.d(java.lang.String):void");
    }

    private void a(int i2) {
        int i3 = this.f54688h;
        int[] iArr = this.f54687g;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[(i3 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f54687g = iArr2;
        }
        int[] iArr3 = this.f54687g;
        int i4 = this.f54688h;
        this.f54688h = i4 + 1;
        iArr3[i4] = i2;
    }

    public c a(double d2) {
        g();
        if (this.f54684b || (!Double.isNaN(d2) && !Double.isInfinite(d2))) {
            h();
            this.f54683a.append((CharSequence) Double.toString(d2));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(d2)));
    }

    public c a(long j2) {
        MethodCollector.i(6934);
        g();
        h();
        this.f54683a.write(Long.toString(j2));
        MethodCollector.o(6934);
        return this;
    }

    public c a(Boolean bool) {
        String str;
        MethodCollector.i(6929);
        if (bool == null) {
            c f2 = f();
            MethodCollector.o(6929);
            return f2;
        }
        g();
        h();
        Writer writer = this.f54683a;
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
        MethodCollector.o(6929);
        return this;
    }

    private c a(int i2, String str) {
        MethodCollector.i(6912);
        h();
        a(i2);
        this.f54683a.write(str);
        MethodCollector.o(6912);
        return this;
    }

    private c a(int i2, int i3, String str) {
        MethodCollector.i(6916);
        int a2 = a();
        if (a2 != i3 && a2 != i2) {
            IllegalStateException illegalStateException = new IllegalStateException("Nesting problem.");
            MethodCollector.o(6916);
            throw illegalStateException;
        } else if (this.f54691k == null) {
            this.f54688h--;
            if (a2 == i3) {
                i();
            }
            this.f54683a.write(str);
            MethodCollector.o(6916);
            return this;
        } else {
            IllegalStateException illegalStateException2 = new IllegalStateException("Dangling name: " + this.f54691k);
            MethodCollector.o(6916);
            throw illegalStateException2;
        }
    }
}
