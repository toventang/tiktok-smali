package com.ss.android.ugc.aweme.shortvideo.publish.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.publish.f.h;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.util.ac;
import java.util.concurrent.Callable;

final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final VideoPublishEditModel f129773a;

    /* renamed from: b  reason: collision with root package name */
    private final h f129774b;

    /* renamed from: c  reason: collision with root package name */
    private final SynthetiseResult f129775c;

    static {
        Covode.recordClassIndex(85186);
    }

    f(VideoPublishEditModel videoPublishEditModel, h hVar, SynthetiseResult synthetiseResult) {
        this.f129773a = videoPublishEditModel;
        this.f129774b = hVar;
        this.f129775c = synthetiseResult;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new ac(this.f129773a, this.f129774b, this.f129775c).a();
    }
}
