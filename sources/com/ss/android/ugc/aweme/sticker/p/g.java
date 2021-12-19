package com.ss.android.ugc.aweme.sticker.p;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.shortvideo.sticker.b;
import com.ss.android.ugc.aweme.shortvideo.sticker.c;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.d;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

public final class g {
    static {
        Covode.recordClassIndex(88274);
    }

    public static boolean r(Effect effect) {
        return c.a(effect);
    }

    public static boolean s(Effect effect) {
        return c.h(effect);
    }

    public static boolean v(Effect effect) {
        return c.g(effect);
    }

    public static boolean B(Effect effect) {
        if (effect == null) {
            return false;
        }
        return b(effect.getExtra());
    }

    public static boolean a(Effect effect) {
        if (effect == null || effect.getEffectType() != 1) {
            return false;
        }
        return true;
    }

    public static boolean b(FaceStickerBean faceStickerBean) {
        if (c.a(faceStickerBean) || c.b(faceStickerBean)) {
            return true;
        }
        return false;
    }

    public static boolean d(Effect effect) {
        if (effect == null || effect.getSource() != 0) {
            return false;
        }
        return true;
    }

    public static boolean e(Effect effect) {
        if (effect == null || effect.getEffectType() != 0) {
            return false;
        }
        return true;
    }

    public static boolean j(Effect effect) {
        E(effect);
        if (F(effect)) {
            return false;
        }
        return true;
    }

    public static boolean k(Effect effect) {
        if (F(effect) || E(effect)) {
            return true;
        }
        return false;
    }

    public static boolean t(Effect effect) {
        if (c.d(effect) || c.e(effect)) {
            return true;
        }
        return false;
    }

    public static boolean y(Effect effect) {
        if (effect == null || effect.getEffectType() != 1) {
            return false;
        }
        return true;
    }

    public static boolean C(Effect effect) {
        if (effect == null || !c.a(effect.getExtra(), "photosensitive")) {
            return false;
        }
        return true;
    }

    public static boolean D(Effect effect) {
        if (effect != null && !a(effect) && !t(effect) && !effect.isBusiness()) {
            return C(effect);
        }
        return false;
    }

    private static boolean E(Effect effect) {
        if (effect == null || effect.getRequirements() == null || !effect.getRequirements().contains("AR")) {
            return false;
        }
        return true;
    }

    private static boolean F(Effect effect) {
        if (effect == null || effect.getTypes() == null || !effect.getTypes().contains("AR")) {
            return false;
        }
        return true;
    }

    public static boolean b(Effect effect) {
        if (effect == null || effect.getEffectType() != 2) {
            return false;
        }
        return true;
    }

    public static boolean c(Effect effect) {
        if (effect == null || effect.getSource() != 1 || TextUtils.isEmpty(effect.getDesignerId())) {
            return false;
        }
        return true;
    }

    public static boolean f(Effect effect) {
        if (a("BackgroundVideo", effect) || c.a(effect, "BackgroundVideo")) {
            return true;
        }
        return false;
    }

    public static boolean g(Effect effect) {
        if (effect == null || TextUtils.isEmpty(effect.getSdkExtra())) {
            return false;
        }
        return c.a(effect.getSdkExtra(), "triggered_slow_motion");
    }

    public static boolean h(Effect effect) {
        if (!f(effect) || !a("MultiScanBgVideo", effect)) {
            return false;
        }
        return true;
    }

    public static boolean i(Effect effect) {
        if (a("voice_recognization", effect) || b.a(effect)) {
            return true;
        }
        return false;
    }

    public static boolean l(Effect effect) {
        if (k(effect) || o(effect) || m(effect)) {
            return true;
        }
        return false;
    }

    public static boolean n(Effect effect) {
        if (effect == null || effect.getTags() == null || !effect.getTags().contains("textInShoot")) {
            return false;
        }
        return true;
    }

    public static boolean u(Effect effect) {
        if (effect == null || effect.getTypes() == null) {
            return false;
        }
        return effect.getTypes().contains("TouchGes");
    }

    public static boolean z(Effect effect) {
        if (effect == null || effect.getTypes() == null || !effect.getTypes().contains("Composer")) {
            return false;
        }
        return true;
    }

    public static boolean A(Effect effect) {
        if ((effect == null || effect.getParentId() == null || effect.getParentId().isEmpty()) && !y(effect) && ((effect == null || !effect.getTypes().contains("Adaptive")) && !f(effect) && !com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.c.a(effect) && !z(effect))) {
            return false;
        }
        return true;
    }

    public static ArrayList<String> a(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(",");
            for (String str2 : split) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    private static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new JSONObject(str).optBoolean("need_effect_to_capture_image", false);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean m(Effect effect) {
        if (effect == null) {
            return false;
        }
        if ((effect.getTags() == null || !effect.getTags().contains("text2d")) && !effect.getTypes().contains("Text2D") && !effect.getTypes().contains("Text2DV2")) {
            return false;
        }
        return true;
    }

    public static boolean o(Effect effect) {
        if (effect == null) {
            return false;
        }
        if ((effect.getTags() == null || !effect.getTags().contains("TextEdit")) && !effect.getTypes().contains("TextEdit")) {
            return false;
        }
        return true;
    }

    public static boolean p(Effect effect) {
        if (effect == null) {
            return false;
        }
        for (String str : effect.getTags()) {
            if (str.contains(":1")) {
                return true;
            }
        }
        return false;
    }

    public static boolean w(Effect effect) {
        String b2;
        if (effect == null) {
            return true;
        }
        if (c.g(effect) || c.d(effect) || c.f(effect) || c.e(effect) || c.a(effect.getSdkExtra(), "isTC21RedEnvelope") || ((b2 = c.b(effect.getSdkExtra(), "multi_segments")) != null && !b2.isEmpty())) {
            return false;
        }
        return true;
    }

    public static boolean x(Effect effect) {
        if (effect == null || !effect.isBusiness()) {
            return false;
        }
        try {
            if (1 == ((FaceStickerCommerceBean) new f().a(effect.getExtra(), FaceStickerCommerceBean.class)).f134973d) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    public static boolean a(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null || ((faceStickerBean.getTypes() == null || !faceStickerBean.getTypes().contains("AR")) && (faceStickerBean.getRequirements() == null || !faceStickerBean.getRequirements().contains("AR")))) {
            return false;
        }
        return true;
    }

    public static String q(Effect effect) {
        if (effect != null && effect.getTags() != null && !effect.getTags().isEmpty()) {
            Iterator<String> it = effect.getTags().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (next != null && next.contains("challenge") && next.contains(":")) {
                    String[] split = next.split(":");
                    if (split.length > 1 && split[1] != null && !split[1].isEmpty() && split[1].matches("[0-9]+")) {
                        return split[1];
                    }
                }
            }
        }
        return null;
    }

    public static boolean a(String str, FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null || faceStickerBean == FaceStickerBean.NONE || d.a(faceStickerBean.getTags()) || !faceStickerBean.getTags().contains(str)) {
            return false;
        }
        return true;
    }

    public static boolean a(String str, Effect effect) {
        if (effect != null && !d.a(effect.getTags()) && effect.getTags().contains(str)) {
            return true;
        }
        return false;
    }
}
