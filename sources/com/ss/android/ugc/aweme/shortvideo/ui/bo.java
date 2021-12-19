package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.e;
import b.g;
import b.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.draft.model.LighteningExtraInfo;
import com.ss.android.ugc.aweme.publish.o;
import com.ss.android.ugc.aweme.scheduler.PublishService;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.publish.Publish;
import com.ss.android.ugc.aweme.settings.m;
import com.ss.android.ugc.aweme.shortvideo.ui.aj;
import com.ss.android.ugc.aweme.story.publish.StoryPublishServiceImpl;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class bo implements o {

    /* renamed from: a  reason: collision with root package name */
    public ImageView f131519a;

    /* renamed from: b  reason: collision with root package name */
    boolean f131520b;

    /* renamed from: c  reason: collision with root package name */
    aj f131521c;

    /* renamed from: d  reason: collision with root package name */
    public final e f131522d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.draft.model.c f131523e;

    /* renamed from: f  reason: collision with root package name */
    public final p f131524f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f131525g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f131526h;

    /* renamed from: i  reason: collision with root package name */
    private IDraftService.DraftListener f131527i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f131528j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f131529k;

    /* renamed from: l  reason: collision with root package name */
    private View f131530l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f131531m;
    private final View n;
    private final boolean o;

    static {
        Covode.recordClassIndex(86149);
    }

    public static final class c implements IEffectService.OnVideoCoverCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bo f131534a;

        static {
            Covode.recordClassIndex(86152);
        }

        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverFailed(int i2) {
        }

        static final class a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f131535a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bitmap f131536b;

            static {
                Covode.recordClassIndex(86153);
            }

            a(c cVar, Bitmap bitmap) {
                this.f131535a = cVar;
                this.f131536b = bitmap;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                MethodCollector.i(9485);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f131536b, (int) n.b(this.f131535a.f131534a.f131522d, 48.0f), (int) n.b(this.f131535a.f131534a.f131522d, 62.0f), true);
                Bitmap a2 = com.ss.android.ugc.tools.utils.b.a(createScaledBitmap, n.b(this.f131535a.f131534a.f131522d, 2.0f));
                this.f131536b.recycle();
                createScaledBitmap.recycle();
                MethodCollector.o(9485);
                return a2;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(bo boVar) {
            this.f131534a = boVar;
        }

        static final class b<TTaskResult, TContinuationResult> implements g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ImageView f131537a;

            static {
                Covode.recordClassIndex(86154);
            }

            b(ImageView imageView) {
                this.f131537a = imageView;
            }

            @Override // b.g
            public final /* synthetic */ Object then(i iVar) {
                ImageView imageView = this.f131537a;
                l.b(iVar, "");
                imageView.setImageBitmap((Bitmap) iVar.d());
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
            l.d(bitmap, "");
            ImageView imageView = this.f131534a.f131519a;
            if (imageView != null) {
                i.b(new a(this, bitmap), i.f4824a).a(new b(imageView), i.f4826c, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.o
    public final void a() {
        this.f131520b = false;
        com.ss.android.ugc.aweme.draft.model.d.a(this.f131523e, new c(this));
        ImageView imageView = this.f131526h;
        if (imageView == null) {
            l.b();
        }
        imageView.setOnClickListener(new d(this));
        this.f131527i = new a(this);
        IDraftService a2 = com.ss.android.ugc.aweme.tools.draft.j.c.a();
        IDraftService.DraftListener draftListener = this.f131527i;
        if (draftListener == null) {
            l.b();
        }
        a2.registerDraftListener(draftListener);
        r.a("publish_retry_show", new com.ss.android.ugc.tools.f.b().a("creation_id", this.f131523e.f()).f149193a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.o
    public final void b() {
        if (this.f131524f.isShowing()) {
            if (!m.a()) {
                com.ss.android.ugc.aweme.port.in.g.a().o().l().a(null);
            } else if (this.o) {
                com.ss.android.ugc.aweme.port.in.g.a().o().l().c(this.f131523e.r());
            } else {
                com.ss.android.ugc.aweme.port.in.g.a().o().l().b();
            }
            PublishService.a.a();
            q.d("Publish | remove recover path by dismiss panel");
        }
        if (this.f131527i != null) {
            IDraftService a2 = com.ss.android.ugc.aweme.tools.draft.j.c.a();
            IDraftService.DraftListener draftListener = this.f131527i;
            if (draftListener == null) {
                l.b();
            }
            a2.unregisterDraftListener(draftListener);
            this.f131527i = null;
        }
    }

    public static final class a implements IDraftService.DraftListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bo f131532a;

        static {
            Covode.recordClassIndex(86150);
        }

        @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListener
        public final void onDraftCheckedChanged(com.ss.android.ugc.aweme.draft.model.c cVar, boolean z) {
            l.d(cVar, "");
        }

        @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListener
        public final void onDraftClean() {
        }

        @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListener
        public final void onDraftUpdate(com.ss.android.ugc.aweme.draft.model.c cVar) {
            l.d(cVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(bo boVar) {
            this.f131532a = boVar;
        }

        @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListener
        public final void onDraftDelete(com.ss.android.ugc.aweme.draft.model.c cVar) {
            if (cVar != null && TextUtils.equals(cVar.r(), this.f131532a.f131523e.r())) {
                this.f131532a.f131524f.dismiss();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.o
    public final void a(String str) {
        l.d(str, "");
        TextView textView = this.f131529k;
        if (textView != null) {
            textView.setText(str);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bo f131533a;

        static {
            Covode.recordClassIndex(86151);
        }

        b(bo boVar) {
            this.f131533a = boVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("publish_retry", new com.ss.android.ugc.tools.f.b().a("action_type", "cancel").a("creation_id", this.f131533a.f131523e.f()).f149193a);
            this.f131533a.f131524f.dismiss();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bo f131538a;

        static {
            Covode.recordClassIndex(86155);
        }

        d(bo boVar) {
            this.f131538a = boVar;
        }

        public final void onClick(View view) {
            String scheduleId;
            ClickAgent.onClick(view);
            bo boVar = this.f131538a;
            boVar.f131524f.dismiss();
            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("action_type", "publish").a("creation_id", boVar.f131523e.f());
            if (boVar.f131520b) {
                a2.a("enter_from", "");
                a2.a("enter_method", "click_retry");
            }
            r.a("publish_retry", a2.f149193a);
            if (boVar.f131523e.t()) {
                LighteningExtraInfo lighteningExtraInfo = boVar.f131523e.W.bp;
                if (lighteningExtraInfo != null && (scheduleId = lighteningExtraInfo.getScheduleId()) != null && scheduleId.length() > 0) {
                    StoryPublishServiceImpl.a().retryPublish(scheduleId);
                    e eVar = boVar.f131522d;
                    Intent intent = new Intent();
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_LIGHTENING_PUBLISH", true);
                    intent.putExtra("multi_publish_id", scheduleId);
                    Publish.isNeedProcessPublish = true;
                    o.a(eVar, intent);
                    return;
                }
                return;
            }
            com.ss.android.ugc.aweme.port.in.g.a().o().l().a(boVar.f131522d, boVar.f131523e);
            aj ajVar = boVar.f131521c;
            if (ajVar != null) {
                ajVar.f131388b.execute(new aj.b(ajVar));
            }
        }
    }

    public bo(e eVar, com.ss.android.ugc.aweme.draft.model.c cVar, p pVar, View view, boolean z) {
        l.d(eVar, "");
        l.d(cVar, "");
        l.d(pVar, "");
        l.d(view, "");
        this.f131522d = eVar;
        this.f131523e = cVar;
        this.f131524f = pVar;
        this.n = view;
        this.o = z;
        View findViewById = view.findViewById(R.id.bvt);
        Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.f131519a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.bve);
        Objects.requireNonNull(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        this.f131525g = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.f9k);
        Objects.requireNonNull(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        this.f131529k = (TextView) findViewById3;
        this.f131530l = view.findViewById(R.id.elt);
        ImageView imageView = this.f131525g;
        if (imageView == null) {
            l.b();
        }
        imageView.setOnClickListener(new b(this));
        View findViewById4 = view.findViewById(R.id.c0d);
        Objects.requireNonNull(findViewById4, "null cannot be cast to non-null type android.widget.ImageView");
        this.f131526h = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.f53);
        Objects.requireNonNull(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
        this.f131528j = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.bj8);
        l.b(findViewById6, "");
        findViewById6.setVisibility(8);
        TextView textView = this.f131528j;
        if (textView == null) {
            l.b();
        }
        textView.setVisibility(8);
        ImageView imageView2 = this.f131526h;
        if (imageView2 == null) {
            l.b();
        }
        imageView2.setVisibility(0);
        View findViewById7 = view.findViewById(R.id.f_g);
        l.b(findViewById7, "");
        this.f131531m = (TextView) findViewById7;
        if (m.a() && !z) {
            String r = cVar.r();
            l.b(r, "");
            aj ajVar = new aj(eVar, r);
            this.f131521c = ajVar;
            ajVar.f131387a = ajVar.f131388b.submit(aj.a.f131391a);
        }
    }
}
