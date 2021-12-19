package com.ttnet.org.chromium.base;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PiiElider {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f155172a;

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f155173b;

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f155174c = Pattern.compile("\\sat\\sorg\\.chromium\\.[^ ]+.");

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f155175d;

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f155176e = Pattern.compile("([0-9a-fA-F]{2}[-:]+){5}[0-9a-fA-F]{2}");

    /* renamed from: f  reason: collision with root package name */
    private static final Pattern f155177f = Pattern.compile("\\[\\w*:CONSOLE.*\\].*");

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f155178g = {"org.chromium.", "com.google."};

    /* renamed from: h  reason: collision with root package name */
    private static final String[] f155179h = {"android.accessibilityservice", "android.accounts", "android.animation", "android.annotation", "android.app", "android.appwidget", "android.bluetooth", "android.content", "android.database", "android.databinding", "android.drm", "android.gesture", "android.graphics", "android.hardware", "android.inputmethodservice", "android.location", "android.media", "android.mtp", "android.net", "android.nfc", "android.opengl", "android.os", "android.preference", "android.print", "android.printservice", "android.provider", "android.renderscript", "android.sax", "android.security", "android.service", "android.speech", "android.support", "android.system", "android.telecom", "android.telephony", "android.test", "android.text", "android.transition", "android.util", "android.view", "android.webkit", "android.widget", "com.android.", "dalvik.", "java.", "javax.", "org.apache.", "org.json.", "org.w3c.dom.", "org.xml.", "org.xmlpull."};

    static {
        Covode.recordClassIndex(103272);
        Pattern compile = Pattern.compile("((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))");
        f155172a = compile;
        Pattern compile2 = Pattern.compile("(([a-zA-Z0-9 -퟿豈-﷏ﷰ-￯]([a-zA-Z0-9 -퟿豈-﷏ﷰ-￯\\-]{0,61}[a-zA-Z0-9 -퟿豈-﷏ﷰ-￯]){0,1}\\.)+[a-zA-Z -퟿豈-﷏ﷰ-￯]{2,63}|" + compile + ")");
        f155173b = compile2;
        f155175d = Pattern.compile("(?:\\b|^)((?:(http|https|Http|Https|rtsp|Rtsp):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:" + compile2 + ")(?:\\:\\d{1,5})?)(\\/(?:(?:[a-zA-Z0-9 -퟿豈-﷏ﷰ-￯\\;\\/\\?\\:\\@\\&\\=\\#\\~\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?(?:\\b|$)");
    }

    private static boolean b(String str) {
        for (String str2 : f155178g) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(String str) {
        for (String str2 : f155179h) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static String sanitizeStacktrace(String str) {
        String[] split = str.split("\\n");
        split[0] = a(split[0]);
        for (int i2 = 1; i2 < split.length; i2++) {
            if (split[i2].startsWith("Caused by:")) {
                split[i2] = a(split[i2]);
            }
        }
        return TextUtils.join("\n", split);
    }

    private static String a(String str) {
        if (f155174c.matcher(str).find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        Matcher matcher = f155175d.matcher(sb);
        int i2 = 0;
        while (matcher.find(i2)) {
            int start = matcher.start();
            i2 = matcher.end();
            String substring = sb.substring(start, i2);
            if (!b(substring) && !c(substring)) {
                sb.replace(start, i2, "HTTP://WEBADDRESS.ELIDED");
                i2 = start + 24;
                matcher = f155175d.matcher(sb);
            }
        }
        return sb.toString();
    }
}
