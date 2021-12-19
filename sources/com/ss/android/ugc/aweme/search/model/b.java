package com.ss.android.ugc.aweme.search.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b implements Serializable {
    public static final C3139b Companion = new C3139b(null);
    public static final long serialVersionUID = 42;
    private String authorId;
    private String displayHint;
    private String enterSearchFrom;
    private String gidRequest;
    private String groupId;
    private Word inboxWord;
    private boolean isFromDiscoverSuggestSearch;
    private boolean isSetHintBySugWord;
    private Map<String, Object> logExtraMap;
    private String previousPage;
    private String searchHint;
    private String searchHintWordId;
    private boolean shouldShowScanView = true;
    private boolean shouldShowSug = true;
    private boolean useSingleStack;

    static {
        Covode.recordClassIndex(79153);
    }

    public static final a newBuilder() {
        return Companion.newBuilder();
    }

    /* renamed from: com.ss.android.ugc.aweme.search.model.b$b  reason: collision with other inner class name */
    public static final class C3139b implements Serializable {
        static {
            Covode.recordClassIndex(79155);
        }

        private C3139b() {
        }

        public final a newBuilder() {
            return new a();
        }

        public /* synthetic */ C3139b(g gVar) {
            this();
        }
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final String getDisplayHint() {
        return this.displayHint;
    }

    public final String getEnterSearchFrom() {
        return this.enterSearchFrom;
    }

    public final String getGidRequest() {
        return this.gidRequest;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final Word getInboxWord() {
        return this.inboxWord;
    }

    public final Map<String, Object> getLogExtraMap() {
        return this.logExtraMap;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getSearchHint() {
        return this.searchHint;
    }

    public final String getSearchHintWordId() {
        return this.searchHintWordId;
    }

    public final boolean getShouldShowScanView() {
        return this.shouldShowScanView;
    }

    public final boolean getShouldShowSug() {
        return this.shouldShowSug;
    }

    public final boolean getUseSingleStack() {
        return this.useSingleStack;
    }

    public final boolean isFromDiscoverSuggestSearch() {
        return this.isFromDiscoverSuggestSearch;
    }

    public final boolean isSetHintBySugWord() {
        return this.isSetHintBySugWord;
    }

    public final String consumeGid() {
        String str = this.gidRequest;
        this.gidRequest = null;
        return str;
    }

    public final void restEnterSearchPosition() {
        Map<String, Object> map = this.logExtraMap;
        if (map != null && map.containsKey("search_position")) {
            Map<String, Object> map2 = this.logExtraMap;
            if (map2 == null) {
                l.b();
            }
            map2.remove("search_position");
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f121499a = "discovery";

        /* renamed from: b  reason: collision with root package name */
        public String f121500b;

        /* renamed from: c  reason: collision with root package name */
        public String f121501c;

        /* renamed from: d  reason: collision with root package name */
        public String f121502d;

        /* renamed from: e  reason: collision with root package name */
        public String f121503e;

        /* renamed from: f  reason: collision with root package name */
        public String f121504f;

        /* renamed from: g  reason: collision with root package name */
        public String f121505g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f121506h = true;

        /* renamed from: i  reason: collision with root package name */
        public boolean f121507i = true;

        /* renamed from: j  reason: collision with root package name */
        public boolean f121508j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f121509k;

        /* renamed from: l  reason: collision with root package name */
        private Map<String, Object> f121510l = new LinkedHashMap();

        static {
            Covode.recordClassIndex(79154);
        }

        public final b a() {
            b bVar = new b();
            bVar.setEnterSearchFrom(this.f121499a);
            bVar.setPreviousPage(this.f121500b);
            bVar.setGroupId(this.f121501c);
            bVar.setAuthorId(this.f121502d);
            bVar.setSearchHint(this.f121504f);
            bVar.setSearchHintWordId(this.f121505g);
            bVar.setShouldShowScanView(this.f121506h);
            bVar.setShouldShowSug(this.f121507i);
            bVar.setDisplayHint(this.f121503e);
            bVar.setSetHintBySugWord(this.f121508j);
            bVar.setUseSingleStack(this.f121509k);
            bVar.setLogExtraMap(this.f121510l);
            return bVar;
        }

        public final a a(String str) {
            l.d(str, "");
            return a("tab_name", str);
        }

        public final a b(String str) {
            l.d(str, "");
            return a("is_from_video", str);
        }

        public final a c(String str) {
            l.d(str, "");
            this.f121510l.put("search_position", str);
            return this;
        }

        public final a a(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            this.f121510l.put(str, str2);
            return this;
        }
    }

    public final void setAuthorId(String str) {
        this.authorId = str;
    }

    public final void setDisplayHint(String str) {
        this.displayHint = str;
    }

    public final void setEnterSearchFrom(String str) {
        this.enterSearchFrom = str;
    }

    public final void setFromDiscoverSuggestSearch(boolean z) {
        this.isFromDiscoverSuggestSearch = z;
    }

    public final void setGidRequest(String str) {
        this.gidRequest = str;
    }

    public final void setInboxWord(Word word) {
        this.inboxWord = word;
    }

    public final void setLogExtraMap(Map<String, Object> map) {
        this.logExtraMap = map;
    }

    public final void setPreviousPage(String str) {
        this.previousPage = str;
    }

    public final void setSearchHint(String str) {
        this.searchHint = str;
    }

    public final void setSearchHintWordId(String str) {
        this.searchHintWordId = str;
    }

    public final void setSetHintBySugWord(boolean z) {
        this.isSetHintBySugWord = z;
    }

    public final void setShouldShowScanView(boolean z) {
        this.shouldShowScanView = z;
    }

    public final void setShouldShowSug(boolean z) {
        this.shouldShowSug = z;
    }

    public final void setUseSingleStack(boolean z) {
        this.useSingleStack = z;
    }

    public final void setGroupId(String str) {
        this.groupId = str;
        this.gidRequest = str;
    }

    public final Object obtainLogData(String str) {
        l.d(str, "");
        Map<String, Object> map = this.logExtraMap;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
