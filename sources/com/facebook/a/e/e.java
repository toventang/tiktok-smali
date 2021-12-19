package com.facebook.a.e;

import android.os.AsyncTask;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.net.l.b;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.monitor.n;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public final class e extends AsyncTask<String, Void, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private a f46732a;

    /* renamed from: b  reason: collision with root package name */
    private File f46733b;

    /* renamed from: c  reason: collision with root package name */
    private String f46734c;

    public interface a {
        static {
            Covode.recordClassIndex(28477);
        }

        void a(File file);
    }

    static {
        Covode.recordClassIndex(28476);
    }

    private Boolean a() {
        R r;
        URLConnection uRLConnection;
        MethodCollector.i(2240);
        if (com.facebook.internal.a.b.a.a(this)) {
            MethodCollector.o(2240);
            return null;
        }
        try {
            URL url = new URL(this.f46734c);
            com.ss.android.ugc.aweme.net.model.e<URL, URLConnection> m2 = n.f112474e.m(new com.ss.android.ugc.aweme.net.model.e<>(url, null, null, d.CONTINUE));
            if (m2.f112463f == d.INTERCEPT && m2.f112459b != null) {
                r = m2.f112459b;
                if (r instanceof HttpsURLConnection) {
                    uRLConnection = new b(r);
                } else {
                    if (r instanceof HttpURLConnection) {
                        uRLConnection = new com.ss.android.ugc.aweme.net.l.a(r);
                    }
                    int contentLength = r.getContentLength();
                    DataInputStream dataInputStream = new DataInputStream(url.openStream());
                    byte[] bArr = new byte[contentLength];
                    dataInputStream.readFully(bArr);
                    dataInputStream.close();
                    DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f46733b));
                    dataOutputStream.write(bArr);
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    MethodCollector.o(2240);
                    return true;
                }
            } else if (m2.f112463f != d.EXCEPTION || m2.f112462e == null) {
                r = url.openConnection();
                if (r instanceof HttpsURLConnection) {
                    uRLConnection = new b((HttpsURLConnection) r);
                } else {
                    if (r instanceof HttpURLConnection) {
                        uRLConnection = new com.ss.android.ugc.aweme.net.l.a((HttpURLConnection) r);
                    }
                    int contentLength2 = r.getContentLength();
                    DataInputStream dataInputStream2 = new DataInputStream(url.openStream());
                    byte[] bArr2 = new byte[contentLength2];
                    dataInputStream2.readFully(bArr2);
                    dataInputStream2.close();
                    DataOutputStream dataOutputStream2 = new DataOutputStream(new FileOutputStream(this.f46733b));
                    dataOutputStream2.write(bArr2);
                    dataOutputStream2.flush();
                    dataOutputStream2.close();
                    MethodCollector.o(2240);
                    return true;
                }
            } else {
                RuntimeException runtimeException = m2.f112462e;
                MethodCollector.o(2240);
                throw runtimeException;
            }
            r = uRLConnection;
            int contentLength22 = r.getContentLength();
            DataInputStream dataInputStream22 = new DataInputStream(url.openStream());
            byte[] bArr22 = new byte[contentLength22];
            dataInputStream22.readFully(bArr22);
            dataInputStream22.close();
            DataOutputStream dataOutputStream22 = new DataOutputStream(new FileOutputStream(this.f46733b));
            dataOutputStream22.write(bArr22);
            dataOutputStream22.flush();
            dataOutputStream22.close();
            try {
                MethodCollector.o(2240);
                return true;
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, this);
                MethodCollector.o(2240);
                return null;
            }
        } catch (Exception unused) {
            MethodCollector.o(2240);
            return false;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final /* synthetic */ Boolean doInBackground(String[] strArr) {
        if (com.facebook.internal.a.b.a.a(this)) {
            return null;
        }
        try {
            return a();
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, this);
            return null;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Boolean bool) {
        if (!com.facebook.internal.a.b.a.a(this)) {
            try {
                Boolean bool2 = bool;
                if (!com.facebook.internal.a.b.a.a(this)) {
                    try {
                        if (bool2.booleanValue()) {
                            this.f46732a.a(this.f46733b);
                        }
                    } catch (Throwable th) {
                        com.facebook.internal.a.b.a.a(th, this);
                    }
                }
            } catch (Throwable th2) {
                com.facebook.internal.a.b.a.a(th2, this);
            }
        }
    }

    public e(String str, File file, a aVar) {
        this.f46734c = str;
        this.f46733b = file;
        this.f46732a = aVar;
    }
}
