package com.ss.android.ad.splash.core.i;

import android.os.Looper;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ad.splash.core.h;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public final class j implements b {

    /* renamed from: a  reason: collision with root package name */
    public final b f58619a;

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f58620b = h.d();

    static {
        Covode.recordClassIndex(36345);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f58621a;

        static {
            Covode.recordClassIndex(36346);
        }

        a(h.f.a.a aVar) {
            this.f58621a = aVar;
        }

        public final void run() {
            this.f58621a.invoke();
        }
    }

    private static boolean a() {
        return l.a(Looper.myLooper(), Looper.getMainLooper());
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ JSONObject $adExtJson;
        final /* synthetic */ long $adid;
        final /* synthetic */ boolean $isStandard;
        final /* synthetic */ String $logExtra;
        final /* synthetic */ long $nonStdAdid;
        final /* synthetic */ c $trackerInfo;
        final /* synthetic */ List $urls;
        final /* synthetic */ View $view;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(36347);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar, View view, long j2, List list, String str, boolean z, long j3, JSONObject jSONObject, c cVar) {
            super(0);
            this.this$0 = jVar;
            this.$view = view;
            this.$adid = j2;
            this.$urls = list;
            this.$logExtra = str;
            this.$isStandard = z;
            this.$nonStdAdid = j3;
            this.$adExtJson = jSONObject;
            this.$trackerInfo = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f58619a.b(this.$view, this.$adid, this.$urls, this.$logExtra, this.$isStandard, this.$nonStdAdid, this.$adExtJson, this.$trackerInfo);
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ JSONObject $adExtJson;
        final /* synthetic */ long $adid;
        final /* synthetic */ boolean $isStandard;
        final /* synthetic */ String $logExtra;
        final /* synthetic */ long $nonStdAdid;
        final /* synthetic */ c $trackInfo;
        final /* synthetic */ String $trackLabel;
        final /* synthetic */ List $urls;
        final /* synthetic */ View $view;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(36348);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(j jVar, View view, String str, long j2, List list, String str2, boolean z, long j3, JSONObject jSONObject, c cVar) {
            super(0);
            this.this$0 = jVar;
            this.$view = view;
            this.$trackLabel = str;
            this.$adid = j2;
            this.$urls = list;
            this.$logExtra = str2;
            this.$isStandard = z;
            this.$nonStdAdid = j3;
            this.$adExtJson = jSONObject;
            this.$trackInfo = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f58619a.a(this.$view, this.$trackLabel, this.$adid, this.$urls, this.$logExtra, this.$isStandard, this.$nonStdAdid, this.$adExtJson, this.$trackInfo);
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ JSONObject $adExtJson;
        final /* synthetic */ long $adid;
        final /* synthetic */ boolean $isStandard;
        final /* synthetic */ String $logExtra;
        final /* synthetic */ long $nonStdAdid;
        final /* synthetic */ c $trackerInfo;
        final /* synthetic */ List $urls;
        final /* synthetic */ View $view;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(36349);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(j jVar, View view, long j2, List list, String str, boolean z, long j3, JSONObject jSONObject, c cVar) {
            super(0);
            this.this$0 = jVar;
            this.$view = view;
            this.$adid = j2;
            this.$urls = list;
            this.$logExtra = str;
            this.$isStandard = z;
            this.$nonStdAdid = j3;
            this.$adExtJson = jSONObject;
            this.$trackerInfo = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f58619a.a(this.$view, this.$adid, this.$urls, this.$logExtra, this.$isStandard, this.$nonStdAdid, this.$adExtJson, this.$trackerInfo);
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ JSONObject $adExtJson;
        final /* synthetic */ long $adid;
        final /* synthetic */ boolean $isStandard;
        final /* synthetic */ String $logExtra;
        final /* synthetic */ long $nonStdAdid;
        final /* synthetic */ c $trackerInfo;
        final /* synthetic */ List $urls;
        final /* synthetic */ View $view;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(36350);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(j jVar, View view, long j2, List list, String str, boolean z, long j3, JSONObject jSONObject, c cVar) {
            super(0);
            this.this$0 = jVar;
            this.$view = view;
            this.$adid = j2;
            this.$urls = list;
            this.$logExtra = str;
            this.$isStandard = z;
            this.$nonStdAdid = j3;
            this.$adExtJson = jSONObject;
            this.$trackerInfo = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f58619a.c(this.$view, this.$adid, this.$urls, this.$logExtra, this.$isStandard, this.$nonStdAdid, this.$adExtJson, this.$trackerInfo);
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.a<z> {
        final /* synthetic */ JSONObject $adExtJson;
        final /* synthetic */ long $adid;
        final /* synthetic */ boolean $isStandard;
        final /* synthetic */ String $logExtra;
        final /* synthetic */ long $nonStdAdid;
        final /* synthetic */ c $trackerInfo;
        final /* synthetic */ List $urls;
        final /* synthetic */ View $view;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(36351);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(j jVar, View view, long j2, List list, String str, boolean z, long j3, JSONObject jSONObject, c cVar) {
            super(0);
            this.this$0 = jVar;
            this.$view = view;
            this.$adid = j2;
            this.$urls = list;
            this.$logExtra = str;
            this.$isStandard = z;
            this.$nonStdAdid = j3;
            this.$adExtJson = jSONObject;
            this.$trackerInfo = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f58619a.d(this.$view, this.$adid, this.$urls, this.$logExtra, this.$isStandard, this.$nonStdAdid, this.$adExtJson, this.$trackerInfo);
            return z.f158842a;
        }
    }

    public j(b bVar) {
        l.c(bVar, "");
        this.f58619a = bVar;
    }

    private final void a(h.f.a.a<z> aVar) {
        if (a()) {
            this.f58620b.execute(new a(aVar));
        } else {
            aVar.invoke();
        }
    }

    @Override // com.ss.android.ad.splash.core.i.b
    public final void b(View view, long j2, List<String> list, String str, boolean z, long j3, JSONObject jSONObject, c cVar) {
        a(new b(this, view, j2, list, str, z, j3, jSONObject, cVar));
    }

    @Override // com.ss.android.ad.splash.core.i.b
    public final void c(View view, long j2, List<String> list, String str, boolean z, long j3, JSONObject jSONObject, c cVar) {
        a(new e(this, view, j2, list, str, z, j3, jSONObject, cVar));
    }

    @Override // com.ss.android.ad.splash.core.i.b
    public final void d(View view, long j2, List<String> list, String str, boolean z, long j3, JSONObject jSONObject, c cVar) {
        a(new f(this, view, j2, list, str, z, j3, jSONObject, cVar));
    }

    @Override // com.ss.android.ad.splash.core.i.b
    public final void a(View view, long j2, List<String> list, String str, boolean z, long j3, JSONObject jSONObject, c cVar) {
        a(new d(this, view, j2, list, str, z, j3, jSONObject, cVar));
    }

    @Override // com.ss.android.ad.splash.core.i.b
    public final void a(View view, String str, long j2, List<String> list, String str2, boolean z, long j3, JSONObject jSONObject, c cVar) {
        a(new c(this, view, str, j2, list, str2, z, j3, jSONObject, cVar));
    }
}
