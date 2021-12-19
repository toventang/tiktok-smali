package com.ss.android.ugc.aweme.dsp.b;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hox.Hox;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.c.e;
import com.bytedance.tux.c.f;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.dsp.common.model.DspExtraStruct;
import com.ss.android.ugc.aweme.dsp.common.model.DspStruct;
import com.ss.android.ugc.aweme.dsp.common.model.DspUpsellRessoStruct;
import com.ss.android.ugc.aweme.dsp.playpage.model.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.List;
import java.util.Objects;

public final class c implements com.ss.android.ugc.aweme.dsp.playpage.playview.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final ViewStub f83258a;

    /* renamed from: b  reason: collision with root package name */
    private final h<View> f83259b = i.a((h.f.a.a) new C1959c(this));

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.dsp.playpage.base.b f83260c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f83261d;

    static {
        Covode.recordClassIndex(51914);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.playview.a.b
    public final void h() {
    }

    private final View b() {
        return this.f83259b.getValue();
    }

    private final void c() {
        if (this.f83259b.isInitialized()) {
            b().setVisibility(8);
        }
    }

    public final boolean a() {
        if (!this.f83259b.isInitialized() || b().getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.b.c$c  reason: collision with other inner class name */
    static final class C1959c extends m implements h.f.a.a<View> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(51917);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1959c(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            MethodCollector.i(4727);
            View inflate = this.this$0.f83258a.inflate();
            l.b(inflate, "");
            TuxIconView tuxIconView = (TuxIconView) inflate.findViewById(R.id.c0h);
            l.b(tuxIconView, "");
            e a2 = f.a(new a(inflate));
            Context context = inflate.getContext();
            l.b(context, "");
            tuxIconView.setBackground(a2.a(context));
            TuxTextView tuxTextView = (TuxTextView) inflate.findViewById(R.id.f5y);
            l.b(tuxTextView, "");
            tuxTextView.setText(inflate.getResources().getString(R.string.dbs, Integer.valueOf(com.ss.android.ugc.aweme.dsp.experiment.b.a().getCopyrightRestrictions().getMaxMusics())));
            ((TuxButton) inflate.findViewById(R.id.xx)).setOnClickListener(b.f83264a);
            MethodCollector.o(4727);
            return inflate;
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.playview.a.b
    public final void a(int i2) {
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        this.f83261d = z;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.playview.a.b
    public final void a(com.ss.android.ugc.aweme.dsp.playpage.base.b bVar) {
        l.d(bVar, "");
        this.f83260c = bVar;
    }

    public c(ViewStub viewStub) {
        l.d(viewStub, "");
        this.f83258a = viewStub;
    }

    static final class a extends m implements h.f.a.b<e, z> {
        final /* synthetic */ View $contentView;

        static {
            Covode.recordClassIndex(51915);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view) {
            super(1);
            this.$contentView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44775a = Integer.valueOf(this.$contentView.getResources().getColor(R.color.a0));
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44777c = Float.valueOf(TypedValue.applyDimension(1, 36.0f, system.getDisplayMetrics()));
            return z.f158842a;
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f83265a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.dsp.playerservice.b.c f83266b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f83267c;

        static {
            Covode.recordClassIndex(51918);
        }

        d(Context context, com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar, String str) {
            this.f83265a = context;
            this.f83266b = cVar;
            this.f83267c = str;
        }

        public final void onClick(View view) {
            DspUpsellRessoStruct dspUpsellRessoStruct;
            com.ss.android.ugc.aweme.dsp.playerservice.b.h hVar;
            DspStruct c2;
            DspExtraStruct dspExtra;
            ClickAgent.onClick(view);
            Context context = this.f83265a;
            l.b(context, "");
            com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar = this.f83266b;
            if (cVar == null || (c2 = cVar.c()) == null || (dspExtra = c2.getDspExtra()) == null) {
                dspUpsellRessoStruct = null;
            } else {
                dspUpsellRessoStruct = dspExtra.getUpsellResso();
            }
            b.a(context, dspUpsellRessoStruct);
            com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar2 = this.f83266b;
            if (cVar2 == null || (hVar = cVar2.d()) == null) {
                hVar = new com.ss.android.ugc.aweme.dsp.playerservice.b.h();
            }
            com.ss.android.ugc.aweme.dsp.common.b.a.c(hVar, "stream_limit", this.f83267c);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final b f83264a = new b();

        static {
            Covode.recordClassIndex(51916);
        }

        b() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
            l.b(view, "");
            Context context = view.getContext();
            if (createIMainServicebyMonsterPlugin.isMainPage(context)) {
                Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                Hox.a.a((androidx.fragment.app.e) context).b("For You", new Bundle());
                return;
            }
            Intent intent = new Intent();
            l.b(createIMainServicebyMonsterPlugin, "");
            intent.setClass(context, createIMainServicebyMonsterPlugin.getMainActivityClass());
            intent.setFlags(335544320);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
            context.startActivity(intent);
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.playview.a.b
    public final void b(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        String str;
        com.ss.android.ugc.aweme.dsp.playerservice.f.a aVar;
        String str2;
        boolean z;
        com.ss.android.ugc.aweme.dsp.playerservice.b.h hVar;
        g n;
        String str3;
        DspStruct c2;
        Aweme aweme;
        Video video;
        UrlModel originCover;
        List<String> urlList;
        if (!com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.b.b()) {
            c();
            return;
        }
        String str4 = null;
        if (cVar != null) {
            str = cVar.a();
        } else {
            str = null;
        }
        com.ss.android.ugc.aweme.dsp.playpage.base.b bVar = this.f83260c;
        if (bVar != null) {
            aVar = bVar.a();
        } else {
            aVar = null;
        }
        if (b.a(str, aVar)) {
            c();
            return;
        }
        View b2 = b();
        Context context = b2.getContext();
        String str5 = "";
        l.b(context, str5);
        if (b.a(context)) {
            ((TuxTextView) b2.findViewById(R.id.f5z)).setText(R.string.dbr);
            ((TuxButton) b2.findViewById(R.id.y6)).setText(R.string.dbp);
            str2 = "open_resso";
        } else {
            ((TuxTextView) b2.findViewById(R.id.f5z)).setText(R.string.dbg);
            ((TuxButton) b2.findViewById(R.id.y6)).setText(R.string.dbe);
            str2 = "download_resso";
        }
        ((TuxButton) b2.findViewById(R.id.y6)).setOnClickListener(new d(context, cVar, str2));
        if (!(cVar == null || (c2 = cVar.c()) == null || (aweme = c2.getAweme()) == null || (video = aweme.getVideo()) == null || (originCover = video.getOriginCover()) == null || (urlList = originCover.getUrlList()) == null)) {
            str4 = (String) n.h((List) urlList);
        }
        if (str4 == null || str4.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            com.facebook.drawee.view.c cVar2 = (com.facebook.drawee.view.c) b2.findViewById(R.id.bum);
            l.b(cVar2, str5);
            ((com.facebook.drawee.f.a) cVar2.getHierarchy()).a(context.getResources().getDrawable(R.drawable.b4d), 1.0f, true);
        } else {
            v a2 = r.a(str4);
            a2.f39916l = R.drawable.b4d;
            a2.u = Bitmap.Config.ARGB_8888;
            a2.x = new com.bytedance.lighten.a.b(25, 2);
            a2.E = (SmartImageView) b2.findViewById(R.id.bum);
            a2.c();
        }
        b2.setVisibility(0);
        if (this.f83261d) {
            if (cVar == null || (hVar = cVar.d()) == null) {
                hVar = new com.ss.android.ugc.aweme.dsp.playerservice.b.h();
            }
            com.ss.android.ugc.aweme.dsp.playpage.base.b bVar2 = this.f83260c;
            if (!(bVar2 == null || (n = bVar2.n()) == null || (str3 = n.f83747a) == null)) {
                str5 = str3;
            }
            com.ss.android.ugc.aweme.dsp.common.b.a.a(hVar, str5, "stream_limit", str2);
        }
    }
}
