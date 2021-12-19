package com.bytedance.android.livesdk.manage;

import android.util.Pair;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.e;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.gift.EnableAssetsDeleteTimeLimitSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftAssetsStorageLimit;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftResourceDownloadSetting;
import com.bytedance.android.livesdk.manage.api.AssetsApi;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.r;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.c.c.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import f.a.aa;
import f.a.t;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements com.bytedance.android.livesdk.gift.assets.b {

    /* renamed from: d  reason: collision with root package name */
    public static final C0400a f18861d = new C0400a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<? extends AssetsModel> f18862a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.c.d<Long> f18863b;

    /* renamed from: c  reason: collision with root package name */
    public final f.a.b.a f18864c;

    /* renamed from: e  reason: collision with root package name */
    private final f.a.b.a f18865e;

    /* renamed from: f  reason: collision with root package name */
    private final LinkedList<com.bytedance.android.livesdk.manage.c.a> f18866f;

    public static final class k extends com.google.gson.b.a<androidx.c.d<Double>> {
        static {
            Covode.recordClassIndex(11223);
        }
    }

    public static final class l extends com.google.gson.b.a<List<? extends AssetsModel>> {
        static {
            Covode.recordClassIndex(11224);
        }
    }

    static {
        Covode.recordClassIndex(11211);
    }

    /* renamed from: com.bytedance.android.livesdk.manage.a$a  reason: collision with other inner class name */
    public static final class C0400a {
        static {
            Covode.recordClassIndex(11213);
        }

        private C0400a() {
        }

        public /* synthetic */ C0400a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f18870a = new a((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final b f18871b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(11214);
        }
    }

    public static final class c extends com.google.gson.b.a<List<? extends AssetsModel>> {
        static {
            Covode.recordClassIndex(11215);
        }

        c() {
        }
    }

    public static final class d extends com.google.gson.b.a<androidx.c.d<Double>> {
        static {
            Covode.recordClassIndex(11216);
        }

        d() {
        }
    }

    public static final class e extends com.google.gson.b.a<List<? extends AssetsModel>> {
        static {
            Covode.recordClassIndex(11217);
        }

        e() {
        }
    }

    public static final class h extends com.google.gson.b.a<List<? extends AssetsModel>> {
        static {
            Covode.recordClassIndex(11220);
        }

        h() {
        }
    }

    public static final class j implements com.ss.ugc.live.a.a.b {
        static {
            Covode.recordClassIndex(11222);
        }

        j() {
        }

        @Override // com.ss.ugc.live.a.a.b
        public final void a(com.ss.ugc.live.a.a.c.a aVar) {
            int i2;
            long j2;
            h.f.b.l.d(aVar, "");
            try {
                JSONObject jSONObject = new JSONObject();
                int i3 = -1;
                if (aVar instanceof com.ss.ugc.live.a.a.c.c) {
                    jSONObject.put("response_code", ((com.ss.ugc.live.a.a.c.c) aVar).getErrorCode());
                    i2 = 1;
                } else if (aVar instanceof com.ss.ugc.live.a.a.c.e) {
                    i2 = 2;
                } else if (aVar instanceof com.ss.ugc.live.a.a.c.b) {
                    i2 = 3;
                } else if (aVar instanceof com.ss.ugc.live.a.a.c.d) {
                    i2 = 4;
                } else if (aVar instanceof com.bytedance.android.livesdk.manage.a.a) {
                    i2 = 5;
                    jSONObject.put("downloader_error_code", ((com.bytedance.android.livesdk.manage.a.a) aVar).getErrorCode());
                } else {
                    i2 = -1;
                }
                com.ss.ugc.live.a.a.c resourceRequest = aVar.getResourceRequest();
                long j3 = -1;
                if (resourceRequest != null) {
                    j2 = resourceRequest.f154007d;
                } else {
                    j2 = -1;
                }
                AssetsModel a2 = b.f18870a.a(aVar.getResourceId());
                if (a2 != null) {
                    i3 = a2.getResourceType();
                    j3 = a2.getSize();
                }
                jSONObject.put("gift_id", aVar.getResourceId());
                jSONObject.put("gift_type", i3);
                jSONObject.put("size", j3);
                jSONObject.put("error_code", i2);
                jSONObject.put("error_desc", aVar.toString());
                jSONObject.put("download_assets_from", j2);
                com.bytedance.android.livesdk.ab.l lVar = new com.bytedance.android.livesdk.ab.l();
                lVar.f13593a = jSONObject;
                lVar.a("hotsoon_live_gift_resource_download_rate", 1);
                HashMap hashMap = new HashMap(1);
                String jSONObject2 = jSONObject.toString();
                h.f.b.l.b(jSONObject2, "");
                hashMap.put("info", jSONObject2);
                b.a.a("hotsoon_live_gift_resource_download_failed").a((Map<String, String>) hashMap).b();
                if (aVar instanceof com.bytedance.android.livesdk.manage.a.a) {
                    i2 = ((com.bytedance.android.livesdk.manage.a.a) aVar).getErrorCode();
                }
                com.bytedance.android.livesdk.service.c.g.a.a(aVar.getResourceId(), i3, j2, i2, aVar.toString());
            } catch (JSONException e2) {
                com.bytedance.android.live.core.c.a.b(e2.toString());
            }
        }

        @Override // com.ss.ugc.live.a.a.b
        public final void a(long j2, com.ss.ugc.live.a.a.c cVar) {
            int i2;
            long j3;
            h.f.b.l.d(cVar, "");
            JSONObject jSONObject = new JSONObject();
            long j4 = cVar.f154007d;
            AssetsModel a2 = b.f18870a.a(j2);
            if (a2 != null) {
                i2 = a2.getResourceType();
                j3 = a2.getSize();
            } else {
                i2 = -1;
                j3 = -1;
            }
            try {
                jSONObject.put("gift_id", j2);
                jSONObject.put("gift_type", i2);
                jSONObject.put("size", j3);
                jSONObject.put("download_assets_from", j4);
            } catch (JSONException e2) {
                com.bytedance.android.live.core.c.a.b(e2.toString());
            }
            com.bytedance.android.livesdk.ab.l lVar = new com.bytedance.android.livesdk.ab.l();
            lVar.f13593a = jSONObject;
            lVar.a("hotsoon_live_gift_resource_download_rate", 0);
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.gift.a(j2));
            b.a.a("hotsoon_live_gift_resource_download_success").a("resource_id", String.valueOf(j2)).a().b();
            HashMap hashMap = new HashMap();
            hashMap.put("asset_id", Long.valueOf(j2));
            hashMap.put("asset_type", Integer.valueOf(i2));
            hashMap.put("download_assets_from", Long.valueOf(j4));
            com.bytedance.android.live.core.d.c.a(com.bytedance.android.livesdk.ab.d.d.a("ttlive_gift_asset_download_status"), 0, hashMap);
        }
    }

    public static final class i implements com.ss.ugc.live.a.a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.gift.assets.a f18879a;

        static {
            Covode.recordClassIndex(11221);
        }

        @Override // com.ss.ugc.live.a.a.d
        public final void a() {
            this.f18879a.a();
        }

        i(com.bytedance.android.livesdk.gift.assets.a aVar) {
            this.f18879a = aVar;
        }

        @Override // com.ss.ugc.live.a.a.d
        public final void a(String str) {
            h.f.b.l.d(str, "");
            this.f18879a.a(str);
        }

        @Override // com.ss.ugc.live.a.a.d
        public final void a(Throwable th) {
            h.f.b.l.d(th, "");
            this.f18879a.a(th);
        }
    }

    public static final class g extends com.bytedance.common.utility.b.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ File f18878a;

        static {
            Covode.recordClassIndex(11219);
        }

        @Override // com.bytedance.common.utility.b.e
        public final void run() {
            try {
                com.bytedance.android.livesdk.utils.g.b(this.f18878a);
                com.ss.ugc.live.a.a.f.a().f154045e.clear();
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(File file) {
            super((byte) 0);
            this.f18878a = file;
        }
    }

    public static final class f extends com.bytedance.common.utility.b.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f18877a;

        static {
            Covode.recordClassIndex(11218);
        }

        @Override // com.bytedance.common.utility.b.e
        public final void run() {
            for (AssetsModel assetsModel : this.f18877a) {
                com.ss.ugc.live.a.a.c a2 = com.bytedance.android.livesdk.service.assets.a.a(assetsModel, 0);
                if (a2 != null) {
                    com.ss.ugc.live.a.a.f a3 = com.ss.ugc.live.a.a.f.a();
                    a3.f154045e.put(a2.f154004a, new Pair<>(false, Long.valueOf(System.currentTimeMillis())));
                    String a4 = a3.f154043c.f154025a.a(a2);
                    if (a4 != null) {
                        File file = new File(a4);
                        if (file.exists()) {
                            com.ss.ugc.live.a.a.e.b.a(file);
                        }
                    }
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(List list) {
            super((byte) 0);
            this.f18877a = list;
        }
    }

    private a() {
        this.f18862a = new ArrayList();
        this.f18863b = new androidx.c.d<>();
        this.f18864c = new f.a.b.a();
        this.f18865e = new f.a.b.a();
        this.f18866f = new LinkedList<>();
        try {
            ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).initGiftResourceManager(y.e());
        } catch (Exception unused) {
        }
        com.ss.ugc.live.a.a.f a2 = com.ss.ugc.live.a.a.f.a();
        j jVar = new j();
        if (!a2.f154044d.contains(jVar)) {
            a2.f154044d.add(jVar);
        }
        if (LiveGiftResourceDownloadSetting.INSTANCE.getValue() != 0) {
            this.f18865e.a(com.bytedance.ies.ugc.appcontext.f.e().d(new f.a.d.f(this) {
                /* class com.bytedance.android.livesdk.manage.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f18867a;

                static {
                    Covode.recordClassIndex(11212);
                }

                {
                    this.f18867a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    long j2;
                    if (com.bytedance.ies.ugc.appcontext.f.f34637l) {
                        a aVar = this.f18867a;
                        int i2 = 0;
                        if (LiveGiftResourceDownloadSetting.INSTANCE.getValue() == 1) {
                            i2 = 3;
                        } else if (LiveGiftResourceDownloadSetting.INSTANCE.getValue() == 2) {
                            i2 = 7;
                        } else if (LiveGiftResourceDownloadSetting.INSTANCE.getValue() == 3) {
                            return;
                        }
                        List<AssetsModel> a2 = aVar.a();
                        if (!com.bytedance.common.utility.h.a(a2)) {
                            com.bytedance.android.livesdk.ap.b<String> bVar = com.bytedance.android.livesdk.ap.a.f14011e;
                            h.f.b.l.b(bVar, "");
                            String a3 = bVar.a();
                            com.bytedance.android.livesdk.ap.b<String> bVar2 = com.bytedance.android.livesdk.ap.a.f14012f;
                            h.f.b.l.b(bVar2, "");
                            String a4 = bVar2.a();
                            com.google.gson.f fVar = e.a.f9628b;
                            if (!(com.bytedance.common.utility.m.a(a3) || com.bytedance.common.utility.m.a(a4))) {
                                Object a5 = fVar.a(a3, new e().type);
                                h.f.b.l.b(a5, "");
                                List<AssetsModel> list = (List) a5;
                                Object a6 = fVar.a(a4, new d().type);
                                h.f.b.l.b(a6, "");
                                androidx.c.d dVar = (androidx.c.d) a6;
                                ArrayList<AssetsModel> arrayList = new ArrayList();
                                long currentTimeMillis = System.currentTimeMillis();
                                for (AssetsModel assetsModel : list) {
                                    Double d2 = (Double) dVar.a(assetsModel.getId());
                                    if (d2 != null) {
                                        j2 = (long) d2.doubleValue();
                                    } else {
                                        j2 = 0;
                                    }
                                    if (!a2.contains(assetsModel) && currentTimeMillis - j2 > ((long) i2) * 86400000) {
                                        arrayList.add(assetsModel);
                                    }
                                }
                                for (AssetsModel assetsModel2 : arrayList) {
                                    if (dVar.d(assetsModel2.getId())) {
                                        dVar.b(assetsModel2.getId());
                                    }
                                    if (list.contains(assetsModel2)) {
                                        list.remove(assetsModel2);
                                    }
                                }
                                com.bytedance.android.livesdk.ap.b<String> bVar3 = com.bytedance.android.livesdk.ap.a.f14011e;
                                h.f.b.l.b(bVar3, "");
                                com.bytedance.android.livesdk.ap.c.a(bVar3, fVar.b(list));
                                com.bytedance.android.livesdk.ap.b<String> bVar4 = com.bytedance.android.livesdk.ap.a.f14012f;
                                h.f.b.l.b(bVar4, "");
                                com.bytedance.android.livesdk.ap.c.a(bVar4, fVar.b(dVar));
                                a.b(arrayList);
                            }
                        }
                    }
                }
            }));
        }
    }

    /* access modifiers changed from: package-private */
    public final List<AssetsModel> a() {
        GiftManager inst = GiftManager.inst();
        h.f.b.l.b(inst, "");
        List<GiftPage> giftPageList = inst.getGiftPageList();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (GiftPage giftPage : giftPageList) {
            for (u uVar : giftPage.gifts) {
                h.f.b.l.b(uVar, "");
                if (uVar.f19770m && uVar.n != 0) {
                    arrayList.add(Long.valueOf(uVar.n));
                }
            }
        }
        for (AssetsModel assetsModel : this.f18862a) {
            if (arrayList.contains(Long.valueOf(assetsModel.getId()))) {
                arrayList2.add(assetsModel);
            }
        }
        return arrayList2;
    }

    public static long b() {
        String a2;
        List<AssetsModel> list;
        com.google.gson.f fVar = e.a.f9628b;
        if (LiveGiftResourceDownloadSetting.INSTANCE.getValue() == 0) {
            com.bytedance.android.livesdk.ap.b<String> bVar = com.bytedance.android.livesdk.ap.a.f14010d;
            h.f.b.l.b(bVar, "");
            a2 = bVar.a();
            com.bytedance.android.livesdk.ap.b<Long> bVar2 = com.bytedance.android.livesdk.ap.a.f14013g;
            h.f.b.l.b(bVar2, "");
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar2, (Object) 0L);
            com.bytedance.android.livesdk.ap.b<String> bVar3 = com.bytedance.android.livesdk.ap.a.f14010d;
            h.f.b.l.b(bVar3, "");
            com.bytedance.android.livesdk.ap.c.a(bVar3, "");
            com.bytedance.android.livesdk.ap.b<String> bVar4 = com.bytedance.android.livesdk.ap.a.f14012f;
            h.f.b.l.b(bVar4, "");
            com.bytedance.android.livesdk.ap.c.a(bVar4, "");
        } else {
            com.bytedance.android.livesdk.ap.b<String> bVar5 = com.bytedance.android.livesdk.ap.a.f14011e;
            h.f.b.l.b(bVar5, "");
            a2 = bVar5.a();
            com.bytedance.android.livesdk.ap.b<String> bVar6 = com.bytedance.android.livesdk.ap.a.f14011e;
            h.f.b.l.b(bVar6, "");
            com.bytedance.android.livesdk.ap.c.a(bVar6, "");
        }
        if (com.bytedance.common.utility.m.a(a2) || (list = (List) fVar.a(a2, new c().type)) == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        for (AssetsModel assetsModel : list) {
            r.a(assetsModel.getId(), 0);
            arrayList.add(Long.valueOf(assetsModel.getId()));
            com.ss.ugc.live.a.a.c a3 = com.bytedance.android.livesdk.service.assets.a.a(assetsModel, 0);
            if (a3 != null) {
                com.ss.ugc.live.a.a.f a4 = com.ss.ugc.live.a.a.f.a();
                h.f.b.l.b(a4, "");
                j2 += FileUtils.INSTANCE.getFolderSize(new File(a4.f154043c.f154025a.a(a3)));
            }
        }
        try {
            b(list);
        } catch (Exception unused) {
        }
        int size = arrayList.size();
        h.f.b.l.d(arrayList, "");
        HashMap hashMap = new HashMap();
        com.bytedance.android.livesdk.at.f b2 = com.bytedance.android.livesdk.userservice.u.a().b();
        h.f.b.l.b(b2, "");
        com.bytedance.android.live.base.model.user.b a5 = b2.a();
        h.f.b.l.b(a5, "");
        long id = a5.getId();
        hashMap.put("resource_num", String.valueOf(size));
        hashMap.put("assets_id_list", arrayList.toString());
        hashMap.put("user_id", String.valueOf(id));
        com.bytedance.android.live.core.d.c.a(com.bytedance.android.livesdk.ab.d.d.a("resource_gift_video_delete"), 0, hashMap);
        return j2;
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    static void b(List<AssetsModel> list) {
        if (!com.bytedance.common.utility.h.a(list)) {
            new f(list).a();
        }
    }

    static final class n<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f18882a;

        static {
            Covode.recordClassIndex(11226);
        }

        n(a aVar) {
            this.f18882a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            h.f.b.l.d(th, "");
            com.bytedance.android.live.core.c.a.a(6, "Assets Manager", th.getMessage());
            this.f18882a.f18864c.a();
        }
    }

    public static boolean a(AssetsModel assetsModel) {
        com.ss.ugc.live.a.a.c a2 = com.bytedance.android.livesdk.service.assets.a.a(assetsModel, 0);
        if (a2 == null || !com.ss.ugc.live.a.a.f.a().b(a2)) {
            return false;
        }
        return true;
    }

    public static boolean b(long j2) {
        return a(b.f18870a.a(j2));
    }

    public static String c(long j2) {
        return com.ss.ugc.live.a.a.f.a().a(com.bytedance.android.livesdk.service.assets.a.a(b.f18870a.a(j2), 0));
    }

    @Override // com.bytedance.android.livesdk.gift.assets.b
    public final AssetsModel a(long j2) {
        for (AssetsModel assetsModel : this.f18862a) {
            if (assetsModel.getId() == j2) {
                return assetsModel;
            }
        }
        return null;
    }

    static final class m<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f18880a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f18881b;

        static {
            Covode.recordClassIndex(11225);
        }

        m(a aVar, int i2) {
            this.f18880a = aVar;
            this.f18881b = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.livesdk.manage.d.a aVar;
            List<? extends AssetsModel> list;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            if (!(dVar == null || (aVar = (com.bytedance.android.livesdk.manage.d.a) dVar.data) == null || (list = aVar.f18891a) == null)) {
                this.f18880a.f18862a = list;
            }
            if (LiveGiftResourceDownloadSetting.INSTANCE.getValue() != 0) {
                com.bytedance.android.livesdk.ap.b<String> bVar = com.bytedance.android.livesdk.ap.a.f14011e;
                h.f.b.l.b(bVar, "");
                if (com.bytedance.common.utility.m.a(bVar.a())) {
                    a aVar2 = this.f18880a;
                    List<AssetsModel> a2 = aVar2.a();
                    ArrayList arrayList = new ArrayList();
                    if (!com.bytedance.common.utility.h.a(a2)) {
                        for (Object obj2 : aVar2.f18862a) {
                            if (!a2.contains(obj2)) {
                                arrayList.add(obj2);
                            }
                        }
                        a.b(arrayList);
                    }
                    if (LiveGiftResourceDownloadSetting.INSTANCE.getValue() != 0) {
                        com.ss.ugc.live.a.a.f a3 = com.ss.ugc.live.a.a.f.a();
                        h.f.b.l.b(a3, "");
                        if (a3.f154043c.f154025a instanceof com.bytedance.android.livesdk.manage.b.a) {
                            com.ss.ugc.live.a.a.f a4 = com.ss.ugc.live.a.a.f.a();
                            h.f.b.l.b(a4, "");
                            com.ss.ugc.live.a.a.a.b bVar2 = a4.f154043c.f154025a;
                            Objects.requireNonNull(bVar2, "null cannot be cast to non-null type com.bytedance.android.livesdk.manage.file.AssetsFileCacheFactory");
                            File file = new File(((com.bytedance.android.livesdk.manage.b.a) bVar2).f18885a);
                            if (file.exists()) {
                                new g(file).a();
                            }
                        }
                    }
                }
            }
            this.f18880a.a(this.f18881b);
            if (LiveGiftResourceDownloadSetting.INSTANCE.getValue() == 0) {
                a.a(this.f18880a.f18862a);
            }
            this.f18880a.f18864c.a();
        }
    }

    public static void a(List<? extends AssetsModel> list) {
        if (!com.bytedance.common.utility.h.a(list)) {
            com.bytedance.android.livesdk.ap.b<Long> bVar = com.bytedance.android.livesdk.ap.a.f14013g;
            h.f.b.l.b(bVar, "");
            Long a2 = bVar.a();
            com.bytedance.android.livesdk.ap.b<String> bVar2 = com.bytedance.android.livesdk.ap.a.f14010d;
            h.f.b.l.b(bVar2, "");
            String a3 = bVar2.a();
            if (EnableAssetsDeleteTimeLimitSetting.INSTANCE.getValue()) {
                long currentTimeMillis = System.currentTimeMillis();
                h.f.b.l.b(a2, "");
                if (currentTimeMillis - a2.longValue() < 86400000) {
                    return;
                }
            }
            com.google.gson.f fVar = e.a.f9628b;
            if ((a2 != null && a2.longValue() == 0) || com.bytedance.common.utility.m.a(a3)) {
                com.bytedance.android.livesdk.ap.b<Long> bVar3 = com.bytedance.android.livesdk.ap.a.f14013g;
                h.f.b.l.b(bVar3, "");
                com.bytedance.android.livesdk.ap.c.a(bVar3, Long.valueOf(System.currentTimeMillis()));
                com.bytedance.android.livesdk.ap.b<String> bVar4 = com.bytedance.android.livesdk.ap.a.f14010d;
                h.f.b.l.b(bVar4, "");
                com.bytedance.android.livesdk.ap.c.a(bVar4, fVar.b(list));
                return;
            }
            Object a4 = fVar.a(a3, new h().type);
            h.f.b.l.b(a4, "");
            ArrayList arrayList = new ArrayList();
            for (Object obj : (List) a4) {
                if (!list.contains(obj)) {
                    arrayList.add(obj);
                }
            }
            com.bytedance.android.livesdk.ap.b<Long> bVar5 = com.bytedance.android.livesdk.ap.a.f14013g;
            h.f.b.l.b(bVar5, "");
            com.bytedance.android.livesdk.ap.c.a(bVar5, Long.valueOf(System.currentTimeMillis()));
            com.bytedance.android.livesdk.ap.b<String> bVar6 = com.bytedance.android.livesdk.ap.a.f14010d;
            h.f.b.l.b(bVar6, "");
            com.bytedance.android.livesdk.ap.c.a(bVar6, fVar.b(list));
            b(arrayList);
        }
    }

    public final void a(int i2) {
        Iterator<com.bytedance.android.livesdk.manage.c.a> it = this.f18866f.iterator();
        while (it.hasNext()) {
            it.next().a(i2);
        }
    }

    @Override // com.bytedance.android.livesdk.gift.assets.b
    public final void a(long j2, com.bytedance.android.livesdk.gift.assets.a aVar, int i2) {
        a(b.f18870a.a(j2), aVar, i2);
    }

    public static void a(AssetsModel assetsModel, com.bytedance.android.livesdk.gift.assets.a aVar, int i2) {
        int i3;
        boolean z = false;
        if (LiveGiftAssetsStorageLimit.INSTANCE.isCheckEnable()) {
            com.ss.ugc.live.a.a.f a2 = com.ss.ugc.live.a.a.f.a();
            h.f.b.l.b(a2, "");
            com.ss.ugc.live.a.a.a.b bVar = a2.f154043c.f154025a;
            h.f.b.l.b(bVar, "");
            long a3 = com.bytedance.android.live.core.f.c.a(bVar.a());
            long j2 = 0;
            if (a3 > 0 && a3 / 1024 < LiveGiftAssetsStorageLimit.INSTANCE.getThreshold() && !a(assetsModel)) {
                String concat = "AssetsManager.downloadAssets: storage available ".concat(String.valueOf(a3));
                if (aVar != null) {
                    aVar.a(new Exception(concat));
                }
                if (assetsModel != null) {
                    j2 = assetsModel.getId();
                }
                if (assetsModel != null) {
                    i3 = assetsModel.getResourceType();
                } else {
                    i3 = 0;
                }
                com.bytedance.android.livesdk.service.c.g.a.a(j2, i3, (long) i2, 6, concat);
                return;
            }
        }
        com.ss.ugc.live.a.a.c a4 = com.bytedance.android.livesdk.service.assets.a.a(assetsModel, i2);
        if (a4 == null) {
            if (aVar != null) {
                aVar.a(new Exception("AssetsManager.downloadAssets: GetResourceRequest is null"));
            }
            d.a.C0463a.f21379a.a(d.b.ASSET_ERROR, "Request Create Error");
            return;
        }
        if (i2 == 4) {
            z = true;
        }
        a4.f154010g = z;
        if (aVar == null) {
            com.ss.ugc.live.a.a.f.a().a(a4, (com.ss.ugc.live.a.a.d) null);
        } else {
            com.ss.ugc.live.a.a.f.a().a(a4, (com.ss.ugc.live.a.a.d) new i(aVar));
        }
    }

    @Override // com.bytedance.android.livesdk.gift.assets.b
    public final void a(int i2, boolean z, Long l2) {
        aa a2;
        this.f18866f.clear();
        if (LiveGiftResourceDownloadSetting.INSTANCE.getValue() == 0) {
            this.f18866f.addLast(new com.bytedance.android.livesdk.manage.c.b());
            this.f18866f.addLast(new com.bytedance.android.livesdk.manage.c.d());
            this.f18866f.addLast(new com.bytedance.android.livesdk.manage.c.f());
            if (z) {
                this.f18866f.addLast(new com.bytedance.android.livesdk.manage.c.g());
            }
        } else {
            this.f18866f.addLast(new com.bytedance.android.livesdk.manage.c.c());
            this.f18866f.addLast(new com.bytedance.android.livesdk.manage.c.e());
            if (z) {
                this.f18866f.addLast(new com.bytedance.android.livesdk.manage.c.h());
            }
        }
        f.a.b.a aVar = this.f18864c;
        t<com.bytedance.android.live.network.response.d<com.bytedance.android.livesdk.manage.d.a>> b2 = ((AssetsApi) com.bytedance.android.live.network.e.a().a(AssetsApi.class)).getAssets(i2, l2).b(f.a.h.a.b(f.a.k.a.f158006c));
        if (com.bytedance.android.live.u.g.a()) {
            a2 = f.a.h.a.b(f.a.k.a.f158006c);
        } else {
            a2 = f.a.a.a.a.a(f.a.a.b.a.f157156a);
        }
        aVar.a(b2.a(a2).a(new m(this, i2), new n(this)));
    }
}
