package com.ss.android.ugc.aweme.profile.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class r extends RecyclerView.ViewHolder implements u<Boolean> {

    /* renamed from: k  reason: collision with root package name */
    public static final a f115900k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final TextView f115901a;

    /* renamed from: b  reason: collision with root package name */
    public final RemoteImageView f115902b;

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f115903c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f115904d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f115905e;

    /* renamed from: f  reason: collision with root package name */
    public LiveRoomStruct f115906f;

    /* renamed from: g  reason: collision with root package name */
    final com.ss.android.ugc.aweme.profile.d.a f115907g;

    /* renamed from: h  reason: collision with root package name */
    boolean f115908h;

    /* renamed from: i  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.live.e.c f115909i = com.ss.android.ugc.aweme.profile.service.h.f116622a.newLivePlayHelper(new b(this), new c(this));

    /* renamed from: j  reason: collision with root package name */
    public final androidx.fragment.app.e f115910j;

    /* renamed from: l  reason: collision with root package name */
    private f.a.d.f<com.ss.android.ugc.aweme.live.feedpage.d> f115911l;

    static {
        Covode.recordClassIndex(74747);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(74749);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f115913a;

        static {
            Covode.recordClassIndex(74750);
        }

        b(r rVar) {
            this.f115913a = rVar;
        }

        public final void run() {
            this.f115913a.f115901a.setVisibility(0);
            this.f115913a.f115903c.setVisibility(0);
            this.f115913a.f115904d.setVisibility(0);
            this.f115913a.f115902b.setVisibility(8);
            this.f115913a.f115905e.setVisibility(8);
            this.f115913a.f115902b.postDelayed(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.profile.a.r.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f115914a;

                static {
                    Covode.recordClassIndex(74751);
                }

                {
                    this.f115914a = r1;
                }

                public final void run() {
                    this.f115914a.f115913a.f115909i.setMute(true);
                }
            }, 1000);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UrlModel f115923a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f115924b;

        static {
            Covode.recordClassIndex(74759);
        }

        g(UrlModel urlModel, r rVar) {
            this.f115923a = urlModel;
            this.f115924b = rVar;
        }

        public final void run() {
            com.ss.android.ugc.aweme.base.e.a(this.f115924b.f115902b, this.f115923a, this.f115924b.f115902b.getWidth(), this.f115924b.f115902b.getHeight(), com.ss.android.ugc.aweme.profile.service.h.f116622a.newLiveBlurProcessor(5, (((float) this.f115923a.getWidth()) * 1.0f) / ((float) this.f115924b.f115902b.getWidth()), null));
        }
    }

    public final void a() {
        UrlModel urlModel;
        a(new View[]{this.f115901a, this.f115903c, this.f115904d}, h.f115925a);
        a(new View[]{this.f115902b, this.f115905e}, i.f115926a);
        LiveRoomStruct liveRoomStruct = this.f115906f;
        if (liveRoomStruct != null && (urlModel = liveRoomStruct.roomCover) != null) {
            this.f115902b.post(new g(urlModel, this));
        }
    }

    public static final class c implements com.ss.android.ugc.aweme.live.e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f115915a;

        static {
            Covode.recordClassIndex(74752);
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void firstFrame() {
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void onVideoSizeChange(TextureView textureView, int i2, int i3) {
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void playComplete(String str) {
            l.d(str, "");
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void playPrepared(String str) {
            l.d(str, "");
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void playerMediaError(String str) {
            l.d(str, "");
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void playing() {
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void seiUpdate(String str) {
            l.d(str, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(r rVar) {
            this.f115915a = rVar;
        }

        static final class a extends m implements h.f.a.b<View, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f115916a = new a();

            static {
                Covode.recordClassIndex(74753);
            }

            a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(View view) {
                View view2 = view;
                l.d(view2, "");
                view2.setVisibility(0);
                return z.f158842a;
            }
        }

        static final class b extends m implements h.f.a.b<View, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f115917a = new b();

            static {
                Covode.recordClassIndex(74754);
            }

            b() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(View view) {
                View view2 = view;
                l.d(view2, "");
                view2.setVisibility(8);
                return z.f158842a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.a.r$c$c  reason: collision with other inner class name */
        static final class C2960c extends m implements h.f.a.b<View, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final C2960c f115918a = new C2960c();

            static {
                Covode.recordClassIndex(74755);
            }

            C2960c() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(View view) {
                View view2 = view;
                l.d(view2, "");
                view2.setVisibility(8);
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void onPlayerMessage(g.b bVar, Object obj) {
            UrlModel urlModel;
            l.d(bVar, "");
            int i2 = s.f115927a[bVar.ordinal()];
            if (i2 == 1) {
                r.a(new View[]{this.f115915a.f115901a, this.f115915a.f115903c, this.f115915a.f115904d}, a.f115916a);
                r.a(new View[]{this.f115915a.f115902b, this.f115915a.f115905e}, b.f115917a);
            } else if (i2 == 2) {
                r.a(new View[]{this.f115915a.f115901a, this.f115915a.f115903c, this.f115915a.f115904d, this.f115915a.f115905e}, C2960c.f115918a);
                this.f115915a.f115902b.setVisibility(0);
                LiveRoomStruct liveRoomStruct = this.f115915a.f115906f;
                if (liveRoomStruct != null && (urlModel = liveRoomStruct.roomCover) != null) {
                    com.ss.android.ugc.aweme.base.e.a(this.f115915a.f115902b, urlModel, this.f115915a.f115902b.getWidth(), this.f115915a.f115902b.getHeight());
                }
            } else if (i2 == 3) {
                this.f115915a.a();
            }
        }
    }

    static final class d extends m implements h.f.a.b<View, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f115919a = new d();

        static {
            Covode.recordClassIndex(74756);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            View view2 = view;
            l.d(view2, "");
            view2.setVisibility(8);
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.b<View, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f115920a = new e();

        static {
            Covode.recordClassIndex(74757);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            View view2 = view;
            l.d(view2, "");
            view2.setVisibility(0);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends m implements h.f.a.b<View, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f115925a = new h();

        static {
            Covode.recordClassIndex(74760);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            View view2 = view;
            l.d(view2, "");
            view2.setVisibility(8);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends m implements h.f.a.b<View, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f115926a = new i();

        static {
            Covode.recordClassIndex(74761);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            View view2 = view;
            l.d(view2, "");
            view2.setVisibility(0);
            return z.f158842a;
        }
    }

    public static final class f implements f.a.d.f<com.ss.android.ugc.aweme.live.feedpage.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f115921a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveRoomStruct f115922b;

        static {
            Covode.recordClassIndex(74758);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.ss.android.ugc.aweme.live.feedpage.d dVar) {
            com.ss.android.ugc.aweme.live.feedpage.d dVar2 = dVar;
            l.d(dVar2, "");
            String valueOf = String.valueOf(dVar2.f108377a);
            User user = this.f115922b.owner;
            l.b(user, "");
            if (TextUtils.equals(valueOf, user.getUid())) {
                this.f115922b.id = dVar2.f108378b;
                this.f115922b.owner.roomId = this.f115922b.id;
                this.f115921a.f115909i.stop();
                this.f115921a.a();
            }
        }

        f(r rVar, LiveRoomStruct liveRoomStruct) {
            this.f115921a = rVar;
            this.f115922b = liveRoomStruct;
        }
    }

    static void a(LiveRoomStruct liveRoomStruct) {
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("scene_id", "1009").a("enter_from_merge", "others_homepage").a("action_type", "click");
        User user = liveRoomStruct.owner;
        l.b(user, "");
        com.ss.android.ugc.aweme.common.r.a("livesdk_live_show", a2.a("anchor_id", user.getUid()).a("room_id", liveRoomStruct.id).a("request_id", liveRoomStruct.getRequestId()).a("enter_method", "live_cover").f66730a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(Boolean bool) {
        LiveRoomStruct liveRoomStruct = this.f115906f;
        if (liveRoomStruct != null) {
            if (l.a((Object) bool, (Object) true)) {
                this.f115909i.play(true, liveRoomStruct, this.f115903c);
            } else {
                this.f115909i.stop();
                a(new View[]{this.f115901a, this.f115904d}, d.f115919a);
                a(new View[]{this.f115902b}, e.f115920a);
            }
            if (l.a((Object) bool, (Object) true)) {
                a(liveRoomStruct);
            }
            boolean a2 = l.a((Object) bool, (Object) true);
            this.f115908h = a2;
            if (a2) {
                f.a.d.f<com.ss.android.ugc.aweme.live.feedpage.d> fVar = this.f115911l;
                if (fVar == null) {
                    fVar = new f(this, liveRoomStruct);
                }
                this.f115911l = fVar;
            }
        }
    }

    public static void a(View[] viewArr, h.f.a.b<? super View, z> bVar) {
        for (View view : viewArr) {
            bVar.invoke(view);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(View view, androidx.fragment.app.e eVar) {
        super(view);
        l.d(view, "");
        l.d(eVar, "");
        this.f115910j = eVar;
        View findViewById = view.findViewById(R.id.f9s);
        l.b(findViewById, "");
        this.f115901a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.dnr);
        l.b(findViewById2, "");
        this.f115902b = (RemoteImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.b5r);
        l.b(findViewById3, "");
        this.f115903c = (FrameLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.f_m);
        l.b(findViewById4, "");
        this.f115904d = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.b3f);
        l.b(findViewById5, "");
        this.f115905e = (TextView) findViewById5;
        this.f115907g = com.ss.android.ugc.aweme.profile.service.h.f116622a.mainAnimViewModel(eVar);
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.profile.a.r.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r f115912a;

            static {
                Covode.recordClassIndex(74748);
            }

            {
                this.f115912a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                LiveRoomStruct liveRoomStruct = this.f115912a.f115906f;
                if (liveRoomStruct != null) {
                    com.ss.android.ugc.aweme.profile.service.h hVar = com.ss.android.ugc.aweme.profile.service.h.f116622a;
                    l.b(view, "");
                    Context context = view.getContext();
                    l.b(context, "");
                    User user = liveRoomStruct.owner;
                    l.b(user, "");
                    hVar.watchLiveMob(context, user, "others_homepage", "live_cover");
                }
            }
        });
    }
}
