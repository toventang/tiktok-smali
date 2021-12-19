package com.bytedance.lynx.hybrid.resource;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class o {
    static {
        Covode.recordClassIndex(25255);
    }

    public static final Uri a(String str) {
        l.c(str, "");
        Uri.Builder path = new Uri.Builder().scheme("local_file").authority("relative").path(str);
        l.a((Object) path, "");
        l.c(path, "");
        Uri build = path.build();
        l.a((Object) build, "");
        return build;
    }

    public static /* synthetic */ Uri b(String str) {
        l.c(str, "");
        Uri.Builder path = new Uri.Builder().scheme("assets").authority("relative").path(str);
        l.a((Object) path, "");
        l.c(path, "");
        Uri build = path.build();
        l.a((Object) build, "");
        return build;
    }
}
