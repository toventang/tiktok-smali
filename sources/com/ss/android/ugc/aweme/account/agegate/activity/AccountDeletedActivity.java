package com.ss.android.ugc.aweme.account.agegate.activity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.AgeGateService;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.profile.model.AgeGateInfo;
import com.ss.android.ugc.aweme.profile.model.AgeGateOption;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.bt;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class AccountDeletedActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f62587c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final User f62588a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f62589b;

    /* renamed from: d  reason: collision with root package name */
    private final h f62590d = i.a((h.f.a.a) new e(this));

    /* renamed from: e  reason: collision with root package name */
    private List<com.ss.android.ugc.aweme.account.agegate.model.a> f62591e;

    /* renamed from: f  reason: collision with root package name */
    private List<AgeGateOption> f62592f;

    /* renamed from: g  reason: collision with root package name */
    private HashMap f62593g;

    static {
        Covode.recordClassIndex(38518);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f62593g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f62593g == null) {
            this.f62593g = new HashMap();
        }
        View view = (View) this.f62593g.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f62593g.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final com.ss.android.ugc.aweme.account.view.a a() {
        return (com.ss.android.ugc.aweme.account.view.a) this.f62590d.getValue();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38519);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class e extends m implements h.f.a.a<com.ss.android.ugc.aweme.account.view.a> {
        final /* synthetic */ AccountDeletedActivity this$0;

        static {
            Covode.recordClassIndex(38524);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AccountDeletedActivity accountDeletedActivity) {
            super(0);
            this.this$0 = accountDeletedActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.account.view.a invoke() {
            return new com.ss.android.ugc.aweme.account.view.a(this.this$0);
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ AgeGateOption $item;
        final /* synthetic */ com.ss.android.ugc.aweme.account.agegate.model.a $optionAction;
        final /* synthetic */ AccountDeletedActivity this$0;

        static {
            Covode.recordClassIndex(38520);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.ss.android.ugc.aweme.account.agegate.model.a aVar, AgeGateOption ageGateOption, AccountDeletedActivity accountDeletedActivity) {
            super(0);
            this.$optionAction = aVar;
            this.$item = ageGateOption;
            this.this$0 = accountDeletedActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (this.$optionAction.f62773c) {
                TuxButton tuxButton = (TuxButton) this.this$0._$_findCachedViewById(R.id.a17);
                l.b(tuxButton, "");
                tuxButton.setEnabled(true);
                ((TuxButton) this.this$0._$_findCachedViewById(R.id.a17)).setOnClickListener(new View.OnClickListener(this) {
                    /* class com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f62594a;

                    static {
                        Covode.recordClassIndex(38521);
                    }

                    {
                        this.f62594a = r1;
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        String str = this.f62594a.$item.type;
                        if (str != null) {
                            com.ss.android.ugc.aweme.account.agegate.util.c.a(str);
                        }
                        String str2 = this.f62594a.$item.type;
                        if (str2 != null && str2.hashCode() == -1411068529 && str2.equals("appeal")) {
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f62594a.$item.url));
                            intent.addFlags(268435456);
                            intent.addCategory("android.intent.category.BROWSABLE");
                            try {
                                AccountDeletedActivity accountDeletedActivity = this.f62594a.this$0;
                                com.ss.android.ugc.tiktok.security.a.a.a(intent, accountDeletedActivity);
                                accountDeletedActivity.startActivity(intent);
                            } catch (ActivityNotFoundException unused) {
                                SmartRouter.buildRoute(this.f62594a.this$0, "//webview").withParam(Uri.parse(this.f62594a.$item.url)).open();
                            }
                        } else {
                            SmartRouter.buildRoute(this.f62594a.this$0, "//webview").withParam("url", this.f62594a.$item.url).withParam("hide_nav_bar", true).open();
                        }
                    }
                });
            }
            return z.f158842a;
        }
    }

    public AccountDeletedActivity() {
        User f2 = cj.f();
        l.b(f2, "");
        this.f62588a = f2;
        this.f62591e = new ArrayList();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccountDeletedActivity f62595a;

        static {
            Covode.recordClassIndex(38522);
        }

        c(AccountDeletedActivity accountDeletedActivity) {
            this.f62595a = accountDeletedActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AgeGateService.f62568a = false;
            AccountDeletedActivity accountDeletedActivity = this.f62595a;
            if (!accountDeletedActivity.f62589b) {
                com.ss.android.ugc.aweme.account.agegate.util.c.a("logout");
                bt.a(accountDeletedActivity.a());
                cj.a(new d(accountDeletedActivity));
                accountDeletedActivity.f62589b = true;
                cj.g().logout("age_gate_delete_account", "user_logout");
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.fe);
        List<AgeGateOption> list = null;
        if (this.f62588a.getAgeGateInfo() != null) {
            AgeGateInfo ageGateInfo = this.f62588a.getAgeGateInfo();
            if (ageGateInfo != null) {
                list = ageGateInfo.getOptionList();
            }
            this.f62592f = list;
            TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.adh);
            l.b(tuxTextView, "");
            tuxTextView.setText(this.f62588a.getAgeGateInfo().getContent());
            TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.ak2);
            l.b(tuxTextView2, "");
            tuxTextView2.setText(this.f62588a.getAgeGateInfo().getTitle());
        } else {
            TuxTextView tuxTextView3 = (TuxTextView) _$_findCachedViewById(R.id.adh);
            l.b(tuxTextView3, "");
            tuxTextView3.setText((CharSequence) null);
            TuxTextView tuxTextView4 = (TuxTextView) _$_findCachedViewById(R.id.ak2);
            l.b(tuxTextView4, "");
            tuxTextView4.setText((CharSequence) null);
        }
        List<AgeGateOption> list2 = this.f62592f;
        if (list2 != null) {
            for (AgeGateOption ageGateOption : list2) {
                com.ss.android.ugc.aweme.account.agegate.model.a aVar = new com.ss.android.ugc.aweme.account.agegate.model.a(ageGateOption.content);
                aVar.f62771a = new b(aVar, ageGateOption, this);
                this.f62591e.add(aVar);
            }
        }
        com.ss.android.ugc.aweme.account.agegate.a.a aVar2 = new com.ss.android.ugc.aweme.account.agegate.a.a(this);
        List<com.ss.android.ugc.aweme.account.agegate.model.a> list3 = this.f62591e;
        l.d(list3, "");
        aVar2.f62580a.clear();
        aVar2.f62580a.addAll(list3);
        aVar2.notifyDataSetChanged();
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.bq);
        l.b(recyclerView, "");
        recyclerView.setAdapter(aVar2);
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.bq);
        l.b(recyclerView2, "");
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        ((TuxButton) _$_findCachedViewById(R.id.a15)).setOnClickListener(new c(this));
        TuxButton tuxButton = (TuxButton) _$_findCachedViewById(R.id.a17);
        l.b(tuxButton, "");
        tuxButton.setEnabled(false);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onCreate", false);
    }

    static final class d implements IAccountService.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccountDeletedActivity f62596a;

        static {
            Covode.recordClassIndex(38523);
        }

        d(AccountDeletedActivity accountDeletedActivity) {
            this.f62596a = accountDeletedActivity;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.b
        public final void onAccountResult(int i2, boolean z, int i3, User user) {
            this.f62596a.f62589b = false;
            bt.b(this.f62596a.a());
        }
    }
}
