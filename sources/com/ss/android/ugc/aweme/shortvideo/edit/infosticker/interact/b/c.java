package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.editSticker.interact.d;
import com.ss.android.ugc.aweme.editSticker.interact.e;
import com.ss.android.ugc.aweme.editSticker.interact.hit.StickerHintTextViewModel;
import com.ss.android.ugc.aweme.property.av;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.edit.p;
import com.ss.android.ugc.aweme.shortvideo.sticker.d.b;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.x;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class c implements d, b {
    private com.ss.android.ugc.aweme.editSticker.c.b A;

    /* renamed from: a  reason: collision with root package name */
    private View f127182a;

    /* renamed from: b  reason: collision with root package name */
    private String f127183b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f127184c = true;

    /* renamed from: d  reason: collision with root package name */
    protected FrameLayout f127185d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f127186e = true;

    /* renamed from: f  reason: collision with root package name */
    public e f127187f;

    /* renamed from: g  reason: collision with root package name */
    protected Rect f127188g;

    /* renamed from: h  reason: collision with root package name */
    public int f127189h;

    /* renamed from: i  reason: collision with root package name */
    public int f127190i;

    /* renamed from: j  reason: collision with root package name */
    public g f127191j;

    /* renamed from: k  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.shortvideo.preview.a f127192k;

    /* renamed from: l  reason: collision with root package name */
    public com.ss.android.ugc.aweme.editSticker.interact.view.g f127193l;

    /* renamed from: m  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.editSticker.interact.view.g> f127194m = new ArrayList();
    public com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a n;
    protected com.ss.android.ugc.aweme.editSticker.interact.view.e o;
    protected b p;
    public VESize q;
    public a r;
    public boolean s = true;
    public Context t;
    StickerHintTextViewModel u;
    public boolean v = false;
    public Runnable w;
    public boolean x = true;
    public com.ss.android.ugc.aweme.tools.e.a<com.ss.android.ugc.aweme.editSticker.interact.view.g, com.ss.android.ugc.aweme.editSticker.interact.view.g> y;
    public EditToolbarViewModel z;

    static {
        Covode.recordClassIndex(83428);
    }

    /* access modifiers changed from: protected */
    public abstract com.ss.android.ugc.aweme.editSticker.interact.view.g a(Context context);

    /* access modifiers changed from: protected */
    public void a(com.ss.android.ugc.aweme.editSticker.interact.view.e eVar) {
    }

    public boolean b() {
        return false;
    }

    public int e() {
        return 2;
    }

    public abstract int f();

    public boolean g() {
        return false;
    }

    public boolean a(com.ss.android.ugc.aweme.editSticker.interact.view.g gVar) {
        if (gVar == null) {
            return false;
        }
        if (gVar.getParent() != null && gVar.getParent() != this.f127185d) {
            return false;
        }
        this.f127185d.removeView(gVar);
        this.f127193l = null;
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a aVar = this.n;
        if (aVar != null) {
            aVar.d();
        }
        this.f127194m.remove(gVar);
        this.v = true;
        return true;
    }

    public void a(boolean z2, boolean z3) {
        a(z2);
    }

    public void a(boolean z2) {
        com.ss.android.ugc.aweme.editSticker.c.b bVar;
        if (l()) {
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a aVar = this.n;
            if (aVar != null) {
                aVar.e();
            }
            com.ss.android.ugc.aweme.editSticker.interact.view.g a2 = a(this.t);
            this.f127193l = a2;
            if (!(a2 == null || (bVar = this.A) == null)) {
                a2.setMotionInterceptor(bVar);
            }
            b(this.f127193l);
            this.f127193l.a(this.f127189h, this.f127190i);
            this.f127193l.setStickerEditListener(new com.ss.android.ugc.aweme.editSticker.interact.a.a() {
                /* class com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(83429);
                }

                @Override // com.ss.android.ugc.aweme.editSticker.interact.a.a
                public final void a() {
                    if (c.this.n != null) {
                        c.this.n.a();
                    }
                }

                @Override // com.ss.android.ugc.aweme.editSticker.interact.a.a
                public final void b() {
                    if (c.this.n != null) {
                        c.this.n.b();
                    }
                }

                @Override // com.ss.android.ugc.aweme.editSticker.interact.a.a
                public final void c() {
                    if (c.this.n != null) {
                        c.this.n.a(c.this.f127193l.getDrawView());
                    }
                }

                @Override // com.ss.android.ugc.aweme.editSticker.interact.a.a
                public final void d() {
                    if (c.this.n != null) {
                        c.this.n.c();
                    }
                    if (av.a()) {
                        c.this.z.c(false);
                    }
                }

                @Override // com.ss.android.ugc.aweme.editSticker.interact.a.a
                public final PointF e() {
                    if (c.this.o == null || c.this.f127193l == null) {
                        return new PointF(0.0f, 0.0f);
                    }
                    PointF[] fourAnglePoint = c.this.f127193l.getFourAnglePoint();
                    for (PointF pointF : fourAnglePoint) {
                        pointF.x += 0.0f;
                        pointF.y += 0.0f;
                    }
                    return c.this.o.a(fourAnglePoint);
                }

                @Override // com.ss.android.ugc.aweme.editSticker.interact.a.a
                public final Float a(float f2) {
                    if (c.this.o != null) {
                        return Float.valueOf(c.this.o.a(f2));
                    }
                    return Float.valueOf(f2);
                }

                @Override // com.ss.android.ugc.aweme.editSticker.interact.a.a
                public final boolean b(float f2) {
                    if (c.this.o != null) {
                        return c.this.o.a(c.this.f127193l.getFourAnglePoint(), f2);
                    }
                    return true;
                }

                @Override // com.ss.android.ugc.aweme.editSticker.interact.a.a
                public final boolean c(float f2) {
                    if (c.this.o != null) {
                        return c.this.o.b(c.this.f127193l.getFourAnglePoint(), f2);
                    }
                    return true;
                }

                @Override // com.ss.android.ugc.aweme.editSticker.interact.a.a
                public final void a(boolean z) {
                    if (c.this.n != null) {
                        c.this.n.b(z);
                        if (z) {
                            c.this.j();
                        }
                    }
                }

                @Override // com.ss.android.ugc.aweme.editSticker.interact.a.a
                public final void a(com.ss.android.ugc.aweme.editSticker.interact.view.g gVar, boolean z) {
                    c.this.a(gVar, z);
                }

                @Override // com.ss.android.ugc.aweme.editSticker.interact.a.a
                public final boolean b(float f2, float f3) {
                    if (c.this.o != null) {
                        return c.this.o.b(c.this.f127193l.getFourAnglePoint(), f2, f3);
                    }
                    return true;
                }

                @Override // com.ss.android.ugc.aweme.editSticker.interact.a.a
                public final PointF a(float f2, float f3) {
                    if (c.this.o == null || c.this.f127193l == null) {
                        return new PointF(0.0f, 0.0f);
                    }
                    PointF[] fourAnglePoint = c.this.f127193l.getFourAnglePoint();
                    for (PointF pointF : fourAnglePoint) {
                        pointF.x += f2;
                        pointF.y += f3;
                    }
                    return c.this.o.a(fourAnglePoint, f2, f3);
                }

                @Override // com.ss.android.ugc.aweme.editSticker.interact.a.a
                public final int a(boolean z, boolean z2, boolean z3, boolean z4) {
                    if (c.this.o == null) {
                        return -1;
                    }
                    if (z) {
                        c.this.o.b();
                        return -1;
                    } else if (c.this.f127193l != null) {
                        return c.this.o.a(c.this.f127193l.getFourAnglePoint(), z2, z3, z4, z3, z3);
                    } else {
                        return -1;
                    }
                }
            });
            this.f127194m.add(0, this.f127193l);
            if (this.x && !z2 && this.u != null && f() != 0) {
                this.f127193l.postDelayed(new d(this), 500);
            }
        }
    }

    public final boolean a() {
        com.ss.android.ugc.aweme.editSticker.interact.view.g gVar = this.f127193l;
        if (gVar == null) {
            return false;
        }
        return gVar.n();
    }

    public void a(String str) {
        this.f127183b = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0016  */
    @Override // com.ss.android.ugc.aweme.editSticker.interact.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.graphics.RectF r6) {
        /*
            r5 = this;
            java.util.List<com.ss.android.ugc.aweme.editSticker.interact.view.g> r0 = r5.f127194m
            boolean r0 = com.bytedance.common.utility.h.a(r0)
            r4 = 0
            if (r0 == 0) goto L_0x000a
            return r4
        L_0x000a:
            java.util.List<com.ss.android.ugc.aweme.editSticker.interact.view.g> r0 = r5.f127194m
            java.util.Iterator r3 = r0.iterator()
        L_0x0010:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r3.next()
            com.ss.android.ugc.aweme.editSticker.interact.view.g r0 = (com.ss.android.ugc.aweme.editSticker.interact.view.g) r0
            android.graphics.PointF[] r0 = r0.getFourAnglePoint()
            android.graphics.RectF r2 = com.ss.android.ugc.aweme.editSticker.f.b.a(r0)
            float r1 = r2.top
            float r0 = r6.top
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0034
            float r1 = r2.bottom
            float r0 = r6.bottom
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0010
        L_0x0034:
            r0 = 1
            return r0
        L_0x0036:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c.a(android.graphics.RectF):boolean");
    }

    public void d() {
        com.ss.android.ugc.aweme.editSticker.interact.view.g gVar = this.f127193l;
        if (gVar != null) {
            a(gVar);
        }
    }

    /* access modifiers changed from: protected */
    public a h() {
        return new a();
    }

    public final void i() {
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a aVar = this.n;
        if (aVar != null) {
            aVar.a();
        }
    }

    public boolean l() {
        if (this.f127193l == null) {
            return true;
        }
        return false;
    }

    public b o() {
        return new b();
    }

    public String p() {
        String str = this.f127183b;
        if (str != null) {
            return str.replace("interact_sticker.png", "");
        }
        return "";
    }

    private void q() {
        this.u = (StickerHintTextViewModel) ae.a((androidx.fragment.app.e) this.t, (ad.b) null).a(StickerHintTextViewModel.class);
    }

    public final void m() {
        StickerHintTextViewModel stickerHintTextViewModel = this.u;
        if (stickerHintTextViewModel != null) {
            stickerHintTextViewModel.a().postValue(true);
        }
    }

    public final void n() {
        com.ss.android.ugc.aweme.editSticker.interact.view.g gVar = this.f127193l;
        if (gVar != null) {
            gVar.l();
            StickerHintTextViewModel stickerHintTextViewModel = this.u;
            if (stickerHintTextViewModel != null) {
                stickerHintTextViewModel.a().postValue(true);
            }
        }
    }

    public final void k() {
        g gVar = this.f127191j;
        if (gVar != null) {
            VESize b2 = gVar.b();
            if (b2.width != 0 && b2.height != 0) {
                int[] a2 = com.ss.android.ugc.aweme.editSticker.f.g.a(this.f127185d, b2.width, b2.height);
                this.f127189h = a2[0];
                this.f127190i = a2[1];
                r();
            }
        }
    }

    private void r() {
        ViewGroup.LayoutParams layoutParams = this.f127185d.getLayoutParams();
        this.f127188g = new Rect(0, 0, layoutParams.width, layoutParams.height);
        com.ss.android.ugc.aweme.editSticker.interact.view.g gVar = this.f127193l;
        if (gVar != null) {
            gVar.a(this.f127189h, this.f127190i);
        }
        View view = this.f127182a;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.width = layoutParams.width;
            layoutParams2.height = layoutParams.height;
            this.f127182a.setLayoutParams(layoutParams2);
        }
        com.ss.android.ugc.aweme.editSticker.interact.view.e eVar = this.o;
        if (eVar != null) {
            this.f127185d.removeView(eVar.getContentView());
        }
        com.ss.android.ugc.aweme.editSticker.interact.view.a aVar = com.ss.android.ugc.aweme.editSticker.d.c().f88097d;
        if (aVar != null) {
            com.ss.android.ugc.aweme.editSticker.interact.view.e a2 = aVar.a(this.t, this.f127189h);
            this.o = a2;
            a(a2);
            this.f127185d.addView(this.o.getContentView());
        }
    }

    public final void j() {
        ViewGroup viewGroup;
        com.ss.android.ugc.aweme.editSticker.interact.view.g gVar;
        if (this.f127185d != null && this.f127193l != null && this.o != null) {
            Runnable runnable = this.w;
            if (runnable != null) {
                runnable.run();
            }
            if (this.f127185d.getChildCount() > 1) {
                FrameLayout frameLayout = this.f127185d;
                View childAt = frameLayout.getChildAt(frameLayout.getChildCount() - 1);
                com.ss.android.ugc.aweme.editSticker.interact.view.g gVar2 = this.f127193l;
                if (childAt != gVar2) {
                    this.f127185d.removeView(gVar2);
                    this.f127185d.addView(this.f127193l);
                }
            }
            if (this.f127194m.size() > 1 && this.f127194m.get(0) != (gVar = this.f127193l)) {
                this.f127194m.remove(gVar);
                this.f127194m.add(0, this.f127193l);
            }
            com.ss.android.ugc.aweme.editSticker.interact.view.e eVar = this.o;
            if (!(eVar == null || (viewGroup = (ViewGroup) eVar.getContentView().getParent()) == null)) {
                viewGroup.removeView(this.o.getContentView());
                viewGroup.addView(this.o.getContentView());
            }
            if (this.f127194m.size() > 0) {
                this.f127194m.get(0);
                com.ss.android.ugc.aweme.tools.e.a<com.ss.android.ugc.aweme.editSticker.interact.view.g, com.ss.android.ugc.aweme.editSticker.interact.view.g> aVar = this.y;
                if (aVar != null) {
                    aVar.a(this.f127193l);
                }
            }
        }
    }

    public class a extends com.bytedance.f.a.a.a.a {
        static {
            Covode.recordClassIndex(83430);
        }

        public a() {
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean a(float f2) {
            if (!c.this.f127186e) {
                return false;
            }
            for (com.ss.android.ugc.aweme.editSticker.interact.view.g gVar : c.this.f127194m) {
                if (gVar != null && (gVar.b(f2) || gVar.f88222k)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean c(MotionEvent motionEvent) {
            if (!c.this.f127186e) {
                return false;
            }
            for (com.ss.android.ugc.aweme.editSticker.interact.view.g gVar : c.this.f127194m) {
                if (gVar != null && gVar.k()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public boolean f(MotionEvent motionEvent) {
            if (!c.this.f127186e) {
                return false;
            }
            for (com.ss.android.ugc.aweme.editSticker.interact.view.g gVar : c.this.f127194m) {
                if (gVar != null && gVar.b(motionEvent)) {
                    c.this.m();
                    return true;
                }
            }
            if (c.this.f127187f != null) {
                c.this.f127187f.b();
            }
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public boolean b(MotionEvent motionEvent) {
            c.this.v = false;
            if (!c.this.f127186e) {
                return false;
            }
            for (com.ss.android.ugc.aweme.editSticker.interact.view.g gVar : c.this.f127194m) {
                if (gVar != null && gVar.a(motionEvent)) {
                    if (!c.this.g()) {
                        return true;
                    }
                    c.this.f127193l.post(new e(c.this));
                    return true;
                }
            }
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean a(ScaleGestureDetector scaleGestureDetector) {
            if (!c.this.f127186e) {
                return false;
            }
            for (com.ss.android.ugc.aweme.editSticker.interact.view.g gVar : c.this.f127194m) {
                if (gVar != null && (gVar.b(scaleGestureDetector) || gVar.f88222k)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean b(ScaleGestureDetector scaleGestureDetector) {
            if (!c.this.f127186e) {
                return false;
            }
            for (com.ss.android.ugc.aweme.editSticker.interact.view.g gVar : c.this.f127194m) {
                if (gVar != null && (gVar.a(scaleGestureDetector) || gVar.f88222k)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean a(com.ss.android.ugc.tools.utils.a.b bVar) {
            if (!c.this.f127186e) {
                return false;
            }
            for (com.ss.android.ugc.aweme.editSticker.interact.view.g gVar : c.this.f127194m) {
                if (gVar != null && (gVar.a(bVar) || gVar.f88222k)) {
                    c.this.m();
                    return true;
                }
            }
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean a(com.ss.android.ugc.tools.utils.a.c cVar) {
            if (!c.this.f127186e) {
                return false;
            }
            for (com.ss.android.ugc.aweme.editSticker.interact.view.g gVar : c.this.f127194m) {
                if (gVar != null && (gVar.a(cVar) || gVar.f88222k)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean a(com.ss.android.ugc.tools.utils.a.b bVar, float f2, float f3) {
            if (!c.this.f127186e) {
                return false;
            }
            for (com.ss.android.ugc.aweme.editSticker.interact.view.g gVar : c.this.f127194m) {
                if (gVar != null && (gVar.f() || gVar.f88222k)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (!c.this.f127186e) {
                return false;
            }
            for (com.ss.android.ugc.aweme.editSticker.interact.view.g gVar : c.this.f127194m) {
                if (gVar != null && (gVar.f88220i || System.currentTimeMillis() - gVar.o < 300)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (!c.this.f127186e) {
                return false;
            }
            for (com.ss.android.ugc.aweme.editSticker.interact.view.g gVar : c.this.f127194m) {
                if (gVar != null && (gVar.f88220i || System.currentTimeMillis() - gVar.o < 300)) {
                    return true;
                }
            }
            if (!c.this.v) {
                return false;
            }
            c.this.v = false;
            return true;
        }
    }

    public void a(float f2) {
        com.ss.android.ugc.aweme.editSticker.interact.view.g gVar = this.f127193l;
        if (gVar != null) {
            gVar.setAlpha(f2);
        }
    }

    public void b(com.ss.android.ugc.aweme.editSticker.interact.view.g gVar) {
        this.f127185d.addView(gVar, 0);
    }

    public final void a(com.ss.android.ugc.aweme.editSticker.c.b bVar) {
        this.A = bVar;
        com.ss.android.ugc.aweme.editSticker.interact.view.g gVar = this.f127193l;
        if (gVar != null) {
            gVar.setMotionInterceptor(bVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.d.b
    public final void b(boolean z2) {
        com.ss.android.ugc.aweme.editSticker.interact.view.g gVar = this.f127193l;
        if (gVar != null) {
            gVar.setLockMode(z2);
        }
    }

    public static float b(float f2) {
        return new BigDecimal((double) f2).setScale(4, 1).floatValue();
    }

    public final PointF a(PointF pointF) {
        int i2;
        int i3;
        PointF pointF2 = new PointF();
        VESize vESize = this.q;
        if (vESize == null) {
            i2 = dh.b(this.f127193l.getContext());
            i3 = dh.a(this.f127193l.getContext());
        } else {
            i2 = vESize.width;
            i3 = this.q.height;
        }
        pointF2.set(b((pointF.x * 1.0f) / ((float) i2)), b((pointF.y * 1.0f) / ((float) i3)));
        return pointF2;
    }

    public final Point b(PointF pointF) {
        int i2;
        int i3;
        Point point = new Point();
        VESize vESize = this.q;
        if (vESize == null) {
            i2 = dh.b(this.f127193l.getContext());
            i3 = dh.a(this.f127193l.getContext());
        } else {
            i2 = vESize.width;
            i3 = this.q.height;
        }
        point.set((int) (((float) i2) * pointF.x), (int) (((float) i3) * pointF.y));
        return point;
    }

    public final InteractStickerStruct d(int i2) {
        if (!b() || this.f127193l == null) {
            return null;
        }
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        interactStickerStruct.setType(i2);
        LinkedList linkedList = new LinkedList();
        NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
        normalTrackTimeStamp.setRotation(b(this.f127193l.getRotateAngle()));
        normalTrackTimeStamp.setScale(Float.valueOf(this.f127193l.getScale()));
        PointF a2 = a(this.f127193l.getCenterViewPoint());
        normalTrackTimeStamp.setX(a2.x);
        normalTrackTimeStamp.setY(a2.y);
        normalTrackTimeStamp.setStartTime(0.0f);
        normalTrackTimeStamp.setEndTime(0.0f);
        PointF a3 = a(new PointF((float) this.f127193l.getContentViewWidth(), (float) this.f127193l.getContentViewHeight()));
        normalTrackTimeStamp.setWidth(a3.x);
        normalTrackTimeStamp.setHeight(a3.y);
        linkedList.add(normalTrackTimeStamp);
        com.ss.android.ugc.aweme.editSticker.f.e.a(interactStickerStruct, linkedList);
        return interactStickerStruct;
    }

    public void a(InteractStickerStruct interactStickerStruct) {
        a(interactStickerStruct, (Boolean) true);
    }

    public void a(Context context, FrameLayout frameLayout) {
        this.t = context;
        this.f127185d = frameLayout;
        this.r = h();
        q();
        this.p = o();
    }

    public final void b(Context context, FrameLayout frameLayout) {
        this.t = context;
        this.f127185d = frameLayout;
        this.r = h();
        q();
        this.z = (EditToolbarViewModel) t.a((androidx.fragment.app.e) this.t).a(EditToolbarViewModel.class);
        this.p = o();
    }

    public void a(g gVar, com.ss.android.ugc.aweme.shortvideo.preview.a aVar) {
        this.f127192k = aVar;
        if (gVar != null && this.f127191j == null) {
            VESize b2 = gVar.b();
            if (b2.width != 0 && b2.height != 0) {
                this.f127191j = gVar;
                int[] a2 = com.ss.android.ugc.aweme.editSticker.f.g.a(this.f127185d, b2.width, b2.height);
                this.f127189h = a2[0];
                this.f127190i = a2[1];
                r();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(com.ss.android.ugc.aweme.editSticker.interact.view.g gVar, boolean z2) {
        com.ss.android.ugc.aweme.editSticker.interact.view.g gVar2;
        com.ss.android.ugc.aweme.shortvideo.preview.a aVar;
        this.f127193l = gVar;
        if (gVar != null) {
            if (z2) {
                gVar.setAlpha(1.0f);
            }
            boolean z3 = false;
            if (z2) {
                this.f127184c = true;
            } else if (this.f127184c) {
                j();
                this.f127184c = false;
            }
            boolean a2 = com.ss.android.ugc.aweme.editSticker.f.b.a(this.f127188g, gVar.getFourAnglePoint());
            PointF centerViewPoint = this.f127193l.getCenterViewPoint();
            if (this.f127187f != null) {
                z3 = true;
            }
            if (z3 && (!g())) {
                int a3 = this.f127187f.a((int) (centerViewPoint.x + ((float) this.f127189h)), (int) (centerViewPoint.y + ((float) this.f127190i)), z2, a2);
                com.ss.android.ugc.aweme.editSticker.interact.view.g gVar3 = this.f127193l;
                if (a3 != 1 && a3 == 3) {
                    a(gVar3);
                }
            }
            if (p.a() && (aVar = this.f127192k) != null) {
                if (!z2) {
                    g gVar4 = this.f127191j;
                    if (!(gVar4 == null || gVar4.f() == x.j.PAUSED)) {
                        this.f127192k.v().setValue(dmt.av.video.t.b());
                    }
                } else if (aVar.m() != 1) {
                    this.f127192k.v().setValue(dmt.av.video.t.a());
                }
            }
            if (!(this.f127187f == null || (gVar2 = this.f127193l) == null)) {
                gVar2.setAlpha(1.0f);
            }
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a aVar2 = this.n;
            if (aVar2 != null) {
                aVar2.a(z2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.d.b
    public void a(InteractStickerStruct interactStickerStruct, Boolean bool) {
        NormalTrackTimeStamp a2;
        if (interactStickerStruct != null && (a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(interactStickerStruct)) != null && this.f127193l != null) {
            Point b2 = b(new PointF(a2.getX(), a2.getY()));
            PointF centerViewPoint = this.f127193l.getCenterViewPoint();
            this.f127193l.a(((float) b2.x) - centerViewPoint.x, ((float) b2.y) - centerViewPoint.y, bool);
            this.f127193l.b();
            this.f127193l.a(-a2.getRotation(), bool);
            this.f127193l.a(a2.getScale().floatValue());
        }
    }

    public final i<com.ss.android.ugc.aweme.editSticker.compile.b> a(String str, int i2, int i3, int i4, int i5) {
        com.ss.android.ugc.aweme.editSticker.interact.view.g gVar = this.f127193l;
        if (gVar != null) {
            gVar.l();
        }
        return this.p.a(this.f127193l, this.f127185d, str, i2, i3, i4, i5);
    }
}
