package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.common.ad;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService;
import com.ss.android.ugc.aweme.opensdkservice.OpenPlatformServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.bb;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.services.external.ability.IOpenPhotoNextService;
import com.ss.android.ugc.aweme.services.external.ability.IPageToFinish;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.IEditService;
import com.ss.android.ugc.aweme.services.external.ui.ShareConfig;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.share.ClientKeyScopesResponse;
import com.ss.android.ugc.aweme.share.x;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.utils.cs;
import com.zhiliaoapp.musically.R;
import f.a.ae;
import h.f.b.z;
import h.q;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final a f124058a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final String f124059b = "hashtag";

    static {
        Covode.recordClassIndex(81460);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81461);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class g implements IExternalService.ServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f124070a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f124071b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f124072c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.common.d f124073d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.openshare.a f124074e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ClientKeyScopesResponse f124075f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f124076g;

        static {
            Covode.recordClassIndex(81467);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onDismiss() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onFailed() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
            try {
                if (!this.f124072c.isFinishing()) {
                    this.f124072c.finish();
                }
            } catch (Exception unused) {
            }
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            try {
                if (!this.f124072c.isFinishing()) {
                    this.f124072c.finish();
                }
            } catch (Exception unused) {
            }
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j2) {
            h.f.b.l.d(asyncAVService, "");
            String uuid = UUID.randomUUID().toString();
            h.f.b.l.b(uuid, "");
            if (this.f124074e.f114533a == com.ss.android.ugc.aweme.openshare.a.f114526d) {
                EditConfig.Builder onEnterEdit = new EditConfig.Builder().shootWay(l.a(this.f124073d.mClientKey)).musicOrigin(l.b(this.f124073d.mClientKey)).creationId(uuid).onEnterEdit(new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.share.l.g.AnonymousClass1 */
                    final /* synthetic */ g this$0;

                    static {
                        Covode.recordClassIndex(81468);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        this.this$0.f124070a.resumeWith(q.m223constructorimpl(true));
                        return z.f158842a;
                    }
                });
                if (this.f124075f.getData() != null) {
                    l lVar = this.f124071b;
                    ClientKeyScopesResponse clientKeyScopesResponse = this.f124075f;
                    com.ss.android.ugc.aweme.common.d dVar = this.f124073d;
                    if (onEnterEdit == null) {
                        h.f.b.l.a("builder");
                    }
                    lVar.a(clientKeyScopesResponse, dVar, onEnterEdit);
                }
                OpenPlatformServiceImpl.b().a("system_upload", "video", uuid, "upload");
                com.ss.android.ugc.aweme.common.d dVar2 = this.f124073d;
                Objects.requireNonNull(dVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.common.ShareContext");
                ShareConfig shareConfig = new ShareConfig((ad) dVar2, 2);
                shareConfig.setFile(this.f124074e.f114534b.get(0));
                shareConfig.setAppName(this.f124073d.mAppName);
                IEditService editService = asyncAVService.uiService().editService();
                Activity activity = this.f124072c;
                if (onEnterEdit == null) {
                    h.f.b.l.a("builder");
                }
                editService.startEdit(activity, onEnterEdit.build(), shareConfig);
            } else if (this.f124074e.f114533a == com.ss.android.ugc.aweme.openshare.a.f114528f) {
                EditConfig.Builder onEnterEdit2 = new EditConfig.Builder().shootWay(l.a(this.f124073d.mClientKey)).musicOrigin(l.b(this.f124073d.mClientKey)).creationId(uuid).onEnterEdit(new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.share.l.g.AnonymousClass2 */
                    final /* synthetic */ g this$0;

                    static {
                        Covode.recordClassIndex(81469);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        this.this$0.f124070a.resumeWith(q.m223constructorimpl(true));
                        return z.f158842a;
                    }
                });
                if (this.f124075f.getData() != null) {
                    l lVar2 = this.f124071b;
                    ClientKeyScopesResponse clientKeyScopesResponse2 = this.f124075f;
                    com.ss.android.ugc.aweme.common.d dVar3 = this.f124073d;
                    if (onEnterEdit2 == null) {
                        h.f.b.l.a("builder");
                    }
                    lVar2.a(clientKeyScopesResponse2, dVar3, onEnterEdit2);
                }
                OpenPlatformServiceImpl.b().a(l.a(this.f124073d.mClientKey), "video", uuid, "upload");
                com.ss.android.ugc.aweme.common.d dVar4 = this.f124073d;
                Objects.requireNonNull(dVar4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.common.ShareContext");
                ShareConfig shareConfig2 = new ShareConfig((ad) dVar4, 4);
                shareConfig2.setVideoList(this.f124074e.f114534b);
                shareConfig2.setAppName(this.f124073d.mAppName);
                IEditService editService2 = asyncAVService.uiService().editService();
                Activity activity2 = this.f124072c;
                if (onEnterEdit2 == null) {
                    h.f.b.l.a("builder");
                }
                editService2.startEdit(activity2, onEnterEdit2.build(), shareConfig2);
            } else if (this.f124074e.f114533a == com.ss.android.ugc.aweme.openshare.a.f114525c || this.f124074e.f114533a == com.ss.android.ugc.aweme.openshare.a.f114527e) {
                this.f124073d.mTargetSceneType = 1;
                Bundle shareRequestBundle = this.f124073d.getShareRequestBundle();
                shareRequestBundle.putString("creation_id", UUID.randomUUID().toString());
                shareRequestBundle.putString("shoot_way", l.a(this.f124073d.mClientKey));
                shareRequestBundle.putString("enter_from", "open_platform_share");
                if (this.f124076g) {
                    shareRequestBundle.putSerializable("open_platform_share_context", this.f124073d);
                }
                IOpenPhotoNextService openGotoNextService = AVExternalServiceImpl.a().openGotoNextService();
                Activity activity3 = this.f124072c;
                Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                h.f.b.l.b(shareRequestBundle, "");
                openGotoNextService.gotoNextPage((androidx.fragment.app.e) activity3, false, shareRequestBundle, this.f124074e.f114534b, new IPageToFinish(this) {
                    /* class com.ss.android.ugc.aweme.share.l.g.AnonymousClass3 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ g f124077a;

                    static {
                        Covode.recordClassIndex(81470);
                    }

                    {
                        this.f124077a = r1;
                    }

                    @Override // com.ss.android.ugc.aweme.services.external.ability.IPageToFinish
                    public final void onFinish(boolean z) {
                        if (!z) {
                            new com.ss.android.ugc.aweme.tux.a.i.a(this.f124077a.f124072c).a(R.string.g4f).a();
                        }
                        this.f124077a.f124070a.resumeWith(q.m223constructorimpl(true));
                    }
                });
            }
        }

        g(h.c.d dVar, l lVar, Activity activity, com.ss.android.ugc.aweme.common.d dVar2, com.ss.android.ugc.aweme.openshare.a aVar, ClientKeyScopesResponse clientKeyScopesResponse, boolean z) {
            this.f124070a = dVar;
            this.f124071b = lVar;
            this.f124072c = activity;
            this.f124073d = dVar2;
            this.f124074e = aVar;
            this.f124075f = clientKeyScopesResponse;
            this.f124076g = z;
        }
    }

    public static final class f implements bb.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f124069a;

        static {
            Covode.recordClassIndex(81466);
        }

        @Override // com.ss.android.ugc.aweme.port.in.bb.a
        public final void onSuccess() {
            this.f124069a.resumeWith(q.m223constructorimpl(true));
        }

        f(h.c.d dVar) {
            this.f124069a = dVar;
        }
    }

    public static final class b implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f124061a;

        static {
            Covode.recordClassIndex(81462);
        }

        b(h.c.d dVar) {
            this.f124061a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.share.p
        public final void a(boolean z) {
            if (z) {
                i iVar = new i();
                iVar.f123562a = true;
                this.f124061a.resumeWith(q.m223constructorimpl(iVar));
            }
        }

        @Override // com.ss.android.ugc.aweme.share.p
        public final void a(int i2, String str) {
            h.f.b.l.d(str, "");
            i iVar = new i();
            iVar.f123562a = false;
            iVar.f123563b = i2;
            iVar.a(str);
            this.f124061a.resumeWith(q.m223constructorimpl(iVar));
        }
    }

    public static final class c implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f124062a;

        static {
            Covode.recordClassIndex(81463);
        }

        c(h.c.d dVar) {
            this.f124062a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.share.p
        public final void a(boolean z) {
            if (z) {
                i iVar = new i();
                iVar.f123562a = true;
                this.f124062a.resumeWith(q.m223constructorimpl(iVar));
            }
        }

        @Override // com.ss.android.ugc.aweme.share.p
        public final void a(int i2, String str) {
            h.f.b.l.d(str, "");
            i iVar = new i();
            iVar.f123562a = false;
            iVar.f123563b = i2;
            iVar.a(str);
            this.f124062a.resumeWith(q.m223constructorimpl(iVar));
        }
    }

    public static final class d implements ae<ClientKeyScopesResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f124063a;

        static {
            Covode.recordClassIndex(81464);
        }

        @Override // f.a.ae
        public final void onSubscribe(f.a.b.b bVar) {
            h.f.b.l.d(bVar, "");
        }

        public d(h.c.d dVar) {
            this.f124063a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.ae
        public final /* synthetic */ void onSuccess(ClientKeyScopesResponse clientKeyScopesResponse) {
            h.f.b.l.d(clientKeyScopesResponse, "");
            this.f124063a.resumeWith(q.m223constructorimpl(clientKeyScopesResponse));
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            h.f.b.l.d(th, "");
            this.f124063a.resumeWith(q.m223constructorimpl(r.a(th)));
        }
    }

    public static final class e implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.a f124064a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.c.d f124065b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l f124066c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ x f124067d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f124068e;

        static {
            Covode.recordClassIndex(81465);
        }

        @Override // com.ss.android.ugc.aweme.share.p
        public final void a(boolean z) {
            if (z) {
                i iVar = new i();
                iVar.f123562a = true;
                if (!this.f124064a.element) {
                    this.f124065b.resumeWith(q.m223constructorimpl(iVar));
                    this.f124064a.element = true;
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.share.p
        public final void a(int i2, String str) {
            i iVar;
            h.f.b.l.d(str, "");
            if (this.f124068e) {
                iVar = new i();
                if (i2 == 20001) {
                    iVar.f123563b = 20001;
                    iVar.a("Unknown");
                } else if (i2 == -1 || i2 == -6) {
                    iVar.f123563b = 20007;
                    iVar.a("Video length doesn't meet requirements");
                } else if (i2 == -2) {
                    iVar.f123563b = 20012;
                    iVar.a("Video format is not supported");
                } else if (i2 == -4) {
                    iVar.f123563b = 20010;
                    iVar.a("Processing photo resources faild");
                } else if (i2 == -5) {
                    iVar.f123563b = 20011;
                    iVar.a("Video resolution doesn't meet requirements");
                } else {
                    iVar.f123563b = 22001;
                    iVar.a("Unsupported resolution");
                }
                iVar.f123562a = false;
            } else {
                iVar = new i(false, str);
            }
            if (!this.f124064a.element) {
                this.f124065b.resumeWith(q.m223constructorimpl(iVar));
                this.f124064a.element = true;
            }
        }

        e(z.a aVar, h.c.d dVar, l lVar, x xVar, boolean z) {
            this.f124064a = aVar;
            this.f124065b = dVar;
            this.f124066c = lVar;
            this.f124067d = xVar;
            this.f124068e = z;
        }
    }

    public static String b(String str) {
        if (str == null) {
            return "original";
        }
        int hashCode = str.hashCode();
        if (hashCode != -475692960) {
            if (hashCode == 1382194030 && str.equals("aw7c4z4ej0o3efzd")) {
                return "lv_sync";
            }
            return "original";
        } else if (str.equals("aw889s25wozf8s7e")) {
            return "lv_sync";
        } else {
            return "original";
        }
    }

    public static Object a(h.c.d<? super Boolean> dVar) {
        h.c.h hVar = new h.c.h(h.c.a.b.a(dVar));
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        h.f.b.l.b(createIAVServiceProxybyMonsterPlugin, "");
        createIAVServiceProxybyMonsterPlugin.getShortVideoPluginService().a(new f(hVar));
        Object a2 = hVar.a();
        if (a2 == h.c.a.a.COROUTINE_SUSPENDED) {
            h.f.b.l.d(dVar, "");
        }
        return a2;
    }

    public static String a(String str) {
        if (str == null) {
            return "system_upload";
        }
        int hashCode = str.hashCode();
        if (hashCode != -475692960) {
            if (hashCode == 1382194030 && str.equals("aw7c4z4ej0o3efzd")) {
                return "lv_sync";
            }
            return "system_upload";
        } else if (str.equals("aw889s25wozf8s7e")) {
            return "lv_sync";
        } else {
            return "system_upload";
        }
    }

    public static boolean a(Activity activity) {
        h.f.b.l.d(activity, "");
        IExternalService a2 = AVExternalServiceImpl.a();
        IAVPublishService publishService = a2.publishService();
        if (publishService.isParallelPublishEnabled()) {
            if (!publishService.isPublishable()) {
                return true;
            }
            return false;
        } else if (!a2.publishService().isPublishing() || !a2.publishService().isPublishServiceRunning(activity)) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements b.AbstractC1579b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.a f124078a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.c.d f124079b;

        static {
            Covode.recordClassIndex(81471);
        }

        h(z.a aVar, h.c.d dVar) {
            this.f124078a = aVar;
            this.f124079b = dVar;
        }

        @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
        public final void a(String[] strArr, int[] iArr) {
            if (!this.f124078a.element) {
                if (strArr == null || iArr == null || iArr.length == 0 || iArr[0] != 0) {
                    this.f124079b.resumeWith(q.m223constructorimpl(false));
                } else {
                    this.f124079b.resumeWith(q.m223constructorimpl(true));
                }
                this.f124078a.element = true;
            }
        }
    }

    public static Object a(Activity activity, h.c.d<? super Boolean> dVar) {
        h.c.h hVar = new h.c.h(h.c.a.b.a(dVar));
        if (androidx.core.content.b.a(activity, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            hVar.resumeWith(q.m223constructorimpl(true));
        } else {
            z.a aVar = new z.a();
            aVar.element = false;
            com.ss.android.ugc.aweme.ce.b.a(activity, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, new h(aVar, hVar));
        }
        Object a2 = hVar.a();
        if (a2 == h.c.a.a.COROUTINE_SUSPENDED) {
            h.f.b.l.d(dVar, "");
        }
        return a2;
    }

    public static Object b(x xVar, boolean z, h.c.d<? super i> dVar) {
        boolean z2;
        boolean z3;
        h.c.h hVar = new h.c.h(h.c.a.b.a(dVar));
        if (z) {
            b bVar = new b(hVar);
            h.f.b.l.d(bVar, "");
            if (xVar.f124426a.f114533a == com.ss.android.ugc.aweme.openshare.a.f114525c) {
                if (com.bytedance.common.utility.collection.b.a((Collection) xVar.f124426a.f114534b)) {
                    bVar.a(20010, "Processing photo resources faild");
                } else if (x.a(xVar.f124426a.f114534b.get(0))) {
                    bVar.a(true);
                } else {
                    bVar.a(20008, "Photo doesn't meet requirements");
                }
            } else if (xVar.f124426a.f114533a == com.ss.android.ugc.aweme.openshare.a.f114527e) {
                Iterator<T> it = xVar.f124426a.f114534b.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (cs.a((String) next)) {
                        if (!x.a(next)) {
                            bVar.a(20008, "Photo doesn't meet requirements");
                            break;
                        }
                        if (i2 == xVar.f124426a.f114534b.size() - 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        bVar.a(z3);
                        i2++;
                    } else {
                        bVar.a(20010, "Processing photo resources faild");
                        break;
                    }
                }
            }
        } else {
            c cVar = new c(hVar);
            h.f.b.l.d(cVar, "");
            if (xVar.f124426a.f114533a == com.ss.android.ugc.aweme.openshare.a.f114525c) {
                if (com.bytedance.common.utility.collection.b.a((Collection) xVar.f124426a.f114534b)) {
                    String string = xVar.f124427b.getString(R.string.fta);
                    h.f.b.l.b(string, "");
                    cVar.a(20010, string);
                } else if (x.a(xVar.f124426a.f114534b.get(0))) {
                    cVar.a(true);
                } else {
                    String string2 = xVar.f124427b.getString(R.string.ftc);
                    h.f.b.l.b(string2, "");
                    cVar.a(20008, string2);
                }
            } else if (xVar.f124426a.f114533a == com.ss.android.ugc.aweme.openshare.a.f114527e) {
                Iterator<T> it2 = xVar.f124426a.f114534b.iterator();
                int i3 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next2 = it2.next();
                    if (cs.a((String) next2)) {
                        if (!x.a(next2)) {
                            String string3 = xVar.f124427b.getString(R.string.ftc);
                            h.f.b.l.b(string3, "");
                            cVar.a(20008, string3);
                            break;
                        }
                        if (i3 == xVar.f124426a.f114534b.size() - 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        cVar.a(z2);
                        i3++;
                    } else {
                        String string4 = xVar.f124427b.getString(R.string.ft8);
                        h.f.b.l.b(string4, "");
                        cVar.a(20010, string4);
                        break;
                    }
                }
            }
        }
        Object a2 = hVar.a();
        if (a2 == h.c.a.a.COROUTINE_SUSPENDED) {
            h.f.b.l.d(dVar, "");
        }
        return a2;
    }

    public final Object a(x xVar, boolean z, h.c.d<? super i> dVar) {
        h.c.h hVar = new h.c.h(h.c.a.b.a(dVar));
        z.a aVar = new z.a();
        int i2 = 0;
        aVar.element = false;
        e eVar = new e(aVar, hVar, this, xVar, z);
        h.f.b.l.d(eVar, "");
        IAVInfoService infoService = AVExternalServiceImpl.a().abilityService().infoService();
        if (xVar.f124426a.f114533a == com.ss.android.ugc.aweme.openshare.a.f114526d) {
            if (com.bytedance.common.utility.collection.b.a((Collection) xVar.f124426a.f114534b)) {
                String string = xVar.f124427b.getString(R.string.ft8);
                h.f.b.l.b(string, "");
                eVar.a(20010, string);
            } else if (cs.a(xVar.f124426a.f114534b.get(0))) {
                infoService.importLegal(xVar.f124427b, xVar.f124426a.f114534b.get(0), true, 3600000, 1000, new x.b(eVar), new x.c(eVar));
            } else {
                String string2 = xVar.f124427b.getString(R.string.ft8);
                h.f.b.l.b(string2, "");
                eVar.a(20010, string2);
            }
        } else if (xVar.f124426a.f114533a == com.ss.android.ugc.aweme.openshare.a.f114528f) {
            z.a aVar2 = new z.a();
            aVar2.element = false;
            Iterator<T> it = xVar.f124426a.f114534b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (cs.a((String) next)) {
                    infoService.importLegal(xVar.f124427b, next, true, 3600000, 1000, new x.d(xVar, eVar, i2), new x.e(aVar2, eVar));
                    if (aVar2.element) {
                        break;
                    }
                    i2++;
                } else {
                    String string3 = xVar.f124427b.getString(R.string.ft8);
                    h.f.b.l.b(string3, "");
                    eVar.a(20010, string3);
                    break;
                }
            }
        }
        Object a2 = hVar.a();
        if (a2 == h.c.a.a.COROUTINE_SUSPENDED) {
            h.f.b.l.d(dVar, "");
        }
        return a2;
    }

    public final void a(ClientKeyScopesResponse clientKeyScopesResponse, com.ss.android.ugc.aweme.common.d dVar, EditConfig.Builder builder) {
        List<ClientKeyScopesResponse.DataBean.ScopesBean> scopes;
        ClientKeyScopesResponse.DataBean data = clientKeyScopesResponse.getData();
        if (data != null && (scopes = data.getScopes()) != null) {
            Iterator<ClientKeyScopesResponse.DataBean.ScopesBean> it = scopes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ClientKeyScopesResponse.DataBean.ScopesBean next = it.next();
                h.f.b.l.b(next, "");
                if (TextUtils.equals(next.getName(), this.f124059b)) {
                    if (!com.bytedance.common.utility.collection.b.a((Collection) dVar.mHashTags)) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList<String> arrayList2 = dVar.mHashTags;
                        h.f.b.l.b(arrayList2, "");
                        int size = arrayList2.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            AVChallenge aVChallenge = new AVChallenge();
                            aVChallenge.challengeName = dVar.mHashTags.get(i2);
                            arrayList.add(aVChallenge);
                        }
                        builder.challenges(arrayList);
                        return;
                    }
                }
            }
        }
        IOpenPlatformService b2 = OpenPlatformServiceImpl.b();
        ClientKeyScopesResponse.DataBean data2 = clientKeyScopesResponse.getData();
        h.f.b.l.b(data2, "");
        String appName = data2.getAppName();
        h.f.b.l.b(appName, "");
        b2.a(builder, appName);
    }

    public final Object a(Activity activity, boolean z, com.ss.android.ugc.aweme.openshare.a aVar, com.ss.android.ugc.aweme.common.d dVar, ClientKeyScopesResponse clientKeyScopesResponse, h.c.d<? super Boolean> dVar2) {
        h.c.h hVar = new h.c.h(h.c.a.b.a(dVar2));
        AVExternalServiceImpl.a().asyncService(activity, a(dVar.mClientKey), new g(hVar, this, activity, dVar, aVar, clientKeyScopesResponse, z));
        Object a2 = hVar.a();
        if (a2 == h.c.a.a.COROUTINE_SUSPENDED) {
            h.f.b.l.d(dVar2, "");
        }
        return a2;
    }
}
