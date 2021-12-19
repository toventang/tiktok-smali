package com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.cohost.a.a.e;
import com.bytedance.android.live.liveinteract.multilive.anchor.a.a;
import com.bytedance.android.live.liveinteract.multilive.b.a;
import com.bytedance.android.live.liveinteract.multilive.c.p;
import com.bytedance.android.live.liveinteract.multilive.c.q;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.ap;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.HashMap;

public final class a extends a.b implements View.OnClickListener {

    /* renamed from: g  reason: collision with root package name */
    public static final C0240a f11703g = new C0240a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public DataChannel f11704d;

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.android.livesdk.chatroom.model.c.a f11705e;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a f11706f;

    /* renamed from: h  reason: collision with root package name */
    private View f11707h;

    /* renamed from: i  reason: collision with root package name */
    private SwitchCompat f11708i;

    /* renamed from: j  reason: collision with root package name */
    private View f11709j;

    /* renamed from: k  reason: collision with root package name */
    private View f11710k;

    /* renamed from: l  reason: collision with root package name */
    private View f11711l;

    /* renamed from: m  reason: collision with root package name */
    private View f11712m;
    private View n;
    private SwitchCompat o;
    private View p;
    private SwitchCompat q;
    private View r;
    private final h s;
    private final h t;
    private HashMap u;

    static {
        Covode.recordClassIndex(6372);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.a.a.b
    public final void a() {
        HashMap hashMap = this.u;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final Room b() {
        return (Room) this.s.getValue();
    }

    public final int c() {
        return ((Number) this.t.getValue()).intValue();
    }

    @Override // com.bytedance.android.livesdk.ui.a, com.bytedance.android.live.liveinteract.multilive.anchor.a.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.a$a  reason: collision with other inner class name */
    public static final class C0240a {
        static {
            Covode.recordClassIndex(6373);
        }

        private C0240a() {
        }

        public /* synthetic */ C0240a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ c $getLeftBackButton$1$inlined;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(6374);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, c cVar) {
            super(0);
            this.this$0 = aVar;
            this.$getLeftBackButton$1$inlined = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            DataChannel dataChannel = this.this$0.f11704d;
            if (dataChannel != null) {
                dataChannel.c(com.bytedance.android.live.liveinteract.multilive.c.f.class);
            }
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.a<Room> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f11714a = new d();

        static {
            Covode.recordClassIndex(6377);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Room invoke() {
            return DataChannelGlobal.f34575d.b(ac.class);
        }
    }

    public final String e() {
        com.bytedance.android.livesdk.chatroom.model.c.a aVar = this.f11705e;
        if (aVar == null || aVar.f15740a != 1) {
            return "grid";
        }
        return "floating";
    }

    static final class e extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f11715a = new e();

        static {
            Covode.recordClassIndex(6378);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).liveId());
        }
    }

    private a() {
        this.s = i.a((h.f.a.a) d.f11714a);
        this.t = i.a((h.f.a.a) e.f11715a);
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
    }

    private final void f() {
        b.a aVar = new b.a(getContext());
        aVar.f18285b = y.a((int) R.string.e2w);
        aVar.a(R.string.eoa, (DialogInterface.OnClickListener) new f(this), false).b(R.string.dxl, (DialogInterface.OnClickListener) new g(this), false).a().show();
    }

