package com.ss.android.ugc.aweme.kids.experiment.abmock.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.f;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Keva f106534a;

    /* renamed from: b  reason: collision with root package name */
    public static f f106535b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f106536c = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(68079);
        Keva repoSync = Keva.getRepoSync("kids_ab_config_repo", 1);
        l.b(repoSync, "");
        f106534a = repoSync;
    }

    public static int a(String str, int i2) {
        l.d(str, "");
        return f106534a.getInt(str, i2);
    }

    public static String a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        String string = f106534a.getString(str, str2);
        l.b(string, "");
        return string;
    }

    public static boolean a(String str, boolean z) {
        l.d(str, "");
        return f106534a.getBoolean(str, z);
    }
}
