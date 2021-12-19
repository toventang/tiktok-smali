package com.ss.android.ugc.aweme.specact.pendant.d;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.pendant.j;
import com.ss.android.ugc.aweme.pendant.l;
import h.h;
import h.i;
import h.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class a implements com.ss.android.ugc.aweme.specact.pendant.e.d {

    /* renamed from: a  reason: collision with root package name */
    public static final h f134205a = i.a(m.SYNCHRONIZED, b.f134210a);

    /* renamed from: b  reason: collision with root package name */
    public static final C3486a f134206b = new C3486a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final h f134207c;

    /* renamed from: d  reason: collision with root package name */
    private final h f134208d;

    /* renamed from: e  reason: collision with root package name */
    private final h f134209e;

    private final Map<String, Integer> c() {
        return (Map) this.f134208d.getValue();
    }

    public final j a() {
        return (j) this.f134207c.getValue();
    }

    public final List<com.ss.android.ugc.aweme.specact.pendant.e.h> b() {
        return (List) this.f134209e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.d.a$a  reason: collision with other inner class name */
    public static final class C3486a {
        static {
            Covode.recordClassIndex(87772);
        }

        private C3486a() {
        }

        public /* synthetic */ C3486a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f134210a = new b();

        static {
            Covode.recordClassIndex(87773);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a((byte) 0);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<List<com.ss.android.ugc.aweme.specact.pendant.e.h>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f134211a = new c();

        static {
            Covode.recordClassIndex(87774);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<com.ss.android.ugc.aweme.specact.pendant.e.h> invoke() {
            return new ArrayList();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<j> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f134215a = new e();

        static {
            Covode.recordClassIndex(87776);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ j invoke() {
            return new j();
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<Map<String, Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f134216a = new f();

        static {
            Covode.recordClassIndex(87777);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<String, Integer> invoke() {
            return new LinkedHashMap();
        }
    }

    static {
        Covode.recordClassIndex(87771);
    }

    private a() {
        this.f134207c = i.a((h.f.a.a) e.f134215a);
        this.f134208d = i.a((h.f.a.a) f.f134216a);
        this.f134209e = i.a((h.f.a.a) c.f134211a);
    }

    public static final class d implements l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134212a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f134213b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ UgAwemeActivitySetting f134214c;

        static {
            Covode.recordClassIndex(87775);
        }

        @Override // com.ss.android.ugc.aweme.pendant.l
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.pendant.l
        public final void a() {
            this.f134212a.a(this.f134213b, 1);
            Iterator<T> it = this.f134212a.b().iterator();
            while (it.hasNext()) {
                it.next().c(this.f134214c);
            }
            com.bytedance.apm.b.a("pendant_load_success", (JSONObject) null, (JSONObject) null, (JSONObject) null);
        }

        d(a aVar, String str, UgAwemeActivitySetting ugAwemeActivitySetting) {
            this.f134212a = aVar;
            this.f134213b = str;
            this.f134214c = ugAwemeActivitySetting;
        }
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.d
    public final void a(com.ss.android.ugc.aweme.specact.pendant.e.h hVar) {
        h.f.b.l.d(hVar, "");
        b().add(hVar);
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.d
    public final boolean a(String str) {
        h.f.b.l.d(str, "");
        Integer num = c().get(str);
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    public final void a(String str, int i2) {
        h.f.b.l.d(str, "");
        c().put(str, Integer.valueOf(i2));
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.d
    public final void a(Context context, UgAwemeActivitySetting ugAwemeActivitySetting) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(ugAwemeActivitySetting, "");
        String d2 = com.ss.android.ugc.aweme.specact.pendant.h.a.d(ugAwemeActivitySetting);
        List<String> r = com.ss.android.ugc.aweme.specact.pendant.h.a.r(ugAwemeActivitySetting);
        String m2 = com.ss.android.ugc.aweme.specact.pendant.h.a.m(ugAwemeActivitySetting);
        if (!TextUtils.isEmpty(d2) && !r.isEmpty() && !TextUtils.isEmpty(m2)) {
            if (d2 == null) {
                h.f.b.l.b();
            }
            Integer num = c().get(d2);
            if (num == null || num.intValue() != 3) {
                a(d2, 3);
                try {
                    a().a(d2, r, m2);
                    j a2 = a();
                    d dVar = new d(this, d2, ugAwemeActivitySetting);
                    h.f.b.l.d(context, "");
                    h.f.b.l.d(dVar, "");
                    if (a2.f114692b) {
                        com.ss.android.ugc.aweme.pendant.f fVar = a2.f114691a;
                        if (fVar == null) {
                            return;
                        }
                        if (fVar.f()) {
                            dVar.a();
                            return;
                        }
                        com.ss.android.ugc.aweme.pendant.f fVar2 = a2.f114691a;
                        if (fVar2 != null) {
                            fVar2.a(context, dVar);
                            return;
                        }
                        return;
                    }
                    throw new Throwable("HAS NOT inited");
                } catch (Exception unused) {
                    a(d2, 2);
                    Iterator<T> it = b().iterator();
                    while (it.hasNext()) {
                        it.next().b(ugAwemeActivitySetting);
                    }
                }
            }
        }
    }
}
