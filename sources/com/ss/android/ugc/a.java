package com.ss.android.ugc;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ac;
import androidx.recyclerview.widget.s;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.ies.dmt.ui.carousel.HorizontalCarousel;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.IProfileBadgeService;
import com.ss.android.ugc.aweme.ProfileNaviServiceImpl;
import com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.bt;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.MusAvatarWithBorderView;
import com.ss.android.ugc.aweme.setting.bo;
import com.ss.android.ugc.aweme.setting.ck;
import com.ss.android.ugc.aweme.setting.cl;
import com.ss.android.ugc.aweme.setting.p;
import com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage;
import com.ss.android.ugc.aweme.share.o;
import com.ss.android.ugc.aweme.utils.dc;
import com.ss.android.ugc.aweme.utils.hl;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.j.a;
import com.ss.android.ugc.navi.NaviProfileCarouselViewModel;
import com.ss.android.ugc.navi.a;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import h.z;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public final class a extends com.ss.android.ugc.aweme.sharer.ui.i implements o, a.b {

    /* renamed from: l  reason: collision with root package name */
    public static final C1347a f61876l = new C1347a((byte) 0);
    private final String A;
    private final IProfileBadgeService.c B;

    /* renamed from: a  reason: collision with root package name */
    public SmartImageView f61877a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f61878b;

    /* renamed from: c  reason: collision with root package name */
    public TuxButton f61879c;

    /* renamed from: d  reason: collision with root package name */
    public final IProfileBadgeService f61880d;

    /* renamed from: e  reason: collision with root package name */
    public final String f61881e;

    /* renamed from: f  reason: collision with root package name */
    public final User f61882f;

    /* renamed from: j  reason: collision with root package name */
    public final Activity f61883j;

    /* renamed from: k  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.profile.e f61884k;
    private h.f.a.a<z> o;
    private ImageView p;
    private SmartImageView q;
    private boolean r;
    private TextView s;
    private LinearLayout t;
    private Switch u;
    private TuxButton v;
    private View w;
    private View x;
    private HorizontalCarousel y;
    private final User z;

    static {
        Covode.recordClassIndex(38037);
    }

    /* renamed from: com.ss.android.ugc.a$a  reason: collision with other inner class name */
    public static final class C1347a {
        static {
            Covode.recordClassIndex(38038);
        }

        private C1347a() {
        }

        public /* synthetic */ C1347a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.share.o
    public final void b() {
        if (!this.f61883j.isFinishing()) {
            show();
        }
    }

    public final boolean c() {
        UrlModel avatarVideoUri = this.f61882f.getAvatarVideoUri();
        if (avatarVideoUri == null || avatarVideoUri.getUrlList() == null || avatarVideoUri.getUrlList().size() <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.navi.a.b
    public final void d() {
        this.r = false;
        dismiss();
        boolean a2 = com.ss.android.ugc.aweme.compliance.api.a.c().a(4);
        a(!a2);
        if (a2) {
            return;
        }
        if (c()) {
            this.f61884k.b();
        } else {
            this.f61884k.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.i
    public final void dismiss() {
        int i2;
        super.dismiss();
        this.f61880d.b(this.B);
        h.f.a.a<z> aVar = this.o;
        if (aVar != null) {
            aVar.invoke();
        }
        if (this.r) {
            if (this.y != null) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            r.a("cancel_profile_photo", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "personal_homepage").a("enter_method", "click_head").a("exit_method", "click_cancel").a("is_avatar", i2).f66730a);
        }
    }

    public static final class j implements IProfileBadgeService.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f61916a;

        static {
            Covode.recordClassIndex(38049);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(a aVar) {
            this.f61916a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.IProfileBadgeService.c
        public final void a(ProfileBadgeStruct profileBadgeStruct) {
            this.f61916a.a(profileBadgeStruct);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.o
    public final void a(h.f.a.a<z> aVar) {
        h.f.b.l.d(aVar, "");
        this.o = aVar;
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f61913a;

        static {
            Covode.recordClassIndex(38047);
        }

        h(a aVar) {
            this.f61913a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f61913a.f61884k.c();
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f61911a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f61912b;

        static {
            Covode.recordClassIndex(38046);
        }

        g(a aVar, boolean z) {
            this.f61911a = aVar;
            this.f61912b = z;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f61912b) {
                if (this.f61911a.c()) {
                    this.f61911a.f61884k.b();
                } else {
                    this.f61911a.f61884k.a();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.navi.a.b
    public final void a(View view) {
        h.f.b.l.d(view, "");
        this.r = false;
        dismiss();
        ProfileNaviServiceImpl.a().a(this.f61883j, view, "profile_photo_page");
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f61904a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ac f61905b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ HorizontalCarousel f61906c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ NaviProfileCarouselViewModel f61907d;

        static {
            Covode.recordClassIndex(38043);
        }

        e(a aVar, ac acVar, HorizontalCarousel horizontalCarousel, NaviProfileCarouselViewModel naviProfileCarouselViewModel) {
            this.f61904a = aVar;
            this.f61905b = acVar;
            this.f61906c = horizontalCarousel;
            this.f61907d = naviProfileCarouselViewModel;
        }

        /* renamed from: com.ss.android.ugc.a$e$a  reason: collision with other inner class name */
        static final class C1349a extends h.f.b.m implements h.f.a.b<File, z> {
            final /* synthetic */ String $it$inlined;
            final /* synthetic */ int $pos$inlined;
            final /* synthetic */ View $view$inlined;
            final /* synthetic */ e this$0;

            static {
                Covode.recordClassIndex(38044);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1349a(String str, int i2, e eVar, View view) {
                super(1);
                this.$it$inlined = str;
                this.$pos$inlined = i2;
                this.this$0 = eVar;
                this.$view$inlined = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(File file) {
                File file2 = file;
                h.f.b.l.d(file2, "");
                try {
                    ((MusAvatarWithBorderView) this.this$0.f61904a.f61883j.findViewById(R.id.bfb)).setImageURI(Uri.fromFile(file2));
                    this.this$0.f61904a.dismiss();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                this.this$0.f61904a.dismiss();
                return z.f158842a;
            }
        }

        public final void onClick(View view) {
            String a2;
            MethodCollector.i(13528);
            ClickAgent.onClick(view);
            View a3 = this.f61905b.a(this.f61906c.getLayoutManager());
            if (a3 != null) {
                int d2 = HorizontalCarousel.d(a3);
                if (d2 == 0) {
                    this.f61904a.a(a3);
                    MethodCollector.o(13528);
                    return;
                }
                LinkedList<bt> value = this.f61907d.f148625a.getValue();
                if (value != null) {
                    int i2 = d2 - 2;
                    if (value.size() <= i2 || (a2 = value.get(i2).a()) == null) {
                        MethodCollector.o(13528);
                        return;
                    }
                    r.a("set_avatar", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "profile_photo_page").a("enter_method", "edit_head").a("avatar_id", a2).f66730a);
                    ImageView imageView = (ImageView) a3.findViewById(R.id.ctv);
                    if (imageView != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(imageView.getWidth(), imageView.getHeight(), Bitmap.Config.ARGB_8888);
                        h.f.b.l.b(createBitmap, "");
                        imageView.draw(new Canvas(createBitmap));
                        ProfileNaviServiceImpl.a().a(this.f61904a.f61883j, a2, createBitmap, new C1349a(a2, d2, this, a3));
                        MethodCollector.o(13528);
                        return;
                    }
                    MethodCollector.o(13528);
                    return;
                }
            }
            MethodCollector.o(13528);
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f61898a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProfileBadgeStruct f61899b;

        static {
            Covode.recordClassIndex(38040);
        }

        c(a aVar, ProfileBadgeStruct profileBadgeStruct) {
            this.f61898a = aVar;
            this.f61899b = profileBadgeStruct;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("profile_badge_obtain", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f61898a.f61881e).a("badge_id", this.f61899b.getId()).f66730a);
            SmartRouter.buildRoute(this.f61898a.getContext(), bo.a().f122103d).open();
            this.f61898a.dismiss();
        }
    }

    static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f61921a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProfileBadgeStruct f61922b;

        static {
            Covode.recordClassIndex(38054);
        }

        n(a aVar, ProfileBadgeStruct profileBadgeStruct) {
            this.f61921a = aVar;
            this.f61922b = profileBadgeStruct;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("profile_badge_obtain", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f61921a.f61881e).a("badge_id", this.f61922b.getId()).f66730a);
            SmartRouter.buildRoute(this.f61921a.getContext(), cl.a()).open();
            this.f61921a.dismiss();
        }
    }

    private final void a(boolean z2) {
        ImageView imageView = this.p;
        if (imageView != null) {
            com.bytedance.tux.c.a a2 = com.bytedance.tux.c.c.a(new k(z2));
            Context context = getContext();
            h.f.b.l.b(context, "");
            com.bytedance.tux.c.b a3 = a2.a(context);
            com.bytedance.tux.c.e a4 = com.bytedance.tux.c.f.a(new l(z2));
            Context context2 = getContext();
            h.f.b.l.b(context2, "");
            imageView.setImageDrawable(com.bytedance.tux.h.i.a(a3, a4.a(context2)));
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f61896a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProfileBadgeStruct f61897b;

        static {
            Covode.recordClassIndex(38039);
        }

        b(a aVar, ProfileBadgeStruct profileBadgeStruct) {
            this.f61896a = aVar;
            this.f61897b = profileBadgeStruct;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("profile_badge_obtain", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f61896a.f61881e).a("badge_id", this.f61897b.getId()).f66730a);
            com.ss.android.common.util.g gVar = new com.ss.android.common.util.g(p.a());
            gVar.a("lang", LocalServiceImpl.a().a(this.f61896a.getContext()));
            gVar.a("locale", com.ss.android.ugc.aweme.i18n.language.a.b());
            gVar.a("aid", com.bytedance.ies.ugc.appcontext.d.n);
            gVar.a("enter_from", this.f61896a.f61881e);
            SmartRouter.buildRoute(this.f61896a.getContext(), "aweme://webview").withParam("url", gVar.a()).withParam("hide_nav_bar", true).open();
            this.f61896a.dismiss();
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f61914a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProfileBadgeStruct f61915b;

        static {
            Covode.recordClassIndex(38048);
        }

        i(a aVar, ProfileBadgeStruct profileBadgeStruct) {
            this.f61914a = aVar;
            this.f61915b = profileBadgeStruct;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("profile_badge_change", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f61914a.f61881e).a("badge_id", this.f61915b.getId()).f66730a);
            com.ss.android.ugc.aweme.badge.f fVar = new com.ss.android.ugc.aweme.badge.f(this.f61914a.f61882f);
            Activity activity = this.f61914a.f61883j;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            fVar.show(((androidx.fragment.app.e) activity).getSupportFragmentManager(), "EditProfileBadgeDialog");
            this.f61914a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, z> {
        final /* synthetic */ boolean $enable;

        static {
            Covode.recordClassIndex(38050);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(boolean z) {
            super(1);
            this.$enable = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            int i2;
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_pen;
            if (this.$enable) {
                i2 = R.attr.bc;
            } else {
                i2 = R.attr.bd;
            }
            aVar2.f44753e = Integer.valueOf(i2);
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            h.f.b.l.a((Object) system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()));
            return z.f158842a;
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f61900a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HorizontalCarousel f61901b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ NaviProfileCarouselViewModel f61902c;

        static {
            Covode.recordClassIndex(38041);
        }

        d(a aVar, HorizontalCarousel horizontalCarousel, NaviProfileCarouselViewModel naviProfileCarouselViewModel) {
            this.f61900a = aVar;
            this.f61901b = horizontalCarousel;
            this.f61902c = naviProfileCarouselViewModel;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            LinkedList linkedList = (LinkedList) obj;
            if (!com.ss.android.ugc.j.a.a()) {
                AnonymousClass1 r8 = new a.AbstractC4013a(this) {
                    /* class com.ss.android.ugc.a.d.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ d f61903a;

                    static {
                        Covode.recordClassIndex(38042);
                    }

                    @Override // com.ss.android.ugc.j.a.AbstractC4013a
                    public final void a() {
                        RecyclerView.a adapter;
                        RecyclerView.a adapter2 = this.f61903a.f61901b.getAdapter();
                        if (adapter2 != null) {
                            h.f.b.l.b(adapter2, "");
                            if (adapter2.getItemCount() > 0 && (adapter = this.f61903a.f61901b.getAdapter()) != null) {
                                adapter.notifyDataSetChanged();
                            }
                        }
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f61903a = r1;
                    }
                };
                h.f.b.l.d(r8, "");
                com.bytedance.geckox.c b2 = dc.b();
                HashMap hashMap = new HashMap();
                String str = com.ss.android.ugc.j.a.f148527b;
                h.f.b.l.b(str, "");
                List<CheckRequestBodyModel.TargetChannel> asList = Arrays.asList(new CheckRequestBodyModel.TargetChannel(com.ss.android.ugc.j.a.f148526a));
                h.f.b.l.b(asList, "");
                hashMap.put(str, asList);
                b2.a("high_priority", hashMap, new com.bytedance.geckox.f.d(new a.b(r8)));
            }
            if (this.f61901b.getAdapter() != null) {
                RecyclerView.a adapter = this.f61901b.getAdapter();
                if (adapter == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(adapter, "");
                if (adapter.getItemCount() != 2) {
                    RecyclerView.a adapter2 = this.f61901b.getAdapter();
                    if (adapter2 != null) {
                        adapter2.notifyItemRangeChanged(0, linkedList.size() + 2);
                        return;
                    }
                    return;
                }
            }
            this.f61901b.setAdapter(new com.ss.android.ugc.navi.a(this.f61900a.f61883j, this.f61902c.f148625a.getValue(), this.f61900a.f61882f, this.f61900a));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.e, z> {
        final /* synthetic */ boolean $enable;

        static {
            Covode.recordClassIndex(38051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(boolean z) {
            super(1);
            this.$enable = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.e eVar) {
            int i2;
            com.bytedance.tux.c.e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            eVar2.f44776b = Integer.valueOf((int) R.attr.f159902m);
            if (this.$enable) {
                i2 = R.attr.ak;
            } else {
                i2 = R.attr.an;
            }
            eVar2.f44780f = Integer.valueOf(i2);
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            eVar2.f44778d = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 1.0f, system.getDisplayMetrics())));
            Resources system2 = Resources.getSystem();
            h.f.b.l.a((Object) system2, "");
            eVar2.f44782h = h.g.a.a(TypedValue.applyDimension(1, 32.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            h.f.b.l.a((Object) system3, "");
            eVar2.f44781g = h.g.a.a(TypedValue.applyDimension(1, 32.0f, system3.getDisplayMetrics()));
            Resources system4 = Resources.getSystem();
            h.f.b.l.a((Object) system4, "");
            eVar2.f44777c = Float.valueOf(TypedValue.applyDimension(1, 50.0f, system4.getDisplayMetrics()));
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.o
    public final void a(UrlModel urlModel) {
        h.f.b.l.d(urlModel, "");
        v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(urlModel));
        a2.E = this.q;
        a2.a("AvatarEditableShareDialog").c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        if (r0 == null) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct r6) {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.a.a(com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct):void");
    }

    @Override // com.ss.android.ugc.aweme.share.o
    public final void a(String str) {
        h.f.b.l.d(str, "");
        try {
            Uri fromFile = Uri.fromFile(new File(str));
            h.f.b.l.b(fromFile, "");
            if (c()) {
                v a2 = com.bytedance.lighten.a.r.a(fromFile);
                a2.K = true;
                a2.f39907c = true;
                a2.E = this.q;
                a2.a("AvatarEditableShareDialog").c();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.appcompat.app.h, com.ss.android.ugc.aweme.sharer.ui.i, com.google.android.material.bottomsheet.a
    public final void onCreate(Bundle bundle) {
        ProfileBadgeStruct profileBadge;
        TuxButton tuxButton;
        String str;
        TuxButton tuxButton2;
        super.onCreate(bundle);
        this.f61880d.a(this.B);
        this.f61877a = (SmartImageView) findViewById(R.id.dbp);
        this.f61878b = (TextView) findViewById(R.id.dbw);
        this.s = (TextView) findViewById(R.id.dbt);
        this.t = (LinearLayout) findViewById(R.id.dbv);
        this.u = (Switch) findViewById(R.id.dbu);
        this.v = (TuxButton) findViewById(R.id.dbs);
        this.w = findViewById(R.id.dbq);
        this.x = findViewById(R.id.dbr);
        this.y = (HorizontalCarousel) findViewById(R.id.csy);
        this.f61879c = (TuxButton) findViewById(R.id.ctx);
        this.p = (ImageView) findViewById(R.id.dbf);
        this.q = (SmartImageView) findViewById(R.id.dbe);
        HorizontalCarousel horizontalCarousel = this.y;
        if (horizontalCarousel != null && (this.f61883j instanceof ag)) {
            r.a("show_avatar_carousel", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "profile_photo_page").f66730a);
            androidx.lifecycle.ac a2 = new ad((ag) this.f61883j, new ad.d()).a(NaviProfileCarouselViewModel.class);
            h.f.b.l.b(a2, "");
            NaviProfileCarouselViewModel naviProfileCarouselViewModel = (NaviProfileCarouselViewModel) a2;
            naviProfileCarouselViewModel.f148625a.observeForever(new d(this, horizontalCarousel, naviProfileCarouselViewModel));
            s sVar = new s();
            sVar.a(horizontalCarousel);
            TuxButton tuxButton3 = this.f61879c;
            if (tuxButton3 != null) {
                tuxButton3.setOnClickListener(new e(this, sVar, horizontalCarousel, naviProfileCarouselViewModel));
            }
            horizontalCarousel.a(new f(this, sVar, naviProfileCarouselViewModel));
            horizontalCarousel.setAdapter(new com.ss.android.ugc.navi.a(this.f61883j, naviProfileCarouselViewModel.f148625a.getValue(), this.f61882f, this));
            User user = this.f61882f;
            h.f.b.l.d(user, "");
            LinkedList<bt> value = naviProfileCarouselViewModel.f148625a.getValue();
            if (value != null) {
                value.clear();
            }
            naviProfileCarouselViewModel.f148626b = true;
            naviProfileCarouselViewModel.f148627c = 0;
            naviProfileCarouselViewModel.a(user);
        }
        if (com.ss.android.ugc.aweme.account.b.g().isMe(this.f61882f.getUid())) {
            ImageView imageView = this.p;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        } else {
            ImageView imageView2 = this.p;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        if (UserSharePackage.a.a(this.f61882f) && (profileBadge = this.f61882f.getProfileBadge()) != null && !in.d()) {
            h.f.b.l.b(profileBadge, "");
            a(profileBadge);
            User user2 = this.z;
            h.f.b.l.b(user2, "");
            if (h.f.b.l.a((Object) user2.getUid(), (Object) this.f61882f.getUid())) {
                TuxButton tuxButton4 = this.v;
                if (tuxButton4 != null) {
                    tuxButton4.setButtonVariant(1);
                }
                if (bo.a().f122102c == null || !h.f.b.l.a((Object) bo.a().f122102c, (Object) true) || this.f61882f.getProfileBadge() == null) {
                    TextView textView = this.s;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    LinearLayout linearLayout = this.t;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                    TuxButton tuxButton5 = this.v;
                    if (tuxButton5 != null) {
                        tuxButton5.setVisibility(8);
                    }
                    View view = this.w;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    View view2 = this.x;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    Switch r3 = this.u;
                    if (r3 != null) {
                        r3.setOnCheckedChangeListener(null);
                    }
                    Switch r32 = this.u;
                    if (r32 != null) {
                        r32.setChecked(profileBadge.getShouldShow());
                    }
                    Switch r0 = this.u;
                    if (r0 == null || !r0.isChecked()) {
                        SmartImageView smartImageView = this.f61877a;
                        if (smartImageView != null) {
                            smartImageView.setVisibility(8);
                        }
                        TextView textView2 = this.f61878b;
                        if (textView2 != null) {
                            textView2.setVisibility(8);
                        }
                    } else {
                        SmartImageView smartImageView2 = this.f61877a;
                        if (smartImageView2 != null) {
                            smartImageView2.setVisibility(0);
                        }
                        TextView textView3 = this.f61878b;
                        if (textView3 != null) {
                            textView3.setVisibility(0);
                        }
                    }
                    z.a aVar = new z.a();
                    aVar.element = false;
                    Switch r2 = this.u;
                    if (r2 != null) {
                        r2.setOnTouchListener(new m(this, aVar, r2));
                    }
                } else {
                    LinearLayout linearLayout2 = this.t;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(8);
                    }
                    TuxButton tuxButton6 = this.v;
                    if (tuxButton6 != null) {
                        tuxButton6.setVisibility(0);
                    }
                    View view3 = this.w;
                    if (view3 != null) {
                        view3.setVisibility(0);
                    }
                    View view4 = this.x;
                    if (view4 != null) {
                        view4.setVisibility(8);
                    }
                    if (hl.a(bo.a().f122101b) && (tuxButton2 = this.v) != null) {
                        tuxButton2.setText(bo.a().f122101b);
                    }
                    TuxButton tuxButton7 = this.v;
                    if (tuxButton7 != null) {
                        tuxButton7.setOnClickListener(new i(this, profileBadge));
                    }
                }
            } else {
                TuxButton tuxButton8 = this.v;
                if (tuxButton8 != null) {
                    tuxButton8.setButtonVariant(0);
                }
                if (this.f61882f.getProfileBadge() != null) {
                    User user3 = this.z;
                    h.f.b.l.b(user3, "");
                    if (user3.getProfileBadge() != null) {
                        TextView textView4 = this.s;
                        if (textView4 != null) {
                            textView4.setVisibility(0);
                        }
                        LinearLayout linearLayout3 = this.t;
                        if (linearLayout3 != null) {
                            linearLayout3.setVisibility(8);
                        }
                        TuxButton tuxButton9 = this.v;
                        if (tuxButton9 != null) {
                            tuxButton9.setVisibility(8);
                        }
                        View view5 = this.w;
                        if (view5 != null) {
                            view5.setVisibility(0);
                        }
                        View view6 = this.x;
                        if (view6 != null) {
                            view6.setVisibility(0);
                        }
                    } else if (hl.a(bo.a().f122103d)) {
                        TextView textView5 = this.s;
                        if (textView5 != null) {
                            textView5.setVisibility(0);
                        }
                        LinearLayout linearLayout4 = this.t;
                        if (linearLayout4 != null) {
                            linearLayout4.setVisibility(8);
                        }
                        TuxButton tuxButton10 = this.v;
                        if (tuxButton10 != null) {
                            tuxButton10.setVisibility(0);
                        }
                        View view7 = this.w;
                        if (view7 != null) {
                            view7.setVisibility(8);
                        }
                        View view8 = this.x;
                        if (view8 != null) {
                            view8.setVisibility(8);
                        }
                        String str2 = bo.a().f122100a;
                        if (hl.a(str2) && (tuxButton = this.v) != null) {
                            tuxButton.setText(str2);
                        }
                        TuxButton tuxButton11 = this.v;
                        if (tuxButton11 != null) {
                            tuxButton11.setOnClickListener(new c(this, profileBadge));
                        }
                    } else if (hl.a(cl.a())) {
                        TextView textView6 = this.s;
                        if (textView6 != null) {
                            textView6.setVisibility(0);
                        }
                        LinearLayout linearLayout5 = this.t;
                        if (linearLayout5 != null) {
                            linearLayout5.setVisibility(8);
                        }
                        TuxButton tuxButton12 = this.v;
                        if (tuxButton12 != null) {
                            tuxButton12.setVisibility(0);
                        }
                        View view9 = this.w;
                        if (view9 != null) {
                            view9.setVisibility(8);
                        }
                        View view10 = this.x;
                        if (view10 != null) {
                            view10.setVisibility(8);
                        }
                        String a3 = ck.a();
                        if (a3.length() > 0) {
                            TuxButton tuxButton13 = this.v;
                            if (tuxButton13 != null) {
                                tuxButton13.setText(a3);
                            }
                        } else {
                            TuxButton tuxButton14 = this.v;
                            if (tuxButton14 != null) {
                                tuxButton14.setText(getContext().getString(R.string.gk9));
                            }
                        }
                        TuxButton tuxButton15 = this.v;
                        if (tuxButton15 != null) {
                            tuxButton15.setOnClickListener(new n(this, profileBadge));
                        }
                    } else if (p.a().length() > 0) {
                        TextView textView7 = this.s;
                        if (textView7 != null) {
                            textView7.setVisibility(0);
                        }
                        LinearLayout linearLayout6 = this.t;
                        if (linearLayout6 != null) {
                            linearLayout6.setVisibility(8);
                        }
                        TuxButton tuxButton16 = this.v;
                        if (tuxButton16 != null) {
                            tuxButton16.setVisibility(0);
                        }
                        View view11 = this.w;
                        if (view11 != null) {
                            view11.setVisibility(8);
                        }
                        View view12 = this.x;
                        if (view12 != null) {
                            view12.setVisibility(8);
                        }
                        TuxButton tuxButton17 = this.v;
                        if (tuxButton17 != null) {
                            tuxButton17.setOnClickListener(new b(this, profileBadge));
                        }
                    } else {
                        TextView textView8 = this.s;
                        if (textView8 != null) {
                            textView8.setVisibility(0);
                        }
                        LinearLayout linearLayout7 = this.t;
                        if (linearLayout7 != null) {
                            linearLayout7.setVisibility(8);
                        }
                        TuxButton tuxButton18 = this.v;
                        if (tuxButton18 != null) {
                            tuxButton18.setVisibility(8);
                        }
                        View view13 = this.w;
                        if (view13 != null) {
                            view13.setVisibility(0);
                        }
                        View view14 = this.x;
                        if (view14 != null) {
                            view14.setVisibility(0);
                        }
                    }
                } else {
                    TextView textView9 = this.s;
                    if (textView9 != null) {
                        textView9.setVisibility(8);
                    }
                    LinearLayout linearLayout8 = this.t;
                    if (linearLayout8 != null) {
                        linearLayout8.setVisibility(8);
                    }
                    TuxButton tuxButton19 = this.v;
                    if (tuxButton19 != null) {
                        tuxButton19.setVisibility(8);
                    }
                    View view15 = this.w;
                    if (view15 != null) {
                        view15.setVisibility(0);
                    }
                    View view16 = this.x;
                    if (view16 != null) {
                        view16.setVisibility(0);
                    }
                }
            }
            com.ss.android.ugc.aweme.app.f.d a4 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f61881e).a("badge_id", profileBadge.getId());
            User user4 = this.z;
            h.f.b.l.b(user4, "");
            ProfileBadgeStruct profileBadge2 = user4.getProfileBadge();
            if (profileBadge2 == null || !profileBadge2.getShouldShow()) {
                str = "off";
            } else {
                str = "on";
            }
            r.a("profile_badge_setting", a4.a("status", str).f66730a);
        }
        boolean a5 = com.ss.android.ugc.aweme.compliance.api.a.c().a(4);
        a(!a5);
        ImageView imageView3 = this.p;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new g(this, a5));
        }
        SmartImageView smartImageView3 = this.q;
        if (smartImageView3 != null) {
            smartImageView3.setOnClickListener(new h(this));
        }
        if (this.q == null) {
            return;
        }
        if (c()) {
            v a6 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(this.f61882f.getAvatarVideoUri()));
            a6.K = true;
            a6.f39907c = true;
            a6.E = this.q;
            a6.a("AvatarEditableShareDialog").c();
            return;
        }
        v a7 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(com.ss.android.ugc.aweme.utils.u.a(this.f61882f)));
        a7.E = this.q;
        a7.a("AvatarEditableShareDialog").c();
    }

    static final class m implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f61917a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.a f61918b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Switch f61919c;

        static {
            Covode.recordClassIndex(38052);
        }

        m(a aVar, z.a aVar2, Switch r3) {
            this.f61917a = aVar;
            this.f61918b = aVar2;
            this.f61919c = r3;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            h.f.b.l.b(motionEvent, "");
            if (motionEvent.getAction() != 1 || this.f61918b.element) {
                return true;
            }
            this.f61918b.element = true;
            boolean z = !this.f61919c.isChecked();
            this.f61919c.setChecked(z);
            if (this.f61919c.isChecked()) {
                SmartImageView smartImageView = this.f61917a.f61877a;
                if (smartImageView != null) {
                    smartImageView.setVisibility(0);
                }
                TextView textView = this.f61917a.f61878b;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            } else {
                SmartImageView smartImageView2 = this.f61917a.f61877a;
                if (smartImageView2 != null) {
                    smartImageView2.setVisibility(8);
                }
                TextView textView2 = this.f61917a.f61878b;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            }
            this.f61917a.f61880d.a(z, new IProfileBadgeService.b(this) {
                /* class com.ss.android.ugc.a.m.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ m f61920a;

                static {
                    Covode.recordClassIndex(38053);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:3:0x0036, code lost:
                    if (r0 == null) goto L_0x0038;
                 */
                @Override // com.ss.android.ugc.aweme.IProfileBadgeService.b
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void a() {
                    /*
                    // Method dump skipped, instructions count: 126
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.a.m.AnonymousClass1.a():void");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f61920a = r1;
                }

                @Override // com.ss.android.ugc.aweme.IProfileBadgeService.b
                public final void a(ProfileBadgeStruct profileBadgeStruct) {
                    this.f61920a.f61918b.element = false;
                    if (profileBadgeStruct == null) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(this.f61920a.f61917a.getContext()).a(R.string.g4j).a();
                    }
                }
            });
            return true;
        }
    }

    @Override // com.ss.android.ugc.navi.a.b
    public final void a(View view, String str) {
        h.f.b.l.d(view, "");
        h.f.b.l.d(str, "");
        this.r = false;
        r.a("edit_avatar", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "profile_photo_page").a("enter_method", "edit_head").a("avatar_id", str).f66730a);
        dismiss();
        ProfileNaviServiceImpl.a().a(this.f61883j, view, str, "profile_photo_page");
    }

    public static final class f extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f61908a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ac f61909b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ NaviProfileCarouselViewModel f61910c;

        static {
            Covode.recordClassIndex(38045);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            boolean z;
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2);
            View a2 = this.f61909b.a(recyclerView.getLayoutManager());
            if (a2 != null) {
                int d2 = RecyclerView.d(a2);
                TuxButton tuxButton = this.f61908a.f61879c;
                if (tuxButton != null) {
                    if (d2 >= 2 || d2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    tuxButton.setEnabled(z);
                }
                if (d2 == 0) {
                    TuxButton tuxButton2 = this.f61908a.f61879c;
                    if (tuxButton2 != null) {
                        tuxButton2.setText(recyclerView.getContext().getString(R.string.a0t));
                    }
                } else {
                    TuxButton tuxButton3 = this.f61908a.f61879c;
                    if (tuxButton3 != null) {
                        tuxButton3.setText(recyclerView.getContext().getString(R.string.a1q));
                    }
                }
                if (i2 == 0 && d2 != com.ss.android.ugc.navi.b.f148648a) {
                    com.ss.android.ugc.navi.b.f148648a = d2;
                    r.a("swipe_avatar_carousel", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "profile_photo_page").a("enter_method", "edit_head").a("order", d2).f66730a);
                }
            }
            if (!recyclerView.canScrollHorizontally(1)) {
                this.f61910c.a(this.f61908a.f61882f);
            }
        }

        f(a aVar, ac acVar, NaviProfileCarouselViewModel naviProfileCarouselViewModel) {
            this.f61908a = aVar;
            this.f61909b = acVar;
            this.f61910c = naviProfileCarouselViewModel;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(User user, Activity activity, com.ss.android.ugc.aweme.profile.e eVar, com.ss.android.ugc.aweme.sharer.ui.e eVar2) {
        super(activity, R.style.wk, eVar2);
        String str;
        h.f.b.l.d(user, "");
        h.f.b.l.d(activity, "");
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(eVar2, "");
        this.f61882f = user;
        this.f61883j = activity;
        this.f61884k = eVar;
        this.r = true;
        IProfileBadgeService b2 = ProfileBadgeServiceImpl.b();
        h.f.b.l.b(b2, "");
        this.f61880d = b2;
        IAccountUserService e2 = AccountService.a().e();
        h.f.b.l.b(e2, "");
        User curUser = e2.getCurUser();
        this.z = curUser;
        h.f.b.l.b(curUser, "");
        if (h.f.b.l.a((Object) curUser.getUid(), (Object) user.getUid())) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        this.f61881e = str;
        this.A = "ProfileWidgetShareDialog";
        this.B = new j(this);
    }

    public /* synthetic */ a(User user, Activity activity, com.ss.android.ugc.aweme.profile.e eVar, com.ss.android.ugc.aweme.sharer.ui.e eVar2, byte b2) {
        this(user, activity, eVar, eVar2);
    }
}
