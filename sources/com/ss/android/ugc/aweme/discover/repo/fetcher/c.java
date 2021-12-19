package com.ss.android.ugc.aweme.discover.repo.fetcher;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import java.io.Serializable;

public final class c implements Serializable {
    public static final a Companion = new a(null);
    private final int cursor;
    private boolean isFromSuggestSearch;

    static {
        Covode.recordClassIndex(51051);
    }

    public static /* synthetic */ c copy$default(c cVar, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = cVar.cursor;
        }
        return cVar.copy(i2);
    }

    public final int component1() {
        return this.cursor;
    }

    public final c copy(int i2) {
        return new c(i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && this.cursor == ((c) obj).cursor;
        }
        return true;
    }

    public final String toString() {
        return "DiscoverRequestParam(cursor=" + this.cursor + ")";
    }

    public static final class a implements Serializable {
        static {
            Covode.recordClassIndex(51052);
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final int hashCode() {
        return this.cursor;
    }

    public final boolean isFromSuggestSearch() {
        return this.isFromSuggestSearch;
    }

    public final void setFromSuggestSearch(boolean z) {
        this.isFromSuggestSearch = z;
    }

    public c(int i2) {
        this.cursor = i2;
    }
}
