package com.ss.android.ugc.aweme.feed;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.s;
import org.json.JSONObject;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static long f93900a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f93901b;

    static {
        Covode.recordClassIndex(59737);
    }

    public static class a implements AppLog.h {
        static {
            Covode.recordClassIndex(59738);
        }

        @Override // com.ss.android.common.applog.AppLog.h
        public final void a(long j2, String str, JSONObject jSONObject) {
        }

        @Override // com.ss.android.common.applog.AppLog.h
        public final void b(long j2, String str, JSONObject jSONObject) {
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @Override // com.ss.android.common.applog.AppLog.h
        public final void a(long j2) {
            String currentSessionId = AppLog.getCurrentSessionId();
            if (!f.f34637l && t.f93900a != 0 && SystemClock.uptimeMillis() - t.f93900a >= 20000) {
                JSONObject a2 = new s().a("0vv_session_id", currentSessionId).a();
                r.onEvent(MobClick.obtain().setEventName("0vv_hot_launch").setLabelName("perf_monitor").setJsonObject(a2));
                r.b("0vv_hot_launch", a2);
            }
        }
    }
}
