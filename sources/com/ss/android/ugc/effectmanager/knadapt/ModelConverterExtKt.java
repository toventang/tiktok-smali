package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.FetchModelType;
import com.ss.ugc.effectplatform.a;
import com.ss.ugc.effectplatform.model.algorithm.b;
import h.f.b.l;
import h.n;

public final class ModelConverterExtKt {

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            Covode.recordClassIndex(95584);
            int[] iArr = new int[b.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[b.ORIGIN.ordinal()] = 1;
            iArr[b.ZIP.ordinal()] = 2;
            int[] iArr2 = new int[FetchModelType.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[FetchModelType.ORIGIN.ordinal()] = 1;
            iArr2[FetchModelType.ZIP.ordinal()] = 2;
            int[] iArr3 = new int[DownloadableModelConfig.ModelFileEnv.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[DownloadableModelConfig.ModelFileEnv.TEST.ordinal()] = 1;
            iArr3[DownloadableModelConfig.ModelFileEnv.ONLINE.ordinal()] = 2;
        }
    }

    static {
        Covode.recordClassIndex(95583);
    }

    public static final b toKNFetchModelType(FetchModelType fetchModelType) {
        l.c(fetchModelType, "");
        int i2 = WhenMappings.$EnumSwitchMapping$1[fetchModelType.ordinal()];
        if (i2 == 1) {
            return b.ORIGIN;
        }
        if (i2 == 2) {
            return b.ZIP;
        }
        throw new n();
    }

    public static final a.c toKNModel(DownloadableModelConfig.ModelFileEnv modelFileEnv) {
        l.c(modelFileEnv, "");
        int i2 = WhenMappings.$EnumSwitchMapping$2[modelFileEnv.ordinal()];
        if (i2 == 1) {
            return a.c.TEST;
        }
        if (i2 == 2) {
            return a.c.ONLINE;
        }
        throw new n();
    }

    public static final FetchModelType toOldFetchModelType(b bVar) {
        l.c(bVar, "");
        int i2 = WhenMappings.$EnumSwitchMapping$0[bVar.ordinal()];
        if (i2 == 1) {
            return FetchModelType.ORIGIN;
        }
        if (i2 == 2) {
            return FetchModelType.ZIP;
        }
        throw new n();
    }
}
