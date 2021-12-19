package com.ss.android.ugc.aweme.sticker.view.a;

import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.aweme.sticker.view.a.l;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.d;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import h.z;

public interface a<TabView, View> {
    static {
        Covode.recordClassIndex(88948);
    }

    d<View> a(int i2, l.b bVar, l.a aVar, RecyclerView.RecycledViewPool recycledViewPool);

    TabView a(e eVar, EffectCategoryModel effectCategoryModel, TabLayout tabLayout, h.f.a.a<z> aVar);
}
