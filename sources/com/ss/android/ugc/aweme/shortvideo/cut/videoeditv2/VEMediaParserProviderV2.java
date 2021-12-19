package com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import b.i;
import b.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.shortvideo.cut.t;
import com.ss.android.ugc.aweme.shortvideo.cut.y;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.vesdk.ap;
import h.a.n;
import h.f.b.l;
import h.f.b.z;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public final class VEMediaParserProviderV2 implements au {

    /* renamed from: a  reason: collision with root package name */
    public boolean f126202a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, ap> f126203b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    final ExecutorService f126204c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Long> f126205d;

    /* renamed from: e  reason: collision with root package name */
    public int f126206e;

    /* renamed from: f  reason: collision with root package name */
    private final List<b.f> f126207f;

    /* renamed from: g  reason: collision with root package name */
    private final List<i<Bitmap>> f126208g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h f126209h;

    static {
        Covode.recordClassIndex(82858);
    }

    public final t<Bitmap> a() {
        return (t) this.f126209h.getValue();
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            releaseFrames();
        }
    }

    public final void b() {
        this.f126204c.execute(new g(this));
    }

    @v(a = i.a.ON_DESTROY)
    public final void releaseFrames() {
        b.i.b(new f(this), b.i.f4824a);
    }

    /* access modifiers changed from: package-private */
    public static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VEMediaParserProviderV2 f126220a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f126221b;

        static {
            Covode.recordClassIndex(82864);
        }

        c(VEMediaParserProviderV2 vEMediaParserProviderV2, String str) {
            this.f126220a = vEMediaParserProviderV2;
            this.f126221b = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            y<Bitmap> a2 = this.f126220a.a().a(this.f126221b);
            if (a2 != null) {
                return a2.f126298c;
            }
            return null;
        }
    }

    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VEMediaParserProviderV2 f126232a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f126233b;

        static {
            Covode.recordClassIndex(82869);
        }

        h(VEMediaParserProviderV2 vEMediaParserProviderV2, String str) {
            this.f126232a = vEMediaParserProviderV2;
            this.f126233b = str;
        }

        public final void run() {
            ap apVar = this.f126232a.f126203b.get(this.f126233b);
            if (apVar != null) {
                this.f126232a.f126203b.put(this.f126233b, null);
                apVar.a();
            }
        }
    }

    public final void c() {
        b.i.a((Collection) this.f126208g).a(new e(this), b.i.f4824a, null);
        this.f126208g.clear();
    }

    static final class a extends h.f.b.m implements h.f.a.a<t<Bitmap>> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(82859);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Bitmap> invoke() {
            return new t(this.$context, dj.f126461d + "ve_frame_cache2/" + System.currentTimeMillis(), new com.ss.android.ugc.aweme.shortvideo.cut.b());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VEMediaParserProviderV2 f126231a;

        static {
            Covode.recordClassIndex(82868);
        }

        g(VEMediaParserProviderV2 vEMediaParserProviderV2) {
            this.f126231a = vEMediaParserProviderV2;
        }

        public final void run() {
            for (Map.Entry<String, ap> entry : this.f126231a.f126203b.entrySet()) {
                VEMediaParserProviderV2 vEMediaParserProviderV2 = this.f126231a;
                vEMediaParserProviderV2.f126204c.execute(new h(vEMediaParserProviderV2, entry.getKey()));
            }
        }
    }

    public final void d() {
        Iterator<T> it = this.f126207f.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        this.f126207f.clear();
        this.f126208g.clear();
    }

    /* access modifiers changed from: package-private */
    public static final class f<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VEMediaParserProviderV2 f126230a;

        static {
            Covode.recordClassIndex(82867);
        }

        f(VEMediaParserProviderV2 vEMediaParserProviderV2) {
            this.f126230a = vEMediaParserProviderV2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f126230a.d();
            this.f126230a.a().a();
            this.f126230a.b();
            List<Long> list = this.f126230a.f126205d;
            l.d(list, "");
            l.d("video_clip", "");
            if (!list.isEmpty()) {
                com.ss.android.ugc.aweme.utils.d.a("tool_performance_fetch_frames", new com.ss.android.ugc.tools.f.b().a("duration", n.v(list)).a("count", list.size()).a("scene", "video_clip").f149193a);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VEMediaParserProviderV2 f126210a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.d f126211b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f126212c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f126213d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f126214e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f126215f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f126216g;

        static {
            Covode.recordClassIndex(82860);
        }

        b(VEMediaParserProviderV2 vEMediaParserProviderV2, b.d dVar, j jVar, String str, int i2, int i3, String str2) {
            this.f126210a = vEMediaParserProviderV2;
            this.f126211b = dVar;
            this.f126212c = jVar;
            this.f126213d = str;
            this.f126214e = i2;
            this.f126215f = i3;
            this.f126216g = str2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0077  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x009c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 167
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2.b.run():void");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VEMediaParserProviderV2 f126229a;

        static {
            Covode.recordClassIndex(82866);
        }

        e(VEMediaParserProviderV2 vEMediaParserProviderV2) {
            this.f126229a = vEMediaParserProviderV2;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            this.f126229a.b();
            return null;
        }
    }

    private final b.i<Bitmap> a(String str) {
        b.i<Bitmap> b2 = b.i.b(new c(this, str), b.i.f4824a);
        l.b(b2, "");
        return b2;
    }

    /* access modifiers changed from: package-private */
    public static final class d<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VEMediaParserProviderV2 f126222a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f126223b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f126224c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f126225d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f126226e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f126227f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ z.d f126228g;

        static {
            Covode.recordClassIndex(82865);
        }

        d(VEMediaParserProviderV2 vEMediaParserProviderV2, boolean z, int i2, String str, int i3, a aVar, z.d dVar) {
            this.f126222a = vEMediaParserProviderV2;
            this.f126223b = z;
            this.f126224c = i2;
            this.f126225d = str;
            this.f126226e = i3;
            this.f126227f = aVar;
            this.f126228g = dVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            l.b(iVar, "");
            if (!iVar.c() || !this.f126223b) {
                Bitmap bitmap = (Bitmap) iVar.d();
                if (bitmap != null && (!bitmap.isRecycled())) {
                    this.f126227f.a(bitmap);
                    if (this.f126228g.element != -1) {
                        this.f126222a.f126205d.add(Long.valueOf(System.currentTimeMillis() - this.f126228g.element));
                    }
                }
            } else {
                this.f126222a.a(this.f126224c, this.f126225d, this.f126226e, this.f126227f, false);
            }
            return h.z.f158842a;
        }
    }

    public VEMediaParserProviderV2(Context context) {
        l.d(context, "");
        l.a a2 = com.ss.android.ugc.aweme.cw.l.a(o.FIXED);
        a2.f79174c = 1;
        this.f126204c = com.ss.android.ugc.aweme.cw.g.a(a2.a());
        this.f126207f = new ArrayList();
        this.f126208g = new ArrayList();
        this.f126205d = new ArrayList();
        this.f126209h = h.i.a((h.f.a.a) new a(context));
        this.f126206e = en.a(56.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
        com.ss.android.ugc.aweme.port.in.g.a().u();
        if (context instanceof androidx.appcompat.app.d) {
            ((androidx.core.app.d) context).getLifecycle().a(this);
        }
    }

    private final b.i<Bitmap> a(String str, String str2, int i2) {
        b.f fVar = new b.f();
        this.f126207f.add(fVar);
        b.d b2 = fVar.b();
        h.f.b.l.b(b2, "");
        b.i<Bitmap> a2 = a(b2, i2, this.f126206e, str2, str);
        this.f126208g.add(a2);
        return a2;
    }

    private final b.i<Bitmap> a(b.d dVar, int i2, int i3, String str, String str2) {
        j jVar = new j();
        this.f126204c.execute(new b(this, dVar, jVar, str, i3, i2, str2));
        b.i<TResult> iVar = jVar.f4869a;
        h.f.b.l.b(iVar, "");
        return iVar;
    }

    public final void a(int i2, String str, int i3, a aVar, boolean z) {
        b.i<Bitmap> a2;
        z.d dVar = new z.d();
        dVar.element = -1;
        String str2 = str.toString() + i3;
        if (a().b(str2)) {
            a2 = a(str2);
        } else {
            dVar.element = System.currentTimeMillis();
            a2 = a(str2, str, i3);
        }
        a2.a(new d(this, z, i2, str, i3, aVar, dVar), b.i.f4826c, null);
    }
}
