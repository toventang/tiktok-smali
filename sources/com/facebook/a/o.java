package com.facebook.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.internal.a.b.a;
import com.facebook.internal.b;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private static final String f46876a = o.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private List<c> f46877b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private List<c> f46878c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private int f46879d;

    /* renamed from: e  reason: collision with root package name */
    private b f46880e;

    /* renamed from: f  reason: collision with root package name */
    private String f46881f;

    /* renamed from: g  reason: collision with root package name */
    private final int f46882g = 1000;

    static {
        Covode.recordClassIndex(28542);
    }

    public final synchronized List<c> a() {
        MethodCollector.i(1014);
        if (a.a(this)) {
            MethodCollector.o(1014);
            return null;
        }
        try {
            List<c> list = this.f46877b;
            this.f46877b = new ArrayList();
            MethodCollector.o(1014);
            return list;
        } catch (Throwable th) {
            a.a(th, this);
            MethodCollector.o(1014);
            return null;
        }
    }

    public final synchronized void a(c cVar) {
        int i2;
        MethodCollector.i(924);
        if (a.a(this)) {
            MethodCollector.o(924);
            return;
        }
        try {
            int size = this.f46877b.size() + this.f46878c.size();
            if (a.a(this)) {
                i2 = 0;
            } else {
                i2 = 1000;
            }
            if (size >= i2) {
                this.f46879d++;
                MethodCollector.o(924);
                return;
            }
            this.f46877b.add(cVar);
            MethodCollector.o(924);
        } catch (Throwable th) {
            a.a(th, this);
            MethodCollector.o(924);
        }
    }

    public final synchronized void a(boolean z) {
        MethodCollector.i(955);
        if (a.a(this)) {
            MethodCollector.o(955);
            return;
        }
        if (z) {
            try {
                this.f46877b.addAll(this.f46878c);
            } catch (Throwable th) {
                a.a(th, this);
                MethodCollector.o(955);
                return;
            }
        }
        this.f46878c.clear();
        this.f46879d = 0;
        MethodCollector.o(955);
    }

    public o(b bVar, String str) {
        this.f46880e = bVar;
        this.f46881f = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        if (com.facebook.internal.a.b.a.a(r7) != false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1 = com.facebook.a.e.c.a(com.facebook.a.e.c.a.CUSTOM_APP_EVENTS, r7.f46880e, r7.f46881f, r11, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        if (r7.f46879d <= 0) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        r1.put("num_skipped_events", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r1 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0098, code lost:
        com.facebook.internal.a.b.a.a(r0, r7);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0077 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(com.facebook.GraphRequest r8, android.content.Context r9, boolean r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 177
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.a.o.a(com.facebook.GraphRequest, android.content.Context, boolean, boolean):int");
    }
}
