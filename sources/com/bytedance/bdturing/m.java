package com.bytedance.bdturing;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bdturing.c.c;
import com.bytedance.covode.number.Covode;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public HandlerThread f26542a;

    /* renamed from: b  reason: collision with root package name */
    b f26543b;

    static {
        Covode.recordClassIndex(15587);
    }

    private m() {
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static m f26544a = new m((byte) 0);

        static {
            Covode.recordClassIndex(15588);
        }
    }

    /* synthetic */ m(byte b2) {
        this();
    }

    public final void a(Runnable runnable) {
        b bVar = this.f26543b;
        if (bVar != null) {
            bVar.post(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends Handler {
        static {
            Covode.recordClassIndex(15589);
        }

        public final void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 != 1) {
                if (i2 == 2) {
                    c cVar = (c) message.obj;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("os_name", "android");
                        k.f26516a.lockInterruptibly();
                        jSONObject.put("touch", new JSONArray((Collection) k.f26517b));
                        g.d("responseGetTouchToJs motion list size " + k.f26517b.size());
                        k.f26517b.clear();
                        g.d("responseGetTouchToJs end motion list size " + k.f26517b.size());
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        k.f26516a.unlock();
                        throw th;
                    }
                    k.f26516a.unlock();
                    try {
                        cVar.a(1, jSONObject);
                    } catch (Exception unused2) {
                    }
                } else if (i2 == 3) {
                    try {
                        k.f26516a.lockInterruptibly();
                        k.f26517b.clear();
                    } catch (Exception unused3) {
                    } catch (Throwable th2) {
                        k.f26516a.unlock();
                        throw th2;
                    }
                    k.f26516a.unlock();
                }
            } else if (message.obj != null) {
                ((l) message.obj).a();
            }
        }

        private b(Looper looper) {
            super(looper);
        }

        /* synthetic */ b(m mVar, Looper looper, byte b2) {
            this(looper);
        }
    }

    public final void a(int i2, Object obj) {
        b bVar = this.f26543b;
        if (bVar != null) {
            this.f26543b.sendMessage(bVar.obtainMessage(i2, obj));
        }
    }
}
