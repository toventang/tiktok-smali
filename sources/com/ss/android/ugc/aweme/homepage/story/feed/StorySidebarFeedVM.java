package com.ss.android.ugc.aweme.homepage.story.feed;

import android.os.Handler;
import androidx.lifecycle.i;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.story.HomepageStoryApi;
import com.ss.android.ugc.aweme.homepage.story.IHomepageStoryApi;
import com.ss.android.ugc.aweme.profile.f.ai;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.userstory.mine.MineUserStoryFetcher;
import com.ss.android.ugc.aweme.utils.ib;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class StorySidebarFeedVM extends AssemViewModel<d> implements androidx.lifecycle.l {
    public static final a q = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public final e f99373j = new e();

    /* renamed from: k  reason: collision with root package name */
    public boolean f99374k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f99375l;

    /* renamed from: m  reason: collision with root package name */
    public c f99376m = new c();
    public boolean n;
    public boolean o;
    public final List<Runnable> p = new ArrayList();
    private boolean r;
    private boolean s;
    private boolean t;
    private final f.a.b.a u = new f.a.b.a();
    private long v;
    private final Handler w = new Handler();
    private final MineUserStoryFetcher x = new MineUserStoryFetcher();
    private final Runnable y = new w(this);
    private final Runnable z = new b(this);

    static {
        Covode.recordClassIndex(63298);
    }

    @androidx.lifecycle.v(a = i.a.ON_PAUSE)
    public final void onPause() {
        this.t = false;
    }

    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(63299);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class w implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StorySidebarFeedVM f99394a;

        static {
            Covode.recordClassIndex(63322);
        }

        w(StorySidebarFeedVM storySidebarFeedVM) {
            this.f99394a = storySidebarFeedVM;
        }

        public final void run() {
            this.f99394a.n = false;
        }
    }

    public final void k() {
        a(k.f99381a);
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StorySidebarFeedVM f99377a;

        static {
            Covode.recordClassIndex(63300);
        }

        b(StorySidebarFeedVM storySidebarFeedVM) {
            this.f99377a = storySidebarFeedVM;
        }

        public final void run() {
            this.f99377a.o = false;
            this.f99377a.k();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StorySidebarFeedVM f99391a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f99392b;

        static {
            Covode.recordClassIndex(63320);
        }

        u(StorySidebarFeedVM storySidebarFeedVM, boolean z) {
            this.f99391a = storySidebarFeedVM;
            this.f99392b = z;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f99391a.a(this.f99392b, (Throwable) null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class x implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StorySidebarFeedVM f99395a;

        static {
            Covode.recordClassIndex(63323);
        }

        x(StorySidebarFeedVM storySidebarFeedVM) {
            this.f99395a = storySidebarFeedVM;
        }

        @Override // f.a.d.a
        public final void a() {
            com.ss.android.ugc.aweme.story.j.a.b("StorySidebarFeedVM", "refresh auto timer");
            this.f99395a.i();
        }
    }

    public static String l() {
        User c2 = ai.c();
        if (c2 != null) {
            return c2.getUid();
        }
        return null;
    }

    private final boolean n() {
        if (this.f99374k || !com.ss.android.ugc.aweme.homepage.story.c.a.f99251a || !this.t) {
            return false;
        }
        return true;
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ d f() {
        getLifecycle().a(this);
        return new d();
    }

    public final boolean g() {
        if (this.s || this.f99375l) {
            return false;
        }
        return true;
    }

    @androidx.lifecycle.v(a = i.a.ON_RESUME)
    public final void onResume() {
        this.t = true;
        if (!this.f99374k && this.r) {
            i();
        }
    }

    public final void i() {
        if (!this.s && n() && !a(false)) {
            c(true);
        }
    }

    public final void j() {
        this.n = true;
        this.w.removeCallbacks(this.y);
        this.w.postDelayed(this.y, 700);
        a(j.f99380a);
    }

    private static boolean m() {
        IAccountUserService e2 = AccountService.a().e();
        h.f.b.l.b(e2, "");
        boolean isLogin = e2.isLogin();
        boolean isChildrenMode = e2.isChildrenMode();
        if (!isLogin || isChildrenMode || !com.ss.android.ugc.aweme.story.g.f137757a.a() || com.ss.android.ugc.aweme.homepage.story.c.a.f99254d) {
            return false;
        }
        return true;
    }

    private final void p() {
        long j2;
        String l2 = l();
        if (l2 != null) {
            j2 = Long.parseLong(l2);
        } else {
            j2 = -1;
        }
        Aweme a2 = com.ss.android.ugc.aweme.story.g.f137757a.e().a();
        c cVar = this.f99376m;
        List g2 = h.a.n.g((Collection) cVar.f99399a);
        h.a.n.a(g2, (h.f.a.b) new g(j2));
        g2.add(0, Long.valueOf(j2));
        List g3 = h.a.n.g((Collection) h());
        h.a.n.a(g3, (h.f.a.b) new h(this, a2));
        g3.add(0, a2);
        this.f99376m = c.a(cVar, g2, g3, null, 4);
    }

    public final List<Aweme> h() {
        String uid;
        List<Aweme> list = this.f99376m.f99400b;
        ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
        for (T t2 : list) {
            User author = t2.getAuthor();
            if (!(author == null || (uid = author.getUid()) == null)) {
                if (com.ss.android.ugc.aweme.homepage.story.c.b.a(uid)) {
                    MineUserStoryFetcher.a();
                } else {
                    Aweme a2 = com.ss.android.ugc.aweme.story.g.f137757a.e().a(uid);
                    if (a2 != null) {
                        t2 = a2;
                    }
                }
            }
            arrayList.add(t2);
        }
        return arrayList;
    }

    private static void o() {
        Keva repo = Keva.getRepo("repo_story_cold_start");
        long j2 = repo.getLong("key_guide_show_last_time_" + l(), 0);
        if (j2 == 0 || ib.a(Long.valueOf(j2)) <= 0) {
            repo.storeInt("key_guide_show_count_limit_" + l(), repo.getInt("key_guide_show_count_limit_" + l(), 0) + 1);
        } else {
            repo.storeInt("key_guide_show_count_limit_" + l(), 1);
        }
        repo.storeLong("key_guide_show_last_time_" + l(), System.currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    public static final class t<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StorySidebarFeedVM f99389a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f99390b;

        static {
            Covode.recordClassIndex(63319);
        }

        t(StorySidebarFeedVM storySidebarFeedVM, boolean z) {
            this.f99389a = storySidebarFeedVM;
            this.f99390b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            com.ss.android.ugc.aweme.framework.a.a.a(th);
            this.f99389a.a(this.f99390b, th);
        }
    }

    public final void a(List<? extends Aweme> list) {
        h.f.b.l.d(list, "");
        this.f99376m = c.a(this.f99376m, null, list, null, 5);
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.b<d, d> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f99378a = new d();

        static {
            Covode.recordClassIndex(63302);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            return d.a(dVar2, 0, 1, null, null, null, null, null, 125);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements h.f.a.b<Long, Boolean> {
        final /* synthetic */ long $myUidL$inlined;

        static {
            Covode.recordClassIndex(63305);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(long j2) {
            super(1);
            this.$myUidL$inlined = j2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Long l2) {
            boolean z;
            if (l2.longValue() == this.$myUidL$inlined) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.b<Aweme, Boolean> {
        final /* synthetic */ Aweme $myStoryCollection$inlined;
        final /* synthetic */ StorySidebarFeedVM this$0;

        static {
            Covode.recordClassIndex(63306);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(StorySidebarFeedVM storySidebarFeedVM, Aweme aweme) {
            super(1);
            this.this$0 = storySidebarFeedVM;
            this.$myStoryCollection$inlined = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Aweme aweme) {
            String str;
            Aweme aweme2 = aweme;
            h.f.b.l.d(aweme2, "");
            User author = aweme2.getAuthor();
            if (author != null) {
                str = author.getUid();
            } else {
                str = null;
            }
            return Boolean.valueOf(h.f.b.l.a((Object) str, (Object) StorySidebarFeedVM.l()));
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.b<d, d> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f99379a = new i();

        static {
            Covode.recordClassIndex(63307);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            return d.a(dVar2, 1, 0, null, null, null, null, null, 126);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<d, d> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f99380a = new j();

        static {
            Covode.recordClassIndex(63308);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            return d.a(dVar2, 0, 0, null, new com.bytedance.assem.arch.extensions.a("auto"), null, null, null, 119);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.b<d, d> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f99381a = new k();

        static {
            Covode.recordClassIndex(63309);
        }

        k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            return d.a(dVar2, 0, 0, null, null, new com.bytedance.assem.arch.extensions.a(true), null, null, 110);
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.b<d, d> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f99382a = new l();

        static {
            Covode.recordClassIndex(63310);
        }

        l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            return d.a(dVar2, 0, 0, null, new com.bytedance.assem.arch.extensions.a("publish"), null, null, null, 119);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<d, d> {
        final /* synthetic */ int $status;

        static {
            Covode.recordClassIndex(63312);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(int i2) {
            super(1);
            this.$status = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            return d.a(dVar2, this.$status, 0, null, null, null, null, null, 126);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.f.b.m implements h.f.a.b<d, d> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f99383a = new o();

        static {
            Covode.recordClassIndex(63313);
        }

        o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            return d.a(dVar2, 0, 1, null, null, null, null, null, 125);
        }
    }

    static final class v extends h.f.b.m implements h.f.a.b<d, d> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f99393a = new v();

        static {
            Covode.recordClassIndex(63321);
        }

        v() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            return d.a(dVar2, 0, 0, null, null, null, null, new com.bytedance.assem.arch.extensions.a(""), 63);
        }
    }

    public final boolean a(boolean z2) {
        long j2;
        if (this.s) {
            return true;
        }
        if (z2) {
            j2 = com.ss.android.ugc.aweme.homepage.story.c.a.f99253c;
        } else {
            j2 = com.ss.android.ugc.aweme.homepage.story.c.a.f99252b;
        }
        if (System.currentTimeMillis() - this.v < j2) {
            return true;
        }
        return false;
    }

    public static final class c extends h.f.b.m implements h.f.a.b<d, d> {
        final /* synthetic */ StorySidebarFeedVM this$0;

        static {
            Covode.recordClassIndex(63301);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(StorySidebarFeedVM storySidebarFeedVM) {
            super(1);
            this.this$0 = storySidebarFeedVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            this.this$0.f99375l = false;
            return d.a(dVar2, 0, 10, new com.bytedance.assem.arch.extensions.a(new b(true, a.NOTIFY_PUBLISH_PREPARED)), null, null, null, null, 121);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.b<d, d> {
        final /* synthetic */ StorySidebarFeedVM this$0;

        static {
            Covode.recordClassIndex(63303);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(StorySidebarFeedVM storySidebarFeedVM) {
            super(1);
            this.this$0 = storySidebarFeedVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            this.this$0.f99375l = false;
            return d.a(dVar2, 0, 10, new com.bytedance.assem.arch.extensions.a(new b(true, a.NOTIFY_PUBLISH_PREPARED_WITH_OPEN_SIDEBAR)), null, null, null, null, 121);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.b<d, d> {
        final /* synthetic */ StorySidebarFeedVM this$0;

        static {
            Covode.recordClassIndex(63304);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(StorySidebarFeedVM storySidebarFeedVM) {
            super(1);
            this.this$0 = storySidebarFeedVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            this.this$0.f99375l = false;
            return d.a(dVar2, 0, 10, new com.bytedance.assem.arch.extensions.a(new b(true, a.NOTIFY_PUBLISH_PREPARED)), null, null, null, null, 121);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m extends h.f.b.m implements h.f.a.b<d, d> {
        final /* synthetic */ StorySidebarFeedVM this$0;

        static {
            Covode.recordClassIndex(63311);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(StorySidebarFeedVM storySidebarFeedVM) {
            super(1);
            this.this$0 = storySidebarFeedVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            boolean z = true;
            if (!com.ss.android.ugc.aweme.homepage.experiment.a.b() && this.this$0.f99376m.f99400b.isEmpty()) {
                z = false;
            }
            return d.a(dVar2, 0, 6, new com.bytedance.assem.arch.extensions.a(new b(z, null, 2)), null, null, null, null, 121);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StorySidebarFeedVM f99384a;

        static {
            Covode.recordClassIndex(63314);
        }

        p(StorySidebarFeedVM storySidebarFeedVM) {
            this.f99384a = storySidebarFeedVM;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.homepage.story.b.a aVar = (com.ss.android.ugc.aweme.homepage.story.b.a) obj;
            StorySidebarFeedVM storySidebarFeedVM = this.f99384a;
            String str = "";
            h.f.b.l.b(aVar, str);
            storySidebarFeedVM.f99376m = new c();
            List<Long> uidList = aVar.getUidList();
            if (uidList != null) {
                c cVar = storySidebarFeedVM.f99376m;
                String str2 = aVar.extra.logid;
                if (str2 != null) {
                    str = str2;
                }
                storySidebarFeedVM.f99376m = c.a(cVar, uidList, null, str, 2);
            }
            com.ss.android.ugc.aweme.story.j.a.b("StorySidebarFeedVM", "onGetFeedResponse: ".concat(String.valueOf(aVar)));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final r f99386a = new r();

        static {
            Covode.recordClassIndex(63316);
        }

        r() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            List<String> list = (List) obj;
            h.f.b.l.d(list, "");
            if (!list.isEmpty()) {
                return com.ss.android.ugc.aweme.story.g.f137757a.e().a(list);
            }
            f.a.t a2 = f.a.t.a(AnonymousClass1.f99387a);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StorySidebarFeedVM f99388a;

        static {
            Covode.recordClassIndex(63318);
        }

        s(StorySidebarFeedVM storySidebarFeedVM) {
            this.f99388a = storySidebarFeedVM;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            StorySidebarFeedVM storySidebarFeedVM = this.f99388a;
            h.f.b.l.b(list, "");
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (!com.ss.android.ugc.aweme.homepage.story.c.b.a((Aweme) t)) {
                    arrayList.add(t);
                }
            }
            storySidebarFeedVM.a(arrayList);
            com.ss.android.ugc.aweme.story.j.a.b("StorySidebarFeedVM", "onGetUserStories: ".concat(String.valueOf(list)));
        }
    }

    public final void a(String str) {
        h.f.b.l.d(str, "");
        com.ss.android.ugc.aweme.story.j.a.b("StorySidebarFeedVM", "refresh manually. desc: " + str + ". isRefreshing: " + this.s);
        if (!this.s) {
            a(v.f99393a);
            c(false);
        }
    }

    public final void b(boolean z2) {
        this.f99375l = true;
        c(d.f99378a);
        p();
        com.ss.android.ugc.aweme.story.j.a.b("StorySidebarFeedVM", "insertSelfToPreloadData, cache size: " + this.f99376m.f99400b.size());
        if (z2) {
            c(new e(this));
        } else {
            c(new f(this));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StorySidebarFeedVM f99385a;

        static {
            Covode.recordClassIndex(63315);
        }

        q(StorySidebarFeedVM storySidebarFeedVM) {
            this.f99385a = storySidebarFeedVM;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.d(obj, "");
            List<Long> list = this.f99385a.f99376m.f99399a;
            if (list.size() > IHomepageStoryApi.a.f99233a) {
                list = list.subList(0, IHomepageStoryApi.a.f99233a);
            }
            ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(it.next().longValue()));
            }
            return arrayList;
        }
    }

    public final void a(int i2) {
        boolean z2;
        boolean z3;
        boolean z4 = this.f99374k;
        if (i2 == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z4 != z2) {
            if (i2 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f99374k = z3;
            if (z3) {
                Iterator<T> it = this.p.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
            }
            a(new n(i2));
            if (!this.f99374k) {
                i();
                if (this.o) {
                    this.o = false;
                    this.w.removeCallbacks(this.z);
                }
            } else if (this.n) {
                this.n = false;
                this.w.removeCallbacks(this.y);
                o();
                this.o = true;
                this.w.removeCallbacks(this.z);
                this.w.postDelayed(this.z, ((long) com.ss.android.ugc.aweme.homepage.experiment.b.a()) * 1000);
            }
        }
    }

    private final void c(boolean z2) {
        if (m()) {
            this.s = true;
            this.u.a();
            com.ss.android.ugc.aweme.story.j.a.b("StorySidebarFeedVM", "start refreshing: isAutoRefresh: ".concat(String.valueOf(z2)));
            a(o.f99383a);
            f.a.b.b a2 = HomepageStoryApi.f99230a.getFeed(!z2).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new p(this)).d(new q(this)).a(f.a.h.a.b(f.a.k.a.f158006c)).a((f.a.d.g<? super R, ? extends f.a.x<? extends R>>) r.f99386a, false).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new s(this), new t(this, z2), new u(this, z2));
            h.f.b.l.b(a2, "");
            f.a.j.a.a(a2, this.u);
        }
    }

    public final void a(boolean z2, Throwable th) {
        com.ss.android.ugc.aweme.story.j.a.b("StorySidebarFeedVM", "OnRefreshFinish(" + hashCode() + "): isAutoRefresh: " + z2 + ", " + com.ss.android.ugc.aweme.story.d.a.a(th));
        if (!com.ss.android.ugc.aweme.story.g.f137757a.f().a().isEmpty()) {
            p();
        }
        this.s = false;
        this.v = System.currentTimeMillis();
        a(new m(this));
        this.r = true;
        if (com.ss.android.ugc.aweme.homepage.story.c.a.f99251a) {
            f.a.b.b cG_ = f.a.h.a.a(f.a.e.e.a.d.f157241a).a(com.ss.android.ugc.aweme.homepage.story.c.a.f99252b, TimeUnit.MILLISECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new x(this)).cG_();
            h.f.b.l.b(cG_, "");
            f.a.j.a.a(cG_, this.u);
        }
    }
}
