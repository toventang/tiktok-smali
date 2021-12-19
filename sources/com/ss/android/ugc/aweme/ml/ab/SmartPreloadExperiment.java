package com.ss.android.ugc.aweme.ml.ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.setting.model.MLModel;
import java.util.Arrays;

public interface SmartPreloadExperiment {

    /* renamed from: a  reason: collision with root package name */
    public static final SmartPreloadModel f110333a = null;

    static {
        Covode.recordClassIndex(70836);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static boolean f110334a;

        /* renamed from: b  reason: collision with root package name */
        public static SmartPreloadModel f110335b;

        /* renamed from: c  reason: collision with root package name */
        public static int f110336c = 5;

        /* renamed from: d  reason: collision with root package name */
        public static int f110337d;

        /* renamed from: e  reason: collision with root package name */
        public static int f110338e;

        /* renamed from: f  reason: collision with root package name */
        public static boolean f110339f;

        /* renamed from: g  reason: collision with root package name */
        public static boolean f110340g;

        /* renamed from: h  reason: collision with root package name */
        public static long f110341h;

        /* renamed from: i  reason: collision with root package name */
        public static int f110342i;

        static {
            Covode.recordClassIndex(70838);
        }
    }

    public static class SmartPreloadModel extends MLModel {
        @c(a = "embedding_range")
        public int embeddingRange;
        @c(a = "features")
        public InputFeaturesConfig features;
        @c(a = "not_repeat")
        public boolean notRepeat;
        @c(a = "not_run_when_pause")
        public boolean notRunWhenPause;
        @c(a = "real")
        public OnePlaytimePredictRealConfig realConfig;
        @c(a = "run_delay")
        public int runDelay;
        @c(a = "skip_count")
        public int skipCount;
        @c(a = "track")
        public OneSmartDataTrackConfig track;

        static {
            Covode.recordClassIndex(70837);
        }

        @Override // com.ss.android.ugc.aweme.setting.model.MLModel
        public String toString() {
            return "SmartPreloadModel{embeddingRange=" + this.embeddingRange + ", skipCount=" + this.skipCount + ", notRunWhenPause=" + this.notRunWhenPause + ", notRepeat=" + this.notRepeat + ", runDelay=" + this.runDelay + ", scene='" + this.scene + '\'' + ", packageUrl='" + this.packageUrl + '\'' + ", type=" + this.type + ", params=" + Arrays.toString(this.params) + ", features=" + this.features + ", track=" + this.track + ", realConfig=" + this.realConfig + '}';
        }
    }
}
