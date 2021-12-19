package com.bytedance.android.livesdk;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.performance.PanelOpenCostTimesSetting;
import com.bytedance.android.livesdk.ui.LiveFrameLayout;
import com.bytedance.android.livesdk.utils.ak;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public abstract class v extends androidx.fragment.app.d {
    public static final a s = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private final ak.a f22372a = ak.a.DEFAULT;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f22373b;
    public boolean o;
    public DataChannel p;
    protected b q;
    public DialogInterface.OnDismissListener r;

    public static final class b {
        public static final a n = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public int f22374a = 1;

        /* renamed from: b  reason: collision with root package name */
        public int f22375b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f22376c = 1;

        /* renamed from: d  reason: collision with root package name */
        public boolean f22377d = true;

        /* renamed from: e  reason: collision with root package name */
        public boolean f22378e = true;

        /* renamed from: f  reason: collision with root package name */
        public float f22379f = 0.5f;

        /* renamed from: g  reason: collision with root package name */
        public int f22380g;

        /* renamed from: h  reason: collision with root package name */
        public int f22381h = -1;

        /* renamed from: i  reason: collision with root package name */
        public int f22382i = Integer.MIN_VALUE;

        /* renamed from: j  reason: collision with root package name */
        public int f22383j = 50;

        /* renamed from: k  reason: collision with root package name */
        public Drawable f22384k = new ColorDrawable(0);

        /* renamed from: l  reason: collision with root package name */
        public int f22385l;

        /* renamed from: m  reason: collision with root package name */
        public int f22386m;

        static {
            Covode.recordClassIndex(13210);
        }

        public static final class a {
            static {
                Covode.recordClassIndex(13211);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        public final void a(Drawable drawable) {
            l.d(drawable, "");
            this.f22384k = drawable;
        }

        public b(int i2) {
            this.f22386m = i2;
        }
    }

    static {
        Covode.recordClassIndex(13208);
    }

    public void a() {
        HashMap hashMap = this.f22373b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void a(Dialog dialog) {
        l.d(dialog, "");
    }

    public View a_(int i2) {
        if (this.f22373b == null) {
            this.f22373b = new HashMap();
        }
        View view = (View) this.f22373b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f22373b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public abstract b b();

    public boolean i() {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(13209);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public ak.a c_() {
        return this.f22372a;
    }

    public final boolean n() {
        Dialog dialog = getDialog();
        if (dialog == null || !dialog.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.o = false;
        super.onDestroyView();
        a();
    }

    private final void d() {
        bf.a().b();
        g.a().b();
        com.bytedance.android.livesdkapi.m.c.a(this, "mDismissed", false);
        com.bytedance.android.livesdkapi.m.c.a(this, "mShownByMe", true);
    }

    @Override // androidx.fragment.app.d
    public void dismiss() {
        if (getFragmentManager() == null) {
            com.bytedance.android.live.core.c.a.a(3, "LiveDialogFragment", "dismiss:" + this + " not associate with a fragment manager");
        } else {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.d
    public void dismissAllowingStateLoss() {
        if (getFragmentManager() == null) {
            com.bytedance.android.live.core.c.a.a(3, "LiveDialogFragment", "dismissAllowingStateLoss:" + this + " not associate with a fragment manager");
        } else {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onStart() {
        int i2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            b bVar = this.q;
            if (bVar == null) {
                l.a("dialogParams");
            }
            dialog.setCanceledOnTouchOutside(bVar.f22378e);
            Window window = dialog.getWindow();
            if (window != null) {
                b bVar2 = this.q;
                if (bVar2 == null) {
                    l.a("dialogParams");
                }
                window.setBackgroundDrawable(bVar2.f22384k);
                WindowManager.LayoutParams attributes = window.getAttributes();
                b bVar3 = this.q;
                if (bVar3 == null) {
                    l.a("dialogParams");
                }
                attributes.dimAmount = bVar3.f22379f;
                b bVar4 = this.q;
                if (bVar4 == null) {
                    l.a("dialogParams");
                }
                attributes.width = bVar4.f22381h;
                b bVar5 = this.q;
                if (bVar5 == null) {
                    l.a("dialogParams");
                }
                if (bVar5.f22382i == Integer.MIN_VALUE) {
                    int b2 = y.b();
                    b bVar6 = this.q;
                    if (bVar6 == null) {
                        l.a("dialogParams");
                    }
                    i2 = (b2 * bVar6.f22383j) / 100;
                } else {
                    b bVar7 = this.q;
                    if (bVar7 == null) {
                        l.a("dialogParams");
                    }
                    i2 = bVar7.f22382i;
                }
                attributes.height = i2;
                b bVar8 = this.q;
                if (bVar8 == null) {
                    l.a("dialogParams");
                }
                attributes.gravity = bVar8.f22380g;
                b bVar9 = this.q;
                if (bVar9 == null) {
                    l.a("dialogParams");
                }
                attributes.softInputMode = bVar9.f22385l;
                window.setAttributes(attributes);
            }
        }
    }

    @Override // androidx.fragment.app.d
    public void onCancel(DialogInterface dialogInterface) {
        if (this.o) {
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        l.b(onCreateDialog, "");
        b bVar = this.q;
        if (bVar == null) {
            l.a("dialogParams");
        }
        onCreateDialog.requestWindowFeature(bVar.f22376c);
        a(onCreateDialog);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.d
    public void onDismiss(DialogInterface dialogInterface) {
        bf.a().c();
        g.a().c();
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.r;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i2;
        super.onCreate(bundle);
        this.o = false;
        this.p = f.a(this);
        b b2 = b();
        if (b2.f22377d) {
            i2 = R.style.a29;
        } else {
            i2 = R.style.a2_;
        }
        int i3 = b2.f22374a;
        if (b2.f22375b != -1) {
            i2 = b2.f22375b;
        }
        setStyle(i3, i2);
        this.q = b2;
    }

    static final class d extends m implements h.f.a.b<Map<String, Long>, z> {
        final /* synthetic */ v this$0;

        static {
            Covode.recordClassIndex(13213);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(v vVar) {
            super(1);
            this.this$0 = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Map<String, Long> map) {
            long j2;
            Map<String, Long> map2 = map;
            l.d(map2, "");
            ak.a c_ = this.this$0.c_();
            l.d(c_, "");
            l.d(map2, "");
            if (!ak.b(c_)) {
                Long remove = map2.remove("traversal_end_time");
                long j3 = 0;
                if (remove != null) {
                    j2 = remove.longValue();
                } else {
                    j2 = 0;
                }
                Long l2 = ak.f22237a.get(c_);
                if (l2 != null) {
                    j3 = l2.longValue();
                }
                map2.put("panel_show_total_duration", Long.valueOf(j2 - j3));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("panel_type", c_);
                linkedHashMap.put("device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
                linkedHashMap.putAll(map2);
                com.bytedance.android.live.core.d.c.a("ttlive_panel_open_cost_time", 0, linkedHashMap);
                ak.f22237a.remove(c_);
            }
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.d
    public void show(i iVar, String str) {
        l.d(iVar, "");
        l.d(str, "");
        ak.a(c_());
        d();
        iVar.a().a(this, str).c();
    }

    @Override // androidx.fragment.app.d
    public void showNow(i iVar, String str) {
        l.d(iVar, "");
        l.d(str, "");
        ak.a(c_());
        d();
        iVar.a().a(this, str).e();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        this.o = true;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new c(this));
        }
        if (view instanceof LiveFrameLayout) {
            ((LiveFrameLayout) view).setTraversalCallBack(new d(this));
        }
    }

    @Override // androidx.fragment.app.d
    public int show(n nVar, String str) {
        l.d(nVar, "");
        l.d(str, "");
        ak.a(c_());
        d();
        nVar.a(this, str);
        com.bytedance.android.livesdkapi.m.c.a(this, "mViewDestroyed", false);
        int c2 = nVar.c();
        com.bytedance.android.livesdkapi.m.c.a(this, "mBackStackId", Integer.valueOf(c2));
        return c2;
    }

    static final class c implements DialogInterface.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f22387a;

        static {
            Covode.recordClassIndex(13212);
        }

        c(v vVar) {
            this.f22387a = vVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
            l.d(keyEvent, "");
            if (4 == i2 && 1 == keyEvent.getAction()) {
                return this.f22387a.i();
            }
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        if (!PanelOpenCostTimesSetting.INSTANCE.getValue().f18747a) {
            b bVar = this.q;
            if (bVar == null) {
                l.a("dialogParams");
            }
            return com.a.a(layoutInflater, bVar.f22386m, viewGroup, false);
        }
        View a2 = com.a.a(layoutInflater, R.layout.bhu, viewGroup, false);
        b bVar2 = this.q;
        if (bVar2 == null) {
            l.a("dialogParams");
        }
        int i2 = bVar2.f22386m;
        Objects.requireNonNull(a2, "null cannot be cast to non-null type com.bytedance.android.livesdk.ui.LiveFrameLayout");
        LiveFrameLayout liveFrameLayout = (LiveFrameLayout) a2;
        com.a.a(layoutInflater, i2, liveFrameLayout, true);
        View childAt = liveFrameLayout.getChildAt(0);
        l.b(childAt, "");
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        return a2;
    }
}
