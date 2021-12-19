package com.ss.android.ugc.aweme.live.alphaplayer.f;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.live.alphaplayer.c.b;

public final class a {
    static {
        Covode.recordClassIndex(69391);
    }

    public static Bitmap a(b bVar) {
        MethodCollector.i(2796);
        if (TextUtils.isEmpty(bVar.f108186e)) {
            MethodCollector.o(2796);
            return null;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setStyle(Paint.Style.FILL);
        if (bVar.f108189h) {
            textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        }
        if (bVar.f108188g <= 0) {
            bVar.f108188g = 36;
        }
        textPaint.setTextSize(((float) bVar.f108188g) * 0.6f);
        if (TextUtils.isEmpty(bVar.f108187f)) {
            bVar.f108187f = "#FF000000";
        }
        textPaint.setColor(Color.parseColor(bVar.f108187f));
        Rect rect = new Rect();
        textPaint.getTextBounds(bVar.f108186e, 0, bVar.f108186e.length(), rect);
        int width = rect.width();
        int height = rect.height();
        rect.set(0, 0, width, height);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        createBitmap.eraseColor(0);
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        canvas.drawText(bVar.f108186e, (float) rect.centerX(), (float) ((rect.centerY() + ((fontMetricsInt.bottom - fontMetricsInt.top) / 2)) - fontMetricsInt.bottom), textPaint);
        MethodCollector.o(2796);
        return createBitmap;
    }
}
