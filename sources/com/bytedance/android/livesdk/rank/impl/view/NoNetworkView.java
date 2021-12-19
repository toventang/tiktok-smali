package com.bytedance.android.livesdk.rank.impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.rank.impl.b.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class NoNetworkView extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    b.a f21021g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f21022h;

    static {
        Covode.recordClassIndex(12411);
    }

    public void setContainer(b.a aVar) {
        this.f21021g = aVar;
    }

    public NoNetworkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(getContext(), R.layout.bcu, this);
        TextView textView = (TextView) findViewById(R.id.f_0);
        this.f21022h = textView;
        textView.setOnClickListener(new b(this));
    }
}
