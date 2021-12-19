package okhttp3;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpDate;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

public final class Cookie {
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;

    public final String domain() {
        return this.domain;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final String name() {
        return this.name;
    }

    public final String path() {
        return this.path;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    public final boolean secure() {
        return this.secure;
    }

    public final String value() {
        return this.value;
    }

    public static final class Builder {
        String domain;
        long expiresAt = 253402300799999L;
        boolean hostOnly;
        boolean httpOnly;
        String name;
        String path = "/";
        boolean persistent;
        boolean secure;
        String value;

        static {
            Covode.recordClassIndex(106137);
        }

        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public final Builder secure() {
            this.secure = true;
            return this;
        }

        public final Cookie build() {
            return new Cookie(this);
        }

        public final Builder domain(String str) {
            return domain(str, false);
        }

        public final Builder hostOnlyDomain(String str) {
            return domain(str, true);
        }

        public final Builder expiresAt(long j2) {
            if (j2 <= 0) {
                j2 = Long.MIN_VALUE;
            } else if (j2 > 253402300799999L) {
                j2 = 253402300799999L;
            }
            this.expiresAt = j2;
            this.persistent = true;
            return this;
        }

        public final Builder name(String str) {
            Objects.requireNonNull(str, "name == null");
            if (str.trim().equals(str)) {
                this.name = str;
                return this;
            }
            throw new IllegalArgumentException("name is not trimmed");
        }

        public final Builder path(String str) {
            if (str.startsWith("/")) {
                this.path = str;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'");
        }

        public final Builder value(String str) {
            Objects.requireNonNull(str, "value == null");
            if (str.trim().equals(str)) {
                this.value = str;
                return this;
            }
            throw new IllegalArgumentException("value is not trimmed");
        }

        private Builder domain(String str, boolean z) {
            Objects.requireNonNull(str, "domain == null");
            String canonicalizeHost = Util.canonicalizeHost(str);
            if (canonicalizeHost != null) {
                this.domain = canonicalizeHost;
                this.hostOnly = z;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: ".concat(String.valueOf(str)));
        }
    }

    public final String toString() {
        return toString(false);
    }

    static {
        Covode.recordClassIndex(106136);
    }

    public final int hashCode() {
        long j2 = this.expiresAt;
        return ((((((((((((((((this.name.hashCode() + 527) * 31) + this.value.hashCode()) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (!this.secure ? 1 : 0)) * 31) + (!this.httpOnly ? 1 : 0)) * 31) + (!this.persistent ? 1 : 0)) * 31) + (!this.hostOnly ? 1 : 0);
    }

    Cookie(Builder builder) {
        Objects.requireNonNull(builder.name, "builder.name == null");
        Objects.requireNonNull(builder.value, "builder.value == null");
        Objects.requireNonNull(builder.domain, "builder.domain == null");
        this.name = builder.name;
        this.value = builder.value;
        this.expiresAt = builder.expiresAt;
        this.domain = builder.domain;
        this.path = builder.path;
        this.secure = builder.secure;
        this.httpOnly = builder.httpOnly;
        this.persistent = builder.persistent;
        this.hostOnly = builder.hostOnly;
    }

    private static String parseDomain(String str) {
        if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            String canonicalizeHost = Util.canonicalizeHost(str);
            if (canonicalizeHost != null) {
                return canonicalizeHost;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    private static long parseMaxAge(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e2) {
            if (!str.matches("-?\\d+")) {
                throw e2;
            } else if (str.startsWith("-")) {
                return Long.MIN_VALUE;
            } else {
                return Long.MAX_VALUE;
            }
        }
    }

    public final boolean matches(HttpUrl httpUrl) {
        boolean domainMatch;
        if (this.hostOnly) {
            domainMatch = httpUrl.host().equals(this.domain);
        } else {
            domainMatch = domainMatch(httpUrl.host(), this.domain);
        }
        if (!domainMatch || !pathMatch(httpUrl, this.path)) {
            return false;
        }
        if (!this.secure || httpUrl.isHttps()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        if (cookie.name.equals(this.name) && cookie.value.equals(this.value) && cookie.domain.equals(this.domain) && cookie.path.equals(this.path) && cookie.expiresAt == this.expiresAt && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final String toString(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('=');
        sb.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=").append(HttpDate.format(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.domain);
        }
        sb.append("; path=").append(this.path);
        if (this.secure) {
            sb.append("; secure");
        }
        if (this.httpOnly) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public static Cookie parse(HttpUrl httpUrl, String str) {
        return parse(System.currentTimeMillis(), httpUrl, str);
    }

    private static boolean domainMatch(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (!str.endsWith(str2) || str.charAt((str.length() - str2.length()) - 1) != '.' || Util.verifyAsIpAddress(str)) {
            return false;
        }
        return true;
    }

    public static List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        List<String> values = headers.values("Set-Cookie");
        int size = values.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            Cookie parse = parse(httpUrl, values.get(i2));
            if (parse != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(parse);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    private static boolean pathMatch(HttpUrl httpUrl, String str) {
        String encodedPath = httpUrl.encodedPath();
        if (encodedPath.equals(str)) {
            return true;
        }
        if (!encodedPath.startsWith(str)) {
            return false;
        }
        if (!str.endsWith("/") && encodedPath.charAt(str.length()) != '/') {
            return false;
        }
        return true;
    }

    static Cookie parse(long j2, HttpUrl httpUrl, String str) {
        long j3;
        Cookie cookie;
        String str2;
        int length = str.length();
        char c2 = ';';
        int delimiterOffset = Util.delimiterOffset(str, 0, length, ';');
        char c3 = '=';
        int delimiterOffset2 = Util.delimiterOffset(str, 0, delimiterOffset, '=');
        String str3 = null;
        if (delimiterOffset2 == delimiterOffset) {
            return null;
        }
        String trimSubstring = Util.trimSubstring(str, 0, delimiterOffset2);
        if (trimSubstring.isEmpty() || Util.indexOfControlOrNonAscii(trimSubstring) != -1) {
            return null;
        }
        String trimSubstring2 = Util.trimSubstring(str, delimiterOffset2 + 1, delimiterOffset);
        if (Util.indexOfControlOrNonAscii(trimSubstring2) != -1) {
            return null;
        }
        int i2 = delimiterOffset + 1;
        String str4 = null;
        long j4 = -1;
        long j5 = 253402300799999L;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = false;
        while (i2 < length) {
            int delimiterOffset3 = Util.delimiterOffset(str, i2, length, c2);
            int delimiterOffset4 = Util.delimiterOffset(str, i2, delimiterOffset3, c3);
            String trimSubstring3 = Util.trimSubstring(str, i2, delimiterOffset4);
            if (delimiterOffset4 < delimiterOffset3) {
                str2 = Util.trimSubstring(str, delimiterOffset4 + 1, delimiterOffset3);
            } else {
                str2 = "";
            }
            if (trimSubstring3.equalsIgnoreCase("expires")) {
                try {
                    j5 = parseExpires(str2, 0, str2.length());
                } catch (IllegalArgumentException unused) {
                }
            } else if (trimSubstring3.equalsIgnoreCase("max-age")) {
                j4 = parseMaxAge(str2);
            } else {
                if (trimSubstring3.equalsIgnoreCase("domain")) {
                    str4 = parseDomain(str2);
                    z3 = false;
                } else if (trimSubstring3.equalsIgnoreCase("path")) {
                    str3 = str2;
                } else if (trimSubstring3.equalsIgnoreCase("secure")) {
                    z = true;
                } else if (trimSubstring3.equalsIgnoreCase("httponly")) {
                    z2 = true;
                }
                i2 = delimiterOffset3 + 1;
                c2 = ';';
                c3 = '=';
            }
            z4 = true;
            i2 = delimiterOffset3 + 1;
            c2 = ';';
            c3 = '=';
        }
        long j6 = Long.MIN_VALUE;
        if (j4 != Long.MIN_VALUE) {
            if (j4 != -1) {
                if (j4 <= 9223372036854775L) {
                    j3 = j4 * 1000;
                } else {
                    j3 = Long.MAX_VALUE;
                }
                j6 = j2 + j3;
                if (j6 < j2 || j6 > 253402300799999L) {
                    j6 = 253402300799999L;
                }
            } else {
                j6 = j5;
            }
        }
        String host = httpUrl.host();
        if (str4 == null) {
            str4 = host;
            cookie = null;
        } else if (!domainMatch(host, str4)) {
            return null;
        } else {
            cookie = null;
        }
        if (host.length() != str4.length() && PublicSuffixDatabase.get().getEffectiveTldPlusOne(str4) == null) {
            return cookie;
        }
        String str5 = "/";
        if (str3 == null || !str3.startsWith(str5)) {
            String encodedPath = httpUrl.encodedPath();
            int lastIndexOf = encodedPath.lastIndexOf(47);
            if (lastIndexOf != 0) {
                str5 = encodedPath.substring(0, lastIndexOf);
            }
        } else {
            str5 = str3;
        }
        return new Cookie(trimSubstring, trimSubstring2, j6, str4, str5, z, z2, z3, z4);
    }

    private static long parseExpires(String str, int i2, int i3) {
        int dateCharacterOffset = dateCharacterOffset(str, i2, i3, false);
        Matcher matcher = TIME_PATTERN.matcher(str);
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        while (dateCharacterOffset < i3) {
            int dateCharacterOffset2 = dateCharacterOffset(str, dateCharacterOffset + 1, i3, true);
            matcher.region(dateCharacterOffset, dateCharacterOffset2);
            if (i5 == -1 && matcher.usePattern(TIME_PATTERN).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
                i8 = Integer.parseInt(matcher.group(2));
                i9 = Integer.parseInt(matcher.group(3));
            } else if (i6 != -1 || !matcher.usePattern(DAY_OF_MONTH_PATTERN).matches()) {
                if (i7 == -1) {
                    Pattern pattern = MONTH_PATTERN;
                    if (matcher.usePattern(pattern).matches()) {
                        i7 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i4 == -1 && matcher.usePattern(YEAR_PATTERN).matches()) {
                    i4 = Integer.parseInt(matcher.group(1));
                }
            } else {
                i6 = Integer.parseInt(matcher.group(1));
            }
            dateCharacterOffset = dateCharacterOffset(str, dateCharacterOffset2 + 1, i3, false);
        }
        if (i4 >= 70 && i4 <= 99) {
            i4 += 1900;
        }
        if (i4 >= 0) {
            if (i4 <= 69) {
                i4 += LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            }
            if (i4 >= 1601) {
                if (i7 == -1) {
                    throw new IllegalArgumentException();
                } else if (i6 <= 0 || i6 > 31) {
                    throw new IllegalArgumentException();
                } else if (i5 < 0 || i5 > 23) {
                    throw new IllegalArgumentException();
                } else if (i8 < 0 || i8 > 59) {
                    throw new IllegalArgumentException();
                } else if (i9 < 0 || i9 > 59) {
                    throw new IllegalArgumentException();
                } else {
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
                    gregorianCalendar.setLenient(false);
                    gregorianCalendar.set(1, i4);
                    gregorianCalendar.set(2, i7 - 1);
                    gregorianCalendar.set(5, i6);
                    gregorianCalendar.set(11, i5);
                    gregorianCalendar.set(12, i8);
                    gregorianCalendar.set(13, i9);
                    gregorianCalendar.set(14, 0);
                    return gregorianCalendar.getTimeInMillis();
                }
            }
        }
        throw new IllegalArgumentException();
    }

    private static int dateCharacterOffset(String str, int i2, int i3, boolean z) {
        boolean z2;
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt >= ' ' ? charAt >= 127 || ((charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) : charAt != '\t') {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    private Cookie(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j2;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.hostOnly = z3;
        this.persistent = z4;
    }
}
