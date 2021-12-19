package com.ss.android.ugc.aweme.friends.invite.v2;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.v;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.k;
import com.ss.android.ugc.aweme.friends.invite.v2.InvitationSharePackage;
import com.ss.android.ugc.aweme.friends.invite.v2.InvitationViewModel;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.share.improve.a;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.lang.ref.WeakReference;
import java.util.Objects;

public final class ThirdPartInvitationItemView implements com.ss.android.ugc.aweme.friends.invite.c {

    /* renamed from: e  reason: collision with root package name */
    public static final h.h f96958e = h.i.a((h.f.a.a) b.f96972a);

    /* renamed from: f  reason: collision with root package name */
    public static final a f96959f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public TuxButton f96960a;

    /* renamed from: b  reason: collision with root package name */
    public View.OnClickListener f96961b;

    /* renamed from: c  reason: collision with root package name */
    public String f96962c = "";

    /* renamed from: d  reason: collision with root package name */
    public final Fragment f96963d;

    /* renamed from: g  reason: collision with root package name */
    private DmtStatusView f96964g;

    /* renamed from: h  reason: collision with root package name */
    private RemoteImageView f96965h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f96966i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f96967j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f96968k = h.i.a((h.f.a.a) new j(this));

    /* renamed from: l  reason: collision with root package name */
    private String f96969l = "general";

    /* renamed from: m  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.inbox.widget.b f96970m;

    public final InvitationViewModel e() {
        return (InvitationViewModel) this.f96968k.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61546);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.invite.c
    public final String b() {
        return this.f96969l;
    }

    static final class j extends m implements h.f.a.a<InvitationViewModel> {
        final /* synthetic */ ThirdPartInvitationItemView this$0;

