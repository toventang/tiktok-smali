package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.setting.SettingItem;
import h.f.b.l;

public final class NewSettingItem extends SettingItem {
    static {
        Covode.recordClassIndex(68446);
    }

    public NewSettingItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void a() {
        if (this.f33684b != null) {
            ImageView imageView = this.f33684b;
            l.b(imageView, "");
            imageView.setVisibility(8);
        }
    }

    private /* synthetic */ NewSettingItem(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private NewSettingItem(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
    }
}
