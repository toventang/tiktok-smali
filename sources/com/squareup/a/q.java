package com.squareup.a;

import com.bytedance.covode.number.Covode;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k.f;

public final class q {

    /* renamed from: i  reason: collision with root package name */
    private static final char[] f57878i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    public final String f57879a;

    /* renamed from: b  reason: collision with root package name */
    public final String f57880b;

    /* renamed from: c  reason: collision with root package name */
    public final String f57881c;

    /* renamed from: d  reason: collision with root package name */
    public final String f57882d;

    /* renamed from: e  reason: collision with root package name */
    public final int f57883e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f57884f;

    /* renamed from: g  reason: collision with root package name */
    final List<String> f57885g;

    /* renamed from: h  reason: collision with root package name */
    public final String f57886h;

    /* renamed from: j  reason: collision with root package name */
    private final String f57887j;

    static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    public final String toString() {
        return this.f57887j;
    }

    public final URL a() {
        try {
            return new URL(this.f57887j);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    static void a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append(list.get(i2));
        }
    }

    private static void a(f fVar, String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt == 37) {
                int i4 = i2 + 2;
                if (i4 < i3) {
                    int a2 = a(str.charAt(i2 + 1));
                    int a3 = a(str.charAt(i4));
                    if (!(a2 == -1 || a3 == -1)) {
                        fVar.a((a2 << 4) + a3);
                        i2 = i4;
                    }
                }
                fVar.e(codePointAt);
            } else {
                if (codePointAt == 43 && z) {
                    fVar.a(32);
                }
                fVar.e(codePointAt);
            }
            i2 += Character.charCount(codePointAt);
        }
    }

    public final int hashCode() {
        return this.f57887j.hashCode();
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        String f57888a;

        /* renamed from: b  reason: collision with root package name */
        String f57889b = "";

        /* renamed from: c  reason: collision with root package name */
        String f57890c = "";

        /* renamed from: d  reason: collision with root package name */
        String f57891d;

        /* renamed from: e  reason: collision with root package name */
        int f57892e = -1;

        /* renamed from: f  reason: collision with root package name */
        final List<String> f57893f;

        /* renamed from: g  reason: collision with root package name */
        List<String> f57894g;

        /* renamed from: h  reason: collision with root package name */
        String f57895h;

        static {
            Covode.recordClassIndex(36015);
        }

        /* access modifiers changed from: package-private */
        public final int a() {
            int i2 = this.f57892e;
            if (i2 != -1) {
                return i2;
            }
            return q.a(this.f57888a);
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f57893f = arrayList;
            arrayList.add("");
        }

        public final q b() {
            if (this.f57888a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f57891d != null) {
                return new q(this, (byte) 0);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.squareup.a.q$a$a  reason: collision with other inner class name */
        public enum EnumC1278a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST;

            static {
                Covode.recordClassIndex(36016);
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f57888a);
            sb.append("://");
            if (!this.f57889b.isEmpty() || !this.f57890c.isEmpty()) {
                sb.append(this.f57889b);
                if (!this.f57890c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f57890c);
                }
                sb.append('@');
            }
            if (this.f57891d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f57891d);
                sb.append(']');
            } else {
                sb.append(this.f57891d);
            }
            int a2 = a();
            if (a2 != q.a(this.f57888a)) {
                sb.append(':');
                sb.append(a2);
            }
            q.a(sb, this.f57893f);
            if (this.f57894g != null) {
                sb.append('?');
                q.b(sb, this.f57894g);
            }
            if (this.f57895h != null) {
                sb.append('#');
                sb.append(this.f57895h);
            }
            return sb.toString();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
            r3 = true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.String b(java.lang.String r6) {
            /*
                r5 = 0
                java.lang.String r1 = java.net.IDN.toASCII(r6)     // Catch:{ IllegalArgumentException -> 0x0039 }
                java.util.Locale r0 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x0039 }
                java.lang.String r4 = r1.toLowerCase(r0)     // Catch:{ IllegalArgumentException -> 0x0039 }
                boolean r0 = r4.isEmpty()     // Catch:{ IllegalArgumentException -> 0x0039 }
                if (r0 == 0) goto L_0x0012
                return r5
            L_0x0012:
                r3 = 0
                r2 = 0
            L_0x0014:
                int r1 = r4.length()     // Catch:{ IllegalArgumentException -> 0x0039 }
                r0 = 1
                if (r2 >= r1) goto L_0x0028
                char r1 = r4.charAt(r2)     // Catch:{ IllegalArgumentException -> 0x0039 }
                r0 = 31
                if (r1 <= r0) goto L_0x0027
                r0 = 127(0x7f, float:1.78E-43)
                if (r1 < r0) goto L_0x002b
            L_0x0027:
                r3 = 1
            L_0x0028:
                if (r3 == 0) goto L_0x0038
                return r5
            L_0x002b:
                java.lang.String r0 = " #%/:?@[\\]"
                int r1 = r0.indexOf(r1)     // Catch:{ IllegalArgumentException -> 0x0039 }
                r0 = -1
                if (r1 == r0) goto L_0x0035
                goto L_0x0027
            L_0x0035:
                int r2 = r2 + 1
                goto L_0x0014
            L_0x0038:
                return r4
            L_0x0039:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.a.q.a.b(java.lang.String):java.lang.String");
        }

        private static String a(byte[] bArr) {
            int i2 = 0;
            int i3 = -1;
            int i4 = 0;
            int i5 = 0;
            while (i4 < bArr.length) {
                int i6 = i4;
                while (i6 < 16 && bArr[i6] == 0 && bArr[i6 + 1] == 0) {
                    i6 += 2;
                }
                int i7 = i6 - i4;
                if (i7 > i5) {
                    i3 = i4;
                    i5 = i7;
                }
                i4 = i6 + 2;
            }
            f fVar = new f();
            while (i2 < bArr.length) {
                if (i2 == i3) {
                    fVar.a(58);
                    i2 += i5;
                    if (i2 == 16) {
                        fVar.a(58);
                    }
                } else {
                    if (i2 > 0) {
                        fVar.a(58);
                    }
                    fVar.c((long) (((bArr[i2] & 255) << 8) | (bArr[i2 + 1] & 255)));
                    i2 += 2;
                }
            }
            return fVar.r();
        }

        public final a a(String str) {
            List<String> list;
            if (str != null) {
                list = q.b(q.a(str, " \"'<>#", true, true));
            } else {
                list = null;
            }
            this.f57894g = list;
            return this;
        }

        private static int a(String str, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char charAt = str.charAt(i3);
                if (!(charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ')) {
                    return i3;
                }
            }
            return i2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ae, code lost:
            if ((r10 - r1) != 0) goto L_0x00b1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.net.InetAddress b(java.lang.String r14, int r15) {
            /*
            // Method dump skipped, instructions count: 231
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.a.q.a.b(java.lang.String, int):java.net.InetAddress");
        }

        /* access modifiers changed from: package-private */
        public final EnumC1278a a(q qVar, String str) {
            int a2;
            char charAt;
            int a3 = a(str, str.length());
            int c2 = c(str, a3, str.length());
            if (d(str, a3, c2) != -1) {
                if (str.regionMatches(true, a3, "https:", 0, 6)) {
                    this.f57888a = "https";
                    a3 += 6;
                } else if (!str.regionMatches(true, a3, "http:", 0, 5)) {
                    return EnumC1278a.UNSUPPORTED_SCHEME;
                } else {
                    this.f57888a = "http";
                    a3 += 5;
                }
            } else if (qVar == null) {
                return EnumC1278a.MISSING_SCHEME;
            } else {
                this.f57888a = qVar.f57879a;
            }
            int e2 = e(str, a3, c2);
            char c3 = '?';
            char c4 = '#';
            if (e2 >= 2 || qVar == null || !qVar.f57879a.equals(this.f57888a)) {
                int i2 = a3 + e2;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    a2 = q.a(str, i2, c2, "@/\\?#");
                    if (a2 == c2 || (charAt = str.charAt(a2)) == 65535 || charAt == c4 || charAt == '/' || charAt == '\\' || charAt == c3) {
                        int f2 = f(str, i2, a2);
                        int i3 = f2 + 1;
                    } else if (charAt == '@') {
                        if (!z) {
                            int a4 = q.a(str, i2, a2, ":");
                            String a5 = q.a(str, i2, a4, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                            if (z2) {
                                a5 = this.f57889b + "%40" + a5;
                            }
                            this.f57889b = a5;
                            if (a4 != a2) {
                                this.f57890c = q.a(str, a4 + 1, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                z = true;
                            }
                            z2 = true;
                        } else {
                            this.f57890c += "%40" + q.a(str, i2, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                        }
                        i2 = a2 + 1;
                        c3 = '?';
                        c4 = '#';
                    }
                }
                int f22 = f(str, i2, a2);
                int i32 = f22 + 1;
                if (i32 < a2) {
                    this.f57891d = a(str, i2, f22);
                    int g2 = g(str, i32, a2);
                    this.f57892e = g2;
                    if (g2 == -1) {
                        return EnumC1278a.INVALID_PORT;
                    }
                } else {
                    this.f57891d = a(str, i2, f22);
                    this.f57892e = q.a(this.f57888a);
                }
                if (this.f57891d == null) {
                    return EnumC1278a.INVALID_HOST;
                }
                a3 = a2;
            } else {
                this.f57889b = qVar.d();
                this.f57890c = qVar.e();
                this.f57891d = qVar.f57882d;
                this.f57892e = qVar.f57883e;
                this.f57893f.clear();
                this.f57893f.addAll(qVar.g());
                if (a3 == c2 || str.charAt(a3) == '#') {
                    a(qVar.h());
                }
            }
            int a6 = q.a(str, a3, c2, "?#");
            b(str, a3, a6);
            if (a6 < c2 && str.charAt(a6) == '?') {
                int a7 = q.a(str, a6, c2, "#");
                this.f57894g = q.b(q.a(str, a6 + 1, a7, " \"'<>#", true, true, true));
                a6 = a7;
            }
            if (a6 < c2 && str.charAt(a6) == '#') {
                this.f57895h = q.a(str, 1 + a6, c2, "", true, false, false);
            }
            return EnumC1278a.SUCCESS;
        }

        private static int e(String str, int i2, int i3) {
            int i4 = 0;
            while (i2 < i3) {
                char charAt = str.charAt(i2);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i4++;
                i2++;
            }
            return i4;
        }

        private static int f(String str, int i2, int i3) {
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

        private static int g(String str, int i2, int i3) {
            try {
                int parseInt = Integer.parseInt(q.a(str, i2, i3, "", false, false, true));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        static String a(String str, int i2, int i3) {
            String a2 = q.a(str, i2, i3, false);
            if (!a2.startsWith("[") || !a2.endsWith("]")) {
                return b(a2);
            }
            InetAddress b2 = b(a2, a2.length() - 1);
            if (b2 == null) {
                return null;
            }
            byte[] address = b2.getAddress();
            if (address.length == 16) {
                return a(address);
            }
            throw new AssertionError();
        }

        private static int c(String str, int i2, int i3) {
            for (int i4 = i3 - 1; i4 >= i2; i4--) {
                char charAt = str.charAt(i4);
                if (!(charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ')) {
                    return i4 + 1;
                }
            }
            return i2;
        }

        private static int d(String str, int i2, int i3) {
            if (i3 - i2 < 2) {
                return -1;
            }
            char charAt = str.charAt(i2);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i2++;
                    if (i2 >= i3) {
                        break;
                    }
                    char charAt2 = str.charAt(i2);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i2;
                        }
                    }
                }
            }
            return -1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
            */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00d3 A[SYNTHETIC] */
        private void b(java.lang.String r15, int r16, int r17) {
            /*
            // Method dump skipped, instructions count: 212
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.a.q.a.b(java.lang.String, int, int):void");
        }
    }

    public final boolean c() {
        return this.f57879a.equals("https");
    }

    static {
        Covode.recordClassIndex(36014);
    }

    public final String d() {
        if (this.f57880b.isEmpty()) {
            return "";
        }
        int length = this.f57879a.length() + 3;
        String str = this.f57887j;
        return this.f57887j.substring(length, a(str, length, str.length(), ":@"));
    }

    public final String e() {
        if (this.f57881c.isEmpty()) {
            return "";
        }
        return this.f57887j.substring(this.f57887j.indexOf(58, this.f57879a.length() + 3) + 1, this.f57887j.indexOf(64));
    }

    public final String f() {
        int indexOf = this.f57887j.indexOf(47, this.f57879a.length() + 3);
        String str = this.f57887j;
        return this.f57887j.substring(indexOf, a(str, indexOf, str.length(), "?#"));
    }

    public final List<String> g() {
        int indexOf = this.f57887j.indexOf(47, this.f57879a.length() + 3);
        String str = this.f57887j;
        int a2 = a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a2) {
            int i2 = indexOf + 1;
            indexOf = a(this.f57887j, i2, a2, "/");
            arrayList.add(this.f57887j.substring(i2, indexOf));
        }
        return arrayList;
    }

    public final String h() {
        if (this.f57885g == null) {
            return null;
        }
        int indexOf = this.f57887j.indexOf(63) + 1;
        String str = this.f57887j;
        return this.f57887j.substring(indexOf, a(str, indexOf + 1, str.length(), "#"));
    }

    public final URI b() {
        int i2;
        String str;
        try {
            a aVar = new a();
            aVar.f57888a = this.f57879a;
            aVar.f57889b = d();
            aVar.f57890c = e();
            aVar.f57891d = this.f57882d;
            if (this.f57883e != a(this.f57879a)) {
                i2 = this.f57883e;
            } else {
                i2 = -1;
            }
            aVar.f57892e = i2;
            aVar.f57893f.clear();
            aVar.f57893f.addAll(g());
            aVar.a(h());
            if (this.f57886h == null) {
                str = null;
            } else {
                str = this.f57887j.substring(this.f57887j.indexOf(35) + 1);
            }
            aVar.f57895h = str;
            int size = aVar.f57893f.size();
            for (int i3 = 0; i3 < size; i3++) {
                aVar.f57893f.set(i3, a(aVar.f57893f.get(i3), "[]", false, true));
            }
            if (aVar.f57894g != null) {
                int size2 = aVar.f57894g.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    String str2 = aVar.f57894g.get(i4);
                    if (str2 != null) {
                        aVar.f57894g.set(i4, a(str2, "\\^`{|}", true, true));
                    }
                }
            }
            if (aVar.f57895h != null) {
                aVar.f57895h = a(aVar.f57895h, " \"#<>\\^`{|}", false, false);
            }
            return new URI(aVar.toString());
        } catch (URISyntaxException unused) {
            throw new IllegalStateException("not valid as a java.net.URI: " + this.f57887j);
        }
    }

    public static int a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return 443;
        }
        return -1;
    }

    public static q c(String str) {
        a aVar = new a();
        if (aVar.a((q) null, str) == a.EnumC1278a.SUCCESS) {
            return aVar.b();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q) || !((q) obj).f57887j.equals(this.f57887j)) {
            return false;
        }
        return true;
    }

    private q(a aVar) {
        List<String> list;
        this.f57879a = aVar.f57888a;
        this.f57880b = a(aVar.f57889b, false);
        this.f57881c = a(aVar.f57890c, false);
        this.f57882d = aVar.f57891d;
        this.f57883e = aVar.a();
        this.f57884f = a(aVar.f57893f, false);
        String str = null;
        if (aVar.f57894g != null) {
            list = a(aVar.f57894g, true);
        } else {
            list = null;
        }
        this.f57885g = list;
        this.f57886h = aVar.f57895h != null ? a(aVar.f57895h, false) : str;
        this.f57887j = aVar.toString();
    }

    static List<String> b(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i2, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    /* synthetic */ q(a aVar, byte b2) {
        this(aVar);
    }

    static void b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = list.get(i2);
            String str2 = list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    private static String a(String str, boolean z) {
        return a(str, 0, str.length(), z);
    }

    private static List<String> a(List<String> list, boolean z) {
        String str;
        ArrayList arrayList = new ArrayList(list.size());
        for (String str2 : list) {
            if (str2 != null) {
                str = a(str2, z);
            } else {
                str = null;
            }
            arrayList.add(str);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static String a(String str, String str2, boolean z, boolean z2) {
        return a(str, 0, str.length(), str2, true, z, z2);
    }

    public static int a(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    static String a(String str, int i2, int i3, boolean z) {
        for (int i4 = i2; i4 < i3; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '%' || (charAt == '+' && z)) {
                f fVar = new f();
                fVar.a(str, i2, i4);
                a(fVar, str, i4, i3, z);
                return fVar.r();
            }
        }
        return str.substring(i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006f, code lost:
        if (r21 == false) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b A[LOOP:2: B:45:0x0085->B:47:0x008b, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String a(java.lang.String r15, int r16, int r17, java.lang.String r18, boolean r19, boolean r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.a.q.a(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean):java.lang.String");
    }
}
