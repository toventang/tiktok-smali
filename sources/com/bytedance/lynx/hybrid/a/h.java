package com.bytedance.lynx.hybrid.a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.h.a;
import java.util.List;
import java.util.Map;

public interface h {
    static {
        Covode.recordClassIndex(25050);
    }

    View a();

    void a(String str);

    void a(String str, List<? extends Object> list);

    void b();

    void destroy();

    a getHybridContext();

    void updateData(Map<String, ? extends Object> map);
}
