package com.bytedance.android.livesdk.live.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class DefaultDonationStickerPosition {
    private static final a Companion = new a((byte) 0);
    public static final float DEFAULT_POSITION = 0.5f;
    @c(a = "x_ratio")
    private final float xRatio;
    @c(a = "y_ratio")
    private final float yRatio;

    public static final float getDEFAULT_POSITION() {
        return DEFAULT_POSITION;
    }

    static final class a {
        static {
            Covode.recordClassIndex(10465);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final float getXRatio() {
        return this.xRatio;
    }

    public final float getYRatio() {
        return this.yRatio;
    }

    public DefaultDonationStickerPosition() {
        float f2 = DEFAULT_POSITION;
        this.xRatio = f2;
        this.yRatio = f2;
    }

    static {
        Covode.recordClassIndex(10464);
    }
}
