package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.a.b.a;
import java.net.HttpURLConnection;
import java.util.List;

public class p extends AsyncTask<Void, Void, List<r>> {

    /* renamed from: c  reason: collision with root package name */
    private static final String f49004c = p.class.getCanonicalName();

    /* renamed from: a  reason: collision with root package name */
    public final q f49005a;

    /* renamed from: b  reason: collision with root package name */
    public Exception f49006b;

    /* renamed from: d  reason: collision with root package name */
    private final HttpURLConnection f49007d;

    static {
        Covode.recordClassIndex(29524);
    }

    private List<r> a() {
        if (a.a(this)) {
            return null;
        }
        try {
            HttpURLConnection httpURLConnection = this.f49007d;
            if (httpURLConnection == null) {
                return GraphRequest.a(this.f49005a);
            }
            return GraphRequest.a(httpURLConnection, this.f49005a);
        } catch (Exception e2) {
            this.f49006b = e2;
            return null;
        } catch (Throwable th) {
            a.a(th, this);
            return null;
        }
    }

    public String toString() {
        return "{RequestAsyncTask:  connection: " + this.f49007d + ", requests: " + this.f49005a + "}";
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        Handler handler;
        if (!a.a(this)) {
            try {
                super.onPreExecute();
                if (m.f48919e) {
                    com.a.a("execute async task: %s", new Object[]{this});
                }
                if (this.f49005a.f49009a == null) {
                    if (Thread.currentThread() instanceof HandlerThread) {
                        handler = new Handler();
                    } else {
                        handler = new Handler(Looper.getMainLooper());
                    }
                    this.f49005a.f49009a = handler;
                }
            } catch (Throwable th) {
                a.a(th, this);
            }
        }
    }

    public p(q qVar) {
        this(qVar, (byte) 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public /* synthetic */ List<r> doInBackground(Void[] voidArr) {
        if (a.a(this)) {
            return null;
        }
        try {
            return a();
        } catch (Throwable th) {
            a.a(th, this);
            return null;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public /* synthetic */ void onPostExecute(List<r> list) {
        if (!a.a(this)) {
            try {
                List<r> list2 = list;
                if (!a.a(this)) {
                    try {
                        super.onPostExecute(list2);
                        Exception exc = this.f49006b;
                        if (exc != null) {
                            com.a.a("onPostExecute: exception encountered during request: %s", new Object[]{exc.getMessage()});
                        }
                    } catch (Throwable th) {
                        a.a(th, this);
                    }
                }
            } catch (Throwable th2) {
                a.a(th2, this);
            }
        }
    }

    private p(q qVar, byte b2) {
        this.f49005a = qVar;
        this.f49007d = null;
    }
}
