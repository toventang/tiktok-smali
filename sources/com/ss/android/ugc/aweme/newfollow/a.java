package com.ss.android.ugc.aweme.newfollow;

import android.content.Context;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.bytedance.android.livesdkapi.view.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;

public final class a {
    static {
        Covode.recordClassIndex(72342);
    }

    public static TextureRenderView a(Context context, LiveRoomStruct liveRoomStruct) {
        boolean z;
        if (liveRoomStruct == null || !liveRoomStruct.liveTypeAudio) {
            z = false;
        } else {
            z = true;
        }
        if (!((Boolean) LiveOuterService.s().d().a("live_mt_live_card_opt_switch", (Object) true)).booleanValue() || z) {
            return new TextureRenderView(context);
        }
        return new g(context);
    }
}
