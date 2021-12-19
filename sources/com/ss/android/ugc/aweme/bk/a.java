package com.ss.android.ugc.aweme.bk;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f68724a = new a();

    /* renamed from: b  reason: collision with root package name */
    public Keva f68725b = Keva.getRepoSync("search_local_repo", 0);

    static {
        Covode.recordClassIndex(42313);
    }

    private a() {
        System.nanoTime();
    }

    public final long a(String str) {
        return this.f68725b.getLong(str, 0);
    }

    public final void a(String str, long j2) {
        this.f68725b.storeLong(str, j2);
    }
}
