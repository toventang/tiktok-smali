package com.bytedance.tux.input;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.b.a.a;
import com.bytedance.tux.b.k;
import com.bytedance.tux.d.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class TuxEditText extends AppCompatEditText {

    /* renamed from: a  reason: collision with root package name */
    private final k<TextView> f45129a;

    static {
        Covode.recordClassIndex(27524);
    }

    public TuxEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setTuxFont(int i2) {
        this.f45129a.a(this, R.attr.ap4, i2);
    }

    public void dispatchWindowFocusChanged(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                super.dispatchWindowFocusChanged(z);
            } catch (SecurityException e2) {
                e2.printStackTrace();
            }
        } else {
            super.dispatchWindowFocusChanged(z);
        }
    }

    private /* synthetic */ TuxEditText(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                super.onFocusChanged(z, i2, rect);
            } catch (SecurityException e2) {
                e2.printStackTrace();
            }
        } else {
            super.onFocusChanged(z, i2, rect);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxEditText(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, R.attr.bs);
        l.c(context, "");
        this.f45129a = new k<>(new a());
        setTuxFont(b.f44791a.a(this, attributeSet, R.attr.bs));
    }
}
