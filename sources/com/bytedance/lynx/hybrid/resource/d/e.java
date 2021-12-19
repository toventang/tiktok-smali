package com.bytedance.lynx.hybrid.resource.d;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lynx.hybrid.service.h;
import h.f.b.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.json.JSONArray;

public class e {
    public static final a x = new a((byte) 0);

    /* renamed from: i  reason: collision with root package name */
    public String f41127i;

    /* renamed from: j  reason: collision with root package name */
    public WebResourceResponse f41128j;

    /* renamed from: k  reason: collision with root package name */
    public h f41129k;

    /* renamed from: l  reason: collision with root package name */
    public JSONArray f41130l;

    /* renamed from: m  reason: collision with root package name */
    public final Uri f41131m;
    public String n = null;
    public h o = null;
    public d p = null;
    public boolean q = false;
    public long r = 0;
    public boolean s;
    public InputStream t;
    public a u;
    public String v;
    public long w;

    static {
        Covode.recordClassIndex(25205);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(25206);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public InputStream a() {
        MethodCollector.i(11267);
        String str = this.n;
        if (str == null) {
            str = "";
        }
        File file = new File(str);
        InputStream inputStream = this.t;
        if (inputStream != null) {
            MethodCollector.o(11267);
            return inputStream;
        } else if (file.exists()) {
            FileInputStream fileInputStream = new FileInputStream(file);
            MethodCollector.o(11267);
            return fileInputStream;
        } else {
            MethodCollector.o(11267);
            return null;
        }
    }

    public final File b() {
        String str = this.n;
        if (str == null) {
            str = "";
        }
        h hVar = this.o;
        if (hVar != null && f.f41132a[hVar.ordinal()] == 1) {
            return new File(str);
        }
        return new File(str);
    }

    public String toString() {
        return "[srcUri=" + this.f41131m + ", filePath=" + this.n + ", type=" + this.o + ',' + "from=" + this.p + ", fileStream=" + this.t + ", model=" + this.u + ']';
    }

    public final void a(h hVar) {
        l.c(hVar, "");
        this.f41129k = hVar;
    }

    public final void e(String str) {
        l.c(str, "");
        this.f41127i = str;
    }

    public final void f(String str) {
        l.c(str, "");
        this.v = str;
    }

    public final void a(JSONArray jSONArray) {
        l.c(jSONArray, "");
        this.f41130l = jSONArray;
    }

    public e(Uri uri, String str, h hVar, d dVar, boolean z, long j2, boolean z2, InputStream inputStream, a aVar, String str2, long j3) {
        l.c(uri, "");
        l.c(str2, "");
        this.f41131m = uri;
        this.s = z2;
        this.t = null;
        this.u = null;
        this.v = str2;
        this.w = j3;
        this.f41127i = "";
        this.f41129k = new h("hybrid_resource_fetch", (byte) 0);
        this.f41130l = new JSONArray();
    }
}
