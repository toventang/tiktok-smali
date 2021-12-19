package com.ss.android.ugc.aweme.cs.f;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cs.h.b;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.port.in.g;
import h.f.b.l;
import java.io.File;
import org.json.JSONObject;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final C1840a f79057a = new C1840a((byte) 0);

    static {
        Covode.recordClassIndex(49077);
    }

    /* renamed from: com.ss.android.ugc.aweme.cs.f.a$a  reason: collision with other inner class name */
    public static final class C1840a {
        static {
            Covode.recordClassIndex(49078);
        }

        private C1840a() {
        }

        public /* synthetic */ C1840a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.cs.h.b
    public final boolean a() {
        boolean storageMonitorLocalSwitch = g.a().e().getStorageMonitorLocalSwitch(true);
        IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
        l.b(iESSettingsProxy, "");
        Boolean enableAvStorageMonitor = iESSettingsProxy.getEnableAvStorageMonitor();
        if (!storageMonitorLocalSwitch) {
            return false;
        }
        l.b(enableAvStorageMonitor, "");
        if (enableAvStorageMonitor.booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.cs.h.b
    public final void a(File file) {
        if (file != null) {
            a();
        }
    }

    @Override // com.ss.android.ugc.aweme.cs.h.b
    public final void a(boolean z) {
        g.a().e().setStorageMonitorLocalSwitch(z);
    }

    @Override // com.ss.android.ugc.aweme.cs.h.b
    public final void a(String str, long j2) {
        l.d(str, "");
        if (a()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("module", str);
            jSONObject.put("duration", j2);
            q.a("av_storage_storage_size_count_time", jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.cs.h.b
    public final void b(String str, long j2) {
        l.d(str, "");
        if (a()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("module", str);
            jSONObject.put("duration", j2);
            q.a("av_storage_storage_clean_time", jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.cs.h.b
    public final void a(String str, Exception exc) {
        l.d(str, "");
        l.d(exc, "");
        if (a()) {
            com.ss.android.ugc.aweme.cs.d.b.b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("module", str);
            jSONObject.put("exception", Log.getStackTraceString(exc));
            q.a("av_storage_storage_clean_error", jSONObject);
        }
    }
}
