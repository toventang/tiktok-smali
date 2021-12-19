package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import h.f.a.a;
import h.f.b.g;
import h.f.b.l;
import h.z;

public final class AnchorPublishStruct {
    public static final Companion Companion = new Companion(null);
    @c(a = "added_icon")
    public final UrlModel addedIcon;
    @c(a = "anchor_tips")
    public String anchorTips;
    @c(a = "content")
    public final String content;
    @c(a = "desc")
    public final String desc;
    public transient boolean enable;
    public transient ExtensionMisc extensionMisc;
    public transient boolean hadNew;
    @c(a = "hashtag")
    public final String hashtag;
    @c(a = "icon")
    public final UrlModel icon;
    @c(a = "is_beta")
    public final boolean isBeta;
    @c(a = "is_new")
    public boolean isNew;
    @c(a = "is_recommend")
    public boolean isRecommend;
    @c(a = "log_extra")
    public final String logExtra;
    public transient a<z> onClickAction;
    @c(a = "schema_url")
    public final String scheme;
    @c(a = "scope")
    public final int scope;
    @c(a = "subtitle")
    public final String subtitle;
    @c(a = "subtype")
    public final String subtype;
    @c(a = "title")
    public final String title;
    @c(a = StringSet.type)
    public final int type;
    @c(a = "web_url")
    public final String webUrl;

    static {
        Covode.recordClassIndex(84408);
    }

    public static int com_ss_android_ugc_aweme_shortvideo_model_AnchorPublishStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ AnchorPublishStruct copy$default(AnchorPublishStruct anchorPublishStruct, int i2, UrlModel urlModel, String str, String str2, UrlModel urlModel2, String str3, String str4, boolean z, boolean z2, String str5, String str6, int i3, a aVar, ExtensionMisc extensionMisc2, boolean z3, String str7, String str8, boolean z4, String str9, String str10, boolean z5, int i4, Object obj) {
        String str11 = str3;
        UrlModel urlModel3 = urlModel2;
        int i5 = i2;
        UrlModel urlModel4 = urlModel;
        String str12 = str;
        String str13 = str2;
        ExtensionMisc extensionMisc3 = extensionMisc2;
        a aVar2 = aVar;
        int i6 = i3;
        String str14 = str6;
        String str15 = str4;
        boolean z6 = z;
        boolean z7 = z2;
        String str16 = str5;
        String str17 = str10;
        String str18 = str9;
        boolean z8 = z3;
        String str19 = str7;
        String str20 = str8;
        boolean z9 = z5;
        boolean z10 = z4;
        if ((i4 & 1) != 0) {
            i5 = anchorPublishStruct.type;
        }
        if ((i4 & 2) != 0) {
            urlModel4 = anchorPublishStruct.icon;
        }
        if ((i4 & 4) != 0) {
            str12 = anchorPublishStruct.title;
        }
        if ((i4 & 8) != 0) {
            str13 = anchorPublishStruct.webUrl;
        }
        if ((i4 & 16) != 0) {
            urlModel3 = anchorPublishStruct.addedIcon;
        }
        if ((i4 & 32) != 0) {
            str11 = anchorPublishStruct.desc;
        }
        if ((i4 & 64) != 0) {
            str15 = anchorPublishStruct.content;
        }
        if ((i4 & 128) != 0) {
            z6 = anchorPublishStruct.isRecommend;
        }
        if ((i4 & 256) != 0) {
            z7 = anchorPublishStruct.isBeta;
        }
        if ((i4 & 512) != 0) {
            str16 = anchorPublishStruct.hashtag;
        }
        if ((i4 & 1024) != 0) {
            str14 = anchorPublishStruct.anchorTips;
        }
        if ((i4 & 2048) != 0) {
            i6 = anchorPublishStruct.scope;
        }
        if ((i4 & 4096) != 0) {
            aVar2 = anchorPublishStruct.onClickAction;
        }
        if ((i4 & 8192) != 0) {
            extensionMisc3 = anchorPublishStruct.extensionMisc;
        }
        if ((i4 & 16384) != 0) {
            z8 = anchorPublishStruct.enable;
        }
        if ((32768 & i4) != 0) {
            str19 = anchorPublishStruct.scheme;
        }
        if ((65536 & i4) != 0) {
            str20 = anchorPublishStruct.logExtra;
        }
        if ((131072 & i4) != 0) {
            z10 = anchorPublishStruct.isNew;
        }
        if ((262144 & i4) != 0) {
            str18 = anchorPublishStruct.subtitle;
        }
        if ((524288 & i4) != 0) {
            str17 = anchorPublishStruct.subtype;
        }
        if ((i4 & 1048576) != 0) {
            z9 = anchorPublishStruct.hadNew;
        }
        return anchorPublishStruct.copy(i5, urlModel4, str12, str13, urlModel3, str11, str15, z6, z7, str16, str14, i6, aVar2, extensionMisc3, z8, str19, str20, z10, str18, str17, z9);
    }

