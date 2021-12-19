package com.bytedance.frameworks.baselib.network.http.g;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f29379a = Pattern.compile("(((?:(?i:http|https|rtsp|ws|wss)://(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:(([a-zA-Z0-9[ -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽&&[^ [ - ]   　]]](?:[a-zA-Z0-9[ -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽&&[^ [ - ]   　]]_\\-]{0,61}[a-zA-Z0-9[ -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽&&[^ [ - ]   　]]]){0,1}\\.)+(xn\\-\\-[\\w\\-]{0,58}\\w|[a-zA-Z[ -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽&&[^ [ - ]   　]]]{2,63})|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))))(?:\\:\\d{1,5})?)([/\\?](?:(?:[a-zA-Z0-9[ -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽&&[^ [ - ]   　]];/\\?:@&=#~\\-\\.\\+!\\*'\\(\\),_\\$])|(?:%[a-fA-F0-9]{2}))*)?(?:\\b|$|^))");

    static {
        Covode.recordClassIndex(17127);
    }

    private static boolean d(String str) {
        if (str == null || str.length() <= 7 || !str.substring(0, 8).equalsIgnoreCase("https://")) {
            return false;
        }
        return true;
    }

    private static boolean e(String str) {
        if (str == null || str.length() <= 6 || !str.substring(0, 7).equalsIgnoreCase("http://")) {
            return false;
        }
        return true;
    }

    private static boolean f(String str) {
        if (str == null || str.length() <= 5 || !str.substring(0, 6).equalsIgnoreCase("wss://")) {
            return false;
        }
        return true;
    }

    private static boolean g(String str) {
        if (str == null || str.length() <= 4 || !str.substring(0, 5).equalsIgnoreCase("ws://")) {
            return false;
        }
        return true;
    }

    public static URI a(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException unused) {
            try {
                return URI.create(str.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused2) {
                return c(str);
            }
        }
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (d(str) || e(str) || f(str) || g(str)) {
            return f29379a.matcher(str).matches();
        }
        return false;
    }

    private static URI c(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            int indexOf = str.indexOf("?");
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
            return URI.create(str);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private static String b(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static String a(Map<String, List<String>> map, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String b2 = b(entry.getKey(), str);
            List<String> value = entry.getValue();
            if (value != null && value.size() > 0) {
                for (String str3 : value) {
                    if (str3 != null) {
                        str2 = b(str3, str);
                    } else {
                        str2 = "";
                    }
                    if (sb.length() > 0) {
                        sb.append("&");
                    }
                    sb.append(b2);
                    if (!str2.isEmpty()) {
                        sb.append("=");
                        sb.append(str2);
                    }
                }
            }
        }
        return sb.toString();
    }

    public static Pair<String, String> a(String str, Map<String, String> map) {
        String encodedQuery;
        if (!m.a(str)) {
            try {
                Uri parse = Uri.parse(str);
                StringBuilder sb = new StringBuilder();
                String scheme = parse.getScheme();
                String host = parse.getHost();
                int port = parse.getPort();
                if (host != null) {
                    if (scheme != null) {
                        sb.append(scheme);
                        sb.append("://");
                    }
                    sb.append(host);
                    if (port > 0) {
                        sb.append(':');
                        sb.append(port);
                    }
                }
                String sb2 = sb.toString();
                String encodedPath = parse.getEncodedPath();
                if (!(map == null || (encodedQuery = parse.getEncodedQuery()) == null)) {
                    String[] split = encodedQuery.split("&");
                    for (String str2 : split) {
                        int indexOf = str2.indexOf("=");
                        if (indexOf >= 0) {
                            map.put(URLDecoder.decode(str2.substring(0, indexOf), "UTF-8"), URLDecoder.decode(str2.substring(indexOf + 1), "UTF-8"));
                        } else {
                            map.put(URLDecoder.decode(str2, "UTF-8"), "");
                        }
                    }
                }
                return new Pair<>(sb2, encodedPath);
            } catch (Throwable unused) {
                throw new IOException("parseUrl url is fail !!!");
            }
        } else {
            throw new IOException("parseUrl url is null !!!");
        }
    }

    public static Pair<String, String> b(String str, Map<String, List<String>> map) {
        if (!m.a(str)) {
            try {
                Uri parse = Uri.parse(str);
                StringBuilder sb = new StringBuilder();
                String scheme = parse.getScheme();
                String host = parse.getHost();
                int port = parse.getPort();
                if (host != null) {
                    if (scheme != null) {
                        sb.append(scheme);
                        sb.append("://");
                    }
                    sb.append(host);
                    if (port > 0) {
                        sb.append(':');
                        sb.append(port);
                    }
                }
                String sb2 = sb.toString();
                String encodedPath = parse.getEncodedPath();
                String encodedQuery = parse.getEncodedQuery();
                if (encodedQuery != null) {
                    String[] split = encodedQuery.split("&");
                    for (String str2 : split) {
                        int indexOf = str2.indexOf("=");
                        if (indexOf >= 0) {
                            String decode = URLDecoder.decode(str2.substring(0, indexOf), "UTF-8");
                            List<String> list = map.get(decode);
                            if (list == null) {
                                list = new LinkedList<>();
                            }
                            list.add(URLDecoder.decode(str2.substring(indexOf + 1), "UTF-8"));
                            map.put(decode, list);
                        } else {
                            String decode2 = URLDecoder.decode(str2, "UTF-8");
                            List<String> list2 = map.get(decode2);
                            if (list2 == null) {
                                list2 = new LinkedList<>();
                            }
                            list2.add("");
                            map.put(decode2, list2);
                        }
                    }
                }
                return new Pair<>(sb2, encodedPath);
            } catch (Throwable unused) {
                throw new IOException("parseUrl url is fail !!!");
            }
        } else {
            throw new IOException("parseUrl url is null !!!");
        }
    }

    public static boolean a(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        int length = str.length();
        int length2 = str2.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        int i5 = -1;
        while (i2 < length) {
            if (i3 < length2 && (str2.charAt(i3) == '?' || str2.charAt(i3) == str.charAt(i2))) {
                i2++;
                i3++;
            } else if (i3 < length2 && str2.charAt(i3) == '*') {
                i5 = i2;
                i4 = i3;
                i3++;
            } else if (i4 == -1) {
                return false;
            } else {
                i3 = i4 + 1;
                i5++;
                i2 = i5;
            }
        }
        while (i3 < length2) {
            if (str2.charAt(i3) != '*') {
                return false;
            }
            i3++;
        }
        return true;
    }
}
