package com.ss.android.ugc.aweme.discover.model;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;

public class SearchStateViewModel extends ac {
    public t<Boolean> isLeavingSearchPage = new t<>();
    public t<Boolean> isRefreshingData = new t<>();
    public t<Boolean> isSearchPageVisible = new t<>();
    public t<Boolean> isShowingFilters = new t<>();
    public t<Boolean> isShowingSuicide = new t<>();
    public t<Integer> searchState = new t<>();

    static {
        Covode.recordClassIndex(50962);
    }

    public static boolean isSearchIntermediate(int i2) {
        return i2 == 3;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$setIsLeavingSearch$1$SearchStateViewModel(boolean z) {
        this.isLeavingSearchPage.setValue(Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$setIsRefreshingData$3$SearchStateViewModel(boolean z) {
        this.isRefreshingData.setValue(Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$setSearchPageVisible$2$SearchStateViewModel(boolean z) {
        this.isSearchPageVisible.setValue(Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$setSearchState$0$SearchStateViewModel(int i2) {
        this.searchState.setValue(Integer.valueOf(i2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$setShowingFilters$5$SearchStateViewModel(boolean z) {
        this.isShowingFilters.setValue(Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$setShowingSuicide$4$SearchStateViewModel(boolean z) {
        this.isShowingSuicide.setValue(Boolean.valueOf(z));
    }

    public void setIsLeavingSearch(boolean z) {
        runOnUiThread(new SearchStateViewModel$$Lambda$1(this, z));
    }

    public void setIsRefreshingData(boolean z) {
        runOnUiThread(new SearchStateViewModel$$Lambda$3(this, z));
    }

    public void setSearchPageVisible(boolean z) {
        runOnUiThread(new SearchStateViewModel$$Lambda$2(this, z));
    }

    public void setSearchState(int i2) {
        runOnUiThread(new SearchStateViewModel$$Lambda$0(this, i2));
    }

    public void setShowingFilters(boolean z) {
        runOnUiThread(new SearchStateViewModel$$Lambda$5(this, z));
    }

    public void setShowingSuicide(boolean z) {
        runOnUiThread(new SearchStateViewModel$$Lambda$4(this, z));
    }

    private void runOnUiThread(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }
}
