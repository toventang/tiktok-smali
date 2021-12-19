package com.ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;

public class EffectQRCode {
    private String qrCodeText;

    static {
        Covode.recordClassIndex(102455);
    }

    public EffectQRCode() {
        this(null, 1, null);
    }

    public String getQrCodeText() {
        return this.qrCodeText;
    }

    public void setQrCodeText(String str) {
        l.c(str, "");
        this.qrCodeText = str;
    }

    public EffectQRCode(String str) {
        l.c(str, "");
        this.qrCodeText = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectQRCode(String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str);
    }
}
