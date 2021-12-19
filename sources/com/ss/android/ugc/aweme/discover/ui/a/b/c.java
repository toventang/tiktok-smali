package com.ss.android.ugc.aweme.discover.ui.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f82246a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(51184);
    }

    private static int b() {
        return b.a().a(true, "search_filter_activity", 0);
    }

    public static boolean a() {
        if (b() <= 0 || !com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            return false;
        }
        return true;
    }
}
