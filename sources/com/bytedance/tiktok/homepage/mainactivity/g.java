package com.bytedance.tiktok.homepage.mainactivity;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.journey.p;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import f.a.d.f;
import f.a.t;
import h.f.b.l;
import h.f.b.z;
import h.z;
import java.util.concurrent.Callable;

public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final a f44153c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f44154a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f44155b;

    static {
        Covode.recordClassIndex(27058);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27059);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f44161a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f44162b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f44163c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f44164d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f44165e;

        static {
            Covode.recordClassIndex(27062);
        }

        public c(g gVar, boolean z, boolean z2, boolean z3, int i2) {
            this.f44161a = gVar;
            this.f44162b = z;
            this.f44163c = z2;
            this.f44164d = z3;
            this.f44165e = i2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if ((p.a.a().d() != 2 && !this.f44162b && !this.f44163c) || this.f44164d) {
                this.f44161a.a(this.f44164d, this.f44165e);
            }
            return z.f158842a;
        }
    }

    public static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f44166a;

        static {
            Covode.recordClassIndex(27063);
        }

        public d(z.e eVar) {
            this.f44166a = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            T t = this.f44166a.element;
            if (t != null) {
                t.dispose();
            }
        }
    }

    public g(Activity activity) {
        l.d(activity, "");
        this.f44155b = activity;
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f44156a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f44157b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f44158c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f44159d;

        static {
            Covode.recordClassIndex(27060);
        }

        b(g gVar, boolean z, int i2, z.e eVar) {
            this.f44156a = gVar;
            this.f44157b = z;
            this.f44158c = i2;
            this.f44159d = eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x001d  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r8) {
            /*
            // Method dump skipped, instructions count: 209
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainactivity.g.b.accept(java.lang.Object):void");
        }

        static final class a implements IAccountService.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f44160a;

            static {
                Covode.recordClassIndex(27061);
            }

            a(b bVar) {
                this.f44160a = bVar;
            }

            @Override // com.ss.android.ugc.aweme.IAccountService.g
            public final void onResult(int i2, int i3, Object obj) {
                if (i2 == 1 && i3 == 1 && p.a.a().h()) {
                    com.ss.android.ugc.aweme.journey.z.f105220a.a(this.f44160a.f44156a.f44155b, true, false);
                }
            }
        }
    }

    public final void a(boolean z, int i2) {
        z.e eVar = new z.e();
        eVar.element = null;
        eVar.element = (T) t.b(MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new b(this, z, i2, eVar));
    }
}
