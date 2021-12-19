package com.bytedance.bdturing;

import com.bytedance.bdturing.m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

class i {

    /* renamed from: c  reason: collision with root package name */
    private static int f26499c = 6000;

    /* renamed from: a  reason: collision with root package name */
    public List<a> f26500a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f26501b = false;

    /* renamed from: d  reason: collision with root package name */
    private int f26502d;

    static {
        Covode.recordClassIndex(15573);
    }

    private void a() {
        try {
            m.a.f26544a.a(new Runnable() {
                /* class com.bytedance.bdturing.i.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(15574);
                }

                public final void run() {
                    JSONException e2;
                    ReentrantLock reentrantLock;
                    try {
                        int size = i.this.f26500a.size() - 1;
                        double d2 = (double) i.this.f26500a.get(size).f26508e;
                        while (size >= 0) {
                            a aVar = i.this.f26500a.get(size);
                            if (d2 >= ((double) aVar.f26508e) || size == 0) {
                                long j2 = aVar.f26508e;
                                float f2 = aVar.f26504a;
                                float f3 = aVar.f26505b;
                                int i2 = aVar.f26509f;
                                float f4 = aVar.f26506c;
                                float f5 = aVar.f26507d;
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("timestamp", j2);
                                    try {
                                        jSONObject.put("force", (double) f2);
                                        jSONObject.put("majorRadius", (double) f3);
                                        jSONObject.put("phase", i2);
                                        jSONObject.put("x", (double) f4);
                                        jSONObject.put("y", (double) f5);
                                        try {
                                            k.f26516a.lockInterruptibly();
                                            k.f26517b.add(jSONObject);
                                            reentrantLock = k.f26516a;
                                        } catch (InterruptedException unused) {
                                            reentrantLock = k.f26516a;
                                        } catch (Throwable th) {
                                            k.f26516a.unlock();
                                            throw th;
                                        }
                                        reentrantLock.unlock();
                                    } catch (JSONException e3) {
                                        e2 = e3;
                                        g.a(e2);
                                        d2 -= 33.3333d;
                                        g.a("uploadEvent use " + aVar.f26508e + " " + aVar.f26509f);
                                        size--;
                                    }
                                } catch (JSONException e4) {
                                    e2 = e4;
                                    g.a(e2);
                                    d2 -= 33.3333d;
                                    g.a("uploadEvent use " + aVar.f26508e + " " + aVar.f26509f);
                                    size--;
                                }
                                d2 -= 33.3333d;
                                g.a("uploadEvent use " + aVar.f26508e + " " + aVar.f26509f);
                            } else {
                                g.a("uploadEvent abandon " + aVar.f26508e + " " + aVar.f26509f);
                            }
                            size--;
                        }
                        i.this.f26500a.clear();
                        i.this.f26501b = false;
                    } catch (Exception unused2) {
                        i.this.f26501b = false;
                    } catch (Throwable th2) {
                        i.this.f26501b = false;
                        throw th2;
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    class a {

        /* renamed from: a  reason: collision with root package name */
        float f26504a;

        /* renamed from: b  reason: collision with root package name */
        float f26505b;

        /* renamed from: c  reason: collision with root package name */
        float f26506c;

        /* renamed from: d  reason: collision with root package name */
        float f26507d;

        /* renamed from: e  reason: collision with root package name */
        long f26508e;

        /* renamed from: f  reason: collision with root package name */
        int f26509f;

        static {
            Covode.recordClassIndex(15575);
        }

        a() {
        }
    }

    public i(int i2) {
        int i3 = f26499c;
        this.f26502d = i3;
        if (i2 > i3) {
            this.f26502d = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
        if (r3 != 1) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.MotionEvent r6) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.i.a(android.view.MotionEvent):void");
    }
}
