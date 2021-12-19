package com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask;

import android.content.Context;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ad.splash.f.o;
import com.ss.android.ad.splash.f.q;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

public final class TopViewSkipButton extends ConstraintLayout implements q.a {

    /* renamed from: i  reason: collision with root package name */
    public static final a f34956i = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    public final q f34957g;

    /* renamed from: h  reason: collision with root package name */
    b f34958h;

    /* renamed from: j  reason: collision with root package name */
    private final h f34959j;

    /* renamed from: k  reason: collision with root package name */
    private final h f34960k;

    /* renamed from: l  reason: collision with root package name */
    private final h f34961l;

    /* renamed from: m  reason: collision with root package name */
    private String f34962m;
    private int n;
    private Timer o;
    private AwemeSplashInfo.SkipInfo p;

    public interface b {
        static {
            Covode.recordClassIndex(20977);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(20975);
    }

    public TopViewSkipButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final TextView getButtonUi() {
        return (TextView) this.f34959j.getValue();
    }

    private final View getButtonUnClick() {
        return (View) this.f34961l.getValue();
    }

    public final View getButtonHot() {
        return (View) this.f34960k.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20976);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<View> {
        final /* synthetic */ TopViewSkipButton this$0;

        static {
            Covode.recordClassIndex(20978);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(TopViewSkipButton topViewSkipButton) {
            super(0);
            this.this$0 = topViewSkipButton;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.findViewById(R.id.q8);
        }
    }

    static final class d extends m implements h.f.a.a<TextView> {
        final /* synthetic */ TopViewSkipButton this$0;

        static {
            Covode.recordClassIndex(20979);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(TopViewSkipButton topViewSkipButton) {
            super(0);
            this.this$0 = topViewSkipButton;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.findViewById(R.id.f7h);
        }
    }

    static final class e extends m implements h.f.a.a<View> {
        final /* synthetic */ TopViewSkipButton this$0;

        static {
            Covode.recordClassIndex(20980);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(TopViewSkipButton topViewSkipButton) {
            super(0);
            this.this$0 = topViewSkipButton;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.findViewById(R.id.feo);
        }
    }

    private final void c() {
        View buttonUnClick = getButtonUnClick();
        l.b(buttonUnClick, "");
        buttonUnClick.setVisibility(0);
    }

    public static final class g extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TopViewSkipButton f34966a;

        static {
            Covode.recordClassIndex(20982);
        }

        public final void run() {
            Message obtainMessage = this.f34966a.f34957g.obtainMessage();
            l.b(obtainMessage, "");
            obtainMessage.what = 1;
            this.f34966a.f34957g.sendMessage(obtainMessage);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(TopViewSkipButton topViewSkipButton) {
            this.f34966a = topViewSkipButton;
        }
    }

    public final void b() {
        this.f34958h = null;
        Timer timer = this.o;
        if (timer != null) {
            timer.cancel();
        }
        this.o = null;
        this.f34957g.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        String string = getContext().getString(R.string.g3c);
        l.b(string, "");
        this.f34962m = string;
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TopViewSkipButton f34963a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f34964b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f34965c;

        static {
            Covode.recordClassIndex(20981);
        }

        f(TopViewSkipButton topViewSkipButton, int i2, int i3) {
            this.f34963a = topViewSkipButton;
            this.f34964b = i2;
            this.f34965c = i3;
        }

        public final void run() {
            View buttonHot = this.f34963a.getButtonHot();
            l.b(buttonHot, "");
            ViewGroup.LayoutParams layoutParams = buttonHot.getLayoutParams();
            View buttonHot2 = this.f34963a.getButtonHot();
            l.b(buttonHot2, "");
            layoutParams.width = buttonHot2.getWidth() + (this.f34964b * 2);
            View buttonHot3 = this.f34963a.getButtonHot();
            l.b(buttonHot3, "");
            layoutParams.height = buttonHot3.getHeight() + (this.f34965c * 2);
            View buttonHot4 = this.f34963a.getButtonHot();
            l.b(buttonHot4, "");
            buttonHot4.setLayoutParams(layoutParams);
        }
    }

    private final void d() {
        TextView buttonUi;
        Object[] objArr;
        String str;
        String str2;
        AwemeSplashInfo.SkipInfo skipInfo = this.p;
        if (skipInfo != null && skipInfo.isCountdown_enable() && this.n != 0) {
            if (gb.a(getContext())) {
                buttonUi = getButtonUi();
                l.b(buttonUi, "");
                objArr = new Object[3];
                String str3 = this.f34962m;
                if (str3 == null) {
                    l.a("buttonText");
                }
                objArr[0] = str3;
                objArr[1] = Integer.valueOf(this.n);
                str = skipInfo.getCountdownUnit();
                str2 = "%s %s%s";
            } else {
                buttonUi = getButtonUi();
                l.b(buttonUi, "");
                objArr = new Object[3];
                objArr[0] = Integer.valueOf(this.n);
                objArr[1] = skipInfo.getCountdownUnit();
                str = this.f34962m;
                if (str == null) {
                    l.a("buttonText");
                }
                str2 = "%s%s %s";
            }
            objArr[2] = str;
            String a2 = com.a.a(str2, Arrays.copyOf(objArr, 3));
            l.b(a2, "");
            buttonUi.setText(a2);
        }
    }

    private final void setCountDownTime(int i2) {
        int i3 = this.n;
        if (i3 == 0) {
            this.n = i2;
        } else if (i2 < i3) {
            b bVar = this.f34958h;
            if (bVar != null) {
                bVar.a(i2);
            }
            this.n = i2;
        }
    }

    @Override // com.ss.android.ad.splash.f.q.a
    public final void a(Message message) {
        if (message != null && message.what == 1) {
            setCountDownTime(this.n - 1);
            d();
            if (this.n == 0) {
                Timer timer = this.o;
                if (timer != null) {
                    timer.cancel();
                }
                this.o = null;
            }
        }
    }

    private final void a(AwemeSplashInfo.SkipInfo skipInfo) {
        getButtonHot().post(new f(this, (int) o.a(getContext(), (float) skipInfo.getHeightExtraSize()), (int) o.a(getContext(), (float) skipInfo.getWidthExtraSize())));
    }

    public final void a(long j2) {
        setCountDownTime((int) (j2 / 1000));
        if (this.o == null) {
            d();
            Timer timer = new Timer();
            this.o = timer;
            timer.scheduleAtFixedRate(new g(this), (j2 % 1000) + 1000, 1000);
        }
    }

    private final void b(int i2) {
        if (gb.a(getContext()) && i2 != 2 && i2 != 3) {
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            bVar.a(this);
            TextView buttonUi = getButtonUi();
            l.b(buttonUi, "");
            bVar.a(buttonUi.getId(), 2);
            TextView buttonUi2 = getButtonUi();
            l.b(buttonUi2, "");
            bVar.a(buttonUi2.getId(), 1, 0, 1, 10);
            View buttonUnClick = getButtonUnClick();
            l.b(buttonUnClick, "");
            if (buttonUnClick.getVisibility() == 0) {
                View buttonUnClick2 = getButtonUnClick();
                l.b(buttonUnClick2, "");
                bVar.a(buttonUnClick2.getId(), 2);
                View buttonUnClick3 = getButtonUnClick();
                l.b(buttonUnClick3, "");
                bVar.a(buttonUnClick3.getId(), 1);
                View buttonUnClick4 = getButtonUnClick();
                l.b(buttonUnClick4, "");
                int id = buttonUnClick4.getId();
                TextView buttonUi3 = getButtonUi();
                l.b(buttonUi3, "");
                bVar.a(id, 2, buttonUi3.getId(), 2);
                View buttonUnClick5 = getButtonUnClick();
                l.b(buttonUnClick5, "");
                bVar.a(buttonUnClick5.getId(), 1, 0, 1);
            }
            bVar.b(this);
        }
    }

    public final void a(Context context, AwemeSplashInfo.SkipInfo skipInfo) {
        l.d(context, "");
        l.d(skipInfo, "");
        this.p = skipInfo;
        String text = skipInfo.getText();
        if (!(text == null || text.length() == 0)) {
            String text2 = skipInfo.getText();
            l.b(text2, "");
            this.f34962m = text2;
        }
        TextView buttonUi = getButtonUi();
        l.b(buttonUi, "");
        String str = this.f34962m;
        if (str == null) {
            l.a("buttonText");
        }
        buttonUi.setText(str);
        int buttonExtraStyle = skipInfo.getButtonExtraStyle();
        if (buttonExtraStyle == 1 || buttonExtraStyle == 3) {
            c();
            a(skipInfo);
        }
        b(buttonExtraStyle);
    }

    private /* synthetic */ TopViewSkipButton(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TopViewSkipButton(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f34959j = i.a(h.m.NONE, new d(this));
        this.f34960k = i.a(h.m.NONE, new c(this));
        this.f34961l = i.a(h.m.NONE, new e(this));
        this.f34957g = new q(this);
    }
}
