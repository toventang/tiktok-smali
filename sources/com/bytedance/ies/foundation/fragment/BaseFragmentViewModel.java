package com.bytedance.ies.foundation.fragment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import java.util.ArrayList;
import java.util.List;

public class BaseFragmentViewModel extends BaseViewModel {
    static {
        Covode.recordClassIndex(20135);
    }

    @Override // com.bytedance.ies.foundation.base.BaseViewModel
    public List<d> initProcessors() {
        return new ArrayList();
    }
}
