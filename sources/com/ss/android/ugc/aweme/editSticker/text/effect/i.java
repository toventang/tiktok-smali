package com.ss.android.ugc.aweme.editSticker.text.effect;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextWatcher;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.ss.android.ugc.aweme.editSticker.f.c;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextBgConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextCoverConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextStrokeConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.f;
import com.ss.android.ugc.aweme.editSticker.text.bean.j;
import com.ss.android.ugc.aweme.editSticker.text.bean.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.bf;

public class i extends AppCompatEditText {

    /* renamed from: a  reason: collision with root package name */
    InnerEffectTextConfig f88491a;

    /* renamed from: b  reason: collision with root package name */
    public final List<an<InnerEffectTextBgConfig, Bitmap, NinePatch, Rect>> f88492b;

    /* renamed from: c  reason: collision with root package name */
    public int f88493c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f88494d;

    /* renamed from: e  reason: collision with root package name */
    private final List<am<InnerEffectTextCoverConfig, TextPaint, List<TextPaint>>> f88495e;

    /* renamed from: f  reason: collision with root package name */
    private final List<TextPaint> f88496f;

    /* renamed from: g  reason: collision with root package name */
    private final v f88497g;

    /* renamed from: h  reason: collision with root package name */
    private final s f88498h;

    /* renamed from: i  reason: collision with root package name */
    private int f88499i;

    /* renamed from: j  reason: collision with root package name */
    private final kotlinx.coroutines.am f88500j;

    /* renamed from: k  reason: collision with root package name */
    private final Paint.FontMetrics f88501k;

    static {
        Covode.recordClassIndex(55710);
    }

    public final InnerEffectTextConfig getInnerTextConfig() {
        return this.f88491a;
    }

    public final int getMaxViewWidth() {
        return this.f88499i;
    }

    private final void a() {
        List<InnerEffectTextStrokeConfig> strokeConfigs;
        InnerEffectTextConfig innerEffectTextConfig = this.f88491a;
        if (!(innerEffectTextConfig == null || (strokeConfigs = innerEffectTextConfig.getStrokeConfigs()) == null)) {
            for (T t : strokeConfigs) {
                TextPaint textPaint = new TextPaint();
                textPaint.set(getPaint());
                textPaint.setStrokeWidth(t.getStrokeWidth() * 2.0f);
                textPaint.setColor(t.getStrokeColor());
                textPaint.setStrokeJoin(t.getStrokeJoin());
                textPaint.setStyle(Paint.Style.STROKE);
                this.f88496f.add(textPaint);
            }
        }
    }

    public final void setMaxViewWidth(int i2) {
        if (i2 > 0) {
            this.f88499i = i2;
        }
    }

    public void setMaxWidth(int i2) {
        if (i2 > 0) {
            super.setMaxWidth(i2);
        }
    }

    public final void setTextColor(boolean z) {
        InnerEffectTextConfig innerEffectTextConfig = this.f88491a;
        if (innerEffectTextConfig == null) {
            return;
        }
        if (z) {
            setTextColor(innerEffectTextConfig.getReplaceStringColor());
        } else if (innerEffectTextConfig.getGradientType() == k.NONE) {
            setTextColor(innerEffectTextConfig.getTextColorStart());
        }
    }

