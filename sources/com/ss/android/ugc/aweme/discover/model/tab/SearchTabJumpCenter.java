package com.ss.android.ugc.aweme.discover.model.tab;

import com.bytedance.covode.number.Covode;

public final class SearchTabJumpCenter {
    public static final SearchTabJumpCenter INSTANCE = new SearchTabJumpCenter();
    private static SearchTabViewModel searchTabViewModel;

    private SearchTabJumpCenter() {
    }

    public final SearchTabViewModel getSearchTabViewModel() {
        return searchTabViewModel;
    }

    static {
        Covode.recordClassIndex(51002);
    }

    public final void setSearchTabViewModel(SearchTabViewModel searchTabViewModel2) {
        searchTabViewModel = searchTabViewModel2;
    }
}
