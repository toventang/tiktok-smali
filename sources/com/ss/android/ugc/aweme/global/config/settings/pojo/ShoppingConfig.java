package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class ShoppingConfig {
    @c(a = "card_show_duration")
    private Integer cardShowDuration;
    @c(a = "disable_card")
    private Boolean disableCard;
    @c(a = "disable_want")
    private Boolean disableWant;
    @c(a = "enable")
    private Boolean enable;
    @c(a = "enable_float_video")
    private Boolean enableFloatVideo;
    @c(a = "enable_user")
    private Boolean enableUser;
    @c(a = "law_window")
    private Boolean lawWindow;
    @c(a = "live")
    private ShoppingLiveConfig live;
    @c(a = "newbie_help")
    private ShoppingNewbieHelp newbieHelp;
    @c(a = "order_share_intro_url")
    private String orderShareIntroUrl;
    @c(a = "preload_data_wait_duration")
    private Integer preloadDataWaitDuration = 3;

    static {
        Covode.recordClassIndex(63076);
    }

    public Integer getPreloadDataWaitDuration() {
        return this.preloadDataWaitDuration;
    }

    public Integer getCardShowDuration() {
        Integer num = this.cardShowDuration;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Boolean getDisableCard() {
        Boolean bool = this.disableCard;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Boolean getDisableWant() {
        Boolean bool = this.disableWant;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Boolean getEnable() {
        Boolean bool = this.enable;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Boolean getEnableFloatVideo() {
        Boolean bool = this.enableFloatVideo;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Boolean getEnableUser() {
        Boolean bool = this.enableUser;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Boolean getLawWindow() {
        Boolean bool = this.lawWindow;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public ShoppingLiveConfig getLive() {
        ShoppingLiveConfig shoppingLiveConfig = this.live;
        if (shoppingLiveConfig != null) {
            return shoppingLiveConfig;
        }
        throw new a();
    }

    public ShoppingNewbieHelp getNewbieHelp() {
        ShoppingNewbieHelp shoppingNewbieHelp = this.newbieHelp;
        if (shoppingNewbieHelp != null) {
            return shoppingNewbieHelp;
        }
        throw new a();
    }

    public String getOrderShareIntroUrl() {
        String str = this.orderShareIntroUrl;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
