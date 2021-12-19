package com.ss.android.ugc.aweme.tools.mvtemplate.e;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ci.a;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.ugc.tools.utils.k;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static String f140823a = "change_mode";

    static {
        Covode.recordClassIndex(91954);
    }

    public static boolean a() {
        return AVServiceImpl.a().avSettingsService().showMvThemeRecordMode();
    }

    public static String b() {
        return c.f115622a.getFilesDir().getAbsolutePath() + File.separator + "mvtheme";
    }

    public static String a(String str) {
        String b2 = b(str);
        if (!new File(b2).exists()) {
            new File(b2).mkdirs();
        }
        return b2;
    }

    public static String b(String str) {
        return b() + File.separator + str;
    }

    public static boolean a(ShortVideoContext shortVideoContext) {
        if (!a() || shortVideoContext == null || shortVideoContext.f124757b.b() || shortVideoContext.f124757b.c()) {
            return false;
        }
        return true;
    }

    public static String c(String str) {
        return new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US).format(Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime()) + str;
    }

    public static boolean a(MvThemeData mvThemeData) {
        if (mvThemeData == null || mvThemeData.f140618a == null || k.a(mvThemeData.f140618a.getTags())) {
            return false;
        }
        return mvThemeData.f140618a.getTags().contains("NeedServerAlgorithm");
    }

    public static boolean a(String str, String str2, int i2, int i3, int i4, Bitmap.CompressFormat compressFormat) {
        Bitmap a2;
        if (i.a(str) && (a2 = a.a(str, i2, i3, a.b(str), i4)) != null) {
            return a.a(a2, new File(str2.toString()), compressFormat);
        }
        return false;
    }
}
