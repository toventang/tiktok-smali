package com.ss.android.ugc.aweme.shoutouts.review;

import android.content.Context;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.c;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public c.a f133348a;

    /* renamed from: b  reason: collision with root package name */
    public Context f133349b;

    static {
        Covode.recordClassIndex(87220);
    }

    public a(Context context) {
        c.a aVar;
        this.f133349b = context;
        if (context != null) {
            aVar = new c.a(context, R.style.w2);
        } else {
            aVar = null;
        }
        this.f133348a = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.a$a  reason: collision with other inner class name */
    public static final class C3454a extends ArrayAdapter<CharSequence> {
        static {
            Covode.recordClassIndex(87221);
        }

        public final long getItemId(int i2) {
            return (long) i2;
        }

        public final boolean hasStableIds() {
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3454a(Context context, CharSequence[] charSequenceArr) {
            super(context, (int) R.layout.b0g, 16908308, charSequenceArr);
            if (context == null) {
                l.b();
            }
            Objects.requireNonNull(charSequenceArr, "null cannot be cast to non-null type kotlin.Array<out kotlin.CharSequence?>");
        }
    }
}
