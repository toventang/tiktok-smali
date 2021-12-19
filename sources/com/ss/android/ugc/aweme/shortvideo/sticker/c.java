package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {
    static {
        Covode.recordClassIndex(85425);
    }

    public static boolean e(Effect effect) {
        if (effect == null) {
            return false;
        }
        return b(effect.getSdkExtra());
    }

    private static int a(String str) {
        if (!TextUtils.isEmpty(str) && str.contains("lock_type")) {
            try {
                return new JSONObject(str).getInt("lock_type");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return -1;
    }

    public static boolean f(Effect effect) {
        if (effect == null || effect.getTags() == null) {
            return false;
        }
        return effect.getTags().contains("audio_effect");
    }

    public static boolean h(Effect effect) {
        if (effect == null) {
            return false;
        }
        if (a(effect.getExtra(), "is_music_beat") || b.a(effect.getSdkExtra())) {
            return true;
        }
        return false;
    }

    public static boolean a(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null || !faceStickerBean.getTypes().contains("Game2DV2")) {
            return false;
        }
        return true;
    }

    public static boolean c(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null) {
            return false;
        }
        if (a(faceStickerBean.getExtra(), "is_music_beat") || b.a(faceStickerBean.getSdkExtra())) {
            return true;
        }
        return false;
    }

    public static boolean d(Effect effect) {
        if (effect == null || effect.getTypes() == null || !effect.getTypes().contains("Game2DV2")) {
            return false;
        }
        return true;
    }

    public static boolean g(Effect effect) {
        if (effect == null || effect.getTags() == null) {
            return false;
        }
        if (effect.getTags().contains("instrument") || effect.getTypes().contains("Instrument")) {
            return true;
        }
        return false;
    }

    public static boolean a(Effect effect) {
        if (effect == null) {
            return false;
        }
        if (h(effect)) {
            return true;
        }
        return a(effect.getExtra(), "music_is_force_bind");
    }

    public static boolean b(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null || TextUtils.isEmpty(faceStickerBean.getSdkExtra())) {
            return false;
        }
        return b(faceStickerBean.getSdkExtra());
    }

    public static boolean c(Effect effect) {
        String extra;
        if (effect == null || (extra = effect.getExtra()) == null || a(extra) != 1) {
            return false;
        }
        return true;
    }

    public static boolean b(Effect effect) {
        if (effect == null) {
            return false;
        }
        for (String str : effect.getTags()) {
            if (str.contains("lock")) {
                return true;
            }
        }
        return c(effect);
    }

    private static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return "effectControlGame".equals(new JSONObject(str).optString(StringSet.type));
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean a(Effect effect, String str) {
        if (effect == null || !a(effect.getSdkExtra(), str)) {
            return false;
        }
        return true;
    }

    public static String b(Effect effect, String str) {
        if (effect == null || TextUtils.isEmpty(effect.getSdkExtra())) {
            return null;
        }
        try {
            return new JSONObject(effect.getSdkExtra()).optString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static int c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return new JSONObject(str).optInt(str2);
        } catch (JSONException unused) {
            return 0;
        }
    }

    public static String d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str).optString(str2);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String b(String str, String str2) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
                return null;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString(str2);
    }

    public static boolean a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "{}")) {
            try {
                if (new JSONObject(str).optBoolean(str2)) {
                    return true;
                }
            } catch (JSONException unused) {
                return false;
            }
        }
        return false;
    }
}
