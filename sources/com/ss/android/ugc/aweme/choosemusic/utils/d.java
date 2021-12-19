package com.ss.android.ugc.aweme.choosemusic.utils;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.dialog.e.g;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.choosemusic.a.k;
import com.ss.android.ugc.aweme.choosemusic.model.ao;
import com.ss.android.ugc.aweme.choosemusic.view.ad;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class d implements k {

    /* renamed from: g  reason: collision with root package name */
    public static final a f70724g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f70725a;

    /* renamed from: b  reason: collision with root package name */
    public final RelativeLayout f70726b;

    /* renamed from: c  reason: collision with root package name */
    ad f70727c;

    /* renamed from: d  reason: collision with root package name */
    List<ao> f70728d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final Context f70729e;

    /* renamed from: f  reason: collision with root package name */
    public final View f70730f;

    /* renamed from: h  reason: collision with root package name */
    private final LinearLayout f70731h;

    /* renamed from: i  reason: collision with root package name */
    private final TuxTextView f70732i;

    /* renamed from: j  reason: collision with root package name */
    private final ImageView f70733j;

    /* renamed from: k  reason: collision with root package name */
    private h.f.a.a<z> f70734k;

    /* renamed from: l  reason: collision with root package name */
    private Keva f70735l = Keva.getRepo("commercial_music_dialog_repo");

    static {
        Covode.recordClassIndex(43602);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43603);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean a() {
        if (this.f70733j.getVisibility() == 8) {
            return true;
        }
        return false;
    }

    static final class f implements PopupWindow.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f70740a;

        static {
            Covode.recordClassIndex(43609);
        }

        f(d dVar) {
            this.f70740a = dVar;
        }

        public final void onDismiss() {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f70740a.f70725a, "rotation", 180.0f, 0.0f);
            l.b(ofFloat, "");
            ofFloat.setDuration(200L);
            ofFloat.start();
        }
    }

    private final void b() {
        String str;
        int i2;
        String str2;
        User c2 = in.c();
        if (c2 != null) {
            str = c2.getUid();
        } else {
            str = null;
        }
        if (CommerceMediaServiceImpl.f().a() && com.ss.android.ugc.aweme.choosemusic.g.a.a() && a(str)) {
            com.bytedance.tux.dialog.b bVar = (com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(this.f70729e).a(new g(this.f70729e)).b(R.string.gio).a(R.string.gix);
            com.bytedance.tux.dialog.a.d dVar = new com.bytedance.tux.dialog.a.d(this.f70729e);
            dVar.b();
            Resources resources = this.f70729e.getResources();
            if (resources == null || (str2 = resources.getString(R.string.giy)) == null) {
                str2 = "";
            }
            dVar.a(str2);
            dVar.a(new b(this));
            com.bytedance.tux.dialog.b.c.a(bVar.a(dVar), c.f70736a).a().b().show();
            this.f70735l.storeLong(str, System.currentTimeMillis());
        }
        ImageView imageView = this.f70733j;
        if (CommerceMediaServiceImpl.f().b() || CommerceMediaServiceImpl.f().e()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        this.f70733j.setOnClickListener(new View$OnClickListenerC1598d(this));
    }

    public final void a(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f70734k = aVar;
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f70736a = new c();

        static {
            Covode.recordClassIndex(43605);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(R.string.giw, AnonymousClass1.f70737a);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<com.bytedance.tux.dialog.a.a, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(43604);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.a.a aVar) {
            com.bytedance.tux.dialog.a.a aVar2 = aVar;
            l.d(aVar2, "");
            r.a("ttelite_BA_open_music_faq_learn_more_click", new com.ss.android.ugc.aweme.app.f.d().a("is_commercial", 1).f66730a);
            SmartRouter.buildRoute(this.this$0.f70729e, com.ss.android.ugc.aweme.choosemusic.g.c.a()).open();
            aVar2.a().dismiss();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.choosemusic.utils.d$d  reason: collision with other inner class name */
    public static final class View$OnClickListenerC1598d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f70738a;

        static {
            Covode.recordClassIndex(43607);
        }

        View$OnClickListenerC1598d(d dVar) {
            this.f70738a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                r.a("ttelite_BA_open_music_faq_button_click", new com.ss.android.ugc.aweme.app.f.d().a("is_commercial", 1).f66730a);
                SmartRouter.buildRoute(this.f70738a.f70729e, com.ss.android.ugc.aweme.choosemusic.g.c.a()).open();
            }
        }
    }

    private final boolean a(String str) {
        if (str == null) {
            return false;
        }
        long j2 = this.f70735l.getLong(str, -1);
        if (j2 == -1) {
            return true;
        }
        if (j2 == -1 || System.currentTimeMillis() - j2 <= 2592000000L) {
            return false;
        }
        return true;
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f70739a;

        static {
            Covode.recordClassIndex(43608);
        }

        e(d dVar) {
            this.f70739a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            d dVar = this.f70739a;
            RelativeLayout relativeLayout = dVar.f70726b;
            if (dVar.f70727c == null) {
                ad adVar = new ad(dVar.f70729e, dVar);
                adVar.setWidth(i.c(dVar.f70729e));
                dVar.f70728d.add(new ao(false, R.string.adm));
                dVar.f70728d.add(new ao(true, R.string.db0));
                List<ao> list = dVar.f70728d;
                l.d(list, "");
                com.ss.android.ugc.aweme.choosemusic.a.m mVar = adVar.f70795a;
                if (mVar == null) {
                    l.a("mAdapter");
                }
                mVar.b_(list);
                adVar.setOnDismissListener(new f(dVar));
                dVar.f70727c = adVar;
            }
            ad adVar2 = dVar.f70727c;
            if (adVar2 != null) {
                adVar2.showAsDropDown(relativeLayout);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dVar.f70725a, "rotation", 0.0f, 180.0f);
            l.b(ofFloat, "");
            ofFloat.setDuration(200L);
            ofFloat.start();
        }
    }

    public final void a(float f2) {
        if (Float.isNaN(f2)) {
            if (!this.f70731h.isClickable()) {
                this.f70731h.setEnabled(true);
                this.f70731h.setClickable(true);
            }
        } else if (this.f70731h.isClickable()) {
            this.f70731h.setEnabled(false);
            this.f70731h.setClickable(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.a.k
    public final void a(ao aoVar) {
        boolean z;
        l.d(aoVar, "");
        if (!aoVar.f70638a) {
            this.f70732i.setText(R.string.adm);
        } else {
            this.f70732i.setText(R.string.db0);
        }
        ad adVar = this.f70727c;
        if (adVar != null) {
            adVar.dismiss();
        }
        if (CommerceMediaServiceImpl.f().e() != aoVar.f70638a) {
            z = true;
        } else {
            z = false;
        }
        CommerceMediaServiceImpl.f().a(aoVar.f70638a);
        if (z) {
            b();
            h.f.a.a<z> aVar = this.f70734k;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public d(Context context, View view) {
        l.d(context, "");
        l.d(view, "");
        this.f70729e = context;
        this.f70730f = view;
        View findViewById = view.findViewById(R.id.cgv);
        l.b(findViewById, "");
        LinearLayout linearLayout = (LinearLayout) findViewById;
        this.f70731h = linearLayout;
        View findViewById2 = view.findViewById(R.id.f9l);
        l.b(findViewById2, "");
        TuxTextView tuxTextView = (TuxTextView) findViewById2;
        this.f70732i = tuxTextView;
        View findViewById3 = view.findViewById(R.id.c24);
        l.b(findViewById3, "");
        ImageView imageView = (ImageView) findViewById3;
        this.f70725a = imageView;
        View findViewById4 = view.findViewById(R.id.em_);
        l.b(findViewById4, "");
        this.f70726b = (RelativeLayout) findViewById4;
        View findViewById5 = view.findViewById(R.id.bvp);
        l.b(findViewById5, "");
        this.f70733j = (ImageView) findViewById5;
        if (CommerceMediaServiceImpl.f().d()) {
            imageView.setVisibility(0);
            if (CommerceMediaServiceImpl.f().e()) {
                tuxTextView.setText(R.string.db0);
            } else {
                tuxTextView.setText(R.string.adm);
            }
            com.ss.android.ugc.aweme.notification.g.a.a(linearLayout);
            linearLayout.setOnClickListener(new e(this));
        }
        b();
    }
}
