package com.bytedance.android.livesdk.chatroom.widget;

import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.gift.s;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.c;
import com.bytedance.android.livesdk.event.g;
import com.bytedance.android.livesdk.j.ba;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.a.b;

public class MessageBlockWidget extends LiveRecyclableWidget implements View.OnClickListener, au {

    /* renamed from: a  reason: collision with root package name */
    ImageView f16587a;

    static {
        Covode.recordClassIndex(9194);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bgm;
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
            this.dataChannel.c(c.class);
        }
        if (this.dataChannel != null) {
            this.dataChannel.c(s.class);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        getView().setOnClickListener(this);
        this.f16587a = (ImageView) getView().findViewById(R.id.yp);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        ((z) a.a().a(g.class).a(WidgetExtendsKt.autoDispose(this))).a(new r(this));
        if (this.dataChannel != null) {
            this.dataChannel.a((m) this, ba.class, (b) new s(this));
        }
        this.f16587a.setImageResource(2131234717);
    }
}
