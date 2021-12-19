package com.ss.android.ugc.asve.editor.nle;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.bj;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f62051a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(38148);
    }

    public static bj a() {
        bj bjVar = new bj();
        bjVar.a(new bj.c<>(bj.a.ConfigID_GraphRefactor, true));
        bjVar.a(new bj.c<>(bj.a.ConfigID_EnableAudioGBURefactor, false));
        bjVar.a(new bj.c<>(bj.a.ConfigID_EnableGlobalEffect, false));
        bjVar.a(new bj.c<>(bj.a.ConfigID_EnableFileInfoCache, false));
        bjVar.a(new bj.c<>(bj.a.ConfigID_PinRefactor, false));
        bjVar.a(new bj.c<>(bj.a.ConfigID_UseImageAllocator, true));
        bjVar.a(new bj.c<>(bj.a.ConfigID_UseMultiEffectOpt, true));
        bjVar.a(new bj.c<>(bj.a.ConfigID_UseGaussianOpt, true));
        bjVar.a(new bj.c<>(bj.a.ConfigID_UseNewEngineEffectOpt, 2));
        bjVar.a(new bj.c<>(bj.a.ConfigID_UseRefaCanvasWrap, true));
        bjVar.a(new bj.c<>(bj.a.ConfigID_MaxSoftwareVideoReaderCount, 7));
        bjVar.a(new bj.c<>(bj.a.ConfigID_MaxSoftwareFreeReaderCount, 2));
        bjVar.a(new bj.c<>(bj.a.ConfigID_MaxImageTextureBufferCount, 10));
        bjVar.a(new bj.c<>(bj.a.ConfigID_MaxImageTextureBufferWidth, 2200));
        bjVar.a(new bj.c<>(bj.a.ConfigID_MaxImageTextureBufferHeight, 2200));
        bjVar.a(new bj.c<>(bj.a.ConfigID_ForceDropFrameWithoutAudio, true));
        bjVar.a(new bj.c<>(bj.a.ConfigID_MaxAudioReaderCount, Integer.MAX_VALUE));
        bjVar.a(new bj.c<>(bj.a.ConfigID_MaxTexturePoolCount, 50));
        bjVar.a(new bj.c<>(bj.a.ConfigID_TexturePoolCleanCount, 35));
        bjVar.a(new bj.c<>(bj.a.ConfigID_UseEffectTransiton, true));
        bjVar.a(new bj.c<>(bj.a.ConfigID_ForceDetectFace, true));
        bjVar.a(new bj.c<>(bj.a.ConfigID_EnableStickerAmazing, true));
        bjVar.a(new bj.c<>(bj.a.ConfigID_LoadImageOptimize, true));
        bjVar.a(new bj.c<>(bj.a.ConfigID_EnableHighSpeedChange, true));
        return bjVar;
    }
}
