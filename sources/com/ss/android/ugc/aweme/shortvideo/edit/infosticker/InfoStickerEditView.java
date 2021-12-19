package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.e;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.editSticker.a.k;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.dg;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.ss.android.ugc.tools.utils.o;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.z;
import h.f.b.l;
import java.util.Iterator;

public class InfoStickerEditView extends View {
    private static int N = 3000;

    /* renamed from: m  reason: collision with root package name */
    public static int f127066m = 1;
    public boolean A;
    public boolean B;
    public Context C;
    public b D;
    public com.ss.android.ugc.aweme.shortvideo.sticker.a.c E = new com.ss.android.ugc.aweme.shortvideo.sticker.a.c(this, new a(this, (byte) 0));
    public PointF F = new PointF();
    public InfoStickerViewModel G;
    public com.ss.android.ugc.aweme.shortvideo.edit.d.a H;
    public boolean I = false;
    public com.ss.android.ugc.aweme.editSticker.interact.b J;
    public boolean K = true;
    public boolean L = false;
    Runnable M = new Runnable() {
        /* class com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView.AnonymousClass2 */

        static {
            Covode.recordClassIndex(83377);
        }

        public final void run() {
            if (InfoStickerEditView.this.f127073g != null && InfoStickerEditView.this.n != null && InfoStickerEditView.this.n.f127086a != null && InfoStickerEditView.this.n.f127086a.f127115d) {
                InfoStickerEditView.this.B = false;
                InfoStickerEditView.this.n.f127086a.f127115d = false;
                InfoStickerEditView.this.f127073g.b();
                InfoStickerEditView.this.E.b();
                InfoStickerEditView.this.invalidate();
            }
        }
    };
    private Point O;
    private b P;
    private i.b Q;
    private EditInfoStickerViewModel R;
    private com.ss.android.ugc.aweme.editSticker.c.b S = com.ss.android.ugc.aweme.editSticker.c.a.f88100a;

    /* renamed from: a  reason: collision with root package name */
    public int f127067a;

    /* renamed from: b  reason: collision with root package name */
    public int f127068b;

    /* renamed from: c  reason: collision with root package name */
    public int f127069c;

    /* renamed from: d  reason: collision with root package name */
    public int f127070d;

    /* renamed from: e  reason: collision with root package name */
    public g f127071e;

    /* renamed from: f  reason: collision with root package name */
    public SafeHandler f127072f;

    /* renamed from: g  reason: collision with root package name */
    public c f127073g;

    /* renamed from: h  reason: collision with root package name */
    public VideoPublishEditModel f127074h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f127075i = true;

    /* renamed from: j  reason: collision with root package name */
    com.ss.android.ugc.aweme.tools.e.b<aj> f127076j;

    /* renamed from: k  reason: collision with root package name */
    com.ss.android.ugc.aweme.tools.e.b<aj> f127077k;

    /* renamed from: l  reason: collision with root package name */
    public int f127078l;
    public c n = new c();
    public int o;
    public boolean p;
    public long q;
    public boolean r;
    public float s;
    public float t;
    public float u;
    public float v;
    public i.c w;
    public boolean x = true;
    public boolean y = true;
    public boolean z;

    /* access modifiers changed from: package-private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        aj f127086a;

        /* renamed from: b  reason: collision with root package name */
        int f127087b;

        /* renamed from: c  reason: collision with root package name */
        boolean f127088c;

        static {
            Covode.recordClassIndex(83380);
        }

