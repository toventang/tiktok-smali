package com.bytedance.tiktok.homepage.mainpagefragment.dialog;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.DialogContext;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.a;
import com.ss.android.ugc.aweme.experiment.ds;
import com.ss.android.ugc.aweme.experiment.ew;
import com.ss.android.ugc.aweme.feed.ui.af;
import com.ss.android.ugc.aweme.feed.ui.p;
import com.ss.android.ugc.aweme.friends.model.FriendList;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.ae;
import com.ss.android.ugc.aweme.relation.b.b;
import com.ss.android.ugc.aweme.relation.dialog.SocialRecFriendsConditionViewModel;
import com.ss.android.ugc.aweme.relation.dialog.b;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.ef;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final c f44330c = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final Fragment f44331a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a.b.a f44332b = new f.a.b.a();

    /* renamed from: d  reason: collision with root package name */
    private final SocialRecFriendsConditionViewModel f44333d;

    /* renamed from: e  reason: collision with root package name */
    private final ScrollSwitchStateManager f44334e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.e$e  reason: collision with other inner class name */
    public static final class C1082e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final C1082e f44339a = new C1082e();

        static {
            Covode.recordClassIndex(27155);
        }

        C1082e() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(27150);
    }

    public static final class c {
        static {
            Covode.recordClassIndex(27153);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    public static void b() {
        a.C0732a.f33434a.a(b.a.SOCIAL_REC_FRIENDS);
    }

    public static final class k implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f44353a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f44354b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f44355c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f44356d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ FriendList f44357e;

        static {
            Covode.recordClassIndex(27170);
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
        public final void a() {
            int i2 = 2;
            if (this.f44356d != 2) {
                i2 = 1;
            }
            androidx.fragment.app.i supportFragmentManager = this.f44353a.getSupportFragmentManager();
            l.b(supportFragmentManager, "");
            b.a.a(supportFragmentManager, this.f44357e, this.f44354b, i2);
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
        public final void a(List<Integer> list) {
            if (list != null) {
                Integer.valueOf(list.size());
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
        public final void a(List<Integer> list, int i2) {
            if (list != null) {
                Integer.valueOf(list.size());
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }

        k(androidx.fragment.app.e eVar, String str, e eVar2, int i2, FriendList friendList) {
            this.f44353a = eVar;
            this.f44354b = str;
            this.f44355c = eVar2;
            this.f44356d = i2;
            this.f44357e = friendList;
        }
    }

    /* access modifiers changed from: package-private */
    public final String c() {
        Fragment b2 = this.f44334e.b();
        if (b2 instanceof ae) {
            Fragment c2 = this.f44334e.c();
            if (c2 instanceof af) {
                return "homepage_hot";
            }
            if (c2 instanceof p) {
                return "homepage_follow";
            }
            return "";
        } else if (b2 instanceof com.ss.android.ugc.aweme.newfollow.ui.c) {
            return "discovery";
        } else {
            if (b2 instanceof com.ss.android.ugc.aweme.notification.b) {
                return "notification_page";
            }
            if (b2 instanceof com.ss.android.ugc.aweme.profile.ui.v2.b) {
                return "personal_homepage";
            }
            return "";
        }
    }

    public final void a() {
        int i2;
        if (this.f44331a.getActivity() != null) {
            com.ss.android.ugc.aweme.account.b.a();
            int i3 = 1;
            if (l.a((Object) com.ss.android.ugc.aweme.account.b.f62864a.k().getLatestLoginMethodName(), (Object) "facebook")) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            b.d a2 = com.ss.android.ugc.aweme.relation.b.b.a(i2);
            androidx.fragment.app.e activity = this.f44331a.getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            if (a2.a(activity) && !a2.b()) {
                h.p<Boolean, Boolean> a3 = a2.a();
                if (a2.c() == 2) {
                    i3 = 2;
                }
                a(i3, a3);
            }
        }
    }

    public static final class f implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f44340a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f44341b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f44342c;

        static {
            Covode.recordClassIndex(27156);
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 6 out of bounds for length 6
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
        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
        public final void a() {
            /*
            // Method dump skipped, instructions count: 150
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainpagefragment.dialog.e.f.a():void");
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
        public final void a(List<Integer> list) {
            if (list != null) {
                Integer.valueOf(list.size());
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
        public final void a(List<Integer> list, int i2) {
            if (list != null) {
                Integer.valueOf(list.size());
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }

        f(androidx.fragment.app.e eVar, e eVar2, int i2) {
            this.f44340a = eVar;
            this.f44341b = eVar2;
            this.f44342c = i2;
        }
    }

    static final class a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f44335a;

        static {
            Covode.recordClassIndex(27151);
        }

        a(e eVar) {
            this.f44335a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && bool.booleanValue()) {
                this.f44335a.a();
            }
        }
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f44336a;

        static {
            Covode.recordClassIndex(27152);
        }

        b(e eVar) {
            this.f44336a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && bool.booleanValue()) {
                this.f44336a.a();
            }
        }
    }

    public static final class h implements com.bytedance.ies.powerpermissions.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f44346a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f44347b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f44348c;

        static {
            Covode.recordClassIndex(27158);
        }

        static final class b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f44350a;

            static {
                Covode.recordClassIndex(27160);
            }

            b(h hVar) {
                this.f44350a = hVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                Activity topActivity = ActivityStack.getTopActivity();
                if (topActivity != null) {
                    new com.bytedance.tux.g.b(topActivity).e(R.string.bgb).b();
                }
                e.b();
            }
        }

        static final class a<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f44349a;

            static {
                Covode.recordClassIndex(27159);
            }

            a(h hVar) {
                this.f44349a = hVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                List friends;
                FriendList friendList = (FriendList) obj;
                if (friendList == null || (friends = friendList.getFriends()) == null || friends.isEmpty()) {
                    Activity topActivity = ActivityStack.getTopActivity();
                    if (topActivity != null) {
                        new com.bytedance.tux.g.b(topActivity).e(R.string.atu).b();
                    }
                    e.b();
                } else if (this.f44349a.f44348c.isFinishing()) {
                    e.b();
                } else {
                    androidx.fragment.app.i supportFragmentManager = this.f44349a.f44348c.getSupportFragmentManager();
                    l.b(supportFragmentManager, "");
                    b.a.a(supportFragmentManager, friendList, this.f44349a.f44347b, 1);
                }
            }
        }

        @Override // com.bytedance.ies.powerpermissions.f
        public final void a(com.bytedance.ies.powerpermissions.c.a... aVarArr) {
            l.d(aVarArr, "");
            int i2 = f.f44359b[aVarArr[0].f34455b.ordinal()];
            if (i2 == 1) {
                com.ss.android.ugc.aweme.friends.e.a.a(this.f44347b, "system", "contact", true, false, "login", "unknown", com.ss.android.ugc.aweme.friends.e.a.b(), null, 272);
                com.ss.android.ugc.aweme.friends.e.a.b(this.f44347b, "system", "contact", "login", com.ss.android.ugc.aweme.friends.e.a.b("unknown", com.ss.android.ugc.aweme.friends.e.a.b()), "process", null);
                com.ss.android.ugc.aweme.relation.b.b.b(1, com.ss.android.ugc.aweme.relation.c.b.CONSENT.getValue());
                com.ss.android.ugc.aweme.friends.service.a.f97047a.j().a();
                com.ss.android.ugc.aweme.relation.b.b.f120345a.a(false, 1).a(new a(this), new b(this));
            } else if (i2 == 2) {
                com.ss.android.ugc.aweme.friends.e.a.a(this.f44347b, "system", "contact", false, true, "login", "unknown", com.ss.android.ugc.aweme.friends.e.a.b(), null, 256);
                com.ss.android.ugc.aweme.relation.b.b.b(1, com.ss.android.ugc.aweme.relation.c.b.CONSENT.getValue());
                com.ss.android.ugc.aweme.friends.service.a.f97047a.j().a();
                a.C0732a.f33434a.a(b.a.SOCIAL_REC_FRIENDS);
            } else if (i2 == 3) {
                com.ss.android.ugc.aweme.friends.e.a.a(this.f44347b, "system", "contact", false, false, "login", "off", com.ss.android.ugc.aweme.friends.e.a.b(), null, 256);
                com.ss.android.ugc.aweme.relation.b.b.b(1, com.ss.android.ugc.aweme.relation.c.b.CONSENT.getValue());
                com.ss.android.ugc.aweme.friends.service.a.f97047a.j().a();
                a.C0732a.f33434a.a(b.a.SOCIAL_REC_FRIENDS);
            }
        }

        h(e eVar, String str, androidx.fragment.app.e eVar2) {
            this.f44346a = eVar;
            this.f44347b = str;
            this.f44348c = eVar2;
        }
    }

    static final class i extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ com.bytedance.ies.powerpermissions.m $dispatcher;
        final /* synthetic */ String $enterFrom;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(27161);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(e eVar, String str, com.bytedance.ies.powerpermissions.m mVar) {
            super(1);
            this.this$0 = eVar;
            this.$enterFrom = str;
            this.$dispatcher = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(ew.e(), new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.bytedance.tiktok.homepage.mainpagefragment.dialog.e.i.AnonymousClass1 */
                final /* synthetic */ i this$0;

                static {
                    Covode.recordClassIndex(27162);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                    java.lang.IndexOutOfBoundsException: Index 6 out of bounds for length 6
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
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a r11) {
                    /*
                        r10 = this;
                        java.lang.String r0 = ""
                        h.f.b.l.d(r11, r0)
                        com.bytedance.tiktok.homepage.mainpagefragment.dialog.e$i r0 = r10.this$0
                        java.lang.String r0 = r0.$enterFrom
                        java.lang.String r5 = com.ss.android.ugc.aweme.friends.e.a.b()
                        java.lang.String r1 = "system"
                        java.lang.String r2 = "contact"
                        java.lang.String r3 = "login"
                        java.lang.String r4 = "unknown"
                        com.ss.android.ugc.aweme.friends.e.a.a(r0, r1, r2, r3, r4, r5)
                        com.bytedance.tiktok.homepage.mainpagefragment.dialog.e$i r0 = r10.this$0
                        java.lang.String r0 = r0.$enterFrom
                        java.lang.String r7 = com.ss.android.ugc.aweme.friends.e.a.b()
                        java.lang.String r1 = "authorize"
                        java.lang.String r2 = "contact"
                        r3 = 1
                        r4 = 0
                        java.lang.String r5 = "login"
                        java.lang.String r6 = "unknown"
                        r8 = 0
                        r9 = 272(0x110, float:3.81E-43)
                        com.ss.android.ugc.aweme.friends.e.a.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                        com.bytedance.tiktok.homepage.mainpagefragment.dialog.e$i r0 = r10.this$0
                        com.bytedance.ies.powerpermissions.m r0 = r0.$dispatcher
                        if (r0 == 0) goto L_0x0039
                        r0.a()
                    L_0x0039:
                        h.z r0 = h.z.f158842a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainpagefragment.dialog.e.i.AnonymousClass1.invoke(java.lang.Object):java.lang.Object");
                }
            });
            bVar2.b(ew.f(), new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.bytedance.tiktok.homepage.mainpagefragment.dialog.e.i.AnonymousClass2 */
                final /* synthetic */ i this$0;

                static {
                    Covode.recordClassIndex(27163);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    com.ss.android.ugc.aweme.friends.e.a.a(this.this$0.$enterFrom, "authorize", "contact", false, false, "login", "unknown", com.ss.android.ugc.aweme.friends.e.a.b(), null, 272);
                    com.ss.android.ugc.aweme.relation.b.b.b(1, com.ss.android.ugc.aweme.relation.c.b.CONSENT.getValue());
                    com.ss.android.ugc.aweme.friends.service.a.f97047a.j().a();
                    e.b();
                    com.bytedance.ies.powerpermissions.m mVar = this.this$0.$dispatcher;
                    if (mVar != null) {
                        mVar.b();
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ androidx.fragment.app.e $activity;
        final /* synthetic */ String $enterFrom;
        final /* synthetic */ int $socialRecType;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(27164);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(e eVar, int i2, String str, androidx.fragment.app.e eVar2) {
            super(1);
            this.this$0 = eVar;
            this.$socialRecType = i2;
            this.$enterFrom = str;
            this.$activity = eVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            final com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(ew.e(), new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.bytedance.tiktok.homepage.mainpagefragment.dialog.e.j.AnonymousClass1 */
                final /* synthetic */ j this$0;

                static {
                    Covode.recordClassIndex(27165);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    final com.bytedance.tux.dialog.b.a aVar2 = aVar;
                    l.d(aVar2, "");
                    bVar2.f44819a.get(0).a(new h.f.a.b<TuxButton, z>(this) {
                        /* class com.bytedance.tiktok.homepage.mainpagefragment.dialog.e.j.AnonymousClass1.AnonymousClass1 */
                        final /* synthetic */ AnonymousClass1 this$0;

                        static {
                            Covode.recordClassIndex(27166);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ z invoke(TuxButton tuxButton) {
                            String str;
                            String b2;
                            TuxButton tuxButton2 = tuxButton;
                            l.d(tuxButton2, "");
                            if (!tuxButton2.f44736a) {
                                int i2 = 2;
                                if (this.this$0.this$0.$socialRecType == 2) {
                                    str = "facebook";
                                } else {
                                    str = "contact";
                                }
                                if (this.this$0.this$0.$socialRecType == 2) {
                                    b2 = com.ss.android.ugc.aweme.friends.e.a.a();
                                } else {
                                    b2 = com.ss.android.ugc.aweme.friends.e.a.b();
                                }
                                com.ss.android.ugc.aweme.friends.e.a.a(this.this$0.this$0.$enterFrom, "user", str, true, false, "login", "on", b2, null, 272);
                                com.ss.android.ugc.aweme.friends.e.a.b(this.this$0.this$0.$enterFrom, "user", str, "login", com.ss.android.ugc.aweme.friends.e.a.b("on", b2), "process", null);
                                aVar2.f44816b = false;
                                tuxButton2.setLoading(true);
                                com.ss.android.ugc.aweme.relation.b.b.b(this.this$0.this$0.$socialRecType, com.ss.android.ugc.aweme.relation.c.b.CONSENT.getValue());
                                com.ss.android.ugc.aweme.friends.service.a.f97047a.j().a();
                                com.ss.android.ugc.aweme.relation.b.b bVar = com.ss.android.ugc.aweme.relation.b.b.f120345a;
                                if (this.this$0.this$0.$socialRecType != 2) {
                                    i2 = 1;
                                }
                                bVar.a(false, i2).a(new f.a.d.f(this) {
                                    /* class com.bytedance.tiktok.homepage.mainpagefragment.dialog.e.j.AnonymousClass1.AnonymousClass1.AnonymousClass1 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ AnonymousClass1 f44351a;

                                    static {
                                        Covode.recordClassIndex(27167);
                                    }

                                    {
                                        this.f44351a = r1;
                                    }

                                    @Override // f.a.d.f
                                    public final /* synthetic */ void accept(Object obj) {
                                        int i2;
                                        List friends;
                                        FriendList friendList = (FriendList) obj;
                                        aVar2.a().dismiss();
                                        if (friendList == null || (friends = friendList.getFriends()) == null || friends.isEmpty()) {
                                            Activity topActivity = ActivityStack.getTopActivity();
                                            if (topActivity != null) {
                                                com.bytedance.tux.g.b bVar = new com.bytedance.tux.g.b(topActivity);
                                                if (this.f44351a.this$0.this$0.$socialRecType == 2) {
                                                    i2 = R.string.giu;
                                                } else {
                                                    i2 = R.string.atu;
                                                }
                                                bVar.e(i2).b();
                                            }
                                            e.b();
                                        } else if (this.f44351a.this$0.this$0.$activity.isFinishing()) {
                                            e.b();
                                        } else {
                                            androidx.fragment.app.i supportFragmentManager = this.f44351a.this$0.this$0.$activity.getSupportFragmentManager();
                                            l.b(supportFragmentManager, "");
                                            b.a.a(supportFragmentManager, friendList, this.f44351a.this$0.this$0.$enterFrom, this.f44351a.this$0.this$0.$socialRecType);
                                        }
                                    }
                                }, new f.a.d.f(this) {
                                    /* class com.bytedance.tiktok.homepage.mainpagefragment.dialog.e.j.AnonymousClass1.AnonymousClass1.AnonymousClass2 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ AnonymousClass1 f44352a;

                                    static {
                                        Covode.recordClassIndex(27168);
                                    }

                                    {
                                        this.f44352a = r1;
                                    }

                                    @Override // f.a.d.f
                                    public final /* synthetic */ void accept(Object obj) {
                                        aVar2.a().dismiss();
                                        Activity topActivity = ActivityStack.getTopActivity();
                                        if (topActivity != null) {
                                            new com.bytedance.tux.g.b(topActivity).e(R.string.bgb).b();
                                        }
                                        e.b();
                                    }
                                });
                            }
                            return z.f158842a;
                        }
                    });
                    return z.f158842a;
                }
            });
            bVar2.b(ew.f(), new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.bytedance.tiktok.homepage.mainpagefragment.dialog.e.j.AnonymousClass2 */
                final /* synthetic */ j this$0;

                static {
                    Covode.recordClassIndex(27169);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    String str;
                    String b2;
                    l.d(aVar, "");
                    if (this.this$0.$socialRecType == 2) {
                        str = "facebook";
                    } else {
                        str = "contact";
                    }
                    if (this.this$0.$socialRecType == 2) {
                        b2 = com.ss.android.ugc.aweme.friends.e.a.a();
                    } else {
                        b2 = com.ss.android.ugc.aweme.friends.e.a.b();
                    }
                    com.ss.android.ugc.aweme.friends.e.a.a(this.this$0.$enterFrom, "user", str, false, false, "login", "on", b2, null, 272);
                    com.ss.android.ugc.aweme.relation.b.b.b(this.this$0.$socialRecType, com.ss.android.ugc.aweme.relation.c.b.CONSENT.getValue());
                    com.ss.android.ugc.aweme.friends.service.a.f97047a.j().a();
                    a.C0732a.f33434a.a(b.a.SOCIAL_REC_FRIENDS);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    private final void a(int i2) {
        androidx.fragment.app.e activity = this.f44331a.getActivity();
        if (activity != null) {
            l.b(activity, "");
            if (!activity.isFinishing()) {
                com.bytedance.ies.dmt.ui.dialog.dialogmanager.a aVar = a.C0732a.f33434a;
                DialogContext.a aVar2 = new DialogContext.a(activity);
                aVar2.f33424a = b.a.SOCIAL_REC_FRIENDS;
                aVar.a(aVar2.b(new f(activity, this, i2)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f44337a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f44338b;

        static {
            Covode.recordClassIndex(27154);
        }

        d(e eVar, int i2) {
            this.f44337a = eVar;
            this.f44338b = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List friends;
            FriendList friendList = (FriendList) obj;
            if (friendList != null && (friends = friendList.getFriends()) != null && !friends.isEmpty()) {
                e eVar = this.f44337a;
                int i2 = this.f44338b;
                androidx.fragment.app.e activity = eVar.f44331a.getActivity();
                if (activity != null) {
                    l.b(activity, "");
                    if ((true ^ activity.isFinishing()) && activity != null) {
                        String c2 = eVar.c();
                        com.bytedance.ies.dmt.ui.dialog.dialogmanager.a aVar = a.C0732a.f33434a;
                        DialogContext.a aVar2 = new DialogContext.a(activity);
                        aVar2.f33424a = b.a.SOCIAL_REC_FRIENDS;
                        aVar.a(aVar2.b(new k(activity, c2, eVar, i2, friendList)));
                    }
                }
            }
        }
    }

    public static final class g extends com.bytedance.ies.powerpermissions.i {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f44343b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f44344c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f44345d;

        static {
            Covode.recordClassIndex(27157);
        }

        @Override // com.bytedance.ies.powerpermissions.i
        public final void a(com.bytedance.ies.powerpermissions.m mVar, com.bytedance.ies.powerpermissions.c.a... aVarArr) {
            l.d(aVarArr, "");
            int i2 = f.f44358a[aVarArr[0].f34455b.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    e eVar = this.f44343b;
                    androidx.fragment.app.e eVar2 = this.f44344c;
                    String str = this.f44345d;
                    ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a(new com.bytedance.tux.dialog.b(eVar2).b(ew.a()).d(ew.d()), new i(eVar, str, mVar)).a(false)).a().b().show();
                } else if (i2 == 3 && mVar != null) {
                    mVar.b();
                }
            } else if (mVar != null) {
                mVar.b();
            }
        }

        g(e eVar, androidx.fragment.app.e eVar2, String str) {
            this.f44343b = eVar;
            this.f44344c = eVar2;
            this.f44345d = str;
        }
    }

    public final void a(int i2, h.p<Boolean, Boolean> pVar) {
        boolean booleanValue = pVar.getFirst().booleanValue();
        boolean booleanValue2 = pVar.getSecond().booleanValue();
        if (!booleanValue) {
            f.a.b.b a2 = com.ss.android.ugc.aweme.relation.b.b.f120345a.a(booleanValue2, i2).a(new d(this, i2), C1082e.f44339a);
            l.b(a2, "");
            f.a.j.a.a(a2, this.f44332b);
        } else if (ds.a() && com.ss.android.ugc.aweme.relation.b.b.a()) {
            a(i2);
        }
    }

    public e(Fragment fragment, SocialRecFriendsConditionViewModel socialRecFriendsConditionViewModel, ScrollSwitchStateManager scrollSwitchStateManager) {
        l.d(fragment, "");
        l.d(socialRecFriendsConditionViewModel, "");
        l.d(scrollSwitchStateManager, "");
        this.f44331a = fragment;
        this.f44333d = socialRecFriendsConditionViewModel;
        this.f44334e = scrollSwitchStateManager;
        androidx.fragment.app.e activity = fragment.getActivity();
        if (activity != null) {
            ef.a(socialRecFriendsConditionViewModel.f120376b, activity, new a(this));
            ef.a(socialRecFriendsConditionViewModel.f120375a, activity, new b(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(androidx.fragment.app.e eVar, String str, int i2) {
        String a2;
        String d2;
        com.bytedance.tux.dialog.b a3 = a.C1094a.a(eVar);
        if (i2 == 2) {
            a2 = ew.b();
        } else {
            a2 = ew.a();
            if (i2 != 2) {
                d2 = ew.d();
                ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a(a3.b(a2).d(d2), new j(this, i2, str, eVar)).a(false)).a().b().show();
            }
        }
        d2 = ew.c();
        ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a(a3.b(a2).d(d2), new j(this, i2, str, eVar)).a(false)).a().b().show();
    }
}
