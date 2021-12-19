package com.ss.android.ugc.aweme.scheduler;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.settings.m;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.et;
import com.ss.android.ugc.aweme.shortvideo.publish.ah;
import com.ss.android.ugc.aweme.shortvideo.publish.d;
import com.ss.android.ugc.aweme.shortvideo.publish.k;
import com.ss.android.ugc.aweme.shortvideo.publish.y;
import com.ss.android.ugc.aweme.shortvideo.x;
import h.f.b.l;
import java.util.Objects;

public final class f extends k {

    /* renamed from: a  reason: collision with root package name */
    public final x<ai> f120859a;

    /* renamed from: b  reason: collision with root package name */
    private final m f120860b = new m("PublishScheduler-PublishCallbackWrapper");

    static {
        Covode.recordClassIndex(78743);
    }

    public f(x<ai> xVar) {
        l.d(xVar, "");
        this.f120859a = xVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
    public final void onProgress(int i2, Object obj) {
        if (!(obj instanceof Boolean)) {
            this.f120860b.a("onProgress extra not boolean");
        } else {
            this.f120859a.onProgressUpdate(i2, ((Boolean) obj).booleanValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
    public final void onFinish(d dVar, Object obj) {
        l.d(dVar, "");
        g.a("PublishParallel PublishCallbackWrapper onFinish " + toString());
        if (dVar instanceof d.c) {
            if (!(obj instanceof Boolean)) {
                this.f120860b.a("onFinish extra not boolean");
            } else {
                this.f120859a.onSuccess(((d.c) dVar).f129784a, ((Boolean) obj).booleanValue());
            }
        } else if (dVar instanceof d.b) {
            d.b bVar = (d.b) dVar;
            if (bVar.f129783a.f129870d == null || !(bVar.f129783a.f129871e instanceof Boolean)) {
                this.f120860b.a("onFinish  null error / extra not boolean");
                return;
            }
            x<ai> xVar = this.f120859a;
            et etVar = new et(bVar.f129783a.f129870d, bVar.f129783a.f129869c);
            Object obj2 = bVar.f129783a.f129871e;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            etVar.setRecover(((Boolean) obj2).booleanValue());
            xVar.onError(etVar);
        } else if ((dVar instanceof d.a) && m.a()) {
            this.f120859a.onParallelPublishCancel();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
    public final void onStageUpdate(String str, ah ahVar, Object obj) {
        l.d(str, "");
        l.d(ahVar, "");
        if (l.a((Object) str, (Object) "STAGE_SYNTHETIC") && (ahVar instanceof ah.a)) {
            ah.a aVar = (ah.a) ahVar;
            if (aVar.f129708a instanceof y.a) {
                y yVar = aVar.f129708a;
                Objects.requireNonNull(yVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.publish.Result.Success");
                if (((y.a) yVar).f129907a instanceof String) {
                    x<ai> xVar = this.f120859a;
                    y yVar2 = aVar.f129708a;
                    Objects.requireNonNull(yVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.publish.Result.Success");
                    Object obj2 = ((y.a) yVar2).f129907a;
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
                    xVar.onSynthetiseSuccess((String) obj2);
                }
            }
        }
    }
}
