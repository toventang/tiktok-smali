package com.bytedance.android.livesdk.rank.impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.rank.impl.b.b;
import com.bytedance.android.livesdk.rank.impl.widget.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

public class SelfRankInfoView extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    public LiveTextView f21023g = ((LiveTextView) findViewById(R.id.evp));

    /* renamed from: h  reason: collision with root package name */
    public LiveTextView f21024h = ((LiveTextView) findViewById(R.id.evo));

    /* renamed from: i  reason: collision with root package name */
    public ImageView f21025i = ((ImageView) findViewById(R.id.bty));

    /* renamed from: j  reason: collision with root package name */
    public LiveTextView f21026j = ((LiveTextView) findViewById(R.id.evn));

    /* renamed from: k  reason: collision with root package name */
    public LiveTextView f21027k = ((LiveTextView) findViewById(R.id.evm));

    /* renamed from: l  reason: collision with root package name */
    public View f21028l = findViewById(R.id.xu);

    /* renamed from: m  reason: collision with root package name */
    public DataChannel f21029m;
    public b.a n;
    public Room o;
    public com.bytedance.android.livesdk.rank.api.model.b p;
    public String q;
    public a r;

    static {
        Covode.recordClassIndex(12412);
    }

    public SelfRankInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(getContext(), R.layout.bfq, this);
    }
}
