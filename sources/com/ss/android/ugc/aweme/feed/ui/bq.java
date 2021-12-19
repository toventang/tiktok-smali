package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.u;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.experiment.bv;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.feed.x.g;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.mix.MixHelperService;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class bq extends a {

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f94400a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f94401b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f94402c = false;

    static {
        Covode.recordClassIndex(59964);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a() {
    }

    public static SimpleDateFormat b() {
        boolean z;
        try {
            z = c.f99077a.f99078b.getAntiAddictionToastEnable24hourTime().booleanValue();
        } catch (com.bytedance.ies.a unused) {
            z = false;
        }
        if (z) {
            return new SimpleDateFormat("HH:mm", Locale.ENGLISH);
        }
        return new SimpleDateFormat("hh:mm aa", Locale.ENGLISH);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(VideoItemParams videoItemParams) {
        super.a(videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final boolean a(b bVar) {
        return g.a(bVar, new bs(this));
    }

    public bq(View view) {
        super(view, ((Boolean) bv.f89643a.getValue()).booleanValue());
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(View view) {
        this.T = com.a.b.c.a((Activity) this.R, (int) R.layout.rs);
        ViewGroup viewGroup = (ViewGroup) this.T.findViewById(R.id.ht);
        this.f94400a = viewGroup;
        viewGroup.setOnClickListener(br.f94411a);
    }

    public final boolean c(Map<String, Object> map) {
        map.get("event_type_state");
        map.get("aweme_state");
        if (FeedParamProvider.a.a(this.R).isHotSpot()) {
            return false;
        }
        MixHelperService.a();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(DataCenter dataCenter) {
        dataCenter.a("on_page_selected", (u<b>) this.J).a("on_render_ready", (u<b>) this.J).a("already_hide_mix_enter", (u<b>) this.J);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void c(b bVar) {
        if (bVar != null && !this.f94402c) {
            String str = bVar.f67014a;
            str.hashCode();
            if (!str.equals("already_hide_mix_enter")) {
                if (str.equals("on_render_ready")) {
                    if (!this.f94401b) {
                        final HashMap hashMap = new HashMap();
                        hashMap.put("aweme_state", this.L);
                        hashMap.put("event_type_state", this.M);
                        p.f93149a.a(new r(false, new Runnable() {
                            /* class com.ss.android.ugc.aweme.feed.ui.bq.AnonymousClass3 */

                            static {
                                Covode.recordClassIndex(59969);
                            }

                            public final void run() {
                                if (o.a(bq.this.f94400a)) {
                                    bq.this.c(hashMap);
                                    bq bqVar = bq.this;
                                    Map map = hashMap;
                                    if (o.a(bqVar.f94400a)) {
                                        Handler handler = new Handler();
                                        handler.postDelayed(new Runnable() {
                                            /* class com.ss.android.ugc.aweme.feed.ui.bq.AnonymousClass1 */

                                            static {
                                                Covode.recordClassIndex(59965);
                                            }

                                            public final void run() {
                                                if (bq.this.f94400a != null) {
                                                    TextView textView = (TextView) bq.this.f94400a.findViewById(R.id.evb);
                                                    String charSequence = textView.getText().toString();
                                                    if (!TextUtils.isEmpty(charSequence)) {
                                                        textView.setText(com.a.a(bq.this.R.getResources().getString(R.string.rl), new Object[]{bq.b().format(new Date(System.currentTimeMillis())), charSequence}));
                                                        com.ss.android.ugc.aweme.commercialize.g.d().a(bq.this.f94400a, 0, 360, true);
                                                        p.f93149a.a(new r(bq.this.I, new Runnable() {
                                                            /* class com.ss.android.ugc.aweme.feed.ui.bq.AnonymousClass1.AnonymousClass1 */

                                                            static {
                                                                Covode.recordClassIndex(59966);
                                                            }

                                                            public final void run() {
                                                                if (o.a(bq.this.f94400a)) {
                                                                    bq.this.f94401b = true;
                                                                }
                                                            }
                                                        }));
                                                        com.ss.android.ugc.aweme.compliance.api.a.b().c();
                                                    }
                                                }
                                            }
                                        }, 100);
                                        handler.postDelayed(new Runnable(handler, map) {
                                            /* class com.ss.android.ugc.aweme.feed.ui.bq.AnonymousClass2 */

                                            /* renamed from: a  reason: collision with root package name */
                                            final /* synthetic */ Handler f94405a;

                                            /* renamed from: b  reason: collision with root package name */
                                            final /* synthetic */ Map f94406b;

                                            static {
                                                Covode.recordClassIndex(59967);
                                            }

                                            public final void run() {
                                                if (bq.this.f94400a != null) {
                                                    com.ss.android.ugc.aweme.commercialize.g.d().a(bq.this.f94400a, -bq.this.f94400a.getHeight(), 360, false);
                                                    this.f94405a.postDelayed(new Runnable() {
                                                        /* class com.ss.android.ugc.aweme.feed.ui.bq.AnonymousClass2.AnonymousClass1 */

                                                        static {
                                                            Covode.recordClassIndex(59968);
                                                        }

                                                        public final void run() {
                                                            bq.this.c(AnonymousClass2.this.f94406b);
                                                        }
                                                    }, 360);
                                                }
                                            }

                                            {
                                                this.f94405a = r2;
                                                this.f94406b = r3;
                                            }
                                        }, 7000);
                                    }
                                }
                            }
                        }));
                    }
                } else {
                    return;
                }
            }
            if (!this.f94401b && !FeedParamProvider.a(this.R).isHotSpot()) {
                MixHelperService.a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void b(b bVar) {
        MethodCollector.i(9603);
        if (!this.K) {
            this.K = true;
            if (this.S instanceof FrameLayout) {
                ((FrameLayout) this.S).addView(this.T);
            }
        }
        if (bVar == null) {
            MethodCollector.o(9603);
            return;
        }
        HashMap hashMap = (HashMap) bVar.a();
        if (hashMap != null) {
            TextView textView = (TextView) this.f94400a.findViewById(R.id.evb);
            ImageView imageView = (ImageView) this.f94400a.findViewById(R.id.btm);
            if (((Boolean) hashMap.get("check_pri_state")).booleanValue()) {
                String str = (String) hashMap.get("hint_minite_state");
                if (((Boolean) hashMap.get("check_mt_reieve_state")).booleanValue()) {
                    this.f94400a.setVisibility(0);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f94400a.getLayoutParams();
                    marginLayoutParams.height = (int) n.b(this.R, 32.0f);
                    marginLayoutParams.bottomMargin = 0;
                    this.f94400a.setLayoutParams(marginLayoutParams);
                    textView.setText(com.ss.android.ugc.aweme.compliance.api.a.b().e());
                    textView.setTextColor(androidx.core.content.b.c(this.R, R.color.f159928l));
                    imageView.setImageResource(2131231754);
                    MethodCollector.o(9603);
                    return;
                } else if (!TextUtils.isEmpty(str)) {
                    this.f94400a.setVisibility(0);
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f94400a.getLayoutParams();
                    marginLayoutParams2.height = (int) n.b(this.R, 48.0f);
                    marginLayoutParams2.bottomMargin = (int) n.b(this.R, -48.0f);
                    this.f94400a.setLayoutParams(marginLayoutParams2);
                    textView.setTextColor(androidx.core.content.b.c(this.R, R.color.ac));
                    textView.setText(str);
                    imageView.setImageResource(2131231759);
                    MethodCollector.o(9603);
                    return;
                }
            }
            this.f94400a.setVisibility(8);
            textView.setText("");
        }
        MethodCollector.o(9603);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a6  */
    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.arch.widgets.base.b e(com.ss.android.ugc.aweme.arch.widgets.base.b r9) {
        /*
        // Method dump skipped, instructions count: 236
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.bq.e(com.ss.android.ugc.aweme.arch.widgets.base.b):com.ss.android.ugc.aweme.arch.widgets.base.b");
    }
}
