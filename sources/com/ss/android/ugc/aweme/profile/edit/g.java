package com.ss.android.ugc.aweme.profile.edit;

import android.app.Activity;
import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.i18n.musically.cut.j;
import com.ss.android.ugc.aweme.profile.e;
import com.ss.android.ugc.aweme.profile.f.p;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.service.h;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.share.o;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class g implements com.ss.android.ugc.aweme.profile.g {

    /* renamed from: h  reason: collision with root package name */
    public static boolean f116107h;

    /* renamed from: i  reason: collision with root package name */
    public static final b f116108i = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final p f116109a;

    /* renamed from: b  reason: collision with root package name */
    boolean f116110b;

    /* renamed from: c  reason: collision with root package name */
    public final e f116111c;

    /* renamed from: d  reason: collision with root package name */
    public final o f116112d;

    /* renamed from: e  reason: collision with root package name */
    public final Activity f116113e;

    /* renamed from: f  reason: collision with root package name */
    public final AvatarImageView f116114f;

    /* renamed from: g  reason: collision with root package name */
    public User f116115g;

    static {
        Covode.recordClassIndex(74901);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(74903);
        }

        private b() {
        }

        public static boolean a() {
            boolean z = g.f116107h;
            g.f116107h = false;
            return z;
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static final class c implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f116116a;

        static {
            Covode.recordClassIndex(74904);
        }

        @Override // com.ss.android.ugc.aweme.profile.e
        public final void a() {
            p pVar = this.f116116a.f116109a;
            if (pVar != null) {
                pVar.a(0);
            }
        }

        @Override // com.ss.android.ugc.aweme.profile.e
        public final void b() {
            new j().a(this.f116116a.f116113e, new a(this));
        }

        @Override // com.ss.android.ugc.aweme.profile.e
        public final void c() {
            User user = this.f116116a.f116115g;
            if (user != null) {
                h.f116622a.startHeaderDetailActivity(this.f116116a.f116113e, this.f116116a.f116114f, user, false, false);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(g gVar) {
            this.f116116a = gVar;
        }

        static final class a implements j.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f116117a;

            static {
                Covode.recordClassIndex(74905);
            }

            a(c cVar) {
                this.f116117a = cVar;
            }

            @Override // com.ss.android.ugc.aweme.i18n.musically.cut.j.a
            public final void a(String str) {
                o oVar = this.f116117a.f116116a.f116112d;
                if (oVar != null) {
                    l.b(str, "");
                    oVar.a(str);
                }
                g.f116107h = true;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.g
    public final void a() {
        if (!this.f116113e.isFinishing()) {
            o oVar = this.f116112d;
            if (oVar != null) {
                oVar.b();
            }
            this.f116114f.c();
        }
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(74902);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            g gVar = this.this$0;
            gVar.f116110b = true;
            gVar.f116114f.b();
            com.facebook.drawee.h.a controller = gVar.f116114f.getController();
            if (controller != null) {
                l.b(controller, "");
                Animatable i2 = controller.i();
                if (i2 != null && !i2.isRunning()) {
                    i2.start();
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.g
    public final void a(User user) {
        this.f116115g = user;
    }

    @Override // com.ss.android.ugc.aweme.profile.g
    public final void a(UrlModel urlModel) {
        o oVar;
        if (urlModel != null && !this.f116110b && (oVar = this.f116112d) != null) {
            oVar.a(urlModel);
        }
    }

    public g(Activity activity, AvatarImageView avatarImageView, p pVar, User user) {
        l.d(activity, "");
        l.d(avatarImageView, "");
        this.f116113e = activity;
        this.f116114f = avatarImageView;
        this.f116115g = user;
        this.f116109a = pVar;
        c cVar = new c(this);
        this.f116111c = cVar;
        o a2 = ah.f123352a.a(this.f116115g, activity, cVar);
        if (a2 != null) {
            a2.a(new a(this));
        }
        this.f116112d = a2;
    }
}
