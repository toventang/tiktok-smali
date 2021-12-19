package com.ss.android.ugc.aweme.commercialize.views.bottomdialog;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import h.f.b.l;

public final class AdBottomDialogConfirmView extends DmtTextView {
    static {
        Covode.recordClassIndex(46838);
    }

    public AdBottomDialogConfirmView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setClickable(boolean z) {
        super.setClickable(z);
        if (z) {
            setTextColor(Color.parseColor("#fe2c55"));
        } else {
            setTextColor(Color.parseColor("#80fe2c55"));
        }
    }

    private /* synthetic */ AdBottomDialogConfirmView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdBottomDialogConfirmView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
    }
}
