package com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.vo;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.f;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.h;
import com.ss.android.ugc.aweme.ecommercelive.business.common.a.b;
import com.ss.android.ugc.aweme.ecommercelive.business.common.a.e;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;

public final class PopupCardVO {
    public static final a Companion = new a((byte) 0);
    private int bagIndex;
    private final a flashSaleInfo;
    private final String formatAvailablePrice;
    private final String formatOriginPrice;
    private final String fromMessageId;
    private final String imageUrl;
    private final String imageUrlKey;
    private final boolean isFromMessage;
    private final String openUrl;
    private final int platform;
    private final String price;
    private final long productId;
    private final int productStatus;
    private final List<h> promotionLogos;
    private e promotionSkin;
    private final PromotionView promotionView;
    private final String schema;
    private final String source;
    private final int sourceFrom;
    private final b sourceMessage;
    private final String title;

    static {
        Covode.recordClassIndex(55297);
    }

    public static int com_ss_android_ugc_aweme_ecommercelive_business_audience_popcard_vo_PopupCardVO_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_ecommercelive_business_audience_popcard_vo_PopupCardVO_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ PopupCardVO copy$default(PopupCardVO popupCardVO, String str, String str2, String str3, String str4, int i2, String str5, int i3, int i4, boolean z, b bVar, String str6, String str7, long j2, String str8, String str9, String str10, a aVar, List list, e eVar, PromotionView promotionView2, int i5, int i6, Object obj) {
        int i7 = i2;
        String str11 = str;
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        long j3 = j2;
        String str15 = str7;
        String str16 = str6;
        b bVar2 = bVar;
        String str17 = str5;
        int i8 = i3;
        int i9 = i4;
        boolean z2 = z;
        e eVar2 = eVar;
        int i10 = i5;
        List list2 = list;
        PromotionView promotionView3 = promotionView2;
        String str18 = str8;
        a aVar2 = aVar;
        String str19 = str9;
        String str20 = str10;
        if ((i6 & 1) != 0) {
            str11 = popupCardVO.title;
        }
        if ((i6 & 2) != 0) {
            str12 = popupCardVO.price;
        }
        if ((i6 & 4) != 0) {
            str13 = popupCardVO.openUrl;
        }
        if ((i6 & 8) != 0) {
            str14 = popupCardVO.source;
        }
        if ((i6 & 16) != 0) {
            i7 = popupCardVO.sourceFrom;
        }
        if ((i6 & 32) != 0) {
            str17 = popupCardVO.schema;
        }
        if ((i6 & 64) != 0) {
            i8 = popupCardVO.platform;
        }
        if ((i6 & 128) != 0) {
            i9 = popupCardVO.productStatus;
        }
        if ((i6 & 256) != 0) {
            z2 = popupCardVO.isFromMessage;
        }
        if ((i6 & 512) != 0) {
            bVar2 = popupCardVO.sourceMessage;
        }
        if ((i6 & 1024) != 0) {
            str16 = popupCardVO.imageUrl;
        }
        if ((i6 & 2048) != 0) {
            str15 = popupCardVO.imageUrlKey;
        }
        if ((i6 & 4096) != 0) {
            j3 = popupCardVO.productId;
        }
        if ((i6 & 8192) != 0) {
            str18 = popupCardVO.fromMessageId;
        }
        if ((i6 & 16384) != 0) {
            str19 = popupCardVO.formatOriginPrice;
        }
        if ((32768 & i6) != 0) {
            str20 = popupCardVO.formatAvailablePrice;
        }
        if ((65536 & i6) != 0) {
            aVar2 = popupCardVO.flashSaleInfo;
        }
        if ((131072 & i6) != 0) {
            list2 = popupCardVO.promotionLogos;
        }
        if ((262144 & i6) != 0) {
            eVar2 = popupCardVO.promotionSkin;
        }
        if ((524288 & i6) != 0) {
            promotionView3 = popupCardVO.promotionView;
        }
        if ((i6 & 1048576) != 0) {
            i10 = popupCardVO.bagIndex;
        }
        return popupCardVO.copy(str11, str12, str13, str14, i7, str17, i8, i9, z2, bVar2, str16, str15, j3, str18, str19, str20, aVar2, list2, eVar2, promotionView3, i10);
    }

