package com.bytedance.router.arg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.m;

final class RouteArgExtension$navArg$2 extends m implements a<Bundle> {
    final /* synthetic */ Activity $this_navArg;

    static {
        Covode.recordClassIndex(26152);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RouteArgExtension$navArg$2(Activity activity) {
        super(0);
        this.$this_navArg = activity;
    }

    @Override // h.f.a.a
    public final Bundle invoke() {
        Intent intent = this.$this_navArg.getIntent();
        if (intent != null) {
            return com_bytedance_router_arg_RouteArgExtension$navArg$2_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        }
        return null;
    }

    public static Bundle com_bytedance_router_arg_RouteArgExtension$navArg$2_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }
}
