package com.ss.android.ugc.aweme.donation.detail;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class DonationVH$bind$$inlined$apply$lambda$1 extends ForegroundColorSpan {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f82966a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f82967b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f82968c;

    static {
        Covode.recordClassIndex(51730);
    }

    public final void updateDrawState(TextPaint textPaint) {
        l.d(textPaint, "");
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DonationVH$bind$$inlined$apply$lambda$1(int i2, f fVar, String str, String str2) {
        super(i2);
        this.f82966a = fVar;
        this.f82967b = str;
        this.f82968c = str2;
    }
}
