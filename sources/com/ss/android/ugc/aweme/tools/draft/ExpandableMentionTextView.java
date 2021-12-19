package com.ss.android.ugc.aweme.tools.draft;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.aa.b;
import com.ss.android.ugc.aweme.tools.draft.l.d;
import h.f.b.l;

public final class ExpandableMentionTextView extends d implements b {

    /* renamed from: c  reason: collision with root package name */
    private int f139345c;

    static {
        Covode.recordClassIndex(91089);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.aa.b
    public final int getHookAtMaxWidth() {
        return this.f139345c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandableMentionTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, com.ss.android.ugc.aweme.tools.draft.l.d
    public final void onMeasure(int i2, int i3) {
        this.f139345c = View.MeasureSpec.getSize(i2);
        super.onMeasure(i2, i3);
    }
}
