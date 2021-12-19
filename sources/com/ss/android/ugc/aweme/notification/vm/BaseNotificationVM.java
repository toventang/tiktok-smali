package com.ss.android.ugc.aweme.notification.vm;

import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.inbox.r;
import com.ss.android.ugc.aweme.notice.api.a;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.p;
import h.z;
import java.util.LinkedHashSet;
import java.util.Set;

public class BaseNotificationVM extends ac {

    /* renamed from: a  reason: collision with root package name */
    public String f114045a = "message";

    /* renamed from: b  reason: collision with root package name */
    public boolean f114046b;

    /* renamed from: c  reason: collision with root package name */
    public final h f114047c = i.a((h.f.a.a) f.f114058a);

    /* renamed from: d  reason: collision with root package name */
    private final h f114048d = i.a((h.f.a.a) a.f114053a);

    /* renamed from: e  reason: collision with root package name */
    private final h f114049e = i.a((h.f.a.a) b.f114054a);

    /* renamed from: f  reason: collision with root package name */
    private final h f114050f = i.a((h.f.a.a) e.f114057a);

    /* renamed from: g  reason: collision with root package name */
    private final h f114051g = i.a((h.f.a.a) d.f114056a);

    /* renamed from: h  reason: collision with root package name */
    private final h f114052h = i.a((h.f.a.a) c.f114055a);

    static {
        Covode.recordClassIndex(73323);
    }

    private final com.ss.android.ugc.aweme.arch.widgets.base.c<com.ss.android.ugc.aweme.notice.repo.list.bean.f> j() {
        return (com.ss.android.ugc.aweme.arch.widgets.base.c) this.f114048d.getValue();
    }

    public void a(com.ss.android.ugc.aweme.notification.bean.a aVar) {
        l.d(aVar, "");
    }

    public void a(com.ss.android.ugc.aweme.notification.bean.a aVar, String str) {
        l.d(aVar, "");
        l.d(str, "");
    }

    public final com.ss.android.ugc.aweme.arch.widgets.base.c<p<Integer, Integer>> c() {
        return (com.ss.android.ugc.aweme.arch.widgets.base.c) this.f114049e.getValue();
    }

    public final Set<String> d() {
        return (Set) this.f114050f.getValue();
    }

    public final com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> e() {
        return (com.ss.android.ugc.aweme.arch.widgets.base.c) this.f114051g.getValue();
    }

    public final Set<String> g() {
        return (Set) this.f114052h.getValue();
    }

    public r h() {
        return r.GONE;
    }

    static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.arch.widgets.base.c<com.ss.android.ugc.aweme.notice.repo.list.bean.f>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f114053a = new a();

        static {
            Covode.recordClassIndex(73324);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.c<com.ss.android.ugc.aweme.notice.repo.list.bean.f> invoke() {
            return new com.ss.android.ugc.aweme.arch.widgets.base.c();
        }
    }

    static final class b extends m implements h.f.a.a<com.ss.android.ugc.aweme.arch.widgets.base.c<p<? extends Integer, ? extends Integer>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f114054a = new b();

        static {
            Covode.recordClassIndex(73325);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.c<p<? extends Integer, ? extends Integer>> invoke() {
            return new com.ss.android.ugc.aweme.arch.widgets.base.c();
        }
    }

    static final class c extends m implements h.f.a.a<Set<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f114055a = new c();

        static {
            Covode.recordClassIndex(73326);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Set<String> invoke() {
            return new LinkedHashSet();
        }
    }

    static final class d extends m implements h.f.a.a<com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f114056a = new d();

        static {
            Covode.recordClassIndex(73327);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> invoke() {
            return new com.ss.android.ugc.aweme.arch.widgets.base.c();
        }
    }

    static final class e extends m implements h.f.a.a<Set<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f114057a = new e();

        static {
            Covode.recordClassIndex(73328);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Set<String> invoke() {
            return new LinkedHashSet();
        }
    }

    static final class f extends m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f114058a = new f();

        static {
            Covode.recordClassIndex(73329);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    public final String b() {
        return com.ss.android.ugc.aweme.notification.utils.f.a(Integer.valueOf(a()));
    }

    public final com.ss.android.ugc.aweme.notice.repo.list.bean.f f() {
        return j().getValue();
    }

    public final int a() {
        com.ss.android.ugc.aweme.notice.repo.list.bean.f value = j().getValue();
        if (value != null) {
            return value.f112856a;
        }
        return a.b.a();
    }

    public final boolean i() {
        if (a() != a.b.a() || !com.ss.android.ugc.aweme.recommend.users.b.f120122a.c()) {
            return false;
        }
        return true;
    }

    public static void a(int i2) {
        if (i2 == a.b.a()) {
            com.ss.android.ugc.aweme.notice.api.b.a(com.ss.android.ugc.aweme.notice.api.bean.c.Normal, 13, 1000, a.b.a(), 3, 44, 84, 26, 37);
            return;
        }
        com.ss.android.ugc.aweme.notice.api.b.a(com.ss.android.ugc.aweme.notice.api.bean.c.Normal, i2);
    }

    public final void a(com.ss.android.ugc.aweme.notice.repo.list.bean.f fVar) {
        l.d(fVar, "");
        int a2 = a();
        j().setValue(fVar);
        if (a2 != a()) {
            c().setValue(new p<>(Integer.valueOf(a2), Integer.valueOf(a())));
        }
    }

    public final void a(String str) {
        l.d(str, "");
        this.f114045a = str;
    }

    public final void a(BaseNotice baseNotice, h.f.a.a<z> aVar) {
        String str;
        l.d(aVar, "");
        if (baseNotice != null && (str = baseNotice.nid) != null && str.length() != 0 && !d().contains(baseNotice.nid)) {
            Set<String> d2 = d();
            String str2 = baseNotice.nid;
            l.b(str2, "");
            d2.add(str2);
            aVar.invoke();
        }
    }
}
