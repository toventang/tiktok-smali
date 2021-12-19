package com.ss.android.ugc.aweme.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.ak;
import com.ss.android.ugc.aweme.profile.f.y;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ae;
import com.ss.android.ugc.aweme.profile.presenter.x;
import com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView;
import com.ss.android.ugc.aweme.profile.ui.widget.PreviewBoxView;
import com.ss.android.ugc.aweme.profile.ui.widget.SwitchModeFrameLayout;
import com.zhiliaoapp.musically.R;
import h.z;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public final class CropActivity extends com.bytedance.ies.foundation.activity.a implements com.ss.android.ugc.aweme.profile.presenter.p, x {

    /* renamed from: k  reason: collision with root package name */
    public static final a f116718k = new a((byte) 0);
    private SparseArray A;

    /* renamed from: a  reason: collision with root package name */
    public PinchImageView f116719a;

    /* renamed from: b  reason: collision with root package name */
    public PreviewBoxView f116720b;

    /* renamed from: c  reason: collision with root package name */
    public String f116721c;

    /* renamed from: d  reason: collision with root package name */
    com.ss.android.ugc.aweme.profile.presenter.a f116722d;

    /* renamed from: e  reason: collision with root package name */
    public UrlModel f116723e;

    /* renamed from: f  reason: collision with root package name */
    Bitmap f116724f;

    /* renamed from: g  reason: collision with root package name */
    public Rect f116725g;

    /* renamed from: h  reason: collision with root package name */
    com.ss.android.ugc.aweme.qrcode.view.a f116726h;

    /* renamed from: i  reason: collision with root package name */
    final h.h f116727i = RouteArgExtension.INSTANCE.optionalArgNotNull(this, n.f116745a, "extra_source_type", Integer.class);

    /* renamed from: j  reason: collision with root package name */
    public Uri f116728j;

    /* renamed from: l  reason: collision with root package name */
    private SwitchModeFrameLayout f116729l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f116730m;
    private TextView n;
    private TuxTextView o;
    private View p;
    private DmtStatusView q;
    private ak r;
    private ae s;
    private final h.h t = RouteArgExtension.INSTANCE.optionalArgNotNull(this, j.f116741a, "extra_min_width", Integer.class);
    private final h.h u = RouteArgExtension.INSTANCE.optionalArgNotNull(this, i.f116740a, "extra_min_height", Integer.class);
    private final h.h v = RouteArgExtension.INSTANCE.optionalArgNotNull(this, h.f116739a, "is_oval", Boolean.class);
    private final h.h w = RouteArgExtension.INSTANCE.optionalArgNotNull(this, m.f116744a, "rect_ratio", Float.class);
    private final h.h x = RouteArgExtension.INSTANCE.optionalArgNotNull(this, l.f116743a, "rect_margin", Integer.class);
    private final h.h y = RouteArgExtension.INSTANCE.optionalArg(this, k.f116742a, "original_url", String.class);
    private final h.h z = RouteArgExtension.INSTANCE.optionalArgNotNull(this, g.f116738a, "extra_need_update_avatar", Boolean.class);

    static {
        Covode.recordClassIndex(75393);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.A;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.A == null) {
            this.A = new SparseArray();
        }
        View view = (View) this.A.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.A.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.p
    public final void b(String str) {
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.CropActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.CropActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z2) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.CropActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75394);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(Activity activity, String str, boolean z, float f2, int i2, int i3, int i4, int i5, int i6, boolean z2) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(str, "");
            SmartRouter.buildRoute(activity, "//profile/crop").withParam("original_url", str).withParam("is_oval", z).withParam("rect_ratio", f2).withParam("rect_margin", i2).withParam("extra_min_width", i4).withParam("extra_min_height", i5).withParam("extra_source_type", i6).withParam("extra_need_update_avatar", z2).open(i3);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(boolean z2) {
        if (z2) {
            DmtStatusView dmtStatusView = this.q;
            if (dmtStatusView == null) {
                h.f.b.l.a("mDmtStatusView");
            }
            dmtStatusView.setVisibility(8);
            com.ss.android.ugc.aweme.qrcode.view.a aVar = this.f116726h;
            if (aVar != null && aVar.isShowing()) {
                com.ss.android.ugc.aweme.qrcode.view.a aVar2 = this.f116726h;
                if (aVar2 != null) {
                    aVar2.setMessage(getString(R.string.h_y));
                }
                com.ss.android.ugc.aweme.qrcode.view.a aVar3 = this.f116726h;
                if (aVar3 != null) {
                    aVar3.b();
                }
                new Handler().postDelayed(new p(this), 500);
            }
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CropActivity f116737a;

        static {
            Covode.recordClassIndex(75401);
        }

        f(CropActivity cropActivity) {
            this.f116737a = cropActivity;
        }

        public final void run() {
            CropActivity.b(this.f116737a).a();
        }
    }

    public final void a() {
        com.ss.android.ugc.aweme.qrcode.view.a aVar = this.f116726h;
        if (aVar != null && aVar.isShowing()) {
            try {
                com.ss.android.ugc.aweme.qrcode.view.a aVar2 = this.f116726h;
                if (aVar2 != null) {
                    aVar2.dismiss();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        com.ss.android.ugc.aweme.qrcode.view.a aVar = this.f116726h;
        if (aVar != null) {
            aVar.dismiss();
        }
        this.f116726h = null;
    }

    static final class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CropActivity f116748a;

        static {
            Covode.recordClassIndex(75412);
        }

        p(CropActivity cropActivity) {
            this.f116748a = cropActivity;
        }

        public final void run() {
            this.f116748a.a();
            Intent intent = new Intent();
            intent.setData(Uri.fromFile(new File(this.f116748a.f116721c)));
            intent.putExtra("path", this.f116748a.f116723e);
            this.f116748a.setResult(-1, intent);
            this.f116748a.finish();
        }
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

    public static final class e extends SwitchModeFrameLayout.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CropActivity f116736a;

        static {
            Covode.recordClassIndex(75400);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(CropActivity cropActivity) {
            this.f116736a = cropActivity;
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.widget.SwitchModeFrameLayout.b, com.ss.android.ugc.aweme.profile.ui.widget.SwitchModeFrameLayout.a
        public final void a(MotionEvent motionEvent) {
            if (motionEvent == null) {
                return;
            }
            if (motionEvent.getAction() == 0) {
                PreviewBoxView b2 = CropActivity.b(this.f116736a);
                if (b2.f117356b != null && b2.f117356b.isStarted()) {
                    b2.f117356b.cancel();
                }
                if (Math.abs(b2.f117360f - 0.5f) >= Float.MIN_NORMAL) {
                    b2.f117360f = 0.5f;
                    b2.setAlpha(b2.f117360f);
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f116736a.f116725g == null) {
                    CropActivity cropActivity = this.f116736a;
                    cropActivity.f116725g = CropActivity.b(cropActivity).getVisibleRect();
                }
                CropActivity.b(this.f116736a).a();
            }
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f116742a = new k();

        static {
            Covode.recordClassIndex(75406);
        }

        k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<Boolean, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f116738a = new g();

        static {
            Covode.recordClassIndex(75402);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Boolean bool) {
            bool.booleanValue();
            return true;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<Boolean, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f116739a = new h();

        static {
            Covode.recordClassIndex(75403);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Boolean bool) {
            bool.booleanValue();
            return false;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<Boolean, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f116740a = new i();

        static {
            Covode.recordClassIndex(75404);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(Boolean bool) {
            bool.booleanValue();
            return 250;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<Boolean, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f116741a = new j();

        static {
            Covode.recordClassIndex(75405);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(Boolean bool) {
            bool.booleanValue();
            return 250;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<Boolean, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f116743a = new l();

        static {
            Covode.recordClassIndex(75407);
        }

        l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(Boolean bool) {
            bool.booleanValue();
            return 0;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<Boolean, Float> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f116744a = new m();

        static {
            Covode.recordClassIndex(75408);
        }

        m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Float invoke(Boolean bool) {
            bool.booleanValue();
            return Float.valueOf(1.0f);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<Boolean, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f116745a = new n();

        static {
            Covode.recordClassIndex(75409);
        }

        n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(Boolean bool) {
            bool.booleanValue();
            return -1;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f116746a = new o();

        static {
            Covode.recordClassIndex(75410);
        }

        o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            h.f.b.l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f116747a);
            return z.f158842a;
        }
    }

    public static final /* synthetic */ PinchImageView a(CropActivity cropActivity) {
        PinchImageView pinchImageView = cropActivity.f116719a;
        if (pinchImageView == null) {
            h.f.b.l.a("mCoverImage");
        }
        return pinchImageView;
    }

    public static final /* synthetic */ PreviewBoxView b(CropActivity cropActivity) {
        PreviewBoxView previewBoxView = cropActivity.f116720b;
        if (previewBoxView == null) {
            h.f.b.l.a("mCoverWindow");
        }
        return previewBoxView;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CropActivity f116731a;

        static {
            Covode.recordClassIndex(75395);
        }

        b(CropActivity cropActivity) {
            this.f116731a = cropActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (CropActivity.a(this.f116731a).getPinchMode() == 0) {
                this.f116731a.setResult(0);
                this.f116731a.finish();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.p
    public final void b(Exception exc) {
        com.ss.android.ugc.aweme.app.api.b.a.a((Context) this, (Throwable) exc, (int) R.string.g4j);
        DmtStatusView dmtStatusView = this.q;
        if (dmtStatusView == null) {
            h.f.b.l.a("mDmtStatusView");
        }
        dmtStatusView.setVisibility(8);
        a();
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CropActivity f116732a;

        static {
            Covode.recordClassIndex(75396);
        }

        c(CropActivity cropActivity) {
            this.f116732a = cropActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            y.a("save_profile", "click_save", UGCMonitor.TYPE_PHOTO);
            if (CropActivity.a(this.f116732a).getPinchMode() == 0) {
                b.i.b(new Callable(this) {
                    /* class com.ss.android.ugc.aweme.profile.ui.CropActivity.c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f116733a;

                    static {
                        Covode.recordClassIndex(75397);
                    }

                    {
                        this.f116733a = r1;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        CropActivity cropActivity = this.f116733a.f116732a;
                        File file = new File(com.ss.android.ugc.aweme.video.e.a("profileHeader"), "profileHeaderCrop.png");
                        PinchImageView pinchImageView = cropActivity.f116719a;
                        if (pinchImageView == null) {
                            h.f.b.l.a("mCoverImage");
                        }
                        Bitmap bitmap = cropActivity.f116724f;
                        if (bitmap == null) {
                            h.f.b.l.a("originalBitmap");
                        }
                        h.p<Bitmap, Integer> a2 = cropActivity.a(pinchImageView, bitmap);
                        Bitmap first = a2.getFirst();
                        String str = null;
                        if (first == null) {
                            return new h.p(null, a2.getSecond());
                        }
                        h.f.b.l.b(file, "");
                        String parent = file.getParent();
                        h.f.b.l.b(parent, "");
                        String name = file.getName();
                        h.f.b.l.b(name, "");
                        boolean a3 = CropActivity.a(first, parent, name);
                        if (a3) {
                            file.getAbsolutePath();
                        }
                        com.ss.android.ugc.aweme.framework.a.a.b(4, "CropActivity", "saveBitmapToSD status: " + a3 + ' ' + file.length());
                        if (a3) {
                            str = file.getAbsolutePath();
                        }
                        return new h.p(str, Integer.valueOf((int) R.string.bp0));
                    }
                }, b.i.f4824a).a(new b.g(this) {
                    /* class com.ss.android.ugc.aweme.profile.ui.CropActivity.c.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f116734a;

                    static {
                        Covode.recordClassIndex(75398);
                    }

                    {
                        this.f116734a = r1;
                    }

                    @Override // b.g
                    public final /* synthetic */ Object then(b.i iVar) {
                        CharSequence charSequence;
                        h.f.b.l.b(iVar, "");
                        if (iVar.a() && (charSequence = (CharSequence) ((h.p) iVar.d()).getFirst()) != null && charSequence.length() != 0) {
                            this.f116734a.f116732a.f116728j = Uri.fromFile(new File((String) ((h.p) iVar.d()).getFirst()));
                            CropActivity cropActivity = this.f116734a.f116732a;
                            Object first = ((h.p) iVar.d()).getFirst();
                            if (first == null) {
                                h.f.b.l.b();
                            }
                            String str = (String) first;
                            if (cropActivity.f116726h == null) {
                                cropActivity.f116726h = com.ss.android.ugc.aweme.qrcode.view.a.a(cropActivity, cropActivity.getString(R.string.hau));
                                com.ss.android.ugc.aweme.qrcode.view.a aVar = cropActivity.f116726h;
                                if (aVar != null) {
                                    aVar.setIndeterminate(false);
                                }
                                com.ss.android.ugc.aweme.qrcode.view.a aVar2 = cropActivity.f116726h;
                                if (aVar2 != null) {
                                    aVar2.a(cropActivity.getResources().getDrawable(R.drawable.b6y));
                                }
                            } else {
                                com.ss.android.ugc.aweme.qrcode.view.a aVar3 = cropActivity.f116726h;
                                if (aVar3 == null) {
                                    h.f.b.l.b();
                                }
                                if (!aVar3.isShowing()) {
                                    com.ss.android.ugc.aweme.qrcode.view.a aVar4 = cropActivity.f116726h;
                                    if (aVar4 != null) {
                                        aVar4.show();
                                    }
                                    com.ss.android.ugc.aweme.qrcode.view.a aVar5 = cropActivity.f116726h;
                                    if (aVar5 != null) {
                                        aVar5.a();
                                    }
                                }
                            }
                            cropActivity.f116721c = str;
                            com.ss.android.ugc.aweme.profile.presenter.a aVar6 = cropActivity.f116722d;
                            if (aVar6 != null) {
                                aVar6.b(str);
                            }
                            com.ss.android.ugc.aweme.profile.presenter.a aVar7 = cropActivity.f116722d;
                            if (aVar7 == null) {
                                return null;
                            }
                            aVar7.a(((Number) cropActivity.f116727i.getValue()).intValue());
                            return null;
                        } else if (iVar.a()) {
                            new com.ss.android.ugc.aweme.tux.a.i.a(this.f116734a.f116732a).a(((Number) ((h.p) iVar.d()).getSecond()).intValue()).a();
                            return null;
                        } else {
                            new com.ss.android.ugc.aweme.tux.a.i.a(this.f116734a.f116732a).a(R.string.bp0).a();
                            return null;
                        }
                    }
                }, b.i.f4826c, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.p
    public final void b(AvatarUri avatarUri) {
        String str;
        List<String> list;
        String str2;
        String str3;
        String.valueOf(avatarUri);
        if (((Boolean) this.z.getValue()).booleanValue()) {
            ak akVar = this.r;
            Map<String, String> map = null;
            if (akVar != null) {
                if (avatarUri != null) {
                    str3 = avatarUri.uri;
                } else {
                    str3 = null;
                }
                akVar.f115963d = str3;
            }
            ae aeVar = this.s;
            if (aeVar != null) {
                ak akVar2 = this.r;
                if (akVar2 != null) {
                    map = akVar2.a();
                }
                aeVar.a(map);
                return;
            }
            return;
        }
        a();
        Intent intent = new Intent();
        intent.setData(this.f116728j);
        String str4 = "";
        if (avatarUri == null || (str = avatarUri.uri) == null) {
            str = str4;
        }
        intent.putExtra("uri", str);
        if (!(avatarUri == null || (list = avatarUri.urlList) == null || (str2 = (String) h.a.n.h((List) list)) == null)) {
            str4 = str2;
        }
        intent.putExtra("url", str4);
        setResult(-1, intent);
        finish();
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01ce  */
    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r12) {
        /*
        // Method dump skipped, instructions count: 543
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.CropActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(User user, int i2) {
        UrlModel urlModel;
        if (user != null) {
            urlModel = user.getAvatarMedium();
        } else {
            urlModel = null;
        }
        this.f116723e = urlModel;
    }

    /* access modifiers changed from: package-private */
    public final h.p<Bitmap, Integer> a(PinchImageView pinchImageView, Bitmap bitmap) {
        MethodCollector.i(8044);
        RectF a2 = pinchImageView.a((RectF) null);
        if (this.f116725g == null) {
            com.ss.android.ugc.aweme.framework.a.a.a(4, "CropActivity", "getCropBitmap mWindowRect is nnull");
        }
        Rect rect = this.f116725g;
        if (rect == null) {
            h.p<Bitmap, Integer> pVar = new h.p<>(bitmap, Integer.valueOf((int) R.string.bp0));
            MethodCollector.o(8044);
            return pVar;
        }
        float width = ((float) bitmap.getWidth()) / a2.width();
        float height = ((float) bitmap.getHeight()) / a2.height();
        int b2 = h.j.h.b((int) ((((float) rect.left) - a2.left) * width), 0);
        int b3 = h.j.h.b((int) ((((float) rect.top) - a2.top) * height), 0);
        int c2 = h.j.h.c((int) (((float) rect.width()) * width), bitmap.getWidth() - b2);
        int c3 = h.j.h.c((int) (((float) rect.height()) * height), bitmap.getHeight() - b3);
        if (c2 < ((Number) this.t.getValue()).intValue() || c3 < ((Number) this.u.getValue()).intValue()) {
            h.p<Bitmap, Integer> pVar2 = new h.p<>(null, Integer.valueOf((int) R.string.dqn));
            MethodCollector.o(8044);
            return pVar2;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, b2, b3, c2, c3);
        if (createBitmap == null || !a(bitmap, b2, b3, createBitmap)) {
            com.ss.android.ugc.aweme.framework.a.a.b(6, "CropActivity", new StringBuilder().append(b2).append(' ').append(b3).append(' ').append(c2).append(' ').append(c3).append(' ').append(bitmap.getWidth()).append(' ').append(bitmap.getHeight()).append(' ').append(bitmap.getConfig()).toString());
        } else {
            com.ss.android.ugc.aweme.framework.a.a.b(4, "CropActivity", "crop is successful " + width + ' ' + height + ' ' + b2 + ' ' + b3 + ' ' + c2 + ' ' + c3);
        }
        h.p<Bitmap, Integer> pVar3 = new h.p<>(createBitmap, Integer.valueOf((int) R.string.bp0));
        MethodCollector.o(8044);
        return pVar3;
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(Exception exc, int i2) {
        com.ss.android.ugc.aweme.app.api.b.a.a((Context) this, (Throwable) exc, (int) R.string.g4j);
        DmtStatusView dmtStatusView = this.q;
        if (dmtStatusView == null) {
            h.f.b.l.a("mDmtStatusView");
        }
        dmtStatusView.setVisibility(8);
        a();
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(String str, boolean z2) {
        if (str != null && !TextUtils.isEmpty(str)) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this).a(str).a();
        }
    }

    public static boolean a(Bitmap bitmap, String str, String str2) {
        MethodCollector.i(8090);
        h.f.b.l.d(bitmap, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        if (!h.f.b.l.a((Object) "mounted", (Object) Environment.getExternalStorageState())) {
            com.ss.android.ugc.aweme.framework.a.a.a(6, "saveBitmapToSD", "not mounted");
            MethodCollector.o(8090);
            return false;
        }
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            File file2 = new File(file.getPath() + "/" + str2);
            try {
                if (file2.exists() || file2.createNewFile()) {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        boolean compress = bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        if (!compress) {
                            com.ss.android.ugc.aweme.framework.a.a.b(6, "saveBitmapToSD", "compress fails");
                        }
                        fileOutputStream.flush();
                        try {
                            fileOutputStream.close();
                        } catch (Exception e2) {
                            com.ss.android.ugc.aweme.framework.a.a.a(e2);
                        }
                        MethodCollector.o(8090);
                        return compress;
                    } catch (Exception e3) {
                        com.ss.android.ugc.aweme.framework.a.a.a(e3);
                        try {
                            fileOutputStream.close();
                        } catch (Exception e4) {
                            com.ss.android.ugc.aweme.framework.a.a.a(e4);
                        }
                        MethodCollector.o(8090);
                        return false;
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e5) {
                            com.ss.android.ugc.aweme.framework.a.a.a(e5);
                        }
                        MethodCollector.o(8090);
                        throw th;
                    }
                } else {
                    com.ss.android.ugc.aweme.framework.a.a.b(6, "saveBitmapToSD", "createNewFile fails");
                    MethodCollector.o(8090);
                    return false;
                }
            } catch (Exception e6) {
                com.ss.android.ugc.aweme.framework.a.a.a(e6);
                MethodCollector.o(8090);
                return false;
            }
        } else {
            com.ss.android.ugc.aweme.framework.a.a.b(6, "saveBitmapToSD", "mkdirs fails");
            MethodCollector.o(8090);
            return false;
        }
    }

    private static boolean a(Bitmap bitmap, int i2, int i3, Bitmap bitmap2) {
        int c2 = h.j.h.c(bitmap2.getWidth(), bitmap.getWidth() - i2);
        int c3 = h.j.h.c(bitmap2.getHeight(), bitmap.getHeight() - i3);
        for (int i4 = 0; i4 < c2; i4++) {
            for (int b2 = h.j.h.b(c3 - 10, 0); b2 < c3; b2++) {
                try {
                    if (bitmap.getPixel(i2 + i4, i3 + b2) != bitmap2.getPixel(i4, b2)) {
                        return false;
                    }
                } catch (IllegalArgumentException e2) {
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                } catch (IllegalStateException e3) {
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e3);
                }
            }
        }
        return true;
    }

    static final class d implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CropActivity f116735a;

        static {
            Covode.recordClassIndex(75399);
        }

        d(CropActivity cropActivity) {
            this.f116735a = cropActivity;
        }

        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            if (this.f116735a.f116725g == null) {
                CropActivity cropActivity = this.f116735a;
                cropActivity.f116725g = CropActivity.b(cropActivity).getVisibleRect();
                CropActivity.a(this.f116735a).setDisplayWindowRect(this.f116735a.f116725g);
            }
        }
    }
}
