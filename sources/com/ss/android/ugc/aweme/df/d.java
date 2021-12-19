package com.ss.android.ugc.aweme.df;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.File;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f80047a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(49825);
    }

    public static final void a(String str, String str2) {
        l.d(str, "");
        if (TextUtils.isEmpty(str2)) {
            e.a("  logFile is null :".concat(String.valueOf(str)));
            return;
        }
        File file = new File(str2);
        e.a(str + "   filePath:" + file.getAbsolutePath() + "         exist:" + file.exists() + "        fileSize:" + file.length());
    }
}
