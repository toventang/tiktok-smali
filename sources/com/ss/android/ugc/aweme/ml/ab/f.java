package com.ss.android.ugc.aweme.ml.ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.a.n;
import h.m.p;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final SmartSceneReportConfig f110364a = null;

    /* renamed from: b  reason: collision with root package name */
    public static float f110365b;

    /* renamed from: c  reason: collision with root package name */
    public static float f110366c;

    /* renamed from: d  reason: collision with root package name */
    public static final f f110367d = new f();

    /* renamed from: e  reason: collision with root package name */
    private static SmartSceneReportConfig f110368e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f110369f;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f110370g;

    /* renamed from: h  reason: collision with root package name */
    private static List<String> f110371h;

    private f() {
    }

    static {
        Covode.recordClassIndex(70848);
    }

    public static boolean a(String str) {
        List<String> list;
        if (!f110369f) {
            SmartSceneReportConfig smartSceneReportConfig = (SmartSceneReportConfig) b.a().a(false, "ml_scene_report_config", SmartSceneReportConfig.class, f110364a);
            f110368e = smartSceneReportConfig;
            if (smartSceneReportConfig != null) {
                f110370g = smartSceneReportConfig.getEnable();
                f110365b = smartSceneReportConfig.getInitRate();
                f110366c = smartSceneReportConfig.getRunRate();
                String ignoreScene = smartSceneReportConfig.getIgnoreScene();
                if (ignoreScene != null) {
                    list = p.b(ignoreScene, new String[]{","});
                } else {
                    list = null;
                }
                f110371h = list;
            }
            f110369f = true;
        }
        if (!f110370g) {
            return false;
        }
        List<String> list2 = f110371h;
        if (list2 == null || !n.a((Iterable) list2, (Object) str)) {
            return true;
        }
        return false;
    }
}
