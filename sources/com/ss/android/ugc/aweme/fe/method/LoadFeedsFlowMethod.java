package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.g;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.fe.method.feeds.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import h.h;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class LoadFeedsFlowMethod extends BaseCommonJavaMethod implements au, com.ss.android.ugc.aweme.fe.method.feeds.api.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f91083b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f91084a;

    /* renamed from: c  reason: collision with root package name */
    private final h f91085c;

    /* renamed from: d  reason: collision with root package name */
    private final h f91086d;

    static {
        Covode.recordClassIndex(57297);
    }

    private LoadFeedsFlowMethod(byte b2) {
        this();
    }

    private final com.ss.android.ugc.aweme.fe.method.feeds.b c() {
        return (com.ss.android.ugc.aweme.fe.method.feeds.b) this.f91085c.getValue();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57298);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ LoadFeedsFlowMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.fe.method.feeds.b> {
        final /* synthetic */ LoadFeedsFlowMethod this$0;

        static {
            Covode.recordClassIndex(57299);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LoadFeedsFlowMethod loadFeedsFlowMethod) {
            super(0);
            this.this$0 = loadFeedsFlowMethod;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.fe.method.feeds.b invoke() {
            return b.a.a(new com.ss.android.ugc.aweme.fe.method.feeds.b.a(), this.this$0.f91084a, this.this$0);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<f> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f91087a = new c();

        static {
            Covode.recordClassIndex(57300);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            return new g().a((Type) Boolean.TYPE, (Object) new LoadFeedsFlowMethod$parser$2$1()).b();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        Activity activity = (Activity) getActContext();
        if (activity != null) {
            activity.findViewById(16908290).setTag(R.id.wu, null);
        }
    }

    public LoadFeedsFlowMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
        this.f91085c = h.i.a((h.f.a.a) new b(this));
        this.f91086d = h.i.a((h.f.a.a) c.f91087a);
        this.f91084a = "";
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        l.d(weakReference, "");
        Context context = weakReference.get();
        if (context instanceof m) {
            ((m) context).getLifecycle().a(this);
        }
        BaseCommonJavaMethod attach = super.attach(weakReference);
        l.b(attach, "");
        return attach;
    }

    @Override // com.ss.android.ugc.aweme.fe.method.feeds.api.a
    public final void b(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(jSONObject, "");
        sendEvent(str, jSONObject, 3);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        List<? extends Aweme> list;
        int i2 = 1;
        boolean z = false;
        if (jSONObject != null && jSONObject.has("react_id") && jSONObject.has("has_more") && jSONObject.has("aweme_list") && jSONObject.has("page") && 1 != 0) {
            if (!TextUtils.isEmpty(this.f91084a) && !TextUtils.equals(this.f91084a, jSONObject.optString("react_id"))) {
                c().a();
            }
            String optString = jSONObject.optString("react_id");
            l.b(optString, "");
            this.f91084a = optString;
            if (jSONObject.has("clear_data") && jSONObject.optInt("clear_data") == 1) {
                c().a();
            }
            Object[] objArr = (Object[]) ((f) this.f91086d.getValue()).a(jSONObject.optString("aweme_list"), Aweme[].class);
            if (objArr == null || (list = h.a.i.j(objArr)) == null) {
                list = z.INSTANCE;
            }
            if (list.isEmpty()) {
                list = z.INSTANCE;
            } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.P((Aweme) list.get(0))) {
                com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo = ((Aweme) list.get(0)).getCommerceVideoAuthInfo();
                l.b(commerceVideoAuthInfo, "");
                if (!TextUtils.isEmpty(commerceVideoAuthInfo.getItemId())) {
                    ArrayList arrayList = new ArrayList();
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        Aweme a2 = AwemeService.b().a((Aweme) list.get(i3));
                        l.b(a2, "");
                        arrayList.add(a2);
                    }
                    list = arrayList;
                }
            }
            c().a(list, jSONObject.optInt("page", 0), jSONObject.optBoolean("has_more", false), jSONObject.optBoolean("insert_before", false));
            z = true;
        }
        Activity activity = (Activity) getActContext();
        if (activity != null) {
            activity.findViewById(16908290).setTag(R.id.wu, c());
        }
        if (aVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            if (!z) {
                i2 = -1;
            }
            jSONObject2.put("code", i2);
            aVar.a(jSONObject2);
        }
    }
}
