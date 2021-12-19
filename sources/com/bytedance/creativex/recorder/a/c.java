package com.bytedance.creativex.recorder.a;

import androidx.core.g.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.tools.utils.j;

final /* synthetic */ class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final BeautyComposerInfo f28068a;

    static {
        Covode.recordClassIndex(16437);
    }

    c(BeautyComposerInfo beautyComposerInfo) {
        this.f28068a = beautyComposerInfo;
    }

    @Override // androidx.core.g.a
    public final void a(Object obj) {
        BeautyComposerInfo beautyComposerInfo = this.f28068a;
        ((j) obj).d("update beauty:" + beautyComposerInfo.f79584a + " " + beautyComposerInfo.f79585b);
    }
}
