package com.ss.android.ugc.aweme.authorize.viewmodel;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.b.b.a;
import com.bytedance.sdk.a.c.a.c;
import com.ss.android.ugc.aweme.authorize.AwemeAuthorizePlatformDepend;
import com.ss.android.ugc.aweme.openauthorize.a.h;
import com.ss.android.ugc.aweme.openauthorize.a.j;
import h.f.b.l;
import java.util.Comparator;
import java.util.List;

public final class AuthCommonViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public final t<com.bytedance.sdk.a.b.d.d> f67209a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    public final t<com.ss.android.ugc.aweme.openauthorize.a.d> f67210b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public final t<List<com.ss.android.ugc.aweme.openauthorize.a.g>> f67211c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    public final t<com.bytedance.sdk.a.b.d.b> f67212d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    public final t<j> f67213e = new t<>();

    /* renamed from: f  reason: collision with root package name */
    public final t<j> f67214f = new t<>();

    /* renamed from: g  reason: collision with root package name */
    public final t<com.ss.android.ugc.aweme.openauthorize.a.a> f67215g = new t<>();

    /* renamed from: h  reason: collision with root package name */
    public final t<h> f67216h = new t<>();

    /* renamed from: i  reason: collision with root package name */
    public final a.AbstractC1045a f67217i;

    /* renamed from: j  reason: collision with root package name */
    public final c.a f67218j;

    /* renamed from: k  reason: collision with root package name */
    private final AwemeAuthorizePlatformDepend f67219k;

    static {
        Covode.recordClassIndex(41398);
    }

    public final void a() {
        this.f67219k.a(new e(this));
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AuthCommonViewModel f67222a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c.a f67223b;

        static {
            Covode.recordClassIndex(41401);
        }

        c(AuthCommonViewModel authCommonViewModel, c.a aVar) {
            this.f67222a = authCommonViewModel;
            this.f67223b = aVar;
        }

        public final void run() {
            this.f67222a.f67212d.postValue(this.f67222a.f67217i.a(this.f67223b, "", ""));
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AuthCommonViewModel f67227a;

        static {
            Covode.recordClassIndex(41404);
        }

        e(AuthCommonViewModel authCommonViewModel) {
            this.f67227a = authCommonViewModel;
        }

        public final void run() {
            this.f67227a.f67209a.postValue(this.f67227a.f67217i.a(this.f67227a.f67218j, "", "", ""));
        }
    }

    public static final class a implements com.ss.android.ugc.aweme.openauthorize.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AuthCommonViewModel f67220a;

        static {
            Covode.recordClassIndex(41399);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a(AuthCommonViewModel authCommonViewModel) {
            this.f67220a = authCommonViewModel;
        }

        @Override // com.ss.android.ugc.aweme.openauthorize.e
        public final void a(h hVar) {
            l.d(hVar, "");
            this.f67220a.f67216h.postValue(hVar);
        }
    }

    public static final class b implements com.ss.android.ugc.aweme.openauthorize.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AuthCommonViewModel f67221a;

        static {
            Covode.recordClassIndex(41400);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b(AuthCommonViewModel authCommonViewModel) {
            this.f67221a = authCommonViewModel;
        }

        @Override // com.ss.android.ugc.aweme.openauthorize.f
        public final void a(j jVar) {
            l.d(jVar, "");
            this.f67221a.f67213e.postValue(jVar);
        }
    }

    public static final class f implements com.ss.android.ugc.aweme.openauthorize.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AuthCommonViewModel f67228a;

        static {
            Covode.recordClassIndex(41405);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public f(AuthCommonViewModel authCommonViewModel) {
            this.f67228a = authCommonViewModel;
        }

        @Override // com.ss.android.ugc.aweme.openauthorize.g
        public final void a(j jVar) {
            l.d(jVar, "");
            this.f67228a.f67214f.postValue(jVar);
        }
    }

    public static final class d implements com.ss.android.ugc.aweme.openauthorize.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AuthCommonViewModel f67224a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f67225b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f67226c;

        static {
            Covode.recordClassIndex(41402);
        }

        @Override // com.ss.android.ugc.aweme.openauthorize.d
        public final void b(com.ss.android.ugc.aweme.openauthorize.a.d dVar) {
            l.d(dVar, "");
            this.f67224a.f67210b.postValue(dVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
            if (r0.booleanValue() == false) goto L_0x008f;
         */
        @Override // com.ss.android.ugc.aweme.openauthorize.d
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.ss.android.ugc.aweme.openauthorize.a.d r7) {
            /*
            // Method dump skipped, instructions count: 210
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel.d.a(com.ss.android.ugc.aweme.openauthorize.a.d):void");
        }

        public static final class a<T> implements Comparator {
            static {
                Covode.recordClassIndex(41403);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
                if (r0.booleanValue() == false) goto L_0x0035;
             */
            /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
            @Override // java.util.Comparator
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final int compare(T r4, T r5) {
                /*
                    r3 = this;
                    com.ss.android.ugc.aweme.openauthorize.a.g r4 = (com.ss.android.ugc.aweme.openauthorize.a.g) r4
                    java.lang.Boolean r1 = r4.getScopeRequired()
                    r2 = 0
                    r0 = 1
                    if (r1 == 0) goto L_0x0019
                    java.lang.Boolean r0 = r4.getScopeRequired()
                    if (r0 != 0) goto L_0x0013
                    h.f.b.l.b()
                L_0x0013:
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L_0x003f
                L_0x0019:
                    r0 = 1
                L_0x001a:
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
                    com.ss.android.ugc.aweme.openauthorize.a.g r5 = (com.ss.android.ugc.aweme.openauthorize.a.g) r5
                    java.lang.Boolean r0 = r5.getScopeRequired()
                    if (r0 == 0) goto L_0x0035
                    java.lang.Boolean r0 = r5.getScopeRequired()
                    if (r0 != 0) goto L_0x002f
                    h.f.b.l.b()
                L_0x002f:
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L_0x0036
                L_0x0035:
                    r2 = 1
                L_0x0036:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                    int r0 = h.b.a.a(r1, r0)
                    return r0
                L_0x003f:
                    r0 = 0
                    goto L_0x001a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel.d.a.compare(java.lang.Object, java.lang.Object):int");
            }
        }

        d(AuthCommonViewModel authCommonViewModel, boolean z, String str) {
            this.f67224a = authCommonViewModel;
            this.f67225b = z;
            this.f67226c = str;
        }
    }

    public final void a(c.a aVar) {
        l.d(aVar, "");
        this.f67219k.a(new c(this, aVar));
    }

    public static final class g<T> implements Comparator {
        static {
            Covode.recordClassIndex(41406);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
            if (r0.booleanValue() == false) goto L_0x0035;
         */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
        @Override // java.util.Comparator
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int compare(T r4, T r5) {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.openauthorize.a.g r4 = (com.ss.android.ugc.aweme.openauthorize.a.g) r4
                java.lang.Boolean r1 = r4.getScopeRequired()
                r2 = 0
                r0 = 1
                if (r1 == 0) goto L_0x0019
                java.lang.Boolean r0 = r4.getScopeRequired()
                if (r0 != 0) goto L_0x0013
                h.f.b.l.b()
            L_0x0013:
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L_0x003f
            L_0x0019:
                r0 = 1
            L_0x001a:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
                com.ss.android.ugc.aweme.openauthorize.a.g r5 = (com.ss.android.ugc.aweme.openauthorize.a.g) r5
                java.lang.Boolean r0 = r5.getScopeRequired()
                if (r0 == 0) goto L_0x0035
                java.lang.Boolean r0 = r5.getScopeRequired()
                if (r0 != 0) goto L_0x002f
                h.f.b.l.b()
            L_0x002f:
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L_0x0036
            L_0x0035:
                r2 = 1
            L_0x0036:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                int r0 = h.b.a.a(r1, r0)
                return r0
            L_0x003f:
                r0 = 0
                goto L_0x001a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel.g.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    public final void a(boolean z, boolean z2) {
        this.f67215g.postValue(new com.ss.android.ugc.aweme.openauthorize.a.a(z, z2));
    }

    public AuthCommonViewModel(AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend, a.AbstractC1045a aVar, c.a aVar2) {
        l.d(awemeAuthorizePlatformDepend, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f67219k = awemeAuthorizePlatformDepend;
        this.f67217i = aVar;
        this.f67218j = aVar2;
    }

    public final void a(String str, int i2, String str2, String str3, String str4, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        com.ss.android.ugc.aweme.authorize.a.a.a(str, i2, str2, str3, str4, new d(this, z, str2));
    }
}
