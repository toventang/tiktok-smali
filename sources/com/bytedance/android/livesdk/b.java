package com.bytedance.android.livesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import com.bytedance.android.livesdk.like.a;
import com.bytedance.android.livesdk.model.AbsBarrageWidget;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.barrage.view.BarrageLayout;
import h.f.b.l;

public class b implements p {
    static {
        Covode.recordClassIndex(7855);
    }

    @Override // com.bytedance.android.livesdk.p
    public void configInteractionHelper(Fragment fragment, DataChannel dataChannel, GestureDetectLayout gestureDetectLayout) {
    }

    @Override // com.bytedance.android.livesdk.p
    public void configLikeHelper(e eVar, m mVar, Room room, a aVar, boolean z, boolean z2, boolean z3, DataChannel dataChannel) {
    }

    @Override // com.bytedance.android.livesdk.p
    public String formatLikeNumber(long j2) {
        return "";
    }

    @Override // com.bytedance.android.livesdk.p
    public com.bytedance.android.livesdkapi.depend.d.b getBarrageLauncher(Context context, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.bytedance.android.livesdk.p
    public AbsBarrageWidget getBarrageWidget() {
        return null;
    }

    @Override // com.bytedance.android.livesdk.p
    public com.ss.ugc.live.barrage.a.a getDiggBarrage(Bitmap bitmap, Double d2) {
        return null;
    }

    @Override // com.bytedance.android.livesdk.p
    public com.ss.ugc.live.barrage.b.a getDiggController(BarrageLayout barrageLayout, int i2) {
        return null;
    }

    @Override // com.bytedance.android.livesdk.p
    public com.bytedance.android.livesdk.like.b getLikeHelper(long j2) {
        return null;
    }

    @Override // com.bytedance.android.livesdk.p
    public Class<? extends LiveRecyclableWidget> getLikeUserInfoAnimWidgetClass(com.bytedance.android.livesdk.like.b bVar) {
        l.d(bVar, "");
        return null;
    }

    @Override // com.bytedance.android.livesdk.p
    public Class<? extends LiveRecyclableWidget> getOthersLikeWidgetClass(com.bytedance.android.livesdk.like.b bVar) {
        l.d(bVar, "");
        return null;
    }

    @Override // com.bytedance.android.livesdk.p
    public Class<? extends LiveRecyclableWidget> getSelfLikeWidgetClass(com.bytedance.android.livesdk.like.b bVar) {
        l.d(bVar, "");
        return null;
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.livesdk.p
    public void releaseLikeHelper(long j2) {
    }
}
