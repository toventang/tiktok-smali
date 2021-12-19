package com.ss.ugc.effectplatform.e;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a.c.d;
import com.ss.ugc.effectplatform.e.d;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import h.f.b.l;
import h.f.b.z;
import java.util.List;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final C4087a f153569e = new C4087a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ModelInfo f153570a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.ugc.effectplatform.model.algorithm.b f153571b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.b.a f153572c;

    /* renamed from: d  reason: collision with root package name */
    public final d f153573d;

    /* renamed from: f  reason: collision with root package name */
    private d f153574f;

    static {
        Covode.recordClassIndex(102379);
    }

    /* renamed from: com.ss.ugc.effectplatform.e.a$a  reason: collision with other inner class name */
    public static final class C4087a {
        static {
            Covode.recordClassIndex(102380);
        }

        private C4087a() {
        }

        public /* synthetic */ C4087a(byte b2) {
            this();
        }
    }

    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f153575a;

        static {
            Covode.recordClassIndex(102381);
        }

        @Override // com.ss.ugc.effectplatform.e.c
        public final void a(int i2, long j2) {
        }

        b(z.e eVar) {
            this.f153575a = eVar;
        }

        @Override // com.ss.ugc.effectplatform.e.c
        public final void a(e eVar) {
            l.c(eVar, "");
            if (!eVar.a()) {
                this.f153575a.element = (T) eVar.f153592f;
            }
        }
    }

    public static final class c implements j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f153576a;

        static {
            Covode.recordClassIndex(102382);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f153576a = aVar;
        }

        @Override // com.ss.ugc.effectplatform.e.j
        public final String a(d.a.d.a.c cVar, long j2, c cVar2) {
            l.c(cVar, "");
            com.ss.ugc.effectplatform.b.a aVar = this.f153576a.f153572c;
            a aVar2 = this.f153576a;
            if (aVar2.f153571b != null) {
                com.ss.ugc.effectplatform.model.algorithm.b bVar = aVar2.f153571b;
                if (bVar == null) {
                    l.a("fetchModelType");
                }
                a aVar3 = this.f153576a;
                if (aVar3.f153570a != null) {
                    ModelInfo modelInfo = aVar3.f153570a;
                    if (modelInfo == null) {
                        l.a("modelInfo");
                    }
                    return aVar.a(bVar, modelInfo, cVar);
                }
                throw new IllegalArgumentException("modelInfo is required!");
            }
            throw new IllegalArgumentException("fetchModelType is required!");
        }
    }

    public a(com.ss.ugc.effectplatform.b.a aVar, d dVar) {
        l.c(aVar, "");
        l.c(dVar, "");
        this.f153572c = aVar;
        this.f153573d = dVar;
        this.f153574f = new d.a().a(dVar).a(new c(this)).a(f.ALGORITHM).a();
    }

    public final long a(ModelInfo modelInfo, com.ss.ugc.effectplatform.model.algorithm.b bVar) {
        List<String> url;
        l.c(modelInfo, "");
        l.c(bVar, "");
        this.f153570a = modelInfo;
        ExtendedUrlModel file_url = modelInfo.getFile_url();
        this.f153571b = bVar;
        if (file_url != null) {
            List<String> url_list = file_url.getUrl_list();
            if (url_list != null && url_list.isEmpty()) {
                this.f153571b = com.ss.ugc.effectplatform.model.algorithm.b.ZIP;
            }
            List<String> zip_url_list = file_url.getZip_url_list();
            if (zip_url_list != null && zip_url_list.isEmpty()) {
                this.f153571b = com.ss.ugc.effectplatform.model.algorithm.b.ORIGIN;
            }
        }
        ExtendedUrlModel file_url2 = modelInfo.getFile_url();
        if (file_url2 == null || (url = file_url2.getUrl(bVar)) == null || url.isEmpty()) {
            throw new RuntimeException("model " + modelInfo.getName() + " download url is empty! type: " + bVar);
        }
        z.e eVar = new z.e();
        eVar.element = null;
        for (String str : url) {
            long a2 = this.f153574f.a(str, new b(eVar));
            if (a2 > 0) {
                return a2;
            }
        }
        T t = eVar.element;
        if (t == null) {
            return -1;
        }
        throw t;
    }
}
