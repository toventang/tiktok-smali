package com.bytedance.android.live.broadcast.g;

import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.e;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.live.share.ShareApi;
import com.bytedance.android.live.share.response.BatchShareUsersResult;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<User> f7869a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<User> f7870b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public boolean f7871c;

    static {
        Covode.recordClassIndex(3895);
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f7874a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f.a.d.a f7875b;

        static {
            Covode.recordClassIndex(3897);
        }

        b(a aVar, f.a.d.a aVar2) {
            this.f7874a = aVar;
            this.f7875b = aVar2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f7874a.f7871c = false;
            f.a.d.a aVar = this.f7875b;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.g.a$a  reason: collision with other inner class name */
    static final class C0114a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f7872a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f.a.d.a f7873b;

        static {
            Covode.recordClassIndex(3896);
        }

        C0114a(a aVar, f.a.d.a aVar2) {
            this.f7872a = aVar;
            this.f7873b = aVar2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List<User> recentlySharedUsers;
            List<User> topRankUsers;
            d dVar = (d) obj;
            this.f7872a.f7869a.clear();
            BatchShareUsersResult batchShareUsersResult = (BatchShareUsersResult) dVar.data;
            if (!(batchShareUsersResult == null || (topRankUsers = batchShareUsersResult.getTopRankUsers()) == null)) {
                this.f7872a.f7869a.addAll(topRankUsers);
            }
            this.f7872a.f7870b.clear();
            BatchShareUsersResult batchShareUsersResult2 = (BatchShareUsersResult) dVar.data;
            if (!(batchShareUsersResult2 == null || (recentlySharedUsers = batchShareUsersResult2.getRecentlySharedUsers()) == null)) {
                this.f7872a.f7870b.addAll(recentlySharedUsers);
            }
            this.f7872a.f7871c = false;
            f.a.d.a aVar = this.f7873b;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public final void a(long j2, m mVar, f.a.d.a aVar) {
        l.d(mVar, "");
        if (!this.f7871c) {
            this.f7871c = true;
            ((z) ((ShareApi) e.a().a(ShareApi.class)).getBatchShareUsers(j2).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a(mVar))).a(new C0114a(this, aVar), new b(this, aVar));
        }
    }
}
