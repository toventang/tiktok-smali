package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class AwemeFEConfigs {
    @c(a = "business_ec")
    private BusinessEC businessEc;
    @c(a = "goods_report")
    private GoodsReport goodsReport;
    @c(a = "link_plan")
    private LinkPlan linkPlan;
    @c(a = "live")
    private ShopLiveConfig live;
    @c(a = "mp_tab")
    private MpTab mpTab;
    @c(a = "seed_label")
    private String seedLabel;
    @c(a = "seeding")
    private Seeding seeding;
    @c(a = "star_atlas_order")
    private StarAtlasOrder starAtlasOrder;
    @c(a = "video_auth")
    private VideoAuth videoAuth;

    static {
        Covode.recordClassIndex(63014);
    }

    public BusinessEC getBusinessEc() {
        BusinessEC businessEC = this.businessEc;
        if (businessEC != null) {
            return businessEC;
        }
        throw new a();
    }

    public GoodsReport getGoodsReport() {
        GoodsReport goodsReport2 = this.goodsReport;
        if (goodsReport2 != null) {
            return goodsReport2;
        }
        throw new a();
    }

    public LinkPlan getLinkPlan() {
        LinkPlan linkPlan2 = this.linkPlan;
        if (linkPlan2 != null) {
            return linkPlan2;
        }
        throw new a();
    }

    public ShopLiveConfig getLive() {
        ShopLiveConfig shopLiveConfig = this.live;
        if (shopLiveConfig != null) {
            return shopLiveConfig;
        }
        throw new a();
    }

    public MpTab getMpTab() {
        MpTab mpTab2 = this.mpTab;
        if (mpTab2 != null) {
            return mpTab2;
        }
        throw new a();
    }

    public String getSeedLabel() {
        String str = this.seedLabel;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public Seeding getSeeding() {
        Seeding seeding2 = this.seeding;
        if (seeding2 != null) {
            return seeding2;
        }
        throw new a();
    }

    public StarAtlasOrder getStarAtlasOrder() {
        StarAtlasOrder starAtlasOrder2 = this.starAtlasOrder;
        if (starAtlasOrder2 != null) {
            return starAtlasOrder2;
        }
        throw new a();
    }

    public VideoAuth getVideoAuth() {
        VideoAuth videoAuth2 = this.videoAuth;
        if (videoAuth2 != null) {
            return videoAuth2;
        }
        throw new a();
    }
}
