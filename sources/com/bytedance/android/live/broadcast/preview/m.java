package com.bytedance.android.live.broadcast.preview;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.i;
import com.bytedance.android.live.b.f;
import com.bytedance.android.live.broadcast.ab;
import com.bytedance.android.live.broadcast.b.d;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.browser.c.e;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveIsEeaRegionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveReplayFaqSetting;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.HashMap;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8245a;

    /* renamed from: b  reason: collision with root package name */
    d f8246b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8247c;

    /* renamed from: d  reason: collision with root package name */
    boolean f8248d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f8249e;

    /* renamed from: f  reason: collision with root package name */
    public final View f8250f;

    /* renamed from: g  reason: collision with root package name */
    final DataChannel f8251g;

    static {
        Covode.recordClassIndex(4182);
    }

    public final void a() {
        if (this.f8247c) {
            p.a(this.f8250f);
        }
        this.f8245a = true;
    }

    public final void b() {
        if (this.f8247c) {
            p.b(this.f8250f);
        }
        this.f8245a = false;
    }

    public static final class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f8252a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f8253b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f8254c;

        static {
            Covode.recordClassIndex(4185);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            l.d(view, "");
            String value = LiveReplayFaqSetting.INSTANCE.getValue();
            if (com.bytedance.common.utility.m.a(value)) {
                if (((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).isInMusicallyRegion()) {
                    value = "https://webcast-va.tiktokv.com/falcon/webcast_mt/page/faq/index.html";
                } else {
                    value = "https://webcast.tiktokv.com/falcon/webcast_mt/page/faq/index.html";
                }
                l.b(value, "");
            }
            com.bytedance.android.livesdk.browser.c.d webViewManager = ((f) com.bytedance.android.live.t.a.a(f.class)).webViewManager();
            Context context = this.f8252a.f8249e;
            d.a b2 = e.b(value);
            b2.f14292c = true;
            webViewManager.a(context, b2);
            b.a.a("livesdk_faq_enter_click").a("event_page", "livetake_page").b();
        }

        b(m mVar, String str, String str2) {
            this.f8252a = mVar;
            this.f8253b = str;
            this.f8254c = str2;
        }
    }

    static final class a extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(4184);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m mVar) {
            super(1);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.bQ;
            l.b(bVar, "");
            com.bytedance.android.livesdk.ap.c.a(bVar, Boolean.valueOf(booleanValue));
            this.this$0.f8250f.setVisibility(8);
            this.this$0.f8247c = false;
            return z.f158842a;
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f8255a;

        static {
            Covode.recordClassIndex(4186);
        }

        c(m mVar) {
            this.f8255a = mVar;
        }

        public final void onClick(View view) {
            androidx.fragment.app.e a2;
            i supportFragmentManager;
            com.bytedance.android.live.broadcast.b.d dVar;
            m mVar = this.f8255a;
            if (LiveIsEeaRegionSetting.INSTANCE.getValue()) {
                a aVar = new a(mVar);
                l.d(aVar, "");
                if (com.bytedance.android.live.broadcast.b.d.f7563c == null) {
                    com.bytedance.android.live.broadcast.b.d.f7563c = new com.bytedance.android.live.broadcast.b.d((byte) 0);
                }
                com.bytedance.android.live.broadcast.b.d dVar2 = com.bytedance.android.live.broadcast.b.d.f7563c;
                if (dVar2 != null) {
                    dVar2.f7565a = aVar;
                }
                mVar.f8246b = com.bytedance.android.live.broadcast.b.d.f7563c;
                Context context = mVar.f8249e;
                if (context != null && (a2 = p.a(context)) != null && (supportFragmentManager = a2.getSupportFragmentManager()) != null && (dVar = mVar.f8246b) != null) {
                    String str = com.bytedance.android.live.broadcast.b.d.f7562b;
                    l.b(str, "");
                    dVar.show(supportFragmentManager, str);
                    return;
                }
                return;
            }
            mVar.f8250f.setVisibility(8);
            mVar.f8247c = false;
        }
    }

    public m(Context context, View view, DataChannel dataChannel) {
        l.d(view, "");
        l.d(dataChannel, "");
        this.f8249e = context;
        this.f8250f = view;
        this.f8251g = dataChannel;
        dataChannel.a(com.bytedance.android.live.broadcast.c.class, (h.f.a.b) new h.f.a.b<com.bytedance.android.live.broadcast.model.f, z>(this) {
            /* class com.bytedance.android.live.broadcast.preview.m.AnonymousClass1 */
            final /* synthetic */ m this$0;

            static {
                Covode.recordClassIndex(4183);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.bytedance.android.live.broadcast.model.f fVar) {
                String a2;
                com.bytedance.android.live.broadcast.model.f fVar2 = fVar;
                l.d(fVar2, "");
                m mVar = this.this$0;
                if (fVar2 != null && fVar2.f7910e == 1 && mVar.f8251g.b(ab.class) == null && !mVar.f8245a) {
                    mVar.f8251g.b(com.bytedance.android.live.broadcast.d.class, (Object) true);
                    mVar.f8248d = true;
                    if (!mVar.f8247c) {
                        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.bQ;
                        l.b(bVar, "");
                        Boolean a3 = bVar.a();
                        l.b(a3, "");
                        if (a3.booleanValue()) {
                            mVar.f8250f.setVisibility(0);
                            ((ImageView) mVar.f8250f.findViewById(R.id.cy7)).setOnClickListener(new c(mVar));
                            String str = y.a((int) R.string.e6s) + ">";
                            String a4 = y.a((int) R.string.emj);
                            if (LiveIsEeaRegionSetting.INSTANCE.getValue()) {
                                a2 = y.a((int) R.string.elf);
                            } else {
                                a2 = y.a((int) R.string.ele, a4);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a2 + ' ' + str);
                            spannableStringBuilder.setSpan(new b(mVar, a2, a4), a2.length() + 1, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(-1), a2.length(), spannableStringBuilder.length(), 33);
                            if (!LiveIsEeaRegionSetting.INSTANCE.getValue()) {
                                l.b(a2, "");
                                l.b(a4, "");
                                int a5 = h.m.p.a((CharSequence) a2, a4, 0, false, 6);
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(-1), a5, a4.length() + a5, 33);
                            }
                            TextView textView = (TextView) mVar.f8250f.findViewById(R.id.cya);
                            textView.setText(spannableStringBuilder);
                            textView.setLinksClickable(true);
                            textView.setMovementMethod(LinkMovementMethod.getInstance());
                            if (!LiveIsEeaRegionSetting.INSTANCE.getValue()) {
                                com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.bQ;
                                l.b(bVar2, "");
                                com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar2, (Object) false);
                            }
                            mVar.f8247c = true;
                            com.bytedance.android.live.core.d.c.a("ttlive_live_replay_faq_show_all", 0, new HashMap());
                        }
                    }
                }
                return z.f158842a;
            }
        });
    }
}
