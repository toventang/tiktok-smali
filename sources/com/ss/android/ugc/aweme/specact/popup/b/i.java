package com.ss.android.ugc.aweme.specact.popup.b;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.specact.pendant.h.k;
import com.ss.android.ugc.aweme.specact.popup.api.SpecActRedPacketApi;
import com.ss.android.ugc.aweme.views.o;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.z;

public final class i extends o {
    static {
        Covode.recordClassIndex(87933);
    }

    public static final class a extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f134569a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.d f134570b;

        static {
            Covode.recordClassIndex(87936);
        }

        public final void onFinish() {
            cancel();
        }

        public final void onTick(long j2) {
            TuxTextView tuxTextView = (TuxTextView) this.f134569a.findViewById(R.id.time);
            l.b(tuxTextView, "");
            tuxTextView.setText(i.a(j2 / 1000));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, z.d dVar, long j2) {
            super(j2, 1000);
            this.f134569a = iVar;
            this.f134570b = dVar;
        }
    }

    public static String a(long j2) {
        StringBuilder sb = new StringBuilder();
        long j3 = j2 / 3600;
        long j4 = j2 - (3600 * j3);
        long j5 = j4 / 60;
        long j6 = j4 - (60 * j5);
        if (j3 >= 10) {
            sb.append(j3).append(":");
        } else if (j3 >= 0) {
            sb.append("0".concat(String.valueOf(j3))).append(":");
        }
        if (j5 >= 10) {
            sb.append(j5).append(":");
        } else if (j5 >= 0) {
            sb.append("0".concat(String.valueOf(j5))).append(":");
        }
        if (j6 >= 10) {
            sb.append(j6);
        } else if (j6 >= 0) {
            sb.append("0".concat(String.valueOf(j6)));
        }
        return sb.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(final Context context, final com.ss.android.ugc.aweme.specact.popup.a.i iVar) {
        super(context, R.style.zo, false, true);
        l.d(context, "");
        l.d(iVar, "");
        setContentView(R.layout.b1e);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        ((SimpleDraweeView) findViewById(R.id.bib)).setImageURI(iVar.f134435e);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.adp);
        l.b(tuxTextView, "");
        tuxTextView.setText(iVar.f134437g);
        ((TuxTextView) findViewById(R.id.a83)).a(30.0f);
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.a83);
        l.b(tuxTextView2, "");
        tuxTextView2.setText(iVar.f134441k.get(0).f134405a);
        TuxTextView tuxTextView3 = (TuxTextView) findViewById(R.id.eky);
        l.b(tuxTextView3, "");
        tuxTextView3.setText(iVar.f134441k.get(0).f134406b);
        z.d dVar = new z.d();
        dVar.element = iVar.q - ((long) k.a());
        TuxTextView tuxTextView4 = (TuxTextView) findViewById(R.id.time);
        l.b(tuxTextView4, "");
        tuxTextView4.setText(a(dVar.element));
        final a aVar = new a(this, dVar, dVar.element * 1000);
        aVar.start();
        ((TuxIconView) findViewById(R.id.a7k)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.specact.popup.b.i.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f134561a;

            static {
                Covode.recordClassIndex(87934);
            }

            {
                this.f134561a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                aVar.cancel();
                r.a("limited_invite_pop_click", new d().a("position", "feed").a("button_name", "close").f66730a);
                SpecActRedPacketApi.a.a(iVar, "True");
                this.f134561a.dismiss();
            }
        });
        TuxTextView tuxTextView5 = (TuxTextView) findViewById(R.id.button);
        l.b(tuxTextView5, "");
        tuxTextView5.setText(iVar.f134442l.get(0).f134408a);
        final String str = iVar.f134442l.get(0).f134409b;
        if (str.length() > 0) {
            ((TuxTextView) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.specact.popup.b.i.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ i f134564a;

                static {
                    Covode.recordClassIndex(87935);
                }

                {
                    this.f134564a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    aVar.cancel();
                    com.ss.android.ugc.aweme.specact.popup.e.a.a(context, str);
                    r.a("limited_invite_pop_click", new d().a("position", "feed").a("button_name", "ok").f66730a);
                    SpecActRedPacketApi.a.a(iVar, "False");
                    this.f134564a.dismiss();
                }
            });
        }
        r.a("limited_invite_pop_show", new d().a("position", "feed").f66730a);
    }
}
