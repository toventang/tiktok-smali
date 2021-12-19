package com.ss.android.ugc.aweme.feed.ui.masklayer2.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class OptionDescItemLayout extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public ImageView f94937a = ((ImageView) findViewById(R.id.bts));

    /* renamed from: b  reason: collision with root package name */
    private TextView f94938b = ((TextView) findViewById(R.id.ak7));

    /* renamed from: c  reason: collision with root package name */
    private ImageView f94939c = ((ImageView) findViewById(R.id.bi7));

    static {
        Covode.recordClassIndex(60217);
    }

    public final void a(e eVar) {
        l.d(eVar, "");
        ImageView imageView = this.f94939c;
        if (imageView != null) {
            imageView.setImageResource(eVar.f94958a);
        }
        TextView textView = this.f94938b;
        if (textView != null) {
            Context context = getContext();
            l.b(context, "");
            textView.setText(context.getResources().getText(eVar.f94959b));
        }
    }

    public OptionDescItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(9841);
        View.inflate(getContext(), R.layout.se, this);
        int b2 = (int) n.b(getContext(), 16.0f);
        int b3 = (int) n.b(getContext(), 14.0f);
        setPadding(b2, b3, b2, b3);
        setGravity(16);
        MethodCollector.o(9841);
    }
}
