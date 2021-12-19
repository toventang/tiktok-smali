package com.ss.android.ugc.aweme;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.ss.android.ugc.aweme.account.model.a;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.in.IFestivalService;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.servicimpl.c;
import com.ss.android.ugc.aweme.servicimpl.f;
import com.ss.android.ugc.aweme.servicimpl.h;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.festival.FestivalService;
import com.ss.android.ugc.aweme.watermark.d;
import com.ss.android.ugc.aweme.watermark.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;

public final class ay {
    static {
        Covode.recordClassIndex(41723);
    }

    public static final c a() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        if (createIAVServiceProxybyMonsterPlugin.getStoryService().e()) {
            return new h();
        }
        return new f();
    }

    private static final String a(a aVar) {
        if (aVar == null) {
            return "";
        }
        if (TextUtils.isEmpty(aVar.a())) {
            return aVar.b();
        }
        return aVar.a();
    }

    public static final String[] a(a aVar, int i2, int i3, boolean z, String str) {
        float f2;
        int i4;
        float width;
        float f3;
        String str2;
        MethodCollector.i(8878);
        l.d(str, "");
        d.a aVar2 = new d.a();
        IFestivalService b2 = FestivalService.b();
        l.b(b2, "");
        String a2 = b2.a();
        l.b(a2, "");
        aVar2.a(a2);
        String a3 = a(aVar);
        boolean a4 = com.ss.android.ugc.aweme.watermark.a.a(aVar);
        aVar2.a();
        int[] iArr = new int[1];
        ArrayList arrayList = new ArrayList();
        String concat = "@".concat(String.valueOf(a3));
        com.ss.android.ugc.aweme.watermark.c cVar = new com.ss.android.ugc.aweme.watermark.c();
        if (z) {
            iArr[0] = 2131233801;
        } else {
            iArr[0] = 2131233802;
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(com.ss.android.ugc.aweme.port.in.c.f115622a.getResources(), iArr[0], null);
        if (i2 == 0 || i3 == 0) {
            f2 = 1.0f;
        } else {
            f2 = Math.min(((float) i2) / 750.0f, ((float) i3) / 750.0f);
        }
        Resources resources = com.ss.android.ugc.aweme.port.in.c.f115622a.getResources();
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeResource, (int) (176.0f * f2), (int) (72.0f * f2), true);
        if (TextUtils.isEmpty(concat)) {
            cVar.f144780a = createScaledBitmap;
        } else {
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setTypeface(b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
            textPaint.setColor(resources.getColor(R.color.o2));
            float f4 = 20.0f * f2;
            textPaint.setTextSize(f4);
            float b3 = com.ss.android.ttve.utils.b.b(com.ss.android.ugc.aweme.port.in.c.f115622a, 1.0f);
            float f5 = b3 * 4.0f;
            textPaint.setShadowLayer(0.0f, b3, f5, resources.getColor(R.color.fj));
            int i5 = (int) f4;
            int measureText = (int) (textPaint.measureText(concat) + (5.0f * f2));
            int width2 = createScaledBitmap.getWidth();
            if (a4) {
                i4 = i5 + ((int) Math.ceil((double) (f2 * 4.0f)));
            } else {
                i4 = 0;
            }
            int max = Math.max(width2, i4 + measureText);
            Bitmap createBitmap = Bitmap.createBitmap(max, (int) (((float) createScaledBitmap.getHeight()) + (28.0f * f2)), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setShadowLayer(0.0f, b3, f5, resources.getColor(R.color.fj));
            if (z) {
                width = 0.0f;
            } else {
                width = (float) ((max - createScaledBitmap.getWidth()) + 3);
            }
            canvas.drawBitmap(createScaledBitmap, width, 0.0f, paint);
            if (z) {
                f3 = 0.0f;
            } else {
                f3 = (float) (max - measureText);
            }
            canvas.drawText(concat, f3, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) + (f2 * 4.0f), textPaint);
            cVar.f144780a = createBitmap;
        }
        arrayList.add(cVar);
        com.ss.android.ugc.aweme.watermark.c[] cVarArr = (com.ss.android.ugc.aweme.watermark.c[]) arrayList.toArray(new com.ss.android.ugc.aweme.watermark.c[arrayList.size()]);
        String str3 = dj.f126468k;
        StringBuilder append = new StringBuilder().append(str);
        if (z) {
            str2 = "_leftalign";
        } else {
            str2 = "_rightalign";
        }
        String[] a5 = e.a(cVarArr, str3, append.append(str2).toString());
        l.b(a5, "");
        MethodCollector.o(8878);
        return a5;
    }

    public static final String[] a(a aVar, int i2, int i3, int i4, boolean z, String str) {
        String str2;
        l.d(str, "");
        d.a aVar2 = new d.a();
        IFestivalService b2 = FestivalService.b();
        l.b(b2, "");
        String a2 = b2.a();
        l.b(a2, "");
        aVar2.a(a2);
        com.ss.android.ugc.aweme.watermark.c[] a3 = e.a(i2, i3, a(aVar), com.ss.android.ugc.aweme.watermark.a.a(aVar), com.ss.android.ugc.aweme.publish.a.a.b.a(i4), z, aVar2.a());
        String str3 = dj.f126468k;
        StringBuilder append = new StringBuilder().append(str);
        if (z) {
            str2 = "_leftalign";
        } else {
            str2 = "_rightalign";
        }
        String[] a4 = e.a(a3, str3, append.append(str2).toString());
        l.b(a4, "");
        return a4;
    }
}
