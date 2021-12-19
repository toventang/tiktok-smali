package com.bytedance.ies.sdk.widgets;

import com.bytedance.covode.number.Covode;

public interface IWidgetProvider {
    static {
        Covode.recordClassIndex(20710);
    }

    <T extends IRecyclableWidget> T provide(Class<T> cls);

    void recycleRecyclableWidget(IRecyclableWidget iRecyclableWidget);
}
