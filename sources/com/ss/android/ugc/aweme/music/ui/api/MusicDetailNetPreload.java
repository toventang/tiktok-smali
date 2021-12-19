package com.ss.android.ugc.aweme.music.ui.api;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.b.c;
import com.bytedance.ies.powerpreload.b.i;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.music.api.MusicDetailApi;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import h.f.b.l;
import java.util.concurrent.Future;

public final class MusicDetailNetPreload implements c<MusicDetailApi.DetailApi, Future<MusicDetail>> {
    static {
        Covode.recordClassIndex(71919);
    }

    @Override // com.bytedance.ies.powerpreload.b.c
    public final i getPreloadStrategy(Bundle bundle) {
        return new i(0, Api.f66569d, false, 5);
    }

    @Override // com.bytedance.ies.powerpreload.b.c
    public final boolean handleException(Exception exc) {
        l.d(exc, "");
        exc.printStackTrace();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r3 == null) goto L_0x0021;
     */
    @Override // com.bytedance.ies.powerpreload.b.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean enable(android.os.Bundle r8) {
        /*
            r7 = this;
            java.lang.String r1 = ""
            if (r8 == 0) goto L_0x000c
            java.lang.String r0 = "id"
            java.lang.String r6 = r8.getString(r0)
            if (r6 != 0) goto L_0x000d
        L_0x000c:
            r6 = r1
        L_0x000d:
            h.f.b.l.b(r6, r1)
            r5 = 0
            if (r8 == 0) goto L_0x0045
            java.lang.String r0 = "click_reason"
            int r4 = r8.getInt(r0)
            java.lang.String r0 = "partnerMusicId"
            java.lang.String r3 = r8.getString(r0)
            if (r3 != 0) goto L_0x0022
        L_0x0021:
            r3 = r1
        L_0x0022:
            h.f.b.l.b(r3, r1)
            if (r8 == 0) goto L_0x002f
            java.lang.String r0 = "partnerName"
            java.lang.String r2 = r8.getString(r0)
            if (r2 != 0) goto L_0x0030
        L_0x002f:
            r2 = r1
        L_0x0030:
            h.f.b.l.b(r2, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 1
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = java.lang.String.valueOf(r4)
            com.ss.android.ugc.aweme.music.model.MusicDetail r0 = com.ss.android.ugc.aweme.music.i.d.a(r6, r0)
            if (r0 != 0) goto L_0x0047
            return r1
        L_0x0045:
            r4 = 0
            goto L_0x0021
        L_0x0047:
            return r5
        L_0x0048:
            com.ss.android.ugc.aweme.music.model.MusicDetail r0 = com.ss.android.ugc.aweme.music.i.d.a(r3, r2)
            if (r0 != 0) goto L_0x004f
            return r1
        L_0x004f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.api.MusicDetailNetPreload.enable(android.os.Bundle):boolean");
    }

    /* Return type fixed from 'com.google.c.h.a.q<com.ss.android.ugc.aweme.music.model.MusicDetail>' to match base method */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r2 == null) goto L_0x0023;
     */
    @Override // com.bytedance.ies.powerpreload.b.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.Future<com.ss.android.ugc.aweme.music.model.MusicDetail> preload(android.os.Bundle r7, h.f.a.b<? super java.lang.Class<com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi>, ? extends com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi> r8) {
        /*
            r6 = this;
            java.lang.String r4 = ""
            h.f.b.l.d(r8, r4)
            if (r7 == 0) goto L_0x000f
            java.lang.String r0 = "id"
            java.lang.String r5 = r7.getString(r0)
            if (r5 != 0) goto L_0x0010
        L_0x000f:
            r5 = r4
        L_0x0010:
            h.f.b.l.b(r5, r4)
            if (r7 == 0) goto L_0x004b
            java.lang.String r0 = "click_reason"
            int r3 = r7.getInt(r0)
            java.lang.String r0 = "partnerMusicId"
            java.lang.String r2 = r7.getString(r0)
            if (r2 != 0) goto L_0x0024
        L_0x0023:
            r2 = r4
        L_0x0024:
            h.f.b.l.b(r2, r4)
            if (r7 == 0) goto L_0x0031
            java.lang.String r0 = "partnerName"
            java.lang.String r1 = r7.getString(r0)
            if (r1 != 0) goto L_0x0032
        L_0x0031:
            r1 = r4
        L_0x0032:
            h.f.b.l.b(r1, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x004d
            java.lang.Class<com.ss.android.ugc.aweme.music.api.MusicDetailApi$DetailApi> r0 = com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi.class
            java.lang.Object r0 = r8.invoke(r0)
            com.ss.android.ugc.aweme.music.api.MusicDetailApi$DetailApi r0 = (com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi) r0
            com.google.c.h.a.q r0 = r0.queryMusic(r5, r3)
            h.f.b.l.b(r0, r4)
            return r0
        L_0x004b:
            r3 = 0
            goto L_0x0023
        L_0x004d:
            java.lang.Class<com.ss.android.ugc.aweme.music.api.MusicDetailApi$DetailApi> r0 = com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi.class
            java.lang.Object r0 = r8.invoke(r0)
            com.ss.android.ugc.aweme.music.api.MusicDetailApi$DetailApi r0 = (com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi) r0
            com.google.c.h.a.q r0 = r0.queryPartnerMusic(r2, r1)
            h.f.b.l.b(r0, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.api.MusicDetailNetPreload.preload(android.os.Bundle, h.f.a.b):com.google.c.h.a.q");
    }
}
