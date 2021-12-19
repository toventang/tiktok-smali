package com.ss.android.ugc.aweme.video.local;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f143458e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, e> f143459a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f143460b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public long f143461c;

    /* renamed from: d  reason: collision with root package name */
    public final List<e> f143462d = new ArrayList();

    static {
        Covode.recordClassIndex(93871);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(93872);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.b$b  reason: collision with other inner class name */
    static final class C3823b extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3823b f143463a = new C3823b();

        static {
            Covode.recordClassIndex(93873);
        }

        C3823b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f143470a;

        static {
            Covode.recordClassIndex(93879);
        }

        h(h.f.a.a aVar) {
            this.f143470a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f143470a.invoke();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f143464a;

        static {
            Covode.recordClassIndex(93874);
        }

        c(String str) {
            this.f143464a = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return Boolean.valueOf(com.ss.android.ugc.aweme.video.e.c(this.f143464a));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.a<z> {
        final /* synthetic */ e $model;
        final /* synthetic */ String $sourceId$inlined;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(93878);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(e eVar, b bVar, String str) {
            super(0);
            this.$model = eVar;
            this.this$0 = bVar;
            this.$sourceId$inlined = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f143459a.remove(this.$sourceId$inlined);
            this.this$0.f143462d.remove(this.$model);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends m implements h.f.a.a<z> {
        final /* synthetic */ e $model;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(93880);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(e eVar, b bVar) {
            super(0);
            this.$model = eVar;
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f143462d.remove(this.$model);
            this.this$0.f143459a.remove(this.$model.getSourceId());
            return z.f158842a;
        }
    }

    private static int b() {
        try {
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            return iESSettingsProxy.getLocalVideoCacheMaxAge().intValue() * 60 * 1000;
        } catch (com.bytedance.ies.a unused) {
            return 259200000;
        }
    }

    private static int c() {
        try {
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            return iESSettingsProxy.getLocalVideoCacheMaxLength().intValue() * 1024 * 1024;
        } catch (com.bytedance.ies.a unused) {
            return 157286400;
        }
    }

    public final void a() {
        if (c() != 0 && this.f143461c > ((long) c())) {
            a(this.f143461c - ((long) c()));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ e $model;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(93876);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, e eVar) {
            super(0);
            this.this$0 = bVar;
            this.$model = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (b.b(this.$model)) {
                b bVar = this.this$0;
                String sourceId = this.$model.getSourceId();
                l.b(sourceId, "");
                bVar.a(sourceId, this.$model.localPath, C3823b.f143463a);
            } else {
                if (!TextUtils.isEmpty(this.$model.localPath) && !TextUtils.isEmpty(this.$model.getSourceId())) {
                    File file = new File(this.$model.localPath);
                    if (file.exists()) {
                        HashMap<String, e> hashMap = this.this$0.f143459a;
                        String sourceId2 = this.$model.getSourceId();
                        l.b(sourceId2, "");
                        hashMap.put(sourceId2, this.$model);
                        this.this$0.f143462d.add(this.$model);
                        this.this$0.f143461c += file.length();
                        bj.a("LocalVideoCache=>add cache,fileSize:" + file.length() + ",totalSize:" + this.this$0.f143461c + ",filePath:" + file.getPath());
                    }
                }
                this.this$0.a();
            }
            return z.f158842a;
        }
    }

    public final e a(String str) {
        l.d(str, "");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f143459a.get(str);
    }

    /* access modifiers changed from: package-private */
    public static final class d<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f143465a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f143466b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f143467c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f143468d;

        static {
            Covode.recordClassIndex(93875);
        }

        d(b bVar, String str, h.f.a.a aVar, String str2) {
            this.f143465a = bVar;
            this.f143466b = str;
            this.f143467c = aVar;
            this.f143468d = str2;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            this.f143465a.f143460b.remove(this.f143466b);
            this.f143467c.invoke();
            bj.a("LocalVideoCache=>delete video cache,filePath:" + this.f143468d);
            return z.f158842a;
        }
    }

    public static boolean b(e eVar) {
        if (eVar == null || SystemClock.elapsedRealtime() - eVar.getCreateTime() > ((long) b()) || TextUtils.isEmpty(eVar.localPath) || !new File(eVar.localPath).exists()) {
            return true;
        }
        return false;
    }

    public final e b(String str) {
        e eVar;
        l.d(str, "");
        if (TextUtils.isEmpty(str) || (eVar = this.f143459a.get(str)) == null) {
            return null;
        }
        l.b(eVar, "");
        String sourceId = eVar.getSourceId();
        l.b(sourceId, "");
        this.f143461c -= a(sourceId, eVar.localPath, new g(eVar, this, str));
        return eVar;
    }

    public final void a(e eVar) {
        l.d(eVar, "");
        if (eVar.getSourceId() != null) {
            e eVar2 = new e(this, eVar);
            if (l.a(Looper.myLooper(), Looper.getMainLooper())) {
                eVar2.invoke();
            } else {
                b.i.b(new h(eVar2), b.i.f4826c);
            }
        }
    }

    public final void a(Collection<? extends e> collection) {
        l.d(collection, "");
        for (e eVar : n.a((Iterable) collection, (Comparator) f.f143469a)) {
            a(eVar);
        }
    }

    public final boolean a(long j2) {
        long j3;
        ArrayList<e> arrayList = new ArrayList();
        long j4 = 0;
        int i2 = 0;
        while (j4 < j2 && i2 < this.f143462d.size()) {
            int i3 = i2 + 1;
            e eVar = this.f143462d.get(i2);
            File file = new File(eVar.localPath);
            if (file.exists()) {
                j3 = file.length();
            } else {
                j3 = 0;
            }
            arrayList.add(eVar);
            j4 += j3;
            this.f143461c -= j3;
            i2 = i3;
        }
        for (e eVar2 : arrayList) {
            String sourceId = eVar2.getSourceId();
            l.b(sourceId, "");
            a(sourceId, eVar2.localPath, new i(eVar2, this));
        }
        if (this.f143461c > j2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public static final f f143469a = new f();

        static {
            Covode.recordClassIndex(93877);
        }

        f() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            VideoUrlModel videoUrlModel = (VideoUrlModel) obj;
            VideoUrlModel videoUrlModel2 = (VideoUrlModel) obj2;
            l.b(videoUrlModel, "");
            long createTime = videoUrlModel.getCreateTime();
            l.b(videoUrlModel2, "");
            if (createTime == videoUrlModel2.getCreateTime()) {
                return 0;
            }
            if (videoUrlModel.getCreateTime() > videoUrlModel2.getCreateTime()) {
                return 1;
            }
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    public final long a(String str, String str2, h.f.a.a<z> aVar) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !this.f143460b.contains(str)) {
            File file = new File(str2);
            if (file.exists()) {
                long length = file.length();
                this.f143460b.add(str);
                b.i.b(new c(str2), com.ss.android.ugc.aweme.cw.g.a()).a(new d(this, str, aVar, str2), b.i.f4826c, null);
                return length;
            }
        }
        return 0;
    }
}
