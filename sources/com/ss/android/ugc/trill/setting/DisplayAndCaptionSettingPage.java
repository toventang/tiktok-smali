package com.ss.android.ugc.trill.setting;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.metrics.ab;
import com.ss.android.ugc.aweme.setting.serverpush.b.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;

@com.bytedance.ies.powerpage.a.a
public final class DisplayAndCaptionSettingPage extends com.ss.android.ugc.aweme.setting.page.a implements com.ss.android.ugc.aweme.setting.serverpush.b.c {

    /* renamed from: l  reason: collision with root package name */
    public static final a f150518l = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public String f150519e;

    /* renamed from: f  reason: collision with root package name */
    public String f150520f = "";

    /* renamed from: g  reason: collision with root package name */
    public CommonItemView f150521g;

    /* renamed from: h  reason: collision with root package name */
    public CommonItemView f150522h;

    /* renamed from: i  reason: collision with root package name */
    public CommonItemView f150523i;

    /* renamed from: j  reason: collision with root package name */
    public CommonItemView f150524j;

    /* renamed from: k  reason: collision with root package name */
    public CommonItemView f150525k;

    /* renamed from: m  reason: collision with root package name */
    private j f150526m;
    private SparseArray n;

    static {
        Covode.recordClassIndex(98987);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final View a(int i2) {
        if (this.n == null) {
            this.n = new SparseArray();
        }
        View view = (View) this.n.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.n.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.c
    public final void a(Exception exc) {
        l.d(exc, "");
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final void br_() {
        SparseArray sparseArray = this.n;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final int c() {
        return R.layout.aya;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.setting.page.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(98988);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final CommonItemView d() {
        CommonItemView commonItemView = this.f150523i;
        if (commonItemView == null) {
            l.a("autoTranslationToggle");
        }
        return commonItemView;
    }

    public final CommonItemView e() {
        CommonItemView commonItemView = this.f150524j;
        if (commonItemView == null) {
            l.a("ttsToggle");
        }
        return commonItemView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void f() {
        /*
            r4 = this;
            boolean r0 = com.ss.android.ugc.trill.setting.h.a()
            if (r0 == 0) goto L_0x0029
            com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService r0 = com.ss.android.ugc.trill.setting.TranslatedCaptionCacheServiceImpl.j()
            java.lang.String r3 = r0.f()
            int r1 = r3.hashCode()
            r0 = 50
            r2 = 0
            if (r1 == r0) goto L_0x0040
            r0 = 51
            if (r1 == r0) goto L_0x002a
        L_0x001b:
            java.lang.String r2 = ""
        L_0x001d:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r1 = r4.f150525k
            if (r1 != 0) goto L_0x0026
            java.lang.String r0 = "ttsVoiceItem"
            h.f.b.l.a(r0)
        L_0x0026:
            r1.setRightText(r2)
        L_0x0029:
            return
        L_0x002a:
            java.lang.String r0 = "3"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001b
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L_0x001d
            r0 = 2131831637(0x7f112b55, float:1.9296305E38)
            java.lang.String r2 = r1.getString(r0)
            goto L_0x001d
        L_0x0040:
            java.lang.String r0 = "2"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001b
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L_0x001d
            r0 = 2131831636(0x7f112b54, float:1.9296303E38)
            java.lang.String r2 = r1.getString(r0)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.trill.setting.DisplayAndCaptionSettingPage.f():void");
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DisplayAndCaptionSettingPage f150529a;

        static {
            Covode.recordClassIndex(98990);
        }

        c(DisplayAndCaptionSettingPage displayAndCaptionSettingPage) {
            this.f150529a = displayAndCaptionSettingPage;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ab.a("enter_general_setting").b("previous_page", "settings_page").b("enter_method", "click_button").f();
            r.a("display_settings", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "settings_page").f66730a);
            SmartRouter.buildRoute(this.f150529a.getContext(), "aweme://display/setting").open();
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DisplayAndCaptionSettingPage f150532a;

        static {
            Covode.recordClassIndex(98993);
        }

        f(DisplayAndCaptionSettingPage displayAndCaptionSettingPage) {
            this.f150532a = displayAndCaptionSettingPage;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("enter_transl_voice", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "settings_page").a("enter_method", this.f150532a.f150520f).f66730a);
            SmartRouter.buildRoute(this.f150532a.getContext(), "//translation/voice/setting").withParam("enter_method", this.f150532a.f150520f).open(1001);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DisplayAndCaptionSettingPage f150527a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f150528b;

        static {
            Covode.recordClassIndex(98989);
        }

        b(DisplayAndCaptionSettingPage displayAndCaptionSettingPage, ArrayList arrayList) {
            this.f150527a = displayAndCaptionSettingPage;
            this.f150528b = arrayList;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("enter_transl_lang", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "settings_page").a("enter_method", "translate_subtitle").f66730a);
            SmartRouter.buildRoute(this.f150527a.getContext(), "//translation/language/setting").withParam("translation_language", this.f150528b).withParam("selected_translation_language_code", this.f150527a.f150519e).withParam("enter_method", this.f150527a.f150520f).open(1000);
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DisplayAndCaptionSettingPage f150530a;

        static {
            Covode.recordClassIndex(98991);
        }

        d(DisplayAndCaptionSettingPage displayAndCaptionSettingPage) {
            this.f150530a = displayAndCaptionSettingPage;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            this.f150530a.d().setChecked(!this.f150530a.d().d());
            i.f150594a.storeBoolean("enable_translation", this.f150530a.d().d());
            DisplayAndCaptionSettingPage displayAndCaptionSettingPage = this.f150530a;
            displayAndCaptionSettingPage.a(displayAndCaptionSettingPage.d().d());
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "settings_page").a("enter_method", this.f150530a.f150520f);
            if (this.f150530a.d().d()) {
                str = "on";
            } else {
                str = "off";
            }
            r.a("change_transl_status", a2.a("to_status", str).f66730a);
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DisplayAndCaptionSettingPage f150531a;

        static {
            Covode.recordClassIndex(98992);
        }

        e(DisplayAndCaptionSettingPage displayAndCaptionSettingPage) {
            this.f150531a = displayAndCaptionSettingPage;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            this.f150531a.e().setChecked(!this.f150531a.e().d());
            i.f150594a.storeBoolean("enable_caption_tts", this.f150531a.e().d());
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "settings_page").a("enter_method", this.f150531a.f150520f);
            if (this.f150531a.e().d()) {
                str = "on";
            } else {
                str = "off";
            }
            r.a("change_tts_status", a2.a("tts_status", str).f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.c
    public final void a(com.ss.android.ugc.aweme.setting.serverpush.a.f fVar) {
        CommonItemView commonItemView;
        Resources resources;
        String string;
        if (fVar != null && fVar.ab != null && !fVar.ab.isEmpty()) {
            String str = "";
            if (fVar.ac != null) {
                com.ss.android.ugc.aweme.setting.serverpush.a.a aVar = fVar.ac;
                l.b(aVar, str);
                this.f150519e = aVar.getLanguageCode();
                commonItemView = this.f150522h;
                if (commonItemView == null) {
                    l.a("translationLanguageItem");
                }
                com.ss.android.ugc.aweme.setting.serverpush.a.a aVar2 = fVar.ac;
                l.b(aVar2, str);
                str = aVar2.getLocalName();
            } else {
                this.f150519e = "empty";
                commonItemView = this.f150522h;
                if (commonItemView == null) {
                    l.a("translationLanguageItem");
                }
                Context context = getContext();
                if (!(context == null || (resources = context.getResources()) == null || (string = resources.getString(R.string.dig)) == null)) {
                    str = string;
                }
            }
            commonItemView.setRightText(str);
            ArrayList arrayList = new ArrayList(fVar.ab);
            CommonItemView commonItemView2 = this.f150522h;
            if (commonItemView2 == null) {
                l.a("translationLanguageItem");
            }
            commonItemView2.setOnClickListener(new b(this, arrayList));
        }
    }

    public final void a(boolean z) {
        boolean z2;
        if (!z || !TranslatedCaptionCacheServiceImpl.j().d()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            CommonItemView commonItemView = this.f150524j;
            if (commonItemView == null) {
                l.a("ttsToggle");
            }
            commonItemView.setVisibility(0);
            if (h.a()) {
                CommonItemView commonItemView2 = this.f150525k;
                if (commonItemView2 == null) {
                    l.a("ttsVoiceItem");
                }
                commonItemView2.setVisibility(0);
                return;
            }
            return;
        }
        CommonItemView commonItemView3 = this.f150524j;
        if (commonItemView3 == null) {
            l.a("ttsToggle");
        }
        commonItemView3.setVisibility(8);
        CommonItemView commonItemView4 = this.f150525k;
        if (commonItemView4 == null) {
            l.a("ttsVoiceItem");
        }
        commonItemView4.setVisibility(8);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
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
    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.setting.page.a
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 267
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.trill.setting.DisplayAndCaptionSettingPage.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.setting.page.a
    public final void onActivityResult(int i2, int i3, Intent intent) {
        String a2;
        super.onActivityResult(i2, i3, intent);
        if (i3 == -1 && i2 == 1000) {
            if (intent != null) {
                String a3 = a(intent, "updated_language_name");
                if (!(a3 == null || a3.length() == 0)) {
                    CommonItemView commonItemView = this.f150522h;
                    if (commonItemView == null) {
                        l.a("translationLanguageItem");
                    }
                    commonItemView.setRightText(a3);
                }
                if (intent != null && (a2 = a(intent, "updated_language_code")) != null && a2.length() != 0) {
                    this.f150519e = a2;
                }
            }
        } else if (i2 == 1001) {
            f();
        }
    }
}
