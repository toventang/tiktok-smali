package com.ss.android.ugc.aweme.ecommercebase.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.c.n;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.q;
import h.z;
import java.util.Set;

public final class TagTextView extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    public static final a f87697b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f87698a;

    /* renamed from: c  reason: collision with root package name */
    private int f87699c;

    /* renamed from: d  reason: collision with root package name */
    private int f87700d;

    /* renamed from: e  reason: collision with root package name */
    private Set<a> f87701e;

    /* renamed from: f  reason: collision with root package name */
    private float f87702f;

    /* renamed from: g  reason: collision with root package name */
    private SparseArray f87703g;

    static {
        Covode.recordClassIndex(55174);
    }

    public TagTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final View a(int i2) {
        if (this.f87703g == null) {
            this.f87703g = new SparseArray();
        }
        View view = (View) this.f87703g.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f87703g.put(i2, findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55175);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final Set<a> getTagLayoutParams() {
        return this.f87701e;
    }

    public final float getTagRadius() {
        return this.f87702f;
    }

    public final int getTextFont() {
        return this.f87700d;
    }

    public final int getTextMaxLine() {
        return this.f87699c;
    }

    public final void setTagLayoutParams(Set<a> set) {
        this.f87701e = set;
    }

    public final void setTagRadius(float f2) {
        this.f87702f = f2;
    }

    public final void setTagShow(boolean z) {
        this.f87698a = z;
    }

    public final void setTextFont(int i2) {
        this.f87700d = i2;
    }

    public final void setTextMaxLine(int i2) {
        this.f87699c = i2;
    }

    public final TagTextView a(h.f.a.b<? super TagTextView, z> bVar) {
        l.d(bVar, "");
        bVar.invoke(this);
        return this;
    }

    public final float a(float f2) {
        Context context = getContext();
        l.b(context, "");
        Resources resources = context.getResources();
        l.b(resources, "");
        return (f2 * resources.getDisplayMetrics().density) + 0.5f;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<Integer, Drawable> {
        final /* synthetic */ TagTextView this$0;

        static {
            Covode.recordClassIndex(55176);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(TagTextView tagTextView) {
            super(1);
            this.this$0 = tagTextView;
        }

        /* renamed from: a */
        public final Drawable invoke(Integer num) {
            if (num == null) {
                return null;
            }
            if (num.intValue() == 2) {
                return androidx.core.content.b.a(this.this$0.getContext(), (int) R.drawable.a5z);
            }
            if (num.intValue() == 1) {
                return androidx.core.content.b.a(this.this$0.getContext(), (int) R.drawable.a5y);
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r4 != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setTagBg(com.ss.android.ugc.aweme.ecommercebase.view.a.a r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.ecommercebase.view.TagTextView$b r2 = new com.ss.android.ugc.aweme.ecommercebase.view.TagTextView$b
            r2.<init>(r3)
            r1 = 0
            if (r4 == 0) goto L_0x001c
            com.ss.android.ugc.aweme.ecommercebase.dto.GImage r0 = r4.f87721c
            if (r0 == 0) goto L_0x0024
            com.ss.android.ugc.aweme.ecommercebase.dto.GImage r0 = r4.f87721c
            java.util.List r0 = r0.getUrls()
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0027
        L_0x001a:
            java.lang.Integer r1 = r4.f87719a
        L_0x001c:
            android.graphics.drawable.Drawable r0 = r2.invoke(r1)
            r3.setBackground(r0)
            return
        L_0x0024:
            if (r4 == 0) goto L_0x001c
            goto L_0x001a
        L_0x0027:
            com.ss.android.ugc.aweme.ecommercebase.dto.GImage r0 = r4.f87721c
            com.bytedance.lighten.a.a.a r0 = r0.toImageUrlModel()
            com.bytedance.lighten.a.v r1 = com.bytedance.lighten.a.r.a(r0)
            com.ss.android.ugc.aweme.ecommercebase.view.TagTextView$c r0 = new com.ss.android.ugc.aweme.ecommercebase.view.TagTextView$c
            r0.<init>(r3, r2, r4)
            r1.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercebase.view.TagTextView.setTagBg(com.ss.android.ugc.aweme.ecommercebase.view.a.a):void");
    }

    private final void setTagIcon(com.ss.android.ugc.aweme.ecommercebase.view.a.a aVar) {
        Integer num;
        if (aVar != null) {
            num = aVar.f87719a;
        } else {
            num = null;
        }
        if (num == null || num.intValue() != 0 || aVar.f87721c == null) {
            SmartImageView smartImageView = (SmartImageView) a(R.id.ehv);
            l.b(smartImageView, "");
            smartImageView.setVisibility(8);
            return;
        }
        v a2 = r.a(aVar.f87721c.toImageUrlModel());
        a2.E = (SmartImageView) a(R.id.ehv);
        a2.c();
        SmartImageView smartImageView2 = (SmartImageView) a(R.id.ehv);
        l.b(smartImageView2, "");
        smartImageView2.setVisibility(0);
    }

    public static final class c implements n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TagTextView f87704a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f87705b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommercebase.view.a.a f87706c;

        static {
            Covode.recordClassIndex(55177);
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a() {
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Throwable th) {
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Bitmap bitmap) {
            Object obj;
            Bitmap bitmap2;
            MethodCollector.i(2045);
            TagTextView tagTextView = this.f87704a;
            Object obj2 = null;
            try {
                Resources resources = this.f87704a.getResources();
                TagTextView tagTextView2 = this.f87704a;
                float tagRadius = tagTextView2.getTagRadius();
                if (bitmap == null) {
                    bitmap2 = null;
                } else {
                    bitmap2 = Bitmap.createBitmap(tagTextView2.getWidth(), tagTextView2.getHeight(), Bitmap.Config.ARGB_8888);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    RectF rectF = new RectF(new Rect(0, 0, tagTextView2.getWidth(), tagTextView2.getHeight()));
                    Canvas canvas = new Canvas(bitmap2);
                    canvas.drawARGB(0, 0, 0, 0);
                    canvas.drawRoundRect(rectF, tagRadius, tagRadius, paint);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    int width2 = tagTextView2.getWidth();
                    int height2 = tagTextView2.getHeight();
                    Matrix matrix = new Matrix();
                    matrix.postScale(((float) width2) / ((float) width), ((float) height2) / ((float) height));
                    canvas.drawBitmap(bitmap, matrix, paint);
                }
                obj = q.m223constructorimpl(new BitmapDrawable(resources, bitmap2));
            } catch (Throwable th) {
                obj = q.m223constructorimpl(h.r.a(th));
            }
            if (!q.m228isFailureimpl(obj)) {
                obj2 = obj;
            }
            Drawable drawable = (BitmapDrawable) obj2;
            if (drawable == null) {
                drawable = this.f87705b.invoke(this.f87706c.f87719a);
            }
            tagTextView.setBackground(drawable);
            MethodCollector.o(2045);
        }

        c(TagTextView tagTextView, b bVar, com.ss.android.ugc.aweme.ecommercebase.view.a.a aVar) {
            this.f87704a = tagTextView;
            this.f87705b = bVar;
            this.f87706c = aVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setTagText(com.ss.android.ugc.aweme.ecommercebase.view.a.a r9) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercebase.view.TagTextView.setTagText(com.ss.android.ugc.aweme.ecommercebase.view.a.a):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setTagUi(com.ss.android.ugc.aweme.ecommercebase.view.a.b r13) {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercebase.view.TagTextView.setTagUi(com.ss.android.ugc.aweme.ecommercebase.view.a.b):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TagTextView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TagTextView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(1656);
        com.a.a(LayoutInflater.from(context), R.layout.y8, this, true);
        this.f87699c = 1;
        this.f87700d = 92;
        this.f87702f = a(2.0f);
        MethodCollector.o(1656);
    }
}
