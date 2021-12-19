package com.ss.android.ugc.aweme.ad.feed.reminder;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import java.util.HashMap;
import java.util.Locale;

public final class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    final String f66001a;

    /* renamed from: b  reason: collision with root package name */
    public final String f66002b;

    /* renamed from: c  reason: collision with root package name */
    int f66003c;

    /* renamed from: d  reason: collision with root package name */
    final String f66004d;

    /* renamed from: e  reason: collision with root package name */
    final String f66005e;

    /* renamed from: f  reason: collision with root package name */
    private final String f66006f;

    /* renamed from: g  reason: collision with root package name */
    private final String f66007g;

    /* renamed from: h  reason: collision with root package name */
    private final String f66008h;

    /* renamed from: i  reason: collision with root package name */
    private HashMap f66009i;

    static {
        Covode.recordClassIndex(40598);
    }

    private View a(int i2) {
        if (this.f66009i == null) {
            this.f66009i = new HashMap();
        }
        View view = (View) this.f66009i.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f66009i.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final String getAccountName() {
        return this.f66006f;
    }

    public final String getCId() {
        return this.f66001a;
    }

    public final String getEnterFrom() {
        return this.f66005e;
    }

    public final String getLogExtra() {
        return this.f66004d;
    }

    public final String getLogId() {
        return this.f66008h;
    }

    public final String getReminderTime() {
        return this.f66007g;
    }

    public final int getSubscriptionStatus() {
        return this.f66003c;
    }

    public final boolean a() {
        if (Long.parseLong(this.f66007g) < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public final void b() {
        if (this.f66003c == 0) {
            ((TuxButton) a(R.id.button)).setButtonVariant(0);
            TuxTextView tuxTextView = (TuxTextView) a(R.id.clf);
            l.b(tuxTextView, "");
            Context context = getContext();
            l.b(context, "");
            tuxTextView.setText(context.getResources().getString(R.string.o8, this.f66006f));
            TuxButton tuxButton = (TuxButton) a(R.id.button);
            l.b(tuxButton, "");
            Context context2 = getContext();
            l.b(context2, "");
            tuxButton.setText(context2.getResources().getString(R.string.o6));
            return;
        }
        ((TuxButton) a(R.id.button)).setButtonVariant(1);
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.clf);
        l.b(tuxTextView2, "");
        Context context3 = getContext();
        l.b(context3, "");
        tuxTextView2.setText(context3.getResources().getString(R.string.o7));
        TuxButton tuxButton2 = (TuxButton) a(R.id.button);
        l.b(tuxButton2, "");
        Context context4 = getContext();
        l.b(context4, "");
        tuxButton2.setText(context4.getResources().getString(R.string.o5));
    }

    private final void c() {
        String str;
        String str2;
        ((TuxIconView) a(R.id.bi_)).setOnClickListener(new b(this));
        a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow", this.f66001a, this.f66004d, null);
        if (a()) {
            str = "expired_reminder_window";
        } else {
            str = "reminder_window";
        }
        a.C0791a b2 = a2.b("refer", str);
        if (TextUtils.equals(this.f66005e, "draw_ad")) {
            str2 = "1";
        } else {
            str2 = "2";
        }
        b2.a("window_type", str2).b();
        TuxTextView tuxTextView = (TuxTextView) a(R.id.title);
        l.b(tuxTextView, "");
        Context context = getContext();
        l.b(context, "");
        tuxTextView.setText(context.getResources().getString(R.string.o_, this.f66006f));
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.ee9);
        l.b(tuxTextView2, "");
        BDDateFormat bDDateFormat = new BDDateFormat("dddd, MMMM D, YYYY hh:mm A");
        long parseLong = Long.parseLong(this.f66007g);
        Locale locale = Locale.getDefault();
        l.b(locale, "");
        tuxTextView2.setText(bDDateFormat.a(parseLong, locale));
        if (a()) {
            TuxTextView tuxTextView3 = (TuxTextView) a(R.id.clf);
            l.b(tuxTextView3, "");
            Context context2 = getContext();
            l.b(context2, "");
            tuxTextView3.setText(context2.getResources().getString(R.string.o9));
            TuxButton tuxButton = (TuxButton) a(R.id.button);
            l.b(tuxButton, "");
            Context context3 = getContext();
            l.b(context3, "");
            tuxButton.setText(context3.getResources().getString(R.string.o4));
            ((TuxButton) a(R.id.button)).setOnClickListener(new View$OnClickListenerC1475a(this));
        } else {
            b();
        }
        ((TuxButton) a(R.id.button)).setOnClickListener(new c(this));
    }

    public final void setSubscriptionStatus(int i2) {
        this.f66003c = i2;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f66011a;

        static {
            Covode.recordClassIndex(40600);
        }

        b(a aVar) {
            this.f66011a = aVar;
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
        public final void onClick(android.view.View r2) {
            /*
                r1 = this;
                com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r2)
                com.ss.android.ugc.aweme.ad.feed.reminder.a r0 = r1.f66011a
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.reminder.a.b.onClick(android.view.View):void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ad.feed.reminder.a$a  reason: collision with other inner class name */
    public static final class View$OnClickListenerC1475a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f66010a;

        static {
            Covode.recordClassIndex(40599);
        }

        View$OnClickListenerC1475a(a aVar) {
            this.f66010a = aVar;
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
        public final void onClick(android.view.View r3) {
            /*
                r2 = this;
                com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r3)
                com.ss.android.ugc.aweme.ad.feed.reminder.a r0 = r2.f66010a
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                com.ss.android.ugc.aweme.ad.feed.reminder.a r0 = r2.f66010a
                android.content.Context r1 = r0.getContext()
                com.ss.android.ugc.aweme.ad.feed.reminder.a r0 = r2.f66010a
                java.lang.String r0 = r0.f66002b
                com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r1, r0)
                r0.open()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.reminder.a.View$OnClickListenerC1475a.onClick(android.view.View):void");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f66012a;

        static {
            Covode.recordClassIndex(40601);
        }

        c(a aVar) {
            this.f66012a = aVar;
        }

        public final void onClick(View view) {
            String str;
            boolean z;
            ClickAgent.onClick(view);
            a aVar = this.f66012a;
            String str2 = "2";
            if (aVar.a()) {
                a.C0791a b2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "otherclick", aVar.f66001a, aVar.f66004d, null).b("refer", "expired_reminder_window");
                if (TextUtils.equals(aVar.f66005e, "draw_ad")) {
                    str2 = "1";
                }
                b2.a("window_type", str2).b();
            } else {
                if (aVar.f66003c == 0) {
                    str = "set_success";
                } else {
                    str = "cancel_reminder";
                }
                a.C0791a b3 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "otherclick", aVar.f66001a, aVar.f66004d, null).b("refer", "reminder_window");
                if (TextUtils.equals(aVar.f66005e, "draw_ad")) {
                    str2 = "1";
                }
                b3.a("window_type", str2).a(str, "1").b();
            }
            if (this.f66012a.a()) {
                SmartRouter.buildRoute(this.f66012a.getContext(), this.f66012a.f66002b).open();
                return;
            }
            NoticeUpdateApi noticeUpdateApi = (NoticeUpdateApi) com.ss.android.ugc.aweme.commercialize.util.b.a.a(NoticeUpdateApi.class);
            String cId = this.f66012a.getCId();
            if (this.f66012a.getSubscriptionStatus() == 0) {
                z = true;
            } else {
                z = false;
            }
            noticeUpdateApi.postAdNotice(cId, Boolean.valueOf(z), this.f66012a.getLogId()).a(new f(this) {
                /* class com.ss.android.ugc.aweme.ad.feed.reminder.a.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f66013a;

                static {
                    Covode.recordClassIndex(40602);
                }

                {
                    this.f66013a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    int i2;
                    a aVar = this.f66013a.f66012a;
                    if (this.f66013a.f66012a.getSubscriptionStatus() == 0) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    aVar.setSubscriptionStatus(i2);
                    this.f66013a.f66012a.b();
                }
            }, new f(this) {
                /* class com.ss.android.ugc.aweme.ad.feed.reminder.a.c.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f66014a;

                static {
                    Covode.recordClassIndex(40603);
                }

                {
                    this.f66014a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    e a2 = b.a(this.f66014a.f66012a.getContext());
                    if (a2 != null) {
                        new com.bytedance.tux.g.b(a2).e(R.string.de2).b();
                    }
                }
            });
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7) {
        super(context);
        l.d(context, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str5, "");
        l.d(str6, "");
        l.d(str7, "");
        MethodCollector.i(2559);
        this.f66006f = str;
        this.f66007g = str2;
        this.f66001a = str3;
        this.f66002b = str4;
        this.f66008h = str5;
        this.f66003c = i2;
        this.f66004d = str6;
        this.f66005e = str7;
        com.a.a(LayoutInflater.from(context), R.layout.b1w, this, true);
        c();
        MethodCollector.o(2559);
    }
}
