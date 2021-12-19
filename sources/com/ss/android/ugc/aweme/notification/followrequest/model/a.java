package com.ss.android.ugc.aweme.notification.followrequest.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public final class a extends com.ss.android.ugc.aweme.common.b<FollowRequestResponse> {

    /* renamed from: e  reason: collision with root package name */
    public static final C2908a f113472e = new C2908a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f113473a;

    /* renamed from: b  reason: collision with root package name */
    public long f113474b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f113475c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f113476d;

    static {
        Covode.recordClassIndex(72968);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        l.d(objArr, "");
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.followrequest.model.a$a  reason: collision with other inner class name */
    public static final class C2908a {
        static {
            Covode.recordClassIndex(72969);
        }

        private C2908a() {
        }

        public /* synthetic */ C2908a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f113477a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f113478b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f113479c;

        static {
            Covode.recordClassIndex(72970);
        }

        b(long j2, long j3, int i2) {
            this.f113477a = j2;
            this.f113478b = j3;
            this.f113479c = i2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FollowRequestResponse call() {
            try {
                return FollowRequestApiManager.a(this.f113477a, this.f113478b, this.f113479c);
            } catch (ExecutionException e2) {
                RuntimeException compatibleException = com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
                l.b(compatibleException, "");
                throw compatibleException;
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.common.b
    public final /* synthetic */ void handleData(FollowRequestResponse followRequestResponse) {
        FollowRequestResponse followRequestResponse2 = followRequestResponse;
        if (followRequestResponse2 == null) {
            this.mData = null;
            return;
        }
        List<User> list = followRequestResponse2.userRequestList;
        if (list == null || list.isEmpty()) {
            followRequestResponse2.hasMore = false;
        }
        if (!this.f113475c || this.mData == null) {
            this.mData = followRequestResponse2;
            return;
        }
        ((FollowRequestResponse) this.mData).maxTime = followRequestResponse2.maxTime;
        ((FollowRequestResponse) this.mData).minTime = followRequestResponse2.minTime;
        ((FollowRequestResponse) this.mData).hasMore = followRequestResponse2.hasMore;
        List<User> list2 = ((FollowRequestResponse) this.mData).userRequestList;
        List<User> list3 = followRequestResponse2.userRequestList;
        l.b(list3, "");
        list2.addAll(list3);
    }

    public final void a(long j2, long j3, int i2) {
        n.a().a(this.mHandler, new b(j2, j3, i2), 0);
    }
}