        static {
            Covode.recordClassIndex(61555);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(ThirdPartInvitationItemView thirdPartInvitationItemView) {
            super(0);
            this.this$0 = thirdPartInvitationItemView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ InvitationViewModel invoke() {
            return InvitationViewModel.a.a(this.this$0.f96963d);
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.invite.c
    public final LiveData<Boolean> c() {
        return e().a();
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f96972a = new b();

        static {
            Covode.recordClassIndex(61547);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (!p.a("BR", com.ss.android.ugc.aweme.language.d.h(), true) && !p.a("BR", com.ss.android.ugc.aweme.language.d.g(), true)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(61544);
    }

    public final androidx.fragment.app.e d() {
        RemoteImageView remoteImageView = this.f96965h;
        if (remoteImageView == null) {
            l.a("ivAvatar");
        }
        Context context = remoteImageView.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (androidx.fragment.app.e) context;
    }

    public final void g() {
        new com.bytedance.tux.g.b(this.f96963d).e(R.string.cmc).b();
    }

    static final class BackCallShareProxy implements au {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<ThirdPartInvitationItemView> f96971a;

        static {
            Covode.recordClassIndex(61545);
        }

        @Override // androidx.lifecycle.k
        public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
            if (aVar == i.a.ON_RESUME) {
                onResume();
            }
        }

        @v(a = i.a.ON_RESUME)
        public final void onResume() {
            ThirdPartInvitationItemView thirdPartInvitationItemView = this.f96971a.get();
            if (thirdPartInvitationItemView != null && thirdPartInvitationItemView.e().f96945c) {
                thirdPartInvitationItemView.e().f96945c = false;
                com.ss.android.ugc.aweme.friends.e.a.a(thirdPartInvitationItemView.f96962c, "click_whatsapp_icon");
                thirdPartInvitationItemView.f();
            }
        }

        public BackCallShareProxy(WeakReference<ThirdPartInvitationItemView> weakReference) {
            l.d(weakReference, "");
            this.f96971a = weakReference;
        }
    }

    public final void f() {
        InvitationViewModel e2 = e();
        k kVar = new k(this.f96963d, new f(this), new g(this));
        l.d(kVar, "");
        if (l.a((Object) e2.a().getValue(), (Object) true)) {
            com.ss.android.ugc.aweme.common.f.c("InvitationViewModel", "requestInviteConfig block by loading");
            return;
        }
        a aVar = e2.f96944b;
        if (aVar == null || !aVar.a()) {
            e2.a().postValue(true);
            com.ss.android.ugc.aweme.common.g.a(InvitationApi.f96912a.getInvitationConfig(""), kVar, new com.ss.android.ugc.aweme.common.h(new InvitationViewModel.g(e2), new InvitationViewModel.h(e2)));
            return;
        }
        kVar.f76454b.invoke(aVar);
    }

    @Override // com.ss.android.ugc.aweme.friends.invite.c
    public final void a() {
        com.ss.android.ugc.aweme.sharer.b bVar = a.C3201a.a("whatsapp", com.bytedance.ies.ugc.appcontext.f.j());
        if (!((Boolean) f96958e.getValue()).booleanValue() || bVar == null || bVar.c() || !bVar.b(com.bytedance.ies.ugc.appcontext.d.a())) {
            this.f96969l = "general";
            RemoteImageView remoteImageView = this.f96965h;
            if (remoteImageView == null) {
                l.a("ivAvatar");
            }
            com.ss.android.ugc.aweme.base.e.a(remoteImageView, 2131232087);
            TuxButton tuxButton = this.f96960a;
            if (tuxButton == null) {
                l.a("button");
            }
            tuxButton.setOnClickListener(new d(this));
        } else {
            this.f96969l = "whatsapp";
            RemoteImageView remoteImageView2 = this.f96965h;
            if (remoteImageView2 == null) {
                l.a("ivAvatar");
            }
            com.ss.android.ugc.aweme.base.e.a(remoteImageView2, (int) R.raw.icon_color_whatsapp_circle);
            TuxButton tuxButton2 = this.f96960a;
            if (tuxButton2 == null) {
                l.a("button");
            }
            tuxButton2.setOnClickListener(new c(this, bVar));
        }
        TuxButton tuxButton3 = this.f96960a;
        if (tuxButton3 == null) {
            l.a("button");
        }
        ViewParent parent = tuxButton3.getParent();
        if (!(parent instanceof View)) {
            parent = null;
        }
        View view = (View) parent;
        if (view != null) {
            view.setOnClickListener(new e(this));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ ThirdPartInvitationItemView this$0;

        static {
            Covode.recordClassIndex(61552);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(ThirdPartInvitationItemView thirdPartInvitationItemView) {
            super(1);
            this.this$0 = thirdPartInvitationItemView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            this.this$0.g();
            return z.f158842a;
        }
    }

    static final class i extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ ThirdPartInvitationItemView this$0;

        static {
            Covode.recordClassIndex(61554);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(ThirdPartInvitationItemView thirdPartInvitationItemView) {
            super(1);
            this.this$0 = thirdPartInvitationItemView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            this.this$0.g();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.invite.c
    public final void a(View.OnClickListener onClickListener) {
        l.d(onClickListener, "");
        this.f96961b = onClickListener;
    }

    @Override // com.ss.android.ugc.aweme.friends.invite.c
    public final void a(String str) {
        l.d(str, "");
        this.f96962c = str;
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ThirdPartInvitationItemView f96976a;

        static {
            Covode.recordClassIndex(61550);
        }

        e(ThirdPartInvitationItemView thirdPartInvitationItemView) {
            this.f96976a = thirdPartInvitationItemView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TuxButton tuxButton = this.f96976a.f96960a;
            if (tuxButton == null) {
                l.a("button");
            }
            tuxButton.performClick();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ThirdPartInvitationItemView f96973a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sharer.b f96974b;

        static {
            Covode.recordClassIndex(61548);
        }

        c(ThirdPartInvitationItemView thirdPartInvitationItemView, com.ss.android.ugc.aweme.sharer.b bVar) {
            this.f96973a = thirdPartInvitationItemView;
            this.f96974b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                View.OnClickListener onClickListener = this.f96973a.f96961b;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                ThirdPartInvitationItemView thirdPartInvitationItemView = this.f96973a;
                com.ss.android.ugc.aweme.sharer.b bVar = this.f96974b;
                thirdPartInvitationItemView.e().a(new k<>(thirdPartInvitationItemView.f96963d, new h(thirdPartInvitationItemView, bVar), new i(thirdPartInvitationItemView)), bVar);
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ThirdPartInvitationItemView f96975a;

        static {
            Covode.recordClassIndex(61549);
        }

        d(ThirdPartInvitationItemView thirdPartInvitationItemView) {
            this.f96975a = thirdPartInvitationItemView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                View.OnClickListener onClickListener = this.f96975a.f96961b;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                com.ss.android.ugc.aweme.friends.e.a.a(this.f96975a.f96962c, "click_general_icon");
                this.f96975a.f();
            }
        }
    }

    static final class h extends m implements h.f.a.b<InvitationViewModel.b, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.sharer.b $channel;
        final /* synthetic */ ThirdPartInvitationItemView this$0;

        static {
            Covode.recordClassIndex(61553);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(ThirdPartInvitationItemView thirdPartInvitationItemView, com.ss.android.ugc.aweme.sharer.b bVar) {
            super(1);
            this.this$0 = thirdPartInvitationItemView;
            this.$channel = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(InvitationViewModel.b bVar) {
            InvitationViewModel.b bVar2 = bVar;
            l.d(bVar2, "");
            com.ss.android.ugc.aweme.friends.e.a.a(this.this$0.f96962c, "whatsapp", "cell", bVar2.f96948a);
            ah.f123352a.a(this.$channel.a(), bVar2.f96949b, this.this$0.d());
            this.this$0.e().f96945c = true;
            return z.f158842a;
        }
    }

    public ThirdPartInvitationItemView(Fragment fragment) {
        l.d(fragment, "");
        this.f96963d = fragment;
        fragment.getLifecycle().a(new BackCallShareProxy(new WeakReference(this)));
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.b<a, z> {
        final /* synthetic */ ThirdPartInvitationItemView this$0;

        static {
            Covode.recordClassIndex(61551);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ThirdPartInvitationItemView thirdPartInvitationItemView) {
            super(1);
            this.this$0 = thirdPartInvitationItemView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            if (aVar2.a()) {
                ThirdPartInvitationItemView thirdPartInvitationItemView = this.this$0;
                String str = aVar2.f96979c;
                if (str == null) {
                    l.b();
                }
                String str2 = aVar2.f96978b;
                if (str2 == null) {
                    l.b();
                }
                String str3 = aVar2.f96977a;
                if (str3 == null) {
                    l.b();
                }
                androidx.fragment.app.e d2 = thirdPartInvitationItemView.d();
                String str4 = thirdPartInvitationItemView.f96962c;
                l.d(d2, "");
                l.d(str2, "");
                l.d(str, "");
                l.d(str3, "");
                l.d(str4, "");
                l.d(str2, "");
                l.d(str, "");
                l.d(str3, "");
                l.d(str4, "");
                SharePackage.a aVar3 = new SharePackage.a();
                String c2 = com.ss.android.ugc.aweme.share.improve.c.b.c(com.ss.android.ugc.aweme.share.improve.c.b.b(com.ss.android.ugc.aweme.share.improve.c.b.a(str)));
                if (c2 == null) {
                    c2 = "";
                }
                InvitationSharePackage invitationSharePackage = new InvitationSharePackage(aVar3.e(c2).a("invite_friends"));
                l.d(str2, "");
                invitationSharePackage.f96941b = str2;
                l.d(str4, "");
                invitationSharePackage.f96940a = str4;
                e.b bVar = new e.b();
                ah.f123352a.a(bVar, (Activity) d2, false);
                bVar.o = false;
                bVar.a(new com.ss.android.ugc.aweme.share.improve.b.b());
                bVar.a("instagram");
                bVar.a("snapchat");
                bVar.a("instagram_story");
                bVar.a(invitationSharePackage);
                bVar.a(new InvitationSharePackage.a.C2338a());
                ShareDependService.a.a().a(d2, bVar.a(), R.style.wk).show();
            } else {
                this.this$0.g();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.invite.c
    public final void a(com.ss.android.ugc.aweme.inbox.widget.b bVar) {
        boolean z;
        l.d(bVar, "");
        if (!l.a(this.f96970m, bVar)) {
            if (bVar.f104374b != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                RemoteImageView remoteImageView = this.f96965h;
                if (remoteImageView == null) {
                    l.a("ivAvatar");
                }
                RemoteImageView remoteImageView2 = this.f96965h;
                if (remoteImageView2 == null) {
                    l.a("ivAvatar");
                }
                ViewGroup.LayoutParams layoutParams = remoteImageView2.getLayoutParams();
                layoutParams.width = bVar.f104374b;
                layoutParams.height = bVar.f104374b;
                remoteImageView.setLayoutParams(layoutParams);
            }
            TextView textView = this.f96966i;
            if (textView == null) {
                l.a("tvTitle");
            }
            if (!(textView instanceof TuxTextView)) {
                textView = null;
            }
            TuxTextView tuxTextView = (TuxTextView) textView;
            if (tuxTextView != null) {
                if (bVar.f104377e != -1) {
                    tuxTextView.setTuxFont(bVar.f104377e);
                }
                if (bVar.f104378f != -1) {
                    tuxTextView.a((float) bVar.f104378f);
                }
            }
            TextView textView2 = this.f96967j;
            if (textView2 == null) {
                l.a("tvContent");
            }
            if (!(textView2 instanceof TuxTextView)) {
                textView2 = null;
            }
            TuxTextView tuxTextView2 = (TuxTextView) textView2;
            if (tuxTextView2 != null) {
                if (bVar.f104379g != -1) {
                    tuxTextView2.setTuxFont(bVar.f104379g);
                }
                if (bVar.f104380h != -1) {
                    tuxTextView2.a((float) bVar.f104380h);
                }
            }
            if (bVar.f104382j != -1) {
                TextView textView3 = this.f96967j;
                if (textView3 == null) {
                    l.a("tvContent");
                }
                if (textView3.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    TextView textView4 = this.f96967j;
                    if (textView4 == null) {
                        l.a("tvContent");
                    }
                    TextView textView5 = this.f96967j;
                    if (textView5 == null) {
                        l.a("tvContent");
                    }
                    ViewGroup.LayoutParams layoutParams2 = textView5.getLayoutParams();
                    Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.topMargin = bVar.f104382j;
                    textView4.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.invite.c
    public final void a(DmtStatusView dmtStatusView, RemoteImageView remoteImageView, TextView textView, TextView textView2, TuxButton tuxButton) {
        l.d(remoteImageView, "");
        l.d(textView, "");
        l.d(textView2, "");
        l.d(tuxButton, "");
        this.f96964g = dmtStatusView;
        this.f96965h = remoteImageView;
        this.f96966i = textView;
        this.f96967j = textView2;
        this.f96960a = tuxButton;
        textView.setText(R.string.cmb);
        textView2.setText(R.string.cma);
        tuxButton.setText(R.string.cm9);
        if (dmtStatusView != null) {
            InvitationViewModel e2 = e();
            Fragment fragment = this.f96963d;
            c cVar = new c(dmtStatusView);
            l.d(fragment, "");
            l.d(cVar, "");
            if (!e2.f96943a) {
                e2.a().observe(fragment, cVar);
                e2.f96943a = true;
            }
        }
    }
}
