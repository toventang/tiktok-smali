package com.ss.android.ugc.aweme.journey.step.swipeup;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.journey.step.swipeup.e;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.android.ugc.aweme.utils.cq;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.playerkit.videoview.j;
import com.zhiliaoapp.musically.R;
import h.c.b.a.k;
import h.c.h;
import h.f.b.l;
import h.q;
import h.r;
import h.z;
import java.io.File;
import java.util.Objects;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;

public final class WelcomeVideoWidget extends Widget implements au, e.b {

    /* renamed from: a  reason: collision with root package name */
    public final int f105132a;

    /* renamed from: h  reason: collision with root package name */
    RemoteImageView f105133h;

    /* renamed from: i  reason: collision with root package name */
    View f105134i;

    /* renamed from: j  reason: collision with root package name */
    e f105135j;

    /* renamed from: k  reason: collision with root package name */
    String f105136k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f105137l;

    /* renamed from: m  reason: collision with root package name */
    public final String f105138m;
    final Integer n;
    final boolean o;
    final float p;
    final boolean q;
    private boolean r;

    static {
        Covode.recordClassIndex(67408);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.swipeup.e.b
    public final void a() {
        this.r = true;
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
        super.onPause();
        if ((!this.q || !this.r) && this.f105137l) {
            e eVar = this.f105135j;
            if (eVar == null) {
                l.a("mWelcomeVideoHolder");
            } else {
                eVar.e();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
        super.onResume();
        if ((!this.q || !this.r) && this.f105137l) {
            e eVar = this.f105135j;
            if (eVar == null) {
                l.a("mWelcomeVideoHolder");
            } else {
                eVar.d();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
        if (this.f105137l) {
            e eVar = this.f105135j;
            if (eVar == null) {
                l.a("mWelcomeVideoHolder");
                return;
            }
            eVar.f105170e = false;
            int i2 = eVar.f105169d.f92885a;
            if (i2 == 1 || i2 == 2 || i2 == 4) {
                a aVar = eVar.f105168c;
                if (aVar == null) {
                    l.a("mPlayVideoHelper");
                }
                aVar.f105140b.a(aVar.f105141c);
                aVar.f105140b.i();
                aVar.f105140b.c();
                aVar.f105140b.d();
                eVar.f105169d.f92885a = 0;
                eVar.a();
            }
        }
    }

    private static File a(Context context) {
        if (d.f107193a != null && d.f107197e) {
            return d.f107193a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        d.f107193a = externalCacheDir;
        return externalCacheDir;
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void a(View view) {
        MethodCollector.i(6034);
        super.a(view);
        LayoutInflater from = LayoutInflater.from(this.f67007b);
        if (view != null) {
            from.inflate(R.layout.bkt, (ViewGroup) view);
            bz unused = kotlinx.coroutines.i.a(bs.f159054a, com.ss.android.ugc.aweme.ae.a.f66263a, null, new b(this, view, null), 2);
            MethodCollector.o(6034);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.o(6034);
        throw nullPointerException;
    }

    /* access modifiers changed from: package-private */
    public static final class a extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ h.c.d $it;
        int label;
        final /* synthetic */ WelcomeVideoWidget this$0;

        static {
            Covode.recordClassIndex(67409);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h.c.d dVar, h.c.d dVar2, WelcomeVideoWidget welcomeVideoWidget) {
            super(2, dVar2);
            this.$it = dVar;
            this.this$0 = welcomeVideoWidget;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new a(this.$it, dVar, this.this$0);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            String str;
            if (this.label == 0) {
                r.a(obj);
                Context context = this.this$0.f67007b;
                String str2 = this.this$0.f105138m;
                Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
                if (d.f107193a == null || !d.f107197e) {
                    d.f107193a = a2.getExternalCacheDir();
                }
                File file = d.f107193a;
                if (file == null || (str = file.getAbsolutePath()) == null) {
                    str = "";
                }
                File file2 = new File(str);
                if (file2.exists() || file2.mkdirs()) {
                    File file3 = new File(file2.getAbsoluteFile() + "/" + str2);
                    file3.exists();
                    if (cq.a(context, str2, file3)) {
                        file3.getAbsolutePath();
                    }
                }
                this.$it.resumeWith(q.m223constructorimpl(true));
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class b extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ View $view;
        Object L$0;
        int label;
        final /* synthetic */ WelcomeVideoWidget this$0;

        static {
            Covode.recordClassIndex(67410);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(WelcomeVideoWidget welcomeVideoWidget, View view, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = welcomeVideoWidget;
            this.$view = view;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new b(this.this$0, this.$view, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            WelcomeVideoWidget welcomeVideoWidget;
            Video video;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            UrlModel urlModel = null;
            if (i2 == 0) {
                r.a(obj);
                welcomeVideoWidget = this.this$0;
                this.L$0 = welcomeVideoWidget;
                this.label = 1;
                h hVar = new h(h.c.a.b.a(this));
                if (TextUtils.isEmpty(welcomeVideoWidget.f105136k)) {
                    hVar.resumeWith(q.m223constructorimpl(false));
                } else if ((c.b.d.b(com.bytedance.ies.ugc.appcontext.d.a()) / 1024) / 1024 > ((long) welcomeVideoWidget.f105132a)) {
                    bz unused = kotlinx.coroutines.i.a(bs.f159054a, null, null, new a(hVar, null, welcomeVideoWidget), 3);
                } else {
                    hVar.resumeWith(q.m223constructorimpl(false));
                }
                obj = hVar.a();
                if (obj == h.c.a.a.COROUTINE_SUSPENDED) {
                    l.d(this, "");
                }
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                welcomeVideoWidget = (WelcomeVideoWidget) this.L$0;
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            welcomeVideoWidget.f105137l = ((Boolean) obj).booleanValue();
            if (this.this$0.f105137l) {
                WelcomeVideoWidget welcomeVideoWidget2 = this.this$0;
                View findViewById = this.$view.findViewById(R.id.ffp);
                l.b(findViewById, "");
                welcomeVideoWidget2.f105134i = findViewById;
                View view = welcomeVideoWidget2.f105134i;
                if (view == null) {
                    l.a("mVideoContainer");
                }
                welcomeVideoWidget2.f105135j = new e(view, welcomeVideoWidget2, welcomeVideoWidget2.q);
                e eVar = welcomeVideoWidget2.f105135j;
                if (eVar == null) {
                    l.a("mWelcomeVideoHolder");
                }
                Aweme a2 = com.ss.android.ugc.aweme.video.e.a.a(welcomeVideoWidget2.f105136k);
                Integer num = welcomeVideoWidget2.n;
                boolean z = welcomeVideoWidget2.o;
                float f2 = welcomeVideoWidget2.p;
                l.d(a2, "");
                eVar.f105172g = true;
                eVar.f105171f = a2;
                if (eVar.f105169d.f92885a == 2) {
                    a aVar2 = eVar.f105168c;
                    if (aVar2 == null) {
                        l.a("mPlayVideoHelper");
                    }
                    aVar2.f105140b.b();
                }
                eVar.f105169d.f92885a = 0;
                a aVar3 = eVar.f105168c;
                if (aVar3 == null) {
                    l.a("mPlayVideoHelper");
                }
                l.d(a2, "");
                aVar3.f105139a = a2;
                Aweme aweme = eVar.f105171f;
                if (!(aweme == null || aweme.getVideo() == null)) {
                    VideoViewComponent videoViewComponent = eVar.f105166a;
                    if (videoViewComponent == null) {
                        l.a("mVideoView");
                    }
                    j jVar = videoViewComponent.f148883b;
                    l.b(jVar, "");
                    if (jVar.a() instanceof TextureView) {
                        VideoViewComponent videoViewComponent2 = eVar.f105166a;
                        if (videoViewComponent2 == null) {
                            l.a("mVideoView");
                        }
                        videoViewComponent2.f148883b.a(new e.c(eVar, z, f2));
                    }
                    VideoViewComponent videoViewComponent3 = eVar.f105166a;
                    if (videoViewComponent3 == null) {
                        l.a("mVideoView");
                    }
                    j jVar2 = videoViewComponent3.f148883b;
                    l.b(jVar2, "");
                    if (jVar2.a() instanceof SurfaceView) {
                        VideoViewComponent videoViewComponent4 = eVar.f105166a;
                        if (videoViewComponent4 == null) {
                            l.a("mVideoView");
                        }
                        j jVar3 = videoViewComponent4.f148883b;
                        l.b(jVar3, "");
                        View a3 = jVar3.a();
                        Objects.requireNonNull(a3, "null cannot be cast to non-null type android.view.SurfaceView");
                        ((SurfaceView) a3).getHolder().addCallback(new e.d());
                    }
                }
                if (!eVar.f105172g) {
                    RemoteImageView remoteImageView = eVar.f105167b;
                    if (remoteImageView == null) {
                        l.a("mCoverView");
                    }
                    Aweme aweme2 = eVar.f105171f;
                    if (!(aweme2 == null || (video = aweme2.getVideo()) == null)) {
                        urlModel = video.getOriginCover();
                    }
                    com.ss.android.ugc.aweme.base.e.a(remoteImageView, urlModel);
                } else if (num != null) {
                    int intValue = num.intValue();
                    RemoteImageView remoteImageView2 = eVar.f105167b;
                    if (remoteImageView2 == null) {
                        l.a("mCoverView");
                    }
                    com.ss.android.ugc.aweme.base.e.a(remoteImageView2, intValue);
                }
                eVar.a();
                e eVar2 = welcomeVideoWidget2.f105135j;
                if (eVar2 == null) {
                    l.a("mWelcomeVideoHolder");
                }
                eVar2.c();
            } else {
                WelcomeVideoWidget welcomeVideoWidget3 = this.this$0;
                ViewGroup viewGroup = (ViewGroup) this.$view;
                Integer num2 = welcomeVideoWidget3.n;
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    View findViewById2 = viewGroup.findViewById(R.id.e_8);
                    l.b(findViewById2, "");
                    welcomeVideoWidget3.f105133h = (RemoteImageView) findViewById2;
                    RemoteImageView remoteImageView3 = welcomeVideoWidget3.f105133h;
                    if (remoteImageView3 == null) {
                        l.a("mStaticCover");
                    }
                    remoteImageView3.setVisibility(0);
                    RemoteImageView remoteImageView4 = welcomeVideoWidget3.f105133h;
                    if (remoteImageView4 == null) {
                        l.a("mStaticCover");
                    }
                    com.ss.android.ugc.aweme.base.e.a(remoteImageView4, intValue2);
                }
            }
            return z.f158842a;
        }
    }

    private WelcomeVideoWidget(String str, Integer num) {
        String str2 = "";
        l.d(str, str2);
        this.f105138m = str;
        this.n = num;
        this.o = false;
        this.p = 1.7777778f;
        this.q = false;
        this.f105132a = 10;
        Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
        if (a(a2) != null) {
            StringBuilder sb = new StringBuilder();
            File a3 = a(a2);
            if (a3 == null) {
                l.b();
            }
            l.b(a3, str2);
            str2 = sb.append(a3.getAbsolutePath()).append(File.separator).append(str).toString();
        }
        this.f105136k = str2;
    }

    public /* synthetic */ WelcomeVideoWidget(String str, Integer num, byte b2) {
        this(str, num);
    }
}
