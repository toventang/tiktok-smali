package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bitrateselector.a.e;
import com.ss.android.ugc.aweme.player.sdk.b.c;
import com.ss.android.ugc.aweme.simkit.api.b;
import com.ss.android.ugc.aweme.simkit.d;
import com.ss.android.ugc.playerkit.simapicommon.a.i;

public final class w implements b {

    /* renamed from: a  reason: collision with root package name */
    private b f133576a;

    static {
        Covode.recordClassIndex(87381);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final w f133577a = new w((byte) 0);

        static {
            Covode.recordClassIndex(87382);
        }
    }

    private w() {
        int bitrateBusinessType = d.a().b().getCommonConfig().getBitrateBusinessType();
        if (bitrateBusinessType == 1) {
            this.f133576a = new m(e.a(1).build());
        } else if (bitrateBusinessType != 2) {
            this.f133576a = new o();
        } else if (e.a(2) == null) {
            this.f133576a = new m(e.a(1).build());
            if (com.ss.android.ugc.playerkit.simapicommon.a.a().isDebug()) {
                throw new RuntimeException("no runtime cloud type bitrateselector module");
            }
        } else {
            this.f133576a = new m(e.a(2).build());
        }
    }

    /* synthetic */ w(byte b2) {
        this();
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.b
    public final com.ss.android.ugc.aweme.player.sdk.b.b a(String str, c cVar) {
        return this.f133576a.a(str, cVar);
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.b
    public final com.ss.android.ugc.f.a.a.a.a.c a(i iVar, boolean z) {
        return this.f133576a.a(iVar, z);
    }
}
