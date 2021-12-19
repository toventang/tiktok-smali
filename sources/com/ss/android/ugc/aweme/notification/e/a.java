package com.ss.android.ugc.aweme.notification.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import f.a.t;
import f.a.v;
import f.a.w;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.n;
import h.z;
import java.lang.ref.WeakReference;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference<Object> f113335a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile d f113336b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f113337c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static b f113338d;

    public static final class b {

        /* renamed from: c  reason: collision with root package name */
        public static final C2900a f113347c = new C2900a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public final Keva f113348a;

        /* renamed from: b  reason: collision with root package name */
        public final String f113349b;

        static {
            Covode.recordClassIndex(72878);
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.a$b$a  reason: collision with other inner class name */
        public static final class C2900a {
            static {
                Covode.recordClassIndex(72879);
            }

            private C2900a() {
            }

            public /* synthetic */ C2900a(byte b2) {
                this();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.notification.e.a$b$b  reason: collision with other inner class name */
        public static final class C2902b extends m implements h.f.a.a<z> {
            final /* synthetic */ String $key;
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(72880);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2902b(b bVar, String str) {
                super(0);
                this.this$0 = bVar;
                this.$key = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                MethodCollector.i(478);
                com.ss.android.ugc.aweme.common.f.b("NoticePerfManager", "DataStore erase " + this.$key);
                synchronized (this.this$0) {
                    try {
                        this.this$0.f113348a.storeString(this.$key, "");
                    } catch (Throwable th) {
                        MethodCollector.o(478);
                        throw th;
                    }
                }
                z zVar = z.f158842a;
                MethodCollector.o(478);
                return zVar;
            }
        }

        public final void a() {
            long d2 = com.bytedance.ies.ugc.appcontext.d.d();
            long j2 = this.f113348a.getLong("version", 0);
            if (j2 <= 0 || d2 != j2) {
                this.f113348a.clear();
                this.f113348a.storeLong("version", d2);
            }
        }

        public static final class e extends m implements h.f.a.a<z> {
            final /* synthetic */ NoticeCombineResponse $janusResp;
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(72883);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(b bVar, NoticeCombineResponse noticeCombineResponse) {
                super(0);
                this.this$0 = bVar;
                this.$janusResp = noticeCombineResponse;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX WARNING: Removed duplicated region for block: B:11:0x0035 A[Catch:{ all -> 0x0051 }] */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0041 A[Catch:{ all -> 0x0051 }] */
            @Override // h.f.a.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ h.z invoke() {
                /*
                    r6 = this;
                    r5 = 2642(0xa52, float:3.702E-42)
                    com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
                    java.lang.String r1 = "NoticePerfManager"
                    java.lang.String r0 = "DataStore store janus"
                    com.ss.android.ugc.aweme.common.f.b(r1, r0)
                    com.ss.android.ugc.aweme.notification.e.a$b r3 = r6.this$0
                    monitor-enter(r3)
                    com.ss.android.ugc.aweme.notification.e.a$b r0 = r6.this$0     // Catch:{ all -> 0x0051 }
                    r0.a()     // Catch:{ all -> 0x0051 }
                    com.ss.android.ugc.aweme.notification.e.a$c r4 = new com.ss.android.ugc.aweme.notification.e.a$c     // Catch:{ all -> 0x0051 }
                    long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0051 }
                    com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse r0 = r6.$janusResp     // Catch:{ all -> 0x0051 }
                    r4.<init>(r1, r0)     // Catch:{ all -> 0x0051 }
                    com.google.gson.f r0 = com.ss.android.ugc.aweme.utils.dg.a()     // Catch:{ all -> 0x0051 }
                    java.lang.String r2 = r0.b(r4)     // Catch:{ all -> 0x0051 }
                    if (r2 == 0) goto L_0x0032
                    int r0 = r2.length()     // Catch:{ all -> 0x0051 }
                    if (r0 != 0) goto L_0x0030
                    goto L_0x0032
                L_0x0030:
                    r0 = 0
                    goto L_0x0033
                L_0x0032:
                    r0 = 1
                L_0x0033:
                    if (r0 == 0) goto L_0x0041
                    com.ss.android.ugc.aweme.notification.e.a$b r0 = r6.this$0     // Catch:{ all -> 0x0051 }
                    com.bytedance.keva.Keva r2 = r0.f113348a     // Catch:{ all -> 0x0051 }
                    java.lang.String r1 = "janus_data"
                    java.lang.String r0 = ""
                    r2.storeString(r1, r0)     // Catch:{ all -> 0x0051 }
                    goto L_0x004a
                L_0x0041:
                    com.ss.android.ugc.aweme.notification.e.a$b r0 = r6.this$0     // Catch:{ all -> 0x0051 }
                    com.bytedance.keva.Keva r1 = r0.f113348a     // Catch:{ all -> 0x0051 }
                    java.lang.String r0 = "janus_data"
                    r1.storeString(r0, r2)     // Catch:{ all -> 0x0051 }
                L_0x004a:
                    monitor-exit(r3)
                    h.z r0 = h.z.f158842a
                    com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
                    return r0
                L_0x0051:
                    r0 = move-exception
                    monitor-exit(r3)
                    com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.e.a.b.e.invoke():java.lang.Object");
            }
        }

        public static final class f extends m implements h.f.a.a<z> {
            final /* synthetic */ NoticeListsResponse $noticeResp;
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(72884);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public f(b bVar, NoticeListsResponse noticeListsResponse) {
                super(0);
                this.this$0 = bVar;
                this.$noticeResp = noticeListsResponse;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX WARNING: Removed duplicated region for block: B:11:0x0035 A[Catch:{ all -> 0x0051 }] */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0041 A[Catch:{ all -> 0x0051 }] */
            @Override // h.f.a.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ h.z invoke() {
                /*
                    r6 = this;
                    r5 = 388(0x184, float:5.44E-43)
                    com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
                    java.lang.String r1 = "NoticePerfManager"
                    java.lang.String r0 = "DataStore store notice"
                    com.ss.android.ugc.aweme.common.f.b(r1, r0)
                    com.ss.android.ugc.aweme.notification.e.a$b r3 = r6.this$0
                    monitor-enter(r3)
                    com.ss.android.ugc.aweme.notification.e.a$b r0 = r6.this$0     // Catch:{ all -> 0x0051 }
                    r0.a()     // Catch:{ all -> 0x0051 }
                    com.ss.android.ugc.aweme.notification.e.a$e r4 = new com.ss.android.ugc.aweme.notification.e.a$e     // Catch:{ all -> 0x0051 }
                    long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0051 }
                    com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse r0 = r6.$noticeResp     // Catch:{ all -> 0x0051 }
                    r4.<init>(r1, r0)     // Catch:{ all -> 0x0051 }
                    com.google.gson.f r0 = com.ss.android.ugc.aweme.utils.dg.a()     // Catch:{ all -> 0x0051 }
                    java.lang.String r2 = r0.b(r4)     // Catch:{ all -> 0x0051 }
                    if (r2 == 0) goto L_0x0032
                    int r0 = r2.length()     // Catch:{ all -> 0x0051 }
                    if (r0 != 0) goto L_0x0030
                    goto L_0x0032
                L_0x0030:
                    r0 = 0
                    goto L_0x0033
                L_0x0032:
                    r0 = 1
                L_0x0033:
                    if (r0 == 0) goto L_0x0041
                    com.ss.android.ugc.aweme.notification.e.a$b r0 = r6.this$0     // Catch:{ all -> 0x0051 }
                    com.bytedance.keva.Keva r2 = r0.f113348a     // Catch:{ all -> 0x0051 }
                    java.lang.String r1 = "notice_data"
                    java.lang.String r0 = ""
                    r2.storeString(r1, r0)     // Catch:{ all -> 0x0051 }
                    goto L_0x004a
                L_0x0041:
                    com.ss.android.ugc.aweme.notification.e.a$b r0 = r6.this$0     // Catch:{ all -> 0x0051 }
                    com.bytedance.keva.Keva r1 = r0.f113348a     // Catch:{ all -> 0x0051 }
                    java.lang.String r0 = "notice_data"
                    r1.storeString(r0, r2)     // Catch:{ all -> 0x0051 }
                L_0x004a:
                    monitor-exit(r3)
                    h.z r0 = h.z.f158842a
                    com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
                    return r0
                L_0x0051:
                    r0 = move-exception
                    monitor-exit(r3)
                    com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.e.a.b.f.invoke():java.lang.Object");
            }
        }

        static final class d extends m implements h.f.a.a<z> {
            final /* synthetic */ v $emitter;
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(72882);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(b bVar, v vVar) {
                super(0);
                this.this$0 = bVar;
                this.$emitter = vVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[Catch:{ all -> 0x0095 }] */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x002b A[Catch:{ all -> 0x0095 }] */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x004c A[Catch:{ all -> 0x0095 }] */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x006a A[Catch:{ all -> 0x0095 }] */
            @Override // h.f.a.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ h.z invoke() {
                /*
                // Method dump skipped, instructions count: 167
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.e.a.b.d.invoke():java.lang.Object");
            }
        }

        /* access modifiers changed from: package-private */
        public static final class c<T> implements w {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f113357a;

            static {
                Covode.recordClassIndex(72881);
            }

            c(b bVar) {
                this.f113357a = bVar;
            }

            @Override // f.a.w
            public final void subscribe(v<C2898a> vVar) {
                l.d(vVar, "");
                d.b(new d(this.f113357a, vVar));
            }
        }

        public final b.i<z> a(String str) {
            l.d(str, "");
            return d.b(new C2902b(this, str));
        }

        public b(String str) {
            l.d(str, "");
            this.f113349b = str;
            this.f113348a = Keva.getRepo("notice_cache_" + str);
        }
    }

    public enum g {
        BOOT,
        BOOT_LAZY,
        POST_UNREAD,
        TAB_CLICK;

        static {
            Covode.recordClassIndex(72895);
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public static final C2904a f113371a = new C2904a((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final f f113372b = new f();

        /* renamed from: c  reason: collision with root package name */
        private static final h.h f113373c = h.i.a((h.f.a.a) b.f113385a);

        public static C2904a a() {
            return (C2904a) f113373c.getValue();
        }

        private f() {
        }

        static final class b extends m implements h.f.a.a<C2904a> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f113385a = new b();

            static {
                Covode.recordClassIndex(72894);
            }

            b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ C2904a invoke() {
                Object a2 = com.bytedance.ies.abmock.b.a().a(true, "opt_notification_perf", C2904a.class, f.f113371a);
                if (a2 == null) {
                    return f.f113371a;
                }
                return a2;
            }
        }

        static {
            Covode.recordClassIndex(72892);
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.a$f$a  reason: collision with other inner class name */
        public static final class C2904a {
            @com.google.gson.a.c(a = "stable_id")

            /* renamed from: a  reason: collision with root package name */
            public final boolean f113374a;
            @com.google.gson.a.c(a = "load_more_preload")

            /* renamed from: b  reason: collision with root package name */
            public final boolean f113375b;
            @com.google.gson.a.c(a = "click_preload")

            /* renamed from: c  reason: collision with root package name */
            public final boolean f113376c;
            @com.google.gson.a.c(a = "boot_cache_preload")

            /* renamed from: d  reason: collision with root package name */
            public final boolean f113377d;
            @com.google.gson.a.c(a = "boot_lazy_preload")

            /* renamed from: e  reason: collision with root package name */
            public final boolean f113378e;
            @com.google.gson.a.c(a = "unread_post_preload")

            /* renamed from: f  reason: collision with root package name */
            public final boolean f113379f;
            @com.google.gson.a.c(a = "boot_lazy_preload_delay")

            /* renamed from: g  reason: collision with root package name */
            public final long f113380g;
            @com.google.gson.a.c(a = "preload_req_duration")

            /* renamed from: h  reason: collision with root package name */
            public final long f113381h;
            @com.google.gson.a.c(a = "refresh_again_duration")

            /* renamed from: i  reason: collision with root package name */
            public final long f113382i;
            @com.google.gson.a.c(a = "live_abandon_duration")

            /* renamed from: j  reason: collision with root package name */
            public final long f113383j;
            @com.google.gson.a.c(a = "notice_abandon_duration")

            /* renamed from: k  reason: collision with root package name */
            public final long f113384k;

            static {
                Covode.recordClassIndex(72893);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2904a)) {
                    return false;
                }
                C2904a aVar = (C2904a) obj;
                return this.f113374a == aVar.f113374a && this.f113375b == aVar.f113375b && this.f113376c == aVar.f113376c && this.f113377d == aVar.f113377d && this.f113378e == aVar.f113378e && this.f113379f == aVar.f113379f && this.f113380g == aVar.f113380g && this.f113381h == aVar.f113381h && this.f113382i == aVar.f113382i && this.f113383j == aVar.f113383j && this.f113384k == aVar.f113384k;
            }

            public final String toString() {
                return "MetaData(enableStableId=" + this.f113374a + ", enableLoadMorePreload=" + this.f113375b + ", enableClickPreload=" + this.f113376c + ", enableBootPreload=" + this.f113377d + ", enableBootLazyPreload=" + this.f113378e + ", enableUnreadPostPreload=" + this.f113379f + ", bootLazyPreloadDelayMs=" + this.f113380g + ", preloadReqDurationMs=" + this.f113381h + ", refreshAgainDurationMs=" + this.f113382i + ", liveAbandonDurationMs=" + this.f113383j + ", noticeAbandonDurationMs=" + this.f113384k + ")";
            }

            private C2904a() {
                this.f113374a = true;
                this.f113375b = false;
                this.f113376c = false;
                this.f113377d = false;
                this.f113378e = false;
                this.f113379f = false;
                this.f113380g = 0;
                this.f113381h = 120000;
                this.f113382i = 15000;
                this.f113383j = 120000;
                this.f113384k = 43200000;
            }

            public final int hashCode() {
                boolean z = this.f113374a;
                int i2 = 1;
                if (z) {
                    z = true;
                }
                int i3 = z ? 1 : 0;
                int i4 = z ? 1 : 0;
                int i5 = z ? 1 : 0;
                int i6 = i3 * 31;
                boolean z2 = this.f113375b;
                if (z2) {
                    z2 = true;
                }
                int i7 = z2 ? 1 : 0;
                int i8 = z2 ? 1 : 0;
                int i9 = z2 ? 1 : 0;
                int i10 = (i6 + i7) * 31;
                boolean z3 = this.f113376c;
                if (z3) {
                    z3 = true;
                }
                int i11 = z3 ? 1 : 0;
                int i12 = z3 ? 1 : 0;
                int i13 = z3 ? 1 : 0;
                int i14 = (i10 + i11) * 31;
                boolean z4 = this.f113377d;
                if (z4) {
                    z4 = true;
                }
                int i15 = z4 ? 1 : 0;
                int i16 = z4 ? 1 : 0;
                int i17 = z4 ? 1 : 0;
                int i18 = (i14 + i15) * 31;
                boolean z5 = this.f113378e;
                if (z5) {
                    z5 = true;
                }
                int i19 = z5 ? 1 : 0;
                int i20 = z5 ? 1 : 0;
                int i21 = z5 ? 1 : 0;
                int i22 = (i18 + i19) * 31;
                if (!this.f113379f) {
                    i2 = 0;
                }
                long j2 = this.f113380g;
                long j3 = this.f113381h;
                long j4 = this.f113382i;
                long j5 = this.f113383j;
                long j6 = this.f113384k;
                return ((((((((((i22 + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)));
            }

            public /* synthetic */ C2904a(byte b2) {
                this();
            }
        }
    }

    private a() {
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public int f113360a;

        /* renamed from: b  reason: collision with root package name */
        public volatile com.ss.android.ugc.aweme.notification.vm.e f113361b = new com.ss.android.ugc.aweme.notification.vm.e();

        /* renamed from: c  reason: collision with root package name */
        public volatile boolean f113362c;

        /* renamed from: d  reason: collision with root package name */
        public final String f113363d;

        /* renamed from: e  reason: collision with root package name */
        public final b f113364e;

        /* renamed from: f  reason: collision with root package name */
        private final h.h f113365f = h.i.a((h.f.a.a) C2903a.f113366a);

        static {
            Covode.recordClassIndex(72886);
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.a$d$a  reason: collision with other inner class name */
        static final class C2903a extends m implements h.f.a.a<f.a.b.a> {

            /* renamed from: a  reason: collision with root package name */
            public static final C2903a f113366a = new C2903a();

            static {
                Covode.recordClassIndex(72887);
            }

            C2903a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ f.a.b.a invoke() {
                return new f.a.b.a();
            }
        }

        /* access modifiers changed from: package-private */
        public static final class b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f113367a;

            static {
                Covode.recordClassIndex(72888);
            }

            b(d dVar) {
                this.f113367a = dVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                final C2898a aVar = (C2898a) obj;
                d.a(new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.notification.e.a.d.b.AnonymousClass1 */
                    final /* synthetic */ b this$0;

                    static {
                        Covode.recordClassIndex(72889);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
                    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
                    @Override // h.f.a.a
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ h.z invoke() {
                        /*
                        // Method dump skipped, instructions count: 382
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.e.a.d.b.AnonymousClass1.invoke():java.lang.Object");
                    }
                });
            }
        }

        /* access modifiers changed from: package-private */
        public static final class c<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final c f113368a = new c();

            static {
                Covode.recordClassIndex(72890);
            }

            c() {
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                com.ss.android.ugc.aweme.common.f.a("NoticePerfManager", "ModelHolder preloadByCache error", (Throwable) obj);
            }
        }

        public final boolean a(g gVar) {
            l.d(gVar, "");
            int i2 = b.f113393a[gVar.ordinal()];
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3 && i2 != 4) {
                    throw new n();
                } else if (this.f113362c) {
                    com.ss.android.ugc.aweme.common.f.b("NoticePerfManager", "ModelHolder preloadByRefresh but drained, reason:".concat(String.valueOf(gVar)));
                    return false;
                } else {
                    com.ss.android.ugc.aweme.common.f.b("NoticePerfManager", "ModelHolder preloadByRefresh, reason:".concat(String.valueOf(gVar)));
                    return this.f113361b.a(gVar);
                }
            } else if (this.f113362c || !this.f113361b.n()) {
                com.ss.android.ugc.aweme.common.f.b("NoticePerfManager", "ModelHolder preloadByCache not needed: " + this.f113362c);
                return false;
            } else {
                b bVar = this.f113364e;
                if (bVar == null) {
                    return false;
                }
                com.ss.android.ugc.aweme.common.f.b("NoticePerfManager", "ModelHolder preloadByCache start");
                t a2 = t.a(new b.c(bVar));
                l.b(a2, "");
                f.a.b.b a3 = a2.b(f.a.h.a.b(f.a.k.a.f158006c)).a(new b(this), c.f113368a);
                l.b(a3, "");
                f.a.j.a.a(a3, (f.a.b.a) this.f113365f.getValue());
                return true;
            }
        }

        public d(String str, b bVar) {
            l.d(str, "");
            this.f113363d = str;
            this.f113364e = bVar;
        }
    }

    public static b.i<z> c() {
        return d.a(i.f113389a);
    }

    public static final class h extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f113387a = new h();

        static {
            Covode.recordClassIndex(72896);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a.a(g.BOOT, AnonymousClass1.f113388a);
            return z.f158842a;
        }
    }

    static final class i extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f113389a = new i();

        static {
            Covode.recordClassIndex(72898);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a.a(g.BOOT_LAZY, AnonymousClass1.f113390a);
            return z.f158842a;
        }
    }

    public static final class j extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f113391a = new j();

        static {
            Covode.recordClassIndex(72900);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a.a(g.TAB_CLICK, AnonymousClass1.f113392a);
            return z.f158842a;
        }
    }

    public static final class k extends m implements h.f.a.a<z> {
        final /* synthetic */ int $unread;

        static {
            Covode.recordClassIndex(72902);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(int i2) {
            super(0);
            this.$unread = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a.a(g.POST_UNREAD, new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.notification.e.a.k.AnonymousClass1 */
                final /* synthetic */ k this$0;

                static {
                    Covode.recordClassIndex(72903);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    d a2 = a.f113337c.a(true);
                    if (!(a2 == null || a2.f113360a == this.this$0.$unread)) {
                        a2.f113360a = this.this$0.$unread;
                        a2.a(g.POST_UNREAD);
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(72876);
    }

    public static f.C2904a a() {
        f.C2904a a2 = f.a();
        l.b(a2, "");
        return a2;
    }

    public static final class c {
        @com.google.gson.a.c(a = "ts")

        /* renamed from: a  reason: collision with root package name */
        public final long f113358a;
        @com.google.gson.a.c(a = "resp")

        /* renamed from: b  reason: collision with root package name */
        public final NoticeCombineResponse f113359b;

        static {
            Covode.recordClassIndex(72885);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f113358a == cVar.f113358a && l.a(this.f113359b, cVar.f113359b);
        }

        public final String toString() {
            return "JanusData(timestamp=" + this.f113358a + ", resp=" + this.f113359b + ")";
        }

        public final int hashCode() {
            int i2;
            long j2 = this.f113358a;
            int i3 = ((int) (j2 ^ (j2 >>> 32))) * 31;
            NoticeCombineResponse noticeCombineResponse = this.f113359b;
            if (noticeCombineResponse != null) {
                i2 = noticeCombineResponse.hashCode();
            } else {
                i2 = 0;
            }
            return i3 + i2;
        }

        public c(long j2, NoticeCombineResponse noticeCombineResponse) {
            l.d(noticeCombineResponse, "");
            this.f113358a = j2;
            this.f113359b = noticeCombineResponse;
        }
    }

    public static final class e {
        @com.google.gson.a.c(a = "ts")

        /* renamed from: a  reason: collision with root package name */
        public final long f113369a;
        @com.google.gson.a.c(a = "resp")

        /* renamed from: b  reason: collision with root package name */
        public final NoticeListsResponse f113370b;

        static {
            Covode.recordClassIndex(72891);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f113369a == eVar.f113369a && l.a(this.f113370b, eVar.f113370b);
        }

        public final String toString() {
            return "NoticeData(timestamp=" + this.f113369a + ", resp=" + this.f113370b + ")";
        }

        public final int hashCode() {
            int i2;
            long j2 = this.f113369a;
            int i3 = ((int) (j2 ^ (j2 >>> 32))) * 31;
            NoticeListsResponse noticeListsResponse = this.f113370b;
            if (noticeListsResponse != null) {
                i2 = noticeListsResponse.hashCode();
            } else {
                i2 = 0;
            }
            return i3 + i2;
        }

        public e(long j2, NoticeListsResponse noticeListsResponse) {
            l.d(noticeListsResponse, "");
            this.f113369a = j2;
            this.f113370b = noticeListsResponse;
        }
    }

    public static b b() {
        MethodCollector.i(331);
        synchronized (b.class) {
            try {
                String str = null;
                if (!a().f113377d) {
                    return null;
                }
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                String curUserId = g2.getCurUserId();
                l.b(curUserId, "");
                Long g3 = p.g(curUserId);
                if (g3 == null || g3.longValue() <= 0) {
                    f113338d = null;
                } else {
                    b bVar = f113338d;
                    if (bVar != null) {
                        str = bVar.f113349b;
                    }
                    if (!l.a((Object) curUserId, (Object) str)) {
                        f113338d = new b(curUserId);
                    }
                }
                b bVar2 = f113338d;
                MethodCollector.o(331);
                return bVar2;
            } finally {
                MethodCollector.o(331);
            }
        }
    }

    public final synchronized d a(boolean z) {
        long j2;
        d dVar;
        String str;
        MethodCollector.i(527);
        synchronized (d.class) {
            try {
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                String curUserId = g2.getCurUserId();
                l.b(curUserId, "");
                Long g3 = p.g(curUserId);
                if (g3 != null) {
                    j2 = g3.longValue();
                } else {
                    j2 = 0;
                }
                d dVar2 = null;
                if (j2 > 0) {
                    d dVar3 = f113336b;
                    if (dVar3 != null) {
                        str = dVar3.f113363d;
                    } else {
                        str = null;
                    }
                    if (!l.a((Object) curUserId, (Object) str)) {
                        if (z) {
                            dVar2 = new d(curUserId, b());
                        }
                    }
                    dVar = f113336b;
                }
                f113336b = dVar2;
                dVar = f113336b;
            } finally {
                MethodCollector.o(527);
            }
        }
        return dVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.e.a$a  reason: collision with other inner class name */
    public static final class C2898a {

        /* renamed from: a  reason: collision with root package name */
        public final c f113339a;

        /* renamed from: b  reason: collision with root package name */
        public final e f113340b;

        static {
            Covode.recordClassIndex(72877);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2898a)) {
                return false;
            }
            C2898a aVar = (C2898a) obj;
            return l.a(this.f113339a, aVar.f113339a) && l.a(this.f113340b, aVar.f113340b);
        }

        public final int hashCode() {
            c cVar = this.f113339a;
            int i2 = 0;
            int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
            e eVar = this.f113340b;
            if (eVar != null) {
                i2 = eVar.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "DataCache(janusData=" + this.f113339a + ", noticeData=" + this.f113340b + ")";
        }

        public C2898a(c cVar, e eVar) {
            this.f113339a = cVar;
            this.f113340b = eVar;
        }
    }

    public static void a(g gVar, h.f.a.a<z> aVar) {
        if (com.ss.android.ugc.aweme.inbox.b.b.a() == 0 && com.ss.android.ugc.aweme.notice.api.ab.a.b()) {
            l.d(gVar, "");
            if ((f.a().f113376c && gVar == g.TAB_CLICK) || ((f.a().f113377d && gVar == g.BOOT) || ((f.a().f113378e && gVar == g.BOOT_LAZY) || (f.a().f113379f && gVar == g.POST_UNREAD)))) {
                WeakReference<Object> weakReference = f113335a;
                if (weakReference == null || weakReference.get() == null) {
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    l.b(g2, "");
                    if (g2.isLogin() && !com.ss.android.ugc.aweme.notification.utils.l.a()) {
                        aVar.invoke();
                    }
                }
            }
        }
    }
}
