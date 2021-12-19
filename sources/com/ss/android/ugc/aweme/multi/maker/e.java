package com.ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.miniapp_api.model.b.a;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.miniapp_api.services.c;
import com.ss.android.ugc.aweme.multi.ui.CommonAnchorItem;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class e extends o {
    static {
        Covode.recordClassIndex(71182);
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final String l() {
        return "app_page";
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final com.ss.android.ugc.aweme.multi.c i() {
        return new e();
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final int k() {
        return ab.INDIA_MOVIE.getTYPE();
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ SmartImageView $imageView;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(71185);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar, SmartImageView smartImageView) {
            super(0);
            this.this$0 = eVar;
            this.$imageView = smartImageView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            UrlModel icon;
            String str;
            AnchorCommonStruct anchorCommonStruct = this.this$0.f110994h;
            if (anchorCommonStruct == null || (icon = anchorCommonStruct.getIcon()) == null) {
                this.$imageView.setImageResource(2131232159);
            } else {
                List<String> urlList = icon.getUrlList();
                if (urlList == null || (str = urlList.get(0)) == null) {
                    str = "";
                }
                v a2 = r.a(str);
                a2.F = this.$imageView;
                a2.c();
            }
            return z.f158842a;
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AnchorCommonStruct f110948a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f110949b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewGroup f110950c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f110951d;

        static {
            Covode.recordClassIndex(71183);
        }

        a(AnchorCommonStruct anchorCommonStruct, e eVar, ViewGroup viewGroup, d dVar) {
            this.f110948a = anchorCommonStruct;
            this.f110949b = eVar;
            this.f110950c = viewGroup;
            this.f110951d = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f110949b.d(this.f110951d);
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void a(SmartImageView smartImageView) {
        l.d(smartImageView, "");
        a(smartImageView, new c(this, smartImageView));
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final void b(AnchorCommonStruct anchorCommonStruct) {
        l.d(anchorCommonStruct, "");
        a(b.f110952a);
    }

    static final class b extends m implements h.f.a.b<AnchorCommonStruct, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f110952a = new b();

        static {
            Covode.recordClassIndex(71184);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(AnchorCommonStruct anchorCommonStruct) {
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            l.d(anchorCommonStruct2, "");
            com.ss.android.ugc.aweme.miniapp_api.services.c cVar = c.a.f109704a;
            l.b(cVar, "");
            cVar.a().preloadMiniApp(anchorCommonStruct2.getSchema());
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final void d(d dVar) {
        l.d(dVar, "");
        o.a(this, dVar, false, false, 6);
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        if (anchorCommonStruct != null) {
            com.ss.android.ugc.aweme.miniapp_api.services.c cVar = c.a.f109704a;
            l.b(cVar, "");
            IMiniAppService a2 = cVar.a();
            Activity e2 = a().e();
            String url = anchorCommonStruct.getUrl();
            a.C2810a aVar = new a.C2810a();
            aVar.f109680b = a().c();
            a2.openMiniApp(e2, url, aVar.a());
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void b(ViewGroup viewGroup, Dialog dialog, d dVar) {
        MethodCollector.i(4551);
        String str = "";
        l.d(viewGroup, str);
        l.d(dialog, str);
        l.d(dVar, str);
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        if (anchorCommonStruct != null) {
            Context context = viewGroup.getContext();
            l.b(context, str);
            CommonAnchorItem a2 = CommonAnchorItem.a.a(context);
            UrlModel thumbnail = anchorCommonStruct.getThumbnail();
            if (thumbnail != null) {
                a2.setIcon(thumbnail);
            } else {
                a2.setIconRes(2131232159);
            }
            String keyword = anchorCommonStruct.getKeyword();
            if (keyword != null) {
                str = keyword;
            }
            a2.setTitle(str);
            a2.setSubTitle(anchorCommonStruct.getDescription());
            a2.setOnClickListener(new a(anchorCommonStruct, this, viewGroup, dVar));
            viewGroup.addView(a2);
            MethodCollector.o(4551);
            return;
        }
        MethodCollector.o(4551);
    }
}
