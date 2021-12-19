package com.ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.c;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.keyword.a;
import com.ss.android.ugc.aweme.keyword.b;
import com.ss.android.ugc.aweme.search.model.d;
import com.ss.android.ugc.aweme.search.model.f;
import com.ss.android.ugc.aweme.utils.ec;
import h.f.a.a;
import h.f.b.g;
import h.f.b.l;
import h.h;

public final class SearchIntermediateViewModel extends ac {
    public static final Companion Companion = new Companion(null);
    public boolean backFromSearchResult;
    private final h dismissKeyboard$delegate = ec.a(SearchIntermediateViewModel$dismissKeyboard$2.INSTANCE);
    private final h dismissKeyboardOnActionDown$delegate = ec.a(SearchIntermediateViewModel$dismissKeyboardOnActionDown$2.INSTANCE);
    private final h enableSearchFilter$delegate = ec.a(SearchIntermediateViewModel$enableSearchFilter$2.INSTANCE);
    public boolean enterSearchMiddlePageByBack;
    private final h firstGuessWord$delegate = ec.a(SearchIntermediateViewModel$firstGuessWord$2.INSTANCE);
    public a<String> getIntermediateContainer = SearchIntermediateViewModel$getIntermediateContainer$1.INSTANCE;
    private final h intermediateState$delegate = ec.a(SearchIntermediateViewModel$intermediateState$2.INSTANCE);
    public a.AbstractC2689a keywordPresenter;
    private final h openSearchParam$delegate = ec.a(SearchIntermediateViewModel$openSearchParam$2.INSTANCE);
    private final h searchTabIndex$delegate = ec.a(SearchIntermediateViewModel$searchTabIndex$2.INSTANCE);
    private final h showSearchFilterDot$delegate = ec.a(SearchIntermediateViewModel$showSearchFilterDot$2.INSTANCE);
    public a.c sugKeywordPresenter;
    private final h sugRequestKeyword$delegate = ec.a(SearchIntermediateViewModel$sugRequestKeyword$2.INSTANCE);
    public f timeParam;

    static {
        Covode.recordClassIndex(50933);
    }

    public final c<Boolean> getDismissKeyboard() {
        return (c) this.dismissKeyboard$delegate.getValue();
    }

    public final c<Boolean> getDismissKeyboardOnActionDown() {
        return (c) this.dismissKeyboardOnActionDown$delegate.getValue();
    }

    public final c<Boolean> getEnableSearchFilter() {
        return (c) this.enableSearchFilter$delegate.getValue();
    }

    public final c<Word> getFirstGuessWord() {
        return (c) this.firstGuessWord$delegate.getValue();
    }

    public final c<Integer> getIntermediateState() {
        return (c) this.intermediateState$delegate.getValue();
    }

    public final c<d> getOpenSearchParam() {
        return (c) this.openSearchParam$delegate.getValue();
    }

    public final c<Integer> getSearchTabIndex() {
        return (c) this.searchTabIndex$delegate.getValue();
    }

    public final c<Boolean> getShowSearchFilterDot() {
        return (c) this.showSearchFilterDot$delegate.getValue();
    }

    public final c<String> getSugRequestKeyword() {
        return (c) this.sugRequestKeyword$delegate.getValue();
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(50934);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    private final String getSugKeyword() {
        String a2;
        a.c cVar = this.sugKeywordPresenter;
        if (cVar == null || (a2 = cVar.a()) == null) {
            return "";
        }
        return a2;
    }

    public final void hideIntermediate() {
        getIntermediateState().setValue(0);
    }

    private final String getKeyword() {
        b a2;
        String str;
        a.AbstractC2689a aVar = this.keywordPresenter;
        if (aVar == null || (a2 = aVar.a()) == null || (str = a2.f105233a) == null) {
            return "";
        }
        return str;
    }

    public final boolean canDismissKeyboardOnActionDown() {
        Boolean value = getDismissKeyboardOnActionDown().getValue();
        if (value != null) {
            return value.booleanValue();
        }
        return true;
    }

    private final void setSugKeyword(String str) {
        a.c cVar = this.sugKeywordPresenter;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    public final void setGetIntermediateContainer(h.f.a.a<String> aVar) {
        l.d(aVar, "");
        this.getIntermediateContainer = aVar;
    }

    private final void setKeyword(String str) {
        a.AbstractC2689a aVar = this.keywordPresenter;
        if (aVar != null) {
            aVar.a(new b(str, null, 2));
        }
    }

    public final void openSearchSquare(boolean z) {
        this.backFromSearchResult = z;
        getIntermediateState().setValue(1);
    }

    public final void reFetchTheSearchData(d dVar) {
        l.d(dVar, "");
        com.ss.android.ugc.aweme.search.h.f121133a.b(dVar);
    }

    public final void openSearch(d dVar) {
        l.d(dVar, "");
        if (!TextUtils.isEmpty(dVar.getKeyword())) {
            reFetchTheSearchData(dVar);
            getOpenSearchParam().setValue(dVar);
            hideIntermediate();
        }
    }

    public final void openSearchSug(String str) {
        l.d(str, "");
        Integer value = getIntermediateState().getValue();
        if (value == null || value.intValue() != 2 || !TextUtils.equals(str, getSugKeyword())) {
            setSugKeyword(str);
            getIntermediateState().setValue(2);
        }
    }

    public final void handleSuggestWordItemClick(Word word, int i2) {
        if (word != null) {
            d wordType = new d().setSearchFrom("recom_search").setKeyword(word.getWord()).setWordType(word.getWordType());
            l.b(wordType, "");
            openSearch(wordType);
        }
    }
}
