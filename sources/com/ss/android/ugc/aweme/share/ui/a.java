package com.ss.android.ugc.aweme.share.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.share.ui.b;
import h.f.b.l;
import java.io.File;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f124376a;

    /* renamed from: b  reason: collision with root package name */
    public static UrlModel f124377b;

    /* renamed from: c  reason: collision with root package name */
    static String f124378c;

    /* renamed from: d  reason: collision with root package name */
    static String f124379d = "live_share_card.png";

    /* renamed from: e  reason: collision with root package name */
    public static final a f124380e = new a();

    /* renamed from: f  reason: collision with root package name */
    private static final String f124381f = "LiveShareCardHelper";

    private a() {
    }

    static {
        Covode.recordClassIndex(81668);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ui.a$a  reason: collision with other inner class name */
    public static final class C3242a implements b.AbstractC3243b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f124382a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f124383b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f124384c;

        static {
            Covode.recordClassIndex(81669);
        }

        @Override // com.ss.android.ugc.aweme.share.ui.b.AbstractC3243b
        public final void a() {
            String str;
            MethodCollector.i(10282);
            b bVar = this.f124382a;
            Context context = this.f124383b;
            l.d(bVar, "");
            l.d(context, "");
            a.f124379d = d.b(new StringBuilder().append(System.currentTimeMillis()).toString()) + ".png";
            if (com.ss.android.ugc.aweme.lancet.d.f107194b == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                com.ss.android.ugc.aweme.lancet.d.f107194b = context.getCacheDir();
            }
            File file = com.ss.android.ugc.aweme.lancet.d.f107194b;
            l.b(file, "");
            a.f124378c = file.getAbsolutePath();
            l.d(bVar, "");
            bVar.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            bVar.layout(0, 0, bVar.getMeasuredWidth(), bVar.getMeasuredHeight());
            int measuredWidth = bVar.getMeasuredWidth();
            int measuredHeight = bVar.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                if (createBitmap == null) {
                    l.b();
                }
                bVar.draw(new Canvas(createBitmap));
                if (!(createBitmap == null || !BitmapUtils.saveBitmapToSD(createBitmap, a.f124378c, a.f124379d) || (a.f124378c + '/' + a.f124379d) == null)) {
                    this.f124384c.invoke(str);
                }
            }
            MethodCollector.o(10282);
        }

        public C3242a(b bVar, Context context, h.f.a.b bVar2) {
            this.f124382a = bVar;
            this.f124383b = context;
            this.f124384c = bVar2;
        }
    }

    public static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }
}
