package com.ss.android.ugc.aweme.ftc.components.sticker.info;

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
import androidx.fragment.app.e;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.editSticker.a.k;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.info.i;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.tools.utils.d;
import com.ss.android.ugc.tools.utils.o;
import com.ss.android.vesdk.z;
import h.f.b.l;

public class FTCInfoStickerEditView extends View {

    /* renamed from: l  reason: collision with root package name */
    public static int f97993l = 1;
    public boolean A;
    Context B;
    b C;
    public com.ss.android.ugc.aweme.shortvideo.sticker.a.c D = new com.ss.android.ugc.aweme.shortvideo.sticker.a.c(this, new a(this, (byte) 0));
    public PointF E = new PointF();
    com.ss.android.ugc.aweme.ftc.components.sticker.a.a F;
    public boolean G = false;
    public com.ss.android.ugc.aweme.editSticker.interact.b H;
    Runnable I = new Runnable() {
        /* class com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCInfoStickerEditView.AnonymousClass1 */

        static {
            Covode.recordClassIndex(62298);
        }

        public final void run() {
            if (FTCInfoStickerEditView.this.f98000g != null && FTCInfoStickerEditView.this.f98005m != null && FTCInfoStickerEditView.this.f98005m.f98009a != null && FTCInfoStickerEditView.this.f98005m.f98009a.f97895c) {
                FTCInfoStickerEditView.this.A = false;
                FTCInfoStickerEditView.this.f98005m.f98009a.f97895c = false;
                FTCInfoStickerEditView.this.f98000g.b();
                FTCInfoStickerEditView.this.D.b();
                FTCInfoStickerEditView.this.invalidate();
            }
        }
    };
    private Point J;
    private com.ss.android.ugc.aweme.shortvideo.edit.infosticker.b K;
    private FTCEditInfoStickerViewModel L;

    /* renamed from: a  reason: collision with root package name */
    public int f97994a;

    /* renamed from: b  reason: collision with root package name */
    public int f97995b;

    /* renamed from: c  reason: collision with root package name */
    public int f97996c;

    /* renamed from: d  reason: collision with root package name */
    public int f97997d;

    /* renamed from: e  reason: collision with root package name */
    g f97998e;

    /* renamed from: f  reason: collision with root package name */
    SafeHandler f97999f;

    /* renamed from: g  reason: collision with root package name */
    public h f98000g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f98001h = true;

    /* renamed from: i  reason: collision with root package name */
    com.ss.android.ugc.aweme.tools.e.b<com.ss.android.ugc.aweme.ftc.components.sticker.a> f98002i;

    /* renamed from: j  reason: collision with root package name */
    com.ss.android.ugc.aweme.tools.e.b<com.ss.android.ugc.aweme.ftc.components.sticker.a> f98003j;

    /* renamed from: k  reason: collision with root package name */
    public int f98004k;

    /* renamed from: m  reason: collision with root package name */
    public c f98005m = new c();
    public int n;
    public boolean o;
    public long p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public float u;
    public i.b v;
    public boolean w = true;
    public boolean x = true;
    public boolean y;
    public boolean z;

    /* access modifiers changed from: package-private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        com.ss.android.ugc.aweme.ftc.components.sticker.a f98009a;

        /* renamed from: b  reason: collision with root package name */
        int f98010b;

        /* renamed from: c  reason: collision with root package name */
        boolean f98011c;

        static {
            Covode.recordClassIndex(62301);
        }

