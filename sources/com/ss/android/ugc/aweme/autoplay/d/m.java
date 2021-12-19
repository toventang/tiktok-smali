package com.ss.android.ugc.aweme.autoplay.d;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.flowfeed.utils.f;
import com.ss.android.ugc.aweme.flowfeed.utils.g;
import com.ss.android.ugc.playerkit.videoview.k;
import h.f.b.l;
import h.h;
import h.i;

public class m implements d {

    /* renamed from: i  reason: collision with root package name */
    public static final a f67439i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f67440a;

    /* renamed from: b  reason: collision with root package name */
    a f67441b;

    /* renamed from: c  reason: collision with root package name */
    Aweme f67442c;

    /* renamed from: d  reason: collision with root package name */
    public b f67443d;

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView f67444e;

    /* renamed from: f  reason: collision with root package name */
    public final View f67445f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.flowfeed.a.b f67446g;

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.flowfeed.a.a f67447h;

    /* renamed from: j  reason: collision with root package name */
    private final h f67448j;

    /* renamed from: k  reason: collision with root package name */
    private final h f67449k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f67450l;

    static final class c extends h.f.b.m implements h.f.a.a<g> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(41527);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(m mVar) {
            super(0);
            this.this$0 = mVar;
        }

        public static final class a implements f {
            static {
                Covode.recordClassIndex(41528);
            }

            a() {
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            g gVar = new g(this.this$0.f67444e, new a(), this.this$0);
            gVar.f96190g = new com.ss.android.ugc.aweme.autoplay.player.d(this.this$0.f67444e, gVar);
            return gVar;
        }
    }

    static {
        Covode.recordClassIndex(41523);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void B() {
    }

    public g a() {
        return (g) this.f67448j.getValue();
    }

    public final com.ss.android.ugc.aweme.flowfeed.a.a b() {
        return (com.ss.android.ugc.aweme.flowfeed.a.a) this.f67449k.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41524);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final View w() {
        return this.f67444e;
    }

    static final class b extends h.f.b.m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(41525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(m mVar) {
            super(0);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new com.ss.android.ugc.aweme.flowfeed.a.a(this) {
                /* class com.ss.android.ugc.aweme.autoplay.d.m.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f67451a;

                static {
                    Covode.recordClassIndex(41526);
                }

                @Override // com.ss.android.ugc.aweme.flowfeed.a.a
                public final Fragment g() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.flowfeed.a.a
                public final k h() {
                    com.ss.android.ugc.aweme.flowfeed.a.a aVar = this.f67451a.this$0.f67447h;
                    if (aVar != null) {
                        return aVar.h();
                    }
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.flowfeed.a.a
                public final boolean c() {
                    com.ss.android.ugc.aweme.flowfeed.a.a aVar = this.f67451a.this$0.f67447h;
                    if (aVar == null || !aVar.c() || !this.f67451a.this$0.f67440a) {
                        return false;
                    }
                    return true;
                }

                @Override // com.ss.android.ugc.aweme.flowfeed.a.a
                public final String d() {
                    String d2;
                    com.ss.android.ugc.aweme.flowfeed.a.a aVar = this.f67451a.this$0.f67447h;
                    if (aVar == null || (d2 = aVar.d()) == null) {
                        return "";
                    }
                    return d2;
                }

                @Override // com.ss.android.ugc.aweme.flowfeed.a.a
                public final boolean e() {
                    com.ss.android.ugc.aweme.flowfeed.a.a aVar = this.f67451a.this$0.f67447h;
                    if (aVar == null || !aVar.e()) {
                        return false;
                    }
                    return true;
                }

                @Override // com.ss.android.ugc.aweme.flowfeed.a.a
                public final Context f() {
                    Context f2;
                    com.ss.android.ugc.aweme.flowfeed.a.a aVar = this.f67451a.this$0.f67447h;
                    if (aVar != null && (f2 = aVar.f()) != null) {
                        return f2;
                    }
                    Context context = this.f67451a.this$0.f67445f.getContext();
                    l.b(context, "");
                    return context;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f67451a = r1;
                }
            };
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f67452a;

        static {
            Covode.recordClassIndex(41529);
        }

        d(m mVar) {
            this.f67452a = mVar;
        }

        public final void run() {
            this.f67452a.a().i();
        }
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.g.a
    public boolean e() {
        if (!this.f67450l || !this.f67440a) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final boolean m() {
        a aVar = this.f67441b;
        if (aVar != null) {
            return aVar.d();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void A() {
        if (this.f67450l) {
            this.f67440a = false;
        }
        a().g();
        a aVar = this.f67441b;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void x() {
        if (this.f67450l) {
            this.f67440a = true;
        }
        com.ss.android.ugc.aweme.base.utils.m.a(new d(this));
        com.ss.android.ugc.aweme.flowfeed.a.b bVar = this.f67446g;
        if (bVar != null) {
            bVar.a(this.f67442c);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void y() {
        if (this.f67450l) {
            this.f67440a = false;
        }
        a().h();
        a aVar = this.f67441b;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void z() {
        if (this.f67450l) {
            this.f67440a = false;
        }
        a().h();
        a aVar = this.f67441b;
        if (aVar != null) {
            aVar.c();
        }
    }

    public /* synthetic */ m(RecyclerView recyclerView, View view, com.ss.android.ugc.aweme.flowfeed.a.b bVar, com.ss.android.ugc.aweme.flowfeed.a.a aVar) {
        this(recyclerView, view, bVar, aVar, true);
    }

    public m(RecyclerView recyclerView, View view, com.ss.android.ugc.aweme.flowfeed.a.b bVar, com.ss.android.ugc.aweme.flowfeed.a.a aVar, boolean z) {
        l.d(recyclerView, "");
        l.d(view, "");
        this.f67444e = recyclerView;
        this.f67445f = view;
        this.f67446g = bVar;
        this.f67447h = aVar;
        this.f67450l = true;
        this.f67440a = false;
        this.f67448j = i.a((h.f.a.a) new c(this));
        this.f67449k = i.a((h.f.a.a) new b(this));
    }
}
