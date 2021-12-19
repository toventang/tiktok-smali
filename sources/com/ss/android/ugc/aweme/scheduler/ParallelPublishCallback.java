package com.ss.android.ugc.aweme.scheduler;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.publish.d;
import com.ss.android.ugc.aweme.shortvideo.publish.k;
import com.ss.android.ugc.tools.utils.q;
import h.f.a.a;
import h.f.b.l;
import h.z;

public final class ParallelPublishCallback extends k {
    private a<z> onParallelTaskFinish;

    static {
        Covode.recordClassIndex(78728);
    }

    public ParallelPublishCallback() {
        this(null, 1, null);
    }

    public final a<z> getOnParallelTaskFinish() {
        return this.onParallelTaskFinish;
    }

    public final void setOnParallelTaskFinish(a<z> aVar) {
        this.onParallelTaskFinish = aVar;
    }

    public ParallelPublishCallback(a<z> aVar) {
        this.onParallelTaskFinish = aVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
    public final void onFinish(d dVar, Object obj) {
        l.d(dVar, "");
        super.onFinish(dVar, obj);
        if (((dVar instanceof d.c) || (dVar instanceof d.b)) && j.f120942b.b() > 0) {
            q.a("ParallelPublishCallback onFinish  success publishTask " + dVar.toString());
            if (g.a().l().isRecordingOrEditing()) {
                g.a("PublishParallel ParallelPublishCallback skip next task because of current activity is record or edit");
            } else {
                h.a();
            }
        }
        a<z> aVar = this.onParallelTaskFinish;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ParallelPublishCallback(a aVar, int i2, h.f.b.g gVar) {
        this((i2 & 1) != 0 ? null : aVar);
    }
}
