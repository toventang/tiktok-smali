package com.ss.android.ugc.aweme.kids.experiment.abmock.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f106537a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static Keva f106538b;

    private b() {
    }

    static {
        Covode.recordClassIndex(68080);
        Keva repoSync = Keva.getRepoSync("kids_ab_mock_config_repo", 1);
        l.b(repoSync, "");
        f106538b = repoSync;
    }

    public static String b(String str) {
        l.d(str, "");
        return f106538b.getString(str, null);
    }

    public static boolean a(String str) {
        l.d(str, "");
        return f106538b.getBoolean("mock_enable_status".concat(String.valueOf(str)), false);
    }

    public static int a(String str, int i2) {
        l.d(str, "");
        return f106538b.getInt(str, i2);
    }

    public static boolean a(String str, boolean z) {
        l.d(str, "");
        return f106538b.getBoolean(str, z);
    }
}
