package com.ss.android.ugc.aweme.sticker.e;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.i;
import h.f.b.l;
import java.io.File;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f134816a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(88129);
    }

    public static String a() {
        StringBuilder sb = new StringBuilder();
        Application application = i.f115645a;
        l.b(application, "");
        File filesDir = application.getFilesDir();
        l.b(filesDir, "");
        return sb.append(filesDir.getAbsolutePath()).append(File.separator).append("personalEffect").toString();
    }
}
