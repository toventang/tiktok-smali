package com.ss.android.ugc.aweme.ml.ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.setting.model.MLModel;
import java.util.Arrays;

public interface SmartPreloadCommentV2Experiment {

    /* renamed from: a  reason: collision with root package name */
    public static final PreloadCommentMLModel f110327a = null;

    static {
        Covode.recordClassIndex(70833);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static boolean f110328a;

        /* renamed from: b  reason: collision with root package name */
        public static PreloadCommentMLModel f110329b;

        /* renamed from: c  reason: collision with root package name */
        public static int f110330c;

        /* renamed from: d  reason: collision with root package name */
        public static float f110331d = 0.5f;

        /* renamed from: e  reason: collision with root package name */
        public static float f110332e = 0.5f;

        static {
            Covode.recordClassIndex(70835);
        }

        public static boolean b() {
            if (a() == null) {
                return false;
            }
            if (a().groupId == 5 || f110330c == 6) {
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

        public static PreloadCommentMLModel a() {
            if (!f110328a) {
                PreloadCommentMLModel preloadCommentMLModel = (PreloadCommentMLModel) b.a().a(false, "smart_feed_preload_comment_ml", PreloadCommentMLModel.class, SmartPreloadCommentV2Experiment.f110327a);
                f110329b = preloadCommentMLModel;
                if (preloadCommentMLModel != null) {
                    f110330c = preloadCommentMLModel.groupId;
                    f110331d = f110329b.clientAIThreshold;
                    f110332e = f110329b.recommendThreshold;
                }
                f110328a = true;
            }
            return f110329b;
        }
    }

    public static class PreloadCommentMLModel extends MLModel {
        @c(a = "client_ai_threshold")
        public float clientAIThreshold = 0.5f;
        @c(a = "group_id")
        public int groupId;
        @c(a = "recommend_threshold")
        public float recommendThreshold = 0.5f;

        static {
            Covode.recordClassIndex(70834);
        }

        @Override // com.ss.android.ugc.aweme.setting.model.MLModel
        public String toString() {
            return "PreloadCommentMLModel{groupId=" + this.groupId + ", clientAIThreshold=" + this.clientAIThreshold + ", recommendThreshold=" + this.recommendThreshold + ", scene='" + this.scene + '\'' + ", packageUrl='" + this.packageUrl + '\'' + ", type=" + this.type + ", params=" + Arrays.toString(this.params) + '}';
        }
    }
}
