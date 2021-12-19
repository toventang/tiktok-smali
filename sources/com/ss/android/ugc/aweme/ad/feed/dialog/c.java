package com.ss.android.ugc.aweme.ad.feed.dialog;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.HashMap;

public final class c extends Fragment implements View.OnClickListener {

    /* renamed from: d  reason: collision with root package name */
    public static com.bytedance.tux.sheet.sheet.a f65833d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f65834e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public AwemeRawAd f65835a;

    /* renamed from: b  reason: collision with root package name */
    public String f65836b;

    /* renamed from: c  reason: collision with root package name */
    public e f65837c;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f65838f;

    static {
        Covode.recordClassIndex(40505);
    }

    private View a(int i2) {
        if (this.f65838f == null) {
            this.f65838f = new HashMap();
        }
        View view = (View) this.f65838f.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f65838f.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40506);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f65838f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f65839a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f65840b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f65841c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f65842d;

        static {
            Covode.recordClassIndex(40507);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            String str;
            l.d(view, "");
            com.bytedance.tux.sheet.sheet.a aVar = c.f65833d;
            if (aVar == null) {
                l.a("tuxSheet");
            }
            aVar.dismiss();
            SmartRoute withParam = SmartRouter.buildRoute(this.f65839a.getContext(), "//webview").withParam("url", this.f65840b);
            Context context = this.f65839a.getContext();
            if (context != null) {
                str = context.getString(R.string.buz);
            } else {
                str = null;
            }
            withParam.withParam("title", str).open();
        }

        b(c cVar, String str, int i2, String str2) {
            this.f65839a = cVar;
            this.f65840b = str;
            this.f65841c = i2;
            this.f65842d = str2;
        }
    }

    private static Context a(e eVar) {
        Context applicationContext = eVar.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
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
    public final void onClick(android.view.View r6) {
        /*
            r5 = this;
            com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r6)
            if (r6 != 0) goto L_0x0006
            return
        L_0x0006:
            int r1 = r6.getId()
            r0 = 2131367043(0x7f0a1483, float:1.8353997E38)
            if (r1 != r0) goto L_0x005b
            r0 = r5
            com.bytedance.tux.sheet.sheet.a.b.a(r0)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.f65835a
            r4 = 0
            if (r0 == 0) goto L_0x0061
            java.lang.Long r0 = r0.getCreativeId()
        L_0x001c:
            java.lang.String r3 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.f65835a
            if (r0 == 0) goto L_0x005f
            java.lang.String r2 = r0.getLogExtra()
        L_0x0028:
            java.lang.String r1 = "pa_info_page"
            java.lang.String r0 = "otherclick"
            com.bytedance.ies.ugc.aweme.rich.a.a$a r2 = com.bytedance.ies.ugc.aweme.rich.a.a.a(r1, r0, r3, r2, r4)
            java.lang.String r1 = "refer"
            java.lang.String r0 = "button"
            com.bytedance.ies.ugc.aweme.rich.a.a$a r0 = r2.b(r1, r0)
            r0.b()
            java.lang.String r2 = r5.f65836b
            r1 = 0
            java.lang.String r0 = "long_press"
            boolean r0 = h.m.p.a(r2, r0, r1)
            if (r0 == 0) goto L_0x005c
            java.lang.String r2 = "ads_long_press"
        L_0x0048:
            android.content.Context r1 = r5.getContext()
            java.lang.String r0 = "//privacy/setting/personalization"
            com.bytedance.router.SmartRoute r1 = com.bytedance.router.SmartRouter.buildRoute(r1, r0)
            java.lang.String r0 = "enter_from"
            com.bytedance.router.SmartRoute r0 = r1.withParam(r0, r2)
            r0.open()
        L_0x005b:
            return
        L_0x005c:
            java.lang.String r2 = "ads_share_panel"
            goto L_0x0048
        L_0x005f:
            r2 = r4
            goto L_0x0028
        L_0x0061:
            r0 = r4
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.dialog.c.onClick(android.view.View):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        SpannableStringBuilder spannableStringBuilder;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        if (com.ss.android.ugc.aweme.compliance.api.a.g().a() || GuestModeServiceImpl.d().c()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            RelativeLayout relativeLayout = (RelativeLayout) a(R.id.d42);
            l.b(relativeLayout, "");
            relativeLayout.setVisibility(0);
        }
        ((RelativeLayout) a(R.id.d42)).setOnClickListener(this);
        e eVar = this.f65837c;
        if (eVar == null) {
            l.a("activty");
        }
        String string = a(eVar).getString(R.string.buw);
        l.b(string, "");
        e eVar2 = this.f65837c;
        if (eVar2 == null) {
            l.a("activty");
        }
        String string2 = a(eVar2).getString(R.string.buz);
        l.b(string2, "");
        TuxTextView tuxTextView = (TuxTextView) a(R.id.e5);
        l.b(tuxTextView, "");
        int a2 = p.a((CharSequence) string, string2, 0, false, 6);
        if (a2 != -1) {
            spannableStringBuilder = new SpannableStringBuilder(string);
            spannableStringBuilder.setSpan(new b(this, "https://www.tiktok.com/legal/privacy-policy", a2, string2), a2, string2.length() + a2, 33);
            spannableStringBuilder.setSpan(new StyleSpan(1), a2, string2.length() + a2, 33);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(string);
        }
        tuxTextView.setText(spannableStringBuilder);
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.e5);
        l.b(tuxTextView2, "");
        tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.x1, viewGroup, false);
    }
}
