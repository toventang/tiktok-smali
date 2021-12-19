package com.ss.android.ugc.aweme.shortvideo.ui;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.scheduler.PublishService;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class s implements o {

    /* renamed from: a  reason: collision with root package name */
    public final e f131889a;

    /* renamed from: b  reason: collision with root package name */
    public final Aweme f131890b;

    /* renamed from: c  reason: collision with root package name */
    public final p f131891c;

    /* renamed from: d  reason: collision with root package name */
    private SmartImageView f131892d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f131893e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f131894f;

    /* renamed from: g  reason: collision with root package name */
    private final View f131895g;

    static {
        Covode.recordClassIndex(86417);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.o
    public final void a(String str) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.o
    public final void b() {
        if (this.f131891c.isShowing()) {
            g.a().o().l().a(null);
            PublishService.a.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.o
    public final void a() {
        Aweme aweme = this.f131890b;
        if (aweme.getVideo() != null) {
            com.ss.android.ugc.tools.c.a.a(this.f131892d, aweme.getVideo().getCover(), (int) n.b(this.f131889a, 48.0f), (int) n.b(this.f131889a, 62.0f));
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f131896a;

        static {
            Covode.recordClassIndex(86418);
        }

        a(s sVar) {
            this.f131896a = sVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f131896a.f131891c.dismiss();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f131897a;

        static {
            Covode.recordClassIndex(86419);
        }

        b(s sVar) {
            this.f131897a = sVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            l.b(createIAVServiceProxybyMonsterPlugin, "");
            createIAVServiceProxybyMonsterPlugin.getStoryService().a(this.f131897a.f131889a, this.f131897a.f131890b);
            this.f131897a.f131891c.dismiss();
        }
    }

    public s(e eVar, Aweme aweme, p pVar, View view) {
        l.d(eVar, "");
        l.d(aweme, "");
        l.d(pVar, "");
        l.d(view, "");
        this.f131889a = eVar;
        this.f131890b = aweme;
        this.f131891c = pVar;
        this.f131895g = view;
        View findViewById = view.findViewById(R.id.bvt);
        Objects.requireNonNull(findViewById, "null cannot be cast to non-null type com.bytedance.lighten.loader.SmartImageView");
        this.f131892d = (SmartImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.bve);
        Objects.requireNonNull(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        this.f131893e = (ImageView) findViewById2;
        TextView textView = (TextView) view.findViewById(R.id.f9k);
        this.f131894f = textView;
        if (textView != null) {
            String string = eVar.getResources().getString(R.string.g8l);
            l.b(string, "");
            textView.setText(new SpannableStringBuilder(string));
            textView.setMovementMethod(new LinkMovementMethod());
        }
        ImageView imageView = this.f131893e;
        if (imageView == null) {
            l.b();
        }
        imageView.setOnClickListener(new a(this));
        TextView textView2 = this.f131894f;
        if (textView2 != null) {
            textView2.setOnClickListener(new b(this));
        }
    }
}
