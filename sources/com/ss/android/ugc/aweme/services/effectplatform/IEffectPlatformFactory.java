package com.ss.android.ugc.aweme.services.effectplatform;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import h.f.a.b;
import h.z;
import java.util.List;

public interface IEffectPlatformFactory {
    static {
        Covode.recordClassIndex(79619);
    }

    f create(EffectPlatformBuilder effectPlatformBuilder);

    f create(EffectConfiguration.Builder builder, b<? super EffectConfiguration, z> bVar, boolean z);

    EffectConfiguration.Builder createEffectConfigurationBuilder(EffectPlatformBuilder effectPlatformBuilder);

    List<Host> getDownloadableModelHosts();

    List<Host> getHosts();

    public static final class DefaultImpls {
        static {
            Covode.recordClassIndex(79620);
        }

        public static /* synthetic */ f create$default(IEffectPlatformFactory iEffectPlatformFactory, EffectConfiguration.Builder builder, b bVar, boolean z, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    z = false;
                }
                return iEffectPlatformFactory.create(builder, bVar, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
        }
    }
}
