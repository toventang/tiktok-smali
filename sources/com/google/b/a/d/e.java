package com.google.b.a.d;

import com.bytedance.covode.number.Covode;
import com.google.b.a.f.a.a.a.a.b;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class e {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f53575c = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f53576d = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f53577e = Pattern.compile(new StringBuilder((("[^\\s/=;\"]+".length() + 14) + "[^\\s/=;\"]+".length()) + ";.*".length()).append("\\s*(").append("[^\\s/=;\"]+").append(")/(").append("[^\\s/=;\"]+").append(")\\s*(").append(";.*").append(")?").toString(), 32);

    /* renamed from: f  reason: collision with root package name */
    private static final Pattern f53578f;

    /* renamed from: a  reason: collision with root package name */
    public String f53579a = "application";

    /* renamed from: b  reason: collision with root package name */
    public String f53580b = "octet-stream";

    /* renamed from: g  reason: collision with root package name */
    private final SortedMap<String, String> f53581g = new TreeMap();

    /* renamed from: h  reason: collision with root package name */
    private String f53582h;

    public final String toString() {
        return a();
    }

    public final int hashCode() {
        return a().hashCode();
    }

    static {
        Covode.recordClassIndex(33149);
        String valueOf = String.valueOf(String.valueOf(new StringBuilder("\"([^\"]*)\"".length() + 1 + "[^\\s;\"]*".length()).append("\"([^\"]*)\"").append("|").append("[^\\s;\"]*").toString()));
        f53578f = Pattern.compile(new StringBuilder("[^\\s/=;\"]+".length() + 12 + valueOf.length()).append("\\s*;\\s*(").append("[^\\s/=;\"]+").append(")=(").append(valueOf).append(")").toString());
    }

    public final String a() {
        String str = this.f53582h;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f53579a);
        sb.append('/');
        sb.append(this.f53580b);
        SortedMap<String, String> sortedMap = this.f53581g;
        if (sortedMap != null) {
            for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
                String value = entry.getValue();
                sb.append("; ");
                sb.append(entry.getKey());
                sb.append("=");
                if (!f53576d.matcher(value).matches()) {
                    String valueOf = String.valueOf(String.valueOf(value.replace("\\", "\\\\").replace("\"", "\\\"")));
                    value = new StringBuilder(valueOf.length() + 2).append("\"").append(valueOf).append("\"").toString();
                }
                sb.append(value);
            }
        }
        String sb2 = sb.toString();
        this.f53582h = sb2;
        return sb2;
    }

    private e b(String str) {
        this.f53582h = null;
        this.f53581g.remove(str.toLowerCase());
        return this;
    }

    public e(String str) {
        a(str);
    }

    public final boolean equals(Object obj) {
        e eVar;
        if ((obj instanceof e) && (eVar = (e) obj) != null && this.f53579a.equalsIgnoreCase(eVar.f53579a) && this.f53580b.equalsIgnoreCase(eVar.f53580b) && this.f53581g.equals(eVar.f53581g)) {
            return true;
        }
        return false;
    }

    private e a(String str) {
        Matcher matcher = f53577e.matcher(str);
        b.a(matcher.matches(), "Type must be in the 'maintype/subtype; parameter=value' format");
        String group = matcher.group(1);
        Pattern pattern = f53575c;
        b.a(pattern.matcher(group).matches(), "Type contains reserved characters");
        this.f53579a = group;
        this.f53582h = null;
        String group2 = matcher.group(2);
        b.a(pattern.matcher(group2).matches(), "Subtype contains reserved characters");
        this.f53580b = group2;
        this.f53582h = null;
        String group3 = matcher.group(3);
        if (group3 != null) {
            Matcher matcher2 = f53578f.matcher(group3);
            while (matcher2.find()) {
                String group4 = matcher2.group(1);
                String group5 = matcher2.group(3);
                if (group5 == null) {
                    group5 = matcher2.group(2);
                }
                a(group4, group5);
            }
        }
        return this;
    }

    public final e a(String str, String str2) {
        if (str2 == null) {
            b(str);
            return this;
        }
        b.a(f53576d.matcher(str).matches(), "Name contains reserved characters");
        this.f53582h = null;
        this.f53581g.put(str.toLowerCase(), str2);
        return this;
    }
}
