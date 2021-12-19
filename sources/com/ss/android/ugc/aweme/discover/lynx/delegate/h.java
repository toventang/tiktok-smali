package com.ss.android.ugc.aweme.discover.lynx.delegate;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.bullet.bridge.framework.OpenShortVideoMethod;
import com.ss.android.ugc.aweme.discover.api.SearchContinuousLoadingApi;
import com.ss.android.ugc.aweme.discover.helper.x;
import com.ss.android.ugc.aweme.discover.mixfeed.d;
import com.ss.android.ugc.aweme.discover.ui.search.a;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class h extends b implements OpenShortVideoMethod.b, com.ss.android.ugc.aweme.discover.lynx.a.c, a.b {

    /* renamed from: c  reason: collision with root package name */
    public static int f81495c = 10;

    /* renamed from: d  reason: collision with root package name */
    public static final a f81496d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<String> f81497a = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final h.h f81498e;

    /* renamed from: f  reason: collision with root package name */
    private String f81499f;

    private final x d() {
        return (x) this.f81498e.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50654);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<x> {
        final /* synthetic */ com.ss.android.ugc.aweme.discover.lynx.a.b $bulletContext;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(50655);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h hVar, com.ss.android.ugc.aweme.discover.lynx.a.b bVar) {
            super(0);
            this.this$0 = hVar;
            this.$bulletContext = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ x invoke() {
            return x.a.a(new x.b(this) {
                /* class com.ss.android.ugc.aweme.discover.lynx.delegate.h.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f81500a;

                static {
                    Covode.recordClassIndex(50656);
                }

                @Override // com.ss.android.ugc.aweme.discover.helper.x.b
                public final List<Aweme> aK_() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.discover.helper.x.b
                public final List<Aweme> aL_() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.discover.helper.x.b
                public final int aM_() {
                    return h.f81495c;
                }

                @Override // com.ss.android.ugc.aweme.discover.helper.x.b
                public final Object aJ_() {
                    d dVar = this.f81500a.$bulletContext.f81417h;
                    if (dVar != null) {
                        return dVar.getKey();
                    }
                    return null;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f81500a = r1;
                }

                @Override // com.ss.android.ugc.aweme.discover.helper.x.b
                public final boolean a(Aweme aweme) {
                    l.d(aweme, "");
                    if (this.f81500a.this$0.f81497a.isEmpty()) {
                        return true;
                    }
                    Iterator<T> it = this.f81500a.this$0.f81497a.iterator();
                    while (it.hasNext()) {
                        if (TextUtils.equals(aweme.getAid(), it.next())) {
                            return true;
                        }
                    }
                    return false;
                }
            });
        }
    }

    static {
        Covode.recordClassIndex(50653);
    }

    @Override // com.ss.android.ugc.aweme.discover.lynx.a.c
    public final void a(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        bVar.b(OpenShortVideoMethod.b.class, this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(com.ss.android.ugc.aweme.discover.lynx.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
        bVar.a().a(this);
        this.f81498e = i.a((h.f.a.a) new b(this, bVar));
    }

    private final void b(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("item_ids");
        int length = optJSONArray.length();
        this.f81497a.clear();
        for (int i2 = 0; i2 < length; i2++) {
            List<String> list = this.f81497a;
            String optString = optJSONArray.optString(i2);
            l.b(optString, "");
            list.add(optString);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.framework.OpenShortVideoMethod.b
    public final boolean a(JSONObject jSONObject) {
        String str;
        l.d(jSONObject, "");
        JSONObject optJSONObject = jSONObject.optJSONObject("search_extra");
        if (optJSONObject != null) {
            str = optJSONObject.optString("video_from");
        } else {
            str = null;
        }
        if (l.a((Object) str, (Object) "from_search_continuous_loading_card")) {
            return true;
        }
        return false;
    }

    static final class c extends m implements h.f.a.m<Aweme, List<Aweme>, z> {
        final /* synthetic */ Aweme $aweme$inlined;
        final /* synthetic */ String $enterFrom$inlined;
        final /* synthetic */ JSONObject $this_apply$inlined;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(50657);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(JSONObject jSONObject, h hVar, Aweme aweme, String str) {
            super(2);
            this.$this_apply$inlined = jSONObject;
            this.this$0 = hVar;
            this.$aweme$inlined = aweme;
            this.$enterFrom$inlined = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Aweme aweme, List<Aweme> list) {
            l.d(aweme, "");
            if (list != null) {
                this.$this_apply$inlined.put("new_aweme_list", com.ss.android.ugc.aweme.account.util.i.a().b(list));
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.framework.OpenShortVideoMethod.b
    public final boolean a(JSONObject jSONObject, Bundle bundle) {
        Integer num;
        l.d(jSONObject, "");
        l.d(bundle, "");
        e eVar = this.f81477b.f81410a;
        l.d(this, "");
        if (eVar != null) {
            com.ss.android.ugc.aweme.discover.ui.search.a.b().put(Integer.valueOf(eVar.hashCode()), new WeakReference<>(this));
        }
        this.f81499f = jSONObject.optString("current_item_id");
        b(jSONObject);
        f81495c = bundle.getInt("item_size", 10);
        JSONObject optJSONObject = jSONObject.optJSONObject("search_extra");
        String str = null;
        if (optJSONObject != null) {
            num = Integer.valueOf(optJSONObject.optInt(StringSet.type));
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 2) {
                bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 65456);
            } else if (num.intValue() == 4) {
                bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 65458);
            }
        }
        x d2 = d();
        if (optJSONObject != null) {
            str = optJSONObject.optString("video_from");
        }
        if (!l.a((Object) str, (Object) "from_search_continuous_loading_card") || d2 == null) {
            return false;
        }
        Context context = this.f81477b.r.getContext();
        l.b(context, "");
        SearchContinuousLoadingApi.b bVar = new SearchContinuousLoadingApi.b();
        JSONObject optJSONObject2 = jSONObject.optJSONObject("search_extra");
        if (optJSONObject2 != null) {
            bVar.f80793a = optJSONObject2.optString("keyword");
            bVar.f80794b = optJSONObject2.optInt(StringSet.type);
            bVar.f80795c = optJSONObject2.optString("id");
        }
        d2.a(context, bundle, bVar);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.search.a.b
    public final void a(Aweme aweme, String str, String str2) {
        l.d(aweme, "");
        l.d(str, "");
        l.d(str2, "");
        if (!TextUtils.equals(aweme.getAid(), this.f81499f)) {
            com.ss.android.ugc.aweme.discover.lynx.a.b bVar = this.f81477b;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scroll_aweme_id", aweme.getAid());
            jSONObject.put("cid", aweme.getChallengeId());
            x d2 = d();
            if (d2 != null && l.a((Object) str2, (Object) "from_search_continuous_loading_card")) {
                ag agVar = new ag(21);
                agVar.f93454e = str2;
                d2.a(agVar, aweme, new c(jSONObject, this, aweme, str2));
            }
            bVar.a("updateVideoCloseState", jSONObject);
        }
        com.ss.android.ugc.aweme.discover.ui.search.a.a(this);
    }
}
