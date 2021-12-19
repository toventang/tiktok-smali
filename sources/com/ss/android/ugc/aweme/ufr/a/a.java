package com.ss.android.ugc.aweme.ufr.a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.c;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ufr.c;
import com.ss.android.ugc.aweme.utils.ap;
import f.a.t;
import f.a.v;
import f.a.w;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class a extends com.ss.android.ugc.aweme.ufr.a {

    /* renamed from: l  reason: collision with root package name */
    public static final C3763a f141633l = new C3763a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    public String f141634h = "";

    /* renamed from: i  reason: collision with root package name */
    public int f141635i;

    /* renamed from: j  reason: collision with root package name */
    public long f141636j = -1;

    /* renamed from: k  reason: collision with root package name */
    public f.a.b.b f141637k;

    static {
        Covode.recordClassIndex(92556);
    }

    /* renamed from: com.ss.android.ugc.aweme.ufr.a.a$a  reason: collision with other inner class name */
    public static final class C3763a {
        static {
            Covode.recordClassIndex(92557);
        }

        private C3763a() {
        }

        public /* synthetic */ C3763a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ufr.a
    public final t<com.ss.android.ugc.aweme.ufr.e> g() {
        t<com.ss.android.ugc.aweme.ufr.e> a2 = t.a(new d(this));
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.ufr.a
    public final t<com.ss.android.ugc.aweme.ufr.e> i() {
        t<com.ss.android.ugc.aweme.ufr.e> b2 = t.a(new f(this)).b(f.a.h.a.b(f.a.k.a.f158006c));
        l.b(b2, "");
        return b2;
    }

    public final void j() {
        r.a("authorize_facebook_failure", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", c()).f66730a);
    }

    @Override // com.ss.android.ugc.aweme.ufr.a
    public final t<com.ss.android.ugc.aweme.ufr.e> f() {
        boolean z;
        if (c.b.f141662a.a(b()).length() > 0) {
            z = true;
        } else {
            z = false;
        }
        t<com.ss.android.ugc.aweme.ufr.e> b2 = t.b(new com.ss.android.ugc.aweme.ufr.e(z, 0, 0, null, 14));
        l.b(b2, "");
        return b2;
    }

    @Override // com.ss.android.ugc.aweme.ufr.a
    public final t<com.ss.android.ugc.aweme.ufr.e> h() {
        boolean z;
        if (!this.f141631f || !l.a((Object) "version_update", (Object) c())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            t<com.ss.android.ugc.aweme.ufr.e> a2 = t.a(new b(this));
            l.b(a2, "");
            return a2;
        }
        t<com.ss.android.ugc.aweme.ufr.e> a3 = t.a(new c(this));
        l.b(a3, "");
        return a3;
    }

    @Override // com.ss.android.ugc.aweme.ufr.a
    public final t<com.ss.android.ugc.aweme.ufr.e> e() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        User curUser = g2.getCurUser();
        l.b(curUser, "");
        List<SocialPlatformSetting> socialPlatformSettings = curUser.getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings != null) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 2) {
                    t<com.ss.android.ugc.aweme.ufr.e> b2 = t.b(new com.ss.android.ugc.aweme.ufr.e(socialPlatformSetting.getSyncStatus(), 0, 0, null, 14));
                    l.b(b2, "");
                    return b2;
                }
            }
        }
        t<com.ss.android.ugc.aweme.ufr.e> b3 = t.b(new com.ss.android.ugc.aweme.ufr.e(false, 0, 0, null, 14));
        l.b(b3, "");
        return b3;
    }

    static final class e<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141644a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f141645b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f141646c;

        static {
            Covode.recordClassIndex(92569);
        }

        e(a aVar, boolean z, int i2) {
            this.f141644a = aVar;
            this.f141645b = z;
            this.f141646c = i2;
        }

        @Override // f.a.w
        public final void subscribe(final v<com.ss.android.ugc.aweme.ufr.e> vVar) {
            l.d(vVar, "");
            this.f141644a.f141637k = com.ss.android.ugc.aweme.friends.api.a.a().syncSocialRelationStatusInRx(2, Boolean.valueOf(this.f141645b)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.ufr.a.a.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f141647a;

                static {
                    Covode.recordClassIndex(92570);
                }

                {
                    this.f141647a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    String str;
                    com.ss.android.ugc.aweme.ufr.f.a(com.ss.android.ugc.aweme.recommend.f.FACEBOOK);
                    vVar.a(new com.ss.android.ugc.aweme.ufr.e(this.f141647a.f141645b, 0, 0, null, 14));
                    if (this.f141647a.f141645b) {
                        String c2 = this.f141647a.f141644a.c();
                        if (this.f141647a.f141646c == 1) {
                            str = "both";
                        } else {
                            str = "uid";
                        }
                        com.ss.android.ugc.aweme.friends.e.a.b(c2, "user", "facebook", this.f141647a.f141644a.d(), str, "process", this.f141647a.f141644a.f141630e);
                    }
                    f.a.b.b bVar = this.f141647a.f141644a.f141637k;
                    if (bVar != null) {
                        bVar.dispose();
                    }
                }
            }, new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.ufr.a.a.e.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f141649a;

                static {
                    Covode.recordClassIndex(92571);
                }

                {
                    this.f141649a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    int i2;
                    String str;
                    int i3;
                    Throwable th = (Throwable) obj;
                    v vVar = vVar;
                    boolean z = this.f141649a.f141645b;
                    if (!(th instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                        th = null;
                    }
                    com.ss.android.ugc.aweme.base.api.a.a aVar = (com.ss.android.ugc.aweme.base.api.a.a) th;
                    if (aVar != null) {
                        i2 = aVar.getErrorCode();
                    } else {
                        i2 = -1;
                    }
                    vVar.a(new com.ss.android.ugc.aweme.ufr.e(z, 0, i2, null, 10));
                    if (this.f141649a.f141645b) {
                        String c2 = this.f141649a.f141644a.c();
                        if (this.f141649a.f141646c == 1) {
                            str = "both";
                        } else {
                            str = "uid";
                        }
                        String d2 = this.f141649a.f141644a.d();
                        if (c.b.f141662a.a(this.f141649a.f141644a.b()).length() == 0) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        com.ss.android.ugc.aweme.friends.e.a.a(c2, "user", "facebook", str, d2, "process", 0, Integer.valueOf(i3 ^ 1), Integer.valueOf(this.f141649a.f141644a.f141635i));
                    }
                    f.a.b.b bVar = this.f141649a.f141644a.f141637k;
                    if (bVar != null) {
                        bVar.dispose();
                    }
                }
            });
        }
    }

    public static boolean a(AuthResult authResult) {
        Bundle bundle = authResult.f40156j;
        l.b(bundle, "");
        String[] stringArray = bundle.getStringArray("fb_granted_permissions");
        if (stringArray == null || stringArray.length == 0) {
            return false;
        }
        for (String str : stringArray) {
            if (l.a((Object) "user_friends", (Object) str)) {
                return true;
            }
        }
        return false;
    }

    static final class b<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141638a;

        static {
            Covode.recordClassIndex(92558);
        }

        b(a aVar) {
            this.f141638a = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ufr.a.a$b$a  reason: collision with other inner class name */
        static final class C3764a implements com.bytedance.lobby.auth.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f141639a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v f141640b;

            static {
                Covode.recordClassIndex(92559);
            }

            C3764a(b bVar, v vVar) {
                this.f141639a = bVar;
                this.f141640b = vVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: f.a.v */
            /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: f.a.v */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.lobby.auth.a
            public final void a(AuthResult authResult) {
                int i2;
                l.d(authResult, "");
                if (!authResult.f40147a || authResult.f40148b || TextUtils.isEmpty(authResult.f40152f) || !a.a(authResult)) {
                    a aVar = this.f141639a.f141638a;
                    if (!authResult.f40147a || a.a(authResult)) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    aVar.f141635i = i2;
                    this.f141639a.f141638a.j();
                    this.f141640b.a(new com.ss.android.ugc.aweme.ufr.e(false, 0, 0, null, 14));
                    return;
                }
                a aVar2 = this.f141639a.f141638a;
                String str = authResult.f40152f;
                l.b(str, "");
                aVar2.f141634h = str;
                this.f141639a.f141638a.f141636j = authResult.f40154h;
                this.f141640b.a(new com.ss.android.ugc.aweme.ufr.e(true, 0, 0, null, 14));
            }
        }

        @Override // f.a.w
        public final void subscribe(v<com.ss.android.ugc.aweme.ufr.e> vVar) {
            l.d(vVar, "");
            com.bytedance.lobby.internal.d.a();
            Context a2 = this.f141638a.a();
            Objects.requireNonNull(a2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            c.a aVar = new c.a((androidx.fragment.app.e) a2);
            aVar.f40170a = "facebook";
            c.a a3 = aVar.a(new ap().a("fb_read_permissions", "user_friends").f142646a);
            a3.f40172c = new C3764a(this, vVar);
            com.bytedance.lobby.auth.c a4 = a3.a();
            l.b(a4, "");
            com.bytedance.lobby.internal.d.a(a4);
        }
    }

    static final class c<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141641a;

        static {
            Covode.recordClassIndex(92560);
        }

        c(a aVar) {
            this.f141641a = aVar;
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
        @Override // f.a.w
        public final void subscribe(final f.a.v<com.ss.android.ugc.aweme.ufr.e> r8) {
            /*
                r7 = this;
                java.lang.String r0 = ""
                h.f.b.l.d(r8, r0)
                com.ss.android.ugc.aweme.ufr.a.a r0 = r7.f141641a
                java.lang.String r1 = r0.c()
                com.ss.android.ugc.aweme.ufr.a.a r0 = r7.f141641a
                java.lang.String r4 = r0.d()
                java.lang.String r6 = com.ss.android.ugc.aweme.friends.e.a.a()
                java.lang.String r2 = "user"
                java.lang.String r3 = "facebook"
                java.lang.String r5 = "off"
                com.ss.android.ugc.aweme.friends.e.a.a(r1, r2, r3, r4, r5, r6)
                com.ss.android.ugc.aweme.ufr.a.a r0 = r7.f141641a
                android.content.Context r0 = r0.a()
                com.bytedance.tux.dialog.b r1 = com.bytedance.tux.dialog.a.C1094a.a(r0)
                java.lang.String r0 = com.ss.android.ugc.aweme.experiment.ew.b()
                com.bytedance.tux.dialog.b r1 = r1.b(r0)
                java.lang.String r0 = com.ss.android.ugc.aweme.experiment.ew.c()
                com.bytedance.tux.dialog.b r1 = r1.d(r0)
                com.ss.android.ugc.aweme.ufr.a.a$c$1 r0 = new com.ss.android.ugc.aweme.ufr.a.a$c$1
                r0.<init>(r7, r8)
                com.bytedance.tux.dialog.b r1 = com.bytedance.tux.dialog.b.c.a(r1, r0)
                r0 = 0
                com.bytedance.tux.dialog.internal.b r0 = r1.a(r0)
                com.bytedance.tux.dialog.b r0 = (com.bytedance.tux.dialog.b) r0
                com.bytedance.tux.dialog.a r0 = r0.a()
                android.app.Dialog r0 = r0.b()
                r0.show()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ufr.a.a.c.subscribe(f.a.v):void");
        }
    }

    static final class d<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141643a;

        static {
            Covode.recordClassIndex(92565);
        }

        d(a aVar) {
            this.f141643a = aVar;
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
        @Override // f.a.w
        public final void subscribe(final f.a.v<com.ss.android.ugc.aweme.ufr.e> r8) {
            /*
                r7 = this;
                java.lang.String r0 = ""
                h.f.b.l.d(r8, r0)
                com.ss.android.ugc.aweme.ufr.a.a r0 = r7.f141643a
                java.lang.String r1 = r0.c()
                com.ss.android.ugc.aweme.ufr.a.a r0 = r7.f141643a
                java.lang.String r4 = r0.d()
                java.lang.String r2 = "user"
                java.lang.String r3 = "facebook"
                java.lang.String r5 = "on"
                java.lang.String r6 = "off"
                com.ss.android.ugc.aweme.friends.e.a.a(r1, r2, r3, r4, r5, r6)
                com.ss.android.ugc.aweme.ufr.a.a r0 = r7.f141643a
                android.content.Context r0 = r0.a()
                com.bytedance.tux.dialog.b r1 = com.bytedance.tux.dialog.a.C1094a.a(r0)
                java.lang.String r0 = com.ss.android.ugc.aweme.experiment.ew.b()
                com.bytedance.tux.dialog.b r1 = r1.b(r0)
                java.lang.String r0 = com.ss.android.ugc.aweme.experiment.ew.c()
                com.bytedance.tux.dialog.b r1 = r1.d(r0)
                com.ss.android.ugc.aweme.ufr.a.a$d$1 r0 = new com.ss.android.ugc.aweme.ufr.a.a$d$1
                r0.<init>(r7, r8)
                com.bytedance.tux.dialog.b r1 = com.bytedance.tux.dialog.b.c.a(r1, r0)
                r0 = 0
                com.bytedance.tux.dialog.internal.b r0 = r1.a(r0)
                com.bytedance.tux.dialog.b r0 = (com.bytedance.tux.dialog.b) r0
                com.bytedance.tux.dialog.a r0 = r0.a()
                android.app.Dialog r0 = r0.b()
                r0.show()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ufr.a.a.d.subscribe(f.a.v):void");
        }
    }

    static final class f<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141651a;

        static {
            Covode.recordClassIndex(92572);
        }

        f(a aVar) {
            this.f141651a = aVar;
        }

        @Override // f.a.w
        public final void subscribe(final v<com.ss.android.ugc.aweme.ufr.e> vVar) {
            l.d(vVar, "");
            this.f141651a.f141637k = com.ss.android.ugc.aweme.friends.api.a.a().socialFriends("facebook", c.b.f141662a.a(this.f141651a.b()), null, Long.valueOf(c.b.f141662a.d(this.f141651a.b()))).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.ufr.a.a.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f141652a;

                static {
                    Covode.recordClassIndex(92573);
                }

                {
                    this.f141652a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    vVar.a(new com.ss.android.ugc.aweme.ufr.e(true, 0, 0, null, 14));
                    f.a.b.b bVar = this.f141652a.f141651a.f141637k;
                    if (bVar != null) {
                        bVar.dispose();
                    }
                }
            }, new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.ufr.a.a.f.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f141654a;

                static {
                    Covode.recordClassIndex(92574);
                }

                {
                    this.f141654a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    Throwable th;
                    int i2;
                    Throwable th2 = (Throwable) obj;
                    v vVar = vVar;
                    boolean z = th2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a;
                    if (!z) {
                        th = null;
                    } else {
                        th = th2;
                    }
                    com.ss.android.ugc.aweme.base.api.a.a aVar = (com.ss.android.ugc.aweme.base.api.a.a) th;
                    if (aVar != null) {
                        i2 = aVar.getErrorCode();
                    } else {
                        i2 = -1;
                    }
                    vVar.a(new com.ss.android.ugc.aweme.ufr.e(false, 0, i2, null, 10));
                    if (!z) {
                        th2 = null;
                    }
                    com.ss.android.ugc.aweme.base.api.a.a aVar2 = (com.ss.android.ugc.aweme.base.api.a.a) th2;
                    if (aVar2 != null && aVar2.getErrorCode() == 3002047) {
                        c.b.f141662a.b(this.f141654a.f141651a.b());
                    }
                    f.a.b.b bVar = this.f141654a.f141651a.f141637k;
                    if (bVar != null) {
                        bVar.dispose();
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.ufr.a
    public final t<com.ss.android.ugc.aweme.ufr.e> a(boolean z, int i2) {
        if (z && !TextUtils.equals(this.f141634h, "")) {
            c.b.f141662a.a(b(), this.f141634h, this.f141636j);
        }
        c.b.f141662a.a(z);
        t<com.ss.android.ugc.aweme.ufr.e> a2 = t.a(new e(this, z, i2));
        l.b(a2, "");
        return a2;
    }
}
