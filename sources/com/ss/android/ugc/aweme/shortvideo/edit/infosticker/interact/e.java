package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.ad;
import com.ss.android.ugc.aweme.port.in.g;
import java.io.Serializable;

public class e implements Serializable {
    public boolean interactStickerCheckEffectSdk;
    public c mInteractStickerContext;
    private ad mShareContext;

    static {
        Covode.recordClassIndex(83521);
    }

    public static String updateSDKShareContextWhenSaveOrPost(boolean z, String str) {
        return str;
    }

    public c getInteractStickerContext() {
        return this.mInteractStickerContext;
    }

    public ad getShareContext() {
        return this.mShareContext;
    }

    public String toBusinessData() {
        return g.a().C().getRetrofitFactoryGson().b(this);
    }

    public void setInteractStickerContext(c cVar) {
        this.mInteractStickerContext = cVar;
    }

    public void setShareContext(ad adVar) {
        this.mShareContext = adVar;
    }

    public static String getShareContext(e eVar) {
        if (eVar == null || eVar.getShareContext() == null) {
            return null;
        }
        return g.a().C().getRetrofitFactoryGson().b(eVar.getShareContext());
    }

    public static String getShareContext(String str) {
        e eVar;
        if (m.a(str) || (eVar = (e) g.a().C().getRetrofitFactoryGson().a(str, e.class)) == null || eVar.getShareContext() == null) {
            return null;
        }
        return g.a().C().getRetrofitFactoryGson().b(eVar.getShareContext());
    }
}
