package com.ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import java.util.ArrayList;

final /* synthetic */ class aa implements IAVInfoService.IFilterMedia {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f70604a;

    static {
        Covode.recordClassIndex(43543);
    }

    aa(ArrayList arrayList) {
        this.f70604a = arrayList;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IFilterMedia
    public final boolean filter(Object obj) {
        ArrayList arrayList = this.f70604a;
        Integer num = (Integer) obj;
        return ((Long) arrayList.get(num.intValue())).longValue() > 10000 && ((Long) arrayList.get(num.intValue())).longValue() < 600000;
    }
}
