package com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class a extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f87670a = new a();

    static {
        Covode.recordClassIndex(55142);
    }

    a() {
        super(DistrictPickerState.class, "selectedDistrict", "getSelectedDistrict()Lcom/ss/android/ugc/aweme/ecommerce/widget/regionpicker/model/District;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((DistrictPickerState) obj).getSelectedDistrict();
    }
}
