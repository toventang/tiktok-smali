package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.graphics.Color;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.n.ad;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.j.an;
import com.bytedance.android.livesdk.j.ba;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.di;
import com.bytedance.android.livesdk.j.f;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMtMockLandscapeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreloadFirstScreenFrameSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.a.b;

public class FullVideoButtonWidget extends RoomWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    long f16314a;

    /* renamed from: b  reason: collision with root package name */
    boolean f16315b;

    /* renamed from: c  reason: collision with root package name */
    boolean f16316c;

    static {
        Covode.recordClassIndex(9029);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bbr;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.android.widget.Widget
    public boolean shouldAttach() {
        if (this.dataChannel == null) {
            return false;
        }
        Room room = (Room) this.dataChannel.b(df.class);
        if (LiveMtMockLandscapeSetting.INSTANCE.getValue()) {
            return true;
        }
        if (room == null || room.isStar() || ((!room.isThirdParty && !room.isScreenshot) || room.mRoomAuthStatus == null || !room.mRoomAuthStatus.isEnableLandscape())) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() == 1) {
            getView().setBackgroundColor(Color.parseColor("#2B2B2B"));
        }
        getView().findViewById(R.id.bmi).setBackgroundResource(2131234664);
        getView().findViewById(R.id.bmi).setVisibility(0);
        this.f16314a = ((Long) this.dataChannel.b(di.class)).longValue();
        this.dataChannel.a((m) this, ba.class, (b) new bk(this)).b((m) this, ad.class, (b) new bl(this)).b((m) this, an.class, (b) new bm(this)).a((m) this, f.class, (b) new bn(this));
        getView().findViewById(R.id.bmi).setOnClickListener(new bo(this));
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomWidget
    public void onGetRoomInfo(Room room) {
        super.onGetRoomInfo(room);
        attach();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget
    public void onVisibilityToUser(boolean z) {
        super.onVisibilityToUser(z);
        if (z) {
            String valueOf = String.valueOf(this.f16314a);
            com.bytedance.android.live.d.b bVar = (com.bytedance.android.live.d.b) a.a(com.bytedance.android.live.d.b.class);
            if (bVar != null) {
                bVar.reportAudienceRotateBtnShow(String.valueOf(valueOf));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Boolean bool) {
        int i2;
        if (isViewValid() && bool != null) {
            View findViewById = getView().findViewById(R.id.bmi);
            if (bool.booleanValue()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            findViewById.setVisibility(i2);
        }
    }
}
