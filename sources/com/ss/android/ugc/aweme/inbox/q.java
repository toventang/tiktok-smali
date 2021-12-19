package com.ss.android.ugc.aweme.inbox;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.main.j;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.g;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public abstract class q extends Enum<q> {
    public static final q CONTACTS;
    public static final b Companion = new b((byte) 0);
    public static final h REPO_PREFIX$delegate = i.a((h.f.a.a) c.f104342a);
    public static final q THIRD_PLATFORM;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ q[] f104341a;
    private final String key;
    private d lastProxy;

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f104341a.clone();
    }

    public abstract r decideDisplay(Context context);

    public static final class b {
        static {
            Covode.recordClassIndex(66823);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final String getKey() {
        return this.key;
    }

    static final class c extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f104342a = new c();

        static {
            Covode.recordClassIndex(66824);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return "inbox_invitation_" + com.ss.android.ugc.aweme.inbox.b.b.a() + "_";
        }
    }

    public final void markAction() {
        d a2 = a();
        a2.a().storeInt(a2.a("enter_inbox_times_"), 0);
        a2.a().storeBoolean(a2.a("bottom_by_del_"), false);
    }

    public final void markEnterInbox() {
        d a2 = a();
        String a3 = a2.a("enter_inbox_times_");
        a2.a().storeInt(a3, a2.a().getInt(a3, 0) + 1);
    }

    /* access modifiers changed from: protected */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        r f104343a = r.GONE;

        /* renamed from: b  reason: collision with root package name */
        public final q f104344b;

        /* renamed from: c  reason: collision with root package name */
        public final String f104345c;

        /* renamed from: d  reason: collision with root package name */
        private final h f104346d = i.a((h.f.a.a) new a(this));

        static {
            Covode.recordClassIndex(66825);
        }

        /* access modifiers changed from: package-private */
        public final Keva a() {
            return (Keva) this.f104346d.getValue();
        }

        static final class a extends m implements h.f.a.a<Keva> {
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(66826);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(0);
                this.this$0 = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Keva invoke() {
                return Keva.getRepo(((String) q.REPO_PREFIX$delegate.getValue()) + this.this$0.f104345c);
            }
        }

        /* access modifiers changed from: package-private */
        public final String a(String str) {
            return this.f104344b.asRepoKey(str);
        }

        public d(q qVar, String str) {
            l.d(qVar, "");
            l.d(str, "");
            this.f104344b = qVar;
            this.f104345c = str;
        }
    }

    static {
        Covode.recordClassIndex(66821);
        a aVar = new a("CONTACTS");
        CONTACTS = aVar;
        e eVar = new e("THIRD_PLATFORM");
        THIRD_PLATFORM = eVar;
        f104341a = new q[]{aVar, eVar};
    }

    /* access modifiers changed from: protected */
    public final d a() {
        String str;
        String uid;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        String str2 = "";
        l.b(g2, str2);
        User curUser = g2.getCurUser();
        if (!(curUser == null || (uid = curUser.getUid()) == null)) {
            str2 = uid;
        }
        d dVar = this.lastProxy;
        if (dVar != null) {
            str = dVar.f104345c;
        } else {
            str = null;
        }
        if (!l.a((Object) str, (Object) str2)) {
            this.lastProxy = new d(this, str2);
        }
        d dVar2 = this.lastProxy;
        if (dVar2 == null) {
            l.b();
        }
        return dVar2;
    }

    public final void markDelete() {
        d a2 = a();
        a2.a().storeLong(a2.a("del_time_"), System.currentTimeMillis());
        String a3 = a2.a("del_times_");
        a2.a().storeInt(a3, a2.a().getInt(a3, 0) + 1);
        a2.a().storeBoolean(a2.a("bottom_by_del_"), true);
    }

    static final class e extends q {
        static {
            Covode.recordClassIndex(66827);
        }

        @Override // com.ss.android.ugc.aweme.inbox.q
        public final r decideDisplay(Context context) {
            return r.GONE;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(String str) {
            super(str, 1, "third_platform", null);
        }
    }

    static final class a extends q {
        static {
            Covode.recordClassIndex(66822);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(String str) {
            super(str, 0, "contacts", null);
        }

        @Override // com.ss.android.ugc.aweme.inbox.q
        public final r decideDisplay(Context context) {
            r rVar;
            if ((context != null && !(context instanceof j)) || !com.ss.android.ugc.aweme.inbox.b.b.d() || com.ss.android.ugc.aweme.friends.service.a.f97047a.d().c()) {
                return r.GONE;
            }
            d a2 = a();
            p pVar = (p) o.f104335b.getValue();
            if (System.currentTimeMillis() - a2.a().getLong(a2.a("del_time_"), 0) < ((long) pVar.f104338a) * 86400000) {
                rVar = r.GONE;
            } else if (a2.a().getInt(a2.a("del_times_"), 0) >= pVar.f104339b) {
                rVar = r.GONE;
            } else if (a2.a().getBoolean(a2.a("bottom_by_del_"), false)) {
                rVar = r.BOTTOM;
            } else if (a2.a().getInt(a2.a("enter_inbox_times_"), 0) > pVar.f104340c) {
                rVar = r.BOTTOM;
            } else {
                rVar = r.TOP;
            }
            if (rVar != r.GONE && a2.f104343a != r.GONE && rVar != a2.f104343a) {
                return a2.f104343a;
            }
            a2.f104343a = rVar;
            return rVar;
        }
    }

    public final String asRepoKey(String str) {
        return str + this.key;
    }

    private q(String str, int i2, String str2) {
        this.key = str2;
    }

    public /* synthetic */ q(String str, int i2, String str2, g gVar) {
        this(str, i2, str2);
    }

    public static /* synthetic */ r decideDisplay$default(q qVar, Context context, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            context = null;
        }
        return qVar.decideDisplay(context);
    }
}
