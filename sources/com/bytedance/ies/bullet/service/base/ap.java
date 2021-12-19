package com.bytedance.ies.bullet.service.base;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.json.JSONArray;

public class ap {
    public static final a y = new a((byte) 0);

    /* renamed from: i  reason: collision with root package name */
    public String f32560i;

    /* renamed from: j  reason: collision with root package name */
    public WebResourceResponse f32561j;

    /* renamed from: k  reason: collision with root package name */
    public an f32562k;

    /* renamed from: l  reason: collision with root package name */
    public an f32563l;

    /* renamed from: m  reason: collision with root package name */
    public JSONArray f32564m;
    public final Uri n;
    public String o = null;
    public ar p = null;
    public ao q = null;
    public boolean r = false;
    public long s = 0;
    public boolean t;
    public InputStream u;
    public d v;
    public String w;
    public long x;

    static {
        Covode.recordClassIndex(19324);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(19325);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String b() {
        ao aoVar = this.q;
        if (aoVar == null) {
            return "custom";
        }
        int i2 = aq.f32566b[aoVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return "custom";
                    }
                    return "offline";
                } else if (this.r) {
                    return "cdnCache";
                } else {
                    return "cdn";
                }
            } else if (this.p == ar.ASSET) {
                return "buildin";
            } else {
                return "offline";
            }
        } else if (this.r) {
            return "gecko";
        } else {
            return "geckoUpdate";
        }
    }

    public InputStream a() {
        MethodCollector.i(12611);
        String str = this.o;
        if (str == null) {
            str = "";
        }
        File file = new File(str);
        InputStream inputStream = this.u;
        if (inputStream != null) {
            MethodCollector.o(12611);
            return inputStream;
        } else if (!file.exists() || file.isDirectory()) {
            MethodCollector.o(12611);
            return null;
        } else {
            FileInputStream fileInputStream = new FileInputStream(file);
            MethodCollector.o(12611);
            return fileInputStream;
        }
    }

    public String toString() {
        return "[srcUri=" + this.n + ", filePath=" + this.o + ", type=" + this.p + ',' + "from=" + this.q + ", fileStream=" + this.u + ", model=" + this.v + ']';
    }

    public final void a(an anVar) {
        l.c(anVar, "");
        this.f32562k = anVar;
    }

    public final void b(an anVar) {
        l.c(anVar, "");
        this.f32563l = anVar;
    }

    public final void e(String str) {
        l.c(str, "");
        this.f32560i = str;
    }

    public final void f(String str) {
        l.c(str, "");
        this.w = str;
    }

    public final void a(JSONArray jSONArray) {
        l.c(jSONArray, "");
        this.f32564m = jSONArray;
    }

    public final File a(File file) {
        String str = this.o;
        if (str == null) {
            str = "";
        }
        ar arVar = this.p;
        if (arVar == null || aq.f32565a[arVar.ordinal()] != 1) {
            return new File(str);
        }
        if (file != null) {
            return new File(file, str);
        }
        return new File(str);
    }

    public ap(Uri uri, String str, ar arVar, ao aoVar, boolean z, long j2, boolean z2, InputStream inputStream, d dVar, String str2, long j3) {
        l.c(uri, "");
        l.c(str2, "");
        this.n = uri;
        this.t = z2;
        this.u = null;
        this.v = null;
        this.w = str2;
        this.x = j3;
        this.f32560i = "";
        this.f32562k = new an("bdx_resourceloader_fetch", null, null, 254);
        this.f32563l = new an("bdx_resourceloader_performance", null, null, 254);
        this.f32564m = new JSONArray();
    }
}
