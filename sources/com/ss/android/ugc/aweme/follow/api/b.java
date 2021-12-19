package com.ss.android.ugc.aweme.follow.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.ss.android.ugc.aweme.legacy.FollowTabBubbleGuideHelperImpl;
import com.ss.android.ugc.aweme.newfollow.c.e;
import h.f.b.l;
import java.util.concurrent.ExecutionException;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static FollowFeedApiV2 f96211a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f96212b = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(60949);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static FollowFeedList a(int i2, long j2, int i3, int i4, int i5, long j3, String str, String str2, String str3, int i6, int i7, int i8, String str4) {
            l.d(str4, "");
            try {
                FollowFeedApiV2 followFeedApiV2 = b.f96211a;
                e eVar = e.a.f112592a;
                l.b(eVar, "");
                FollowFeedList followFeedList = followFeedApiV2.getFollowFeedListNew(i2, j2, i3, 20, i4, i5, j3, eVar.a(), str, str2, str3, FollowTabBubbleGuideHelperImpl.b().a(), i6, i7, null, null, null, null, null, null, Integer.valueOf(i8), str4).get();
                l.b(followFeedList, "");
                return followFeedList;
            } catch (ExecutionException e2) {
                RuntimeException compatibleException = com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
                l.b(compatibleException, "");
                throw compatibleException;
            }
        }
    }

    static {
        Covode.recordClassIndex(60948);
        String str = com.ss.android.c.b.f59141e;
        l.b(str, "");
        f96211a = (FollowFeedApiV2) com.bytedance.ies.ugc.aweme.network.ext.a.a().a(str).a(FollowFeedApiV2.class);
    }
}
