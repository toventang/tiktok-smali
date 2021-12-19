package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface IBitrateSelector {
    static {
        Covode.recordClassIndex(28012);
    }

    ABRResult predictBitrate(IPlayStateSupplier iPlayStateSupplier);

    ABRResult predictStartupBitrate(IPlayStateSupplier iPlayStateSupplier);

    void release();

    void setMediaInfo(Map<String, IVideoStream> map, Map<String, IAudioStream> map2);
}
