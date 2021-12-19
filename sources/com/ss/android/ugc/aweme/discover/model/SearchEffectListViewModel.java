package com.ss.android.ugc.aweme.discover.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.discover.api.SearchApi;
import h.f.b.l;

public final class SearchEffectListViewModel extends ac {
    public final t<SearchEffectPropsList> mData = new t<>();

    static {
        Covode.recordClassIndex(50926);
    }

    public final LiveData<SearchEffectPropsList> getData() {
        return this.mData;
    }

    public final void fetch(String str, String str2, int i2, int i3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str, "");
        l.d(str2, "");
        SearchApi.a().searchEffectList(str, str2, "search_tab", i2, i3, d.n).a(new SearchEffectListViewModel$fetch$1(this), i.f4826c, null);
    }
}
