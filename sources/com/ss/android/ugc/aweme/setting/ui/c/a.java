package com.ss.android.ugc.aweme.setting.ui.c;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.utils.hp;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class a extends ConstraintLayout implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    /* renamed from: j  reason: collision with root package name */
    public static final C3182a f122881j = new C3182a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    public com.bytedance.tux.sheet.sheet.a f122882g;

    /* renamed from: h  reason: collision with root package name */
    Integer f122883h;

    /* renamed from: i  reason: collision with root package name */
    public b f122884i;

    /* renamed from: k  reason: collision with root package name */
    private Integer f122885k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f122886l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f122887m;
    private TextView n;
    private RadioButton o;
    private RadioButton p;
    private RadioButton q;
    private View r;
    private View s;
    private View t;
    private View u;

    public interface b {
        static {
            Covode.recordClassIndex(80671);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(80668);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.c.a$a  reason: collision with other inner class name */
    public static final class C3182a {
        static {
            Covode.recordClassIndex(80669);
        }

        private C3182a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.ui.c.a$a$a  reason: collision with other inner class name */
        public static final class RunnableC3183a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f122888a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.bytedance.tux.sheet.sheet.a f122889b;

            static {
                Covode.recordClassIndex(80670);
            }

            public RunnableC3183a(e eVar, com.bytedance.tux.sheet.sheet.a aVar) {
                this.f122888a = eVar;
                this.f122889b = aVar;
            }

            public final void run() {
                if (!this.f122888a.isFinishing()) {
                    this.f122888a.getSupportFragmentManager().a().a(this.f122889b, "AccountChangedSheet").c();
                }
            }
        }

        public /* synthetic */ C3182a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        double f2 = (double) (i.f(getContext()) - i.b());
        Double.isNaN(f2);
        double c2 = (double) i.c();
        Double.isNaN(c2);
        double d2 = (f2 * 0.9d) - c2;
        if (d2 > 0.0d) {
            View view = this.u;
            if (view == null) {
                l.a("contentView");
            }
            view.getLayoutParams().height = (int) d2;
            requestLayout();
        }
    }

    static final class c extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ String $primaryString;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(80672);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, String str) {
            super(1);
            this.this$0 = aVar;
            this.$primaryString = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(this.$primaryString, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.setting.ui.c.a.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(80673);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    Integer num;
                    l.d(aVar, "");
                    a aVar2 = this.this$0.this$0;
                    Integer num2 = aVar2.f122883h;
                    if (num2 != null && num2.intValue() == 0) {
                        com.ss.android.ugc.aweme.account.b.i().switchProAccount(0, null, null, 0, new d(aVar2));
                        com.bytedance.tux.sheet.sheet.a aVar3 = aVar2.f122882g;
                        if (aVar3 != null) {
                            aVar3.dismiss();
                        }
                    } else {
                        Integer num3 = aVar2.f122883h;
                        int i2 = 2;
                        if (num3 == null || num3.intValue() != 3) {
                            Integer num4 = aVar2.f122883h;
                            if (num4 != null && num4.intValue() == 2) {
                                i2 = 1;
                            }
                        }
                        SmartRouter.buildRoute(aVar2.getContext(), com.ss.android.ugc.aweme.profile.settings.c.a(i2, "settings")).open();
                    }
                    b bVar = aVar2.f122884i;
                    if (!(bVar == null || (num = aVar2.f122883h) == null)) {
                        bVar.a(num.intValue());
                    }
                    return z.f158842a;
                }
            });
            bVar2.b(R.string.a9e, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, z>) null);
            bVar2.f44820b = true;
            return z.f158842a;
        }
    }

    public final void setAccountType(int i2) {
        if (this.f122885k == null) {
            this.f122885k = Integer.valueOf(i2);
        }
        Integer num = this.f122883h;
        if (num == null || num.intValue() != i2) {
            if (i2 == 2) {
                TextView textView = this.f122886l;
                if (textView == null) {
                    l.a("accountTypeTv");
                }
                textView.setText(R.string.ert);
                TextView textView2 = this.f122887m;
                if (textView2 == null) {
                    l.a("accountHintDetail");
                }
                textView2.setText(R.string.ers);
            } else if (i2 == 3) {
                TextView textView3 = this.f122886l;
                if (textView3 == null) {
                    l.a("accountTypeTv");
                }
                textView3.setText(R.string.erd);
                TextView textView4 = this.f122887m;
                if (textView4 == null) {
                    l.a("accountHintDetail");
                }
                textView4.setText(R.string.erc);
            }
            b(i2);
            this.f122883h = Integer.valueOf(i2);
        }
    }

    public a(Context context) {
        super(context);
        com.a.a(LayoutInflater.from(context), R.layout.az9, this, true);
        findViewById(R.id.bve).setOnClickListener(this);
        View findViewById = findViewById(R.id.dqe);
        l.b(findViewById, "");
        this.u = findViewById;
        View findViewById2 = findViewById(R.id.ev6);
        l.b(findViewById2, "");
        this.f122886l = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.ev5);
        l.b(findViewById3, "");
        this.f122887m = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.y6);
        l.b(findViewById4, "");
        TextView textView = (TextView) findViewById4;
        this.n = textView;
        if (textView == null) {
            l.a("btnConfirm");
        }
        textView.setOnClickListener(this);
        View findViewById5 = findViewById(R.id.ah5);
        l.b(findViewById5, "");
        this.o = (RadioButton) findViewById5;
        View findViewById6 = findViewById(R.id.a0q);
        l.b(findViewById6, "");
        this.p = (RadioButton) findViewById6;
        View findViewById7 = findViewById(R.id.d3s);
        l.b(findViewById7, "");
        this.q = (RadioButton) findViewById7;
        View findViewById8 = findViewById(R.id.a6j);
        l.b(findViewById8, "");
        this.r = findViewById8;
        View findViewById9 = findViewById(R.id.a6g);
        l.b(findViewById9, "");
        this.s = findViewById9;
        View findViewById10 = findViewById(R.id.a6r);
        l.b(findViewById10, "");
        this.t = findViewById10;
        View view = this.r;
        if (view == null) {
            l.a("creatorLayout");
        }
        view.setOnClickListener(this);
        View view2 = this.s;
        if (view2 == null) {
            l.a("businessLayout");
        }
        view2.setOnClickListener(this);
        View view3 = this.t;
        if (view3 == null) {
            l.a("personalLayout");
        }
        view3.setOnClickListener(this);
        ((RadioButton) findViewById(R.id.ah5)).setOnCheckedChangeListener(this);
        ((RadioButton) findViewById(R.id.a0q)).setOnCheckedChangeListener(this);
        ((RadioButton) findViewById(R.id.d3s)).setOnCheckedChangeListener(this);
        Keva repo = Keva.getRepo("keva_repo_qa");
        StringBuilder sb = new StringBuilder("keva_key_red_dot");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        repo.storeBoolean(sb.append(g2.getCurUserId()).toString(), false);
        hp.a.k();
    }

    private final void b(int i2) {
        Integer num = this.f122883h;
        if (num == null || i2 != num.intValue()) {
            this.f122883h = Integer.valueOf(i2);
            if (i2 == 0) {
                RadioButton radioButton = this.o;
                if (radioButton == null) {
                    l.a("creatorAccountRadioButton");
                }
                radioButton.setChecked(false);
                RadioButton radioButton2 = this.p;
                if (radioButton2 == null) {
                    l.a("businessAccountRadioButton");
                }
                radioButton2.setChecked(false);
                RadioButton radioButton3 = this.q;
                if (radioButton3 == null) {
                    l.a("personalAccountRadioButton");
                }
                radioButton3.setChecked(true);
                Resources resources = getResources();
                if (resources != null) {
                    Integer num2 = this.f122885k;
                    if (num2 != null && num2.intValue() == i2) {
                        TextView textView = this.n;
                        if (textView == null) {
                            l.a("btnConfirm");
                        }
                        textView.setText(resources.getString(R.string.erm));
                        return;
                    }
                    TextView textView2 = this.n;
                    if (textView2 == null) {
                        l.a("btnConfirm");
                    }
                    textView2.setText(resources.getString(R.string.err));
                }
            } else if (i2 == 2) {
                RadioButton radioButton4 = this.o;
                if (radioButton4 == null) {
                    l.a("creatorAccountRadioButton");
                }
                radioButton4.setChecked(true);
                RadioButton radioButton5 = this.p;
                if (radioButton5 == null) {
                    l.a("businessAccountRadioButton");
                }
                radioButton5.setChecked(false);
                RadioButton radioButton6 = this.q;
                if (radioButton6 == null) {
                    l.a("personalAccountRadioButton");
                }
                radioButton6.setChecked(false);
                Resources resources2 = getResources();
                if (resources2 != null) {
                    Integer num3 = this.f122885k;
                    if (num3 != null && num3.intValue() == i2) {
                        TextView textView3 = this.n;
                        if (textView3 == null) {
                            l.a("btnConfirm");
                        }
                        textView3.setText(resources2.getString(R.string.erm));
                        return;
                    }
                    TextView textView4 = this.n;
                    if (textView4 == null) {
                        l.a("btnConfirm");
                    }
                    textView4.setText(resources2.getString(R.string.erq));
                }
            } else if (i2 == 3) {
                RadioButton radioButton7 = this.o;
                if (radioButton7 == null) {
                    l.a("creatorAccountRadioButton");
                }
                radioButton7.setChecked(false);
                RadioButton radioButton8 = this.p;
                if (radioButton8 == null) {
                    l.a("businessAccountRadioButton");
                }
                radioButton8.setChecked(true);
                RadioButton radioButton9 = this.q;
                if (radioButton9 == null) {
                    l.a("personalAccountRadioButton");
                }
                radioButton9.setChecked(false);
                Resources resources3 = getResources();
                if (resources3 != null) {
                    Integer num4 = this.f122885k;
                    if (num4 != null && num4.intValue() == i2) {
                        TextView textView5 = this.n;
                        if (textView5 == null) {
                            l.a("btnConfirm");
                        }
                        textView5.setText(resources3.getString(R.string.erm));
                        return;
                    }
                    TextView textView6 = this.n;
                    if (textView6 == null) {
                        l.a("btnConfirm");
                    }
                    textView6.setText(resources3.getString(R.string.erp));
                }
            }
        }
    }

    public final void onClick(View view) {
        String string;
        String string2;
        String string3;
        ClickAgent.onClick(view);
        if (view != null) {
            int id = view.getId();
            if (id == R.id.bve) {
                com.bytedance.tux.sheet.sheet.a aVar = this.f122882g;
                if (aVar != null) {
                    aVar.dismiss();
                }
            } else if (id == R.id.ev6) {
            } else {
                if (id == R.id.a6j) {
                    b(2);
                } else if (id == R.id.a6g) {
                    b(3);
                } else if (id == R.id.a6r) {
                    b(0);
                } else if (id != R.id.y6) {
                } else {
                    if (l.a(this.f122885k, this.f122883h)) {
                        com.bytedance.tux.sheet.sheet.a aVar2 = this.f122882g;
                        if (aVar2 != null) {
                            aVar2.dismiss();
                            return;
                        }
                        return;
                    }
                    Integer num = this.f122883h;
                    if (num != null) {
                        if (num.intValue() == 2) {
                            string = getResources().getString(R.string.erq);
                            l.b(string, "");
                            string2 = getResources().getString(R.string.a2c);
                            l.b(string2, "");
                            string3 = getResources().getString(R.string.gb4);
                            l.b(string3, "");
                        } else if (num.intValue() == 3) {
                            string = getResources().getString(R.string.erp);
                            l.b(string, "");
                            string2 = getResources().getString(R.string.a86);
                            l.b(string2, "");
                            string3 = getResources().getString(R.string.gb4);
                            l.b(string3, "");
                        }
                        Context context = getContext();
                        l.b(context, "");
                        ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.a(com.bytedance.tux.dialog.b.c.a(new com.bytedance.tux.dialog.b(context).b(string).d(string2), new c(this, string3)), false).a(false)).a().b().show();
                    }
                    string = getResources().getString(R.string.err);
                    l.b(string, "");
                    string2 = getResources().getString(R.string.b74);
                    l.b(string2, "");
                    string3 = getResources().getString(R.string.gb7);
                    l.b(string3, "");
                    Context context2 = getContext();
                    l.b(context2, "");
                    ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.a(com.bytedance.tux.dialog.b.c.a(new com.bytedance.tux.dialog.b(context2).b(string).d(string2), new c(this, string3)), false).a(false)).a().b().show();
                }
            }
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z && compoundButton != null) {
            int id = compoundButton.getId();
            if (id == R.id.ah5) {
                b(2);
            } else if (id == R.id.a0q) {
                b(3);
            } else if (id == R.id.d3s) {
                b(0);
            }
        }
    }

    static final class d implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f122890a;

        static {
            Covode.recordClassIndex(80674);
        }

        d(a aVar) {
            this.f122890a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i2 == 14 && i3 == 1) {
                com.ss.android.ugc.aweme.account.b.g().queryUser();
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f122890a.getContext()).a(R.string.gbf).a();
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.setting.d.b());
                return;
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f122890a.getContext()).a(R.string.de9).a();
        }
    }
}
