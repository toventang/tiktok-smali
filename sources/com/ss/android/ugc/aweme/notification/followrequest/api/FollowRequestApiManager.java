package com.ss.android.ugc.aweme.notification.followrequest.api;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.notification.api.a;
import com.ss.android.ugc.aweme.notification.followrequest.model.ApproveResponse;
import com.ss.android.ugc.aweme.notification.followrequest.model.FollowRequestResponse;
import com.ss.android.ugc.aweme.notification.followrequest.model.RejectResponse;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import l.b.c;
import l.b.e;
import l.b.f;
import l.b.o;
import l.b.t;

public final class FollowRequestApiManager {

    /* renamed from: a  reason: collision with root package name */
    static final String f113441a;

    /* renamed from: b  reason: collision with root package name */
    public static FollowRequestApi f113442b;

    public interface FollowRequestApi {
        static {
            Covode.recordClassIndex(72953);
        }

        @o(a = "/aweme/v1/commit/follow/request/approve/")
        @e
        q<ApproveResponse> approveRequest(@c(a = "from_user_id") String str, @c(a = "approve_from") int i2);

        @f(a = "/aweme/v1/user/following/request/list/")
        q<FollowRequestResponse> fetchFollowRequestList(@t(a = "max_time") long j2, @t(a = "min_time") long j3, @t(a = "count") int i2);

        @o(a = "/aweme/v1/commit/follow/request/reject/")
        @e
        q<RejectResponse> rejectRequest(@c(a = "from_user_id") String str);
    }

    static {
        Covode.recordClassIndex(72950);
        String str = a.f113228e;
        f113441a = str;
        f113442b = (FollowRequestApi) com.bytedance.ies.ugc.aweme.network.ext.a.a(str, FollowRequestApi.class);
    }

    public static void a(Handler handler, final String str) {
        n.a().a(handler, new Callable() {
            /* class com.ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager.AnonymousClass2 */

            static {
                Covode.recordClassIndex(72952);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                try {
                    return FollowRequestApiManager.f113442b.rejectRequest(str).get();
                } catch (ExecutionException e2) {
                    throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
                }
            }
        }, 2);
    }

    public static FollowRequestResponse a(long j2, long j3, int i2) {
        try {
            return f113442b.fetchFollowRequestList(j2, j3, i2).get();
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }

    public static void a(Handler handler, final String str, final int i2) {
        n.a().a(handler, new Callable() {
            /* class com.ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager.AnonymousClass1 */

            static {
                Covode.recordClassIndex(72951);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                try {
                    return FollowRequestApiManager.f113442b.approveRequest(str, i2).get();
                } catch (ExecutionException e2) {
                    throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
                }
            }
        }, 1);
    }
}
