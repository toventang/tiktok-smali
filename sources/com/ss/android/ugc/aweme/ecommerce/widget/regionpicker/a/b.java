package com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class b extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f87640a = new b();

    static {
        Covode.recordClassIndex(55104);
    }

    b() {
        super(DistrictPickerState.class, "selectedDistrict", "getSelectedDistrict()Lcom/ss/android/ugc/aweme/ecommerce/widget/regionpicker/model/District;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((DistrictPickerState) obj).getSelectedDistrict();
    }
}
