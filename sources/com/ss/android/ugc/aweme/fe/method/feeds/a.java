package com.ss.android.ugc.aweme.fe.method.feeds;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.fe.method.feeds.api.IDynamicApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.dg;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public final class a extends com.ss.android.ugc.aweme.common.e.a<Aweme, com.ss.android.ugc.aweme.fe.method.feeds.b.a> {

    /* renamed from: f  reason: collision with root package name */
    public static final C2202a f91280f = new C2202a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final f.a.b.a f91281a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f91282b;

    /* renamed from: c  reason: collision with root package name */
    public int f91283c;

    /* renamed from: d  reason: collision with root package name */
    public final String f91284d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.fe.method.feeds.api.a f91285e;

    /* renamed from: g  reason: collision with root package name */
    private String f91286g;

    /* renamed from: h  reason: collision with root package name */
    private int f91287h;

    static {
        Covode.recordClassIndex(57449);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a$a  reason: collision with other inner class name */
    public static final class C2202a {
        static {
            Covode.recordClassIndex(57450);
        }

        private C2202a() {
        }

        public /* synthetic */ C2202a(byte b2) {
            this();
        }

        public static a a(com.ss.android.ugc.aweme.fe.method.feeds.b.a aVar, String str, com.ss.android.ugc.aweme.fe.method.feeds.api.a aVar2) {
            l.d(aVar, "");
            l.d(str, "");
            l.d(aVar2, "");
            return new a(aVar, str, aVar2, (byte) 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<Aweme> getItems() {
        return ((com.ss.android.ugc.aweme.fe.method.feeds.b.a) this.mData).f91300a;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        if (this.mData == null || !((com.ss.android.ugc.aweme.fe.method.feeds.b.a) this.mData).f91301b) {
            return false;
        }
        return true;
    }

    public final void a(Activity activity) {
        if (activity != null) {
            activity.findViewById(16908290).setTag(R.id.wu, this);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        l.d(objArr, "");
        if (objArr.length == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        l.d(objArr, "");
        a(false);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        l.d(objArr, "");
        a(true);
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f91291a;

        static {
            Covode.recordClassIndex(57452);
        }

        c(a aVar) {
            this.f91291a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.fe.method.feeds.api.a aVar = this.f91291a.f91285e;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("eventName", "feeds_status_failed");
            aVar.b("notification", jSONObject);
            this.f91291a.mIsLoading = false;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f91293a;

        static {
            Covode.recordClassIndex(57454);
        }

        e(a aVar) {
            this.f91293a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            this.f91293a.mIsLoading = false;
            List list = this.f91293a.mNotifyListeners;
            if (list != null) {
                for (T t : list) {
                    if (t != null) {
                        if (!(th2 instanceof Exception)) {
                            th = null;
                        } else {
                            th = th2;
                        }
                        t.a_((Exception) th);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void handleData(com.ss.android.ugc.aweme.fe.method.feeds.b.a aVar) {
        boolean z = true;
        this.f91283c++;
        if (aVar != null) {
            this.mIsNewDataEmpty = aVar.f91300a.isEmpty();
            ((com.ss.android.ugc.aweme.fe.method.feeds.b.a) this.mData).f91301b = aVar.f91301b;
            ((com.ss.android.ugc.aweme.fe.method.feeds.b.a) this.mData).f91300a.addAll(aVar.f91300a);
            com.ss.android.ugc.aweme.fe.method.feeds.b.a aVar2 = (com.ss.android.ugc.aweme.fe.method.feeds.b.a) this.mData;
            if (aVar.f91300a.size() <= 0) {
                z = false;
            }
            aVar2.f91301b = z;
            ((com.ss.android.ugc.aweme.fe.method.feeds.b.a) this.mData).f91302c = aVar.f91302c;
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f91289a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f91290b;

        static {
            Covode.recordClassIndex(57451);
        }

        b(a aVar, Activity activity) {
            this.f91289a = aVar;
            this.f91290b = activity;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.fe.method.feeds.b.a aVar = (com.ss.android.ugc.aweme.fe.method.feeds.b.a) obj;
            com.ss.android.ugc.aweme.fe.method.feeds.api.a aVar2 = this.f91289a.f91285e;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("react_id", this.f91289a.f91284d);
            jSONObject2.put("page", this.f91289a.f91283c);
            jSONObject2.put("has_more", aVar.f91301b);
            jSONObject2.put("exist_list_raw", dg.a().b(aVar.f91300a));
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "feeds_status_change");
            jSONObject.put("eventType", 0);
            aVar2.b("notification", jSONObject);
            this.f91289a.handleData(aVar);
            this.f91289a.a(this.f91290b);
            this.f91289a.mIsLoading = false;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f91292a;

        static {
            Covode.recordClassIndex(57453);
        }

        d(a aVar) {
            this.f91292a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.fe.method.feeds.b.a aVar = (com.ss.android.ugc.aweme.fe.method.feeds.b.a) obj;
            com.ss.android.ugc.aweme.fe.method.feeds.api.a aVar2 = this.f91292a.f91285e;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("react_id", this.f91292a.f91284d);
            jSONObject2.put("page", this.f91292a.f91283c);
            jSONObject2.put("has_more", aVar.f91301b);
            jSONObject2.put("exist_list_raw", dg.a().b(aVar.f91300a));
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "feeds_status_change");
            jSONObject.put("eventType", 1);
            aVar2.b("notification", jSONObject);
            this.f91292a.handleData(aVar);
            a aVar3 = this.f91292a;
            aVar3.a(aVar3.f91282b);
            this.f91292a.mIsLoading = false;
            List list = this.f91292a.mNotifyListeners;
            if (list != null) {
                for (T t : list) {
                    if (t != null) {
                        t.c();
                    }
                }
            }
        }
    }

    private void a(boolean z) {
        int i2;
        this.mIsLoading = true;
        f.a.b.a aVar = this.f91281a;
        String str = this.f91286g;
        if (str == null) {
            l.a("requestUrl");
        }
        IDynamicApi a2 = IDynamicApi.a.a(str);
        String str2 = this.f91286g;
        if (str2 == null) {
            l.a("requestUrl");
        }
        HashMap hashMap = new HashMap();
        if (z) {
            i2 = 0;
        } else {
            i2 = this.f91283c;
        }
        hashMap.put("page", String.valueOf(i2));
        hashMap.put("size", String.valueOf(this.f91287h));
        aVar.a(a2.loadVideos(str2, hashMap).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new d(this), new e(this)));
    }

    private a(com.ss.android.ugc.aweme.fe.method.feeds.b.a aVar, String str, com.ss.android.ugc.aweme.fe.method.feeds.api.a aVar2) {
        this.f91284d = str;
        this.f91285e = aVar2;
        this.mData = aVar;
        this.f91281a = new f.a.b.a();
        this.f91287h = 20;
    }

    public /* synthetic */ a(com.ss.android.ugc.aweme.fe.method.feeds.b.a aVar, String str, com.ss.android.ugc.aweme.fe.method.feeds.api.a aVar2, byte b2) {
        this(aVar, str, aVar2);
    }

    public final void a(String str, int i2, int i3, Activity activity) {
        l.d(str, "");
        l.d(activity, "");
        this.f91286g = str;
        this.f91283c = i2;
        this.f91287h = i3;
        this.f91282b = activity;
        f.a.b.a aVar = this.f91281a;
        IDynamicApi a2 = IDynamicApi.a.a(str);
        HashMap hashMap = new HashMap();
        hashMap.put("page", String.valueOf(i2));
        hashMap.put("size", String.valueOf(i3));
        aVar.a(a2.loadVideos(str, hashMap).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this, activity), new c(this)));
    }
}
