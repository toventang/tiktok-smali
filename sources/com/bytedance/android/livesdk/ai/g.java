package com.bytedance.android.livesdk.ai;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.aw;
import com.bytedance.android.live.n.k;
import com.bytedance.android.livesdk.ai.d;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.HashMap;

public final class g extends v {

    /* renamed from: k  reason: collision with root package name */
    public static final a f13771k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f13772a;

    /* renamed from: b  reason: collision with root package name */
    public View f13773b;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f13774c;

    /* renamed from: d  reason: collision with root package name */
    public ViewGroup f13775d;

    /* renamed from: e  reason: collision with root package name */
    public LiveTextView f13776e;

    /* renamed from: f  reason: collision with root package name */
    public LiveTextView f13777f;

    /* renamed from: g  reason: collision with root package name */
    public d f13778g;

    /* renamed from: h  reason: collision with root package name */
    public int f13779h;

    /* renamed from: i  reason: collision with root package name */
    public Activity f13780i;

    /* renamed from: j  reason: collision with root package name */
    public long f13781j;

    /* renamed from: l  reason: collision with root package name */
    private FrameLayout f13782l;

    /* renamed from: m  reason: collision with root package name */
    private FrameLayout f13783m;
    private HashMap n;

    static {
        Covode.recordClassIndex(7662);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.n == null) {
            this.n = new HashMap();
        }
        View view = (View) this.n.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.n.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(7663);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f13784a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f13785b;

        static {
            Covode.recordClassIndex(7664);
        }

        @Override // com.bytedance.android.livesdk.ai.d.a
        public final void a() {
            com.bytedance.android.live.core.c.a.a(4, "picture_in_picture", "startCountDownTime onFinish() ");
            this.f13784a.f13778g = null;
            this.f13785b.invoke();
        }

        @Override // com.bytedance.android.livesdk.ai.d.a
        public final void b(int i2) {
            com.bytedance.android.live.core.c.a.a(4, "picture_in_picture", "startCountDownTime start time length is ".concat(String.valueOf(i2)));
            this.f13784a.b(i2);
        }

        @Override // com.bytedance.android.livesdk.ai.d.a
        public final void a(int i2) {
            com.bytedance.android.live.core.c.a.a(4, "picture_in_picture", "startCountDownTime start time length is ".concat(String.valueOf(i2)));
            this.f13784a.b(i2);
        }

