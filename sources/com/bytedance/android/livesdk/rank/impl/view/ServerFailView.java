package com.bytedance.android.livesdk.rank.impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.rank.impl.b.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class ServerFailView extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    b.a f21030g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f21031h;

    static {
        Covode.recordClassIndex(12413);
    }

    public void setContainer(b.a aVar) {
        this.f21030g = aVar;
    }

    public ServerFailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(getContext(), R.layout.bcv, this);
        TextView textView = (TextView) findViewById(R.id.f_0);
        this.f21031h = textView;
        textView.setOnClickListener(new f(this));
    }
}
