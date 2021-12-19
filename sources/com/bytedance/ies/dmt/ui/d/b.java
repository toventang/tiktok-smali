package com.bytedance.ies.dmt.ui.d;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f33384b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f33385a;

    static {
        Covode.recordClassIndex(19932);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(19933);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final CharSequence a(CharSequence charSequence) {
        if (charSequence == null || (charSequence instanceof a) || this.f33385a != 1) {
            return charSequence;
        }
        return new a.C0730a().a(charSequence).f33382a;
    }

    public b(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            this.f33385a = 0;
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.kk, R.attr.uq, R.attr.aky});
        l.b(obtainStyledAttributes, "");
        this.f33385a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }
}
