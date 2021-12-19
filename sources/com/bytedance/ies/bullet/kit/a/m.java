package com.bytedance.ies.bullet.kit.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class m {
    static {
        Covode.recordClassIndex(18926);
    }

    public static /* synthetic */ Uri a(String str) {
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
        Uri.Builder path = new Uri.Builder().scheme("local_file").authority("absolute").path(str);
        l.a((Object) path, "");
        l.c(path, "");
        Uri build = path.build();
        l.a((Object) build, "");
        return build;
    }

    public static /* synthetic */ Uri c(String str) {
        l.c(str, "");
        Uri.Builder path = new Uri.Builder().scheme("assets").authority("relative").path(str);
        l.a((Object) path, "");
        l.c(path, "");
        Uri build = path.build();
        l.a((Object) build, "");
        return build;
    }
}
