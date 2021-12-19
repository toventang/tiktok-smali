package com.ss.android.ugc.aweme.fragment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.ies.foundation.fragment.d;
import com.ss.android.ugc.aweme.fragment.a.a;
import com.ss.android.ugc.aweme.fragment.a.b;
import h.a.n;
import java.util.Collection;
import java.util.List;

public final class TikTokFragmentViewModel extends BaseFragmentViewModel {
    static {
        Covode.recordClassIndex(61330);
    }

    @Override // com.bytedance.ies.foundation.base.BaseViewModel, com.bytedance.ies.foundation.fragment.BaseFragmentViewModel
    public final List<d> initProcessors() {
        return n.d((Collection) super.initProcessors(), (Iterable) n.b(new a(), new b()));
    }
}
