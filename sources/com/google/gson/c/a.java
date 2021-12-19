package com.google.gson.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.internal.bind.c;
import com.google.gson.internal.e;
import com.google.gson.r;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class a implements Closeable {

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f54667c = ")]}'\n".toCharArray();

    /* renamed from: a  reason: collision with root package name */
    public boolean f54668a;

    /* renamed from: b  reason: collision with root package name */
    int f54669b;

    /* renamed from: d  reason: collision with root package name */
    private final Reader f54670d;

    /* renamed from: e  reason: collision with root package name */
    private final char[] f54671e = new char[1024];

    /* renamed from: f  reason: collision with root package name */
    private int f54672f;

    /* renamed from: g  reason: collision with root package name */
    private int f54673g;

    /* renamed from: h  reason: collision with root package name */
    private int f54674h;

    /* renamed from: i  reason: collision with root package name */
    private int f54675i;

    /* renamed from: j  reason: collision with root package name */
    private long f54676j;

    /* renamed from: k  reason: collision with root package name */
    private int f54677k;

    /* renamed from: l  reason: collision with root package name */
    private String f54678l;

    /* renamed from: m  reason: collision with root package name */
    private int[] f54679m;
    private int n;
    private String[] o;
    private int[] p;

    private void u() {
        if (!this.f54668a) {
            throw b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    static {
        Covode.recordClassIndex(33916);
        e.f54868a = new e() {
            /* class com.google.gson.c.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(33917);
            }

            @Override // com.google.gson.internal.e
            public final void a(a aVar) {
                if (aVar instanceof c) {
                    c cVar = (c) aVar;
                    cVar.a(b.NAME);
                    Map.Entry entry = (Map.Entry) ((Iterator) cVar.g()).next();
                    cVar.a(entry.getValue());
                    cVar.a(new r((String) entry.getKey()));
                    return;
                }
                int i2 = aVar.f54669b;
                if (i2 == 0) {
                    i2 = aVar.q();
                }
                if (i2 == 13) {
                    aVar.f54669b = 9;
                } else if (i2 == 12) {
                    aVar.f54669b = 8;
                } else if (i2 == 14) {
                    aVar.f54669b = 10;
                } else {
                    throw new IllegalStateException("Expected a name but was " + aVar.f() + aVar.r());
                }
            }
        };
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f54669b = 0;
        this.f54679m[0] = 8;
        this.n = 1;
        this.f54670d.close();
    }

    public boolean e() {
        int i2 = this.f54669b;
        if (i2 == 0) {
            i2 = q();
        }
        if (i2 == 2 || i2 == 4) {
            return false;
        }
        return true;
    }

    public String toString() {
        return getClass().getSimpleName() + r();
    }

    private void v() {
        char c2;
        do {
            if (this.f54672f < this.f54673g || b(1)) {
                char[] cArr = this.f54671e;
                int i2 = this.f54672f;
                int i3 = i2 + 1;
                this.f54672f = i3;
                c2 = cArr[i2];
                if (c2 == '\n') {
                    this.f54674h++;
                    this.f54675i = i3;
                    return;
                }
            } else {
                return;
            }
        } while (c2 != '\r');
    }

    private void x() {
        a(true);
        int i2 = this.f54672f - 1;
        this.f54672f = i2;
        char[] cArr = f54667c;
        if (i2 + cArr.length <= this.f54673g || b(cArr.length)) {
            int i3 = 0;
            while (true) {
                char[] cArr2 = f54667c;
                if (i3 >= cArr2.length) {
                    this.f54672f += cArr2.length;
                    return;
                } else if (this.f54671e[this.f54672f + i3] == cArr2[i3]) {
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public void b() {
        int i2 = this.f54669b;
        if (i2 == 0) {
            i2 = q();
        }
        if (i2 == 4) {
            int i3 = this.n - 1;
            this.n = i3;
            int[] iArr = this.p;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f54669b = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + f() + r());
    }

    public void k() {
        int i2 = this.f54669b;
        if (i2 == 0) {
            i2 = q();
        }
        if (i2 == 7) {
            this.f54669b = 0;
            int[] iArr = this.p;
            int i3 = this.n - 1;
            iArr[i3] = iArr[i3] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + f() + r());
    }

    /* access modifiers changed from: package-private */
    public final String r() {
        int i2 = this.f54674h + 1;
        return " at line " + i2 + " column " + ((this.f54672f - this.f54675i) + 1) + " path " + p();
    }

    public void c() {
        int i2 = this.f54669b;
        if (i2 == 0) {
            i2 = q();
        }
        if (i2 == 1) {
            a(3);
            this.f54669b = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + f() + r());
    }

    public void d() {
        int i2 = this.f54669b;
        if (i2 == 0) {
            i2 = q();
        }
        if (i2 == 2) {
            int i3 = this.n - 1;
            this.n = i3;
            this.o[i3] = null;
            int[] iArr = this.p;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f54669b = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + f() + r());
    }

    public b f() {
        int i2 = this.f54669b;
        if (i2 == 0) {
            i2 = q();
        }
        switch (i2) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return b.BOOLEAN;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return b.NULL;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                return b.STRING;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
            case ABRConfig.ABR_SELECT_SCENE:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String h() {
        String b2;
        int i2 = this.f54669b;
        if (i2 == 0) {
            i2 = q();
        }
        if (i2 == 14) {
            b2 = t();
        } else if (i2 == 12) {
            b2 = b('\'');
        } else if (i2 == 13) {
            b2 = b('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + f() + r());
        }
        this.f54669b = 0;
        this.o[this.n - 1] = b2;
        return b2;
    }

    public boolean j() {
        int i2 = this.f54669b;
        if (i2 == 0) {
            i2 = q();
        }
        if (i2 == 5) {
            this.f54669b = 0;
            int[] iArr = this.p;
            int i3 = this.n - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.f54669b = 0;
            int[] iArr2 = this.p;
            int i4 = this.n - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + f() + r());
        }
    }

    public String p() {
        StringBuilder sb = new StringBuilder("$");
        int i2 = this.n;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.f54679m[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[').append(this.p[i3]).append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String[] strArr = this.o;
                if (strArr[i3] != null) {
                    sb.append(strArr[i3]);
                }
            }
        }
        return sb.toString();
    }

    private int g() {
        String str;
        String str2;
        int i2;
        char c2 = this.f54671e[this.f54672f];
        if (c2 == 't' || c2 == 'T') {
            i2 = 5;
            str = "true";
            str2 = "TRUE";
        } else if (c2 == 'f' || c2 == 'F') {
            i2 = 6;
            str = "false";
            str2 = "FALSE";
        } else if (c2 != 'n' && c2 != 'N') {
            return 0;
        } else {
            i2 = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        for (int i3 = 1; i3 < length; i3++) {
            if (this.f54672f + i3 >= this.f54673g && !b(i3 + 1)) {
                return 0;
            }
            char c3 = this.f54671e[this.f54672f + i3];
            if (!(c3 == str.charAt(i3) || c3 == str2.charAt(i3))) {
                return 0;
            }
        }
        if ((this.f54672f + length < this.f54673g || b(length + 1)) && a(this.f54671e[this.f54672f + length])) {
            return 0;
        }
        this.f54672f += length;
        this.f54669b = i2;
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d0, code lost:
        if (r15 == false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00df, code lost:
        if (r15 != false) goto L_0x00d3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int s() {
        /*
        // Method dump skipped, instructions count: 243
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.c.a.s():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0058, code lost:
        u();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String t() {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.c.a.t():java.lang.String");
    }

    private char w() {
        int i2;
        int i3;
        if (this.f54672f != this.f54673g || b(1)) {
            char[] cArr = this.f54671e;
            int i4 = this.f54672f;
            int i5 = i4 + 1;
            this.f54672f = i5;
            char c2 = cArr[i4];
            if (c2 == '\n') {
                this.f54674h++;
                this.f54675i = i5;
            } else if (!(c2 == '\"' || c2 == '\'' || c2 == '/' || c2 == '\\')) {
                if (c2 == 'b') {
                    return '\b';
                }
                if (c2 == 'f') {
                    return '\f';
                }
                if (c2 == 'n') {
                    return '\n';
                }
                if (c2 == 'r') {
                    return '\r';
                }
                if (c2 == 't') {
                    return '\t';
                }
                if (c2 != 'u') {
                    throw b("Invalid escape sequence");
                } else if (i5 + 4 <= this.f54673g || b(4)) {
                    char c3 = 0;
                    int i6 = this.f54672f;
                    int i7 = i6 + 4;
                    while (i6 < i7) {
                        char c4 = this.f54671e[i6];
                        char c5 = (char) (c3 << 4);
                        if (c4 < '0' || c4 > '9') {
                            if (c4 >= 'a' && c4 <= 'f') {
                                i2 = c4 - 'a';
                            } else if (c4 < 'A' || c4 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f54671e, this.f54672f, 4));
                            } else {
                                i2 = c4 - 'A';
                            }
                            i3 = i2 + 10;
                        } else {
                            i3 = c4 - '0';
                        }
                        c3 = (char) (c5 + i3);
                        i6++;
                    }
                    this.f54672f += 4;
                    return c3;
                } else {
                    throw b("Unterminated escape sequence");
                }
            }
            return c2;
        }
        throw b("Unterminated escape sequence");
    }

    public String i() {
        String str;
        int i2 = this.f54669b;
        if (i2 == 0) {
            i2 = q();
        }
        if (i2 == 10) {
            str = t();
        } else if (i2 == 8) {
            str = b('\'');
        } else if (i2 == 9) {
            str = b('\"');
        } else if (i2 == 11) {
            str = this.f54678l;
            this.f54678l = null;
        } else if (i2 == 15) {
            str = Long.toString(this.f54676j);
        } else if (i2 == 16) {
            str = new String(this.f54671e, this.f54672f, this.f54677k);
            this.f54672f += this.f54677k;
        } else {
            throw new IllegalStateException("Expected a string but was " + f() + r());
        }
        this.f54669b = 0;
        int[] iArr = this.p;
        int i3 = this.n - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    public double l() {
        char c2;
        int i2 = this.f54669b;
        if (i2 == 0) {
            i2 = q();
        }
        if (i2 == 15) {
            this.f54669b = 0;
            int[] iArr = this.p;
            int i3 = this.n - 1;
            iArr[i3] = iArr[i3] + 1;
            return (double) this.f54676j;
        }
        if (i2 == 16) {
            this.f54678l = new String(this.f54671e, this.f54672f, this.f54677k);
            this.f54672f += this.f54677k;
        } else {
            if (i2 == 8) {
                c2 = '\'';
            } else if (i2 == 9) {
                c2 = '\"';
            } else if (i2 == 10) {
                this.f54678l = t();
            } else if (i2 != 11) {
                throw new IllegalStateException("Expected a double but was " + f() + r());
            }
            this.f54678l = b(c2);
        }
        this.f54669b = 11;
        double parseDouble = Double.parseDouble(this.f54678l);
        if (this.f54668a || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f54678l = null;
            this.f54669b = 0;
            int[] iArr2 = this.p;
            int i4 = this.n - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return parseDouble;
        }
        throw new d("JSON forbids NaN and infinities: " + parseDouble + r());
    }

    public long m() {
        char c2;
        int i2 = this.f54669b;
        if (i2 == 0) {
            i2 = q();
        }
        if (i2 == 15) {
            this.f54669b = 0;
            int[] iArr = this.p;
            int i3 = this.n - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.f54676j;
        }
        if (i2 == 16) {
            this.f54678l = new String(this.f54671e, this.f54672f, this.f54677k);
            this.f54672f += this.f54677k;
        } else {
            if (i2 == 8) {
                c2 = '\'';
            } else if (i2 == 9) {
                c2 = '\"';
            } else if (i2 == 10) {
                this.f54678l = t();
                long parseLong = Long.parseLong(this.f54678l);
                this.f54669b = 0;
                int[] iArr2 = this.p;
                int i4 = this.n - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseLong;
            } else {
                throw new IllegalStateException("Expected a long but was " + f() + r());
            }
            this.f54678l = b(c2);
            try {
                long parseLong2 = Long.parseLong(this.f54678l);
                this.f54669b = 0;
                int[] iArr22 = this.p;
                int i42 = this.n - 1;
                iArr22[i42] = iArr22[i42] + 1;
                return parseLong2;
            } catch (NumberFormatException unused) {
            }
        }
        this.f54669b = 11;
        double parseDouble = Double.parseDouble(this.f54678l);
        long j2 = (long) parseDouble;
        if (((double) j2) == parseDouble) {
            this.f54678l = null;
            this.f54669b = 0;
            int[] iArr3 = this.p;
            int i5 = this.n - 1;
            iArr3[i5] = iArr3[i5] + 1;
            return j2;
        }
        throw new NumberFormatException("Expected a long but was " + this.f54678l + r());
    }

    public int n() {
        char c2;
        int i2 = this.f54669b;
        if (i2 == 0) {
            i2 = q();
        }
        if (i2 == 15) {
            long j2 = this.f54676j;
            int i3 = (int) j2;
            if (j2 == ((long) i3)) {
                this.f54669b = 0;
                int[] iArr = this.p;
                int i4 = this.n - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            throw new NumberFormatException("Expected an int but was " + this.f54676j + r());
        }
        if (i2 == 16) {
            this.f54678l = new String(this.f54671e, this.f54672f, this.f54677k);
            this.f54672f += this.f54677k;
        } else {
            if (i2 == 8) {
                c2 = '\'';
            } else if (i2 == 9) {
                c2 = '\"';
            } else if (i2 == 10) {
                this.f54678l = t();
                int parseInt = Integer.parseInt(this.f54678l);
                this.f54669b = 0;
                int[] iArr2 = this.p;
                int i5 = this.n - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } else {
                throw new IllegalStateException("Expected an int but was " + f() + r());
            }
            this.f54678l = b(c2);
            try {
                int parseInt2 = Integer.parseInt(this.f54678l);
                this.f54669b = 0;
                int[] iArr22 = this.p;
                int i52 = this.n - 1;
                iArr22[i52] = iArr22[i52] + 1;
                return parseInt2;
            } catch (NumberFormatException unused) {
            }
        }
        this.f54669b = 11;
        double parseDouble = Double.parseDouble(this.f54678l);
        int i6 = (int) parseDouble;
        if (((double) i6) == parseDouble) {
            this.f54678l = null;
            this.f54669b = 0;
            int[] iArr3 = this.p;
            int i7 = this.n - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return i6;
        }
        throw new NumberFormatException("Expected an int but was " + this.f54678l + r());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009d, code lost:
        u();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o() {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.c.a.o():void");
    }

    /* access modifiers changed from: package-private */
    public final int q() {
        int a2;
        int[] iArr = this.f54679m;
        int i2 = this.n;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else if (i3 == 2) {
            int a3 = a(true);
            if (a3 != 44) {
                if (a3 == 59) {
                    u();
                } else if (a3 == 93) {
                    this.f54669b = 4;
                    return 4;
                } else {
                    throw b("Unterminated array");
                }
            }
        } else if (i3 == 3 || i3 == 5) {
            iArr[i2 - 1] = 4;
            if (i3 == 5 && (a2 = a(true)) != 44) {
                if (a2 == 59) {
                    u();
                } else if (a2 == 125) {
                    this.f54669b = 2;
                    return 2;
                } else {
                    throw b("Unterminated object");
                }
            }
            int a4 = a(true);
            if (a4 == 34) {
                this.f54669b = 13;
                return 13;
            } else if (a4 == 39) {
                u();
                this.f54669b = 12;
                return 12;
            } else if (a4 != 125) {
                u();
                this.f54672f--;
                if (a((char) a4)) {
                    this.f54669b = 14;
                    return 14;
                }
                throw b("Expected name");
            } else if (i3 != 5) {
                this.f54669b = 2;
                return 2;
            } else {
                throw b("Expected name");
            }
        } else if (i3 == 4) {
            iArr[i2 - 1] = 5;
            int a5 = a(true);
            if (a5 != 58) {
                if (a5 == 61) {
                    u();
                    if (this.f54672f < this.f54673g || b(1)) {
                        char[] cArr = this.f54671e;
                        int i4 = this.f54672f;
                        if (cArr[i4] == '>') {
                            this.f54672f = i4 + 1;
                        }
                    }
                } else {
                    throw b("Expected ':'");
                }
            }
        } else if (i3 == 6) {
            if (this.f54668a) {
                x();
            }
            this.f54679m[this.n - 1] = 7;
        } else if (i3 == 7) {
            if (a(false) == -1) {
                this.f54669b = 17;
                return 17;
            }
            u();
            this.f54672f--;
        } else if (i3 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int a6 = a(true);
        if (a6 == 34) {
            this.f54669b = 9;
            return 9;
        } else if (a6 != 39) {
            if (!(a6 == 44 || a6 == 59)) {
                if (a6 == 91) {
                    this.f54669b = 3;
                    return 3;
                } else if (a6 != 93) {
                    if (a6 != 123) {
                        this.f54672f--;
                        int g2 = g();
                        if (g2 != 0) {
                            return g2;
                        }
                        int s = s();
                        if (s != 0) {
                            return s;
                        }
                        if (a(this.f54671e[this.f54672f])) {
                            u();
                            this.f54669b = 10;
                            return 10;
                        }
                        throw b("Expected value");
                    }
                    this.f54669b = 1;
                    return 1;
                } else if (i3 == 1) {
                    this.f54669b = 4;
                    return 4;
                }
            }
            if (i3 == 1 || i3 == 2) {
                u();
                this.f54672f--;
                this.f54669b = 7;
                return 7;
            }
            throw b("Unexpected value");
        } else {
            u();
            this.f54669b = 8;
            return 8;
        }
    }

    public void a() {
        int i2 = this.f54669b;
        if (i2 == 0) {
            i2 = q();
        }
        if (i2 == 3) {
            a(1);
            this.p[this.n - 1] = 0;
            this.f54669b = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + f() + r());
    }

    private IOException b(String str) {
        throw new d(str + r());
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f54679m = iArr;
        int i2 = this.n;
        this.n = i2 + 1;
        iArr[i2] = 6;
        this.o = new String[32];
        this.p = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f54670d = reader;
    }

    private void a(int i2) {
        int i3 = this.n;
        int[] iArr = this.f54679m;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[(i3 * 2)];
            int[] iArr3 = new int[(i3 * 2)];
            String[] strArr = new String[(i3 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            System.arraycopy(this.p, 0, iArr3, 0, this.n);
            System.arraycopy(this.o, 0, strArr, 0, this.n);
            this.f54679m = iArr2;
            this.p = iArr3;
            this.o = strArr;
        }
        int[] iArr4 = this.f54679m;
        int i4 = this.n;
        this.n = i4 + 1;
        iArr4[i4] = i2;
    }

    private void c(char c2) {
        char[] cArr = this.f54671e;
        while (true) {
            int i2 = this.f54672f;
            int i3 = this.f54673g;
            while (true) {
                if (i2 < i3) {
                    int i4 = i2 + 1;
                    char c3 = cArr[i2];
                    if (c3 == c2) {
                        this.f54672f = i4;
                        return;
                    } else if (c3 == '\\') {
                        this.f54672f = i4;
                        w();
                        break;
                    } else {
                        if (c3 == '\n') {
                            this.f54674h++;
                            this.f54675i = i4;
                        }
                        i2 = i4;
                    }
                } else {
                    this.f54672f = i2;
                    if (!b(1)) {
                        throw b("Unterminated string");
                    }
                }
            }
        }
    }

    private boolean a(char c2) {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (!(c2 == '/' || c2 == '=')) {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        u();
        return false;
    }

    private String b(char c2) {
        char[] cArr = this.f54671e;
        StringBuilder sb = null;
        while (true) {
            int i2 = this.f54672f;
            int i3 = this.f54673g;
            int i4 = i2;
            while (true) {
                if (i4 < i3) {
                    int i5 = i4 + 1;
                    char c3 = cArr[i4];
                    if (c3 == c2) {
                        this.f54672f = i5;
                        int i6 = (i5 - i2) - 1;
                        if (sb == null) {
                            return new String(cArr, i2, i6);
                        }
                        sb.append(cArr, i2, i6);
                        return sb.toString();
                    } else if (c3 == '\\') {
                        this.f54672f = i5;
                        int i7 = (i5 - i2) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i7 + 1) * 2, 16));
                        }
                        sb.append(cArr, i2, i7);
                        sb.append(w());
                    } else {
                        if (c3 == '\n') {
                            this.f54674h++;
                            this.f54675i = i5;
                        }
                        i4 = i5;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i4 - i2) * 2, 16));
                    }
                    sb.append(cArr, i2, i4 - i2);
                    this.f54672f = i4;
                    if (!b(1)) {
                        throw b("Unterminated string");
                    }
                }
            }
        }
    }

    private int a(boolean z) {
        char[] cArr = this.f54671e;
        int i2 = this.f54672f;
        int i3 = this.f54673g;
        while (true) {
            if (i2 == i3) {
                this.f54672f = i2;
                if (b(1)) {
                    i2 = this.f54672f;
                    i3 = this.f54673g;
                } else if (!z) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + r());
                }
            }
            int i4 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 == '\n') {
                this.f54674h++;
                this.f54675i = i4;
            } else if (!(c2 == ' ' || c2 == '\r' || c2 == '\t')) {
                if (c2 == '/') {
                    this.f54672f = i4;
                    if (i4 == i3) {
                        this.f54672f = i4 - 1;
                        boolean b2 = b(2);
                        this.f54672f++;
                        if (!b2) {
                            return c2;
                        }
                    }
                    u();
                    int i5 = this.f54672f;
                    char c3 = cArr[i5];
                    if (c3 == '*') {
                        this.f54672f = i5 + 1;
                        if (a("*/")) {
                            i2 = this.f54672f + 2;
                            i3 = this.f54673g;
                        } else {
                            throw b("Unterminated comment");
                        }
                    } else if (c3 != '/') {
                        return c2;
                    } else {
                        this.f54672f = i5 + 1;
                        v();
                        i2 = this.f54672f;
                        i3 = this.f54673g;
                    }
                } else if (c2 == '#') {
                    this.f54672f = i4;
                    u();
                    v();
                    i2 = this.f54672f;
                    i3 = this.f54673g;
                } else {
                    this.f54672f = i4;
                    return c2;
                }
            }
            i2 = i4;
        }
    }

    private boolean b(int i2) {
        int i3;
        MethodCollector.i(6745);
        char[] cArr = this.f54671e;
        int i4 = this.f54675i;
        int i5 = this.f54672f;
        this.f54675i = i4 - i5;
        int i6 = this.f54673g;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f54673g = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f54673g = 0;
        }
        this.f54672f = 0;
        do {
            Reader reader = this.f54670d;
            int i8 = this.f54673g;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read != -1) {
                i3 = this.f54673g + read;
                this.f54673g = i3;
                if (this.f54674h == 0 && this.f54675i == 0 && i3 > 0 && cArr[0] == 65279) {
                    this.f54672f++;
                    this.f54675i = 1;
                    i2++;
                    continue;
                }
            } else {
                MethodCollector.o(6745);
                return false;
            }
        } while (i3 < i2);
        MethodCollector.o(6745);
        return true;
    }

    private boolean a(String str) {
        int length = str.length();
        while (true) {
            if (this.f54672f + length > this.f54673g && !b(length)) {
                return false;
            }
            char[] cArr = this.f54671e;
            int i2 = this.f54672f;
            if (cArr[i2] == '\n') {
                this.f54674h++;
                this.f54675i = i2 + 1;
            } else {
                for (int i3 = 0; i3 < length; i3++) {
                    if (this.f54671e[this.f54672f + i3] == str.charAt(i3)) {
                    }
                }
                return true;
            }
            this.f54672f++;
        }
    }
}
