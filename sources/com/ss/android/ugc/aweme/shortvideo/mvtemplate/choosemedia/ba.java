package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.a;
import com.ss.android.ugc.aweme.shortvideo.util.bt;
import com.ss.android.ugc.tools.f.b;

final /* synthetic */ class ba implements a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f129049a;

    static {
        Covode.recordClassIndex(84699);
    }

    ba(boolean z) {
        this.f129049a = z;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.a
    public final void a(boolean z) {
        r.a("tool_performance_4k_video_select", new b().a("is_4k_enable", bt.a()).a("is_4k_video", z).a("is_success", this.f129049a).f149193a);
    }
}
