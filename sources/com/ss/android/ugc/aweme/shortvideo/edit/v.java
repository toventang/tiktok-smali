package com.ss.android.ugc.aweme.shortvideo.edit;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.dj;
import h.f.b.l;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final a f128043a = new a((byte) 0);

    static {
        Covode.recordClassIndex(83913);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83914);
        }

        private a() {
        }

        public static String a() {
            return b() + a("_cover.png");
        }

        public static String b() {
            StringBuilder sb = new StringBuilder();
            Application application = i.f115645a;
            l.b(application, "");
            File cacheDir = application.getCacheDir();
            l.b(cacheDir, "");
            return sb.append(cacheDir.getPath()).append(File.separator).toString();
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static String a(String str) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
            Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
            l.b(instance, "");
            return simpleDateFormat.format(instance.getTime()) + str;
        }
    }

    public static String b(String str) {
        l.d(str, "");
        String path = new File(dj.f126467j, new File(str).getName()).getPath();
        l.b(path, "");
        return path;
    }

    public static String c(String str) {
        l.d(str, "");
        String path = new File(dj.f126469l, new File(str).getName()).getPath();
        l.b(path, "");
        return path;
    }

    public static String a(String str) {
        l.d(str, "");
        File file = new File(str);
        String path = new File(file.getParent(), "synthetise_" + file.getName()).getPath();
        l.b(path, "");
        return path;
    }
}
