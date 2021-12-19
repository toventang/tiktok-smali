package com.ss.android.ugc.aweme.feed.x;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static Aweme f95331a;

    /* renamed from: b  reason: collision with root package name */
    public static List<Aweme> f95332b;

    /* renamed from: c  reason: collision with root package name */
    public static User f95333c;

    static {
        Covode.recordClassIndex(60375);
    }

    public static void a(List<Aweme> list) {
        if (f95332b == list) {
            f95332b = null;
        }
    }
}
