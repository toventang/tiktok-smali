package com.bytedance.ies.xelement.defaultimpl.player.engine.api.common;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.o;
import com.kakao.usermgmt.StringSet;
import com.ss.ttvideoengine.j.p;
import com.ss.ttvideoengine.j.q;
import com.ss.ttvideoengine.w;
import h.f.b.g;
import h.f.b.l;
import org.json.JSONObject;

public final class PlayModel {
    @c(a = StringSet.type)
    private final String encryptType;
    @c(a = "quality")
    private final String quality;
    @c(a = "video_model")
    private final o videoModelJsonObj;

    static {
        Covode.recordClassIndex(22236);
    }

    public PlayModel() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ PlayModel copy$default(PlayModel playModel, String str, String str2, o oVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = playModel.quality;
        }
        if ((i2 & 2) != 0) {
            str2 = playModel.encryptType;
        }
        if ((i2 & 4) != 0) {
            oVar = playModel.videoModelJsonObj;
        }
        return playModel.copy(str, str2, oVar);
    }

    public final String component1() {
        return this.quality;
    }

    public final String component2() {
        return this.encryptType;
    }

    public final o component3() {
        return this.videoModelJsonObj;
    }

    public final PlayModel copy(String str, String str2, o oVar) {
        return new PlayModel(str, str2, oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayModel)) {
            return false;
        }
        PlayModel playModel = (PlayModel) obj;
        return l.a(this.quality, playModel.quality) && l.a(this.encryptType, playModel.encryptType) && l.a(this.videoModelJsonObj, playModel.videoModelJsonObj);
    }

    public final int hashCode() {
        String str = this.quality;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.encryptType;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        o oVar = this.videoModelJsonObj;
        if (oVar != null) {
            i2 = oVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "PlayModel(quality=" + this.quality + ", encryptType=" + this.encryptType + ", videoModelJsonObj=" + this.videoModelJsonObj + ")";
    }

    public final String getEncryptType() {
        return this.encryptType;
    }

    public final String getQuality() {
        return this.quality;
    }

    public final o getVideoModelJsonObj() {
        return this.videoModelJsonObj;
    }

    public final p getVideoModel() {
        o oVar = this.videoModelJsonObj;
        if (oVar != null) {
            return makeVideoModel(oVar);
        }
        return null;
    }

    public final w getResolution() {
        String str = this.quality;
        if (l.a((Object) str, (Object) d.EXCELLENT.getDesc())) {
            return w.SuperHigh;
        }
        if (l.a((Object) str, (Object) d.GOOD.getDesc())) {
            return w.H_High;
        }
        l.a((Object) str, (Object) d.REGULAR.getDesc());
        return w.Standard;
    }

    private final boolean isValid(q qVar) {
        if (qVar.v == 10) {
            return true;
        }
        return false;
    }

    private final p makeVideoModel(o oVar) {
        try {
            p pVar = new p();
            q qVar = new q();
            qVar.a(new JSONObject(oVar.toString()));
            if (!isValid(qVar)) {
                return null;
            }
            pVar.a(qVar);
            return pVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public PlayModel(String str, String str2, o oVar) {
        this.quality = str;
        this.encryptType = str2;
        this.videoModelJsonObj = oVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlayModel(String str, String str2, o oVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : oVar);
    }
}
