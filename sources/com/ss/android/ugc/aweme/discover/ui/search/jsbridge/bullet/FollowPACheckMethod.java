package com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.c;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import org.json.JSONObject;

public final class FollowPACheckMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f82650b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final h f82651c;

    /* renamed from: d  reason: collision with root package name */
    private final String f82652d = "followPACheckMethod";

    static {
        Covode.recordClassIndex(51479);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51480);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f82652d;
    }

    static final class b extends h.f.b.m implements h.f.a.a<c<? extends Context>> {
        final /* synthetic */ com.bytedance.ies.bullet.c.e.a.b $contextProviderFactory;

        static {
            Covode.recordClassIndex(51481);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.bytedance.ies.bullet.c.e.a.b bVar) {
            super(0);
            this.$contextProviderFactory = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c<? extends Context> invoke() {
            return this.$contextProviderFactory.b(Context.class);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowPACheckMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
        this.f82651c = h.i.a((h.f.a.a) new b(bVar));
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        Context context;
        l.d(jSONObject, "");
        l.d(aVar, "");
        c cVar = (c) this.f82651c.getValue();
        if (cVar != null) {
            context = (Context) cVar.b();
        } else {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            SharePrefCache inst = SharePrefCache.inst();
            l.b(inst, "");
            aj<Integer> privacyAccountFollowCount = inst.getPrivacyAccountFollowCount();
            l.b(privacyAccountFollowCount, "");
            Integer c2 = privacyAccountFollowCount.c();
            if (c2 != null && c2.intValue() == 0) {
                new a.C0731a(activity).b(R.string.evb).a(R.string.cc_, (DialogInterface.OnClickListener) null, false).a().b();
            } else if (c2.intValue() > 0 && c2.intValue() < 4) {
                new com.bytedance.tux.g.b(activity).e(R.string.evc).b();
            }
            privacyAccountFollowCount.b(Integer.valueOf(c2.intValue() + 1));
        }
    }
}
