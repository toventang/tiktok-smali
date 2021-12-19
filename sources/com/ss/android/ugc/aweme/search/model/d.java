package com.ss.android.ugc.aweme.search.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.g.b;
import com.ss.android.ugc.aweme.search.h;
import java.io.Serializable;

public class d implements Serializable, Cloneable {
    private String enterMethod;
    private String eventKeyword;
    private b filterOption;
    private String fromSearchSubtag;
    private String guideSearchBaseWord;
    private int index;
    private boolean isOpenNewSearchContainer;
    private String isRichSug;
    private String keyword;
    private String lastSearchId;
    private boolean mIsFilterFromSchema;
    private f mTimeParam;
    private int needCorrect = 1;
    private String preSearchId;
    private String realSearchWord;
    private b searchEnterParam = h.f121133a.e();
    private String searchFrom = "";
    private String sugType;
    private String sugUserId;
    private String switchTab;
    private String trendingEventId;
    private String utmSource;
    private String wordType;

    static {
        Covode.recordClassIndex(79157);
    }

    public String getEnterMethod() {
        return this.enterMethod;
    }

    public String getEventKeyword() {
        return this.eventKeyword;
    }

    public b getFilterOption() {
        return this.filterOption;
    }

    public String getFromSearchSubtag() {
        return this.fromSearchSubtag;
    }

    public String getGuideSearchBaseWord() {
        return this.guideSearchBaseWord;
    }

    public int getIndex() {
        return this.index;
    }

    public boolean getIsFilterFromSchema() {
        return this.mIsFilterFromSchema;
    }

    public String getIsRichSug() {
        return this.isRichSug;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public int getNeedCorrect() {
        return this.needCorrect;
    }

    public String getPreSearchId() {
        return this.preSearchId;
    }

    public String getRealSearchWord() {
        return this.realSearchWord;
    }

    public b getSearchEnterParam() {
        return this.searchEnterParam;
    }

    public String getSearchFrom() {
        return this.searchFrom;
    }

    public String getSugType() {
        return this.sugType;
    }

    public String getSugUserId() {
        return this.sugUserId;
    }

    public String getSwitchTab() {
        return this.switchTab;
    }

    public f getTimeParam() {
        return this.mTimeParam;
    }

    public String getTrendingEventId() {
        return this.trendingEventId;
    }

    public String getUtmSource() {
        return this.utmSource;
    }

    public String getWordType() {
        return this.wordType;
    }

    public boolean isOpenNewSearchContainer() {
        return this.isOpenNewSearchContainer;
    }

    public String getLastSearchId() {
        String str = this.lastSearchId;
        this.lastSearchId = null;
        return str;
    }

    public int getId() {
        int i2;
        int i3 = this.index * 31;
        String str = this.keyword;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        return i3 + i2;
    }

    public boolean isGuideSearch() {
        String str = this.searchFrom;
        if (str == "guide_search" || str == "guide_search_cancel") {
            return true;
        }
        return false;
    }

    public String getSearchEnterFromPage() {
        b bVar = this.searchEnterParam;
        if (bVar == null || TextUtils.isEmpty(bVar.getEnterSearchFrom())) {
            return "";
        }
        return this.searchEnterParam.getEnterSearchFrom();
    }

    public d copy() {
        try {
            return (d) clone();
        } catch (CloneNotSupportedException e2) {
            e2.printStackTrace();
            d dVar = new d();
            dVar.keyword = this.keyword;
            dVar.index = this.index;
            dVar.enterMethod = this.enterMethod;
            dVar.filterOption = this.filterOption;
            dVar.guideSearchBaseWord = this.guideSearchBaseWord;
            dVar.isOpenNewSearchContainer = this.isOpenNewSearchContainer;
            dVar.searchFrom = this.searchFrom;
            dVar.realSearchWord = this.realSearchWord;
            dVar.needCorrect = this.needCorrect;
            dVar.lastSearchId = this.lastSearchId;
            return dVar;
        }
    }

    public d setEnterMethod(String str) {
        this.enterMethod = str;
        return this;
    }

    public d setEventKeyword(String str) {
        this.eventKeyword = str;
        return this;
    }

    public d setFilterOption(b bVar) {
        this.filterOption = bVar;
        return this;
    }

    public d setFromSearchSubtag(String str) {
        this.fromSearchSubtag = str;
        return this;
    }

    public d setGuideSearchBaseWord(String str) {
        this.guideSearchBaseWord = str;
        return this;
    }

    public d setIndex(int i2) {
        this.index = i2;
        return this;
    }

    public d setIsFilterFromSchema(boolean z) {
        this.mIsFilterFromSchema = z;
        return this;
    }

    public d setIsRichSug(String str) {
        this.isRichSug = str;
        return this;
    }

    public d setKeyword(String str) {
        this.keyword = str;
        return this;
    }

    public d setLastSearchId(String str) {
        this.lastSearchId = str;
        return this;
    }

    public d setNeedCorrect(int i2) {
        this.needCorrect = i2;
        return this;
    }

    public d setOpenNewSearchContainer(boolean z) {
        this.isOpenNewSearchContainer = z;
        return this;
    }

    public d setPreSearchId(String str) {
        this.preSearchId = str;
        return this;
    }

    public d setRealSearchWord(String str) {
        this.realSearchWord = str;
        return this;
    }

    public d setSearchEnterParam(b bVar) {
        this.searchEnterParam = bVar;
        return this;
    }

    public d setSearchFrom(String str) {
        this.searchFrom = str;
        return this;
    }

    public d setSugType(String str) {
        this.sugType = str;
        return this;
    }

    public d setSugUserId(String str) {
        this.sugUserId = str;
        return this;
    }

    public d setSwitchTab(String str) {
        this.switchTab = str;
        return this;
    }

    public d setTimeParam(f fVar) {
        this.mTimeParam = fVar;
        return this;
    }

    public d setTrendingEventId(String str) {
        this.trendingEventId = str;
        return this;
    }

    public d setUtmSource(String str) {
        this.utmSource = str;
        return this;
    }

    public d setWordType(String str) {
        this.wordType = str;
        return this;
    }
}
