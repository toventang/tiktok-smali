package com.ss.android.ugc.aweme.tools.mvtemplate.a;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.gson.q;
import com.google.gson.t;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dm;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.aweme.tools.mvtemplate.net.AfrApi;
import com.ss.android.ugc.aweme.tools.mvtemplate.net.ImageResponse;
import com.ss.android.ugc.aweme.tools.mvtemplate.net.VideoResponse;
import com.ss.android.ugc.aweme.tools.mvtemplate.net.c;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.hk;
import com.ss.android.ugc.tools.utils.k;
import com.ss.android.vesdk.VEMVAlgorithmConfig;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.i;
import h.m.p;
import h.z;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class b implements v {

    /* renamed from: g  reason: collision with root package name */
    public static final a f140704g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public MvThemeData f140705a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f140706b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f140707c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final List<MvNetFileBean> f140708d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    final h.h f140709e = i.a((h.f.a.a) c.f140717a);

    /* renamed from: f  reason: collision with root package name */
    public final androidx.fragment.app.e f140710f;

    /* renamed from: h  reason: collision with root package name */
    private final h.h f140711h = i.a((h.f.a.a) new C3720b(this));

    /* renamed from: i  reason: collision with root package name */
    private AVETParameter f140712i;

    /* renamed from: j  reason: collision with root package name */
    private ShortVideoContext f140713j;

    /* renamed from: k  reason: collision with root package name */
    private AVChallenge f140714k;

    /* renamed from: l  reason: collision with root package name */
    private long f140715l;

    /* renamed from: m  reason: collision with root package name */
    private long f140716m;
    private final ArrayList<ImportVideoInfo> n = new ArrayList<>();

    static {
        Covode.recordClassIndex(91890);
    }

    public final com.ss.android.ugc.aweme.tools.mvtemplate.net.b b() {
        return (com.ss.android.ugc.aweme.tools.mvtemplate.net.b) this.f140711h.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(91891);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.tools.mvtemplate.net.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f140717a = new c();

        static {
            Covode.recordClassIndex(91893);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.tools.mvtemplate.net.c invoke() {
            return new com.ss.android.ugc.aweme.tools.mvtemplate.net.c();
        }
    }

    public static final class h implements com.ss.android.ugc.aweme.tools.mvtemplate.net.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f140726a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.mvtheme.d f140727b;

        static {
            Covode.recordClassIndex(91899);
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.b$h$b  reason: collision with other inner class name */
        static final class C3721b extends m implements h.f.a.a<z> {
            final /* synthetic */ h this$0;

            static {
                Covode.recordClassIndex(91901);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3721b(h hVar) {
                super(0);
                this.this$0 = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f140726a.a(this.this$0.f140727b);
                return z.f158842a;
            }
        }

        static final class a extends m implements h.f.a.a<z> {
            final /* synthetic */ String $message;
            final /* synthetic */ h this$0;

            static {
                Covode.recordClassIndex(91900);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h hVar, String str) {
                super(0);
                this.this$0 = hVar;
                this.$message = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                if (this.$message.length() > 0) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.this$0.f140726a.f140710f).a(this.$message).a();
                } else {
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.this$0.f140726a.f140710f).a(this.this$0.f140726a.f140710f.getResources().getString(R.string.c_)).a();
                }
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.tools.mvtemplate.net.e
        public final void a(ArrayList<MvNetFileBean> arrayList) {
            List<String> list;
            String h2;
            l.d(arrayList, "");
            for (T t : arrayList) {
                b bVar = this.f140726a;
                com.ss.android.ugc.aweme.mvtheme.d dVar = this.f140727b;
                MvThemeData mvThemeData = bVar.f140705a;
                if (mvThemeData != null && (list = mvThemeData.n) != null && list.contains(t.getAlgorithm()) && ((h2 = com.ss.android.ugc.tools.utils.h.h(t.getFilePath())) == null || !(p.c(h2, ".mp4", false) || p.c(h2, "/mp4", false)))) {
                    dVar.photoToSave.add(t.getFilePath());
                }
                dVar.newMaskFileData.add(t);
            }
            List<MvNetFileBean> list2 = this.f140726a.f140708d;
            list2.clear();
            ArrayList<MvNetFileBean> arrayList2 = this.f140727b.newMaskFileData;
            l.b(arrayList2, "");
            list2.addAll(arrayList2);
            this.f140726a.b().a(new C3721b(this));
        }

        h(b bVar, com.ss.android.ugc.aweme.mvtheme.d dVar) {
            this.f140726a = bVar;
            this.f140727b = dVar;
        }

        @Override // com.ss.android.ugc.aweme.tools.mvtemplate.net.e
        public final void a(ArrayList<MvNetFileBean> arrayList, String str) {
            l.d(arrayList, "");
            l.d(str, "");
            this.f140726a.f140708d.addAll(arrayList);
            this.f140726a.b().a(new a(this, str));
            com.ss.android.ugc.aweme.tools.mvtemplate.e.a.a(false, this.f140726a.f140705a, (h.p<Integer, String>) h.v.a(103, str));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.b$b  reason: collision with other inner class name */
    static final class C3720b extends m implements h.f.a.a<com.ss.android.ugc.aweme.tools.mvtemplate.net.b> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(91892);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3720b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.tools.mvtemplate.net.b invoke() {
            return new com.ss.android.ugc.aweme.tools.mvtemplate.net.b(this.this$0.f140710f);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v
    public final void a() {
        b.i.b(new d(this), b.i.f4824a);
    }

    static final class g extends m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(91898);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            new com.ss.android.ugc.aweme.tux.a.i.a(this.this$0.f140710f).a(this.this$0.f140710f.getResources().getString(R.string.c_)).a();
            return z.f158842a;
        }
    }

    static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f140718a;

        static {
            Covode.recordClassIndex(91894);
        }

        d(b bVar) {
            this.f140718a = bVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            for (Map.Entry<String, String> entry : this.f140718a.f140707c.entrySet()) {
                if (p.c(entry.getValue(), ".bmp", false)) {
                    com.ss.android.ugc.aweme.video.e.c(entry.getValue());
                }
            }
            Iterator<T> it = this.f140718a.f140708d.iterator();
            while (it.hasNext()) {
                com.ss.android.ugc.aweme.video.e.c(it.next().getFilePath());
            }
            return z.f158842a;
        }
    }

    static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f140719a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.mvtheme.d f140720b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.c f140721c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.c f140722d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z.c f140723e;

        static {
            Covode.recordClassIndex(91895);
        }

        e(b bVar, com.ss.android.ugc.aweme.mvtheme.d dVar, z.c cVar, z.c cVar2, z.c cVar3) {
            this.f140719a = bVar;
            this.f140720b = dVar;
            this.f140721c = cVar;
            this.f140722d = cVar2;
            this.f140723e = cVar3;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ArrayList arrayList = new ArrayList();
            String str = com.ss.android.ugc.aweme.tools.mvtemplate.e.b.a("resize_bitmap_tmp") + File.separator;
            Iterator<String> it = this.f140720b.selectMediaList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (com.ss.android.ugc.tools.utils.i.a(next)) {
                    if (this.f140719a.f140707c.containsKey(next.toString())) {
                        String str2 = this.f140719a.f140707c.get(next.toString());
                        if (str2 == null) {
                            l.b();
                        }
                        arrayList.add(str2);
                    } else if (com.ss.android.ugc.aweme.ci.a.a(next) == null) {
                        arrayList.add(next);
                    } else {
                        String str3 = str + com.ss.android.ugc.aweme.tools.mvtemplate.e.b.c(".bmp");
                        if (com.ss.android.ugc.aweme.tools.mvtemplate.e.b.a(next, str3, this.f140721c.element, this.f140722d.element, this.f140723e.element, Bitmap.CompressFormat.PNG)) {
                            this.f140719a.f140707c.put(next.toString(), str3);
                            arrayList.add(str3);
                        } else {
                            arrayList.add(next);
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                this.f140720b.selectMediaList.clear();
                this.f140720b.selectMediaList.addAll(arrayList);
            }
            return h.z.f158842a;
        }
    }

    public b(androidx.fragment.app.e eVar) {
        l.d(eVar, "");
        this.f140710f = eVar;
    }

    static final class f<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f140724a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.mvtheme.d f140725b;

        static {
            Covode.recordClassIndex(91896);
        }

        f(b bVar, com.ss.android.ugc.aweme.mvtheme.d dVar) {
            this.f140724a = bVar;
            this.f140725b = dVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            boolean z;
            boolean z2;
            boolean z3;
            if (this.f140724a.f140706b) {
                b bVar = this.f140724a;
                MvThemeData mvThemeData = bVar.f140705a;
                if (mvThemeData == null) {
                    l.b();
                }
                String d2 = mvThemeData.d();
                if (d2 == null) {
                    l.b();
                }
                l.b(d2, "");
                ArrayList<String> arrayList = this.f140725b.selectMediaList;
                l.b(arrayList, "");
                com.ss.android.ugc.aweme.mvtheme.d dVar = this.f140725b;
                VEMVAlgorithmConfig mVAlgorithmConfigs = VEUtils.getMVAlgorithmConfigs(d2, arrayList);
                if (mVAlgorithmConfigs == null) {
                    bVar.b().a(new g(bVar));
                    com.ss.android.ugc.aweme.tools.mvtemplate.e.a.a(false, bVar.f140705a, (h.p<Integer, String>) h.v.a(102, "algorithmConfig is null"));
                } else {
                    com.ss.android.ugc.aweme.tools.mvtemplate.net.c cVar = (com.ss.android.ugc.aweme.tools.mvtemplate.net.c) bVar.f140709e.getValue();
                    h hVar = new h(bVar, dVar);
                    l.d(mVAlgorithmConfigs, "");
                    l.d(hVar, "");
                    z.e eVar = new z.e();
                    eVar.element = "";
                    z.c cVar2 = new z.c();
                    cVar2.element = 0;
                    cVar.f140880b.clear();
                    ArrayList arrayList2 = new ArrayList();
                    VEMVAlgorithmConfig.AlgorithmInfo[] algorithmInfoArr = mVAlgorithmConfigs.infos;
                    int length = algorithmInfoArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        VEMVAlgorithmConfig.AlgorithmInfo algorithmInfo = algorithmInfoArr[i2];
                        if (algorithmInfo.photoPath == null) {
                            arrayList2.clear();
                            break;
                        }
                        String str = algorithmInfo.photoPath;
                        com.ss.android.ugc.aweme.tools.mvtemplate.net.a b2 = cVar.b();
                        l.b(str, "");
                        String a2 = b2.a(str);
                        VEMVAlgorithmConfig.AlgorithmInfo.AlgorithmItem[] algorithmItemArr = algorithmInfo.items;
                        l.b(algorithmItemArr, "");
                        String str2 = "";
                        String str3 = str2;
                        for (VEMVAlgorithmConfig.AlgorithmInfo.AlgorithmItem algorithmItem : algorithmItemArr) {
                            VEMVAlgorithmConfig.MV_REESULT_OUT_TYPE mv_reesult_out_type = algorithmItem.result_out_type;
                            if (mv_reesult_out_type != null) {
                                int i3 = com.ss.android.ugc.aweme.tools.mvtemplate.net.d.f140900a[mv_reesult_out_type.ordinal()];
                                com.google.gson.l lVar = null;
                                if (i3 == 1 || i3 == 2) {
                                    if (algorithmItem.isNeedServerExecute) {
                                        com.ss.android.ugc.aweme.tools.mvtemplate.net.a b3 = cVar.b();
                                        String str4 = algorithmItem.algorithmName;
                                        l.b(str4, "");
                                        MvNetFileBean a3 = b3.a(a2, str4);
                                        if (a3 == null) {
                                            String str5 = algorithmItem.algorithmParamJson;
                                            if (str5 == null || str5.length() == 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                str3 = str3 + algorithmItem.algorithmName + ',';
                                                str2 = str2 + algorithmItem.result_out_type.ordinal() + ',';
                                            } else {
                                                l.b(algorithmItem, "");
                                                String a4 = cVar.b().a(str);
                                                if (algorithmItem.isNeedServerExecute && hk.a(algorithmItem.algorithmName)) {
                                                    com.ss.android.ugc.aweme.tools.mvtemplate.net.a b4 = cVar.b();
                                                    String str6 = algorithmItem.algorithmName;
                                                    l.b(str6, "");
                                                    MvNetFileBean a5 = b4.a(a4, str6);
                                                    if (a5 == null) {
                                                        TypedFile typedFile = new TypedFile("image/*", new File(str));
                                                        try {
                                                            lVar = q.a(algorithmItem.algorithmParamJson);
                                                        } catch (t unused) {
                                                        }
                                                        if (!com.ss.android.ugc.aweme.port.in.c.u.a() && com.ss.android.ugc.aweme.port.in.c.u.b()) {
                                                            AfrApi a6 = cVar.a();
                                                            String str7 = algorithmItem.algorithmName;
                                                            l.b(str7, "");
                                                            f.a.t<ImageResponse> b5 = a6.getImageInfo(str7, a4, String.valueOf(algorithmItem.result_out_type.ordinal()), typedFile, lVar).f(c.b.f140884a).b(f.a.h.a.b(f.a.k.a.f158006c));
                                                            l.b(b5, "");
                                                            arrayList2.add(b5);
                                                        }
                                                    } else {
                                                        cVar.f140880b.add(a5);
                                                    }
                                                }
                                            }
                                        } else {
                                            cVar.f140880b.add(a3);
                                        }
                                    }
                                } else if (i3 == 3 || i3 == 4) {
                                    l.b(algorithmItem, "");
                                    String a7 = cVar.b().a(str);
                                    if (algorithmItem.isNeedServerExecute) {
                                        String str8 = algorithmItem.algorithmName;
                                        l.b(str8, "");
                                        if (str8.length() > 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            com.ss.android.ugc.aweme.tools.mvtemplate.net.a b6 = cVar.b();
                                            String str9 = algorithmItem.algorithmName;
                                            l.b(str9, "");
                                            MvNetFileBean a8 = b6.a(a7, str9);
                                            if (a8 == null) {
                                                TypedFile typedFile2 = new TypedFile("image/*", new File(str));
                                                try {
                                                    lVar = q.a(algorithmItem.algorithmParamJson);
                                                } catch (t unused2) {
                                                }
                                                if (!com.ss.android.ugc.aweme.port.in.c.u.a() && com.ss.android.ugc.aweme.port.in.c.u.b()) {
                                                    AfrApi a9 = cVar.a();
                                                    String str10 = algorithmItem.algorithmName;
                                                    l.b(str10, "");
                                                    f.a.t<VideoResponse> b7 = a9.getVideoInfo(str10, a7, algorithmItem.result_out_type.ordinal(), typedFile2, lVar).f(c.d.f140886a).b(f.a.h.a.b(f.a.k.a.f158006c));
                                                    l.b(b7, "");
                                                    arrayList2.add(b7);
                                                }
                                            } else {
                                                cVar.f140880b.add(a8);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        String b8 = p.b(str3, (CharSequence) ",");
                        String b9 = p.b(str2, (CharSequence) ",");
                        if (b8.length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z && !com.ss.android.ugc.aweme.port.in.c.u.a() && com.ss.android.ugc.aweme.port.in.c.u.b()) {
                            f.a.t<ImageResponse> b10 = cVar.a().getImageInfo(b8, a2, b9, new TypedFile("image/*", new File(str)), null).f(c.C3730c.f140885a).b(f.a.h.a.b(f.a.k.a.f158006c));
                            l.b(b10, "");
                            arrayList2.add(b10);
                        }
                        i2++;
                    }
                    if (!arrayList2.isEmpty()) {
                        cVar.f140879a = f.a.t.a(arrayList2, new c.f(cVar2, eVar)).d(new c.g(cVar, cVar2)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c.h(cVar, cVar2, hVar, eVar), new c.i(cVar, hVar, eVar), new c.j(cVar));
                    } else if (cVar.f140880b.isEmpty()) {
                        hVar.a(cVar.f140880b, eVar.element);
                    } else {
                        hVar.a(cVar.f140880b);
                    }
                }
            } else {
                this.f140724a.b().a(new h.f.a.a<h.z>(this) {
                    /* class com.ss.android.ugc.aweme.tools.mvtemplate.a.b.f.AnonymousClass1 */
                    final /* synthetic */ f this$0;

                    static {
                        Covode.recordClassIndex(91897);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ h.z invoke() {
                        this.this$0.f140724a.a(this.this$0.f140725b);
                        return h.z.f158842a;
                    }
                });
            }
            return h.z.f158842a;
        }
    }

    public final void a(com.ss.android.ugc.aweme.mvtheme.d dVar) {
        String str;
        String str2;
        List<String> list;
        if (com.ss.android.ugc.aweme.port.in.g.a().A() != null && com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
            com.ss.android.ugc.aweme.tools.mvtemplate.e.a.a(false, this.f140705a, (h.p<Integer, String>) h.v.a(101, "teen mode"));
        } else if (dVar.selectMediaList.isEmpty()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f140710f).a(this.f140710f.getString(R.string.cjq)).a();
            com.ss.android.ugc.aweme.tools.mvtemplate.e.a.a(false, this.f140705a, (h.p<Integer, String>) h.v.a(100, "media list is empty"));
        } else {
            long currentTimeMillis = System.currentTimeMillis() - this.f140716m;
            MvThemeData mvThemeData = this.f140705a;
            if (mvThemeData != null) {
                str = mvThemeData.a();
            } else {
                str = null;
            }
            boolean z = this.f140706b;
            l.d(dVar, "");
            if (!k.a(dVar.selectMediaList) && str != null) {
                com.ss.android.ugc.aweme.df.q.a("aweme_mv_generate_duration", 0, new ar().a("duration", Long.valueOf(currentTimeMillis)).a("pictureCount", Integer.valueOf(dVar.selectMediaList.size())).a("needServer", Boolean.valueOf(z)).a("mvID", str).a());
            }
            r.a("upload_event_next", new com.ss.android.ugc.tools.f.b().a("content_type", UGCMonitor.TYPE_PHOTO).a("upload_type", "mv").f149193a);
            androidx.fragment.app.e eVar = this.f140710f;
            MvThemeData mvThemeData2 = this.f140705a;
            if (mvThemeData2 != null) {
                str2 = mvThemeData2.a();
            } else {
                str2 = null;
            }
            ad.a(eVar, str2, 2);
            androidx.fragment.app.e eVar2 = this.f140710f;
            MvThemeData mvThemeData3 = this.f140705a;
            AVChallenge aVChallenge = this.f140714k;
            ShortVideoContext shortVideoContext = this.f140713j;
            if (shortVideoContext == null) {
                l.a("shortVideoContext");
            }
            AVETParameter aVETParameter = this.f140712i;
            long j2 = this.f140715l;
            ArrayList<ImportVideoInfo> arrayList = this.n;
            l.d(eVar2, "");
            l.d(dVar, "");
            l.d(shortVideoContext, "");
            Intent intent = new Intent();
            if (mvThemeData3 != null) {
                list = mvThemeData3.b();
            } else {
                list = null;
            }
            dVar.musicIds = list;
            if (mvThemeData3 != null && !TextUtils.isEmpty(mvThemeData3.a())) {
                com.ss.android.ugc.aweme.shortvideo.i iVar = new com.ss.android.ugc.aweme.shortvideo.i();
                iVar.mvThemeId = mvThemeData3.a();
                MvModel mvModel = new MvModel();
                mvModel.setMvId(mvThemeData3.a());
                mvModel.setName(mvThemeData3.f140618a.getName());
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(mvThemeData3.f140618a.getIconUrl().getUrlList());
                mvModel.setIconUrl(urlModel);
                iVar.mvInfo = mvModel;
                intent.putExtra("av_upload_struct", iVar);
                if (!k.a(mvThemeData3.b())) {
                    intent.putExtra("first_sticker_music_ids", new com.google.gson.f().b(mvThemeData3.b()));
                }
                if (TextUtils.equals(mvThemeData3.a(), shortVideoContext.am)) {
                    intent.putExtra("extra_bind_mv_id", shortVideoContext.am);
                }
                dVar.mvResUnzipPath = mvThemeData3.d();
                dVar.mvType = mvThemeData3.f140627j;
                dVar.mvId = mvThemeData3.a();
                dVar.mvAutoSaveToast = mvThemeData3.f140630m;
            }
            dVar.contactVideoPath = com.ss.android.ugc.aweme.tools.mvtemplate.e.b.a("contact_video") + File.separator + com.ss.android.ugc.aweme.tools.mvtemplate.e.b.c(".mp4");
            intent.putExtra("key_mv_theme_data", dVar);
            intent.putExtra("creative_flow_data", (Parcelable) shortVideoContext.f124756a);
            intent.putExtra("key_mv_theme_enter", true);
            if (arrayList != null && !arrayList.isEmpty()) {
                intent.putParcelableArrayListExtra("extra_import_video_info_list", arrayList);
            }
            dm.a(intent, shortVideoContext);
            if (aVETParameter != null) {
                cr a2 = cr.a();
                l.b(a2, "");
                List list2 = a2.f125298d;
                if (aVChallenge != null) {
                    if (list2 == null) {
                        list2 = new ArrayList();
                    }
                    list2.add(aVChallenge);
                }
                EditPreviewInfo a3 = new com.ss.android.ugc.aweme.shortvideo.edit.model.f(720, 1280).a(dVar);
                Objects.requireNonNull(a3, "null cannot be cast to non-null type android.os.Parcelable");
                intent.putExtra("extra_edit_preview_info", (Parcelable) a3);
                Objects.requireNonNull(list2, "null cannot be cast to non-null type java.io.Serializable");
                intent.putExtra("challenge", (Serializable) list2);
                intent.putExtra("shoot_way", aVETParameter.getShootWay());
                intent.putExtra("creation_id", aVETParameter.getCreationId());
                intent.putExtra("shoot_mode", aVETParameter.getShootMode());
                intent.putExtra("draft_id", aVETParameter.getDraftId());
                intent.putExtra("new_draft_id", aVETParameter.getNewDraftId());
                intent.putExtra("origin", 0);
                intent.putExtra("content_type", "mv");
                intent.putExtra("content_source", "upload");
                intent.putExtra("tag_id", shortVideoContext.Y);
                intent.putExtra("comment_video_model", shortVideoContext.f124767l);
                intent.putExtra("question_answer_video_model", shortVideoContext.f124768m);
                intent.putExtra("extra_start_enter_edit_page", j2);
                intent.putExtra("micro_app_info", shortVideoContext.ah);
                intent.putExtra("enter_method", shortVideoContext.y);
                intent.putExtra("commerce_data_in_tools_line", shortVideoContext.af.f124735c);
            }
            VEVideoPublishEditActivity.a((Context) this.f140710f, intent);
            com.ss.android.ugc.aweme.tools.mvtemplate.e.a.a(true, this.f140705a, (h.p<Integer, String>) null);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v
    public final void a(int i2, int i3, Intent intent) {
        Serializable serializable;
        boolean z;
        MvThemeData mvThemeData;
        String d2;
        l.d(intent, "");
        if (i2 == 10001 && i3 == -1) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            if (parcelableArrayListExtra == null) {
                l.b();
            }
            l.b(parcelableArrayListExtra, "");
            this.n.clear();
            int size = parcelableArrayListExtra.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    break;
                }
                MediaModel mediaModel = (MediaModel) parcelableArrayListExtra.get(i4);
                l.b(mediaModel, "");
                if (mediaModel.b()) {
                    this.n.clear();
                    break;
                } else {
                    this.n.add(new ImportVideoInfo(mediaModel.f109400l, mediaModel.f109401m, 0, 0, String.valueOf(i4), mediaModel.f109396h, (long) (mediaModel.r - mediaModel.q), "", "", 0, 0.0f, mediaModel.f109390b));
                    i4++;
                }
            }
            Bundle bundleExtra = intent.getBundleExtra("key_extra_info");
            Context context = BadParcelableCrashOptimizer.getContext();
            if (!(bundleExtra == null || context == null)) {
                bundleExtra.setClassLoader(context.getClassLoader());
            }
            if (bundleExtra != null) {
                serializable = bundleExtra.getSerializable("Key_mv_challenge");
            } else {
                serializable = null;
            }
            this.f140714k = (AVChallenge) serializable;
            this.f140715l = intent.getLongExtra("extra_start_enter_edit_page", System.currentTimeMillis());
            com.ss.android.ugc.aweme.mvtheme.d dVar = new com.ss.android.ugc.aweme.mvtheme.d();
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                MediaModel mediaModel2 = (MediaModel) it.next();
                ArrayList<String> arrayList = dVar.selectMediaList;
                l.b(mediaModel2, "");
                arrayList.add(mediaModel2.f109390b);
            }
            MvThemeData mvThemeData2 = (MvThemeData) intent.getParcelableExtra("key_select_mv_data");
            this.f140705a = mvThemeData2;
            if (mvThemeData2 != null) {
                z = mvThemeData2.f140628k;
            } else {
                z = false;
            }
            this.f140706b = z;
            Parcelable parcelableExtra = intent.getParcelableExtra("key_short_video_context");
            if (parcelableExtra == null) {
                l.b();
            }
            ShortVideoContext shortVideoContext = (ShortVideoContext) parcelableExtra;
            this.f140713j = shortVideoContext;
            if (shortVideoContext == null) {
                l.a("shortVideoContext");
            }
            this.f140712i = shortVideoContext.j();
            if (!k.a(dVar.selectMediaList) && (mvThemeData = this.f140705a) != null && (d2 = mvThemeData.d()) != null && d2.length() > 0) {
                this.f140716m = System.currentTimeMillis();
                if (this.f140706b) {
                    com.ss.android.ugc.aweme.tools.mvtemplate.net.b b2 = b();
                    String string = this.f140710f.getString(R.string.ca);
                    l.b(string, "");
                    b2.a(string);
                } else {
                    com.ss.android.ugc.aweme.tools.mvtemplate.net.b b3 = b();
                    String string2 = this.f140710f.getString(R.string.fyd);
                    l.b(string2, "");
                    b3.a(string2);
                }
                z.c cVar = new z.c();
                cVar.element = 720;
                z.c cVar2 = new z.c();
                cVar2.element = 1280;
                z.c cVar3 = new z.c();
                cVar3.element = 1;
                MvThemeData mvThemeData3 = this.f140705a;
                if (mvThemeData3 != null) {
                    if (!(mvThemeData3.f140624g == 0 || mvThemeData3.f140625h == 0)) {
                        cVar.element = mvThemeData3.f140624g;
                        cVar2.element = mvThemeData3.f140625h;
                    }
                    if (l.a((Object) "AspectFill", (Object) mvThemeData3.f140623f)) {
                        cVar3.element = 1;
                    } else if (l.a((Object) "AspectFit", (Object) mvThemeData3.f140623f)) {
                        cVar3.element = 3;
                    } else if (l.a((Object) "AspectWidth", (Object) mvThemeData3.f140623f)) {
                        cVar3.element = 2;
                    } else if (l.a((Object) "FreeMode", (Object) mvThemeData3.f140623f)) {
                        cVar3.element = 4;
                    } else if (l.a((Object) "CenterZoom", (Object) mvThemeData3.f140623f)) {
                        cVar3.element = 5;
                    }
                }
                dVar.srcSelectMediaList.clear();
                dVar.srcSelectMediaList.addAll(dVar.selectMediaList);
                b.i.b(new e(this, dVar, cVar, cVar2, cVar3), b.i.f4824a).a(new f(this, dVar), b.i.f4826c, null);
            }
        }
    }
}
