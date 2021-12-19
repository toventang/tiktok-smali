package com.ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public interface ai {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f93042a;

    static {
        Covode.recordClassIndex(59009);
        boolean z = true;
        if (b.a().a(true, "preload_gather_mode", 0) != 1) {
            z = false;
        }
        f93042a = z;
    }
}
