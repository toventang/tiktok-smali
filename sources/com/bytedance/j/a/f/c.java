package com.bytedance.j.a.f;

import android.net.Uri;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.a.o;
import com.bytedance.ies.bullet.service.base.ap;
import com.bytedance.ies.bullet.service.base.resourceloader.config.j;
import com.lynx.tasm.provider.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;

public final class c extends com.lynx.tasm.provider.b {

    /* renamed from: a  reason: collision with root package name */
    private final o f39039a;

    static {
        Covode.recordClassIndex(23899);
    }

    public c(o oVar) {
        l.c(oVar, "");
        this.f39039a = oVar;
    }

    static final class a extends m implements h.f.a.b<ap, z> {
        final /* synthetic */ b.a $callback;

        static {
            Covode.recordClassIndex(23900);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b.a aVar) {
            super(1);
            this.$callback = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ap apVar) {
            final ap apVar2 = apVar;
            l.c(apVar2, "");
            i.a(new Callable<i<z>>(this) {
                /* class com.bytedance.j.a.f.c.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f39040a;

                static {
                    Covode.recordClassIndex(23901);
                }

                {
                    this.f39040a = r1;
                }

                /* access modifiers changed from: package-private */
                /* renamed from: com.bytedance.j.a.f.c$a$1$a  reason: collision with other inner class name */
                public static final class CallableC0930a<V> implements Callable<z> {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ byte[] f39045a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ InputStream f39046b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f39047c;

                    static {
                        Covode.recordClassIndex(23904);
                    }

                    CallableC0930a(byte[] bArr, InputStream inputStream, AnonymousClass1 r3) {
                        this.f39045a = bArr;
                        this.f39046b = inputStream;
                        this.f39047c = r3;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ z call() {
                        b.a aVar = this.f39047c.f39040a.$callback;
                        if (aVar == null) {
                            return null;
                        }
                        aVar.a(this.f39045a);
                        return z.f158842a;
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public i<z> call() {
                    i<z> iVar;
                    MethodCollector.i(3278);
                    try {
                        InputStream a2 = apVar2.a();
                        if (a2 != null) {
                            try {
                                InputStream inputStream = a2;
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                                    long unused = h.e.b.a(inputStream, byteArrayOutputStream2, 8192);
                                    iVar = i.a(new CallableC0930a(byteArrayOutputStream2.toByteArray(), inputStream, this), i.f4826c);
                                    h.e.c.a(byteArrayOutputStream, null);
                                    h.e.c.a(a2, null);
                                } catch (Throwable th) {
                                    h.e.c.a(byteArrayOutputStream, th);
                                    MethodCollector.o(3278);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                h.e.c.a(a2, th);
                                MethodCollector.o(3278);
                                throw th2;
                            }
                        } else {
                            iVar = i.a(new Callable<z>(this) {
                                /* class com.bytedance.j.a.f.c.a.AnonymousClass1.AnonymousClass1 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ AnonymousClass1 f39042a;

                                static {
                                    Covode.recordClassIndex(23902);
                                }

                                {
                                    this.f39042a = r1;
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                @Override // java.util.concurrent.Callable
                                public final /* synthetic */ z call() {
                                    b.a aVar = this.f39042a.f39040a.$callback;
                                    if (aVar == null) {
                                        return null;
                                    }
                                    aVar.a("file not found");
                                    return z.f158842a;
                                }
                            }, i.f4826c);
                        }
                    } catch (Throwable th3) {
                        iVar = i.a(new Callable<z>(this) {
                            /* class com.bytedance.j.a.f.c.a.AnonymousClass1.AnonymousClass2 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass1 f39043a;

                            static {
                                Covode.recordClassIndex(23903);
                            }

                            {
                                this.f39043a = r1;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ z call() {
                                b.a aVar = this.f39043a.f39040a.$callback;
                                if (aVar == null) {
                                    return null;
                                }
                                aVar.a("stream write error, " + th3.getMessage());
                                return z.f158842a;
                            }
                        }, i.f4826c);
                    }
                    MethodCollector.o(3278);
                    return iVar;
                }
            }, i.f4824a);
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ b.a $callback;

        static {
            Covode.recordClassIndex(23905);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(b.a aVar) {
            super(1);
            this.$callback = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            l.c(th2, "");
            b.a aVar = this.$callback;
            if (aVar != null) {
                aVar.a("template load error, " + th2.getMessage());
            }
            return z.f158842a;
        }
    }

    @Override // com.lynx.tasm.provider.b
    public final void a(String str, b.a aVar) {
        l.c(str, "");
        IResourceLoaderService iResourceLoaderService = (IResourceLoaderService) this.f39039a.b_(IResourceLoaderService.class);
        if (iResourceLoaderService != null) {
            j jVar = new j();
            jVar.d("template");
            jVar.s = this.f39039a;
            Uri parse = Uri.parse(str);
            l.a((Object) parse, "");
            jVar.w = new com.bytedance.ies.bullet.service.base.e.b(parse);
            iResourceLoaderService.loadAsync(str, jVar, new a(aVar), new b(aVar));
        } else if (aVar != null) {
            aVar.a("ResourceLoader Not Found!");
        }
    }
}
