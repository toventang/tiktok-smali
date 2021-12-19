package com.ttnet.org.chromium.net.urlconnection;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.base.g;
import com.ttnet.org.chromium.base.k;
import com.ttnet.org.chromium.net.ab;
import com.ttnet.org.chromium.net.ac;
import com.ttnet.org.chromium.net.c;
import com.ttnet.org.chromium.net.h;
import com.ttnet.org.chromium.net.t;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CronetHttpURLConnection extends HttpURLConnection {

    /* renamed from: a  reason: collision with root package name */
    public static final String f155837a = CronetHttpURLConnection.class.getSimpleName();
    private int A;
    private int B;
    private long C;

    /* renamed from: b  reason: collision with root package name */
    public final f f155838b = new f();

    /* renamed from: c  reason: collision with root package name */
    public ab f155839c;

    /* renamed from: d  reason: collision with root package name */
    public d f155840d = new d(this);

    /* renamed from: e  reason: collision with root package name */
    public e f155841e;

    /* renamed from: f  reason: collision with root package name */
    public ac f155842f;

    /* renamed from: g  reason: collision with root package name */
    public IOException f155843g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f155844h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f155845i;

    /* renamed from: j  reason: collision with root package name */
    public List<Map.Entry<String, String>> f155846j;

    /* renamed from: k  reason: collision with root package name */
    public int f155847k;

    /* renamed from: l  reason: collision with root package name */
    public volatile String f155848l;

    /* renamed from: m  reason: collision with root package name */
    public t f155849m;
    public CookieHandler n = CookieHandler.getDefault();
    public CountDownLatch o = new CountDownLatch(1);
    private final c p;
    private final List<Pair<String, String>> q = new ArrayList();
    private boolean r;
    private int s;
    private boolean t;
    private int u;
    private Map<String, List<String>> v;
    private int w;
    private int x;
    private int y;
    private int z;

    private List i() {
        return d(this);
    }

    public boolean usingProxy() {
        return false;
    }

    private boolean h() {
        if (this.chunkLength > 0) {
            return true;
        }
        return false;
    }

    @Override // java.net.URLConnection
    public void connect() {
        getOutputStream();
        e();
    }

    static {
        Covode.recordClassIndex(103557);
    }

    public final void a() {
        ab abVar = this.f155839c;
        if (abVar != null) {
            abVar.d();
        }
    }

    public void disconnect() {
        ab abVar;
        if (this.connected && (abVar = this.f155839c) != null) {
            abVar.c();
        }
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        try {
            f();
            return c();
        } catch (IOException unused) {
            return Collections.emptyMap();
        }
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        f();
        return this.f155842f.a();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        f();
        return this.f155842f.b();
    }

    private long d() {
        long j2 = (long) this.fixedContentLength;
        try {
            long j3 = getClass().getField("fixedContentLengthLong").getLong(this);
            return j3 != -1 ? j3 : j2;
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return j2;
        }
    }

    private void g() {
        if (this.f155845i) {
            IOException iOException = this.f155843g;
            if (iOException == null) {
                Objects.requireNonNull(this.f155842f, "Response info is null when there is no exception.");
                return;
            }
            throw iOException;
        }
        throw new IllegalStateException("No response.");
    }

    public InputStream getErrorStream() {
        try {
            f();
            if (this.f155842f.a() >= 400) {
                return this.f155840d;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    private void f() {
        e eVar = this.f155841e;
        if (eVar != null) {
            eVar.b();
            if (h()) {
                this.f155841e.close();
            }
        }
        if (!this.f155845i) {
            e();
            if (g.a()) {
                getURL();
            }
            a(getConnectTimeout() + getReadTimeout());
            this.f155845i = true;
        }
        g();
    }

    public final t b() {
        if (this.connected && this.f155839c != null && this.f155849m == null) {
            try {
                this.o.await(50, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
        return this.f155849m;
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        f();
        if (!this.instanceFollowRedirects && this.f155844h) {
            throw new IOException("Cannot read response body of a redirect.");
        } else if (this.f155842f.a() < 400) {
            return this.f155840d;
        } else {
            throw new FileNotFoundException(this.url.toString());
        }
    }

    public final Map<String, List<String>> c() {
        Map<String, List<String>> map = this.v;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : i()) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add(entry.getValue());
            treeMap.put(entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        Map<String, List<String>> unmodifiableMap = Collections.unmodifiableMap(treeMap);
        this.v = unmodifiableMap;
        return unmodifiableMap;
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        if (!this.connected) {
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (Pair<String, String> pair : this.q) {
                if (!treeMap.containsKey(pair.first)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(pair.second);
                    treeMap.put(pair.first, Collections.unmodifiableList(arrayList));
                } else {
                    throw new IllegalStateException("Should not have multiple values.");
                }
            }
            return Collections.unmodifiableMap(treeMap);
        }
        throw new IllegalStateException("Cannot access request headers after connection is set.");
    }

    /* access modifiers changed from: package-private */
    public class a extends ab.b {
        static {
            Covode.recordClassIndex(103558);
        }

        private void a() {
            CronetHttpURLConnection cronetHttpURLConnection = CronetHttpURLConnection.this;
            cronetHttpURLConnection.f155848l = cronetHttpURLConnection.f155839c.e();
            try {
                if (CronetHttpURLConnection.this.f155843g != null) {
                    String str = null;
                    if (!(CronetHttpURLConnection.this.f155849m == null || CronetHttpURLConnection.this.f155849m.b() == null || CronetHttpURLConnection.this.f155849m.b().t() == null)) {
                        str = CronetHttpURLConnection.this.f155849m.b().t() + ":" + CronetHttpURLConnection.this.f155849m.b().u();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        String message = CronetHttpURLConnection.this.f155843g.getMessage();
                        StringBuilder sb = new StringBuilder();
                        StringBuilder append = sb.append(str).append("|");
                        if (message == null) {
                            message = "null";
                        }
                        append.append(message);
                        k.a(CronetHttpURLConnection.this.f155843g).a("detailMessage", sb.toString());
                    }
                }
            } catch (Throwable unused) {
            }
            CronetHttpURLConnection.this.f155845i = true;
            CronetHttpURLConnection.this.f155838b.b();
        }

        public a() {
        }

        @Override // com.ttnet.org.chromium.net.ab.b
        public final void a(String str, t tVar) {
            CronetHttpURLConnection.this.f155848l = str;
            CronetHttpURLConnection.this.f155849m = tVar;
            CronetHttpURLConnection.this.o.countDown();
        }

        @Override // com.ttnet.org.chromium.net.ab.b
        public final void a(ab abVar, ac acVar) {
            CronetHttpURLConnection.this.f155842f = acVar;
            if (g.a()) {
                CronetHttpURLConnection.this.getURL();
            }
            a((IOException) null, true);
        }

        private void a(IOException iOException, boolean z) {
            CronetHttpURLConnection.this.f155843g = iOException;
            if (CronetHttpURLConnection.this.f155840d != null) {
                CronetHttpURLConnection.this.f155840d.a(iOException);
            }
            if (CronetHttpURLConnection.this.f155841e != null) {
                CronetHttpURLConnection.this.f155841e.a(iOException);
            }
            CronetHttpURLConnection.this.f155845i = true;
            if (!z) {
                a();
            }
        }

        @Override // com.ttnet.org.chromium.net.ab.b
        public final void b(ab abVar, ac acVar) {
            CronetHttpURLConnection.this.f155842f = acVar;
            if (g.a()) {
                CronetHttpURLConnection.this.getURL();
            }
            if (CronetHttpURLConnection.this.f155843g == null) {
                CronetHttpURLConnection.this.f155843g = new g("request canceled" + ", ErrorCode=11, InternalErrorCode=-999");
            }
            a(CronetHttpURLConnection.this.f155843g, false);
        }

        @Override // com.ttnet.org.chromium.net.ab.b
        public final void a(ab abVar, t tVar) {
            CronetHttpURLConnection.this.f155849m = tVar;
            if (g.a()) {
                CronetHttpURLConnection.this.getURL();
            }
            a();
        }

        @Override // com.ttnet.org.chromium.net.ab.b
        public final void a(ab abVar, ac acVar, ByteBuffer byteBuffer) {
            CronetHttpURLConnection.this.f155842f = acVar;
            if (g.a()) {
                CronetHttpURLConnection.this.getURL();
            }
            CronetHttpURLConnection.this.f155838b.b();
        }

        @Override // com.ttnet.org.chromium.net.ab.b
        public final void b(ab abVar, ac acVar, String str) {
            CronetHttpURLConnection.this.f155842f = acVar;
            CronetHttpURLConnection.this.f155845i = true;
            try {
                if (CronetHttpURLConnection.this.f155842f != null) {
                    Map<String, List<String>> c2 = CronetHttpURLConnection.this.c();
                    if (CronetHttpURLConnection.this.n == null) {
                        CronetHttpURLConnection.this.n = CookieHandler.getDefault();
                    }
                    if (CronetHttpURLConnection.this.n != null) {
                        if (TextUtils.isEmpty(str)) {
                            CronetHttpURLConnection.this.n.put(CronetHttpURLConnection.a(CronetHttpURLConnection.this.getURL()), c2);
                        } else {
                            CronetHttpURLConnection.this.n.put(CronetHttpURLConnection.a(new URL(str)), c2);
                        }
                    }
                }
            } catch (Exception e2) {
                if (g.a()) {
                    CronetHttpURLConnection.this.getURL();
                    e2.getMessage();
                }
            }
            if (g.a()) {
                CronetHttpURLConnection.this.getURL();
            }
            CronetHttpURLConnection.this.f155838b.b();
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
        @Override // com.ttnet.org.chromium.net.ab.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.ttnet.org.chromium.net.ab r5, com.ttnet.org.chromium.net.ac r6, com.ttnet.org.chromium.net.d r7) {
            /*
            // Method dump skipped, instructions count: 158
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection.a.a(com.ttnet.org.chromium.net.ab, com.ttnet.org.chromium.net.ac, com.ttnet.org.chromium.net.d):void");
        }

        @Override // com.ttnet.org.chromium.net.ab.b
        public final void a(ab abVar, ac acVar, String str) {
            CronetHttpURLConnection.this.f155844h = true;
            try {
                URL url = new URL(str);
                boolean equals = url.getHost().equals(CronetHttpURLConnection.this.url.getHost());
                if (CronetHttpURLConnection.this.instanceFollowRedirects) {
                    CronetHttpURLConnection.this.url = url;
                }
                if (CronetHttpURLConnection.this.instanceFollowRedirects) {
                    if (CronetHttpURLConnection.this.f155839c != null) {
                        if (!equals) {
                            CronetHttpURLConnection.this.f155839c.f();
                            Map<String, String> a2 = CronetHttpURLConnection.this.a(CronetHttpURLConnection.a(new URL(str)));
                            if (!a2.isEmpty()) {
                                for (Map.Entry<String, String> entry : a2.entrySet()) {
                                    CronetHttpURLConnection.this.f155839c.a(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        CronetHttpURLConnection.this.f155839c.b();
                        return;
                    }
                    return;
                }
            } catch (MalformedURLException unused) {
            }
            CronetHttpURLConnection.this.f155842f = acVar;
            if (CronetHttpURLConnection.this.f155839c != null) {
                a((IOException) null, false);
            }
            if (g.a()) {
                CronetHttpURLConnection.this.getURL();
            }
        }
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        if (this.f155841e == null && this.doOutput) {
            if (this.connected) {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            } else if (h()) {
                this.f155841e = new b(this, this.chunkLength, this.f155838b);
                e();
            } else {
                long d2 = d();
                if (d2 != -1) {
                    c cVar = new c(this, d2, this.f155838b);
                    this.f155841e = cVar;
                    if (d2 == 0) {
                        setFixedLengthStreamingMode((int) cVar.c().a());
                        if (getRequestProperty("Content-Length") == null) {
                            addRequestProperty("Content-Length", Long.toString(this.f155841e.c().a()));
                        } else {
                            setRequestProperty("Content-Length", Long.toString(this.f155841e.c().a()));
                        }
                    }
                    e();
                } else {
                    String requestProperty = getRequestProperty("Content-Length");
                    if (requestProperty == null) {
                        this.f155841e = new a(this);
                    } else {
                        this.f155841e = new a(this, Long.parseLong(requestProperty));
                    }
                }
            }
        }
        return this.f155841e;
    }

    private void e() {
        if (!this.connected) {
            if (g.a()) {
                getURL();
            }
            h.a aVar = (h.a) this.p.a(getURL().toString(), new a(), this.f155838b);
            if (this.doOutput) {
                if (this.method.equals("GET")) {
                    this.method = "POST";
                }
                e eVar = this.f155841e;
                if (eVar != null) {
                    aVar.a(eVar.c(), this.f155838b);
                    if (getRequestProperty("Content-Length") == null && !h()) {
                        addRequestProperty("Content-Length", Long.toString(this.f155841e.c().a()));
                    }
                    this.f155841e.a();
                } else if (getRequestProperty("Content-Length") == null) {
                    addRequestProperty("Content-Length", "0");
                }
                if (getRequestProperty("Content-Type") == null) {
                    addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                }
            }
            Map<String, String> a2 = a(a(getURL()));
            if (!a2.isEmpty()) {
                for (Map.Entry<String, String> entry : a2.entrySet()) {
                    aVar.a(entry.getKey(), entry.getValue());
                }
            }
            for (Pair<String, String> pair : this.q) {
                aVar.a((String) pair.first, (String) pair.second);
            }
            if (!getUseCaches()) {
                aVar.a();
            }
            aVar.a(this.method);
            if (this.r) {
                aVar.a(this.s);
            }
            if (this.t) {
                aVar.b(this.u);
            }
            aVar.c(this.w);
            aVar.d(this.x);
            aVar.e(this.y);
            aVar.f(this.z);
            aVar.g(this.A);
            h b2 = aVar.b();
            this.f155839c = b2;
            int i2 = this.B;
            if (i2 != 0) {
                b2.a(i2);
            }
            this.f155839c.a();
            long j2 = this.C;
            if (j2 > 0) {
                this.f155839c.a(j2);
            }
            this.connected = true;
        }
    }

    public void setConnectTimeout(int i2) {
        super.setConnectTimeout(i2);
    }

    public void setInputStreamBufferSize(int i2) {
        this.f155847k = i2;
    }

    public void setRequestFlag(int i2) {
        this.B = i2;
    }

    public void setRequestPriority(int i2) {
        this.w = i2;
    }

    public void setRequestTimeout(int i2) {
        this.A = i2;
    }

    public void setSocketConnectTimeout(int i2) {
        this.x = i2;
    }

    public void setSocketReadTimeout(int i2) {
        this.y = i2;
    }

    public void setSocketWriteTimeout(int i2) {
        this.z = i2;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i2) {
        Map.Entry<String, String> b2 = b(i2);
        if (b2 == null) {
            return null;
        }
        return b2.getValue();
    }

    public final String getHeaderFieldKey(int i2) {
        Map.Entry<String, String> b2 = b(i2);
        if (b2 == null) {
            return null;
        }
        return b2.getKey();
    }

    public void setThrottleNetSpeed(long j2) {
        this.C = j2;
        ab abVar = this.f155839c;
        if (abVar != null) {
            abVar.a(j2);
        }
    }

    private Map.Entry<String, String> b(int i2) {
        try {
            f();
            List d2 = d(this);
            if (i2 >= d2.size()) {
                return null;
            }
            return (Map.Entry) d2.get(i2);
        } catch (IOException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ByteBuffer byteBuffer) {
        ab abVar = this.f155839c;
        if (abVar != null) {
            abVar.a(byteBuffer);
            a(getReadTimeout());
        }
    }

    public String getRequestProperty(String str) {
        int a2 = a(str);
        if (a2 >= 0) {
            return (String) this.q.get(a2).second;
        }
        return null;
    }

    public void setException(IOException iOException) {
        d dVar = this.f155840d;
        if (dVar != null) {
            dVar.a(iOException);
        }
        e eVar = this.f155841e;
        if (eVar != null) {
            eVar.a(iOException);
        }
        this.f155845i = true;
        this.f155843g = iOException;
        ab abVar = this.f155839c;
        if (abVar != null) {
            abVar.c();
        }
    }

    public void setTrafficStatsTag(int i2) {
        if (!this.connected) {
            this.r = true;
            this.s = i2;
            return;
        }
        throw new IllegalStateException("Cannot modify traffic stats tag after connection is made.");
    }

    public void setTrafficStatsUid(int i2) {
        if (!this.connected) {
            this.t = true;
            this.u = i2;
            return;
        }
        throw new IllegalStateException("Cannot modify traffic stats UID after connection is made.");
    }

    private int a(String str) {
        for (int i2 = 0; i2 < this.q.size(); i2++) {
            if (((String) this.q.get(i2).first).equalsIgnoreCase(str)) {
                return i2;
            }
        }
        return -1;
    }

    private static List d(CronetHttpURLConnection cronetHttpURLConnection) {
        List<Map.Entry<String, String>> list = cronetHttpURLConnection.f155846j;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : cronetHttpURLConnection.f155842f.c()) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(entry));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        try {
            f();
            Map<String, List<String>> c2 = c();
            if (!c2.containsKey(str)) {
                return null;
            }
            List<String> list = c2.get(str);
            return list.get(list.size() - 1);
        } catch (IOException unused) {
            return null;
        }
    }

    public static URI a(URL url) {
        if (url == null) {
            return null;
        }
        String url2 = url.toString();
        try {
            return new URI(url2);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(url2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                try {
                    return URI.create(url2.substring(0, url2.indexOf("?")));
                } catch (Exception unused2) {
                    throw new RuntimeException(e2);
                }
            }
        }
    }

    private void a(int i2) {
        try {
            this.f155838b.a(i2);
        } catch (SocketTimeoutException unused) {
            ab abVar = this.f155839c;
            if (abVar != null) {
                abVar.d();
                this.f155838b.a();
                this.f155838b.a(i2 / 2);
            }
        } catch (Exception e2) {
            setException(new IOException("Unexpected request usage, caught in CronetHttpURLConnection, caused by ".concat(String.valueOf(e2))));
            if (this.f155839c != null) {
                this.f155838b.a();
                this.f155838b.a(i2 / 2);
            }
        }
    }

    public final Map<String, String> a(URI uri) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        List<Pair<String, String>> list = this.q;
        if (list != null) {
            for (Pair<String, String> pair : list) {
                Object obj = pair.first;
                Object obj2 = pair.second;
                List list2 = (List) hashMap2.get(obj);
                if (list2 == null) {
                    list2 = new LinkedList();
                }
                list2.add(obj2);
                hashMap2.put(obj, list2);
            }
        }
        Map<String, List<String>> map = null;
        try {
            if (this.n == null) {
                this.n = CookieHandler.getDefault();
            }
            CookieHandler cookieHandler = this.n;
            if (cookieHandler != null) {
                map = cookieHandler.get(uri, hashMap2);
            }
        } catch (Exception e2) {
            if (g.a()) {
                getURL();
                e2.getMessage();
            }
        }
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                StringBuilder sb = new StringBuilder();
                if (("X-SS-Cookie".equalsIgnoreCase(key) || "Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) && !entry.getValue().isEmpty()) {
                    int i2 = 0;
                    for (String str : entry.getValue()) {
                        if (i2 > 0) {
                            sb.append("; ");
                        }
                        sb.append(str);
                        i2++;
                    }
                    hashMap.put(key, sb.toString());
                }
            }
        }
        return hashMap;
    }

    public final void addRequestProperty(String str, String str2) {
        a(str, str2, false);
    }

    public final void setRequestProperty(String str, String str2) {
        a(str, str2, true);
    }

    public CronetHttpURLConnection(URL url, c cVar) {
        super(url);
        this.p = cVar;
    }

    private final void a(String str, String str2, boolean z2) {
        if (!this.connected) {
            int a2 = a(str);
            if (a2 >= 0) {
                if (z2) {
                    this.q.remove(a2);
                } else {
                    throw new UnsupportedOperationException("Cannot add multiple headers of the same key, " + str + ". crbug.com/432719.");
                }
            }
            this.q.add(Pair.create(str, str2));
            return;
        }
        throw new IllegalStateException("Cannot modify request property after connection is made.");
    }
}
