package com.squareup.wire;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;

public interface DefaultValueGroup<M extends Message<M, B>, B extends Message.Builder<M, B>> {
    static {
        Covode.recordClassIndex(36100);
    }

    void addDefaultValues(B b2);
}
