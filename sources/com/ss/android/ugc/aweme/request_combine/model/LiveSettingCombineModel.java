package com.ss.android.ugc.aweme.request_combine.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.request_combine.a;
import h.f.b.l;

public final class LiveSettingCombineModel extends a {
    @c(a = "body")
    private com.ss.android.ugc.aweme.live.settings.c liveSetting;

    static {
        Covode.recordClassIndex(78546);
    }

    public static /* synthetic */ LiveSettingCombineModel copy$default(LiveSettingCombineModel liveSettingCombineModel, com.ss.android.ugc.aweme.live.settings.c cVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cVar = liveSettingCombineModel.liveSetting;
        }
        return liveSettingCombineModel.copy(cVar);
    }

    public final com.ss.android.ugc.aweme.live.settings.c component1() {
        return this.liveSetting;
    }

    public final LiveSettingCombineModel copy(com.ss.android.ugc.aweme.live.settings.c cVar) {
        l.d(cVar, "");
        return new LiveSettingCombineModel(cVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LiveSettingCombineModel) && l.a(this.liveSetting, ((LiveSettingCombineModel) obj).liveSetting);
        }
        return true;
    }

    public final int hashCode() {
        com.ss.android.ugc.aweme.live.settings.c cVar = this.liveSetting;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "LiveSettingCombineModel(liveSetting=" + this.liveSetting + ")";
    }

    public final com.ss.android.ugc.aweme.live.settings.c getLiveSetting() {
        return this.liveSetting;
    }

    public final void setLiveSetting(com.ss.android.ugc.aweme.live.settings.c cVar) {
        l.d(cVar, "");
        this.liveSetting = cVar;
    }

    public LiveSettingCombineModel(com.ss.android.ugc.aweme.live.settings.c cVar) {
        l.d(cVar, "");
        this.liveSetting = cVar;
    }
}
