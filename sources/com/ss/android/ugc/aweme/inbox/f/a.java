package com.ss.android.ugc.aweme.inbox.f;

import android.app.Activity;
import android.content.res.Resources;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.notice.api.a;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AtMe;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.DuetNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FriendNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.PostNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice;
import com.ss.android.ugc.aweme.notification.h.u;
import com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.aa;
import com.ss.android.ugc.aweme.utils.hk;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final e f104213d = new e((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f104214a = "Activity";

    /* renamed from: b  reason: collision with root package name */
    public final String f104215b = "People you follow are LIVE";

    /* renamed from: c  reason: collision with root package name */
    public final h.h f104216c = h.i.a((h.f.a.a) h.f104230a);

    /* renamed from: e  reason: collision with root package name */
    private final h.h f104217e = h.i.a((h.f.a.a) t.f104243a);

    /* renamed from: f  reason: collision with root package name */
    private final h.h f104218f = h.i.a((h.f.a.a) s.f104242a);

    /* renamed from: g  reason: collision with root package name */
    private final h.h f104219g = h.i.a((h.f.a.a) r.f104241a);

    /* renamed from: h  reason: collision with root package name */
    private final h.h f104220h = h.i.a((h.f.a.a) l.f104235a);

    /* renamed from: i  reason: collision with root package name */
    private final h.h f104221i = h.i.a((h.f.a.a) m.f104236a);

    /* renamed from: j  reason: collision with root package name */
    private final String f104222j = "others";

    /* renamed from: k  reason: collision with root package name */
    private final String f104223k = "activities";

    /* renamed from: l  reason: collision with root package name */
    private final h.h f104224l = h.i.a((h.f.a.a) o.f104238a);

    /* renamed from: m  reason: collision with root package name */
    private final h.h f104225m = h.i.a((h.f.a.a) p.f104239a);
    private final h.h n = h.i.a((h.f.a.a) q.f104240a);
    private final h.h o = h.i.a((h.f.a.a) g.f104229a);
    private final h.h p = h.i.a((h.f.a.a) f.f104228a);
    private final h.h q = h.i.a((h.f.a.a) new d(this));
    private final h.h r = h.i.a((h.f.a.a) c.f104227a);
    private final h.h s = h.i.a((h.f.a.a) new b(this));
    private final h.h t = h.i.a((h.f.a.a) C2654a.f104226a);
    private final h.h u = h.i.a((h.f.a.a) k.f104234a);
    private final h.h v = h.i.a((h.f.a.a) j.f104233a);
    private final Comparator<MusNotice> w = n.f104237a;

    static {
        Covode.recordClassIndex(66728);
    }

    private final List<String> e() {
        return (List) this.f104220h.getValue();
    }

    private final List<String> f() {
        return (List) this.f104224l.getValue();
    }

    private final List<String> h() {
        return (List) this.q.getValue();
    }

    private final com.ss.android.ugc.aweme.inbox.widget.multi.n i() {
        return (com.ss.android.ugc.aweme.inbox.widget.multi.n) this.u.getValue();
    }

    private final com.ss.android.ugc.aweme.inbox.widget.multi.n j() {
        return (com.ss.android.ugc.aweme.inbox.widget.multi.n) this.v.getValue();
    }

    public final List<String> a() {
        return (List) this.o.getValue();
    }

    public static final class e {
        static {
            Covode.recordClassIndex(66733);
        }

        private e() {
        }

        public static void a() {
            if (!com.ss.android.ugc.aweme.inbox.b.c.i()) {
                if (com.ss.android.ugc.aweme.notice.api.b.a(12) != 0) {
                    com.ss.android.ugc.aweme.notice.api.b.d(12);
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.notice.api.bean.m(6, com.ss.android.ugc.aweme.notice.api.b.a(6)));
                }
            }
        }

        public /* synthetic */ e(byte b2) {
            this();
        }

        public static List<FollowPageData> a(List<FollowPageData> list) {
            MusNotice notice;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                T t2 = t;
                if (!(t2.getFollowRequest() == null && ((notice = t2.getNotice()) == null || notice.followNotice == null))) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.inbox.widget.multi.n> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f104233a = new j();

        static {
            Covode.recordClassIndex(66738);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.inbox.widget.multi.n invoke() {
            return new com.ss.android.ugc.aweme.inbox.widget.multi.n(com.ss.android.ugc.aweme.inbox.widget.multi.o.DOT);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.inbox.widget.multi.n> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f104234a = new k();

        static {
            Covode.recordClassIndex(66739);
        }

        k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.inbox.widget.multi.n invoke() {
            return new com.ss.android.ugc.aweme.inbox.widget.multi.n(com.ss.android.ugc.aweme.inbox.widget.multi.o.NONE);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.f.a$a  reason: collision with other inner class name */
    static final class C2654a extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2654a f104226a = new C2654a();

        static {
            Covode.recordClassIndex(66729);
        }

        C2654a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String a2 = y.a((int) R.string.ckv);
            if (a2 == null) {
                return "";
            }
            return a2;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f104227a = new c();

        static {
            Covode.recordClassIndex(66731);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String a2 = y.a((int) R.string.clg);
            if (a2 == null) {
                return "";
            }
            return a2;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f104228a = new f();

        static {
            Covode.recordClassIndex(66734);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String a2 = y.a((int) R.string.ckz);
            if (a2 == null) {
                return "";
            }
            return a2;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f104229a = new g();

        static {
            Covode.recordClassIndex(66735);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends String> invoke() {
            String a2 = y.a((int) R.string.cl7);
            if (a2 == null) {
                a2 = "";
            }
            return h.a.n.a(a2);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f104230a = new h();

        static {
            Covode.recordClassIndex(66736);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String a2 = y.a((int) R.string.flb);
            if (a2 == null) {
                return "";
            }
            return a2;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f104241a = new r();

        static {
            Covode.recordClassIndex(66746);
        }

        r() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String a2 = y.a((int) R.string.ckl);
            if (a2 == null) {
                return "";
            }
            return a2;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f104242a = new s();

        static {
            Covode.recordClassIndex(66747);
        }

        s() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String a2 = y.a((int) R.string.cl0);
            if (a2 == null) {
                return "";
            }
            return a2;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<List<? extends String>> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(66730);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends String> invoke() {
            String[] strArr = new String[2];
            String a2 = y.a((int) R.string.cku);
            if (a2 == null) {
                a2 = "";
            }
            strArr[0] = a2;
            strArr[1] = this.this$0.f104215b;
            return h.a.n.b(strArr);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<List<? extends String>> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(66732);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends String> invoke() {
            String[] strArr = new String[2];
            String a2 = y.a((int) R.string.clh);
            if (a2 == null) {
                a2 = "";
            }
            strArr[0] = a2;
            strArr[1] = this.this$0.f104214a;
            return h.a.n.b(strArr);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f104238a = new o();

        static {
            Covode.recordClassIndex(66743);
        }

        o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends String> invoke() {
            return h.a.n.b("New %s", "New %1$s and %2$s", "New %1$s, %2$s and %3$s", "New %1$s, %2$s, %3$s, and %4$s", "New %1$s, %2$s, %3$s, %4$s, and %5$s", "New %1$s, %2$s, %3$s, %4$s, %5$s and %6$s", "New %1$s, %2$s, %3$s, %4$s, %5$s, %6$s and %7$s");
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f104239a = new p();

        static {
            Covode.recordClassIndex(66744);
        }

        p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends String> invoke() {
            return h.a.n.b("New %s ...", "New %1$s, %2$s ...", "New %1$s, %2$s, %3$s ...", "New %1$s, %2$s, %3$s, %4$s ...", "New %1$s, %2$s, %3$s, %4$s, %5$s ...", "New %1$s, %2$s, %3$s, %4$s, %5$s, %6$s ...");
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f104240a = new q();

        static {
            Covode.recordClassIndex(66745);
        }

        q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends String> invoke() {
            return h.a.n.b("mentions", "comments", "followers", "Q&amp;A", "from TikTok", "likes");
        }
    }

    private static Resources g() {
        Resources resources;
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity == null || (resources = topActivity.getResources()) == null) {
            return com.bytedance.ies.ugc.appcontext.d.a().getResources();
        }
        return resources;
    }

    private static int l() {
        if (com.ss.android.ugc.aweme.inbox.b.c.c()) {
            return R.drawable.np;
        }
        if (com.ss.android.ugc.aweme.inbox.b.c.d()) {
            return R.drawable.nq;
        }
        return R.drawable.no;
    }

    private final com.ss.android.ugc.aweme.inbox.widget.multi.n k() {
        int[] e2 = h.a.n.e((Collection<Integer>) com.ss.android.ugc.aweme.notification.redpoint.f.c(a.b.a()));
        int b2 = com.ss.android.ugc.aweme.notice.api.b.b(Arrays.copyOf(e2, e2.length));
        int[] e3 = h.a.n.e((Collection<Integer>) com.ss.android.ugc.aweme.notification.redpoint.f.d(a.b.a()));
        int b3 = com.ss.android.ugc.aweme.notice.api.b.b(Arrays.copyOf(e3, e3.length));
        if (b2 > 0) {
            return new com.ss.android.ugc.aweme.inbox.widget.multi.n(com.ss.android.ugc.aweme.inbox.widget.multi.o.COUNT, b2);
        }
        if (b3 > 0) {
            return j();
        }
        return i();
    }

    public final com.ss.android.ugc.aweme.inbox.widget.multi.n d() {
        int a2;
        if (com.ss.android.ugc.aweme.inbox.b.c.i()) {
            a2 = com.ss.android.ugc.aweme.notice.api.b.a(534);
        } else {
            a2 = com.ss.android.ugc.aweme.notice.api.b.a(7) - com.ss.android.ugc.aweme.notice.api.b.a(233);
        }
        if (a2 > 0) {
            return new com.ss.android.ugc.aweme.inbox.widget.multi.n(com.ss.android.ugc.aweme.inbox.widget.multi.o.COUNT, a2);
        }
        return i();
    }

    static final class l extends h.f.b.m implements h.f.a.a<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f104235a = new l();

        static {
            Covode.recordClassIndex(66740);
        }

        l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends String> invoke() {
            String[] strArr = new String[7];
            String a2 = y.a((int) R.string.ck9);
            String str = "";
            if (a2 == null) {
                a2 = str;
            }
            strArr[0] = a2;
            String a3 = y.a((int) R.string.ck_);
            if (a3 == null) {
                a3 = str;
            }
            strArr[1] = a3;
            String a4 = y.a((int) R.string.ckb);
            if (a4 == null) {
                a4 = str;
            }
            strArr[2] = a4;
            String a5 = y.a((int) R.string.ckd);
            if (a5 == null) {
                a5 = str;
            }
            strArr[3] = a5;
            String a6 = y.a((int) R.string.ckf);
            if (a6 == null) {
                a6 = str;
            }
            strArr[4] = a6;
            String a7 = y.a((int) R.string.ckh);
            if (a7 == null) {
                a7 = str;
            }
            strArr[5] = a7;
            String a8 = y.a((int) R.string.ckj);
            if (a8 != null) {
                str = a8;
            }
            strArr[6] = str;
            return h.a.n.b(strArr);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f104236a = new m();

        static {
            Covode.recordClassIndex(66741);
        }

        m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends String> invoke() {
            String[] strArr = new String[6];
            String a2 = y.a((int) R.string.cka);
            String str = "";
            if (a2 == null) {
                a2 = str;
            }
            strArr[0] = a2;
            String a3 = y.a((int) R.string.ckc);
            if (a3 == null) {
                a3 = str;
            }
            strArr[1] = a3;
            String a4 = y.a((int) R.string.cke);
            if (a4 == null) {
                a4 = str;
            }
            strArr[2] = a4;
            String a5 = y.a((int) R.string.ckg);
            if (a5 == null) {
                a5 = str;
            }
            strArr[3] = a5;
            String a6 = y.a((int) R.string.cki);
            if (a6 == null) {
                a6 = str;
            }
            strArr[4] = a6;
            String a7 = y.a((int) R.string.ckk);
            if (a7 != null) {
                str = a7;
            }
            strArr[5] = str;
            return h.a.n.b(strArr);
        }
    }

    static final class t extends h.f.b.m implements h.f.a.a<List<? extends i>> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f104243a = new t();

        static {
            Covode.recordClassIndex(66748);
        }

        t() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends i> invoke() {
            i[] iVarArr = new i[6];
            String a2 = y.a((int) R.string.ckw);
            String str = "";
            if (a2 == null) {
                a2 = str;
            }
            iVarArr[0] = new i(26, a2);
            String a3 = y.a((int) R.string.ckn);
            if (a3 == null) {
                a3 = str;
            }
            iVarArr[1] = new i(44, a3);
            String a4 = y.a((int) R.string.ckp);
            if (a4 == null) {
                a4 = str;
            }
            iVarArr[2] = new i(7, a4);
            String a5 = y.a((int) R.string.cl1);
            if (a5 == null) {
                a5 = str;
            }
            iVarArr[3] = new i(84, a5);
            String a6 = y.a((int) R.string.cky);
            if (a6 == null) {
                a6 = str;
            }
            iVarArr[4] = new i(37, a6);
            String a7 = y.a((int) R.string.cks);
            if (a7 != null) {
                str = a7;
            }
            iVarArr[5] = new i(3, str);
            return h.a.n.b(iVarArr);
        }
    }

    public final com.ss.android.ugc.aweme.inbox.widget.multi.b b() {
        List<String> list;
        boolean z;
        List<String> h2 = h();
        String str = (String) this.r.getValue();
        String b2 = aa.a.b(System.currentTimeMillis());
        com.ss.android.ugc.aweme.inbox.widget.multi.b a2 = com.ss.android.ugc.aweme.inbox.i.a(com.ss.android.ugc.aweme.inbox.widget.multi.e.ACTIVITY);
        if (!com.ss.android.ugc.aweme.inbox.b.c.g() || a2 == null || (list = a2.f104443b) == null) {
            list = h2;
        }
        com.ss.android.ugc.aweme.inbox.widget.multi.a aVar = null;
        if (com.ss.android.ugc.aweme.inbox.b.c.f()) {
            if (a2 != null && hk.a(a2.f104445d)) {
                aVar = a2.f104444c;
                str = a2.f104445d;
            }
            b2 = "";
        }
        com.ss.android.ugc.aweme.inbox.widget.multi.n k2 = k();
        if (k2.f104495a != com.ss.android.ugc.aweme.inbox.widget.multi.o.NONE || !com.ss.android.ugc.aweme.inbox.b.c.f()) {
            z = false;
        } else {
            z = true;
        }
        return new com.ss.android.ugc.aweme.inbox.widget.multi.b(com.ss.android.ugc.aweme.inbox.widget.multi.e.ACTIVITY, list, aVar, str, k2, b2, l(), z, 0, 256);
    }

    public final com.ss.android.ugc.aweme.inbox.widget.multi.b c() {
        boolean z;
        com.ss.android.ugc.aweme.inbox.widget.multi.a aVar = null;
        if (!com.ss.android.ugc.aweme.inbox.b.c.h()) {
            return null;
        }
        List<String> a2 = a();
        String str = (String) this.p.getValue();
        com.ss.android.ugc.aweme.inbox.widget.multi.b a3 = com.ss.android.ugc.aweme.inbox.i.a(com.ss.android.ugc.aweme.inbox.widget.multi.e.FOLLOWER);
        if (a3 != null && hk.a(a3.f104445d)) {
            aVar = a3.f104444c;
            str = a3.f104445d;
        }
        com.ss.android.ugc.aweme.inbox.widget.multi.n d2 = d();
        if (d2.f104495a != com.ss.android.ugc.aweme.inbox.widget.multi.o.COUNT) {
            z = true;
        } else {
            z = false;
        }
        return new com.ss.android.ugc.aweme.inbox.widget.multi.b(com.ss.android.ugc.aweme.inbox.widget.multi.e.FOLLOWER, a2, aVar, str, d2, "", R.drawable.nw, z, 0, 256);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:170:0x01d6, code lost:
        if (r1 != null) goto L_0x01d8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.ss.android.ugc.aweme.inbox.widget.multi.a b(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r6) {
        /*
        // Method dump skipped, instructions count: 512
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.f.a.b(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice):com.ss.android.ugc.aweme.inbox.widget.multi.a");
    }

    public static String a(MusNotice musNotice) {
        String str;
        Throwable th;
        com.ss.android.ugc.aweme.notice.repo.list.bean.e eVar;
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar;
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar2;
        com.ss.android.ugc.aweme.notice.repo.list.a.f fVar;
        String str2;
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar3;
        User user;
        String str3;
        List<? extends User> list;
        String string;
        Aweme aweme;
        User author;
        User user2;
        String str4;
        Aweme aweme2;
        User user3;
        String str5;
        String str6;
        String title;
        String title2;
        int i2;
        try {
            if (musNotice.followNotice != null) {
                FollowNotice followNotice = musNotice.followNotice;
                h.f.b.l.b(followNotice, "");
                String a2 = com.ss.android.ugc.aweme.ao.a.a(h.a.n.a(followNotice.getUser()), 1);
                String string2 = g().getString(R.string.dkb);
                h.f.b.l.b(string2, "");
                str = a2 + ' ' + string2;
            } else if (musNotice.diggNotice != null) {
                DiggNotice diggNotice = musNotice.diggNotice;
                h.f.b.l.b(diggNotice, "");
                String a3 = com.ss.android.ugc.aweme.ao.a.a(diggNotice.getUsers(), diggNotice.getMergeCount());
                Resources g2 = g();
                DiggNotice diggNotice2 = musNotice.diggNotice;
                h.f.b.l.b(diggNotice2, "");
                int diggType = diggNotice2.getDiggType();
                if (diggType == u.a.C2910a.f113719b) {
                    i2 = R.string.cv;
                } else {
                    if (!(diggType == u.a.C2910a.f113718a || diggType == u.a.C2910a.f113721d)) {
                        if (diggType != u.a.C2910a.f113723f) {
                            if (diggType == u.a.C2910a.f113722e) {
                                i2 = R.string.djk;
                            } else {
                                i2 = R.string.dko;
                            }
                        }
                    }
                    i2 = R.string.dkn;
                }
                String string3 = g2.getString(i2);
                h.f.b.l.b(string3, "");
                str = a3 + ' ' + string3;
            } else {
                if (musNotice.commentNotice != null) {
                    CommentNotice commentNotice = musNotice.commentNotice;
                    h.f.b.l.b(commentNotice, "");
                    if (commentNotice.getComment() != null) {
                        CommentNotice commentNotice2 = musNotice.commentNotice;
                        h.f.b.l.b(commentNotice2, "");
                        Comment comment = commentNotice2.getComment();
                        h.f.b.l.b(comment, "");
                        str = com.ss.android.ugc.aweme.ao.a.a(h.a.n.a(comment.getUser()), 1) + ' ' + com.ss.android.ugc.aweme.ao.a.a(commentNotice2).getFirst();
                    }
                }
                if (musNotice.atMe != null) {
                    AtMe atMe = musNotice.atMe;
                    h.f.b.l.b(atMe, "");
                    String a4 = com.ss.android.ugc.aweme.ao.a.a(h.a.n.a(atMe.getUser()), 1);
                    AtMe atMe2 = musNotice.atMe;
                    h.f.b.l.b(atMe2, "");
                    str = a4 + ' ' + com.ss.android.ugc.aweme.ao.a.a(atMe2);
                } else {
                    String str7 = null;
                    if (musNotice.announcement != null) {
                        AnnouncementNotice announcementNotice = musNotice.announcement;
                        if (!(announcementNotice == null || (title2 = announcementNotice.getTitle()) == null)) {
                            if (hk.a(title2)) {
                                str7 = title2;
                            }
                            if (str7 != null) {
                                str = g().getString(R.string.dkd) + ": " + str7;
                            }
                        }
                    } else if (musNotice.textNotice != null) {
                        UserTextNotice userTextNotice = musNotice.textNotice;
                        if (!(userTextNotice == null || (title = userTextNotice.getTitle()) == null)) {
                            if (hk.a(title)) {
                                str7 = title;
                            }
                            if (str7 != null) {
                                str = g().getString(R.string.dkl) + ": " + str7;
                            }
                        }
                    } else if (musNotice.tcmNotice != null) {
                        com.ss.android.ugc.aweme.notice.repo.list.bean.l lVar = musNotice.tcmNotice;
                        if (!(lVar == null || (str6 = lVar.f112871a) == null)) {
                            if (hk.a(str6)) {
                                str7 = str6;
                            }
                            if (str7 != null) {
                                str = g().getString(R.string.cg1) + ": " + str7;
                            }
                        }
                    } else if (musNotice.promoteNotice != null) {
                        com.ss.android.ugc.aweme.notice.repo.list.bean.j jVar = musNotice.promoteNotice;
                        if (!(jVar == null || (str5 = jVar.f112864a) == null)) {
                            if (hk.a(str5)) {
                                str7 = str5;
                            }
                            if (str7 != null) {
                                str = g().getString(R.string.ezo) + ": " + str7;
                            }
                        }
                    } else if (musNotice.followApproveNotice != null) {
                        FollowApproveNotice followApproveNotice = musNotice.followApproveNotice;
                        if (!(followApproveNotice == null || (user3 = followApproveNotice.getUser()) == null)) {
                            String a5 = com.ss.android.ugc.aweme.ao.a.a(h.a.n.a(user3), 1);
                            String string4 = g().getString(R.string.djw);
                            h.f.b.l.b(string4, "");
                            str = a5 + ' ' + string4;
                        }
                    } else if (musNotice.checkProfileNotice != null) {
                        CheckProfileNotice checkProfileNotice = musNotice.checkProfileNotice;
                        if (checkProfileNotice != null) {
                            String a6 = com.ss.android.ugc.aweme.ao.a.a(checkProfileNotice.getUsers(), checkProfileNotice.getCountOfUser());
                            String string5 = g().getString(R.string.djx);
                            h.f.b.l.b(string5, "");
                            str = a6 + ' ' + string5;
                        }
                    } else if (musNotice.duetNotice != null) {
                        DuetNotice duetNotice = musNotice.duetNotice;
                        if (!(duetNotice == null || (aweme2 = duetNotice.getAweme()) == null)) {
                            String a7 = com.ss.android.ugc.aweme.ao.a.a(h.a.n.a(aweme2.getAuthor()), 1);
                            String string6 = g().getString(R.string.dk2);
                            h.f.b.l.b(string6, "");
                            str = a7 + ' ' + string6;
                        }
                    } else if (musNotice.adHelperNotice != null) {
                        com.ss.android.ugc.aweme.notice.repo.list.bean.b bVar = musNotice.adHelperNotice;
                        if (!(bVar == null || (str4 = bVar.f112832b) == null)) {
                            if (hk.a(str4)) {
                                str7 = str4;
                            }
                            if (str7 != null) {
                                str = g().getString(R.string.ccl) + ": " + str7;
                            }
                        }
                    } else if (musNotice.friendNotice != null) {
                        FriendNotice friendNotice = musNotice.friendNotice;
                        if (!(friendNotice == null || (user2 = friendNotice.getUser()) == null)) {
                            str = user2 + ' ' + g().getString(R.string.d_0);
                        }
                    } else if (musNotice.postNotice != null) {
                        PostNotice postNotice = musNotice.postNotice;
                        if (!(postNotice == null || (aweme = postNotice.getAweme()) == null || (author = aweme.getAuthor()) == null)) {
                            str = com.ss.android.ugc.aweme.ao.a.a(h.a.n.a(author), 1) + ' ' + g().getString(R.string.dl4);
                        }
                    } else if (musNotice.voteNotice != null) {
                        com.ss.android.ugc.aweme.notice.repo.list.bean.m mVar = musNotice.voteNotice;
                        if (!(mVar == null || (list = mVar.f112878a) == null)) {
                            String a8 = com.ss.android.ugc.aweme.ao.a.a(list, musNotice.voteNotice.f112881d);
                            if (list.size() == 1) {
                                string = g().getString(R.string.hdg, musNotice.voteNotice.f112880c);
                            } else {
                                string = g().getString(R.string.hde);
                            }
                            h.f.b.l.b(string, "");
                            str = a8 + ' ' + string;
                        }
                    } else if (musNotice.businessAccountNotice != null) {
                        com.ss.android.ugc.aweme.notice.repo.list.bean.c cVar4 = musNotice.businessAccountNotice;
                        if (!(cVar4 == null || (str3 = cVar4.f112839b) == null)) {
                            str = g().getString(R.string.a7r) + ": " + str3;
                        }
                    } else if (musNotice.donationNotice != null) {
                        com.ss.android.ugc.aweme.notice.repo.list.bean.d dVar = musNotice.donationNotice;
                        if (!(dVar == null || (user = dVar.f112842b) == null)) {
                            String a9 = com.ss.android.ugc.aweme.ao.a.a(h.a.n.a(user), 1);
                            String string7 = g().getString(R.string.bau);
                            h.f.b.l.b(string7, "");
                            str = a9 + ' ' + string7;
                        }
                    } else if (!(musNotice.templateNotice == null || (eVar = musNotice.templateNotice) == null || (cVar = eVar.f112844b) == null)) {
                        String str8 = cVar.f112807f;
                        if (str8 == null) {
                            str8 = cVar.f112808g;
                        }
                        if (str8 != null) {
                            com.ss.android.ugc.aweme.notice.repo.list.bean.e eVar2 = musNotice.templateNotice;
                            if (eVar2 == null || (cVar3 = eVar2.f112844b) == null || cVar3.f112804c != 5) {
                                com.ss.android.ugc.aweme.notice.repo.list.bean.e eVar3 = musNotice.templateNotice;
                                if (!(eVar3 == null || (cVar2 = eVar3.f112844b) == null || (fVar = cVar2.f112805d) == null)) {
                                    if (cVar2.f112804c == 0) {
                                        str2 = fVar.f112827d;
                                    } else {
                                        List<User> list2 = fVar.f112824a;
                                        if (list2 == null || (str2 = com.ss.android.ugc.aweme.ao.a.a(list2, 1)) == null) {
                                            str2 = fVar.f112827d;
                                        }
                                    }
                                    if (str2 != null) {
                                        str = str2 + ' ' + str8;
                                    }
                                }
                            } else {
                                a.C0730a aVar = new a.C0730a();
                                NoticeTemplateMiddleView.a.a(aVar, cVar3, null);
                                str = aVar.f33382a.toString();
                                h.f.b.l.b(str, "");
                            }
                        }
                    }
                    str = "";
                }
            }
            try {
                h.q.m223constructorimpl(z.f158842a);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            str = "";
            h.q.m223constructorimpl(h.r.a(th));
            String aVar2 = new a.C0730a().b(str).f33382a.toString();
            h.f.b.l.b(aVar2, "");
            return aVar2;
        }
        String aVar22 = new a.C0730a().b(str).f33382a.toString();
        h.f.b.l.b(aVar22, "");
        return aVar22;
    }

    static final class i {

        /* renamed from: a  reason: collision with root package name */
        public final int f104231a;

        /* renamed from: b  reason: collision with root package name */
        public final String f104232b;

        static {
            Covode.recordClassIndex(66737);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f104231a == iVar.f104231a && h.f.b.l.a(this.f104232b, iVar.f104232b);
        }

        public final int hashCode() {
            int i2 = this.f104231a * 31;
            String str = this.f104232b;
            return i2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "GroupFilter(noticeGroup=" + this.f104231a + ", title=" + this.f104232b + ")";
        }

        public i(int i2, String str) {
            h.f.b.l.d(str, "");
            this.f104231a = i2;
            this.f104232b = str;
        }
    }

    static final class n<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public static final n f104237a = new n();

        static {
            Covode.recordClassIndex(66742);
        }

        n() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0022 A[RETURN] */
        @Override // java.util.Comparator
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* bridge */ /* synthetic */ int compare(java.lang.Object r8, java.lang.Object r9) {
            /*
                r7 = this;
                com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r8 = (com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r8
                com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r9 = (com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r9
                int r2 = r9.priority
                int r0 = r8.priority
                int r2 = r2 - r0
                int r1 = r8.priority
                int r0 = r9.priority
                r6 = -1
                r5 = 1
                if (r1 != r0) goto L_0x001d
                long r3 = r9.createTime
                long r0 = r8.createTime
                long r3 = r3 - r0
                r1 = 0
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x0022
            L_0x001c:
                return r5
            L_0x001d:
                if (r2 <= 0) goto L_0x0020
                goto L_0x001c
            L_0x0020:
                if (r2 >= 0) goto L_0x0023
            L_0x0022:
                return r6
            L_0x0023:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.f.a.n.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x0355 A[LOOP:6: B:113:0x0353->B:114:0x0355, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.inbox.widget.multi.b a(com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse r29, com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse r30) {
        /*
        // Method dump skipped, instructions count: 927
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.f.a.a(com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse, com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse):com.ss.android.ugc.aweme.inbox.widget.multi.b");
    }
}
