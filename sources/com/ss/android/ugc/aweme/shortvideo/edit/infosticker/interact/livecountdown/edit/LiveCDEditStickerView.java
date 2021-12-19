package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.DatePicker;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.b;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.LiveCDEditText;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.LiveCDLinearLayout;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.lang.reflect.Field;
import java.util.GregorianCalendar;
import java.util.Objects;

public final class LiveCDEditStickerView extends FrameLayout {

    /* renamed from: j  reason: collision with root package name */
    static int f127432j = 2;

    /* renamed from: k  reason: collision with root package name */
    public static final a f127433k = new a((byte) 0);
    private static int u = 200;
    private static final int v = en.a(73.0d, i.f115645a);

    /* renamed from: a  reason: collision with root package name */
    public LinearLayout f127434a;

    /* renamed from: b  reason: collision with root package name */
    public LiveCDEditText f127435b;

    /* renamed from: c  reason: collision with root package name */
    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.b f127436c;

    /* renamed from: d  reason: collision with root package name */
    final b f127437d = new b();

    /* renamed from: e  reason: collision with root package name */
    public boolean f127438e;

    /* renamed from: f  reason: collision with root package name */
    long f127439f;

    /* renamed from: g  reason: collision with root package name */
    long f127440g;

    /* renamed from: h  reason: collision with root package name */
    int f127441h = 1;

    /* renamed from: i  reason: collision with root package name */
    d f127442i;

    /* renamed from: l  reason: collision with root package name */
    private LiveCDLinearLayout f127443l;

    /* renamed from: m  reason: collision with root package name */
    private TuxTextView f127444m;
    private TuxTextView n;
    private TuxTextView o;
    private TuxTextView p;
    private TuxTextView q;
    private TuxTextView r;
    private e s;
    private c t;

