package com.ss.android.ugc.aweme.simkit.model.bitrateselect;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.simkit.model.BaseResponse;
import com.ss.android.ugc.aweme.simkit.model.a.a;
import java.util.List;

public class RateSettingsResponse<T extends a> extends BaseResponse {
    @c(a = "adaptive_gear_group")
    private c adaptiveGearGroup;
    @c(a = "auto_biterate_curv")
    private a autoBitrateCurve;
    @c(a = "auto_bitrate_params")
    private b autoBitrateSet;
    @c(a = "auto_bitrate_params_live")
    private b autoBitrateSetLive;
    @c(a = "bandwidth_map")
    private List<BandwidthSet> bandwidthSet;
    @c(a = "player_type_v2")
    private T decodeType;
    @c(a = "default_gear_group")
    private String defaultGearGroup;
    @c(a = "definition_gear_group")
    private c definitionGearGroup;
    @c(a = "flow_gear_group")
    private c flowGearGroup;
    @c(a = "gear_set")
    private List<GearSet> gearSet;

    static {
        Covode.recordClassIndex(87392);
    }

    public static int com_ss_android_ugc_aweme_simkit_model_bitrateselect_RateSettingsResponse_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public c getAdaptiveGearGroup() {
        return this.adaptiveGearGroup;
    }

    public b getAutoBitrateSet() {
        return this.autoBitrateSet;
    }

    public b getAutoBitrateSetLive() {
        return this.autoBitrateSetLive;
    }

    public List<BandwidthSet> getBandwidthSet() {
        return this.bandwidthSet;
    }

    public a getDecodeType() {
        return this.decodeType;
    }

    public String getDefaultGearGroup() {
        return this.defaultGearGroup;
    }

    public c getDefinitionGearGroup() {
        return this.definitionGearGroup;
    }

    public c getFlowGearGroup() {
        return this.flowGearGroup;
    }

    public List<GearSet> getGearSet() {
        return this.gearSet;
    }

    public b getLowQltyCurv() {
        a aVar = this.autoBitrateCurve;
        if (aVar == null) {
            return null;
        }
        return aVar.f133600b;
    }

    public b getHighBitrateCurve() {
        b bVar;
        a aVar = this.autoBitrateCurve;
        if (aVar != null && (bVar = aVar.f133599a) != null) {
            return bVar;
        }
        b bVar2 = this.autoBitrateSet;
        com_ss_android_ugc_aweme_simkit_model_bitrateselect_RateSettingsResponse_com_ss_android_ugc_aweme_lancet_LogLancet_e("wbp-video-quality", "getHighBitrateCurve: got null, fallback to default.");
        return bVar2;
    }

    public boolean isValid() {
        if (this.adaptiveGearGroup == null) {
            return false;
        }
        if (this.gearSet == null && this.bandwidthSet == null && this.autoBitrateSet == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.simkit.model.BaseResponse
    public String toString() {
        return "RateSettingsResponse{flowGearGroup=" + this.flowGearGroup + ", adaptiveGearGroup=" + this.adaptiveGearGroup + ", defaultGearGroup='" + this.defaultGearGroup + '\'' + ", definitionGearGroup=" + this.definitionGearGroup + ", gearSet=" + this.gearSet + ", bandwidthSet=" + this.bandwidthSet + ", autoBitrateSet=" + this.autoBitrateSet + '}';
    }

    public void setAdaptiveGearGroup(c cVar) {
        this.adaptiveGearGroup = cVar;
    }

    public void setAutoBitrateSet(b bVar) {
        this.autoBitrateSet = bVar;
    }

    public void setAutoBitrateSetLive(b bVar) {
        this.autoBitrateSetLive = bVar;
    }

    public void setBandwidthSet(List<BandwidthSet> list) {
        this.bandwidthSet = list;
    }

    public void setDefaultGearGroup(String str) {
        this.defaultGearGroup = str;
    }

    public void setDefinitionGearGroup(c cVar) {
        this.definitionGearGroup = cVar;
    }

    public void setFlowGearGroup(c cVar) {
        this.flowGearGroup = cVar;
    }

    public void setGearSet(List<GearSet> list) {
        this.gearSet = list;
    }
}
