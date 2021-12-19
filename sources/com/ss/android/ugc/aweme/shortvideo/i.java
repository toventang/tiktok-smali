package com.ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.f;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.KtfInfo;
import com.ss.android.ugc.aweme.feed.model.OcrLocation;
import com.ss.android.ugc.aweme.feed.model.VPAInfo;
import com.ss.android.ugc.aweme.live.b;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import java.io.Serializable;

public class i implements Serializable {
    @c(a = "diamond_game_id")
    public String diamondGameId;
    @c(a = "hproject_info")
    public a f2ProjectInfo;
    @c(a = "green_screen")
    public int greenScreen;
    @c(a = "koi_fish")
    public int koiFish;
    @c(a = "ktf_info")
    public KtfInfo ktfInfo;
    @c(a = "status_template_id")
    public String mStatusId;
    @c(a = "video_tag")
    public int mVideoTag;
    @c(a = "mv_info")
    public MvModel mvInfo;
    @c(a = "mv_id")
    public String mvThemeId;
    @c(a = "mv_type")
    public int mvType;
    @c(a = "ocr_location")
    public String ocrLocation;
    @c(a = "vpa_info")
    public VPAInfo vpaInfo = new VPAInfo(false, 0);

    public static class a implements Serializable {
        @c(a = "icon_url")
        public UrlModel iconUrl;
        @c(a = "schema_url")
        public String schemaUrl;
        @c(a = "title")
        public String title;

        static {
            Covode.recordClassIndex(84284);
        }
    }

    static {
        Covode.recordClassIndex(84283);
    }

    public OcrLocation getOcrLocation() {
        OcrLocation ocrLocation2 = null;
        if (TextUtils.isEmpty(this.ocrLocation)) {
            return null;
        }
        try {
            ocrLocation2 = (OcrLocation) new f().a(this.ocrLocation, OcrLocation.class);
            return ocrLocation2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return ocrLocation2;
        }
    }

    public static i createStruct(String str) {
        i iVar = new i();
        if (TextUtils.isEmpty(str)) {
            return iVar;
        }
        try {
            iVar = (i) b.a().a(str, i.class);
            return iVar;
        } catch (Exception e2) {
            e2.printStackTrace();
            return iVar;
        }
    }
}
