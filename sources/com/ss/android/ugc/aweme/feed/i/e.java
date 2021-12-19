package com.ss.android.ugc.aweme.feed.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.d.a.b;

public final class e implements b {

    /* renamed from: d  reason: collision with root package name */
    public static String f93470d = "FUNCTION_FROM_DEFAULT";

    /* renamed from: e  reason: collision with root package name */
    public static String f93471e = "FUNCTION_FROM_NOT_INTERESTED";

    /* renamed from: a  reason: collision with root package name */
    public final Aweme f93472a;

    /* renamed from: b  reason: collision with root package name */
    public final String f93473b;

    /* renamed from: c  reason: collision with root package name */
    public final String f93474c;

    static {
        Covode.recordClassIndex(59218);
    }

    public e(Aweme aweme) {
        this(aweme, "homepage_hot", f93470d);
    }

    public e(Aweme aweme, String str) {
        this(aweme, str, f93470d);
    }

    public e(Aweme aweme, String str, String str2) {
        this.f93472a = aweme;
        this.f93473b = str;
        this.f93474c = str2;
    }
}