    public static final class a {
        static {
            Covode.recordClassIndex(83558);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final c getHintTextStateChanged() {
        return this.t;
    }

    public final d getLiveCDEditStateListener() {
        return this.f127442i;
    }

    public final e getLiveCDStickerInterface() {
        return this.s;
    }

    public final long getSelectTimeMiles() {
        return this.f127440g;
    }

    public final int getState() {
        return this.f127441h;
    }

    public final void f() {
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.b bVar = this.f127436c;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public final void c() {
        LiveCDEditText liveCDEditText = this.f127435b;
        if (liveCDEditText == null) {
            l.a("edLiveTitle");
        }
        liveCDEditText.setVisibility(0);
    }

    public final void d() {
        LiveCDEditText liveCDEditText = this.f127435b;
        if (liveCDEditText == null) {
            l.a("edLiveTitle");
        }
        f.b(liveCDEditText);
    }

    public final String getTitleText() {
        LiveCDEditText liveCDEditText = this.f127435b;
        if (liveCDEditText == null) {
            l.a("edLiveTitle");
        }
        return String.valueOf(liveCDEditText.getText());
    }

    static {
        Covode.recordClassIndex(83557);
    }

    public final void a() {
        Integer valueOf;
        e eVar;
        e eVar2 = this.s;
        if (eVar2 != null && (valueOf = Integer.valueOf(eVar2.getHintState())) != null) {
            if ((valueOf.intValue() == 2 || valueOf.intValue() == 3 || valueOf.intValue() == 4) && (eVar = this.s) != null) {
                eVar.a(-1);
            }
        }
    }

    public final void b() {
        b bVar = this.f127437d;
        LiveCDEditText liveCDEditText = this.f127435b;
        if (liveCDEditText == null) {
            l.a("edLiveTitle");
        }
        bVar.f127459a = String.valueOf(liveCDEditText.getText());
        this.f127437d.f127460b = this.f127440g;
        this.f127438e = !TextUtils.isEmpty(this.f127437d.f127459a);
    }

    public final void g() {
        InputMethodManager inputMethodManager = (InputMethodManager) a(getContext(), "input_method");
        Context context = getContext();
        l.b(context, "");
        Activity a2 = com.ss.android.ugc.aweme.scene.a.a(context);
        if (a2 != null && inputMethodManager != null) {
            Window window = a2.getWindow();
            l.b(window, "");
            View decorView = window.getDecorView();
            l.b(decorView, "");
            inputMethodManager.hideSoftInputFromWindow(decorView.getWindowToken(), 0);
        }
    }

    public final CountDownStickerStruct getLiveCDStruct() {
        LiveCDEditText liveCDEditText = this.f127435b;
        if (liveCDEditText == null) {
            l.a("edLiveTitle");
        }
        return new CountDownStickerStruct(String.valueOf(liveCDEditText.getText()), this.f127440g, 0, null, null, null, null, 124, null);
    }

    public final boolean e() {
        if (this.f127440g == 0) {
            return false;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(this.f127440g);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.setTimeInMillis(this.f127439f);
        if (gregorianCalendar.get(1) == gregorianCalendar2.get(1) && gregorianCalendar.get(5) == gregorianCalendar2.get(5) && gregorianCalendar.get(11) == gregorianCalendar2.get(11) && gregorianCalendar.get(12) == gregorianCalendar2.get(12)) {
            return false;
        }
        return true;
    }

    private final void h() {
        View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.bkq, this, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) a2;
        this.f127434a = linearLayout;
        if (linearLayout == null) {
            l.a("container");
        }
        addView(linearLayout);
        LinearLayout linearLayout2 = this.f127434a;
        if (linearLayout2 == null) {
            l.a("container");
        }
        View findViewById = linearLayout2.findViewById(R.id.arr);
        l.b(findViewById, "");
        this.f127435b = (LiveCDEditText) findViewById;
        LinearLayout linearLayout3 = this.f127434a;
        if (linearLayout3 == null) {
            l.a("container");
        }
        View findViewById2 = linearLayout3.findViewById(R.id.exr);
        l.b(findViewById2, "");
        this.f127444m = (TuxTextView) findViewById2;
        LinearLayout linearLayout4 = this.f127434a;
        if (linearLayout4 == null) {
            l.a("container");
        }
        View findViewById3 = linearLayout4.findViewById(R.id.ext);
        l.b(findViewById3, "");
        this.n = (TuxTextView) findViewById3;
        LinearLayout linearLayout5 = this.f127434a;
        if (linearLayout5 == null) {
            l.a("container");
        }
        View findViewById4 = linearLayout5.findViewById(R.id.exv);
        l.b(findViewById4, "");
        this.o = (TuxTextView) findViewById4;
        TuxTextView tuxTextView = this.f127444m;
        if (tuxTextView == null) {
            l.a("tvCountDownFirst");
        }
        tuxTextView.a(32.0f);
        TuxTextView tuxTextView2 = this.n;
        if (tuxTextView2 == null) {
            l.a("tvCountDownSecond");
        }
        tuxTextView2.a(32.0f);
        TuxTextView tuxTextView3 = this.o;
        if (tuxTextView3 == null) {
            l.a("tvCountDownThird");
        }
        tuxTextView3.a(32.0f);
        LinearLayout linearLayout6 = this.f127434a;
        if (linearLayout6 == null) {
            l.a("container");
        }
        View findViewById5 = linearLayout6.findViewById(R.id.exs);
        l.b(findViewById5, "");
        this.p = (TuxTextView) findViewById5;
        LinearLayout linearLayout7 = this.f127434a;
        if (linearLayout7 == null) {
            l.a("container");
        }
        View findViewById6 = linearLayout7.findViewById(R.id.exu);
        l.b(findViewById6, "");
        this.q = (TuxTextView) findViewById6;
        LinearLayout linearLayout8 = this.f127434a;
        if (linearLayout8 == null) {
            l.a("container");
        }
        View findViewById7 = linearLayout8.findViewById(R.id.exw);
        l.b(findViewById7, "");
        this.r = (TuxTextView) findViewById7;
        a("0", "0", "0", "0", true);
        LinearLayout linearLayout9 = this.f127434a;
        if (linearLayout9 == null) {
            l.a("container");
        }
        View findViewById8 = linearLayout9.findViewById(R.id.cew);
        l.b(findViewById8, "");
        LiveCDLinearLayout liveCDLinearLayout = (LiveCDLinearLayout) findViewById8;
        this.f127443l = liveCDLinearLayout;
        if (liveCDLinearLayout == null) {
            l.a("llCountDown");
        }
        liveCDLinearLayout.setOnClickListener(new c(this));
        LiveCDEditText liveCDEditText = this.f127435b;
        if (liveCDEditText == null) {
            l.a("edLiveTitle");
        }
        LiveCDEditText liveCDEditText2 = this.f127435b;
        if (liveCDEditText2 == null) {
            l.a("edLiveTitle");
        }
        liveCDEditText.addTextChangedListener(new b(liveCDEditText2, this));
        u = Math.max(dh.e(getContext()) / 4, v);
        LiveCDEditText liveCDEditText3 = this.f127435b;
        if (liveCDEditText3 == null) {
            l.a("edLiveTitle");
        }
        f.b(liveCDEditText3);
    }

    public final void setEditCurrentSticker(boolean z) {
        this.f127438e = z;
    }

    public final void setHintTextStateChanged(c cVar) {
        this.t = cVar;
    }

    public final void setLiveCDEditStateListener(d dVar) {
        this.f127442i = dVar;
    }

    public final void setLiveCDStickerInterface(e eVar) {
        this.s = eVar;
    }

    public final void setSelectTimeMiles(long j2) {
        this.f127440g = j2;
    }

    public final void setState(int i2) {
        this.f127441h = i2;
    }

    public static final class c extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveCDEditStickerView f127448a;

        static {
            Covode.recordClassIndex(83560);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(LiveCDEditStickerView liveCDEditStickerView) {
            this.f127448a = liveCDEditStickerView;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            c hintTextStateChanged = this.f127448a.getHintTextStateChanged();
            if (hintTextStateChanged != null) {
                hintTextStateChanged.a();
            }
            LiveCDEditStickerView liveCDEditStickerView = this.f127448a;
            liveCDEditStickerView.f127441h = 2;
            LiveCDEditText liveCDEditText = liveCDEditStickerView.f127435b;
            if (liveCDEditText == null) {
                l.a("edLiveTitle");
            }
            liveCDEditText.clearFocus();
            liveCDEditStickerView.g();
            liveCDEditStickerView.f127439f = System.currentTimeMillis();
            liveCDEditStickerView.f127436c = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.b(liveCDEditStickerView.getContext(), liveCDEditStickerView.f127439f);
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.b bVar = liveCDEditStickerView.f127436c;
            if (bVar != null) {
                bVar.f127392b = liveCDEditStickerView.f127440g;
            }
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.b bVar2 = liveCDEditStickerView.f127436c;
            if (bVar2 != null) {
                bVar2.f127391a = new d(bVar2, liveCDEditStickerView);
                bVar2.show();
            }
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.b bVar3 = liveCDEditStickerView.f127436c;
            if (bVar3 != null) {
                e eVar = new e(liveCDEditStickerView);
                l.d(eVar, "");
                DatePicker b2 = bVar3.b();
                if (b2 != null) {
                    b2.setDateChangedListener(eVar);
                }
            }
            this.f127448a.a();
        }
    }

    public static final class e implements com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveCDEditStickerView f127452a;

        static {
            Covode.recordClassIndex(83563);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(LiveCDEditStickerView liveCDEditStickerView) {
            this.f127452a = liveCDEditStickerView;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.a
        public final void a(String str, String str2, String str3, String str4, long j2) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            l.d(str4, "");
            this.f127452a.setSelectTimeMiles(j2);
            this.f127452a.a(str, str2, str3, str4, false);
            d liveCDEditStateListener = this.f127452a.getLiveCDEditStateListener();
            if (liveCDEditStateListener != null) {
                liveCDEditStateListener.a(String.valueOf(LiveCDEditStickerView.a(this.f127452a).getText()));
            }
        }
    }

    public static final /* synthetic */ LiveCDEditText a(LiveCDEditStickerView liveCDEditStickerView) {
        LiveCDEditText liveCDEditText = liveCDEditStickerView.f127435b;
        if (liveCDEditText == null) {
            l.a("edLiveTitle");
        }
        return liveCDEditText;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveCDEditStickerView(Context context) {
        super(context);
        l.d(context, "");
        MethodCollector.i(3908);
        h();
        MethodCollector.o(3908);
    }

    private static String a(String str) {
        if (Integer.parseInt(str) < 10) {
            return "0".concat(String.valueOf(str));
        }
        return str;
    }

    public final void setEditEnable(boolean z) {
        LiveCDEditText liveCDEditText = this.f127435b;
        if (liveCDEditText == null) {
            l.a("edLiveTitle");
        }
        liveCDEditText.setEnabled(z);
        LiveCDLinearLayout liveCDLinearLayout = this.f127443l;
        if (liveCDLinearLayout == null) {
            l.a("llCountDown");
        }
        liveCDLinearLayout.setEnabled(z);
    }

    public final void setTouchEnable(boolean z) {
        LiveCDEditText liveCDEditText = this.f127435b;
        if (liveCDEditText == null) {
            l.a("edLiveTitle");
        }
        liveCDEditText.setMode(z);
        LiveCDLinearLayout liveCDLinearLayout = this.f127443l;
        if (liveCDLinearLayout == null) {
            l.a("llCountDown");
        }
        liveCDLinearLayout.setMode(z);
    }

    public static final class d implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.b f127449a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveCDEditStickerView f127450b;

        static {
            Covode.recordClassIndex(83561);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.b.a
        public final void a(MotionEvent motionEvent) {
            l.d(motionEvent, "");
            if (g.a(LiveCDEditStickerView.a(this.f127450b), (int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                f.b(LiveCDEditStickerView.a(this.f127450b));
                this.f127450b.setState(1);
                this.f127449a.dismiss();
                LinearLayout linearLayout = this.f127450b.f127434a;
                if (linearLayout == null) {
                    l.a("container");
                }
                linearLayout.postDelayed(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView.d.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ d f127451a;

                    static {
                        Covode.recordClassIndex(83562);
                    }

                    {
                        this.f127451a = r1;
                    }

                    public final void run() {
                        LiveCDEditText a2 = LiveCDEditStickerView.a(this.f127451a.f127450b);
                        Context context = LiveCDEditStickerView.a(this.f127451a.f127450b).getContext();
                        l.b(context, "");
                        l.d(context, "");
                        Object a3 = LiveCDEditStickerView.a(context, "input_method");
                        Objects.requireNonNull(a3, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        InputMethodManager inputMethodManager = (InputMethodManager) a3;
                        if (inputMethodManager != null) {
                            inputMethodManager.showSoftInput(a2, 2);
                        }
                    }
                }, 200);
                this.f127450b.a();
                return;
            }
            e liveCDStickerInterface = this.f127450b.getLiveCDStickerInterface();
            if (liveCDStickerInterface != null) {
                liveCDStickerInterface.a(motionEvent);
            }
        }

        d(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.b bVar, LiveCDEditStickerView liveCDEditStickerView) {
            this.f127449a = bVar;
            this.f127450b = liveCDEditStickerView;
        }
    }

    public static final class b implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        private final EditText f127445a;

        /* renamed from: b  reason: collision with root package name */
        private final EditText f127446b = null;

        /* renamed from: c  reason: collision with root package name */
        private final LiveCDEditStickerView f127447c;

        static {
            Covode.recordClassIndex(83559);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void afterTextChanged(Editable editable) {
            Editable text;
            EditText editText = this.f127445a;
            if (!(editText == null || (text = editText.getText()) == null || text.length() == 0 || f.a(editText) <= 2)) {
                String obj = editText.getText().toString();
                if (obj.length() >= 100) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                    obj = obj.substring(0, 100);
                    l.b(obj, "");
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                String substring = obj.substring(0, obj.length() - 1);
                l.b(substring, "");
                int length = substring.length() - 1;
                while (length >= 0 && Character.isHighSurrogate(substring.charAt(length))) {
                    Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
                    substring = substring.substring(0, length);
                    l.b(substring, "");
                    length--;
                }
                editText.setText(substring);
                editText.setSelection(editText.getText().length());
            }
            String valueOf = String.valueOf(editable);
            if (p.a((CharSequence) valueOf, '\r', 0, false, 6) >= 0 || p.a((CharSequence) valueOf, '\n', 0, false, 6) >= 0) {
                this.f127445a.setText(p.a(p.a(valueOf, "\r", ""), "\n", ""));
                EditText editText2 = this.f127445a;
                editText2.setSelection(editText2.getText().length());
                f.b(this.f127446b);
            }
            c hintTextStateChanged = this.f127447c.getHintTextStateChanged();
            if (hintTextStateChanged != null) {
                hintTextStateChanged.b();
            }
            d liveCDEditStateListener = this.f127447c.getLiveCDEditStateListener();
            if (liveCDEditStateListener != null) {
                String obj2 = this.f127445a.getText().toString();
                this.f127447c.getSelectTimeMiles();
                liveCDEditStateListener.a(obj2);
            }
            this.f127447c.a();
        }

        public b(EditText editText, LiveCDEditStickerView liveCDEditStickerView) {
            l.d(editText, "");
            l.d(liveCDEditStickerView, "");
            this.f127445a = editText;
            this.f127447c = liveCDEditStickerView;
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            EditText editText = this.f127445a;
            if (editText != null) {
                if (!TextUtils.isEmpty(editText.getText().toString()) || editText.getHint() == null) {
                    editText.setGravity(17);
                    f.a(editText, en.a(0.0d, i.f115645a), en.a(0.0d, i.f115645a));
                    return;
                }
                Paint paint = new Paint();
                paint.setTextSize(editText.getTextSize());
                paint.setTypeface(editText.getTypeface());
                int measureText = (int) ((((float) editText.getLayoutParams().width) - paint.measureText(editText.getHint().toString())) / 2.0f);
                if (measureText < 0) {
                    f.a(editText, 0, 0);
                    editText.setGravity(8388659);
                    return;
                }
                f.a(editText, measureText, 0);
                editText.setGravity(8388627);
            }
        }
    }

    public final void a(CountDownStickerStruct countDownStickerStruct) {
        long j2;
        String str = "";
        l.d(countDownStickerStruct, str);
        LiveCDEditText liveCDEditText = this.f127435b;
        if (liveCDEditText == null) {
            l.a("edLiveTitle");
        }
        String title = countDownStickerStruct.getTitle();
        if (title != null) {
            str = title;
        }
        liveCDEditText.setText(str);
        Long expiredTime = countDownStickerStruct.getExpiredTime();
        if (expiredTime != null) {
            j2 = expiredTime.longValue();
        } else {
            j2 = 0;
        }
        this.f127440g = j2;
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.b a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.c.a(j2, System.currentTimeMillis());
        a(a2.f127363a, a2.f127364b, a2.f127365c, a2.f127366d, false);
        d dVar = this.f127442i;
        if (dVar != null) {
            LiveCDEditText liveCDEditText2 = this.f127435b;
            if (liveCDEditText2 == null) {
                l.a("edLiveTitle");
            }
            dVar.a(String.valueOf(liveCDEditText2.getText()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveCDEditStickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(3911);
        h();
        MethodCollector.o(3911);
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3886);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(3886);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public final void a(String str, String str2, String str3, String str4, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        if (z) {
            TuxTextView tuxTextView = this.f127444m;
            if (tuxTextView == null) {
                l.a("tvCountDownFirst");
            }
            tuxTextView.setText(a(str2));
            TuxTextView tuxTextView2 = this.n;
            if (tuxTextView2 == null) {
                l.a("tvCountDownSecond");
            }
            tuxTextView2.setText(a(str3));
            TuxTextView tuxTextView3 = this.o;
            if (tuxTextView3 == null) {
                l.a("tvCountDownThird");
            }
            tuxTextView3.setText(a(str4));
            TuxTextView tuxTextView4 = this.p;
            if (tuxTextView4 == null) {
                l.a("tvCountDownFirstHint");
            }
            tuxTextView4.setVisibility(4);
            TuxTextView tuxTextView5 = this.q;
            if (tuxTextView5 == null) {
                l.a("tvCountDownSecondHint");
            }
            tuxTextView5.setVisibility(4);
            TuxTextView tuxTextView6 = this.r;
            if (tuxTextView6 == null) {
                l.a("tvCountDownThirdHint");
            }
            tuxTextView6.setVisibility(4);
            return;
        }
        TuxTextView tuxTextView7 = this.p;
        if (tuxTextView7 == null) {
            l.a("tvCountDownFirstHint");
        }
        tuxTextView7.setVisibility(0);
        TuxTextView tuxTextView8 = this.q;
        if (tuxTextView8 == null) {
            l.a("tvCountDownSecondHint");
        }
        tuxTextView8.setVisibility(0);
        TuxTextView tuxTextView9 = this.r;
        if (tuxTextView9 == null) {
            l.a("tvCountDownThirdHint");
        }
        tuxTextView9.setVisibility(0);
        if (Integer.parseInt(str) == 0) {
            TuxTextView tuxTextView10 = this.p;
            if (tuxTextView10 == null) {
                l.a("tvCountDownFirstHint");
            }
            Context context = getContext();
            l.b(context, "");
            tuxTextView10.setText(context.getResources().getText(R.string.ave));
            TuxTextView tuxTextView11 = this.q;
            if (tuxTextView11 == null) {
                l.a("tvCountDownSecondHint");
            }
            Context context2 = getContext();
            l.b(context2, "");
            tuxTextView11.setText(context2.getResources().getText(R.string.avf));
            TuxTextView tuxTextView12 = this.r;
            if (tuxTextView12 == null) {
                l.a("tvCountDownThirdHint");
            }
            Context context3 = getContext();
            l.b(context3, "");
            tuxTextView12.setText(context3.getResources().getText(R.string.avk));
            TuxTextView tuxTextView13 = this.f127444m;
            if (tuxTextView13 == null) {
                l.a("tvCountDownFirst");
            }
            tuxTextView13.setText(a(str2));
            TuxTextView tuxTextView14 = this.n;
            if (tuxTextView14 == null) {
                l.a("tvCountDownSecond");
            }
            tuxTextView14.setText(a(str3));
            TuxTextView tuxTextView15 = this.o;
            if (tuxTextView15 == null) {
                l.a("tvCountDownThird");
            }
            tuxTextView15.setText(a(str4));
            return;
        }
        TuxTextView tuxTextView16 = this.p;
        if (tuxTextView16 == null) {
            l.a("tvCountDownFirstHint");
        }
        Context context4 = getContext();
        l.b(context4, "");
        tuxTextView16.setText(context4.getResources().getText(R.string.av5));
        TuxTextView tuxTextView17 = this.q;
        if (tuxTextView17 == null) {
            l.a("tvCountDownSecondHint");
        }
        Context context5 = getContext();
        l.b(context5, "");
        tuxTextView17.setText(context5.getResources().getText(R.string.ave));
        TuxTextView tuxTextView18 = this.r;
        if (tuxTextView18 == null) {
            l.a("tvCountDownThirdHint");
        }
        Context context6 = getContext();
        l.b(context6, "");
        tuxTextView18.setText(context6.getResources().getText(R.string.avf));
        TuxTextView tuxTextView19 = this.f127444m;
        if (tuxTextView19 == null) {
            l.a("tvCountDownFirst");
        }
        tuxTextView19.setText(a(str));
        TuxTextView tuxTextView20 = this.n;
        if (tuxTextView20 == null) {
            l.a("tvCountDownSecond");
        }
        tuxTextView20.setText(a(str2));
        TuxTextView tuxTextView21 = this.o;
        if (tuxTextView21 == null) {
            l.a("tvCountDownThird");
        }
        tuxTextView21.setText(a(str3));
    }
}
