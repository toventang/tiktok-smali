package com.ss.android.ugc.aweme.upvote.publish;

import android.app.Activity;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.ss.android.ugc.aweme.upvote.publish.e;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import h.v;
import h.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class UpvotePublishVM extends AssemViewModel<g> {

    /* renamed from: j  reason: collision with root package name */
    public static final a f142226j = new a((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    private final h.h f142227k = com.bytedance.assem.arch.a.c.a(this, g.f142232a);

    static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final i f142234a = new i();

        static {
            Covode.recordClassIndex(92992);
        }

        i() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(92981);
    }

    public final com.bytedance.assem.arch.a.a<e> g() {
        return (com.bytedance.assem.arch.a.a) this.f142227k.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(92982);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.a.a<e>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f142232a = new g();

        static {
            Covode.recordClassIndex(92990);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.assem.arch.a.a<e> invoke() {
            return new f();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ g f() {
        return new g();
    }

    static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ String $itemId;
        final /* synthetic */ h.f.a.a $onSuccess;
        final /* synthetic */ UpvotePublishVM this$0;

        static {
            Covode.recordClassIndex(92986);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(UpvotePublishVM upvotePublishVM, h.f.a.a aVar, String str) {
            super(0);
            this.this$0 = upvotePublishVM;
            this.$onSuccess = aVar;
            this.$itemId = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            List<com.ss.android.ugc.aweme.upvote.c.h> upvotes;
            String str;
            this.$onSuccess.invoke();
            String str2 = this.$itemId;
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str2, "");
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            User curUser = g2.getCurUser();
            com.ss.android.ugc.aweme.upvote.c.e eVar = com.ss.android.ugc.aweme.upvote.detail.b.d().get(str2);
            if (eVar != null && (upvotes = eVar.getUpvotes()) != null) {
                Iterator<T> it = upvotes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    User user = next.getUser();
                    if (user != null) {
                        str = user.getUid();
                    } else {
                        str = null;
                    }
                    h.f.b.l.b(curUser, "");
                    if (h.f.b.l.a((Object) str, (Object) curUser.getUid())) {
                        if (next != null) {
                            List g3 = h.a.n.g((Collection) eVar.getUpvotes());
                            g3.remove(next);
                            com.ss.android.ugc.aweme.upvote.detail.b.d().put(str2, com.ss.android.ugc.aweme.upvote.c.e.copy$default(eVar, g3, 0, false, eVar.getTotal() - 1, null, 22, null));
                        }
                    }
                }
            }
            com.ss.android.ugc.aweme.upvote.detail.d.a(str2);
            this.this$0.a(new h.f.a.b<g, g>(this) {
                /* class com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(92987);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ g invoke(g gVar) {
                    g gVar2 = gVar;
                    h.f.b.l.d(gVar2, "");
                    return g.a(gVar2, null, null, new com.bytedance.assem.arch.extensions.a(new h.p(1, this.this$0.$itemId)), 3);
                }
            });
            return z.f158842a;
        }
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f142228a;

        static {
            Covode.recordClassIndex(92983);
        }

        b(h.f.a.a aVar) {
            this.f142228a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f142228a.invoke();
        }
    }

    public static final class o<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UpvotePublishVM f142246a;

        static {
            Covode.recordClassIndex(93001);
        }

        public o(UpvotePublishVM upvotePublishVM) {
            this.f142246a = upvotePublishVM;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f142246a.a(AnonymousClass1.f142247a);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<g, g> {
        final /* synthetic */ CommentRethinkPopup $rethinkPopup;

        static {
            Covode.recordClassIndex(92989);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(CommentRethinkPopup commentRethinkPopup) {
            super(1);
            this.$rethinkPopup = commentRethinkPopup;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ g invoke(g gVar) {
            g gVar2 = gVar;
            h.f.b.l.d(gVar2, "");
            return g.a(gVar2, null, this.$rethinkPopup, null, 5);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UpvotePublishVM f142244a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f142245b;

        static {
            Covode.recordClassIndex(93000);
        }

        n(UpvotePublishVM upvotePublishVM, String str) {
            this.f142244a = upvotePublishVM;
            this.f142245b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            UpvotePublishVM upvotePublishVM = this.f142244a;
            String str = this.f142245b;
            h.f.b.l.b(th, "");
            upvotePublishVM.a(str, th);
        }
    }

    public static final class q<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UpvotePublishVM f142253a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f142254b;

        static {
            Covode.recordClassIndex(93005);
        }

        public q(UpvotePublishVM upvotePublishVM, String str) {
            this.f142253a = upvotePublishVM;
            this.f142254b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            UpvotePublishVM upvotePublishVM = this.f142253a;
            String str = this.f142254b;
            h.f.b.l.b(th, "");
            upvotePublishVM.a(str, th);
        }
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UpvotePublishVM f142229a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f142230b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f142231c;

        static {
            Covode.recordClassIndex(92984);
        }

        c(UpvotePublishVM upvotePublishVM, h.f.a.a aVar, String str) {
            this.f142229a = upvotePublishVM;
            this.f142230b = aVar;
            this.f142231c = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f142230b.invoke();
            com.ss.android.ugc.aweme.upvote.detail.d.f142132a.a(this.f142231c, (com.ss.android.ugc.aweme.upvote.c.d) null);
            this.f142229a.a(new h.f.a.b<g, g>(this) {
                /* class com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(92985);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ g invoke(g gVar) {
                    g gVar2 = gVar;
                    h.f.b.l.d(gVar2, "");
                    return g.a(gVar2, null, null, new com.bytedance.assem.arch.extensions.a(new h.p(2, this.this$0.f142231c)), 3);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.f.b.m implements h.f.a.b<g, g> {
        final /* synthetic */ String $itemId;

        static {
            Covode.recordClassIndex(92993);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(String str) {
            super(1);
            this.$itemId = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ g invoke(g gVar) {
            g gVar2 = gVar;
            h.f.b.l.d(gVar2, "");
            return g.a(gVar2, null, null, new com.bytedance.assem.arch.extensions.a(new h.p(0, this.$itemId)), 3);
        }
    }

    static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UpvotePublishVM f142238a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f142239b;

        static {
            Covode.recordClassIndex(92996);
        }

        l(UpvotePublishVM upvotePublishVM, String str) {
            this.f142238a = upvotePublishVM;
            this.f142239b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.upvote.detail.d.f142132a.a(this.f142239b, com.ss.android.ugc.aweme.upvote.c.d.PUBLISH_FAILED);
            this.f142238a.a(new h.f.a.b<g, g>(this) {
                /* class com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM.l.AnonymousClass1 */
                final /* synthetic */ l this$0;

                static {
                    Covode.recordClassIndex(92997);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ g invoke(g gVar) {
                    g gVar2 = gVar;
                    h.f.b.l.d(gVar2, "");
                    return g.a(gVar2, null, null, new com.bytedance.assem.arch.extensions.a(new h.p(2, this.this$0.f142239b)), 3);
                }
            });
        }
    }

    static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UpvotePublishVM f142235a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UpvotePublishMobParam f142236b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f142237c;

        static {
            Covode.recordClassIndex(92994);
        }

        k(UpvotePublishVM upvotePublishVM, UpvotePublishMobParam upvotePublishMobParam, String str) {
            this.f142235a = upvotePublishVM;
            this.f142236b = upvotePublishMobParam;
            this.f142237c = str;
        }

        static final class a extends h.f.b.m implements h.f.a.b<g, g> {
            final /* synthetic */ k this$0;

            static {
                Covode.recordClassIndex(92995);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(k kVar) {
                super(1);
                this.this$0 = kVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ g invoke(g gVar) {
                g gVar2 = gVar;
                h.f.b.l.d(gVar2, "");
                return g.a(gVar2, null, null, new com.bytedance.assem.arch.extensions.a(new h.p(1, this.this$0.f142237c)), 3);
            }
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            com.ss.android.ugc.aweme.upvote.c.g gVar = (com.ss.android.ugc.aweme.upvote.c.g) obj;
            UpvotePublishMobParam upvotePublishMobParam = this.f142236b;
            h.p[] pVarArr = new h.p[5];
            String str5 = null;
            if (upvotePublishMobParam != null) {
                str = upvotePublishMobParam.f142213a;
            } else {
                str = null;
            }
            pVarArr[0] = v.a(str, "enter_from");
            if (upvotePublishMobParam != null) {
                str2 = upvotePublishMobParam.f142214b;
            } else {
                str2 = null;
            }
            pVarArr[1] = v.a(str2, "enter_method");
            if (upvotePublishMobParam != null) {
                str3 = upvotePublishMobParam.f142215c;
            } else {
                str3 = null;
            }
            pVarArr[2] = v.a(str3, "group_id");
            if (upvotePublishMobParam != null) {
                str4 = upvotePublishMobParam.f142216d;
            } else {
                str4 = null;
            }
            pVarArr[3] = v.a(str4, "author_id");
            if (upvotePublishMobParam != null) {
                str5 = upvotePublishMobParam.f142217e;
            }
            pVarArr[4] = v.a(str5, "follow_status");
            r.a("recommend_success", pVarArr);
            b.b(this.f142237c);
            com.ss.android.ugc.aweme.upvote.c.h hVar = gVar.f142035a;
            if (hVar != null) {
                com.ss.android.ugc.aweme.upvote.detail.d.f142132a.a(this.f142237c, hVar);
                this.f142235a.a(new a(this));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.b<g, g> {
        final /* synthetic */ String $itemId;
        final /* synthetic */ Throwable $throwable;

        static {
            Covode.recordClassIndex(92988);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Throwable th, String str) {
            super(1);
            this.$throwable = th;
            this.$itemId = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ g invoke(g gVar) {
            g gVar2 = gVar;
            h.f.b.l.d(gVar2, "");
            return g.a(gVar2, new com.bytedance.assem.arch.extensions.h(this.$throwable), null, new com.bytedance.assem.arch.extensions.a(new h.p(2, this.$itemId)), 2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UpvotePublishVM f142240a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f142241b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ UpvotePublishMobParam f142242c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f142243d;

        static {
            Covode.recordClassIndex(92998);
        }

        m(UpvotePublishVM upvotePublishVM, String str, UpvotePublishMobParam upvotePublishMobParam, String str2) {
            this.f142240a = upvotePublishVM;
            this.f142241b = str;
            this.f142242c = upvotePublishMobParam;
            this.f142243d = str2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            final com.ss.android.ugc.aweme.upvote.c.g gVar = (com.ss.android.ugc.aweme.upvote.c.g) obj;
            com.ss.android.ugc.aweme.upvote.c.h hVar = gVar.f142035a;
            if (hVar == null || (str = hVar.getCommentId()) == null) {
                str = "";
            }
            d.a(str, this.f142241b, this.f142242c);
            b.b(this.f142243d);
            com.ss.android.ugc.aweme.upvote.c.h hVar2 = gVar.f142035a;
            if (hVar2 != null) {
                com.ss.android.ugc.aweme.upvote.detail.d.f142132a.a(this.f142243d, hVar2);
            }
            this.f142240a.a(new h.f.a.b<g, g>(this) {
                /* class com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM.m.AnonymousClass1 */
                final /* synthetic */ m this$0;

                static {
                    Covode.recordClassIndex(92999);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ g invoke(g gVar) {
                    g gVar2 = gVar;
                    h.f.b.l.d(gVar2, "");
                    return g.a(gVar2, new com.bytedance.assem.arch.extensions.o(gVar), null, new com.bytedance.assem.arch.extensions.a(new h.p(1, this.this$0.f142243d)), 2);
                }
            });
        }
    }

    static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f142233a;

        static {
            Covode.recordClassIndex(92991);
        }

        h(List list) {
            this.f142233a = list;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Iterable iterable = ((com.ss.android.ugc.aweme.upvote.c.c) obj).f142031b;
            if (iterable == null) {
                iterable = h.a.z.INSTANCE;
            }
            List<T> k2 = h.a.n.k(h.a.n.c((Iterable) this.f142233a, iterable));
            h.f.b.l.d(k2, "");
            for (T t : k2) {
                r.a("recommend_success", v.a("cold_start", "enter_method"), v.a(t, "group_id"));
            }
            h.f.b.l.d(k2, "");
            List g2 = h.a.n.g((Collection) b.a());
            g2.removeAll(k2);
            b.a(g2);
        }
    }

    public static final class p<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UpvotePublishVM f142248a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f142249b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ UpvotePublishMobParam f142250c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f142251d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f142252e;

        static {
            Covode.recordClassIndex(93003);
        }

        public p(UpvotePublishVM upvotePublishVM, String str, UpvotePublishMobParam upvotePublishMobParam, String str2, boolean z) {
            this.f142248a = upvotePublishVM;
            this.f142249b = str;
            this.f142250c = upvotePublishMobParam;
            this.f142251d = str2;
            this.f142252e = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String commentId;
            final com.ss.android.ugc.aweme.upvote.c.g gVar = (com.ss.android.ugc.aweme.upvote.c.g) obj;
            String str2 = "";
            if (gVar.f142036b == null) {
                com.ss.android.ugc.aweme.upvote.c.h hVar = gVar.f142035a;
                if (!(hVar == null || (commentId = hVar.getCommentId()) == null)) {
                    str2 = commentId;
                }
                d.a(str2, this.f142249b, this.f142250c);
                b.b(this.f142251d);
                com.ss.android.ugc.aweme.upvote.c.h hVar2 = gVar.f142035a;
                if (hVar2 != null) {
                    com.ss.android.ugc.aweme.upvote.detail.d.f142132a.a(this.f142251d, hVar2);
                }
                this.f142248a.a(new h.f.a.b<g, g>(this) {
                    /* class com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM.p.AnonymousClass1 */
                    final /* synthetic */ p this$0;

                    static {
                        Covode.recordClassIndex(93004);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ g invoke(g gVar) {
                        g gVar2 = gVar;
                        h.f.b.l.d(gVar2, "");
                        return g.a(gVar2, new com.bytedance.assem.arch.extensions.o(gVar), null, new com.bytedance.assem.arch.extensions.a(new h.p(1, this.this$0.f142251d)), 2);
                    }
                });
                return;
            }
            UpvotePublishVM upvotePublishVM = this.f142248a;
            String str3 = this.f142251d;
            String str4 = this.f142249b;
            CommentRethinkPopup commentRethinkPopup = gVar.f142036b;
            boolean z = this.f142252e;
            UpvotePublishMobParam upvotePublishMobParam = this.f142250c;
            Activity topActivity = ActivityStack.getTopActivity();
            if (!(topActivity instanceof androidx.fragment.app.e)) {
                topActivity = null;
            }
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) topActivity;
            if (eVar != null) {
                if (eVar.getSupportFragmentManager().a("UpvoteCommentDialogFragment") == null) {
                    h.f.b.l.d(str3, str2);
                    h.p[] pVarArr = new h.p[5];
                    if (z) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    pVarArr[0] = v.a(str, "resend_same_cmt");
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    h.f.b.l.b(g2, str2);
                    pVarArr[1] = v.a(g2.getCurUserId(), "user_id");
                    pVarArr[2] = v.a(str3, "group_id");
                    pVarArr[3] = v.a("0", "no_sw");
                    pVarArr[4] = v.a("recommend", "scene");
                    r.a("comment_rethink_hit", pVarArr);
                    upvotePublishVM.a(str3, str4, upvotePublishMobParam);
                    return;
                }
                upvotePublishVM.a(new f(commentRethinkPopup));
            }
        }
    }

    public final void a(String str, String str2) {
        h.f.b.l.d(str, "");
        com.ss.android.ugc.aweme.upvote.detail.d.f142132a.a(str, str2);
        a(new j(str));
    }

    public final void a(String str, UpvotePublishMobParam upvotePublishMobParam) {
        h.f.b.l.d(str, "");
        f.a.b.b a2 = e.a.a(g().a(), str).b().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new k(this, upvotePublishMobParam, str), new l(this, str));
        h.f.b.l.b(a2, "");
        a(a2);
    }

    public final void a(String str, Throwable th) {
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null) {
            if (!(th instanceof com.ss.android.ugc.aweme.base.api.a.a) || ((com.ss.android.ugc.aweme.base.api.a.a) th).getErrorCode() != 7) {
                new com.bytedance.tux.g.b(topActivity).e(R.string.f8o).b();
            } else {
                new com.bytedance.tux.g.b(topActivity).e(((Number) com.ss.android.ugc.aweme.upvote.b.b.a(Integer.valueOf((int) R.string.f96), Integer.valueOf((int) R.string.fdf))).intValue()).b();
            }
            com.ss.android.ugc.aweme.upvote.detail.d.f142132a.a(str, com.ss.android.ugc.aweme.upvote.c.d.PUBLISH_FAILED);
            a(new e(th, str));
        }
    }

    public final void a(String str, String str2, UpvotePublishMobParam upvotePublishMobParam) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        a(str, str2);
        f.a.b.b a2 = g().a().b(str, str2).b().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new m(this, str2, upvotePublishMobParam, str), new n(this, str));
        h.f.b.l.b(a2, "");
        a(a2);
    }
}
