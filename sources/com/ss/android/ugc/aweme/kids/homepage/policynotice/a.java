package com.ss.android.ugc.aweme.kids.homepage.policynotice;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.kids.homepage.policynotice.d.a;
import com.ss.android.ugc.aweme.kids.homepage.policynotice.response.PolicyBodyLinkList;
import com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeActivity;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a f106590a;

    /* renamed from: b  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a f106591b;

    /* renamed from: c  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a f106592c;

    /* renamed from: d  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a f106593d;

    /* renamed from: e  reason: collision with root package name */
    public static List<com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a> f106594e = z.INSTANCE;

    /* renamed from: f  reason: collision with root package name */
    public static final a f106595f = new a();

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.a$a  reason: collision with other inner class name */
    static final class C2723a extends m implements h.f.a.a<h.z> {
        final /* synthetic */ com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b $policyNoticeAction;

        static {
            Covode.recordClassIndex(68111);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2723a(com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar) {
            super(0);
            this.$policyNoticeAction = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            if (l.a((Object) this.$policyNoticeAction.f106632k, (Object) true)) {
                new Handler().postDelayed(AnonymousClass1.f106600a, 500);
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f106601a;

        static {
            Covode.recordClassIndex(68113);
        }

        b(Context context) {
            this.f106601a = context;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Context context = this.f106601a;
            com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a aVar = a.f106591b;
            if (aVar == null) {
                l.b();
            }
            new com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.b(context, aVar).show();
            a.f106591b = null;
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f106602a;

        static {
            Covode.recordClassIndex(68114);
        }

        c(Context context) {
            this.f106602a = context;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Context context = this.f106602a;
            com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a aVar = a.f106592c;
            if (aVar == null) {
                l.b();
            }
            new com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.a(context, aVar).a();
            a.f106592c = null;
            return h.z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(68110);
    }

    public static final class d extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f106603a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f106604b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PolicyBodyLinkList f106605c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f106606d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f106607e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f106608f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f106609g;

        static {
            Covode.recordClassIndex(68115);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            Boolean bool;
            l.d(view, "");
            SmartRouter.buildRoute(this.f106603a, this.f106604b).withParam(com.ss.android.ugc.aweme.kids.homepage.policynotice.b.a.f106612a, true).open();
            PolicyBodyLinkList policyBodyLinkList = this.f106605c;
            Boolean bool2 = null;
            if (policyBodyLinkList != null) {
                bool = policyBodyLinkList.getApprove();
            } else {
                bool = null;
            }
            if (l.a((Object) bool, (Object) true)) {
                this.f106606d.invoke(new com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b(null, null, null, null, this.f106605c.getOperation(), null, null, null, null, 1983));
            }
            PolicyBodyLinkList policyBodyLinkList2 = this.f106605c;
            if (policyBodyLinkList2 != null) {
                bool2 = policyBodyLinkList2.getDismiss();
            }
            if (l.a((Object) bool2, (Object) true)) {
                this.f106607e.invoke();
            }
        }

        d(Context context, String str, PolicyBodyLinkList policyBodyLinkList, h.f.a.b bVar, h.f.a.a aVar, int i2, int i3) {
            this.f106603a = context;
            this.f106604b = str;
            this.f106605c = policyBodyLinkList;
            this.f106606d = bVar;
            this.f106607e = aVar;
            this.f106608f = i2;
            this.f106609g = i3;
        }
    }

    public static void a(Context context) {
        l.d(context, "");
        if (f106593d != null) {
            a(context, new Intent(context, PolicyNoticeActivity.class));
        } else if (f106590a != null) {
            com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a aVar = f106590a;
            if (aVar == null) {
                l.b();
            }
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.kids.homepage.policynotice.c.c(aVar));
            f106590a = null;
        } else if (f106591b != null) {
            i.b(new b(context), i.f4826c);
        } else if (f106592c != null) {
            i.b(new c(context), i.f4826c);
        }
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    public static void a(com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a aVar, com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar) {
        String str;
        String str2;
        String str3;
        l.d(bVar, "");
        com.ss.android.ugc.aweme.kids.homepage.policynotice.d.a aVar2 = new com.ss.android.ugc.aweme.kids.homepage.policynotice.d.a();
        if (aVar != null) {
            str = aVar.getBusiness();
            str2 = aVar.getPolicyVersion();
            str3 = aVar.getStyle();
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        String str4 = bVar.f106626e;
        Integer num = bVar.f106628g;
        C2723a aVar3 = new C2723a(bVar);
        l.d(aVar3, "");
        aVar2.a().policyNoticeApprove(str, str2, str3, str4, num).a(new a.c(aVar3, System.currentTimeMillis()), i.f4826c, null);
    }

    private static void a(String str, Context context) {
        T t;
        String style;
        Iterator<T> it = f106594e.iterator();
        do {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            t = it.next();
        } while (!l.a((Object) t.getBusiness(), (Object) str));
        T t2 = t;
        if (t2 != null && (style = t2.getStyle()) != null) {
            switch (style.hashCode()) {
                case -1383228885:
                    if (style.equals("bottom")) {
                        new com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.b(context, t2).show();
                        return;
                    }
                    return;
                case 111185:
                    if (style.equals("pop")) {
                        new com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.a(context, t2).a();
                        return;
                    }
                    return;
                case 97526364:
                    if (style.equals("float")) {
                        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.kids.homepage.policynotice.c.c(t2));
                        return;
                    }
                    return;
                case 110066619:
                    if (style.equals("fullscreen")) {
                        f106593d = t2;
                        a(context, new Intent(context, PolicyNoticeActivity.class));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public static void a(com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar, Context context, h.f.a.b<? super com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b, h.z> bVar2, h.f.a.a<h.z> aVar) {
        l.d(bVar, "");
        l.d(context, "");
        l.d(bVar2, "");
        l.d(aVar, "");
        String str = bVar.f106624c;
        int hashCode = str.hashCode();
        if (hashCode != -1052618729) {
            if (hashCode != -172220347) {
                if (hashCode != 3277) {
                    if (hashCode == 111185 && str.equals("pop")) {
                        a(bVar.f106629h, context);
                    }
                } else if (str.equals("h5")) {
                    SmartRouter.buildRoute(context, "aweme://webview/?url=" + bVar.f106625d).open();
                }
            } else if (str.equals("callback")) {
                bVar2.invoke(bVar);
            }
        } else if (str.equals("native")) {
            SmartRouter.buildRoute(context, bVar.f106625d).open();
        }
        if (bVar.f106627f) {
            bVar2.invoke(bVar);
        }
        if (l.a((Object) bVar.f106630i, (Object) true)) {
            aVar.invoke();
        }
        if (l.a((Object) bVar.f106631j, (Object) true)) {
            JSONObject put = new JSONObject().put("eventName", "cancel_post_success");
            l.b(put, "");
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.kids.homepage.policynotice.c.a("notification", put));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        if (r1 == null) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.SpannableStringBuilder a(android.content.Context r17, java.lang.String r18, java.util.List<com.ss.android.ugc.aweme.kids.homepage.policynotice.response.PolicyBodyLinkList> r19, h.f.a.b<? super com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b, h.z> r20, h.f.a.a<h.z> r21) {
        /*
        // Method dump skipped, instructions count: 283
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.homepage.policynotice.a.a(android.content.Context, java.lang.String, java.util.List, h.f.a.b, h.f.a.a):android.text.SpannableStringBuilder");
    }
}
