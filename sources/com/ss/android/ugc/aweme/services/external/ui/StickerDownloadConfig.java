package com.ss.android.ugc.aweme.services.external.ui;

import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.a.b;
import h.f.b.g;
import h.f.b.l;
import h.z;

public final class StickerDownloadConfig {
    public static final Companion Companion = new Companion(null);
    private int enterFromType = 10002;
    private b<? super Integer, z> onFail;
    private a<z> onSuccess;
    private final String region;
    private final String stickerId;
    private Integer type = 0;

    static {
        Covode.recordClassIndex(79718);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(79719);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final int getEnterFromType() {
        return this.enterFromType;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.Integer, h.z>, h.f.a.b<java.lang.Integer, h.z> */
    public final b<Integer, z> getOnFail() {
        return this.onFail;
    }

    public final a<z> getOnSuccess() {
        return this.onSuccess;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final Integer getType() {
        return this.type;
    }

    public final void setEnterFromType(int i2) {
        this.enterFromType = i2;
    }

    public final void setOnFail(b<? super Integer, z> bVar) {
        this.onFail = bVar;
    }

    public final void setOnSuccess(a<z> aVar) {
        this.onSuccess = aVar;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public StickerDownloadConfig(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.stickerId = str;
        this.region = str2;
    }
}
