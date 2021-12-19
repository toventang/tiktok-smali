package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.b.a;
import com.ss.android.ugc.aweme.sharer.ui.bar.MicroShareChannelBar;
import com.ss.android.ugc.aweme.sharer.ui.bar.f;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.ss.android.ugc.aweme.views.i;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.h;
import h.z;
import java.util.List;

public class m extends d {
    public RecyclerView n;
    public final Activity o;
    private final h p;
    private final Aweme q;

    static {
        Covode.recordClassIndex(81473);
    }

    /* access modifiers changed from: package-private */
    public final i h() {
        return (i) this.p.getValue();
    }

    static final class a extends h.f.b.m implements h.f.a.a<i> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(81474);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m mVar) {
            super(0);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ i invoke() {
            return new i(this.this$0.o);
        }
    }

    public final void i() {
        try {
            h().dismiss();
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        }
    }

    public static final class c implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f124081a;

        static {
            Covode.recordClassIndex(81476);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(m mVar) {
            this.f124081a = mVar;
        }

        static final class a extends h.f.b.m implements h.f.a.b<Boolean, z> {
            final /* synthetic */ com.ss.android.ugc.aweme.sharer.b $channel;
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(81477);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar, com.ss.android.ugc.aweme.sharer.b bVar) {
                super(1);
                this.this$0 = cVar;
                this.$channel = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Boolean bool) {
                boolean booleanValue = bool.booleanValue();
                com.ss.android.ugc.aweme.sharer.ui.f fVar = this.this$0.f124081a.f123433j.f124660l;
                if (fVar != null) {
                    fVar.a(this.$channel, booleanValue, this.this$0.f124081a.f123433j.f124657i, this.this$0.f124081a.o);
                }
                if (com.ss.android.ugc.aweme.sharer.ui.a.a.a()) {
                    this.this$0.f124081a.i();
                }
                if (!this.$channel.c()) {
                    this.this$0.f124081a.dismiss();
                }
                return z.f158842a;
            }
        }

        static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.sharer.h, z> {
            final /* synthetic */ com.ss.android.ugc.aweme.sharer.b $channel;
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(81478);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(c cVar, com.ss.android.ugc.aweme.sharer.b bVar) {
                super(1);
                this.this$0 = cVar;
                this.$channel = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.sharer.h hVar) {
                com.ss.android.ugc.aweme.sharer.h hVar2 = hVar;
                l.d(hVar2, "");
                boolean a2 = this.$channel.a(hVar2, this.this$0.f124081a.o);
                com.ss.android.ugc.aweme.sharer.ui.f fVar = this.this$0.f124081a.f123433j.f124660l;
                if (fVar != null) {
                    fVar.a(this.$channel, a2, this.this$0.f124081a.f123433j.f124657i, this.this$0.f124081a.o);
                }
                if (com.ss.android.ugc.aweme.sharer.ui.a.a.a()) {
                    this.this$0.f124081a.i();
                }
                if (!this.$channel.c()) {
                    this.this$0.f124081a.dismiss();
                }
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.bar.f
        public final void a_(com.ss.android.ugc.aweme.sharer.b bVar) {
            l.d(bVar, "");
            if (com.ss.android.ugc.aweme.sharer.ui.a.a.a()) {
                try {
                    this.f124081a.h().show();
                } catch (NullPointerException e2) {
                    e2.printStackTrace();
                }
            }
            this.f124081a.f123433j.f124657i.f124595i.putString("enter_from", "publish_share_panel");
            this.f124081a.f123433j.f124657i.f124595i.putString("enter_method", "publish_then_share");
            if (!this.f124081a.f123433j.f124657i.a(bVar, this.f124081a.o, new a(this, bVar))) {
                this.f124081a.f123433j.f124657i.a(bVar, new b(this, bVar));
            }
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.sharer.b, Boolean> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(81475);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(m mVar) {
            super(1);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.sharer.b bVar) {
            com.ss.android.ugc.aweme.sharer.b bVar2 = bVar;
            l.d(bVar2, "");
            return Boolean.valueOf(!bVar2.b(this.this$0.o));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(Activity activity, e eVar, Aweme aweme) {
        super(activity, eVar);
        l.d(activity, "");
        l.d(eVar, "");
        l.d(aweme, "");
        this.o = activity;
        this.q = aweme;
        if (this.f123433j.f124652d) {
            n.a((List) this.f123433j.f124649a, (h.f.a.b) new b(this));
        }
        RecyclerView recyclerView = (RecyclerView) this.f123424a.findViewById(R.id.bqt);
        this.n = recyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        MicroShareChannelBar microShareChannelBar = this.f123435l;
        List<com.ss.android.ugc.aweme.sharer.b> list = this.f123433j.f124649a;
        l.d(list, "");
        microShareChannelBar.f124611a = list;
        microShareChannelBar.f124613c.a(list);
        MicroShareChannelBar microShareChannelBar2 = this.f123435l;
        c cVar = new c(this);
        l.d(cVar, "");
        microShareChannelBar2.f124612b = cVar;
        a.C3194a.a("ug_publish_popup_share_show", aweme, null);
        this.p = h.i.a((h.f.a.a) new a(this));
    }
}
