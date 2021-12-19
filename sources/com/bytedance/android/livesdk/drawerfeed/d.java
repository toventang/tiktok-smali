package com.bytedance.android.livesdk.drawerfeed;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.h.v;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import com.bytedance.android.live.gift.c;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.feed.FullDraggableContainer;
import com.bytedance.android.livesdk.g;
import com.bytedance.android.livesdk.ui.a;
import com.bytedance.android.livesdk.watch.b;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class d extends a implements b {

    /* renamed from: a  reason: collision with root package name */
    public DrawerLayout f17115a;

    /* renamed from: b  reason: collision with root package name */
    public Fragment f17116b;

    /* renamed from: c  reason: collision with root package name */
    LiveLoadingView f17117c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f17118d;

    /* renamed from: e  reason: collision with root package name */
    long f17119e;

    /* renamed from: f  reason: collision with root package name */
    public FullDraggableContainer f17120f;

    /* renamed from: g  reason: collision with root package name */
    public DataChannel f17121g;

    /* renamed from: h  reason: collision with root package name */
    public DrawerLayout.c f17122h;

    /* renamed from: i  reason: collision with root package name */
    private final f.a.b.a f17123i = new f.a.b.a();

    /* renamed from: j  reason: collision with root package name */
    private List<Object> f17124j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private DrawerLayout.c f17125k = new DrawerLayout.c() {
        /* class com.bytedance.android.livesdk.drawerfeed.d.AnonymousClass1 */

        static {
            Covode.recordClassIndex(9503);
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.c
        public final void onDrawerSlide(View view, float f2) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.c
        public final void onDrawerStateChanged(int i2) {
            if (i2 == 0 && d.this.f17115a != null) {
                d.this.f17115a.isDrawerOpen(8388613);
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.c
        public final void onDrawerClosed(View view) {
            g.a().c();
            if (d.this.getUserVisibleHint()) {
                com.bytedance.android.b.a.a.f6785g.a(false, d.this.f17121g);
                d.this.a();
                if (d.this.f17116b != null) {
                    d.this.f17116b.setUserVisibleHint(false);
                }
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.c
        public final void onDrawerOpened(View view) {
            g.a().b();
            if (d.this.getUserVisibleHint()) {
                com.bytedance.android.b.a.a aVar = com.bytedance.android.b.a.a.f6785g;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (aVar.a().size() == 0) {
                    aVar.f6791e = elapsedRealtime;
                }
                d dVar = d.this;
                HashMap hashMap = new HashMap();
                dVar.f17119e = SystemClock.elapsedRealtime();
                hashMap.put("request_page", com.bytedance.android.livesdk.chatroom.d.a().e());
                b.a.a("livesdk_more_anchor_show").a((Map<String, String>) hashMap).c(com.bytedance.android.b.a.a.f6785g.f6790d).a(dVar.f17121g).b();
            }
            if (d.this.getView() == null) {
                return;
            }
            if (d.this.f17116b == null) {
                d dVar2 = d.this;
                View view2 = dVar2.getView();
                if (dVar2.f17116b == null) {
                    dVar2.f17117c = (LiveLoadingView) view2.findViewById(R.id.anw);
                    dVar2.f17117c.setVisibility(0);
                    dVar2.f17116b = ((com.bytedance.android.b.a.b) com.bytedance.android.live.t.a.a(com.bytedance.android.b.a.b.class)).createDrawerFeedFragment(new com.bytedance.android.livesdkapi.g.b() {
                        /* class com.bytedance.android.livesdk.drawerfeed.d.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(9504);
                        }

                        @Override // com.bytedance.android.livesdkapi.g.b
                        public final void b() {
                            d.this.a();
                            d.this.a(false, true);
                        }

                        @Override // com.bytedance.android.livesdkapi.g.b
                        public final void c() {
                            d dVar = d.this;
                            if (dVar.f17117c != null) {
                                dVar.f17117c.setVisibility(8);
                            }
                        }

                        @Override // com.bytedance.android.livesdkapi.g.b
                        public final void a() {
                            d dVar = d.this;
                            if (dVar.f17115a != null && v.y(dVar.f17115a)) {
                                dVar.f17115a.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    });
                    if (dVar2.f17116b != null) {
                        dVar2.f17116b.setArguments(dVar2.f17118d);
                    }
                }
                if (dVar2.f17116b != null && !dVar2.f17116b.isAdded()) {
                    n a2 = dVar2.getChildFragmentManager().a();
                    a2.a(R.id.d1m, dVar2.f17116b);
                    a2.c();
                    return;
                }
                return;
            }
            d.this.f17116b.setUserVisibleHint(true);
        }
    };

    static {
        Covode.recordClassIndex(9502);
    }

    @Override // com.bytedance.android.livesdk.watch.b
    public final Fragment b() {
        return this;
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f17123i.a();
    }

    @Override // com.bytedance.android.livesdk.watch.b
    public final boolean c() {
        boolean z;
        DrawerLayout drawerLayout = this.f17115a;
        if (drawerLayout == null || !drawerLayout.isDrawerOpen(8388613) || !v.y(this.f17115a)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z).booleanValue();
    }

    public final void a() {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", String.valueOf(SystemClock.elapsedRealtime() - this.f17119e));
        hashMap.put("request_page", com.bytedance.android.livesdk.chatroom.d.a().e());
        if (!m.a(com.bytedance.android.livesdk.chatroom.d.a().e())) {
            hashMap.put("enter_live_method", com.bytedance.android.livesdk.chatroom.d.a().e());
        }
        b.a.a("livesdk_explore_duration").a((Map<String, String>) hashMap).c(com.bytedance.android.b.a.a.f6785g.f6790d).a(this.f17121g).b();
        b.a.a("livesdk_explore_close").a(this.f17121g).a("close_type", com.bytedance.android.b.a.a.f6785g.f6789c).a("has_banner", com.bytedance.android.b.a.a.f6785g.c()).b();
        com.bytedance.android.b.a.a.f6785g.f6789c = "scroll";
    }

    @Override // com.bytedance.android.livesdk.watch.b
    public final void a(DataChannel dataChannel) {
        this.f17121g = dataChannel;
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.livesdk.watch.b
    public final void a(boolean z) {
        FullDraggableContainer fullDraggableContainer = this.f17120f;
        if (fullDraggableContainer != null) {
            fullDraggableContainer.setDrawerEnable(z);
        }
    }

    @Override // com.bytedance.android.livesdk.watch.b
    public final void b(boolean z) {
        FullDraggableContainer fullDraggableContainer = this.f17120f;
        if (fullDraggableContainer != null) {
            fullDraggableContainer.setClearScreen(z);
        }
    }

    @Override // com.bytedance.android.livesdk.watch.b
    public final void a(boolean z, boolean z2) {
        DrawerLayout drawerLayout = this.f17115a;
        if (drawerLayout != null && v.y(drawerLayout)) {
            if (z) {
                this.f17115a.openDrawer(8388613, z2);
            } else {
                this.f17115a.closeDrawer(8388613, z2);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f17123i.a(com.bytedance.android.livesdk.an.a.a().a(c.class).d(new e(this)));
        DrawerLayout drawerLayout = (DrawerLayout) view.findViewById(R.id.apv);
        this.f17115a = drawerLayout;
        if (drawerLayout != null) {
            FullDraggableContainer fullDraggableContainer = this.f17120f;
            if (fullDraggableContainer != null) {
                fullDraggableContainer.setDrawerLayout(drawerLayout);
            }
            this.f17115a.addDrawerListener(this.f17125k);
            DrawerLayout.c cVar = this.f17122h;
            if (cVar != null) {
                this.f17115a.addDrawerListener(cVar);
            }
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.d1n);
        int a2 = (int) (((float) com.bytedance.common.utility.n.a(getContext())) - com.bytedance.common.utility.n.b(getContext(), 50.0f));
        if (a2 > 0) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.width = a2;
            viewGroup.setLayoutParams(layoutParams);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.xe, viewGroup, false);
    }
}
