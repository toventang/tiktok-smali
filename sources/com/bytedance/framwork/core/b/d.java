package com.bytedance.framwork.core.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.b.b.a;
import com.bytedance.framwork.core.b.d.b;
import java.util.LinkedList;
import org.json.JSONObject;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f29442a = false;

    /* renamed from: b  reason: collision with root package name */
    private c f29443b;

    /* renamed from: c  reason: collision with root package name */
    private final LinkedList<a> f29444c = new LinkedList<>();

    /* renamed from: d  reason: collision with root package name */
    private final int f29445d = 5;

    /* renamed from: e  reason: collision with root package name */
    private long f29446e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final int f29447f = 120000;

    /* renamed from: g  reason: collision with root package name */
    private String f29448g;

    static {
        Covode.recordClassIndex(17152);
    }

    public final void a() {
        MethodCollector.i(13486);
        synchronized (this.f29444c) {
            try {
                this.f29444c.clear();
            } finally {
                MethodCollector.o(13486);
            }
        }
    }

    @Override // com.bytedance.framwork.core.b.d.b
    public final void a(long j2) {
        if (!this.f29442a) {
            a(j2, false);
        }
    }

    public d(Context context, String str) {
        this.f29443b = c.a(context);
        this.f29448g = str;
    }

    private boolean a(long j2, boolean z) {
        LinkedList linkedList;
        MethodCollector.i(13485);
        int size = this.f29444c.size();
        if (size <= 0 || (!z && size < 5 && j2 - this.f29446e <= 120000)) {
            MethodCollector.o(13485);
            return false;
        }
        this.f29446e = j2;
        synchronized (this.f29444c) {
            try {
                linkedList = new LinkedList(this.f29444c);
                this.f29444c.clear();
            } catch (Throwable th) {
                MethodCollector.o(13485);
                throw th;
            }
        }
        if (!com.bytedance.framwork.core.b.e.b.a(linkedList)) {
            try {
                this.f29443b.a(this.f29448g, linkedList);
            } catch (Exception unused) {
            }
        }
        MethodCollector.o(13485);
        return true;
    }

    public final void a(String str, String str2, JSONObject jSONObject) {
        if (!this.f29442a && jSONObject != null) {
            a aVar = new a(this.f29448g, str, str2, jSONObject.toString(), System.currentTimeMillis());
            if (this.f29444c.size() >= 200) {
                a(System.currentTimeMillis(), true);
            }
            this.f29444c.add(aVar);
        }
    }
}
