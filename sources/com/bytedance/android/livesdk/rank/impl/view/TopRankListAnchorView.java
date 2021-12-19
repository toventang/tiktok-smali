package com.bytedance.android.livesdk.rank.impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class TopRankListAnchorView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private ImageView f21053a = ((ImageView) findViewById(R.id.ep0));

    /* renamed from: b  reason: collision with root package name */
    private TextView f21054b = ((TextView) findViewById(R.id.ep2));

    /* renamed from: c  reason: collision with root package name */
    private ImageView f21055c = ((ImageView) findViewById(R.id.epe));

    /* renamed from: d  reason: collision with root package name */
    private TextView f21056d = ((TextView) findViewById(R.id.eph));

    /* renamed from: e  reason: collision with root package name */
    private TextView f21057e = ((TextView) findViewById(R.id.eoz));

    /* renamed from: f  reason: collision with root package name */
    private View f21058f = findViewById(R.id.ep6);

    static {
        Covode.recordClassIndex(12432);
    }

    public TopRankListAnchorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(2555);
        inflate(getContext(), R.layout.bgb, this);
        MethodCollector.o(2555);
    }
}
