package com.ss.android.ugc.aweme.im.sdk.chat.ui.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.h;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import f.a.n;
import java.util.List;

public interface d {
    static {
        Covode.recordClassIndex(64741);
    }

    void a(h hVar);

    void a(SystemContent systemContent, String str);

    void a(String str);

    void a(List<ai> list);

    n<List<ai>> b(List<ai> list);
}
