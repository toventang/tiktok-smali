package com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Outline;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.ScrollView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.ui.common.d;
import com.bytedance.ies.bullet.ui.common.h;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.log.PdpLogHelper;
import com.ss.android.ugc.aweme.utils.fc;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.z;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class d extends b implements h.b {

    /* renamed from: l  reason: collision with root package name */
    public static final a f73833l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public PdpLogHelper f73834a;

    /* renamed from: b  reason: collision with root package name */
    final h.h f73835b = h.i.a((h.f.a.a) new k(this));

    /* renamed from: c  reason: collision with root package name */
    public h.f.a.a<z> f73836c;

    /* renamed from: d  reason: collision with root package name */
    public h.f.a.a<z> f73837d;

    /* renamed from: e  reason: collision with root package name */
    final h.h f73838e = h.i.a((h.f.a.a) new b(this));

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.ies.bullet.c.c.i f73839f;

    /* renamed from: g  reason: collision with root package name */
    public View f73840g;

    /* renamed from: h  reason: collision with root package name */
    public float f73841h;

    /* renamed from: i  reason: collision with root package name */
    public BottomSheetBehavior<View> f73842i;

    /* renamed from: j  reason: collision with root package name */
    public int f73843j = 4;

    /* renamed from: k  reason: collision with root package name */
    public Integer f73844k;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f73845m = h.i.a((h.f.a.a) new m(this));
    private final h.h n = h.i.a((h.f.a.a) new f(this));
    private final h.h o = h.i.a((h.f.a.a) new l(this));
    private final h.h p = h.i.a((h.f.a.a) new c(this));
    private final h.h q = h.i.a((h.f.a.a) new n(this));
    private com.bytedance.ies.bullet.ui.common.d r;
    private long s;
    private String t;
    private HashMap u;

    static {
        Covode.recordClassIndex(45468);
    }

    private final com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.c.a d() {
        return (com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.c.a) this.f73845m.getValue();
    }

    private final String e() {
        return (String) this.o.getValue();
    }

    public final ViewGroup a() {
        return (ViewGroup) this.p.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45469);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d$d  reason: collision with other inner class name */
    public static final class C1656d implements h.f.b.a.a, Iterable<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f73846a;

        static {
            Covode.recordClassIndex(45472);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d.C1656d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                public int f73847a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C1656d f73848b;

                static {
                    Covode.recordClassIndex(45473);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f73847a < this.f73848b.f73846a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f73848b.f73846a;
                    int i2 = this.f73847a;
                    this.f73847a = i2 + 1;
                    return viewGroup.getChildAt(i2);
                }

                {
                    this.f73848b = r1;
                }
            };
        }

        public C1656d(ViewGroup viewGroup) {
            this.f73846a = viewGroup;
        }
    }

    public static final class j implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f73859a;

        static {
            Covode.recordClassIndex(45485);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.a
        public final void a() {
            this.f73859a.f73844k = null;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(d dVar) {
            this.f73859a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.a
        public final void a(boolean z) {
            ViewGroup a2;
            boolean z2;
            View view = this.f73859a.f73840g;
            if (view != null && (a2 = this.f73859a.a()) != null) {
                if (z || (this.f73859a.f73843j == 3 && view.getScrollY() != 0)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                a2.requestDisallowInterceptTouchEvent(z2);
            }
        }
    }

    public final void b() {
        BottomSheetBehavior<View> bottomSheetBehavior = this.f73842i;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.c(3);
        }
    }

    public final void c() {
        BottomSheetBehavior<View> bottomSheetBehavior = this.f73842i;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.c(4);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.u;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<ViewGroup> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(45470);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ViewGroup invoke() {
            View view = this.this$0.getView();
            if (view != null) {
                return view.findViewById(R.id.af5);
            }
            return null;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<ViewGroup> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(45471);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ViewGroup invoke() {
            View view = this.this$0.getView();
            if (view != null) {
                return view.findViewById(R.id.w7);
            }
            return null;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<Float> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(45475);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                return Float.valueOf(arguments.getFloat("MAX_HEIGHT_RATIO"));
            }
            return null;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<Float> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(45486);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                return Float.valueOf(arguments.getFloat("PEEK_HEIGHT_RATIO"));
            }
            return null;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(45487);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                return arguments.getString("SCHEMA");
            }
            return null;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.c.a> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(45488);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.c.a invoke() {
            Serializable serializable;
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("PDP_AD_INFO");
            } else {
                serializable = null;
            }
            if (!(serializable instanceof com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.c.a)) {
                return null;
            }
            return serializable;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(45489);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            View view = this.this$0.getView();
            if (view != null) {
                return view.findViewById(R.id.epv);
            }
            return null;
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        Bundle bundle;
        String logExtra;
        Long creativeId;
        super.onStart();
        String e2 = e();
        if (e2 != null && this.f73839f == null) {
            this.t = e2;
            h.f.b.l.b(e2, "");
            com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.c.a d2 = d();
            String str = null;
            if (d2 == null || !d2.isAd()) {
                bundle = null;
            } else {
                e2 = Uri.parse(e()).buildUpon().appendQueryParameter("is_ad", "1").build().toString();
                h.f.b.l.b(e2, "");
                str = AdLandPagePreloadServiceImpl.f().e();
                bundle = new Bundle();
                com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.c.a d3 = d();
                if (!(d3 == null || (creativeId = d3.getCreativeId()) == null)) {
                    bundle.putLong("ad_id", creativeId.longValue());
                }
                com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.c.a d4 = d();
                if (!(d4 == null || (logExtra = d4.getLogExtra()) == null)) {
                    bundle.putString("bundle_download_app_log_extra", logExtra);
                }
            }
            com.bytedance.ies.bullet.ui.common.d dVar = this.r;
            if (dVar == null) {
                h.f.b.l.a("bulletContainerFragment");
            }
            dVar.a(com.ss.android.ugc.aweme.bullet.utils.c.a(e2, str), bundle, this);
        }
    }

    static final class h implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f73851a;

        static {
            Covode.recordClassIndex(45477);
        }

        h(d dVar) {
            this.f73851a = dVar;
        }

        public static final class a extends BottomSheetBehavior.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f73853a;

            static {
                Covode.recordClassIndex(45479);
            }

            a(h hVar) {
                this.f73853a = hVar;
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
            public final void a(View view, float f2) {
                h.f.b.l.d(view, "");
                if (this.f73853a.f73851a.f73841h < 0.5f && f2 >= 0.5f) {
                    ViewGroup a2 = this.f73853a.f73851a.a();
                    if (a2 != null) {
                        a2.post(new Runnable(this) {
                            /* class com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d.h.a.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ a f73854a;

                            static {
                                Covode.recordClassIndex(45480);
                            }

                            {
                                this.f73854a = r1;
                            }

                            public final void run() {
                                this.f73854a.f73853a.f73851a.b();
                            }
                        });
                    }
                    this.f73853a.f73851a.f73844k = 3;
                }
                if (this.f73853a.f73851a.f73841h >= 0.5f && f2 < 0.5f) {
                    ViewGroup a3 = this.f73853a.f73851a.a();
                    if (a3 != null) {
                        a3.post(new Runnable(this) {
                            /* class com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d.h.a.AnonymousClass2 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ a f73855a;

                            static {
                                Covode.recordClassIndex(45481);
                            }

                            {
                                this.f73855a = r1;
                            }

                            public final void run() {
                                this.f73855a.f73853a.f73851a.c();
                            }
                        });
                    }
                    this.f73853a.f73851a.f73844k = 4;
                }
                this.f73853a.f73851a.f73841h = f2;
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
            public final void a(View view, int i2) {
                View view2;
                boolean z;
                ViewGroup a2;
                Integer num;
                ViewGroup a3;
                h.f.b.l.d(view, "");
                if (i2 == 5) {
                    Dialog dialog = this.f73853a.f73851a.getDialog();
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    h.f.a.a<z> aVar = this.f73853a.f73851a.f73836c;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }
                if (i2 == 1 && (num = this.f73853a.f73851a.f73844k) != null && num.intValue() == 3 && (a3 = this.f73853a.f73851a.a()) != null) {
                    a3.post(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d.h.a.AnonymousClass3 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ a f73856a;

                        static {
                            Covode.recordClassIndex(45482);
                        }

                        {
                            this.f73856a = r1;
                        }

                        public final void run() {
                            this.f73856a.f73853a.f73851a.b();
                        }
                    });
                }
                if (i2 == 1) {
                    Integer num2 = this.f73853a.f73851a.f73844k;
                    if (!(num2 == null || num2.intValue() != 4 || (a2 = this.f73853a.f73851a.a()) == null)) {
                        a2.post(new Runnable(this) {
                            /* class com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d.h.a.AnonymousClass4 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ a f73857a;

                            static {
                                Covode.recordClassIndex(45483);
                            }

                            {
                                this.f73857a = r1;
                            }

                            public final void run() {
                                this.f73857a.f73853a.f73851a.c();
                            }
                        });
                    }
                } else if (i2 == 5 || i2 == 4 || i2 == 3) {
                    this.f73853a.f73851a.f73843j = i2;
                    PdpLogHelper pdpLogHelper = this.f73853a.f73851a.f73834a;
                    if (pdpLogHelper == null) {
                        h.f.b.l.a("pdpLogHelper");
                    }
                    pdpLogHelper.f73815a.onNext(Integer.valueOf(i2));
                }
                ViewGroup viewGroup = (ViewGroup) this.f73853a.f73851a.f73838e.getValue();
                if (viewGroup != null) {
                    if (i2 != 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    viewGroup.setEnabled(z);
                }
                if (i2 == 3 && (this.f73853a.f73851a.f73839f instanceof com.bytedance.ies.bullet.kit.web.c) && (view2 = this.f73853a.f73851a.f73840g) != null) {
                    view2.scrollBy(0, 1);
                }
            }
        }

        public final void onShow(DialogInterface dialogInterface) {
            float f2;
            Window window;
            Dialog dialog = this.f73851a.getDialog();
            if (!(dialog == null || (window = dialog.getWindow()) == null)) {
                fc.a(window);
            }
            h.f.a.a<z> aVar = this.f73851a.f73836c;
            if (aVar != null) {
                aVar.invoke();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                ViewGroup a2 = this.f73851a.a();
                if (a2 != null) {
                    a2.setOutlineProvider(new ViewOutlineProvider(this) {
                        /* class com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d.h.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ h f73852a;

                        static {
                            Covode.recordClassIndex(45478);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f73852a = r1;
                        }

                        public final void getOutline(View view, Outline outline) {
                            if (view != null) {
                                float b2 = com.bytedance.common.utility.n.b(this.f73852a.f73851a.getContext(), 8.0f);
                                if (outline != null) {
                                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + ((int) b2), b2);
                                }
                            }
                        }
                    });
                }
                ViewGroup a3 = this.f73851a.a();
                if (a3 != null) {
                    a3.setClipToOutline(true);
                }
            }
            ViewGroup a4 = this.f73851a.a();
            if (a4 != null) {
                this.f73851a.f73842i = BottomSheetBehavior.a(a4);
                BottomSheetBehavior<View> bottomSheetBehavior = this.f73851a.f73842i;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.f52332h = true;
                }
                BottomSheetBehavior<View> bottomSheetBehavior2 = this.f73851a.f73842i;
                if (bottomSheetBehavior2 != null) {
                    bottomSheetBehavior2.f52333i = false;
                }
                BottomSheetBehavior<View> bottomSheetBehavior3 = this.f73851a.f73842i;
                if (bottomSheetBehavior3 != null) {
                    float b2 = (float) com.bytedance.common.utility.n.b(this.f73851a.getContext());
                    Float f3 = (Float) this.f73851a.f73835b.getValue();
                    if (f3 != null) {
                        f2 = f3.floatValue();
                    } else {
                        f2 = 0.73f;
                    }
                    bottomSheetBehavior3.b((int) (b2 * f2));
                }
                BottomSheetBehavior<View> bottomSheetBehavior4 = this.f73851a.f73842i;
                if (bottomSheetBehavior4 != null) {
                    bottomSheetBehavior4.o = new a(this);
                }
            }
        }
    }

    public static final class e implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f73849a;

        static {
            Covode.recordClassIndex(45474);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(d dVar) {
            this.f73849a = dVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f73849a.f73843j == 4) {
                return true;
            }
            return false;
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f73850a;

        static {
            Covode.recordClassIndex(45476);
        }

        g(d dVar) {
            this.f73850a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f73850a.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        return new c(getActivity(), new j(this), (byte) 0);
    }

    @Override // androidx.fragment.app.d
    public final void onDismiss(DialogInterface dialogInterface) {
        h.f.b.l.d(dialogInterface, "");
        super.onDismiss(dialogInterface);
        h.f.a.a<z> aVar = this.f73837d;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(Uri uri) {
        h.f.b.l.d(uri, "");
        this.s = System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.i lifecycle = getLifecycle();
        PdpLogHelper pdpLogHelper = this.f73834a;
        if (pdpLogHelper == null) {
            h.f.b.l.a("pdpLogHelper");
        }
        lifecycle.a(pdpLogHelper);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = (View) this.q.getValue();
        if (view != null) {
            view.setOnClickListener(new g(this));
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new h(this));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnKeyListener(i.f73858a);
        }
    }

    private final View a(ViewGroup viewGroup) {
        com.bytedance.ies.bullet.c.c.i iVar;
        loop0:
        while (viewGroup != null && (iVar = this.f73839f) != null) {
            if (!(iVar instanceof com.bytedance.ies.bullet.kit.web.c)) {
                for (View view : new C1656d(viewGroup)) {
                    if (view instanceof ScrollView) {
                        view.setOnTouchListener(new e(this));
                        return view;
                    } else if (view instanceof ViewGroup) {
                        viewGroup = (ViewGroup) view;
                    }
                }
                break loop0;
            }
            Objects.requireNonNull(iVar, "null cannot be cast to non-null type com.bytedance.ies.bullet.kit.web.IWebKitContainerApi");
            return ((com.bytedance.ies.bullet.kit.web.c) iVar).n();
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(Uri uri, Throwable th) {
        h.f.b.l.d(uri, "");
        h.f.b.l.d(th, "");
        if (this.f73834a == null) {
            h.f.b.l.a("pdpLogHelper");
        }
        PdpLogHelper.a(-1, this.s, this.t);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        com.bytedance.ies.bullet.ui.common.d dVar = new com.bytedance.ies.bullet.ui.common.d();
        d.a a2 = new d.a(dVar).a(BulletService.f().a());
        androidx.fragment.app.e requireActivity = requireActivity();
        Objects.requireNonNull(requireActivity, "null cannot be cast to non-null type android.app.Activity");
        d.a a3 = a2.a(new BulletActivityWrapper(requireActivity));
        com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.c.a d2 = d();
        if (d2 != null && d2.isAd()) {
            a3.a(AdLandPagePreloadServiceImpl.f().e());
        }
        a3.a();
        this.r = dVar;
        androidx.fragment.app.n a4 = getChildFragmentManager().a();
        com.bytedance.ies.bullet.ui.common.d dVar2 = this.r;
        if (dVar2 == null) {
            h.f.b.l.a("bulletContainerFragment");
        }
        a4.b(R.id.a0g, dVar2).c();
    }

    static final class i implements DialogInterface.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        public static final i f73858a = new i();

        static {
            Covode.recordClassIndex(45484);
        }

        i() {
        }

        public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                h.f.b.l.b(keyEvent, "");
                keyEvent.getAction();
            }
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a0r, viewGroup, false);
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
        h.f.b.l.d(view, "");
        h.f.b.l.d(uri, "");
        h.f.b.l.d(iVar, "");
        com.bytedance.ies.bullet.ui.common.d dVar = this.r;
        if (dVar == null) {
            h.f.b.l.a("bulletContainerFragment");
        }
        View view2 = dVar.getView();
        Objects.requireNonNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f73840g = a((ViewGroup) view2);
        PdpLogHelper pdpLogHelper = this.f73834a;
        if (pdpLogHelper == null) {
            h.f.b.l.a("pdpLogHelper");
        }
        int i2 = this.f73843j;
        h.f.b.l.d(iVar, "");
        t<Integer> c2 = pdpLogHelper.f73815a.c();
        Integer valueOf = Integer.valueOf(i2);
        f.a.e.b.b.a((Object) valueOf, "item is null");
        int i3 = 0;
        f.a.b.b a2 = t.a(t.b(valueOf), c2).a(f.a.e.b.a.f157188a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new PdpLogHelper.b(pdpLogHelper, iVar), PdpLogHelper.c.f73823a);
        h.f.b.l.b(a2, "");
        f.a.j.a.a(a2, pdpLogHelper.f73816b);
        if (this.f73834a == null) {
            h.f.b.l.a("pdpLogHelper");
        }
        if (iVar.b() == com.bytedance.ies.bullet.service.f.a.b.b.LYNX) {
            i3 = 1;
        }
        PdpLogHelper.a(i3, this.s, this.t);
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(com.bytedance.ies.bullet.c.c.i iVar, Uri uri, q qVar) {
        h.f.b.l.d(iVar, "");
        h.f.b.l.d(uri, "");
        h.f.b.l.d(qVar, "");
        com.bytedance.ies.bullet.ui.common.d dVar = this.r;
        if (dVar == null) {
            h.f.b.l.a("bulletContainerFragment");
        }
        com.bytedance.ies.bullet.ui.common.b.c b2 = dVar.b();
        if (b2 != null) {
            b2.a(iVar, uri, qVar);
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>> list, Uri uri, com.bytedance.ies.bullet.c.c.i iVar, boolean z) {
        h.f.b.l.d(list, "");
        h.f.b.l.d(uri, "");
        h.f.b.l.d(iVar, "");
        this.f73839f = iVar;
    }
}
