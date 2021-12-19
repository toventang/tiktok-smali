package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.f;
import com.ss.android.ugc.aweme.commercialize.b.d;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.WikipediaExtra;
import com.ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.g;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.i;
import com.ss.android.ugc.aweme.sticker.j;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class r extends a {

    /* renamed from: a  reason: collision with root package name */
    private final g f130635a;

    /* renamed from: l  reason: collision with root package name */
    private final h f130636l;

    /* renamed from: m  reason: collision with root package name */
    private d f130637m;

    static {
        Covode.recordClassIndex(85655);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e
    public final int b() {
        return 5;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d
    public final void h() {
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(85657);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(r rVar) {
            super(0);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.aweme.sticker.k.b bVar;
            j jVar = this.this$0.f130438k;
            if (!(jVar == null || (bVar = jVar.q) == null)) {
                bVar.a();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d
    public final View a() {
        return (FrameLayout) this.f130636l.getValue();
    }

    static final class c extends m implements h.f.a.a<FrameLayout> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(85658);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FrameLayout invoke() {
            MethodCollector.i(1579);
            FrameLayout frameLayout = new FrameLayout(this.$context);
            frameLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            MethodCollector.o(1579);
            return frameLayout;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void d() {
        String str;
        String str2;
        String str3;
        i iVar;
        i iVar2;
        i iVar3;
        LogPbBean logPbBean = new LogPbBean();
        j jVar = this.f130438k;
        if (jVar == null || (str = jVar.f134931l) == null) {
            str = "";
        }
        logPbBean.setImprId(str);
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        j jVar2 = this.f130438k;
        String str4 = null;
        if (jVar2 == null || (iVar3 = jVar2.r) == null) {
            str2 = null;
        } else {
            str2 = iVar3.f134901a;
        }
        com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("enter_from", str2);
        j jVar3 = this.f130438k;
        if (jVar3 == null || (iVar2 = jVar3.r) == null) {
            str3 = null;
        } else {
            str3 = iVar2.f134903c;
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", str3);
        j jVar4 = this.f130438k;
        if (!(jVar4 == null || (iVar = jVar4.r) == null)) {
            str4 = iVar.f134902b;
        }
        com.ss.android.ugc.aweme.common.r.a("sticker_click", a3.a("author_id", str4).a("sticker_type", "wiki").a("log_pb", ac.a.f91473a.a(logPbBean)).f66730a);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final View e() {
        MethodCollector.i(1875);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.f130436i);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        TuxTextView tuxTextView = new TuxTextView(this.f130436i, null, 0, 6);
        tuxTextView.setTextColor(androidx.core.content.b.c(this.f130436i, R.color.a9));
        tuxTextView.setTuxFont(62);
        tuxTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(16);
        tuxTextView.setText(this.f130436i.getString(R.string.cb6));
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(this.f130436i);
        autoRTLImageView.setImageResource(R.drawable.b5y);
        linearLayout.addView(tuxTextView);
        linearLayout.addView(autoRTLImageView);
        MethodCollector.o(1875);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void f() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        i iVar;
        String str7;
        i iVar2;
        i iVar3;
        i iVar4;
        i iVar5;
        i iVar6;
        g gVar = this.f130635a;
        if (gVar.a() != null && !gVar.a().getAnchors().isEmpty()) {
            LogPbBean logPbBean = new LogPbBean();
            j jVar = gVar.f130390f;
            String str8 = "";
            if (jVar == null || (str = jVar.f134931l) == null) {
                str = str8;
            }
            logPbBean.setImprId(str);
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            j jVar2 = gVar.f130390f;
            if (jVar2 == null || (iVar6 = jVar2.r) == null || (str2 = iVar6.f134903c) == null) {
                str2 = str8;
            }
            com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("group_id", str2);
            j jVar3 = gVar.f130390f;
            if (jVar3 == null || (iVar5 = jVar3.r) == null || (str3 = iVar5.f134902b) == null) {
                str3 = str8;
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("author_id", str3);
            j jVar4 = gVar.f130390f;
            if (jVar4 == null || (iVar4 = jVar4.r) == null || (str4 = iVar4.f134901a) == null) {
                str4 = str8;
            }
            com.ss.android.ugc.aweme.common.r.a("sticker_toast_click", a3.a("enter_from", str4).a("sticker_type", "wiki").a("log_pb", ac.a.f91473a.a(logPbBean)).f66730a);
            List<CreateAnchorInfo> anchors = gVar.a().getAnchors();
            ArrayList arrayList = new ArrayList(n.a((Iterable) anchors, 10));
            for (T t : anchors) {
                WikipediaInfo wikipediaInfo = new WikipediaInfo();
                wikipediaInfo.setKeyword(t.getKeyword());
                wikipediaInfo.setLang(t.getLanguage());
                wikipediaInfo.setExtra((WikipediaExtra) new f().a(t.getContent(), WikipediaExtra.class));
                wikipediaInfo.setAnchorId(t.getThirdId());
                arrayList.add(wikipediaInfo);
            }
            List<WikipediaInfo> o = n.o(arrayList);
            if (o.size() == 1) {
                com.ss.android.ugc.aweme.commercialize.b.c.a(gVar.f130387c, o.get(0), gVar.b(), ag.a());
                com.ss.android.ugc.aweme.app.f.d dVar2 = new com.ss.android.ugc.aweme.app.f.d();
                j jVar5 = gVar.f130390f;
                if (jVar5 == null || (iVar3 = jVar5.r) == null || (str5 = iVar3.f134901a) == null) {
                    str5 = str8;
                }
                com.ss.android.ugc.aweme.app.f.d a4 = dVar2.a("enter_from", str5).a("language", o.get(0).getLang()).a("wiki_entry", o.get(0).getKeyword());
                j jVar6 = gVar.f130390f;
                if (jVar6 == null || (iVar2 = jVar6.r) == null || (str6 = iVar2.f134902b) == null) {
                    str6 = str8;
                }
                com.ss.android.ugc.aweme.app.f.d a5 = a4.a("author_id", str6);
                j jVar7 = gVar.f130390f;
                if (!(jVar7 == null || (iVar = jVar7.r) == null || (str7 = iVar.f134903c) == null)) {
                    str8 = str7;
                }
                com.ss.android.ugc.aweme.common.r.a("enter_wiki_detail", a5.a("group_id", str8).f66730a);
            } else if (gVar.f130388d instanceof r) {
                ((r) gVar.f130388d).a(o, gVar.b());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void a(j jVar) {
        l.d(jVar, "");
        super.a(jVar);
        this.f130635a.a(jVar);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<WikipediaInfo, z> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(85656);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(r rVar) {
            super(1);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(WikipediaInfo wikipediaInfo) {
            String str;
            String str2;
            i iVar;
            String str3;
            i iVar2;
            i iVar3;
            WikipediaInfo wikipediaInfo2 = wikipediaInfo;
            String str4 = "";
            l.d(wikipediaInfo2, str4);
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            j jVar = this.this$0.f130438k;
            if (jVar == null || (iVar3 = jVar.r) == null || (str = iVar3.f134901a) == null) {
                str = str4;
            }
            com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("enter_from", str).a("language", wikipediaInfo2.getLang()).a("wiki_entry", wikipediaInfo2.getKeyword());
            j jVar2 = this.this$0.f130438k;
            if (jVar2 == null || (iVar2 = jVar2.r) == null || (str2 = iVar2.f134902b) == null) {
                str2 = str4;
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("author_id", str2);
            j jVar3 = this.this$0.f130438k;
            if (!(jVar3 == null || (iVar = jVar3.r) == null || (str3 = iVar.f134903c) == null)) {
                str4 = str3;
            }
            com.ss.android.ugc.aweme.common.r.a("enter_wiki_detail", a3.a("group_id", str4).f66730a);
            return z.f158842a;
        }
    }

    private void a(List<WikipediaInfo> list, Map<String, String> map) {
        String str;
        String str2;
        String str3;
        i iVar;
        String str4;
        i iVar2;
        i iVar3;
        String str5 = "";
        l.d(list, str5);
        l.d(map, str5);
        if (this.f130637m == null) {
            this.f130637m = new d(this.f130436i, list, map, new a(this), new b(this));
        }
        d dVar = this.f130637m;
        if (dVar != null) {
            dVar.show();
        }
        StringBuilder sb = new StringBuilder(str5);
        StringBuilder sb2 = new StringBuilder(str5);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            sb.append("wiki,");
            sb2.append(l.a(it.next().getKeyword(), (Object) ","));
        }
        LogPbBean logPbBean = new LogPbBean();
        j jVar = this.f130438k;
        if (jVar == null || (str = jVar.f134931l) == null) {
            str = str5;
        }
        logPbBean.setImprId(str);
        com.ss.android.ugc.aweme.app.f.d dVar2 = new com.ss.android.ugc.aweme.app.f.d();
        j jVar2 = this.f130438k;
        if (jVar2 == null || (iVar3 = jVar2.r) == null || (str2 = iVar3.f134901a) == null) {
            str2 = str5;
        }
        com.ss.android.ugc.aweme.app.f.d a2 = dVar2.a("enter_from", str2);
        j jVar3 = this.f130438k;
        if (jVar3 == null || (iVar2 = jVar3.r) == null || (str3 = iVar2.f134903c) == null) {
            str3 = str5;
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", str3).a("log_pb", ac.a.f91473a.a(logPbBean));
        j jVar4 = this.f130438k;
        if (!(jVar4 == null || (iVar = jVar4.r) == null || (str4 = iVar.f134902b) == null)) {
            str5 = str4;
        }
        com.ss.android.ugc.aweme.common.r.a("anchor_multiple_show", a3.a("author_id", str5).a("sticker_type", "wiki").a("anchor_types", sb.toString()).a("anchor_names", sb2.toString()).f66730a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3) {
        return this.f130635a.a(j2, i2, f2, f3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(int i2, Context context, View view, InteractStickerStruct interactStickerStruct, j jVar) {
        super(i2, context, view, interactStickerStruct, jVar);
        l.d(context, "");
        l.d(view, "");
        l.d(interactStickerStruct, "");
        this.f130635a = new g(context, this, interactStickerStruct, jVar);
        this.f130636l = h.i.a((h.f.a.a) new c(context));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b bVar) {
        l.d(bVar, "");
        return this.f130635a.a(j2, i2, f2, f3, bVar);
    }
}
