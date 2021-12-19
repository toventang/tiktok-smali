package com.ss.android.ugc.aweme.account.login.rememberaccount;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.q;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

public final class c extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: c  reason: collision with root package name */
    public static final b f63652c = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final List<BaseLoginMethod> f63653a;

    /* renamed from: b  reason: collision with root package name */
    public final e f63654b;

    static {
        Covode.recordClassIndex(39247);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(39251);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        public static String a(long j2) {
            Calendar instance = Calendar.getInstance();
            l.b(instance, "");
            long timeInMillis = instance.getTimeInMillis() - j2;
            if (timeInMillis <= 0) {
                return "";
            }
            if (timeInMillis < 86400000) {
                return "0d";
            }
            if (timeInMillis < 604800000) {
                return new StringBuilder().append(timeInMillis / 86400000).append('d').toString();
            }
            return new StringBuilder().append(timeInMillis / 604800000).append('w').toString();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f63653a.size() + 1 + 1;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.c$c  reason: collision with other inner class name */
    public final class C1425c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final SmartAvatarImageView f63659a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f63660b;

        /* renamed from: c  reason: collision with root package name */
        public final TextView f63661c;

        /* renamed from: d  reason: collision with root package name */
        public final View f63662d;

        /* renamed from: e  reason: collision with root package name */
        public final View f63663e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c f63664f;

        static {
            Covode.recordClassIndex(39252);
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.c$c$b */
        static final class b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1425c f63672a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ BaseLoginMethod f63673b;

            static {
                Covode.recordClassIndex(39257);
            }

            b(C1425c cVar, BaseLoginMethod baseLoginMethod) {
                this.f63672a = cVar;
                this.f63673b = baseLoginMethod;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f63672a.f63664f.f63654b.a(this.f63673b, this.f63672a.getAdapterPosition());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.c$c$a */
        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1425c f63665a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ BaseLoginMethod f63666b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ long f63667c;

            static {
                Covode.recordClassIndex(39253);
            }

            a(C1425c cVar, BaseLoginMethod baseLoginMethod, long j2) {
                this.f63665a = cVar;
                this.f63666b = baseLoginMethod;
                this.f63667c = j2;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                final Map<String, String> map = new d().a("user_id", this.f63666b.getUid()).a("last_active", b.a(this.f63667c)).a("platform", a.a(this.f63666b)).a("user_cnt", this.f63665a.f63664f.f63653a.size()).f66730a;
                r.a("login_notify_click_edit", map);
                com.ss.android.ugc.aweme.common.f.a aVar = new com.ss.android.ugc.aweme.common.f.a(this.f63665a.f63663e.getContext());
                String string = this.f63665a.f63663e.getContext().getString(R.string.fj);
                l.b(string, "");
                aVar.a(new String[]{string}, new DialogInterface.OnClickListener(this) {
                    /* class com.ss.android.ugc.aweme.account.login.rememberaccount.c.C1425c.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f63668a;

                    static {
                        Covode.recordClassIndex(39254);
                    }

                    {
                        this.f63668a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        r.a("login_notify_remove_account", map);
                        a.C0731a aVar = new a.C0731a(this.f63668a.f63665a.f63663e.getContext());
                        aVar.a(R.string.fn);
                        aVar.M = false;
                        aVar.b(R.string.fk).b(R.string.fl, (DialogInterface.OnClickListener) AnonymousClass1.f63670a, false).a(R.string.fm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                            /* class com.ss.android.ugc.aweme.account.login.rememberaccount.c.C1425c.a.AnonymousClass1.AnonymousClass2 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass1 f63671a;

                            static {
                                Covode.recordClassIndex(39256);
                            }

                            {
                                this.f63671a = r1;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                if (this.f63671a.f63668a.f63665a.getAdapterPosition() >= 0) {
                                    this.f63671a.f63668a.f63665a.f63664f.f63653a.remove(this.f63671a.f63668a.f63666b);
                                    q.a(this.f63671a.f63668a.f63666b.getUid());
                                    this.f63671a.f63668a.f63665a.f63664f.notifyItemRemoved(this.f63671a.f63668a.f63665a.getAdapterPosition());
                                    r.a("login_notify_remove_account_confirm", map);
                                }
                            }
                        }, false).a().c();
                    }
                });
                aVar.f76416a.b();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1425c(c cVar, View view) {
            super(view);
            l.d(view, "");
            this.f63664f = cVar;
            this.f63663e = view;
            this.f63659a = (SmartAvatarImageView) view.findViewById(R.id.or);
            this.f63660b = (TextView) view.findViewById(R.id.cva);
            this.f63661c = (TextView) view.findViewById(R.id.elg);
            this.f63662d = view.findViewById(R.id.ajp);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        if (i2 == 0) {
            return d.f63674a;
        }
        if (i2 == this.f63653a.size() + 1) {
            return d.f63676c;
        }
        return d.f63675b;
    }

    public c(List<BaseLoginMethod> list, e eVar) {
        l.d(list, "");
        l.d(eVar, "");
        this.f63653a = list;
        this.f63654b = eVar;
    }

    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final View f63655a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f63656b;

        static {
            Covode.recordClassIndex(39248);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, View view) {
            super(view);
            l.d(view, "");
            this.f63656b = cVar;
            this.f63655a = view;
            View findViewById = view.findViewById(R.id.h8);
            l.b(findViewById, "");
            findViewById.setVisibility(0);
            view.findViewById(R.id.h8).setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.account.login.rememberaccount.c.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f63657a;

                static {
                    Covode.recordClassIndex(39249);
                }

                {
                    this.f63657a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f63657a.f63656b.f63654b.a();
                }
            });
            view.findViewById(R.id.a29).setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.account.login.rememberaccount.c.a.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f63658a;

                static {
                    Covode.recordClassIndex(39250);
                }

                {
                    this.f63658a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    SmartRouter.buildRoute(this.f63658a.f63655a.getContext(), "aweme://account_recover").withParam("feedback_id", "6437").withParam("from_type", "").withParam("group", "0").withParam("enter_from", "quick_login").withAnimation(R.anim.dq, R.anim.a1).open();
                }
            });
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x012a  */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r21, int r22) {
        /*
        // Method dump skipped, instructions count: 456
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.rememberaccount.c.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(8496);
        l.d(viewGroup, "");
        if (i2 == d.f63674a) {
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.h6, viewGroup, false);
            l.b(a3, "");
            viewHolder = new f(a3);
        } else if (i2 == d.f63676c) {
            View a4 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.fp, viewGroup, false);
            l.b(a4, "");
            viewHolder = new a(cVar, a4);
        } else {
            View a5 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.gm, viewGroup, false);
            l.b(a5, "");
            viewHolder = new C1425c(cVar, a5);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        MethodCollector.o(8496);
        return viewHolder;
    }
}
