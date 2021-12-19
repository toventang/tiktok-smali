package com.ss.android.ugc.aweme.relation.recommend;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.c.d;
import h.f.b.l;
import h.z;

public final class t extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    com.ss.android.ugc.aweme.follow.widet.a f120472a = new com.ss.android.ugc.aweme.follow.widet.a(this.f120478g, new a.g(this) {
        /* class com.ss.android.ugc.aweme.relation.recommend.t.AnonymousClass1 */

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f120479a;

        static {
            Covode.recordClassIndex(78419);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        {
            this.f120479a = r1;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
        public final void a(int i2, User user) {
            com.ss.android.ugc.aweme.relation.b.b.b(this.f120479a.f120475d, com.ss.android.ugc.aweme.relation.c.b.RECOMMEND.getValue());
            if (i2 == 1) {
                d.a(user, this.f120479a.f120474c, this.f120479a.f120475d);
                this.f120479a.a(user, u.a.FOLLOW);
                return;
            }
            d.b(user, this.f120479a.f120474c, this.f120479a.f120475d);
            this.f120479a.a(user, u.a.FOLLOW_CANCEL);
        }
    });

    /* renamed from: b  reason: collision with root package name */
    User f120473b;

    /* renamed from: c  reason: collision with root package name */
    public int f120474c;

    /* renamed from: d  reason: collision with root package name */
    public final int f120475d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.recommend.a f120476e;

    /* renamed from: f  reason: collision with root package name */
    public final h.f.a.b<User, z> f120477f;

    /* renamed from: g  reason: collision with root package name */
    private com.ss.android.ugc.aweme.following.ui.view.a f120478g;

    static {
        Covode.recordClassIndex(78418);
    }

    public static final class a implements a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f120481a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f120482b;

        static {
            Covode.recordClassIndex(78421);
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void a(FollowStatus followStatus) {
            if (followStatus != null) {
                this.f120481a.f120476e.a(followStatus.followStatus, followStatus.followerStatus, null);
            }
        }

        a(t tVar, User user) {
            this.f120481a = tVar;
            this.f120482b = user;
        }
    }

    static final class b implements a.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f120483a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f120484b;

        static {
            Covode.recordClassIndex(78422);
        }

        b(t tVar, User user) {
            this.f120483a = tVar;
            this.f120484b = user;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.e
        public final void a(FollowStatus followStatus) {
            int i2 = this.f120483a.f120475d;
            String uid = this.f120484b.getUid();
            l.b(uid, "");
            d.a(i2, uid, this.f120484b.getFollowStatus());
        }
    }

    public final void a(User user, u.a aVar) {
        String str;
        u a2 = new u().a("on_boarding");
        a2.f109596a = u.c.CARD;
        a2.f109597b = aVar;
        if (this.f120475d == 2) {
            if (user != null) {
                user.setRecType("1-2");
            }
        } else if (user != null) {
            user.setRecType("1-1");
        }
        u a3 = a2.a(user);
        if (user != null) {
            str = user.getRequestId();
        } else {
            str = null;
        }
        a3.s(str).f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.profile.model.User, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(int i2, com.ss.android.ugc.aweme.recommend.a aVar, h.f.a.b<? super User, z> bVar) {
        super(aVar.getView());
        l.d(aVar, "");
        l.d(bVar, "");
        this.f120475d = i2;
        this.f120476e = aVar;
        this.f120477f = bVar;
        this.f120478g = aVar.getFollowBtn();
        aVar.a(false);
        aVar.getView().addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.ss.android.ugc.aweme.relation.recommend.t.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ t f120480a;

            static {
                Covode.recordClassIndex(78420);
            }

            public final void onViewDetachedFromWindow(View view) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f120480a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                t tVar = this.f120480a;
                User user = tVar.f120473b;
                if (user != null) {
                    tVar.f120477f.invoke(user);
                }
            }
        });
    }
}
