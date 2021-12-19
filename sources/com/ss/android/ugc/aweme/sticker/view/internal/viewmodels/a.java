package com.ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.repository.c.d;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;

public interface a {
    static {
        Covode.recordClassIndex(89242);
    }

    int a();

    void a(d dVar);

    LiveData<Boolean> b();

    LiveData<List<EffectCategoryModel>> c();

    LiveData<com.ss.android.ugc.tools.view.widget.b.a> d();

    void e();
}
