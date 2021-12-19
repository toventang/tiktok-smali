package com.ss.android.ugc.aweme.sticker.repository.a;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2;
import com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import java.util.List;
import java.util.Map;

public interface y {

    public static final class a {
        static {
            Covode.recordClassIndex(88538);
        }
    }

    static {
        Covode.recordClassIndex(88537);
    }

    LiveData<com.ss.android.ugc.aweme.bw.b.a<CategoryEffectModel>> a(String str, boolean z);

    Map<String, Effect> a();

    void a(String str);

    void a(List<? extends Effect> list);

    LiveData<com.ss.android.ugc.aweme.bw.b.a<PanelInfoModel>> b();

    void b(List<? extends Effect> list);

    Map<String, LiveData<com.ss.android.ugc.aweme.bw.b.a<CategoryEffectModel>>> c();

    LiveData<List<String>> d();

    LiveData<List<EffectCategoryModel>> e();

    LiveData<com.ss.android.ugc.aweme.bw.b.a<SearchEffectResponseV2>> f();

    LiveData<com.ss.android.ugc.aweme.bw.b.a<RecommendSearchWordsResponse>> g();
}
