package com.ss.android.ugc.aweme.editSticker.text.effect;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.editSticker.b;
import com.ss.android.ugc.aweme.editSticker.text.b.c;
import com.ss.android.ugc.aweme.editSticker.text.b.e;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.o;
import com.ss.android.ugc.aweme.editSticker.text.bean.p;
import com.ss.android.ugc.aweme.editSticker.text.bean.t;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class q extends com.ss.android.ugc.aweme.editSticker.text.view.q {
    private final n A;
    private InnerEffectTextLayoutConfig B;
    private boolean C;

    /* renamed from: a  reason: collision with root package name */
    final View f88584a;

    /* renamed from: b  reason: collision with root package name */
    final View f88585b;

    /* renamed from: c  reason: collision with root package name */
    final View f88586c;

    /* renamed from: d  reason: collision with root package name */
    final View f88587d;

    /* renamed from: e  reason: collision with root package name */
    final o f88588e;

    static {
        Covode.recordClassIndex(55748);
    }

    public final InnerEffectTextLayoutConfig getEffectTextLayoutConfig() {
        return this.B;
    }

    public final boolean getEffectTextMode() {
        return this.C;
    }

    public final void a() {
        if (this.f88706i == null) {
            this.f88706i = new ArrayList();
        }
        this.A.a();
        List<TextStickerTextWrap> list = this.f88706i;
        l.b(list, "");
        c(list, this.B);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.view.q
    public final RectF getCurrentHelpBoxRect() {
        if (this.C) {
            return getEffectTextRect();
        }
        c cVar = this.q;
        l.b(cVar, "");
        RectF a2 = cVar.a();
        l.b(a2, "");
        return a2;
    }

    private final RectF getEffectTextRect() {
        n nVar = this.A;
        Matrix matrix = nVar.getMatrix();
        l.b(matrix, "");
        Context context = nVar.getContext();
        l.b(context, "");
        if (r.c(context)) {
            matrix.setTranslate(nVar.getX(), nVar.getY());
            matrix.preTranslate(nVar.getScaleX(), nVar.getScaleY());
        }
        Rect rect = new Rect();
        nVar.getDrawingRect(rect);
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        return rectF;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.view.q
    public final PointF[] getAnglePointList() {
        if (this.C) {
            RectF effectTextRect = getEffectTextRect();
            return new PointF[]{new PointF(effectTextRect.left, effectTextRect.top), new PointF(effectTextRect.right, effectTextRect.top), new PointF(effectTextRect.right, effectTextRect.bottom), new PointF(effectTextRect.left, effectTextRect.bottom)};
        }
        PointF[] anglePointList = super.getAnglePointList();
        l.b(anglePointList, "");
        return anglePointList;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.view.q
    public final PointF[] getAnglePointListForBlock() {
        if (this.C) {
            RectF effectTextRect = getEffectTextRect();
            return new PointF[]{new PointF(effectTextRect.left, effectTextRect.top), new PointF(effectTextRect.right, effectTextRect.top), new PointF(effectTextRect.right, effectTextRect.bottom), new PointF(effectTextRect.left, effectTextRect.bottom)};
        }
        PointF[] anglePointListForBlock = super.getAnglePointListForBlock();
        l.b(anglePointListForBlock, "");
        return anglePointListForBlock;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.view.q
    public final TextStickerData b() {
        if (this.t == null) {
            this.t = new TextStickerData("", this.f88707j, this.f88708k, this.f88705h.f88366d, this.f88709l, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536870880, null);
            TextStickerData textStickerData = this.t;
            List<TextStickerTextWrap> list = this.f88706i;
            l.b(list, "");
            textStickerData.setTextWrapList(list);
        }
        this.t.setX(this.f88703f);
        this.t.setY(this.f88704g);
        this.t.setRotation(this.f88705h.f88364b);
        this.t.setScale(this.f88705h.f88363a);
        TextStickerData textStickerData2 = this.t;
        List<TextStickerTextWrap> list2 = this.f88706i;
        l.b(list2, "");
        textStickerData2.setTextWrapList(list2);
        this.t.setBgMode(this.f88707j);
        this.t.setColor(this.f88708k);
        this.t.setAlign(this.f88705h.f88366d);
        this.t.setFontType(this.f88709l);
        TextStickerData textStickerData3 = this.t;
        l.b(textStickerData3, "");
        return textStickerData3;
    }

    public final void setEffectTextLayoutConfig(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig) {
        this.B = innerEffectTextLayoutConfig;
    }

    public final void setEffectTextMode(boolean z) {
        this.C = z;
    }

    private static List<TextStickerTextWrap> a(List<TextStickerTextWrap> list) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = b.a().f88048c;
        int i3 = 0;
        for (TextStickerTextWrap textStickerTextWrap : list) {
            if (i3 >= i2) {
                break;
            } else if (textStickerTextWrap.getText().length() + i3 <= i2) {
                arrayList.add(textStickerTextWrap);
                i3 += textStickerTextWrap.getText().length();
            } else {
                String text = textStickerTextWrap.getText();
                Objects.requireNonNull(text, "null cannot be cast to non-null type java.lang.String");
                String substring = text.substring(0, i2 - i3);
                l.b(substring, "");
                arrayList.add(t.a(substring, false));
                i3 = i2;
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.view.q
    public final void b(boolean z) {
        if (z) {
            super.b(z);
        } else if (this.t != null && this.t.hasPositionData()) {
            if (this.t.getCoverExtraData().isPortrait() == this.f88588e.f88436a) {
                this.f88703f = this.t.getX();
                this.f88704g = this.t.getY();
            }
            this.f88705h.f88364b = this.t.getRotation();
            this.f88705h.f88363a = this.t.getScale();
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.view.q
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        if (this.C) {
            n nVar = this.A;
            nVar.setX(this.f88703f - (((float) nVar.getWidth()) / 2.0f));
            nVar.setY(this.f88704g - (((float) nVar.getHeight()) / 2.0f));
            nVar.setRotation(this.f88705h.f88364b);
            nVar.setScaleX(this.f88705h.f88363a);
            nVar.setScaleY(this.f88705h.f88363a);
            n nVar2 = this.A;
            e eVar = this.s;
            l.b(eVar, "");
            if (eVar.f88405i) {
                drawable = nVar2.f88545b;
            } else {
                drawable = null;
            }
            nVar2.setBackground(drawable);
        } else {
            a(canvas);
        }
        this.r.a(this.f88705h.f88363a, this.f88705h.f88364b, this.f88703f, this.f88704g);
        this.r.b(this.f88705h.f88363a, this.f88705h.f88364b, this.f88703f, this.f88704g);
    }

    public final void a(boolean z) {
        if (!z) {
            this.f88584a.setVisibility(4);
            this.f88585b.setVisibility(4);
            this.f88586c.setVisibility(4);
            this.f88587d.setVisibility(4);
        } else if (this.f88588e.f88436a) {
            this.f88584a.setVisibility(0);
            this.f88585b.setVisibility(0);
            this.f88586c.setVisibility(4);
            this.f88587d.setVisibility(4);
        } else {
            this.f88584a.setVisibility(4);
            this.f88585b.setVisibility(4);
            this.f88586c.setVisibility(0);
            this.f88587d.setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.view.q
    public final boolean b(float f2, float f3) {
        if (this.C) {
            return a(getEffectTextRect(), f2, f3);
        }
        return e(f2, f3);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.view.q
    public final boolean a(float f2, float f3) {
        if (this.C) {
            return a(getEffectTextRect(), f2, f3);
        }
        return e(f2, f3 - ((float) this.p));
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.view.q
    public final PointF c(float f2, float f3) {
        float f4;
        float f5;
        float f6;
        PointF c2 = super.c(f2, f3);
        if (this.f88588e.f88437b == 0.0f) {
            f4 = 1.0f;
        } else {
            f4 = this.f88588e.f88437b;
        }
        if (this.f88588e.f88436a) {
            f6 = c2.x / f4;
            f5 = ((((float) (-getHeight())) * (1.0f - f4)) / 2.0f) + (c2.y / f4);
        } else {
            f5 = c2.y / f4;
            f6 = (c2.x / f4) + ((((float) (-getWidth())) * (1.0f - f4)) / 2.0f);
        }
        return new PointF(f6, f5);
    }

    private final void c(List<TextStickerTextWrap> list, Object obj) {
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig = (InnerEffectTextLayoutConfig) obj;
        this.B = innerEffectTextLayoutConfig;
        if (innerEffectTextLayoutConfig != null) {
            this.C = true;
            this.A.setInnerLayoutConfig(innerEffectTextLayoutConfig);
            this.A.setVisibility(0);
            n nVar = this.A;
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (T t : list) {
                    arrayList.add(new p(t.getText(), t.getSelectionStart(), t.isReplaceString(), false, 8));
                }
            }
            nVar.setText(arrayList);
            return;
        }
        this.C = false;
        this.A.setVisibility(4);
        List<TextStickerTextWrap> a2 = a(list);
        ArrayList arrayList2 = new ArrayList();
        for (T t2 : a2) {
            if (t2.safeStrPair().f88415a.length() > 0) {
                arrayList2.add(t2);
            }
        }
        ArrayList arrayList3 = arrayList2;
        if (!(!arrayList3.isEmpty()) || arrayList3 == null) {
            this.q.a(n.d(t.a("", false)));
            return;
        }
        this.q.a(arrayList3);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.view.q
    public final void a(List<TextStickerTextWrap> list, Object obj) {
        l.d(list, "");
        this.f88706i = list;
        List<TextStickerTextWrap> list2 = this.f88706i;
        String string = getContext().getString(R.string.esw);
        l.b(string, "");
        l.d(string, "");
        ArrayList arrayList = new ArrayList();
        if (list2 != null) {
            for (TextStickerTextWrap textStickerTextWrap : list2) {
                String text = textStickerTextWrap.getText();
                if (text == null || text.length() == 0) {
                    arrayList.add(t.a(string, true));
                } else {
                    arrayList.add(textStickerTextWrap);
                }
            }
        }
        c(arrayList, obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(Context context, SafeHandler safeHandler, TextStickerData textStickerData, o oVar) {
        super(context, safeHandler, textStickerData, false, null, false);
        l.d(context, "");
        l.d(safeHandler, "");
        l.d(oVar, "");
        MethodCollector.i(4945);
        this.f88588e = oVar;
        Context context2 = getContext();
        l.b(context2, "");
        n nVar = new n(context2);
        nVar.setEditable(false);
        nVar.setMaxTextWidth(oVar.f88438c);
        nVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        nVar.setVisibility(4);
        this.A = nVar;
        View view = new View(getContext());
        view.setBackgroundColor(androidx.core.content.b.c(view.getContext(), R.color.bl));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 48;
        view.setLayoutParams(layoutParams);
        view.setVisibility(4);
        this.f88584a = view;
        View view2 = new View(getContext());
        view2.setBackgroundColor(androidx.core.content.b.c(view2.getContext(), R.color.bl));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 80;
        view2.setLayoutParams(layoutParams2);
        view2.setVisibility(4);
        this.f88585b = view2;
        View view3 = new View(getContext());
        view3.setBackgroundColor(androidx.core.content.b.c(view3.getContext(), R.color.bl));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 3;
        view3.setLayoutParams(layoutParams3);
        view3.setVisibility(4);
        this.f88586c = view3;
        View view4 = new View(getContext());
        view4.setBackgroundColor(androidx.core.content.b.c(view4.getContext(), R.color.bl));
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 5;
        view4.setLayoutParams(layoutParams4);
        view4.setVisibility(4);
        this.f88587d = view4;
        addView(nVar);
        addView(view);
        addView(view2);
        addView(view3);
        addView(view4);
        post(new Runnable(this) {
            /* class com.ss.android.ugc.aweme.editSticker.text.effect.q.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ q f88589a;

            static {
                Covode.recordClassIndex(55749);
            }

            {
                this.f88589a = r1;
            }

            public final void run() {
                q qVar = this.f88589a;
                if (qVar.f88588e.f88436a) {
                    int width = qVar.getWidth();
                    int height = (qVar.getHeight() - ((qVar.getWidth() * 4) / 3)) / 2;
                    ViewGroup.LayoutParams layoutParams = qVar.f88584a.getLayoutParams();
                    layoutParams.width = width;
                    layoutParams.height = height;
                    qVar.f88584a.setLayoutParams(layoutParams);
                    ViewGroup.LayoutParams layoutParams2 = qVar.f88585b.getLayoutParams();
                    layoutParams2.width = width;
                    layoutParams2.height = height;
                    qVar.f88585b.setLayoutParams(layoutParams2);
                    return;
                }
                int height2 = qVar.getHeight();
                int width2 = (qVar.getWidth() - ((qVar.getHeight() * 3) / 4)) / 2;
                ViewGroup.LayoutParams layoutParams3 = qVar.f88586c.getLayoutParams();
                layoutParams3.width = width2;
                layoutParams3.height = height2;
                qVar.f88586c.setLayoutParams(layoutParams3);
                ViewGroup.LayoutParams layoutParams4 = qVar.f88587d.getLayoutParams();
                layoutParams4.width = width2;
                layoutParams4.height = height2;
                qVar.f88587d.setLayoutParams(layoutParams4);
            }
        });
        this.s.t = null;
        this.s.f88408l = 1000;
        MethodCollector.o(4945);
    }

    /* access modifiers changed from: protected */
    public final void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        l.d(view, "");
        if (l.a(view, this.A)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(i4) - ((((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i5)), 0));
            return;
        }
        super.measureChildWithMargins(view, i2, i3, i4, i5);
    }
}
