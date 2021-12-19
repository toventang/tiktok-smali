package com.ss.android.ugc.aweme.profile.editprofile.pronouns.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class PronounsEditText extends AppCompatEditText {

    /* renamed from: a  reason: collision with root package name */
    private int f116247a;

    static {
        Covode.recordClassIndex(75037);
    }

    public PronounsEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final int getSelectionMinIndex() {
        return this.f116247a;
    }

    public final void setSelectionMinIndex(int i2) {
        this.f116247a = i2;
    }

    /* access modifiers changed from: protected */
    public final void onSelectionChanged(int i2, int i3) {
        int i4 = this.f116247a;
        if (i2 <= i4) {
            setSelection(i4);
        }
        super.onSelectionChanged(i2, i3);
    }

    private /* synthetic */ PronounsEditText(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PronounsEditText(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, R.attr.ce);
        l.d(context, "");
    }
}
