package com.ss.android.ugc.aweme.shortvideo.cut;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.vesdk.ap;
import h.f.b.z;
import h.h;
import h.m.p;
import h.z;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public final class VEMediaParserFrameProviderImpl implements au, com.ss.android.ugc.aweme.shortvideo.cut.model.g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f125379a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, ap> f125380b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public int f125381c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f125382d;

    /* renamed from: e  reason: collision with root package name */
    private final ExecutorService f125383e = com.ss.android.ugc.aweme.cw.g.a(l.a(o.FIXED).a(1).a());

    /* renamed from: f  reason: collision with root package name */
    private final h f125384f;

    static {
        Covode.recordClassIndex(82302);
    }

    public final t<Bitmap> a() {
        return (t) this.f125384f.getValue();
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            releaseFrames();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void releaseFrames() {
        b.i.a((Callable) new e(this));
    }

    /* access modifiers changed from: package-private */
    public static final class c<V> implements Callable<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VEMediaParserFrameProviderImpl f125392a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f125393b;

        static {
            Covode.recordClassIndex(82308);
        }

        c(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl, String str) {
            this.f125392a = vEMediaParserFrameProviderImpl;
            this.f125393b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Bitmap call() {
            y<Bitmap> a2 = this.f125392a.a().a(this.f125393b);
            if (a2 != null) {
                return a2.f126298c;
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<V> implements Callable<z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VEMediaParserFrameProviderImpl f125400a;

        static {
            Covode.recordClassIndex(82310);
        }

        e(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl) {
            this.f125400a = vEMediaParserFrameProviderImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ z call() {
            this.f125400a.a().a();
            this.f125400a.b();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VEMediaParserFrameProviderImpl f125402a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f125403b;

        static {
            Covode.recordClassIndex(82312);
        }

        g(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl, String str) {
            this.f125402a = vEMediaParserFrameProviderImpl;
            this.f125403b = str;
        }

        public final void run() {
            ap apVar = this.f125402a.f125380b.get(this.f125403b);
            if (apVar != null) {
                apVar.a();
                this.f125402a.f125380b.put(this.f125403b, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.model.g
    public final void b() {
        this.f125383e.submit(new f(this));
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VEMediaParserFrameProviderImpl f125401a;

        static {
            Covode.recordClassIndex(82311);
        }

        f(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl) {
            this.f125401a = vEMediaParserFrameProviderImpl;
        }

        public final void run() {
            for (Map.Entry<String, ap> entry : this.f125401a.f125380b.entrySet()) {
                this.f125401a.a(entry.getKey());
            }
        }
    }

    static final class a extends h.f.b.m implements h.f.a.a<t<Bitmap>> {
        final /* synthetic */ VEMediaParserFrameProviderImpl this$0;

        static {
            Covode.recordClassIndex(82303);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl) {
            super(0);
            this.this$0 = vEMediaParserFrameProviderImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Bitmap> invoke() {
            return new t(this.this$0.f125382d, (com.ss.android.ugc.tools.utils.i.b(this.this$0.f125382d).toString() + "/") + "ve_frame_cache2/" + System.currentTimeMillis(), new b());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VEMediaParserFrameProviderImpl f125385a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f125386b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f125387c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f125388d;

        static {
            Covode.recordClassIndex(82304);
        }

        b(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl, String str, int i2, String str2) {
            this.f125385a = vEMediaParserFrameProviderImpl;
            this.f125386b = str;
            this.f125387c = i2;
            this.f125388d = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Bitmap call() {
            MethodCollector.i(6772);
            AnonymousClass1 r2 = new h.f.a.b<String, ap>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(82305);
                }

                {
                    this.this$0 = r2;
                }

                /* renamed from: a */
                public final ap invoke(String str) {
                    h.f.b.l.d(str, "");
                    ap apVar = new ap();
                    apVar.a(str.toString());
                    this.this$0.f125385a.f125380b.put(str.toString(), apVar);
                    return apVar;
                }
            };
            ap apVar = this.f125385a.f125380b.get(this.f125386b.toString());
            if (apVar == null) {
                apVar = r2.invoke(this.f125386b);
            }
            final z.e eVar = new z.e();
            eVar.element = null;
            String str = this.f125386b;
            if (com.ss.android.ugc.tools.utils.i.a(str)) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                String str2 = options.outMimeType;
                if (!TextUtils.isEmpty(str2)) {
                    h.f.b.l.b(str2, "");
                    if (p.a((CharSequence) str2, (CharSequence) "png", true) || p.a((CharSequence) str2, (CharSequence) "jpg", true) || p.a((CharSequence) str2, (CharSequence) "jpeg", true)) {
                        eVar.element = (T) com.ss.android.ugc.tools.utils.c.a(this.f125386b, new int[]{this.f125385a.f125381c, this.f125385a.f125381c});
                        if (eVar.element != null && !eVar.element.isRecycled()) {
                            b.i.a(new Callable<h.z>(this) {
                                /* class com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl.b.AnonymousClass2 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ b f125389a;

                                static {
                                    Covode.recordClassIndex(82306);
                                }

                                {
                                    this.f125389a = r1;
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                @Override // java.util.concurrent.Callable
                                public final /* synthetic */ h.z call() {
                                    this.f125389a.f125385a.a().a(this.f125389a.f125388d, new y<>(eVar.element.getWidth(), eVar.element.getHeight(), eVar.element), AnonymousClass1.f125391a);
                                    return h.z.f158842a;
                                }
                            }, b.i.f4824a);
                        }
                        T t = eVar.element;
                        MethodCollector.o(6772);
                        return t;
                    }
                }
            }
            eVar.element = (T) apVar.a(this.f125387c, this.f125385a.f125381c, this.f125385a.f125379a);
            b.i.a(new Callable<h.z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl.b.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f125389a;

                static {
                    Covode.recordClassIndex(82306);
                }

                {
                    this.f125389a = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ h.z call() {
                    this.f125389a.f125385a.a().a(this.f125389a.f125388d, new y<>(eVar.element.getWidth(), eVar.element.getHeight(), eVar.element), AnonymousClass1.f125391a);
                    return h.z.f158842a;
                }
            }, b.i.f4824a);
            T t2 = eVar.element;
            MethodCollector.o(6772);
            return t2;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.model.g
    public final void a(int i2) {
        this.f125381c = i2;
    }

    private final b.i<Bitmap> b(String str) {
        b.i<Bitmap> a2 = b.i.a((Callable) new c(this, str));
        h.f.b.l.b(a2, "");
        return a2;
    }

    /* access modifiers changed from: package-private */
    public static final class d<TTaskResult, TContinuationResult> implements b.g<Bitmap, h.z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VEMediaParserFrameProviderImpl f125394a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f125395b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f125396c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f125397d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f125398e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.cut.model.a f125399f;

        static {
            Covode.recordClassIndex(82309);
        }

        d(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl, boolean z, int i2, String str, int i3, com.ss.android.ugc.aweme.shortvideo.cut.model.a aVar) {
            this.f125394a = vEMediaParserFrameProviderImpl;
            this.f125395b = z;
            this.f125396c = i2;
            this.f125397d = str;
            this.f125398e = i3;
            this.f125399f = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
        @Override // b.g
        public final /* synthetic */ h.z then(b.i<Bitmap> iVar) {
            com.facebook.common.h.a a2;
            h.f.b.l.b(iVar, "");
            if (!iVar.c() || !this.f125395b) {
                Bitmap d2 = iVar.d();
                if (d2 != null && (!d2.isRecycled()) && (a2 = com.facebook.common.h.a.a(new com.facebook.imagepipeline.j.d(d2, com.facebook.imagepipeline.c.g.a(), com.facebook.imagepipeline.j.g.f48000a))) != null && a2.d()) {
                    com.ss.android.ugc.aweme.shortvideo.cut.model.a aVar = this.f125399f;
                    com.facebook.common.h.a<com.facebook.imagepipeline.j.b> b2 = a2.clone();
                    h.f.b.l.b(b2, "");
                    aVar.a(b2);
                    com.facebook.common.h.a.c(a2);
                }
            } else {
                this.f125394a.a(this.f125396c, this.f125397d, this.f125398e, this.f125399f, false);
            }
            return h.z.f158842a;
        }
    }

    public VEMediaParserFrameProviderImpl(Context context) {
        h.f.b.l.d(context, "");
        this.f125382d = context;
        this.f125381c = (int) r.a(context, 60.0f);
        this.f125384f = h.i.a((h.f.a.a) new a(this));
        if (context instanceof androidx.appcompat.app.d) {
            ((androidx.core.app.d) context).getLifecycle().a(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.model.g
    public final void a(String str) {
        h.f.b.l.d(str, "");
        this.f125383e.submit(new g(this, str));
    }

    private final b.i<Bitmap> a(String str, String str2, int i2) {
        b.i<Bitmap> a2 = b.i.a(new b(this, str2, i2, str), this.f125383e);
        h.f.b.l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.model.g
    public final void a(int i2, String str, int i3, com.ss.android.ugc.aweme.shortvideo.cut.model.a aVar) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(aVar, "");
        a(i2, str, i3, aVar, true);
    }

    public final void a(int i2, String str, int i3, com.ss.android.ugc.aweme.shortvideo.cut.model.a aVar, boolean z) {
        b.i<Bitmap> a2;
        String str2 = str + i3;
        if (a().b(str2)) {
            a2 = b(str2);
        } else {
            a2 = a(str2, str, i3);
        }
        a2.a(new d(this, z, i2, str, i3, aVar), b.i.f4826c);
    }
}
