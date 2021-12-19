package com.ss.android.ugc.asve.g;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.vesdk.model.BefTextLayout;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f62092a;

    /* renamed from: b  reason: collision with root package name */
    public int f62093b;

    /* renamed from: c  reason: collision with root package name */
    public int f62094c;

    /* renamed from: d  reason: collision with root package name */
    private TextPaint f62095d;

    /* renamed from: e  reason: collision with root package name */
    private int f62096e;

    /* renamed from: f  reason: collision with root package name */
    private int f62097f;

    /* renamed from: g  reason: collision with root package name */
    private long f62098g;

    /* renamed from: h  reason: collision with root package name */
    private long f62099h;

    /* renamed from: i  reason: collision with root package name */
    private int f62100i;

    /* renamed from: j  reason: collision with root package name */
    private float f62101j;

    /* renamed from: k  reason: collision with root package name */
    private String f62102k;

    static {
        Covode.recordClassIndex(38166);
    }

    public a(BefTextLayout befTextLayout) {
        this.f62092a = befTextLayout.getLineWidth();
        this.f62096e = befTextLayout.getLineCount();
        this.f62101j = befTextLayout.getLineHeight();
        this.f62097f = befTextLayout.getSplit();
        this.f62100i = befTextLayout.getCharSize();
        this.f62098g = befTextLayout.getBackColor();
        this.f62099h = befTextLayout.getTextColor();
        this.f62102k = befTextLayout.getFamilyName();
        TextPaint textPaint = new TextPaint();
        this.f62095d = textPaint;
        textPaint.setAntiAlias(true);
        this.f62095d.setTextSize((float) befTextLayout.getCharSize());
        this.f62095d.setTypeface(Typeface.create(this.f62102k, 0));
        TextPaint textPaint2 = this.f62095d;
        long j2 = this.f62099h;
        textPaint2.setColor(((((int) j2) << 24) & -16777216) | ((((int) j2) >> 8) & 16777215));
        if (Build.VERSION.SDK_INT >= 21) {
            this.f62095d.setLetterSpacing((float) befTextLayout.getLetterSpacing());
        }
        this.f62095d.setTextAlign(Paint.Align.LEFT);
    }

    public final Bitmap a(String str) {
        StaticLayout staticLayout;
        MethodCollector.i(9786);
        if (this.f62097f != 2) {
            staticLayout = new StaticLayout(str, this.f62095d, this.f62092a, Layout.Alignment.ALIGN_NORMAL, this.f62101j, 0.0f, false);
        } else {
            staticLayout = new StaticLayout(str, 0, str.length(), this.f62095d, this.f62092a, Layout.Alignment.ALIGN_NORMAL, this.f62101j, 0.0f, false, TextUtils.TruncateAt.END, this.f62092a * this.f62096e);
        }
        int i2 = this.f62096e;
        if (i2 == 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.f62094c = Math.min(i2, staticLayout.getLineCount());
        Bitmap createBitmap = Bitmap.createBitmap(staticLayout.getWidth(), staticLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        long j2 = this.f62098g;
        canvas.drawColor(((((int) j2) << 24) & -16777216) | ((((int) j2) >> 8) & 16777215));
        staticLayout.draw(canvas);
        int min = Math.min(Math.round((((float) this.f62094c) * this.f62101j * ((float) this.f62100i)) + this.f62095d.getFontMetrics().descent), createBitmap.getHeight());
        this.f62093b = min;
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, this.f62092a, min);
        MethodCollector.o(9786);
        return createBitmap2;
    }
}
