package com.ss.android.ugc.aweme.ecommercelive.business.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import android.os.Build;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.c.n;
import com.bytedance.lighten.a.r;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercebase.dto.GImage;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class LogoTuxTextView extends TuxTextView {

    /* renamed from: a  reason: collision with root package name */
    public static final b f87993a = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private List<h> f87994b;

    /* renamed from: e  reason: collision with root package name */
    private double f87995e;

    /* renamed from: f  reason: collision with root package name */
    private double f87996f;

    static {
        Covode.recordClassIndex(55320);
    }

    public LogoTuxTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(55322);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final List<h> getLogoList() {
        return this.f87994b;
    }

    public final void setLogoList(List<h> list) {
        this.f87994b = list;
    }

    public static final class a extends ImageSpan {
        static {
            Covode.recordClassIndex(55321);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Drawable drawable) {
            super(drawable);
            l.d(drawable, "");
        }

        public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
            l.d(canvas, "");
            l.d(paint, "");
            canvas.save();
            Drawable drawable = getDrawable();
            l.b(drawable, "");
            canvas.translate(f2, (float) (((i6 - i4) / 2) - (drawable.getBounds().height() / 2)));
            getDrawable().draw(canvas);
            canvas.restore();
        }
    }

    public static final class c implements Html.ImageGetter {

        /* renamed from: a  reason: collision with root package name */
        public final Context f87997a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f87998b;

        /* renamed from: c  reason: collision with root package name */
        public final double f87999c;

        /* renamed from: d  reason: collision with root package name */
        public final double f88000d;

        static {
            Covode.recordClassIndex(55323);
        }

        public final Drawable getDrawable(String str) {
            l.d(str, "");
            LevelListDrawable levelListDrawable = new LevelListDrawable();
            r.a(str).a(new a(this, levelListDrawable));
            return levelListDrawable;
        }

        public static final class a implements n {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f88001a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ LevelListDrawable f88002b;

            static {
                Covode.recordClassIndex(55324);
            }

            @Override // com.bytedance.lighten.a.c.n
            public final void a() {
            }

            @Override // com.bytedance.lighten.a.c.n
            public final void a(Throwable th) {
            }

            @Override // com.bytedance.lighten.a.c.n
            public final void a(Bitmap bitmap) {
                if (bitmap != null) {
                    this.f88002b.addLevel(1, 1, new BitmapDrawable(this.f88001a.f87997a.getResources(), bitmap));
                    if (this.f88001a.f87999c == -1.0d && this.f88001a.f88000d == -1.0d) {
                        this.f88002b.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    } else {
                        this.f88002b.setBounds(0, 0, (int) this.f88001a.f87999c, (int) this.f88001a.f88000d);
                    }
                    this.f88002b.setLevel(1);
                    this.f88001a.f87998b.requestLayout();
                }
            }

            a(c cVar, LevelListDrawable levelListDrawable) {
                this.f88001a = cVar;
                this.f88002b = levelListDrawable;
            }
        }

        public c(Context context, TextView textView, double d2, double d3) {
            l.d(context, "");
            l.d(textView, "");
            this.f87997a = context;
            this.f87998b = textView;
            this.f87999c = d2;
            this.f88000d = d3;
        }
    }

    public final void a(CharSequence charSequence, List<h> list) {
        if (list == null || list.isEmpty()) {
            setText(charSequence);
        } else {
            b(charSequence, list);
        }
    }

    private final void b(CharSequence charSequence, List<h> list) {
        int i2;
        Spanned fromHtml;
        List<String> urls;
        String str;
        StringBuilder sb = new StringBuilder();
        Iterator<h> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            GImage gImage = it.next().f87778a;
            if (!(gImage == null || (urls = gImage.getUrls()) == null || (str = urls.get(0)) == null)) {
                String a2 = com.a.a("<img src='%s'>", Arrays.copyOf(new Object[]{str}, 1));
                l.b(a2, "");
                sb.append(a2);
            }
        }
        sb.append(" ");
        sb.append(charSequence);
        String sb2 = sb.toString();
        l.b(sb2, "");
        if (Build.VERSION.SDK_INT >= 24) {
            Context context = getContext();
            l.b(context, "");
            fromHtml = Html.fromHtml(sb2, 0, new c(context, this, this.f87995e, this.f87996f), null);
        } else {
            Context context2 = getContext();
            l.b(context2, "");
            fromHtml = Html.fromHtml(sb2, new c(context2, this, this.f87995e, this.f87996f), null);
        }
        if (fromHtml instanceof SpannableStringBuilder) {
            ImageSpan[] imageSpanArr = (ImageSpan[]) fromHtml.getSpans(0, fromHtml.length(), ImageSpan.class);
            for (ImageSpan imageSpan : imageSpanArr) {
                int spanStart = fromHtml.getSpanStart(imageSpan);
                int spanEnd = fromHtml.getSpanEnd(imageSpan);
                l.b(imageSpan, "");
                Drawable drawable = imageSpan.getDrawable();
                l.b(drawable, "");
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) fromHtml;
                spannableStringBuilder.setSpan(new a(drawable), spanStart, spanEnd, 34);
                spannableStringBuilder.removeSpan(imageSpan);
            }
        }
        setText(fromHtml);
    }

    private /* synthetic */ LogoTuxTextView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LogoTuxTextView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a3t, R.attr.a3u});
        l.b(obtainStyledAttributes, "");
        this.f87995e = (double) obtainStyledAttributes.getDimensionPixelSize(1, com.ss.android.ugc.aweme.base.utils.n.a(-1.0d));
        this.f87996f = (double) obtainStyledAttributes.getDimensionPixelSize(0, com.ss.android.ugc.aweme.base.utils.n.a(-1.0d));
        obtainStyledAttributes.recycle();
    }
}
