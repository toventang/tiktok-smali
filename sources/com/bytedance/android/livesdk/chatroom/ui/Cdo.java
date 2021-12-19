package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.do  reason: invalid class name */
public final class Cdo extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public a f16142a;

    /* renamed from: b  reason: collision with root package name */
    public b f16143b;

    /* renamed from: c  reason: collision with root package name */
    private Context f16144c;

    /* renamed from: d  reason: collision with root package name */
    private RelativeLayout f16145d = ((RelativeLayout) this.f16148g.findViewById(R.id.eol));

    /* renamed from: e  reason: collision with root package name */
    private LiveRoundImageView f16146e = ((LiveRoundImageView) this.f16148g.findViewById(R.id.eoj));

    /* renamed from: f  reason: collision with root package name */
    private HSImageView f16147f = ((HSImageView) this.f16148g.findViewById(R.id.eo9));

    /* renamed from: g  reason: collision with root package name */
    private View f16148g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f16149h = ((TextView) this.f16148g.findViewById(R.id.dpv));

    /* renamed from: i  reason: collision with root package name */
    private TextView f16150i = ((TextView) this.f16148g.findViewById(R.id.dpu));

    /* renamed from: j  reason: collision with root package name */
    private TextView f16151j = ((TextView) this.f16148g.findViewById(R.id.dpq));

    /* renamed from: k  reason: collision with root package name */
    private TextView f16152k = ((TextView) this.f16148g.findViewById(R.id.dpp));

    /* renamed from: l  reason: collision with root package name */
    private LinearLayout f16153l = ((LinearLayout) this.f16148g.findViewById(R.id.dpr));

    /* renamed from: m  reason: collision with root package name */
    private TextView f16154m = ((TextView) this.f16148g.findViewById(R.id.dps));
    private TextView n = ((TextView) this.f16148g.findViewById(R.id.dpt));

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.do$a */
    public interface a {
        static {
            Covode.recordClassIndex(8942);
        }

        void a();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.do$b */
    public interface b {
        static {
            Covode.recordClassIndex(8943);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(8941);
    }

    public final void dismiss() {
        super.dismiss();
    }

    public final void a() {
        this.f16152k.setVisibility(8);
    }

    public final void onBackPressed() {
        a aVar = this.f16142a;
        if (aVar != null) {
            aVar.a();
        }
        super.onBackPressed();
    }

    public final void show() {
        super.show();
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = (int) this.f16144c.getResources().getDimension(R.dimen.y8);
            layoutParams.height = -2;
            window.setAttributes(layoutParams);
        }
    }

    public static Cdo a(Context context) {
        return new Cdo(context);
    }

    public final void b(CharSequence charSequence) {
        this.f16150i.setText(charSequence);
    }

    public final void a(View.OnClickListener onClickListener) {
        this.f16151j.setOnClickListener(onClickListener);
    }

    public final void a(CharSequence charSequence) {
        this.f16149h.setText(charSequence);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r3 <= (r1.getHeight() + r2)) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r1 = r6.getAction()
            r0 = 1
            if (r0 != r1) goto L_0x0034
            android.content.Context r1 = r5.getContext()
            float r0 = r6.getX()
            int r4 = (int) r0
            float r0 = r6.getY()
            int r3 = (int) r0
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r1)
            int r2 = r0.getScaledWindowTouchSlop()
            android.view.Window r0 = r5.getWindow()
            if (r0 == 0) goto L_0x002d
            android.view.Window r0 = r5.getWindow()
            android.view.View r0 = r0.getDecorView()
            if (r0 != 0) goto L_0x0039
        L_0x002d:
            com.bytedance.android.livesdk.chatroom.ui.do$b r0 = r5.f16143b
            if (r0 == 0) goto L_0x0034
            r0.a()
        L_0x0034:
            boolean r0 = super.onTouchEvent(r6)
            return r0
        L_0x0039:
            android.view.Window r0 = r5.getWindow()
            android.view.View r1 = r0.getDecorView()
            int r0 = -r2
            if (r4 < r0) goto L_0x002d
            if (r3 < r0) goto L_0x002d
            int r0 = r1.getWidth()
            int r0 = r0 + r2
            if (r4 > r0) goto L_0x002d
            int r0 = r1.getHeight()
            int r0 = r0 + r2
            if (r3 <= r0) goto L_0x0034
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.Cdo.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private Cdo(Context context) {
        super(context, R.style.a33);
        MethodCollector.i(10280);
        this.f16144c = context;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.b85, (ViewGroup) null);
        this.f16148g = inflate;
        setContentView(inflate);
        this.f16151j.setVisibility(0);
        this.f16153l.setVisibility(8);
        MethodCollector.o(10280);
    }

    public final void a(boolean z, String str) {
        this.f16151j.setEnabled(z);
        this.f16151j.setText(str);
    }
}
