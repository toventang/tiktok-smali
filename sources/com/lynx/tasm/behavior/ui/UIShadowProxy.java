package com.lynx.tasm.behavior.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.utils.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class UIShadowProxy extends UIGroup<c> {

    /* renamed from: a  reason: collision with root package name */
    public LynxBaseUI f56071a;

    /* renamed from: b  reason: collision with root package name */
    Matrix f56072b = new Matrix();

    /* renamed from: c  reason: collision with root package name */
    private List<c> f56073c;

    /* renamed from: d  reason: collision with root package name */
    private a f56074d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f56075e;

    /* renamed from: f  reason: collision with root package name */
    private h f56076f;

    static {
        Covode.recordClassIndex(35041);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public Rect getBoundRectForOverflow() {
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean enableLayoutAnimation() {
        return this.f56071a.enableLayoutAnimation();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public Rect getBound() {
        return this.f56071a.getBound();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public int getHeight() {
        return this.f56071a.getHeight();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public com.lynx.tasm.a.b.c getLayoutAnimator() {
        return this.f56071a.getLayoutAnimator();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public int getLeft() {
        return this.f56071a.getLeft();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public int getOriginLeft() {
        return this.f56071a.getOriginLeft();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public int getOriginTop() {
        return this.f56071a.getOriginTop();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public JavaOnlyMap getProps() {
        return this.f56071a.getProps();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public int getTop() {
        return this.f56071a.getTop();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public com.lynx.tasm.a.c.a getTransitionAnimator() {
        return this.f56071a.getTransitionAnimator();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public int getWidth() {
        return this.f56071a.getWidth();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean isFlatten() {
        return this.f56071a.isFlatten();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void measure() {
        this.f56071a.measure();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getTranslationZ() {
        LynxBaseUI lynxBaseUI = this.f56071a;
        if (lynxBaseUI instanceof LynxUI) {
            return lynxBaseUI.getTranslationZ();
        }
        return 0.0f;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onPropsUpdated() {
        LynxBaseUI lynxBaseUI = this.f56071a;
        if (lynxBaseUI != null) {
            lynxBaseUI.onPropsUpdated();
        }
        super.onPropsUpdated();
    }

    /* access modifiers changed from: package-private */
    public final a a() {
        if (this.f56074d == null) {
            this.f56074d = new a();
            if (this.mView != null) {
                ((c) this.mView).f56096a = this.f56074d;
            }
        }
        return this.f56074d;
    }

    public final void b() {
        boolean z;
        this.f56076f = null;
        if (this.f56071a.mTransformRaw != null) {
            z = true;
        } else {
            z = false;
        }
        this.f56075e = Boolean.valueOf(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public List<LynxBaseUI> getChildren() {
        if (this.mContext.r) {
            return this.f56071a.getChildren();
        }
        return super.getChildren();
    }

    public static class b {
        static double[] w = {1.0d, 0.8027415617602307d, 0.6443940149772542d, 0.5172818579717866d, 0.41524364653850576d, 0.3333333333333333d, 0.2075805205867436d, 0.1147980049924181d, 0.0424272859905955d, 0.0d};

        /* renamed from: a  reason: collision with root package name */
        Paint f56083a = new Paint(5);

        /* renamed from: b  reason: collision with root package name */
        Paint f56084b;

        /* renamed from: c  reason: collision with root package name */
        Paint f56085c;

        /* renamed from: d  reason: collision with root package name */
        Paint f56086d;

        /* renamed from: e  reason: collision with root package name */
        Paint f56087e;

        /* renamed from: f  reason: collision with root package name */
        Paint f56088f;

        /* renamed from: g  reason: collision with root package name */
        final RectF f56089g;

        /* renamed from: h  reason: collision with root package name */
        final RectF f56090h;

        /* renamed from: i  reason: collision with root package name */
        float[] f56091i;

        /* renamed from: j  reason: collision with root package name */
        float[] f56092j;

        /* renamed from: k  reason: collision with root package name */
        c f56093k;

        /* renamed from: l  reason: collision with root package name */
        final Path f56094l = new Path();

        /* renamed from: m  reason: collision with root package name */
        final Path f56095m = new Path();
        final Path n = new Path();
        final Path o = new Path();
        final Path p = new Path();
        final Path q = new Path();
        final Path r = new Path();
        final Path s = new Path();
        final Path t = new Path();
        final Path u = new Path();
        boolean v = false;

        static {
            Covode.recordClassIndex(35045);
        }

        public b() {
            Paint paint = new Paint(5);
            this.f56084b = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f56084b.setDither(true);
            this.f56085c = new Paint(this.f56084b);
            this.f56086d = new Paint(this.f56084b);
            this.f56087e = new Paint(this.f56084b);
            this.f56089g = new RectF();
            this.f56090h = new RectF();
            this.f56088f = new Paint(this.f56084b);
            this.f56091i = new float[8];
            this.f56092j = new float[8];
        }

        private void a(Path path, float f2, float f3) {
            float f4;
            path.reset();
            if (this.f56093k.a()) {
                f4 = this.f56093k.f56149f;
            } else {
                f4 = -this.f56093k.f56149f;
            }
            RectF rectF = new RectF(0.0f, 0.0f, f2 * 2.0f, f3 * 2.0f);
            RectF rectF2 = new RectF(rectF);
            if (f4 > 0.0f) {
                float min = Math.min(rectF2.width(), rectF2.height()) / 2.0f;
                if (f4 > min) {
                    f4 = min;
                }
            }
            if (f4 <= -0.1f || f4 >= 0.1f) {
                rectF2.inset(f4, f4);
                path.setFillType(Path.FillType.EVEN_ODD);
                path.moveTo(0.0f, f3);
                path.rLineTo(f4, 0.0f);
                path.arcTo(rectF2, 180.0f, 90.0f, false);
                path.arcTo(rectF, 270.0f, -90.0f, false);
                path.close();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0149, code lost:
            if (r9 < 1.0f) goto L_0x014b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.lynx.tasm.behavior.ui.c r26, android.graphics.Rect r27, float[] r28) {
            /*
            // Method dump skipped, instructions count: 1066
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.UIShadowProxy.b.a(com.lynx.tasm.behavior.ui.c, android.graphics.Rect, float[]):void");
        }

        private void a(Paint paint, int[] iArr, float f2, float f3) {
            float f4 = this.f56093k.f56149f;
            float f5 = (f2 + f3) / 2.0f;
            int length = w.length;
            float f6 = 1.0f;
            float f7 = 0.0f;
            char c2 = 2;
            if (!this.f56093k.a()) {
                float f8 = f4 + f5;
                if (((double) f8) <= 1.0E-6d) {
                    paint.setShader(null);
                    return;
                }
                float f9 = f5 / f8;
                int i2 = length + 1;
                float[] fArr = new float[i2];
                int[] iArr2 = new int[i2];
                fArr[0] = 0.0f;
                fArr[1] = f9;
                iArr2[0] = this.f56093k.f56144a;
                iArr2[1] = this.f56093k.f56144a;
                for (int i3 = 2; i3 <= length; i3++) {
                    int i4 = i3 - 1;
                    fArr[i3] = (((1.0f - f9) * ((float) i4)) / ((float) (length - 1))) + f9;
                    double d2 = (double) iArr[0];
                    double d3 = w[i4];
                    Double.isNaN(d2);
                    iArr2[i3] = Color.argb((int) (d2 * d3), iArr[1], iArr[2], iArr[3]);
                }
                paint.setShader(new RadialGradient(f2, f3, f8, iArr2, fArr, Shader.TileMode.CLAMP));
            } else if (((double) f5) <= 1.0E-6d) {
                paint.setShader(null);
            } else {
                float f10 = f4 / f5;
                int i5 = length + 1;
                float[] fArr2 = new float[i5];
                int[] iArr3 = new int[i5];
                fArr2[length] = 1.0f;
                iArr3[length] = this.f56093k.f56144a;
                int i6 = 1;
                while (i6 < length) {
                    int i7 = length - i6;
                    fArr2[i7] = Math.max(f6 - ((((float) i6) * f10) / ((float) (length - 1))), f7);
                    double d4 = (double) iArr[0];
                    double d5 = w[i6];
                    Double.isNaN(d4);
                    iArr3[i7] = Color.argb((int) (d4 * d5), iArr[1], iArr[c2], iArr[3]);
                    i6++;
                    f6 = 1.0f;
                    f7 = 0.0f;
                    c2 = 2;
                }
                fArr2[0] = 0.0f;
                iArr3[0] = Color.argb(0, iArr[1], iArr[2], iArr[3]);
                paint.setShader(new RadialGradient(f2, f3, f5, iArr3, fArr2, Shader.TileMode.CLAMP));
            }
        }
    }

    private Rect c() {
        return new Rect(this.f56071a.getLeft(), this.f56071a.getTop(), this.f56071a.getLeft() + this.f56071a.getWidth(), this.f56071a.getTop() + this.f56071a.getHeight());
    }

    private void d() {
        float[] fArr;
        com.lynx.tasm.behavior.ui.utils.b d2 = this.f56071a.mLynxBackground.d();
        int width = this.f56071a.getWidth();
        int height = this.f56071a.getHeight();
        if (d2 != null) {
            if (width > 0 && height > 0) {
                d2.a((float) width, (float) height);
            }
            fArr = d2.a();
        } else {
            fArr = null;
        }
        if (width > 0 && height > 0) {
            Rect c2 = c();
            a aVar = this.f56074d;
            if (aVar != null) {
                aVar.f56080d = c2;
            }
            ((c) this.mView).f56096a = this.f56074d;
            ((c) this.mView).a(this.f56073c, c2, fArr);
        }
        ((c) this.mView).invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void layout() {
        View view = (View) ((c) this.mView).getParent();
        if (view != null) {
            ((c) this.mView).layout(0, 0, view.getWidth(), view.getHeight());
            if (((c) this.mView).getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) ((c) this.mView).getParent();
                if (getOverflow() != 0) {
                    viewGroup.setClipChildren(false);
                }
                v.a(this.mView, getBoundRectForOverflow());
            }
            LynxBaseUI lynxBaseUI = this.f56071a;
            if (lynxBaseUI instanceof LynxUI) {
                lynxBaseUI.layout();
            }
            d();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public /* synthetic */ View createView(Context context) {
        return new c(this, context);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void removeChild(LynxBaseUI lynxBaseUI) {
        this.f56071a.removeChild(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setOutlineWidth(float f2) {
        a().f56079c = f2;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updateExtraData(Object obj) {
        this.f56071a.updateExtraData(obj);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updateLayoutInfo(LynxBaseUI lynxBaseUI) {
        this.f56071a.updateLayoutInfo(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updatePropertiesInterval(com.lynx.tasm.behavior.v vVar) {
        this.f56071a.updateProperties(vVar);
    }

    public static class c extends com.lynx.tasm.behavior.ui.view.a {

        /* renamed from: a  reason: collision with root package name */
        public a f56096a;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<b> f56097b;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<UIShadowProxy> f56098c;

        static {
            Covode.recordClassIndex(35046);
        }

        @Override // com.lynx.tasm.behavior.ui.view.a
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        }

        @Override // com.lynx.tasm.behavior.ui.view.a
        public void dispatchDraw(Canvas canvas) {
            a(canvas, false);
            super.dispatchDraw(canvas);
            a(canvas, true);
        }

        public c(UIShadowProxy uIShadowProxy, Context context) {
            super(context);
            this.f56098c = new WeakReference<>(uIShadowProxy);
            setWillNotDraw(false);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00ab  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0216  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x022f  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x0352  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0358  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void a(android.graphics.Canvas r54, boolean r55) {
            /*
            // Method dump skipped, instructions count: 864
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.UIShadowProxy.c.a(android.graphics.Canvas, boolean):void");
        }

        public final void a(List<c> list, Rect rect, float[] fArr) {
            this.f56097b = null;
            if (!(list == null || list.isEmpty())) {
                this.f56097b = new ArrayList<>();
                for (c cVar : list) {
                    b bVar = new b();
                    bVar.a(cVar, rect, fArr);
                    this.f56097b.add(bVar);
                }
                invalidate();
            }
        }
    }

    public final void a(List<c> list) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f56073c = list;
            d();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setOutlineColor(int i2) {
        a().f56078b = Integer.valueOf(i2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updateSticky(float[] fArr) {
        this.f56071a.updateSticky(fArr);
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public LynxBaseUI getChildAt(int i2) {
        if (this.mContext.r) {
            return this.f56071a.mChildren.get(i2);
        }
        return super.getChildAt(i2);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public void insertView(LynxUI lynxUI) {
        if (this.mContext.r) {
            ((UIGroup) this.f56071a).insertView(lynxUI);
        } else {
            super.insertView(lynxUI);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public void removeView(LynxBaseUI lynxBaseUI) {
        if (this.mContext.r) {
            ((UIGroup) this.f56071a).removeView(lynxBaseUI);
        } else {
            super.removeView(lynxBaseUI);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setBoxShadow(ReadableArray readableArray) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f56073c = c.a(readableArray);
            d();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void insertChild(LynxBaseUI lynxBaseUI, int i2) {
        this.f56071a.insertChild(lynxBaseUI, i2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public void insertDrawList(LynxBaseUI lynxBaseUI, LynxBaseUI lynxBaseUI2) {
        ((LynxUI) this.f56071a).insertDrawList(lynxBaseUI, lynxBaseUI2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean checkStickyOnParentScroll(int i2, int i3) {
        boolean checkStickyOnParentScroll = this.f56071a.checkStickyOnParentScroll(i2, i3);
        if (checkStickyOnParentScroll) {
            invalidate();
        }
        return checkStickyOnParentScroll;
    }

    public UIShadowProxy(j jVar, LynxBaseUI lynxBaseUI) {
        super(jVar);
        this.mOverflow = 3;
        this.f56071a = lynxBaseUI;
        lynxBaseUI.setParent(this);
        setSign(lynxBaseUI.getSign(), lynxBaseUI.mTagName);
        initialize();
        super.insertChild(this.f56071a, 0);
        if (this.mContext.r) {
            super.insertDrawList(null, this.f56071a);
            super.insertView((LynxUI) this.f56071a);
        }
        b();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updateDrawingLayoutInfo(int i2, int i3, Rect rect) {
        this.f56071a.updateDrawingLayoutInfo(i2, i3, rect);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public com.lynx.tasm.behavior.ui.utils.c f56077a = com.lynx.tasm.behavior.ui.utils.c.NONE;

        /* renamed from: b  reason: collision with root package name */
        public Integer f56078b = -16777216;

        /* renamed from: c  reason: collision with root package name */
        public float f56079c;

        /* renamed from: d  reason: collision with root package name */
        public Rect f56080d;

        /* renamed from: e  reason: collision with root package name */
        Paint f56081e;

        /* renamed from: f  reason: collision with root package name */
        private Path f56082f;

        static {
            Covode.recordClassIndex(35044);
        }

        /* access modifiers changed from: package-private */
        public final void a(Canvas canvas, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
            if (this.f56082f == null) {
                this.f56082f = new Path();
            }
            this.f56082f.reset();
            this.f56082f.moveTo(f2, f3);
            this.f56082f.lineTo(f4, f5);
            this.f56082f.lineTo(f6, f7);
            this.f56082f.lineTo(f8, f9);
            this.f56082f.lineTo(f2, f3);
            canvas.clipPath(this.f56082f);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setLayoutData(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, Rect rect) {
        this.f56071a.setLayoutData(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, rect);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updateLayout(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Rect rect) {
        this.f56071a.updateLayout(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect);
    }
}