    public final String component1() {
        return this.title;
    }

    public final b component10() {
        return this.sourceMessage;
    }

    public final String component11() {
        return this.imageUrl;
    }

    public final String component12() {
        return this.imageUrlKey;
    }

    public final long component13() {
        return this.productId;
    }

    public final String component14() {
        return this.fromMessageId;
    }

    public final String component15() {
        return this.formatOriginPrice;
    }

    public final String component16() {
        return this.formatAvailablePrice;
    }

    public final a component17() {
        return this.flashSaleInfo;
    }

    public final List<h> component18() {
        return this.promotionLogos;
    }

    public final e component19() {
        return this.promotionSkin;
    }

    public final String component2() {
        return this.price;
    }

    public final PromotionView component20() {
        return this.promotionView;
    }

    public final int component21() {
        return this.bagIndex;
    }

    public final String component3() {
        return this.openUrl;
    }

    public final String component4() {
        return this.source;
    }

    public final int component5() {
        return this.sourceFrom;
    }

    public final String component6() {
        return this.schema;
    }

    public final int component7() {
        return this.platform;
    }

    public final int component8() {
        return this.productStatus;
    }

    public final boolean component9() {
        return this.isFromMessage;
    }

    public final PopupCardVO copy(String str, String str2, String str3, String str4, int i2, String str5, int i3, int i4, boolean z, b bVar, String str6, String str7, long j2, String str8, String str9, String str10, a aVar, List<h> list, e eVar, PromotionView promotionView2, int i5) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        l.d(str7, "");
        return new PopupCardVO(str, str2, str3, str4, i2, str5, i3, i4, z, bVar, str6, str7, j2, str8, str9, str10, aVar, list, eVar, promotionView2, i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupCardVO)) {
            return false;
        }
        PopupCardVO popupCardVO = (PopupCardVO) obj;
        return l.a(this.title, popupCardVO.title) && l.a(this.price, popupCardVO.price) && l.a(this.openUrl, popupCardVO.openUrl) && l.a(this.source, popupCardVO.source) && this.sourceFrom == popupCardVO.sourceFrom && l.a(this.schema, popupCardVO.schema) && this.platform == popupCardVO.platform && this.productStatus == popupCardVO.productStatus && this.isFromMessage == popupCardVO.isFromMessage && l.a(this.sourceMessage, popupCardVO.sourceMessage) && l.a(this.imageUrl, popupCardVO.imageUrl) && l.a(this.imageUrlKey, popupCardVO.imageUrlKey) && this.productId == popupCardVO.productId && l.a(this.fromMessageId, popupCardVO.fromMessageId) && l.a(this.formatOriginPrice, popupCardVO.formatOriginPrice) && l.a(this.formatAvailablePrice, popupCardVO.formatAvailablePrice) && l.a(this.flashSaleInfo, popupCardVO.flashSaleInfo) && l.a(this.promotionLogos, popupCardVO.promotionLogos) && l.a(this.promotionSkin, popupCardVO.promotionSkin) && l.a(this.promotionView, popupCardVO.promotionView) && this.bagIndex == popupCardVO.bagIndex;
    }

    public final int hashCode() {
        String str = this.title;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.price;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.openUrl;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.source;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_ecommercelive_business_audience_popcard_vo_PopupCardVO_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.sourceFrom)) * 31;
        String str5 = this.schema;
        int hashCode5 = (((((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_ecommercelive_business_audience_popcard_vo_PopupCardVO_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.platform)) * 31) + com_ss_android_ugc_aweme_ecommercelive_business_audience_popcard_vo_PopupCardVO_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.productStatus)) * 31;
        boolean z = this.isFromMessage;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode5 + i3) * 31;
        b bVar = this.sourceMessage;
        int hashCode6 = (i6 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str6 = this.imageUrl;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.imageUrlKey;
        int hashCode8 = (((hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_ecommercelive_business_audience_popcard_vo_PopupCardVO_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.productId)) * 31;
        String str8 = this.fromMessageId;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.formatOriginPrice;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.formatAvailablePrice;
        int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31;
        a aVar = this.flashSaleInfo;
        int hashCode12 = (hashCode11 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        List<h> list = this.promotionLogos;
        int hashCode13 = (hashCode12 + (list != null ? list.hashCode() : 0)) * 31;
        e eVar = this.promotionSkin;
        int hashCode14 = (hashCode13 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        PromotionView promotionView2 = this.promotionView;
        if (promotionView2 != null) {
            i2 = promotionView2.hashCode();
        }
        return ((hashCode14 + i2) * 31) + com_ss_android_ugc_aweme_ecommercelive_business_audience_popcard_vo_PopupCardVO_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.bagIndex);
    }

    public final String toString() {
        return "PopupCardVO(title=" + this.title + ", price=" + this.price + ", openUrl=" + this.openUrl + ", source=" + this.source + ", sourceFrom=" + this.sourceFrom + ", schema=" + this.schema + ", platform=" + this.platform + ", productStatus=" + this.productStatus + ", isFromMessage=" + this.isFromMessage + ", sourceMessage=" + this.sourceMessage + ", imageUrl=" + this.imageUrl + ", imageUrlKey=" + this.imageUrlKey + ", productId=" + this.productId + ", fromMessageId=" + this.fromMessageId + ", formatOriginPrice=" + this.formatOriginPrice + ", formatAvailablePrice=" + this.formatAvailablePrice + ", flashSaleInfo=" + this.flashSaleInfo + ", promotionLogos=" + this.promotionLogos + ", promotionSkin=" + this.promotionSkin + ", promotionView=" + this.promotionView + ", bagIndex=" + this.bagIndex + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55298);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static PopupCardVO a(com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.a aVar) {
            long j2;
            String str;
            String str2;
            com.ss.android.ugc.aweme.ecommercelive.framework.a.a.a aVar2;
            a aVar3;
            String str3 = "";
            l.d(aVar, str3);
            try {
                j2 = Long.parseLong(aVar.f87748a);
            } catch (Throwable unused) {
                j2 = 0;
            }
            String str4 = aVar.f87749b;
            String str5 = aVar.f87759l;
            String str6 = aVar.f87753f;
            String str7 = aVar.n;
            int i2 = aVar.p;
            String str8 = aVar.o;
            int i3 = aVar.f87758k;
            int i4 = aVar.f87754g;
            if (aVar.f87757j == null || !(!aVar.f87757j.isEmpty())) {
                com.ss.android.ugc.aweme.ecommercelive.framework.a.a.a aVar4 = aVar.f87750c;
                if (aVar4 == null || (str = aVar4.f88007d) == null) {
                    str = str3;
                }
            } else {
                str = aVar.f87757j.get(0).f88007d;
            }
            if (aVar.f87757j == null || !(!aVar.f87757j.isEmpty()) ? !((aVar2 = aVar.f87750c) == null || (str2 = aVar2.f88008e) == null) : (str2 = aVar.f87757j.get(0).f88008e) != null) {
                str3 = str2;
            }
            String str9 = aVar.q;
            String str10 = aVar.r;
            f fVar = aVar.t;
            if (fVar != null) {
                aVar3 = new a(fVar.f87775a, fVar.f87776b);
            } else {
                aVar3 = null;
            }
            return new PopupCardVO(str4, str5, str6, str7, i2, str8, i3, i4, false, null, str, str3, j2, null, str9, str10, aVar3, aVar.u, null, aVar.v, 0, 1048576, null);
        }
    }

    public final int getBagIndex() {
        return this.bagIndex;
    }

    public final a getFlashSaleInfo() {
        return this.flashSaleInfo;
    }

    public final String getFormatAvailablePrice() {
        return this.formatAvailablePrice;
    }

    public final String getFormatOriginPrice() {
        return this.formatOriginPrice;
    }

    public final String getFromMessageId() {
        return this.fromMessageId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getImageUrlKey() {
        return this.imageUrlKey;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final int getPlatform() {
        return this.platform;
    }

    public final String getPrice() {
        return this.price;
    }

    public final long getProductId() {
        return this.productId;
    }

    public final int getProductStatus() {
        return this.productStatus;
    }

    public final List<h> getPromotionLogos() {
        return this.promotionLogos;
    }

    public final e getPromotionSkin() {
        return this.promotionSkin;
    }

    public final PromotionView getPromotionView() {
        return this.promotionView;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getSource() {
        return this.source;
    }

    public final int getSourceFrom() {
        return this.sourceFrom;
    }

    public final b getSourceMessage() {
        return this.sourceMessage;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isFromMessage() {
        return this.isFromMessage;
    }

    public final boolean isInStock() {
        if (this.productStatus == 90) {
            return true;
        }
        return false;
    }

    public final boolean isSoldOut() {
        if (this.productStatus == 80) {
            return true;
        }
        return false;
    }

    public final String getPromotionLogoLog() {
        boolean z;
        List<h> list = this.promotionLogos;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = this.promotionLogos.iterator();
        while (it.hasNext()) {
            sb.append(it.next().f87779b);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    public final void setBagIndex(int i2) {
        this.bagIndex = i2;
    }

    public final void setPromotionSkin(e eVar) {
        this.promotionSkin = eVar;
    }

    public PopupCardVO(String str, String str2, String str3, String str4, int i2, String str5, int i3, int i4, boolean z, b bVar, String str6, String str7, long j2, String str8, String str9, String str10, a aVar, List<h> list, e eVar, PromotionView promotionView2, int i5) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        l.d(str7, "");
        this.title = str;
        this.price = str2;
        this.openUrl = str3;
        this.source = str4;
        this.sourceFrom = i2;
        this.schema = str5;
        this.platform = i3;
        this.productStatus = i4;
        this.isFromMessage = z;
        this.sourceMessage = bVar;
        this.imageUrl = str6;
        this.imageUrlKey = str7;
        this.productId = j2;
        this.fromMessageId = str8;
        this.formatOriginPrice = str9;
        this.formatAvailablePrice = str10;
        this.flashSaleInfo = aVar;
        this.promotionLogos = list;
        this.promotionSkin = eVar;
        this.promotionView = promotionView2;
        this.bagIndex = i5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PopupCardVO(java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, int r28, java.lang.String r29, int r30, int r31, boolean r32, com.ss.android.ugc.aweme.ecommercelive.business.common.a.b r33, java.lang.String r34, java.lang.String r35, long r36, java.lang.String r38, java.lang.String r39, java.lang.String r40, com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.vo.a r41, java.util.List r42, com.ss.android.ugc.aweme.ecommercelive.business.common.a.e r43, com.ss.android.ugc.aweme.ecommercebase.dto.PromotionView r44, int r45, int r46, h.f.b.g r47) {
        /*
            r23 = this;
            r22 = r45
            r11 = r34
            r1 = r46
            r0 = r1 & 1024(0x400, float:1.435E-42)
            java.lang.String r12 = ""
            if (r0 == 0) goto L_0x000d
            r11 = r12
        L_0x000d:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0043
        L_0x0011:
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0019
            r0 = 0
            r22 = 0
        L_0x0019:
            r0 = r23
            r10 = r33
            r9 = r32
            r8 = r31
            r7 = r30
            r6 = r29
            r5 = r28
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r13 = r36
            r21 = r44
            r20 = r43
            r19 = r42
            r18 = r41
            r17 = r40
            r16 = r39
            r15 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        L_0x0043:
            r12 = r35
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.vo.PopupCardVO.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, int, boolean, com.ss.android.ugc.aweme.ecommercelive.business.common.a.b, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.vo.a, java.util.List, com.ss.android.ugc.aweme.ecommercelive.business.common.a.e, com.ss.android.ugc.aweme.ecommercebase.dto.PromotionView, int, int, h.f.b.g):void");
    }
}
