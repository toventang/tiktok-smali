package com.ss.ttvideoengine.h;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.b;
import com.ss.ttvideoengine.s.j;
import org.json.JSONArray;
import org.json.JSONObject;

public enum t {
    instance;
    
    private Context mContext;
    private p mEngineUploader;
    private JSONArray mJsonArray = new JSONArray();
    private JSONArray mJsonArrayV2 = new JSONArray();
    private q mListener;
    private int mLoggerVersion = 2;
    private k mUploader;

    public static int com_ss_ttvideoengine_log_VideoEventManager_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public final int getLoggerVersion() {
        return com_ss_ttvideoengine_log_VideoEventManager_com_ss_android_ugc_aweme_video_VideoEventManagerLancet_getLoggerVersion(this);
    }

    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private t f152710a;

        /* renamed from: b  reason: collision with root package name */
        private JSONObject f152711b;

        static {
            Covode.recordClassIndex(101631);
        }

        public final void run() {
            JSONObject jSONObject;
            t tVar = this.f152710a;
            if (tVar != null && (jSONObject = this.f152711b) != null) {
                tVar.showEvent(jSONObject);
            }
        }

        public a(t tVar, JSONObject jSONObject) {
            this.f152710a = tVar;
            this.f152711b = jSONObject;
        }
    }

    static {
        Covode.recordClassIndex(101630);
    }

    public final int VideoEventManager__getLoggerVersion$___twin___() {
        j.e("VideoEventManager", "getLoggerVersion: " + this.mLoggerVersion);
        return this.mLoggerVersion;
    }

    public final synchronized JSONArray popAllEvents() {
        JSONArray jSONArray;
        MethodCollector.i(13953);
        jSONArray = this.mJsonArray;
        this.mJsonArray = new JSONArray();
        MethodCollector.o(13953);
        return jSONArray;
    }

    public final JSONArray popAllEventsV2() {
        MethodCollector.i(14063);
        JSONArray jSONArray = this.mJsonArrayV2;
        synchronized (t.class) {
            try {
                this.mJsonArrayV2 = new JSONArray();
            } finally {
                MethodCollector.o(14063);
            }
        }
        return jSONArray;
    }

    public final void setListener(q qVar) {
        this.mListener = qVar;
    }

    public final void setUploader(k kVar) {
        this.mUploader = kVar;
    }

    public final void setContext(Context context) {
        this.mContext = com_ss_ttvideoengine_log_VideoEventManager_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
    }

    public static Context com_ss_ttvideoengine_log_VideoEventManager_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public final synchronized void setEngineUploader(p pVar) {
        MethodCollector.i(13897);
        this.mEngineUploader = pVar;
        MethodCollector.o(13897);
    }

    private t(String str) {
    }

    public final void setLoggerVersion(int i2) {
        j.e("VideoEventManager", "setLoggerVersion: ".concat(String.valueOf(i2)));
        if (i2 == 1 || i2 == 2) {
            this.mLoggerVersion = i2;
        }
    }

    public static int com_ss_ttvideoengine_log_VideoEventManager_com_ss_android_ugc_aweme_video_VideoEventManagerLancet_getLoggerVersion(t tVar) {
        int i2 = 1;
        if (b.a().a(true, "player_event_log_v2_open", true)) {
            i2 = 2;
        }
        com_ss_ttvideoengine_log_VideoEventManager_com_ss_android_ugc_aweme_lancet_LogLancet_d("VideoEventManagerLancet", Log.getStackTraceString(new RuntimeException("value:".concat(String.valueOf(i2)))));
        return i2;
    }

    public final void showEvent(JSONObject jSONObject) {
        String str;
        if (((j.f153285c >> 2) & 1) == 1 || ((j.f153283a >> 2) & 1) == 1) {
            String jSONObject2 = jSONObject.toString();
            if (jSONObject2 != null) {
                int i2 = 3900;
                if (jSONObject2.length() > 3900) {
                    int length = jSONObject2.length();
                    int i3 = 0;
                    while (i2 < length) {
                        j.a("VideoEventManager", jSONObject2.substring(i3, i2));
                        i3 += 3900;
                        i2 = Math.min(i2 + 3900, length);
                    }
                    j.a("VideoEventManager", jSONObject2.substring(i3, i2));
                }
            }
            j.a("VideoEventManager", jSONObject2);
        }
        if (((j.f153283a >> 1) & 1) == 1) {
            Context context = this.mContext;
            if (context != null) {
                str = Settings.Global.getString(context.getContentResolver(), "engine.debug");
                if (str == null) {
                    return;
                }
            } else {
                str = "";
            }
            String[] split = str.split(",", -1);
            for (String str2 : split) {
                if (jSONObject.opt(str2) != null) {
                    j.a("VideoEventManager", str2 + ":" + jSONObject.opt(str2));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z, JSONObject jSONObject) {
        MethodCollector.i(14002);
        synchronized (t.class) {
            if (jSONObject == null) {
                MethodCollector.o(14002);
                return;
            }
            try {
                j.b("VideoEventManager", "addEvent  uploadLog = ".concat(String.valueOf(z)));
                com.ss.ttvideoengine.s.b.a(new a(this, jSONObject));
                p pVar = this.mEngineUploader;
                if (pVar != null) {
                    pVar.a("video_playq", jSONObject);
                    return;
                }
                if (this.mUploader == null || !z) {
                    this.mJsonArray.put(jSONObject);
                    q qVar = this.mListener;
                    if (qVar != null) {
                        qVar.a();
                    }
                }
                MethodCollector.o(14002);
            } finally {
                MethodCollector.o(14002);
            }
        }
    }

    public final void addEventV2(boolean z, JSONObject jSONObject, String str) {
        MethodCollector.i(14102);
        synchronized (t.class) {
            if (jSONObject == null) {
                MethodCollector.o(14102);
                return;
            }
            try {
                j.b("VideoEventManager", "addEventV2  uploadLog = " + z + ", listener:" + this.mListener + ", uploader:" + this.mUploader);
                com.ss.ttvideoengine.s.b.a(new a(this, jSONObject));
                p pVar = this.mEngineUploader;
                if (pVar != null) {
                    pVar.b(str, jSONObject);
                    return;
                }
                if (this.mUploader == null || !z) {
                    this.mJsonArrayV2.put(jSONObject);
                    q qVar = this.mListener;
                    if (qVar != null) {
                        qVar.onEventV2(str);
                    }
                }
                MethodCollector.o(14102);
            } finally {
                MethodCollector.o(14102);
            }
        }
    }
}
