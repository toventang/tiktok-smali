package com.bytedance.router.arg;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.m;

final class RouteArgExtension$navArg$3 extends m implements a<Bundle> {
    final /* synthetic */ Fragment $this_navArg;

    static {
        Covode.recordClassIndex(26153);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RouteArgExtension$navArg$3(Fragment fragment) {
        super(0);
        this.$this_navArg = fragment;
    }

    @Override // h.f.a.a
    public final Bundle invoke() {
        return this.$this_navArg.getArguments();
    }
}
