package com.bytedance.lighten.loader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.c.a;
import com.bytedance.lighten.a.d.b;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.a.k;
import com.bytedance.lighten.a.l;
import com.bytedance.lighten.a.u;
import com.bytedance.lighten.a.w;
import com.bytedance.lighten.loader.a;
import com.facebook.drawee.a.a.c;
import com.facebook.drawee.a.a.e;
import com.facebook.drawee.e.p;
import com.facebook.drawee.e.q;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.o.b;
import java.lang.ref.WeakReference;

public class SmartImageView extends SimpleDraweeView implements k, l {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<a> f39940a;

    /* renamed from: b  reason: collision with root package name */
    private u f39941b;

    /* renamed from: c  reason: collision with root package name */
    public c f39942c;

    /* renamed from: d  reason: collision with root package name */
    private String f39943d;

    /* renamed from: e  reason: collision with root package name */
    private com.facebook.common.h.a<Bitmap> f39944e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f39945f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f39946g;

    static {
        Covode.recordClassIndex(24632);
    }

    public void a() {
    }

    public k getSmartHierarchy() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public String getAnimPreviewFrameCacheKey() {
        return this.f39943d;
    }

    public final void b() {
        c cVar;
        Animatable i2;
        if (getController() != null && (cVar = this.f39942c) != null && this.f39945f && cVar.f39963b && this.f39946g && (i2 = getController().i()) != null && !i2.isRunning()) {
            i2.start();
            WeakReference<a> weakReference = this.f39940a;
            if (weakReference != null && weakReference.get() != null) {
                this.f39940a.get().a();
            }
        }
    }

    public final void c() {
        Animatable i2;
        if (getController() != null && (i2 = getController().i()) != null && i2.isRunning()) {
            i2.stop();
            WeakReference<a> weakReference = this.f39940a;
            if (weakReference != null && weakReference.get() != null) {
                this.f39940a.get();
            }
        }
    }

    public void setAttached(boolean z) {
        this.f39945f = z;
    }

    public void setUserVisibleHint(boolean z) {
        this.f39946g = z;
    }

    public SmartImageView(Context context) {
        super(context);
        a();
    }

    public void setAnimationListener(a aVar) {
        this.f39940a = new WeakReference<>(aVar);
    }

    public void setImageDisplayListener(com.bytedance.lighten.a.c.k kVar) {
        c cVar = this.f39942c;
        if (cVar != null) {
            cVar.f39962a = kVar;
        }
    }

    public void setActualImageScaleType(w wVar) {
        if (wVar != null) {
            ((com.facebook.drawee.f.a) getHierarchy()).a(x.a(wVar));
        }
    }

    public void setPlaceholderImage(int i2) {
        if (i2 > 0) {
            ((com.facebook.drawee.f.a) getHierarchy()).c(i2);
        }
    }

    public void setPlaceholderImage(Drawable drawable) {
        ((com.facebook.drawee.f.a) getHierarchy()).a(1, drawable);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.facebook.imagepipeline.o.b */
    /* JADX WARN: Multi-variable type inference failed */
    private void setController(b bVar) {
        boolean z;
        final e b2 = c.b();
        b2.f47325m = getController();
        b2.f47322j = this.f39941b.f39894c;
        if (this.f39941b.L > 0) {
            z = true;
        } else {
            z = false;
        }
        b2.f47321i = z;
        b2.f47315c = bVar;
        if (!TextUtils.isEmpty(this.f39941b.A)) {
            b2.f47314b = this.f39941b.A;
        }
        c cVar = this.f39942c;
        if (cVar != null) {
            cVar.a(this.f39941b);
            b2.f47319g = this.f39942c;
        } else {
            c cVar2 = new c();
            this.f39942c = cVar2;
            cVar2.a(this.f39941b);
            b2.f47319g = this.f39942c;
        }
        b.a.f39818a.execute(new Runnable() {
            /* class com.bytedance.lighten.loader.SmartImageView.AnonymousClass2 */

            static {
                Covode.recordClassIndex(24634);
            }

            public final void run() {
                SmartImageView.this.setController(b2.e());
            }
        });
    }

    public void setCircleOptions(com.bytedance.lighten.a.e eVar) {
        com.facebook.drawee.f.e eVar2;
        if (eVar != null) {
            if (((com.facebook.drawee.f.a) getHierarchy()).f47454a != null) {
                eVar2 = ((com.facebook.drawee.f.a) getHierarchy()).f47454a;
            } else {
                eVar2 = new com.facebook.drawee.f.e();
            }
            if (eVar.f39825g != null) {
                e.b bVar = eVar.f39825g;
                eVar2.a(bVar.f39835a, bVar.f39836b, bVar.f39837c, bVar.f39838d);
            }
            eVar2.f47476b = eVar.f39822d;
            eVar2.a(eVar.f39823e);
            eVar2.c(eVar.f39819a);
            eVar2.f47480f = eVar.f39820b;
            eVar2.a(eVar.f39821c);
            eVar2.d(eVar.f39824f);
            eVar2.f47475a = z.a(eVar.f39826h);
            ((com.facebook.drawee.f.a) getHierarchy()).a(eVar2);
        }
    }

    private void setController(com.facebook.imagepipeline.o.b[] bVarArr) {
        boolean z;
        if (bVarArr.length != 0) {
            com.facebook.drawee.a.a.e b2 = c.b();
            b2.f47325m = getController();
            b2.f47322j = this.f39941b.f39894c;
            if (this.f39941b.L > 0) {
                z = true;
            } else {
                z = false;
            }
            b2.f47321i = z;
            b2.f47314b = this.f39941b.A;
            final com.facebook.drawee.a.a.e eVar = (com.facebook.drawee.a.a.e) b2.a(bVarArr);
            if (!TextUtils.isEmpty(this.f39941b.A)) {
                eVar.f47314b = this.f39941b.A;
            }
            c cVar = this.f39942c;
            if (cVar != null) {
                cVar.a(this.f39941b);
                eVar.f47319g = this.f39942c;
            } else {
                c cVar2 = new c();
                this.f39942c = cVar2;
                cVar2.a(this.f39941b);
                eVar.f47319g = this.f39942c;
            }
            b.a.f39818a.execute(new Runnable() {
                /* class com.bytedance.lighten.loader.SmartImageView.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(24633);
                }

                public final void run() {
                    SmartImageView.this.setController(eVar.e());
                }
            });
        }
    }

    public void a(u uVar) {
        this.f39941b = uVar;
        if (uVar.I) {
            if (uVar.N == null || uVar.N.a()) {
                this.f39943d = uVar.f39892a.toString();
            } else {
                this.f39943d = uVar.N.f39811a.get(0);
            }
            ((com.facebook.drawee.f.a) getHierarchy()).a(0, (Drawable) null);
            com.facebook.common.h.a<Bitmap> a2 = a.C0978a.f39959a.a(this.f39943d);
            this.f39944e = a2;
            if (a2 != null && a2.d()) {
                Bitmap a3 = this.f39944e.a();
                if (!a3.isRecycled()) {
                    ((com.facebook.drawee.f.a) getHierarchy()).a(0, new p(new BitmapDrawable(a3), q.b.f47442h));
                } else {
                    ((com.facebook.drawee.f.a) getHierarchy()).a(0, (Drawable) null);
                }
            }
        }
        if (uVar.N == null || uVar.N.a()) {
            setController(q.a(uVar, uVar.f39892a));
        } else {
            setController(q.b(uVar));
        }
    }

    public SmartImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public SmartImageView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        a();
    }
}
