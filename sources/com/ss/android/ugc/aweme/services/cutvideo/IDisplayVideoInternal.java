package com.ss.android.ugc.aweme.services.cutvideo;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;

public interface IDisplayVideoInternal {
    static {
        Covode.recordClassIndex(79593);
    }

    IDisplayVideo getProxy();

    void init(ViewGroup viewGroup);

    void setProxy(IDisplayVideo iDisplayVideo);
}