        b(g gVar, h.f.a.a aVar) {
            this.f13784a = gVar;
            this.f13785b = aVar;
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.bd_);
        bVar.f22375b = R.style.a3c;
        bVar.f22374a = 1;
        bVar.f22379f = 0.0f;
        bVar.f22381h = -1;
        bVar.f22382i = -1;
        bVar.f22380g = 17;
        return bVar;
    }

    public final void d() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        FrameLayout frameLayout = this.f13783m;
        ViewGroup.LayoutParams layoutParams3 = null;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.leftMargin = 0;
            FrameLayout frameLayout2 = this.f13783m;
            if (frameLayout2 != null) {
                frameLayout2.setLayoutParams(layoutParams);
            }
            FrameLayout frameLayout3 = this.f13783m;
            if (frameLayout3 != null) {
                frameLayout3.setTranslationX(0.0f);
            }
            FrameLayout frameLayout4 = this.f13783m;
            if (frameLayout4 != null) {
                frameLayout4.setTranslationY(0.0f);
            }
        }
        View view = this.f13773b;
        if (view != null) {
            layoutParams2 = view.getLayoutParams();
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.topMargin = 0;
            marginLayoutParams2.rightMargin = 0;
            marginLayoutParams2.bottomMargin = 0;
            marginLayoutParams2.leftMargin = 0;
            if (view != null) {
                view.setLayoutParams(layoutParams2);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
            }
        }
        ViewGroup viewGroup = this.f13775d;
        if (viewGroup != null) {
            layoutParams3 = viewGroup.getLayoutParams();
        }
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.topMargin = 0;
            marginLayoutParams3.rightMargin = 0;
            marginLayoutParams3.bottomMargin = 0;
            marginLayoutParams3.leftMargin = 0;
            if (viewGroup != null) {
                viewGroup.setLayoutParams(layoutParams3);
                viewGroup.setTranslationX(0.0f);
                viewGroup.setTranslationY(0.0f);
            }
        }
        com.bytedance.android.live.core.c.a.a(4, "picture_in_picture", " adapterPipLayout, ");
        FrameLayout frameLayout5 = this.f13783m;
        if (frameLayout5 != null) {
            frameLayout5.measure(0, 0);
        }
    }

    private void e() {
        Integer num;
        Bitmap bitmap;
        Resources resources;
        MethodCollector.i(2389);
        FrameLayout frameLayout = this.f13782l;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class);
        l.b(a2, "");
        k b2 = ((com.bytedance.android.live.i.a.d) a2).getLivePlayControllerManager().b(this.f13772a);
        if (b2 != null) {
            View o = b2.o();
            if (o != null) {
                Integer num2 = null;
                if ((o instanceof TextureRenderView) && (bitmap = ((TextureRenderView) o).getBitmap()) != null) {
                    ImageView imageView = new ImageView(this.f13780i);
                    imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    Activity activity = this.f13780i;
                    if (activity != null) {
                        resources = activity.getResources();
                    } else {
                        resources = null;
                    }
                    imageView.setBackground(new BitmapDrawable(resources, bitmap));
                    FrameLayout frameLayout2 = this.f13782l;
                    if (frameLayout2 != null) {
                        frameLayout2.addView(imageView);
                    }
                    com.bytedance.android.live.core.c.a.a(4, "picture_in_picture", "  mPipVideoViewContainer?.addView(imageView)width: " + imageView.getWidth() + ",height: " + imageView.getHeight());
                }
                this.f13773b = o;
                if (o.getParent() instanceof ViewGroup) {
                    ViewParent parent = o.getParent();
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(o);
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                        MethodCollector.o(2389);
                        throw nullPointerException;
                    }
                }
                FrameLayout frameLayout3 = this.f13782l;
                if (frameLayout3 != null) {
                    frameLayout3.addView(o);
                }
                d();
                StringBuilder append = new StringBuilder("  mPipVideoViewContainer?.addView(mVideoView)width: ").append(o.getWidth()).append(",height: ").append(o.getHeight()).append(",mPipVideoViewContainer width: ");
                FrameLayout frameLayout4 = this.f13782l;
                if (frameLayout4 != null) {
                    num = Integer.valueOf(frameLayout4.getWidth());
                } else {
                    num = null;
                }
                StringBuilder append2 = append.append(num).append(",mPipVideoViewContainer height: ");
                FrameLayout frameLayout5 = this.f13782l;
                if (frameLayout5 != null) {
                    num2 = Integer.valueOf(frameLayout5.getHeight());
                }
                com.bytedance.android.live.core.c.a.a(3, "picture_in_picture", append2.append(num2).toString());
                MethodCollector.o(2389);
                return;
            }
            MethodCollector.o(2389);
            return;
        }
        MethodCollector.o(2389);
    }

    private final void a(h.f.a.a<z> aVar) {
        if (this.f13778g == null) {
            d dVar = new d(new b(this, aVar));
            this.f13778g = dVar;
            dVar.a();
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.f13781j = 0;
        d dVar = this.f13778g;
        if (dVar != null) {
            dVar.f13756a.removeCallbacks(dVar.f13757b);
            dVar.f13756a.removeCallbacks(dVar.f13758c);
        }
        this.f13778g = null;
        this.f13772a = null;
    }

    public final void b(int i2) {
        LiveTextView liveTextView = this.f13777f;
        if (liveTextView != null) {
            liveTextView.setText(y.a((int) R.string.ehh, Integer.valueOf(i2)));
        }
    }

    public final void a(int i2, h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f13779h = i2;
        n.a(this.f13775d, 0);
        n.a(this.f13782l, 8);
        d();
        LiveTextView liveTextView = this.f13776e;
        if (liveTextView != null) {
            if (i2 == 1) {
                liveTextView.setText(y.a((int) R.string.ehi));
            } else if (i2 == 2) {
                liveTextView.setText(y.a((int) R.string.ehg));
            } else if (i2 == 3) {
                liveTextView.setText(y.a((int) R.string.ehj));
            }
        }
        a(aVar);
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewParent parent;
        MethodCollector.i(2325);
        l.d(view, "");
        super.onViewCreated(view, bundle);
        this.f13783m = (FrameLayout) view.findViewById(R.id.dqe);
        this.f13782l = (FrameLayout) view.findViewById(R.id.d52);
        this.f13775d = (ViewGroup) view.findViewById(R.id.ccv);
        this.f13776e = (LiveTextView) view.findViewById(R.id.d4y);
        this.f13777f = (LiveTextView) view.findViewById(R.id.afp);
        d();
        f b2 = u.a().b();
        l.b(b2, "");
        if (((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).getUserRole(b2.c()) == aw.GUEST_AUDIENCE) {
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class);
            l.b(a2, "");
            SurfaceView linkInAnchorSurface = ((com.bytedance.android.live.liveinteract.api.b) a2).getLinkInAnchorSurface();
            FrameLayout frameLayout = this.f13782l;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(-16777216);
            }
            if (linkInAnchorSurface == null || this.f13781j == 0) {
                e();
                MethodCollector.o(2325);
                return;
            }
            this.f13773b = linkInAnchorSurface;
            FrameLayout frameLayout2 = this.f13782l;
            if (frameLayout2 != null && frameLayout2.getChildCount() > 0) {
                frameLayout2.removeAllViews();
            }
            com.bytedance.android.live.core.c.a.a(3, "picture_in_picture", "  addLinkRoomVideoView");
            View view2 = this.f13773b;
            ViewParent viewParent = null;
            if (view2 != null) {
                viewParent = view2.getParent();
            }
            if (viewParent instanceof ViewGroup) {
                View view3 = this.f13773b;
                if (view3 == null || (parent = view3.getParent()) == null) {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                    MethodCollector.o(2325);
                    throw nullPointerException;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                this.f13774c = viewGroup;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f13773b);
                }
            }
            FrameLayout frameLayout3 = this.f13782l;
            if (frameLayout3 != null) {
                frameLayout3.addView(this.f13773b);
            }
            d();
            MethodCollector.o(2325);
            return;
        }
        e();
        MethodCollector.o(2325);
    }
}