    static final class b extends h.c.b.a.k implements m<kotlinx.coroutines.am, d<? super z>, Object> {
        int label;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(55714);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, d dVar) {
            super(2, dVar);
            this.this$0 = iVar;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new b(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(kotlinx.coroutines.am amVar, d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                i iVar = this.this$0;
                this.label = 1;
                Object a2 = kotlinx.coroutines.i.a(bf.f159041b, new a(iVar, iVar.f88491a, null), this);
                if (a2 != h.c.a.a.COROUTINE_SUSPENDED) {
                    a2 = z.f158842a;
                }
                if (a2 == obj2) {
                    return obj2;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.requestLayout();
            this.this$0.invalidate();
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private i(Context context) {
        super(context, null);
        l.d(context, "");
        this.f88494d = new Paint(3);
        this.f88495e = new ArrayList();
        this.f88496f = new ArrayList();
        this.f88492b = new ArrayList();
        this.f88497g = new v();
        this.f88498h = new s();
        this.f88493c = 1;
        this.f88499i = getMaxWidth();
        this.f88500j = c.a();
        addTextChangedListener(new TextWatcher(this) {
            /* class com.ss.android.ugc.aweme.editSticker.text.effect.i.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f88502a;

            static {
                Covode.recordClassIndex(55711);
            }

            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f88502a = r1;
            }

            public final void afterTextChanged(Editable editable) {
                i iVar = this.f88502a;
                int i2 = iVar.f88493c;
                int i3 = com.ss.android.ugc.aweme.editSticker.b.a().f88048c;
                i iVar2 = this.f88502a;
                com.ss.android.ugc.aweme.editSticker.f.d.a(iVar, i2, i3, Integer.valueOf(com.ss.android.ugc.aweme.editSticker.f.d.a(iVar2, iVar2.getMaxViewWidth())));
            }
        });
        this.f88501k = new Paint.FontMetrics();
    }

    /* access modifiers changed from: package-private */
    public static final class a extends h.c.b.a.k implements m<kotlinx.coroutines.am, d<? super z>, Object> {
        final /* synthetic */ InnerEffectTextConfig $finalConfig;
        int label;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(55712);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, InnerEffectTextConfig innerEffectTextConfig, d dVar) {
            super(2, dVar);
            this.this$0 = iVar;
            this.$finalConfig = innerEffectTextConfig;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new a(this.this$0, this.$finalConfig, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(kotlinx.coroutines.am amVar, d<? super z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x00f1  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x010a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0030 A[SYNTHETIC] */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
            // Method dump skipped, instructions count: 311
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.effect.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Layout layout;
        if (this.f88491a != null) {
            if (canvas != null) {
                for (T t : this.f88492b) {
                    C c2 = t.f39392c;
                    if (c2 != null) {
                        c2.draw(canvas, t.f39393d);
                    } else {
                        canvas.drawBitmap((Bitmap) t.f39391b, (Rect) null, (Rect) t.f39393d, this.f88494d);
                    }
                }
            }
            getPaint().getFontMetrics(this.f88501k);
            if (canvas != null) {
                int save = canvas.save();
                canvas.translate((float) getPaddingLeft(), ((float) getBaseline()) + this.f88501k.top);
                try {
                    Layout layout2 = getLayout();
                    if (layout2 != null) {
                        for (T t2 : this.f88495e) {
                            for (TextPaint textPaint : t2.f39389c) {
                                v vVar = this.f88497g;
                                String valueOf = String.valueOf(getText());
                                int width = layout2.getWidth();
                                Layout.Alignment alignment = layout2.getAlignment();
                                l.b(alignment, "");
                                b.a(v.a(vVar, valueOf, textPaint, width, alignment, layout2.getSpacingMultiplier(), layout2.getSpacingAdd(), layout2.getEllipsizedWidth()), canvas, t2.f39387a.getOffsetX(), t2.f39387a.getOffsetY());
                            }
                            int width2 = layout2.getWidth();
                            Layout.Alignment alignment2 = layout2.getAlignment();
                            l.b(alignment2, "");
                            StaticLayout a2 = v.a(this.f88497g, String.valueOf(getText()), t2.f39388b, width2, alignment2, layout2.getSpacingMultiplier(), layout2.getSpacingAdd(), layout2.getEllipsizedWidth());
                            a(t2.f39388b, t2.f39387a.getTextColorStart(), t2.f39387a.getTextColorEnd(), t2.f39387a.getGradientType(), t2.f39387a.getGradientOrientation(), a2.getWidth(), a2.getHeight());
                            b.a(a2, canvas, t2.f39387a.getOffsetX(), t2.f39387a.getOffsetY());
                        }
                    }
                    Layout layout3 = getLayout();
                    if (layout3 != null) {
                        Iterator<T> it = this.f88496f.iterator();
                        while (it.hasNext()) {
                            v vVar2 = this.f88497g;
                            String valueOf2 = String.valueOf(getText());
                            int width3 = layout3.getWidth();
                            Layout.Alignment alignment3 = layout3.getAlignment();
                            l.b(alignment3, "");
                            b.a(v.a(vVar2, valueOf2, it.next(), width3, alignment3, layout3.getSpacingMultiplier(), layout3.getSpacingAdd(), layout3.getEllipsizedWidth()), canvas, 0.0f, 0.0f);
                        }
                    }
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        }
        InnerEffectTextConfig innerEffectTextConfig = this.f88491a;
        if (!(innerEffectTextConfig == null || innerEffectTextConfig.getGradientType() == k.NONE || (layout = getLayout()) == null)) {
            TextPaint paint = getPaint();
            l.b(paint, "");
            a(paint, innerEffectTextConfig.getTextColorStart(), innerEffectTextConfig.getTextColorEnd(), innerEffectTextConfig.getGradientType(), innerEffectTextConfig.getGradientOrientation(), layout.getWidth(), layout.getHeight());
        }
        super.onDraw(canvas);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0179  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setInnerTextConfig(com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig r12) {
        /*
        // Method dump skipped, instructions count: 584
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.effect.i.setInnerTextConfig(com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig):void");
    }

    public /* synthetic */ i(Context context, byte b2) {
        this(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        for (T t : this.f88492b) {
            A a2 = t.f39390a;
            D d2 = t.f39393d;
            if (j.f88505c[a2.getDimensionModeWidth().ordinal()] != 1) {
                d2.set(a2.getMarginStart(), ((Rect) d2).top, measuredWidth - a2.getMarginEnd(), ((Rect) d2).bottom);
            } else {
                int gravity = a2.getGravity();
                if ((f.LEFT.getGravity() & gravity) != f.LEFT.getGravity() || (gravity & f.RIGHT.getGravity()) == f.RIGHT.getGravity()) {
                    int gravity2 = a2.getGravity();
                    if ((f.LEFT.getGravity() & gravity2) == f.LEFT.getGravity() && (gravity2 & f.RIGHT.getGravity()) == f.RIGHT.getGravity()) {
                        int width = (measuredWidth - a2.getWidth()) / 2;
                        d2.set(width, ((Rect) d2).top, a2.getWidth() + width, ((Rect) d2).bottom);
                    } else {
                        int gravity3 = a2.getGravity();
                        if ((f.LEFT.getGravity() & gravity3) == f.LEFT.getGravity() || (gravity3 & f.RIGHT.getGravity()) != f.RIGHT.getGravity()) {
                            d2.set(a2.getMarginStart(), ((Rect) d2).top, a2.getMarginStart() + a2.getWidth(), ((Rect) d2).bottom);
                        } else {
                            d2.set((measuredWidth - a2.getWidth()) - a2.getMarginEnd(), ((Rect) d2).top, measuredWidth - a2.getMarginEnd(), ((Rect) d2).bottom);
                        }
                    }
                } else {
                    d2.set(a2.getMarginStart(), ((Rect) d2).top, a2.getMarginStart() + a2.getWidth(), ((Rect) d2).bottom);
                }
            }
            if (j.f88506d[a2.getDimensionModeHeight().ordinal()] != 1) {
                d2.set(((Rect) d2).left, a2.getMarginTop(), ((Rect) d2).right, measuredHeight - a2.getMarginBottom());
            } else {
                int gravity4 = a2.getGravity();
                if ((f.TOP.getGravity() & gravity4) != f.TOP.getGravity() || (gravity4 & f.BOTTOM.getGravity()) == f.BOTTOM.getGravity()) {
                    int gravity5 = a2.getGravity();
                    if ((f.TOP.getGravity() & gravity5) == f.TOP.getGravity() && (gravity5 & f.BOTTOM.getGravity()) == f.BOTTOM.getGravity()) {
                        int height = (measuredHeight - a2.getHeight()) / 2;
                        d2.set(((Rect) d2).left, height, ((Rect) d2).right, a2.getHeight() + height);
                    } else {
                        int gravity6 = a2.getGravity();
                        if ((f.TOP.getGravity() & gravity6) == f.TOP.getGravity() || (gravity6 & f.BOTTOM.getGravity()) != f.BOTTOM.getGravity()) {
                            d2.set(((Rect) d2).left, a2.getMarginTop(), ((Rect) d2).right, a2.getMarginTop() + a2.getHeight());
                        } else {
                            d2.set(((Rect) d2).left, (measuredHeight - a2.getHeight()) - a2.getMarginBottom(), ((Rect) d2).right, measuredHeight - a2.getMarginBottom());
                        }
                    }
                } else {
                    d2.set(((Rect) d2).left, a2.getMarginTop(), ((Rect) d2).right, a2.getMarginTop() + a2.getHeight());
                }
            }
        }
    }

    private final void a(TextPaint textPaint, int i2, int i3, k kVar, j jVar, int i4, int i5) {
        int i6 = j.f88504b[kVar.ordinal()];
        if (i6 == 1) {
            int i7 = j.f88503a[jVar.ordinal()];
            if (i7 == 1) {
                textPaint.setShader(this.f88498h.a(i2, i3, 0, i5));
            } else if (i7 == 2) {
                textPaint.setShader(this.f88498h.a(i2, i3, i4, 0));
            }
        } else if (i6 == 2) {
            textPaint.setColor(i2);
        }
    }
}
