package com.ss.android.ugc.aweme.search.n;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class a implements Serializable {
    private final String enterFrom;
    private final String previousPage;
    private final boolean shouldShowScanView;
    private final boolean shouldShowSug;

    static {
        Covode.recordClassIndex(79164);
    }

    public a() {
        this(null, null, false, false, 15, null);
    }

    public static /* synthetic */ a copy$default(a aVar, String str, String str2, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aVar.enterFrom;
        }
        if ((i2 & 2) != 0) {
            str2 = aVar.previousPage;
        }
        if ((i2 & 4) != 0) {
            z = aVar.shouldShowScanView;
        }
        if ((i2 & 8) != 0) {
            z2 = aVar.shouldShowSug;
        }
        return aVar.copy(str, str2, z, z2);
    }

    public final String component1() {
        return this.enterFrom;
    }

    public final String component2() {
        return this.previousPage;
    }

    public final boolean component3() {
        return this.shouldShowScanView;
    }

    public final boolean component4() {
        return this.shouldShowSug;
    }

    public final a copy(String str, String str2, boolean z, boolean z2) {
        return new a(str, str2, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.enterFrom, aVar.enterFrom) && l.a(this.previousPage, aVar.previousPage) && this.shouldShowScanView == aVar.shouldShowScanView && this.shouldShowSug == aVar.shouldShowSug;
    }

    public final int hashCode() {
        String str = this.enterFrom;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.previousPage;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z = this.shouldShowScanView;
        int i4 = 1;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = (i3 + i5) * 31;
        if (!this.shouldShowSug) {
            i4 = 0;
        }
        return i8 + i4;
    }

    public final String toString() {
        return "SearchCommonModel(enterFrom=" + this.enterFrom + ", previousPage=" + this.previousPage + ", shouldShowScanView=" + this.shouldShowScanView + ", shouldShowSug=" + this.shouldShowSug + ")";
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final boolean getShouldShowScanView() {
        return this.shouldShowScanView;
    }

    public final boolean getShouldShowSug() {
        return this.shouldShowSug;
    }

    public a(String str, String str2, boolean z, boolean z2) {
        this.enterFrom = str;
        this.previousPage = str2;
        this.shouldShowScanView = z;
        this.shouldShowSug = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, String str2, boolean z, boolean z2, int i2, g gVar) {
        this((i2 & 1) != 0 ? "discovery" : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? true : z2);
    }
}
