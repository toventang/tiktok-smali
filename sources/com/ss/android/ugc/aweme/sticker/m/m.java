package com.ss.android.ugc.aweme.sticker.m;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f134968a = new m();

    private m() {
    }

    static {
        Covode.recordClassIndex(88240);
    }

    public static String a(EffectCategoryModel effectCategoryModel) {
        String name;
        if (effectCategoryModel == null || (name = effectCategoryModel.getName()) == null) {
            return "";
        }
        return name;
    }
}
