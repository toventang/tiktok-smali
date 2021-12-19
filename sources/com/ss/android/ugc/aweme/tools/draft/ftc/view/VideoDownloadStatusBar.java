package com.ss.android.ugc.aweme.tools.draft.ftc.view;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Iterator;

public final class VideoDownloadStatusBar extends RelativeLayout {

    /* renamed from: i  reason: collision with root package name */
    public static final ArrayList<c> f139750i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public static final Handler f139751j = new b(Looper.getMainLooper());

    /* renamed from: k  reason: collision with root package name */
    public static int f139752k;

    /* renamed from: l  reason: collision with root package name */
    public static final a f139753l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public RelativeLayout f139754a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f139755b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f139756c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f139757d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f139758e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f139759f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f139760g;

    /* renamed from: h  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.tools.draft.ftc.util.d f139761h = new com.ss.android.ugc.aweme.tools.draft.ftc.util.d();

    /* renamed from: m  reason: collision with root package name */
    private c f139762m;

    public interface c {
        static {
            Covode.recordClassIndex(91352);
        }

        void c();

        void d();
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final d f139763a = new d();

        static {
            Covode.recordClassIndex(91353);
        }

        d() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(91350);
        }

        private a() {
        }

        public static void a() {
            Iterator<T> it = VideoDownloadStatusBar.f139750i.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final c getVideoDownloadClickListener() {
        return this.f139762m;
    }

    private static boolean e() {
        return TextUtils.equals(com.bytedance.helios.sdk.d.f.f30878a, g.a().P());
    }

    public final TextView getMDownloadFailedTextView() {
        TextView textView = this.f139759f;
        if (textView == null) {
            l.a("mDownloadFailedTextView");
        }
        return textView;
    }

    public final RelativeLayout getMDownloadProgressViewRoot() {
        RelativeLayout relativeLayout = this.f139754a;
        if (relativeLayout == null) {
            l.a("mDownloadProgressViewRoot");
        }
        return relativeLayout;
    }

    public static void d() {
        Handler handler = f139751j;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
        }
        if (handler.hasMessages(2)) {
            handler.removeMessages(2);
        }
    }

    static {
        Covode.recordClassIndex(91349);
    }

    public final void a() {
        if (e()) {
            TextView textView = this.f139757d;
            if (textView == null) {
                l.a("mDownloadProgressView");
            }
            textView.setText("%0");
            return;
        }
        TextView textView2 = this.f139757d;
        if (textView2 == null) {
            l.a("mDownloadProgressView");
        }
        textView2.setText("0%");
    }

    public final void b() {
        TextView textView = this.f139757d;
        if (textView == null) {
            l.a("mDownloadProgressView");
        }
        textView.setVisibility(8);
        TextView textView2 = this.f139758e;
        if (textView2 == null) {
            l.a("mDownloadingStatusTextView");
        }
        textView2.setVisibility(8);
        TextView textView3 = this.f139760g;
        if (textView3 == null) {
            l.a("mDownloadVideoCancelView");
        }
        textView3.setVisibility(8);
        TextView textView4 = this.f139759f;
        if (textView4 == null) {
            l.a("mDownloadFailedTextView");
        }
        textView4.setVisibility(8);
        RelativeLayout relativeLayout = this.f139754a;
        if (relativeLayout == null) {
            l.a("mDownloadProgressViewRoot");
        }
        relativeLayout.setBackgroundColor(getResources().getColor(R.color.bn));
        RelativeLayout relativeLayout2 = this.f139754a;
        if (relativeLayout2 == null) {
            l.a("mDownloadProgressViewRoot");
        }
        relativeLayout2.setVisibility(0);
        ImageView imageView = this.f139755b;
        if (imageView == null) {
            l.a("mDownloadSuccessImageView");
        }
        imageView.setVisibility(0);
        TextView textView5 = this.f139756c;
        if (textView5 == null) {
            l.a("mDownloadSuccessTextView");
        }
        textView5.setVisibility(0);
        RelativeLayout relativeLayout3 = this.f139754a;
        if (relativeLayout3 == null) {
            l.a("mDownloadProgressViewRoot");
        }
        relativeLayout3.requestLayout();
        a();
        a(1, 1000);
    }

