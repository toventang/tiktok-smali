package com.ss.android.ugc.aweme.sticker.view.internal.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.p.d;
import com.ss.android.ugc.aweme.sticker.view.a.i;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.a.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;

public final class a implements i {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, Boolean> f136228a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<String> f136229b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final d f136230c;

    static {
        Covode.recordClassIndex(88974);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.i
    public final void a(int i2) {
    }

    public a(d dVar) {
        l.d(dVar, "");
        this.f136230c = dVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.i
    public final void a(String str) {
        for (String str2 : this.f136228a.keySet()) {
            HashMap<String, Boolean> hashMap = this.f136228a;
            l.b(str2, "");
            hashMap.put(str2, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.i
    public final void a(int i2, String str, b<? super Integer, ? extends Effect> bVar) {
        String adRawData;
        l.d(bVar, "");
        Effect effect = (Effect) bVar.invoke(Integer.valueOf(i2 + 1));
        if (effect != null && (adRawData = effect.getAdRawData()) != null && adRawData.length() != 0) {
            String effectId = effect.getEffectId();
            Boolean bool = this.f136228a.get(effectId);
            if (bool == null || !bool.booleanValue()) {
                this.f136230c.b(effect);
            }
            this.f136228a.put(effectId, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.i
    public final void a(int i2, int i3, String str, b<? super Integer, ? extends Effect> bVar) {
        String adRawData;
        l.d(bVar, "");
        this.f136229b.clear();
        int i4 = i3 + 1;
        for (int i5 = i2 + 1; i5 < i4; i5++) {
            Effect effect = (Effect) bVar.invoke(Integer.valueOf(i5));
            if (!(effect == null || (adRawData = effect.getAdRawData()) == null || adRawData.length() == 0)) {
                String effectId = effect.getEffectId();
                Boolean bool = this.f136228a.get(effectId);
                if (bool == null || !bool.booleanValue()) {
                    this.f136230c.b(effect);
                }
                this.f136228a.put(effectId, true);
                this.f136229b.add(effectId);
            }
        }
        for (String str2 : this.f136228a.keySet()) {
            if (!this.f136229b.contains(str2)) {
                HashMap<String, Boolean> hashMap = this.f136228a;
                l.b(str2, "");
                hashMap.put(str2, false);
            }
        }
    }
}
