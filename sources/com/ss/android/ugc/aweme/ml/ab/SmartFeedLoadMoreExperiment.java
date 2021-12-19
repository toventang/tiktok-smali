package com.ss.android.ugc.aweme.ml.ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.setting.model.MLModel;
import java.util.Arrays;

public interface SmartFeedLoadMoreExperiment {

    /* renamed from: a  reason: collision with root package name */
    public static final FeedLoadMoreMLModel f110319a = null;

    static {
        Covode.recordClassIndex(70827);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static boolean f110320a;

        /* renamed from: b  reason: collision with root package name */
        public static FeedLoadMoreMLModel f110321b;

        /* renamed from: c  reason: collision with root package name */
        public static int f110322c = 10;

        /* renamed from: d  reason: collision with root package name */
        public static int f110323d;

        /* renamed from: e  reason: collision with root package name */
        public static long f110324e;

        /* renamed from: f  reason: collision with root package name */
        public static boolean f110325f;

        /* renamed from: g  reason: collision with root package name */
        public static int f110326g;

        static {
            Covode.recordClassIndex(70829);
        }
    }

    public static class FeedLoadMoreMLModel extends MLModel {
        @c(a = "count_when_execute")
        public int countWhenExecute;
        @c(a = "features")
        public InputFeaturesConfig features;
        @c(a = "load_model_before")
        public boolean loadModelBefore;
        @c(a = "real")
        public OnePlaytimePredictRealConfig realConfig;
        @c(a = "run_delay")
        public int runDelay = 16;
        @c(a = "skip_count")
        public int skipCount;
        @c(a = "track")
        public OneSmartDataTrackConfig track;

        static {
            Covode.recordClassIndex(70828);
        }

        @Override // com.ss.android.ugc.aweme.setting.model.MLModel
        public String toString() {
            return "{countWhenExecute=" + this.countWhenExecute + ", runDelay=" + this.runDelay + ", loadModelBefore=" + this.loadModelBefore + ", skipCount=" + this.skipCount + ", scene='" + this.scene + '\'' + ", packageUrl='" + this.packageUrl + '\'' + ", type=" + this.type + ", params=" + Arrays.toString(this.params) + ", features=" + this.features + ", track=" + this.track + ", realConfig=" + this.realConfig + '}';
        }
    }
}
