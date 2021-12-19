package com.ss.android.ugc.aweme.sticker.p;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.c;
import com.ss.android.ugc.aweme.shortvideo.ui.h;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.tools.utils.d;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public final class f {
    static {
        Covode.recordClassIndex(88272);
    }

    public static FaceStickerBean a(Effect effect) {
        return a(effect, "");
    }

    public static class a {
        static {
            Covode.recordClassIndex(88273);
        }

        public static List<EffectCategoryModel> a(Context context) {
            ArrayList arrayList = new ArrayList();
            String[] stringArray = context.getResources().getStringArray(R.array.q);
            for (String str : stringArray) {
                EffectCategoryModel effectCategoryModel = new EffectCategoryModel();
                effectCategoryModel.setName(str);
                arrayList.add(effectCategoryModel);
            }
            return arrayList;
        }
    }

    public static Effect a(List<Effect> list) {
        if (d.a(list)) {
            return null;
        }
        for (Effect effect : list) {
            if (!g.b(effect)) {
                return effect;
            }
        }
        return list.get(0);
    }

    public static FaceStickerBean a(Effect effect, String str) {
        List<String> types;
        if (effect == null) {
            return FaceStickerBean.NONE;
        }
        FaceStickerBean faceStickerBean = new FaceStickerBean();
        if (!(h.b(effect.getEffectId()) == null || h.c(effect.getEffectId()) == null)) {
            faceStickerBean.setForceBindMusicPath(h.c(effect.getEffectId()));
        }
        faceStickerBean.setForceBind(c.a(effect));
        faceStickerBean.setDesignerId(effect.getDesignerId());
        faceStickerBean.setSource(effect.getSource());
        faceStickerBean.setSchema(effect.getSchema());
        if (TextUtils.isEmpty(effect.getRecId())) {
            faceStickerBean.setRecId("0");
        } else {
            faceStickerBean.setRecId(effect.getRecId());
        }
        faceStickerBean.setBusi(effect.isBusiness());
        faceStickerBean.setAdRawData(effect.getAdRawData());
        faceStickerBean.setFaceStickerCommerceBean((FaceStickerCommerceBean) new com.google.gson.f().a(effect.getExtra(), FaceStickerCommerceBean.class));
        faceStickerBean.setIconUrl(com.ss.android.ugc.aweme.effectplatform.a.a(effect.getIconUrl()));
        faceStickerBean.setFileUrl(com.ss.android.ugc.aweme.effectplatform.a.a(effect.getFileUrl()));
        try {
            faceStickerBean.setStickerId(Long.parseLong(effect.getEffectId()));
        } catch (NumberFormatException unused) {
            faceStickerBean.setStickerId(-1);
        }
        faceStickerBean.setId(effect.getId());
        if (!TextUtils.isEmpty(effect.getSearchType())) {
            faceStickerBean.setPropSource(effect.getSearchType());
        } else if (!TextUtils.isEmpty(str)) {
            faceStickerBean.setPropSource(str);
        } else {
            faceStickerBean.setPropSource(FaceStickerBean.sCurPropSource);
        }
        faceStickerBean.setMusicIds(effect.getMusic());
        faceStickerBean.setName(effect.getName());
        faceStickerBean.setHint(effect.getHint());
        faceStickerBean.setHintIcon(com.ss.android.ugc.aweme.effectplatform.a.a(effect.getHintIcon()));
        faceStickerBean.setLocalPath(effect.getUnzipPath());
        if (effect.getTypes() == null) {
            types = new ArrayList<>();
        } else {
            types = effect.getTypes();
        }
        faceStickerBean.setTypes(types);
        faceStickerBean.setTags(effect.getTags());
        faceStickerBean.setChildren(effect.getChildren());
        faceStickerBean.setEffectType(effect.getEffectType());
        faceStickerBean.setParentId(effect.getParentId());
        faceStickerBean.setExtra(effect.getExtra());
        faceStickerBean.setSdkExtra(effect.getSdkExtra());
        faceStickerBean.setGradeKey(effect.getGradeKey());
        faceStickerBean.setRequirements(effect.getRequirements());
        return faceStickerBean;
    }
}
