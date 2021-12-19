package com.ss.android.ugc.gamora.editor.sticker.read;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import h.f.b.l;
import java.util.ArrayList;

public final class c {
    static {
        Covode.recordClassIndex(96727);
    }

    public static final ArrayList<b> a(EffectChannelResponse effectChannelResponse) {
        if (effectChannelResponse == null) {
            return new ArrayList<>();
        }
        ArrayList<b> arrayList = new ArrayList<>();
        for (T t : effectChannelResponse.getAllCategoryEffects()) {
            try {
                e eVar = (e) com.ss.android.ugc.tools.c.f149148c.a(t.getExtra(), e.class);
                if (eVar != null) {
                    String name = t.getName();
                    l.d(name, "");
                    eVar.f146906b = name;
                }
                if (eVar == null) {
                    eVar = new e(false, null, null, null, 63);
                }
                arrayList.add(new b(t, eVar));
            } catch (Exception e2) {
                com.ss.android.ugc.tools.c.f149151f.a(e2);
            }
        }
        return arrayList;
    }
}
