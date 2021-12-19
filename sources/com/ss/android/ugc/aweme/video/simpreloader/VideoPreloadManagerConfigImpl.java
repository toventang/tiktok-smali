package com.ss.android.ugc.aweme.video.simpreloader;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.AwemeApplicationServiceImpl;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.player.sdk.api.b;
import com.ss.android.ugc.aweme.player.sdk.api.d;
import com.ss.android.ugc.aweme.setting.model.MLModel;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.aweme.video.b.k;
import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.aweme.video.preload.api.a;
import com.ss.android.ugc.aweme.video.preload.api.c;
import com.ss.android.ugc.aweme.video.preload.api.e;
import com.ss.android.ugc.aweme.video.preload.api.f;
import com.ss.android.ugc.aweme.video.preload.api.g;
import com.ss.android.ugc.aweme.video.preload.api.j;
import com.ss.android.ugc.aweme.video.simplayer.o;
import com.ss.android.ugc.playerkit.model.u;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import com.ss.android.ugc.playerkit.videoview.d.h;

public class VideoPreloadManagerConfigImpl implements IVideoPreloadConfig {
    static {
        Covode.recordClassIndex(94192);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public h createVideoUrlProcessor() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public b getBitrateSelectListener() {
        return null;
    }

    public d getBitrateSelector() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public u getSelectedBitrateForColdBoot(i iVar) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean useSyncPreloadStyle() {
        return k.f143294a;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public a getAppLog() {
        return new b();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public com.ss.android.ugc.aweme.video.preload.api.b getCacheHelper() {
        return new c();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public IPreloaderExperiment getExperiment() {
        return new PreloaderExperiment();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public c getMLServiceSpeedModel() {
        return new c() {
            /* class com.ss.android.ugc.aweme.video.simpreloader.VideoPreloadManagerConfigImpl.AnonymousClass1 */

            static {
                Covode.recordClassIndex(94193);
            }

            @Override // com.ss.android.ugc.aweme.video.preload.api.c
            public final Integer a() {
                int i2;
                MLModel mLModel = com.ss.android.ugc.aweme.ml.a.f110295a.f110296b;
                if (mLModel == null) {
                    return null;
                }
                if (mLModel.params == null || mLModel.params.length <= 0) {
                    i2 = 500;
                } else {
                    i2 = mLModel.params[0];
                }
                return Integer.valueOf(i2);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public com.ss.android.ugc.aweme.video.preload.api.d getMusicService() {
        return new com.ss.android.ugc.aweme.video.preload.api.d() {
            /* class com.ss.android.ugc.aweme.video.simpreloader.VideoPreloadManagerConfigImpl.AnonymousClass2 */

            static {
                Covode.recordClassIndex(94194);
            }

            @Override // com.ss.android.ugc.aweme.video.preload.api.d
            public final int a() {
                return MusicService.m().g();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public g getPlayerCommonParamManager() {
        return new f();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public f getPlayerEventReportService() {
        return new g();
    }

    public com.ss.android.ugc.aweme.video.preload.api.h getPreloadStrategy() {
        return 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0005: RETURN  
              (wrap: com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig$1 : 0x0002: CONSTRUCTOR  (r0v0 com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig$1) = (r1v0 'this' com.ss.android.ugc.aweme.video.simpreloader.VideoPreloadManagerConfigImpl A[IMMUTABLE_TYPE, THIS]) call: com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig.1.<init>(com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig):void type: CONSTRUCTOR)
             in method: com.ss.android.ugc.aweme.video.simpreloader.VideoPreloadManagerConfigImpl.getPreloadStrategy():com.ss.android.ugc.aweme.video.preload.api.h, file: classes4.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  (r0v0 com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig$1) = (r1v0 'this' com.ss.android.ugc.aweme.video.simpreloader.VideoPreloadManagerConfigImpl A[IMMUTABLE_TYPE, THIS]) call: com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig.1.<init>(com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.video.simpreloader.VideoPreloadManagerConfigImpl.getPreloadStrategy():com.ss.android.ugc.aweme.video.preload.api.h, file: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:313)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 18 more
            */
        /*
            this = this;
            com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig$1 r0 = new com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig$1
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.simpreloader.VideoPreloadManagerConfigImpl.getPreloadStrategy():com.ss.android.ugc.aweme.video.preload.api.h");
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public e getSpeedManager() {
        return new e();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public com.ss.android.ugc.aweme.video.preload.api.i getStorageManager() {
        return new j();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public j getVideoCachePlugin() {
        return new k();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean isPlayerPreferchCaption() {
        return com.ss.android.ugc.aweme.player.e.c();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean isPlayerPreferchTtsAudio() {
        return com.ss.android.ugc.aweme.player.e.b();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean isPreloadV3Enabled() {
        if (com.bytedance.ies.abmock.b.a().a(true, "player_preload_v3", 0) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public int playerPreferchTtsAudioSize() {
        return com.bytedance.ies.abmock.b.a().a(true, "player_preferch_tts_audio_size", 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean canPreload() {
        if (!AwemeApplicationServiceImpl.c().a() || com.bytedance.ies.abmock.b.a().a(true, "enable_preload_background", 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public com.ss.android.ugc.aweme.player.sdk.api.g getNetClient() {
        return new o(com.bytedance.ies.ugc.aweme.network.ext.a.a(com.a.a("https://%s/", new Object[]{"tiktokv.com"})));
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean isDashABREnabled() {
        if (com.ss.android.ugc.aweme.player.e.f115091d == null) {
            boolean z = true;
            if (com.bytedance.ies.abmock.b.a().a(true, "player_abr_enable", 0) != 1) {
                z = false;
            }
            com.ss.android.ugc.aweme.player.e.f115091d = Boolean.valueOf(z);
        }
        return com.ss.android.ugc.aweme.player.e.f115091d.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public com.ss.android.ugc.aweme.player.sdk.b.b getProperResolution(String str, com.ss.android.ugc.aweme.player.sdk.b.c cVar) {
        if (VideoBitRateABManager.f143220a.d()) {
            return com.ss.android.ugc.aweme.simkit.d.a().c().a(str, cVar);
        }
        return null;
    }
}
