package com.ss.android.ugc.aweme.video.simplayer;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.b.e;
import com.ss.android.ugc.aweme.video.config.a;
import com.ss.android.ugc.aweme.video.n;
import com.ss.android.ugc.aweme.video.x;
import com.ss.android.ugc.playerkit.exp.b;
import com.ss.android.ugc.playerkit.model.c;
import com.ss.android.ugc.playerkit.model.m;
import com.ss.android.ugc.playerkit.model.p;
import com.ss.android.ugc.playerkit.model.t;
import com.ss.android.ugc.playerkit.model.u;
import com.ss.android.ugc.playerkit.simapicommon.a.a;
import com.ss.android.ugc.playerkit.simapicommon.a.d;
import com.ss.android.ugc.playerkit.simapicommon.a.h;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    static boolean f143937a = true;

    /* renamed from: b  reason: collision with root package name */
    public static LruCache<i, u> f143938b;

    /* renamed from: c  reason: collision with root package name */
    static LruCache<d, com.ss.android.ugc.playerkit.model.s> f143939c;

    /* renamed from: d  reason: collision with root package name */
    static LruCache<a, t> f143940d;

    public static void a(p pVar, List<d> list) {
        if (!(list == null || list.isEmpty())) {
            if (pVar.f148796c == null) {
                pVar.f148796c = new ArrayList();
            }
            for (d dVar : list) {
                if (dVar != null) {
                    pVar.f148796c.add(a(dVar));
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(94167);
    }

    public static int a() {
        if (a.C3820a.f143369a.a().isPluginApplied() || com.ss.android.ugc.playerkit.simapicommon.a.d().isEnabled()) {
            return 1;
        }
        return 0;
    }

    private static com.ss.android.ugc.playerkit.a.d<t> a(com.ss.android.ugc.playerkit.simapicommon.a.a aVar) {
        return new w(aVar);
    }

    private static com.ss.android.ugc.playerkit.a.d<com.ss.android.ugc.playerkit.model.s> a(d dVar) {
        return new v(dVar);
    }

    public static i a(h hVar) {
        boolean z;
        if (hVar == null || !hVar.isColdBoot() || !b.i()) {
            z = false;
        } else {
            z = true;
        }
        if ((!com.ss.android.ugc.aweme.video.p.a() && !z) || hVar == null || hVar.getH264PlayAddr() == null || hVar.getPlayAddr() == null) {
            if (a.C3820a.f143369a.b().Bytevc1PlayAddrPolicyUnifyExperiment()) {
                i a2 = com.ss.android.ugc.aweme.video.p.a(hVar, m.e.TT);
                if (a2 != null) {
                    return a(hVar, a2);
                }
            } else if (hVar != null) {
                if (com.ss.android.ugc.playerkit.b.a(hVar.getPlayAddrBytevc1())) {
                    return a(hVar, hVar.getPlayAddrBytevc1());
                }
                return a(hVar, hVar.getPlayAddrH264());
            }
            return null;
        }
        hVar.setBitRate(null);
        hVar.getH264PlayAddr().setBitRate(null);
        hVar.getH264PlayAddr().setSourceId(hVar.getPlayAddr().getSourceId());
        return a(hVar, hVar.getH264PlayAddr());
    }

    public static float a(h hVar, String str) {
        if (hVar == null || TextUtils.isEmpty(hVar.getMeta()) || TextUtils.isEmpty(str)) {
            return Float.MIN_VALUE;
        }
        try {
            String optString = new JSONObject(hVar.getMeta()).optString(str, "");
            if (!TextUtils.isEmpty(optString)) {
                return Float.parseFloat(optString);
            }
        } catch (Exception e2) {
            if (!com.ss.android.ugc.playerkit.simapicommon.a.a().isDebug()) {
                e2.printStackTrace();
            } else {
                throw new RuntimeException(e2);
            }
        }
        return Float.MIN_VALUE;
    }

    private static i a(h hVar, i iVar) {
        if (!(iVar == null || hVar == null)) {
            iVar.setColdBoot(hVar.isColdBoot());
        }
        return iVar;
    }

    public static void a(p pVar, com.ss.android.ugc.playerkit.simapicommon.a.b bVar) {
        if (!(bVar == null || bVar.getCaptionInfos() == null || bVar.getCaptionInfos().isEmpty())) {
            if (pVar.f148797d == null) {
                pVar.f148797d = new ArrayList();
            }
            for (com.ss.android.ugc.playerkit.simapicommon.a.a aVar : bVar.getCaptionInfos()) {
                if (aVar != null) {
                    pVar.f148797d.add(a(aVar));
                }
            }
        }
    }

    public static com.ss.android.ugc.playerkit.a.d<u> a(String str, boolean z, long j2) {
        return new x(str, z, j2);
    }

    public static p a(i iVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, boolean z6, String str, String str2, boolean z7, boolean z8, boolean z9, x xVar, n nVar) {
        String str3;
        boolean z10;
        boolean z11;
        IALog d2 = com.ss.android.ugc.playerkit.simapicommon.a.d();
        StringBuilder sb = new StringBuilder("createNormalPrepareData aid:");
        if (iVar != null) {
            str3 = iVar.getSourceId();
        } else {
            str3 = "null";
        }
        d2.e("SimPlayerHelper", sb.append(str3).toString());
        boolean isAsyncInit = a.C3820a.f143369a.b().isAsyncInit();
        if (iVar == null) {
            return null;
        }
        final e a2 = com.ss.android.ugc.playerkit.d.d.a(iVar, null);
        a2.f115346l = z7;
        p pVar = new p(new u(z4, iVar, z7), new z(iVar), com.ss.android.ugc.playerkit.simapicommon.a.f148866a, iVar.getSourceId(), z, xVar, iVar.isVr(), iVar.isBytevc1(), c.f148702a.getRenderType(), new t(iVar), iVar.getUri(), !z2, isAsyncInit, a.C3820a.f143369a.b().get265DecodeType(), new Runnable() {
            /* class com.ss.android.ugc.aweme.video.simplayer.s.AnonymousClass1 */

            static {
                Covode.recordClassIndex(94168);
            }

            public final void run() {
                com.ss.android.ugc.aweme.player.sdk.api.d bitrateSelector = a.C3820a.f143369a.a().getBitrateSelector();
                if (bitrateSelector != null) {
                    bitrateSelector.a(a2);
                }
            }
        });
        pVar.f148798e = a2;
        pVar.v = a.C3820a.f143369a.b().frameWait();
        pVar.y = iVar.getBitRatedRatioUri();
        com.ss.android.ugc.playerkit.session.a.f148854a.a(pVar.y, iVar.getFileCheckSum());
        pVar.s = a();
        pVar.aE = a.C3820a.f143369a.b().isDirectUrlCheckInfoEnable();
        boolean z12 = false;
        if (f143937a) {
            f143937a = false;
            if (z3) {
                pVar.U = "pre";
            } else {
                pVar.U = "nor";
            }
        } else {
            pVar.U = null;
        }
        if (!TextUtils.isEmpty(str)) {
            pVar.U = str;
        }
        if (!TextUtils.isEmpty(xVar.getTag())) {
            pVar.U = xVar.getTag();
        }
        if (!TextUtils.isEmpty(str2)) {
            pVar.V = str2;
        }
        pVar.W = a.C3820a.f143369a.a().getAverageSpeedInKBps();
        if (!c.f148702a.isUseVideoTextureRenderer() || !z8) {
            z10 = false;
        } else {
            z10 = true;
        }
        pVar.H = z10;
        if (!z5) {
            z11 = true;
        } else if (a.C3820a.f143369a.a().isHttpsVideoUrlModel(iVar)) {
            z11 = true;
            pVar.I = true;
        } else {
            z11 = true;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("aid", iVar.getSourceId());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            com.ss.android.ugc.playerkit.simapicommon.a.b().monitorCommonLog("need_set_token_exception", jSONObject);
        }
        pVar.O = z6;
        pVar.G = i2;
        if (a.C3820a.f143369a.b().PlayeAbFixPrepareSeqTmpEnableExp() == z11) {
            z12 = true;
        }
        pVar.P = z12;
        pVar.Q = z9;
        pVar.Y = iVar.getaK();
        if (!(nVar == null || nVar.y == null)) {
            pVar.aa = z11;
            pVar.ab = nVar.y.f143494a;
            pVar.ac = nVar.y.f143495b;
        }
        pVar.ad = (int) iVar.getDuration();
        if (nVar != null) {
            pVar.af = Float.valueOf(a(nVar.f143482b, "loudness"));
            pVar.ag = Float.valueOf(a(nVar.f143482b, "peak"));
        }
        pVar.ae = Float.valueOf(a.C3820a.f143369a.b().getVolLoudUnity());
        pVar.ap = a.C3820a.f143369a.b().enableBufferTimeControl();
        pVar.aq = a.C3820a.f143369a.b().cacheDuration((int) iVar.getDuration());
        pVar.av = a.C3820a.f143369a.a().disableSleepResume(pVar.f148803j);
        pVar.M = iVar.isColdBoot();
        pVar.au = a.C3820a.f143369a.a().enableFileIoOpt(pVar.f148803j);
        pVar.aw = a.C3820a.f143369a.b().resumeFileIoBlockDurationThreshold();
        pVar.ax = a.C3820a.f143369a.b().memCacheVideoDurationThreshold();
        pVar.ay = a.C3820a.f143369a.b().enableSplitVideoAudioPlayback();
        return pVar;
    }
}
