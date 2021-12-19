package okhttp3.internal.http;

import com.bytedance.covode.number.Covode;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import k.f;
import k.i;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;

public final class HttpHeaders {
    private static final i QUOTED_STRING_DELIMITERS = i.encodeUtf8("\"\\");
    private static final i TOKEN_DELIMITERS = i.encodeUtf8("\t ,=");

    private HttpHeaders() {
    }

    static {
        Covode.recordClassIndex(106232);
    }

    public static long contentLength(Headers headers) {
        return stringToLong(headers.get("Content-Length"));
    }

    public static boolean hasVaryAll(Headers headers) {
        return varyFields(headers).contains("*");
    }

    private static long stringToLong(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private static Set<String> varyFields(Response response) {
        return varyFields(response.headers());
    }

    public static long contentLength(Response response) {
        return contentLength(response.headers());
    }

    public static boolean hasVaryAll(Response response) {
        return hasVaryAll(response.headers());
    }

    public static Headers varyHeaders(Response response) {
        return varyHeaders(response.networkResponse().request().headers(), response.headers());
    }

    private static String readToken(f fVar) {
        try {
            long c2 = fVar.c(TOKEN_DELIMITERS);
            if (c2 == -1) {
                c2 = fVar.f158864b;
            }
            if (c2 != 0) {
                return fVar.h(c2);
            }
            return null;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    private static boolean skipWhitespaceAndCommas(f fVar) {
        boolean z = false;
        while (!fVar.e()) {
            byte f2 = fVar.f(0L);
            if (f2 != 44) {
                if (f2 != 32 && f2 != 9) {
                    break;
                }
                fVar.h();
            } else {
                fVar.h();
                z = true;
            }
        }
        return z;
    }

    public static boolean hasBody(Response response) {
        if (response.request().method().equals("HEAD")) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && contentLength(response) == -1 && !"chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    private static String readQuotedString(f fVar) {
        if (fVar.h() == 34) {
            f fVar2 = new f();
            while (true) {
                long c2 = fVar.c(QUOTED_STRING_DELIMITERS);
                if (c2 == -1) {
                    return null;
                }
                if (fVar.f(c2) == 34) {
                    fVar2.write(fVar, c2);
                    fVar.h();
                    return fVar2.r();
                } else if (fVar.f158864b == c2 + 1) {
                    return null;
                } else {
                    fVar2.write(fVar, c2);
                    fVar.h();
                    fVar2.write(fVar, 1);
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static Set<String> varyFields(Headers headers) {
        Set<String> emptySet = Collections.emptySet();
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            if ("Vary".equalsIgnoreCase(headers.name(i2))) {
                String value = headers.value(i2);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                String[] split = value.split(",");
                for (String str : split) {
                    emptySet.add(str.trim());
                }
            }
        }
        return emptySet;
    }

    private static String repeat(char c2, int i2) {
        char[] cArr = new char[i2];
        Arrays.fill(cArr, c2);
        return new String(cArr);
    }

    public static int parseSeconds(String str, int i2) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    private static int skipAll(f fVar, byte b2) {
        int i2 = 0;
        while (!fVar.e() && fVar.f(0L) == b2) {
            i2++;
            fVar.h();
        }
        return i2;
    }

    public static int skipWhitespace(String str, int i2) {
        while (i2 < str.length() && ((r1 = str.charAt(i2)) == ' ' || r1 == '\t')) {
            i2++;
        }
        return i2;
    }

    public static List<Challenge> parseChallenges(Headers headers, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < headers.size(); i2++) {
            if (str.equalsIgnoreCase(headers.name(i2))) {
                parseChallengeHeader(arrayList, new f().a(headers.value(i2)));
            }
        }
        return arrayList;
    }

    public static Headers varyHeaders(Headers headers, Headers headers2) {
        Set<String> varyFields = varyFields(headers2);
        if (varyFields.isEmpty()) {
            return new Headers.Builder().build();
        }
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            String name = headers.name(i2);
            if (varyFields.contains(name)) {
                builder.add(name, headers.value(i2));
            }
        }
        return builder.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        r8.add(new okhttp3.Challenge(r2, java.util.Collections.singletonMap(null, r6 + repeat('=', r7))));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void parseChallengeHeader(java.util.List<okhttp3.Challenge> r8, k.f r9) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.parseChallengeHeader(java.util.List, k.f):void");
    }

    public static void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        if (cookieJar != CookieJar.NO_COOKIES) {
            List<Cookie> parseAll = Cookie.parseAll(httpUrl, headers);
            if (!parseAll.isEmpty()) {
                cookieJar.saveFromResponse(httpUrl, parseAll);
            }
        }
    }

    public static int skipUntil(String str, int i2, String str2) {
        while (i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            i2++;
        }
        return i2;
    }

    public static boolean varyMatches(Response response, Headers headers, Request request) {
        for (String str : varyFields(response)) {
            if (!Util.equal(headers.values(str), request.headers(str))) {
                return false;
            }
        }
        return true;
    }
}
