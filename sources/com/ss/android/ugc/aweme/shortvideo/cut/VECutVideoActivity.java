package com.ss.android.ugc.aweme.shortvideo.cut;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.adaptation.h;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.port.in.ao;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.af;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.ap;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.au;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.ba;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.bv;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.t;
import com.ss.android.ugc.aweme.shortvideo.j.c;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.gamora.editor.corner.EditCornerViewModel;
import com.ss.android.ugc.tools.utils.k;
import com.ss.ugc.aweme.performance.a.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class VECutVideoActivity extends h implements i, j {

    /* renamed from: f  reason: collision with root package name */
    public static final a f125339f = new a((byte) 0);

    /* renamed from: i  reason: collision with root package name */
    private static final String f125340i = VECutVideoActivity.class.getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    public ap f125341e;

    /* renamed from: g  reason: collision with root package name */
    private CutVideoViewModel f125342g;

    /* renamed from: h  reason: collision with root package name */
    private EditCornerViewModel f125343h;

    /* renamed from: j  reason: collision with root package name */
    private HashMap f125344j;

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final boolean bu_() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final View d_(int i2) {
        if (this.f125344j == null) {
            this.f125344j = new HashMap();
        }
        View view = (View) this.f125344j.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f125344j.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(212, new g(VECutVideoActivity.class, "onEvent", c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82279);
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity$a$a  reason: collision with other inner class name */
        public static final class C3268a extends m implements h.f.a.a<z> {
            final /* synthetic */ Context $context;
            final /* synthetic */ Intent $intent;
            final /* synthetic */ h.f.a.a $onFinish;
            final /* synthetic */ int $requestCode;

            static {
                Covode.recordClassIndex(82280);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3268a(Context context, Intent intent, int i2, h.f.a.a aVar) {
                super(0);
                this.$context = context;
                this.$intent = intent;
                this.$requestCode = i2;
                this.$onFinish = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                a();
                return z.f158842a;
            }

            public final void a() {
                a.a(this.$context, this.$intent, this.$requestCode);
                h.f.a.a aVar = this.$onFinish;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static final class b extends m implements h.f.a.b<Boolean, z> {
            final /* synthetic */ Context $context;
            final /* synthetic */ C3268a $enterVideoCutActivity$1;
            final /* synthetic */ Intent $intent;
            final /* synthetic */ List $mediaModelList;
            final /* synthetic */ h.f.a.a $onFinish;

            static {
                Covode.recordClassIndex(82281);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Context context, List list, Intent intent, h.f.a.a aVar, C3268a aVar2) {
                super(1);
                this.$context = context;
                this.$mediaModelList = list;
                this.$intent = intent;
                this.$onFinish = aVar;
                this.$enterVideoCutActivity$1 = aVar2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Boolean bool) {
                if (bool.booleanValue()) {
                    com.ss.android.ugc.aweme.ak.a a2 = com.ss.android.ugc.aweme.port.in.g.a().L().a((Activity) this.$context, 1000, 3600000);
                    List<? extends MediaModel> list = this.$mediaModelList;
                    Intent intent = this.$intent;
                    a2.a(list, intent, intent, this.$onFinish);
                } else {
                    this.$enterVideoCutActivity$1.a();
                }
                return z.f158842a;
            }
        }

        public static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }

        private static void a(Context context, Intent intent) {
            com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
            context.startActivity(intent);
        }

        public static void a(Context context, Intent intent, int i2) {
            l.d(context, "");
            l.d(intent, "");
            intent.setClass(context, VECutVideoActivity.class);
            if (intent.getLongExtra("extra_start_enter_cut_page", -1) == -1) {
                intent.putExtra("extra_start_enter_cut_page", System.currentTimeMillis());
            }
            if (i2 == -1 || !(context instanceof Activity)) {
                a(context, intent);
            } else {
                ((Activity) context).startActivityForResult(intent, i2);
            }
        }

        public static void a(Activity activity, Intent intent, boolean z, boolean z2) {
            l.d(activity, "");
            l.d(intent, "");
            if (z2) {
                VEVideoPublishEditActivity.a(activity, intent);
            } else if (z) {
                intent.putExtra("extra_request_code", 8);
                VEVideoPublishEditActivity.a(activity, intent);
            } else {
                VEVideoPublishEditActivity.a((Context) activity, intent);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final int bv_() {
        return androidx.core.content.b.c(this, R.color.c9);
    }

    @Override // androidx.fragment.app.e
    public final void onBackPressed() {
        CutVideoViewModel cutVideoViewModel = this.f125342g;
        if (cutVideoViewModel == null) {
            l.a("cutVideoViewModel");
        }
        cutVideoViewModel.a();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        b.a.f132249a.leave(this, "clip");
    }

    static {
        Covode.recordClassIndex(82278);
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onResume", true);
        super.onResume();
        a.C4076a.a().a("tool_cut");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        com.ss.android.ugc.aweme.shortvideo.util.b bVar = b.a.f132249a;
        CutVideoViewModel cutVideoViewModel = this.f125342g;
        if (cutVideoViewModel == null) {
            l.a("cutVideoViewModel");
        }
        String str = cutVideoViewModel.b().f125563l;
        CutVideoViewModel cutVideoViewModel2 = this.f125342g;
        if (cutVideoViewModel2 == null) {
            l.a("cutVideoViewModel");
        }
        bVar.pause(this, "clip", str, cutVideoViewModel2.b().o);
        a.C4076a.a().b("tool_cut");
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
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

    public final void finish() {
        String str;
        super.finish();
        if (com.ss.android.ugc.aweme.mediachoose.helper.c.f109414a != null) {
            com.ss.android.ugc.aweme.mediachoose.helper.c.f109414a.b();
        }
        CutVideoViewModel cutVideoViewModel = this.f125342g;
        if (cutVideoViewModel == null) {
            l.a("cutVideoViewModel");
        }
        if (!TextUtils.isEmpty(cutVideoViewModel.k())) {
            CutVideoViewModel cutVideoViewModel2 = this.f125342g;
            if (cutVideoViewModel2 == null) {
                l.a("cutVideoViewModel");
            }
            t tVar = cutVideoViewModel2.b().f125558g;
            String str2 = null;
            if (tVar != null) {
                try {
                    str = tVar.getExtra();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                if (tVar != null) {
                    str2 = tVar.getExtra();
                }
                if (1 == new JSONObject(str2).optInt("timor_video_source")) {
                    IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                    l.b(createIAVServiceProxybyMonsterPlugin, "");
                    ao miniAppService = createIAVServiceProxybyMonsterPlugin.getMiniAppService();
                    CutVideoViewModel cutVideoViewModel3 = this.f125342g;
                    if (cutVideoViewModel3 == null) {
                        l.a("cutVideoViewModel");
                    }
                    miniAppService.a(cutVideoViewModel3.k());
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void h() {
        CutVideoViewModel cutVideoViewModel = this.f125342g;
        if (cutVideoViewModel == null) {
            l.a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.g()) {
            ap apVar = this.f125341e;
            if (apVar == null) {
                l.a("cutVideoRootScene");
            }
            CutVideoViewModel cutVideoViewModel2 = apVar.f125615f;
            if (cutVideoViewModel2 == null) {
                l.a("cutVideoViewModel");
            }
            if (!cutVideoViewModel2.g()) {
                VideoEditViewModel videoEditViewModel = apVar.f125616g;
                if (videoEditViewModel == null) {
                    l.a("videoEditViewModel");
                }
                int i2 = videoEditViewModel.k().get(0).f125482f;
                VideoEditViewModel videoEditViewModel2 = apVar.f125616g;
                if (videoEditViewModel2 == null) {
                    l.a("videoEditViewModel");
                }
                int min = Math.min(i2, videoEditViewModel2.k().get(0).f125483g);
                VideoEditViewModel videoEditViewModel3 = apVar.f125616g;
                if (videoEditViewModel3 == null) {
                    l.a("videoEditViewModel");
                }
                int i3 = videoEditViewModel3.k().get(0).f125482f;
                VideoEditViewModel videoEditViewModel4 = apVar.f125616g;
                if (videoEditViewModel4 == null) {
                    l.a("videoEditViewModel");
                }
                int max = Math.max(i3, videoEditViewModel4.k().get(0).f125483g);
                CutVideoPreviewViewModel cutVideoPreviewViewModel = apVar.f125621l;
                if (cutVideoPreviewViewModel == null) {
                    l.a("previewViewModel");
                }
                cutVideoPreviewViewModel.a(min, max);
            }
        }
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onEvent(c cVar) {
        l.d(cVar, "");
        finish();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void a(boolean z) {
        int i2;
        CutVideoViewModel cutVideoViewModel = this.f125342g;
        if (cutVideoViewModel == null) {
            l.a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.g()) {
            EditCornerViewModel editCornerViewModel = this.f125343h;
            if (editCornerViewModel == null) {
                l.a("cornerViewModel");
            }
            if (z) {
                i2 = dh.c(this);
            } else {
                i2 = 0;
            }
            editCornerViewModel.a(i2);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, androidx.appcompat.app.d
    public final void onSaveInstanceState(Bundle bundle) {
        l.d(bundle, "");
        super.onSaveInstanceState(bundle);
        CutVideoViewModel cutVideoViewModel = this.f125342g;
        if (cutVideoViewModel == null) {
            l.a("cutVideoViewModel");
        }
        if (cutVideoViewModel.j()) {
            CutVideoViewModel cutVideoViewModel2 = this.f125342g;
            if (cutVideoViewModel2 == null) {
                l.a("cutVideoViewModel");
            }
            bundle.putParcelable("workspace", cutVideoViewModel2.b().f125560i);
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.h
    public final void b(boolean z) {
        int b2;
        int i2;
        CutVideoViewModel cutVideoViewModel = this.f125342g;
        if (cutVideoViewModel == null) {
            l.a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.g()) {
            ap apVar = this.f125341e;
            if (apVar == null) {
                l.a("cutVideoRootScene");
            }
            CutVideoViewModel cutVideoViewModel2 = apVar.f125615f;
            if (cutVideoViewModel2 == null) {
                l.a("cutVideoViewModel");
            }
            int i3 = 0;
            if (!cutVideoViewModel2.g()) {
                au E = apVar.E();
                int c2 = com.ss.android.ugc.aweme.adaptation.a.c();
                View view = E.F().n;
                l.b(view, "");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (z) {
                    b2 = c2;
                } else {
                    b2 = (int) n.b(E.f42913m, 132.0f);
                }
                marginLayoutParams.height = b2;
                View view2 = E.F().n;
                l.b(view2, "");
                view2.setLayoutParams(marginLayoutParams);
                View view3 = E.G().n;
                l.b(view3, "");
                ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (z) {
                    i2 = (int) (n.b(E.f42913m, 5.5f) + ((float) c2));
                } else {
                    i2 = 0;
                }
                marginLayoutParams2.bottomMargin = i2;
                View view4 = E.G().n;
                l.b(view4, "");
                view4.setLayoutParams(marginLayoutParams2);
            }
            EditCornerViewModel editCornerViewModel = this.f125343h;
            if (editCornerViewModel == null) {
                l.a("cornerViewModel");
            }
            if (z) {
                i3 = com.ss.android.ugc.aweme.adaptation.a.c();
            }
            editCornerViewModel.b(i3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r1 != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fb, code lost:
        if (r7.equals("lv_sync") == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012d, code lost:
        if (r7.equals("system_upload") != false) goto L_0x012f;
     */
    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r13) {
        /*
        // Method dump skipped, instructions count: 451
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity.onCreate(android.os.Bundle):void");
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    static final class b implements com.bytedance.scene.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VECutVideoActivity f125345a;

        static {
            Covode.recordClassIndex(82282);
        }

        b(VECutVideoActivity vECutVideoActivity) {
            this.f125345a = vECutVideoActivity;
        }

        @Override // com.bytedance.scene.l
        public final com.bytedance.scene.j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
            l.d(classLoader, "");
            l.d(str, "");
            if (!l.a((Object) ap.class.getName(), (Object) str)) {
                return null;
            }
            ap apVar = this.f125345a.f125341e;
            if (apVar == null) {
                l.a("cutVideoRootScene");
            }
            return apVar;
        }
    }

    @Override // androidx.fragment.app.e
    public final void onActivityResult(int i2, int i3, Intent intent) {
        Bundle a2;
        List<VideoSegment> videoSegmentList;
        super.onActivityResult(i2, i3, intent);
        ap apVar = this.f125341e;
        if (apVar == null) {
            l.a("cutVideoRootScene");
        }
        CutVideoViewModel cutVideoViewModel = apVar.f125615f;
        if (cutVideoViewModel == null) {
            l.a("cutVideoViewModel");
        }
        if (cutVideoViewModel.g()) {
            af F = apVar.F();
            CutVideoViewModel cutVideoViewModel2 = F.f125568i;
            if (cutVideoViewModel2 == null) {
                l.a("cutVideoViewModel");
            }
            if (cutVideoViewModel2.i()) {
                ba baVar = F.f125565f;
                if (baVar != null) {
                    bv bvVar = baVar.f125671b;
                    if (bvVar == null) {
                        l.a("stickPointVideoSegController");
                    }
                    bvVar.a(i2, i3, intent);
                }
            } else if (i2 == 1001) {
                if (i3 == -1 && intent != null) {
                    ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
                    if (!k.a(parcelableArrayListExtra)) {
                        ArrayList arrayList = new ArrayList();
                        VideoEditViewModel videoEditViewModel = F.f125569j;
                        if (videoEditViewModel == null) {
                            l.a("videoEditViewModel");
                        }
                        int size = videoEditViewModel.k().size();
                        if (parcelableArrayListExtra == null) {
                            l.b();
                        }
                        int size2 = parcelableArrayListExtra.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            VideoSegment videoSegment = new VideoSegment((MediaModel) parcelableArrayListExtra.get(i4));
                            videoSegment.f125477a = size;
                            arrayList.add(videoSegment);
                            size++;
                        }
                        z zVar = F.I().f125827a;
                        if (zVar != null) {
                            zVar.b(arrayList);
                        }
                        F.H().b().a(arrayList);
                        VECutVideoPresenter vECutVideoPresenter = F.f125566g;
                        if (vECutVideoPresenter == null) {
                            l.a("presenter");
                        }
                        VideoEditViewModel videoEditViewModel2 = F.f125569j;
                        if (videoEditViewModel2 == null) {
                            l.a("videoEditViewModel");
                        }
                        vECutVideoPresenter.a(arrayList, videoEditViewModel2.k().size());
                    }
                } else {
                    return;
                }
            }
            VideoEditViewModel videoEditViewModel3 = F.f125569j;
            if (videoEditViewModel3 == null) {
                l.a("videoEditViewModel");
            }
            androidx.lifecycle.t<CutVideoContext> tVar = videoEditViewModel3.w;
            l.b(tVar, "");
            CutVideoContext value = tVar.getValue();
            if (!(value == null || (videoSegmentList = value.getVideoSegmentList()) == null)) {
                ArrayList arrayList2 = new ArrayList(h.a.n.a((Iterable) videoSegmentList, 10));
                Iterator<T> it = videoSegmentList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(it.next().f125478b));
                }
                if (h.a.n.v(arrayList2) > 60000) {
                    CutVideoViewModel cutVideoViewModel3 = F.f125568i;
                    if (cutVideoViewModel3 == null) {
                        l.a("cutVideoViewModel");
                    }
                    if (!cutVideoViewModel3.i() || F.G().a().getCurrentMode() == 2) {
                        F.L();
                    }
                }
            }
        }
        if (i2 == 1002) {
            Intent intent2 = new Intent();
            if (!(intent == null || a(intent) == null)) {
                Bundle a3 = a(intent);
                if (a3 == null) {
                    l.b();
                }
                String string = a3.getString("edit result");
                StringBuilder sb = new StringBuilder("RecordActivity return success ");
                if (string == null) {
                    l.b();
                }
                intent2.putExtra("record result", sb.append(string).toString());
            }
            setResult(-1, intent2);
            finish();
        } else if (i2 == 8 && i3 == 9) {
            Intent intent3 = new Intent();
            if (!(intent == null || (a2 = a(intent)) == null)) {
                intent3.putExtras(a2);
            }
            setResult(9, intent3);
            finish();
        }
    }
}
