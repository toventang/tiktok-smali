package com.ss.android.ugc.aweme.comment.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.i.b.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f72872a = Pattern.compile("(\\[)([^\\[\\]]+)(])");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f72873b = Pattern.compile("<no_trans>(.+?)</no_trans>");

    /* renamed from: c  reason: collision with root package name */
    private static a f72874c = new a();

    static {
        Covode.recordClassIndex(44887);
    }

    public static String a(String str) {
        Matcher matcher = f72872a.matcher(str);
        StringBuilder sb = new StringBuilder(str);
        int i2 = 0;
        while (matcher.find()) {
            int start = matcher.start() + i2;
            int end = matcher.end() + i2;
            if (f72874c.a(matcher.group())) {
                sb.insert(start, "<no_trans>");
                sb.insert(end + 10, "</no_trans>");
                i2 += 21;
            }
        }
        return sb.toString();
    }

    public static String b(String str) {
        Matcher matcher = f72873b.matcher(str);
        StringBuilder sb = new StringBuilder(str);
        int i2 = 0;
        while (matcher.find()) {
            sb.replace(matcher.start() - i2, matcher.end() - i2, matcher.group(1));
            i2 += 21;
        }
        return sb.toString();
    }
}
