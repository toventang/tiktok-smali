package com.bytedance.router.arg;

import com.bytedance.covode.number.Covode;
import com.bytedance.router.arg.RouteArgExtension;
import h.f.a.a;
import h.f.b.m;
import h.z;

final class RouteArgExtension$RouteArgLifecycle$$special$$inlined$let$lambda$1 extends m implements a<z> {
    final /* synthetic */ androidx.lifecycle.m $owner$inlined;
    final /* synthetic */ RouteArgExtension.RouteArgLifecycle this$0;

    static {
        Covode.recordClassIndex(26149);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RouteArgExtension$RouteArgLifecycle$$special$$inlined$let$lambda$1(RouteArgExtension.RouteArgLifecycle routeArgLifecycle, androidx.lifecycle.m mVar) {
        super(0);
        this.this$0 = routeArgLifecycle;
        this.$owner$inlined = mVar;
    }

    @Override // h.f.a.a
    public final void invoke() {
        this.this$0.setCached(null);
    }
}
