package com.ss.android.ugc.aweme.find.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.f.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.friends.model.NewRecommendList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.api.RecommendUserApiService;
import f.a.d.g;
import f.a.t;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b extends d<d, FindFriendsState> {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends User> f96133a = z.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    public final a f96134b = new a(0, 1);

    /* renamed from: f  reason: collision with root package name */
    public final a f96135f = new a(1, 1);

    static {
        Covode.recordClassIndex(60910);
    }

    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t a(Object obj) {
        boolean z;
        d dVar = (d) obj;
        l.d(dVar, "");
        if (dVar.f96142b == 0) {
            z = true;
        } else {
            z = false;
        }
        t<R> d2 = RecommendUserApiService.f133669a.fetchRecommendList4FindFriends(Integer.valueOf(dVar.f96141a), Integer.valueOf(dVar.f96142b), dVar.f96143c).d(new a(this, z, new ArrayList(), dVar));
        l.b(d2, "");
        return d2;
    }

    static final class a<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f96136a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f96137b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f96138c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f96139d;

        static {
            Covode.recordClassIndex(60911);
        }

        a(b bVar, boolean z, List list, d dVar) {
            this.f96136a = bVar;
            this.f96137b = z;
            this.f96138c = list;
            this.f96139d = dVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            String str;
            NewRecommendList newRecommendList = (NewRecommendList) obj;
            l.d(newRecommendList, "");
            for (T t : newRecommendList.getUserList()) {
                BaseResponse.ServerTimeExtra serverTimeExtra = newRecommendList.extra;
                if (serverTimeExtra == null || (str = serverTimeExtra.logid) == null) {
                    str = "";
                }
                t.setRequestId(str);
            }
            if (!this.f96137b) {
                newRecommendList.getUserList().addAll(0, this.f96136a.f96133a);
            }
            this.f96136a.f96133a = newRecommendList.getUserList();
            Iterator<T> it = newRecommendList.getUserList().iterator();
            while (it.hasNext()) {
                this.f96138c.add(new a(it.next(), 2));
            }
            if (!this.f96138c.isEmpty()) {
                if (newRecommendList.getNewUserCount() > 0) {
                    this.f96138c.add(0, this.f96136a.f96134b);
                    if (this.f96138c.size() > newRecommendList.getNewUserCount() + 1) {
                        this.f96138c.add(newRecommendList.getNewUserCount() + 1, this.f96136a.f96135f);
                    }
                } else {
                    this.f96138c.add(0, this.f96136a.f96135f);
                }
            }
            if (this.f96139d.f96142b == 0) {
                return new FindFriendsState(new e(1), this.f96138c, newRecommendList.hasMore(), newRecommendList.getCursor(), null, null, false, null, 240, null);
            }
            return new FindFriendsState(new e(2), this.f96138c, newRecommendList.hasMore(), newRecommendList.getCursor(), null, null, false, null, 240, null);
        }
    }
}
