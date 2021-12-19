package com.ss.android.ugc.aweme.port.in;

import android.app.Activity;
import android.content.Intent;
import androidx.core.g.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.shortvideo.ai;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public interface ax {

    public interface a {
        static {
            Covode.recordClassIndex(74545);
        }

        String a();

        void a(Boolean bool);

        void a(Boolean bool, Boolean bool2);

        void a(String str);

        void b(Boolean bool);

        boolean b();

        boolean c();
    }

    static {
        Covode.recordClassIndex(74544);
    }

    q<? extends ai> a(LinkedHashMap<String, String> linkedHashMap);

    List<e<Class<?>, IAVPublishExtension<?>>> a(AVPublishContentType aVPublishContentType);

    void a(Activity activity, String str);

    void a(CommonItemView commonItemView, boolean z, HashMap<String, String> hashMap);

    void a(BaseResponse baseResponse, int i2);

    void a(boolean z);

    boolean a();

    boolean a(androidx.fragment.app.e eVar, Intent intent);

    List<com.ss.android.ugc.aweme.shortvideo.publish.e> b();

    int c();

    int d();
}
