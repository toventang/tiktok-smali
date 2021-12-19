package com.toutiao.proxyserver.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.u;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;

public final class e implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final d f154944a;

    /* renamed from: b  reason: collision with root package name */
    public final int f154945b;

    /* renamed from: c  reason: collision with root package name */
    public final List<c> f154946c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final u<?> f154947d;

    /* renamed from: e  reason: collision with root package name */
    public final Response f154948e;

    static {
        Covode.recordClassIndex(103176);
    }

    public final boolean a() {
        int i2 = this.f154945b;
        if (i2 < 200 || i2 >= 300) {
            return false;
        }
        return true;
    }

    public final String c() {
        u<?> uVar = this.f154947d;
        if (uVar != null) {
            return uVar.f42629a.f42475c;
        }
        return this.f154948e.message();
    }

    public final String b() {
        if (this.f154947d != null) {
            return "HTTP/1.1";
        }
        return this.f154948e.protocol().toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream in;
        u<?> uVar = this.f154947d;
        if (uVar != null) {
            TypedInput typedInput = uVar.f42629a.f42477e;
            if (typedInput != null && (in = typedInput.in()) != null) {
                in.close();
                return;
            }
            return;
        }
        Response response = this.f154948e;
        if (response != null) {
            response.close();
        }
    }

    public final InputStream d() {
        u<?> uVar = this.f154947d;
        if (uVar != null) {
            TypedInput typedInput = uVar.f42629a.f42477e;
            if (typedInput == null) {
                return null;
            }
            try {
                return typedInput.in();
            } catch (IOException unused) {
                return null;
            }
        } else {
            ResponseBody body = this.f154948e.body();
            if (body == null) {
                return null;
            }
            return body.byteStream();
        }
    }

    public final String toString() {
        return "HttpResponse{request=" + this.f154944a + ", code=" + this.f154945b + ", headers=" + this.f154946c + '}';
    }

    public final String a(String str) {
        return a(str, null);
    }

    public final String a(String str, String str2) {
        for (c cVar : this.f154946c) {
            if (cVar.f154930a.equalsIgnoreCase(str)) {
                return cVar.f154931b;
            }
        }
        return str2;
    }

    e(u<?> uVar, d dVar) {
        this.f154944a = dVar;
        this.f154947d = uVar;
        this.f154948e = null;
        this.f154945b = uVar.f42629a.f42474b;
        List<b> list = uVar.f42629a.f42476d;
        if (list != null) {
            for (b bVar : list) {
                if (!(bVar.f42471a.length() == 0 || bVar.f42472b.length() == 0)) {
                    this.f154946c.add(new c(bVar.f42471a, bVar.f42472b));
                }
            }
        }
    }

    e(Response response, d dVar) {
        this.f154944a = dVar;
        this.f154948e = response;
        this.f154947d = null;
        this.f154945b = response.code();
        Headers headers = response.headers();
        if (headers != null) {
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!(headers.name(i2).length() == 0 || headers.value(i2).length() == 0)) {
                    this.f154946c.add(new c(headers.name(i2), headers.value(i2)));
                }
            }
        }
    }
}
