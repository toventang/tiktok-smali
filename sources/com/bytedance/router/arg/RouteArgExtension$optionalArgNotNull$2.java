package com.bytedance.router.arg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.m;

final class RouteArgExtension$optionalArgNotNull$2 extends m implements a<Bundle> {
    final /* synthetic */ Activity $this_optionalArgNotNull;

    static {
        Covode.recordClassIndex(26160);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RouteArgExtension$optionalArgNotNull$2(Activity activity) {
        super(0);
        this.$this_optionalArgNotNull = activity;
    }

    @Override // h.f.a.a
    public final Bundle invoke() {
        Intent intent = this.$this_optionalArgNotNull.getIntent();
        if (intent != null) {
            return com_bytedance_router_arg_RouteArgExtension$optionalArgNotNull$2_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        }
        return null;
    }

    public static Bundle com_bytedance_router_arg_RouteArgExtension$optionalArgNotNull$2_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }
}
