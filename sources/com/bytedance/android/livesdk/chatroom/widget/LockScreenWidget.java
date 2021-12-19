package com.bytedance.android.livesdk.chatroom.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.gift.s;
import com.bytedance.android.livesdk.an;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.event.g;
import com.bytedance.android.livesdk.j.ba;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.a.b;

public class LockScreenWidget extends LiveRecyclableWidget implements View.OnClickListener, au {

    /* renamed from: a  reason: collision with root package name */
    ImageView f16585a;

    /* renamed from: b  reason: collision with root package name */
    boolean f16586b;

    static {
        Covode.recordClassIndex(9193);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bh4;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
    }

    public void onClick(View view) {
        if (this.dataChannel != null) {
            this.dataChannel.c(an.class);
        }
        if (this.dataChannel != null) {
            this.dataChannel.c(s.class);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        getView().setOnClickListener(this);
        this.f16585a = (ImageView) getView().findViewById(R.id.yp);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        int i2;
        ((z) a.a().a(g.class).a(WidgetExtendsKt.autoDispose(this))).a(new m(this));
        if (this.dataChannel != null) {
            this.dataChannel.a((m) this, ba.class, (b) new n(this));
            if (getView() != null && (getView().getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getView().getLayoutParams();
                boolean a2 = com.bytedance.android.live.uikit.c.a.a(getContext());
                int i3 = -1;
                if (a2) {
                    i2 = -1;
                } else {
                    i2 = 0;
                }
                layoutParams.addRule(9, i2);
                if (a2) {
                    i3 = 0;
                }
                layoutParams.addRule(11, i3);
                getView().setLayoutParams(layoutParams);
            }
        }
        this.f16585a.setImageResource(R.drawable.c76);
    }
}
