package com.ss.android.ugc.aweme.ad.preload;

import android.text.TextUtils;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.p;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static volatile boolean f66123a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f66124b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(40643);
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f66125a;

        static {
            Covode.recordClassIndex(40644);
        }

        a(String str) {
            this.f66125a = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String call() {
            String str = "";
            MethodCollector.i(9190);
            b.f66123a = true;
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(this.f66125a, "manifest.json"));
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                Charset defaultCharset = Charset.defaultCharset();
                l.b(defaultCharset, str);
                str = new String(bArr, defaultCharset);
            } catch (Exception e2) {
                b.f66123a = false;
                com.ss.android.ugc.aweme.framework.a.a.b(3, null, "parse preload manifest file failed");
                e2.printStackTrace();
            }
            MethodCollector.o(9190);
            return str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ad.preload.b$b  reason: collision with other inner class name */
    public static final class C1479b<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f66126a;

        static {
            Covode.recordClassIndex(40645);
        }

        C1479b(String str) {
            this.f66126a = str;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            String str;
            b.f66123a = false;
            String str2 = this.f66126a;
            if (iVar != null) {
                str = (String) iVar.d();
            } else {
                str = null;
            }
            JSONObject jSONObject = new JSONObject(str);
            l.d(jSONObject, "");
            if (!TextUtils.isEmpty(str2) && str2 != null) {
                c.f66127a = new p<>(str2, jSONObject);
            }
            return null;
        }
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str) && !f66123a && c.a(str) == null) {
            i.b(new a(str), i.f4824a).a(new C1479b(str), i.f4826c, null);
        }
    }
}
