package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.feed.model.LiveEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareServiceImpl;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.f;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.s;
import h.f.b.l;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public final class ShareLiveEventMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91169a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57378);
    }

    private ShareLiveEventMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57379);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ ShareLiveEventMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public ShareLiveEventMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    public static final class b implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f91170a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f91171b;

        static {
            Covode.recordClassIndex(57380);
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.b
        public final void a(com.ss.android.ugc.aweme.sharer.b bVar, boolean z, SharePackage sharePackage, Context context) {
            l.d(bVar, "");
            l.d(context, "");
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.f
        public final void a(h hVar, SharePackage sharePackage, Context context) {
            l.d(hVar, "");
            l.d(sharePackage, "");
            l.d(context, "");
        }

        b(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
            this.f91170a = jSONObject;
            this.f91171b = aVar;
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.f
        public final void a(SharePackage sharePackage, Context context) {
            l.d(sharePackage, "");
            l.d(context, "");
            BaseCommonJavaMethod.a aVar = this.f91171b;
            if (aVar != null) {
                aVar.a(this.f91170a);
            }
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.f
        public final void b(SharePackage sharePackage, Context context) {
            l.d(sharePackage, "");
            l.d(context, "");
            try {
                JSONObject jSONObject = this.f91170a;
                if (jSONObject != null) {
                    jSONObject.put("code", 0);
                }
            } catch (JSONException unused) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        JSONObject jSONObject2 = new JSONObject();
        int i2 = 1;
        jSONObject2.put("code", 1);
        WeakReference weakReference = this.mContextRef;
        l.b(weakReference, "");
        com.bytedance.ies.web.a.a aVar2 = this.mJsBridge;
        boolean z = false;
        if (jSONObject != null) {
            LiveEvent liveEvent = new LiveEvent();
            liveEvent.setShowsIMForActivity(Boolean.valueOf(jSONObject.optBoolean("showsIMForActivity")));
            liveEvent.setEventID(jSONObject.optString("id"));
            liveEvent.setOrganizer((User) GsonHolder.a().b().a(jSONObject.optString("organizer"), User.class));
            liveEvent.setTitle(jSONObject.optString("title"));
            liveEvent.setStartTime(jSONObject.optString("start_time"));
            liveEvent.setInternalURL(jSONObject.optString("internalURL"));
            liveEvent.setTrackInfo(jSONObject.optString("track_info"));
            liveEvent.setShareURL(jSONObject.optString("shareURL"));
            liveEvent.setAnchor(jSONObject.optString("isAuthor"));
            liveEvent.setCustomActionItems(s.a(jSONObject.optJSONArray("customActionItems")));
            Context context = (Context) weakReference.get();
            if (!TextUtils.isEmpty(liveEvent.getEventID()) && context != null) {
                b bVar = new b(jSONObject2, aVar);
                jSONObject2.put("tricky_flag", "tricky_flag");
                Activity a2 = o.a(context);
                if (a2 != null) {
                    ShareServiceImpl.d().a(a2, liveEvent, bVar, aVar2);
                    z = true;
                }
            }
        }
        if (!jSONObject2.has("tricky_flag")) {
            if (!z) {
                i2 = -1;
            }
            jSONObject2.put("code", i2);
            if (aVar != null) {
                aVar.a(jSONObject2);
            }
        }
    }
}
