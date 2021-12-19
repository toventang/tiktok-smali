package com.ss.android.ugc.aweme.shortvideo;

import android.os.Build;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.a;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.ugc.tools.utils.q;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class dj {

    /* renamed from: d  reason: collision with root package name */
    public static final String f126461d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f126462e;

    /* renamed from: f  reason: collision with root package name */
    public static final String f126463f;

    /* renamed from: g  reason: collision with root package name */
    public static final String f126464g;

    /* renamed from: h  reason: collision with root package name */
    public static final String f126465h;

    /* renamed from: i  reason: collision with root package name */
    public static final String f126466i;

    /* renamed from: j  reason: collision with root package name */
    public static final String f126467j;

    /* renamed from: k  reason: collision with root package name */
    public static final String f126468k;

    /* renamed from: l  reason: collision with root package name */
    public static final String f126469l;

    /* renamed from: m  reason: collision with root package name */
    public static final String f126470m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;

    public static long b() {
        try {
            StatFs statFs = new StatFs(f126461d);
            int i2 = Build.VERSION.SDK_INT;
            return statFs.getAvailableBytes();
        } catch (Exception unused) {
            return 0;
        }
    }

    private static String a() {
        String str;
        g.a().w();
        try {
            str = i.b(com.ss.android.ugc.aweme.port.in.i.f115645a) + "/";
        } catch (Exception e2) {
            q.b("getCreativeToolRootDir error exception:" + e2.getMessage());
            str = ((IVideoRecordPreferences) new a((byte) 0).a(com.ss.android.ugc.aweme.port.in.i.f115645a, IVideoRecordPreferences.class)).getCreativeToolRootDir("");
        }
        if (TextUtils.isEmpty(str)) {
            str = com.ss.android.ugc.aweme.port.in.i.f115645a.getFilesDir() + "/";
        }
        b.i.b(new dk(str), b.i.f4824a);
        return str;
    }

    static {
        Covode.recordClassIndex(82955);
        String a2 = a();
        f126461d = a2;
        f126462e = a2 + "tmp/";
        f126463f = a2 + "draft/";
        f126464g = a2 + "import/";
        f126465h = a2 + "background_video/tmp/";
        f126466i = a2 + "background_video/draft/";
        f126467j = a2 + "origin_sound/";
        f126468k = a2 + "tmp_video/";
        f126469l = a2 + "parallel_upload/";
        f126470m = a2 + "record_work_space";
        n = a2 + "shortvideo/videoedit/audiorecord/";
        o = a2 + "cache/";
        p = a2 + "filters/";
        q = a2 + "audio-effect/";
        r = a2 + "music/";
        s = a2 + "noCopyDraft/";
        t = a2 + "effect/download/";
        u = a2 + "compat_draft_track/";
        i.c(new File(a2));
    }

    public static String a(String str) {
        return f126461d + b(str);
    }

    public static String b(String str) {
        return new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US).format(Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime()) + str;
    }
}
