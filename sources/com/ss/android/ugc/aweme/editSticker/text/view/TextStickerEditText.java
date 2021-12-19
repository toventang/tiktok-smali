package com.ss.android.ugc.aweme.editSticker.text.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.text.a.b;
import com.ss.android.ugc.aweme.editSticker.text.b.f;
import com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.t;
import com.ss.android.ugc.tools.utils.r;
import h.f.b.l;
import h.p;
import java.util.Iterator;
import java.util.List;

public class TextStickerEditText extends AppCompatEditText {

    /* renamed from: a  reason: collision with root package name */
    protected int f88629a;

    /* renamed from: b  reason: collision with root package name */
    protected Paint f88630b;

    /* renamed from: c  reason: collision with root package name */
    protected TextPaint f88631c;

    /* renamed from: d  reason: collision with root package name */
    protected Path f88632d;

    /* renamed from: e  reason: collision with root package name */
    protected int f88633e = -1;

    /* renamed from: f  reason: collision with root package name */
    protected int f88634f;

    /* renamed from: g  reason: collision with root package name */
    public List<InteractTextStructWrap> f88635g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f88636h;

    /* renamed from: i  reason: collision with root package name */
    private int f88637i = 1;

    /* renamed from: j  reason: collision with root package name */
    private int f88638j = 2;

    /* renamed from: k  reason: collision with root package name */
    private int f88639k;

    /* renamed from: l  reason: collision with root package name */
    private int f88640l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f88641m;
    private int n;
    private int o;
    private float p;
    private float q;

    static {
        Covode.recordClassIndex(55778);
    }

    /* access modifiers changed from: protected */
    public int getScene() {
        return 0;
    }

    public int getAlign() {
        return this.f88638j;
    }

    public int getBgColor() {
        return this.o;
    }

    public int getBgColorMode() {
        return this.n;
    }

    public List<InteractTextStructWrap> getTextStructWrapList() {
        return this.f88635g;
    }

    private String[] getTextStr() {
        if (TextUtils.isEmpty(getText())) {
            return null;
        }
        Layout layout = getLayout();
        String obj = getText().toString();
        String[] strArr = new String[getLineCount()];
        int i2 = 0;
        int i3 = 0;
        while (i2 < getLineCount()) {
            int lineEnd = layout.getLineEnd(i2);
            strArr[i2] = obj.substring(i3, lineEnd);
            layout.getLineBounds(i2, new Rect());
            i2++;
            i3 = lineEnd;
        }
        return strArr;
    }

    public void setMode(int i2) {
        this.f88637i = i2;
    }

    public void setTextStructWrapList(List<InteractTextStructWrap> list) {
        this.f88635g = list;
    }

    public void setMaxWidth(int i2) {
        if (i2 > 0) {
            super.setMaxWidth(i2);
        }
    }

    private void setMaskBlurColor(int i2) {
        setTextColor(-1);
        setShadowLayer(12.0f, 0.0f, 0.0f, i2);
    }

    public static int a(int i2) {
        return Color.argb(153, (16711680 & i2) >> 16, (65280 & i2) >> 8, i2 & 255);
    }

    public void setAligin(int i2) {
        this.f88638j = i2;
        if (i2 == 1) {
            setGravity(3);
        } else if (i2 == 2) {
            setGravity(17);
        } else if (i2 == 3) {
            setGravity(5);
        }
    }

    public void setFontSize(int i2) {
        float f2 = (float) i2;
        float f3 = f2 / 28.0f;
        this.f88629a = (int) (r.a(getContext(), 6.0f) * f3);
        this.f88634f = (int) (r.a(getContext(), 5.0f) * f3);
        this.f88630b.setPathEffect(new CornerPathEffect((float) this.f88634f));
        setLineSpacing((float) this.f88629a, getLineSpacingMultiplier());
        setTextSize(f2);
    }