    public final AnchorPublishStruct copy(int i2, UrlModel urlModel, String str, String str2, UrlModel urlModel2, String str3, String str4, boolean z, boolean z2, String str5, String str6, int i3, a<z> aVar, ExtensionMisc extensionMisc2, boolean z3, String str7, String str8, boolean z4, String str9, String str10, boolean z5) {
        l.d(urlModel, "");
        l.d(str, "");
        l.d(urlModel2, "");
        l.d(aVar, "");
        l.d(extensionMisc2, "");
        return new AnchorPublishStruct(i2, urlModel, str, str2, urlModel2, str3, str4, z, z2, str5, str6, i3, aVar, extensionMisc2, z3, str7, str8, z4, str9, str10, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorPublishStruct)) {
            return false;
        }
        AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) obj;
        return this.type == anchorPublishStruct.type && l.a(this.icon, anchorPublishStruct.icon) && l.a(this.title, anchorPublishStruct.title) && l.a(this.webUrl, anchorPublishStruct.webUrl) && l.a(this.addedIcon, anchorPublishStruct.addedIcon) && l.a(this.desc, anchorPublishStruct.desc) && l.a(this.content, anchorPublishStruct.content) && this.isRecommend == anchorPublishStruct.isRecommend && this.isBeta == anchorPublishStruct.isBeta && l.a(this.hashtag, anchorPublishStruct.hashtag) && l.a(this.anchorTips, anchorPublishStruct.anchorTips) && this.scope == anchorPublishStruct.scope && l.a(this.onClickAction, anchorPublishStruct.onClickAction) && l.a(this.extensionMisc, anchorPublishStruct.extensionMisc) && this.enable == anchorPublishStruct.enable && l.a(this.scheme, anchorPublishStruct.scheme) && l.a(this.logExtra, anchorPublishStruct.logExtra) && this.isNew == anchorPublishStruct.isNew && l.a(this.subtitle, anchorPublishStruct.subtitle) && l.a(this.subtype, anchorPublishStruct.subtype) && this.hadNew == anchorPublishStruct.hadNew;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_shortvideo_model_AnchorPublishStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_shortvideo_model_AnchorPublishStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.type) * 31;
        UrlModel urlModel = this.icon;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_shortvideo_model_AnchorPublishStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.webUrl;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel2 = this.addedIcon;
        int hashCode4 = (hashCode3 + (urlModel2 != null ? urlModel2.hashCode() : 0)) * 31;
        String str3 = this.desc;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.content;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.isRecommend;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode6 + i4) * 31;
        boolean z2 = this.isBeta;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        String str5 = this.hashtag;
        int hashCode7 = (i11 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.anchorTips;
        int hashCode8 = (((hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_shortvideo_model_AnchorPublishStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.scope)) * 31;
        a<z> aVar = this.onClickAction;
        int hashCode9 = (hashCode8 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        ExtensionMisc extensionMisc2 = this.extensionMisc;
        int hashCode10 = (hashCode9 + (extensionMisc2 != null ? extensionMisc2.hashCode() : 0)) * 31;
        boolean z3 = this.enable;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (hashCode10 + i12) * 31;
        String str7 = this.scheme;
        int hashCode11 = (i15 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.logExtra;
        int hashCode12 = (hashCode11 + (str8 != null ? str8.hashCode() : 0)) * 31;
        boolean z4 = this.isNew;
        if (z4) {
            z4 = true;
        }
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = z4 ? 1 : 0;
        int i19 = (hashCode12 + i16) * 31;
        String str9 = this.subtitle;
        int hashCode13 = (i19 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.subtype;
        if (str10 != null) {
            i2 = str10.hashCode();
        }
        int i20 = (hashCode13 + i2) * 31;
        if (!this.hadNew) {
            i3 = 0;
        }
        return i20 + i3;
    }

    public final String toString() {
        return "AnchorPublishStruct(type=" + this.type + ", icon=" + this.icon + ", title=" + this.title + ", webUrl=" + this.webUrl + ", addedIcon=" + this.addedIcon + ", desc=" + this.desc + ", content=" + this.content + ", isRecommend=" + this.isRecommend + ", isBeta=" + this.isBeta + ", hashtag=" + this.hashtag + ", anchorTips=" + this.anchorTips + ", scope=" + this.scope + ", onClickAction=" + this.onClickAction + ", extensionMisc=" + this.extensionMisc + ", enable=" + this.enable + ", scheme=" + this.scheme + ", logExtra=" + this.logExtra + ", isNew=" + this.isNew + ", subtitle=" + this.subtitle + ", subtype=" + this.subtype + ", hadNew=" + this.hadNew + ")";
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(84409);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final void setExtensionMisc(ExtensionMisc extensionMisc2) {
        l.d(extensionMisc2, "");
        this.extensionMisc = extensionMisc2;
    }

    public final void setOnClickAction(a<z> aVar) {
        l.d(aVar, "");
        this.onClickAction = aVar;
    }

    public AnchorPublishStruct(int i2, UrlModel urlModel, String str, String str2, UrlModel urlModel2, String str3, String str4, boolean z, boolean z2, String str5, String str6, int i3, a<z> aVar, ExtensionMisc extensionMisc2, boolean z3, String str7, String str8, boolean z4, String str9, String str10, boolean z5) {
        l.d(urlModel, "");
        l.d(str, "");
        l.d(urlModel2, "");
        l.d(aVar, "");
        l.d(extensionMisc2, "");
        this.type = i2;
        this.icon = urlModel;
        this.title = str;
        this.webUrl = str2;
        this.addedIcon = urlModel2;
        this.desc = str3;
        this.content = str4;
        this.isRecommend = z;
        this.isBeta = z2;
        this.hashtag = str5;
        this.anchorTips = str6;
        this.scope = i3;
        this.onClickAction = aVar;
        this.extensionMisc = extensionMisc2;
        this.enable = z3;
        this.scheme = str7;
        this.logExtra = str8;
        this.isNew = z4;
        this.subtitle = str9;
        this.subtype = str10;
        this.hadNew = z5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnchorPublishStruct(int r23, com.ss.android.ugc.aweme.base.model.UrlModel r24, java.lang.String r25, java.lang.String r26, com.ss.android.ugc.aweme.base.model.UrlModel r27, java.lang.String r28, java.lang.String r29, boolean r30, boolean r31, java.lang.String r32, java.lang.String r33, int r34, h.f.a.a r35, com.ss.android.ugc.aweme.services.publish.ExtensionMisc r36, boolean r37, java.lang.String r38, java.lang.String r39, boolean r40, java.lang.String r41, java.lang.String r42, boolean r43, int r44, h.f.b.g r45) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct.<init>(int, com.ss.android.ugc.aweme.base.model.UrlModel, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.base.model.UrlModel, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, int, h.f.a.a, com.ss.android.ugc.aweme.services.publish.ExtensionMisc, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, int, h.f.b.g):void");
    }
}
