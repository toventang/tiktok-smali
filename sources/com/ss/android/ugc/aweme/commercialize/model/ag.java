package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class ag implements Serializable {
    @c(a = "android_page_data_hash")
    private final String androidPageDataHash;
    @c(a = "animation_type")
    private final String animationType;
    @c(a = "flutter_version")
    private final int flutterVersion;
    @c(a = "gecko_channel")
    private final List<String> geckoChannel;
    @c(a = "is_support_native_animation")
    private final boolean isSupportNativeAnimation;
    @c(a = "lynx_landing_style")
    private final int lynxLandingStyle;
    @c(a = "lynx_scheme")
    private final String lynxScheme;
    @c(a = "page_data_backup_url")
    private final String pageDataBackupUrl;
    @c(a = "page_data_url")
    private final String pageDataUrl;
    @c(a = "preload_net_type")
    private final int preloadNetType;
    @c(a = "render_type")
    private final String renderType;
    @c(a = "second_page_gecko_channel")
    private final List<String> secondPageGeckoChannel;
    @c(a = "site_type")
    private final String siteType;

    static {
        Covode.recordClassIndex(46153);
    }

    public static int com_ss_android_ugc_aweme_commercialize_model_NativeSiteConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commercialize.model.ag */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ag copy$default(ag agVar, String str, int i2, String str2, String str3, int i3, String str4, boolean z, String str5, List list, List list2, String str6, String str7, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = agVar.renderType;
        }
        if ((i5 & 2) != 0) {
            i2 = agVar.flutterVersion;
        }
        if ((i5 & 4) != 0) {
            str2 = agVar.pageDataUrl;
        }
        if ((i5 & 8) != 0) {
            str3 = agVar.pageDataBackupUrl;
        }
        if ((i5 & 16) != 0) {
            i3 = agVar.preloadNetType;
        }
        if ((i5 & 32) != 0) {
            str4 = agVar.androidPageDataHash;
        }
        if ((i5 & 64) != 0) {
            z = agVar.isSupportNativeAnimation;
        }
        if ((i5 & 128) != 0) {
            str5 = agVar.animationType;
        }
        if ((i5 & 256) != 0) {
            list = agVar.geckoChannel;
        }
        if ((i5 & 512) != 0) {
            list2 = agVar.secondPageGeckoChannel;
        }
        if ((i5 & 1024) != 0) {
            str6 = agVar.siteType;
        }
        if ((i5 & 2048) != 0) {
            str7 = agVar.lynxScheme;
        }
        if ((i5 & 4096) != 0) {
            i4 = agVar.lynxLandingStyle;
        }
        return agVar.copy(str, i2, str2, str3, i3, str4, z, str5, list, list2, str6, str7, i4);
    }

    public final String component1() {
        return this.renderType;
    }

    public final List<String> component10() {
        return this.secondPageGeckoChannel;
    }

    public final String component11() {
        return this.siteType;
    }

    public final String component12() {
        return this.lynxScheme;
    }

    public final int component13() {
        return this.lynxLandingStyle;
    }

    public final int component2() {
        return this.flutterVersion;
    }

    public final String component3() {
        return this.pageDataUrl;
    }

    public final String component4() {
        return this.pageDataBackupUrl;
    }

    public final int component5() {
        return this.preloadNetType;
    }

    public final String component6() {
        return this.androidPageDataHash;
    }

    public final boolean component7() {
        return this.isSupportNativeAnimation;
    }

    public final String component8() {
        return this.animationType;
    }

    public final List<String> component9() {
        return this.geckoChannel;
    }

    public final ag copy(String str, int i2, String str2, String str3, int i3, String str4, boolean z, String str5, List<String> list, List<String> list2, String str6, String str7, int i4) {
        return new ag(str, i2, str2, str3, i3, str4, z, str5, list, list2, str6, str7, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        return l.a(this.renderType, agVar.renderType) && this.flutterVersion == agVar.flutterVersion && l.a(this.pageDataUrl, agVar.pageDataUrl) && l.a(this.pageDataBackupUrl, agVar.pageDataBackupUrl) && this.preloadNetType == agVar.preloadNetType && l.a(this.androidPageDataHash, agVar.androidPageDataHash) && this.isSupportNativeAnimation == agVar.isSupportNativeAnimation && l.a(this.animationType, agVar.animationType) && l.a(this.geckoChannel, agVar.geckoChannel) && l.a(this.secondPageGeckoChannel, agVar.secondPageGeckoChannel) && l.a(this.siteType, agVar.siteType) && l.a(this.lynxScheme, agVar.lynxScheme) && this.lynxLandingStyle == agVar.lynxLandingStyle;
    }

    public final int hashCode() {
        String str = this.renderType;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_commercialize_model_NativeSiteConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.flutterVersion)) * 31;
        String str2 = this.pageDataUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.pageDataBackupUrl;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_commercialize_model_NativeSiteConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.preloadNetType)) * 31;
        String str4 = this.androidPageDataHash;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.isSupportNativeAnimation;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode4 + i3) * 31;
        String str5 = this.animationType;
        int hashCode5 = (i6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<String> list = this.geckoChannel;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.secondPageGeckoChannel;
        int hashCode7 = (hashCode6 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str6 = this.siteType;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.lynxScheme;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        return ((hashCode8 + i2) * 31) + com_ss_android_ugc_aweme_commercialize_model_NativeSiteConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.lynxLandingStyle);
    }

    public final String toString() {
        return "NativeSiteConfig(renderType=" + this.renderType + ", flutterVersion=" + this.flutterVersion + ", pageDataUrl=" + this.pageDataUrl + ", pageDataBackupUrl=" + this.pageDataBackupUrl + ", preloadNetType=" + this.preloadNetType + ", androidPageDataHash=" + this.androidPageDataHash + ", isSupportNativeAnimation=" + this.isSupportNativeAnimation + ", animationType=" + this.animationType + ", geckoChannel=" + this.geckoChannel + ", secondPageGeckoChannel=" + this.secondPageGeckoChannel + ", siteType=" + this.siteType + ", lynxScheme=" + this.lynxScheme + ", lynxLandingStyle=" + this.lynxLandingStyle + ")";
    }

    public final String getAndroidPageDataHash() {
        return this.androidPageDataHash;
    }

    public final String getAnimationType() {
        return this.animationType;
    }

    public final int getFlutterVersion() {
        return this.flutterVersion;
    }

    public final List<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public final int getLynxLandingStyle() {
        return this.lynxLandingStyle;
    }

    public final String getLynxScheme() {
        return this.lynxScheme;
    }

    public final String getPageDataBackupUrl() {
        return this.pageDataBackupUrl;
    }

    public final String getPageDataUrl() {
        return this.pageDataUrl;
    }

    public final int getPreloadNetType() {
        return this.preloadNetType;
    }

    public final String getRenderType() {
        return this.renderType;
    }

    public final List<String> getSecondPageGeckoChannel() {
        return this.secondPageGeckoChannel;
    }

    public final String getSiteType() {
        return this.siteType;
    }

    public final boolean isSupportNativeAnimation() {
        return this.isSupportNativeAnimation;
    }

    public ag(String str, int i2, String str2, String str3, int i3, String str4, boolean z, String str5, List<String> list, List<String> list2, String str6, String str7, int i4) {
        this.renderType = str;
        this.flutterVersion = i2;
        this.pageDataUrl = str2;
        this.pageDataBackupUrl = str3;
        this.preloadNetType = i3;
        this.androidPageDataHash = str4;
        this.isSupportNativeAnimation = z;
        this.animationType = str5;
        this.geckoChannel = list;
        this.secondPageGeckoChannel = list2;
        this.siteType = str6;
        this.lynxScheme = str7;
        this.lynxLandingStyle = i4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ag(String str, int i2, String str2, String str3, int i3, String str4, boolean z, String str5, List list, List list2, String str6, String str7, int i4, int i5, g gVar) {
        this(str, (i5 & 2) != 0 ? 0 : i2, str2, str3, (i5 & 16) != 0 ? 0 : i3, str4, (i5 & 64) != 0 ? false : z, str5, list, list2, str6, str7, (i5 & 4096) != 0 ? 0 : i4);
    }
}
