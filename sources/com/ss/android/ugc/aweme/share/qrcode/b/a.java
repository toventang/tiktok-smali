package com.ss.android.ugc.aweme.share.qrcode.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.net.Uri;
import android.view.View;
import c.b.e;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.d;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.qrcode.b;
import com.ss.android.ugc.aweme.qrcode.k;
import com.ss.android.ugc.aweme.share.qrcode.view.QRCodeBackgroundLayout;
import com.ss.android.ugc.aweme.share.qrcode.view.QRCodeSquareView;
import com.ss.android.ugc.aweme.shortvideo.util.am;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.FileNotFoundException;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3235a f124201a = new C3235a((byte) 0);

    static {
        Covode.recordClassIndex(81574);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.b.a$a  reason: collision with other inner class name */
    public static final class C3235a {

        /* renamed from: com.ss.android.ugc.aweme.share.qrcode.b.a$a$a  reason: collision with other inner class name */
        public interface AbstractC3236a {
            static {
                Covode.recordClassIndex(81576);
            }

            void a(Uri uri, String str, boolean z);
        }

        static {
            Covode.recordClassIndex(81575);
        }

        private C3235a() {
        }

        public /* synthetic */ C3235a(byte b2) {
            this();
        }

        private static Bitmap a(View view) {
            Bitmap bitmap;
            MethodCollector.i(10354);
            view.setDrawingCacheEnabled(true);
            view.buildDrawingCache();
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                bitmap = Bitmap.createBitmap(drawingCache);
            } else {
                bitmap = null;
            }
            view.setDrawingCacheEnabled(false);
            MethodCollector.o(10354);
            return bitmap;
        }

        private static Bitmap b(View view) {
            Bitmap bitmap;
            MethodCollector.i(10356);
            view.setDrawingCacheEnabled(true);
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                bitmap = Bitmap.createBitmap(drawingCache);
            } else {
                bitmap = null;
            }
            view.setDrawingCacheEnabled(false);
            MethodCollector.o(10356);
            return bitmap;
        }

        private static Bitmap a(Bitmap bitmap, float f2, float f3) {
            float f4;
            MethodCollector.i(10190);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (((float) (width / height)) < f2 / f3) {
                f4 = f2 / ((float) width);
            } else {
                f4 = f3 / ((float) height);
            }
            Matrix matrix = new Matrix();
            matrix.postScale(f4, f4);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            l.b(createBitmap, "");
            MethodCollector.o(10190);
            return createBitmap;
        }

        private static Uri a(Bitmap bitmap, String str, Context context) {
            MethodCollector.i(10358);
            l.d(bitmap, "");
            l.d(context, "");
            Uri a2 = e.a(context, str, "image/jpeg");
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, context.getContentResolver().openOutputStream(a2));
                MethodCollector.o(10358);
                return a2;
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
                MethodCollector.o(10358);
                return null;
            }
        }

        private static void a(Context context, View view, boolean z, boolean z2, AbstractC3236a aVar) {
            if (view != null) {
                b a2 = k.f119754a.a(view, d.b("" + System.currentTimeMillis()) + ".png", z2);
                if (a2 != null) {
                    if (z) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.fgb).a();
                    }
                    view.announceForAccessibility(com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.fgb));
                    if (a2.f119712c) {
                        String str = a2.f119711b;
                        if (str != null && aVar != null) {
                            aVar.a(null, str, a2.f119712c);
                            return;
                        }
                        return;
                    }
                    Uri uri = a2.f119710a;
                    if (uri != null && aVar != null) {
                        aVar.a(uri, null, a2.f119712c);
                    }
                }
            }
        }

        public static void a(Context context, View view, QRCodeSquareView qRCodeSquareView, boolean z, boolean z2, AbstractC3236a aVar) {
            l.d(context, "");
            if (qRCodeSquareView == null || !qRCodeSquareView.f124222b) {
                Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
                new com.ss.android.ugc.aweme.tux.a.i.a(a2).a(a2.getString(R.string.bbo)).a();
                return;
            }
            a(context, view, z, z2, aVar);
        }

        private static void a(Context context, QRCodeBackgroundLayout qRCodeBackgroundLayout, com.ss.android.ugc.aweme.share.qrcode.view.a aVar, boolean z, boolean z2, AbstractC3236a aVar2) {
            MethodCollector.i(10031);
            Bitmap a2 = a(qRCodeBackgroundLayout);
            Bitmap b2 = b(aVar);
            if (a2 == null || b2 == null) {
                MethodCollector.o(10031);
                return;
            }
            float b3 = n.b(context, 250.0f);
            float b4 = n.b(context, 445.0f);
            Bitmap a3 = a(a2, b3, b4);
            Bitmap createBitmap = Bitmap.createBitmap((int) b3, (int) b4, a3.getConfig());
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawBitmap(a3, new Matrix(), null);
            Matrix matrix = new Matrix();
            matrix.postTranslate((b3 - ((float) b2.getWidth())) / 2.0f, n.b(context, 76.0f));
            canvas.drawBitmap(b2, matrix, null);
            String str = d.b("" + System.currentTimeMillis()) + ".png";
            if (z2) {
                String g2 = am.g(context);
                if (BitmapUtils.saveBitmapToSD(createBitmap, g2, str)) {
                    String str2 = g2 + '/' + str;
                    if (z) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.fgb).a();
                    }
                    qRCodeBackgroundLayout.announceForAccessibility(com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.fgb));
                    k.f119754a.a(context, str2);
                    if (aVar2 != null) {
                        aVar2.a(null, str2, z2);
                        MethodCollector.o(10031);
                        return;
                    }
                    MethodCollector.o(10031);
                    return;
                }
            } else {
                l.b(createBitmap, "");
                Uri a4 = a(createBitmap, str, context);
                if (a4 != null) {
                    String a5 = c.d.a.a(context, a4);
                    if (a5 != null) {
                        e.c(context, a5);
                    }
                    if (z) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.fgb).a();
                    }
                    qRCodeBackgroundLayout.announceForAccessibility(com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.fgb));
                    if (aVar2 != null) {
                        aVar2.a(a4, null, z2);
                        MethodCollector.o(10031);
                        return;
                    }
                }
            }
            MethodCollector.o(10031);
        }

        public static void a(Context context, QRCodeSquareView qRCodeSquareView, View view, QRCodeBackgroundLayout qRCodeBackgroundLayout, com.ss.android.ugc.aweme.share.qrcode.view.a aVar, boolean z, boolean z2, AbstractC3236a aVar2) {
            l.d(context, "");
            l.d(qRCodeBackgroundLayout, "");
            l.d(aVar, "");
            if (qRCodeSquareView == null || !qRCodeSquareView.f124222b) {
                Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
                new com.ss.android.ugc.aweme.tux.a.i.a(a2).a(a2.getString(R.string.bbo)).a();
                if (view != null) {
                    view.announceForAccessibility(a2.getString(R.string.bbo));
                    return;
                }
                return;
            }
            a(context, qRCodeBackgroundLayout, aVar, z, z2, aVar2);
        }
    }
}
