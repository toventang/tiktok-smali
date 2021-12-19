package com.ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.b.a;
import com.google.gson.f;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.h.d;
import com.ss.android.ugc.aweme.base.h.e;
import com.ss.android.ugc.aweme.discover.e.l;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.d.a.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class SearchHistoryManager implements IAccountService.b, ISearchHistoryManager {
    private static int MAX_VISIBLE_HISTORY_COUNT = 20;
    private static String UN_LOGIN_USER_ID = "FAKE_USER";
    private static SearchHistoryManager sManager;
    private IAccountService accountService;
    private List<Pair<String, List<SearchHistory>>> allLocalHistory;
    private List<SearchHistory> currentUserLocalHistory;
    private f gson = new f();
    private int mMaxCacheNumber = 20;
    private int mMaxUserCacheNumber = 10;

    public static int com_ss_android_ugc_aweme_discover_model_SearchHistoryManager_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.ISearchHistoryManager
    public void clearForAccountChange() {
    }

    @Override // com.ss.android.ugc.aweme.discover.model.ISearchHistoryManager
    public void clearSearchHistory(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.discover.model.ISearchHistoryManager
    public String getKey() {
        return "recent_history_v2";
    }

    /* access modifiers changed from: protected */
    public String getOldKey() {
        return "recent_history";
    }

    @Override // com.ss.android.ugc.aweme.discover.model.ISearchHistoryManager
    public void saveSearchHistory() {
    }

    @Override // com.ss.android.ugc.aweme.discover.model.ISearchHistoryManager
    public List<SearchHistory> getSearchHistory() {
        return this.currentUserLocalHistory;
    }

    static {
        Covode.recordClassIndex(50930);
    }

    private String getNewSearchHistory() {
        return d.d().a(getKey(), "");
    }

    private List<SearchHistory> getOldSearchHistory() {
        return d.d().a(getOldKey(), SearchHistory.class);
    }

    private void onSearchHistoryChanged() {
        c.b(new l());
    }

    @Override // com.ss.android.ugc.aweme.discover.model.ISearchHistoryManager
    public void clearSearchHistory() {
        this.currentUserLocalHistory.clear();
        updateSearchHistoryInSp();
        onSearchHistoryChanged();
    }

    private void deleteOldSearchHistory() {
        e d2 = d.d();
        d2.a().remove(getOldKey()).apply();
    }

    private String getCurrentUserId() {
        IAccountUserService e2 = this.accountService.e();
        if (e2.isLogin()) {
            return e2.getCurUserId();
        }
        return UN_LOGIN_USER_ID;
    }

    private void removeFakeUserHistory() {
        Iterator<Pair<String, List<SearchHistory>>> it = this.allLocalHistory.iterator();
        while (it.hasNext()) {
            Pair<String, List<SearchHistory>> next = it.next();
            if (next != null && TextUtils.equals((CharSequence) next.first, UN_LOGIN_USER_ID)) {
                it.remove();
            }
        }
    }

    private void updateSearchHistoryInSp() {
        try {
            String b2 = this.gson.b(this.allLocalHistory, new a<List<Pair<String, List<MusicSearchHistory>>>>() {
                /* class com.ss.android.ugc.aweme.discover.model.SearchHistoryManager.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(50931);
                }
            }.type);
            com_ss_android_ugc_aweme_discover_model_SearchHistoryManager_com_ss_android_ugc_aweme_lancet_LogLancet_e("yvette", "updateSearchHistoryInSp store ".concat(String.valueOf(b2)));
            updateSearchHistory(b2);
        } catch (Exception unused) {
        }
    }

    private void ensureCurrentUserLocalHistory() {
        String currentUserId = getCurrentUserId();
        Iterator<Pair<String, List<SearchHistory>>> it = this.allLocalHistory.iterator();
        this.currentUserLocalHistory = new ArrayList();
        while (it.hasNext()) {
            Pair<String, List<SearchHistory>> next = it.next();
            if (next != null && TextUtils.equals((CharSequence) next.first, currentUserId)) {
                this.currentUserLocalHistory.addAll((Collection) next.second);
                it.remove();
            }
        }
        this.allLocalHistory.add(0, new Pair<>(currentUserId, this.currentUserLocalHistory));
        if (this.mMaxUserCacheNumber > 0 && this.allLocalHistory.size() > this.mMaxUserCacheNumber) {
            List<Pair<String, List<SearchHistory>>> list = this.allLocalHistory;
            list.remove(list.size() - 1);
        }
        updateSearchHistoryInSp();
    }

    private List<Pair<String, List<SearchHistory>>> getSearchHistoryInSp() {
        try {
            String newSearchHistory = getNewSearchHistory();
            if (TextUtils.isEmpty(newSearchHistory)) {
                com_ss_android_ugc_aweme_discover_model_SearchHistoryManager_com_ss_android_ugc_aweme_lancet_LogLancet_e("yvette", "getSearchHistory return  empty ");
                List<SearchHistory> oldSearchHistory = getOldSearchHistory();
                if (oldSearchHistory == null) {
                    com_ss_android_ugc_aweme_discover_model_SearchHistoryManager_com_ss_android_ugc_aweme_lancet_LogLancet_e("yvette", "getOldSearchHistory return  empty ");
                    oldSearchHistory = new ArrayList<>();
                } else {
                    deleteOldSearchHistory();
                }
                ArrayList arrayList = new ArrayList();
                this.allLocalHistory = arrayList;
                arrayList.add(new Pair(UN_LOGIN_USER_ID, oldSearchHistory));
            } else {
                this.allLocalHistory = (List) this.gson.a(newSearchHistory, new a<List<Pair<String, List<SearchHistory>>>>() {
                    /* class com.ss.android.ugc.aweme.discover.model.SearchHistoryManager.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(50932);
                    }
                }.type);
            }
        } catch (Exception unused) {
        }
        if (this.allLocalHistory == null) {
            this.allLocalHistory = new ArrayList();
        }
        com_ss_android_ugc_aweme_discover_model_SearchHistoryManager_com_ss_android_ugc_aweme_lancet_LogLancet_e("yvette", "getSearchHistoryInSp finally get " + this.allLocalHistory);
        return this.allLocalHistory;
    }

    private void updateSearchHistory(String str) {
        d.d().b(getKey(), str);
    }

    @Override // com.ss.android.ugc.aweme.discover.model.ISearchHistoryManager
    public void deleteSearchHistory(SearchHistory searchHistory) {
        this.currentUserLocalHistory.remove(searchHistory);
        updateSearchHistoryInSp();
        onSearchHistoryChanged();
    }

    SearchHistoryManager(String str) {
        IAccountService a2 = AccountService.a();
        this.accountService = a2;
        a2.a(this);
        this.allLocalHistory = getSearchHistoryInSp();
        ensureCurrentUserLocalHistory();
    }

    public static ISearchHistoryManager inst(String str) {
        MethodCollector.i(3143);
        if (sManager == null) {
            synchronized (SearchHistoryManager.class) {
                try {
                    if (sManager == null) {
                        sManager = new SearchHistoryManager(str);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3143);
                    throw th;
                }
            }
        }
        SearchHistoryManager searchHistoryManager = sManager;
        MethodCollector.o(3143);
        return searchHistoryManager;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.ISearchHistoryManager
    public void recordSearchHistory(SearchHistory searchHistory) {
        this.currentUserLocalHistory.remove(searchHistory);
        this.currentUserLocalHistory.add(0, searchHistory);
        if (this.mMaxCacheNumber > 0 && this.currentUserLocalHistory.size() > this.mMaxCacheNumber) {
            List<SearchHistory> list = this.currentUserLocalHistory;
            list.remove(list.size() - 1);
        }
        updateSearchHistoryInSp();
        onSearchHistoryChanged();
    }

    @Override // com.ss.android.ugc.aweme.discover.model.ISearchHistoryManager
    public List<SearchHistory> getSearchHistoryByType(int i2) {
        ArrayList<SearchHistory> arrayList;
        ArrayList arrayList2 = new ArrayList();
        List<SearchHistory> list = this.currentUserLocalHistory;
        if (list != null && list.size() > 0) {
            try {
                arrayList = new ArrayList(this.currentUserLocalHistory);
            } catch (Exception unused) {
                arrayList = new ArrayList();
            }
            for (SearchHistory searchHistory : arrayList) {
                if (searchHistory != null && searchHistory.type == i2) {
                    arrayList2.add(searchHistory);
                }
                if (i2 == 0 && arrayList2.size() == MAX_VISIBLE_HISTORY_COUNT) {
                    break;
                }
            }
        }
        return arrayList2;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService.b
    public void onAccountResult(int i2, boolean z, int i3, User user) {
        if (i2 != 2) {
            if (i2 == 1 || i2 == 3) {
                removeFakeUserHistory();
                updateSearchHistoryInSp();
            } else {
                return;
            }
        }
        this.allLocalHistory.clear();
        this.allLocalHistory = getSearchHistoryInSp();
        ensureCurrentUserLocalHistory();
    }
}
