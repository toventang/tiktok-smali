package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import android.text.Html;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.c.n;
import com.bytedance.lighten.a.r;
import h.f.b.l;

public final class b implements Html.ImageGetter {

    /* renamed from: a  reason: collision with root package name */
    public final Context f85150a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f85151b;

    static {
        Covode.recordClassIndex(53218);
    }

    public final Drawable getDrawable(String str) {
        l.d(str, "");
        LevelListDrawable levelListDrawable = new LevelListDrawable();
        r.a(str).a(new a(this, levelListDrawable));
        return levelListDrawable;
    }

    public static final class a implements n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f85152a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LevelListDrawable f85153b;

        static {
            Covode.recordClassIndex(53219);
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
                this.f85153b.addLevel(1, 1, new BitmapDrawable(this.f85152a.f85150a.getResources(), bitmap));
                this.f85153b.setBounds(0, 0, bitmap.getWidth(), com.ss.android.ugc.aweme.base.utils.n.a(13.0d));
                this.f85153b.setLevel(1);
                this.f85152a.f85151b.invalidate();
            }
        }

        a(b bVar, LevelListDrawable levelListDrawable) {
            this.f85152a = bVar;
            this.f85153b = levelListDrawable;
        }
    }

    public b(Context context, TextView textView) {
        l.d(context, "");
        l.d(textView, "");
        this.f85150a = context;
        this.f85151b = textView;
    }
}
