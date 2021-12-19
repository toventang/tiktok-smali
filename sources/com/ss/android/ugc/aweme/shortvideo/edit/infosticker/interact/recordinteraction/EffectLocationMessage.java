package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction;

import com.bytedance.covode.number.Covode;
import java.util.List;

public class EffectLocationMessage {
    List<EffectLocation> locations;

    static {
        Covode.recordClassIndex(83643);
    }

    public List<EffectLocation> getLocations() {
        return this.locations;
    }

    public void setLocations(List<EffectLocation> list) {
        this.locations = list;
    }
}
