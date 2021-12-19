package com.ss.android.ugc.aweme.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ThumbnailUtils;
import android.os.Build;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.c.e;
import com.bytedance.lighten.a.v;
import com.ss.android.ugc.aweme.am;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cw.g;
import h.f.b.l;
import java.util.List;

public final class p {

    /* renamed from: a */
    public static final p f143164a = new p();

    private p() {
    }

    static {
        Covode.recordClassIndex(93703);
    }

    public static final class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f143165a;

        static {
            Covode.recordClassIndex(93704);
        }

        a(Context context) {
            this.f143165a = context;
        }

        public final void run() {
            p.a(this.f143165a, new Intent(am.f66367a));
            l.d("send appwidget check state broadcast", "");
        }
    }

    public static void a(Context context) {
        l.d(context, "");
        g.c().execute(new a(context));
    }

    public static /* synthetic */ Bitmap a(int[] iArr, Bitmap bitmap) {
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        return a(iArr, bitmap, (float) h.g.a.a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics())));
    }

    public static void a(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            l.b(queryBroadcastReceivers, "");
            for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                intent.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
                context.sendBroadcast(intent);
            }
            return;
        }
        context.sendBroadcast(intent);
    }

    public static void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        r.a("widget_action", new d().a("action_type", str).a("widget_type", str2).f66730a);
    }

    private static Bitmap a(int[] iArr, Bitmap bitmap, float f2) {
        MethodCollector.i(14430);
        l.d(iArr, "");
        l.d(bitmap, "");
        if (iArr[0] < bitmap.getWidth()) {
            bitmap = ThumbnailUtils.extractThumbnail(bitmap, iArr[0], iArr[1]);
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        l.b(bitmap, "");
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawRoundRect(rectF, f2, f2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        l.b(createBitmap, "");
        MethodCollector.o(14430);
        return createBitmap;
    }

    public static void a(Context context, String str, e eVar) {
        l.d(context, "");
        l.d(str, "");
        l.d(eVar, "");
        v a2 = com.bytedance.lighten.a.r.a(str);
        a2.f39906b = context;
        a2.u = Bitmap.Config.RGB_565;
        a2.a(eVar);
    }

    public static void a(String str, String str2, int i2, int i3, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        d a2 = new d().a("request_type", str).a("widget_type", str2).a("status", str);
        if (i2 == 0) {
            a2.a("error_code", i3).a("error_msg", str3);
        }
        r.a("widget_response", a2.f66730a);
    }
}
