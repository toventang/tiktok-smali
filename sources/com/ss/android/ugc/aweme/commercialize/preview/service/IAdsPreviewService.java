package com.ss.android.ugc.aweme.commercialize.preview.service;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.preview.d.a.a;
import h.z;

public interface IAdsPreviewService {
    static {
        Covode.recordClassIndex(46268);
    }

    void a(Context context, ViewGroup viewGroup, a aVar);

    void a(Context context, ViewGroup viewGroup, h.f.a.a<z> aVar, h.f.a.a<z> aVar2);

    void a(ViewGroup viewGroup);

    boolean a(String str, String str2);

    void b(ViewGroup viewGroup);
}
