package com.bytedance.ies.ugc.network.partner.b;

import com.bytedance.covode.number.Covode;
import java.security.InvalidParameterException;
import java.util.Objects;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public String f35293a;

    /* renamed from: b  reason: collision with root package name */
    public String f35294b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f35295c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f35296d;

    /* renamed from: e  reason: collision with root package name */
    public final d f35297e = new d();

    /* renamed from: f  reason: collision with root package name */
    public final e f35298f = new e();

    /* renamed from: g  reason: collision with root package name */
    public String f35299g;

    /* renamed from: h  reason: collision with root package name */
    private int f35300h = -1;

    /* renamed from: i  reason: collision with root package name */
    private String f35301i;

    static {
        Covode.recordClassIndex(21135);
    }

    public final String toString() {
        return a();
    }

    private String d() {
        if ("http".equals(this.f35293a)) {
            return "http";
        }
        return "https";
    }

    private int e() {
        int i2 = this.f35300h;
        if (i2 != -1) {
            return i2;
        }
        return HttpUrl.defaultPort(d());
    }

    private h() {
    }

    private String b() {
        if (this.f35294b.isEmpty()) {
            return "";
        }
        return a.a(this.f35294b, " \"':;<=>@[]^`{}|/\\?#", false, true);
    }

    private String c() {
        if (this.f35295c.isEmpty()) {
            return "";
        }
        return a.a(this.f35295c, " \"':;<=>@[]^`{}|/\\?#", false, true);
    }

    /* access modifiers changed from: package-private */
    public enum a {
        SUCCESS,
        MISSING_SCHEME,
        UNSUPPORTED_SCHEME,
        INVALID_PORT,
        INVALID_HOST;

        static {
            Covode.recordClassIndex(21136);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(d());
        sb.append("://");
        if (!this.f35294b.isEmpty() || !this.f35295c.isEmpty()) {
            sb.append(b());
            String c2 = c();
            if (!c2.isEmpty()) {
                sb.append(':');
                sb.append(c2);
            }
            sb.append('@');
        }
        if (this.f35296d.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.f35296d);
            sb.append(']');
        } else {
            sb.append(this.f35296d);
        }
        int e2 = e();
        if (e2 != HttpUrl.defaultPort(d())) {
            sb.append(':');
            sb.append(e2);
        }
        this.f35297e.a(sb);
        this.f35298f.a(sb);
        if (this.f35301i != null) {
            sb.append('#');
            sb.append(a.a(this.f35301i, "", false, false));
        }
        return sb.toString();
    }

    public static h a(String str) {
        Objects.requireNonNull(str, "URL must not be null.");
        h hVar = new h();
        a c2 = hVar.c(str);
        if (a.SUCCESS.equals(c2)) {
            return hVar;
        }
        throw new InvalidParameterException(c2.name());
    }

    public final h b(String str) {
        Objects.requireNonNull(str, "host == null");
        String b2 = b.b(str, 0, str.length());
        if (b2 != null) {
            this.f35296d = b2;
            return this;
        }
        throw new IllegalArgumentException("unexpected host: ".concat(String.valueOf(str)));
    }

    private a c(String str) {
        char c2;
        char c3;
        int delimiterOffset;
        char c4;
        char c5;
        char charAt;
        this.f35299g = str;
        int skipLeadingAsciiWhitespace = Util.skipLeadingAsciiWhitespace(str, 0, str.length());
        int skipTrailingAsciiWhitespace = Util.skipTrailingAsciiWhitespace(str, skipLeadingAsciiWhitespace, str.length());
        if (str.regionMatches(true, skipLeadingAsciiWhitespace, "https:", 0, 6)) {
            this.f35293a = "https";
            skipLeadingAsciiWhitespace += 6;
        } else if (str.regionMatches(true, skipLeadingAsciiWhitespace, "http:", 0, 5)) {
            this.f35293a = "http";
            skipLeadingAsciiWhitespace += 5;
        } else {
            this.f35293a = d();
        }
        int i2 = skipLeadingAsciiWhitespace;
        int i3 = 0;
        while (true) {
            c2 = '/';
            c3 = '\\';
            if (i2 >= skipTrailingAsciiWhitespace || !((charAt = str.charAt(i2)) == '\\' || charAt == '/')) {
                int i4 = skipLeadingAsciiWhitespace + i3;
                String str2 = "";
                String str3 = str2;
                boolean z = false;
                boolean z2 = false;
            } else {
                i3++;
                i2++;
            }
        }
        int i42 = skipLeadingAsciiWhitespace + i3;
        String str22 = "";
        String str32 = str22;
        boolean z3 = false;
        boolean z22 = false;
        while (true) {
            delimiterOffset = Util.delimiterOffset(str, i42, skipTrailingAsciiWhitespace, "@/\\?#");
            if (delimiterOffset != skipTrailingAsciiWhitespace) {
                c4 = str.charAt(delimiterOffset);
            } else {
                c4 = 65535;
            }
            if (c4 == 65535 || c4 == '#' || c4 == c2 || c4 == c3 || c4 == '?') {
                int c6 = b.c(str, i42, delimiterOffset);
                int i5 = c6 + 1;
            } else if (c4 == '@') {
                if (!z3) {
                    int delimiterOffset2 = Util.delimiterOffset(str, i42, delimiterOffset, ':');
                    String a2 = a.a(str, i42, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                    if (z22) {
                        a2 = str32 + "%40" + a2;
                    }
                    if (delimiterOffset2 != delimiterOffset) {
                        str22 = a.a(str, delimiterOffset2 + 1, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                        z3 = true;
                    }
                    str32 = a2;
                    z22 = true;
                } else {
                    str22 = str22 + "%40" + a.a(str, i42, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                }
                i42 = delimiterOffset + 1;
                c2 = '/';
                c3 = '\\';
            }
        }
        int c62 = b.c(str, i42, delimiterOffset);
        int i52 = c62 + 1;
        if (i52 < delimiterOffset) {
            this.f35296d = b.b(str, i42, c62);
            int a3 = b.a(str, i52, delimiterOffset);
            this.f35300h = a3;
            if (a3 == -1) {
                return a.INVALID_PORT;
            }
        } else {
            this.f35296d = b.b(str, i42, c62);
            this.f35300h = HttpUrl.defaultPort(d());
        }
        if (this.f35296d == null) {
            return a.INVALID_HOST;
        }
        this.f35294b = a.a(str32, false);
        this.f35295c = a.a(str22, false);
        int delimiterOffset3 = Util.delimiterOffset(str, delimiterOffset, skipTrailingAsciiWhitespace, "?#");
        this.f35297e.a(str, delimiterOffset, delimiterOffset3);
        if (delimiterOffset3 >= skipTrailingAsciiWhitespace || str.charAt(delimiterOffset3) != '?') {
            c5 = '#';
        } else {
            int delimiterOffset4 = Util.delimiterOffset(str, delimiterOffset3, skipTrailingAsciiWhitespace, '#');
            c5 = '#';
            this.f35298f.c(a.a(str, delimiterOffset3 + 1, delimiterOffset4, " \"'<>#", true, true, true));
            delimiterOffset3 = delimiterOffset4;
        }
        if (delimiterOffset3 < skipTrailingAsciiWhitespace && str.charAt(delimiterOffset3) == c5) {
            this.f35301i = a.a(a.a(str, delimiterOffset3 + 1, skipTrailingAsciiWhitespace, "", true, false, false), false);
        }
        return a.SUCCESS;
    }

    /* access modifiers changed from: package-private */
    public static class b {
        static {
            Covode.recordClassIndex(21137);
        }

        public static String b(String str, int i2, int i3) {
            return Util.canonicalizeHost(a.a(str, i2, i3, false));
        }

        static int a(String str, int i2, int i3) {
            try {
                int parseInt = Integer.parseInt(a.a(str, i2, i3, "", false, false, true));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        public static int c(String str, int i2, int i3) {
            while (i2 < i3) {
                char charAt = str.charAt(i2);
                if (charAt == ':') {
                    return i2;
                }
                if (charAt == '[') {
                    do {
                        i2++;
                        if (i2 >= i3) {
                            break;
                        }
                    } while (str.charAt(i2) != ']');
                }
                i2++;
            }
            return i3;
        }
    }
}
