package com.bytedance.ugc.glue.http;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.List;

public interface UGCCallbackWithHeader<T> {
    static {
        Covode.recordClassIndex(27949);
    }

    void onResponse(int i2, T t, List<Pair<String, String>> list);
}
