package com.bytedance.android.livesdk.aj;

import android.content.Context;
import com.bytedance.android.livesdk.aj.b.a;
import com.bytedance.android.livesdk.livesetting.broadcast.EnableSingleLooperPlayerPullStreamSetting;
import com.bytedance.covode.number.Covode;

public final class m implements f {
    static {
        Covode.recordClassIndex(7706);
    }

    @Override // com.bytedance.android.livesdk.aj.f
    public final g a(Context context, a aVar) {
        z zVar = new z(context);
        zVar.f13923b = false;
        zVar.f13926e = aVar;
        if (EnableSingleLooperPlayerPullStreamSetting.INSTANCE.getValue()) {
            return new v(zVar);
        }
        return new u(zVar);
    }
}
