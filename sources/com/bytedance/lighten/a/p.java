package com.bytedance.lighten.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.a.a;
import java.io.File;

public interface p extends i {
    static {
        Covode.recordClassIndex(24613);
    }

    c getCache();

    void init(j jVar);

    v load(int i2);

    v load(Uri uri);

    v load(a aVar);

    v load(File file);

    v load(Object obj);

    v load(String str);
}
