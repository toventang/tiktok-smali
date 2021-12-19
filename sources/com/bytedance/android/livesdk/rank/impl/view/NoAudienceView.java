package com.bytedance.android.livesdk.rank.impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class NoAudienceView extends ConstraintLayout {
    static {
        Covode.recordClassIndex(12410);
    }

    public NoAudienceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = inflate(getContext(), R.layout.bct, this);
        ((LiveTextView) inflate.findViewById(R.id.ezr)).setText(y.a((int) R.plurals.gn, 2));
    }
}
