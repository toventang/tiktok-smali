package com.ss.android.ugc.aweme.feed.service;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.o.d;
import com.ss.android.ugc.aweme.feed.e;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile IFeedComponentService f93866a;

    static {
        Covode.recordClassIndex(59718);
    }

    public static IFeedComponentService a() {
        if (f93866a == null) {
            f93866a = FeedComponentServiceImpl.b();
        }
        return f93866a;
    }

    public static d a(float f2) {
        return a().a(f2);
    }

    public static Boolean a(Activity activity) {
        return a().a(activity);
    }

    public static <T> T a(Class<T> cls) {
        return (T) a().a(cls);
    }

    public static e a(String str, int i2, s<ag> sVar, com.ss.android.ugc.aweme.feed.n.e eVar) {
        return a().a(str, i2, sVar, eVar);
    }
}
