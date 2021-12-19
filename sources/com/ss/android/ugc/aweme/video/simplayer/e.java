package com.ss.android.ugc.aweme.video.simplayer;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.player.sdk.api.h;
import com.ss.android.ugc.playerkit.simapicommon.a;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class e implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Object f143873a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Object f143874b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final LinkedList<Pair<String, JSONObject>> f143875c = new LinkedList<>();

    /* renamed from: d  reason: collision with root package name */
    private final LinkedList<Pair<String, Map<String, Object>>> f143876d = new LinkedList<>();

    static {
        Covode.recordClassIndex(94141);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.h
    public final void a(long j2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j2);
            a.c().onEvent("nor_on_prepared_time", jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.h
    public final void b(long j2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j2);
            a.c().onEvent("nor_on_render_start_time", jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(257);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        return null;
     */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject a(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.simplayer.e.a(java.lang.String):org.json.JSONObject");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(260);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        return null;
     */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap<java.lang.String, java.lang.Object> b(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.simplayer.e.b(java.lang.String):java.util.HashMap");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.h
    public final void a(String str, Map map) {
        MethodCollector.i(258);
        try {
            synchronized (this.f143874b) {
                try {
                    if (!TextUtils.isEmpty(str) && map != null) {
                        if (this.f143876d.size() > 5) {
                            this.f143876d.remove(0);
                        }
                        this.f143876d.add(new Pair<>(str, map));
                    }
                } finally {
                    MethodCollector.o(258);
                }
            }
        } catch (Exception e2) {
            if (a.a() == null || !a.a().isDebug()) {
                MethodCollector.o(258);
                return;
            }
            RuntimeException runtimeException = new RuntimeException(e2);
            MethodCollector.o(258);
            throw runtimeException;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.h
    public final void a(String str, JSONObject jSONObject) {
        MethodCollector.i(254);
        try {
            synchronized (this.f143873a) {
                try {
                    if (!TextUtils.isEmpty(str) && jSONObject != null) {
                        if (this.f143875c.size() > 5) {
                            this.f143875c.remove(0);
                        }
                        this.f143875c.add(new Pair<>(str, jSONObject));
                    }
                } finally {
                    MethodCollector.o(254);
                }
            }
        } catch (Exception e2) {
            if (a.a() == null || !a.a().isDebug()) {
                MethodCollector.o(254);
                return;
            }
            RuntimeException runtimeException = new RuntimeException(e2);
            MethodCollector.o(254);
            throw runtimeException;
        }
    }
}
