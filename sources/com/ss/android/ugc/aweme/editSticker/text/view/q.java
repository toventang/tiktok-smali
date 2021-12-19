package com.ss.android.ugc.aweme.editSticker.text.view;

import android.animation.ObjectAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.editSticker.a.k;
import com.ss.android.ugc.aweme.editSticker.a.m;
import com.ss.android.ugc.aweme.editSticker.g;
import com.ss.android.ugc.aweme.editSticker.interact.h;
import com.ss.android.ugc.aweme.editSticker.text.b.c;
import com.ss.android.ugc.aweme.editSticker.text.b.d;
import com.ss.android.ugc.aweme.editSticker.text.b.e;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.t;
import com.ss.android.ugc.aweme.editSticker.text.c.i;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.eu;
import com.ss.android.ugc.tools.utils.o;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class q extends FrameLayout implements h<TextStickerData> {
    private Vibrator A;
    private long B;
    private long C;
    private com.ss.android.ugc.aweme.editSticker.interact.b D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private float I;

    /* renamed from: a  reason: collision with root package name */
    private boolean f88698a = true;

    /* renamed from: b  reason: collision with root package name */
    private boolean f88699b = true;

    /* renamed from: c  reason: collision with root package name */
    private SafeHandler f88700c;

    /* renamed from: d  reason: collision with root package name */
    private int f88701d;

    /* renamed from: e  reason: collision with root package name */
    private int f88702e;

    /* renamed from: f  reason: collision with root package name */
    protected float f88703f;

    /* renamed from: g  reason: collision with root package name */
    protected float f88704g;

    /* renamed from: h  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.editSticker.text.b.b f88705h = new com.ss.android.ugc.aweme.editSticker.text.b.b((byte) 0);

    /* renamed from: i  reason: collision with root package name */
    protected List<TextStickerTextWrap> f88706i;

    /* renamed from: j  reason: collision with root package name */
    protected int f88707j = 1;

    /* renamed from: k  reason: collision with root package name */
    protected int f88708k = -1;

    /* renamed from: l  reason: collision with root package name */
    protected String f88709l = "default";

    /* renamed from: m  reason: collision with root package name */
    public boolean f88710m = false;
    public boolean n = false;
    protected int o;
    protected int p;
    protected c q;
    protected d r;
    protected e s;
    protected TextStickerData t;
    public com.ss.android.ugc.aweme.editSticker.a.b u;
    public PointF v = new PointF();
    public com.ss.android.ugc.aweme.editSticker.d.e w;
    public boolean x = false;
    public final int y;
    public boolean z;

    static {
        Covode.recordClassIndex(55805);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public float getCenterX() {
        return this.f88703f;
    }

    public float getCenterY() {
        return this.f88704g;
    }

    public int getCurColor() {
        return this.f88708k;
    }

    public String getCurFontType() {
        return this.f88709l;
    }

    public int getCurMode() {
        return this.f88707j;
    }

    public TextStickerData getData() {
        return this.t;
    }

    public void invalidate() {
        super.invalidate();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.sticker.data.e, int, int] */
    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final /* bridge */ /* synthetic */ void a(TextStickerData textStickerData, int i2, int i3) {
        a(textStickerData);
    }

    /* access modifiers changed from: protected */
    public void a(List<TextStickerTextWrap> list, Object obj) {
        this.f88706i = list;
        this.q.a(list);
    }

    public boolean a(float f2, float f3) {
        return e(f2, f3 - ((float) this.p));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fe, code lost:
        if (r1 != false) goto L_0x00ed;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.ss.android.ugc.tools.utils.a.b r18) {
        /*
        // Method dump skipped, instructions count: 262
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.view.q.a(com.ss.android.ugc.tools.utils.a.b):boolean");
    }

    public final boolean a(com.ss.android.ugc.tools.utils.a.c cVar) {
        if (!f()) {
            return false;
        }
        this.F = a(cVar.f149987i, cVar.f149988j);
        this.s.a(cVar.f149987i, cVar.f149988j);
        return q();
    }

    public final boolean a(float f2) {
        if (!f()) {
            return false;
        }
        float degrees = (float) Math.toDegrees((double) f2);
        if (Math.abs(degrees) > 10.0f) {
            degrees = 0.0f;
        }
        if (!q()) {
            return false;
        }
        com.ss.android.ugc.aweme.editSticker.text.b.b bVar = this.f88705h;
        e eVar = this.s;
        float f3 = bVar.f88364b;
        if (-1 != eVar.f88397a.a(eVar.q, false, true)) {
            degrees = eVar.f88397a.a(degrees);
        }
        float f4 = f3 - degrees;
        if (f4 > 180.0f) {
            f4 -= 360.0f;
        }
        if (f4 < -180.0f) {
            f4 += 360.0f;
        }
        eVar.a(false);
        if (eVar.u != null) {
            eVar.u.c();
        }
        bVar.f88364b = f4;
        invalidate();
        return true;
    }

    public final boolean a(ScaleGestureDetector scaleGestureDetector) {
        if (!f()) {
            return false;
        }
        this.G = a(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        this.s.a(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        this.z = true;
        return r();
    }

    public final boolean a(MotionEvent motionEvent) {
        if (!f()) {
            return false;
        }
        this.D = new com.ss.android.ugc.aweme.editSticker.interact.b(getStickerRotate(), getStickerScale(), getCenterX(), getCenterY());
        this.I = motionEvent.getY() - motionEvent.getRawY();
        boolean a2 = this.s.a(motionEvent.getX(), motionEvent.getY());
        if (a2) {
            setTouching(true);
        }
        return a2;
    }

    public final boolean a(RectF rectF, float f2, float f3) {
        return o.b(rectF, f2, f3, this.f88705h.f88364b);
    }

    public int getCurAlignTxt() {
        return this.f88705h.f88366d;
    }

    public RectF getCurrentHelpBoxRect() {
        return this.q.a();
    }

    public RectF getHelpRect() {
        return this.q.f88373c;
    }

    public float getStickerRotate() {
        return this.f88705h.f88364b;
    }

    public float getStickerScale() {
        return this.f88705h.f88363a;
    }

    public String getText() {
        return t.i(this.f88706i);
    }

    public RectF getTextRect() {
        return this.q.f88372b;
    }

    public final boolean h() {
        return this.s.b();
    }

    public final boolean i() {
        return this.s.b();
    }

    public final boolean j() {
        return this.s.b();
    }

    public final void m() {
        this.s.f88406j = 2;
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.sticker.data.e' to match base method */
    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final /* synthetic */ TextStickerData c() {
        return b().clone();
    }

    public final boolean e() {
        this.f88705h.f88369g = this.s.f88405i;
        return this.f88705h.f88369g;
    }

    public RectF getDeleteIconRect() {
        c cVar = this.q;
        if (cVar.o) {
            return cVar.f88379i;
        }
        return null;
    }

    public float getGuidanceRectBottom() {
        c cVar = this.q;
        return cVar.f88372b.bottom + ((float) cVar.f88381k);
    }

    public List<TextStickerTextWrap> getTextWrapList() {
        List<TextStickerTextWrap> list = this.f88706i;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public final void n() {
        if (this.s.f88397a != null) {
            this.s.f88397a.a(this, true);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.ss.android.ugc.aweme.editSticker.a.b bVar = this.u;
        if (bVar != null) {
            bVar.f();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.ss.android.ugc.aweme.editSticker.a.b bVar = this.u;
        if (bVar != null) {
            bVar.g();
        }
    }

    class a implements k {
        static {
            Covode.recordClassIndex(55806);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.k
        public final void c() {
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.k
        public final void e() {
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.k
        public final void f() {
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.k
        public final void a() {
            if (q.this.s.f88397a != null) {
                q.this.s.f88397a.a(q.this);
            }
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.k
        public final void b() {
            if (q.this.s.f88397a != null) {
                q.this.s.f88397a.a(q.this, true);
            }
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.k
        public final void d() {
            if (q.this.s.f88397a != null) {
                q.this.s.f88397a.b(q.this);
            }
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.k
        public final void g() {
            if (q.this.s.f88397a != null) {
                q.this.s.f88397a.d(q.this);
            }
        }

        private a() {
        }

        /* synthetic */ a(q qVar, byte b2) {
            this();
        }
    }

    private void a() {
        this.C = SystemClock.elapsedRealtime();
        this.f88700c.postDelayed(new r(this), 1000);
    }

    private boolean p() {
        if (this.F || this.G || this.E || this.s.a()) {
            return true;
        }
        return false;
    }

    private boolean q() {
        if (this.F || this.E || this.s.a()) {
            return true;
        }
        return false;
    }

    private boolean r() {
        if (this.G || this.E || this.s.a()) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (!this.f88699b || getVisibility() != 0) {
            return false;
        }
        if (!this.s.d() || this.f88705h.f88370h) {
            return true;
        }
        return false;
    }

    public int getContentViewHeight() {
        return (int) Math.abs(getMinTextRect().bottom - getMinTextRect().top);
    }

    public int getContentViewWidth() {
        return (int) Math.abs(getMinTextRect().right - getMinTextRect().left);
    }

    private int getFontSize() {
        float fontSize;
        if (this.f88705h.f88367e < 0) {
            com.ss.android.ugc.aweme.editSticker.text.b.b bVar = this.f88705h;
            Context context = getContext();
            TextStickerData textStickerData = this.t;
            if (textStickerData == null) {
                fontSize = 28.0f;
            } else {
                fontSize = (float) textStickerData.getFontSize();
            }
            bVar.f88367e = (int) com.ss.android.ttve.utils.b.a(context, fontSize);
        }
        return this.f88705h.f88367e;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final int d() {
        if (getData() == null || !getData().hasTimeData()) {
            return 0;
        }
        return getData().getUiStartTime();
    }

    /* renamed from: g */
    public final void o() {
        if (this.t != null && !e() && !this.H) {
            int i2 = 0;
            if (SystemClock.elapsedRealtime() >= this.C) {
                boolean isVisibleWhen = this.t.isVisibleWhen(this.B);
                if (!isVisibleWhen) {
                    i2 = 8;
                }
                eu.b(this, i2);
                this.f88699b = isVisibleWhen;
            }
        }
    }

    public PointF[] getAnglePointList() {
        c cVar = this.q;
        int size = cVar.I.size();
        PointF[] pointFArr = new PointF[size];
        float radians = (float) Math.toRadians((double) cVar.G);
        for (int i2 = 0; i2 < size; i2++) {
            pointFArr[i2] = o.a(cVar.I.get(i2), cVar.f88373c.centerX(), cVar.f88373c.centerY(), radians);
        }
        return pointFArr;
    }

    public RectF getBubbleShowLimitRect() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        RectF currentHelpBoxRect = getCurrentHelpBoxRect();
        return new RectF(((float) iArr[0]) + currentHelpBoxRect.left, ((float) iArr[1]) + currentHelpBoxRect.top, ((float) iArr[0]) + currentHelpBoxRect.right, ((float) iArr[1]) + currentHelpBoxRect.bottom);
    }

    public RectF getMinTextRect() {
        c cVar = this.q;
        return new RectF(cVar.f88372b.left + ((float) cVar.s), cVar.f88372b.top + ((float) cVar.t), cVar.f88372b.right - ((float) cVar.s), cVar.f88372b.bottom - ((float) cVar.t));
    }

    public TextStickerData b() {
        if (this.t == null) {
            TextStickerData textStickerData = new TextStickerData("", this.f88707j, this.f88708k, this.f88705h.f88366d, this.f88709l);
            this.t = textStickerData;
            textStickerData.setTextWrapList(getTextWrapList());
            if (com.ss.android.ugc.aweme.editSticker.d.d() != null) {
                com.ss.android.ugc.aweme.editSticker.d.d().a(new IllegalStateException("Why are you running here?"));
            }
        }
        this.t.setX(this.f88703f);
        this.t.setY(this.f88704g);
        this.t.setRotation(this.f88705h.f88364b);
        this.t.setScale(this.f88705h.f88363a);
        this.t.setTextWrapList(getTextWrapList());
        this.t.setBgMode(this.f88707j);
        this.t.setColor(this.f88708k);
        this.t.setAlign(this.f88705h.f88366d);
        this.t.setFontType(this.f88709l);
        return this.t;
    }

    public PointF[] getAnglePointListForBlock() {
        c cVar = this.q;
        int i2 = 0;
        PointF[] pointFArr = {new PointF(cVar.f88372b.left, cVar.f88372b.top), new PointF(cVar.f88372b.right, cVar.f88372b.top), new PointF(cVar.f88372b.right, cVar.f88372b.bottom), new PointF(cVar.f88372b.left, cVar.f88372b.bottom)};
        float radians = (float) Math.toRadians((double) cVar.G);
        do {
            pointFArr[i2] = o.a(pointFArr[i2], cVar.f88372b.centerX(), cVar.f88372b.centerY(), radians);
            i2++;
        } while (i2 < 4);
        return pointFArr;
    }

    public final void l() {
        d dVar = this.r;
        float f2 = this.f88703f;
        float f3 = this.f88704g;
        float f4 = this.f88705h.f88363a;
        float f5 = this.f88705h.f88364b;
        dVar.f88390g = true;
        dVar.f88391h = false;
        dVar.f88392i = f2;
        dVar.f88393j = f3;
        dVar.f88394k = f5;
        dVar.f88395l = f4;
        dVar.f88384a = dVar.f88395l / ((float) dVar.f88396m);
        dVar.f88385b = dVar.f88394k / ((float) dVar.f88396m);
        dVar.f88386c = (f2 - dVar.f88388e) / ((float) dVar.f88396m);
        dVar.f88387d = (f3 - dVar.f88389f) / ((float) dVar.f88396m);
        dVar.n.invalidate();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    public final void k() {
        d dVar = this.r;
        dVar.f88391h = true;
        dVar.f88390g = false;
        dVar.f88384a = (-dVar.f88395l) / ((float) dVar.f88396m);
        dVar.f88385b = (-dVar.f88394k) / ((float) dVar.f88396m);
        dVar.f88386c = (-(dVar.f88392i - dVar.f88388e)) / ((float) dVar.f88396m);
        dVar.f88387d = (-(dVar.f88393j - dVar.f88389f)) / ((float) dVar.f88396m);
        dVar.n.invalidate();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.start();
        TextStickerData textStickerData = this.t;
        if (textStickerData != null && !textStickerData.isVisibleWhen(this.B)) {
            d dVar2 = this.r;
            dVar2.f88391h = false;
            dVar2.f88390g = false;
            dVar2.n.b(dVar2.f88395l);
            dVar2.n.c(dVar2.f88394k);
            dVar2.n.setCenterX(dVar2.f88392i);
            dVar2.n.setCenterY(dVar2.f88393j);
            dVar2.n.invalidate();
        }
    }

    public void setCenterX(float f2) {
        this.f88703f = f2;
    }

    public void setCenterY(float f2) {
        this.f88704g = f2;
    }

    public void setEnableEdit(boolean z2) {
        this.f88699b = z2;
    }

    public void setIsGuidanceSticker(boolean z2) {
        this.f88710m = z2;
    }

    public void setPlayPosition(long j2) {
        this.B = j2;
    }

    public void setWasGuidanceSticker(boolean z2) {
        this.n = z2;
    }

    public class b implements com.ss.android.ugc.aweme.editSticker.text.c.a {
        static {
            Covode.recordClassIndex(55807);
        }

        public b() {
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.a
        public final void a(boolean z, boolean z2, boolean z3) {
            if (z && q.this.w != null) {
                q.this.w.c();
            }
            if (q.this.u != null) {
                if (z) {
                    if (q.this.u instanceof m) {
                        ((m) q.this.u).n = q.this.x;
                    }
                    q.this.u.a(q.this.getBubbleShowLimitRect(), (int) q.this.v.x, (int) q.this.v.y, q.this.f88705h.f88364b, z3);
                } else if (z2) {
                    q.this.u.b();
                } else {
                    q.this.u.b();
                }
            }
        }
    }

    private void a(boolean z2) {
        this.f88705h.f88368f = z2;
    }

    public final boolean b(float f2) {
        this.f88705h.f88363a = f2;
        return true;
    }

    public void setMotionInterceptor(com.ss.android.ugc.aweme.editSticker.c.b bVar) {
        this.s.v = bVar;
    }

    public void setOnEditClickListener(com.ss.android.ugc.aweme.editSticker.text.c.d dVar) {
        this.s.f88397a = dVar;
    }

    public void setOnEffectTextGestureListener(com.ss.android.ugc.aweme.editSticker.text.c.b bVar) {
        this.s.u = bVar;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.c
    public void setAlpha(boolean z2) {
        float f2;
        if (z2) {
            f2 = 1.0f;
        } else {
            f2 = 0.3137255f;
        }
        a(f2, false);
    }

    public void setShowHelpBox(boolean z2) {
        this.s.a(z2);
        if (!z2) {
            a();
        }
    }

    public void setTouching(boolean z2) {
        if (z2 != this.H) {
            this.H = z2;
            invalidate();
            if (!z2) {
                a();
            }
        }
    }

    private void d(int i2) {
        c cVar = this.q;
        cVar.p.setColor(i2);
        cVar.q = i2;
        if (cVar.F) {
            cVar.B.setShadowLayer(12.0f, 0.0f, 0.0f, i2);
        } else {
            cVar.B.setShadowLayer(0.0f, 0.0f, 0.0f, i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final int b(int i2) {
        if (getData() == null || !getData().hasTimeData()) {
            return i2;
        }
        return getData().getEndTime();
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final int c(int i2) {
        if (getData() == null || !getData().hasTimeData()) {
            return i2;
        }
        return getData().getUiEndTime();
    }

    public void setAnimXY(Point point) {
        d dVar = this.r;
        PointF c2 = dVar.n.c((float) point.x, (float) point.y);
        dVar.f88388e = c2.x;
        dVar.f88389f = c2.y;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final int a(int i2) {
        if (getData() == null || !getData().hasTimeData()) {
            return i2;
        }
        return getData().getStartTime();
    }

    public void b(boolean z2) {
        TextStickerData textStickerData = this.t;
        if (textStickerData != null && textStickerData.hasPositionData()) {
            if (!this.t.isGuidanceSticker()) {
                this.f88703f = this.t.getX();
            }
            this.f88704g = this.t.getY();
            this.f88705h.f88364b = this.t.getRotation();
            this.f88705h.f88363a = this.t.getScale();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(2348);
        super.onDraw(canvas);
        a(canvas);
        this.r.a(this.f88705h.f88363a, this.f88705h.f88364b, this.f88703f, this.f88704g);
        this.r.b(this.f88705h.f88363a, this.f88705h.f88364b, this.f88703f, this.f88704g);
        MethodCollector.o(2348);
    }

    public final void c(float f2) {
        this.f88705h.f88364b = f2;
        if (this.f88705h.f88364b > 180.0f) {
            this.f88705h.f88364b -= 360.0f;
        }
        if (this.f88705h.f88364b < -180.0f) {
            this.f88705h.f88364b += 360.0f;
        }
    }

    public void setFontSize(int i2) {
        TextStickerData textStickerData = this.t;
        if (textStickerData != null) {
            textStickerData.setFontSize(i2);
        }
        this.f88705h.f88367e = (int) com.ss.android.ttve.utils.b.a(getContext(), (float) i2);
        c cVar = this.q;
        float f2 = (float) this.f88705h.f88367e;
        cVar.r = f2;
        float a2 = f2 / com.ss.android.ttve.utils.b.a(cVar.E.getContext(), 28.0f);
        cVar.s = (int) (com.ss.android.ttve.utils.b.b(cVar.E.getContext(), 12.0f) * a2);
        cVar.t = (int) (com.ss.android.ttve.utils.b.b(cVar.E.getContext(), 8.0f) * a2);
        cVar.u = cVar.s;
        cVar.v = cVar.t;
        cVar.z = (int) (com.ss.android.ttve.utils.b.b(cVar.E.getContext(), 5.0f) * a2);
        cVar.p.setPathEffect(new CornerPathEffect((float) cVar.z));
        invalidate();
    }

    public void setTextColor(int i2) {
        boolean z2;
        c cVar = this.q;
        com.ss.android.ugc.aweme.editSticker.text.a.b a2 = com.ss.android.ugc.aweme.editSticker.text.a.b.a();
        if (a2.e() != null) {
            z2 = a2.e().a();
        } else {
            z2 = false;
        }
        cVar.F = z2;
        if (cVar.B.getTypeface() != com.ss.android.ugc.aweme.editSticker.text.a.b.a().c()) {
            cVar.B.setTypeface(com.ss.android.ugc.aweme.editSticker.text.a.b.a().c());
        }
        if (cVar.F) {
            cVar.B.setColor(-1);
            cVar.B.setShadowLayer(12.0f, 0.0f, 0.0f, i2);
            return;
        }
        cVar.B.setShadowLayer(0.0f, 0.0f, 0.0f, i2);
        cVar.B.setColor(i2);
    }

    private void a(TextStickerData textStickerData) {
        this.t = textStickerData;
        if (textStickerData != null) {
            setFontSize(textStickerData.getFontSize());
            a(this.t.getBgMode(), this.t.getColor(), this.t.getAlign(), this.t.getFontType());
            b(this.t.getTextWrapList(), textStickerData.getEffectTextLayoutConfig());
            setAnimXY(this.t.getEditCenterPoint());
            b(false);
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006e, code lost:
        if (r3 <= r1) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0070, code lost:
        r2 = com.ss.android.ugc.aweme.editSticker.d.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0074, code lost:
        if (r2 == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0076, code lost:
        r2.c("TextSticker setLayerType -> viewType: ".concat(java.lang.String.valueOf(r5)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0083, code lost:
        setLayerType(r5, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0087, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0089, code lost:
        if (r8 != false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDrawStrokeState(int r12) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.view.q.setDrawStrokeState(int):void");
    }

    public final boolean b(MotionEvent motionEvent) {
        boolean z2;
        com.ss.android.ugc.aweme.editSticker.interact.b bVar;
        boolean z3;
        int i2;
        this.v.set(motionEvent.getRawX(), motionEvent.getRawY());
        if (!f()) {
            return false;
        }
        this.s.b();
        e eVar = this.s;
        long currentTimeMillis = System.currentTimeMillis() - eVar.f88402f;
        if (eVar.f88397a != null && currentTimeMillis <= 200 && eVar.q.f(eVar.f88400d, eVar.f88401e) && eVar.q.f(motionEvent.getX() - ((float) eVar.f88409m), motionEvent.getY() - ((float) eVar.n))) {
            eVar.f88397a.c(eVar.q);
        }
        if (!this.s.b() || (bVar = this.D) == null) {
            z2 = false;
        } else {
            bVar.f88162c = getCenterX() - this.D.f88162c;
            this.D.f88163d = getCenterY() - this.D.f88163d;
            e eVar2 = this.s;
            z2 = true;
            eVar2.s = true;
            if (eVar2.f88397a == null || !eVar2.a()) {
                z3 = false;
            } else {
                RectF helpRect = eVar2.q.getHelpRect();
                o.a(helpRect, helpRect.centerX(), helpRect.centerY(), eVar2.q.getStickerRotate());
                o.a(helpRect, eVar2.q.getStickerScale());
                eVar2.f88397a.a(eVar2.q, helpRect, new i(eVar2.f88409m + ((int) eVar2.f88403g), eVar2.n + ((int) eVar2.f88404h), true, false, eVar2.d()));
                if (eVar2.r) {
                    eVar2.d();
                    eVar2.a(false);
                    eVar2.r = false;
                }
                eVar2.f88397a.a(eVar2.q, true, false);
                z3 = true;
            }
            if (eVar2.o) {
                long currentTimeMillis2 = System.currentTimeMillis() - eVar2.f88402f;
                int abs = (int) Math.abs(motionEvent.getX() - (eVar2.f88400d + ((float) eVar2.f88409m)));
                if (g.f88154a != null) {
                    i2 = g.f88154a.d();
                } else {
                    i2 = 0;
                }
                int abs2 = (int) Math.abs((motionEvent.getY() - ((float) i2)) - (eVar2.f88401e + ((float) eVar2.n)));
                if (currentTimeMillis2 <= 200 && (abs <= 5 || abs2 <= 5)) {
                    if (!eVar2.v.a()) {
                        if (eVar2.f88405i || eVar2.d()) {
                            if (eVar2.f88397a != null) {
                                new com.ss.android.ugc.aweme.editSticker.interact.g().f88167a.storeBoolean("text_sticker_hint_set", true);
                                eVar2.f88397a.a(eVar2.q, true);
                            }
                            eVar2.a(false);
                        } else {
                            if (eVar2.f88397a != null) {
                                eVar2.f88397a.a(eVar2.q, eVar2.q.f88710m);
                            }
                            eVar2.a(!eVar2.q.f88710m);
                        }
                    }
                    if (eVar2.u != null) {
                        eVar2.u.a();
                    }
                }
            } else {
                z2 = z3;
            }
            if (eVar2.u != null) {
                eVar2.u.d();
            }
        }
        this.F = false;
        this.E = false;
        this.G = false;
        e eVar3 = this.s;
        eVar3.f88403g = 0.0f;
        eVar3.f88404h = 0.0f;
        setTouching(false);
        return z2;
    }

    public final boolean b(ScaleGestureDetector scaleGestureDetector) {
        if (!f()) {
            return false;
        }
        if ((g.a().f88140d && scaleGestureDetector.getScaleFactor() > 1.0f && this.q.B.getTextSize() >= Keva.getRepo("text_max_size_repo").getFloat("max_size_key", -1.0f)) || !r() || (scaleGestureDetector.getScaleFactor() > 1.0f ? this.f88705h.f88363a > 11.0f : this.f88705h.f88363a < 0.4f)) {
            return false;
        }
        this.f88705h.f88363a *= scaleGestureDetector.getScaleFactor();
        invalidate();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(Canvas canvas) {
        boolean z2;
        this.f88705h.f88365c.x = this.f88703f;
        this.f88705h.f88365c.y = this.f88704g;
        e();
        getFontSize();
        c cVar = this.q;
        if (!this.f88710m || this.H || this.z) {
            z2 = false;
        } else {
            z2 = true;
        }
        cVar.o = z2;
        this.q.a(canvas, this.f88705h);
    }

    public final void a(float f2, boolean z2) {
        if (z2) {
            setAlpha(1.0f);
        } else {
            setAlpha(f2);
        }
    }

    public final void b(List<TextStickerTextWrap> list, Object obj) {
        TextStickerData textStickerData = this.t;
        if (textStickerData != null) {
            textStickerData.setTextWrapList(list);
        }
        a(list, obj);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(2068);
        super.onMeasure(i2, i3);
        MethodCollector.o(2068);
    }

    public final boolean e(float f2, float f3) {
        return a(getHelpRect(), f2, f3);
    }

    public PointF c(float f2, float f3) {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        return new PointF(f2 - ((float) iArr[0]), f3 - ((float) iArr[1]));
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(2016);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(2016);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private boolean f(float f2, float f3) {
        RectF deleteIconRect = getDeleteIconRect();
        if (deleteIconRect == null) {
            return false;
        }
        Point point = new Point((int) deleteIconRect.centerX(), (int) deleteIconRect.centerY());
        o.a(point, getHelpRect().centerX(), getHelpRect().centerY(), this.f88705h.f88364b);
        if (Math.pow(Math.pow((double) (((float) point.x) - f2), 2.0d) + Math.pow((double) (((float) point.y) - f3), 2.0d), 0.5d) <= ((double) (deleteIconRect.width() / 2.0f))) {
            return true;
        }
        return false;
    }

    public final boolean d(float f2, float f3) {
        if (!f()) {
            return false;
        }
        this.E = a(f2, f3);
        this.s.a(f2, f3);
        return p();
    }

    public boolean b(float f2, float f3) {
        return e(f2, f3);
    }

    public final void a(int i2, int i3) {
        this.o = i2;
        this.p = i3;
        e eVar = this.s;
        eVar.f88409m = i2;
        eVar.n = i3;
        TextStickerData textStickerData = this.t;
        if (textStickerData != null && textStickerData.getEditCenterPoint() != null) {
            setAnimXY(this.t.getEditCenterPoint());
        }
    }

    public final void a(int i2, int i3, int i4, String str) {
        TextStickerData textStickerData = this.t;
        if (textStickerData != null) {
            textStickerData.setBgMode(i2);
            this.t.setColor(i3);
            this.t.setFontType(str);
            this.t.setAlign(i4);
        }
        this.f88707j = i2;
        setDrawStrokeState(i2);
        this.f88708k = i3;
        this.f88709l = str;
        com.ss.android.ugc.aweme.editSticker.text.a.b.a().f88281d = this.f88709l;
        if (i2 == 1 || i2 == 4) {
            setTextColor(i3);
            a(false);
        } else if (i2 == 2) {
            if (i3 == -1) {
                setTextColor(-16777216);
            } else {
                setTextColor(-1);
            }
            if (this.f88710m) {
                setTextColor(1461065763);
            }
            d(i3);
            a(true);
        } else if (i2 == 3) {
            setTextColor(-1);
            d(TextStickerEditText.a(i3));
            a(true);
        }
        this.f88705h.f88366d = i4;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        MethodCollector.i(2074);
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.f88698a) {
            this.f88698a = false;
            this.f88703f = ((float) getMeasuredWidth()) / 2.0f;
            this.f88704g = (((float) getMeasuredHeight()) / 2.0f) - (((float) getFontSize()) / 2.0f);
            this.f88705h.f88364b = 0.0f;
            this.f88705h.f88363a = 1.0f;
            a(this.t);
        }
        MethodCollector.o(2074);
    }

    public q(Context context, SafeHandler safeHandler, TextStickerData textStickerData, boolean z2, com.ss.android.ugc.aweme.editSticker.text.b.a aVar, Boolean bool) {
        super(context);
        MethodCollector.i(2002);
        int i2 = t.f88454a;
        t.f88454a = i2 + 1;
        this.y = i2;
        this.z = false;
        setWillNotDraw(false);
        this.f88700c = safeHandler;
        this.f88705h.f88370h = z2;
        if (g.a().f88139c != null && bool.booleanValue()) {
            com.ss.android.ugc.aweme.editSticker.a.b a2 = g.a().f88139c.a(this, new a(this, (byte) 0));
            this.u = a2;
            a2.f88063a = this.f88705h.f88370h;
        }
        this.q = new c();
        this.s = new e(aVar);
        this.r = new d();
        c cVar = this.q;
        cVar.f88371a = context;
        cVar.E = this;
        cVar.E.setLayerType(2, null);
        cVar.r = com.ss.android.ttve.utils.b.a(context, 28.0f);
        cVar.s = (int) com.ss.android.ttve.utils.b.b(context, 12.0f);
        cVar.t = (int) com.ss.android.ttve.utils.b.b(context, 8.0f);
        cVar.u = cVar.s;
        cVar.v = cVar.t;
        cVar.w = (int) com.ss.android.ttve.utils.b.b(context, 2.0f);
        cVar.x = (int) com.ss.android.ttve.utils.b.b(context, 14.0f);
        cVar.y = (int) com.ss.android.ttve.utils.b.b(context, 2.0f);
        cVar.z = (int) com.ss.android.ttve.utils.b.b(context, 5.0f);
        cVar.f88381k = (int) com.ss.android.ttve.utils.b.b(context, 12.0f);
        cVar.f88382l = (int) com.ss.android.ttve.utils.b.b(context, 9.0f);
        cVar.f88383m = com.ss.android.ttve.utils.b.b(context, 6.0f);
        cVar.n = com.ss.android.ttve.utils.b.b(context, 1.0f);
        cVar.A = t.a(context);
        cVar.f88375e = BitmapFactory.decodeResource(context.getResources(), 2131232465);
        cVar.f88377g = BitmapFactory.decodeResource(context.getResources(), 2131232462);
        cVar.f88374d.set(0, 0, cVar.f88375e.getWidth(), cVar.f88375e.getHeight());
        cVar.f88378h.set(0, 0, cVar.f88377g.getWidth(), cVar.f88377g.getHeight());
        cVar.B.setColor(-1);
        cVar.B.setTypeface(Typeface.DEFAULT_BOLD);
        cVar.B.setTextSize(cVar.r);
        cVar.B.setAntiAlias(true);
        cVar.H = new Paint(cVar.B);
        cVar.H.setColor(-16737912);
        cVar.C.setColor(-2130706433);
        cVar.C.setStyle(Paint.Style.STROKE);
        cVar.C.setAntiAlias(true);
        cVar.C.setStrokeWidth(2.0f);
        cVar.p = new Paint();
        cVar.p.setStyle(Paint.Style.FILL);
        cVar.p.setAntiAlias(true);
        cVar.p.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        cVar.p.setPathEffect(new CornerPathEffect((float) cVar.z));
        cVar.D = new Path();
        cVar.f88380j = new Paint();
        cVar.f88380j.setPathEffect(new DashPathEffect(new float[]{cVar.f88383m, cVar.f88383m}, 0.0f));
        cVar.f88380j.setStyle(Paint.Style.STROKE);
        cVar.f88380j.setColor(-1);
        cVar.f88380j.setStrokeWidth(cVar.n);
        cVar.f88380j.setAntiAlias(true);
        cVar.f88376f = new Path();
        e eVar = this.s;
        SafeHandler safeHandler2 = this.f88700c;
        eVar.q = this;
        eVar.p = safeHandler2;
        this.r.n = this;
        this.s.t = new b();
        this.f88701d = dh.b(context) / 2;
        this.f88702e = dh.a(context) / 2;
        this.A = (Vibrator) a(context, "vibrator");
        this.t = textStickerData;
        this.f88707j = textStickerData.getBgMode();
        this.f88708k = this.t.getColor();
        this.f88705h.f88366d = this.t.getAlign();
        this.f88709l = this.t.getFontType();
        this.f88703f = this.t.getX();
        this.f88704g = this.t.getY();
        this.f88705h.f88364b = this.t.getRotation();
        this.f88705h.f88363a = this.t.getScale();
        this.f88706i = this.t.getTextWrapList();
        this.f88710m = this.t.isGuidanceSticker();
        MethodCollector.o(2002);
    }
}
