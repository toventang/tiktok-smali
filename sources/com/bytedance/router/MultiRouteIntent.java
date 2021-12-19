package com.bytedance.router;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.route.BaseRoute;
import h.f.a.a;
import h.f.b.l;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;

public final class MultiRouteIntent extends RouteIntent {
    private final h routeIntents$delegate = i.a((a) MultiRouteIntent$routeIntents$2.INSTANCE);
    private final h routes$delegate = i.a((a) MultiRouteIntent$routes$2.INSTANCE);

    static {
        Covode.recordClassIndex(26107);
    }

    public final ArrayList<RouteIntent> getRouteIntents() {
        return (ArrayList) this.routeIntents$delegate.getValue();
    }

    public final ArrayList<BaseRoute> getRoutes() {
        return (ArrayList) this.routes$delegate.getValue();
    }

    public final class Builder {
        final /* synthetic */ MultiRouteIntent this$0;

        static {
            Covode.recordClassIndex(26108);
        }

        public final MultiRouteIntent build() {
            return this.this$0;
        }

        public final Builder withBundleAnimation(Bundle bundle) {
            this.this$0.setAnimationBundle(bundle);
            return this;
        }

        public final Builder withCallback(OpenResultCallback openResultCallback) {
            this.this$0.setCallback(openResultCallback);
            return this;
        }

        public Builder(MultiRouteIntent multiRouteIntent, List<? extends RouteIntent> list) {
            l.c(list, "");
            this.this$0 = multiRouteIntent;
            multiRouteIntent.getRouteIntents().addAll(list);
        }
    }
}
