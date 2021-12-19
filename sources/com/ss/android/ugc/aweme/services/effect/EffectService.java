package com.ss.android.ugc.aweme.services.effect;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.draft.model.d;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.port.in.bb;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.u.a;
import com.ss.android.ugc.aweme.sticker.m;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EffectService implements IEffectService {
    private static EffectService sInstance;
    private File MV_RES_CACHE_FILE = new File(c.D.d().a().b());

    static {
        Covode.recordClassIndex(79610);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public String getLiveStickerPannel() {
        return "livestreaming";
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public String getCacheDir() {
        return EffectPlatform.f89012a.getAbsolutePath();
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public ArrayList<String> getDraftEffectList() {
        return EffectPlatform.e();
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public String getModelCacheDir() {
        return EffectPlatform.f89013b.getAbsolutePath();
    }

    private EffectService() {
    }

    public static EffectService getInstance() {
        MethodCollector.i(12272);
        if (sInstance == null) {
            synchronized (EffectService.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new EffectService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12272);
                    throw th;
                }
            }
        }
        EffectService effectService = sInstance;
        MethodCollector.o(12272);
        return effectService;
    }

    private com.ss.android.ugc.aweme.sticker.g.c getStickerFetch(f fVar) {
        return m.a(fVar);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public f createMvEffectPlatform(Context context) {
        return createMvEffectPlatform(context, null);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public f createFontEffectPlatform(Context context) {
        return com.ss.android.ugc.aweme.effectplatform.c.a(context, new EffectService$$Lambda$2(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z lambda$createFontEffectPlatform$2$EffectService(EffectPlatformBuilder effectPlatformBuilder) {
        effectPlatformBuilder.setCacheDir(new File(i.f115645a.getFilesDir(), "font"));
        setFontEffectPlatformCacheSize(effectPlatformBuilder);
        return z.f158842a;
    }

    private void setFontEffectPlatformCacheSize(EffectPlatformBuilder effectPlatformBuilder) {
        if (b.a().a(true, "creative_tools_open_font_cache", false)) {
            effectPlatformBuilder.setEffectMaxCacheSize(b.a().a(true, "creative_tool_font_cache_threshold", 838860800L) * 1048576);
        }
    }

    private void setMvEffectPlatformCacheSize(EffectPlatformBuilder effectPlatformBuilder) {
        if (b.a().a(true, "creative_tools_open_mv_cache", false)) {
            effectPlatformBuilder.setEffectMaxCacheSize(b.a().a(true, "creative_tool_mv_cache_threshold", 838860800L) * 1048576);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public f createEffectPlatform(Context context, String str) {
        return com.ss.android.ugc.aweme.effectplatform.c.a(context, new EffectService$$Lambda$0(str));
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public f createMvEffectPlatform(Context context, String str) {
        return com.ss.android.ugc.aweme.effectplatform.c.a(context, new EffectService$$Lambda$1(this, str));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z lambda$createMvEffectPlatform$1$EffectService(String str, EffectPlatformBuilder effectPlatformBuilder) {
        if (str != null) {
            effectPlatformBuilder.setRegion(str);
        }
        effectPlatformBuilder.setCacheDir(this.MV_RES_CACHE_FILE);
        setMvEffectPlatformCacheSize(effectPlatformBuilder);
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public void fetchEffectWithMusicBind(f fVar, String str, String str2, IFetchEffectListener iFetchEffectListener) {
        getStickerFetch(fVar).a(str, str2, iFetchEffectListener);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public void fetchEffectWithMusicBind(f fVar, String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
        getStickerFetch(fVar).a(str, map, iFetchEffectListener);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public void getVideoCoverByCallback(List<EffectPointModel> list, FilterBean filterBean, float f2, int i2, boolean z, com.ss.android.ugc.aweme.draft.model.c cVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        a.a(list, com.ss.android.ugc.aweme.filter.c.b(filterBean), f2, i2, z, d.h(cVar), onVideoCoverCallback);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public void getVideoCoverByCallback(final List<EffectPointModel> list, final String str, final float f2, final int i2, final boolean z, final EditPreviewInfo editPreviewInfo, final IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        c.H.a(new bb.a() {
            /* class com.ss.android.ugc.aweme.services.effect.EffectService.AnonymousClass1 */

            static {
                Covode.recordClassIndex(79614);
            }

            public void onCancel() {
            }

            @Override // com.ss.android.ugc.aweme.port.in.bb.a
            public void onSuccess() {
                a.a(list, str, f2, i2, z, editPreviewInfo, onVideoCoverCallback);
            }
        });
    }
}
