package com.ss.avframework.livestreamv2.filter;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.filter.IFilterManager;
import com.ss.avframework.utils.AVLog;

final /* synthetic */ class FilterManager$4$$Lambda$0 implements IFilterManager.ErrorListener {
    static final IFilterManager.ErrorListener $instance = new FilterManager$4$$Lambda$0();

    static {
        Covode.recordClassIndex(100348);
    }

    private FilterManager$4$$Lambda$0() {
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager.ErrorListener
    public final void onError(int i2, String str) {
        AVLog.ioe("FilterManager", "Effect api return error: " + i2 + ". Calling info: " + str);
    }
}
