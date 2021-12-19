package com.ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.EffectQRCode;
import h.f.b.g;

public class EffectQRCodeTemplate extends EffectQRCode {
    private final transient EffectQRCode kQrcode;

    static {
        Covode.recordClassIndex(95448);
    }

    public EffectQRCodeTemplate() {
        this(null, 1, null);
    }

    public EffectQRCode getKQrcode() {
        return this.kQrcode;
    }

    public EffectQRCodeTemplate(EffectQRCode effectQRCode) {
        super(null, 1, null);
        this.kQrcode = effectQRCode;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectQRCodeTemplate(EffectQRCode effectQRCode, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : effectQRCode);
    }
}
