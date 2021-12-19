package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class IndicatorData implements Serializable {
    @c(a = "box_url")
    private final AwemeUrl boxUrl;
    @c(a = "conversion_area")
    private final NewButtonInfo conversionArea;
    @c(a = "indicator_icon")
    private final UrlModel indicatorIcon;
    @c(a = "indicator_start_box")
    private final BoxData indicatorStartBox;

    static {
        Covode.recordClassIndex(59403);
    }

    public IndicatorData() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ IndicatorData copy$default(IndicatorData indicatorData, UrlModel urlModel, BoxData boxData, AwemeUrl awemeUrl, NewButtonInfo newButtonInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            urlModel = indicatorData.indicatorIcon;
        }
        if ((i2 & 2) != 0) {
            boxData = indicatorData.indicatorStartBox;
        }
        if ((i2 & 4) != 0) {
            awemeUrl = indicatorData.boxUrl;
        }
        if ((i2 & 8) != 0) {
            newButtonInfo = indicatorData.conversionArea;
        }
        return indicatorData.copy(urlModel, boxData, awemeUrl, newButtonInfo);
    }

    public final UrlModel component1() {
        return this.indicatorIcon;
    }

    public final BoxData component2() {
        return this.indicatorStartBox;
    }

    public final AwemeUrl component3() {
        return this.boxUrl;
    }

    public final NewButtonInfo component4() {
        return this.conversionArea;
    }

    public final IndicatorData copy(UrlModel urlModel, BoxData boxData, AwemeUrl awemeUrl, NewButtonInfo newButtonInfo) {
        return new IndicatorData(urlModel, boxData, awemeUrl, newButtonInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicatorData)) {
            return false;
        }
        IndicatorData indicatorData = (IndicatorData) obj;
        return l.a(this.indicatorIcon, indicatorData.indicatorIcon) && l.a(this.indicatorStartBox, indicatorData.indicatorStartBox) && l.a(this.boxUrl, indicatorData.boxUrl) && l.a(this.conversionArea, indicatorData.conversionArea);
    }

    public final int hashCode() {
        UrlModel urlModel = this.indicatorIcon;
        int i2 = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        BoxData boxData = this.indicatorStartBox;
        int hashCode2 = (hashCode + (boxData != null ? boxData.hashCode() : 0)) * 31;
        AwemeUrl awemeUrl = this.boxUrl;
        int hashCode3 = (hashCode2 + (awemeUrl != null ? awemeUrl.hashCode() : 0)) * 31;
        NewButtonInfo newButtonInfo = this.conversionArea;
        if (newButtonInfo != null) {
            i2 = newButtonInfo.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "IndicatorData(indicatorIcon=" + this.indicatorIcon + ", indicatorStartBox=" + this.indicatorStartBox + ", boxUrl=" + this.boxUrl + ", conversionArea=" + this.conversionArea + ")";
    }

    public final AwemeUrl getBoxUrl() {
        return this.boxUrl;
    }

    public final NewButtonInfo getConversionArea() {
        return this.conversionArea;
    }

    public final UrlModel getIndicatorIcon() {
        return this.indicatorIcon;
    }

    public final BoxData getIndicatorStartBox() {
        return this.indicatorStartBox;
    }

    public IndicatorData(UrlModel urlModel, BoxData boxData, AwemeUrl awemeUrl, NewButtonInfo newButtonInfo) {
        this.indicatorIcon = urlModel;
        this.indicatorStartBox = boxData;
        this.boxUrl = awemeUrl;
        this.conversionArea = newButtonInfo;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IndicatorData(UrlModel urlModel, BoxData boxData, AwemeUrl awemeUrl, NewButtonInfo newButtonInfo, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : urlModel, (i2 & 2) != 0 ? null : boxData, (i2 & 4) != 0 ? null : awemeUrl, (i2 & 8) != 0 ? null : newButtonInfo);
    }
}
