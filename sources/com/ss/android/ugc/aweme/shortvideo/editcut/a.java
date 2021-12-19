package com.ss.android.ugc.aweme.shortvideo.editcut;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.asve.editor.j;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.at;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.v;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.z;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class a implements com.ss.android.ugc.aweme.ak.c {

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, String> f128072b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final C3338a f128073c = new C3338a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    private static int f128074g;

    /* renamed from: a  reason: collision with root package name */
    public boolean f128075a;

    /* renamed from: d  reason: collision with root package name */
    private boolean f128076d = true;

    /* renamed from: e  reason: collision with root package name */
    private final h f128077e = i.a((h.f.a.a) b.f128084a);

    /* renamed from: f  reason: collision with root package name */
    private final h f128078f = i.a((h.f.a.a) new e(this));

    private final String c() {
        return (String) this.f128077e.getValue();
    }

    private final com.ss.android.ugc.asve.editor.a d() {
        return (com.ss.android.ugc.asve.editor.a) this.f128078f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.a$a  reason: collision with other inner class name */
    public static final class C3338a {
        static {
            Covode.recordClassIndex(83948);
        }

        private C3338a() {
        }

        public /* synthetic */ C3338a(byte b2) {
            this();
        }
    }

    static final class e extends m implements h.f.a.a<com.ss.android.ugc.asve.editor.a> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(83952);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.asve.editor.a invoke() {
            this.this$0.f128075a = true;
            return new com.ss.android.ugc.asve.editor.a(com.ss.android.ugc.aweme.shortvideo.WorkSpace.c.b());
        }
    }

    @Override // com.ss.android.ugc.aweme.ak.c
    public final void a() {
        this.f128076d = true;
        if (this.f128075a) {
            d().s();
        }
    }

    static final class b extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f128084a = new b();

        static {
            Covode.recordClassIndex(83949);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return g.a().g().c().b("recompile");
        }
    }

    public static final class d implements VEListener.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f128086a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f128087b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f128088c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f128089d;

        static {
            Covode.recordClassIndex(83951);
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileDone() {
            a.f128072b.put(this.f128088c, this.f128087b);
            this.f128086a.invoke(true, this.f128087b);
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileProgress(float f2) {
            h.f.a.b bVar = this.f128089d;
            if (bVar != null) {
                bVar.invoke(Float.valueOf(f2));
            }
        }

        d(h.f.a.m mVar, String str, String str2, h.f.a.b bVar) {
            this.f128086a = mVar;
            this.f128087b = str;
            this.f128088c = str2;
            this.f128089d = bVar;
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileError(int i2, int i3, float f2, String str) {
            this.f128086a.invoke(false, this.f128087b);
        }
    }

    static {
        Covode.recordClassIndex(83947);
    }

    public final void b() {
        com.ss.android.ugc.tools.utils.i.a(c(), new c(f128072b.values()));
    }

    static final class c<I, O> implements androidx.a.a.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Collection f128085a;

        static {
            Covode.recordClassIndex(83950);
        }

        c(Collection collection) {
            this.f128085a = collection;
        }

        @Override // androidx.a.a.c.a
        public final /* synthetic */ Object a(Object obj) {
            File file = (File) obj;
            Collection collection = this.f128085a;
            l.b(file, "");
            return Boolean.valueOf(!collection.contains(file.getPath()));
        }
    }

    private final void a(com.ss.android.ugc.aweme.shortvideo.cut.e eVar, VEListener.q qVar) {
        d().c(-1);
        List<VideoSegment> list = eVar.f125452a;
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(com.ss.android.ugc.aweme.shortvideo.edit.model.b.a((VideoSegment) it.next()));
        }
        v.a.a(arrayList, d());
        try {
            d().a(eVar.f125453b, eVar.f125454c, v.a.a(eVar), qVar);
        } catch (z e2) {
            qVar.onCompileError(4118, 0, 0.0f, e2.getMessage());
        }
    }

    @Override // com.ss.android.ugc.aweme.ak.c
    public final void a(String str, VideoSegment videoSegment, h.f.a.b<? super Float, h.z> bVar, h.f.a.m<? super Boolean, ? super String, h.z> mVar) {
        String str2 = str;
        l.d(videoSegment, "");
        l.d(mVar, "");
        String str3 = videoSegment.a(false).toString();
        String str4 = f128072b.get(str3);
        if (str4 == null || !com.ss.android.ugc.tools.utils.i.a(str4)) {
            if (str2 == null) {
                File file = new File(c());
                if (!file.exists()) {
                    file.mkdirs();
                }
                StringBuilder append = new StringBuilder().append(c());
                StringBuilder sb = new StringBuilder("-");
                int i2 = f128074g;
                f128074g = i2 + 1;
                str2 = new File(append.append(dj.b(sb.append(i2).append("-concat-v").toString())).toString()).getPath();
                l.b(str2, "");
            }
            String a2 = SettingsManager.a().a("import_compile_external_settings", "");
            l.b(a2, "");
            List a3 = n.a(videoSegment);
            com.ss.android.ugc.aweme.shortvideo.cut.e eVar = new com.ss.android.ugc.aweme.shortvideo.cut.e(a3, str2, null, -1, -1, com.ss.android.ugc.aweme.shortvideo.cut.g.a(a3), false, null, null, null, 0, 0, a2, 8128);
            List a4 = n.a(str3);
            d dVar = new d(mVar, str2, str3, bVar);
            com.ss.android.ugc.asve.editor.a d2 = d();
            Object[] array = a4.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            if (d2.a(new j((String[]) array)) == 0) {
                int a5 = at.a();
                com.ss.android.ugc.asve.editor.a d3 = d();
                if (a5 <= 0) {
                    a5 = 30;
                }
                d3.i(a5);
                d().a(0, 1, 0.5f);
                d().c(1);
                d().d(g.a().i().getVideoWidth(), g.a().i().getVideoHeight());
                d().b(true);
                if (d().E().f() != 0) {
                    dVar.onCompileError(4118, 0, 0.0f, "prepare error, suspend by user");
                } else {
                    a(eVar, dVar);
                }
            } else {
                dVar.onCompileError(4118, 0, 0.0f, "init error, suspend by user");
            }
        } else {
            if (bVar != null) {
                bVar.invoke(Float.valueOf(1.0f));
            }
            mVar.invoke(true, str4);
        }
    }
}
