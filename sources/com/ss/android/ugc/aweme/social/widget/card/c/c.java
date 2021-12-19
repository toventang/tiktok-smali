package com.ss.android.ugc.aweme.social.widget.card.c;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.newfollow.c.e;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.eu;
import h.f.b.l;
import h.z;
import java.util.Map;
import java.util.concurrent.Callable;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f133774a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(87508);
    }

    public static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ User f133785a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f133786b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f133787c;

        static {
            Covode.recordClassIndex(87512);
        }

        public d(User user, String str, String str2) {
            this.f133785a = user;
            this.f133786b = str;
            this.f133787c = str2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String a2 = c.a(this.f133785a);
            com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f133786b).a("enter_method", this.f133787c).a("to_user_id", this.f133785a.getUid());
            new u();
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("follow_type", u.b(this.f133785a).getType()).a("relation_type", this.f133785a.getFriendTypeStr()).a("rec_type", this.f133785a.getRecType());
            l.b(a4, "");
            r.a(a2, eu.a(a4, this.f133785a).f66730a);
            return z.f158842a;
        }
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f133775a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f133776b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Integer f133777c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ u.c f133778d;

        static {
            Covode.recordClassIndex(87509);
        }

        a(Map map, User user, Integer num, u.c cVar) {
            this.f133775a = map;
            this.f133776b = user;
            this.f133777c = num;
            this.f133778d = cVar;
        }

        public final void run() {
            String str = (String) this.f133775a.get("enter_from");
            String str2 = (String) this.f133775a.get("previous_page");
            String str3 = (String) this.f133775a.get("homepage_uid");
            String str4 = (String) this.f133775a.get("position");
            String str5 = (String) this.f133775a.get("enter_method");
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("rec_type", this.f133776b.getRecType()).a("to_user_id", this.f133776b.getUid()).a("previous_page", str2).a("req_id", this.f133776b.getRequestId()).a("impr_id", this.f133776b.getUid()).a("follow_status", this.f133776b.getFollowStatus());
            l.b(a2, "");
            com.ss.android.ugc.aweme.app.f.d a3 = eu.a(a2, this.f133776b);
            Integer num = this.f133777c;
            if (num != null) {
                a3.a("impr_order", num.intValue());
            }
            if (str5 != null) {
                a3.a("enter_method", str5);
            }
            r.a("enter_personal_detail", a3.f66730a);
            u q = new u().a(str).o(str5).q(str2);
            q.f109596a = this.f133778d;
            q.f109597b = u.a.ENTER_PROFILE;
            q.a(this.f133776b).s(this.f133776b.getRequestId()).t(str3).p(str4).f();
        }
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f133779a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f133780b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f133781c;

        static {
            Covode.recordClassIndex(87510);
        }

        b(Map map, User user, int i2) {
            this.f133779a = map;
            this.f133780b = user;
            this.f133781c = i2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str = (String) this.f133779a.get("enter_from");
            String str2 = (String) this.f133779a.get("previous_page");
            String str3 = (String) this.f133779a.get("homepage_uid");
            String str4 = (String) this.f133779a.get("position");
            if (this.f133780b.isShould_write_impr()) {
                e.a.f112592a.a(1, this.f133780b.getUid());
            }
            r.a("show_recommend_user_cell", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("rec_type", this.f133780b.getRecType()).a("rec_uid", this.f133780b.getUid()).a("impr_order", this.f133781c).a("previous_page", str2).a("relation_type", this.f133780b.getFriendTypeStr()).a("req_id", this.f133780b.getRequestId()).f66730a);
            u q = new u().a(str).q(str2);
            q.f109596a = u.c.CARD;
            q.f109597b = u.a.SHOW;
            q.a(this.f133780b).s(this.f133780b.getRequestId()).t(str3).p(str4).f();
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.c.c$c  reason: collision with other inner class name */
    static final class RunnableC3470c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f133782a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f133783b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f133784c;

        static {
            Covode.recordClassIndex(87511);
        }

        RunnableC3470c(Map map, User user, int i2) {
            this.f133782a = map;
            this.f133783b = user;
            this.f133784c = i2;
        }

        public final void run() {
            String str = (String) this.f133782a.get("enter_from");
            String str2 = (String) this.f133782a.get("previous_page");
            r.a("close_recommend_user_cell", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("previous_page", str2).a("rec_type", this.f133783b.getRecType()).a("rec_uid", this.f133783b.getUid()).a("impr_order", this.f133784c).a("relation_type", this.f133783b.getFriendTypeStr()).a("req_id", this.f133783b.getRequestId()).f66730a);
            u q = new u().a(str).q(str2);
            q.f109596a = u.c.CARD;
            q.f109597b = u.a.CLOSE;
            q.a(this.f133783b).p((String) this.f133782a.get("position")).s(this.f133783b.getRequestId()).t((String) this.f133782a.get("homepage_uid")).f();
        }
    }

    public static String a(User user) {
        if (user.getFollowStatus() == 0) {
            return "follow";
        }
        return "follow_cancel";
    }

    public static void a(User user, int i2, Map<String, String> map) {
        l.d(user, "");
        l.d(map, "");
        r.a().execute(new RunnableC3470c(map, user, i2));
    }

    public static void b(User user, int i2, Map<String, String> map) {
        l.d(user, "");
        l.d(map, "");
        i.b(new b(map, user, i2), i.f4824a);
    }

    public static void a(User user, u.c cVar, Integer num, Map<String, String> map) {
        l.d(user, "");
        l.d(cVar, "");
        l.d(map, "");
        r.a().execute(new a(map, user, num, cVar));
    }

    public static void a(User user, String str, String str2, u.a aVar, u.c cVar) {
        l.d(user, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(aVar, "");
        u a2 = new u().a(str).o(str2).a(user);
        a2.f109597b = aVar;
        a2.f109596a = cVar;
        a2.f();
    }
}
