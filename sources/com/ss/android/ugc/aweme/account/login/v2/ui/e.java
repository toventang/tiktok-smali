package com.ss.android.ugc.aweme.account.login.v2.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.recover.f;
import com.ss.android.ugc.aweme.account.login.v2.base.c;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.bt;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.Serializable;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f65061a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(39985);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f65062a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f65063b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f65064c;

        static {
            Covode.recordClassIndex(39986);
        }

        a(c cVar, String str, boolean z) {
            this.f65062a = cVar;
            this.f65063b = str;
            this.f65064c = z;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            c cVar = this.f65062a;
            String str = this.f65063b;
            boolean z = this.f65064c;
            l.d(cVar, "");
            l.d(str, "");
            com.ss.android.ugc.aweme.common.f.a aVar = new com.ss.android.ugc.aweme.common.f.a(cVar.getContext());
            String string = cVar.getString(R.string.d__);
            l.b(string, "");
            String string2 = cVar.getString(R.string.d7w);
            l.b(string2, "");
            aVar.a(new String[]{string, string2}, new b(str, cVar, z));
            bt.a(aVar.f76416a.a());
        }
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f65065a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f65066b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f65067c;

        static {
            Covode.recordClassIndex(39987);
        }

        b(String str, c cVar, boolean z) {
            this.f65065a = str;
            this.f65066b = cVar;
            this.f65067c = z;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            int value;
            Serializable serializable;
            boolean z = true;
            if (i2 == 1) {
                r.a("click_forget_password", new com.ss.android.ugc.aweme.account.a.b.a().a("platform", "email").a("enter_from", this.f65065a).a("enter_method", this.f65066b.x()).f62575a);
            } else if (i2 == 0) {
                r.a("click_forget_password", new com.ss.android.ugc.aweme.account.a.b.a().a("platform", "phone").a("enter_from", this.f65065a).a("enter_method", this.f65066b.x()).f62575a);
            }
            c cVar = this.f65066b;
            Bundle arguments = cVar.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            if (i2 == 1) {
                value = k.INPUT_EMAIL_FIND_PASSWORD.getValue();
            } else {
                value = k.INPUT_PHONE_FIND_PASSWORD.getValue();
            }
            arguments.putInt("next_page", value);
            if (this.f65067c) {
                Bundle arguments2 = this.f65066b.getArguments();
                f.b bVar = null;
                if (arguments2 != null) {
                    serializable = arguments2.getSerializable("recover_account_data");
                } else {
                    serializable = null;
                }
                if (serializable instanceof f.b) {
                    bVar = serializable;
                }
                f.b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.setNeedStoreLastMethod(true);
                    z = !bVar2.getSafe();
                }
                arguments.putInt("current_scene", j.RECOVER_ACCOUNT.getValue());
            } else {
                arguments.putInt("current_scene", j.SET_OR_RESET_PASSWORD.getValue());
            }
            c cVar2 = this.f65066b;
            if ((cVar2 instanceof d) && z) {
                com.ss.android.ugc.aweme.account.login.v2.base.e.a(cVar2, ((d) cVar2).e());
            }
            l.b(arguments, "");
            cVar.a(arguments);
            dialogInterface.dismiss();
        }
    }

    public static void a(View view, c cVar, String str, boolean z) {
        l.d(view, "");
        l.d(cVar, "");
        l.d(str, "");
        view.setOnTouchListener(new com.ss.android.ugc.aweme.ai.a(0.5f));
        view.setOnClickListener(new a(cVar, str, z));
    }
}
