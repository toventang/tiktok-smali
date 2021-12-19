package com.bytedance.router.arg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.m;

final class RouteArgExtension$requiredArg$2 extends m implements a<Bundle> {
    final /* synthetic */ Activity $this_requiredArg;

    static {
        Covode.recordClassIndex(26164);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RouteArgExtension$requiredArg$2(Activity activity) {
        super(0);
        this.$this_requiredArg = activity;
    }

    @Override // h.f.a.a
    public final Bundle invoke() {
        Intent intent = this.$this_requiredArg.getIntent();
        if (intent != null) {
            return com_bytedance_router_arg_RouteArgExtension$requiredArg$2_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        }
        return null;
    }

    public static Bundle com_bytedance_router_arg_RouteArgExtension$requiredArg$2_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }
}
