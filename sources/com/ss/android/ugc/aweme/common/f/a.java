package com.ss.android.ugc.aweme.common.f;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.c;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public c.a f76416a;

    /* renamed from: b  reason: collision with root package name */
    private Context f76417b;

    static {
        Covode.recordClassIndex(47173);
    }

    public final void a(DialogInterface.OnCancelListener onCancelListener) {
        this.f76416a.a(onCancelListener);
    }

    public a(Context context) {
        this.f76417b = context;
        this.f76416a = new c.a(context, R.style.w2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.common.f.a$a  reason: collision with other inner class name */
    public static class C1740a extends ArrayAdapter<CharSequence> {
        static {
            Covode.recordClassIndex(47174);
        }

        public final long getItemId(int i2) {
            return (long) i2;
        }

        public final boolean hasStableIds() {
            return true;
        }

        C1740a(Context context, CharSequence[] charSequenceArr) {
            super(context, (int) R.layout.co, 16908308, charSequenceArr);
        }
    }

    public final void a(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        this.f76416a.a(new C1740a(this.f76417b, charSequenceArr), onClickListener);
    }
}
