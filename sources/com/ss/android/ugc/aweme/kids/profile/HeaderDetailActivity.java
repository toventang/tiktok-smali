package com.ss.android.ugc.aweme.kids.profile;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.facebook.drawee.e.q;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.e.h;
import com.facebook.imagepipeline.e.k;
import com.facebook.imagepipeline.o.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.ss.android.ugc.aweme.video.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class HeaderDetailActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f106729b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.api.account.a.a f106730a;

    /* renamed from: c  reason: collision with root package name */
    private float f106731c;

    /* renamed from: d  reason: collision with root package name */
    private ZoomAnimationUtils.ZoomInfo f106732d;

    /* renamed from: e  reason: collision with root package name */
    private String[] f106733e;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f106734f;

    static {
        Covode.recordClassIndex(68223);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f106734f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f106734f == null) {
            this.f106734f = new HashMap();
        }
        View view = (View) this.f106734f.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f106734f.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.profile.HeaderDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.profile.HeaderDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.profile.HeaderDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68224);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(Activity activity, View view, com.ss.android.ugc.aweme.kids.api.account.a.a aVar) {
            UrlModel userAvatar;
            if (!(aVar == null || (userAvatar = aVar.getUserAvatar()) == null || !d.b(userAvatar.getUrlList()))) {
                int size = userAvatar.getUrlList().size();
                String[] strArr = new String[size];
                for (int i2 = 0; i2 < size; i2++) {
                    strArr[i2] = userAvatar.getUrlList().get(i2);
                }
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, size);
                l.d(strArr2, "");
                Bundle bundle = new Bundle();
                if (view == null) {
                    l.b();
                }
                bundle.putParcelable("extra_zoom_info", ZoomAnimationUtils.a(view));
                bundle.putStringArray("uri", strArr2);
                bundle.putFloat("wh_ratio", 1.0f);
                if (aVar != null) {
                    bundle.putSerializable("user", aVar);
                }
                l.d(bundle, "");
                if (activity != null) {
                    Intent intent = new Intent(activity, HeaderDetailActivity.class);
                    intent.putExtras(bundle);
                    com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
                    activity.startActivity(intent);
                    activity.overridePendingTransition(0, 0);
                }
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.cc);
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

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HeaderDetailActivity f106735a;

        static {
            Covode.recordClassIndex(68225);
        }

        b(HeaderDetailActivity headerDetailActivity) {
            this.f106735a = headerDetailActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f106735a.onBackPressed();
        }
    }

    private static String a(List<String> list) {
        h e2 = k.a().e();
        for (String str : list) {
            if (e2.b(Uri.parse(str))) {
                return str;
            }
        }
        return null;
    }

    private static com.facebook.imagepipeline.o.b a(String str) {
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
        imageDecodeOptionsBuilder.f47724e = false;
        com.facebook.imagepipeline.common.b bVar = new com.facebook.imagepipeline.common.b(imageDecodeOptionsBuilder);
        c a2 = c.a(Uri.parse(str));
        a2.f48449f = bVar;
        int[] b2 = b(str);
        if (b2 != null && b2[0] > 0 && b2[1] > 0) {
            l.b(a2, "");
            a2.f48447d = new com.facebook.imagepipeline.common.d(b2[0], b2[1]);
        }
        com.facebook.imagepipeline.o.b a3 = a2.a();
        l.b(a3, "");
        return a3;
    }

    private static int[] b(String str) {
        int i2;
        MethodCollector.i(3365);
        Uri parse = Uri.parse(str);
        l.b(parse, "");
        if (!e.b(parse.getPath())) {
            MethodCollector.o(3365);
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(parse.getPath(), options);
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        if (i3 > 720 || i4 > 1280) {
            int i5 = i3 >> 1;
            int i6 = i4 >> 1;
            i2 = 1;
            while (i5 / i2 > 720 && i6 / i2 > 1280) {
                i2 <<= 1;
            }
        } else {
            i2 = 1;
        }
        int[] iArr = {i3 >> i2, i4 >> i2};
        MethodCollector.o(3365);
        return iArr;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.profile.HeaderDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.adu);
        overridePendingTransition(R.anim.cb, R.anim.cc);
        this.f106732d = (ZoomAnimationUtils.ZoomInfo) getIntent().getParcelableExtra("extra_zoom_info");
        this.f106733e = getIntent().getStringArrayExtra("uri");
        this.f106731c = getIntent().getFloatExtra("wh_ratio", 1.0f);
        Serializable serializableExtra = getIntent().getSerializableExtra("user");
        Objects.requireNonNull(serializableExtra, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.api.account.model.IKidsUser");
        this.f106730a = (com.ss.android.ugc.aweme.kids.api.account.a.a) serializableExtra;
        FixedRatioFrameLayout fixedRatioFrameLayout = (FixedRatioFrameLayout) _$_findCachedViewById(R.id.b9l);
        l.b(fixedRatioFrameLayout, "");
        fixedRatioFrameLayout.setWhRatio(this.f106731c);
        com.facebook.drawee.view.c cVar = (com.facebook.drawee.view.c) _$_findCachedViewById(R.id.fcy);
        l.b(cVar, "");
        ((com.facebook.drawee.f.a) cVar.getHierarchy()).a(q.b.f47438d);
        a((RemoteImageView) _$_findCachedViewById(R.id.fcy), this.f106733e);
        ((ConstraintLayout) _$_findCachedViewById(R.id.dqn)).setBackgroundColor(-16777216);
        ((ConstraintLayout) _$_findCachedViewById(R.id.dqn)).setOnClickListener(new b(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.profile.HeaderDetailActivity", "onCreate", false);
    }

    private final void a(RemoteImageView remoteImageView, String[] strArr) {
        String str;
        UrlModel userAvatar;
        if (remoteImageView != null) {
            ArrayList arrayList = new ArrayList();
            if (!d.a(strArr)) {
                if (strArr == null) {
                    l.b();
                }
                for (String str2 : strArr) {
                    if (!m.a(str2)) {
                        arrayList.add(a(str2));
                    }
                }
            }
            com.ss.android.ugc.aweme.kids.api.account.a.a aVar = this.f106730a;
            REQUEST request = null;
            if (aVar == null || (userAvatar = aVar.getUserAvatar()) == null) {
                str = null;
            } else {
                List<String> urlList = userAvatar.getUrlList();
                l.b(urlList, "");
                str = a(urlList);
            }
            if (!TextUtils.isEmpty(str)) {
                request = (REQUEST) a(str);
            }
            if (d.a(arrayList)) {
                com.ss.android.ugc.aweme.base.e.a(remoteImageView, 2131232324);
                return;
            }
            com.facebook.drawee.a.a.e b2 = com.facebook.drawee.a.a.c.b();
            Object[] array = arrayList.toArray(new com.facebook.imagepipeline.o.b[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            com.facebook.drawee.a.a.e eVar = (com.facebook.drawee.a.a.e) b2.a(array);
            eVar.f47325m = remoteImageView.getController();
            if (request != null) {
                eVar.f47316d = request;
            }
            remoteImageView.setController(eVar.e());
        }
    }
}
