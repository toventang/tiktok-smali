package com.ss.android.ugc.aweme.fe.method.upload;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ab;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.ss.android.ugc.aweme.ICrossPlatformLegacyService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.aweme.views.i;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.concurrent.Callable;

public final class ImageChooseUploadActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: i  reason: collision with root package name */
    public static c f91325i;

    /* renamed from: j  reason: collision with root package name */
    public static final a f91326j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public i f91327a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f91328b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f91329c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f91330d;

    /* renamed from: e  reason: collision with root package name */
    public d f91331e;

    /* renamed from: f  reason: collision with root package name */
    public List<f> f91332f;

    /* renamed from: g  reason: collision with root package name */
    public final m<View, String, z> f91333g = new g(this);

    /* renamed from: h  reason: collision with root package name */
    public final h.f.a.b<List<f>, z> f91334h = new f(this);

    /* renamed from: k  reason: collision with root package name */
    private boolean f91335k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f91336l;

    /* renamed from: m  reason: collision with root package name */
    private Boolean f91337m = true;
    private int n = 1;
    private long o = Long.MAX_VALUE;
    private final int p = 4;
    private String q = "";
    private SparseArray r;

    static {
        Covode.recordClassIndex(57482);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.r;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.r == null) {
            this.r = new SparseArray();
        }
        View view = (View) this.r.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.r.put(i2, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57483);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ImageChooseUploadActivity f91338a;

        static {
            Covode.recordClassIndex(57484);
        }

        b(ImageChooseUploadActivity imageChooseUploadActivity) {
            this.f91338a = imageChooseUploadActivity;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return AVExternalServiceImpl.a().infoService().getMediaLoaderImages(this.f91338a);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        super.onBackPressed();
        a("cancel_image_choose");
        c cVar = f91325i;
        if (cVar != null) {
            cVar.k();
        }
    }

    static final class h<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ImageChooseUploadActivity f91342a;

        static {
            Covode.recordClassIndex(57490);
        }

        h(ImageChooseUploadActivity imageChooseUploadActivity) {
            this.f91342a = imageChooseUploadActivity;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            c cVar = ImageChooseUploadActivity.f91325i;
            if (cVar == null) {
                return null;
            }
            cVar.a(this.f91342a.f91332f, new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity.h.AnonymousClass1 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(57491);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    i iVar = this.this$0.f91342a.f91327a;
                    if (iVar != null) {
                        iVar.dismiss();
                    }
                    this.this$0.f91342a.finish();
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        c cVar = f91325i;
        if (cVar != null) {
            cVar.l();
        }
        f91325i = null;
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

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ImageChooseUploadActivity f91340a;

        static {
            Covode.recordClassIndex(57486);
        }

        d(ImageChooseUploadActivity imageChooseUploadActivity) {
            this.f91340a = imageChooseUploadActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            c cVar = ImageChooseUploadActivity.f91325i;
            if (cVar != null) {
                cVar.k();
            }
            this.f91340a.finish();
            this.f91340a.a("cancel_image_choose");
        }
    }

    public final void a(String str) {
        r.a(str, new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.q).f66730a);
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ImageChooseUploadActivity f91341a;

        static {
            Covode.recordClassIndex(57487);
        }

        e(ImageChooseUploadActivity imageChooseUploadActivity) {
            this.f91341a = imageChooseUploadActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ImageChooseUploadActivity imageChooseUploadActivity = this.f91341a;
            if (!com.ss.android.ugc.aweme.base.utils.d.a(imageChooseUploadActivity.f91332f)) {
                d dVar = imageChooseUploadActivity.f91331e;
                if (dVar == null || !dVar.f91361d) {
                    d dVar2 = imageChooseUploadActivity.f91331e;
                    if (dVar2 != null) {
                        dVar2.f91361d = true;
                    }
                    i iVar = imageChooseUploadActivity.f91327a;
                    if (iVar != null) {
                        iVar.dismiss();
                    }
                    imageChooseUploadActivity.f91327a = new i(imageChooseUploadActivity, imageChooseUploadActivity.getString(R.string.h7d));
                    i iVar2 = imageChooseUploadActivity.f91327a;
                    if (iVar2 != null) {
                        iVar2.show();
                    }
                    b.i.b(new h(imageChooseUploadActivity), b.i.f4824a);
                }
            }
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<List<? extends f>, z> {
        final /* synthetic */ ImageChooseUploadActivity this$0;

        static {
            Covode.recordClassIndex(57488);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ImageChooseUploadActivity imageChooseUploadActivity) {
            super(1);
            this.this$0 = imageChooseUploadActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.fe.method.upload.f> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends f> list) {
            int i2;
            List<? extends f> list2 = list;
            if (com.ss.android.ugc.aweme.base.utils.d.b(list2)) {
                TextView textView = this.this$0.f91329c;
                if (textView != null) {
                    ImageChooseUploadActivity imageChooseUploadActivity = this.this$0;
                    Object[] objArr = new Object[1];
                    if (list2 != null) {
                        i2 = list2.size();
                    } else {
                        i2 = 0;
                    }
                    objArr[0] = Integer.valueOf(i2);
                    textView.setText(imageChooseUploadActivity.getString(R.string.a81, objArr));
                }
                TextView textView2 = this.this$0.f91329c;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
            } else {
                TextView textView3 = this.this$0.f91329c;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            }
            this.this$0.f91332f = list2;
            return z.f158842a;
        }
    }

    static final class c<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ImageChooseUploadActivity f91339a;

        static {
            Covode.recordClassIndex(57485);
        }

        c(ImageChooseUploadActivity imageChooseUploadActivity) {
            this.f91339a = imageChooseUploadActivity;
        }

        @Override // b.g
        public final Object then(b.i<List<MediaModel>> iVar) {
            RecyclerView.f fVar;
            l.b(iVar, "");
            if (com.ss.android.ugc.aweme.base.utils.d.a(iVar.d())) {
                i iVar2 = this.f91339a.f91327a;
                if (iVar2 != null) {
                    iVar2.dismiss();
                }
                TextView textView = this.f91339a.f91330d;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = this.f91339a.f91330d;
                if (textView2 != null) {
                    textView2.setText(this.f91339a.getResources().getString(R.string.dhh));
                }
            } else {
                TextView textView3 = this.f91339a.f91330d;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                i iVar3 = this.f91339a.f91327a;
                if (iVar3 != null) {
                    iVar3.dismiss();
                }
                d dVar = this.f91339a.f91331e;
                if (dVar != null) {
                    List<MediaModel> d2 = iVar.d();
                    l.b(d2, "");
                    dVar.a(d2);
                }
                RecyclerView recyclerView = this.f91339a.f91328b;
                if (recyclerView != null) {
                    recyclerView.setAdapter(this.f91339a.f91331e);
                }
                RecyclerView recyclerView2 = this.f91339a.f91328b;
                if (recyclerView2 != null) {
                    fVar = recyclerView2.getItemAnimator();
                } else {
                    fVar = null;
                }
                if (!(fVar instanceof ab)) {
                    fVar = null;
                }
                ab abVar = (ab) fVar;
                if (abVar != null) {
                    abVar.f3953m = false;
                }
                d dVar2 = this.f91339a.f91331e;
                if (dVar2 != null) {
                    dVar2.f91362e = this.f91339a.f91333g;
                }
                d dVar3 = this.f91339a.f91331e;
                if (dVar3 != null) {
                    dVar3.f91363f = this.f91339a.f91334h;
                }
            }
            return null;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.v2);
        this.f91327a = new i(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.drg);
        this.f91328b = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new WrapGridLayoutManager((Context) null, this.p));
        }
        RecyclerView recyclerView2 = this.f91328b;
        if (recyclerView2 != null) {
            recyclerView2.a(new com.ss.android.ugc.aweme.base.widget.b(this.p, (int) n.b(this, 1.0f)));
        }
        this.f91330d = (TextView) findViewById(R.id.f3j);
        this.f91329c = (TextView) findViewById(R.id.f8l);
        TextView textView = (TextView) findViewById(R.id.ewf);
        this.f91336l = textView;
        if (textView != null) {
            textView.setOnClickListener(new d(this));
        }
        TextView textView2 = this.f91329c;
        if (textView2 != null) {
            textView2.setOnClickListener(new e(this));
        }
        if (getIntent().hasExtra("shouldWithCamera")) {
            this.f91337m = Boolean.valueOf(getIntent().getBooleanExtra("shouldWithCamera", true));
        }
        if (getIntent().hasExtra("maxSelectNum")) {
            this.n = getIntent().getIntExtra("maxSelectNum", 9);
        }
        if (getIntent().hasExtra("maxFileSize")) {
            this.o = getIntent().getLongExtra("maxFileSize", Long.MAX_VALUE);
        }
        if (getIntent().hasExtra("needBase64Response")) {
            this.f91335k = getIntent().getBooleanExtra("needBase64Response", false);
        }
        if (getIntent() != null && getIntent().hasExtra("enter_from") && !TextUtils.isEmpty(a(getIntent(), "enter_from"))) {
            String a2 = a(getIntent(), "enter_from");
            if (a2 == null) {
                l.b();
            }
            this.q = a2;
        }
        this.f91331e = new d(this, this.p, this.n, this.o, this.f91335k, this.f91337m);
        i iVar = this.f91327a;
        if (iVar != null) {
            iVar.show();
        }
        b.i.b(new b(this), b.i.f4824a).a(new c(this), b.i.f4826c, null);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    static final class g extends h.f.b.m implements m<View, String, z> {
        final /* synthetic */ ImageChooseUploadActivity this$0;

        static {
            Covode.recordClassIndex(57489);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(ImageChooseUploadActivity imageChooseUploadActivity) {
            super(2);
            this.this$0 = imageChooseUploadActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(View view, String str) {
            View view2 = view;
            String str2 = str;
            l.d(view2, "");
            if (!TextUtils.isEmpty(str2)) {
                ICrossPlatformLegacyService f2 = CrossPlatformLegacyServiceImpl.f();
                ImageChooseUploadActivity imageChooseUploadActivity = this.this$0;
                f2.a(imageChooseUploadActivity, view2, (((float) n.a(imageChooseUploadActivity)) * 1.0f) / ((float) n.b(this.this$0)), str2);
            }
            return z.f158842a;
        }
    }
}
