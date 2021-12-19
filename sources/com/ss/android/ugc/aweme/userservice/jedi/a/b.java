package com.ss.android.ugc.aweme.userservice.jedi.a;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.c.e;
import com.ss.android.ugc.aweme.base.livedata.a;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.story.g;
import f.a.d.f;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, User> f142454a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final u<FollowStatus> f142455b = new c(this);

    static {
        Covode.recordClassIndex(93167);
    }

    public b() {
        new Handler(Looper.getMainLooper()).post(new Runnable(this) {
            /* class com.ss.android.ugc.aweme.userservice.jedi.a.b.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f142456a;

            static {
                Covode.recordClassIndex(93168);
            }

            {
                this.f142456a = r1;
            }

            public final void run() {
                a.C1541a.f68149a.a("#FollowStatus").observeForever(this.f142456a.f142455b);
            }
        });
        com.bytedance.jedi.a.c.b.a(com.ss.android.ugc.aweme.userservice.jedi.a.f142450b.f142468e).a(true, new e[0]).a(f.a.h.a.d(f.a.k.a.f158004a)).d(new a(this)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new C3809b(this));
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f142459a;

        static {
            Covode.recordClassIndex(93171);
        }

        c(b bVar) {
            this.f142459a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            FollowStatus followStatus = (FollowStatus) obj;
            if (followStatus != null && (str = followStatus.userId) != null) {
                com.ss.android.ugc.aweme.userservice.jedi.a.f142449a.a(str).d(new a(followStatus, this, followStatus));
            }
        }

        static final class a<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FollowStatus f142460a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f142461b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ FollowStatus f142462c;

            static {
                Covode.recordClassIndex(93172);
            }

            a(FollowStatus followStatus, c cVar, FollowStatus followStatus2) {
                this.f142460a = followStatus;
                this.f142461b = cVar;
                this.f142462c = followStatus2;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                User clone;
                User user = (User) ((com.bytedance.jedi.a.c.f) obj).a();
                if (user != null && (clone = user.clone()) != null) {
                    l.b(clone, "");
                    if (clone.getFollowStatus() != this.f142460a.followStatus) {
                        clone.setFollowStatus(this.f142460a.followStatus);
                        ConcurrentHashMap<String, User> concurrentHashMap = this.f142461b.f142459a.f142454a;
                        String uid = clone.getUid();
                        l.b(uid, "");
                        concurrentHashMap.put(uid, clone);
                        if (clone.getFollowStatus() == 0) {
                            clone.setLivePushNotificationStatus(2);
                        }
                        e eVar = com.ss.android.ugc.aweme.userservice.jedi.a.f142449a;
                        String uid2 = clone.getUid();
                        l.b(uid2, "");
                        eVar.a(uid2, clone);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.b$b  reason: collision with other inner class name */
    static final class C3809b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f142458a;

        static {
            Covode.recordClassIndex(93170);
        }

        C3809b(b bVar) {
            this.f142458a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            if (!(list == null || list.isEmpty())) {
                for (T t : list) {
                    if (t != null) {
                        new FollowStatusEvent(t).post();
                    }
                    a.C1541a.f68149a.a("#FollowStatus").postValue(t);
                    if (com.ss.android.ugc.aweme.story.c.b.c()) {
                        g.f137757a.e().a((FollowStatus) t);
                    }
                }
            }
        }
    }

    static final class a<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f142457a;

        static {
            Covode.recordClassIndex(93169);
        }

        a(b bVar) {
            this.f142457a = bVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            boolean z;
            List list = (List) obj;
            l.d(list, "");
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                User user = this.f142457a.f142454a.get(t.getFirst());
                User user2 = (User) t.getSecond();
                if (!(user == null || user2 == null || user.getFollowStatus() == user2.getFollowStatus())) {
                    FollowStatus followStatus = new FollowStatus(user2.getUid(), user2.getFollowStatus());
                    if (user.getFollowStatus() == 0 || user2.getFollowStatus() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    followStatus.isFollowChange = z;
                    arrayList.add(followStatus);
                    MainServiceImpl.createIMainServicebyMonsterPlugin(false).updateIMUserFollowStatus(user2);
                }
                this.f142457a.f142454a.put(t.getFirst(), t.getSecond());
            }
            return arrayList;
        }
    }
}
