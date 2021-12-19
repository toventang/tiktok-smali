package com.bytedance.android.a.a.h;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.a;
import com.bytedance.android.a.a.e;
import com.bytedance.covode.number.Covode;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class d {
    static {
        Covode.recordClassIndex(3207);
    }

    public static String a(String str) {
        try {
            return Uri.parse(str).getHost();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static String a(String str, int i2) {
        if (TextUtils.isEmpty(str) || i2 < 0 || i2 >= str.length()) {
            return str;
        }
        return str.substring(0, i2) + URLEncoder.encode(String.valueOf(str.charAt(i2))) + str.substring(i2 + 1);
    }

    public static String a(String str, boolean z) {
        if ((!z && Build.VERSION.SDK_INT > 23) || TextUtils.isEmpty(str)) {
            return str;
        }
        Pattern pattern = null;
        boolean z2 = true;
        int i2 = 0;
        while (z2) {
            try {
                URI.create(str);
            } catch (Exception e2) {
                Throwable th = e2;
                while (th != null && !(th instanceof URISyntaxException)) {
                    th = th.getCause();
                }
                if (th != null) {
                    int index = ((URISyntaxException) th).getIndex();
                    if (index >= 0) {
                        str = a(str, index);
                    }
                } else {
                    String message = e2.getMessage();
                    if (!TextUtils.isEmpty(message)) {
                        if (pattern == null) {
                            pattern = Pattern.compile("at index (\\d+):");
                        }
                        Matcher matcher = pattern.matcher(message);
                        if (matcher.find()) {
                            String group = matcher.group(1);
                            int i3 = -1;
                            try {
                                i3 = Integer.parseInt(group);
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                            if (i3 >= 0) {
                                str = a(str, i3);
                            }
                        }
                    }
                }
                i2++;
            }
            z2 = false;
        }
        if (e.d().f6645c.f6658b) {
            a.a(a.a(Locale.getDefault(), "encoded[%d] url: [%s]", new Object[]{Integer.valueOf(i2), str}));
        }
        return str;
    }
}
