package com.bytedance.crash;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.d;
import com.bytedance.crash.j.h;
import com.bytedance.crash.j.i;
import com.bytedance.crash.runtime.c.b;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class MonitorCrash {
    private static volatile boolean sAppMonitorCrashInit;
    Config mConfig;
    AttachUserData mCustomData;
    AttachUserData mCustomLongData;
    HeaderParams mParams;
    HashMap<String, String> mTagMap = new HashMap<>();

    public interface HeaderParams {
        static {
            Covode.recordClassIndex(16125);
        }

        Map<String, Object> getCommonParams();
    }

    static {
        Covode.recordClassIndex(16123);
    }

    public Config config() {
        return this.mConfig;
    }

    public MonitorCrash setCustomDataCallback(AttachUserData attachUserData) {
        this.mCustomData = attachUserData;
        return this;
    }

    public MonitorCrash withOtherHeaders(HeaderParams headerParams) {
        this.mParams = headerParams;
        return this;
    }

    public class Config {
        String mAid;
        String mChannel;
        String mDeviceId;
        String mPackageName;
        String[] mSoList;
        long mUID;
        long mVersionInt = -1;
        String mVersionStr;
        boolean test;

        static {
            Covode.recordClassIndex(16124);
        }

        public Config setChannel(String str) {
            this.mChannel = str;
            b.a();
            return this;
        }

        public Config setDeviceId(String str) {
            this.mDeviceId = str;
            b.a();
            return this;
        }

        public Config setPackageName(String str) {
            this.mPackageName = str;
            b.a();
            return this;
        }

        public Config setSoList(String[] strArr) {
            this.mSoList = strArr;
            b.a();
            return this;
        }

        public Config setUID(long j2) {
            this.mUID = j2;
            b.a();
            return this;
        }

        public Config() {
        }
    }

    public MonitorCrash addTags(String str, String str2) {
        this.mTagMap.put(str, str2);
        return this;
    }

    public void reportCustomErr(String str, String str2, Throwable th) {
        try {
            h.a((Object) this, th, (StackTraceElement[]) null, 0, str, true, (Map<String, String>) null, Thread.currentThread(), str2, "core_exception_monitor");
        } catch (Throwable unused) {
        }
    }

    private MonitorCrash(Context context, String str, long j2, String str2) {
        Config config = new Config();
        this.mConfig = config;
        config.mAid = str;
        this.mConfig.mVersionInt = j2;
        this.mConfig.mVersionStr = str2;
        i iVar = new i(this);
        i.f27607b = this;
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        m.a((Application) applicationContext, context, new ICommonParams(iVar, this) {
            /* class com.bytedance.crash.i.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f27609a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ MonitorCrash f27610b;

            static {
                Covode.recordClassIndex(16204);
            }

            @Override // com.bytedance.crash.ICommonParams
            public final List<String> getPatchInfo() {
                return null;
            }

            @Override // com.bytedance.crash.ICommonParams
            public final Map<String, Integer> getPluginInfo() {
                return null;
            }

            @Override // com.bytedance.crash.ICommonParams
            public final String getSessionId() {
                return null;
            }

            @Override // com.bytedance.crash.ICommonParams
            public final String getDeviceId() {
                return this.f27610b.mConfig.mDeviceId;
            }

            @Override // com.bytedance.crash.ICommonParams
            public final long getUserId() {
                return this.f27610b.mConfig.mUID;
            }

            @Override // com.bytedance.crash.ICommonParams
            public final Map<String, Object> getCommonParams() {
                JSONObject a2 = this.f27609a.a();
                HashMap hashMap = new HashMap();
                Iterator<String> keys = a2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, a2.opt(next));
                }
                return hashMap;
            }

            {
                this.f27609a = r1;
                this.f27610b = r2;
            }
        });
    }

    public static MonitorCrash init(Context context, String str, long j2, String str2) {
        MethodCollector.i(9203);
        if (!sAppMonitorCrashInit) {
            synchronized (MonitorCrash.class) {
                try {
                    if (!sAppMonitorCrashInit) {
                        sAppMonitorCrashInit = true;
                        n.a(context);
                        return new MonitorCrash(context, str, j2, str2);
                    }
                } finally {
                    MethodCollector.o(9203);
                }
            }
        }
        MethodCollector.o(9203);
        return null;
    }

    private MonitorCrash(String str, long j2, String str2, String str3) {
        Config config = new Config();
        this.mConfig = config;
        config.mAid = str;
        this.mConfig.mVersionInt = j2;
        this.mConfig.mVersionStr = str2;
        this.mConfig.mPackageName = str3;
        new i(this);
    }

    public static MonitorCrash initSDK(Context context, String str, long j2, String str2, String str3) {
        n.a(context);
        MonitorCrash monitorCrash = new MonitorCrash(str, j2, str2, str3);
        monitorCrash.config().setPackageName(str3);
        return monitorCrash;
    }

    public void reportEvent(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        d.AnonymousClass1 r2 = new d() {
            /* class com.bytedance.crash.entity.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(16188);
            }

            @Override // com.bytedance.crash.entity.d
            public final boolean c() {
                return true;
            }
        };
        r2.a("event_type", (Object) "exception");
        r2.a("log_type", (Object) "service_monitor");
        r2.a("timestamp", Long.valueOf(System.currentTimeMillis()));
        r2.a("crash_time", Long.valueOf(System.currentTimeMillis()));
        r2.a("process_name", (Object) com.bytedance.crash.util.b.c(m.f27724a));
        r2.a("crash_thread_name", (Object) Thread.currentThread().getName());
        r2.a("service", (Object) str);
        r2.a("status", Integer.valueOf(i2));
        if (jSONObject != null) {
            r2.a("category", jSONObject);
        }
        if (jSONObject2 != null) {
            r2.a("metric", jSONObject2);
        }
        r2.a("sid", Long.valueOf(m.f27726c));
        i.a(this, r2);
    }

    public static MonitorCrash initSDK(Context context, String str, long j2, String str2, String str3, String[] strArr) {
        n.a(context);
        MonitorCrash monitorCrash = new MonitorCrash(str, j2, str2, str3);
        monitorCrash.config().setPackageName(str3).setSoList(strArr);
        return monitorCrash;
    }
}
