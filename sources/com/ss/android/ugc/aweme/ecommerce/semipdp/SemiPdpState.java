package com.ss.android.ugc.aweme.ecommerce.semipdp;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class SemiPdpState implements af {
    private final CartEntry cartEntry;
    private final List<Object> contentList;
    private final boolean dismissPage;
    private final boolean isFullScreen;
    private final Integer pdpState;
    private final int productState;
    private final int scrollOffset;

    static {
        Covode.recordClassIndex(54746);
    }

    public SemiPdpState() {
        this(false, null, false, 0, null, 0, null, 127, null);
    }

    public static int com_ss_android_ugc_aweme_ecommerce_semipdp_SemiPdpState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SemiPdpState copy$default(SemiPdpState semiPdpState, boolean z, List list, boolean z2, int i2, Integer num, int i3, CartEntry cartEntry2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = semiPdpState.dismissPage;
        }
        if ((i4 & 2) != 0) {
            list = semiPdpState.contentList;
        }
        if ((i4 & 4) != 0) {
            z2 = semiPdpState.isFullScreen;
        }
        if ((i4 & 8) != 0) {
            i2 = semiPdpState.scrollOffset;
        }
        if ((i4 & 16) != 0) {
            num = semiPdpState.pdpState;
        }
        if ((i4 & 32) != 0) {
            i3 = semiPdpState.productState;
        }
        if ((i4 & 64) != 0) {
            cartEntry2 = semiPdpState.cartEntry;
        }
        return semiPdpState.copy(z, list, z2, i2, num, i3, cartEntry2);
    }

    public final boolean component1() {
        return this.dismissPage;
    }

    public final List<Object> component2() {
        return this.contentList;
    }

    public final boolean component3() {
        return this.isFullScreen;
    }

    public final int component4() {
        return this.scrollOffset;
    }

    public final Integer component5() {
        return this.pdpState;
    }

    public final int component6() {
        return this.productState;
    }

    public final CartEntry component7() {
        return this.cartEntry;
    }

    public final SemiPdpState copy(boolean z, List<? extends Object> list, boolean z2, int i2, Integer num, int i3, CartEntry cartEntry2) {
        l.d(list, "");
        return new SemiPdpState(z, list, z2, i2, num, i3, cartEntry2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemiPdpState)) {
            return false;
        }
        SemiPdpState semiPdpState = (SemiPdpState) obj;
        return this.dismissPage == semiPdpState.dismissPage && l.a(this.contentList, semiPdpState.contentList) && this.isFullScreen == semiPdpState.isFullScreen && this.scrollOffset == semiPdpState.scrollOffset && l.a(this.pdpState, semiPdpState.pdpState) && this.productState == semiPdpState.productState && l.a(this.cartEntry, semiPdpState.cartEntry);
    }

    public final int hashCode() {
        boolean z = this.dismissPage;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        List<Object> list = this.contentList;
        int i7 = 0;
        int hashCode = (i6 + (list != null ? list.hashCode() : 0)) * 31;
        if (!this.isFullScreen) {
            i2 = 0;
        }
        int com_ss_android_ugc_aweme_ecommerce_semipdp_SemiPdpState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((hashCode + i2) * 31) + com_ss_android_ugc_aweme_ecommerce_semipdp_SemiPdpState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.scrollOffset)) * 31;
        Integer num = this.pdpState;
        int hashCode2 = (((com_ss_android_ugc_aweme_ecommerce_semipdp_SemiPdpState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (num != null ? num.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_ecommerce_semipdp_SemiPdpState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.productState)) * 31;
        CartEntry cartEntry2 = this.cartEntry;
        if (cartEntry2 != null) {
            i7 = cartEntry2.hashCode();
        }
        return hashCode2 + i7;
    }

    public final String toString() {
        return "SemiPdpState(dismissPage=" + this.dismissPage + ", contentList=" + this.contentList + ", isFullScreen=" + this.isFullScreen + ", scrollOffset=" + this.scrollOffset + ", pdpState=" + this.pdpState + ", productState=" + this.productState + ", cartEntry=" + this.cartEntry + ")";
    }

    public final CartEntry getCartEntry() {
        return this.cartEntry;
    }

    public final List<Object> getContentList() {
        return this.contentList;
    }

    public final boolean getDismissPage() {
        return this.dismissPage;
    }

    public final Integer getPdpState() {
        return this.pdpState;
    }

    public final int getProductState() {
        return this.productState;
    }

    public final int getScrollOffset() {
        return this.scrollOffset;
    }

    public final boolean isFullScreen() {
        return this.isFullScreen;
    }

    public SemiPdpState(boolean z, List<? extends Object> list, boolean z2, int i2, Integer num, int i3, CartEntry cartEntry2) {
        l.d(list, "");
        this.dismissPage = z;
        this.contentList = list;
        this.isFullScreen = z2;
        this.scrollOffset = i2;
        this.pdpState = num;
        this.productState = i3;
        this.cartEntry = cartEntry2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SemiPdpState(boolean z, List list, boolean z2, int i2, Integer num, int i3, CartEntry cartEntry2, int i4, g gVar) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? z.INSTANCE : list, (i4 & 4) != 0 ? false : z2, (i4 & 8) == 0 ? i2 : 0, (i4 & 16) != 0 ? null : num, (i4 & 32) != 0 ? 1 : i3, (i4 & 64) == 0 ? cartEntry2 : null);
    }
}
