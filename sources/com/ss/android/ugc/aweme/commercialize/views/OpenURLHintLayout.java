package com.ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.ad.b.b;
import com.ss.android.ugc.aweme.ad.b.c;
import com.ss.android.ugc.aweme.commercialize.log.i;
import com.ss.android.ugc.aweme.commercialize.util.e;
import com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class OpenURLHintLayout extends HeaderFrameLayout implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    private Aweme f75902f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f75903g;

    static {
        Covode.recordClassIndex(46803);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout
    public final boolean getCanScaleContent() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout
    public final boolean getCanScroll() {
        return this.f75903g;
    }

    public final void a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        setScrollOffset(0);
        setAweme(aweme);
        if (this.f75903g) {
            if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
                i.a aVar = new i.a();
                aVar.f74815a = awemeRawAd;
                aVar.f74817c = false;
                e.a("draw_ad", "open_card_show", aVar.a(), awemeRawAd);
            }
            View header = getHeader();
            if (header != null) {
                postDelayed(new HeaderFrameLayout.b(this, header, this), 500);
            }
        }
    }

    public final void onClick(View view) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        ClickAgent.onClick(view);
        l.d(view, "");
        int id = view.getId();
        if (id == R.id.fq) {
            l.b(b.a.f65586a, "");
            c a2 = b.a();
            if (a2 != null) {
                a2.a(getContext(), this.f75902f);
            }
            Aweme aweme = this.f75902f;
            if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null) {
                i.a aVar = new i.a();
                aVar.f74815a = awemeRawAd2;
                aVar.f74817c = false;
                e.a("draw_ad", "open_card_jump", aVar.a(), awemeRawAd2);
            }
        } else if (id == R.id.fo) {
            View header = getHeader();
            if (header != null) {
                postDelayed(new HeaderFrameLayout.c(this, header, this), 0);
            }
            Aweme aweme2 = this.f75902f;
            if (!(aweme2 == null || (awemeRawAd = aweme2.getAwemeRawAd()) == null)) {
                i.a aVar2 = new i.a();
                aVar2.f74815a = awemeRawAd;
                aVar2.f74817c = false;
                e.a("draw_ad", "open_card_close", aVar2.a(), awemeRawAd);
            }
            setAweme(null);
        }
    }

    private final void setAweme(Aweme aweme) {
        int i2;
        String str;
        AwemeRawAd awemeRawAd;
        String str2;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        MethodCollector.i(9569);
        if (aweme == null || (awemeRawAd3 = aweme.getAwemeRawAd()) == null) {
            i2 = -1;
        } else {
            i2 = awemeRawAd3.getTipsType();
        }
        String str3 = null;
        if (i2 == 1) {
            l.b(b.a.f65586a, "");
            c a2 = b.a();
            if (a2 != null) {
                if (aweme == null || (awemeRawAd2 = aweme.getAwemeRawAd()) == null) {
                    str = null;
                } else {
                    str = awemeRawAd2.getOpenUrl();
                }
                if (a2.c(str)) {
                    View header = getHeader();
                    if (header == null) {
                        header = LayoutInflater.from(getContext()).inflate(R.layout.v8, this);
                    }
                    View findViewById = header.findViewById(R.id.fs);
                    l.b(findViewById, "");
                    TextView textView = (TextView) findViewById;
                    if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
                        l.b(awemeRawAd, "");
                        String schemaName = awemeRawAd.getSchemaName();
                        if (schemaName == null || schemaName.length() == 0) {
                            str2 = getResources().getString(R.string.oi);
                        } else {
                            str2 = awemeRawAd.getSchemaName();
                        }
                        str3 = getResources().getString(R.string.om, str2);
                        l.b(str3, "");
                    }
                    textView.setText(str3);
                    header.findViewById(R.id.fq).setOnClickListener(this);
                    header.findViewById(R.id.fo).setOnClickListener(this);
                    this.f75903g = true;
                    this.f75902f = aweme;
                    MethodCollector.o(9569);
                    return;
                }
            }
        }
        this.f75903g = false;
        this.f75902f = null;
        MethodCollector.o(9569);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenURLHintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        setHeaderId(R.id.fr);
    }
}
