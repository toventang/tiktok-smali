package com.lynx.a;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.j;

public abstract class d {
    public volatile boolean mDestroyed;

    static {
        Covode.recordClassIndex(34560);
    }

    public abstract Bitmap getCurrent();

    /* access modifiers changed from: protected */
    public abstract void onDestroy();

    /* access modifiers changed from: protected */
    public abstract void onLoad(j jVar, Uri uri, b bVar, c cVar);

    /* access modifiers changed from: protected */
    public abstract void onPause();

    /* access modifiers changed from: protected */
    public abstract void onRelease();

    /* access modifiers changed from: protected */
    public abstract void onResume();

    public final void destroy() {
        if (!this.mDestroyed) {
            this.mDestroyed = true;
            onDestroy();
        }
    }

    public final void pause() {
        if (!this.mDestroyed) {
            onPause();
        }
    }

    public final void release() {
        if (!this.mDestroyed) {
            onRelease();
        }
    }

    public final void resume() {
        if (!this.mDestroyed) {
            onResume();
        }
    }

    private void sequenceLoad(j jVar, final Uri uri, b bVar, final c cVar) {
        onLoad(jVar, uri, bVar, new c() {
            /* class com.lynx.a.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34561);
            }

            /* access modifiers changed from: protected */
            @Override // com.lynx.a.c
            public final void b(Throwable th) {
                c cVar;
                if (!d.this.mDestroyed && (cVar = cVar) != null) {
                    cVar.b(th);
                }
            }

            /* access modifiers changed from: protected */
            @Override // com.lynx.a.c
            public final void a(Bitmap bitmap) {
                c cVar;
                if (!d.this.mDestroyed && (cVar = cVar) != null) {
                    cVar.a(uri, bitmap);
                }
            }

            /* access modifiers changed from: protected */
            @Override // com.lynx.a.c
            public final void b(Bitmap bitmap) {
                c cVar;
                if (!d.this.mDestroyed && (cVar = cVar) != null) {
                    cVar.b(uri, bitmap);
                }
            }

            /* access modifiers changed from: protected */
            @Override // com.lynx.a.c
            public final void a(Throwable th) {
                c cVar;
                if (!d.this.mDestroyed && (cVar = cVar) != null) {
                    cVar.a(uri, th);
                }
            }
        });
    }

    public final void load(j jVar, Uri uri, b bVar, c cVar) {
        if (this.mDestroyed) {
            LLog.a(6, "LynxImageLoader", "load after destroyed");
        } else if (jVar != null && uri != null) {
            sequenceLoad(jVar, uri, bVar, cVar);
        }
    }
}
