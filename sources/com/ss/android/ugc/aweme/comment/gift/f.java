package com.ss.android.ugc.aweme.comment.gift;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.depend.d.b.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.m.p;
import h.v;
import java.util.Map;
import java.util.Objects;

public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final a f71862c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final androidx.fragment.app.e f71863a;

    /* renamed from: b  reason: collision with root package name */
    public final GiftViewModel f71864b;

    /* renamed from: d  reason: collision with root package name */
    private final Fragment f71865d;

    /* renamed from: e  reason: collision with root package name */
    private final String f71866e;

    /* renamed from: f  reason: collision with root package name */
    private final String f71867f;

    /* renamed from: g  reason: collision with root package name */
    private final String f71868g;

    static {
        Covode.recordClassIndex(44197);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44198);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static String a() {
        if (com.ss.android.ugc.aweme.language.d.c()) {
            return "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
        }
        return "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
    }

    private final void c() {
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f71866e).a("group_id", this.f71867f).a("author_id", this.f71868g).a("current_balance", this.f71864b.d().getValue());
        l.b(a2, "");
        r.a("show_underage_recharge_prompt", a2.f66730a);
    }

    private final View b() {
        String string = this.f71863a.getResources().getString(R.string.hbt);
        l.b(string, "");
        String string2 = this.f71863a.getResources().getString(R.string.hbq);
        l.b(string2, "");
        String string3 = this.f71863a.getResources().getString(R.string.hbs);
        l.b(string3, "");
        View a2 = com.a.a(LayoutInflater.from(this.f71863a), R.layout.jl, null, false);
        View findViewById = a2.findViewById(R.id.di_);
        Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(string);
        View findViewById2 = a2.findViewById(R.id.di7);
        Objects.requireNonNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        String str = string2 + "  " + string3 + "  ";
        SpannableString spannableString = new SpannableString(str);
        ImageSpan imageSpan = new ImageSpan(this.f71863a, 2131231223, 1);
        StyleSpan styleSpan = new StyleSpan(1);
        androidx.fragment.app.e eVar = this.f71863a;
        if (eVar == null) {
            l.b();
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(androidx.core.content.b.c(eVar, R.color.b_));
        int a3 = p.a((CharSequence) str, string3, 0, false, 6);
        int length = string3.length() + a3;
        spannableString.setSpan(styleSpan, a3, length, 33);
        spannableString.setSpan(foregroundColorSpan, a3, length, 33);
        spannableString.setSpan(imageSpan, str.length() - 1, str.length(), 33);
        spannableString.setSpan(new b(this), a3, str.length(), 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        l.b(a2, "");
        return a2;
    }

    public static final class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f71869a;

        static {
            Covode.recordClassIndex(44199);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(f fVar) {
            this.f71869a = fVar;
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            l.d(view, "");
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "recharge_panel");
            l.b(a2, "");
            r.a("click_recharge_learn_more", a2.f66730a);
            SmartRouter.buildRoute(this.f71869a.f71863a, "aweme://webview").withParam(Uri.parse("https://www.tiktok.com/legal/virtual-items")).open();
        }
    }

    public static final class e implements com.bytedance.android.livesdkapi.depend.d.b.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f71873a;

        static {
            Covode.recordClassIndex(44202);
        }

        @Override // com.bytedance.android.livesdkapi.depend.d.b.b
        public final void a(int i2, int i3, String str) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(f fVar) {
            this.f71873a = fVar;
        }

        @Override // com.bytedance.android.livesdkapi.depend.d.b.b
        public final void a(long j2) {
            this.f71873a.f71864b.a("from_recharge", this.f71873a.f71863a, 1, j2);
        }

        @Override // com.bytedance.android.livesdkapi.depend.d.b.b
        public final void a(Exception exc, String str) {
            this.f71873a.f71864b.a("from_recharge", this.f71873a.f71863a, 0, 0);
        }
    }

    public final void b(String str) {
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f71866e).a("group_id", this.f71867f).a("author_id", this.f71868g).a("enter_method", str).a("current_balance", this.f71864b.d().getValue());
        l.b(a2, "");
        r.a("dismiss_underage_recharge_prompt", a2.f66730a);
    }

    public final void a(String str) {
        l.d(str, "");
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        Boolean bool = (Boolean) s.k().a("can_recharge", true);
        Integer num = (Integer) s.k().a("low_age_user_limit", 18);
        String str2 = (String) s.k().a("live_sdk_appeal_webview", "");
        if (com.google.c.a.p.a(str2)) {
            str2 = a();
        }
        if (!bool.booleanValue()) {
            l.b(num, "");
            a(num.intValue(), str2);
            return;
        }
        h.p[] pVarArr = new h.p[6];
        pVarArr[0] = v.a("video_enter_from", this.f71866e);
        pVarArr[1] = v.a("video_enter_method", this.f71866e);
        pVarArr[2] = v.a("video_group_id", this.f71867f);
        pVarArr[3] = v.a("video_author_id", this.f71868g);
        String str3 = this.f71864b.f71912d;
        if (str3 == null) {
            str3 = "";
        }
        pVarArr[4] = v.a("video_request_id", str3);
        pVarArr[5] = v.a("charge_reason", str);
        Map<String, String> a2 = ag.a(pVarArr);
        Bundle bundle = new Bundle();
        bundle.putInt("key_bundle_charge_source", 4);
        d.a aVar = new d.a();
        aVar.a(b());
        aVar.a(a2);
        ILiveOuterService s2 = LiveOuterService.s();
        l.b(s2, "");
        androidx.fragment.app.d a3 = s2.d().a(this.f71863a, new e(this), bundle, aVar.a());
        l.b(a3, "");
        a3.showNow(this.f71865d.getChildFragmentManager(), "CommentGiftChoosePanel");
    }

    /* access modifiers changed from: package-private */
    public static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f71870a;

        static {
            Covode.recordClassIndex(44200);
        }

        c(f fVar) {
            this.f71870a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            this.f71870a.b("click_dismiss");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f71871a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f71872b;

        static {
            Covode.recordClassIndex(44201);
        }

        d(f fVar, String str) {
            this.f71871a = fVar;
            this.f71872b = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            ILiveOuterService s = LiveOuterService.s();
            l.b(s, "");
            s.d().a(this.f71871a.f71863a, Uri.parse(this.f71872b));
            this.f71871a.b("click_contact_us");
        }
    }

    private final void a(int i2, String str) {
        a.C0731a aVar = new a.C0731a(this.f71863a);
        aVar.f33402b = this.f71863a.getResources().getString(R.string.hbu, String.valueOf(i2));
        aVar.b(R.string.gn1, (DialogInterface.OnClickListener) new c(this), false).a(R.string.hbv, (DialogInterface.OnClickListener) new d(this, str), false).a().c().show();
        c();
    }

    public f(Fragment fragment, androidx.fragment.app.e eVar, GiftViewModel giftViewModel, String str, String str2, String str3) {
        l.d(fragment, "");
        l.d(eVar, "");
        l.d(giftViewModel, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f71865d = fragment;
        this.f71863a = eVar;
        this.f71864b = giftViewModel;
        this.f71866e = str;
        this.f71867f = str2;
        this.f71868g = str3;
    }
}
