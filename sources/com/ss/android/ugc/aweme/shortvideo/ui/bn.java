package com.ss.android.ugc.aweme.shortvideo.ui;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.e;
import b.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.draft.model.d;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.scheduler.PublishService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.settings.m;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class bn implements o {

    /* renamed from: a  reason: collision with root package name */
    public ImageView f131505a;

    /* renamed from: b  reason: collision with root package name */
    public final e f131506b;

    /* renamed from: c  reason: collision with root package name */
    public final p f131507c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f131508d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f131509e;

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.draft.model.c f131510f;

    /* renamed from: g  reason: collision with root package name */
    private final View f131511g;

    static {
        Covode.recordClassIndex(86143);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.o
    public final void a(String str) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.o
    public final void a() {
        d.a(this.f131510f, new c(this));
        r.a("tns_ags_float_post_ban", new com.ss.android.ugc.tools.f.b().f149193a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.o
    public final void b() {
        if (this.f131507c.isShowing()) {
            if (m.a()) {
                g.a().o().l().c(this.f131510f.r());
            } else {
                g.a().o().l().a(null);
            }
            PublishService.a.a();
            q.d("Publish | remove recover path by dismiss panel");
        }
    }

    public static final class c implements IEffectService.OnVideoCoverCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bn f131514a;

        static {
            Covode.recordClassIndex(86146);
        }

        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverFailed(int i2) {
        }

        static final class a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f131515a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bitmap f131516b;

            static {
                Covode.recordClassIndex(86147);
            }

            a(c cVar, Bitmap bitmap) {
                this.f131515a = cVar;
                this.f131516b = bitmap;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                MethodCollector.i(9816);
                if (this.f131515a.f131514a.f131505a != null) {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f131516b, (int) n.b(this.f131515a.f131514a.f131506b, 48.0f), (int) n.b(this.f131515a.f131514a.f131506b, 62.0f), true);
                    final Bitmap a2 = com.ss.android.ugc.tools.utils.b.a(createScaledBitmap, n.b(this.f131515a.f131514a.f131506b, 2.0f));
                    ImageView imageView = this.f131515a.f131514a.f131505a;
                    if (imageView == null) {
                        l.b();
                    }
                    imageView.post(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.shortvideo.ui.bn.c.a.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ a f131517a;

                        static {
                            Covode.recordClassIndex(86148);
                        }

                        {
                            this.f131517a = r1;
                        }

                        public final void run() {
                            ImageView imageView = this.f131517a.f131515a.f131514a.f131505a;
                            if (imageView == null) {
                                l.b();
                            }
                            imageView.setImageBitmap(a2);
                        }
                    });
                    this.f131516b.recycle();
                    createScaledBitmap.recycle();
                }
                z zVar = z.f158842a;
                MethodCollector.o(9816);
                return zVar;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(bn bnVar) {
            this.f131514a = bnVar;
        }

        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
            l.d(bitmap, "");
            i.b(new a(this, bitmap), i.f4824a);
        }
    }

    public static final class a extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bn f131512a;

        static {
            Covode.recordClassIndex(86144);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(bn bnVar) {
            this.f131512a = bnVar;
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            l.d(view, "");
            com.ss.android.ugc.aweme.compliance.api.a.c().a(this.f131512a.f131506b, "float_post");
            this.f131512a.f131507c.dismiss();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bn f131513a;

        static {
            Covode.recordClassIndex(86145);
        }

        b(bn bnVar) {
            this.f131513a = bnVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f131513a.f131507c.dismiss();
        }
    }

    public bn(e eVar, com.ss.android.ugc.aweme.draft.model.c cVar, p pVar, View view) {
        l.d(eVar, "");
        l.d(cVar, "");
        l.d(pVar, "");
        l.d(view, "");
        this.f131506b = eVar;
        this.f131510f = cVar;
        this.f131507c = pVar;
        this.f131511g = view;
        View findViewById = view.findViewById(R.id.bvt);
        Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.f131505a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.bve);
        Objects.requireNonNull(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        this.f131508d = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.f9k);
        Objects.requireNonNull(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById3;
        this.f131509e = textView;
        if (textView != null) {
            String str = eVar.getString(R.string.esb) + " ";
            String string = eVar.getString(R.string.hch);
            l.b(string, "");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + string);
            spannableStringBuilder.setSpan(new a(this), str.length(), spannableStringBuilder.length(), 18);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(eVar.getResources().getColor(R.color.bh)), str.length(), spannableStringBuilder.length(), 18);
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(new LinkMovementMethod());
        }
        ImageView imageView = this.f131508d;
        if (imageView == null) {
            l.b();
        }
        imageView.setOnClickListener(new b(this));
    }
}
