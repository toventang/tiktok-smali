package com.bytedance.frameworks.baselib.network.http.e;

import com.bytedance.covode.number.Covode;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;

public class b {

    /* renamed from: a  reason: collision with root package name */
    Hashtable f29342a = new Hashtable();

    static {
        Covode.recordClassIndex(17112);
    }

    public b() {
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.ensureCapacity(this.f29342a.size() * 16);
        Enumeration keys = this.f29342a.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            stringBuffer.append("; ");
            stringBuffer.append(str);
            stringBuffer.append('=');
            stringBuffer.append(b((String) this.f29342a.get(str)));
        }
        return stringBuffer.toString();
    }

    public b(String str) {
        a(str);
    }

    private static boolean a(char c2) {
        if (c2 <= ' ' || c2 >= 127 || "()<>@,;:/[]?=\\\"".indexOf(c2) >= 0) {
            return false;
        }
        return true;
    }

    private static String b(String str) {
        int length = str.length();
        int i2 = 0;
        boolean z = false;
        while (true) {
            if (i2 < length) {
                if (z) {
                    break;
                }
                z = !a(str.charAt(i2));
                i2++;
            } else if (!z) {
                return str;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        double d2 = (double) length;
        Double.isNaN(d2);
        stringBuffer.ensureCapacity((int) (d2 * 1.5d));
        stringBuffer.append('\"');
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '\\' || charAt == '\"') {
                stringBuffer.append('\\');
            }
            stringBuffer.append(charAt);
        }
        stringBuffer.append('\"');
        return stringBuffer.toString();
    }

    private void a(String str) {
        int length;
        String str2;
        int i2;
        if (str != null && (length = str.length()) > 0) {
            int a2 = a(str, 0);
            while (a2 < length && str.charAt(a2) == ';') {
                int a3 = a(str, a2 + 1);
                if (a3 < length) {
                    int i3 = a3;
                    while (i3 < length && a(str.charAt(i3))) {
                        i3++;
                    }
                    String lowerCase = str.substring(a3, i3).toLowerCase(Locale.ENGLISH);
                    int a4 = a(str, i3);
                    if (a4 >= length || str.charAt(a4) != '=') {
                        throw new c("Couldn't find the '=' that separates a parameter name from its value.");
                    }
                    int a5 = a(str, a4 + 1);
                    if (a5 < length) {
                        char charAt = str.charAt(a5);
                        if (charAt == '\"') {
                            int i4 = a5 + 1;
                            if (i4 < length) {
                                int i5 = i4;
                                while (true) {
                                    if (i5 < length) {
                                        charAt = str.charAt(i5);
                                        if (charAt == '\"') {
                                            break;
                                        }
                                        if (charAt == '\\') {
                                            i5++;
                                        }
                                        i5++;
                                    } else if (charAt != '\"') {
                                        throw new c("Encountered unterminated quoted parameter value.");
                                    }
                                }
                                String substring = str.substring(i4, i5);
                                int length2 = substring.length();
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.ensureCapacity(length2);
                                boolean z = false;
                                for (int i6 = 0; i6 < length2; i6++) {
                                    char charAt2 = substring.charAt(i6);
                                    if (z) {
                                        stringBuffer.append(charAt2);
                                        z = false;
                                    } else if (charAt2 != '\\') {
                                        stringBuffer.append(charAt2);
                                    } else {
                                        z = true;
                                    }
                                }
                                str2 = stringBuffer.toString();
                                i2 = i5 + 1;
                            } else {
                                throw new c("Encountered unterminated quoted parameter value.");
                            }
                        } else if (a(charAt)) {
                            i2 = a5;
                            while (i2 < length && a(str.charAt(i2))) {
                                i2++;
                            }
                            str2 = str.substring(a5, i2);
                        } else {
                            throw new c("Unexpected character encountered at index ".concat(String.valueOf(a5)));
                        }
                        this.f29342a.put(lowerCase, str2);
                        a2 = a(str, i2);
                    } else {
                        throw new c("Couldn't find a value for parameter named ".concat(String.valueOf(lowerCase)));
                    }
                } else {
                    return;
                }
            }
            if (a2 < length) {
                throw new c("More characters encountered in input than expected.");
            }
        }
    }

    private static int a(String str, int i2) {
        int length = str.length();
        while (i2 < length && Character.isWhitespace(str.charAt(i2))) {
            i2++;
        }
        return i2;
    }
}
