package com.ss.android.ugc.aweme.activity;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.foundation.activity.d;
import com.ss.android.ugc.aweme.activity.processor.a;
import com.ss.android.ugc.aweme.activity.processor.c;
import com.ss.android.ugc.aweme.activity.processor.e;
import com.ss.android.ugc.aweme.activity.processor.g;
import com.ss.android.ugc.aweme.activity.processor.h;
import com.ss.android.ugc.aweme.activity.processor.i;
import com.ss.android.ugc.aweme.activity.processor.k;
import com.ss.android.ugc.aweme.activity.processor.l;
import com.ss.android.ugc.aweme.activity.processor.m;
import h.a.n;
import java.util.ArrayList;
import java.util.List;

public final class TikTokActivityViewModel extends BaseActivityViewModel {
    static {
        Covode.recordClassIndex(40304);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivityViewModel, com.bytedance.ies.foundation.base.BaseViewModel
    public final List<d> initProcessors() {
        ArrayList arrayList = new ArrayList(super.initProcessors());
        arrayList.addAll(n.b(new a(), new h(), new c(), new m(), new g(), new l(), new k(), new i(), new e()));
        return arrayList;
    }
}
