package com.ss.android.ugc.aweme.upvote.publish;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.a;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.fe;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.v;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f142299a = new c();

    public static final class a extends m implements h.f.a.b<g, g> {
        public static final a INSTANCE = new a();

        static {
            Covode.recordClassIndex(93058);
        }

        public a() {
            super(1);
        }

        public final g invoke(g gVar) {
            l.c(gVar, "");
            return gVar;
        }
    }

    private c() {
    }

    /* access modifiers changed from: package-private */
    public static final class h extends m implements h.f.a.a<z> {
        final /* synthetic */ com.ss.android.ugc.aweme.upvote.publish.b.a $this_apply;

        static {
            Covode.recordClassIndex(93072);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(com.ss.android.ugc.aweme.upvote.publish.b.a aVar) {
            super(0);
            this.$this_apply = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            /*
                r1 = this;
                com.ss.android.ugc.aweme.upvote.publish.b.a r0 = r1.$this_apply
                com.ss.android.ugc.aweme.upvote.publish.a.d r0 = r0.a()
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                h.z r0 = h.z.f158842a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.publish.c.h.invoke():java.lang.Object");
        }
    }

    static {
        Covode.recordClassIndex(93057);
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ androidx.fragment.app.e $activity;
        final /* synthetic */ Map $cancelMobMap;
        final /* synthetic */ String $itemId;
        final /* synthetic */ h.f.a.a $onRemove;

        public static final class a extends m implements h.f.a.b<g, g> {
            public static final a INSTANCE = new a();

            static {
                Covode.recordClassIndex(93065);
            }

            public a() {
                super(1);
            }

            public final g invoke(g gVar) {
                l.c(gVar, "");
                return gVar;
            }
        }

        static {
            Covode.recordClassIndex(93064);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(androidx.fragment.app.e eVar, String str, Map map, h.f.a.a aVar) {
            super(0);
            this.$activity = eVar;
            this.$itemId = str;
            this.$cancelMobMap = map;
            this.$onRemove = aVar;
        }

        static final class b extends m implements h.f.a.a<z> {
            final /* synthetic */ androidx.fragment.app.e $this_with;
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(93066);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(androidx.fragment.app.e eVar, d dVar) {
                super(0);
                this.$this_with = eVar;
                this.this$0 = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                r.a("recommend_cancel_success", this.this$0.$cancelMobMap);
                new com.bytedance.tux.g.b(this.$this_with).e(((Number) com.ss.android.ugc.aweme.upvote.b.b.a(Integer.valueOf((int) R.string.f91), Integer.valueOf((int) R.string.fd_))).intValue()).b();
                return z.f158842a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$d$c  reason: collision with other inner class name */
        static final class C3803c extends m implements h.f.a.a<z> {
            final /* synthetic */ androidx.fragment.app.e $this_with;

            static {
                Covode.recordClassIndex(93067);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3803c(androidx.fragment.app.e eVar) {
                super(0);
                this.$this_with = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                new com.bytedance.tux.g.b(this.$this_with).e(((Number) com.ss.android.ugc.aweme.upvote.b.b.a(Integer.valueOf((int) R.string.f8n), Integer.valueOf((int) R.string.fd3))).intValue()).b();
                return z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            List<com.ss.android.ugc.aweme.upvote.c.h> upvotes;
            T t;
            String str;
            androidx.fragment.app.e eVar = this.$activity;
            if (!fe.a(eVar)) {
                new com.bytedance.tux.g.b(eVar).e(R.string.ad7).b();
            } else {
                UpvotePublishVM upvotePublishVM = (UpvotePublishVM) new com.bytedance.assem.a.a(ab.a(UpvotePublishVM.class), null, u.j.f25671a, u.a((androidx.lifecycle.m) eVar, false), u.c.f25670a, a.INSTANCE, u.a(eVar), u.b(eVar)).getValue();
                String str2 = this.$itemId;
                b bVar = new b(eVar, this);
                C3803c cVar = new C3803c(eVar);
                l.d(str2, "");
                l.d(bVar, "");
                l.d(cVar, "");
                com.ss.android.ugc.aweme.upvote.c.e b2 = com.ss.android.ugc.aweme.upvote.detail.b.b(str2);
                if (!(b2 == null || (upvotes = b2.getUpvotes()) == null)) {
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    l.b(g2, "");
                    String curUserId = g2.getCurUserId();
                    Iterator<T> it = upvotes.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        User user = t.getUser();
                        if (user != null) {
                            str = user.getUid();
                        } else {
                            str = null;
                        }
                        if (l.a((Object) str, (Object) curUserId)) {
                            break;
                        }
                    }
                    T t2 = t;
                    if (t2 != null) {
                        UpvotePublishVM.d dVar = new UpvotePublishVM.d(upvotePublishVM, bVar, str2);
                        if (t2.getCacheState() == com.ss.android.ugc.aweme.upvote.c.d.PUBLISH_FAILED) {
                            dVar.invoke();
                        } else {
                            com.ss.android.ugc.aweme.upvote.detail.d.f142132a.a(str2, com.ss.android.ugc.aweme.upvote.c.d.PRE_REMOVE);
                            f.a.b.b a2 = upvotePublishVM.g().a().a(str2).b().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new UpvotePublishVM.b(dVar), new UpvotePublishVM.c(upvotePublishVM, cVar, str2));
                            l.b(a2, "");
                            upvotePublishVM.a(a2);
                        }
                    }
                }
            }
            h.f.a.a aVar = this.$onRemove;
            if (aVar != null) {
                return aVar.invoke();
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.a<z> {
        final /* synthetic */ androidx.fragment.app.e $activity;
        final /* synthetic */ String $itemId;
        final /* synthetic */ UpvotePublishMobParam $mobParam;

        public static final class a extends m implements h.f.a.b<g, g> {
            public static final a INSTANCE = new a();

            static {
                Covode.recordClassIndex(93071);
            }

            public a() {
                super(1);
            }

            public final g invoke(g gVar) {
                l.c(gVar, "");
                return gVar;
            }
        }

        static {
            Covode.recordClassIndex(93070);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(androidx.fragment.app.e eVar, String str, UpvotePublishMobParam upvotePublishMobParam) {
            super(0);
            this.$activity = eVar;
            this.$itemId = str;
            this.$mobParam = upvotePublishMobParam;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            androidx.fragment.app.e eVar = this.$activity;
            ((UpvotePublishVM) new com.bytedance.assem.a.a(ab.a(UpvotePublishVM.class), null, u.j.f25671a, u.a((androidx.lifecycle.m) eVar, false), u.c.f25670a, a.INSTANCE, u.a(eVar), u.b(eVar)).getValue()).a(this.$itemId, this.$mobParam);
            return z.f158842a;
        }
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final b f142300a = new b();

        public static final class a extends m implements h.f.a.b<g, g> {
            public static final a INSTANCE = new a();

            static {
                Covode.recordClassIndex(93060);
            }

            public a() {
                super(1);
            }

            public final g invoke(g gVar) {
                l.c(gVar, "");
                return gVar;
            }
        }

        static {
            Covode.recordClassIndex(93059);
        }

        b() {
        }

        public final void run() {
            Activity topActivity = ActivityStack.getTopActivity();
            if (!(topActivity instanceof androidx.fragment.app.e)) {
                topActivity = null;
            }
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) topActivity;
            if (eVar != null) {
                com.bytedance.assem.a.a aVar = new com.bytedance.assem.a.a(ab.a(UpvotePublishVM.class), null, u.j.f25671a, u.a((androidx.lifecycle.m) eVar, false), u.c.f25670a, a.INSTANCE, u.a(eVar), u.b(eVar));
                List<String> a2 = b.a();
                UpvotePublishVM upvotePublishVM = (UpvotePublishVM) aVar.getValue();
                if (a2 != null && !a2.isEmpty()) {
                    f.a.b.b a3 = upvotePublishVM.g().a().a(a2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new UpvotePublishVM.h(a2), UpvotePublishVM.i.f142234a);
                    l.b(a3, "");
                    upvotePublishVM.a(a3);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ UpvotePublishMobParam $mobParam$inlined;
        final /* synthetic */ h.f.a.a $publishAction$inlined;
        final /* synthetic */ com.ss.android.ugc.aweme.upvote.publish.b.a $this_apply;

        static {
            Covode.recordClassIndex(93068);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(com.ss.android.ugc.aweme.upvote.publish.b.a aVar, UpvotePublishMobParam upvotePublishMobParam, h.f.a.a aVar2) {
            super(0);
            this.$this_apply = aVar;
            this.$mobParam$inlined = upvotePublishMobParam;
            this.$publishAction$inlined = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            /*
                r3 = this;
                r0 = 4
                h.p[] r2 = new h.p[r0]
                com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam r0 = r3.$mobParam$inlined
                java.lang.String r1 = r0.f142213a
                java.lang.String r0 = "enter_from"
                h.p r1 = h.v.a(r1, r0)
                r0 = 0
                r2[r0] = r1
                java.lang.String r1 = "icon"
                java.lang.String r0 = "enter_method"
                h.p r1 = h.v.a(r1, r0)
                r0 = 1
                r2[r0] = r1
                java.lang.String r1 = "finish_panel"
                java.lang.String r0 = "page"
                h.p r1 = h.v.a(r1, r0)
                r0 = 2
                r2[r0] = r1
                java.lang.String r1 = "0"
                java.lang.String r0 = "with_recommendation"
                h.p r1 = h.v.a(r1, r0)
                r0 = 3
                r2[r0] = r1
                java.lang.String r0 = "close_recommend_panel"
                com.ss.android.ugc.aweme.common.r.a(r0, r2)
                h.f.a.a r0 = r3.$publishAction$inlined
                r0.invoke()
                com.ss.android.ugc.aweme.upvote.publish.b.a r0 = r3.$this_apply
                com.ss.android.ugc.aweme.upvote.publish.a.d r0 = r0.a()
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                h.z r0 = h.z.f158842a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.publish.c.e.invoke():java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.c$c  reason: collision with other inner class name */
    public static final class C3802c extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ Map $discardMobMap;
        final /* synthetic */ h.f.a.a $removeAction;

        static {
            Covode.recordClassIndex(93061);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3802c(Map map, h.f.a.a aVar) {
            super(1);
            this.$discardMobMap = map;
            this.$removeAction = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            String b2 = com.ss.android.ugc.aweme.base.utils.h.b(R.string.f8y);
            l.b(b2, "");
            bVar2.c(b2, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.upvote.publish.c.C3802c.AnonymousClass1 */
                final /* synthetic */ C3802c this$0;

                static {
                    Covode.recordClassIndex(93062);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    this.this$0.$discardMobMap.put("action_type", "1");
                    r.a("click_discard_pop_up", this.this$0.$discardMobMap);
                    this.this$0.$removeAction.invoke();
                    return z.f158842a;
                }
            });
            String b3 = com.ss.android.ugc.aweme.base.utils.h.b(R.string.f8t);
            l.b(b3, "");
            bVar2.b(b3, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.upvote.publish.c.C3802c.AnonymousClass2 */
                final /* synthetic */ C3802c this$0;

                static {
                    Covode.recordClassIndex(93063);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    this.this$0.$discardMobMap.put("action_type", "0");
                    r.a("click_discard_pop_up", this.this$0.$discardMobMap);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UpvotePublishMobParam f142301a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f142302b;

        static {
            Covode.recordClassIndex(93069);
        }

        f(UpvotePublishMobParam upvotePublishMobParam, h.f.a.a aVar) {
            this.f142301a = upvotePublishMobParam;
            this.f142302b = aVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            r.a("close_recommend_panel", v.a(this.f142301a.f142213a, "enter_from"), v.a("other", "enter_method"), v.a("finish_panel", "page"), v.a("0", "with_recommendation"));
            this.f142302b.invoke();
        }
    }

    public static void a(String str, UpvotePublishMobParam upvotePublishMobParam) {
        l.d(str, "");
        l.d(upvotePublishMobParam, "");
        Activity topActivity = ActivityStack.getTopActivity();
        if (!(topActivity instanceof androidx.fragment.app.e)) {
            topActivity = null;
        }
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) topActivity;
        if (eVar != null) {
            b.a(str);
            r.a("recommend", v.a(upvotePublishMobParam.f142213a, "enter_from"), v.a(upvotePublishMobParam.f142214b, "enter_method"), v.a(upvotePublishMobParam.f142215c, "group_id"), v.a(upvotePublishMobParam.f142216d, "author_id"), v.a(upvotePublishMobParam.f142217e, "follow_status"));
            ((UpvotePublishVM) new com.bytedance.assem.a.a(ab.a(UpvotePublishVM.class), null, u.j.f25671a, u.a((androidx.lifecycle.m) eVar, false), u.c.f25670a, a.INSTANCE, u.a(eVar), u.b(eVar)).getValue()).a(str, (String) null);
            g gVar = new g(eVar, str, upvotePublishMobParam);
            com.ss.android.ugc.aweme.upvote.publish.b.a aVar = new com.ss.android.ugc.aweme.upvote.publish.b.a(eVar, str, upvotePublishMobParam);
            aVar.a(new h(aVar));
            aVar.b(new e(aVar, upvotePublishMobParam, gVar));
            new a.C1112a().a(aVar.a()).a(new f(upvotePublishMobParam, gVar)).f45299a.show(eVar.getSupportFragmentManager(), "UpvoteCommentPanel");
            if (!com.ss.android.ugc.aweme.upvote.e.a.b()) {
                com.ss.android.ugc.aweme.upvote.e.a.c();
            }
        }
    }

    public static void a(String str, boolean z, UpvotePublishMobParam upvotePublishMobParam, h.f.a.a<z> aVar) {
        String str2;
        String b2;
        l.d(str, "");
        l.d(upvotePublishMobParam, "");
        Activity topActivity = ActivityStack.getTopActivity();
        if (!(topActivity instanceof androidx.fragment.app.e)) {
            topActivity = null;
        }
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) topActivity;
        if (eVar != null) {
            p[] pVarArr = new p[6];
            pVarArr[0] = v.a("enter_from", upvotePublishMobParam.f142213a);
            pVarArr[1] = v.a("group_id", upvotePublishMobParam.f142215c);
            pVarArr[2] = v.a("author_id", upvotePublishMobParam.f142216d);
            pVarArr[3] = v.a("follow_status", upvotePublishMobParam.f142217e);
            if (z) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            pVarArr[4] = v.a("with_recommendation", str2);
            pVarArr[5] = v.a("enter_method", upvotePublishMobParam.f142214b);
            Map a2 = ag.a(pVarArr);
            r.a("recommend_cancel", a2);
            d dVar = new d(eVar, str, a2, aVar);
            if (z) {
                Map b3 = ag.b(v.a("enter_from", upvotePublishMobParam.f142213a), v.a("pop_up_type", "cancel_status"));
                r.a("show_discard_pop_up", b3);
                if (com.ss.android.ugc.aweme.upvote.b.a.b()) {
                    b2 = com.ss.android.ugc.aweme.base.utils.h.b(R.string.f90);
                } else {
                    b2 = com.ss.android.ugc.aweme.base.utils.h.b(R.string.fd9);
                }
                com.bytedance.tux.dialog.b.c.a(a.C1094a.a(eVar).b(b2).d(com.ss.android.ugc.aweme.base.utils.h.b(R.string.f8z)), new C3802c(b3, dVar)).a().b().show();
                return;
            }
            dVar.invoke();
        }
    }
}
