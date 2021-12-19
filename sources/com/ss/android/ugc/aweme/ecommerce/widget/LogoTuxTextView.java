package com.ss.android.ugc.aweme.ecommerce.widget;

import android.content.Context;
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
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PromotionLogo;
import h.f.b.l;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class LogoTuxTextView extends TuxTextView {

    /* renamed from: a  reason: collision with root package name */
    public static final b f87595a = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private List<PromotionLogo> f87596b;

    static {
        Covode.recordClassIndex(55063);
    }

    public LogoTuxTextView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public LogoTuxTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(55065);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final List<PromotionLogo> getLogoList() {
        return this.f87596b;
    }

    public final void setLogoList(List<PromotionLogo> list) {
        this.f87596b = list;
    }

    public static final class a extends ImageSpan {
        static {
            Covode.recordClassIndex(55064);
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
        public final Context f87597a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f87598b;

        static {
            Covode.recordClassIndex(55066);
        }

        public final Drawable getDrawable(String str) {
            l.d(str, "");
            LevelListDrawable levelListDrawable = new LevelListDrawable();
            r.a(str).a(new a(this, levelListDrawable));
            return levelListDrawable;
        }

        public static final class a implements n {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f87599a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ LevelListDrawable f87600b;

            static {
                Covode.recordClassIndex(55067);
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
                    this.f87600b.addLevel(1, 1, new BitmapDrawable(this.f87599a.f87597a.getResources(), bitmap));
                    this.f87600b.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    this.f87600b.setLevel(1);
                    this.f87599a.f87598b.invalidate();
                }
            }

            a(c cVar, LevelListDrawable levelListDrawable) {
                this.f87599a = cVar;
                this.f87600b = levelListDrawable;
            }
        }

        public c(Context context, TextView textView) {
            l.d(context, "");
            l.d(textView, "");
            this.f87597a = context;
            this.f87598b = textView;
        }
    }

    public final void a(CharSequence charSequence, List<PromotionLogo> list) {
        if (list == null || list.isEmpty()) {
            setText(charSequence);
        } else {
            b(charSequence, list);
        }
    }

    private final void b(CharSequence charSequence, List<PromotionLogo> list) {
        int i2;
        Spanned fromHtml;
        List<String> urls;
        String str;
        StringBuilder sb = new StringBuilder();
        Iterator<PromotionLogo> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Image image = it.next().f86655a;
            if (!(image == null || (urls = image.getUrls()) == null || (str = urls.get(0)) == null)) {
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
            fromHtml = Html.fromHtml(sb2, 0, new c(context, this), null);
        } else {
            Context context2 = getContext();
            l.b(context2, "");
            fromHtml = Html.fromHtml(sb2, new c(context2, this), null);
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LogoTuxTextView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ LogoTuxTextView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }
}
