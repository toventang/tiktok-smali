package com.ss.android.ugc.aweme.notification.i;

import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.notification.i.i;
import com.ss.android.ugc.aweme.notification.vm.NotificationVM;
import com.ss.android.ugc.aweme.notification.vm.c;
import com.ss.android.ugc.aweme.notification.vm.d;
import h.f.b.m;
import h.h;

public final class a extends i.a {

    /* renamed from: a  reason: collision with root package name */
    private final h f113746a = com.ss.android.ugc.aweme.notification.b.a.a(new C2911a(this));

    static {
        Covode.recordClassIndex(73121);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.a$a  reason: collision with other inner class name */
    static final class C2911a extends m implements h.f.a.a<NotificationVM> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(73122);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2911a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NotificationVM invoke() {
            return NotificationVM.a.a(this.this$0.j());
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i.a
    public final void a() {
        Intent intent;
        e activity = j().getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            String a2 = a(intent, "label");
            String a3 = a(intent, "uid");
            intent.putExtra("label", "");
            if (TextUtils.equals(a2, "follow_request")) {
                j().startActivityForResult(SmartRouter.buildRoute(j().getContext(), "aweme://follow_request").withParam("label", a2).withParam("uid", a3).buildIntent(), 1024);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i.a
    public final void a(int i2) {
        if (i2 == 1024) {
            c j2 = ((NotificationVM) this.f113746a.getValue()).j();
            if (!(j2 instanceof d)) {
                j2 = null;
            }
            d dVar = (d) j2;
            if (dVar != null) {
                dVar.m();
            }
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
