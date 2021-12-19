package com.ss.android.ugc.aweme.shortvideo.publish;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.ak;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f129738a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final b f129739b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(85173);
    }

    public static ak.f a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        ak.f fVar = new ak.f();
        String editEffectList = videoPublishEditModel.getEditEffectList();
        l.b(editEffectList, "");
        boolean z = true;
        if (editEffectList.length() != 0 && !TextUtils.isEmpty(videoPublishEditModel.getStickers())) {
            editEffectList = editEffectList + "," + videoPublishEditModel.getStickers();
        }
        if (editEffectList.length() == 0 && (editEffectList = videoPublishEditModel.getStickers()) == null) {
            editEffectList = "";
        }
        fVar.f115585b = editEffectList;
        fVar.f115584a = videoPublishEditModel.musicId;
        fVar.f115586c = "";
        if (TextUtils.isEmpty(videoPublishEditModel.mUploadPath)) {
            videoPublishEditModel.mUploadPath = f129738a.get(videoPublishEditModel.creationId);
        }
        fVar.f115587d = videoPublishEditModel.mUploadPath;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mShootWay", videoPublishEditModel.mShootWay);
        jSONObject.put("mIsFromDraft", videoPublishEditModel.mIsFromDraft);
        jSONObject.put("method", "getFromVideoEditModel");
        fVar.f115588e = jSONObject.toString();
        fVar.f115590g = a(videoPublishEditModel.creationId, "");
        String str = fVar.f115587d;
        if (!(str == null || str.length() == 0)) {
            z = false;
        }
        ak.a(z);
        return fVar;
    }

    private static String a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "";
        }
        jSONObject.put("creation_id", str);
        jSONObject.put("title", str2);
        String jSONObject2 = jSONObject.toString();
        l.b(jSONObject2, "");
        return jSONObject2;
    }
}
