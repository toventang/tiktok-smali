package com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hox.d;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.by;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.main.TabAlphaController;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class MainBottomTabView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, by> f99537a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f99538b;

    /* renamed from: c  reason: collision with root package name */
    private String f99539c;

    static {
        Covode.recordClassIndex(63482);
    }

    public MainBottomTabView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public MainBottomTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final boolean c() {
        return l.a((Object) this.f99539c, (Object) "Daily Mix");
    }

    public final HomeTabViewModel get() {
        Context context = getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return HomeTabViewModel.a.a((e) context);
    }

    private final int getScreenWidth() {
        int d2 = i.d(getContext());
        if (MSAdaptionService.c().c(getContext())) {
            return i.c(getContext());
        }
        return d2;
    }

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MainBottomTabView f99544a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f99545b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f99546c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f99547d;

        static {
            Covode.recordClassIndex(63485);
        }

        public c(MainBottomTabView mainBottomTabView, String str, String str2, boolean z) {
            this.f99544a = mainBottomTabView;
            this.f99545b = str;
            this.f99546c = str2;
            this.f99547d = z;
        }

        public final void run() {
            MainBottomTabView mainBottomTabView = this.f99544a;
            String str = this.f99545b;
            String str2 = this.f99546c;
            if (str2 == null) {
                str2 = "HOME";
            }
            if (!TextUtils.equals(str, str2) && !TextUtils.equals(str, "PUBLISH")) {
                a aVar = (a) mainBottomTabView.get().b(str);
                if (aVar != null) {
                    aVar.e();
                }
                mainBottomTabView.a(str);
                a aVar2 = (a) mainBottomTabView.get().b(str2);
                if (aVar2 != null) {
                    aVar2.b();
                }
                mainBottomTabView.b(str);
            }
        }
    }

    public final void b() {
        for (String str : this.f99537a.keySet()) {
            a aVar = (a) get().b(str);
            if (aVar != null) {
                aVar.q();
            }
        }
    }

    public final void a() {
        String str;
        int i2;
        if (getChildCount() > 0) {
            removeAllViews();
        }
        this.f99537a.clear();
        HomeTabViewModel homeTabViewModel = get();
        homeTabViewModel.f99529a.put("HOME", null);
        homeTabViewModel.f99529a.put("DISCOVER", null);
        homeTabViewModel.f99529a.put("MUSIC_DSP", null);
        homeTabViewModel.f99529a.put("PUBLISH", null);
        homeTabViewModel.f99529a.put("NOTIFICATION", null);
        homeTabViewModel.f99529a.put("USER", null);
        int screenWidth = getScreenWidth();
        Context context = getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        e eVar = (e) context;
        TabChangeManager a2 = TabChangeManager.a.a(eVar);
        List<by> a3 = get().a();
        Context context2 = getContext();
        Objects.requireNonNull(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        Intent intent = ((e) context2).getIntent();
        if (intent == null || (str = a(intent, "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB")) == null) {
            str = "";
        }
        l.b(str, "");
        if (!l.a((Object) str, (Object) "")) {
            int size = a3.size();
            i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                by byVar = a3.get(i2);
                if ((byVar instanceof d) && l.a((Object) str, (Object) byVar.d())) {
                    d dVar = (d) byVar;
                    if (dVar.f() != null) {
                        a2.a(dVar.f(), byVar.d(), dVar.g());
                        break;
                    }
                }
                i2++;
            }
        }
        i2 = -1;
        int size2 = a3.size();
        for (int i3 = 0; i3 < size2; i3++) {
            by byVar2 = a3.get(i3);
            if ((byVar2 instanceof d) && i2 != i3) {
                d dVar2 = (d) byVar2;
                if (dVar2.f() != null) {
                    a2.a(dVar2.f(), byVar2.d(), dVar2.g());
                }
            }
            View a4 = byVar2.a(com.ss.android.ugc.aweme.homepage.ui.view.tab.a.f99535a);
            if (a4 == null) {
                l.b();
            }
            this.f99537a.put(byVar2.d(), byVar2);
            get().a(byVar2.d(), byVar2);
            get().a(byVar2, a4);
            ScrollSwitchStateManager a5 = ScrollSwitchStateManager.a.a(eVar);
            if (TextUtils.equals("lark_inhouse", com.bytedance.ies.ugc.appcontext.d.s)) {
                a4.setOnLongClickListener(new a(a5, byVar2));
            }
            a4.setOnClickListener(new b(byVar2, a5));
            if (!l.a((Object) byVar2.d(), (Object) "PUBLISH")) {
                Context context3 = getContext();
                l.b(context3, "");
                a4.setBackground(context3.getResources().getDrawable(R.drawable.a_o));
            }
            int i4 = (int) (((float) screenWidth) / 5.0f);
            ALog.e("zzq_home_tab", "screenWidth: " + screenWidth + ", singleWidth: " + i4);
            a4.setLayoutParams(new LinearLayout.LayoutParams(i4, -1));
            addView(a4);
        }
        Bundle bundle = new Bundle();
        bundle.putString("tab", "UNLOGIN_NOTIFICATION");
        a2.a(com.ss.android.ugc.aweme.dd.c.class, "UNLOGIN_NOTIFICATION", bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putString("tab", "UNLOGIN_PROFILE");
        a2.a(com.ss.android.ugc.aweme.dd.c.class, "UNLOGIN_PROFILE", bundle2);
    }

    public final void setTopTabName(String str) {
        this.f99539c = str;
        a("MUSIC_DSP");
        b("MUSIC_DSP");
    }

    static final class a implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScrollSwitchStateManager f99540a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ by f99541b;

        static {
            Covode.recordClassIndex(63483);
        }

        a(ScrollSwitchStateManager scrollSwitchStateManager, by byVar) {
            this.f99540a = scrollSwitchStateManager;
            this.f99541b = byVar;
        }

        public final boolean onLongClick(View view) {
            ScrollSwitchStateManager scrollSwitchStateManager = this.f99540a;
            String d2 = this.f99541b.d();
            l.d(d2, "");
            scrollSwitchStateManager.f99146h.setValue(d2);
            return true;
        }
    }

    public final void setAlpha(float f2) {
        TabAlphaController a2 = TabAlphaController.a();
        l.b(a2, "");
        if (!a2.f109101b) {
            super.setAlpha(f2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        a aVar;
        boolean z = !TextUtils.equals(str, "HOME");
        if (TextUtils.equals(str, "MUSIC_DSP")) {
            z = !c();
        }
        for (String str2 : this.f99537a.keySet()) {
            if (!(this.f99537a.get(str2) == null || (aVar = (a) get().b(str2)) == null)) {
                aVar.setActivated(z);
            }
        }
    }

    public final void b(String str) {
        boolean z;
        if (TextUtils.equals(str, "HOME") || (TextUtils.equals(str, "MUSIC_DSP") && c())) {
            z = false;
        } else {
            z = true;
        }
        if (!this.f99538b || !TextUtils.equals(str, "HOME")) {
            this.f99538b = false;
            if (!z) {
                setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.c9));
            } else if (c.b.f66221a.q) {
                setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.f159928l));
                b();
                return;
            } else {
                setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.f159928l));
            }
            b();
            a aVar = (a) get().b("HOME");
            if (aVar != null) {
                aVar.a(str);
                return;
            }
            return;
        }
        this.f99538b = false;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ by f99542a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ScrollSwitchStateManager f99543b;

        static {
            Covode.recordClassIndex(63484);
        }

        b(by byVar, ScrollSwitchStateManager scrollSwitchStateManager) {
            this.f99542a = byVar;
            this.f99543b = scrollSwitchStateManager;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            boolean z = false;
            Boolean bool = false;
            a.b.f109011a.f109002c = false;
            a.b.f109011a.f109006g = false;
            AVExternalServiceImpl.a().shoutOutsService().setInMainTab(l.a((Object) this.f99542a.d(), (Object) "HOME"));
            this.f99543b.e(this.f99542a.d());
            if (com.ss.android.ugc.aweme.inbox.b.b.b() && l.a((Object) this.f99542a.d(), (Object) "NOTIFICATION")) {
                if (view != null) {
                    Long l2 = o.f68439a.get(view);
                    long nanoTime = System.nanoTime() / 1000000;
                    if (l2 == null) {
                        o.f68439a.put(view, Long.valueOf(nanoTime));
                    } else {
                        if (nanoTime - l2.longValue() <= 400) {
                            z = true;
                        } else {
                            o.f68439a.put(view, Long.valueOf(nanoTime));
                        }
                        bool = Boolean.valueOf(z);
                    }
                }
                l.b(bool, "");
                if (bool.booleanValue()) {
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.notice.api.b.a());
                }
            }
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a(int i2, int i3) {
        a aVar;
        for (Map.Entry<String, by> entry : this.f99537a.entrySet()) {
            by value = entry.getValue();
            if (!TextUtils.equals(entry.getKey(), "PUBLISH") && (aVar = (a) get().a(value)) != null) {
                aVar.setPadding(0, i2, 0, i3);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ MainBottomTabView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private MainBottomTabView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(4438);
        setOrientation(0);
        this.f99537a = new HashMap<>();
        this.f99538b = true;
        this.f99539c = "Daily Mix";
        MethodCollector.o(4438);
    }
}
