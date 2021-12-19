package com.ss.android.ugc.aweme.follow.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.ss.android.ugc.aweme.utils.cs;
import com.ss.android.ugc.aweme.video.e;
import java.io.File;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f96203a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f96204b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f96205c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static File f96206d;

    /* renamed from: e  reason: collision with root package name */
    private static final f f96207e = new f();

    private a() {
    }

    public static boolean a() {
        File file = f96206d;
        if (file != null && file.exists()) {
            return true;
        }
        cs.a(f96203a, false);
        File a2 = cs.a(f96204b, true);
        f96206d = a2;
        if (a2 == null || !a2.exists()) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(60943);
        String str = e.c() + File.separator + "follow_feed_cache";
        f96203a = str;
        String str2 = str + File.separator + "cache";
        f96204b = str2;
        cs.a(str, false);
        f96206d = cs.a(str2, true);
    }

    public static FollowFeedList a(String str) {
        try {
            return (FollowFeedList) f96207e.a(str, FollowFeedList.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(FollowFeedList followFeedList) {
        try {
            String b2 = f96207e.b(followFeedList);
            if (b2 == null) {
                return "";
            }
            return b2;
        } catch (Exception unused) {
            return "";
        }
    }
}
