package com.ss.android.ugc.aweme.video.simplayer;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.player.e;
import com.ss.android.ugc.aweme.player.sdk.api.b;
import com.ss.android.ugc.aweme.player.sdk.api.d;
import com.ss.android.ugc.aweme.player.sdk.b.c;
import com.ss.android.ugc.aweme.video.b.q;
import com.ss.android.ugc.aweme.video.config.ISimPlayerConfig;
import com.ss.android.ugc.aweme.video.preload.s;
import com.ss.android.ugc.aweme.video.v;
import com.ss.android.ugc.playerkit.model.m;
import com.ss.android.ugc.playerkit.model.u;
import com.ss.android.ugc.playerkit.simapicommon.a;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import com.ss.android.ugc.playerkit.videoview.d.f;
import com.ss.android.ugc.playerkit.videoview.d.g;
import com.ss.android.ugc.playerkit.videoview.d.h;
import java.io.File;
import java.net.URI;
import java.util.List;
import org.json.JSONObject;

public class PlayerConfigImpl implements ISimPlayerConfig {
    static {
        Covode.recordClassIndex(94125);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public f createAudioUrlProcessor() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public g createSubUrlProcessor() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public h createVideoUrlProcessor() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean disableSleepResume(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public void downloadFile(String str, String str2, String str3, String str4) {
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean enableByteVc1FailCheckCountPolicy() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean enableFileIoOpt(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean enableForceUseH264CheckPolicy() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean enableForceUseH264Global() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public b getBitrateSelectListener() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public d getBitrateSelector() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public u getDashProcessUrlData(String str, boolean z, long j2) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public int getPlayerType() {
        return 0;
    }

    public boolean ignoreExoReleaseState() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean isPluginApplied() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public int getAverageSpeedInKBps() {
        return com.ss.android.ugc.h.g.f();
    }

    public ISimPlayerConfig.a getPreRenderConfig() {
        return 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0005: RETURN  
              (wrap: com.ss.android.ugc.aweme.video.config.ISimPlayerConfig$1 : 0x0002: CONSTRUCTOR  (r0v0 com.ss.android.ugc.aweme.video.config.ISimPlayerConfig$1) = (r1v0 'this' com.ss.android.ugc.aweme.video.simplayer.PlayerConfigImpl A[IMMUTABLE_TYPE, THIS]) call: com.ss.android.ugc.aweme.video.config.ISimPlayerConfig.1.<init>(com.ss.android.ugc.aweme.video.config.ISimPlayerConfig):void type: CONSTRUCTOR)
             in method: com.ss.android.ugc.aweme.video.simplayer.PlayerConfigImpl.getPreRenderConfig():com.ss.android.ugc.aweme.video.config.ISimPlayerConfig$a, file: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  (r0v0 com.ss.android.ugc.aweme.video.config.ISimPlayerConfig$1) = (r1v0 'this' com.ss.android.ugc.aweme.video.simplayer.PlayerConfigImpl A[IMMUTABLE_TYPE, THIS]) call: com.ss.android.ugc.aweme.video.config.ISimPlayerConfig.1.<init>(com.ss.android.ugc.aweme.video.config.ISimPlayerConfig):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.video.simplayer.PlayerConfigImpl.getPreRenderConfig():com.ss.android.ugc.aweme.video.config.ISimPlayerConfig$a, file: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:313)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.video.config.ISimPlayerConfig, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 18 more
            */
        /*
            this = this;
            com.ss.android.ugc.aweme.video.config.ISimPlayerConfig$1 r0 = new com.ss.android.ugc.aweme.video.config.ISimPlayerConfig$1
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.simplayer.PlayerConfigImpl.getPreRenderConfig():com.ss.android.ugc.aweme.video.config.ISimPlayerConfig$a");
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean isPlayerPreferchCaption() {
        return e.c();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean isPlayerPreferchTtsAudio() {
        return e.b();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean isCache(i iVar) {
        return s.b().a(iVar);
    }

    public static File com_ss_android_ugc_aweme_video_simplayer_PlayerConfigImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getCacheDir(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107194b != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        com.ss.android.ugc.aweme.lancet.d.f107194b = cacheDir;
        return cacheDir;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public String getThumbCacheDir(Context context) {
        File b2;
        if (!com.ss.android.ugc.aweme.video.e.e()) {
            b2 = com_ss_android_ugc_aweme_video_simplayer_PlayerConfigImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getCacheDir(context);
            if (com.bytedance.u.d.a()) {
                b2 = com.bytedance.u.d.b(context, com.bytedance.u.f.PREFER_PRIVATE);
            }
        } else {
            b2 = com.ss.android.ugc.aweme.video.e.b(context);
            if (com.bytedance.u.d.a()) {
                b2 = com.bytedance.u.d.b(context, com.bytedance.u.f.PREFER_EXTERNAL);
            }
        }
        File file = new File(b2, "cache/thumbs");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean isHttpsVideoUrlModel(i iVar) {
        List<String> urlList;
        if (iVar == null || (urlList = iVar.getUrlList()) == null || urlList.size() <= 0) {
            return false;
        }
        for (String str : urlList) {
            if (!isCookieSharedUrl(a.f148866a, str)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public com.ss.android.ugc.aweme.player.sdk.c.d getISimPlayerPlaySessionConfig(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        com.ss.android.ugc.aweme.player.sdk.c.d dVar = new com.ss.android.ugc.aweme.player.sdk.c.d();
        dVar.f115399d = z;
        boolean z10 = false;
        if (!e.e() || !e.d()) {
            dVar.f115402g = com.bytedance.ies.abmock.b.a().a(true, "player_v3_pool_max_size", 5);
            dVar.f115403h = com.bytedance.ies.abmock.b.a().a(true, "player_v3_pool_core_size", 3);
            if (!e.f() || com.bytedance.ies.abmock.b.a().a(true, "player_v3_session_reuse_enable", 0) != 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            dVar.f115400e = z2;
            if (!e.f() || com.bytedance.ies.abmock.b.a().a(true, "player_v3_prerender_session_reuse_enable", 0) != 1) {
                z3 = false;
            } else {
                z3 = true;
            }
            dVar.f115405j = z3;
            dVar.f115404i = com.bytedance.ies.abmock.b.a().a(true, "player_v3_session_pool_size", 1);
        } else {
            dVar.f115402g = com.bytedance.ies.abmock.b.a().a(true, "player_v3_mtk_pool_max_size", 5);
            dVar.f115403h = com.bytedance.ies.abmock.b.a().a(true, "player_v3_mtk_pool_core_size", 3);
            if (!e.f() || com.bytedance.ies.abmock.b.a().a(true, "player_v3_mtk_session_reuse_enable", 0) != 1) {
                z7 = false;
            } else {
                z7 = true;
            }
            dVar.f115400e = z7;
            dVar.f115404i = com.bytedance.ies.abmock.b.a().a(true, "player_v3_mtk_session_pool_size", 1);
            if (com.bytedance.ies.abmock.b.a().a(true, "player_v3_mtk_bytevc1_reuse_enable", 0) == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            dVar.p = z8;
            if (!e.f() || com.bytedance.ies.abmock.b.a().a(true, "player_v3_prerender_session_reuse_enable", 0) != 1) {
                z9 = false;
            } else {
                z9 = true;
            }
            dVar.f115405j = z9;
            dVar.o = true;
        }
        if (com.bytedance.ies.abmock.b.a().a(true, "player_v3_session_reuse_codec_type_enable", 0) == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        dVar.f115401f = z4;
        if (com.bytedance.ies.abmock.b.a().a(true, "player_v3_single_reuse_h264_enable", 0) == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        dVar.f115407l = z5;
        if (com.bytedance.ies.abmock.b.a().a(true, "player_v3_session_reuse_refactor_enable", 0) == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        dVar.n = z6;
        if (!z) {
            if (com.bytedance.ies.abmock.b.a().a(true, "player_shadow_mode_enable", 0) == 1) {
                z10 = true;
            }
            dVar.q = z10;
        }
        if (q.a()) {
            com.ss.android.ugc.aweme.bm.b.a("SimPlayerBuilder", "PlayerManager con singleThreadMode:" + dVar.f115399d + ", maxPoolSize:" + dVar.f115402g + ", corePoolSize:" + dVar.f115403h + ", enableSessionPool:" + dVar.f115400e + ", sessionPoolSize:" + dVar.f115404i + ", enableSameCodecSessionReuse:" + dVar.f115401f + ", enableH264SingleSessionReuse:" + dVar.f115407l + ", enableSessionReuseRefactor:" + dVar.n);
        }
        return dVar;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public com.ss.android.ugc.aweme.player.sdk.b.b getProperResolution(String str, c cVar) {
        return com.ss.android.ugc.aweme.simkit.d.a().c().a(str, cVar);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public i getVideoPlayAddr(com.ss.android.ugc.playerkit.simapicommon.a.h hVar, m.e eVar) {
        if (hVar == null) {
            return null;
        }
        if (shouldPlayInBytevc1(hVar, eVar)) {
            return hVar.getPlayAddrBytevc1();
        }
        return hVar.getPlayAddrH264();
    }

    public boolean shouldPlayInBytevc1(com.ss.android.ugc.playerkit.simapicommon.a.h hVar, m.e eVar) {
        if (!com.ss.android.ugc.playerkit.b.a(hVar.getPlayAddrBytevc1()) || !com.ss.android.ugc.playerkit.b.a(eVar)) {
            return false;
        }
        return true;
    }

    public boolean isCookieSharedUrl(Context context, String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("https://")) {
            try {
                if (com.bytedance.ttnet.a.a.a(context).d(URI.create(str).getHost()) != null) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public void recordMiscLog(Context context, String str, JSONObject jSONObject) {
        AppLog.recordMiscLog(context, str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public m getPlayerConfig(m.e eVar, boolean z, boolean z2) {
        return a.a(eVar, z, z2);
    }

    private JSONObject getPrepareOrFirstFrameExtraJSON(long j2, boolean z, boolean z2) {
        com.ss.android.ugc.aweme.app.f.c a2 = new com.ss.android.ugc.aweme.app.f.c().a("duration", String.valueOf(j2));
        a2.a("is_cache", Boolean.valueOf(z));
        a2.a("bytevc1", Boolean.valueOf(z2));
        a2.a("video_duration", Long.valueOf(v.O().j()));
        com.ss.android.ugc.aweme.video.util.c.a(a2);
        return a2.a();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public void onRecordPrepareTime(String str, long j2, String str2, boolean z, boolean z2) {
        n.a(str, getPrepareOrFirstFrameExtraJSON(j2, z, z2));
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public void onRecordFirstFrameTime(String str, long j2, String str2, boolean z, boolean z2) {
        r.onEvent(MobClick.obtain().setEventName(str2).setLabelName("perf_monitor").setExtValueLong(j2));
        n.a(str, getPrepareOrFirstFrameExtraJSON(j2, z, z2));
    }
}
