package com.ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.tux.f.a.b;
import com.bytedance.tux.f.a.c;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;

public final class CommentSharePackage extends SharePackage {

    /* renamed from: c  reason: collision with root package name */
    public static final a f123940c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Comment f123941a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f123942b;

    static {
        Covode.recordClassIndex(81375);
    }

    public static final SpannableStringBuilder a(Context context, String str, String str2, String str3, Bitmap bitmap, int i2) {
        return a.a(context, str, str2, str3, bitmap, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81376);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static Bitmap a(Bitmap bitmap, int i2, int i3) {
            MethodCollector.i(7239);
            int width = bitmap.getWidth();
            int i4 = width + i2;
            Bitmap createBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            float f2 = (float) i2;
            paint.setStrokeWidth(f2);
            paint.setStyle(Paint.Style.FILL);
            float f3 = ((float) i4) / 2.0f;
            float f4 = (float) (i2 / 2);
            float f5 = (((float) width) / 2.0f) - f4;
            canvas.drawCircle(f3, f3, f5, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            float f6 = f4 + 0.0f;
            canvas.drawBitmap(bitmap, f6, f6, paint);
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setColor(i3);
            paint2.setStrokeWidth(f2);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            canvas.drawCircle(f3, f3, f5, paint2);
            l.b(createBitmap, "");
            MethodCollector.o(7239);
            return createBitmap;
        }

        public static SpannableStringBuilder a(Context context, String str, String str2, String str3, Bitmap bitmap, int i2) {
            String str4;
            String str5;
            Bitmap bitmap2 = bitmap;
            MethodCollector.i(7272);
            l.d(context, "");
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            a.C0730a aVar = new a.C0730a();
            String str6 = context.getString(R.string.cau, str) + ": ";
            if (str2.length() > 0) {
                str4 = "@".concat(String.valueOf(str2));
                str5 = context.getString(R.string.cap, str4) + " ";
            } else {
                str4 = "";
                str5 = str4;
            }
            String str7 = str6 + str5 + str3;
            aVar.b(str6).b(str5).b(str3);
            com.bytedance.ies.dmt.ui.d.a aVar2 = aVar.f33382a;
            int a2 = p.a((CharSequence) str7, str6, 0, false, 6);
            aVar2.a(new b(43), a2, str6.length() + a2);
            int a3 = p.a((CharSequence) str7, str4, 0, false, 6);
            aVar2.a(new b(43), a3, str4.length() + a3);
            if (bitmap2 == null) {
                bitmap2 = BitmapFactory.decodeResource(context.getResources(), 2131232615);
            }
            l.b(bitmap2, "");
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), a(bitmap2, h.g.a.a(TypedValue.applyDimension(1, 1.0f, system.getDisplayMetrics())), context.getResources().getColor(R.color.b6)));
            bitmapDrawable.setBounds(0, 0, i2, i2);
            c cVar = new c(bitmapDrawable);
            boolean a4 = gb.a();
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            cVar.a(a4, h.g.a.a(TypedValue.applyDimension(1, 4.0f, system2.getDisplayMetrics())));
            aVar2.setSpan(cVar, 0, 1, 18);
            MethodCollector.o(7272);
            return aVar2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentSharePackage(SharePackage.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }
}