    public void setFontType(Typeface typeface) {
        boolean z;
        if (getTypeface() != typeface) {
            setTypeface(typeface);
            if (this.f88631c.getTypeface() != typeface) {
                this.f88631c.setTypeface(typeface);
            }
        }
        b a2 = b.a();
        int scene = getScene();
        if (a2.d(scene) != null) {
            z = a2.d(scene).a();
        } else {
            z = false;
        }
        this.f88641m = z;
        if (z) {
            setMaskBlurColor(getCurrentTextColor());
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        char c2;
        char c3;
        int i2;
        int i3 = this.f88637i;
        int i4 = 1;
        if (!(i3 == 1 || i3 == 4 || TextUtils.isEmpty(getText().toString()))) {
            this.f88630b.setColor(this.f88633e);
            String[] textStr = getTextStr();
            if (!(textStr == null || textStr.length == 0)) {
                int length = textStr.length;
                Point[][] pointArr = new Point[length][];
                Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
                int ceil = (int) Math.ceil((double) (fontMetrics.descent - fontMetrics.ascent));
                int textSize = ((int) getTextSize()) / 4;
                if (this.f88638j == 1) {
                    this.f88639k = getPaddingLeft();
                }
                if (this.f88638j == 3) {
                    this.f88639k = getMeasuredWidth() - getPaddingRight();
                }
                if (this.f88638j == 2) {
                    this.f88639k = getMeasuredWidth() / 2;
                }
                int i5 = -1;
                int i6 = -1;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (i7 < length) {
                    int measureText = (int) getPaint().measureText(textStr[i7]);
                    int i12 = this.f88639k;
                    int i13 = measureText / 2;
                    int i14 = this.f88629a;
                    int i15 = (i12 - i13) - (i14 * 2);
                    int i16 = i12 + i13 + (i14 * 2);
                    int i17 = this.f88638j;
                    if (i17 == i4) {
                        i15 = i12 - (i14 * 2);
                        i16 = i12 + measureText + (i14 * 2);
                    } else if (i17 == 3) {
                        i15 = (i12 - measureText) - (i14 * 2);
                        i16 = i12 + (i14 * 2);
                    }
                    if (TextUtils.isEmpty(textStr[i7]) || textStr[i7].trim().length() == 0) {
                        i16 = getMeasuredWidth() / 2;
                        int i18 = this.f88638j;
                        if (i18 == 1) {
                            i16 = this.f88629a;
                        }
                        if (i18 == 3) {
                            i16 = getMeasuredWidth() - this.f88629a;
                        }
                        i15 = i16;
                    }
                    if (Math.abs(measureText - i8) >= textSize || ((i2 = this.f88638j) != 1 ? i2 != 3 ? i2 != 2 || i10 <= 0 : i10 <= 0 : i9 <= 0)) {
                        i9 = i16;
                        i10 = i15;
                    }
                    if (i7 == 0) {
                        b.a();
                        int scene = getScene();
                        String[] strArr = b.f88277a;
                        int length2 = strArr.length;
                        int i19 = 0;
                        while (true) {
                            if (i19 >= length2) {
                                i11 = this.f88640l - this.f88629a;
                                break;
                            } else if (strArr[i19].equals(b.a().b(scene))) {
                                i11 = this.f88640l;
                                break;
                            } else {
                                i19++;
                            }
                        }
                    }
                    int i20 = i11 + ceil;
                    if (length > 1) {
                        if (i7 > 0) {
                            i5 = (int) getPaint().measureText(textStr[i7 - 1]);
                        }
                        if (i7 < length - 1) {
                            i6 = (int) getPaint().measureText(textStr[i7 + 1]);
                        }
                    }
                    if (i5 > 0 && measureText >= i5) {
                        i20 += this.f88629a;
                    }
                    if (i6 > 0 && measureText > i6) {
                        i20 += this.f88629a;
                    }
                    if (i7 == 0) {
                        i11 -= this.f88629a;
                    }
                    if (i7 == length - 1) {
                        i20 += this.f88629a;
                    }
                    pointArr[i7] = new Point[]{new Point(i10, i11), new Point(i9, i11), new Point(i9, i20), new Point(i10, i20)};
                    i7++;
                    i8 = measureText;
                    i11 = i20;
                    i4 = 1;
                }
                this.f88632d.reset();
                for (int i21 = 0; i21 < length; i21++) {
                    if (i21 == 0) {
                        this.f88632d.moveTo((float) pointArr[i21][0].x, (float) pointArr[i21][0].y);
                    }
                    this.f88632d.lineTo((float) pointArr[i21][1].x, (float) pointArr[i21][1].y);
                    if (pointArr[i21][0].x == pointArr[i21][1].x) {
                        this.f88632d.lineTo((float) pointArr[i21][1].x, (float) pointArr[i21][1].y);
                        c3 = 2;
                        this.f88632d.lineTo((float) pointArr[i21][2].x, (float) pointArr[i21][2].y);
                    } else {
                        c3 = 2;
                    }
                    this.f88632d.lineTo((float) pointArr[i21][c3].x, (float) pointArr[i21][c3].y);
                }
                char c4 = 1;
                int i22 = length - 1;
                while (i22 >= 0) {
                    if (pointArr[i22][0].x == pointArr[i22][c4].x) {
                        c2 = 3;
                        this.f88632d.lineTo((float) pointArr[i22][3].x, (float) pointArr[i22][3].y);
                    } else {
                        c2 = 3;
                    }
                    this.f88632d.lineTo((float) pointArr[i22][c2].x, (float) pointArr[i22][c2].y);
                    if (pointArr[i22][0].x == pointArr[i22][1].x) {
                        this.f88632d.lineTo((float) pointArr[i22][0].x, (float) pointArr[i22][0].y);
                    }
                    this.f88632d.lineTo((float) pointArr[i22][0].x, (float) pointArr[i22][0].y);
                    i22--;
                    c4 = 1;
                }
                this.f88632d.lineTo((float) pointArr[0][1].x, (float) pointArr[0][1].y);
                canvas.drawPath(this.f88632d, this.f88630b);
            }
        }
        if (this.f88637i == 4) {
            TextPaint paint = getPaint();
            Paint.Cap strokeCap = paint.getStrokeCap();
            paint.setStrokeCap(Paint.Cap.ROUND);
            Paint.Join strokeJoin = paint.getStrokeJoin();
            paint.setStrokeJoin(Paint.Join.ROUND);
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            float strokeWidth = paint.getStrokeWidth();
            paint.setStrokeWidth(f.a(getContext(), getTextSize()));
            super.onDraw(canvas);
            canvas.drawRect(0.0f, 0.0f, ((float) Math.max(getLayout().getWidth(), getWidth())) * 1.5f, ((float) Math.max(getLayout().getHeight(), getHeight())) * 1.5f, this.f88631c);
            paint.setStrokeCap(strokeCap);
            paint.setStrokeJoin(strokeJoin);
            paint.setStyle(style);
            paint.setStrokeWidth(strokeWidth);
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.f88639k = getMeasuredWidth() / 2;
        this.f88640l = (getLineHeight() - this.f88629a) / 2;
    }

    public final void a(int i2, int i3) {
        this.n = i2;
        this.o = i3;
        if (this.f88641m) {
            setMaskBlurColor(i3);
            this.f88637i = 1;
            return;
        }
        setShadowLayer(0.0f, 0.0f, 0.0f, i3);
        if (i2 == 1) {
            this.f88637i = 1;
            this.f88633e = i3;
            setBackground(null);
            setTextColor(i3);
        } else if (i2 == 4) {
            this.f88637i = 4;
            this.f88633e = i3;
            this.f88631c.setColor(f.a(i3));
            setBackground(null);
            setTextColor(i3);
            setShadowLayer(12.0f, 0.0f, 0.0f, 0);
            if (Build.VERSION.SDK_INT >= 28) {
                setFallbackLineSpacing(false);
            }
        } else if (i2 == 2) {
            this.f88637i = 2;
            this.f88633e = i3;
            if (i3 == -1) {
                setTextColor(-16777216);
            } else {
                setTextColor(-1);
            }
        } else if (i2 == 3) {
            this.f88637i = 3;
            this.f88633e = a(i3);
            setTextColor(-1);
        }
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int i2, int i3) {
        super.onSelectionChanged(i2, i3);
        if (getText() != null && i2 == i3 && t.a(this.f88635g, getText().length())) {
            for (InteractTextStructWrap interactTextStructWrap : this.f88635g) {
                if (i2 > interactTextStructWrap.getRange().getStart() && i2 < interactTextStructWrap.getRange().getEnd()) {
                    setSelection(Math.min(interactTextStructWrap.getRange().getEnd(), getText().toString().length()));
                    return;
                }
            }
        }
    }

    public TextStickerEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f88629a = (int) r.a(context, 6.0f);
        this.f88634f = (int) r.a(context, 5.0f);
        this.q = t.a(context);
        Paint paint = new Paint();
        this.f88630b = paint;
        paint.setColor(this.f88633e);
        this.f88630b.setStyle(Paint.Style.FILL);
        this.f88630b.setAntiAlias(true);
        this.f88630b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.f88630b.setPathEffect(new CornerPathEffect((float) this.f88634f));
        this.f88632d = new Path();
        setLayerType(1, null);
        setLineSpacing((float) this.f88629a, getLineSpacingMultiplier());
        addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.ugc.aweme.editSticker.text.view.TextStickerEditText.AnonymousClass1 */

            static {
                Covode.recordClassIndex(55779);
            }

            public final void afterTextChanged(Editable editable) {
            }

            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                p pVar;
                T t;
                String substring;
                if (TextStickerEditText.this.f88636h) {
                    TextStickerEditText.this.f88636h = false;
                    return;
                }
                int i5 = i4 - i3;
                if (i5 < 0) {
                    List<InteractTextStructWrap> list = TextStickerEditText.this.f88635g;
                    String charSequence2 = charSequence.toString();
                    if (list == null) {
                        pVar = new p(null, 0);
                    } else if (charSequence2 == null) {
                        pVar = new p(null, 0);
                    } else if (i2 < 0 || i2 >= charSequence2.length()) {
                        pVar = new p(null, 0);
                    } else {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it.next();
                            T t2 = t;
                            if (i2 > t2.getRange().getStart() && i2 < t2.getRange().getEnd()) {
                                break;
                            }
                        }
                        T t3 = t;
                        if (t3 == null || !t3.getRange().isValid(charSequence2.length())) {
                            pVar = new p(null, 0);
                        } else {
                            String str = "";
                            if (!(t3.getRange().getStart() == 0 && t3.getRange().getEnd() == charSequence2.length())) {
                                if (t3.getRange().getStart() == 0) {
                                    substring = charSequence2.substring(t3.getRange().getEnd(), charSequence2.length());
                                    l.b(substring, str);
                                } else if (t3.getRange().getEnd() == charSequence2.length()) {
                                    substring = charSequence2.substring(0, t3.getRange().getStart());
                                    l.b(substring, str);
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    String substring2 = charSequence2.substring(0, t3.getRange().getStart());
                                    l.b(substring2, str);
                                    StringBuilder append = sb.append(substring2);
                                    String substring3 = charSequence2.substring(t3.getRange().getEnd(), charSequence2.length());
                                    l.b(substring3, str);
                                    str = append.append(substring3).toString();
                                }
                                str = substring;
                            }
                            t.a(list, t3);
                            pVar = new p(str, Integer.valueOf(t3.getRange().getStart()));
                        }
                    }
                    if (pVar.getFirst() != null) {
                        TextStickerEditText.this.a((String) pVar.getFirst(), ((Integer) pVar.getSecond()).intValue());
                    } else {
                        t.a(TextStickerEditText.this.f88635g, i2, i5);
                    }
                } else {
                    t.a(TextStickerEditText.this.f88635g, i2, i5);
                }
            }
        });
        TextPaint textPaint = new TextPaint();
        this.f88631c = textPaint;
        textPaint.set(getPaint());
        this.f88631c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f88631c.setStyle(Paint.Style.FILL);
    }

    public final void a(String str, int i2) {
        if (str != null) {
            this.f88636h = true;
            if (!t.a(this.f88635g, str.length())) {
                setText(str);
                setSelection(Math.min(i2, getText().toString().length()));
                return;
            }
            SpannableString spannableString = new SpannableString(str);
            Drawable drawable = getContext().getResources().getDrawable(2131232464);
            this.p = getTextSize() * 0.7f;
            float f2 = this.p;
            drawable.setBounds(new Rect(0, 0, (int) f2, (int) f2));
            for (InteractTextStructWrap interactTextStructWrap : this.f88635g) {
                if (interactTextStructWrap.isValid(str.length())) {
                    spannableString.setSpan(new s(drawable, this.q), interactTextStructWrap.getRange().getStart() + 1, interactTextStructWrap.getRange().getStart() + 2, 33);
                    spannableString.setSpan(new UnderlineSpan(), interactTextStructWrap.getRange().getStart() + 2, interactTextStructWrap.getRange().getEnd() - 1, 33);
                }
            }
            setText(spannableString);
            setSelection(Math.min(i2, getText().toString().length()));
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        float lineSpacingExtra = getLineSpacingExtra();
        float lineSpacingMultiplier = getLineSpacingMultiplier();
        setLineSpacing(0.0f, 1.0f);
        setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
        if (getLineCount() > 20) {
            String obj = getText().toString();
            a(obj.substring(0, obj.length() - 1), getText().length());
        }
    }
}
