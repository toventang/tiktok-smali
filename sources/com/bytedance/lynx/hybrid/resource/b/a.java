package com.bytedance.lynx.hybrid.resource.b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.j.c;
import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import com.bytedance.lynx.hybrid.resource.config.j;
import com.bytedance.lynx.hybrid.resource.d.d;
import com.bytedance.lynx.hybrid.resource.d.e;
import com.bytedance.lynx.hybrid.resource.f;
import com.bytedance.lynx.hybrid.resource.n;
import com.bytedance.lynx.hybrid.resource.o;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.j.h;
import h.m.p;
import h.w;
import h.z;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a extends IHybridResourceLoader {

    /* renamed from: a  reason: collision with root package name */
    private final String f41038a = "BuildIn";

    static {
        Covode.recordClassIndex(25144);
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public final void cancelLoad() {
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public final String getTAG() {
        return this.f41038a;
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b.a$a  reason: collision with other inner class name */
    static final class C0997a extends m implements h.f.a.b<e, z> {
        final /* synthetic */ CountDownLatch $countDown;
        final /* synthetic */ e $input;
        final /* synthetic */ z.e $result;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(25145);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0997a(a aVar, z.e eVar, e eVar2, CountDownLatch countDownLatch) {
            super(1);
            this.this$0 = aVar;
            this.$result = eVar;
            this.$input = eVar2;
            this.$countDown = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.bytedance.lynx.hybrid.resource.d.e */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(e eVar) {
            l.c(eVar, "");
            this.$result.element = eVar;
            JSONArray jSONArray = this.$input.f41130l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, this.this$0.getTAG());
            jSONObject.put("status", "success");
            jSONArray.put(jSONObject);
            this.$countDown.countDown();
            return h.z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<Throwable, h.z> {
        final /* synthetic */ CountDownLatch $countDown;
        final /* synthetic */ e $input;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(25146);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, e eVar, CountDownLatch countDownLatch) {
            super(1);
            this.this$0 = aVar;
            this.$input = eVar;
            this.$countDown = countDownLatch;
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
            jSONObject.put("status", "fail");
            jSONObject.put("message", String.valueOf(th2.getMessage()));
            jSONArray.put(jSONObject);
            this.$countDown.countDown();
            return h.z.f158842a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086 A[SYNTHETIC, Splitter:B:32:0x0086] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.lynx.hybrid.resource.n a(android.net.Uri r9) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.resource.b.a.a(android.net.Uri):com.bytedance.lynx.hybrid.resource.n");
    }

    private final n a(String str) {
        String substring;
        c.a("interceptAssetRequest# url=".concat(String.valueOf(str)), (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
        com.bytedance.lynx.hybrid.resource.config.c a2 = f.b.f41155a.a(getService());
        if (a2.f41097i.isEmpty()) {
            Uri parse = Uri.parse(str);
            l.a((Object) parse, "");
            return new n(parse);
        }
        ArrayList arrayList = new ArrayList();
        List<String> list = a2.f41097i;
        ArrayList arrayList2 = new ArrayList(h.a.n.a((Iterable) list, 10));
        for (T t : list) {
            if (f.a(t)) {
                Pattern compile = Pattern.compile(t);
                l.a((Object) compile, "");
                arrayList.add(compile);
            }
            arrayList2.add(h.z.f158842a);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Matcher matcher = ((Pattern) arrayList.get(i2)).matcher(str);
            if (matcher.find()) {
                int a3 = p.a((CharSequence) str, "?", 0, false, 6);
                int a4 = p.a((CharSequence) str, "#", 0, false, 6);
                int c2 = h.c(a3, a4);
                if (c2 == -1) {
                    c2 = h.b(a3, a4);
                }
                if (c2 != -1) {
                    int end = matcher.end();
                    if (str != null) {
                        substring = str.substring(end, c2);
                        l.a((Object) substring, "");
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                } else {
                    int end2 = matcher.end();
                    if (str != null) {
                        substring = str.substring(end2);
                        l.a((Object) substring, "");
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                }
                if (p.c(substring, "/", false)) {
                    substring = substring.substring(0, substring.length() - 1);
                    l.a((Object) substring, "");
                }
                if (!TextUtils.isEmpty(substring)) {
                    return a(o.b(substring));
                }
            }
        }
        Uri parse2 = Uri.parse(str);
        l.a((Object) parse2, "");
        return new n(parse2);
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public final e loadSync(e eVar, j jVar) {
        l.c(eVar, "");
        l.c(jVar, "");
        c.a("start to sync load from assets", (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
        z.e eVar2 = new z.e();
        eVar2.element = null;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        loadAsync(eVar, jVar, new C0997a(this, eVar2, eVar, countDownLatch), new b(this, eVar, countDownLatch));
        countDownLatch.await(jVar.f41108d, TimeUnit.MILLISECONDS);
        return eVar2.element;
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public final void loadAsync(e eVar, j jVar, h.f.a.b<? super e, h.z> bVar, h.f.a.b<? super Throwable, h.z> bVar2) {
        String str;
        String str2;
        InputStream inputStream;
        String str3;
        Uri uri;
        String str4;
        Uri uri2;
        String str5 = "";
        l.c(eVar, str5);
        l.c(jVar, str5);
        l.c(bVar, str5);
        l.c(bVar2, str5);
        new com.bytedance.lynx.hybrid.resource.i.c();
        InputStream inputStream2 = null;
        c.a("start to async load from assets", (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
        if (!jVar.f41116l) {
            if (eVar instanceof com.bytedance.lynx.hybrid.resource.j) {
                ((com.bytedance.lynx.hybrid.resource.j) eVar).a("buildIn disable");
            }
            bVar2.invoke(new Throwable("buildIn disable"));
            return;
        }
        if (jVar.f41111g.length() == 0) {
            com.bytedance.lynx.hybrid.resource.d.a aVar = eVar.u;
            if (aVar == null || (str = aVar.a()) == null) {
                str = str5;
            }
        } else {
            str = jVar.f41111g;
        }
        if (jVar.f41112h.length() == 0) {
            com.bytedance.lynx.hybrid.resource.d.a aVar2 = eVar.u;
            if (aVar2 == null || (str2 = aVar2.b()) == null) {
                str2 = str5;
            }
        } else {
            str2 = jVar.f41112h;
        }
        if (str.length() == 0) {
            if (eVar instanceof com.bytedance.lynx.hybrid.resource.j) {
                ((com.bytedance.lynx.hybrid.resource.j) eVar).a("buildIn Channel/Bundle invalid");
            }
            bVar2.invoke(new Exception("buildIn Channel/Bundle invalid"));
            return;
        }
        try {
            n a2 = a(o.b(f.a(str, str2)));
            com.bytedance.lynx.hybrid.resource.p b2 = a2.b();
            if (b2 != null) {
                inputStream = b2.f41234a;
            } else {
                inputStream = null;
            }
            if (inputStream == null) {
                String uri3 = eVar.f41131m.toString();
                l.a((Object) uri3, str5);
                n a3 = a(uri3);
                com.bytedance.lynx.hybrid.resource.p b3 = a3.b();
                if (b3 == null || b3.f41234a == null) {
                    if (eVar instanceof com.bytedance.lynx.hybrid.resource.j) {
                        ((com.bytedance.lynx.hybrid.resource.j) eVar).a("buildIn File Not Found");
                    }
                    bVar2.invoke(new FileNotFoundException("buildIn File Not Found"));
                    return;
                }
                com.bytedance.lynx.hybrid.resource.p b4 = a3.b();
                if (b4 == null || (uri2 = b4.f41236c) == null || (str4 = uri2.getPath()) == null) {
                    str4 = str5;
                }
                l.a((Object) str4, str5);
                if (f.a(str4)) {
                    String substring = str4.substring(1, str4.length());
                    l.a((Object) substring, str5);
                    str5 = substring;
                }
                eVar.n = str5;
                if (b4 != null) {
                    inputStream2 = b4.f41234a;
                }
                eVar.t = inputStream2;
                eVar.o = com.bytedance.lynx.hybrid.resource.d.h.ASSET;
                eVar.p = d.BUILTIN;
                eVar.q = true;
                JSONArray jSONArray = eVar.f41130l;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringSet.name, "BUILDIN");
                jSONObject.put("status", "success");
                jSONArray.put(jSONObject);
                bVar.invoke(eVar);
                return;
            }
            com.bytedance.lynx.hybrid.resource.p b5 = a2.b();
            JSONArray jSONArray2 = eVar.f41130l;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, "BUILDIN");
            jSONObject2.put("status", "success");
            jSONArray2.put(jSONObject2);
            if (b5 == null || (uri = b5.f41236c) == null || (str3 = uri.getPath()) == null) {
                str3 = str5;
            }
            l.a((Object) str3, str5);
            if (f.a(str3)) {
                String substring2 = str3.substring(1, str3.length());
                l.a((Object) substring2, str5);
                str5 = substring2;
            }
            eVar.n = str5;
            if (b5 != null) {
                inputStream2 = b5.f41234a;
            }
            eVar.t = inputStream2;
            eVar.o = com.bytedance.lynx.hybrid.resource.d.h.ASSET;
            eVar.p = d.BUILTIN;
            eVar.q = true;
            bVar.invoke(eVar);
        } catch (Exception e2) {
            if (eVar instanceof com.bytedance.lynx.hybrid.resource.j) {
                ((com.bytedance.lynx.hybrid.resource.j) eVar).a("buildIn " + e2.getMessage());
            }
            bVar2.invoke(e2);
        }
    }
}
