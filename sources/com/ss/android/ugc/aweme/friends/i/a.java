package com.ss.android.ugc.aweme.friends.i;

import android.app.Activity;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.experiment.ew;
import com.ss.android.ugc.aweme.friends.model.BackFromSettingEvent;
import com.ss.android.ugc.aweme.friends.model.SyncContactStatusEvent;
import com.ss.android.ugc.aweme.friends.service.IFriendsService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ufr.c;
import com.ss.android.ugc.aweme.utils.ai;
import com.ss.android.ugc.aweme.utils.cp;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;

public final class a {

    /* renamed from: a */
    public static boolean f96849a;

    /* renamed from: b */
    public static final String[] f96850b = {"android.permission.READ_CONTACTS"};

    /* renamed from: c */
    public static final a f96851c = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(61458);
    }

    public static boolean a() {
        try {
            if (androidx.core.content.b.a(com.bytedance.ies.ugc.appcontext.d.a(), "android.permission.READ_CONTACTS") != -1) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean b() {
        if (!a() || !c.a.f141661a.a()) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.i.a$a */
    public static final class C2335a extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ String $enterFrom;
        final /* synthetic */ String $enterMethod;
        final /* synthetic */ IFriendsService.e $listener;

        static {
            Covode.recordClassIndex(61459);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2335a(IFriendsService.e eVar, String str, String str2) {
            super(1);
            this.$listener = eVar;
            this.$enterFrom = str;
            this.$enterMethod = str2;
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(ew.e(), new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.friends.i.a.C2335a.AnonymousClass1 */
                final /* synthetic */ C2335a this$0;

                static {
                    Covode.recordClassIndex(61460);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    com.ss.android.ugc.aweme.friends.e.a.b(this.this$0.$enterFrom, true);
                    com.ss.android.ugc.aweme.friends.e.a.a(this.this$0.$enterFrom, "user", "contact", true, false, this.this$0.$enterMethod, "on", "off", null, 272);
                    a.a(this.this$0.$enterFrom, true, "user", "click", "uid", "");
                    a.C0732a.f33434a.a(b.a.FRIENDSLIST_PERMISSION);
                    return z.f158842a;
                }
            });
            bVar2.b(ew.f(), new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.friends.i.a.C2335a.AnonymousClass2 */
                final /* synthetic */ C2335a this$0;

                static {
                    Covode.recordClassIndex(61461);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    IFriendsService.e eVar = this.this$0.$listener;
                    if (eVar != null) {
                        eVar.b();
                    }
                    com.ss.android.ugc.aweme.friends.e.a.b(this.this$0.$enterFrom, false);
                    com.ss.android.ugc.aweme.friends.e.a.a(this.this$0.$enterFrom, "user", "contact", false, false, this.this$0.$enterMethod, "on", "off", null, 272);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    public static final class b extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ IFriendsService.f $callback;
        final /* synthetic */ String $enterFrom;
        final /* synthetic */ boolean $isDenied;
        final /* synthetic */ IFriendsService.e $listener;

        static {
            Covode.recordClassIndex(61462);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, boolean z, Activity activity, IFriendsService.f fVar, IFriendsService.e eVar) {
            super(1);
            this.$enterFrom = str;
            this.$isDenied = z;
            this.$activity = activity;
            this.$callback = fVar;
            this.$listener = eVar;
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(ew.e(), new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.friends.i.a.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(61463);
                }

                {
                    this.this$0 = r2;
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
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a r11) {
                    /*
                        r10 = this;
                        java.lang.String r0 = ""
                        h.f.b.l.d(r11, r0)
                        com.ss.android.ugc.aweme.friends.i.a$b r0 = r10.this$0
                        java.lang.String r2 = r0.$enterFrom
                        com.ss.android.ugc.aweme.friends.i.a$b r0 = r10.this$0
                        boolean r1 = r0.$isDenied
                        r0 = 1
                        com.ss.android.ugc.aweme.friends.e.a.a(r2, r1, r0)
                        com.ss.android.ugc.aweme.friends.i.a$b r0 = r10.this$0
                        java.lang.String r0 = r0.$enterFrom
                        java.lang.String r7 = com.ss.android.ugc.aweme.friends.e.a.b()
                        java.lang.String r1 = "authorize"
                        java.lang.String r2 = "contact"
                        r3 = 1
                        r4 = 0
                        java.lang.String r5 = "click"
                        java.lang.String r6 = "unknown"
                        r8 = 0
                        r9 = 272(0x110, float:3.81E-43)
                        com.ss.android.ugc.aweme.friends.e.a.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                        com.ss.android.ugc.aweme.friends.i.a$b r0 = r10.this$0
                        java.lang.String r4 = r0.$enterFrom
                        com.ss.android.ugc.aweme.friends.i.a$b r0 = r10.this$0
                        android.app.Activity r3 = r0.$activity
                        com.ss.android.ugc.aweme.friends.i.a$b r0 = r10.this$0
                        com.ss.android.ugc.aweme.friends.service.IFriendsService$f r2 = r0.$callback
                        java.lang.Class<com.ss.android.ugc.aweme.friends.a> r0 = com.ss.android.ugc.aweme.friends.a.class
                        java.lang.Object r0 = com.ss.android.ugc.aweme.base.b.a.b.a(r3, r0)
                        com.ss.android.ugc.aweme.friends.a r0 = (com.ss.android.ugc.aweme.friends.a) r0
                        boolean r0 = r0.a()
                        com.ss.android.ugc.aweme.friends.e.a.c(r4, r0)
                        java.lang.String r9 = com.ss.android.ugc.aweme.friends.e.a.b()
                        java.lang.String r5 = "system"
                        java.lang.String r6 = "contact"
                        java.lang.String r7 = "click"
                        java.lang.String r8 = "unknown"
                        com.ss.android.ugc.aweme.friends.e.a.a(r4, r5, r6, r7, r8, r9)
                        java.lang.String[] r1 = com.ss.android.ugc.aweme.friends.i.a.f96850b
                        com.ss.android.ugc.aweme.friends.i.a$c r0 = new com.ss.android.ugc.aweme.friends.i.a$c
                        r0.<init>(r3, r2, r4, r7)
                        com.ss.android.ugc.aweme.ce.b.a(r3, r1, r0)
                        h.z r0 = h.z.f158842a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.i.a.b.AnonymousClass1.invoke(java.lang.Object):java.lang.Object");
                }
            });
            bVar2.b(ew.f(), new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.friends.i.a.b.AnonymousClass2 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(61464);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    com.ss.android.ugc.aweme.friends.e.a.a(this.this$0.$enterFrom, this.this$0.$isDenied, false);
                    com.ss.android.ugc.aweme.friends.e.a.a(this.this$0.$enterFrom, "authorize", "contact", false, false, "click", "unknown", com.ss.android.ugc.aweme.friends.e.a.b(), null, 272);
                    IFriendsService.e eVar = this.this$0.$listener;
                    if (eVar != null) {
                        eVar.b();
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $enterFrom;
        final /* synthetic */ String $enterMethod;
        final /* synthetic */ IFriendsService.e $listener;

        static {
            Covode.recordClassIndex(61466);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str, String str2, Activity activity, IFriendsService.e eVar) {
            super(1);
            this.$enterFrom = str;
            this.$enterMethod = str2;
            this.$activity = activity;
            this.$listener = eVar;
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(R.string.es1, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.friends.i.a.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(61467);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    com.ss.android.ugc.aweme.friends.e.a.a(this.this$0.$enterFrom, true);
                    com.ss.android.ugc.aweme.friends.e.a.a(this.this$0.$enterFrom, "guide", "contact", true, false, this.this$0.$enterMethod, "off", com.ss.android.ugc.aweme.friends.e.a.b(), null, 272);
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    l.b(g2, "");
                    User curUser = g2.getCurUser();
                    l.b(curUser, "");
                    Keva.getRepo("cold_boot_for_fb_and_ctx").storeBoolean("click_contact_open_setting".concat(String.valueOf(curUser.getUid())), true);
                    cp.a(this.this$0.$activity);
                    new BackFromSettingEvent(this.this$0.$enterFrom).post();
                    a.C0732a.f33434a.a(b.a.FRIENDSLIST_PERMISSION);
                    return z.f158842a;
                }
            });
            bVar2.b(ew.f(), new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.friends.i.a.d.AnonymousClass2 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(61468);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    com.ss.android.ugc.aweme.friends.e.a.a(this.this$0.$enterFrom, false);
                    com.ss.android.ugc.aweme.friends.e.a.a(this.this$0.$enterFrom, "guide", "contact", false, false, this.this$0.$enterMethod, "off", com.ss.android.ugc.aweme.friends.e.a.b(), null, 272);
                    IFriendsService.e eVar = this.this$0.$listener;
                    if (eVar != null) {
                        eVar.b();
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    public static final class e<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a */
        final /* synthetic */ String f96866a;

        /* renamed from: b */
        final /* synthetic */ boolean f96867b;

        /* renamed from: c */
        final /* synthetic */ String f96868c;

        /* renamed from: d */
        final /* synthetic */ String f96869d;

        /* renamed from: e */
        final /* synthetic */ String f96870e;

        static {
            Covode.recordClassIndex(61469);
        }

        e(String str, boolean z, String str2, String str3, String str4) {
            this.f96866a = str;
            this.f96867b = z;
            this.f96868c = str2;
            this.f96869d = str3;
            this.f96870e = str4;
        }

        @Override // b.g
        public final Object then(i<BaseResponse> iVar) {
            if (ai.a(iVar)) {
                l.b(iVar, "");
                if (!p.a("error", iVar.d().message, true)) {
                    final Activity j2 = f.j();
                    if (j2 != null && a.f96849a && this.f96867b && ("homepage_hot".equals(this.f96866a) || "homepage_follow".equals(this.f96866a))) {
                        j2.runOnUiThread(new Runnable() {
                            /* class com.ss.android.ugc.aweme.friends.i.a.e.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(61470);
                            }

                            public final void run() {
                                new com.ss.android.ugc.aweme.tux.a.i.a(j2).a(R.string.atu).a();
                            }
                        });
                        a.f96849a = false;
                    }
                    com.ss.android.ugc.aweme.friends.service.a.f97047a.b(this.f96867b);
                    if (this.f96868c.length() > 0) {
                        com.ss.android.ugc.aweme.friends.e.a.b(this.f96866a, this.f96868c, "contact", this.f96869d, this.f96870e, "process", null);
                    }
                    return new SyncContactStatusEvent(this.f96866a, true, !this.f96867b).post();
                }
            }
            return new SyncContactStatusEvent(this.f96866a, false, true ^ this.f96867b).post();
        }
    }

    static final class c implements b.AbstractC1579b {

        /* renamed from: a */
        final /* synthetic */ Activity f96862a;

        /* renamed from: b */
        final /* synthetic */ IFriendsService.f f96863b;

        /* renamed from: c */
        final /* synthetic */ String f96864c;

        /* renamed from: d */
        final /* synthetic */ String f96865d;

        static {
            Covode.recordClassIndex(61465);
        }

        c(Activity activity, IFriendsService.f fVar, String str, String str2) {
            this.f96862a = activity;
            this.f96863b = fVar;
            this.f96864c = str;
            this.f96865d = str2;
        }

        @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
        public final void a(String[] strArr, int[] iArr) {
            boolean a2 = androidx.core.app.a.a(this.f96862a, a.f96850b[0]);
            l.b(strArr, "");
            if (strArr.length != 0 && iArr[0] == 0) {
                ((com.ss.android.ugc.aweme.friends.a) com.ss.android.ugc.aweme.base.b.a.b.a(this.f96862a, com.ss.android.ugc.aweme.friends.a.class)).a(false);
                IFriendsService.f fVar = this.f96863b;
                if (fVar != null) {
                    fVar.a();
                }
                com.ss.android.ugc.aweme.friends.e.a.a(this.f96864c, ((com.ss.android.ugc.aweme.friends.a) com.ss.android.ugc.aweme.base.b.a.b.a(this.f96862a, com.ss.android.ugc.aweme.friends.a.class)).a(), true, a2);
                com.ss.android.ugc.aweme.friends.e.a.a(this.f96864c, "system", "contact", true, false, this.f96865d, "unknown", com.ss.android.ugc.aweme.friends.e.a.b(), null, 272);
                a.a(this.f96864c, true, "system", "click", com.ss.android.ugc.aweme.friends.e.a.b("unknown", com.ss.android.ugc.aweme.friends.e.a.b()), "");
                return;
            }
            com.ss.android.ugc.aweme.friends.e.a.a(this.f96864c, ((com.ss.android.ugc.aweme.friends.a) com.ss.android.ugc.aweme.base.b.a.b.a(this.f96862a, com.ss.android.ugc.aweme.friends.a.class)).a(), false, a2);
            com.ss.android.ugc.aweme.friends.e.a.a(this.f96864c, "system", "contact", false, a2, this.f96865d, "unknown", com.ss.android.ugc.aweme.friends.e.a.b(), null, 256);
            IFriendsService.f fVar2 = this.f96863b;
            if (fVar2 != null) {
                fVar2.b();
            }
            ((com.ss.android.ugc.aweme.friends.a) com.ss.android.ugc.aweme.base.b.a.b.a(this.f96862a, com.ss.android.ugc.aweme.friends.a.class)).a(true);
        }
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
    public static void a(android.app.Activity r8, java.lang.String r9, com.ss.android.ugc.aweme.friends.service.IFriendsService.e r10, java.lang.String r11) {
        /*
            r0 = 1
            r2 = r9
            com.ss.android.ugc.aweme.friends.e.a.c(r2, r0)
            java.lang.String r7 = com.ss.android.ugc.aweme.friends.e.a.b()
            java.lang.String r3 = "guide"
            java.lang.String r4 = "contact"
            java.lang.String r6 = "off"
            r5 = r11
            com.ss.android.ugc.aweme.friends.e.a.a(r2, r3, r4, r5, r6, r7)
            java.lang.String r1 = com.ss.android.ugc.aweme.experiment.ew.a()
            com.bytedance.tux.dialog.b r0 = new com.bytedance.tux.dialog.b
            r0.<init>(r8)
            com.bytedance.tux.dialog.b r1 = r0.b(r1)
            r0 = 2131828144(0x7f111db0, float:1.928922E38)
            com.bytedance.tux.dialog.internal.b r1 = r1.b(r0)
            com.bytedance.tux.dialog.b r1 = (com.bytedance.tux.dialog.b) r1
            com.ss.android.ugc.aweme.friends.i.a$d r0 = new com.ss.android.ugc.aweme.friends.i.a$d
            r0.<init>(r2, r5, r8, r10)
            com.bytedance.tux.dialog.b r1 = com.bytedance.tux.dialog.b.c.a(r1, r0)
            r0 = 0
            com.bytedance.tux.dialog.internal.b r0 = r1.a(r0)
            com.bytedance.tux.dialog.b r0 = (com.bytedance.tux.dialog.b) r0
            com.bytedance.tux.dialog.a r0 = r0.a()
            android.app.Dialog r0 = r0.b()
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.i.a.a(android.app.Activity, java.lang.String, com.ss.android.ugc.aweme.friends.service.IFriendsService$e, java.lang.String):void");
    }

    public static void a(String str, boolean z, String str2, String str3, String str4, String str5) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        com.ss.android.ugc.aweme.friends.api.a.a().syncContactStatus(1, Boolean.valueOf(z)).a(new e(str, z, str2, str3, str4), i.f4824a, null);
    }
}
