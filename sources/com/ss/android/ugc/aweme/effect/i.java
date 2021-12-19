package com.ss.android.ugc.aweme.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.a;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import dmt.av.video.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class i {
    static {
        Covode.recordClassIndex(55941);
    }

    public static void a() {
        IEditEffectPreferences iEditEffectPreferences = (IEditEffectPreferences) new a((byte) 0).a(com.ss.android.ugc.aweme.port.in.i.f115645a, IEditEffectPreferences.class);
        int h2 = g.a().w().h();
        if (h2 != iEditEffectPreferences.getResourceVersion(-1)) {
            iEditEffectPreferences.setResourceVersion(h2);
            g.a().r().a();
            b.i.b(j.f88949a, b.i.f4824a);
        }
    }

    public static ArrayList<EffectModel> b() {
        ArrayList<EffectModel> arrayList = new ArrayList<>();
        arrayList.add(a(com.ss.android.ugc.aweme.port.in.i.f115645a.getString(R.string.gge), "0", 2131232513));
        arrayList.add(a(com.ss.android.ugc.aweme.port.in.i.f115645a.getString(R.string.gg9), "1", 2131232624));
        arrayList.add(a(com.ss.android.ugc.aweme.port.in.i.f115645a.getString(R.string.gg_), "2", 2131232622));
        arrayList.add(a(com.ss.android.ugc.aweme.port.in.i.f115645a.getString(R.string.gga), "3", 2131232623));
        return arrayList;
    }

    static boolean a(EffectModel effectModel) {
        try {
            if (Integer.parseInt(effectModel.key) < 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    private static EffectModel a(String str, String str2, int i2) {
        EffectModel effectModel = new EffectModel();
        effectModel.name = str;
        effectModel.type = 2;
        effectModel.key = str2;
        effectModel.imagePath = i2;
        return effectModel;
    }

    public static EffectModel a(int i2, Effect effect, String str) {
        int[] iArr;
        EffectModel effectModel = new EffectModel();
        effectModel.name = effect.getName();
        effectModel.hint = effect.getHint();
        effectModel.key = effect.getEffectId();
        effectModel.type = 1;
        int i3 = 0;
        effectModel.iconUrl = effect.getIconUrl().getUrlList().get(0);
        List<String> d2 = g.a().f().d();
        if (d2 != null && !d2.isEmpty()) {
            iArr = new int[d2.size()];
            for (int i4 = 0; i4 < d2.size(); i4++) {
                iArr[i4] = d.a(d2.get(i4));
            }
        } else if (d.f88938b != null) {
            iArr = d.f88938b;
        } else {
            iArr = com.ss.android.ugc.aweme.port.in.i.f115645a.getResources().getIntArray(R.array.t);
            d.f88938b = iArr;
        }
        effectModel.color = iArr[i2 % iArr.length];
        effectModel.resDir = effect.getUnzipPath();
        List<String> tags = effect.getTags();
        if (tags != null) {
            Iterator<String> it = tags.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (next.contains("duration:")) {
                    i3 = Integer.parseInt(next.substring(9));
                    break;
                }
            }
        }
        effectModel.duration = i3;
        effectModel.category = str;
        effectModel.extra = effect.getExtra();
        try {
            if (effect.getExtra() != null) {
                effectModel.isNewEngineEffect = Boolean.valueOf(new JSONObject(effect.getExtra()).optBoolean("if_capcut"));
            }
        } catch (JSONException unused) {
        }
        if (effectModel.isNewEngineEffect.booleanValue()) {
            effectModel.adjustParams = x.a(effect.getSdk_extra());
        }
        return effectModel;
    }
}
