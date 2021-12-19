package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class HotSearchWitch {
    @c(a = "hotsearch_aweme_billboard_switch")
    private Boolean hotsearchAwemeBillboardSwitch;
    @c(a = "hotsearch_billboard_switch")
    private Boolean hotsearchBillboardSwitch;
    @c(a = "hotsearch_music_billboard_switch")
    private Boolean hotsearchMusicBillboardSwitch;
    @c(a = "hotsearch_positive_energy_billboard_switch")
    private Boolean hotsearchPositiveEnergyBillboardSwitch;
    @c(a = "hotsearch_star_billboard_switch")
    private Boolean hotsearchStarBillboardSwitch;

    static {
        Covode.recordClassIndex(63046);
    }

    public Boolean getHotsearchAwemeBillboardSwitch() {
        Boolean bool = this.hotsearchAwemeBillboardSwitch;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Boolean getHotsearchBillboardSwitch() {
        Boolean bool = this.hotsearchBillboardSwitch;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Boolean getHotsearchMusicBillboardSwitch() {
        Boolean bool = this.hotsearchMusicBillboardSwitch;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Boolean getHotsearchPositiveEnergyBillboardSwitch() {
        Boolean bool = this.hotsearchPositiveEnergyBillboardSwitch;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Boolean getHotsearchStarBillboardSwitch() {
        Boolean bool = this.hotsearchStarBillboardSwitch;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }
}
