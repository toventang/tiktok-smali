package com.bytedance.j.a.f;

import android.net.Uri;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.a.o;
import com.bytedance.ies.bullet.service.base.a.p;
import com.bytedance.ies.bullet.service.base.ap;
import com.lynx.tasm.provider.g;
import com.lynx.tasm.provider.h;
import com.lynx.tasm.provider.j;
import h.e.c;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

public final class d extends h<Object, byte[]> {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<o> f39048a;

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.ies.bullet.service.base.b.a f39049b;

    static {
        Covode.recordClassIndex(23906);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<ap, z> {
        final /* synthetic */ g $callback$inlined;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(23907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, g gVar) {
            super(1);
            this.this$0 = dVar;
            this.$callback$inlined = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ap apVar) {
            final ap apVar2 = apVar;
            l.c(apVar2, "");
            i.a(new Callable<z>(this) {
                /* class com.bytedance.j.a.f.d.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f39050a;

                static {
                    Covode.recordClassIndex(23908);
                }

                {
                    this.f39050a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public z call() {
                    o oVar;
                    o oVar2;
                    MethodCollector.i(3263);
                    InputStream a2 = apVar2.a();
                    if (a2 != null) {
                        try {
                            InputStream inputStream = a2;
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                                long unused = h.e.b.a(inputStream, byteArrayOutputStream2, 8192);
                                this.f39050a.$callback$inlined.a(j.a(byteArrayOutputStream2.toByteArray()));
                                c.a(byteArrayOutputStream, null);
                                c.a(a2, null);
                                WeakReference<o> weakReference = this.f39050a.this$0.f39048a;
                                if (weakReference == null || (oVar2 = weakReference.get()) == null) {
                                    MethodCollector.o(3263);
                                    return null;
                                }
                                oVar2.printLog("get external js resource success", p.I, "ExternalJSProvider");
                                z zVar = z.f158842a;
                                MethodCollector.o(3263);
                                return zVar;
                            } catch (Throwable th) {
                                c.a(byteArrayOutputStream, th);
                                MethodCollector.o(3263);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            c.a(a2, th);
                            MethodCollector.o(3263);
                            throw th2;
                        }
                    } else {
                        this.f39050a.$callback$inlined.a(j.a((Throwable) new Error("InputStream is null")));
                        WeakReference<o> weakReference2 = this.f39050a.this$0.f39048a;
                        if (weakReference2 == null || (oVar = weakReference2.get()) == null) {
                            MethodCollector.o(3263);
                            return null;
                        }
                        oVar.printLog("get external js resource failed: InputStream is null", p.E, "ExternalJSProvider");
                        z zVar2 = z.f158842a;
                        MethodCollector.o(3263);
                        return zVar2;
                    }
                }
            }, i.f4824a);
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ g $callback$inlined;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(23909);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, g gVar) {
            super(1);
            this.this$0 = dVar;
            this.$callback$inlined = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            o oVar;
            Throwable th2 = th;
            l.c(th2, "");
            this.$callback$inlined.a(j.a(th2));
            WeakReference<o> weakReference = this.this$0.f39048a;
            if (!(weakReference == null || (oVar = weakReference.get()) == null)) {
                oVar.printLog("get external js resource failed: " + th2.getMessage(), p.E, "ExternalJSProvider");
            }
            return z.f158842a;
        }
    }

    public d(o oVar, com.bytedance.ies.bullet.service.base.b.a aVar) {
        l.c(oVar, "");
        l.c(aVar, "");
        this.f39049b = aVar;
        this.f39048a = new WeakReference<>(oVar);
    }

    @Override // com.lynx.tasm.provider.h
    public final void a(com.lynx.tasm.provider.i<Object> iVar, g<byte[]> gVar) {
        IResourceLoaderService iResourceLoaderService;
        o oVar;
        l.c(iVar, "");
        l.c(gVar, "");
        String str = iVar.f56821a;
        o oVar2 = null;
        if ((!TextUtils.isEmpty(str)) && str != null && (iResourceLoaderService = (IResourceLoaderService) this.f39049b.a(IResourceLoaderService.class)) != null) {
            com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar = new com.bytedance.ies.bullet.service.base.resourceloader.config.j();
            jVar.d("external_js");
            WeakReference<o> weakReference = this.f39048a;
            if (weakReference != null) {
                oVar2 = weakReference.get();
            }
            jVar.s = oVar2;
            try {
                Uri parse = Uri.parse(str);
                l.a((Object) parse, "");
                jVar.w = new com.bytedance.ies.bullet.service.base.e.b(parse);
                String queryParameter = parse.getQueryParameter("surl");
                if (queryParameter != null) {
                    l.a((Object) queryParameter, "");
                    jVar.c(queryParameter);
                }
                String queryParameter2 = parse.getQueryParameter("channel");
                if (queryParameter2 != null) {
                    l.a((Object) queryParameter2, "");
                    jVar.a(queryParameter2);
                }
                String queryParameter3 = parse.getQueryParameter("bundle");
                if (queryParameter3 != null) {
                    l.a((Object) queryParameter3, "");
                    jVar.b(queryParameter3);
                }
                jVar.f32636j = 1;
                String queryParameter4 = parse.getQueryParameter("dynamic");
                if (queryParameter4 != null) {
                    l.a((Object) queryParameter4, "");
                    jVar.f32636j = Integer.valueOf(Integer.parseInt(queryParameter4));
                }
            } catch (Throwable th) {
                WeakReference<o> weakReference2 = this.f39048a;
                if (!(weakReference2 == null || (oVar = weakReference2.get()) == null)) {
                    oVar.printReject(th, "ExternalJSProvider parse url error");
                }
                gVar.a(j.a(th));
            }
            iResourceLoaderService.loadAsync(str, jVar, new a(this, gVar), new b(this, gVar));
        }
    }
}
