package com.ss.android.ugc.aweme.cs;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.df.b;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f78977a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(49016);
    }

    public static Keva a() {
        Keva repoFromSp = Keva.getRepoFromSp(b.a(), "AVStoragePreferences", 0);
        l.b(repoFromSp, "");
        return repoFromSp;
    }

    public static final void a(boolean z) {
        a().storeBoolean("key_is_effect_storage_cleaning", z);
    }
}
