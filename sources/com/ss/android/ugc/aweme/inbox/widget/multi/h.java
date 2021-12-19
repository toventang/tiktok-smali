package com.ss.android.ugc.aweme.inbox.widget.multi;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.inbox.api.MultiApiManager;
import com.ss.android.ugc.aweme.inbox.b.c;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageResponse;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class h extends com.ss.android.ugc.aweme.common.e.a<FollowPageData, FollowPageResponse> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f104479e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f104480a = c.i();

    /* renamed from: b  reason: collision with root package name */
    public long f104481b;

    /* renamed from: c  reason: collision with root package name */
    public long f104482c;

    /* renamed from: d  reason: collision with root package name */
    public long f104483d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f104484f;

    /* renamed from: g  reason: collision with root package name */
    private long f104485g;

    /* renamed from: h  reason: collision with root package name */
    private int f104486h;

    /* renamed from: i  reason: collision with root package name */
    private List<FollowPageData> f104487i = new ArrayList();

    static {
        Covode.recordClassIndex(66902);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        l.d(objArr, "");
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66903);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<FollowPageData> getItems() {
        return this.f104487i;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        return this.f104484f;
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f104488a;

        static {
            Covode.recordClassIndex(66904);
        }

        b(h hVar) {
            this.f104488a = hVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return MultiApiManager.a().fetchFollowPageData(this.f104488a.f104480a, 1, 20, this.f104488a.f104481b, this.f104488a.f104482c, this.f104488a.f104483d).a();
        }
    }

    private final void a() {
        n.a().a(this.mHandler, new b(this), 1001);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        l.d(objArr, "");
        a();
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        l.d(objArr, "");
        this.f104482c = 0;
        this.f104481b = 0;
        this.f104483d = 0;
        a();
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final /* synthetic */ void handleData(Object obj) {
        FollowPageResponse followPageResponse = (FollowPageResponse) obj;
        super.handleData(followPageResponse);
        if (followPageResponse != null) {
            this.f104481b = followPageResponse.getNoticeMaxTime();
            this.f104482c = followPageResponse.getNoticeMinTime();
            this.f104483d = followPageResponse.getFollowReqOffset();
            this.f104485g = followPageResponse.getNoticeLastReadTime();
            this.f104486h = followPageResponse.getTotal();
            this.f104484f = followPageResponse.getHasMore();
            if (this.mListQueryType == 1) {
                this.f104487i.clear();
            }
            List<FollowPageData> data = followPageResponse.getData();
            if (data != null) {
                this.f104487i.addAll(data);
            }
        }
    }
}
