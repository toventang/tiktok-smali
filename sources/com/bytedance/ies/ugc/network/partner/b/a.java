package com.bytedance.ies.ugc.network.partner.b;

import com.bytedance.covode.number.Covode;
import java.io.EOFException;
import k.f;
import okhttp3.internal.Util;

/* access modifiers changed from: package-private */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final char[] f35257a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    static {
        Covode.recordClassIndex(21127);
    }

    static String a(String str, boolean z) {
        return a(str, 0, str.length(), z);
    }

    static String a(String str, String str2, boolean z, boolean z2) {
        return a(str, 0, str.length(), str2, false, z, z2);
    }

    static String a(String str, int i2, int i3, boolean z) {
        int i4 = i2;
        while (i4 < i3) {
            char charAt = str.charAt(i4);
            if (charAt == '%' || (charAt == '+' && z)) {
                f fVar = new f();
                fVar.a(str, i2, i4);
                while (i4 < i3) {
                    int codePointAt = str.codePointAt(i4);
                    if (codePointAt == 37) {
                        int i5 = i4 + 2;
                        if (i5 < i3) {
                            int decodeHexDigit = Util.decodeHexDigit(str.charAt(i4 + 1));
                            int decodeHexDigit2 = Util.decodeHexDigit(str.charAt(i5));
                            if (!(decodeHexDigit == -1 || decodeHexDigit2 == -1)) {
                                fVar.a((decodeHexDigit << 4) + decodeHexDigit2);
                                i4 = i5;
                            }
                        }
                        fVar.e(codePointAt);
                    } else {
                        if (codePointAt == 43 && z) {
                            fVar.a(32);
                        }
                        fVar.e(codePointAt);
                    }
                    i4 += Character.charCount(codePointAt);
                }
                return fVar.r();
            }
            i4++;
        }
        return str.substring(i2, i3);
    }

    static String a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3) {
        String str3;
        int i4 = i2;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z3) || str2.indexOf(codePointAt) != -1 || ((codePointAt == 37 && !z) || (codePointAt == 43 && z2)))) {
                f fVar = new f();
                fVar.a(str, i2, i4);
                f fVar2 = null;
                while (i4 < i3) {
                    int codePointAt2 = str.codePointAt(i4);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 == 43 && z2) {
                            if (z) {
                                str3 = "+";
                            } else {
                                str3 = "%2B";
                            }
                            fVar.a(str3);
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z3) || str2.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && !z))) {
                            if (fVar2 == null) {
                                fVar2 = new f();
                            }
                            fVar2.e(codePointAt2);
                            while (!fVar2.e()) {
                                try {
                                    int h2 = fVar2.h() & 255;
                                    fVar.a(37);
                                    char[] cArr = f35257a;
                                    fVar.a((int) cArr[(h2 >> 4) & 15]);
                                    fVar.a((int) cArr[h2 & 15]);
                                } catch (EOFException e2) {
                                    throw new RuntimeException(e2);
                                }
                            }
                        } else {
                            fVar.e(codePointAt2);
                        }
                    }
                    i4 += Character.charCount(codePointAt2);
                }
                return fVar.r();
            }
            i4 += Character.charCount(codePointAt);
        }
        return str.substring(i2, i3);
    }
}
