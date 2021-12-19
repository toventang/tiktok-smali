package com.ss.android.ugc.aweme.discover.lynx.b;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.bytedance.ies.bullet.ui.common.c.d;
import com.bytedance.ies.bullet.ui.common.h;
import com.kakao.usermgmt.StringSet;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.r;
import com.ss.android.ugc.aweme.bullet.e.a;
import com.ss.android.ugc.aweme.bullet.e.c;
import com.ss.android.ugc.aweme.discover.a.an;
import com.ss.android.ugc.aweme.discover.lynx.d.c;
import com.ss.android.ugc.aweme.discover.lynx.delegate.j;
import com.ss.android.ugc.aweme.discover.lynx.spark.e;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.m.p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Integer, h.b> f81439a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final b f81440b = new b();

    private b() {
    }

    public static void a() {
        f81439a.clear();
    }

    static {
        Covode.recordClassIndex(50606);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.b.b$b  reason: collision with other inner class name */
    public static final class C1898b extends m implements h.f.a.b<Uri, c> {
        final /* synthetic */ c $bulletViewCache;

        static {
            Covode.recordClassIndex(50609);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1898b(c cVar) {
            super(1);
            this.$bulletViewCache = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ c invoke(Uri uri) {
            l.d(uri, "");
            return this.$bulletViewCache;
        }
    }

    public static boolean b(String str) {
        l.d(str, "");
        if (com.ss.android.ugc.aweme.discover.lynx.spark.a.a(str)) {
            return true;
        }
        if (!c(str) || !e.a()) {
            return false;
        }
        return true;
    }

    private static boolean c(String str) {
        l.d(str, "");
        return p.a((CharSequence) j.a.a(str), (CharSequence) "user", false);
    }

    public static Bundle a(Context context) {
        l.d(context, "");
        Bundle bundle = new Bundle();
        bundle.putInt("preset_width", View.MeasureSpec.makeMeasureSpec(n.a(context), 1073741824));
        bundle.putInt("preset_height", View.MeasureSpec.makeMeasureSpec(0, 0));
        bundle.putBoolean("preset_safe_point", true);
        bundle.putInt("thread_strategy", r.PART_ON_LAYOUT.id());
        return bundle;
    }

    public static boolean a(String str) {
        l.d(str, "");
        if (b(str)) {
            l.d(str, "");
            String a2 = j.a.a(str);
            if (com.ss.android.ugc.aweme.discover.lynx.spark.b.c.a().containsKey(a2) || com.ss.android.ugc.aweme.discover.lynx.spark.b.c.b().containsKey(a2)) {
                return true;
            }
            return false;
        }
        Uri parse = Uri.parse(str);
        l.b(parse, "");
        l.d(parse, "");
        com.ss.android.ugc.aweme.bullet.e.a aVar = com.ss.android.ugc.aweme.bullet.e.b.f69286a;
        l.d(parse, "");
        for (a.C1563a aVar2 : aVar.f69283a) {
            if (l.a(aVar2.f69284a, parse)) {
                return true;
            }
        }
        return false;
    }

    private static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        l.b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject.put(next, jSONObject2.opt(next));
        }
    }

    public static final class a implements h.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f81441a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f81442b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f81443c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ BulletContainerView f81444d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f81445e;

        static {
            Covode.recordClassIndex(50607);
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(Uri uri) {
            l.d(uri, "");
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(i iVar, Uri uri, q qVar) {
            l.d(iVar, "");
            l.d(uri, "");
            l.d(qVar, "");
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(List<? extends d<? extends View>> list, Uri uri, i iVar, boolean z) {
            l.d(list, "");
            l.d(uri, "");
            l.d(iVar, "");
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(Uri uri, Throwable th) {
            l.d(uri, "");
            l.d(th, "");
            if (com.ss.android.ugc.aweme.discover.lynx.spark.b.a.a()) {
                this.f81444d.setTag(new a(d.FAILED, null, null, null, 30));
                Uri parse = Uri.parse(this.f81441a);
                if (parse != null) {
                    com.ss.android.ugc.aweme.bullet.e.b.a(parse);
                }
            }
            h.b remove = b.f81439a.remove(Integer.valueOf(this.f81445e.hashCode()));
            if (remove != null) {
                remove.a(uri, th);
            }
            th.getMessage();
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(View view, Uri uri, i iVar) {
            l.d(view, "");
            l.d(uri, "");
            l.d(iVar, "");
            this.f81445e.hashCode();
            iVar.e();
            c.a.a(this.f81441a, 3);
            this.f81444d.setTag(new a(d.SUCCEED, view, uri, iVar, 16));
            if (!com.ss.android.ugc.aweme.discover.lynx.spark.b.a.a()) {
                com.ss.android.ugc.aweme.bullet.e.b.a(this.f81441a, new h.f.a.b<Uri, com.ss.android.ugc.aweme.bullet.e.c>(this) {
                    /* class com.ss.android.ugc.aweme.discover.lynx.b.b.a.AnonymousClass1 */
                    final /* synthetic */ a this$0;

                    static {
                        Covode.recordClassIndex(50608);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ com.ss.android.ugc.aweme.bullet.e.c invoke(Uri uri) {
                        l.d(uri, "");
                        return this.this$0.f81445e;
                    }
                });
            }
            h.b remove = b.f81439a.remove(Integer.valueOf(this.f81445e.hashCode()));
            if (remove != null) {
                remove.a(view, uri, iVar);
            }
        }

        a(String str, String str2, z.e eVar, BulletContainerView bulletContainerView, com.ss.android.ugc.aweme.bullet.e.c cVar) {
            this.f81441a = str;
            this.f81442b = str2;
            this.f81443c = eVar;
            this.f81444d = bulletContainerView;
            this.f81445e = cVar;
        }
    }

    public final void a(Context context, String str, String str2) {
        l.d(context, "");
        l.d(str, "");
        if (TextUtils.isEmpty(str) || !an.a()) {
            return;
        }
        if (!c(str) || !a(str)) {
            if (b(str)) {
                com.ss.android.ugc.aweme.discover.lynx.spark.b.c.f81576b.a(context, str, str2);
                return;
            }
            z.e eVar = new z.e();
            eVar.element = null;
            a("preload", str, null, null);
            BulletContainerView a2 = com.ss.android.ugc.aweme.discover.lynx.a.a(context);
            a2.setTag(new a(d.LOADING, null, null, null, 30));
            com.bytedance.ies.bullet.c.e.a.b bVar = new com.bytedance.ies.bullet.c.e.a.b();
            bVar.b(String.class, str2);
            bVar.b(TemplateData.class, eVar.element);
            com.ss.android.ugc.aweme.bullet.e.c cVar = new com.ss.android.ugc.aweme.bullet.e.c(a2, bVar);
            if (com.ss.android.ugc.aweme.discover.lynx.spark.b.a.a()) {
                com.ss.android.ugc.aweme.bullet.e.b.a(str, new C1898b(cVar));
            }
            Uri a3 = com.ss.android.ugc.aweme.bullet.utils.c.a(str);
            com.bytedance.ies.bullet.c.e.a.b bVar2 = new com.bytedance.ies.bullet.c.e.a.b();
            if (str2 != null) {
                T t = (T) TemplateData.a(str2);
                t.a("isPreload", true);
                eVar.element = t;
                bVar2.b(TemplateData.class, eVar.element);
            }
            a2.a(a3, (Bundle) null, bVar2, new a(str, str2, eVar, a2, cVar));
        } else if (com.ss.android.ugc.aweme.discover.lynx.spark.b.d.a()) {
            com.ss.android.ugc.aweme.discover.lynx.spark.b.e.a(str, str2);
        }
    }

    public static void a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(str, "");
        l.d(str2, "");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(StringSet.type, str);
        jSONObject3.put("schema", str2);
        if (jSONObject != null) {
            a(jSONObject3, jSONObject);
        }
        com.bytedance.apm.b.a("search_bullet_preload_report", jSONObject3, jSONObject2, (JSONObject) null);
    }
}