    public final void c() {
        TextView textView = this.f139757d;
        if (textView == null) {
            l.a("mDownloadProgressView");
        }
        textView.setVisibility(8);
        TextView textView2 = this.f139758e;
        if (textView2 == null) {
            l.a("mDownloadingStatusTextView");
        }
        textView2.setVisibility(8);
        ImageView imageView = this.f139755b;
        if (imageView == null) {
            l.a("mDownloadSuccessImageView");
        }
        imageView.setVisibility(8);
        TextView textView3 = this.f139756c;
        if (textView3 == null) {
            l.a("mDownloadSuccessTextView");
        }
        textView3.setVisibility(8);
        RelativeLayout relativeLayout = this.f139754a;
        if (relativeLayout == null) {
            l.a("mDownloadProgressViewRoot");
        }
        relativeLayout.setBackgroundColor(Color.parseColor("#383838"));
        RelativeLayout relativeLayout2 = this.f139754a;
        if (relativeLayout2 == null) {
            l.a("mDownloadProgressViewRoot");
        }
        relativeLayout2.setVisibility(0);
        TextView textView4 = this.f139759f;
        if (textView4 == null) {
            l.a("mDownloadFailedTextView");
        }
        textView4.setWidth(n.a(getContext()) - ((int) n.b(getContext(), 77.0f)));
        TextView textView5 = this.f139759f;
        if (textView5 == null) {
            l.a("mDownloadFailedTextView");
        }
        textView5.setVisibility(0);
        TextView textView6 = this.f139760g;
        if (textView6 == null) {
            l.a("mDownloadVideoCancelView");
        }
        textView6.setVisibility(0);
        TextView textView7 = this.f139759f;
        if (textView7 == null) {
            l.a("mDownloadFailedTextView");
        }
        textView7.requestLayout();
        RelativeLayout relativeLayout3 = this.f139754a;
        if (relativeLayout3 == null) {
            l.a("mDownloadProgressViewRoot");
        }
        relativeLayout3.requestLayout();
        a();
        a(2, 3000);
    }

    public static final class b extends Handler {
        static {
            Covode.recordClassIndex(91351);
        }

        b(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            l.d(message, "");
            a.a();
        }
    }

    public final void setVideoDownloadClickListener(c cVar) {
        this.f139762m = cVar;
    }

    public static final class e extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoDownloadStatusBar f139764a;

