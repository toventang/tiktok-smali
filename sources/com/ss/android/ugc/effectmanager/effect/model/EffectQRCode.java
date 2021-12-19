package com.ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectQRCodeTemplate;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class EffectQRCode extends EffectQRCodeTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.EffectQRCode kQrcode;

    static {
        Covode.recordClassIndex(95409);
    }

    public EffectQRCode() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectQRCodeTemplate
    public final com.ss.ugc.effectplatform.model.EffectQRCode getKQrcode() {
        return this.kQrcode;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectQRCode
    public final String getQrCodeText() {
        String qrCodeText;
        com.ss.ugc.effectplatform.model.EffectQRCode kQrcode2 = getKQrcode();
        if (kQrcode2 == null || (qrCodeText = kQrcode2.getQrCodeText()) == null) {
            return super.getQrCodeText();
        }
        return qrCodeText;
    }

    public EffectQRCode(com.ss.ugc.effectplatform.model.EffectQRCode effectQRCode) {
        super(effectQRCode);
        String qrCodeText;
        this.kQrcode = effectQRCode;
        com.ss.ugc.effectplatform.model.EffectQRCode kQrcode2 = getKQrcode();
        if (kQrcode2 != null && (qrCodeText = kQrcode2.getQrCodeText()) != null) {
            super.setQrCodeText(qrCodeText);
        }
    }

    @Override // com.ss.ugc.effectplatform.model.EffectQRCode
    public final void setQrCodeText(String str) {
        l.c(str, "");
        com.ss.ugc.effectplatform.model.EffectQRCode kQrcode2 = getKQrcode();
        if (kQrcode2 != null) {
            kQrcode2.setQrCodeText(str);
        }
        super.setQrCodeText(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectQRCode(com.ss.ugc.effectplatform.model.EffectQRCode effectQRCode, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : effectQRCode);
    }
}
