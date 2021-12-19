package com.ss.android.ugc.aweme.app.host;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.application.h;
import com.ss.android.ugc.aweme.logger.a;

public final class a implements h {
    static {
        Covode.recordClassIndex(41090);
    }

    @Override // com.ss.android.ugc.aweme.application.h
    public final void a(Application application) {
        a.b.f109011a.a("method_setup_graph_duration", false);
        if (application instanceof AwemeHostApplication) {
            Keep.emptyMethod();
        }
        a.b.f109011a.b("method_setup_graph_duration", false);
    }
}
