package com.bytedance.frameworks.baselib.network.http.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import java.net.URI;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class e implements Cloneable {

    /* renamed from: m  reason: collision with root package name */
    private static final Set<String> f28959m;
    private static Pattern n;
    private static Pattern o;
    private static final ThreadLocal<DateFormat> p = new ThreadLocal<DateFormat>() {
        /* class com.bytedance.frameworks.baselib.network.http.c.e.AnonymousClass1 */

        static {
            Covode.recordClassIndex(16996);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }
    };
    private static final String[] q = {"EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};

    /* renamed from: a  reason: collision with root package name */
    public String f28960a;

    /* renamed from: b  reason: collision with root package name */
    public String f28961b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f28962c;

    /* renamed from: d  reason: collision with root package name */
    public String f28963d;

    /* renamed from: e  reason: collision with root package name */
    public long f28964e = -1;

    /* renamed from: f  reason: collision with root package name */
    public final String f28965f;

    /* renamed from: g  reason: collision with root package name */
    public String f28966g;

    /* renamed from: h  reason: collision with root package name */
    public String f28967h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f28968i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f28969j;

    /* renamed from: k  reason: collision with root package name */
    public String f28970k;

    /* renamed from: l  reason: collision with root package name */
    public int f28971l = 1;

    @Override // java.lang.Object
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f28972a;

        /* renamed from: b  reason: collision with root package name */
        boolean f28973b;

        /* renamed from: c  reason: collision with root package name */
        boolean f28974c;

        /* renamed from: d  reason: collision with root package name */
        private final String f28975d;

        /* renamed from: e  reason: collision with root package name */
        private final String f28976e;

        /* renamed from: f  reason: collision with root package name */
        private int f28977f;

        static {
            Covode.recordClassIndex(16997);
        }

        private void c() {
            while (this.f28977f < this.f28975d.length() && " \t".indexOf(this.f28975d.charAt(this.f28977f)) != -1) {
                this.f28977f++;
            }
        }

        private boolean b() {
            c();
            if (this.f28977f >= this.f28975d.length() || this.f28975d.charAt(this.f28977f) != '=') {
                return false;
            }
            this.f28977f++;
            return true;
        }

        public final List<e> a() {
            int i2;
            String str;
            String str2;
            ArrayList arrayList = new ArrayList(2);
            if (this.f28976e.startsWith("set-cookie2:")) {
                this.f28977f += 12;
                this.f28974c = true;
                i2 = 0;
            } else {
                if (this.f28976e.startsWith("set-cookie:")) {
                    this.f28977f += 11;
                }
                i2 = 1;
            }
            while (true) {
                String a2 = a(false);
                if (a2 == null) {
                    if (!arrayList.isEmpty()) {
                        return arrayList;
                    }
                    throw new IllegalArgumentException("No cookies in " + this.f28975d);
                } else if (b()) {
                    if (i2 != 0) {
                        str = ";";
                    } else {
                        str = ",;";
                    }
                    e eVar = new e(a2, a(str));
                    eVar.f28971l = i2 ^ 1;
                    arrayList.add(eVar);
                    while (true) {
                        c();
                        if (this.f28977f == this.f28975d.length()) {
                            break;
                        } else if (this.f28975d.charAt(this.f28977f) == ',') {
                            this.f28977f++;
                            break;
                        } else {
                            if (this.f28975d.charAt(this.f28977f) == ';') {
                                this.f28977f++;
                            }
                            String a3 = a(true);
                            if (a3 != null) {
                                if (i2 != 0 || "expires".equals(a3) || "port".equals(a3)) {
                                    str2 = ";";
                                } else {
                                    str2 = ";,";
                                }
                                String str3 = null;
                                if (b()) {
                                    str3 = a(str2);
                                }
                                if (a3.equals(UGCMonitor.EVENT_COMMENT) && eVar.f28960a == null) {
                                    eVar.f28960a = str3;
                                } else if (a3.equals("commenturl") && eVar.f28961b == null) {
                                    eVar.f28961b = str3;
                                } else if (a3.equals("discard")) {
                                    eVar.f28962c = true;
                                } else if (a3.equals("domain") && eVar.f28963d == null) {
                                    eVar.f28963d = str3;
                                } else if (a3.equals("expires")) {
                                    this.f28972a = true;
                                    if (eVar.f28964e == -1) {
                                        Date b2 = e.b(str3);
                                        if (b2 != null) {
                                            eVar.f28964e = (b2.getTime() - System.currentTimeMillis()) / 1000;
                                        } else {
                                            eVar.f28964e = 0;
                                        }
                                    }
                                } else if (a3.equals("max-age") && eVar.f28964e == -1) {
                                    try {
                                        long parseLong = Long.parseLong(str3);
                                        this.f28973b = true;
                                        eVar.f28964e = parseLong;
                                    } catch (NumberFormatException unused) {
                                        throw new IllegalArgumentException("Invalid max-age: ".concat(String.valueOf(str3)));
                                    }
                                } else if (a3.equals("path") && eVar.f28966g == null) {
                                    eVar.f28966g = str3;
                                } else if (a3.equals("port") && eVar.f28967h == null) {
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    eVar.f28967h = str3;
                                } else if (a3.equals("secure")) {
                                    eVar.f28968i = true;
                                } else if (a3.equals("httponly")) {
                                    eVar.f28969j = true;
                                } else if (a3.equals("version") && !this.f28974c) {
                                    eVar.f28971l = Integer.parseInt(str3);
                                }
                            }
                        }
                    }
                    if (this.f28972a) {
                        eVar.f28971l = 0;
                    } else if (this.f28973b) {
                        eVar.f28971l = 1;
                    }
                } else {
                    throw new IllegalArgumentException("Expected '=' after " + a2 + " in " + this.f28975d);
                }
            }
        }

        a(String str) {
            this.f28975d = str;
            this.f28976e = str.toLowerCase(Locale.US);
        }

        private String a(String str) {
            c();
            int b2 = b(str);
            String substring = this.f28975d.substring(this.f28977f, b2);
            this.f28977f = b2;
            return substring;
        }

        private String a(boolean z) {
            String str;
            String str2;
            c();
            int b2 = b(",;= \t");
            if (z) {
                str = this.f28976e;
            } else {
                str = this.f28975d;
            }
            int i2 = this.f28977f;
            if (i2 < b2) {
                str2 = str.substring(i2, b2);
            } else {
                str2 = null;
            }
            this.f28977f = b2;
            return str2;
        }

        private int b(String str) {
            for (int i2 = this.f28977f; i2 < this.f28975d.length(); i2++) {
                if (str.indexOf(this.f28975d.charAt(i2)) != -1) {
                    return i2;
                }
            }
            return this.f28975d.length();
        }
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f28965f.toLowerCase(Locale.US).hashCode();
        String str = this.f28963d;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.toLowerCase(Locale.US).hashCode();
        }
        int i3 = hashCode2 + hashCode;
        String str2 = this.f28966g;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        if (this.f28971l == 0) {
            return this.f28965f + "=" + this.f28970k;
        }
        StringBuilder append = new StringBuilder().append(this.f28965f).append("=\"").append(this.f28970k).append("\"");
        a(append, "Path", this.f28966g);
        a(append, "Domain", this.f28963d);
        a(append, "Port", this.f28967h);
        return append.toString();
    }

    static {
        Covode.recordClassIndex(16995);
        HashSet hashSet = new HashSet();
        f28959m = hashSet;
        hashSet.add(UGCMonitor.EVENT_COMMENT);
        hashSet.add("commenturl");
        hashSet.add("discard");
        hashSet.add("domain");
        hashSet.add("expires");
        hashSet.add("httponly");
        hashSet.add("max-age");
        hashSet.add("path");
        hashSet.add("port");
        hashSet.add("secure");
        hashSet.add("version");
        n = null;
        o = null;
        try {
            n = Pattern.compile("(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])", 2);
            o = Pattern.compile("([0-9a-f]{1,4}:){7}([0-9a-f]){1,4}", 2);
        } catch (PatternSyntaxException unused) {
        }
    }

    public final boolean a() {
        long j2 = this.f28964e;
        if (j2 != -1 && j2 <= 0) {
            return true;
        }
        return false;
    }

    public final void a(String str) {
        String lowerCase;
        if (str == null) {
            lowerCase = null;
        } else {
            lowerCase = str.toLowerCase(Locale.US);
        }
        this.f28963d = lowerCase;
    }

    private static String c(String str) {
        if (str == null) {
            return "/";
        }
        if (str.endsWith("/")) {
            return str;
        }
        return str + "/";
    }

    private static boolean e(String str) {
        try {
            if (!n.matcher(str).matches() && !o.matcher(str).matches()) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Date b(String str) {
        try {
            return p.get().parse(str);
        } catch (ParseException unused) {
            for (String str2 : q) {
                try {
                    return new SimpleDateFormat(str2, Locale.US).parse(str);
                } catch (ParseException unused2) {
                }
            }
            return null;
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f28965f.equalsIgnoreCase(eVar.f28965f) && ((str = this.f28963d) == null ? eVar.f28963d == null : str.equalsIgnoreCase(eVar.f28963d))) {
                String str2 = this.f28966g;
                String str3 = eVar.f28966g;
                if (str2 != null ? !str2.equals(str3) : str3 != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private static boolean d(String str) {
        boolean z;
        if (str.length() == 0 || str.startsWith("$") || f28959m.contains(str.toLowerCase(Locale.US))) {
            z = false;
        } else {
            z = true;
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (charAt < 0 || charAt >= 127 || charAt == ';' || charAt == ',') {
                    return false;
                }
                if (Character.isWhitespace(charAt) && charAt != ' ') {
                    return false;
                }
            }
        }
        return z;
    }

    public e(String str, String str2) {
        String trim = str.trim();
        if (d(trim)) {
            this.f28965f = trim;
            this.f28970k = str2;
            return;
        }
        throw new IllegalArgumentException("Invalid name: ".concat(String.valueOf(str)));
    }

    public static boolean a(e eVar, URI uri) {
        return c(uri.getPath()).startsWith(c(eVar.f28966g));
    }

    private static boolean a(String str, int i2) {
        int indexOf = str.indexOf(46, i2 + 1);
        if (indexOf == -1 || indexOf >= str.length() - 1) {
            return false;
        }
        return true;
    }

    public static boolean b(e eVar, URI uri) {
        String str = eVar.f28967h;
        if (str == null) {
            return true;
        }
        return Arrays.asList(str.split(",")).contains(Integer.toString(h.getEffectivePort(uri.getScheme(), uri.getPort())));
    }

    public static boolean a(String str, String str2) {
        if (!(str == null || str2 == null)) {
            String lowerCase = str2.toLowerCase(Locale.US);
            String lowerCase2 = str.toLowerCase(Locale.US);
            if (lowerCase.equals(lowerCase2) && (a(lowerCase, 0) || e(lowerCase))) {
                return true;
            }
            if (!a(lowerCase, 0)) {
                return lowerCase2.equals(".local");
            }
            if (lowerCase2.length() == lowerCase.length() + 1 && lowerCase2.startsWith(".") && lowerCase2.endsWith(lowerCase) && a(lowerCase2, 1)) {
                return true;
            }
            if (lowerCase.length() <= lowerCase2.length() || !lowerCase.endsWith(lowerCase2) || ((!lowerCase2.startsWith(".") || !a(lowerCase2, 1)) && !lowerCase2.equals(".local"))) {
                return false;
            }
            return true;
        }
        return false;
    }

    private static void a(StringBuilder sb, String str, String str2) {
        if (str2 != null && sb != null) {
            sb.append(";$");
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append("\"");
        }
    }
}
