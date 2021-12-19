package com.bytedance.ies.bullet.kit.a.a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.a.g;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.ap;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import com.bytedance.ies.bullet.service.base.resourceloader.config.i;
import com.kakao.usermgmt.StringSet;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.j.h;
import h.m.p;
import h.w;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a extends IXResourceLoader {

    /* renamed from: a  reason: collision with root package name */
    private final String f32172a = "BuildIn";

    static {
        Covode.recordClassIndex(18862);
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void cancelLoad() {
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final String getTAG() {
        return this.f32172a;
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.a.a$a  reason: collision with other inner class name */
    static final class C0683a extends m implements h.f.a.b<ap, z> {
        final /* synthetic */ CountDownLatch $countDown;
        final /* synthetic */ ap $input;
        final /* synthetic */ z.e $result;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(18863);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0683a(a aVar, z.e eVar, ap apVar, CountDownLatch countDownLatch) {
            super(1);
            this.this$0 = aVar;
            this.$result = eVar;
            this.$input = apVar;
            this.$countDown = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.bytedance.ies.bullet.service.base.ap */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ap apVar) {
            l.c(apVar, "");
            this.$result.element = apVar;
            JSONArray jSONArray = this.$input.f32564m;
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
        final /* synthetic */ ap $input;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(18864);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, ap apVar, CountDownLatch countDownLatch) {
            super(1);
            this.this$0 = aVar;
            this.$input = apVar;
            this.$countDown = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Throwable th) {
            Throwable th2 = th;
            l.c(th2, "");
            JSONArray jSONArray = this.$input.f32564m;
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
    private static com.bytedance.ies.bullet.kit.a.l a(android.net.Uri r9) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.a.a.a.a(android.net.Uri):com.bytedance.ies.bullet.kit.a.l");
    }

    private final com.bytedance.ies.bullet.kit.a.l a(String str) {
        String substring;
        j.b.a(this, "interceptAssetRequest# url=".concat(String.valueOf(str)), null, null, 6);
        i a2 = g.b.f32252a.a(getService());
        if (a2.f32628i.isEmpty()) {
            Uri parse = Uri.parse(str);
            l.a((Object) parse, "");
            return new com.bytedance.ies.bullet.kit.a.l(parse);
        }
        ArrayList arrayList = new ArrayList();
        List<String> list = a2.f32628i;
        ArrayList arrayList2 = new ArrayList(n.a((Iterable) list, 10));
        for (T t : list) {
            if (f.a((String) t)) {
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
                    return a(com.bytedance.ies.bullet.kit.a.m.c(substring));
                }
            }
        }
        Uri parse2 = Uri.parse(str);
        l.a((Object) parse2, "");
        return new com.bytedance.ies.bullet.kit.a.l(parse2);
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final ap loadSync(ap apVar, com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar) {
        l.c(apVar, "");
        l.c(jVar, "");
        j.b.a(this, "start to sync load from assets", null, null, 6);
        z.e eVar = new z.e();
        eVar.element = null;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        loadAsync(apVar, jVar, new C0683a(this, eVar, apVar, countDownLatch), new b(this, apVar, countDownLatch));
        countDownLatch.await(jVar.f32635i, TimeUnit.MILLISECONDS);
        return eVar.element;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01dc  */
    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void loadAsync(com.bytedance.ies.bullet.service.base.ap r15, com.bytedance.ies.bullet.service.base.resourceloader.config.j r16, h.f.a.b<? super com.bytedance.ies.bullet.service.base.ap, h.z> r17, h.f.a.b<? super java.lang.Throwable, h.z> r18) {
        /*
        // Method dump skipped, instructions count: 504
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.a.a.a.loadAsync(com.bytedance.ies.bullet.service.base.ap, com.bytedance.ies.bullet.service.base.resourceloader.config.j, h.f.a.b, h.f.a.b):void");
    }
}
