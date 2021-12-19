package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import java.util.List;

public interface ISearchHistoryManager {
    static {
        Covode.recordClassIndex(50905);
    }

    void clearForAccountChange();

    void clearSearchHistory();

    void clearSearchHistory(int i2);

    void deleteSearchHistory(SearchHistory searchHistory);

    String getKey();

    List<SearchHistory> getSearchHistory();

    List<SearchHistory> getSearchHistoryByType(int i2);

    void recordSearchHistory(SearchHistory searchHistory);

    void saveSearchHistory();
}
