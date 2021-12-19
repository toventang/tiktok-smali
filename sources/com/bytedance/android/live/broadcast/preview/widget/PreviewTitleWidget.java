package com.bytedance.android.live.broadcast.preview.widget;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.broadcast.ac;
import com.bytedance.android.live.broadcast.ad;
import com.bytedance.android.live.broadcast.x;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.j.dg;
import com.bytedance.android.livesdk.livesetting.other.LiveEventDetailSetting;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.o;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.z;
import java.util.Objects;

public final class PreviewTitleWidget extends LiveWidget implements au {

    /* renamed from: d  reason: collision with root package name */
    public static final a f8443d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public LiveEditText f8444a;

    /* renamed from: b  reason: collision with root package name */
    public final TextWatcher f8445b = new b(this);

    /* renamed from: c  reason: collision with root package name */
    final Long f8446c;

    /* renamed from: e  reason: collision with root package name */
    private final h f8447e = com.bytedance.android.livesdkapi.m.d.a(new c(this));

    static {
        Covode.recordClassIndex(4326);
    }

    public final ImageSpan a() {
        return (ImageSpan) this.f8447e.getValue();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bhk;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4327);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static boolean b() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        View view = getView();
        if (!(view instanceof LiveEditText)) {
            view = null;
        }
        LiveEditText liveEditText = (LiveEditText) view;
        if (liveEditText != null) {
            this.f8444a = liveEditText;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.a((m) this, ac.class, (h.f.a.b) new d(this));
            }
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.b((m) this, dg.class, (h.f.a.b) new e(this));
            }
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<ImageSpan> {
        final /* synthetic */ PreviewTitleWidget this$0;

        static {
            Covode.recordClassIndex(4329);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(PreviewTitleWidget previewTitleWidget) {
            super(0);
            this.this$0 = previewTitleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageSpan invoke() {
            int i2;
            int i3;
            PreviewTitleWidget previewTitleWidget = this.this$0;
            boolean a2 = com.bytedance.android.live.uikit.c.a.a(previewTitleWidget.context);
            DataChannel dataChannel = previewTitleWidget.dataChannel;
            l.b(dataChannel, "");
            boolean a3 = com.bytedance.android.live.broadcast.utils.e.a(dataChannel);
            if (a3) {
                i2 = 2131234342;
            } else {
                i2 = 2131234877;
            }
            Drawable c2 = y.c(i2);
            BitmapDrawable bitmapDrawable = null;
            if (c2 == null) {
                return null;
            }
            if (a3) {
                if (a2) {
                    androidx.core.graphics.drawable.a.b(c2, 1);
                    androidx.core.graphics.drawable.a.a(c2, true);
                }
                c2.setBounds(0, 0, y.a(12.0f), y.a(13.0f));
            } else {
                c2.setBounds(0, 0, y.a(20.0f), y.a(16.0f));
            }
            if (c2 instanceof BitmapDrawable) {
                bitmapDrawable = c2;
            }
            BitmapDrawable bitmapDrawable2 = bitmapDrawable;
            if (bitmapDrawable2 != null) {
                if (a2) {
                    i3 = 3;
                } else {
                    i3 = 5;
                }
                bitmapDrawable2.setGravity(i3);
            }
            return new ImageSpan(c2, 1);
        }
    }

    public static final class b implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewTitleWidget f8448a;

        static {
            Covode.recordClassIndex(4328);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            l.d(charSequence, "");
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            l.d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(PreviewTitleWidget previewTitleWidget) {
            this.f8448a = previewTitleWidget;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            l.d(editable, "");
            PreviewTitleWidget previewTitleWidget = this.f8448a;
            LiveEditText liveEditText = previewTitleWidget.f8444a;
            if (liveEditText == null) {
                l.a("mTitleView");
            }
            Editable text = liveEditText.getText();
            if (text == null || (str = text.toString()) == null) {
                str = "";
            }
            if (TextUtils.getTrimmedLength(str) > 32) {
                LiveEditText liveEditText2 = previewTitleWidget.f8444a;
                if (liveEditText2 == null) {
                    l.a("mTitleView");
                }
                liveEditText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(str.length())});
                String a2 = y.a((int) R.string.gos, 32);
                l.b(a2, "");
                p.a(a2);
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String substring = str.substring(0, 32);
                l.b(substring, "");
                previewTitleWidget.a(substring);
                LiveEditText liveEditText3 = previewTitleWidget.f8444a;
                if (liveEditText3 == null) {
                    l.a("mTitleView");
                }
                liveEditText3.setSelection(substring.length());
            } else {
                LiveEditText liveEditText4 = previewTitleWidget.f8444a;
                if (liveEditText4 == null) {
                    l.a("mTitleView");
                }
                liveEditText4.setFilters(new InputFilter[0]);
            }
            DataChannel dataChannel = this.f8448a.dataChannel;
            if (dataChannel != null) {
                dataChannel.b(ad.class, h.m.p.b(String.valueOf(PreviewTitleWidget.a(this.f8448a).getText()), (CharSequence) " "));
            }
        }
    }

    public static final /* synthetic */ LiveEditText a(PreviewTitleWidget previewTitleWidget) {
        LiveEditText liveEditText = previewTitleWidget.f8444a;
        if (liveEditText == null) {
            l.a("mTitleView");
        }
        return liveEditText;
    }

    static final class d extends h.f.b.m implements h.f.a.b<z, z> {
        final /* synthetic */ PreviewTitleWidget this$0;

        static {
            Covode.recordClassIndex(4330);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(PreviewTitleWidget previewTitleWidget) {
            super(1);
            this.this$0 = previewTitleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            l.d(zVar, "");
            PreviewTitleWidget previewTitleWidget = this.this$0;
            if (previewTitleWidget.f8444a != null) {
                Context context = previewTitleWidget.context;
                LiveEditText liveEditText = previewTitleWidget.f8444a;
                if (liveEditText == null) {
                    l.a("mTitleView");
                }
                o.b(context, liveEditText);
            }
            return z.f158842a;
        }
    }

    public PreviewTitleWidget(Long l2) {
        this.f8446c = l2;
    }

    public final void a(String str) {
        if (str != null && str.length() != 0) {
            LiveEditText liveEditText = this.f8444a;
            if (liveEditText == null) {
                l.a("mTitleView");
            }
            if (liveEditText.isFocused()) {
                LiveEditText liveEditText2 = this.f8444a;
                if (liveEditText2 == null) {
                    l.a("mTitleView");
                }
                if (!TextUtils.isEmpty(String.valueOf(liveEditText2.getText()))) {
                    LiveEditText liveEditText3 = this.f8444a;
                    if (liveEditText3 == null) {
                        l.a("mTitleView");
                    }
                    liveEditText3.setText(str);
                    return;
                }
            }
            SpannableString spannableString = new SpannableString(str + ' ');
            spannableString.setSpan(a(), str.length(), str.length() + 1, 17);
            LiveEditText liveEditText4 = this.f8444a;
            if (liveEditText4 == null) {
                l.a("mTitleView");
            }
            liveEditText4.setText(spannableString);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<com.bytedance.android.live.broadcast.model.o, z> {
        final /* synthetic */ PreviewTitleWidget this$0;

        static {
            Covode.recordClassIndex(4331);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(PreviewTitleWidget previewTitleWidget) {
            super(1);
            this.this$0 = previewTitleWidget;
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f8449a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.bytedance.android.live.broadcast.model.o f8450b;

            static {
                Covode.recordClassIndex(4332);
            }

            a(e eVar, com.bytedance.android.live.broadcast.model.o oVar) {
                this.f8449a = eVar;
                this.f8450b = oVar;
            }

            public final void onClick(View view) {
                long j2;
                com.bytedance.android.livesdk.browser.c.d webViewManager;
                com.bytedance.android.live.core.widget.a a2;
                androidx.fragment.app.e a3;
                PreviewTitleWidget previewTitleWidget = this.f8449a.this$0;
                long j3 = this.f8450b.p.f7912a;
                if (previewTitleWidget.context != null) {
                    if (!j.f107226e || !j.b() || j.c()) {
                        j.f107226e = PreviewTitleWidget.b();
                    }
                    if (!j.f107226e) {
                        ao.a(y.e(), (int) R.string.efp);
                        return;
                    }
                    String value = LiveEventDetailSetting.INSTANCE.getValue();
                    if (value != null && value.length() > 0) {
                        Integer num = null;
                        if (1 != 0) {
                            Uri.Builder buildUpon = Uri.parse(value).buildUpon();
                            double b2 = (double) y.b();
                            Double.isNaN(b2);
                            Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("height", String.valueOf(b2 * 0.7d)).appendQueryParameter("event_id", String.valueOf(j3));
                            Long l2 = previewTitleWidget.f8446c;
                            if (l2 != null) {
                                j2 = l2.longValue();
                            } else {
                                j2 = 0;
                            }
                            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("user_id", String.valueOf(j2));
                            IHostContext iHostContext = (IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class);
                            if (iHostContext != null) {
                                num = Integer.valueOf(iHostContext.appId());
                            }
                            d.b a4 = com.bytedance.android.livesdk.browser.c.e.a(appendQueryParameter2.appendQueryParameter("aid", String.valueOf(num)).appendQueryParameter("live_event_enter_from", "live_preview_page").build().toString()).a(8, 8, 0, 0);
                            a4.f14310k = -1;
                            a4.s = true;
                            a4.t = true;
                            double b3 = (double) y.b();
                            Double.isNaN(b3);
                            a4.f14302c = (int) y.e((int) (b3 * 0.7d));
                            a4.f14301b = (int) y.e(y.c());
                            a4.f14309j = 80;
                            com.bytedance.android.live.b.f fVar = (com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class);
                            if (fVar != null && (webViewManager = fVar.webViewManager()) != null && (a2 = webViewManager.a(a4)) != null && (a3 = p.a(previewTitleWidget.context)) != null) {
                                com.bytedance.android.live.core.widget.a.a(a3, a2);
                            }
                        }
                    }
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.live.broadcast.model.o oVar) {
            boolean z;
            Context context;
            com.bytedance.android.live.broadcast.model.o oVar2 = oVar;
            l.d(oVar2, "");
            LiveEditText a2 = PreviewTitleWidget.a(this.this$0);
            l.d(oVar2, "");
            String str = oVar2.p.f7913b;
            l.b(str, "");
            if (str.length() <= 0 || oVar2.p.f7912a <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                a2.setClickable(false);
                a2.setFocusable(false);
                a2.setFocusableInTouchMode(false);
                String str2 = oVar2.p.f7913b;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                View view = this.this$0.getView();
                if (view != null) {
                    context = view.getContext();
                } else {
                    context = null;
                }
                if (com.bytedance.android.live.uikit.c.a.a(context)) {
                    if (androidx.core.f.f.f2385d.a(str2, str2.length())) {
                        spannableStringBuilder.append((CharSequence) str2).append((char) 8202).append((CharSequence) " ").append((char) 8204);
                        spannableStringBuilder.setSpan(this.this$0.a(), str2.length() + 1, str2.length() + 2, 17);
                    } else {
                        spannableStringBuilder.append((char) 8202).append((CharSequence) " ").append((char) 8204).append((CharSequence) str2);
                        spannableStringBuilder.setSpan(this.this$0.a(), 1, 2, 17);
                    }
                } else if (androidx.core.f.f.f2384c.a(str2, str2.length())) {
                    spannableStringBuilder.append((char) 8202).append((CharSequence) " ").append((char) 8204).append((CharSequence) str2);
                    spannableStringBuilder.setSpan(this.this$0.a(), 1, 2, 17);
                } else {
                    spannableStringBuilder.append((CharSequence) str2).append((char) 8202).append((CharSequence) " ").append((char) 8204);
                    spannableStringBuilder.setSpan(this.this$0.a(), str2.length() + 1, str2.length() + 2, 17);
                }
                a2.setText(spannableStringBuilder);
                a2.setOnClickListener(new a(this, oVar2));
                DataChannel dataChannel = this.this$0.dataChannel;
                if (dataChannel != null) {
                    l.b(str2, "");
                    dataChannel.b(ad.class, str2);
                }
            } else {
                int i2 = Build.VERSION.SDK_INT;
                a2.setTextDirection(2);
                a2.addTextChangedListener(this.this$0.f8445b);
                a2.setOnFocusChangeListener(new b(a2, this, oVar2));
                PreviewTitleWidget previewTitleWidget = this.this$0;
                LiveEditText liveEditText = previewTitleWidget.f8444a;
                if (liveEditText == null) {
                    l.a("mTitleView");
                }
                liveEditText.setHint(R.string.dv7);
                LiveEditText liveEditText2 = previewTitleWidget.f8444a;
                if (liveEditText2 == null) {
                    l.a("mTitleView");
                }
                CharSequence hint = liveEditText2.getHint();
                if (hint != null) {
                    SpannableString spannableString = new SpannableString(new StringBuilder().append(hint).append(' ').toString());
                    spannableString.setSpan(previewTitleWidget.a(), hint.length(), hint.length() + 1, 17);
                    LiveEditText liveEditText3 = previewTitleWidget.f8444a;
                    if (liveEditText3 == null) {
                        l.a("mTitleView");
                    }
                    liveEditText3.setHint(spannableString);
                }
                this.this$0.a(oVar2.f7942d);
            }
            return z.f158842a;
        }

        static final class b implements View.OnFocusChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ LiveEditText f8451a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f8452b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ com.bytedance.android.live.broadcast.model.o f8453c;

            static {
                Covode.recordClassIndex(4333);
            }

            b(LiveEditText liveEditText, e eVar, com.bytedance.android.live.broadcast.model.o oVar) {
                this.f8451a = liveEditText;
                this.f8452b = eVar;
                this.f8453c = oVar;
            }

            public final void onFocusChange(View view, boolean z) {
                com.bytedance.android.livesdkapi.depend.model.live.i iVar;
                String obj;
                if (z) {
                    PreviewTitleWidget previewTitleWidget = this.f8452b.this$0;
                    com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_title_click").a(previewTitleWidget.dataChannel);
                    DataChannel dataChannel = previewTitleWidget.dataChannel;
                    if (dataChannel == null || (iVar = (com.bytedance.android.livesdkapi.depend.model.live.i) dataChannel.b(x.class)) == null) {
                        iVar = com.bytedance.android.livesdkapi.depend.model.live.i.VIDEO;
                    }
                    a2.a("live_type", com.bytedance.android.livesdkapi.depend.model.live.j.a(iVar)).b();
                    PreviewTitleWidget previewTitleWidget2 = this.f8452b.this$0;
                    LiveEditText liveEditText = previewTitleWidget2.f8444a;
                    if (liveEditText == null) {
                        l.a("mTitleView");
                    }
                    Editable text = liveEditText.getText();
                    if (text != null && (obj = text.toString()) != null && obj.length() > 0) {
                        LiveEditText liveEditText2 = previewTitleWidget2.f8444a;
                        if (liveEditText2 == null) {
                            l.a("mTitleView");
                        }
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                        String substring = obj.substring(0, obj.length() - 1);
                        l.b(substring, "");
                        liveEditText2.setText(substring);
                        return;
                    }
                    return;
                }
                this.f8452b.this$0.a(String.valueOf(this.f8451a.getText()));
            }
        }
    }
}
