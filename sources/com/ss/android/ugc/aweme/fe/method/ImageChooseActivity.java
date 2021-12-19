package com.ss.android.ugc.aweme.fe.method;

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
import h.a.n;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class ImageChooseActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: i  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.fe.method.upload.c f91060i;

    /* renamed from: j  reason: collision with root package name */
    public static final a f91061j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public i f91062a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f91063b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f91064c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f91065d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.fe.method.upload.d f91066e;

    /* renamed from: f  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.fe.method.upload.f> f91067f;

    /* renamed from: g  reason: collision with root package name */
    public final m<View, String, z> f91068g = new g(this);

    /* renamed from: h  reason: collision with root package name */
    public final h.f.a.b<List<com.ss.android.ugc.aweme.fe.method.upload.f>, z> f91069h = new f(this);

    /* renamed from: k  reason: collision with root package name */
    private boolean f91070k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f91071l;

    /* renamed from: m  reason: collision with root package name */
    private Boolean f91072m = true;
    private int n = 1;
    private long o = Long.MAX_VALUE;
    private final int p = 4;
    private String q = "";
    private SparseArray r;

    static {
        Covode.recordClassIndex(57285);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.ImageChooseActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.ImageChooseActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.ImageChooseActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57286);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ImageChooseActivity f91073a;

        static {
            Covode.recordClassIndex(57287);
        }

        b(ImageChooseActivity imageChooseActivity) {
            this.f91073a = imageChooseActivity;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return AVExternalServiceImpl.a().infoService().getMediaLoaderImages(this.f91073a);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        super.onBackPressed();
        a("cancel_image_choose");
        com.ss.android.ugc.aweme.fe.method.upload.c cVar = f91060i;
        if (cVar != null) {
            cVar.k();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        com.ss.android.ugc.aweme.fe.method.upload.c cVar = f91060i;
        if (cVar != null) {
            cVar.l();
        }
        f91060i = null;
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
        final /* synthetic */ ImageChooseActivity f91075a;

        static {
            Covode.recordClassIndex(57289);
        }

        d(ImageChooseActivity imageChooseActivity) {
            this.f91075a = imageChooseActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.fe.method.upload.c cVar = ImageChooseActivity.f91060i;
            if (cVar != null) {
                cVar.k();
            }
            this.f91075a.finish();
            this.f91075a.a("cancel_image_choose");
        }
    }

    public final void a(String str) {
        r.a(str, new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.q).f66730a);
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ImageChooseActivity f91076a;

        static {
            Covode.recordClassIndex(57290);
        }

        e(ImageChooseActivity imageChooseActivity) {
            this.f91076a = imageChooseActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ImageChooseActivity imageChooseActivity = this.f91076a;
            if (!com.ss.android.ugc.aweme.base.utils.d.a(imageChooseActivity.f91067f)) {
                com.ss.android.ugc.aweme.fe.method.upload.d dVar = imageChooseActivity.f91066e;
                if (dVar == null || !dVar.f91361d) {
                    com.ss.android.ugc.aweme.fe.method.upload.d dVar2 = imageChooseActivity.f91066e;
                    if (dVar2 != null) {
                        dVar2.f91361d = true;
                    }
                    i iVar = imageChooseActivity.f91062a;
                    if (iVar != null) {
                        iVar.dismiss();
                    }
                    Intent intent = new Intent();
                    List<com.ss.android.ugc.aweme.fe.method.upload.f> list = imageChooseActivity.f91067f;
                    if (list == null) {
                        l.b();
                    }
                    ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().f91415a);
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    intent.putExtra("images", (String[]) array);
                    imageChooseActivity.setResult(41312, intent);
                    imageChooseActivity.finish();
                }
            }
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.fe.method.upload.f>, z> {
        final /* synthetic */ ImageChooseActivity this$0;

        static {
            Covode.recordClassIndex(57291);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ImageChooseActivity imageChooseActivity) {
            super(1);
            this.this$0 = imageChooseActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.fe.method.upload.f> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends com.ss.android.ugc.aweme.fe.method.upload.f> list) {
            int i2;
            List<? extends com.ss.android.ugc.aweme.fe.method.upload.f> list2 = list;
            if (com.ss.android.ugc.aweme.base.utils.d.b(list2)) {
                TextView textView = this.this$0.f91064c;
                if (textView != null) {
                    ImageChooseActivity imageChooseActivity = this.this$0;
                    Object[] objArr = new Object[1];
                    if (list2 != null) {
                        i2 = list2.size();
                    } else {
                        i2 = 0;
                    }
                    objArr[0] = Integer.valueOf(i2);
                    textView.setText(imageChooseActivity.getString(R.string.a81, objArr));
                }
                TextView textView2 = this.this$0.f91064c;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
            } else {
                TextView textView3 = this.this$0.f91064c;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            }
            this.this$0.f91067f = list2;
            return z.f158842a;
        }
    }

    static final class c<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ImageChooseActivity f91074a;

        static {
            Covode.recordClassIndex(57288);
        }

        c(ImageChooseActivity imageChooseActivity) {
            this.f91074a = imageChooseActivity;
        }

        @Override // b.g
        public final Object then(b.i<List<MediaModel>> iVar) {
            RecyclerView.f fVar;
            l.b(iVar, "");
            if (com.ss.android.ugc.aweme.base.utils.d.a(iVar.d())) {
                i iVar2 = this.f91074a.f91062a;
                if (iVar2 != null) {
                    iVar2.dismiss();
                }
                TextView textView = this.f91074a.f91065d;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = this.f91074a.f91065d;
                if (textView2 != null) {
                    textView2.setText(this.f91074a.getResources().getString(R.string.dhh));
                }
            } else {
                TextView textView3 = this.f91074a.f91065d;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                i iVar3 = this.f91074a.f91062a;
                if (iVar3 != null) {
                    iVar3.dismiss();
                }
                com.ss.android.ugc.aweme.fe.method.upload.d dVar = this.f91074a.f91066e;
                if (dVar != null) {
                    List<MediaModel> d2 = iVar.d();
                    l.b(d2, "");
                    dVar.a(d2);
                }
                RecyclerView recyclerView = this.f91074a.f91063b;
                if (recyclerView != null) {
                    recyclerView.setAdapter(this.f91074a.f91066e);
                }
                RecyclerView recyclerView2 = this.f91074a.f91063b;
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
                com.ss.android.ugc.aweme.fe.method.upload.d dVar2 = this.f91074a.f91066e;
                if (dVar2 != null) {
                    dVar2.f91362e = this.f91074a.f91068g;
                }
                com.ss.android.ugc.aweme.fe.method.upload.d dVar3 = this.f91074a.f91066e;
                if (dVar3 != null) {
                    dVar3.f91363f = this.f91074a.f91069h;
                }
            }
            return null;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.ImageChooseActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.v2);
        this.f91062a = new i(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.drg);
        this.f91063b = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new WrapGridLayoutManager((Context) null, this.p));
        }
        RecyclerView recyclerView2 = this.f91063b;
        if (recyclerView2 != null) {
            recyclerView2.a(new com.ss.android.ugc.aweme.base.widget.b(this.p, (int) com.bytedance.common.utility.n.b(this, 1.0f)));
        }
        this.f91065d = (TextView) findViewById(R.id.f3j);
        this.f91064c = (TextView) findViewById(R.id.f8l);
        TextView textView = (TextView) findViewById(R.id.ewf);
        this.f91071l = textView;
        if (textView != null) {
            textView.setOnClickListener(new d(this));
        }
        TextView textView2 = this.f91064c;
        if (textView2 != null) {
            textView2.setOnClickListener(new e(this));
        }
        if (getIntent().hasExtra("shouldWithCamera")) {
            this.f91072m = Boolean.valueOf(getIntent().getBooleanExtra("shouldWithCamera", true));
        }
        if (getIntent().hasExtra("maxSelectNum")) {
            this.n = getIntent().getIntExtra("maxSelectNum", 9);
        }
        if (getIntent().hasExtra("maxFileSize")) {
            this.o = getIntent().getLongExtra("maxFileSize", Long.MAX_VALUE);
        }
        if (getIntent().hasExtra("needBase64Response")) {
            this.f91070k = getIntent().getBooleanExtra("needBase64Response", false);
        }
        if (getIntent() != null && getIntent().hasExtra("enter_from")) {
            String a2 = a(getIntent(), "enter_from");
            if (a2 == null) {
                a2 = "";
            }
            this.q = a2;
        }
        this.f91066e = new com.ss.android.ugc.aweme.fe.method.upload.d(this, this.p, this.n, this.o, this.f91070k, this.f91072m);
        i iVar = this.f91062a;
        if (iVar != null) {
            iVar.show();
        }
        b.i.b(new b(this), b.i.f4824a).a(new c(this), b.i.f4826c, null);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.ImageChooseActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    static final class g extends h.f.b.m implements m<View, String, z> {
        final /* synthetic */ ImageChooseActivity this$0;

        static {
            Covode.recordClassIndex(57292);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(ImageChooseActivity imageChooseActivity) {
            super(2);
            this.this$0 = imageChooseActivity;
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
                ImageChooseActivity imageChooseActivity = this.this$0;
                f2.a(imageChooseActivity, view2, (((float) com.bytedance.common.utility.n.a(imageChooseActivity)) * 1.0f) / ((float) com.bytedance.common.utility.n.b(this.this$0)), str2);
            }
            return z.f158842a;
        }
    }
}
