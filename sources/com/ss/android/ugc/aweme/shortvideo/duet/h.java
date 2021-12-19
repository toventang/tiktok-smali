package com.ss.android.ugc.aweme.shortvideo.duet;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.tools.utils.u;
import h.f.b.l;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f126539a = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(83003);
    }

    public static boolean b() {
        if (!e.b(c()) || !Keva.getRepo("duet_layout").getBoolean("duet_layout_file_copied", false)) {
            return false;
        }
        return true;
    }

    static String c() {
        StringBuilder sb = new StringBuilder();
        Application application = i.f115645a;
        l.b(application, "");
        File filesDir = application.getFilesDir();
        l.b(filesDir, "");
        return sb.append(filesDir.getAbsolutePath()).append(File.separator).append("duet").append(File.separator).append("default").toString();
    }

    public static boolean a() {
        MethodCollector.i(9669);
        if (Keva.getRepo("duet_layout").getInt("duet_layout_version", 0) <= 0) {
            Keva.getRepo("duet_layout").storeBoolean("duet_layout_file_copied", false);
            Keva.getRepo("duet_layout").storeInt("duet_layout_version", 1);
        }
        if (Keva.getRepo("duet_layout").getBoolean("duet_layout_file_copied", false)) {
            MethodCollector.o(9669);
            return true;
        }
        File file = new File(c());
        if (file.exists() || file.mkdirs()) {
            Application application = i.f115645a;
            l.b(application, "");
            try {
                InputStream open = application.getAssets().open("duet_default_layout.zip");
                l.b(open, "");
                String absolutePath = file.getAbsolutePath();
                l.b(absolutePath, "");
                u.a(open, absolutePath);
                Keva.getRepo("duet_layout").storeBoolean("duet_layout_file_copied", true);
                MethodCollector.o(9669);
                return true;
            } catch (IOException unused) {
                MethodCollector.o(9669);
                return false;
            }
        } else {
            MethodCollector.o(9669);
            return false;
        }
    }
}
