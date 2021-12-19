package com.squareup.a.a.d;

import com.appsflyer.BuildConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.AudiencePingIntervalSetting;
import com.bytedance.covode.number.Covode;
import javax.security.auth.x500.X500Principal;

final class c {

    /* renamed from: a  reason: collision with root package name */
    final String f57743a;

    /* renamed from: b  reason: collision with root package name */
    final int f57744b;

    /* renamed from: c  reason: collision with root package name */
    int f57745c;

    /* renamed from: d  reason: collision with root package name */
    int f57746d;

    /* renamed from: e  reason: collision with root package name */
    int f57747e;

    /* renamed from: f  reason: collision with root package name */
    int f57748f;

    /* renamed from: g  reason: collision with root package name */
    char[] f57749g;

    static {
        Covode.recordClassIndex(35970);
    }

    private char e() {
        int i2;
        int i3;
        int a2 = a(this.f57745c);
        this.f57745c++;
        if (a2 < 128) {
            return (char) a2;
        }
        if (a2 < 192 || a2 > 247) {
            return '?';
        }
        if (a2 <= 223) {
            i3 = a2 & 31;
            i2 = 1;
        } else if (a2 <= 239) {
            i2 = 2;
            i3 = a2 & 15;
        } else {
            i2 = 3;
            i3 = a2 & 7;
        }
        int i4 = 0;
        do {
            int i5 = this.f57745c + 1;
            this.f57745c = i5;
            if (i5 == this.f57744b || this.f57749g[i5] != '\\') {
                return '?';
            }
            int i6 = i5 + 1;
            this.f57745c = i6;
            int a3 = a(i6);
            this.f57745c++;
            if ((a3 & 192) != 128) {
                return '?';
            }
            i3 = (i3 << 6) + (a3 & 63);
            i4++;
        } while (i4 < i2);
        return (char) i3;
    }

    /* access modifiers changed from: package-private */
    public final char d() {
        int i2 = this.f57745c + 1;
        this.f57745c = i2;
        if (i2 != this.f57744b) {
            char[] cArr = this.f57749g;
            char c2 = cArr[i2];
            if (!(c2 == ' ' || c2 == '%' || c2 == '\\' || c2 == '_' || c2 == '\"' || c2 == '#')) {
                switch (c2) {
                    case '*':
                    case '+':
                    case BuildConfig.VERSION_CODE:
                        break;
                    default:
                        switch (c2) {
                            case ';':
                            case AudiencePingIntervalSetting.DEFAULT:
                            case '=':
                            case '>':
                                break;
                            default:
                                return e();
                        }
                }
            }
            return cArr[i2];
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f57743a);
    }

    /* access modifiers changed from: package-private */
    public final String b() {
        int i2;
        int i3 = this.f57745c;
        if (i3 + 4 < this.f57744b) {
            this.f57746d = i3;
            this.f57745c = i3 + 1;
            while (true) {
                i2 = this.f57745c;
                if (i2 == this.f57744b) {
                    break;
                }
                char[] cArr = this.f57749g;
                if (cArr[i2] == '+' || cArr[i2] == ',' || cArr[i2] == ';') {
                    break;
                } else if (cArr[i2] == ' ') {
                    this.f57747e = i2;
                    this.f57745c = i2 + 1;
                    while (true) {
                        int i4 = this.f57745c;
                        if (i4 >= this.f57744b || this.f57749g[i4] != ' ') {
                            break;
                        }
                        this.f57745c = i4 + 1;
                    }
                } else {
                    if (cArr[i2] >= 'A' && cArr[i2] <= 'F') {
                        cArr[i2] = (char) (cArr[i2] + ' ');
                    }
                    this.f57745c = i2 + 1;
                }
            }
            this.f57747e = i2;
            int i5 = this.f57747e;
            int i6 = this.f57746d;
            int i7 = i5 - i6;
            if (i7 < 5 || (i7 & 1) == 0) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f57743a);
            }
            int i8 = i7 / 2;
            byte[] bArr = new byte[i8];
            int i9 = i6 + 1;
            for (int i10 = 0; i10 < i8; i10++) {
                bArr[i10] = (byte) a(i9);
                i9 += 2;
            }
            return new String(this.f57749g, this.f57746d, i7);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f57743a);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0097, code lost:
        r2 = r8.f57749g;
        r1 = r8.f57746d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a3, code lost:
        return new java.lang.String(r2, r1, r8.f57747e - r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String c() {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.a.a.d.c.c():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a() {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.a.a.d.c.a():java.lang.String");
    }

    public c(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f57743a = name;
        this.f57744b = name.length();
    }

    private int a(int i2) {
        int i3;
        int i4;
        int i5 = i2 + 1;
        if (i5 < this.f57744b) {
            char[] cArr = this.f57749g;
            char c2 = cArr[i2];
            if (c2 >= '0' && c2 <= '9') {
                i3 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i3 = c2 - 'W';
            } else if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f57743a);
            } else {
                i3 = c2 - '7';
            }
            char c3 = cArr[i5];
            if (c3 >= '0' && c3 <= '9') {
                i4 = c3 - '0';
            } else if (c3 >= 'a' && c3 <= 'f') {
                i4 = c3 - 'W';
            } else if (c3 < 'A' || c3 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f57743a);
            } else {
                i4 = c3 - '7';
            }
            return (i3 << 4) + i4;
        }
        throw new IllegalStateException("Malformed DN: " + this.f57743a);
    }
}
