package com.ss.android.ugc.aweme.profile.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.i;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.bj;
import com.ss.android.ugc.aweme.profile.ui.bl;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Objects;

public final class k extends RecyclerView.a<b> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f115848d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f115849a = n.a(150.0d);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<m> f115850b;

    /* renamed from: c  reason: collision with root package name */
    final androidx.fragment.app.e f115851c;

    static {
        Covode.recordClassIndex(74726);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(74727);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c implements bj.b {
        static {
            Covode.recordClassIndex(74729);
        }

        c() {
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.bj.b
        public final void a(String str) {
            l.d(str, "");
            com.ss.android.ugc.d.a.c.a(new d(3, str));
        }
    }

    public static final class d implements bl.b {
        static {
            Covode.recordClassIndex(74730);
        }

        d() {
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.bl.b
        public final void a(String str) {
            l.d(str, "");
            com.ss.android.ugc.d.a.c.a(new d(2, str));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f115850b.size();
    }

    public static final class e implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f115857a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f115858b;

        static {
            Covode.recordClassIndex(74731);
        }

        public final boolean onPreDraw() {
            this.f115858b.f115856e.getViewTreeObserver().removeOnPreDrawListener(this);
            int height = this.f115858b.f115856e.getHeight();
            if (height < this.f115857a.f115849a) {
                ViewGroup.LayoutParams layoutParams = this.f115858b.f115856e.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.j jVar = (RecyclerView.j) layoutParams;
                jVar.height = this.f115857a.f115849a;
                this.f115858b.f115856e.setLayoutParams(jVar);
                this.f115857a.a(this.f115858b);
                return false;
            } else if (height > this.f115857a.f115849a) {
                this.f115857a.f115849a = height;
                this.f115857a.notifyDataSetChanged();
                return false;
            } else {
                if (height == this.f115857a.f115849a) {
                    this.f115857a.a(this.f115858b);
                    this.f115858b.f115856e.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            }
        }

        e(k kVar, b bVar) {
            this.f115857a = kVar;
            this.f115858b = bVar;
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f115859a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f115860b;

        static {
            Covode.recordClassIndex(74732);
        }

        f(k kVar, int i2) {
            this.f115859a = kVar;
            this.f115860b = i2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.profile.f.n.a(UGCMonitor.TYPE_PHOTO, this.f115859a.f115850b.get(this.f115860b).f115869e);
            com.ss.android.ugc.d.a.c.a(new d(1, ""));
        }
    }

    public static final class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final ImageView f115852a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f115853b;

        /* renamed from: c  reason: collision with root package name */
        public final TextView f115854c;

        /* renamed from: d  reason: collision with root package name */
        public final TuxButton f115855d;

        /* renamed from: e  reason: collision with root package name */
        public final ConstraintLayout f115856e;

        static {
            Covode.recordClassIndex(74728);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            l.d(view, "");
            View findViewById = view.findViewById(R.id.bdy);
            l.b(findViewById, "");
            this.f115852a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.bdz);
            l.b(findViewById2, "");
            this.f115853b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.bdx);
            l.b(findViewById3, "");
            this.f115854c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.bdw);
            l.b(findViewById4, "");
            this.f115855d = (TuxButton) findViewById4;
            View findViewById5 = view.findViewById(R.id.bdv);
            l.b(findViewById5, "");
            this.f115856e = (ConstraintLayout) findViewById5;
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f115861a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f115862b;

        static {
            Covode.recordClassIndex(74733);
        }

        g(k kVar, int i2) {
            this.f115861a = kVar;
            this.f115862b = i2;
        }

        public final void onClick(View view) {
            User user;
            String str;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.profile.f.n.a(StringSet.name, this.f115861a.f115850b.get(this.f115862b).f115869e);
            k kVar = this.f115861a;
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            if (g2 != null) {
                user = g2.getCurUser();
            } else {
                user = null;
            }
            String string = kVar.f115851c.getString(R.string.bko);
            l.b(string, "");
            if (user == null || (str = user.getNickname()) == null) {
                str = "";
            }
            bl a2 = bl.a.a(string, str, "", 30, false);
            a2.setUserVisibleHint(true);
            a2.a(new d());
            i supportFragmentManager = kVar.f115851c.getSupportFragmentManager();
            l.b(supportFragmentManager, "");
            a2.show(supportFragmentManager, "EditNicknameDialog");
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f115863a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f115864b;

        static {
            Covode.recordClassIndex(74734);
        }

        h(k kVar, int i2) {
            this.f115863a = kVar;
            this.f115864b = i2;
        }

        public final void onClick(View view) {
            String str;
            User curUser;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.profile.f.n.a("bio", this.f115863a.f115850b.get(this.f115864b).f115869e);
            k kVar = this.f115863a;
            l.b(view, "");
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            if (g2 == null || (curUser = g2.getCurUser()) == null || (str = curUser.getSignature()) == null) {
                str = "";
            }
            bj a2 = bj.a.a("bio", str);
            a2.setUserVisibleHint(true);
            a2.a(new c());
            i supportFragmentManager = kVar.f115851c.getSupportFragmentManager();
            l.b(supportFragmentManager, "");
            a2.show(supportFragmentManager, "EditNicknameDialog");
        }
    }

    public final void a(b bVar) {
        int bottom = ((bVar.f115855d.getBottom() - bVar.f115854c.getBottom()) - (bVar.f115855d.getBottom() - bVar.f115855d.getTop())) + ((this.f115849a - bVar.f115855d.getBottom()) - n.a(16.0d));
        ViewGroup.LayoutParams layoutParams = bVar.f115855d.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
        aVar.setMargins(0, bottom, 0, n.a(16.0d));
        bVar.f115855d.setLayoutParams(aVar);
    }

    public k(ArrayList<m> arrayList, androidx.fragment.app.e eVar) {
        l.d(arrayList, "");
        l.d(eVar, "");
        this.f115850b = arrayList;
        this.f115851c = eVar;
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(9048);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aos, viewGroup, false);
        l.b(a3, "");
        b bVar = new b(a3);
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = bVar.getClass().getName();
        MethodCollector.o(9048);
        return bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(b bVar, int i2) {
        b bVar2 = bVar;
        l.d(bVar2, "");
        bVar2.f115856e.getViewTreeObserver().addOnPreDrawListener(new e(this, bVar2));
        bVar2.f115852a.setImageResource(this.f115850b.get(i2).f115865a);
        bVar2.f115853b.setText(this.f115850b.get(i2).f115866b);
        bVar2.f115854c.setText(this.f115850b.get(i2).f115867c);
        bVar2.f115855d.setText(this.f115850b.get(i2).f115868d);
        if (this.f115850b.get(i2).f115869e) {
            bVar2.f115855d.setButtonVariant(0);
        } else {
            bVar2.f115855d.setButtonVariant(1);
        }
        int i3 = this.f115850b.get(i2).f115866b;
        if (i3 == R.string.cn1) {
            bVar2.f115855d.setOnClickListener(new f(this, i2));
        } else if (i3 == R.string.cmx) {
            bVar2.f115855d.setOnClickListener(new g(this, i2));
        } else if (i3 == R.string.cmt) {
            bVar2.f115855d.setOnClickListener(new h(this, i2));
        }
    }
}
