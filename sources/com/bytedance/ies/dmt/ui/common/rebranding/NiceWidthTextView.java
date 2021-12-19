package com.bytedance.ies.dmt.ui.common.rebranding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.rebranding.a;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;

public class NiceWidthTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public b f33349a;

    static {
        Covode.recordClassIndex(19914);
    }

    public NiceWidthTextView(Context context) {
        super(context);
    }

    public NiceWidthTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i2, int i3) {
        int a2;
        b bVar = this.f33349a;
        if (bVar != null) {
            a.C0729a a3 = a.a(bVar.getClass());
            if (a3 == null || !a3.f33351a) {
                a2 = this.f33349a.a(this);
                a.a(this.f33349a.getClass(), new a.C0729a(a2));
            } else {
                a2 = a3.f33352b;
            }
            i2 = View.MeasureSpec.makeMeasureSpec(a2, 1073741824);
        }
        super.onMeasure(i2, i3);
    }
}
