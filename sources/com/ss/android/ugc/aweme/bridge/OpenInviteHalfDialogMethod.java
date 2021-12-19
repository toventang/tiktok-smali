package com.ss.android.ugc.aweme.bridge;

import android.app.Activity;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.ui.common.g;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.qainvitation.e.e;
import com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.List;
import org.json.JSONObject;

public final class OpenInviteHalfDialogMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private final String f68777b = "openInviteHalfDialog";

    static {
        Covode.recordClassIndex(42355);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68777b;
    }

    static final class a extends h.f.b.m implements b<List<? extends IMUser>, z> {
        final /* synthetic */ k.b $callback;

        static {
            Covode.recordClassIndex(42356);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(k.b bVar) {
            super(1);
            this.$callback = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends IMUser> list) {
            l.d(list, "");
            a.a(this.$callback, (JSONObject) null);
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenInviteHalfDialogMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.c.c.a.k
    public final void a(JSONObject jSONObject, k.b bVar) {
        Activity a2;
        l.d(jSONObject, "");
        l.d(bVar, "");
        try {
            g f2 = f();
            if (f2 == null || (a2 = f2.a()) == null) {
                a.a(bVar, (Throwable) null);
                return;
            }
            long optLong = jSONObject.optLong("question_id");
            String optString = jSONObject.optString("enter_method");
            if (optLong == 0) {
                a.a(bVar, (Throwable) null);
                return;
            }
            IQAInvitationService b2 = QAInvitationService.b();
            l.b(optString, "");
            e eVar = e.VIDEO;
            Long valueOf = Long.valueOf(optLong);
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            String curUserId = g2.getCurUserId();
            l.b(curUserId, "");
            IQAInvitationService.a.a(b2, a2, optString, "eoy_hub", eVar, valueOf, Long.valueOf(Long.parseLong(curUserId)), new a(bVar), 64);
        } catch (Throwable th) {
            a.a(bVar, th);
        }
    }
}
