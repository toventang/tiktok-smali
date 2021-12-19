package com.ss.android.ugc.aweme.specact.popup.b;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.specact.popup.a.i;
import com.ss.android.ugc.aweme.specact.popup.api.SpecActRedPacketApi;
import com.ss.android.ugc.aweme.specact.popup.e.a;
import com.ss.android.ugc.aweme.views.o;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class g extends o {
    static {
        Covode.recordClassIndex(87924);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(final Context context, final i iVar) {
        super(context, R.style.zo, false, true);
        l.d(context, "");
        l.d(iVar, "");
        setContentView(R.layout.b1f);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        setOnKeyListener(AnonymousClass1.f134546a);
        ((SimpleDraweeView) findViewById(R.id.bib)).setImageURI(iVar.f134435e);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.em1);
        l.b(tuxTextView, "");
        tuxTextView.setText(iVar.f134436f);
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.adp);
        l.b(tuxTextView2, "");
        tuxTextView2.setText(iVar.f134437g);
        TuxTextView tuxTextView3 = (TuxTextView) findViewById(R.id.button);
        l.b(tuxTextView3, "");
        tuxTextView3.setText(iVar.f134442l.get(0).f134408a);
        final String str = iVar.f134442l.get(0).f134409b;
        if (str.length() > 0) {
            ((TuxTextView) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.specact.popup.b.g.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f134547a;

                static {
                    Covode.recordClassIndex(87926);
                }

                {
                    this.f134547a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    a.a(context, str);
                    r.a("referral_guid_pop_click", new d().a("position", "feed").a("button_name", "ok").f66730a);
                    SpecActRedPacketApi.a.a(iVar, "False");
                    this.f134547a.dismiss();
                }
            });
        }
        ((TuxIconView) findViewById(R.id.a7k)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.specact.popup.b.g.AnonymousClass3 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f134551a;

            static {
                Covode.recordClassIndex(87927);
            }

            {
                this.f134551a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                r.a("referral_guid_pop_click", new d().a("position", "feed").a("button_name", "close").f66730a);
                SpecActRedPacketApi.a.a(iVar, "True");
                this.f134551a.dismiss();
            }
        });
        r.a("referral_guid_pop_show", new d().a("position", "feed").f66730a);
    }
}
