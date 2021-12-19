package com.bytedance.android.livesdk.drawerfeed;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.gift.c;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.d;
import com.bytedance.android.livesdk.g;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.common.utility.h;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a extends v {

    /* renamed from: a  reason: collision with root package name */
    public DrawerLayout f17099a;

    /* renamed from: b  reason: collision with root package name */
    public Fragment f17100b;

    /* renamed from: c  reason: collision with root package name */
    public LiveLoadingView f17101c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f17102d;

    /* renamed from: e  reason: collision with root package name */
    String f17103e;

    /* renamed from: f  reason: collision with root package name */
    long f17104f;

    /* renamed from: g  reason: collision with root package name */
    private List<DrawerLayout.c> f17105g;

    /* renamed from: h  reason: collision with root package name */
    private final f.a.b.a f17106h = new f.a.b.a();

    /* renamed from: i  reason: collision with root package name */
    private boolean f17107i = false;

    /* renamed from: j  reason: collision with root package name */
    private DrawerLayout.c f17108j = new DrawerLayout.c() {
        /* class com.bytedance.android.livesdk.drawerfeed.a.AnonymousClass2 */

        static {
            Covode.recordClassIndex(9499);
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.c
        public final void onDrawerSlide(View view, float f2) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.c
        public final void onDrawerClosed(View view) {
            g.a().c();
            if (a.this.getUserVisibleHint()) {
                a.this.d();
            }
            a.this.dismissAllowingStateLoss();
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.c
        public final void onDrawerStateChanged(int i2) {
            if (i2 == 0 && a.this.f17099a != null && !a.this.f17099a.isDrawerOpen(8388613)) {
                a.this.f17099a.closeDrawer(8388613);
                a.this.dismissAllowingStateLoss();
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.c
        public final void onDrawerOpened(View view) {
            String str;
            g.a().b();
            if (a.this.getUserVisibleHint()) {
                a aVar = a.this;
                if (!m.a(aVar.f17103e)) {
                    str = aVar.f17103e;
                } else {
                    str = "button";
                }
                HashMap hashMap = new HashMap();
                aVar.f17104f = SystemClock.elapsedRealtime();
                hashMap.put("request_page", d.a().e());
                b.a.a("livesdk_more_anchor_show").a((Map<String, String>) hashMap).c(str).a(aVar.p).b();
            }
        }
    };

    static {
        Covode.recordClassIndex(9496);
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.xd);
        bVar.f22374a = 0;
        bVar.f22375b = R.style.zn;
        return bVar;
    }

    @Override // com.bytedance.android.livesdk.v
    public final boolean i() {
        DrawerLayout drawerLayout = this.f17099a;
        if (drawerLayout == null || !androidx.core.h.v.y(drawerLayout) || !this.f17099a.isDrawerOpen(8388613)) {
            return false;
        }
        this.f17099a.closeDrawer(8388613);
        return true;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Window window = getDialog().getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.addFlags(Integer.MIN_VALUE);
                window.setNavigationBarColor(-16777216);
                window.setLayout(-1, -1);
            }
            if (getActivity() != null && com.bytedance.android.live.core.f.d.a(getActivity())) {
                window.clearFlags(1024);
            }
        }
    }

    public final void d() {
        String str;
        if (!m.a(this.f17103e)) {
            str = this.f17103e;
        } else {
            str = "button";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("duration", String.valueOf(SystemClock.elapsedRealtime() - this.f17104f));
        hashMap.put("request_page", d.a().e());
        if (!m.a(d.a().e())) {
            hashMap.put("enter_live_method", d.a().e());
        }
        b.a.a("livesdk_more_anchor_duration").a((Map<String, String>) hashMap).c(str).a(this.p).b();
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.f17106h.a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean a(int i2, KeyEvent keyEvent) {
        boolean z;
        if (4 == i2) {
            if (keyEvent.getAction() == 0) {
                this.f17107i = true;
                return false;
            }
        } else if (4 != i2) {
            return false;
        }
        if (1 != keyEvent.getAction()) {
            return false;
        }
        if (this.f17107i) {
            z = i();
        } else {
            z = false;
        }
        this.f17107i = false;
        return z;
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f17106h.a(com.bytedance.android.livesdk.an.a.a().a(c.class).d(new b(this)));
        DrawerLayout drawerLayout = (DrawerLayout) view.findViewById(R.id.apv);
        this.f17099a = drawerLayout;
        drawerLayout.addDrawerListener(this.f17108j);
        if (h.b(this.f17105g)) {
            for (DrawerLayout.c cVar : this.f17105g) {
                this.f17099a.addDrawerListener(cVar);
            }
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.d1n);
        int a2 = (int) (((float) n.a(getContext())) - n.b(getContext(), 50.0f));
        if (a2 > 0) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.width = a2;
            viewGroup.setLayoutParams(layoutParams);
            this.f17099a.post(new Runnable() {
                /* class com.bytedance.android.livesdk.drawerfeed.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(9497);
                }

                public final void run() {
                    if (a.this.isVisible()) {
                        if (a.this.f17099a != null) {
                            a.this.f17099a.openDrawer(8388613);
                        }
                        if (a.this.f17100b == null) {
                            a.this.f17101c = (LiveLoadingView) view.findViewById(R.id.anw);
                            a.this.f17101c.setVisibility(0);
                            a.this.f17100b = ((com.bytedance.android.b.a.b) com.bytedance.android.live.t.a.a(com.bytedance.android.b.a.b.class)).createDrawerFeedFragment(new com.bytedance.android.livesdkapi.g.b() {
                                /* class com.bytedance.android.livesdk.drawerfeed.a.AnonymousClass1.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(9498);
                                }

                                @Override // com.bytedance.android.livesdkapi.g.b
                                public final void b() {
                                    a.this.d();
                                    a.this.dismiss();
                                }

                                @Override // com.bytedance.android.livesdkapi.g.b
                                public final void c() {
                                    a aVar = a.this;
                                    if (aVar.f17101c != null) {
                                        aVar.f17101c.setVisibility(8);
                                    }
                                }

                                @Override // com.bytedance.android.livesdkapi.g.b
                                public final void a() {
                                    a aVar = a.this;
                                    if (aVar.f17099a != null && androidx.core.h.v.y(aVar.f17099a)) {
                                        aVar.f17099a.requestDisallowInterceptTouchEvent(true);
                                    }
                                }
                            });
                            if (a.this.f17100b != null) {
                                a.this.f17100b.setArguments(a.this.f17102d);
                            }
                        }
                        if (a.this.f17100b != null && !a.this.f17100b.isAdded()) {
                            androidx.fragment.app.n a2 = a.this.getChildFragmentManager().a();
                            a2.a(R.id.d1m, a.this.f17100b);
                            a2.c();
                        }
                    }
                }
            });
            getDialog().setOnKeyListener(new c(this));
        }
    }

    public static a a(List<DrawerLayout.c> list, Bundle bundle, String str) {
        a aVar = new a();
        aVar.f17105g = list;
        aVar.f17102d = bundle;
        aVar.f17103e = str;
        return aVar;
    }
}
