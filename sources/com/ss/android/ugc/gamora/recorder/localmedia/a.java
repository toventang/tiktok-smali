package com.ss.android.ugc.gamora.recorder.localmedia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.h.v;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.t;
import com.bytedance.scene.i;
import com.bytedance.scene.j;
import com.bytedance.scene.n;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ClosingChooseMediaPageState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.Objects;

public final class a extends j {

    /* renamed from: a  reason: collision with root package name */
    public static final h f148043a = i.a((h.f.a.a) b.f148046a);

    /* renamed from: b  reason: collision with root package name */
    public static final C3990a f148044b = new C3990a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private ShortVideoContext f148045c;

    /* renamed from: com.ss.android.ugc.gamora.recorder.localmedia.a$a  reason: collision with other inner class name */
    public static final class C3990a {
        static {
            Covode.recordClassIndex(97590);
        }

        public static int a() {
            return ((Number) a.f148043a.getValue()).intValue();
        }

        private C3990a() {
        }

        public /* synthetic */ C3990a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ Bundle $bundle;
        final /* synthetic */ LocalMediaArgument $localMediaArgument;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(97592);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, Bundle bundle, LocalMediaArgument localMediaArgument) {
            super(0);
            this.this$0 = aVar;
            this.$bundle = bundle;
            this.$localMediaArgument = localMediaArgument;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            Intent intent = new Intent(this.this$0.f42913m, MvChoosePhotoActivity.class);
            intent.putExtras(this.$bundle);
            if (this.$localMediaArgument.f148034b > 0) {
                Activity t = this.this$0.t();
                intent.putExtra("key_start_activity_request_code", this.$localMediaArgument.f148034b);
                t.startActivityForResult(intent, this.$localMediaArgument.f148034b);
            } else {
                a(this.this$0.t(), intent);
            }
            com.bytedance.scene.ktx.b.b(this.this$0).b(this.this$0);
        }

