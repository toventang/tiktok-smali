package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.b;
import com.bytedance.android.livesdk.model.i;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.util.List;

public class Prop extends b {
    @c(a = "banner")
    public i banner;
    @c(a = "count")
    public int count;
    @c(a = "description")
    public String description;
    @c(a = "diamond")
    public int diamond;
    @c(a = "diamond_icon")
    public ImageModel diamondLabel;
    @c(a = "fragments_compound_count")
    public Long fragmentsCompoundCount;
    @c(a = "gift")
    public u gift = new u();
    @c(a = "gifts")
    public List<q> gifts;
    @c(a = "icon")
    public ImageModel icon;
    @c(a = "prop_def_id")
    public long id;
    @c(a = "is_aweme_free_gift")
    public int isAwemeFreeGift;
    @c(a = "is_fragment")
    public Boolean isFragment;
    @c(a = "label_icon")
    public ImageModel labelIcon;
    @c(a = "manual")
    public String manual;
    @c(a = StringSet.name)
    public String name;
    @c(a = "next_expire")
    public long nextExpire;
    private long nowTimeDiff;
    @c(a = "primary_effect_id")
    public int primaryEffectId;
    @c(a = "prop_def_type")
    public long propType;
    @c(a = "reddot_tip")
    public boolean reddotTip;
    @c(a = "scheme_url")
    public String schemeUrl;

    static {
        Covode.recordClassIndex(9930);
    }

    public long getNowTimeDiff() {
        return this.nowTimeDiff;
    }

    public void setNowTimeDiff(long j2) {
        this.nowTimeDiff = j2;
    }

    public static Prop newInstance(Prop prop) {
        Prop prop2 = new Prop();
        if (prop == null) {
            return prop2;
        }
        prop2.primaryEffectId = prop.primaryEffectId;
        prop2.nextExpire = prop.nextExpire;
        prop2.description = prop.description;
        prop2.id = prop.id;
        prop2.manual = prop.manual;
        prop2.diamond = prop.diamond;
        prop2.reddotTip = prop.reddotTip;
        prop2.icon = prop.icon;
        prop2.count = prop.count;
        prop2.name = prop.name;
        prop2.gift = prop.gift;
        prop2.labelIcon = prop.labelIcon;
        prop2.diamondLabel = prop.diamondLabel;
        prop2.isAwemeFreeGift = prop.isAwemeFreeGift;
        prop2.nowTimeDiff = prop.nowTimeDiff;
        prop2.banner = prop.banner;
        return prop2;
    }
}
