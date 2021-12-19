package com.bytedance.android.live.publicscreen.impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class WarningInfoView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private LiveTextView f12495a = ((LiveTextView) findViewById(R.id.f_k));

    static {
        Covode.recordClassIndex(6873);
    }

    public enum a {
        BLACK,
        WHITE;

        static {
            Covode.recordClassIndex(6874);
        }
    }

    public void setInfoText(CharSequence charSequence) {
        this.f12495a.setText(charSequence);
    }

    public final void a(a aVar) {
        if (aVar == a.BLACK) {
            setBackgroundResource(R.drawable.bv3);
        } else if (aVar == a.WHITE) {
            setBackgroundResource(R.drawable.bv4);
        }
    }

    public WarningInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(7051);
        inflate(getContext(), R.layout.bgd, this);
        MethodCollector.o(7051);
    }
}