        private static void a(Activity activity, Intent intent) {
            com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
            activity.startActivity(intent);
        }
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ Bundle $bundle;
        final /* synthetic */ LocalMediaArgument $localMediaArgument;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(97593);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, Bundle bundle, LocalMediaArgument localMediaArgument) {
            super(0);
            this.this$0 = aVar;
            this.$bundle = bundle;
            this.$localMediaArgument = localMediaArgument;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            MethodCollector.i(11568);
            Activity activity = this.this$0.f42913m;
            if (activity != null) {
                final FrameLayout k2 = ((com.ss.android.ugc.aweme.shortvideo.ui.m) activity).k();
                l.b(k2, "");
                if (k2.findViewById(C3990a.a()) != null) {
                    MethodCollector.o(11568);
                    return;
                }
                ao aoVar = new ao();
                Bundle bundle = this.$bundle;
                Bundle bundle2 = this.this$0.r;
                if (bundle2 != null) {
                    bundle.putBoolean("from_upload_btn_click", bundle2.getBoolean("from_upload_btn_click"));
                    Bundle bundle3 = this.this$0.r;
                    if (bundle3 == null) {
                        l.b();
                    }
                    bundle.putLong("click_album_icon_time", bundle3.getLong("click_album_icon_time", 0));
                }
                if (this.$localMediaArgument.f148034b > 0) {
                    bundle.putInt("key_start_activity_request_code", this.$localMediaArgument.f148034b);
                }
                aoVar.r = this.$bundle;
                final FrameLayout frameLayout = new FrameLayout(activity);
                frameLayout.setId(C3990a.a());
                k2.addView(frameLayout, -1, -1);
                i.a a2 = com.bytedance.scene.i.a(activity, ao.class);
                a2.f42897e = false;
                i.a a3 = a2.a("attachMvChoosePhotoScene");
                a3.f42898f = new C3991a(aoVar);
                a3.f42894b = false;
                a3.f42895c = false;
                a3.f42896d = frameLayout.getId();
                final n a4 = a3.a();
                l.b(a4, "");
                JediViewModel a5 = t.a((e) activity).a(ChooseMediaViewModel.class);
                l.b(a5, "");
                f.a.b.b unused = ((ChooseMediaViewModel) a5).a(this.this$0, b.f148048a, new ah(), new h.f.a.b<ClosingChooseMediaPageState, z>(this) {
                    /* class com.ss.android.ugc.gamora.recorder.localmedia.a.d.AnonymousClass1 */
                    final /* synthetic */ d this$0;

                    static {
                        Covode.recordClassIndex(97594);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(ClosingChooseMediaPageState closingChooseMediaPageState) {
                        MethodCollector.i(11563);
                        l.d(closingChooseMediaPageState, "");
                        if (l.a(closingChooseMediaPageState, ClosingChooseMediaPageState.Closed.INSTANCE)) {
                            a4.b();
                            k2.removeView(frameLayout);
                            com.bytedance.scene.ktx.b.b(this.this$0.this$0).b(this.this$0.this$0);
                        }
                        z zVar = z.f158842a;
                        MethodCollector.o(11563);
                        return zVar;
                    }
                });
                MethodCollector.o(11568);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.IShootPageLayoutGetter");
            MethodCollector.o(11568);
            throw nullPointerException;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.gamora.recorder.localmedia.a$d$a  reason: collision with other inner class name */
        public static final class C3991a implements com.bytedance.scene.l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ao f148047a;

            static {
                Covode.recordClassIndex(97595);
            }

            C3991a(ao aoVar) {
                this.f148047a = aoVar;
            }

            @Override // com.bytedance.scene.l
            public final j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
                l.d(classLoader, "");
                l.d(str, "");
                if (TextUtils.equals("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao", str)) {
                    return this.f148047a;
                }
                return null;
            }
        }
    }

    static final class b extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f148046a = new b();

        static {
            Covode.recordClassIndex(97591);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(v.a());
        }
    }

    static {
        Covode.recordClassIndex(97589);
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a2 = ae.a((e) activity, (ad.b) null).a(ShortVideoContextViewModel.class);
        l.b(a2, "");
        Parcelable a3 = com.bytedance.creativex.a.a.a(((ShortVideoContextViewModel) a2).f124769a);
        l.b(a3, "");
        this.f148045c = (ShortVideoContext) a3;
        Bundle bundle2 = this.r;
        if (bundle2 == null) {
            l.b();
        }
        Object a4 = a(bundle2, "local_media_argument");
        Objects.requireNonNull(a4, "null cannot be cast to non-null type com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument");
        LocalMediaArgument localMediaArgument = (LocalMediaArgument) a4;
        Bundle bundle3 = new Bundle();
        bundle3.putInt("key_support_flag", localMediaArgument.f148035c);
        bundle3.putBoolean("Key_enable_multi_video", localMediaArgument.f148036d);
        bundle3.putLong("Key_min_duration", localMediaArgument.f148038f);
        bundle3.putInt("key_photo_select_min_count", localMediaArgument.f148039g);
        bundle3.putInt("key_photo_select_max_count", localMediaArgument.f148040h);
        bundle3.putInt("key_video_select_min_count", localMediaArgument.f148041i);
        bundle3.putInt("key_video_select_max_count", localMediaArgument.f148042j);
        bundle3.putInt("key_choose_scene", localMediaArgument.f148037e);
        ShortVideoContext shortVideoContext = this.f148045c;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        bundle3.putParcelable("key_short_video_context", shortVideoContext);
        bundle3.putInt("key_choose_request_code", localMediaArgument.f148033a);
        c cVar = new c(this, bundle3, localMediaArgument);
        d dVar = new d(this, bundle3, localMediaArgument);
        b.a.f132249a.step(OpenAlbumPanelPerformanceMonitor.f132344a, "startPhotoChoose");
        Bundle bundle4 = this.r;
        if (bundle4 == null) {
            l.b();
        }
        if (!bundle4.getBoolean("from_upload_btn_click") || g.a().A().a()) {
            cVar.a();
        } else {
            dVar.a();
        }
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MethodCollector.i(9717);
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View view = new View(viewGroup.getContext());
        MethodCollector.o(9717);
        return view;
    }
}
