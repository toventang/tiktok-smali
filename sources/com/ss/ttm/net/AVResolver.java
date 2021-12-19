package com.ss.ttm.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.net.InetAddress;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

public class AVResolver {

    /* renamed from: d  reason: collision with root package name */
    public static int f151896d = 600000;

    /* renamed from: h  reason: collision with root package name */
    private static final Hashtable<String, a> f151897h = new Hashtable<>();

    /* renamed from: a  reason: collision with root package name */
    public boolean f151898a;

    /* renamed from: b  reason: collision with root package name */
    public String f151899b;

    /* renamed from: c  reason: collision with root package name */
    public String[] f151900c;

    /* renamed from: e  reason: collision with root package name */
    private String f151901e;

    /* renamed from: f  reason: collision with root package name */
    private Thread f151902f;

    /* renamed from: g  reason: collision with root package name */
    private a f151903g;

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f151904a;

        /* renamed from: b  reason: collision with root package name */
        public long f151905b;

        static {
            Covode.recordClassIndex(101284);
        }

        a() {
        }
    }

    public void freeAddress() {
        Thread thread = this.f151902f;
        if (thread != null) {
            try {
                thread.interrupt();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    static {
        Covode.recordClassIndex(101283);
    }

    public int isSuccess() {
        if (!this.f151898a) {
            return 0;
        }
        String[] strArr = this.f151900c;
        if (strArr == null || strArr[0] == null) {
            return -1;
        }
        return 1;
    }

    public String getAddress() {
        String[] strArr;
        if (!this.f151898a || (strArr = this.f151900c) == null || strArr[0] == null) {
            return "parser host name: " + this.f151901e + " error.err msg:" + this.f151899b;
        }
        return strArr[0];
    }

    static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        AVResolver f151906a;

        /* renamed from: b  reason: collision with root package name */
        String f151907b;

        static {
            Covode.recordClassIndex(101285);
        }

        public final void run() {
            InetAddress inetAddress;
            Throwable th;
            String str = null;
            try {
                inetAddress = InetAddress.getByName(this.f151907b);
                try {
                    str = inetAddress.getHostAddress();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                inetAddress = null;
                this.f151906a.f151899b = th.getMessage();
                this.f151906a.f151898a = true;
                if (inetAddress != null) {
                    return;
                }
            }
            this.f151906a.f151898a = true;
            if (inetAddress != null && str != null) {
                this.f151906a.f151900c = new String[1];
                this.f151906a.f151900c[0] = str;
                a aVar = new a();
                aVar.f151905b = System.currentTimeMillis();
                aVar.f151904a = str;
                AVResolver.a(this.f151907b, aVar);
                aVar.f151905b = System.currentTimeMillis();
            }
        }

        public b(AVResolver aVResolver, String str) {
            this.f151906a = aVResolver;
            this.f151907b = str;
        }
    }

    public void getAddressInfo(String str) {
        this.f151901e = str;
        if (str == null || str.length() <= 0 || "".equals(str)) {
            this.f151898a = true;
            return;
        }
        String str2 = this.f151901e;
        if (str2.length() < 7 || str2.length() > 15 ? !(str2.charAt(0) == '[' && str2.charAt(str2.length() - 1) == ']') : !Pattern.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str2).find()) {
            Hashtable<String, a> hashtable = f151897h;
            a aVar = hashtable.get(str);
            this.f151903g = aVar;
            if (aVar != null) {
                if (aVar.f151904a == null || System.currentTimeMillis() - this.f151903g.f151905b >= ((long) f151896d)) {
                    hashtable.remove(str);
                    this.f151903g = null;
                } else {
                    String[] strArr = new String[1];
                    this.f151900c = strArr;
                    strArr[0] = this.f151903g.f151904a;
                    this.f151898a = true;
                    return;
                }
            }
            try {
                com.ss.ttm.player.b.a(new b(this, this.f151901e));
            } catch (Exception e2) {
                this.f151898a = true;
                this.f151899b = e2.getMessage();
            }
        } else {
            String[] strArr2 = new String[1];
            this.f151900c = strArr2;
            strArr2[0] = this.f151901e;
            this.f151898a = true;
        }
    }

    static synchronized void a(String str, a aVar) {
        synchronized (AVResolver.class) {
            MethodCollector.i(127);
            long currentTimeMillis = System.currentTimeMillis();
            try {
                Hashtable<String, a> hashtable = f151897h;
                String str2 = null;
                if (hashtable.size() > 128) {
                    Iterator<Map.Entry<String, a>> it = hashtable.entrySet().iterator();
                    a aVar2 = null;
                    while (it.hasNext()) {
                        a value = it.next().getValue();
                        str2 = it.next().getKey();
                        if (value != null && value.f151905b < currentTimeMillis) {
                            currentTimeMillis = value.f151905b;
                            aVar2 = value;
                        }
                    }
                    if (!(aVar2 == null || str2 == null)) {
                        f151897h.remove(str2);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            f151897h.put(str, aVar);
            MethodCollector.o(127);
        }
    }
}
