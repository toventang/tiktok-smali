package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.i18n.language.i18n.b;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.ah;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Iterator;

public final class VideoDownloadStatusBar extends RelativeLayout {

    /* renamed from: h  reason: collision with root package name */
    public static final ArrayList<c> f94169h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public static final Handler f94170i = new b(Looper.getMainLooper());

    /* renamed from: j  reason: collision with root package name */
    public static int f94171j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f94172k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public RelativeLayout f94173a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f94174b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f94175c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f94176d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f94177e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f94178f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f94179g;

    /* renamed from: l  reason: collision with root package name */
    private c f94180l;

    public interface c {
        static {
            Covode.recordClassIndex(59841);
        }

        void aL();

        void aM();
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final d f94181a = new d();

        static {
            Covode.recordClassIndex(59842);
        }

        d() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(59839);
        }

        private a() {
        }

        public static void a() {
            Iterator<T> it = VideoDownloadStatusBar.f94169h.iterator();
            while (it.hasNext()) {
                it.next().aM();
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final c getVideoDownloadClickListener() {
        return this.f94180l;
    }

    public final TextView getMDownloadFailedTextView() {
        TextView textView = this.f94178f;
        if (textView == null) {
            l.a("mDownloadFailedTextView");
        }
        return textView;
    }

    public final RelativeLayout getMDownloadProgressViewRoot() {
        RelativeLayout relativeLayout = this.f94173a;
        if (relativeLayout == null) {
            l.a("mDownloadProgressViewRoot");
        }
        return relativeLayout;
    }

    public static void d() {
        Handler handler = f94170i;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
        }
        if (handler.hasMessages(2)) {
            handler.removeMessages(2);
        }
    }

    private static boolean e() {
        l.b(b.a.f99809a, "");
        return l.a((Object) com.bytedance.helios.sdk.d.f.f30878a, (Object) com.ss.android.ugc.aweme.i18n.language.i18n.b.a(com.ss.android.ugc.aweme.i18n.language.a.a((String) null, (String) null, com.bytedance.ies.ugc.appcontext.d.a())));
    }

    static {
        Covode.recordClassIndex(59838);
    }

    public final void a() {
        if (e()) {
            TextView textView = this.f94176d;
            if (textView == null) {
                l.a("mDownloadProgressView");
            }
            textView.setText("%0");
            return;
        }
        TextView textView2 = this.f94176d;
        if (textView2 == null) {
            l.a("mDownloadProgressView");
        }
        textView2.setText("0%");
    }

    public final void b() {
        TextView textView = this.f94176d;
        if (textView == null) {
            l.a("mDownloadProgressView");
        }
        textView.setVisibility(8);
        TextView textView2 = this.f94177e;
        if (textView2 == null) {
            l.a("mDownloadingStatusTextView");
        }
        textView2.setVisibility(8);
        TextView textView3 = this.f94179g;
        if (textView3 == null) {
            l.a("mDownloadVideoCancelView");
        }
        textView3.setVisibility(8);
        TextView textView4 = this.f94178f;
        if (textView4 == null) {
            l.a("mDownloadFailedTextView");
        }
        textView4.setVisibility(8);
        RelativeLayout relativeLayout = this.f94173a;
        if (relativeLayout == null) {
            l.a("mDownloadProgressViewRoot");
        }
        relativeLayout.setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.bn));
        RelativeLayout relativeLayout2 = this.f94173a;
        if (relativeLayout2 == null) {
            l.a("mDownloadProgressViewRoot");
        }
        relativeLayout2.setVisibility(0);
        ImageView imageView = this.f94174b;
        if (imageView == null) {
            l.a("mDownloadSuccessImageView");
        }
        imageView.setVisibility(0);
        TextView textView5 = this.f94175c;
        if (textView5 == null) {
            l.a("mDownloadSuccessTextView");
        }
        textView5.setVisibility(0);
        RelativeLayout relativeLayout3 = this.f94173a;
        if (relativeLayout3 == null) {
            l.a("mDownloadProgressViewRoot");
        }
        relativeLayout3.requestLayout();
        a();
        a(1, 3000);
    }

    public final void c() {
        TextView textView = this.f94176d;
        if (textView == null) {
            l.a("mDownloadProgressView");
        }
        textView.setVisibility(8);
        TextView textView2 = this.f94177e;
        if (textView2 == null) {
            l.a("mDownloadingStatusTextView");
        }
        textView2.setVisibility(8);
        ImageView imageView = this.f94174b;
        if (imageView == null) {
            l.a("mDownloadSuccessImageView");
        }
        imageView.setVisibility(8);
        TextView textView3 = this.f94175c;
        if (textView3 == null) {
            l.a("mDownloadSuccessTextView");
        }
        textView3.setVisibility(8);
        RelativeLayout relativeLayout = this.f94173a;
        if (relativeLayout == null) {
            l.a("mDownloadProgressViewRoot");
        }
        relativeLayout.setBackgroundColor(Color.parseColor("#383838"));
        RelativeLayout relativeLayout2 = this.f94173a;
        if (relativeLayout2 == null) {
            l.a("mDownloadProgressViewRoot");
        }
        relativeLayout2.setVisibility(0);
        TextView textView4 = this.f94178f;
        if (textView4 == null) {
            l.a("mDownloadFailedTextView");
        }
        textView4.setWidth(n.a(getContext()) - ((int) n.b(getContext(), 77.0f)));
        TextView textView5 = this.f94178f;
        if (textView5 == null) {
            l.a("mDownloadFailedTextView");
        }
        textView5.setVisibility(0);
        TextView textView6 = this.f94179g;
        if (textView6 == null) {
            l.a("mDownloadVideoCancelView");
        }
        textView6.setVisibility(0);
        TextView textView7 = this.f94178f;
        if (textView7 == null) {
            l.a("mDownloadFailedTextView");
        }
        textView7.requestLayout();
        RelativeLayout relativeLayout3 = this.f94173a;
        if (relativeLayout3 == null) {
            l.a("mDownloadProgressViewRoot");
        }
        relativeLayout3.requestLayout();
        a();
        a(2, 20000);
    }

    public static final class b extends Handler {
        static {
            Covode.recordClassIndex(59840);
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
        this.f94180l = cVar;
    }

    public static final class e extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoDownloadStatusBar f94182a;

        static {
            Covode.recordClassIndex(59843);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(VideoDownloadStatusBar videoDownloadStatusBar) {
            this.f94182a = videoDownloadStatusBar;
        }

        public final void onClick(View view) {
            c videoDownloadClickListener;
            l.d(view, "");
            if (this.f94182a.getMDownloadFailedTextView().getVisibility() == 0 && (videoDownloadClickListener = this.f94182a.getVideoDownloadClickListener()) != null) {
                videoDownloadClickListener.aL();
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setColor(androidx.core.content.b.c(this.f94182a.getContext(), R.color.f159928l));
            textPaint.setUnderlineText(true);
        }
    }

    public final void setMDownloadFailedTextView(TextView textView) {
        l.d(textView, "");
        this.f94178f = textView;
    }

    public final void setMDownloadProgressViewRoot(RelativeLayout relativeLayout) {
        l.d(relativeLayout, "");
        this.f94173a = relativeLayout;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VideoDownloadStatusBar(Context context) {
        this(context, null);
        l.d(context, "");
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoDownloadStatusBar f94183a;

        static {
            Covode.recordClassIndex(59844);
        }

        f(VideoDownloadStatusBar videoDownloadStatusBar) {
            this.f94183a = videoDownloadStatusBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f94183a.getMDownloadProgressViewRoot().setVisibility(8);
            a.a();
            c videoDownloadClickListener = this.f94183a.getVideoDownloadClickListener();
            if (videoDownloadClickListener != null) {
                videoDownloadClickListener.aM();
            }
            ShareService shareService = ah.f123352a;
            Context context = this.f94183a.getContext();
            l.b(context, "");
            shareService.a(context);
            VideoDownloadStatusBar.d();
        }
    }

    public final void a(int i2) {
        ImageView imageView = this.f94174b;
        if (imageView == null) {
            l.a("mDownloadSuccessImageView");
        }
        imageView.setVisibility(8);
        TextView textView = this.f94175c;
        if (textView == null) {
            l.a("mDownloadSuccessTextView");
        }
        textView.setVisibility(8);
        TextView textView2 = this.f94178f;
        if (textView2 == null) {
            l.a("mDownloadFailedTextView");
        }
        textView2.setVisibility(8);
        RelativeLayout relativeLayout = this.f94173a;
        if (relativeLayout == null) {
            l.a("mDownloadProgressViewRoot");
        }
        relativeLayout.setBackgroundColor(Color.parseColor("#383838"));
        RelativeLayout relativeLayout2 = this.f94173a;
        if (relativeLayout2 == null) {
            l.a("mDownloadProgressViewRoot");
        }
        relativeLayout2.setVisibility(0);
        TextView textView3 = this.f94176d;
        if (textView3 == null) {
            l.a("mDownloadProgressView");
        }
        textView3.setVisibility(0);
        TextView textView4 = this.f94177e;
        if (textView4 == null) {
            l.a("mDownloadingStatusTextView");
        }
        textView4.setVisibility(0);
        TextView textView5 = this.f94179g;
        if (textView5 == null) {
            l.a("mDownloadVideoCancelView");
        }
        textView5.setVisibility(0);
        if (e()) {
            TextView textView6 = this.f94176d;
            if (textView6 == null) {
                l.a("mDownloadProgressView");
            }
            textView6.setText("%".concat(String.valueOf(i2)));
        } else {
            TextView textView7 = this.f94176d;
            if (textView7 == null) {
                l.a("mDownloadProgressView");
            }
            textView7.setText(new StringBuilder().append(i2).append('%').toString());
        }
        f94171j = i2;
    }

    public static void a(int i2, long j2) {
        Handler handler = f94170i;
        if (!handler.hasMessages(i2)) {
            handler.sendEmptyMessageDelayed(i2, j2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoDownloadStatusBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(8674);
        com.a.b.a.a(getContext(), R.layout.sk, this, true);
        View findViewById = findViewById(R.id.dqi);
        l.b(findViewById, "");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById;
        this.f94173a = relativeLayout;
        if (relativeLayout == null) {
            l.a("mDownloadProgressViewRoot");
        }
        relativeLayout.setOnClickListener(d.f94181a);
        View findViewById2 = findViewById(R.id.ap7);
        l.b(findViewById2, "");
        this.f94174b = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.ap8);
        l.b(findViewById3, "");
        this.f94175c = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.ap4);
        l.b(findViewById4, "");
        this.f94176d = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.apc);
        l.b(findViewById5, "");
        this.f94177e = (TextView) findViewById5;
        View findViewById6 = findViewById(R.id.aoz);
        l.b(findViewById6, "");
        this.f94178f = (TextView) findViewById6;
        String string = getContext().getString(R.string.bve);
        l.b(string, "");
        String str = getContext().getString(R.string.bvc) + ' ';
        SpannableString spannableString = new SpannableString(string + str);
        spannableString.setSpan(new e(this), p.a((CharSequence) spannableString, str, 0, false, 6), (p.a((CharSequence) spannableString, str, 0, false, 6) + str.length()) - 1, 17);
        TextView textView = this.f94178f;
        if (textView == null) {
            l.a("mDownloadFailedTextView");
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView2 = this.f94178f;
        if (textView2 == null) {
            l.a("mDownloadFailedTextView");
        }
        textView2.setText(spannableString);
        View findViewById7 = findViewById(R.id.aoy);
        l.b(findViewById7, "");
        TextView textView3 = (TextView) findViewById7;
        this.f94179g = textView3;
        if (textView3 == null) {
            l.a("mDownloadVideoCancelView");
        }
        textView3.setOnClickListener(new f(this));
        a();
        MethodCollector.o(8674);
    }
}
