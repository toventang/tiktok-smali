package com.ss.android.ugc.aweme.ml.ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.setting.model.MLModel;
import java.util.Arrays;

public interface SmartPreloadProfileV2Experiment {

    /* renamed from: a  reason: collision with root package name */
    public static final PreloadProfileMLModel f110343a = null;

    static {
        Covode.recordClassIndex(70839);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static boolean f110344a;

        /* renamed from: b  reason: collision with root package name */
        public static PreloadProfileMLModel f110345b;

        /* renamed from: c  reason: collision with root package name */
        public static int f110346c;

        /* renamed from: d  reason: collision with root package name */
        public static float f110347d = 0.5f;

        /* renamed from: e  reason: collision with root package name */
        public static float f110348e = 0.5f;

        static {
            Covode.recordClassIndex(70841);
        }

        public static boolean b() {
            if (a() == null) {
                return false;
            }
            if (a().groupId == 5 || f110346c == 6) {
                return true;
            }
            return false;
        }

        public static boolean c() {
            if (a() == null || a().groupId <= 0) {
                return false;
            }
            return true;
        }

        public static PreloadProfileMLModel a() {
            if (!f110344a) {
                PreloadProfileMLModel preloadProfileMLModel = (PreloadProfileMLModel) b.a().a(false, "smart_feed_preload_profile_ml", PreloadProfileMLModel.class, SmartPreloadProfileV2Experiment.f110343a);
                f110345b = preloadProfileMLModel;
                if (preloadProfileMLModel != null) {
                    f110346c = preloadProfileMLModel.groupId;
                    f110347d = f110345b.clientAIThreshold;
                    f110348e = f110345b.recommendThreshold;
                }
                f110344a = true;
            }
            return f110345b;
        }
    }

    public static class PreloadProfileMLModel extends MLModel {
        @c(a = "client_ai_threshold")
        public float clientAIThreshold = 0.5f;
        @c(a = "group_id")
        public int groupId;
        @c(a = "recommend_threshold")
        public float recommendThreshold = 0.5f;

        static {
            Covode.recordClassIndex(70840);
        }

        @Override // com.ss.android.ugc.aweme.setting.model.MLModel
        public String toString() {
            return "PreloadProfileMLModel{groupId=" + this.groupId + ", clientAIThreshold=" + this.clientAIThreshold + ", recommendThreshold=" + this.recommendThreshold + ", scene='" + this.scene + '\'' + ", packageUrl='" + this.packageUrl + '\'' + ", type=" + this.type + ", params=" + Arrays.toString(this.params) + '}';
        }
    }
}
