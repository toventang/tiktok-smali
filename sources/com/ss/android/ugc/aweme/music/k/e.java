package com.ss.android.ugc.aweme.music.k;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements IAVInfoService.IFilterMedia {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f111550a;

    static {
        Covode.recordClassIndex(71647);
    }

    e(ArrayList arrayList) {
        this.f111550a = arrayList;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IFilterMedia
    public final boolean filter(Object obj) {
        ArrayList arrayList = this.f111550a;
        Integer num = (Integer) obj;
        return ((Long) arrayList.get(num.intValue())).longValue() > 10000 && ((Long) arrayList.get(num.intValue())).longValue() < 600000;
    }
}
