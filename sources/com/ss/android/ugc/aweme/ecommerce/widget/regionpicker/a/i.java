package com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class i extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f87662a = new i();

    static {
        Covode.recordClassIndex(55130);
    }

    i() {
        super(DistrictPickerWrapperState.class, "selectedRegions", "getSelectedRegions()Ljava/util/List;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((DistrictPickerWrapperState) obj).getSelectedRegions();
    }
}
