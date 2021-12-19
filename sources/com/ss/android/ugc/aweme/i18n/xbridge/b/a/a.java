package com.ss.android.ugc.aweme.i18n.xbridge.b.a;

import android.util.Pair;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class a extends com.bytedance.geckox.f.a {

    /* renamed from: a  reason: collision with root package name */
    public final IHostOpenDepend.d f99945a;

    /* renamed from: b  reason: collision with root package name */
    public final String f99946b;

    static {
        Covode.recordClassIndex(63698);
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.a$a  reason: collision with other inner class name */
    static final class CallableC2449a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99947a;

        static {
            Covode.recordClassIndex(63699);
        }

        CallableC2449a(a aVar) {
            this.f99947a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f99947a.f99945a.c();
            return z.f158842a;
        }
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99948a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f99949b;

        static {
            Covode.recordClassIndex(63700);
        }

        b(a aVar, Map map) {
            this.f99948a = aVar;
            this.f99949b = map;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (this.f99949b == null) {
                this.f99948a.f99945a.b();
            } else {
                this.f99948a.f99945a.a();
            }
            return z.f158842a;
        }
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99950a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UpdatePackage f99951b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f99952c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f99953d;

        static {
            Covode.recordClassIndex(63701);
        }

        c(a aVar, UpdatePackage updatePackage, long j2, long j3) {
            this.f99950a = aVar;
            this.f99951b = updatePackage;
            this.f99952c = j2;
            this.f99953d = j3;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            JSONObject jSONObject = new JSONObject();
            UpdatePackage updatePackage = this.f99951b;
            if (updatePackage == null || (str = updatePackage.getChannel()) == null) {
                str = this.f99950a.f99946b;
            }
            jSONObject.put("channel", str);
            jSONObject.put("totalResources", this.f99952c);
            jSONObject.put("loadedResources", this.f99953d);
            com.bytedance.ies.xbridge.e.b.a(new com.bytedance.ies.xbridge.e.a(this.f99950a.f99946b + "_getGeckoUpdateProgress", System.currentTimeMillis(), new com.bytedance.ies.xbridge.model.a.a.d(jSONObject)));
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99954a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UpdatePackage f99955b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f99956c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Throwable f99957d;

        static {
            Covode.recordClassIndex(63702);
        }

        d(a aVar, UpdatePackage updatePackage, boolean z, Throwable th) {
            this.f99954a = aVar;
            this.f99955b = updatePackage;
            this.f99956c = z;
            this.f99957d = th;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            String str2;
            JSONObject jSONObject = new JSONObject();
            UpdatePackage updatePackage = this.f99955b;
            if (updatePackage == null || (str = updatePackage.getChannel()) == null) {
                str = this.f99954a.f99946b;
            }
            jSONObject.put("channel", str);
            jSONObject.put("failed", this.f99956c);
            Throwable th = this.f99957d;
            if (th == null || (str2 = th.getMessage()) == null) {
                str2 = "";
            }
            jSONObject.put("failedMsg", str2);
            com.bytedance.ies.xbridge.e.b.a(new com.bytedance.ies.xbridge.e.a(this.f99954a.f99946b + "_getGeckoUpdateResult", System.currentTimeMillis(), new com.bytedance.ies.xbridge.model.a.a.d(jSONObject)));
            return z.f158842a;
        }
    }

    @Override // com.bytedance.geckox.f.a
    public final void c(UpdatePackage updatePackage, Throwable th) {
        super.c(updatePackage, th);
        a(updatePackage, true, th);
    }

    public a(IHostOpenDepend.d dVar, String str) {
        l.d(dVar, "");
        l.d(str, "");
        this.f99945a = dVar;
        this.f99946b = str;
    }

    @Override // com.bytedance.geckox.f.a
    public final void a(UpdatePackage updatePackage, long j2) {
        super.a(updatePackage, j2);
        a(updatePackage, false, (Throwable) null);
    }

    @Override // com.bytedance.geckox.f.a
    public final void a(Map<String, List<Pair<String, Long>>> map, Throwable th) {
        super.a(map, th);
        i.b(new CallableC2449a(this), i.f4826c);
    }

    @Override // com.bytedance.geckox.f.a
    public final void a(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
        super.a(map, map2);
        i.b(new b(this, map2), i.f4826c);
    }

    private final void a(UpdatePackage updatePackage, boolean z, Throwable th) {
        i.b(new d(this, updatePackage, z, th), i.f4826c);
    }

    @Override // com.bytedance.geckox.f.a
    public final void a(UpdatePackage updatePackage, long j2, long j3) {
        super.a(updatePackage, j2, j3);
        i.b(new c(this, updatePackage, j2, j3), i.f4826c);
    }
}
