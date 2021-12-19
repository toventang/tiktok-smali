package com.ss.android.ugc.aweme.dsp.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.a;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.c;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.dsp.TTDspViewModel;
import com.ss.android.ugc.aweme.dsp.common.model.DspUpsellRessoStruct;
import com.ss.android.ugc.aweme.dsp.playpage.model.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f83250a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f83251b;

    private b() {
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ View $contentView;

        static {
            Covode.recordClassIndex(51908);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(0);
            this.$contentView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            View view = this.$contentView;
            l.b(view, "");
            a.b.a(view, c.d.f45284a);
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(51905);
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.b.b$b  reason: collision with other inner class name */
    static final class C1958b extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1958b f83257a = new C1958b();

        static {
            Covode.recordClassIndex(51907);
        }

        C1958b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_x_mark_small;
            return z.f158842a;
        }
    }

    public static boolean a(Context context) {
        l.d(context, "");
        return com.ss.android.ugc.aweme.dsp.common.b.c.a(context);
    }

    static final class d extends m implements h.f.a.b<com.bytedance.tux.dialog.b.d, z> {
        final /* synthetic */ String $actionForLog;
        final /* synthetic */ Context $context;
        final /* synthetic */ com.ss.android.ugc.aweme.dsp.playerservice.b.c $playable;

        static {
            Covode.recordClassIndex(51909);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Context context, com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar, String str) {
            super(1);
            this.$context = context;
            this.$playable = cVar;
            this.$actionForLog = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.d r3) {
            /*
                r2 = this;
                com.bytedance.tux.dialog.b.d r3 = (com.bytedance.tux.dialog.b.d) r3
                java.lang.String r0 = ""
                h.f.b.l.d(r3, r0)
                com.ss.android.ugc.aweme.dsp.b.b$d$1 r1 = new com.ss.android.ugc.aweme.dsp.b.b$d$1
                r1.<init>(r2)
                r0 = 2131826191(0x7f11160f, float:1.928526E38)
                r3.a(r0, r1)
                com.bytedance.tux.dialog.b.d.a(r3)
                h.z r0 = h.z.f158842a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.b.b.d.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static final class e extends m implements h.f.a.b<com.bytedance.tux.dialog.b.d, z> {
        final /* synthetic */ String $actionForLog;
        final /* synthetic */ Context $context;
        final /* synthetic */ com.ss.android.ugc.aweme.dsp.playerservice.b.c $playable;

        static {
            Covode.recordClassIndex(51911);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Context context, com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar, String str) {
            super(1);
            this.$context = context;
            this.$playable = cVar;
            this.$actionForLog = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.d r3) {
            /*
                r2 = this;
                com.bytedance.tux.dialog.b.d r3 = (com.bytedance.tux.dialog.b.d) r3
                java.lang.String r0 = ""
                h.f.b.l.d(r3, r0)
                com.ss.android.ugc.aweme.dsp.b.b$e$1 r1 = new com.ss.android.ugc.aweme.dsp.b.b$e$1
                r1.<init>(r2)
                r0 = 2131826180(0x7f111604, float:1.9285237E38)
                r3.a(r0, r1)
                com.bytedance.tux.dialog.b.d.a(r3)
                h.z r0 = h.z.f158842a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.b.b.e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f83253a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f83254b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.dsp.playerservice.b.c f83255c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f83256d;

        static {
            Covode.recordClassIndex(51906);
        }

        a(View view, Context context, com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar, String str) {
            this.f83253a = view;
            this.f83254b = context;
            this.f83255c = cVar;
            this.f83256d = str;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        public final void onClick(android.view.View r4) {
            /*
                r3 = this;
                com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r4)
                android.view.View r1 = r3.f83253a
                java.lang.String r0 = ""
                h.f.b.l.b(r1, r0)
                com.bytedance.tux.sheet.sheet.a.b.a(r1)
                android.content.Context r1 = r3.f83254b
                com.ss.android.ugc.aweme.dsp.playerservice.b.c r0 = r3.f83255c
                com.ss.android.ugc.aweme.dsp.common.model.DspStruct r0 = r0.c()
                com.ss.android.ugc.aweme.dsp.common.model.DspExtraStruct r0 = r0.getDspExtra()
                com.ss.android.ugc.aweme.dsp.common.model.DspUpsellRessoStruct r0 = r0.getUpsellResso()
                com.ss.android.ugc.aweme.dsp.b.b.a(r1, r0)
                com.ss.android.ugc.aweme.dsp.playerservice.b.c r0 = r3.f83255c
                com.ss.android.ugc.aweme.dsp.playerservice.b.h r2 = r0.d()
                java.lang.String r1 = r3.f83256d
                java.lang.String r0 = "background_play"
                com.ss.android.ugc.aweme.dsp.common.b.a.c(r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.b.b.a.onClick(android.view.View):void");
        }
    }

    static final class f extends m implements h.f.a.b<com.bytedance.tux.dialog.a, z> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(51913);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Context context) {
            super(1);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.a aVar) {
            l.d(aVar, "");
            Context context = this.$context;
            if (context instanceof androidx.fragment.app.e) {
                com.ss.android.ugc.aweme.dsp.common.b.c.a((Activity) context, !l.a((Object) TTDspViewModel.a.a((androidx.fragment.app.e) context).a(), (Object) "LIBRARY"));
            }
            return z.f158842a;
        }
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    public static boolean a(String str, com.ss.android.ugc.aweme.dsp.playerservice.a.d dVar) {
        com.ss.android.ugc.aweme.dsp.playerservice.b.c n;
        if (str == null) {
            return false;
        }
        String str2 = null;
        if (!(dVar == null || (n = dVar.n()) == null)) {
            str2 = n.a();
        }
        if ((!l.a((Object) str2, (Object) str)) || !com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.b.b(str)) {
            return false;
        }
        com.ss.android.ugc.aweme.dsp.playerservice.c.f e2 = dVar.e();
        if (e2.isStartState() || e2.isPlayingState() || e2.isPauseState()) {
            return true;
        }
        return false;
    }

    public static void a(Context context, DspUpsellRessoStruct dspUpsellRessoStruct) {
        Intent intent;
        l.d(context, "");
        if (dspUpsellRessoStruct == null) {
            dspUpsellRessoStruct = new DspUpsellRessoStruct();
            dspUpsellRessoStruct.setAppLink(com.ss.android.ugc.aweme.dsp.experiment.b.a().getLinks().getAppLink());
            dspUpsellRessoStruct.setDeepLink(com.ss.android.ugc.aweme.dsp.experiment.b.a().getLinks().getDeepLink());
            dspUpsellRessoStruct.setDownloadLink(com.ss.android.ugc.aweme.dsp.experiment.b.a().getLinks().getDownloadLink());
        }
        if (a(context)) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (dspUpsellRessoStruct.getAppLink().length() != 0) {
                    intent = new Intent("android.intent.action.VIEW", Uri.parse(dspUpsellRessoStruct.getAppLink()));
                } else {
                    return;
                }
            } else if (dspUpsellRessoStruct.getDeepLink().length() != 0) {
                intent = new Intent("android.intent.action.VIEW", Uri.parse(dspUpsellRessoStruct.getDeepLink())).setPackage("com.moonvideo.android.resso");
                l.b(intent, "");
            } else {
                return;
            }
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.addCategory("android.intent.category.DEFAULT");
            try {
                a(context, intent);
            } catch (Exception e2) {
                com.bytedance.services.apm.api.a.a((Throwable) e2);
            }
        } else if (dspUpsellRessoStruct.getDownloadLink().length() != 0) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(dspUpsellRessoStruct.getDownloadLink()));
            intent2.addCategory("android.intent.category.BROWSABLE");
            intent2.addCategory("android.intent.category.DEFAULT");
            try {
                a(context, intent2);
            } catch (Exception e3) {
                com.bytedance.services.apm.api.a.a((Throwable) e3);
            }
        }
    }

    public static void a(Context context, com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar, g gVar) {
        String str;
        l.d(context, "");
        l.d(cVar, "");
        l.d(gVar, "");
        String string = context.getString(R.string.dbs, Integer.valueOf(com.ss.android.ugc.aweme.dsp.experiment.b.a().getCopyrightRestrictions().getMaxMusics()));
        l.b(string, "");
        com.bytedance.tux.dialog.b c2 = a.C1094a.a(context).d(string);
        if (a(context)) {
            str = "open_resso";
            com.bytedance.tux.dialog.b.e.a((com.bytedance.tux.dialog.b) c2.a(R.string.dbr), new d(context, cVar, str));
        } else {
            str = "download_resso";
            com.bytedance.tux.dialog.b.e.a((com.bytedance.tux.dialog.b) c2.a(R.string.dbg), new e(context, cVar, str));
        }
        ((com.bytedance.tux.dialog.b) c2.a(new f(context))).a().b().show();
        com.ss.android.ugc.aweme.dsp.common.b.a.a(cVar.d(), gVar.f83747a, "stream_limit", str);
    }

    public static boolean a(Context context, i iVar, com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar, String str) {
        String str2;
        MethodCollector.i(1542);
        l.d(context, "");
        l.d(iVar, "");
        l.d(cVar, "");
        l.d(str, "");
        if (f83251b) {
            MethodCollector.o(1542);
            return false;
        }
        f83251b = true;
        View inflate = LayoutInflater.from(context).inflate(R.layout.alt, (ViewGroup) null);
        if (a(context)) {
            l.b(inflate, "");
            ((AppCompatImageView) inflate.findViewById(R.id.bvt)).setImageResource(R.drawable.b4h);
            ((TuxTextView) inflate.findViewById(R.id.eyl)).setText(R.string.dbq);
            ((TuxButton) inflate.findViewById(R.id.eyi)).setText(R.string.dbp);
            str2 = "open_resso";
        } else {
            l.b(inflate, "");
            ((AppCompatImageView) inflate.findViewById(R.id.bvt)).setImageResource(R.drawable.b4g);
            ((TuxTextView) inflate.findViewById(R.id.eyl)).setText(R.string.dbf);
            ((TuxButton) inflate.findViewById(R.id.eyi)).setText(R.string.dbe);
            str2 = "download_resso";
        }
        ((TuxButton) inflate.findViewById(R.id.eyi)).setOnClickListener(new a(inflate, context, cVar, str2));
        com.bytedance.tux.navigation.a.b a2 = new com.bytedance.tux.navigation.a.b().a(com.bytedance.tux.c.c.a(C1958b.f83257a)).a((h.f.a.a<z>) new c(inflate));
        new a.C1112a().a(inflate).a(new TuxNavBar.a().b(a2)).f45299a.show(iVar, "UpsellRessoSheet");
        com.ss.android.ugc.aweme.dsp.common.b.a.a(cVar.d(), str, "background_play", str2);
        MethodCollector.o(1542);
        return true;
    }
}
