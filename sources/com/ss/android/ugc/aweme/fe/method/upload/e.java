package com.ss.android.ugc.aweme.fe.method.upload;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import b.i;
import b.j;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.fe.method.a;
import com.ss.android.ugc.aweme.fe.method.m;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.TcmImage;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.ss.android.ugc.aweme.utils.cs;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.q;
import h.r;
import h.z;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e implements WeakHandler.IHandler, b, c {

    /* renamed from: j  reason: collision with root package name */
    public static final a f91387j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f91388a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f91389b;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<Integer, AvatarUri> f91390c;

    /* renamed from: d  reason: collision with root package name */
    public List<String> f91391d;

    /* renamed from: e  reason: collision with root package name */
    public AtomicInteger f91392e;

    /* renamed from: f  reason: collision with root package name */
    public AtomicInteger f91393f;

    /* renamed from: g  reason: collision with root package name */
    public h.f.a.a<z> f91394g;

    /* renamed from: h  reason: collision with root package name */
    public final WeakReference<Activity> f91395h;

    /* renamed from: i  reason: collision with root package name */
    public final m f91396i;

    /* renamed from: k  reason: collision with root package name */
    private int f91397k = 1;

    /* renamed from: l  reason: collision with root package name */
    private String f91398l = "";

    /* renamed from: m  reason: collision with root package name */
    private boolean f91399m;
    private String n = "";
    private String o = "";
    private List<WeakHandler.IHandler> p;
    private String q = "";
    private String r = "";
    private final a.C2200a s;

    static {
        Covode.recordClassIndex(57512);
    }

    @Override // com.ss.android.ugc.aweme.fe.method.upload.b
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.fe.method.upload.c
    public final void l() {
        this.f91394g = null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57513);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.method.upload.b
    public final boolean a(int i2, int i3, Intent intent) {
        Object obj;
        String a2;
        if (i3 == 0 || intent == null) {
            this.f91396i.a(0, "uploadCancel");
            return true;
        }
        Activity activity = this.f91395h.get();
        if (activity == null) {
            this.f91396i.a(0, "uploadFailed");
            return true;
        }
        Uri data = intent.getData();
        if (data == null || com.bytedance.common.utility.m.a(data.toString())) {
            new com.bytedance.tux.g.b(activity).b(2131231585).e(R.string.dq2).b();
            this.f91396i.a(0, "uploadFailed");
            return true;
        }
        String uri = data.toString();
        l.b(uri, "");
        this.o = uri;
        try {
            obj = q.m223constructorimpl(c.b.d.a(com.bytedance.ies.ugc.appcontext.d.a(), data));
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        if (!q.m228isFailureimpl(obj) && obj != null) {
            if (this.q.length() > 0) {
                a2 = new com.ss.android.common.util.g(Api.f66569d + "/" + this.q).a();
            } else {
                com.ss.android.common.util.g gVar = new com.ss.android.common.util.g(Api.f66570e);
                com.ss.android.ugc.aweme.account.b.a();
                IAccountUserService e2 = com.ss.android.ugc.aweme.account.b.f62864a.e();
                l.b(e2, "");
                gVar.a("uid", e2.getCurUserId());
                gVar.a("source", this.f91398l);
                a2 = gVar.a();
            }
            this.s.a(activity);
            if (this.q.length() > 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new com.ss.android.http.a.b.d("NS", this.r));
                com.ss.android.ugc.aweme.account.b.a();
                com.ss.android.ugc.aweme.account.b.f62864a.e().uploadAvatar(new WeakHandler(this), a2, 8388608, this.o, arrayList, "image_info");
            } else {
                com.ss.android.ugc.aweme.account.b.a();
                com.ss.android.ugc.aweme.account.b.f62864a.e().uploadAvatar(new WeakHandler(this), a2, 8388608, this.o, null);
            }
            return true;
        }
        new com.bytedance.tux.g.b(activity).b(2131231585).e(R.string.dq2).b();
        this.f91396i.a(0, "uploadFailed");
        return true;
    }

    /* access modifiers changed from: package-private */
    public static final class g<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f91410a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f91411b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList f91412c;

        static {
            Covode.recordClassIndex(57519);
        }

        g(e eVar, b bVar, ArrayList arrayList) {
            this.f91410a = eVar;
            this.f91411b = bVar;
            this.f91412c = arrayList;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            b bVar = this.f91411b;
            if (bVar != null) {
                this.f91412c.add(bVar);
            }
            return e.a(this.f91412c);
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.method.upload.c
    public final void k() {
        this.f91396i.a(0, "uploadCancel");
        this.f91389b = true;
    }

    public static final class c implements IAVProcessService.IProcessCallback<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f91403a;

        static {
            Covode.recordClassIndex(57515);
        }

        c(j jVar) {
            this.f91403a = jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback
        public final /* synthetic */ void finish(String str) {
            this.f91403a.a(str);
        }
    }

    public static final /* synthetic */ AtomicInteger a(e eVar) {
        AtomicInteger atomicInteger = eVar.f91393f;
        if (atomicInteger == null) {
            l.a("mMultiUploadFailNum");
        }
        return atomicInteger;
    }

    public static final /* synthetic */ HashMap b(e eVar) {
        HashMap<Integer, AvatarUri> hashMap = eVar.f91390c;
        if (hashMap == null) {
            l.a("mAvatarUriList");
        }
        return hashMap;
    }

    public static final /* synthetic */ AtomicInteger c(e eVar) {
        AtomicInteger atomicInteger = eVar.f91392e;
        if (atomicInteger == null) {
            l.a("mMultiUploadSuccessNum");
        }
        return atomicInteger;
    }

    public static final /* synthetic */ List d(e eVar) {
        List<String> list = eVar.f91391d;
        if (list == null) {
            l.a("mFileNameList");
        }
        return list;
    }

    private final void a(int i2) {
        this.p = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            d dVar = new d(this, i3);
            List<WeakHandler.IHandler> list = this.p;
            if (list == null) {
                l.a("mIHandlerList");
            }
            list.add(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f91413a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f91414b;

        static {
            Covode.recordClassIndex(57520);
        }

        h(e eVar, b bVar) {
            this.f91413a = eVar;
            this.f91414b = bVar;
        }

        @Override // b.g
        public final Object then(i<JSONArray> iVar) {
            if (this.f91413a.f91389b) {
                return null;
            }
            l.b(iVar, "");
            if (iVar.d() != null) {
                this.f91413a.f91396i.a(iVar.d());
            } else {
                this.f91413a.f91396i.a(0, "uploadFailed");
            }
            if (this.f91414b != null) {
                return null;
            }
            h.f.a.a<z> aVar = this.f91413a.f91394g;
            if (aVar != null) {
                aVar.invoke();
            }
            com.ss.android.ugc.aweme.feedback.d.a(this.f91413a.f91388a);
            return null;
        }
    }

    private static i<String> a(String str) {
        j jVar = new j();
        try {
            AVExternalServiceImpl.a().abilityService().processService().compressPhoto(str, 216, 384, new c(jVar));
        } catch (Exception e2) {
            e2.printStackTrace();
            jVar.a((Object) null);
        }
        i<TResult> iVar = jVar.f4869a;
        l.b(iVar, "");
        return iVar;
    }

    public static JSONArray a(List<b> list) {
        String str;
        try {
            JSONArray jSONArray = new JSONArray();
            for (b bVar : list) {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(bVar.f91400a)) {
                    jSONObject.put("url", bVar.f91400a);
                }
                if (!TextUtils.isEmpty(bVar.f91401b)) {
                    jSONObject.put("uri", bVar.f91401b);
                }
                i<String> a2 = a(bVar.f91402c);
                try {
                    a2.f();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
                try {
                    String d2 = a2.d();
                    if (d2 == null) {
                        d2 = "";
                    }
                    str = cs.b(d2);
                } catch (IOException unused) {
                    str = "";
                }
                jSONObject.put("base64", str);
                jSONArray.put(jSONObject);
            }
            return jSONArray;
        } catch (JSONException unused2) {
            return null;
        }
    }

    public final void a(Activity activity) {
        Intent intent = new Intent(activity, ImageChooseUploadActivity.class);
        intent.putExtra("maxSelectNum", this.f91397k);
        intent.putExtra("enter_from", this.n);
        a(activity, intent);
        com.ss.android.ugc.aweme.common.r.a("enter_image_choose", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.n).f66730a);
        ImageChooseUploadActivity.f91325i = this;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        this.s.a();
        Activity activity = this.f91395h.get();
        if (activity == null || message == null) {
            this.f91396i.a(0, "uploadFailed");
            return;
        }
        if (message.obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            com.ss.android.ugc.aweme.tux.a.i.a aVar = new com.ss.android.ugc.aweme.tux.a.i.a(activity);
            Object obj = message.obj;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
            aVar.a(((com.ss.android.ugc.aweme.base.api.a.b.a) obj).getErrorMsg()).a();
        } else if (message.obj instanceof AvatarUri) {
            Object obj2 = message.obj;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.AvatarUri");
            AvatarUri avatarUri = (AvatarUri) obj2;
            if (avatarUri.urlList != null) {
                List<String> list = avatarUri.urlList;
                l.b(list, "");
                if (!list.isEmpty()) {
                    String str = avatarUri.urlList.get(0);
                    l.b(str, "");
                    String str2 = avatarUri.uri;
                    l.b(str2, "");
                    a(new b(str, str2, this.o), new ArrayList<>());
                    return;
                }
            }
            this.f91396i.a(0, "uploadFailed");
            return;
        } else if (message.obj instanceof TcmImage) {
            Object obj3 = message.obj;
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.TcmImage");
            TcmImage tcmImage = (TcmImage) obj3;
            String mid = tcmImage.getMid();
            if (mid == null || mid.length() == 0) {
                this.f91396i.a(0, "uploadFailed");
                return;
            }
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mid", tcmImage.getMid());
            jSONArray.put(jSONObject);
            this.f91396i.a(jSONArray);
            return;
        }
        this.f91396i.a(0, "uploadFailed");
    }

    /* access modifiers changed from: package-private */
    public static final class d implements WeakHandler.IHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f91404a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f91405b;

        static {
            Covode.recordClassIndex(57516);
        }

        d(e eVar, int i2) {
            this.f91404a = eVar;
            this.f91405b = i2;
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
            if (!this.f91404a.f91389b) {
                if (message.obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                    Activity activity = this.f91404a.f91395h.get();
                    if (activity != null) {
                        com.ss.android.ugc.aweme.tux.a.i.a aVar = new com.ss.android.ugc.aweme.tux.a.i.a(activity);
                        Object obj = message.obj;
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
                        aVar.a(((com.ss.android.ugc.aweme.base.api.a.b.a) obj).getErrorMsg()).a();
                    }
                    e.a(this.f91404a).incrementAndGet();
                } else if (message.obj instanceof AvatarUri) {
                    Object obj2 = message.obj;
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.AvatarUri");
                    AvatarUri avatarUri = (AvatarUri) obj2;
                    if (com.ss.android.ugc.aweme.base.utils.d.b(avatarUri.urlList)) {
                        e.b(this.f91404a).put(Integer.valueOf(this.f91405b), avatarUri);
                        e.c(this.f91404a).incrementAndGet();
                    } else {
                        e.a(this.f91404a).incrementAndGet();
                    }
                } else {
                    e.a(this.f91404a).incrementAndGet();
                }
                if (e.a(this.f91404a).get() + e.c(this.f91404a).get() == e.d(this.f91404a).size()) {
                    int size = e.d(this.f91404a).size();
                    int i2 = e.c(this.f91404a).get();
                    if (i2 == 0) {
                        this.f91404a.f91396i.a(0, "uploadFailedAll");
                        h.f.a.a<z> aVar2 = this.f91404a.f91394g;
                        if (aVar2 != null) {
                            aVar2.invoke();
                        }
                        com.ss.android.ugc.aweme.feedback.d.a(this.f91404a.f91388a);
                    } else if (i2 >= 0 && size > i2) {
                        this.f91404a.f91396i.a(0, "uploadFailed");
                        h.f.a.a<z> aVar3 = this.f91404a.f91394g;
                        if (aVar3 != null) {
                            aVar3.invoke();
                        }
                        com.ss.android.ugc.aweme.feedback.d.a(this.f91404a.f91388a);
                    } else if (i2 == size) {
                        ArrayList<b> arrayList = new ArrayList<>();
                        int size2 = e.d(this.f91404a).size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            AvatarUri avatarUri2 = (AvatarUri) e.b(this.f91404a).get(Integer.valueOf(i3));
                            if (!(avatarUri2 == null || avatarUri2.urlList == null)) {
                                List<String> list = avatarUri2.urlList;
                                l.b(list, "");
                                if (!list.isEmpty()) {
                                    String str = avatarUri2.urlList.get(0);
                                    l.b(str, "");
                                    String str2 = avatarUri2.uri;
                                    l.b(str2, "");
                                    arrayList.add(new b(str, str2, (String) e.d(this.f91404a).get(i3)));
                                }
                            }
                        }
                        if (arrayList.size() == e.b(this.f91404a).size()) {
                            this.f91404a.a((b) null, arrayList);
                            return;
                        }
                        this.f91404a.f91396i.a(0, "uploadFailed");
                        h.f.a.a<z> aVar4 = this.f91404a.f91394g;
                        if (aVar4 != null) {
                            aVar4.invoke();
                        }
                        com.ss.android.ugc.aweme.feedback.d.a(this.f91404a.f91388a);
                    }
                }
            }
        }
    }

    private static void a(Activity activity, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
        activity.startActivity(intent);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.e$e  reason: collision with other inner class name */
    static final class C2205e implements b.AbstractC1579b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f91406a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f91407b;

        static {
            Covode.recordClassIndex(57517);
        }

        C2205e(e eVar, Activity activity) {
            this.f91406a = eVar;
            this.f91407b = activity;
        }

        @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
        public final void a(String[] strArr, int[] iArr) {
            l.b(iArr, "");
            if (iArr.length != 0) {
                if (iArr[0] == 0) {
                    com.ss.android.newmedia.d.a(this.f91407b);
                    return;
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f91407b).a(this.f91407b.getString(R.string.doy)).a();
                this.f91406a.f91396i.a(-1, "uploadFailed");
            }
        }
    }

    static final class f implements b.AbstractC1579b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f91408a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f91409b;

        static {
            Covode.recordClassIndex(57518);
        }

        f(e eVar, Activity activity) {
            this.f91408a = eVar;
            this.f91409b = activity;
        }

        @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
        public final void a(String[] strArr, int[] iArr) {
            l.b(iArr, "");
            if (iArr.length != 0) {
                if (iArr[0] == 0) {
                    this.f91408a.a(this.f91409b);
                    return;
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f91409b).a(this.f91409b.getString(R.string.doy)).a();
                this.f91408a.f91396i.a(-1, "uploadFailed");
            }
        }
    }

    public final void a(b bVar, ArrayList<b> arrayList) {
        i.b(new g(this, bVar, arrayList), i.f4824a).a(new h(this, bVar), i.f4826c, null);
    }

    @Override // com.ss.android.ugc.aweme.fe.method.upload.c
    public final void a(List<f> list, h.f.a.a<z> aVar) {
        Object obj;
        l.d(aVar, "");
        if (list != null) {
            this.f91394g = aVar;
            this.f91392e = new AtomicInteger(0);
            this.f91393f = new AtomicInteger(0);
            ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f91415a);
            }
            this.f91391d = arrayList;
            this.f91390c = new HashMap<>();
            List<String> list2 = this.f91391d;
            if (list2 == null) {
                l.a("mFileNameList");
            }
            a(list2.size());
            List<String> list3 = this.f91391d;
            if (list3 == null) {
                l.a("mFileNameList");
            }
            int size = list3.size();
            for (int i2 = 0; i2 < size; i2++) {
                List<String> list4 = this.f91391d;
                if (list4 == null) {
                    l.a("mFileNameList");
                }
                String str = list4.get(i2);
                if (com.bytedance.common.utility.m.a(str)) {
                    AtomicInteger atomicInteger = this.f91393f;
                    if (atomicInteger == null) {
                        l.a("mMultiUploadFailNum");
                    }
                    atomicInteger.incrementAndGet();
                } else {
                    try {
                        obj = q.m223constructorimpl(c.b.d.a(com.bytedance.ies.ugc.appcontext.d.a(), Uri.parse(str)));
                    } catch (Throwable th) {
                        obj = q.m223constructorimpl(r.a(th));
                    }
                    if (!q.m228isFailureimpl(obj) && obj != null) {
                        com.ss.android.common.util.g gVar = new com.ss.android.common.util.g(Api.f66570e);
                        com.ss.android.ugc.aweme.account.b.a();
                        IAccountUserService e2 = com.ss.android.ugc.aweme.account.b.f62864a.e();
                        l.b(e2, "");
                        gVar.a("uid", e2.getCurUserId());
                        gVar.a("source", this.f91398l);
                        String a2 = gVar.a();
                        String a3 = com.ss.android.ugc.aweme.fe.a.b.a(str);
                        if (!(a3 == null || a3.length() == 0)) {
                            com.ss.android.ugc.aweme.account.b.a();
                            IAccountUserService e3 = com.ss.android.ugc.aweme.account.b.f62864a.e();
                            List<WeakHandler.IHandler> list5 = this.p;
                            if (list5 == null) {
                                l.a("mIHandlerList");
                            }
                            e3.uploadAvatar(new WeakHandler(list5.get(i2)), a2, 8388608, com.ss.android.ugc.aweme.feedback.d.a(a3, new File(a3), this.f91388a), null);
                        }
                    } else {
                        AtomicInteger atomicInteger2 = this.f91393f;
                        if (atomicInteger2 == null) {
                            l.a("mMultiUploadFailNum");
                        }
                        atomicInteger2.incrementAndGet();
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.method.upload.b
    public final void a(JSONObject jSONObject, boolean z) {
        l.d(jSONObject, "");
        this.f91397k = jSONObject.optInt("maxSelectNum", 1);
        String optString = jSONObject.optString("source", "");
        l.b(optString, "");
        this.f91398l = optString;
        this.f91399m = jSONObject.optBoolean("isMultiSelect", false);
        String optString2 = jSONObject.optString("from", "");
        l.b(optString2, "");
        this.n = optString2;
        this.f91388a = jSONObject.optInt("image_width", 216);
        String optString3 = jSONObject.optString("encryptURL", "");
        l.b(optString3, "");
        this.q = optString3;
        String optString4 = jSONObject.optString("nameSpace", "");
        l.b(optString4, "");
        this.r = optString4;
        if (this.f91395h.get() != null) {
            if (this.f91399m) {
                Activity activity = this.f91395h.get();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type android.app.Activity");
                Activity activity2 = activity;
                if (androidx.core.content.b.a(activity2, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    a(activity2);
                } else {
                    com.ss.android.ugc.aweme.ce.b.a(activity2, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new f(this, activity2));
                }
            } else {
                Activity activity3 = this.f91395h.get();
                Objects.requireNonNull(activity3, "null cannot be cast to non-null type android.app.Activity");
                Activity activity4 = activity3;
                if (androidx.core.content.b.a(activity4, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    com.ss.android.newmedia.d.a(activity4);
                } else {
                    com.ss.android.ugc.aweme.ce.b.a(activity4, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C2205e(this, activity4));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f91400a;

        /* renamed from: b  reason: collision with root package name */
        public final String f91401b;

        /* renamed from: c  reason: collision with root package name */
        public final String f91402c;

        static {
            Covode.recordClassIndex(57514);
        }

        public b(String str, String str2, String str3) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            this.f91400a = str;
            this.f91401b = str2;
            this.f91402c = str3;
        }
    }

    public e(WeakReference<Activity> weakReference, a.C2200a aVar, m mVar) {
        l.d(weakReference, "");
        l.d(aVar, "");
        l.d(mVar, "");
        this.f91395h = weakReference;
        this.s = aVar;
        this.f91396i = mVar;
    }
}
