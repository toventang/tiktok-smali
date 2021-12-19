package com.ss.android.ugc.aweme.challenge.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.challenge.e.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.utils.em;
import com.zhiliaoapp.musically.R;

public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    protected Context f69876a;

    /* renamed from: b  reason: collision with root package name */
    protected String f69877b;

    /* renamed from: c  reason: collision with root package name */
    protected RemoteImageView f69878c;

    /* renamed from: d  reason: collision with root package name */
    protected TextView f69879d;

    /* renamed from: e  reason: collision with root package name */
    protected TextView f69880e;

    /* renamed from: f  reason: collision with root package name */
    protected TextView f69881f;

    /* renamed from: g  reason: collision with root package name */
    protected TextView f69882g;

    /* renamed from: h  reason: collision with root package name */
    protected TuxTextView f69883h;

    /* renamed from: i  reason: collision with root package name */
    protected View f69884i;

    /* renamed from: j  reason: collision with root package name */
    protected View f69885j;

    static {
        Covode.recordClassIndex(43097);
    }

    /* access modifiers changed from: protected */
    public boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.a.a
    public final int[] b() {
        return em.a(200);
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final void c() {
        Video video;
        if (this.f76353m != null && (video = ((Aweme) this.f76353m).getVideo()) != null) {
            if (a(video, "DetailAwemeViewHolder")) {
                this.o = true;
            } else {
                a(video.getCover(), "DetailAwemeViewHolder");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.a.a
    public final void a() {
        Video video;
        if (this.f76353m != null && (video = ((Aweme) this.f76353m).getVideo()) != null) {
            if (!a.a() || !d()) {
                if (a(video, "DetailAwemeViewHolder")) {
                    this.o = true;
                } else {
                    a(video.getCover(), "DetailAwemeViewHolder");
                }
            } else if (a(video, "DetailAwemeViewHolder", Bitmap.Config.ARGB_8888)) {
                this.o = true;
            } else {
                a(video.getCover(), "DetailAwemeViewHolder", Bitmap.Config.ARGB_8888);
            }
        }
    }

    public final void a(Aweme aweme) {
        this.f69883h.setVisibility(0);
        if (aweme.getStatistics() != null) {
            this.f69883h.setText(b.a(aweme.getStatistics().getDiggCount()));
            this.f69883h.setContentDescription("");
        }
    }

    protected static void a(TextView textView, AwemeTextLabelModel awemeTextLabelModel) {
        if (TextUtils.isEmpty(awemeTextLabelModel.getLabelName())) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(awemeTextLabelModel.getLabelName());
        textView.setTextSize(0, (float) n.a(12.0d));
        textView.setTextColor(Color.parseColor(awemeTextLabelModel.getTextColor()));
        textView.setBackground(o.a(Color.parseColor(awemeTextLabelModel.getBgColor()), (float) n.a(2.0d)));
        textView.setSingleLine();
    }

    @Override // com.ss.android.ugc.aweme.challenge.a.a
    public final void a(Aweme aweme, int i2, boolean z) {
        b(aweme, i2, z);
    }

    public void b(Aweme aweme, int i2, boolean z) {
        super.a(aweme, i2);
        this.n.setContentDescription("");
        if (aweme != null) {
            this.f76353m = aweme;
            if (z) {
                a();
            }
            this.f69878c.setVisibility(4);
            this.f69879d.setVisibility(8);
            this.f69880e.setVisibility(8);
            this.f69881f.setVisibility(8);
            this.f69885j.setVisibility(8);
            com.ss.android.ugc.aweme.detail.base.b.a(this.f69884i, (Aweme) ((com.ss.android.ugc.aweme.common.a.a) this).f76353m);
            this.f69882g.setVisibility(8);
            com.ss.android.ugc.aweme.detail.base.b.a(this.f69882g, aweme);
        }
    }

    public c(View view, String str, final d dVar) {
        super(view);
        this.f69876a = view.getContext();
        this.f69877b = str;
        this.n = (SmartImageView) view.findViewById(R.id.agf);
        this.f69878c = (RemoteImageView) view.findViewById(R.id.bw_);
        this.f69882g = (TextView) view.findViewById(R.id.ehy);
        this.f69880e = (TextView) view.findViewById(R.id.c1c);
        this.f69881f = (TextView) view.findViewById(R.id.c1g);
        this.f69879d = (TextView) view.findViewById(R.id.c1v);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.c_s);
        this.f69883h = tuxTextView;
        tuxTextView.setVisibility(8);
        View findViewById = view.findViewById(R.id.fft);
        this.f69884i = findViewById;
        findViewById.setVisibility(8);
        View findViewById2 = view.findViewById(R.id.vq);
        this.f69885j = findViewById2;
        findViewById2.setVisibility(8);
        this.n.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.challenge.a.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(43098);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (((Aweme) c.this.f76353m).getStatus() == null || !((Aweme) c.this.f76353m).getStatus().isDelete()) {
                    d dVar = dVar;
                    if (dVar != null) {
                        dVar.a(view, (Aweme) c.this.f76353m, c.this.f69877b);
                        return;
                    }
                    return;
                }
                new com.bytedance.tux.g.b(view).e(R.string.h_6).b();
            }
        });
        this.n.setAnimationListener(this.f76348l);
    }
}
