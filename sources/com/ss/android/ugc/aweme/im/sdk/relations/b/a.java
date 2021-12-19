package com.ss.android.ugc.aweme.im.sdk.relations.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.sysoptimizer.RegexMatcherOptimizer;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static com.ss.android.ugc.aweme.emoji.i.b.a f102965a = new com.ss.android.ugc.aweme.emoji.i.b.a();

    static {
        Covode.recordClassIndex(66003);
    }

    public static boolean a(char c2) {
        if (Character.isUpperCase(c2) || Character.isLowerCase(c2)) {
            return true;
        }
        return false;
    }

    public static boolean b(char c2) {
        return Pattern.compile("[\\p{P}\\p{S}\\p{Z}]").matcher(String.valueOf(c2)).matches();
    }

    public static boolean a(String str) {
        try {
            if (SettingsManager.a().a("tt_dm_emoji_regex_fix", false)) {
                RegexMatcherOptimizer.fix(d.a());
            }
            Matcher matcher = Pattern.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?)").matcher(str);
            if (!matcher.find() || str.indexOf(matcher.group()) != 0) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
        }
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String trim = str.trim();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < trim.length(); i2++) {
            sb.append(com.github.a.a.a.a(trim.charAt(i2)));
        }
        return sb.toString();
    }

    public static boolean b(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            Matcher matcher = Pattern.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?)").matcher(str);
            while (matcher.find()) {
                arrayList.add(matcher.group());
            }
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                i2 += ((String) arrayList.get(i3)).length();
            }
            if (i2 != str.length()) {
                Matcher matcher2 = Pattern.compile("(\\[)([^\\[\\]]+)(])").matcher(str);
                while (matcher2.find()) {
                    String group = matcher2.group();
                    if (f102965a.a(f.j(), group) != null) {
                        arrayList.add(group);
                    }
                }
                int i4 = 0;
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    i4 += ((String) arrayList.get(i5)).length();
                }
                if (i4 != str.length() || arrayList.size() > 3) {
                    return false;
                }
                return true;
            } else if (arrayList.size() <= 3) {
                return true;
            } else {
                return false;
            }
        } catch (Exception unused) {
        }
    }

    public static String a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            if (str.contains(str4)) {
                return str4;
            }
            str4 = c(str4).toLowerCase();
            StringBuilder sb = new StringBuilder();
            int indexOf = str3.indexOf(str4);
            int indexOf2 = str2.indexOf(str4);
            int i2 = 0;
            if (indexOf2 != -1) {
                int i3 = 0;
                int i4 = 0;
                while (i2 < str.length()) {
                    int length = com.github.a.a.a.a(str.charAt(i2)).toLowerCase().length() + i4;
                    if (i4 >= indexOf2 && i4 < str4.length() + indexOf2) {
                        sb.append(str.charAt(i2));
                    } else if (length <= indexOf2 || length > str4.length() + indexOf2) {
                        if (indexOf2 > i4 && indexOf2 < length) {
                            sb.append(str.charAt(i2));
                        }
                        i2++;
                        i4 = length;
                    } else {
                        sb.append(str.charAt(i2));
                    }
                    i3++;
                    i2++;
                    i4 = length;
                }
                i2 = i3;
            }
            if (indexOf != -1 && indexOf < str.length() && str4.length() > i2) {
                return str.substring(indexOf, Math.min(str.length(), str4.length() + indexOf));
            }
            if (!TextUtils.isEmpty(sb.toString())) {
                return sb.toString();
            }
        }
        return str4;
    }
}
