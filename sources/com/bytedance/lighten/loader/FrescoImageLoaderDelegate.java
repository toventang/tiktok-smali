package com.bytedance.lighten.loader;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.a.a;
import com.bytedance.lighten.a.c;
import com.bytedance.lighten.a.h;
import com.bytedance.lighten.a.i;
import com.bytedance.lighten.a.j;
import com.bytedance.lighten.a.p;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.s;
import com.bytedance.lighten.a.u;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.u;
import com.facebook.imagepipeline.e.g;
import com.facebook.imagepipeline.e.k;
import com.facebook.imagepipeline.p.b;
import java.io.File;
import java.io.IOException;

public class FrescoImageLoaderDelegate implements p {
    private static volatile boolean sInitialized;
    private c mFrescoCache;
    private i mImpl;

    static {
        Covode.recordClassIndex(24625);
    }

    public static int com_bytedance_lighten_loader_FrescoImageLoaderDelegate_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.lighten.a.p
    public c getCache() {
        return this.mFrescoCache;
    }

    @Override // com.bytedance.lighten.a.p
    public v load(Uri uri) {
        return new v(uri);
    }

    @Override // com.bytedance.lighten.a.p
    public v load(a aVar) {
        return new v(aVar);
    }

    @Override // com.bytedance.lighten.a.i
    public void display(u uVar) {
        if (!sInitialized) {
            com_bytedance_lighten_loader_FrescoImageLoaderDelegate_com_ss_android_ugc_aweme_lancet_LogLancet_e("Lighten:", "display, mImpl is not initialized, call FrescoImageLoaderDelegate.init");
        } else {
            this.mImpl.display(uVar);
        }
    }

    @Override // com.bytedance.lighten.a.i
    public void download(u uVar) {
        if (!sInitialized) {
            com_bytedance_lighten_loader_FrescoImageLoaderDelegate_com_ss_android_ugc_aweme_lancet_LogLancet_e("Lighten:", "trimDisk, mImpl is not initialized, call FrescoImageLoaderDelegate.init");
        } else {
            this.mImpl.download(uVar);
        }
    }

    @Override // com.bytedance.lighten.a.p
    public v load(File file) {
        return new v(Uri.fromFile(file));
    }

    @Override // com.bytedance.lighten.a.i
    public void loadBitmap(u uVar) {
        if (!sInitialized) {
            com_bytedance_lighten_loader_FrescoImageLoaderDelegate_com_ss_android_ugc_aweme_lancet_LogLancet_e("Lighten:", "loadBitmap, mImpl is not initialized, call FrescoImageLoaderDelegate.init");
        } else {
            this.mImpl.loadBitmap(uVar);
        }
    }

    @Override // com.bytedance.lighten.a.i
    public void trimDisk(int i2) {
        if (!sInitialized) {
            com_bytedance_lighten_loader_FrescoImageLoaderDelegate_com_ss_android_ugc_aweme_lancet_LogLancet_e("Lighten:", "trimDisk, mImpl is not initialized, call FrescoImageLoaderDelegate.init");
        } else {
            this.mImpl.trimDisk(i2);
        }
    }

    @Override // com.bytedance.lighten.a.i
    public void trimMemory(int i2) {
        if (!sInitialized) {
            com_bytedance_lighten_loader_FrescoImageLoaderDelegate_com_ss_android_ugc_aweme_lancet_LogLancet_e("Lighten:", "trimMemory, mImpl is not initialized, call FrescoImageLoaderDelegate.init");
        } else {
            this.mImpl.trimMemory(i2);
        }
    }

    public void init(s sVar) {
        if (!sInitialized) {
            h.a(sVar.f39866a);
            if (sVar.f39876k) {
                com.facebook.imagepipeline.e.i a2 = v.a(sVar);
                com.facebook.drawee.a.a.c.a(sVar.f39866a, a2);
                u.a.f40040a.f40038a = a2;
                com.facebook.common.e.a.b(sVar.f39875j);
            }
            this.mFrescoCache = new l();
            this.mImpl = new q(this.mFrescoCache);
            sInitialized = true;
        }
    }

    @Override // com.bytedance.lighten.a.p
    public v load(int i2) {
        return new v(Uri.parse("res://" + r.f39864d + "/" + i2));
    }

    @Override // com.bytedance.lighten.a.p
    public void init(final j jVar) {
        if (!sInitialized) {
            h.a(jVar.b());
            AnonymousClass1 r6 = new g() {
                /* class com.bytedance.lighten.loader.FrescoImageLoaderDelegate.AnonymousClass1 */

                /* renamed from: c  reason: collision with root package name */
                private volatile com.facebook.imagepipeline.e.i f39925c;

                static {
                    Covode.recordClassIndex(24626);
                }

                @Override // com.facebook.imagepipeline.e.g
                public final com.facebook.imagepipeline.e.i a() {
                    MethodCollector.i(12331);
                    if (this.f39925c == null) {
                        synchronized (this) {
                            try {
                                if (this.f39925c == null) {
                                    this.f39925c = v.a(jVar.a());
                                }
                            } catch (Throwable th) {
                                MethodCollector.o(12331);
                                throw th;
                            }
                        }
                    }
                    com.facebook.imagepipeline.e.i iVar = this.f39925c;
                    MethodCollector.o(12331);
                    return iVar;
                }
            };
            Context b2 = jVar.b();
            Boolean valueOf = Boolean.valueOf(jVar.c());
            b.a();
            if (com.facebook.drawee.a.a.c.f47261b) {
                com.facebook.common.e.a.b(com.facebook.drawee.a.a.c.f47260a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
            } else {
                com.facebook.drawee.a.a.c.f47261b = true;
            }
            try {
                b.a();
                com.facebook.imageutils.b.a(b2);
                b.a();
            } catch (IOException e2) {
                com.facebook.common.e.a.a(com.facebook.drawee.a.a.c.f47260a, e2, "Could not initialize SoLoader", new Object[0]);
                b.a();
            }
            Context b3 = com.facebook.drawee.a.a.c.b(b2);
            k.a(r6, valueOf);
            com.facebook.drawee.a.a.c.c(b3);
            if (valueOf.booleanValue()) {
                com.facebook.drawee.a.a.c.a();
            }
            b.a();
            u.a.f40040a.f40039b = r6;
            com.facebook.common.e.a.b(5);
            this.mFrescoCache = new l();
            this.mImpl = new q(this.mFrescoCache);
            sInitialized = true;
        }
    }

    @Override // com.bytedance.lighten.a.p
    public v load(Object obj) {
        return new v(obj);
    }

    @Override // com.bytedance.lighten.a.p
    public v load(String str) {
        return new v(str);
    }
}
