package com.ss.android.ugc.aweme.filter.d.a;

import android.app.Application;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.c.a.q;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.filter.repository.a.j;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterBoxApi;
import com.ss.android.ugc.aweme.filter.repository.internal.main.AndroidResourceFilterBackupPreferences;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.in.au;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.tools.utils.n;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import h.v;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class c implements com.ss.android.ugc.aweme.filter.d.a {

    /* renamed from: a  reason: collision with root package name */
    final h f95501a = i.a((h.f.a.a) new e(this));

    /* renamed from: b  reason: collision with root package name */
    private final h f95502b = i.a((h.f.a.a) b.f95517a);

    /* renamed from: c  reason: collision with root package name */
    private final h f95503c = i.a((h.f.a.a) new C2301c(this));

    /* renamed from: d  reason: collision with root package name */
    private final h f95504d = i.a((h.f.a.a) new d(this));

    /* renamed from: e  reason: collision with root package name */
    private final h f95505e = i.a((h.f.a.a) new a(this));

    /* renamed from: f  reason: collision with root package name */
    private final q<String> f95506f = f.f95526a;

    /* renamed from: g  reason: collision with root package name */
    private com.ss.android.ugc.aweme.effectplatform.f f95507g;

    static {
        Covode.recordClassIndex(60506);
    }

    @Override // com.ss.android.ugc.aweme.filter.d.a
    public final com.ss.android.ugc.aweme.filter.d.b b() {
        return (com.ss.android.ugc.aweme.filter.d.b) this.f95502b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.filter.d.a
    public com.ss.android.ugc.aweme.filter.d.c c() {
        return (com.ss.android.ugc.aweme.filter.d.c) this.f95503c.getValue();
    }

    @Override // com.ss.android.ugc.aweme.filter.d.a
    public final o d() {
        return (o) this.f95504d.getValue();
    }

    @Override // com.ss.android.ugc.aweme.filter.d.a
    public final j f() {
        return (j) this.f95505e.getValue();
    }

    @Override // com.ss.android.ugc.aweme.filter.d.a
    public final void a() {
        n.a();
    }

    @Override // com.ss.android.ugc.aweme.filter.d.a
    public q<String> h() {
        return this.f95506f;
    }

    static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.filter.repository.internal.filterbox.c> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(60507);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        static final class b<T> implements q {

            /* renamed from: a  reason: collision with root package name */
            public static final b f95510a = new b();

            static {
                Covode.recordClassIndex(60510);
            }

            b() {
            }

            @Override // com.google.c.a.q
            public final /* synthetic */ Object b() {
                return AppLog.getServerDeviceId();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$a$c  reason: collision with other inner class name */
        static final class C2300c<T> implements q {

            /* renamed from: a  reason: collision with root package name */
            public static final C2300c f95511a = new C2300c();

            static {
                Covode.recordClassIndex(60511);
            }

            C2300c() {
            }

            @Override // com.google.c.a.q
            public final /* synthetic */ Object b() {
                return EffectPlatform.a();
            }
        }

        static final class g<T> implements q {

            /* renamed from: a  reason: collision with root package name */
            public static final g f95515a = new g();

            static {
                Covode.recordClassIndex(60515);
            }

            g() {
            }

            @Override // com.google.c.a.q
            public final /* bridge */ /* synthetic */ Object b() {
                return EffectPlatform.b();
            }
        }

        static final class d<T> implements q {

            /* renamed from: a  reason: collision with root package name */
            public static final d f95512a = new d();

            static {
                Covode.recordClassIndex(60512);
            }

            d() {
            }

            @Override // com.google.c.a.q
            public final /* synthetic */ Object b() {
                return com.ss.android.ugc.aweme.port.in.g.a().y().a();
            }
        }

        static final class e<T> implements q {

            /* renamed from: a  reason: collision with root package name */
            public static final e f95513a = new e();

            static {
                Covode.recordClassIndex(60513);
            }

            e() {
            }

            @Override // com.google.c.a.q
            public final /* synthetic */ Object b() {
                return com.ss.android.ugc.aweme.port.in.g.a().w().i();
            }
        }

        static final class f<T> implements q {

            /* renamed from: a  reason: collision with root package name */
            public static final f f95514a = new f();

            static {
                Covode.recordClassIndex(60514);
            }

            f() {
            }

            @Override // com.google.c.a.q
            public final /* synthetic */ Object b() {
                return com.ss.android.ugc.aweme.port.in.g.a().f().b();
            }
        }

        static final class h<T> implements q {

            /* renamed from: a  reason: collision with root package name */
            public static final h f95516a = new h();

            static {
                Covode.recordClassIndex(60516);
            }

            h() {
            }

            @Override // com.google.c.a.q
            public final /* synthetic */ Object b() {
                return com.ss.android.ugc.aweme.port.in.g.a().f().a();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.filter.repository.internal.filterbox.c invoke() {
            return new com.ss.android.ugc.aweme.filter.repository.internal.filterbox.c(this.this$0.d(), C2299a.f95509a, new q(this) {
                /* class com.ss.android.ugc.aweme.filter.d.a.c.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f95508a;

                static {
                    Covode.recordClassIndex(60508);
                }

                {
                    this.f95508a = r1;
                }

                @Override // com.google.c.a.q
                public final /* synthetic */ Object b() {
                    return this.f95508a.this$0.e();
                }
            }, new com.ss.android.ugc.aweme.filter.repository.internal.filterbox.d(b.f95510a, C2300c.f95511a, d.f95512a, e.f95513a, this.this$0.h(), f.f95514a, g.f95515a, h.f95516a));
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$a$a  reason: collision with other inner class name */
        static final class C2299a<T> implements q {

            /* renamed from: a  reason: collision with root package name */
            public static final C2299a f95509a = new C2299a();

            static {
                Covode.recordClassIndex(60509);
            }

            C2299a() {
            }

            @Override // com.google.c.a.q
            public final /* synthetic */ Object b() {
                String itemName = EffectPlatformFactory.a().getHosts().get(0).getItemName();
                au C = com.ss.android.ugc.aweme.port.in.g.a().C();
                l.b(itemName, "");
                if (!p.a((CharSequence) itemName, '/')) {
                    itemName = itemName + '/';
                }
                l.b(itemName, "");
                return C.retrofitCreate(itemName, FilterBoxApi.class);
            }
        }
    }

    static final class e extends m implements h.f.a.a<com.ss.android.ugc.aweme.filter.repository.internal.main.h> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(60520);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$e$c  reason: collision with other inner class name */
        static final class C2303c<T> implements q {

            /* renamed from: a  reason: collision with root package name */
            public static final C2303c f95522a = new C2303c();

            static {
                Covode.recordClassIndex(60525);
            }

            C2303c() {
            }

            @Override // com.google.c.a.q
            public final /* synthetic */ Object b() {
                return new com.ss.android.ugc.aweme.filter.e();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$e$e  reason: collision with other inner class name */
        static final class C2304e<T> implements q {

            /* renamed from: a  reason: collision with root package name */
            public static final C2304e f95525a = new C2304e();

            static {
                Covode.recordClassIndex(60528);
            }

            C2304e() {
            }

            @Override // com.google.c.a.q
            public final /* synthetic */ Object b() {
                return new f();
            }
        }

        public static final class d implements q<com.ss.android.ugc.tools.h.a.l> {

            /* renamed from: a  reason: collision with root package name */
            private final h f95523a = i.a((h.f.a.a) a.f95524a);

            static {
                Covode.recordClassIndex(60526);
            }

            static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.tools.a.a> {

                /* renamed from: a  reason: collision with root package name */
                public static final a f95524a = new a();

                static {
                    Covode.recordClassIndex(60527);
                }

                a() {
                    super(0);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ com.ss.android.ugc.aweme.tools.a.a invoke() {
                    Application application = com.ss.android.ugc.aweme.port.in.i.f115645a;
                    l.b(application, "");
                    return new com.ss.android.ugc.aweme.tools.a.a(application);
                }
            }

            d() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.c.a.q
            public final /* synthetic */ com.ss.android.ugc.tools.h.a.l b() {
                return (com.ss.android.ugc.aweme.tools.a.a) this.f95523a.getValue();
            }
        }

        static final class b<T> implements q {

            /* renamed from: a  reason: collision with root package name */
            public static final b f95521a = new b();

            static {
                Covode.recordClassIndex(60524);
            }

            b() {
            }

            @Override // com.google.c.a.q
            public final /* synthetic */ Object b() {
                String absolutePath = new File(com.ss.android.ugc.tools.utils.i.b(com.ss.android.ugc.aweme.port.in.i.f115645a), "filters").getAbsolutePath();
                l.b(absolutePath, "");
                return new a(new com.ss.android.ugc.aweme.filter.repository.internal.main.d(absolutePath));
            }
        }

        static final class a<T> implements q {

            /* renamed from: a  reason: collision with root package name */
            public static final a f95519a = new a();

            static {
                Covode.recordClassIndex(60522);
            }

            a() {
            }

            @Override // com.google.c.a.q
            public final /* synthetic */ Object b() {
                String str = dj.p;
                int h2 = g.a().w().h();
                IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                l.b(createIAVServiceProxybyMonsterPlugin, "");
                createIAVServiceProxybyMonsterPlugin.getShortVideoPluginService();
                List a2 = h.a.n.a(v.a(new int[]{R.raw.filters}, di.f126461d));
                C2302a aVar = C2302a.f95520a;
                com.bytedance.cukaie.closet.a aVar2 = new com.bytedance.cukaie.closet.a();
                Application application = com.ss.android.ugc.aweme.port.in.i.f115645a;
                l.b(application, "");
                AndroidResourceFilterBackupPreferences androidResourceFilterBackupPreferences = (AndroidResourceFilterBackupPreferences) aVar2.a(application, AndroidResourceFilterBackupPreferences.class);
                if (com.ss.android.ugc.aweme.filter.b.b.a()) {
                    Application application2 = com.ss.android.ugc.aweme.port.in.i.f115645a;
                    l.b(application2, "");
                    l.b(str, "");
                    return new b(application2, str, h2, a2, aVar, androidResourceFilterBackupPreferences);
                }
                Application application3 = com.ss.android.ugc.aweme.port.in.i.f115645a;
                l.b(application3, "");
                l.b(str, "");
                return new com.ss.android.ugc.aweme.filter.repository.internal.main.a(application3, str, h2, a2, aVar, androidResourceFilterBackupPreferences);
            }

            /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$e$a$a  reason: collision with other inner class name */
            static final class C2302a<T> implements q {

                /* renamed from: a  reason: collision with root package name */
                public static final C2302a f95520a = new C2302a();

                static {
                    Covode.recordClassIndex(60523);
                }

                C2302a() {
                }

                /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: java.util.ArrayList */
                /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: java.util.ArrayList */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.c.a.q
                public final /* synthetic */ Object b() {
                    Application application = com.ss.android.ugc.aweme.port.in.i.f115645a;
                    l.b(application, "");
                    Resources resources = application.getResources();
                    String[] stringArray = resources.getStringArray(R.array.an);
                    l.b(stringArray, "");
                    String[] stringArray2 = resources.getStringArray(R.array.am);
                    l.b(stringArray2, "");
                    TypedArray obtainTypedArray = resources.obtainTypedArray(R.array.ao);
                    l.b(obtainTypedArray, "");
                    ArrayList arrayList = new ArrayList(stringArray.length);
                    int length = stringArray.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        arrayList.add(Integer.valueOf(obtainTypedArray.getResourceId(i3, 0)));
                        i2++;
                        i3++;
                    }
                    Object[] array = arrayList.toArray(new Integer[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    Integer[] numArr = (Integer[]) array;
                    obtainTypedArray.recycle();
                    ArrayList arrayList2 = new ArrayList(stringArray.length);
                    int length2 = stringArray.length;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < length2) {
                        int i6 = i5 + 1;
                        String a2 = com.a.a("Filter_%02d/", Arrays.copyOf(new Object[]{Integer.valueOf(i5)}, 1));
                        l.b(a2, "");
                        arrayList2.add(a2);
                        i4++;
                        i5 = i6;
                    }
                    Object[] array2 = arrayList2.toArray(new String[0]);
                    Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                    return new com.ss.android.ugc.aweme.filter.repository.internal.main.b(stringArray, stringArray2, numArr, (String[]) array2);
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.filter.repository.internal.main.h invoke() {
            a aVar = a.f95519a;
            d dVar = new d();
            C2303c cVar = C2303c.f95522a;
            C2304e eVar = C2304e.f95525a;
            b bVar = b.f95521a;
            Application application = com.ss.android.ugc.aweme.port.in.i.f115645a;
            l.b(application, "");
            com.ss.android.ugc.aweme.filter.repository.internal.main.h hVar = new com.ss.android.ugc.aweme.filter.repository.internal.main.h(application, new q(this) {
                /* class com.ss.android.ugc.aweme.filter.d.a.c.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f95518a;

                static {
                    Covode.recordClassIndex(60521);
                }

                {
                    this.f95518a = r1;
                }

                @Override // com.google.c.a.q
                public final /* synthetic */ Object b() {
                    return this.f95518a.this$0.e();
                }
            }, this.this$0.h());
            l.d(aVar, "");
            hVar.f95689b = aVar;
            l.d(dVar, "");
            hVar.f95690c = dVar;
            l.d(cVar, "");
            hVar.f95691d = cVar;
            l.d(eVar, "");
            hVar.f95692e = eVar;
            if (com.ss.android.ugc.aweme.filter.b.b.a()) {
                l.d(bVar, "");
                hVar.f95688a = bVar;
            }
            return hVar;
        }
    }

    static final class b extends m implements h.f.a.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f95517a = new b();

        static {
            Covode.recordClassIndex(60517);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return new d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$c  reason: collision with other inner class name */
    static final class C2301c extends m implements h.f.a.a<e> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(60518);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2301c(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            return new e(this.this$0.d());
        }
    }

    static final class d extends m implements h.f.a.a<o> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(60519);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ o invoke() {
            return ((com.ss.android.ugc.aweme.filter.repository.a.p) this.this$0.f95501a.getValue()).a();
        }
    }

    static final class f<T> implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final f f95526a = new f();

        static {
            Covode.recordClassIndex(60529);
        }

        f() {
        }

        @Override // com.google.c.a.q
        public final /* synthetic */ Object b() {
            if (com.ss.android.ugc.aweme.filter.b.b.a()) {
                if (com.ss.android.ugc.aweme.filter.b.a.a()) {
                    return "filtercomposerexperiment";
                }
                return "filtercomposer";
            } else if (com.ss.android.ugc.aweme.filter.b.a.a()) {
                return "colorfilterexperiment";
            } else {
                return "colorfilternew";
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.d.a
    public final com.ss.android.ugc.aweme.effectplatform.f e() {
        com.ss.android.ugc.aweme.effectplatform.f fVar;
        MethodCollector.i(3486);
        synchronized (this) {
            try {
                fVar = this.f95507g;
                if (fVar == null) {
                    Application application = com.ss.android.ugc.aweme.port.in.i.f115645a;
                    l.b(application, "");
                    fVar = com.ss.android.ugc.aweme.effectplatform.c.a(application, null);
                }
                this.f95507g = fVar;
            } finally {
                MethodCollector.o(3486);
            }
        }
        return fVar;
    }

    @Override // com.ss.android.ugc.aweme.filter.d.a
    public final void g() {
        com.ss.android.ugc.aweme.effectplatform.f fVar;
        MethodCollector.i(3487);
        synchronized (this) {
            try {
                fVar = this.f95507g;
                this.f95507g = null;
            } catch (Throwable th) {
                MethodCollector.o(3487);
                throw th;
            }
        }
        if (fVar != null) {
            fVar.a(h().b());
            MethodCollector.o(3487);
            return;
        }
        MethodCollector.o(3487);
    }
}
