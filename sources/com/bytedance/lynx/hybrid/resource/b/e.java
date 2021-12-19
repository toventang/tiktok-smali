package com.bytedance.lynx.hybrid.resource.b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lynx.hybrid.resource.config.GeckoConfig;
import com.bytedance.lynx.hybrid.resource.f;
import com.bytedance.lynx.hybrid.resource.n;
import com.bytedance.lynx.hybrid.resource.o;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.m.p;
import h.q;
import h.r;
import h.w;
import h.z;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public class e extends c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f41051a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final String f41052b = "GECKO";

    static {
        Covode.recordClassIndex(25158);
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader, com.bytedance.lynx.hybrid.resource.b.c
    public void cancelLoad() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(25159);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public String getTAG() {
        return this.f41052b;
    }

    public final void a(com.bytedance.lynx.hybrid.resource.d.e eVar, com.bytedance.lynx.hybrid.resource.config.j jVar, String str, String str2, boolean z, h.f.a.b<? super com.bytedance.lynx.hybrid.resource.d.e, z> bVar, h.f.a.b<? super Throwable, z> bVar2) {
        String concat;
        com.bytedance.lynx.hybrid.resource.j jVar2;
        String str3;
        com.bytedance.lynx.hybrid.resource.e a2;
        MethodCollector.i(9964);
        new com.bytedance.lynx.hybrid.resource.i.c();
        Uri a3 = o.a(f.a(str, str2));
        n a4 = a(a3, jVar, str);
        if (a4 == null || (a2 = a4.a()) == null || !a2.f41141c.exists()) {
            boolean z2 = eVar instanceof com.bytedance.lynx.hybrid.resource.j;
            if (z2) {
                if (jVar.t.length() == 0 && ((str3 = (jVar2 = (com.bytedance.lynx.hybrid.resource.j) eVar).f41213a) == null || str3.length() == 0)) {
                    jVar2.f41213a = "gecko accessKey invalid";
                } else {
                    ((com.bytedance.lynx.hybrid.resource.j) eVar).f41213a = "gecko File Not Found";
                }
            }
            if (z2) {
                concat = ((com.bytedance.lynx.hybrid.resource.j) eVar).f41213a;
            } else {
                concat = "file not find ".concat(String.valueOf(a3));
            }
            bVar2.invoke(new FileNotFoundException(concat));
            MethodCollector.o(9964);
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(a2.f41141c);
            if (fileInputStream.available() == 0) {
                if (eVar instanceof com.bytedance.lynx.hybrid.resource.j) {
                    ((com.bytedance.lynx.hybrid.resource.j) eVar).f41213a = "gecko size 0";
                }
                bVar2.invoke(new FileNotFoundException("size 0"));
                fileInputStream.close();
                MethodCollector.o(9964);
                return;
            }
            fileInputStream.close();
            q.m223constructorimpl(z.f158842a);
            eVar.n = a2.f41141c.getAbsolutePath();
            eVar.o = com.bytedance.lynx.hybrid.resource.d.h.DISK;
            eVar.p = com.bytedance.lynx.hybrid.resource.d.d.GECKO;
            Long l2 = a2.f41140b;
            eVar.r = l2 != null ? l2.longValue() : 0;
            eVar.q = z;
            JSONArray jSONArray = eVar.f41130l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, getTAG());
            jSONObject.put("status", "success");
            jSONArray.put(jSONObject);
            eVar.e(a(jVar));
            bVar.invoke(eVar);
            MethodCollector.o(9964);
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
    }

    public static final class k implements com.bytedance.lynx.hybrid.resource.config.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f41056a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f41057b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f41058c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f41059d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f41060e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.bytedance.lynx.hybrid.resource.d.e f41061f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f41062g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f41063h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f41064i;

        static {
            Covode.recordClassIndex(25169);
        }

        static final class a<V> implements Callable<z> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k f41065a;

            static {
                Covode.recordClassIndex(25170);
            }

            a(k kVar) {
                this.f41065a = kVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ z call() {
                this.f41065a.f41056a.a(this.f41065a.f41061f, (com.bytedance.lynx.hybrid.resource.config.j) this.f41065a.f41062g, this.f41065a.f41058c, this.f41065a.f41059d, false, this.f41065a.f41063h, this.f41065a.f41064i);
                return z.f158842a;
            }
        }

        static final class b<V> implements Callable<z> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k f41066a;

            static {
                Covode.recordClassIndex(25171);
            }

            b(k kVar) {
                this.f41066a = kVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ z call() {
                this.f41066a.f41056a.a(this.f41066a.f41061f, (com.bytedance.lynx.hybrid.resource.config.j) this.f41066a.f41062g, this.f41066a.f41058c, this.f41066a.f41059d, false, this.f41066a.f41063h, this.f41066a.f41064i);
                return z.f158842a;
            }
        }

        @Override // com.bytedance.lynx.hybrid.resource.config.g
        public final void a(List<String> list) {
            l.c(list, "");
            com.bytedance.lynx.hybrid.j.c.a("download success with dynamic=" + this.f41057b + " , channel=" + this.f41058c + ",bundle=" + this.f41059d, (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
            if (this.f41060e) {
                com.bytedance.lynx.hybrid.j.c.a("success, skip callbacks when onlyLocal is true", (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
            } else {
                b.i.a(new b(this), b.i.f4826c);
            }
        }

        @Override // com.bytedance.lynx.hybrid.resource.config.g
        public final void a(List<String> list, Throwable th) {
            String str;
            l.c(list, "");
            StringBuilder append = new StringBuilder("download failed with dynamic=").append(this.f41057b).append(" ,channel = ").append(this.f41058c).append(",bundle = ").append(this.f41059d).append(',');
            if (th != null) {
                str = th.getMessage();
            } else {
                str = null;
            }
            com.bytedance.lynx.hybrid.j.c.a(append.append(str).toString(), (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
            com.bytedance.lynx.hybrid.resource.d.e eVar = this.f41061f;
            if (eVar instanceof com.bytedance.lynx.hybrid.resource.j) {
                ((com.bytedance.lynx.hybrid.resource.j) eVar).f41213a = "gecko CheckUpdate Failed ";
            }
            if (this.f41060e) {
                com.bytedance.lynx.hybrid.j.c.a("failed, skip callbacks when onlyLocal is true", (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
            } else {
                b.i.a(new a(this), b.i.f4826c);
            }
        }

        k(e eVar, String str, String str2, String str3, boolean z, com.bytedance.lynx.hybrid.resource.d.e eVar2, d dVar, h.f.a.b bVar, h.f.a.b bVar2) {
            this.f41056a = eVar;
            this.f41057b = str;
            this.f41058c = str2;
            this.f41059d = str3;
            this.f41060e = z;
            this.f41061f = eVar2;
            this.f41062g = dVar;
            this.f41063h = bVar;
            this.f41064i = bVar2;
        }
    }

    static final class j extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ CountDownLatch $countDownLatch;

        static {
            Covode.recordClassIndex(25168);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(CountDownLatch countDownLatch) {
            super(1);
            this.$countDownLatch = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            l.c(th, "");
            this.$countDownLatch.countDown();
            return z.f158842a;
        }
    }

    static final class i extends m implements h.f.a.b<com.bytedance.lynx.hybrid.resource.d.e, z> {
        final /* synthetic */ CountDownLatch $countDownLatch;
        final /* synthetic */ z.e $result;

        static {
            Covode.recordClassIndex(25167);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(z.e eVar, CountDownLatch countDownLatch) {
            super(1);
            this.$result = eVar;
            this.$countDownLatch = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.lynx.hybrid.resource.d.e */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.lynx.hybrid.resource.d.e eVar) {
            l.c(eVar, "");
            this.$result.element = eVar;
            this.$countDownLatch.countDown();
            return h.z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<Throwable, h.z> {
        final /* synthetic */ com.bytedance.lynx.hybrid.resource.d.e $input;
        final /* synthetic */ h.f.a.b $reject;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(25160);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, com.bytedance.lynx.hybrid.resource.d.e eVar2, h.f.a.b bVar) {
            super(1);
            this.this$0 = eVar;
            this.$input = eVar2;
            this.$reject = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Throwable th) {
            Throwable th2 = th;
            l.c(th2, "");
            JSONArray jSONArray = this.$input.f41130l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, this.this$0.getTAG());
            jSONObject.put("status", "failed");
            jSONObject.put("detail", th2.getMessage());
            jSONArray.put(jSONObject);
            this.$reject.invoke(th2);
            return h.z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<com.bytedance.lynx.hybrid.resource.d.e, h.z> {
        final /* synthetic */ com.bytedance.lynx.hybrid.resource.d.e $input;
        final /* synthetic */ h.f.a.b $resolve;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(25161);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar, h.f.a.b bVar, com.bytedance.lynx.hybrid.resource.d.e eVar2) {
            super(1);
            this.this$0 = eVar;
            this.$resolve = bVar;
            this.$input = eVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.lynx.hybrid.resource.d.e eVar) {
            l.c(eVar, "");
            h.f.a.b bVar = this.$resolve;
            com.bytedance.lynx.hybrid.resource.d.e eVar2 = this.$input;
            JSONArray jSONArray = eVar2.f41130l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, this.this$0.getTAG());
            jSONObject.put("status", "success");
            jSONArray.put(jSONObject);
            bVar.invoke(eVar2);
            return h.z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<Throwable, h.z> {
        final /* synthetic */ com.bytedance.lynx.hybrid.resource.d.e $input;
        final /* synthetic */ h.f.a.b $reject;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(25162);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar, h.f.a.b bVar, com.bytedance.lynx.hybrid.resource.d.e eVar2) {
            super(1);
            this.this$0 = eVar;
            this.$reject = bVar;
            this.$input = eVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Throwable th) {
            Throwable th2 = th;
            l.c(th2, "");
            h.f.a.b bVar = this.$reject;
            JSONArray jSONArray = this.$input.f41130l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, this.this$0.getTAG());
            jSONObject.put("status", "failed");
            jSONObject.put("detail", th2.getMessage());
            jSONArray.put(jSONObject);
            bVar.invoke(th2);
            return h.z.f158842a;
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b.e$e  reason: collision with other inner class name */
    public static final class C1001e implements com.bytedance.lynx.hybrid.resource.config.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f41053a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f41054b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f41055c;

        static {
            Covode.recordClassIndex(25163);
        }

        @Override // com.bytedance.lynx.hybrid.resource.config.g
        public final void a(List<String> list) {
            l.c(list, "");
            com.bytedance.lynx.hybrid.j.c.a("download success with dynamic=" + this.f41053a + " , channel=" + this.f41054b + ",bundle=" + this.f41055c, (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
        }

        @Override // com.bytedance.lynx.hybrid.resource.config.g
        public final void a(List<String> list, Throwable th) {
            String str;
            l.c(list, "");
            StringBuilder append = new StringBuilder("download failed with dynamic=").append(this.f41053a).append(" ,channel = ").append(this.f41054b).append(",bundle = ").append(this.f41055c).append(",errorMessage=");
            if (th != null) {
                str = th.getMessage();
            } else {
                str = null;
            }
            com.bytedance.lynx.hybrid.j.c.a(append.append(str).toString(), (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
        }

        C1001e(int i2, String str, String str2) {
            this.f41053a = i2;
            this.f41054b = str;
            this.f41055c = str2;
        }
    }

    static final class f extends m implements h.f.a.b<com.bytedance.lynx.hybrid.resource.d.e, h.z> {
        final /* synthetic */ h.f.a.b $resolve;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(25164);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(e eVar, h.f.a.b bVar) {
            super(1);
            this.this$0 = eVar;
            this.$resolve = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.lynx.hybrid.resource.d.e eVar) {
            com.bytedance.lynx.hybrid.resource.d.e eVar2 = eVar;
            l.c(eVar2, "");
            JSONArray jSONArray = eVar2.f41130l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, this.this$0.getTAG());
            jSONObject.put("status", "success");
            jSONArray.put(jSONObject);
            this.$resolve.invoke(eVar2);
            return h.z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.b<Throwable, h.z> {
        final /* synthetic */ com.bytedance.lynx.hybrid.resource.d.e $input;
        final /* synthetic */ h.f.a.b $reject;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(25165);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(e eVar, com.bytedance.lynx.hybrid.resource.d.e eVar2, h.f.a.b bVar) {
            super(1);
            this.this$0 = eVar;
            this.$input = eVar2;
            this.$reject = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Throwable th) {
            Throwable th2 = th;
            l.c(th2, "");
            JSONArray jSONArray = this.$input.f41130l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, this.this$0.getTAG());
            jSONObject.put("status", "failed");
            jSONObject.put("detail", th2.getMessage());
            jSONArray.put(jSONObject);
            this.$reject.invoke(th2);
            return h.z.f158842a;
        }
    }

    static final class h extends m implements h.f.a.b<com.bytedance.lynx.hybrid.resource.d.e, h.z> {
        final /* synthetic */ h.f.a.b $resolve;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(25166);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(e eVar, h.f.a.b bVar) {
            super(1);
            this.this$0 = eVar;
            this.$resolve = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.lynx.hybrid.resource.d.e eVar) {
            com.bytedance.lynx.hybrid.resource.d.e eVar2 = eVar;
            l.c(eVar2, "");
            JSONArray jSONArray = eVar2.f41130l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, this.this$0.getTAG());
            jSONObject.put("status", "success");
            jSONArray.put(jSONObject);
            this.$resolve.invoke(eVar2);
            return h.z.f158842a;
        }
    }

    private final String a(com.bytedance.lynx.hybrid.resource.config.j jVar) {
        GeckoConfig a2 = f.a(f.b.f41155a.a(getService()), jVar.t);
        if (!(a2.getGeckoDepender() instanceof com.bytedance.lynx.hybrid.resource.h)) {
            return "";
        }
        com.bytedance.lynx.hybrid.resource.config.e geckoDepender = a2.getGeckoDepender();
        if (geckoDepender != null) {
            return ((com.bytedance.lynx.hybrid.resource.h) geckoDepender).a();
        }
        throw new w("null cannot be cast to non-null type");
    }

    @Override // com.bytedance.lynx.hybrid.resource.b.c
    public final com.bytedance.lynx.hybrid.resource.d.e a(com.bytedance.lynx.hybrid.resource.d.e eVar, d dVar) {
        l.c(eVar, "");
        l.c(dVar, "");
        com.bytedance.lynx.hybrid.j.c.a("start to loadSync load  channel = " + dVar.f41111g + ",bundle = " + dVar.f41112h + " from gecko", (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
        z.e eVar2 = new z.e();
        eVar2.element = null;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        loadAsync(eVar, dVar, new i(eVar2, countDownLatch), new j(countDownLatch));
        countDownLatch.await(dVar.f41108d, TimeUnit.MILLISECONDS);
        return eVar2.element;
    }

    private final void a(Uri uri, com.bytedance.lynx.hybrid.resource.config.j jVar, com.bytedance.lynx.hybrid.resource.config.g gVar) {
        if (l.a((Object) uri.getScheme(), (Object) "local_file") && l.a((Object) uri.getAuthority(), (Object) "relative")) {
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            if (path.length() > 1 && p.b(path, "/", false)) {
                String substring = path.substring(1);
                l.a((Object) substring, "");
                if (substring != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(substring);
                    com.bytedance.lynx.hybrid.resource.config.e geckoDepender = f.a(f.b.f41155a.a(getService()), jVar.t).getGeckoDepender();
                    if (geckoDepender == null) {
                        l.a();
                    }
                    geckoDepender.a(jVar, arrayList, gVar);
                    return;
                }
            }
            gVar.a(new ArrayList(), new Exception("update failed because channel is null"));
        }
    }

    private final n a(Uri uri, com.bytedance.lynx.hybrid.resource.config.j jVar, String str) {
        File file;
        try {
            String scheme = uri.getScheme();
            if (scheme == null || scheme.hashCode() != 1303296464 || !scheme.equals("local_file")) {
                throw new FileNotFoundException(uri + " not found");
            }
            String authority = uri.getAuthority();
            if (authority != null) {
                int hashCode = authority.hashCode();
                String str2 = "";
                if (hashCode != -554435892) {
                    if (hashCode == 1728122231 && authority.equals("absolute")) {
                        String path = uri.getPath();
                        if (path != null) {
                            str2 = path;
                        }
                        file = new File(str2);
                    }
                } else if (authority.equals("relative")) {
                    String path2 = uri.getPath();
                    if (path2 != null) {
                        str2 = path2;
                    }
                    String str3 = jVar.t;
                    GeckoConfig a2 = f.a(f.b.f41155a.a(getService()), jVar.t);
                    String offlineDir = a2.getOfflineDir();
                    com.bytedance.lynx.hybrid.resource.config.e geckoDepender = a2.getGeckoDepender();
                    if (geckoDepender == null) {
                        l.a();
                    }
                    String b2 = geckoDepender.b(offlineDir, str3, str2);
                    com.bytedance.lynx.hybrid.j.c.a("using gecko info [accessKey=" + str3 + ",filePath=" + b2 + ']', (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
                    if (b2 == null || b2.length() == 0) {
                        return null;
                    }
                    file = new File(b2);
                }
                n nVar = new n(uri);
                com.bytedance.lynx.hybrid.j.c.a("load from gecko success", (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
                com.bytedance.lynx.hybrid.resource.e eVar = new com.bytedance.lynx.hybrid.resource.e(file);
                eVar.f41142d = com.bytedance.lynx.hybrid.resource.d.d.GECKO;
                GeckoConfig a3 = f.a(f.b.f41155a.a(getService()), jVar.t);
                if (a3.getGeckoDepender() instanceof com.bytedance.lynx.hybrid.resource.h) {
                    com.bytedance.lynx.hybrid.resource.config.e geckoDepender2 = a3.getGeckoDepender();
                    if (geckoDepender2 != null) {
                        eVar.f41140b = Long.valueOf(((com.bytedance.lynx.hybrid.resource.h) geckoDepender2).c(a3.getOfflineDir(), jVar.t, str));
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                }
                nVar.f41232a = eVar;
                return nVar;
            }
            throw new FileNotFoundException(uri + " not found");
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v15, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r1v16, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01de, code lost:
        if (r6 != null) goto L_0x01e0;
     */
    @Override // com.bytedance.lynx.hybrid.resource.b.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.lynx.hybrid.resource.d.e r20, com.bytedance.lynx.hybrid.resource.b.d r21, h.f.a.b<? super com.bytedance.lynx.hybrid.resource.d.e, h.z> r22, h.f.a.b<? super java.lang.Throwable, h.z> r23) {
        /*
        // Method dump skipped, instructions count: 625
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.resource.b.e.a(com.bytedance.lynx.hybrid.resource.d.e, com.bytedance.lynx.hybrid.resource.b.d, h.f.a.b, h.f.a.b):void");
    }

    private final void a(com.bytedance.lynx.hybrid.resource.d.e eVar, d dVar, String str, String str2, String str3, h.f.a.b<? super com.bytedance.lynx.hybrid.resource.d.e, h.z> bVar, h.f.a.b<? super Throwable, h.z> bVar2) {
        boolean z;
        new com.bytedance.lynx.hybrid.resource.i.c();
        if (l.a((Object) eVar.f41131m.getQueryParameter("onlyLocal"), (Object) "1") || dVar.f41110f) {
            z = true;
            if (eVar instanceof com.bytedance.lynx.hybrid.resource.j) {
                ((com.bytedance.lynx.hybrid.resource.j) eVar).f41213a = "gecko only local";
                JSONArray jSONArray = eVar.f41130l;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringSet.name, getTAG());
                jSONObject.put("status", "failed");
                jSONObject.put("detail", eVar);
                jSONArray.put(jSONObject);
            }
            bVar2.invoke(new Exception("gecko only local"));
        } else {
            z = false;
        }
        Uri a2 = o.a(str);
        dVar.z = 1;
        a(a2, dVar, new k(this, str3, str, str2, z, eVar, dVar, bVar, bVar2));
    }
}
