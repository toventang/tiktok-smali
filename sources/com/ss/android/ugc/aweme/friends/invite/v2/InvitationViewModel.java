package com.ss.android.ugc.aweme.friends.invite.v2;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import f.a.t;
import f.a.v;
import f.a.w;
import f.a.x;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.concurrent.ConcurrentHashMap;

public final class InvitationViewModel extends ac {

    /* renamed from: d  reason: collision with root package name */
    public static final a f96942d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    boolean f96943a;

    /* renamed from: b  reason: collision with root package name */
    public a f96944b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f96945c;

    /* renamed from: e  reason: collision with root package name */
    private final h.h f96946e = h.i.a((h.f.a.a) f.f96955a);

    /* renamed from: f  reason: collision with root package name */
    private final h.h f96947f = h.i.a((h.f.a.a) c.f96950a);

    static {
        Covode.recordClassIndex(61529);
    }

    public final com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> a() {
        return (com.ss.android.ugc.aweme.arch.widgets.base.c) this.f96946e.getValue();
    }

    public final ConcurrentHashMap<String, b> b() {
        return (ConcurrentHashMap) this.f96947f.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61530);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static InvitationViewModel a(Fragment fragment) {
            l.d(fragment, "");
            ac a2 = ae.a(fragment, (ad.b) null).a(InvitationViewModel.class);
            l.b(a2, "");
            return (InvitationViewModel) a2;
        }
    }

    static final class c extends m implements h.f.a.a<ConcurrentHashMap<String, b>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f96950a = new c();

        static {
            Covode.recordClassIndex(61532);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConcurrentHashMap<String, b> invoke() {
            return new ConcurrentHashMap();
        }
    }

    static final class f extends m implements h.f.a.a<com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f96955a = new f();

        static {
            Covode.recordClassIndex(61537);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> invoke() {
            return new com.ss.android.ugc.aweme.arch.widgets.base.c();
        }
    }

    private final t<a> c() {
        t<a> a2 = t.a(new d(this));
        l.b(a2, "");
        return a2;
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        this.f96944b = null;
        b().clear();
    }

    static final class h extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ InvitationViewModel this$0;

        static {
            Covode.recordClassIndex(61539);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(InvitationViewModel invitationViewModel) {
            super(1);
            this.this$0 = invitationViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            l.d(th2, "");
            com.ss.android.ugc.aweme.common.f.a("InvitationViewModel", "requestInviteConfig error", th2);
            this.this$0.a().postValue(false);
            return z.f158842a;
        }
    }

    static final class k extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ InvitationViewModel this$0;

        static {
            Covode.recordClassIndex(61542);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(InvitationViewModel invitationViewModel) {
            super(1);
            this.this$0 = invitationViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            l.d(th2, "");
            this.this$0.a().postValue(false);
            com.ss.android.ugc.aweme.common.f.a("InvitationViewModel", "requestInviteMsg error", th2);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InvitationViewModel f96951a;

        static {
            Covode.recordClassIndex(61533);
        }

        d(InvitationViewModel invitationViewModel) {
            this.f96951a = invitationViewModel;
        }

        @Override // f.a.w
        public final void subscribe(final v<a> vVar) {
            l.d(vVar, "");
            a aVar = this.f96951a.f96944b;
            if (aVar == null || !aVar.a()) {
                com.ss.android.ugc.aweme.common.g.a(InvitationApi.f96912a.getInvitationConfig(""), new h.f.a.b<a, z>(this) {
                    /* class com.ss.android.ugc.aweme.friends.invite.v2.InvitationViewModel.d.AnonymousClass1 */
                    final /* synthetic */ d this$0;

                    static {
                        Covode.recordClassIndex(61534);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(a aVar) {
                        a aVar2 = aVar;
                        l.d(aVar2, "");
                        if (aVar2.a()) {
                            this.this$0.f96951a.f96944b = aVar2;
                            v vVar = vVar;
                            l.b(vVar, "");
                            com.ss.android.ugc.aweme.common.ac.a(vVar, aVar2);
                        } else {
                            v vVar2 = vVar;
                            l.b(vVar2, "");
                            com.ss.android.ugc.aweme.common.ac.a(vVar2, (Throwable) new IllegalStateException("generateConfigFlow config invalid:".concat(String.valueOf(aVar2))));
                        }
                        return z.f158842a;
                    }
                }, new h.f.a.b<Throwable, z>() {
                    /* class com.ss.android.ugc.aweme.friends.invite.v2.InvitationViewModel.d.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(61535);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(Throwable th) {
                        Throwable th2 = th;
                        l.d(th2, "");
                        v vVar = vVar;
                        l.b(vVar, "");
                        com.ss.android.ugc.aweme.common.ac.a(vVar, th2);
                        return z.f158842a;
                    }
                });
            } else {
                com.ss.android.ugc.aweme.common.ac.a(vVar, this.f96951a.f96944b);
            }
        }
    }

    static final class g extends m implements h.f.a.b<a, z> {
        final /* synthetic */ InvitationViewModel this$0;

        static {
            Covode.recordClassIndex(61538);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(InvitationViewModel invitationViewModel) {
            super(1);
            this.this$0 = invitationViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            this.this$0.f96944b = aVar2;
            if (!aVar2.a()) {
                com.ss.android.ugc.aweme.common.f.c("InvitationViewModel", "requestInviteConfig invalid:".concat(String.valueOf(aVar2)));
            }
            this.this$0.a().postValue(false);
            return z.f158842a;
        }
    }

    static final class i<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InvitationViewModel f96956a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sharer.b f96957b;

        static {
            Covode.recordClassIndex(61540);
        }

        i(InvitationViewModel invitationViewModel, com.ss.android.ugc.aweme.sharer.b bVar) {
            this.f96956a = invitationViewModel;
            this.f96957b = bVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            a aVar = (a) obj;
            l.d(aVar, "");
            String str = aVar.f96979c;
            if (str == null) {
                l.b();
            }
            String str2 = aVar.f96978b;
            if (str2 == null) {
                l.b();
            }
            if (aVar.f96977a == null) {
                l.b();
            }
            t a2 = t.a(new e(str, this.f96957b, str2));
            l.b(a2, "");
            return a2;
        }
    }

    static final class j extends m implements h.f.a.b<b, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.sharer.b $channel;
        final /* synthetic */ InvitationViewModel this$0;

        static {
            Covode.recordClassIndex(61541);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(InvitationViewModel invitationViewModel, com.ss.android.ugc.aweme.sharer.b bVar) {
            super(1);
            this.this$0 = invitationViewModel;
            this.$channel = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(b bVar) {
            l.d(bVar, "");
            this.this$0.b().put(this.$channel.a(), bVar);
            this.this$0.a().postValue(false);
            return z.f158842a;
        }
    }

    static final class e<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f96952a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sharer.b f96953b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f96954c;

        static {
            Covode.recordClassIndex(61536);
        }

        e(String str, com.ss.android.ugc.aweme.sharer.b bVar, String str2) {
            this.f96952a = str;
            this.f96953b = bVar;
            this.f96954c = str2;
        }

        @Override // f.a.w
        public final void subscribe(v<b> vVar) {
            String str = "";
            l.d(vVar, str);
            String c2 = com.ss.android.ugc.aweme.share.improve.c.b.c(com.ss.android.ugc.aweme.share.improve.c.b.b(com.ss.android.ugc.aweme.share.improve.c.b.a(this.f96952a)));
            if (c2 != null) {
                str = c2;
            }
            String a2 = com.ss.android.ugc.aweme.share.improve.c.c.a(str, "invite_friends", this.f96953b);
            if (a2.length() == 0) {
                com.ss.android.ugc.aweme.common.ac.a((v) vVar, (Throwable) new IllegalStateException("generateMsgFlow shorten error, longUrl:".concat(String.valueOf(str))));
            } else {
                com.ss.android.ugc.aweme.common.ac.a(vVar, new b(a2, p.a(this.f96954c, "{URL}", a2)));
            }
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f96948a;

        /* renamed from: b  reason: collision with root package name */
        public final String f96949b;

        static {
            Covode.recordClassIndex(61531);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.a(this.f96948a, bVar.f96948a) && l.a(this.f96949b, bVar.f96949b);
        }

        public final int hashCode() {
            String str = this.f96948a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f96949b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "InvitationMsg(shortUrl=" + this.f96948a + ", shareText=" + this.f96949b + ")";
        }

        public b(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            this.f96948a = str;
            this.f96949b = str2;
        }
    }

    public final void a(com.ss.android.ugc.aweme.common.k<b> kVar, com.ss.android.ugc.aweme.sharer.b bVar) {
        l.d(kVar, "");
        l.d(bVar, "");
        if (l.a((Object) a().getValue(), (Object) true)) {
            com.ss.android.ugc.aweme.common.f.c("InvitationViewModel", "requestInviteMsg block by loading");
            return;
        }
        b bVar2 = b().get(bVar.a());
        if (bVar2 != null) {
            kVar.f76454b.invoke(bVar2);
            return;
        }
        a().postValue(true);
        t<R> a2 = c().a((f.a.d.g<? super a, ? extends x<? extends R>>) new i(this, bVar), false);
        l.b(a2, "");
        com.ss.android.ugc.aweme.common.g.a(a2, kVar, new com.ss.android.ugc.aweme.common.h(new j(this, bVar), new k(this)));
    }
}
