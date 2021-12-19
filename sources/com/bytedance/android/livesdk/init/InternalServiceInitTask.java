package com.bytedance.android.livesdk.init;

import com.bytedance.android.live.annotation.a;
import com.bytedance.android.live.i.a.d;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.List;

@a(a = 2)
public class InternalServiceInitTask extends com.bytedance.android.livesdk.y.a {
    static {
        Covode.recordClassIndex(10140);
    }

    @Override // com.bytedance.android.livesdk.y.a
    public String getTaskName() {
        return "internal_service_init_task";
    }

    @Override // com.bytedance.android.livesdk.y.a
    public List<Integer> preTasks() {
        return Arrays.asList(1);
    }

    @Override // com.bytedance.android.livesdk.y.a
    public void run() {
        d dVar = (d) com.bytedance.android.live.t.a.a(d.class);
        if (dVar != null) {
            dVar.getDnsOptimizer().a();
            dVar.getLiveStreamStrategy().a();
        }
    }
}
