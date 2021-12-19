package com.ss.android.ugc.aweme.ecommerce.pdp.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.c.n;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.HalfWaistBanner;
import com.ss.android.ugc.aweme.ecommercebase.dto.GImage;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.q;
import h.r;
import java.util.List;

public final class HalfWaistView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final a f86825a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f86826b;

    static {
        Covode.recordClassIndex(54402);
    }

    public HalfWaistView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public HalfWaistView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final View a(int i2) {
        if (this.f86826b == null) {
            this.f86826b = new SparseArray();
        }
        View view = (View) this.f86826b.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f86826b.put(i2, findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54403);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HalfWaistView f86827a;

        static {
            Covode.recordClassIndex(54404);
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a() {
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Throwable th) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(HalfWaistView halfWaistView) {
            this.f86827a = halfWaistView;
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Bitmap bitmap) {
            Object obj;
            Bitmap bitmap2;
            MethodCollector.i(7549);
            BitmapDrawable bitmapDrawable = null;
            try {
                Resources resources = this.f86827a.getResources();
                HalfWaistView halfWaistView = this.f86827a;
                if (bitmap == null) {
                    bitmap2 = null;
                } else {
                    bitmap2 = Bitmap.createBitmap(halfWaistView.getWidth(), halfWaistView.getHeight(), Bitmap.Config.ARGB_8888);
                    Matrix matrix = new Matrix();
                    matrix.postScale(((float) halfWaistView.getWidth()) / ((float) bitmap.getWidth()), ((float) halfWaistView.getHeight()) / ((float) bitmap.getHeight()));
                    Canvas canvas = new Canvas(bitmap2);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    canvas.drawBitmap(bitmap, matrix, paint);
                }
                obj = q.m223constructorimpl(new BitmapDrawable(resources, bitmap2));
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
            if (!q.m228isFailureimpl(obj)) {
                bitmapDrawable = obj;
            }
            BitmapDrawable bitmapDrawable2 = bitmapDrawable;
            if (bitmapDrawable2 != null) {
                this.f86827a.setBackgroundDrawable(bitmapDrawable2);
                MethodCollector.o(7549);
                return;
            }
            MethodCollector.o(7549);
        }
    }

    public static final class c implements n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HalfWaistView f86828a;

        static {
            Covode.recordClassIndex(54405);
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a() {
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Throwable th) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(HalfWaistView halfWaistView) {
            this.f86828a = halfWaistView;
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Bitmap bitmap) {
            if (bitmap != null && bitmap.getWidth() * bitmap.getHeight() != 0) {
                SmartImageView smartImageView = (SmartImageView) this.f86828a.a(R.id.bec);
                l.b(smartImageView, "");
                smartImageView.getLayoutParams().width = (((int) com.bytedance.android.ecommerce.k.l.a(this.f86828a.getContext(), 9.77f)) * bitmap.getWidth()) / bitmap.getHeight();
                Context context = this.f86828a.getContext();
                l.b(context, "");
                ((SmartImageView) this.f86828a.a(R.id.bec)).setBackgroundDrawable(new BitmapDrawable(context.getResources(), bitmap));
            }
        }
    }

    private final void setBackGround(GImage gImage) {
        List<String> urls;
        if (gImage == null || (urls = gImage.getUrls()) == null || urls.isEmpty()) {
            setBackgroundDrawable(null);
        } else {
            com.bytedance.lighten.a.r.a(gImage.toImageUrlModel()).a(new b(this));
        }
    }

    private final void setImage(GImage gImage) {
        if (gImage != null) {
            com.bytedance.lighten.a.r.a(gImage.toImageUrlModel()).a(new c(this));
            return;
        }
        SmartImageView smartImageView = (SmartImageView) a(R.id.bec);
        l.b(smartImageView, "");
        smartImageView.setVisibility(8);
    }

    public final void setHalfWaistUi(HalfWaistBanner halfWaistBanner) {
        Object obj;
        l.d(halfWaistBanner, "");
        setImage(halfWaistBanner.f86616b);
        setBackGround(halfWaistBanner.f86615a);
        String str = halfWaistBanner.f86617c;
        String str2 = halfWaistBanner.f86618d;
        if (!(str2 == null || str2.length() == 0 || str2.charAt(0) == '#')) {
            str2 = "#".concat(String.valueOf(str2));
        }
        TuxTextView tuxTextView = (TuxTextView) a(R.id.bed);
        l.b(tuxTextView, "");
        tuxTextView.setText(str);
        try {
            obj = q.m223constructorimpl(Integer.valueOf(Color.parseColor(str2)));
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        if (q.m228isFailureimpl(obj)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            ((TuxTextView) a(R.id.bed)).setTextColor(num.intValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private HalfWaistView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(7617);
        com.a.a(LayoutInflater.from(context), R.layout.pn, this, true);
        MethodCollector.o(7617);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ HalfWaistView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }
}
