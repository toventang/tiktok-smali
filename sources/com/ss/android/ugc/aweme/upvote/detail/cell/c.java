package com.ss.android.ugc.aweme.upvote.detail.cell;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.metrics.v;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.g;
import h.f.b.l;
import h.h;
import h.i;
import java.util.concurrent.TimeUnit;

public final class c implements com.ss.android.ugc.aweme.following.ui.view.a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f142117g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final h f142118a = i.a((h.f.a.a) new C3791c(this));

    /* renamed from: b  reason: collision with root package name */
    User f142119b;

    /* renamed from: c  reason: collision with root package name */
    com.ss.android.ugc.aweme.upvote.event.b f142120c;

    /* renamed from: d  reason: collision with root package name */
    int f142121d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f142122e;

    /* renamed from: f  reason: collision with root package name */
    public final TuxTextView f142123f;

    /* renamed from: h  reason: collision with root package name */
    private final h f142124h = i.a((h.f.a.a) b.f142126a);

    /* renamed from: i  reason: collision with root package name */
    private final m f142125i;

    static {
        Covode.recordClassIndex(92894);
    }

    /* access modifiers changed from: package-private */
    public final f.a.b.a a() {
        return (f.a.b.a) this.f142124h.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(92895);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(Integer num) {
            if (num != null && num.intValue() == 0) {
                return true;
            }
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.a
    public final m getLifeCycleOwner() {
        return this.f142125i;
    }

    static final class b extends h.f.b.m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f142126a = new b();

        static {
            Covode.recordClassIndex(92896);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    static final class d implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f142128a;

        static {
            Covode.recordClassIndex(92899);
        }

        d(c cVar) {
            this.f142128a = cVar;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f142128a.f142123f.setVisibility(8);
            this.f142128a.f142122e = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.a
    public final Context getContext() {
        Context context = this.f142123f.getContext();
        l.b(context, "");
        return context;
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.c$c  reason: collision with other inner class name */
    static final class C3791c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.follow.widet.a> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(92897);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3791c(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.follow.widet.a invoke() {
            com.ss.android.ugc.aweme.follow.widet.a aVar = new com.ss.android.ugc.aweme.follow.widet.a(this.this$0, new a.g());
            aVar.f96288e = new a(this);
            return aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.c$c$a */
        static final class a implements a.c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3791c f142127a;

            static {
                Covode.recordClassIndex(92898);
            }

            a(C3791c cVar) {
                this.f142127a = cVar;
            }

            @Override // com.ss.android.ugc.aweme.follow.widet.a.c
            public final boolean a(int i2) {
                String str;
                int i3;
                String str2;
                if (this.f142127a.this$0.f142122e) {
                    return true;
                }
                c cVar = this.f142127a.this$0;
                cVar.f142122e = true;
                f.a.b.b cG_ = f.a.h.a.a(f.a.e.e.a.d.f157241a).a(3, TimeUnit.SECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new d(cVar)).cG_();
                String str3 = "";
                l.b(cG_, str3);
                f.a.j.a.a(cG_, cVar.a());
                c cVar2 = this.f142127a.this$0;
                v vVar = new v();
                com.ss.android.ugc.aweme.upvote.event.b bVar = cVar2.f142120c;
                if (!(bVar == null || (str2 = bVar.f142221a) == null)) {
                    str3 = str2;
                }
                v a2 = vVar.a(str3);
                u.b a3 = g.a.a(cVar2.f142119b);
                if (a3 != null) {
                    str = a3.getType();
                } else {
                    str = null;
                }
                a2.v = str;
                User user = cVar2.f142119b;
                if (user == null || !user.isPrivateAccount()) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                a2.aa = i3;
                a2.a("sub_page", "recommend_panel").a("rank", cVar2.f142121d + 1).f();
                return false;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.a
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f142123f.setOnClickListener(onClickListener);
    }

    public c(TuxTextView tuxTextView, m mVar) {
        l.d(tuxTextView, "");
        l.d(mVar, "");
        this.f142123f = tuxTextView;
        this.f142125i = mVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.following.ui.view.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r5, int r6) {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.cell.c.a(int, int):void");
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.a
    public final void a(int i2, int i3, String str) {
        a(i2, i3);
    }
}
