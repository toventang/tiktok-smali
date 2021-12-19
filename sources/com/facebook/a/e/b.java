package com.facebook.a.e;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.a.b.a;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.m;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b {
    static {
        Covode.recordClassIndex(28470);
    }

    public static String a() {
        ae.a();
        Context context = m.f48921g;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static double a(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([\\,\\.]\\d+)*([\\.\\,]\\d+)?", 8).matcher(str);
            if (!matcher.find()) {
                return 0.0d;
            }
            return NumberFormat.getNumberInstance(ad.d()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }

    public static View a(Activity activity) {
        if (a.a(b.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            a.a(th, b.class);
            return null;
        }
    }
}
