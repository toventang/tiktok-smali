package com.ss.android.ugc.aweme.im.sdk.share.ui.a;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.im.sdk.share.viewmodel.ShareDialogViewModel;
import com.ss.android.ugc.aweme.im.service.c.k;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final TuxStatusView f103619a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f103620b;

    /* renamed from: c  reason: collision with root package name */
    public final ShareDialogViewModel f103621c;

    static {
        Covode.recordClassIndex(66384);
    }

    public final void a() {
        this.f103619a.setVisibility(8);
    }

    public a(TuxStatusView tuxStatusView, Activity activity, ShareDialogViewModel shareDialogViewModel, m mVar) {
        l.d(tuxStatusView, "");
        l.d(activity, "");
        l.d(shareDialogViewModel, "");
        l.d(mVar, "");
        this.f103619a = tuxStatusView;
        this.f103620b = activity;
        this.f103621c = shareDialogViewModel;
        shareDialogViewModel.f103761c.observe(mVar, new u(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.share.ui.a.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f103622a;

            static {
                Covode.recordClassIndex(66385);
            }

            {
                this.f103622a = r1;
            }

            /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.a.a$1$a  reason: collision with other inner class name */
            static final class C2637a extends h.f.b.m implements b<TuxButton, z> {
                final /* synthetic */ AnonymousClass1 this$0;

                static {
                    Covode.recordClassIndex(66386);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2637a(AnonymousClass1 r2) {
                    super(1);
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(TuxButton tuxButton) {
                    TuxButton tuxButton2 = tuxButton;
                    l.d(tuxButton2, "");
                    tuxButton2.setButtonVariant(0);
                    tuxButton2.setButtonSize(3);
                    tuxButton2.setText(R.string.chc);
                    tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                        /* class com.ss.android.ugc.aweme.im.sdk.share.ui.a.a.AnonymousClass1.C2637a.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ C2637a f103623a;

                        static {
                            Covode.recordClassIndex(66387);
                        }

                        {
                            this.f103623a = r1;
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            this.f103623a.this$0.f103622a.f103621c.f103764f.postValue(true);
                        }
                    });
                    return z.f158842a;
                }
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                View findViewById;
                if (((List) obj).isEmpty()) {
                    Context context = this.f103622a.f103619a.getContext();
                    TuxStatusView.c cVar = new TuxStatusView.c();
                    String string = context.getString(R.string.chb);
                    l.b(string, "");
                    TuxStatusView.c a2 = cVar.a(string);
                    String string2 = context.getString(R.string.cha);
                    l.b(string2, "");
                    TuxStatusView.c a3 = a2.a((CharSequence) string2);
                    a3.f45362j = new C2637a(this);
                    this.f103622a.f103619a.setStatus(a3);
                    if (k.d() && (findViewById = this.f103622a.f103619a.findViewById(R.id.blg)) != null) {
                        findViewById.setVisibility(8);
                    }
                    this.f103622a.f103619a.setVisibility(0);
                    return;
                }
                this.f103622a.a();
            }
        });
        shareDialogViewModel.f103760b.observe(mVar, new u(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.share.ui.a.a.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f103624a;

            static {
                Covode.recordClassIndex(66388);
            }

            {
                this.f103624a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                if (((List) obj).isEmpty()) {
                    if (k.d()) {
                        View findViewById = this.f103624a.f103619a.findViewById(R.id.blg);
                        if (findViewById == null) {
                            View a2 = com.a.a(LayoutInflater.from(this.f103624a.f103620b), R.layout.a7m, this.f103624a.f103619a, false);
                            this.f103624a.f103619a.addView(a2);
                            l.b(a2, "");
                            a2.setVisibility(0);
                        } else {
                            findViewById.setVisibility(0);
                        }
                    } else {
                        Context context = this.f103624a.f103619a.getContext();
                        TuxStatusView.c a3 = new TuxStatusView.c().a(1, 2131232887);
                        String string = context.getString(R.string.chu);
                        l.b(string, "");
                        TuxStatusView.c a4 = a3.a(string);
                        String string2 = context.getString(R.string.cht);
                        l.b(string2, "");
                        this.f103624a.f103619a.setStatus(a4.a((CharSequence) string2));
                    }
                    this.f103624a.f103619a.setVisibility(0);
                    return;
                }
                this.f103624a.a();
            }
        });
    }
}
