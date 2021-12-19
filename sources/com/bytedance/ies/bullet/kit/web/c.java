package com.bytedance.ies.bullet.kit.web;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.ui.common.c.a;
import java.util.Map;

public interface c extends i, a {
    static {
        Covode.recordClassIndex(19198);
    }

    void a(Map<String, String> map);

    com.bytedance.ies.bullet.kit.web.b.a m();

    WebView n();
}
