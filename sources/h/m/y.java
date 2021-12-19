package h.m;

import com.bytedance.covode.number.Covode;
import h.a.af;
import h.f.b.l;
import h.j.h;
import java.util.Iterator;

public class y extends x {
    static {
        Covode.recordClassIndex(105376);
    }

    public static final String i(String str) {
        l.d(str, "");
        String replace = str.replace('_', '.');
        l.b(replace, "");
        return replace;
    }

    public static final boolean a(CharSequence charSequence) {
        l.d(charSequence, "");
        if (charSequence.length() != 0) {
            Iterator it = p.e(charSequence).iterator();
            while (it.hasNext()) {
                if (!a.a(charSequence.charAt(((af) it).a()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final int e(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return str.compareToIgnoreCase(str2);
    }

    public static final String a(CharSequence charSequence, int i2) {
        l.d(charSequence, "");
        int i3 = 1;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i2 + '.').toString());
        } else if (i2 == 0) {
            return "";
        } else {
            if (i2 == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(charSequence.length() * i2);
                if (i2 > 0) {
                    while (true) {
                        sb.append(charSequence);
                        if (i3 == i2) {
                            break;
                        }
                        i3++;
                    }
                }
                String sb2 = sb.toString();
                l.b(sb2, "");
                return sb2;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                cArr[i4] = charAt;
            }
            return new String(cArr);
        }
    }

    public static final boolean b(String str, String str2, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        if (!z) {
            return str.startsWith(str2);
        }
        return p.a(str, 0, str2, 0, str2.length(), z);
    }

    public static final boolean c(String str, String str2, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        if (!z) {
            return str.endsWith(str2);
        }
        return p.a(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static final boolean a(String str, String str2, boolean z) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (!z) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    public static final String b(String str, String str2, String str3, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        int a2 = p.a(str, str2, 0, z, 2);
        if (a2 < 0) {
            return str;
        }
        return p.a(str, a2, str2.length() + a2, str3).toString();
    }

    public static final String a(String str, String str2, String str3, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        int i2 = 0;
        int a2 = p.a(str, str2, 0, z);
        if (a2 < 0) {
            return str;
        }
        int length = str2.length();
        int b2 = h.b(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i2, a2).append(str3);
                i2 = a2 + length;
                if (a2 >= str.length()) {
                    break;
                }
                a2 = p.a(str, str2, a2 + b2, z);
            } while (a2 > 0);
            String sb2 = sb.append((CharSequence) str, i2, str.length()).toString();
            l.b(sb2, "");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    public static final boolean a(String str, int i2, String str2, int i3, int i4, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        if (!z) {
            return str.regionMatches(i2, str2, i3, i4);
        }
        return str.regionMatches(z, i2, str2, i3, i4);
    }
}
