package com.bytedance.router.route;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

public class BroadcastRoute extends SysComponentRoute {
    static {
        Covode.recordClassIndex(26196);
    }

    @Override // com.bytedance.router.route.SysComponentRoute
    public void openComponent(Context context, Intent intent) {
        context.sendBroadcast(intent);
    }
}
