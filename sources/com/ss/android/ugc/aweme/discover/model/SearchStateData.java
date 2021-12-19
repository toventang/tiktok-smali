package com.ss.android.ugc.aweme.discover.model;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import java.util.Objects;

public final class SearchStateData extends ac {
    private t<Integer> searchStateData;

    static {
        Covode.recordClassIndex(50959);
    }

    public final t<Integer> getSearchState() {
        if (this.searchStateData == null) {
            this.searchStateData = new t<>();
        }
        t<Integer> tVar = this.searchStateData;
        Objects.requireNonNull(tVar, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Int>");
        return tVar;
    }
}
