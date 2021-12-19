package com.ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.plugin.a.a;
import com.bytedance.ies.ugc.aweme.plugin.a.c;
import com.bytedance.ies.ugc.aweme.plugin.a.d;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.multi.g;
import com.ss.android.ugc.aweme.multi.ui.CommonAnchorItem;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.poi_api.service.c;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class i extends o {

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.poi_api.service.a f110959d;

    /* renamed from: e  reason: collision with root package name */
    public final String f110960e;

    /* renamed from: f  reason: collision with root package name */
    private final c f110961f;

    static {
        Covode.recordClassIndex(71196);
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final com.ss.android.ugc.aweme.multi.c i() {
        return new i();
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final int k() {
        return ab.POI.getTYPE();
    }

    private final String n() {
        String q = q();
        if (!hl.a(q) || q == null) {
            return this.f110960e;
        }
        return q;
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final String h() {
        com.ss.android.ugc.aweme.poi_api.service.a aVar = this.f110959d;
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public i() {
        com.ss.android.ugc.aweme.poi_api.service.a aVar;
        IPoiService a2;
        c cVar = c.f115540d;
        this.f110961f = cVar;
        if (cVar == null || (a2 = c.a()) == null) {
            aVar = null;
        } else {
            aVar = a2.a();
        }
        this.f110959d = aVar;
        this.f110960e = "video_anchor";
    }

    static final class a extends m implements b<AnchorCommonStruct, z> {
        final /* synthetic */ Dialog $dialog;
        final /* synthetic */ d $eventMapBuilder;
        final /* synthetic */ ViewGroup $parent;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(71197);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, ViewGroup viewGroup, d dVar, Dialog dialog) {
            super(1);
            this.this$0 = iVar;
            this.$parent = viewGroup;
            this.$eventMapBuilder = dVar;
            this.$dialog = dialog;
        }

        /* renamed from: com.ss.android.ugc.aweme.multi.maker.i$a$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC2839a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f110962a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AnchorCommonStruct f110963b;

            static {
                Covode.recordClassIndex(71198);
            }

            View$OnClickListenerC2839a(a aVar, AnchorCommonStruct anchorCommonStruct) {
                this.f110962a = aVar;
                this.f110963b = anchorCommonStruct;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f110962a.this$0.d(this.f110962a.$eventMapBuilder);
                if (this.f110962a.this$0.m()) {
                    this.f110962a.$dialog.dismiss();
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(AnchorCommonStruct anchorCommonStruct) {
            MethodCollector.i(3941);
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            String str = "";
            l.d(anchorCommonStruct2, str);
            Context context = this.$parent.getContext();
            l.b(context, str);
            CommonAnchorItem a2 = CommonAnchorItem.a.a(context);
            UrlModel thumbnail = anchorCommonStruct2.getThumbnail();
            if (thumbnail != null) {
                a2.setIcon(thumbnail);
            }
            com.ss.android.ugc.aweme.poi_api.service.a aVar = this.this$0.f110959d;
            if (aVar != null) {
                Context context2 = a2.getContext();
                l.b(context2, str);
                String a3 = aVar.a(context2);
                if (a3 != null) {
                    str = a3;
                }
            }
            a2.setTitle(str);
            a2.setSubTitle(anchorCommonStruct2.getDescription());
            a2.setOnClickListener(new View$OnClickListenerC2839a(this, anchorCommonStruct2));
            this.$parent.addView(a2);
            z zVar = z.f158842a;
            MethodCollector.o(3941);
            return zVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final g a(List<AnchorCommonStruct> list) {
        l.d(list, "");
        com.ss.android.ugc.aweme.poi_api.service.a aVar = this.f110959d;
        if (aVar == null || !aVar.a()) {
            return g.NOT_FOUND;
        }
        return super.a(list);
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void c(d dVar) {
        l.d(dVar, "");
        com.ss.android.ugc.aweme.poi_api.service.a aVar = this.f110959d;
        if (aVar != null) {
            aVar.b(o(), n(), p());
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.a
    public final void a(com.ss.android.ugc.aweme.multi.b bVar) {
        l.d(bVar, "");
        super.a(bVar);
        com.ss.android.ugc.aweme.poi_api.service.a aVar = this.f110959d;
        if (aVar != null) {
            aVar.a(bVar.b());
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void b(d dVar) {
        l.d(dVar, "");
        com.ss.android.ugc.aweme.poi_api.service.a aVar = this.f110959d;
        if (aVar != null) {
            aVar.a(o(), n(), p());
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final void d(d dVar) {
        com.ss.android.ugc.aweme.poi_api.service.a aVar;
        IPoiService a2;
        l.d(dVar, "");
        if (this.f110961f != null && c.b()) {
            if (this.f110961f == null || (a2 = c.a()) == null) {
                aVar = null;
            } else {
                aVar = a2.a();
            }
            aVar.a(a().e(), o(), this.f110960e, p());
        } else if (this.f110961f != null) {
            Activity e2 = a().e();
            Aweme o = o();
            String str = this.f110960e;
            String p = p();
            l.d(e2, "");
            l.d(o, "");
            l.d(str, "");
            l.d(p, "");
            l.d("VIDEO_ANCHOR", "");
            if (!c.b() && com.ss.android.ugc.aweme.poi_api.a.a.a().f115530a) {
                c.a aVar2 = new c.a();
                aVar2.f35089a = "com.ss.android.ugc.aweme.poi";
                aVar2.f35091c = false;
                aVar2.f35093e = com.ss.android.ugc.aweme.poi_api.service.c.f115539c;
                a.C0790a a3 = new a.C0790a().a(0);
                a3.f35065a = false;
                a3.f35074j = com.ss.android.ugc.aweme.poi_api.service.c.f115538b;
                a3.f35071g = com.bytedance.ies.ugc.aweme.plugin.b.b.REPLACE;
                aVar2.f35094f = a3.a();
                aVar2.f35092d = new c.a("VIDEO_ANCHOR", e2, o, str, p);
                d.a aVar3 = new d.a();
                aVar3.f35107b = e2.getString(R.string.cz8);
                aVar3.f35108c = e2.getString(R.string.cz9);
                aVar2.f35096h = aVar3.a();
                com.ss.android.ugc.aweme.poi_api.service.c.f115537a.a(aVar2.a());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void b(ViewGroup viewGroup, Dialog dialog, com.ss.android.ugc.aweme.app.f.d dVar) {
        l.d(viewGroup, "");
        l.d(dialog, "");
        l.d(dVar, "");
        a(new a(this, viewGroup, dVar, dialog));
    }
}
