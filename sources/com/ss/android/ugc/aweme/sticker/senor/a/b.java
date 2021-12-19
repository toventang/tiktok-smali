package com.ss.android.ugc.aweme.sticker.senor.a;

import android.content.Context;
import android.view.OrientationEventListener;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.senor.c;
import h.f.b.l;

public final class b extends OrientationEventListener {

    /* renamed from: a  reason: collision with root package name */
    private final c f135685a;

    static {
        Covode.recordClassIndex(88693);
    }

    public final void onOrientationChanged(int i2) {
        if (i2 <= 45 || i2 > 315) {
            i2 = 0;
        } else if (46 <= i2 && 135 >= i2) {
            i2 = 90;
        } else if (136 <= i2 && 225 >= i2) {
            i2 = LiveFeedRefreshTimeSetting.DEFAULT;
        } else if (i2 > 225) {
            i2 = 270;
        }
        this.f135685a.a((float) i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, c cVar) {
        super(context);
        l.d(context, "");
        l.d(cVar, "");
        this.f135685a = cVar;
    }
}
