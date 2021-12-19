package com.ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.multi.g;
import com.ss.android.ugc.aweme.multi.ui.CommonAnchorItem;
import com.ss.android.ugc.aweme.utils.hl;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public abstract class o extends com.ss.android.ugc.aweme.multi.a {

    /* renamed from: d */
    private final h f110992d = i.a((h.f.a.a) a.f110996a);

    /* renamed from: e */
    private final boolean f110993e;

    /* renamed from: h */
    public AnchorCommonStruct f110994h;

    /* renamed from: i */
    public long f110995i = -1;

    static {
        Covode.recordClassIndex(71218);
    }

    private final Keva n() {
        return (Keva) this.f110992d.getValue();
    }

    public void b(AnchorCommonStruct anchorCommonStruct) {
        l.d(anchorCommonStruct, "");
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public String h() {
        return null;
    }

    public String l() {
        return "webview";
    }

    public boolean m() {
        return false;
    }

    public boolean j() {
        return this.f110993e;
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.a<Keva> {

        /* renamed from: a */
        public static final a f110996a = new a();

        static {
            Covode.recordClassIndex(71219);
        }

        a() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("anchor_offline_record");
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final boolean f() {
        if (this.f110994h == null) {
            return true;
        }
        return false;
    }

    public int k() {
        return ab.NO_TYPE.getTYPE();
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ SmartImageView $imageView;
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(71222);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(o oVar, SmartImageView smartImageView) {
            super(0);
            this.this$0 = oVar;
            this.$imageView = smartImageView;
        }

        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a(new h.f.a.b<AnchorCommonStruct, z>(this) {
                /* class com.ss.android.ugc.aweme.multi.maker.o.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(71223);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.f.a.b
                public final /* synthetic */ z invoke(AnchorCommonStruct anchorCommonStruct) {
                    AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
                    l.d(anchorCommonStruct2, "");
                    v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(anchorCommonStruct2.getIcon()));
                    a2.E = this.this$0.$imageView;
                    a2.c();
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public String g() {
        String keyword;
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        if (anchorCommonStruct == null || (keyword = anchorCommonStruct.getKeyword()) == null) {
            return "";
        }
        return keyword;
    }

    public final Aweme o() {
        return a().b();
    }

    public final String p() {
        return a().c();
    }

    public final String q() {
        return a().d();
    }

    public final Activity r() {
        return a().e();
    }

    public final JSONObject s() {
        return a().f();
    }

    public final d t() {
        d dVar = new d();
        String authorUid = o().getAuthorUid();
        if (authorUid == null) {
            authorUid = "";
        }
        d a2 = dVar.a("author_id", authorUid);
        String aid = o().getAid();
        if (aid == null) {
            aid = "";
        }
        d a3 = a2.a("group_id", aid).a("enter_from", p()).a("anchor_type", b().b()).a("anchor_name", b().c()).a("anchor_id", b().a()).a("music_id", ac.d(o()));
        l.b(a3, "");
        return a3;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<AnchorCommonStruct, z> {
        final /* synthetic */ Dialog $dialog;
        final /* synthetic */ d $eventMapBuilder;
        final /* synthetic */ ViewGroup $parent;
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(71220);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(o oVar, ViewGroup viewGroup, d dVar, Dialog dialog) {
            super(1);
            this.this$0 = oVar;
            this.$parent = viewGroup;
            this.$eventMapBuilder = dVar;
            this.$dialog = dialog;
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ b f110997a;

            /* renamed from: b */
            final /* synthetic */ AnchorCommonStruct f110998b;

            static {
                Covode.recordClassIndex(71221);
            }

            a(b bVar, AnchorCommonStruct anchorCommonStruct) {
                this.f110997a = bVar;
                this.f110998b = anchorCommonStruct;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f110997a.this$0.d(this.f110997a.$eventMapBuilder);
                if (this.f110997a.this$0.m()) {
                    this.f110997a.$dialog.dismiss();
                }
            }
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(AnchorCommonStruct anchorCommonStruct) {
            MethodCollector.i(3640);
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
            String keyword = anchorCommonStruct2.getKeyword();
            if (keyword != null) {
                str = keyword;
            }
            a2.setTitle(str);
            a2.setSubTitle(anchorCommonStruct2.getDescription());
            a2.setOnClickListener(new a(this, anchorCommonStruct2));
            this.$parent.addView(a2);
            z zVar = z.f158842a;
            MethodCollector.o(3640);
            return zVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public void a(SmartImageView smartImageView) {
        l.d(smartImageView, "");
        a(smartImageView, new c(this, smartImageView));
    }

    public final void b(String str) {
        l.d(str, "");
        n().storeBoolean(str + '@' + o().getAid(), true);
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public g a(List<AnchorCommonStruct> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t.getType() == k()) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.size() == 0) {
            return g.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) arrayList2.get(0);
        list.remove(anchorCommonStruct);
        b(anchorCommonStruct);
        a(anchorCommonStruct);
        this.f110994h = anchorCommonStruct;
        if (arrayList2.size() == 1) {
            return g.DONE;
        }
        return g.PROCEED;
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public void c(d dVar) {
        String str = "";
        l.d(dVar, str);
        l.d(dVar, str);
        Aweme o = o();
        String p = p();
        com.ss.android.ugc.aweme.common.r.a("multi_anchor_entrance_click", f(dVar));
        if (j()) {
            d a2 = t().a("enter_method", q()).a("enter_from", p);
            String authorUid = o.getAuthorUid();
            if (authorUid == null) {
                authorUid = str;
            }
            d a3 = a2.a("author_id", authorUid);
            String aid = o.getAid();
            if (aid != null) {
                str = aid;
            }
            com.ss.android.ugc.aweme.common.r.a("anchor_entrance_click", a3.a("group_id", str).a("music_id", ac.d(o)).f66730a);
        }
    }

    public final Map<String, String> f(d dVar) {
        l.d(dVar, "");
        String c2 = a().c();
        Aweme b2 = a().b();
        d a2 = dVar.a("enter_from", c2);
        String authorUid = b2.getAuthorUid();
        if (authorUid == null) {
            authorUid = "";
        }
        d a3 = a2.a("author_id", authorUid);
        String aid = b2.getAid();
        if (aid == null) {
            aid = "";
        }
        Map<String, String> map = a3.a("group_id", aid).a("music_id", ac.d(b2)).f66730a;
        l.b(map, "");
        return map;
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public void b(d dVar) {
        String str = "";
        l.d(dVar, str);
        String c2 = a().c();
        Aweme b2 = a().b();
        d a2 = dVar.a("enter_method", q()).a("enter_from", c2);
        String authorUid = b2.getAuthorUid();
        if (authorUid == null) {
            authorUid = str;
        }
        d a3 = a2.a("author_id", authorUid).a("music_id", ac.d(b2));
        String aid = b2.getAid();
        if (aid == null) {
            aid = str;
        }
        com.ss.android.ugc.aweme.common.r.a("multi_anchor_entrance_show", a3.a("group_id", aid).f66730a);
        if (j()) {
            String c3 = a().c();
            Aweme b3 = a().b();
            d a4 = t().a("enter_from", c3);
            String authorUid2 = b3.getAuthorUid();
            if (authorUid2 == null) {
                authorUid2 = str;
            }
            d a5 = a4.a("author_id", authorUid2).a("music_id", ac.d(b3));
            String aid2 = b3.getAid();
            if (aid2 != null) {
                str = aid2;
            }
            com.ss.android.ugc.aweme.common.r.a("anchor_entrance_show", a5.a("group_id", str).f66730a);
        }
    }

    public final void a(h.f.a.b<? super AnchorCommonStruct, z> bVar) {
        l.d(bVar, "");
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        if (anchorCommonStruct != null) {
            bVar.invoke(anchorCommonStruct);
        }
    }

    public final boolean a(String str) {
        l.d(str, "");
        return n().getBoolean(str + '@' + o().getAid(), false);
    }

    protected static d a(d dVar, JSONObject jSONObject) {
        l.d(dVar, "");
        l.d(jSONObject, "");
        Iterator<String> keys = jSONObject.keys();
        l.b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next, "");
            if (hl.a(optString)) {
                dVar.a(next, optString);
            }
        }
        return dVar;
    }

    public final void a(SmartImageView smartImageView, h.f.a.a<z> aVar) {
        UrlModel newStyleBubbleIcon;
        l.d(smartImageView, "");
        l.d(aVar, "");
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        if (anchorCommonStruct == null || (newStyleBubbleIcon = anchorCommonStruct.getNewStyleBubbleIcon()) == null || !this.f110876b) {
            aVar.invoke();
            return;
        }
        v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(newStyleBubbleIcon));
        a2.E = smartImageView;
        a2.c();
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public void b(ViewGroup viewGroup, Dialog dialog, d dVar) {
        l.d(viewGroup, "");
        l.d(dialog, "");
        l.d(dVar, "");
        a(new b(this, viewGroup, dVar, dialog));
    }

    public final void a(d dVar, boolean z, boolean z2) {
        String str;
        String str2 = "";
        l.d(dVar, str2);
        String c2 = a().c();
        Aweme b2 = a().b();
        String str3 = null;
        if (z) {
            d a2 = new d().a("enter_method", q()).a(new HashMap<>(dVar.f66730a)).a("enter_from", c2);
            AnchorCommonStruct anchorCommonStruct = this.f110994h;
            if (anchorCommonStruct != null) {
                str = anchorCommonStruct.getKeyword();
            } else {
                str = null;
            }
            d a3 = a2.a("anchor_entry", str);
            String authorUid = b2.getAuthorUid();
            if (authorUid == null) {
                authorUid = str2;
            }
            d a4 = a3.a("author_id", authorUid);
            String aid = b2.getAid();
            if (aid == null) {
                aid = str2;
            }
            com.ss.android.ugc.aweme.common.r.a("enter_multi_anchor_detail", a4.a("group_id", aid).a("click_type", l()).a("music_id", ac.d(b2)).f66730a);
        }
        if (j() && z && z2) {
            String c3 = a().c();
            Aweme b3 = a().b();
            d a5 = t().a("enter_from", c3);
            AnchorCommonStruct anchorCommonStruct2 = this.f110994h;
            if (anchorCommonStruct2 != null) {
                str3 = anchorCommonStruct2.getKeyword();
            }
            d a6 = a5.a("anchor_entry", str3);
            String authorUid2 = b3.getAuthorUid();
            if (authorUid2 == null) {
                authorUid2 = str2;
            }
            d a7 = a6.a("author_id", authorUid2);
            String aid2 = b3.getAid();
            if (aid2 != null) {
                str2 = aid2;
            }
            com.ss.android.ugc.aweme.common.r.a("enter_anchor_detail", a7.a("group_id", str2).a("music_id", ac.d(b3)).f66730a);
        }
    }

    public static /* synthetic */ void a(o oVar, d dVar, boolean z, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        oVar.a(dVar, z, z2);
    }
}
