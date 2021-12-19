package com.ss.android.ugc.gamora.editor.sticker.donation.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class a implements Serializable {
    @c(a = "double_donation_text")
    private final String matchDonateText;
    @c(a = "double_donation_highlight")
    private final String matchDonationHighlightText;
    @c(a = "double_donation_sticker")
    private final String matchDonationTextForSticker;

    static {
        Covode.recordClassIndex(96444);
    }

    public static /* synthetic */ a copy$default(a aVar, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aVar.matchDonationTextForSticker;
        }
        if ((i2 & 2) != 0) {
            str2 = aVar.matchDonateText;
        }
        if ((i2 & 4) != 0) {
            str3 = aVar.matchDonationHighlightText;
        }
        return aVar.copy(str, str2, str3);
    }

    public final String component1() {
        return this.matchDonationTextForSticker;
    }

    public final String component2() {
        return this.matchDonateText;
    }

    public final String component3() {
        return this.matchDonationHighlightText;
    }

    public final a copy(String str, String str2, String str3) {
        return new a(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.matchDonationTextForSticker, aVar.matchDonationTextForSticker) && l.a(this.matchDonateText, aVar.matchDonateText) && l.a(this.matchDonationHighlightText, aVar.matchDonationHighlightText);
    }

    public final int hashCode() {
        String str = this.matchDonationTextForSticker;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.matchDonateText;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.matchDonationHighlightText;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "MatchDonationText(matchDonationTextForSticker=" + this.matchDonationTextForSticker + ", matchDonateText=" + this.matchDonateText + ", matchDonationHighlightText=" + this.matchDonationHighlightText + ")";
    }

    public final String getMatchDonateText() {
        return this.matchDonateText;
    }

    public final String getMatchDonationHighlightText() {
        return this.matchDonationHighlightText;
    }

    public final String getMatchDonationTextForSticker() {
        return this.matchDonationTextForSticker;
    }

    public a(String str, String str2, String str3) {
        this.matchDonationTextForSticker = str;
        this.matchDonateText = str2;
        this.matchDonationHighlightText = str3;
    }
}
