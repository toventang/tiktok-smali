package com.bytedance.android.livesdk.olddialog.widget;

import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.livesdk.olddialog.viewmodel.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

public class LiveNewGiftPageIndicatorWidget extends LiveWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    LinearLayout f20121a;

    /* renamed from: b  reason: collision with root package name */
    public a f20122b;

    /* renamed from: c  reason: collision with root package name */
    int f20123c;

    /* renamed from: d  reason: collision with root package name */
    int f20124d;

    /* renamed from: e  reason: collision with root package name */
    ImageView f20125e;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<ImageView> f20126f = new ArrayList<>();

    static {
        Covode.recordClassIndex(11875);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bh6;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        super.onDestroy();
        this.f20122b.f20100f.removeObservers(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        this.f20121a = (LinearLayout) findViewById(R.id.d1g);
        this.f20122b.f20100f.observe(this, new h(this));
    }
}
