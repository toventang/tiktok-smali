package com.ss.android.ugc.aweme.account.agegate.b;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.fragment.app.n;
import b.g;
import b.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.agegate.api.Api;
import com.ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.ss.android.ugc.aweme.account.util.q;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.Serializable;
import java.util.HashMap;
import java.util.regex.Pattern;

public final class f extends com.ss.android.ugc.aweme.base.f.a {

    /* renamed from: a  reason: collision with root package name */
    private HashMap f62678a;

    static {
        Covode.recordClassIndex(38612);
    }

    public final View a(int i2) {
        if (this.f62678a == null) {
            this.f62678a = new HashMap();
        }
        View view = (View) this.f62678a.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f62678a.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f62678a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f62683a;

        static {
            Covode.recordClassIndex(38616);
        }

        b(f fVar) {
            this.f62683a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            KeyboardUtils.c(this.f62683a.a(R.id.auc));
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f62684a;

        static {
            Covode.recordClassIndex(38617);
        }

        c(f fVar) {
            this.f62684a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            e activity = this.f62684a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f62679a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AgeGateResponse f62680b;

        static {
            Covode.recordClassIndex(38613);
        }

        a(f fVar, AgeGateResponse ageGateResponse) {
            this.f62679a = fVar;
            this.f62680b = ageGateResponse;
        }

        public final void onClick(View view) {
            int i2;
            ClickAgent.onClick(view);
            AgeGateResponse ageGateResponse = this.f62680b;
            if (ageGateResponse == null || ageGateResponse.getAgeGatePostAction() != 2) {
                com.ss.android.ugc.aweme.account.a.b.a a2 = new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", "pop_up");
                AgeGateResponse ageGateResponse2 = this.f62680b;
                if (ageGateResponse2 == null || ageGateResponse2.getAgeGatePostAction() != 0) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                r.a("export_video_finish_input", a2.a("pass_gate", i2).f62575a);
            } else {
                com.ss.android.ugc.aweme.account.agegate.util.c.b("submit_email");
            }
            a.C0731a a3 = new a.C0731a(this.f62679a.getActivity()).a(R.string.a4k);
            f fVar = this.f62679a;
            DmtEditText dmtEditText = (DmtEditText) fVar.a(R.id.auc);
            l.b(dmtEditText, "");
            a3.f33402b = fVar.getString(R.string.a4j, String.valueOf(dmtEditText.getText()));
            a3.b(R.string.a7u, (DialogInterface.OnClickListener) null, false).a(R.string.asg, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.account.agegate.b.f.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f62681a;

                static {
                    Covode.recordClassIndex(38614);
                }

                {
                    this.f62681a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i2) {
                    DmtEditText dmtEditText = (DmtEditText) this.f62681a.f62679a.a(R.id.auc);
                    l.b(dmtEditText, "");
                    String valueOf = String.valueOf(dmtEditText.getText());
                    int i3 = 0;
                    if (!TextUtils.isEmpty(valueOf) && Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", 2).matcher(valueOf).matches()) {
                        AgeGateResponse ageGateResponse = this.f62681a.f62680b;
                        if (ageGateResponse == null || ageGateResponse.getAgeGatePostAction() != 2) {
                            com.ss.android.ugc.aweme.account.a.b.a a2 = new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", "pop_up");
                            AgeGateResponse ageGateResponse2 = this.f62681a.f62680b;
                            if (ageGateResponse2 != null && ageGateResponse2.getAgeGatePostAction() == 0) {
                                i3 = 1;
                            }
                            r.a("export_video_address_confirm", a2.a("pass_gate", i3).f62575a);
                        }
                        ((DmtStatusView) this.f62681a.f62679a.a(R.id.e_c)).f();
                        DmtEditText dmtEditText2 = (DmtEditText) this.f62681a.f62679a.a(R.id.auc);
                        l.b(dmtEditText2, "");
                        Api.emailForExportVideo(String.valueOf(dmtEditText2.getText())).a(new g(this) {
                            /* class com.ss.android.ugc.aweme.account.agegate.b.f.a.AnonymousClass1.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass1 f62682a;

                            static {
                                Covode.recordClassIndex(38615);
                            }

                            {
                                this.f62682a = r1;
                            }

                            @Override // b.g
                            public final /* synthetic */ Object then(i iVar) {
                                n nVar;
                                androidx.fragment.app.i supportFragmentManager;
                                Serializable serializable;
                                Intent intent;
                                if (this.f62682a.f62681a.f62679a.ab_() && this.f62682a.f62681a.f62679a.getActivity() != null) {
                                    ((DmtStatusView) this.f62682a.f62681a.f62679a.a(R.id.e_c)).setStatus(-1);
                                    DmtStatusView dmtStatusView = (DmtStatusView) this.f62682a.f62681a.f62679a.a(R.id.e_c);
                                    l.b(dmtStatusView, "");
                                    dmtStatusView.setVisibility(8);
                                    l.b(iVar, "");
                                    if (!iVar.b() && !iVar.c()) {
                                        KeyboardUtils.c(this.f62682a.f62681a.f62679a.a(R.id.auc));
                                        AgeGateResponse ageGateResponse = this.f62682a.f62681a.f62680b;
                                        if (ageGateResponse == null || ageGateResponse.getAgeGatePostAction() != 2) {
                                            e activity = this.f62682a.f62681a.f62679a.getActivity();
                                            if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                                                nVar = null;
                                            } else {
                                                nVar = supportFragmentManager.a();
                                            }
                                            g gVar = new g();
                                            gVar.setArguments(this.f62682a.f62681a.f62679a.getArguments());
                                            if (nVar != null) {
                                                nVar.b(R.id.b94, gVar);
                                                nVar.b();
                                            }
                                            q.a(false);
                                        } else {
                                            SmartRoute buildRoute = SmartRouter.buildRoute(this.f62682a.f62681a.f62679a.getActivity(), "//account/deleted");
                                            e activity2 = this.f62682a.f62681a.f62679a.getActivity();
                                            if (activity2 == null || (intent = activity2.getIntent()) == null) {
                                                serializable = null;
                                            } else {
                                                serializable = intent.getSerializableExtra("age_gate_response");
                                            }
                                            buildRoute.withParam("age_gate_response", serializable).open();
                                            e activity3 = this.f62682a.f62681a.f62679a.getActivity();
                                            if (activity3 != null) {
                                                activity3.finish();
                                            }
                                        }
                                    }
                                }
                                return null;
                            }
                        }, i.f4826c, null);
                        return;
                    }
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.f62681a.f62679a.getActivity()).a(R.string.c34).a();
                }
            }, false).a().b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
        // Method dump skipped, instructions count: 223
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.agegate.b.f.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.g8, viewGroup, false);
    }
}
