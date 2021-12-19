package com.ss.android.ugc.aweme.services.external.ability;

import android.content.Context;
import androidx.lifecycle.m;
import b.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.shortvideo.util.bo;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.a.b;
import h.z;
import java.util.List;
import java.util.Map;

public interface IAVEffectService {

    public interface EffectPlatformLoader {
        static {
            Covode.recordClassIndex(79650);
        }

        void load(g<f, Void> gVar);
    }

    public interface IAVEffectReadyCallback<T> {
        static {
            Covode.recordClassIndex(79651);
        }

        void finish(T t);
    }

    public interface ResourceFinder {
        static {
            Covode.recordClassIndex(79652);
        }

        long createNativeResourceFinder(long j2);

        void release(long j2);
    }

    static {
        Covode.recordClassIndex(79649);
    }

    void buildEffectPlatform(Context context, IAVEffectReadyCallback<f> iAVEffectReadyCallback, b<? super EffectPlatformBuilder, z> bVar);

    void buildEffectPlatform(Context context, boolean z, IAVEffectReadyCallback<f> iAVEffectReadyCallback, b<? super EffectPlatformBuilder, z> bVar);

    void clearCacheInFTC();

    void fetchEffectListResource(List<String> list, Map<String, String> map, boolean z, f fVar, IFetchEffectListListener iFetchEffectListListener);

    void fetchEffectModel(String[] strArr, IAVEffectReadyCallback<String[]> iAVEffectReadyCallback);

    void fetchEffectResource(String str, boolean z, Map<String, String> map, f fVar, IFetchEffectListener iFetchEffectListener);

    bo getVideoCoverBitmapCache(m mVar, String str, int i2, int i3, int i4, float f2);

    boolean isEffectControlGame(Effect effect);

    void provideResourceFinder(IAVEffectReadyCallback<ResourceFinder> iAVEffectReadyCallback);
}