        static {
            Covode.recordClassIndex(91354);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(VideoDownloadStatusBar videoDownloadStatusBar) {
            this.f139764a = videoDownloadStatusBar;
        }

        public final void onClick(View view) {
            c videoDownloadClickListener;
            l.d(view, "");
            if (this.f139764a.getMDownloadFailedTextView().getVisibility() == 0 && (videoDownloadClickListener = this.f139764a.getVideoDownloadClickListener()) != null) {
                videoDownloadClickListener.c();
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setColor(androidx.core.content.b.c(this.f139764a.getContext(), R.color.f159928l));
            textPaint.setUnderlineText(true);
        }
    }

    public final void setMDownloadFailedTextView(TextView textView) {
        l.d(textView, "");
        this.f139759f = textView;
    }

    public final void setMDownloadProgressViewRoot(RelativeLayout relativeLayout) {
        l.d(relativeLayout, "");
        this.f139754a = relativeLayout;
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoDownloadStatusBar f139765a;

        static {
            Covode.recordClassIndex(91355);
        }

        f(VideoDownloadStatusBar videoDownloadStatusBar) {
            this.f139765a = videoDownloadStatusBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f139765a.getMDownloadProgressViewRoot().setVisibility(8);
            com.ss.android.ugc.aweme.tools.draft.ftc.util.c.f139654c = false;
            com.ss.android.ugc.aweme.tools.draft.ftc.util.d.a(com.ss.android.ugc.aweme.tools.draft.ftc.pages.b.a(3, null, 0));
            a.a();
            c videoDownloadClickListener = this.f139765a.getVideoDownloadClickListener();
            if (videoDownloadClickListener != null) {
                videoDownloadClickListener.d();
            }
            VideoDownloadStatusBar.d();
        }
    }

    public final void a(int i2) {
        ImageView imageView = this.f139755b;
        if (imageView == null) {
            l.a("mDownloadSuccessImageView");
        }
        imageView.setVisibility(8);
        TextView textView = this.f139756c;
        if (textView == null) {
            l.a("mDownloadSuccessTextView");
        }
        textView.setVisibility(8);
        TextView textView2 = this.f139759f;
        if (textView2 == null) {
            l.a("mDownloadFailedTextView");
        }
        textView2.setVisibility(8);
        RelativeLayout relativeLayout = this.f139754a;
        if (relativeLayout == null) {
            l.a("mDownloadProgressViewRoot");
        }
        relativeLayout.setBackgroundColor(Color.parseColor("#383838"));
        RelativeLayout relativeLayout2 = this.f139754a;
        if (relativeLayout2 == null) {
            l.a("mDownloadProgressViewRoot");
        }
        relativeLayout2.setVisibility(0);
        TextView textView3 = this.f139757d;
        if (textView3 == null) {
            l.a("mDownloadProgressView");
        }
        textView3.setVisibility(0);
        TextView textView4 = this.f139758e;
        if (textView4 == null) {
            l.a("mDownloadingStatusTextView");
        }
        textView4.setVisibility(0);
        TextView textView5 = this.f139760g;
        if (textView5 == null) {
            l.a("mDownloadVideoCancelView");
        }
        textView5.setVisibility(0);
        if (e()) {
            TextView textView6 = this.f139757d;
            if (textView6 == null) {
                l.a("mDownloadProgressView");
            }
            textView6.setText("%".concat(String.valueOf(i2)));
        } else {
            TextView textView7 = this.f139757d;
            if (textView7 == null) {
                l.a("mDownloadProgressView");
            }
            textView7.setText(new StringBuilder().append(i2).append('%').toString());
        }
        f139752k = i2;
    }

    private static void a(int i2, long j2) {
        Handler handler = f139751j;
        if (!handler.hasMessages(i2)) {
            handler.sendEmptyMessageDelayed(i2, j2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoDownloadStatusBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(157);
        com.a.a(LayoutInflater.from(getContext()), R.layout.b44, this, true);
        View findViewById = findViewById(R.id.dqi);
        l.b(findViewById, "");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById;
        this.f139754a = relativeLayout;
        if (relativeLayout == null) {
            l.a("mDownloadProgressViewRoot");
        }
        relativeLayout.setOnClickListener(d.f139763a);
        View findViewById2 = findViewById(R.id.ap7);
        l.b(findViewById2, "");
        this.f139755b = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.ap8);
        l.b(findViewById3, "");
        this.f139756c = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.ap4);
        l.b(findViewById4, "");
        this.f139757d = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.apc);
        l.b(findViewById5, "");
        this.f139758e = (TextView) findViewById5;
        View findViewById6 = findViewById(R.id.aoz);
        l.b(findViewById6, "");
        this.f139759f = (TextView) findViewById6;
        String string = getContext().getString(R.string.bve);
        l.b(string, "");
        String str = getContext().getString(R.string.bvc) + ' ';
        SpannableString spannableString = new SpannableString(string + str);
        spannableString.setSpan(new e(this), p.a((CharSequence) spannableString, str, 0, false, 6), (p.a((CharSequence) spannableString, str, 0, false, 6) + str.length()) - 1, 17);
        TextView textView = this.f139759f;
        if (textView == null) {
            l.a("mDownloadFailedTextView");
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView2 = this.f139759f;
        if (textView2 == null) {
            l.a("mDownloadFailedTextView");
        }
        textView2.setText(spannableString);
        View findViewById7 = findViewById(R.id.aoy);
        l.b(findViewById7, "");
        TextView textView3 = (TextView) findViewById7;
        this.f139760g = textView3;
        if (textView3 == null) {
            l.a("mDownloadVideoCancelView");
        }
        textView3.setOnClickListener(new f(this));
        a();
        MethodCollector.o(157);
    }
}
