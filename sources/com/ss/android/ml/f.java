package com.ss.android.ml;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.process.bl.MLConfigModel;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

public interface f {
    static {
        Covode.recordClassIndex(36992);
    }

    void a(ByteBuffer byteBuffer, float[][] fArr);

    boolean a(MappedByteBuffer mappedByteBuffer, MLConfigModel mLConfigModel);
}
