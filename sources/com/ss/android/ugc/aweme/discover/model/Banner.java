package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.b;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.api.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;

public class Banner implements d, Serializable {
    private static final long serialVersionUID = 1;
    @b(a = StringJsonAdapterFactory.class)
    @c(a = "ad_data")
    BannerAdData adData;
    @c(a = "banner_url")
    UrlModel bannerUrl;
    @c(a = "bid")
    String bid;
    @c(a = "height")
    int height;
    private String requestId;
    @c(a = "schema")
    String schema;
    @c(a = "title")
    String title;
    @c(a = "width")
    int width;

    static {
        Covode.recordClassIndex(50869);
    }

    public static class BannerAdData implements Serializable {
        @c(a = "ad_label")
        AdLabel adLabel;
        @c(a = "click_track_url_list")
        List<String> clickTrackUrlList;
        @c(a = "creative_id")
        long creativeId;
        @c(a = "is_ad")
        boolean isAd = true;
        @c(a = "log_extra")
        String logExtra;
        @c(a = "package_name")
        String packageName;
        @c(a = "track_url_list")
        List<String> trackUrlList;
        @c(a = StringSet.type)
        String type;

        static {
            Covode.recordClassIndex(50870);
        }

        public AdLabel getAdLabel() {
            return this.adLabel;
        }
    }

    public BannerAdData getAdData() {
        return this.adData;
    }

    public UrlModel getBannerUrl() {
        return this.bannerUrl;
    }

    public String getBid() {
        return this.bid;
    }

    public int getHeight() {
        return this.height;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public String getRequestId() {
        return this.requestId;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getTitle() {
        return this.title;
    }

    public int getWidth() {
        return this.width;
    }

    public List<String> getClickTrackUrlList() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null) {
            return null;
        }
        return bannerAdData.clickTrackUrlList;
    }

    public long getCreativeId() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null) {
            return 0;
        }
        return bannerAdData.creativeId;
    }

    public String getLogExtra() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null) {
            return null;
        }
        return bannerAdData.logExtra;
    }

    public String getPackageName() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null) {
            return null;
        }
        return bannerAdData.packageName;
    }

    public List<String> getTrackUrlList() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null) {
            return null;
        }
        return bannerAdData.trackUrlList;
    }

    public String getType() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null) {
            return null;
        }
        return bannerAdData.type;
    }

    public boolean isAd() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null || !bannerAdData.isAd) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2;
        int i3;
        int i4;
        String str = this.bid;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = i2 * 31;
        String str2 = this.title;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        UrlModel urlModel = this.bannerUrl;
        if (urlModel != null) {
            i4 = urlModel.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (((((i7 + i4) * 31) + this.height) * 31) + this.width) * 31;
        String str3 = this.schema;
        if (str3 != null) {
            i5 = str3.hashCode();
        }
        return i8 + i5;
    }

    public void setBannerUrl(UrlModel urlModel) {
        this.bannerUrl = urlModel;
    }

    public void setBid(String str) {
        this.bid = str;
    }

    public void setHeight(int i2) {
        this.height = i2;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setWidth(int i2) {
        this.width = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Banner banner = (Banner) obj;
            if (this.height != banner.height || this.width != banner.width) {
                return false;
            }
            String str = this.bid;
            if (str == null ? banner.bid != null : !str.equals(banner.bid)) {
                return false;
            }
            String str2 = this.title;
            if (str2 == null ? banner.title != null : !str2.equals(banner.title)) {
                return false;
            }
            UrlModel urlModel = this.bannerUrl;
            if (urlModel == null ? banner.bannerUrl != null : !urlModel.equals(banner.bannerUrl)) {
                return false;
            }
            String str3 = this.schema;
            String str4 = banner.schema;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }
}
