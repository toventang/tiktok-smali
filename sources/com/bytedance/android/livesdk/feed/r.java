package com.bytedance.android.livesdk.feed;

import androidx.lifecycle.l;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.covode.number.Covode;
import java.util.List;

public interface r<T extends FeedItem> extends l {
    static {
        Covode.recordClassIndex(9759);
    }

    void c(String str);

    T d(String str);

    List<T> e();

    void f();

    void g();
}
