package com.ss.avframework.livestreamv2.filter;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.filter.IFilterManager;
import com.ss.avframework.utils.AVLog;

/* access modifiers changed from: package-private */
public final /* synthetic */ class FilterManager$$Lambda$0 implements IFilterManager.ErrorListener {
    static final IFilterManager.ErrorListener $instance = new FilterManager$$Lambda$0();

    static {
        Covode.recordClassIndex(100309);
    }

    private FilterManager$$Lambda$0() {
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager.ErrorListener
    public final void onError(int i2, String str) {
        AVLog.ioe("FilterManager", "Effect api return error: " + i2 + ". Calling info: " + str);
    }
}
