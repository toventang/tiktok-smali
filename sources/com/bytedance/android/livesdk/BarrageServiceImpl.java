package com.bytedance.android.livesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.a;
import com.bytedance.android.livesdk.chatroom.interaction.d;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.like.OptimizedLikeHelper;
import com.bytedance.android.livesdk.like.b;
import com.bytedance.android.livesdk.like.c;
import com.bytedance.android.livesdk.like.widget.LikeUserInfoAnimWidget;
import com.bytedance.android.livesdk.like.widget.OthersLikeViewOptimizedWidget;
import com.bytedance.android.livesdk.like.widget.OthersLikeWidget;
import com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget;
import com.bytedance.android.livesdk.like.widget.SelfLikeWidget;
import com.bytedance.android.livesdk.livesetting.barrage.DiggParamsSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveOptimizedLikeSetting;
import com.bytedance.android.livesdk.model.AbsBarrageWidget;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.widget.BarrageWidget;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import com.ss.ugc.live.barrage.view.BarrageLayout;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class BarrageServiceImpl implements p, au {
    private final Map<Long, b> likeHelperMap = new HashMap();

    static {
        Covode.recordClassIndex(7375);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
    }

    @Override // com.bytedance.android.livesdk.p
    public AbsBarrageWidget getBarrageWidget() {
        return new BarrageWidget();
    }

    @Override // com.bytedance.android.livesdk.p
    public Class<? extends LiveRecyclableWidget> getLikeUserInfoAnimWidgetClass(b bVar) {
        return LikeUserInfoAnimWidget.class;
    }

    @Override // com.bytedance.android.livesdk.p
    public b getLikeHelper(long j2) {
        return this.likeHelperMap.get(Long.valueOf(j2));
    }

    @Override // com.bytedance.android.livesdk.p
    public Class<? extends LiveRecyclableWidget> getOthersLikeWidgetClass(b bVar) {
        if (!bVar.p()) {
            return OthersLikeWidget.class;
        }
        return OthersLikeViewOptimizedWidget.class;
    }

    @Override // com.bytedance.android.livesdk.p
    public Class<? extends LiveRecyclableWidget> getSelfLikeWidgetClass(b bVar) {
        if (!bVar.p()) {
            return SelfLikeWidget.class;
        }
        return SelfLikeViewOptimizedWidget.class;
    }

    @Override // com.bytedance.android.livesdk.p
    public void releaseLikeHelper(long j2) {
        this.likeHelperMap.remove(Long.valueOf(j2));
    }

    @Override // com.bytedance.android.livesdk.p
    public String formatLikeNumber(long j2) {
        if (j2 < 0) {
            return "";
        }
        if (j2 < 1000) {
            return String.valueOf(j2);
        }
        if (j2 < 1000000) {
            return a.a(Locale.US, "%.1f", new Object[]{Float.valueOf(((float) (j2 / 100)) / 10.0f)}) + 'K';
        } else if (j2 < 1000000000) {
            return a.a(Locale.US, "%.1f", new Object[]{Float.valueOf(((float) (j2 / 100000)) / 10.0f)}) + 'M';
        } else {
            return a.a(Locale.US, "%.1f", new Object[]{Float.valueOf(((float) (j2 / 100000000)) / 10.0f)}) + 'B';
        }
    }

    @Override // com.bytedance.android.livesdk.p
    public com.bytedance.android.livesdkapi.depend.d.b getBarrageLauncher(Context context, ViewGroup viewGroup) {
        return new com.bytedance.android.livesdk.widget.a(context, viewGroup);
    }

    @Override // com.bytedance.android.livesdk.p
    public com.ss.ugc.live.barrage.b.a getDiggController(BarrageLayout barrageLayout, int i2) {
        return new com.bytedance.android.livesdk.chatroom.a.b.a(barrageLayout, i2);
    }

    @Override // com.bytedance.android.livesdk.p
    public com.ss.ugc.live.barrage.a.a getDiggBarrage(Bitmap bitmap, Double d2) {
        return new com.bytedance.android.livesdk.chatroom.a.a.a(bitmap, d2.doubleValue());
    }

    @Override // com.bytedance.android.livesdk.p
    public void configInteractionHelper(Fragment fragment, DataChannel dataChannel, GestureDetectLayout gestureDetectLayout) {
        new d(fragment, dataChannel, gestureDetectLayout);
    }

    public static void addALogTrace(Room room, boolean z, boolean z2, boolean z3, DataChannel dataChannel, b bVar) {
        String str;
        String str2;
        String str3 = "enabled";
        String str4 = null;
        if (bVar.n()) {
            str = "disabled_due_to_landscape_mode";
            if (z) {
                str4 = str3;
            } else {
                str4 = str;
            }
            if (z2) {
                str = str3;
            }
            if (z3) {
                str2 = str3;
            } else {
                str2 = "disabled_due_to_being_audience_and_mic_room";
            }
        } else {
            if (!room.getRoomAuthStatus().isEnableDigg()) {
                str3 = "disabled_by_room_auth";
            } else if (!u.a().b().e()) {
                str3 = "disabled_due_to_unlogin";
            } else if (!((Boolean) dataChannel.b(ee.class)).booleanValue() || DiggParamsSetting.INSTANCE.getValue().f15772a == 1) {
                str3 = null;
                str4 = null;
            } else {
                str3 = "disabled_due_to_being_anchor_and_ab";
            }
            str = str4;
            str2 = str;
        }
        c.a(room.getId(), u.a().b().c(), room.getOwnerUserId(), str3, str4, str, str2);
    }

    @Override // com.bytedance.android.livesdk.p
    public void configLikeHelper(e eVar, m mVar, Room room, com.bytedance.android.livesdk.like.a aVar, boolean z, boolean z2, boolean z3, DataChannel dataChannel) {
        b optimizedLikeHelper;
        if (eVar != null && mVar != null && room != null && dataChannel != null) {
            if (room.getRoomAuthStatus() == null) {
                c.a(room.getId(), u.a().b().c(), room.getOwnerUserId(), "disabled_due_to_empty_room_auth", null, null, null);
                return;
            }
            eVar.getLifecycle().a(this);
            if (!LiveOptimizedLikeSetting.INSTANCE.getValue()) {
                optimizedLikeHelper = new LikeHelper(eVar, mVar, room, z, z2, z3, dataChannel);
            } else {
                optimizedLikeHelper = new OptimizedLikeHelper(eVar, mVar, room, z, z2, z3, dataChannel);
            }
            addALogTrace(room, z, z2, z3, dataChannel, optimizedLikeHelper);
            this.likeHelperMap.put(Long.valueOf(room.getId()), optimizedLikeHelper);
            if (z && aVar != null && aVar.a() != null) {
                aVar.a().a(optimizedLikeHelper.a());
            }
        }
    }
}
