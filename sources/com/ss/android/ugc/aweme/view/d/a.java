package com.ss.android.ugc.aweme.view.d;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ProfileNaviServiceImpl;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.bu;
import com.ss.android.ugc.aweme.common.ag;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends com.google.android.material.bottomsheet.a implements bu {

    /* renamed from: c  reason: collision with root package name */
    public static final String f144198c = "profile_navi_intro_sheet_shown";

    /* renamed from: d  reason: collision with root package name */
    public static final C3844a f144199d = new C3844a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final Activity f144200a;

    /* renamed from: b  reason: collision with root package name */
    public final String f144201b;

    /* renamed from: com.ss.android.ugc.aweme.view.d.a$a  reason: collision with other inner class name */
    public static final class C3844a {
        static {
            Covode.recordClassIndex(94369);
        }

        private C3844a() {
        }

        public /* synthetic */ C3844a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.bu
    public final void a() {
        show();
    }

    static {
        Covode.recordClassIndex(94368);
    }

    @Override // com.ss.android.ugc.aweme.bu
    public final boolean b() {
        SharedPreferences preferences = this.f144200a.getPreferences(0);
        if (preferences != null) {
            return preferences.getBoolean(f144198c, false);
        }
        return false;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SharedPreferences preferences = this.f144200a.getPreferences(0);
        if (preferences != null) {
            SharedPreferences.Editor edit = preferences.edit();
            edit.putBoolean(f144198c, true);
            edit.apply();
        }
    }

    @Override // com.google.android.material.bottomsheet.a
    public final void onStart() {
        ViewGroup.LayoutParams layoutParams;
        super.onStart();
        View findViewById = findViewById(R.id.akq);
        if (findViewById != null && (layoutParams = findViewById.getLayoutParams()) != null) {
            Context context = getContext();
            l.b(context, "");
            layoutParams.height = (int) ag.a.a(context, 626.0f);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f144202a;

        static {
            Covode.recordClassIndex(94370);
        }

        b(a aVar) {
            this.f144202a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("exit_avatar_intro", new d().f66730a);
            this.f144202a.cancel();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f144203a;

        static {
            Covode.recordClassIndex(94371);
        }

        c(a aVar) {
            this.f144203a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.bn.a.a(this.f144203a.f144201b);
            this.f144203a.dismiss();
            a aVar = this.f144203a;
            l.b(view, "");
            ProfileNaviServiceImpl.a().a(aVar.f144200a, view, "avatar_intro_page");
        }
    }

    @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.h
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.aps);
        String str = this.f144201b;
        l.d(str, "");
        r.a("show_avatar_intro", new d().a("enter_from", str).a("enter_method", "click").f66730a);
        ((TuxIconView) findViewById(R.id.cta)).setOnClickListener(new b(this));
        TuxButton tuxButton = (TuxButton) findViewById(R.id.ctb);
        if (tuxButton != null) {
            tuxButton.setOnClickListener(new c(this));
        }
        v a2 = com.bytedance.lighten.a.r.a(Uri.parse("https://p16-amd-va.tiktokcdn.com/obj/musically-maliva-obj/navi_intro_sheet_img_09282021.png"));
        SmartImageView smartImageView = (SmartImageView) findViewById(R.id.cth);
        l.b(smartImageView, "");
        a2.f39906b = smartImageView.getContext();
        a2.E = (SmartImageView) findViewById(R.id.cth);
        a2.c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Activity activity, String str) {
        super(activity, R.style.a0a);
        l.d(activity, "");
        l.d(str, "");
        this.f144200a = activity;
        this.f144201b = str;
    }

    public /* synthetic */ a(Activity activity, String str, byte b2) {
        this(activity, str);
    }
}