        c() {
        }
    }

    public b getGestureListener() {
        return this.C;
    }

    class a implements k {
        static {
            Covode.recordClassIndex(62299);
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
            FTCInfoStickerEditView.this.c();
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.k
        public final void a() {
            FTCInfoStickerEditView fTCInfoStickerEditView = FTCInfoStickerEditView.this;
            if (fTCInfoStickerEditView.f98005m.f98009a == null) {
                fTCInfoStickerEditView.setShowHelpBox(false);
            } else if (fTCInfoStickerEditView.w) {
                fTCInfoStickerEditView.n = 1;
                h hVar = fTCInfoStickerEditView.f98000g;
                fTCInfoStickerEditView.f98005m.f98009a.f97895c = false;
                hVar.b();
                fTCInfoStickerEditView.f98000g.c();
                if (fTCInfoStickerEditView.f98002i != null) {
                    fTCInfoStickerEditView.f98002i.a(fTCInfoStickerEditView.f98005m.f98009a);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.k
        public final void c() {
            FTCInfoStickerEditView fTCInfoStickerEditView = FTCInfoStickerEditView.this;
            if (fTCInfoStickerEditView.f98005m.f98009a == null) {
                fTCInfoStickerEditView.setShowHelpBox(false);
                return;
            }
            fTCInfoStickerEditView.n = 1;
            fTCInfoStickerEditView.f98005m.f98009a.f97895c = false;
            fTCInfoStickerEditView.f98000g.c();
            if (fTCInfoStickerEditView.f98003j != null) {
                fTCInfoStickerEditView.f98003j.a(fTCInfoStickerEditView.f98005m.f98009a);
            }
        }

        private a() {
        }

        /* synthetic */ a(FTCInfoStickerEditView fTCInfoStickerEditView, byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(62297);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f98000g.d();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D.f();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D.g();
    }

    public final void b() {
        this.A = false;
        for (com.ss.android.ugc.aweme.ftc.components.sticker.a aVar : this.f98000g.f98055a) {
            aVar.f97895c = false;
        }
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.editSticker.interact.b e() {
        StickerItemModel stickerItemModel = this.f98005m.f98009a.f97894b;
        return new com.ss.android.ugc.aweme.editSticker.interact.b(stickerItemModel.rotateAngle, stickerItemModel.scale, stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY);
    }

    public int getStickNumber() {
        if (!d.a(this.f98000g.f98055a)) {
            return this.f98000g.f98055a.size();
        }
        return 0;
    }

    public final void d() {
        c cVar;
        if (this.n != 1 && (cVar = this.f98005m) != null && cVar.f98009a != null) {
            if (this.f98005m.f98011c) {
                this.f98005m.f98009a.f97894b.getId();
                this.f98000g.d(this.f98005m.f98009a);
                invalidate();
                return;
            }
            this.f98000g.b(this.f98005m.f98009a);
        }
    }

    public final void c() {
        com.ss.android.ugc.aweme.shortvideo.sticker.a.c cVar = this.D;
        if (cVar != null) {
            cVar.f88064b = false;
        }
        setShowHelpBox(true);
        this.n = 1;
        h hVar = this.f98000g;
        com.ss.android.ugc.aweme.ftc.components.sticker.a aVar = this.f98005m.f98009a;
        if (!aVar.f97904l) {
            if (hVar.f98060f != null) {
                hVar.f98060f.a();
            }
            if (hVar.f98056b != aVar) {
                hVar.b();
                hVar.f98056b = aVar;
            }
            hVar.f98056b.f97895c = true;
            hVar.f98056b.f97894b.getId();
            hVar.f98058d.b(hVar.f98056b.f97894b.getId(), 0, hVar.f98057c);
        } else if (hVar.f98056b != aVar) {
            hVar.b();
        }
        if (this.L == null) {
            this.L = (FTCEditInfoStickerViewModel) t.a((e) this.B).a(FTCEditInfoStickerViewModel.class);
        }
        FTCEditInfoStickerViewModel fTCEditInfoStickerViewModel = this.L;
        StickerItemModel stickerItemModel = this.f98005m.f98009a.f97894b;
        l.d(stickerItemModel, "");
        fTCEditInfoStickerViewModel.c(new FTCEditInfoStickerViewModel.b(stickerItemModel));
    }

    public void setHavePinEdit(boolean z2) {
        this.x = z2;
    }

    public void setHaveTimeEdit(boolean z2) {
        this.w = z2;
    }

    public void setITimeEditListener(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.b bVar) {
        this.K = bVar;
    }

    public void setOnInfoStickerPinEditClick(com.ss.android.ugc.aweme.tools.e.b<com.ss.android.ugc.aweme.ftc.components.sticker.a> bVar) {
        this.f98003j = bVar;
    }

    public void setOnInfoStickerTimeEdit(com.ss.android.ugc.aweme.tools.e.b<com.ss.android.ugc.aweme.ftc.components.sticker.a> bVar) {
        this.f98002i = bVar;
    }

    public void setPinHelper(com.ss.android.ugc.aweme.ftc.components.sticker.a.a aVar) {
        this.F = aVar;
    }

    public void setStickerOnMoveListener(i.b bVar) {
        this.v = bVar;
    }

    class b extends com.bytedance.f.a.a.a.a {
        static {
            Covode.recordClassIndex(62300);
        }

        private b() {
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean c(float f2) {
            boolean z = FTCInfoStickerEditView.this.f98001h;
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final void b(com.ss.android.ugc.tools.utils.a.b bVar) {
            if (FTCInfoStickerEditView.this.f98001h) {
                FTCInfoStickerEditView.this.v.a(FTCInfoStickerEditView.this.f98005m.f98009a, true, false);
                System.currentTimeMillis();
            }
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean a(ScaleGestureDetector scaleGestureDetector) {
            if (!FTCInfoStickerEditView.this.f98001h) {
                return false;
            }
            scaleGestureDetector.getScaleFactor();
            if (FTCInfoStickerEditView.this.f98005m.f98009a == null) {
                return super.a(scaleGestureDetector);
            }
            FTCInfoStickerEditView.this.n = 2;
            FTCInfoStickerEditView.this.f98000g.b(FTCInfoStickerEditView.this.f98005m.f98009a, scaleGestureDetector.getScaleFactor());
            FTCInfoStickerEditView.this.invalidate();
            return true;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean b(float f2) {
            if (!FTCInfoStickerEditView.this.f98001h) {
                return false;
            }
            FTCInfoStickerEditView.this.v.a(FTCInfoStickerEditView.this.f98005m.f98009a, true, true);
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean a(float f2) {
            if (!FTCInfoStickerEditView.this.f98001h) {
                return false;
            }
            if (FTCInfoStickerEditView.this.f98005m.f98009a == null) {
                return super.a(f2);
            }
            FTCInfoStickerEditView.this.n = 2;
            float degrees = (float) Math.toDegrees((double) f2);
            if (Math.abs(degrees) > 10.0f) {
                degrees = 0.0f;
            }
            if (4 == FTCInfoStickerEditView.this.v.a(FTCInfoStickerEditView.this.f98005m.f98009a, false, true)) {
                degrees = FTCInfoStickerEditView.this.v.a(degrees).floatValue();
            }
            FTCInfoStickerEditView.this.f98000g.a(FTCInfoStickerEditView.this.f98005m.f98009a, -degrees);
            FTCInfoStickerEditView.this.invalidate();
            return true;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean c(MotionEvent motionEvent) {
            if (!FTCInfoStickerEditView.this.q) {
                if (FTCInfoStickerEditView.this.f98000g != null) {
                    float y = motionEvent.getY() - ((float) com.ss.android.ugc.aweme.adaptation.a.f66177a.d());
                    h hVar = FTCInfoStickerEditView.this.f98000g;
                    int x = (int) motionEvent.getX();
                    int i2 = (int) y;
                    if (!(hVar.f98055a == null || hVar.f98055a.size() == 0)) {
                        for (com.ss.android.ugc.aweme.ftc.components.sticker.a aVar : hVar.f98055a) {
                            if (aVar.f97898f.contains((float) x, (float) i2)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            } else if (!FTCInfoStickerEditView.this.A) {
                return false;
            } else {
                FTCInfoStickerEditView.this.A = false;
                return true;
            }
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean a(com.ss.android.ugc.tools.utils.a.b bVar) {
            if (!FTCInfoStickerEditView.this.f98001h) {
                return false;
            }
            float f2 = bVar.f149983i.x;
            float f3 = bVar.f149983i.y;
            float f4 = FTCInfoStickerEditView.this.r + f2;
            float f5 = FTCInfoStickerEditView.this.s + f3;
            float abs = Math.abs(f4 - FTCInfoStickerEditView.this.t);
            float abs2 = Math.abs(f5 - FTCInfoStickerEditView.this.u);
            if ((abs < 5.0f && abs2 < 5.0f) || FTCInfoStickerEditView.this.f98005m.f98009a == null) {
                return false;
            }
            if (3 == FTCInfoStickerEditView.this.v.a(FTCInfoStickerEditView.this.f98005m.f98009a, false, false)) {
                PointF a2 = FTCInfoStickerEditView.this.v.a(FTCInfoStickerEditView.this.f98005m.f98009a, f2, f3);
                f2 = a2.x;
                f3 = a2.y;
                f4 = FTCInfoStickerEditView.this.r + a2.x;
                f5 = FTCInfoStickerEditView.this.s + a2.y;
            }
            if (FTCInfoStickerEditView.this.f98005m.f98010b == 0) {
                if (FTCInfoStickerEditView.this.v != null) {
                    if (FTCInfoStickerEditView.this.f98005m.f98009a.f97895c) {
                        FTCInfoStickerEditView.this.z = true;
                    }
                    FTCInfoStickerEditView.this.v.a(FTCInfoStickerEditView.this.f98005m.f98009a, (int) f4, (int) f5, false, false);
                }
                FTCInfoStickerEditView.this.r = f4;
                FTCInfoStickerEditView.this.s = f5;
            }
            FTCInfoStickerEditView.this.n = 2;
            if (FTCInfoStickerEditView.this.f98005m.f98010b == 0) {
                FTCInfoStickerEditView.this.f98000g.a(FTCInfoStickerEditView.this.f98005m.f98009a, f2, f3);
            }
            FTCInfoStickerEditView.this.f98000g.a();
            FTCInfoStickerEditView.this.invalidate();
            return true;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean b(ScaleGestureDetector scaleGestureDetector) {
            if (!FTCInfoStickerEditView.this.f98001h) {
                return false;
            }
            scaleGestureDetector.getScaleFactor();
            scaleGestureDetector.getFocusX();
            scaleGestureDetector.getFocusY();
            FTCInfoStickerEditView.this.a(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            if (FTCInfoStickerEditView.this.f98005m.f98009a == null) {
                return false;
            }
            FTCInfoStickerEditView fTCInfoStickerEditView = FTCInfoStickerEditView.this;
            fTCInfoStickerEditView.z = fTCInfoStickerEditView.A;
            FTCInfoStickerEditView.this.f98000g.b();
            FTCInfoStickerEditView.this.f98000g.d(FTCInfoStickerEditView.this.f98005m.f98009a);
            FTCInfoStickerEditView.this.f98005m.f98009a.f97895c = false;
            FTCInfoStickerEditView.this.f98000g.a(FTCInfoStickerEditView.this.f98005m.f98009a);
            FTCInfoStickerEditView.this.invalidate();
            return true;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean f(MotionEvent motionEvent) {
            boolean z = false;
            FTCInfoStickerEditView.this.G = false;
            FTCInfoStickerEditView.this.E.set(motionEvent.getRawX(), motionEvent.getRawY());
            if (!FTCInfoStickerEditView.this.f98001h) {
                return false;
            }
            if (!(FTCInfoStickerEditView.this.v == null || FTCInfoStickerEditView.this.f98005m.f98009a == null || FTCInfoStickerEditView.this.f98005m.f98010b != 0)) {
                FTCInfoStickerEditView.this.v.a(FTCInfoStickerEditView.this.f98005m.f98009a, (int) FTCInfoStickerEditView.this.r, (int) FTCInfoStickerEditView.this.s, true, false);
                if (FTCInfoStickerEditView.this.z) {
                    FTCInfoStickerEditView.this.z = false;
                }
            }
            if (System.currentTimeMillis() - FTCInfoStickerEditView.this.p < 200) {
                if (FTCInfoStickerEditView.this.f98005m.f98009a == null) {
                    FTCInfoStickerEditView fTCInfoStickerEditView = FTCInfoStickerEditView.this;
                    h hVar = fTCInfoStickerEditView.f98000g;
                    if (hVar.f98056b != null) {
                        z = true;
                    }
                    hVar.b();
                    fTCInfoStickerEditView.q = z;
                    FTCInfoStickerEditView.this.D.b();
                } else {
                    FTCInfoStickerEditView.this.q = false;
                    if (FTCInfoStickerEditView.this.f98005m.f98010b == 0) {
                        FTCInfoStickerEditView.this.c();
                    }
                    FTCInfoStickerEditView.this.f98000g.a();
                }
                FTCInfoStickerEditView.this.invalidate();
                if (!FTCInfoStickerEditView.this.A) {
                    FTCInfoStickerEditView.this.d();
                    if (!(FTCInfoStickerEditView.this.f98005m == null || FTCInfoStickerEditView.this.f98005m.f98009a == null)) {
                        FTCInfoStickerEditView.this.f98005m.f98009a = null;
                    }
                }
                return true;
            }
            if (!FTCInfoStickerEditView.this.A) {
                FTCInfoStickerEditView.this.d();
                if (!(FTCInfoStickerEditView.this.f98005m == null || FTCInfoStickerEditView.this.f98005m.f98009a == null)) {
                    FTCInfoStickerEditView.this.f98005m.f98009a = null;
                }
            }
            return super.f(motionEvent);
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean b(MotionEvent motionEvent) {
            FTCInfoStickerEditView.this.o = false;
            float y = motionEvent.getY() - ((float) com.ss.android.ugc.aweme.adaptation.a.f66177a.d());
            FTCInfoStickerEditView.this.r = motionEvent.getX();
            FTCInfoStickerEditView.this.s = y;
            FTCInfoStickerEditView.this.t = motionEvent.getX();
            FTCInfoStickerEditView.this.u = y;
            FTCInfoStickerEditView.this.p = System.currentTimeMillis();
            FTCInfoStickerEditView.this.n = -1;
            FTCInfoStickerEditView.this.f98005m.f98009a = null;
            if (FTCInfoStickerEditView.this.f98001h) {
                FTCInfoStickerEditView fTCInfoStickerEditView = FTCInfoStickerEditView.this;
                float x = motionEvent.getX();
                if (!h.a(fTCInfoStickerEditView.f98000g.f98055a)) {
                    for (com.ss.android.ugc.aweme.ftc.components.sticker.a aVar : fTCInfoStickerEditView.f98000g.f98055a) {
                        if (aVar.f97894b.isPin) {
                            fTCInfoStickerEditView.a(aVar);
                        }
                    }
                    int k2 = fTCInfoStickerEditView.f97998e.k();
                    for (com.ss.android.ugc.aweme.ftc.components.sticker.a aVar2 : fTCInfoStickerEditView.f98000g.f98055a) {
                        if (fTCInfoStickerEditView.f98000g.a(aVar2, k2) && !fTCInfoStickerEditView.f98000g.e(aVar2) && fTCInfoStickerEditView.a(aVar2, x, y)) {
                            if (fTCInfoStickerEditView.f98005m.f98009a == null || h.a(aVar2, fTCInfoStickerEditView.f98005m.f98009a) > 0) {
                                fTCInfoStickerEditView.f98005m.f98009a = aVar2;
                                fTCInfoStickerEditView.f98005m.f98010b = 0;
                                fTCInfoStickerEditView.f98005m.f98011c = aVar2.f97895c;
                            }
                        }
                    }
                    if (!(fTCInfoStickerEditView.f98005m.f98009a == null || fTCInfoStickerEditView.F == null)) {
                        if (fTCInfoStickerEditView.f98005m.f98009a.f97894b.isPin) {
                            com.ss.android.ugc.aweme.ftc.components.sticker.a.a aVar3 = fTCInfoStickerEditView.F;
                            com.ss.android.ugc.aweme.ftc.components.sticker.a aVar4 = fTCInfoStickerEditView.f98005m.f98009a;
                            l.d(aVar4, "");
                            g gVar = aVar3.f97914j;
                            StickerItemModel stickerItemModel = aVar4.f97894b;
                            l.b(stickerItemModel, "");
                            gVar.m(stickerItemModel.getId());
                            fTCInfoStickerEditView.a(fTCInfoStickerEditView.f98005m.f98009a);
                            fTCInfoStickerEditView.f98005m.f98009a.f97894b.setPin(false);
                            com.ss.android.ugc.aweme.video.e.c(fTCInfoStickerEditView.f98005m.f98009a.f97894b.pinAlgorithmFile);
                            fTCInfoStickerEditView.f98005m.f98009a.f97894b.setPinAlgorithmFile(null);
                        } else if (!TextUtils.isEmpty(fTCInfoStickerEditView.f98005m.f98009a.f97894b.pinAlgorithmFile) && com.ss.android.ugc.aweme.video.e.b(fTCInfoStickerEditView.f98005m.f98009a.f97894b.pinAlgorithmFile)) {
                            com.ss.android.ugc.aweme.video.e.c(fTCInfoStickerEditView.f98005m.f98009a.f97894b.pinAlgorithmFile);
                            fTCInfoStickerEditView.f98005m.f98009a.f97894b.setPinAlgorithmFile(null);
                        }
                    }
                    fTCInfoStickerEditView.f98000g.c(fTCInfoStickerEditView.f98005m.f98009a);
                    if (!(fTCInfoStickerEditView.f98005m == null || fTCInfoStickerEditView.f98005m.f98009a == null)) {
                        fTCInfoStickerEditView.H = fTCInfoStickerEditView.e();
                    }
                }
            }
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean a(com.ss.android.ugc.tools.utils.a.c cVar) {
            if (!FTCInfoStickerEditView.this.f98001h) {
                return false;
            }
            FTCInfoStickerEditView.this.a(cVar.f149987i, cVar.f149988j);
            if (FTCInfoStickerEditView.this.f98005m.f98009a == null) {
                return super.a(cVar);
            }
            FTCInfoStickerEditView fTCInfoStickerEditView = FTCInfoStickerEditView.this;
            fTCInfoStickerEditView.z = fTCInfoStickerEditView.A;
            FTCInfoStickerEditView.this.f98000g.b();
            FTCInfoStickerEditView.this.f98000g.d(FTCInfoStickerEditView.this.f98005m.f98009a);
            FTCInfoStickerEditView.this.f98005m.f98009a.f97895c = false;
            FTCInfoStickerEditView.this.f98000g.a(FTCInfoStickerEditView.this.f98005m.f98009a);
            FTCInfoStickerEditView.this.invalidate();
            return true;
        }

        /* synthetic */ b(FTCInfoStickerEditView fTCInfoStickerEditView, byte b2) {
            this();
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean a(com.ss.android.ugc.tools.utils.a.b bVar, float f2, float f3) {
            float d2 = f3 - ((float) com.ss.android.ugc.aweme.adaptation.a.f66177a.d());
            if (!FTCInfoStickerEditView.this.f98001h) {
                return false;
            }
            if (FTCInfoStickerEditView.this.f98005m.f98009a == null) {
                FTCInfoStickerEditView.this.a(f2, d2);
            }
            if (FTCInfoStickerEditView.this.f98005m.f98009a == null) {
                return false;
            }
            if (FTCInfoStickerEditView.this.f98005m.f98010b == 0) {
                FTCInfoStickerEditView fTCInfoStickerEditView = FTCInfoStickerEditView.this;
                fTCInfoStickerEditView.z = fTCInfoStickerEditView.A;
                FTCInfoStickerEditView.this.f98000g.b();
                FTCInfoStickerEditView.this.D.b();
                FTCInfoStickerEditView.this.f98000g.d(FTCInfoStickerEditView.this.f98005m.f98009a);
                FTCInfoStickerEditView.this.f98005m.f98009a.f97895c = false;
                FTCInfoStickerEditView.this.f98000g.a(FTCInfoStickerEditView.this.f98005m.f98009a);
            }
            FTCInfoStickerEditView.this.invalidate();
            return true;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (!FTCInfoStickerEditView.this.f98001h) {
                return false;
            }
            if (FTCInfoStickerEditView.this.o) {
                FTCInfoStickerEditView.this.o = false;
                return true;
            } else if (FTCInfoStickerEditView.this.f98005m.f98009a != null) {
                return true;
            } else {
                return false;
            }
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (FTCInfoStickerEditView.this.f98001h && FTCInfoStickerEditView.this.f98005m.f98009a != null) {
                return true;
            }
            return false;
        }
    }

    public void setStickerDataChangeListener(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a aVar) {
        this.f98000g.f98059e = aVar;
    }

    public final void a(boolean z2) {
        if (z2) {
            this.f98000g.d();
        } else {
            this.f98000g.c();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(com.ss.android.ugc.aweme.ftc.components.sticker.a aVar) {
        try {
            float[] h2 = this.f97998e.h(aVar.f97894b.getId());
            float f2 = -this.f97998e.p(aVar.f97894b.getId());
            float o2 = this.f97998e.o(aVar.f97894b.getId());
            if (o2 > 0.0f) {
                aVar.f97894b.scale = o2;
                aVar.b(o2 / aVar.f97903k);
            }
            aVar.f97894b.rotateAngle = f2;
            aVar.a(f2 - aVar.f97894b.rotateAngle);
            RectF rectF = aVar.f97897e;
            float f3 = ((((h2[2] - h2[0]) / 2.0f) + h2[0]) * ((float) this.f97996c)) + ((float) this.f97994a);
            float f4 = ((((h2[1] - h2[3]) / 2.0f) + h2[3]) * ((float) this.f97997d)) + ((float) this.f97995b);
            float centerX = f3 - rectF.centerX();
            float centerY = f4 - rectF.centerY();
            aVar.a(centerX, centerY);
            aVar.f97894b.currentOffsetX += centerX / ((float) this.f97996c);
            aVar.f97894b.currentOffsetY += centerY / ((float) this.f97997d);
            this.f97998e.a(aVar.f97894b.getId(), aVar.f97894b.currentOffsetX, aVar.f97894b.currentOffsetY);
        } catch (z e2) {
            com.ss.android.ugc.aweme.df.e.a((Throwable) new RuntimeException("restorePinStickerPositionImpl: ", e2));
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(4016);
        super.onDraw(canvas);
        for (com.ss.android.ugc.aweme.ftc.components.sticker.a aVar : this.f98000g.f98055a) {
            aVar.f97901i = this.w;
            if (aVar.f97898f != null) {
                int d2 = com.ss.android.ugc.aweme.adaptation.a.f66177a.d();
                float f2 = (float) d2;
                aVar.f97898f.top += f2;
                aVar.f97898f.bottom += f2;
                if (aVar.f97895c) {
                    canvas.save();
                    canvas.rotate(aVar.f97894b.rotateAngle, aVar.f97898f.centerX(), aVar.f97898f.centerY());
                    canvas.drawRect(aVar.f97898f, aVar.f97896d);
                    canvas.restore();
                    aVar.f97900h = System.currentTimeMillis();
                }
                float width = aVar.f97897e.width() / 2.0f;
                float height = aVar.f97897e.height() / 2.0f;
                float centerX = aVar.f97897e.centerX();
                float centerY = aVar.f97897e.centerY();
                float f3 = centerX - width;
                float f4 = centerY - height;
                aVar.f97902j[0].set(f3, f4);
                float f5 = centerX + width;
                aVar.f97902j[1].set(f5, f4);
                float f6 = centerY + height;
                aVar.f97902j[2].set(f5, f6);
                aVar.f97902j[3].set(f3, f6);
                aVar.f97898f.top -= f2;
                aVar.f97898f.bottom -= f2;
            }
        }
        MethodCollector.o(4016);
    }

    public void setShowHelpBox(boolean z2) {
        RectF rectF;
        Runnable runnable;
        SafeHandler safeHandler;
        this.A = z2;
        c cVar = this.f98005m;
        if (!(cVar == null || cVar.f98009a == null)) {
            this.f98005m.f98009a.f97895c = z2;
        }
        Runnable runnable2 = this.I;
        if (!(runnable2 == null || (safeHandler = this.f97999f) == null)) {
            safeHandler.removeCallbacks(runnable2);
        }
        if (z2) {
            SafeHandler safeHandler2 = this.f97999f;
            if (!(safeHandler2 == null || (runnable = this.I) == null)) {
                safeHandler2.postDelayed(runnable, 3000);
            }
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.b bVar = this.K;
            if (bVar != null && !bVar.a() && !this.K.b()) {
                int d2 = com.ss.android.ugc.aweme.adaptation.a.f66177a.d();
                c cVar2 = this.f98005m;
                if (cVar2 == null || cVar2.f98009a == null || this.f98005m.f98009a.f97898f == null) {
                    rectF = new RectF();
                } else {
                    rectF = new RectF(this.f98005m.f98009a.f97898f);
                    float f2 = (float) d2;
                    rectF.top += f2;
                    rectF.bottom += f2;
                }
                this.D.a(rectF, (int) this.E.x, (int) this.E.y, this.f98005m.f98009a.f97894b.rotateAngle, false);
            }
        } else {
            this.D.b();
        }
        invalidate();
    }

    public FTCInfoStickerEditView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(4013);
        MethodCollector.o(4013);
    }

    public final void a(float f2, float f3) {
        if (!h.a(this.f98000g.f98055a)) {
            int k2 = this.f97998e.k();
            for (com.ss.android.ugc.aweme.ftc.components.sticker.a aVar : this.f98000g.f98055a) {
                if (this.f98000g.a(aVar, k2) && !this.f98000g.e(aVar) && a(aVar, f2, f3)) {
                    if (this.f98005m.f98009a == null || h.a(aVar, this.f98005m.f98009a) > 0) {
                        this.f98005m.f98009a = aVar;
                        this.f98005m.f98010b = 0;
                        this.f98005m.f98011c = aVar.f97895c;
                    }
                }
            }
            this.f98000g.c(this.f98005m.f98009a);
            c cVar = this.f98005m;
            if (!(cVar == null || cVar.f98009a == null)) {
                this.H = e();
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.ftc.components.sticker.a aVar, int i2, int i3) {
        this.f98000g.a(aVar, i2, i3);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(com.ss.android.ugc.aweme.ftc.components.sticker.a aVar, float f2, float f3) {
        if (aVar == null || aVar.f97898f == null) {
            return false;
        }
        if (this.J == null) {
            this.J = new Point(0, 0);
        }
        this.J.set((int) f2, (int) f3);
        o.a(this.J, aVar.f97898f.centerX(), aVar.f97898f.centerY(), -aVar.f97894b.rotateAngle);
        return aVar.f97898f.contains((float) this.J.x, (float) this.J.y);
    }
}
