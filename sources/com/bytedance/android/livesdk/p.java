package com.bytedance.android.livesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.a;
import com.bytedance.android.livesdk.model.AbsBarrageWidget;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdkapi.depend.d.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.barrage.view.BarrageLayout;

public interface p extends a {
    static {
        Covode.recordClassIndex(11906);
    }

    void configInteractionHelper(Fragment fragment, DataChannel dataChannel, GestureDetectLayout gestureDetectLayout);

    void configLikeHelper(e eVar, m mVar, Room room, com.bytedance.android.livesdk.like.a aVar, boolean z, boolean z2, boolean z3, DataChannel dataChannel);

    String formatLikeNumber(long j2);

    b getBarrageLauncher(Context context, ViewGroup viewGroup);

    AbsBarrageWidget getBarrageWidget();

    com.ss.ugc.live.barrage.a.a getDiggBarrage(Bitmap bitmap, Double d2);

    com.ss.ugc.live.barrage.b.a getDiggController(BarrageLayout barrageLayout, int i2);

    com.bytedance.android.livesdk.like.b getLikeHelper(long j2);

    Class<? extends LiveRecyclableWidget> getLikeUserInfoAnimWidgetClass(com.bytedance.android.livesdk.like.b bVar);

    Class<? extends LiveRecyclableWidget> getOthersLikeWidgetClass(com.bytedance.android.livesdk.like.b bVar);

    Class<? extends LiveRecyclableWidget> getSelfLikeWidgetClass(com.bytedance.android.livesdk.like.b bVar);

    void releaseLikeHelper(long j2);
}
