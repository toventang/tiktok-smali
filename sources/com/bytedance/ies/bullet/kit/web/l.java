package com.bytedance.ies.bullet.kit.web;

import com.bytedance.covode.number.Covode;
import h.f.b.g;

public final class l extends Error {
    private final CharSequence description;
    private final int errorCode;
    private final CharSequence failingUrl;

    static {
        Covode.recordClassIndex(19237);
    }

    public final CharSequence getDescription() {
        return this.description;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final CharSequence getFailingUrl() {
        return this.failingUrl;
    }

    public l(int i2, CharSequence charSequence, CharSequence charSequence2) {
        super("WebLoadError, errorCode: " + i2 + ", desc: " + charSequence + ", failingUrl: " + charSequence2);
        this.errorCode = i2;
        this.description = charSequence;
        this.failingUrl = charSequence2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i2, CharSequence charSequence, CharSequence charSequence2, int i3, g gVar) {
        this(i2, (i3 & 2) != 0 ? null : charSequence, (i3 & 4) != 0 ? null : charSequence2);
    }
}