        c() {
        }
    }

    public b getGestureListener() {
        return this.D;
    }

    class a implements k {
        static {
            Covode.recordClassIndex(83378);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.k
        public final void d() {
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.k
        public final void e() {
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.k
        public final void f() {
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.k
        public final void g() {
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.k
        public final void b() {
            InfoStickerEditView.this.d();
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.k
        public final void a() {
            InfoStickerEditView infoStickerEditView = InfoStickerEditView.this;
            if (infoStickerEditView.n.f127086a == null) {
                infoStickerEditView.setShowHelpBox(false);
            } else if (infoStickerEditView.x) {
                infoStickerEditView.o = 1;
                c cVar = infoStickerEditView.f127073g;
                infoStickerEditView.n.f127086a.f127115d = false;
                cVar.b();
                infoStickerEditView.f127073g.c();
                if (infoStickerEditView.f127076j != null) {
                    infoStickerEditView.f127076j.a(infoStickerEditView.n.f127086a);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.k
        public final void c() {
            InfoStickerEditView infoStickerEditView = InfoStickerEditView.this;
            if (infoStickerEditView.n.f127086a == null) {
                infoStickerEditView.setShowHelpBox(false);
                return;
            }
            infoStickerEditView.o = 1;
            infoStickerEditView.n.f127086a.f127115d = false;
            infoStickerEditView.f127073g.c();
            if (infoStickerEditView.f127077k != null) {
                infoStickerEditView.f127077k.a(infoStickerEditView.n.f127086a);
            }
            d.a("prop_pin", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_edit_page").a("shoot_way", infoStickerEditView.f127074h.mShootWay).a("creation_id", infoStickerEditView.f127074h.creationId).a("content_type", infoStickerEditView.f127074h.getAvetParameter().getContentType()).a("content_source", infoStickerEditView.f127074h.getAvetParameter().getContentSource()).a("prop_id", infoStickerEditView.n.f127086a.f127114c.stickerId).a("is_diy_prop", infoStickerEditView.n.f127086a.f127124m ? 1 : 0).f149193a);
        }

        private a() {
        }

        /* synthetic */ a(InfoStickerEditView infoStickerEditView, byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(83375);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f127073g.d();
        invalidate();
    }

    public final void f() {
        this.f127072f.postDelayed(new g(this), 300);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E.f();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E.g();
    }

    public final void c() {
        this.B = false;
        for (aj ajVar : this.f127073g.f127131a) {
            ajVar.f127115d = false;
        }
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.editSticker.interact.b g() {
        StickerItemModel stickerItemModel = this.n.f127086a.f127114c;
        return new com.ss.android.ugc.aweme.editSticker.interact.b(stickerItemModel.rotateAngle, stickerItemModel.scale, stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY);
    }

    public int getStickNumber() {
        Iterator<aj> it = this.f127073g.f127131a.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    public final boolean e() {
        if (this.o == 1) {
            return true;
        }
        c cVar = this.n;
        if (cVar == null || cVar.f127086a == null) {
            return false;
        }
        if (this.n.f127088c) {
            this.n.f127086a.f127114c.getId();
            this.f127073g.d(this.n.f127086a);
            invalidate();
            return false;
        }
        this.f127073g.b(this.n.f127086a);
        return false;
    }

    public final void a() {
        g gVar;
        int e2;
        if ((this.f127069c == 0 || this.f127070d == 0) && (gVar = this.f127071e) != null) {
            VESize b2 = gVar.b();
            this.f127069c = b2.width;
            this.f127070d = b2.height;
            int b3 = dh.b(getContext());
            int i2 = this.f127069c;
            this.f127067a = (b3 - i2) >> 1;
            if (dg.a(i2, this.f127070d)) {
                e2 = 0;
            } else {
                e2 = (((dh.e(getContext()) - com.ss.android.ugc.aweme.adaptation.a.f66177a.f()) - com.ss.android.ugc.aweme.adaptation.a.f66177a.d()) - this.f127070d) / 2;
            }
            this.f127068b = e2;
        }
    }

    public final void d() {
        if (!this.S.a()) {
            setShowHelpBox(true);
            this.o = 1;
            c cVar = this.f127073g;
            aj ajVar = this.n.f127086a;
            if (cVar.f127137g != null) {
                cVar.f127137g.a();
            }
            if (cVar.f127132b != ajVar) {
                cVar.b();
                cVar.f127132b = ajVar;
            }
            cVar.f127132b.f127115d = true;
            cVar.f127132b.f127114c.getId();
            cVar.f127135e.b(cVar.f127132b.f127114c.getId(), 0, cVar.f127133c);
            if (this.R == null) {
                this.R = (EditInfoStickerViewModel) t.a((e) this.C).a(EditInfoStickerViewModel.class);
            }
            EditInfoStickerViewModel editInfoStickerViewModel = this.R;
            StickerItemModel stickerItemModel = this.n.f127086a.f127114c;
            l.d(stickerItemModel, "");
            editInfoStickerViewModel.c(new EditInfoStickerViewModel.b(stickerItemModel));
        }
    }

    public void setHavePinEdit(boolean z2) {
        this.y = z2;
    }

    public void setHaveTimeEdit(boolean z2) {
        this.x = z2;
    }

    public void setITimeEditListener(b bVar) {
        this.P = bVar;
    }

    public void setMotionInterceptor(com.ss.android.ugc.aweme.editSticker.c.b bVar) {
        this.S = bVar;
    }

    public void setOnInfoStickerPinEditClick(com.ss.android.ugc.aweme.tools.e.b<aj> bVar) {
        this.f127077k = bVar;
    }

    public void setOnInfoStickerTimeEdit(com.ss.android.ugc.aweme.tools.e.b<aj> bVar) {
        this.f127076j = bVar;
    }

    public void setPinHelper(com.ss.android.ugc.aweme.shortvideo.edit.d.a aVar) {
        this.H = aVar;
    }

    public void setStickerOnMoveListener(i.c cVar) {
        this.w = cVar;
    }

    public void setStickerOnPlayListener(i.b bVar) {
        this.Q = bVar;
    }

    public class b extends com.bytedance.f.a.a.a.a {
        static {
            Covode.recordClassIndex(83379);
        }

        private b() {
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean c(float f2) {
            if (!InfoStickerEditView.this.f127075i) {
                return false;
            }
            InfoStickerEditView.this.f();
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final void b(com.ss.android.ugc.tools.utils.a.b bVar) {
            if (InfoStickerEditView.this.f127075i) {
                InfoStickerEditView.this.w.a(InfoStickerEditView.this.n.f127086a, true, false);
                System.currentTimeMillis();
                InfoStickerEditView.this.f();
            }
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean b(float f2) {
            if (!InfoStickerEditView.this.f127075i) {
                return false;
            }
            InfoStickerEditView.this.f();
            InfoStickerEditView.this.w.a(InfoStickerEditView.this.n.f127086a, true, true);
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean a(float f2) {
            if (!InfoStickerEditView.this.f127075i) {
                return false;
            }
            if (InfoStickerEditView.this.n.f127086a == null) {
                return super.a(f2);
            }
            InfoStickerEditView.this.o = 2;
            float degrees = (float) Math.toDegrees((double) f2);
            if (Math.abs(degrees) > 10.0f) {
                degrees = 0.0f;
            }
            if (4 == InfoStickerEditView.this.w.a(InfoStickerEditView.this.n.f127086a, false, true)) {
                degrees = InfoStickerEditView.this.w.a(degrees).floatValue();
            }
            InfoStickerEditView.this.f127073g.a(InfoStickerEditView.this.n.f127086a, -degrees);
            InfoStickerEditView.this.invalidate();
            return true;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean c(MotionEvent motionEvent) {
            if (!InfoStickerEditView.this.r) {
                if (InfoStickerEditView.this.f127073g != null) {
                    float y = motionEvent.getY() - ((float) com.ss.android.ugc.aweme.adaptation.a.f66177a.d());
                    c cVar = InfoStickerEditView.this.f127073g;
                    int x = (int) motionEvent.getX();
                    int i2 = (int) y;
                    if (!(cVar.f127131a == null || cVar.f127131a.size() == 0)) {
                        for (aj ajVar : cVar.f127131a) {
                            if (ajVar.f127118g.contains((float) x, (float) i2)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            } else if (!InfoStickerEditView.this.B) {
                return false;
            } else {
                InfoStickerEditView.this.B = false;
                return true;
            }
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean a(ScaleGestureDetector scaleGestureDetector) {
            if (!InfoStickerEditView.this.f127075i) {
                return false;
            }
            scaleGestureDetector.getScaleFactor();
            if (InfoStickerEditView.this.n.f127086a == null) {
                return super.a(scaleGestureDetector);
            }
            InfoStickerEditView.this.o = 2;
            InfoStickerEditView.this.f127073g.b(InfoStickerEditView.this.n.f127086a, scaleGestureDetector.getScaleFactor());
            InfoStickerEditView.this.invalidate();
            return true;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean b(ScaleGestureDetector scaleGestureDetector) {
            if (!InfoStickerEditView.this.f127075i) {
                return false;
            }
            scaleGestureDetector.getScaleFactor();
            scaleGestureDetector.getFocusX();
            scaleGestureDetector.getFocusY();
            InfoStickerEditView.this.a(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            if (InfoStickerEditView.this.n.f127086a == null) {
                return false;
            }
            InfoStickerEditView infoStickerEditView = InfoStickerEditView.this;
            infoStickerEditView.A = infoStickerEditView.B;
            InfoStickerEditView.this.f127073g.b();
            InfoStickerEditView.this.f127073g.d(InfoStickerEditView.this.n.f127086a);
            InfoStickerEditView.this.n.f127086a.f127115d = false;
            InfoStickerEditView.this.f127073g.a(InfoStickerEditView.this.n.f127086a);
            InfoStickerEditView.this.invalidate();
            return true;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean f(MotionEvent motionEvent) {
            boolean z = false;
            InfoStickerEditView.this.I = false;
            InfoStickerEditView.this.F.set(motionEvent.getRawX(), motionEvent.getRawY());
            if (!InfoStickerEditView.this.f127075i) {
                return false;
            }
            if (!(InfoStickerEditView.this.w == null || InfoStickerEditView.this.n.f127086a == null || InfoStickerEditView.this.n.f127087b != 0)) {
                InfoStickerEditView.this.w.a(InfoStickerEditView.this.n.f127086a, (int) InfoStickerEditView.this.s, (int) InfoStickerEditView.this.t, true, false);
                if ((InfoStickerEditView.this.n.f127086a == null || InfoStickerEditView.this.n.f127086a != null) && InfoStickerEditView.this.A) {
                    InfoStickerEditView.this.A = false;
                }
            }
            if (System.currentTimeMillis() - InfoStickerEditView.this.q < 200) {
                if (InfoStickerEditView.this.n.f127086a == null) {
                    InfoStickerEditView infoStickerEditView = InfoStickerEditView.this;
                    c cVar = infoStickerEditView.f127073g;
                    if (cVar.f127132b != null) {
                        z = true;
                    }
                    cVar.b();
                    infoStickerEditView.r = z;
                    InfoStickerEditView.this.E.b();
                    InfoStickerEditView.this.invalidate();
                } else {
                    InfoStickerEditView.this.r = false;
                    if (InfoStickerEditView.this.n.f127087b == 0) {
                        InfoStickerEditView.this.d();
                    }
                    InfoStickerEditView.this.f127073g.a();
                    InfoStickerEditView.this.f();
                    InfoStickerEditView.this.invalidate();
                }
                if (!InfoStickerEditView.this.B) {
                    InfoStickerEditView.this.e();
                    if (!(InfoStickerEditView.this.n == null || InfoStickerEditView.this.n.f127086a == null)) {
                        InfoStickerEditView.this.n.f127086a = null;
                    }
                }
                return true;
            }
            if (!InfoStickerEditView.this.B) {
                InfoStickerEditView.this.e();
                if (!(InfoStickerEditView.this.n == null || InfoStickerEditView.this.n.f127086a == null)) {
                    InfoStickerEditView.this.n.f127086a = null;
                }
            }
            return super.f(motionEvent);
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean a(com.ss.android.ugc.tools.utils.a.b bVar) {
            if (!InfoStickerEditView.this.f127075i) {
                return false;
            }
            float f2 = bVar.f149983i.x;
            float f3 = bVar.f149983i.y;
            float f4 = InfoStickerEditView.this.s + f2;
            float f5 = InfoStickerEditView.this.t + f3;
            float abs = Math.abs(f4 - InfoStickerEditView.this.u);
            float abs2 = Math.abs(f5 - InfoStickerEditView.this.v);
            if (InfoStickerEditView.this.n.f127086a == null) {
                return false;
            }
            if (abs < 5.0f && abs2 < 5.0f) {
                return true;
            }
            int a2 = InfoStickerEditView.this.w.a(InfoStickerEditView.this.n.f127086a, false, false);
            if (3 == a2) {
                PointF a3 = InfoStickerEditView.this.w.a(InfoStickerEditView.this.n.f127086a, f2, f3);
                f2 = a3.x;
                f3 = a3.y;
                f4 = InfoStickerEditView.this.s + a3.x;
                f5 = InfoStickerEditView.this.t + a3.y;
            } else if (4 == a2) {
                new h(this);
            }
            if (InfoStickerEditView.this.n.f127087b == 0) {
                if (InfoStickerEditView.this.w != null) {
                    if (InfoStickerEditView.this.n.f127086a.f127115d) {
                        InfoStickerEditView.this.A = true;
                    }
                    InfoStickerEditView.this.w.a(InfoStickerEditView.this.n.f127086a, (int) f4, (int) f5, false, false);
                }
                InfoStickerEditView.this.s = f4;
                InfoStickerEditView.this.t = f5;
            }
            InfoStickerEditView.this.o = 2;
            if (InfoStickerEditView.this.n.f127087b == 0) {
                InfoStickerEditView.this.f127073g.a(InfoStickerEditView.this.n.f127086a, f2, f3);
            }
            InfoStickerEditView.this.f127073g.a();
            InfoStickerEditView.this.invalidate();
            return true;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean b(MotionEvent motionEvent) {
            boolean z;
            InfoStickerEditView.this.p = false;
            float y = motionEvent.getY() - ((float) com.ss.android.ugc.aweme.adaptation.a.f66177a.d());
            InfoStickerEditView.this.s = motionEvent.getX();
            InfoStickerEditView.this.t = y;
            InfoStickerEditView.this.u = motionEvent.getX();
            InfoStickerEditView.this.v = y;
            InfoStickerEditView.this.q = System.currentTimeMillis();
            InfoStickerEditView.this.o = -1;
            InfoStickerEditView.this.n.f127086a = null;
            if (InfoStickerEditView.this.f127075i) {
                InfoStickerEditView infoStickerEditView = InfoStickerEditView.this;
                float x = motionEvent.getX();
                if (h.a(infoStickerEditView.f127073g.f127131a)) {
                    infoStickerEditView.L = false;
                } else {
                    for (aj ajVar : infoStickerEditView.f127073g.f127131a) {
                        if (ajVar.f127114c.isPin) {
                            infoStickerEditView.a(ajVar);
                        }
                    }
                    int k2 = infoStickerEditView.f127071e.k();
                    for (aj ajVar2 : infoStickerEditView.f127073g.f127131a) {
                        if (infoStickerEditView.f127073g.a(ajVar2, k2) && !infoStickerEditView.f127073g.e(ajVar2) && infoStickerEditView.a(ajVar2, x, y)) {
                            if (infoStickerEditView.n.f127086a == null || c.a(ajVar2, infoStickerEditView.n.f127086a) > 0) {
                                infoStickerEditView.n.f127086a = ajVar2;
                                infoStickerEditView.n.f127087b = 0;
                                infoStickerEditView.n.f127088c = ajVar2.f127115d;
                            }
                        }
                    }
                    if (!(infoStickerEditView.n.f127086a == null || infoStickerEditView.H == null)) {
                        if (infoStickerEditView.n.f127086a.f127114c.isPin) {
                            infoStickerEditView.H.a(infoStickerEditView.n.f127086a);
                            infoStickerEditView.a(infoStickerEditView.n.f127086a);
                            infoStickerEditView.n.f127086a.f127114c.setPin(false);
                            com.ss.android.ugc.aweme.video.e.c(infoStickerEditView.n.f127086a.f127114c.pinAlgorithmFile);
                            infoStickerEditView.n.f127086a.f127114c.setPinAlgorithmFile(null);
                        } else if (!TextUtils.isEmpty(infoStickerEditView.n.f127086a.f127114c.pinAlgorithmFile) && com.ss.android.ugc.aweme.video.e.b(infoStickerEditView.n.f127086a.f127114c.pinAlgorithmFile)) {
                            com.ss.android.ugc.aweme.video.e.c(infoStickerEditView.n.f127086a.f127114c.pinAlgorithmFile);
                            infoStickerEditView.n.f127086a.f127114c.setPinAlgorithmFile(null);
                        }
                    }
                    infoStickerEditView.f127073g.c(infoStickerEditView.n.f127086a);
                    if (infoStickerEditView.n == null || infoStickerEditView.n.f127086a == null) {
                        z = false;
                    } else {
                        z = true;
                    }
                    infoStickerEditView.L = z;
                    if (infoStickerEditView.L) {
                        infoStickerEditView.J = infoStickerEditView.g();
                    }
                }
            }
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean a(com.ss.android.ugc.tools.utils.a.c cVar) {
            if (!InfoStickerEditView.this.f127075i) {
                return false;
            }
            InfoStickerEditView.this.a(cVar.f149987i, cVar.f149988j);
            if (InfoStickerEditView.this.n.f127086a == null) {
                return super.a(cVar);
            }
            InfoStickerEditView infoStickerEditView = InfoStickerEditView.this;
            infoStickerEditView.A = infoStickerEditView.B;
            InfoStickerEditView.this.f127073g.b();
            InfoStickerEditView.this.f127073g.d(InfoStickerEditView.this.n.f127086a);
            InfoStickerEditView.this.n.f127086a.f127115d = false;
            InfoStickerEditView.this.f127073g.a(InfoStickerEditView.this.n.f127086a);
            InfoStickerEditView.this.invalidate();
            return true;
        }

        public /* synthetic */ b(InfoStickerEditView infoStickerEditView, byte b2) {
            this();
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean a(com.ss.android.ugc.tools.utils.a.b bVar, float f2, float f3) {
            float d2 = f3 - ((float) com.ss.android.ugc.aweme.adaptation.a.f66177a.d());
            if (!InfoStickerEditView.this.f127075i) {
                return false;
            }
            if (InfoStickerEditView.this.n.f127086a == null) {
                InfoStickerEditView.this.a(f2, d2);
            }
            if (InfoStickerEditView.this.n.f127086a == null) {
                return false;
            }
            if (InfoStickerEditView.this.n.f127087b == 0) {
                InfoStickerEditView infoStickerEditView = InfoStickerEditView.this;
                infoStickerEditView.A = infoStickerEditView.B;
                InfoStickerEditView.this.f127073g.b();
                InfoStickerEditView.this.E.b();
                InfoStickerEditView.this.f127073g.d(InfoStickerEditView.this.n.f127086a);
                InfoStickerEditView.this.n.f127086a.f127115d = false;
                InfoStickerEditView.this.f127073g.a(InfoStickerEditView.this.n.f127086a);
            }
            InfoStickerEditView.this.invalidate();
            return true;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (!InfoStickerEditView.this.f127075i) {
                return false;
            }
            if (InfoStickerEditView.this.p) {
                InfoStickerEditView.this.p = false;
                return true;
            } else if (InfoStickerEditView.this.n.f127086a != null || InfoStickerEditView.this.L) {
                return true;
            } else {
                return false;
            }
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (InfoStickerEditView.this.f127075i && InfoStickerEditView.this.n.f127086a != null) {
                return true;
            }
            return false;
        }
    }

    public void setStickerDataChangeListener(a aVar) {
        this.f127073g.f127136f = aVar;
    }

    public final void a(boolean z2) {
        if (z2) {
            this.f127073g.d();
        } else {
            this.f127073g.c();
        }
    }

    public void setStickerHintEnable(boolean z2) {
        this.K = z2;
        c cVar = this.f127073g;
        if (cVar != null) {
            cVar.f127139i = z2;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(4009);
        super.onDraw(canvas);
        for (aj ajVar : this.f127073g.f127131a) {
            ajVar.f127121j = this.x;
            if (ajVar.f127118g != null) {
                int d2 = com.ss.android.ugc.aweme.adaptation.a.f66177a.d();
                float f2 = (float) d2;
                ajVar.f127118g.top += f2;
                ajVar.f127118g.bottom += f2;
                if (ajVar.f127115d) {
                    canvas.save();
                    canvas.rotate(ajVar.f127114c.rotateAngle, ajVar.f127118g.centerX(), ajVar.f127118g.centerY());
                    canvas.drawRect(ajVar.f127118g, ajVar.f127116e);
                    canvas.restore();
                    ajVar.f127120i = System.currentTimeMillis();
                }
                float width = ajVar.f127117f.width() / 2.0f;
                float height = ajVar.f127117f.height() / 2.0f;
                float centerX = ajVar.f127117f.centerX();
                float centerY = ajVar.f127117f.centerY();
                float f3 = centerX - width;
                float f4 = centerY - height;
                ajVar.f127122k[0].set(f3, f4);
                float f5 = centerX + width;
                ajVar.f127122k[1].set(f5, f4);
                float f6 = centerY + height;
                ajVar.f127122k[2].set(f5, f6);
                ajVar.f127122k[3].set(f3, f6);
                ajVar.f127118g.top -= f2;
                ajVar.f127118g.bottom -= f2;
            }
        }
        MethodCollector.o(4009);
    }

    public void setShowHelpBox(boolean z2) {
        RectF rectF;
        SafeHandler safeHandler;
        this.B = z2;
        c cVar = this.n;
        if (!(cVar == null || cVar.f127086a == null)) {
            this.n.f127086a.f127115d = z2;
        }
        Runnable runnable = this.M;
        if (!(runnable == null || (safeHandler = this.f127072f) == null)) {
            safeHandler.removeCallbacks(runnable);
        }
        if (z2) {
            SafeHandler safeHandler2 = this.f127072f;
            if (safeHandler2 != null) {
                safeHandler2.postDelayed(this.M, (long) N);
            }
            b bVar = this.P;
            if (bVar != null && !bVar.a() && !this.P.b()) {
                int d2 = com.ss.android.ugc.aweme.adaptation.a.f66177a.d();
                c cVar2 = this.n;
                if (cVar2 == null || cVar2.f127086a == null || this.n.f127086a.f127118g == null) {
                    rectF = new RectF();
                } else {
                    rectF = new RectF(this.n.f127086a.f127118g);
                    float f2 = (float) d2;
                    rectF.top += f2;
                    rectF.bottom += f2;
                }
                this.E.a(rectF, (int) this.F.x, (int) this.F.y, this.n.f127086a.f127114c.rotateAngle, false);
                VideoPublishEditModel videoPublishEditModel = this.f127074h;
                boolean z3 = this.n.f127086a.f127124m;
                l.d(videoPublishEditModel, "");
                r.a("prop_more_click", bl.a(videoPublishEditModel, z3, false, 4).f149193a);
            }
        } else {
            this.E.b();
        }
        invalidate();
    }

    public final void a(aj ajVar) {
        try {
            float[] h2 = this.f127071e.h(ajVar.f127114c.getId());
            float f2 = -this.f127071e.p(ajVar.f127114c.getId());
            float o2 = this.f127071e.o(ajVar.f127114c.getId());
            if (o2 > 0.0f) {
                ajVar.f127114c.scale = o2;
                ajVar.b(o2 / ajVar.f127123l);
            }
            ajVar.f127114c.rotateAngle = f2;
            ajVar.a(f2 - ajVar.f127114c.rotateAngle);
            RectF rectF = ajVar.f127117f;
            float f3 = ((((h2[2] - h2[0]) / 2.0f) + h2[0]) * ((float) this.f127069c)) + ((float) this.f127067a);
            float f4 = ((((h2[1] - h2[3]) / 2.0f) + h2[3]) * ((float) this.f127070d)) + ((float) this.f127068b);
            float centerX = f3 - rectF.centerX();
            float centerY = f4 - rectF.centerY();
            ajVar.a(centerX, centerY);
            ajVar.f127114c.currentOffsetX += centerX / ((float) this.f127069c);
            ajVar.f127114c.currentOffsetY += centerY / ((float) this.f127070d);
            this.f127071e.a(ajVar.f127114c.getId(), ajVar.f127114c.currentOffsetX, ajVar.f127114c.currentOffsetY);
        } catch (z e2) {
            com.ss.android.ugc.aweme.df.e.a((Throwable) new RuntimeException("restorePinStickerPositionImpl: ", e2));
        }
    }

    public final void a(final InfoStickerModel infoStickerModel, final boolean z2) {
        if (this.f127069c == 0 || this.f127070d == 0) {
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                boolean f127079a;

                static {
                    Covode.recordClassIndex(83376);
                }

                public final void onGlobalLayout() {
                    InfoStickerEditView.this.a();
                    if (InfoStickerEditView.this.f127069c > 0 && InfoStickerEditView.this.f127070d > 0 && !this.f127079a) {
                        InfoStickerEditView.this.f127073g.a(infoStickerModel, z2);
                        this.f127079a = true;
                        InfoStickerEditView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                }
            });
        } else {
            this.f127073g.a(infoStickerModel, z2);
        }
    }

    public InfoStickerEditView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(3992);
        MethodCollector.o(3992);
    }

    public final void a(float f2, float f3) {
        if (!h.a(this.f127073g.f127131a)) {
            int k2 = this.f127071e.k();
            for (aj ajVar : this.f127073g.f127131a) {
                if (this.f127073g.a(ajVar, k2) && !this.f127073g.e(ajVar) && a(ajVar, f2, f3)) {
                    if (this.n.f127086a == null || c.a(ajVar, this.n.f127086a) > 0) {
                        this.n.f127086a = ajVar;
                        this.n.f127087b = 0;
                        this.n.f127088c = ajVar.f127115d;
                    }
                }
            }
            this.f127073g.c(this.n.f127086a);
            c cVar = this.n;
            if (!(cVar == null || cVar.f127086a == null)) {
                this.J = g();
            }
        }
    }

    public final void a(aj ajVar, int i2, int i3) {
        this.f127073g.a(ajVar, i2, i3);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(aj ajVar, float f2, float f3) {
        if (ajVar == null || ajVar.f127118g == null) {
            return false;
        }
        if (this.O == null) {
            this.O = new Point(0, 0);
        }
        this.O.set((int) f2, (int) f3);
        o.a(this.O, ajVar.f127118g.centerX(), ajVar.f127118g.centerY(), -ajVar.f127114c.rotateAngle);
        return ajVar.f127118g.contains((float) this.O.x, (float) this.O.y);
    }
}
