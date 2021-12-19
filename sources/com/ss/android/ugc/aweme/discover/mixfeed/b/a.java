package com.ss.android.ugc.aweme.discover.mixfeed.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

public final class a implements Serializable {
    public static final b Companion = new b((byte) 0);
    private boolean isAladdin = true;
    private int rank = -1;
    private String searchKeyWord = "";
    private String searchResultId = "";
    private String tokenType = "";
    private User user;

    static {
        Covode.recordClassIndex(50732);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(50734);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final int getRank() {
        return this.rank;
    }

    public final String getSearchKeyWord() {
        return this.searchKeyWord;
    }

    public final String getSearchResultId() {
        return this.searchResultId;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public final User getUser() {
        return this.user;
    }

    public final boolean isAladdin() {
        return this.isAladdin;
    }

    public static final C1911a newBuilder() {
        return new C1911a();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.b.a$a  reason: collision with other inner class name */
    public static final class C1911a {

        /* renamed from: a  reason: collision with root package name */
        public String f81636a = "";

        /* renamed from: b  reason: collision with root package name */
        public int f81637b = -1;

        /* renamed from: c  reason: collision with root package name */
        public String f81638c = "";

        /* renamed from: d  reason: collision with root package name */
        public String f81639d = "";

        /* renamed from: e  reason: collision with root package name */
        private boolean f81640e = true;

        /* renamed from: f  reason: collision with root package name */
        private User f81641f;

        static {
            Covode.recordClassIndex(50733);
        }

        public final a a() {
            a aVar = new a();
            aVar.setSearchResultId(this.f81636a);
            aVar.setAladdin(this.f81640e);
            aVar.setRank(this.f81637b);
            aVar.setTokenType(this.f81638c);
            aVar.setSearchKeyWord(this.f81639d);
            aVar.setUser(this.f81641f);
            return aVar;
        }
    }

    public final void setAladdin(boolean z) {
        this.isAladdin = z;
    }

    public final void setRank(int i2) {
        this.rank = i2;
    }

    public final void setSearchKeyWord(String str) {
        this.searchKeyWord = str;
    }

    public final void setSearchResultId(String str) {
        this.searchResultId = str;
    }

    public final void setTokenType(String str) {
        this.tokenType = str;
    }

    public final void setUser(User user2) {
        this.user = user2;
    }
}