    static final class c extends m implements h.f.a.a<View> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(6375);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* renamed from: a */
        public final View invoke() {
            MethodCollector.i(6774);
            LiveAutoRtlImageView liveAutoRtlImageView = new LiveAutoRtlImageView(this.this$0.getContext());
            liveAutoRtlImageView.setLayoutParams(new ViewGroup.LayoutParams(y.a(10.0f), y.a(18.0f)));
            liveAutoRtlImageView.setImageDrawable(y.c(2131234693));
            LinearLayout linearLayout = new LinearLayout(this.this$0.getContext());
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(y.a(18.0f) * 2, -2));
            linearLayout.addView(liveAutoRtlImageView);
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                /* class com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.a.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f11713a;

                static {
                    Covode.recordClassIndex(6376);
                }

                {
                    this.f11713a = r1;
                }

                public final void onClick(View view) {
                    this.f11713a.this$0.f10033a.dismiss();
                    DataChannel dataChannel = this.f11713a.this$0.f11704d;
                    if (dataChannel != null) {
                        dataChannel.c(com.bytedance.android.live.liveinteract.multilive.c.f.class);
                    }
                }
            });
            MethodCollector.o(6774);
            return linearLayout;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.d.b
    public final e.a d() {
        float b2;
        c cVar = new c(this);
        e.a aVar = new e.a();
        if (this.f11707h == null) {
            l.a("mRootView");
        } else {
            View view = this.f11707h;
            if (view == null) {
                l.a("mRootView");
            }
            int height = view.getHeight();
            if (!(height == 0 || getActivity() == null)) {
                b2 = (float) ap.b(getActivity(), (float) height);
                aVar.f10038b = (int) b2;
                String a2 = y.a((int) R.string.eml);
                l.b(a2, "");
                aVar.a(a2);
                aVar.f10040d = cVar.invoke();
                aVar.f10043g = new b(this, cVar);
                return aVar;
            }
        }
        b2 = 421.0f;
        aVar.f10038b = (int) b2;
        String a22 = y.a((int) R.string.eml);
        l.b(a22, "");
        aVar.a(a22);
        aVar.f10040d = cVar.invoke();
        aVar.f10043g = new b(this, cVar);
        return aVar;
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.a.a.b
    public final void a(Throwable th) {
        com.bytedance.android.livesdk.chatroom.model.c.a aVar;
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.f11706f;
        if (aVar2 == null) {
            l.a("mMultiGuestDataHolder");
        } else {
            com.bytedance.android.livesdk.chatroom.model.c.a aVar3 = aVar2.f11299i;
            if (aVar3 != null) {
                aVar = com.bytedance.android.livesdk.chatroom.model.c.a.a(aVar3.f15740a, aVar3.f15741b, aVar3.f15742c, aVar3.f15743d);
                this.f11705e = aVar;
                com.bytedance.android.livesdk.utils.f.a(getContext(), th, (int) R.string.gme);
            }
        }
        aVar = null;
        this.f11705e = aVar;
        com.bytedance.android.livesdk.utils.f.a(getContext(), th, (int) R.string.gme);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.a.a.b
    public final void a(int i2) {
        com.bytedance.android.livesdk.chatroom.model.c.a aVar;
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.f11706f;
        if (aVar2 == null) {
            l.a("mMultiGuestDataHolder");
        }
        com.bytedance.android.livesdk.chatroom.model.c.a aVar3 = null;
        if (aVar2 != null) {
            com.bytedance.android.livesdk.chatroom.model.c.a aVar4 = this.f11705e;
            if (aVar4 != null) {
                aVar = com.bytedance.android.livesdk.chatroom.model.c.a.a(aVar4.f15740a, aVar4.f15741b, aVar4.f15742c, aVar4.f15743d);
            } else {
                aVar = null;
            }
            aVar2.f11299i = aVar;
        }
        b(i2);
        if (i2 == 1) {
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar5 = this.f11706f;
            if (aVar5 == null) {
                l.a("mMultiGuestDataHolder");
            } else {
                aVar3 = aVar5.f11299i;
            }
            n nVar = n.NORMAL;
            if (aVar3 != null) {
                nVar = com.bytedance.android.live.liveinteract.multilive.anchor.e.c.a(aVar3.f15740a, aVar3.f15741b);
            }
            DataChannel dataChannel = this.f11704d;
            if (dataChannel != null) {
                dataChannel.c(q.class, new p(nVar));
            }
        }
    }

    private final void b(int i2) {
        com.bytedance.android.livesdk.chatroom.model.c.a aVar;
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.f11706f;
        if (aVar2 == null) {
            l.a("mMultiGuestDataHolder");
            aVar = null;
        } else {
            aVar = aVar2.f11299i;
        }
        if (aVar != null) {
            int i3 = aVar.f15740a;
            if (i3 == 0) {
                View view = this.f11712m;
                if (view == null) {
                    l.a("mFloatingWindowBackground");
                }
                view.setBackgroundResource(0);
                View view2 = this.n;
                if (view2 == null) {
                    l.a("mEqualLayoutBackground");
                }
                view2.setBackgroundResource(R.drawable.c93);
            } else if (i3 == 1) {
                View view3 = this.f11712m;
                if (view3 == null) {
                    l.a("mFloatingWindowBackground");
                }
                view3.setBackgroundResource(R.drawable.c93);
                View view4 = this.n;
                if (view4 == null) {
                    l.a("mEqualLayoutBackground");
                }
                view4.setBackgroundResource(0);
            }
            int i4 = aVar.f15741b;
            if (i4 == 0) {
                SwitchCompat switchCompat = this.f11708i;
                if (switchCompat == null) {
                    l.a("mSwitch");
                }
                switchCompat.setChecked(true);
            } else if (i4 == 1) {
                SwitchCompat switchCompat2 = this.f11708i;
                if (switchCompat2 == null) {
                    l.a("mSwitch");
                }
                switchCompat2.setChecked(false);
            } else if (i4 == 2) {
                SwitchCompat switchCompat3 = this.f11708i;
                if (switchCompat3 == null) {
                    l.a("mSwitch");
                }
                switchCompat3.setVisibility(8);
            }
            int i5 = aVar.f15742c;
            if (i5 == 0) {
                SwitchCompat switchCompat4 = this.o;
                if (switchCompat4 == null) {
                    l.a("mViewerSwitch");
                }
                switchCompat4.setChecked(true);
            } else if (i5 == 3) {
                SwitchCompat switchCompat5 = this.o;
                if (switchCompat5 == null) {
                    l.a("mViewerSwitch");
                }
                switchCompat5.setChecked(true);
            } else if (i5 == 4) {
                SwitchCompat switchCompat6 = this.o;
                if (switchCompat6 == null) {
                    l.a("mViewerSwitch");
                }
                switchCompat6.setChecked(false);
                SwitchCompat switchCompat7 = this.q;
                if (switchCompat7 == null) {
                    l.a("mFollowerSwitch");
                }
                switchCompat7.setChecked(false);
                if (i2 == 2) {
                    com.bytedance.android.live.liveinteract.platform.common.g.b.d("manual_close");
                }
            }
            int i6 = aVar.f15743d;
            if (i6 == 0) {
                SwitchCompat switchCompat8 = this.q;
                if (switchCompat8 == null) {
                    l.a("mFollowerSwitch");
                }
                switchCompat8.setChecked(false);
            } else if (i6 == 3) {
                SwitchCompat switchCompat9 = this.q;
                if (switchCompat9 == null) {
                    l.a("mFollowerSwitch");
                }
                switchCompat9.setChecked(true);
                SwitchCompat switchCompat10 = this.o;
                if (switchCompat10 == null) {
                    l.a("mViewerSwitch");
                }
                switchCompat10.setChecked(true);
            } else if (i6 == 4) {
                SwitchCompat switchCompat11 = this.q;
                if (switchCompat11 == null) {
                    l.a("mFollowerSwitch");
                }
                switchCompat11.setChecked(false);
            }
        } else {
            View view5 = this.f11712m;
            if (view5 == null) {
                l.a("mFloatingWindowBackground");
            }
            view5.setBackgroundResource(0);
            View view6 = this.n;
            if (view6 == null) {
                l.a("mEqualLayoutBackground");
            }
            view6.setBackgroundResource(0);
        }
    }

    public final void onClick(View view) {
        com.bytedance.android.livesdk.chatroom.model.c.a aVar;
        String str;
        Integer valueOf;
        l.d(view, "");
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.f11706f;
        if (aVar2 == null) {
            l.a("mMultiGuestDataHolder");
        }
        Long l2 = null;
        Integer num = null;
        Long l3 = null;
        if (aVar2 != null) {
            aVar = aVar2.f11299i;
        } else {
            aVar = null;
        }
        View view2 = this.f11712m;
        if (view2 == null) {
            l.a("mFloatingWindowBackground");
        }
        if (l.a(view, view2)) {
            if (aVar != null) {
                num = Integer.valueOf(aVar.f15740a);
            }
            if (num != null && num.intValue() == 1) {
                ao.a(y.e(), (int) R.string.e6q);
                return;
            }
            com.bytedance.android.livesdk.chatroom.model.c.a aVar3 = this.f11705e;
            if (aVar3 != null) {
                aVar3.f15740a = 1;
            }
            f();
            com.bytedance.android.live.liveinteract.multilive.b.a.b(e());
            return;
        }
        View view3 = this.n;
        if (view3 == null) {
            l.a("mEqualLayoutBackground");
        }
        if (!l.a(view, view3)) {
            View view4 = this.f11709j;
            if (view4 == null) {
                l.a("mSwitchLayout");
            }
            if (l.a(view, view4)) {
                com.bytedance.android.livesdk.chatroom.model.c.a aVar4 = this.f11705e;
                if (aVar4 != null) {
                    SwitchCompat switchCompat = this.f11708i;
                    if (switchCompat == null) {
                        l.a("mSwitch");
                    }
                    aVar4.f15741b = switchCompat.isChecked() ? 1 : 0;
                }
                f();
                SwitchCompat switchCompat2 = this.f11708i;
                if (switchCompat2 == null) {
                    l.a("mSwitch");
                }
                if (switchCompat2.isChecked()) {
                    str = "off";
                } else {
                    str = "on";
                }
                l.d(str, "");
                HashMap hashMap = new HashMap();
                com.bytedance.android.live.liveinteract.multilive.b.a.a(hashMap);
                hashMap.put("connection_type", "guest");
                hashMap.put("switch_to", str);
                com.bytedance.android.live.liveinteract.multilive.b.a.a("livesdk_layoutsettings_fixed_number_of_windows", hashMap);
                return;
            }
            View view5 = this.p;
            if (view5 == null) {
                l.a("mViewerSwitchLayout");
            }
            if (l.a(view, view5)) {
                SwitchCompat switchCompat3 = this.o;
                if (switchCompat3 == null) {
                    l.a("mViewerSwitch");
                }
                boolean isChecked = switchCompat3.isChecked();
                if (!com.bytedance.android.live.liveinteract.multilive.anchor.e.c.b()) {
                    ao.a(y.e(), (int) R.string.eh6);
                    return;
                }
                if (isChecked) {
                    com.bytedance.android.live.liveinteract.multilive.b.a.a(a.EnumC0242a.CLOSE_MODE);
                    com.bytedance.android.livesdk.chatroom.model.c.a aVar5 = this.f11705e;
                    if (aVar5 != null) {
                        aVar5.f15742c = 4;
                        aVar5.f15743d = 4;
                    }
                } else {
                    com.bytedance.android.livesdk.chatroom.model.c.a aVar6 = this.f11705e;
                    if (aVar6 != null) {
                        aVar6.f15742c = 3;
                    }
                }
                a.AbstractC0233a aVar7 = (a.AbstractC0233a) this.f10034b;
                if (aVar7 != null) {
                    Room b2 = b();
                    if (b2 != null) {
                        l3 = Long.valueOf(b2.getId());
                    }
                    aVar7.a(l3, Long.valueOf((long) c()), this.f11705e, 2);
                    return;
                }
                return;
            }
            View view6 = this.r;
            if (view6 == null) {
                l.a("mFollowerSwitchLayout");
            }
            if (l.a(view, view6)) {
                SwitchCompat switchCompat4 = this.q;
                if (switchCompat4 == null) {
                    l.a("mFollowerSwitch");
                }
                boolean isChecked2 = switchCompat4.isChecked();
                if (!com.bytedance.android.live.liveinteract.multilive.anchor.e.c.b()) {
                    ao.a(y.e(), (int) R.string.eh6);
                    return;
                }
                com.bytedance.android.live.liveinteract.multilive.b.a.a(a.EnumC0242a.MANUAL_SETTING);
                if (!isChecked2) {
                    com.bytedance.android.livesdk.chatroom.model.c.a aVar8 = this.f11705e;
                    if (aVar8 != null) {
                        aVar8.f15742c = 3;
                        aVar8.f15743d = 3;
                    }
                } else {
                    com.bytedance.android.livesdk.chatroom.model.c.a aVar9 = this.f11705e;
                    if (aVar9 != null) {
                        aVar9.f15743d = 4;
                    }
                }
                a.AbstractC0233a aVar10 = (a.AbstractC0233a) this.f10034b;
                if (aVar10 != null) {
                    Room b3 = b();
                    if (b3 != null) {
                        l2 = Long.valueOf(b3.getId());
                    }
                    aVar10.a(l2, Long.valueOf((long) c()), this.f11705e, 3);
                }
            }
        } else if (aVar == null || (valueOf = Integer.valueOf(aVar.f15740a)) == null || valueOf.intValue() != 0) {
            com.bytedance.android.livesdk.chatroom.model.c.a aVar11 = this.f11705e;
            if (aVar11 != null) {
                aVar11.f15740a = 0;
            }
            f();
            com.bytedance.android.live.liveinteract.multilive.b.a.b(e());
        } else {
            ao.a(y.e(), (int) R.string.e6q);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11717a;

        static {
            Covode.recordClassIndex(6380);
        }

        g(a aVar) {
            this.f11717a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.bytedance.android.livesdk.chatroom.model.c.a aVar;
            com.bytedance.android.live.liveinteract.multilive.b.a.a(this.f11717a.e(), "cancel");
            a aVar2 = this.f11717a;
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar3 = aVar2.f11706f;
            if (aVar3 == null) {
                l.a("mMultiGuestDataHolder");
            } else {
                com.bytedance.android.livesdk.chatroom.model.c.a aVar4 = aVar3.f11299i;
                if (aVar4 != null) {
                    aVar = com.bytedance.android.livesdk.chatroom.model.c.a.a(aVar4.f15740a, aVar4.f15741b, aVar4.f15742c, aVar4.f15743d);
                    aVar2.f11705e = aVar;
                    dialogInterface.dismiss();
                }
            }
            aVar = null;
            aVar2.f11705e = aVar;
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11716a;

        static {
            Covode.recordClassIndex(6379);
        }

        f(a aVar) {
            this.f11716a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            Long l2;
            dialogInterface.dismiss();
            long currentTimeMillis = System.currentTimeMillis();
            if (com.bytedance.android.live.liveinteract.multilive.anchor.e.c.f11640b.size() < com.bytedance.android.live.liveinteract.multilive.anchor.e.c.f11639a) {
                com.bytedance.android.live.liveinteract.multilive.anchor.e.c.f11640b.add(Long.valueOf(currentTimeMillis));
            } else {
                Long l3 = com.bytedance.android.live.liveinteract.multilive.anchor.e.c.f11640b.get(0);
                l.b(l3, "");
                if (currentTimeMillis - l3.longValue() < 60000) {
                    ao.a(y.e(), (int) R.string.eh6);
                    com.bytedance.android.live.liveinteract.multilive.b.a.a(this.f11716a.e(), "switch");
                }
                com.bytedance.android.live.liveinteract.multilive.anchor.e.c.f11640b.remove(0);
                com.bytedance.android.live.liveinteract.multilive.anchor.e.c.f11640b.add(Long.valueOf(currentTimeMillis));
            }
            a.AbstractC0233a aVar = (a.AbstractC0233a) this.f11716a.f10034b;
            if (aVar != null) {
                Room b2 = this.f11716a.b();
                if (b2 != null) {
                    l2 = Long.valueOf(b2.getId());
                } else {
                    l2 = null;
                }
                aVar.a(l2, Long.valueOf((long) this.f11716a.c()), this.f11716a.f11705e, 1);
            }
            com.bytedance.android.live.liveinteract.multilive.b.a.a(this.f11716a.e(), "switch");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0133  */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r7, android.view.ViewGroup r8, android.os.Bundle r9) {
        /*
        // Method dump skipped, instructions count: 320
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.a.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
