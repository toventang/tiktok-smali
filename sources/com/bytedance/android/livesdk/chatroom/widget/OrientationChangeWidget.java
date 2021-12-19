package com.bytedance.android.livesdk.chatroom.widget;

import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.gift.s;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.event.g;
import com.bytedance.android.livesdk.j.ba;
import com.bytedance.android.livesdk.j.di;
import com.bytedance.android.livesdk.j.j;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.a.b;

public class OrientationChangeWidget extends LiveRecyclableWidget implements View.OnClickListener, au {
    static {
        Covode.recordClassIndex(9214);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bgo;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        getView().setOnClickListener(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        Object b2;
        ((z) a.a().a(g.class).a(WidgetExtendsKt.autoDispose(this))).a(new u(this));
        if (this.dataChannel != null) {
            this.dataChannel.a((m) this, ba.class, (b) new v(this));
        }
        ((ImageView) getView().findViewById(R.id.bm4)).setImageResource(2131234640);
        if (this.dataChannel != null && (b2 = this.dataChannel.b(di.class)) != null) {
            String valueOf = String.valueOf(b2);
            com.bytedance.android.live.d.b bVar = (com.bytedance.android.live.d.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.d.b.class);
            if (bVar != null) {
                bVar.reportAudienceRotateBtnShow(valueOf);
            }
        }
    }

    public void onClick(View view) {
        com.bytedance.android.live.d.b bVar;
        if (this.dataChannel != null) {
            this.dataChannel.c(com.bytedance.android.livesdk.au.class);
        }
        if (this.dataChannel != null) {
            this.dataChannel.c(s.class);
        }
        b.a.a("livesdk_screen_rotate").a(this.dataChannel).a(StringSet.type, "landscape_to_portrait").a("room_orientation", "landscape").b("live").c("click").d("live_landscape").b();
        if (this.dataChannel != null) {
            Object b2 = this.dataChannel.b(di.class);
            Long l2 = (Long) this.dataChannel.b(j.class);
            if (b2 != null && l2 != null && (bVar = (com.bytedance.android.live.d.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.d.b.class)) != null) {
                bVar.reportAudienceRotateBtnClick(String.valueOf(b2), l2.longValue(), "0");
                this.dataChannel.b(j.class, Long.valueOf(System.currentTimeMillis()));
            }
        }
    }
}
