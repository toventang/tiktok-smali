package com.ss.android.ugc.aweme.setting.page.datasave.zerorating;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.b.b.a;
import com.ss.android.ugc.aweme.api.IZeroRatingService;
import com.ss.android.ugc.aweme.be.d;
import com.ss.android.ugc.aweme.dc.c;
import com.ss.android.ugc.aweme.zerorating.ZeroRatingServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final Context f122461a;

    /* renamed from: b  reason: collision with root package name */
    private final String f122462b;

    static {
        Covode.recordClassIndex(80313);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.dc.c, com.ss.android.ugc.aweme.dc.a
    public final /* synthetic */ d b() {
        return b();
    }

    @Override // com.ss.android.ugc.aweme.dc.c
    public final d a() {
        return new d(this.f122462b, null, this, null, false, null, null, true, null, false, null, false, null, 130810);
    }

    @Override // com.ss.android.ugc.aweme.dc.e, com.ss.android.ugc.aweme.dc.a
    public final void ce_() {
        IZeroRatingService f2 = ZeroRatingServiceImpl.f();
        l.b(f2, "");
        f2.c().d();
    }

    public final void e() {
        new com.ss.android.ugc.aweme.tux.a.i.a(this.f122461a).a(R.string.bp3).a();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.datasave.zerorating.a$a  reason: collision with other inner class name */
    public static final class C3171a implements com.bytedance.sdk.b.d.b.a<com.bytedance.sdk.b.b.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f122463a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f122464b;

        static {
            Covode.recordClassIndex(80314);
        }

        @Override // com.bytedance.sdk.b.d.b.a
        public final void a(Exception exc) {
            l.d(exc, "");
            this.f122463a.e();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.sdk.b.d.b.a
        public final /* synthetic */ void a(com.bytedance.sdk.b.b.a aVar) {
            com.bytedance.sdk.b.b.a aVar2 = aVar;
            Context context = null;
            if (aVar2 == null || aVar2.f43505a == null || aVar2.f43505a.size() == 0) {
                this.f122463a.e();
            } else if (aVar2.f43505a.size() == 1) {
                a.C1050a aVar3 = aVar2.f43505a.get(0);
                l.b(aVar3, "");
                SmartRouter.buildRoute(this.f122463a.f122461a, "aweme://webview").withParam("url", aVar3.getUrl()).open();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("plan_id", aVar3.getPlanId());
                    jSONObject.put("enter_from", "data_saver");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                IZeroRatingService f2 = ZeroRatingServiceImpl.f();
                l.b(f2, "");
                com.ss.android.ugc.aweme.api.d c2 = f2.c();
                String planId = aVar3.getPlanId();
                l.b(planId, "");
                c2.c(planId);
            } else if (aVar2.f43505a.size() > 1) {
                Bundle bundle = new Bundle();
                List<a.C1050a> list = aVar2.f43505a;
                Objects.requireNonNull(list, "null cannot be cast to non-null type java.util.ArrayList<com.bytedance.sdk.mobiledata.entity.DataPlanInfo.DataPlanEntity?>");
                bundle.putSerializable("list", (ArrayList) list);
                View view = this.f122464b;
                if (view != null) {
                    context = view.getContext();
                }
                SmartRouter.buildRoute(context, "aweme://setting/datasaver/freedata").withParam(bundle).open();
            }
        }

        C3171a(a aVar, View view) {
            this.f122463a = aVar;
            this.f122464b = view;
        }

        @Override // com.bytedance.sdk.b.d.b.a
        public final void a(int i2, String str) {
            l.d(str, "");
            this.f122463a.e();
        }
    }

    public a(Fragment fragment) {
        l.d(fragment, "");
        String string = fragment.getString(R.string.b4j);
        l.b(string, "");
        this.f122462b = string;
        this.f122461a = fragment.getContext();
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        IZeroRatingService f2 = ZeroRatingServiceImpl.f();
        l.b(f2, "");
        f2.c().e();
        ZeroRatingServiceImpl.f().a(new C3171a(this, view));
    }
}
