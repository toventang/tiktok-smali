package com.bytedance.ies.foundation.activity;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import java.util.ArrayList;
import java.util.List;

public class BaseActivityViewModel extends BaseViewModel {
    static {
        Covode.recordClassIndex(20073);
    }

    @Override // com.bytedance.ies.foundation.base.BaseViewModel
    public List<d> initProcessors() {
        return new ArrayList();
    }
}
