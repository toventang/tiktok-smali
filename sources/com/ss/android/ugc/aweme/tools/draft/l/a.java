package com.ss.android.ugc.aweme.tools.draft.l;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.c;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public c.a f139812a;

    /* renamed from: b  reason: collision with root package name */
    private Context f139813b;

    static {
        Covode.recordClassIndex(91389);
    }

    public a(Context context) {
        this.f139813b = context;
        this.f139812a = new c.a(context, R.style.w2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.l.a$a  reason: collision with other inner class name */
    public static class C3692a extends ArrayAdapter<CharSequence> {
        static {
            Covode.recordClassIndex(91390);
        }

        public final long getItemId(int i2) {
            return (long) i2;
        }

        public final boolean hasStableIds() {
            return true;
        }

        C3692a(Context context, CharSequence[] charSequenceArr) {
            super(context, (int) R.layout.cw, 16908308, charSequenceArr);
        }
    }

    public final void a(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        this.f139812a.a(new C3692a(this.f139813b, charSequenceArr), onClickListener);
    }
}
