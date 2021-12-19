package com.ss.android.ugc.aweme.inbox;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.concurrent.Callable;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f104204a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static a f104205b;

    private e() {
    }

    static {
        Covode.recordClassIndex(66718);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final h f104206a = i.a((h.f.a.a) new b(this));

        /* renamed from: b  reason: collision with root package name */
        final h f104207b = i.a((h.f.a.a) new c(this));

        /* renamed from: c  reason: collision with root package name */
        public final String f104208c;

        /* renamed from: d  reason: collision with root package name */
        private final h f104209d = i.a((h.f.a.a) new d(this));

        /* renamed from: e  reason: collision with root package name */
        private final h f104210e = i.a((h.f.a.a) new C2653a(this));

        static {
            Covode.recordClassIndex(66719);
        }

        public final Keva a() {
            return (Keva) this.f104209d.getValue();
        }

        public final boolean d() {
            return ((Boolean) this.f104210e.getValue()).booleanValue();
        }

        public final void b() {
            a().storeInt("enter_inbox_times", 0);
            a().storeLong("enter_inbox_limit_start", 0);
        }

        public final void c() {
            a().storeInt("expand_times", a().getInt("expand_times", 0) + 1);
        }

        /* renamed from: com.ss.android.ugc.aweme.inbox.e$a$a  reason: collision with other inner class name */
        static final class C2653a extends m implements h.f.a.a<Boolean> {
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(66720);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2653a(a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Boolean invoke() {
                boolean z;
                if (((Boolean) this.this$0.f104206a.getValue()).booleanValue() || ((Boolean) this.this$0.f104207b.getValue()).booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        static final class d extends m implements h.f.a.a<Keva> {
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(66723);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Keva invoke() {
                return Keva.getRepo(("inbox_collapse_" + com.ss.android.ugc.aweme.inbox.b.b.a() + "_") + this.this$0.f104208c);
            }
        }

        static final class b extends m implements h.f.a.a<Boolean> {
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(66721);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Boolean invoke() {
                int i2;
                boolean z = true;
                if (System.currentTimeMillis() - this.this$0.a().getLong("enter_inbox_limit_start", 0) >= ((long) t.a().f104286a.f104245b) * 86400000 && (i2 = this.this$0.a().getInt("enter_inbox_limit_times", 0)) < t.a().f104286a.f104246c) {
                    if (this.this$0.a().getInt("enter_inbox_times", 0) >= t.a().f104286a.f104244a) {
                        this.this$0.a().storeLong("enter_inbox_limit_start", System.currentTimeMillis());
                        this.this$0.a().storeInt("enter_inbox_times", 0);
                        this.this$0.a().storeInt("enter_inbox_limit_times", i2 + 1);
                    } else {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            }
        }

        static final class c extends m implements h.f.a.a<Boolean> {
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(66722);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Boolean invoke() {
                int i2;
                boolean z = true;
                if (System.currentTimeMillis() - this.this$0.a().getLong("expand_limit_start", 0) >= ((long) t.a().f104287b.f104245b) * 86400000 && (i2 = this.this$0.a().getInt("expand_limit_times", 0)) < t.a().f104287b.f104246c) {
                    if (this.this$0.a().getInt("expand_times", 0) >= t.a().f104287b.f104244a) {
                        this.this$0.a().storeLong("expand_limit_start", System.currentTimeMillis());
                        this.this$0.a().storeInt("expand_times", 0);
                        this.this$0.a().storeInt("expand_limit_times", i2 + 1);
                    } else {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            }
        }

        public a(String str) {
            l.d(str, "");
            this.f104208c = str;
        }

        public final void a(boolean z, boolean z2) {
            if (z && z2) {
                a().storeInt("enter_inbox_times", a().getInt("enter_inbox_times", 0) + 1);
            }
        }
    }

    public static void a() {
        b bVar = b.f104211a;
        l.d(bVar, "");
        if (com.ss.android.ugc.aweme.inbox.b.b.b() || com.ss.android.ugc.aweme.inbox.b.b.c()) {
            bVar.invoke(b());
        }
    }

    public static a b() {
        String str;
        String uid;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        String str2 = "";
        l.b(g2, str2);
        User curUser = g2.getCurUser();
        if (!(curUser == null || (uid = curUser.getUid()) == null)) {
            str2 = uid;
        }
        a aVar = f104205b;
        if (aVar != null) {
            str = aVar.f104208c;
        } else {
            str = null;
        }
        if (!l.a((Object) str, (Object) str2)) {
            f104205b = new a(str2);
        }
        a aVar2 = f104205b;
        if (aVar2 == null) {
            l.b();
        }
        return aVar2;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f104211a = new b();

        static {
            Covode.recordClassIndex(66724);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(a aVar) {
            final a aVar2 = aVar;
            l.d(aVar2, "");
            b.i.b(new Callable() {
                /* class com.ss.android.ugc.aweme.inbox.e.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(66725);
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    aVar2.d();
                    return z.f158842a;
                }
            }, b.i.f4824a);
            return z.f158842a;
        }
    }
}
