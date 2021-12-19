package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.c.a.a;
import com.bytedance.android.c.a.b;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.live.common.keyboard.c;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.at.g;
import com.bytedance.android.livesdk.at.h;
import com.bytedance.android.livesdk.at.j;
import com.bytedance.android.livesdk.chatroom.c.s;
import com.bytedance.android.livesdk.chatroom.ui.ar;
import com.bytedance.android.livesdk.j.bc;
import com.bytedance.android.livesdk.livesetting.comment.EnableLiveKeyboardWithHeightSetting;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentInputDialogDismissFixSetting;
import com.bytedance.android.livesdk.livesetting.comment.LiveInputDialogAnimationSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.o;
import com.bytedance.android.livesdk.widget.BarrageView;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class bg extends d implements c, ar {
    private boolean A;
    private boolean B;
    private MeasureLinearLayout C;
    private ImageView D;
    private ImageView E;
    private KeyboardShadowView F;
    private LinearLayout G;
    private ViewGroup H;
    private View I;
    private b J;
    private long K;
    private final View.OnClickListener L = new bh(this);
    private final TextWatcher M = new TextWatcher() {
        /* class com.bytedance.android.livesdk.chatroom.ui.bg.AnonymousClass1 */

        static {
            Covode.recordClassIndex(8823);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void afterTextChanged(Editable editable) {
            String obj;
            int i2;
            String string;
            if (bg.this.f15942a) {
                Editable text = bg.this.f15952k.getText();
                bg bgVar = bg.this;
                if (text == null) {
                    obj = "";
                } else {
                    obj = text.toString();
                }
                bgVar.f15951j = obj;
                boolean isEmpty = TextUtils.isEmpty(bg.this.f15951j);
                if (isEmpty) {
                    bg.this.f15953l.setVisibility(0);
                } else {
                    bg.this.f15953l.setVisibility(8);
                    if (!bg.this.t && bg.this.f15943b != null) {
                        bg.this.t = true;
                        bg.this.f15943b.b();
                    }
                }
                bg.this.b(isEmpty);
                int trimmedLength = TextUtils.getTrimmedLength(bg.this.f15951j);
                int i3 = 15;
                if (bg.this.f15949h) {
                    i2 = 15;
                } else {
                    i2 = 100;
                }
                if (trimmedLength > i2) {
                    bg bgVar2 = bg.this;
                    CommentEditText commentEditText = bgVar2.f15952k;
                    bgVar2.f15948g = new InputFilter.LengthFilter(bg.this.f15951j.length());
                    commentEditText.setFilters(new InputFilter[]{bgVar2.f15948g});
                } else {
                    bg bgVar3 = bg.this;
                    CommentEditText commentEditText2 = bgVar3.f15952k;
                    if (bgVar3.f15948g != null) {
                        commentEditText2.setFilters(new InputFilter[0]);
                        bgVar3.f15948g = null;
                    }
                }
                if (!bg.this.f15949h) {
                    i3 = 100;
                }
                if (trimmedLength > i3) {
                    if (bg.this.f15949h) {
                        string = bg.this.getString(R.string.gpn);
                    } else {
                        string = bg.this.getString(R.string.gos, 100);
                    }
                    ao.a(y.e(), string, 0);
                    int offsetByCodePoints = bg.this.f15951j.offsetByCodePoints(0, bg.this.f15951j.codePointCount(0, 100));
                    if (offsetByCodePoints >= bg.this.f15951j.length()) {
                        offsetByCodePoints = bg.this.f15951j.length() - 1;
                    }
                    bg.this.f15952k.setText(bg.this.f15951j.substring(0, offsetByCodePoints));
                    try {
                        bg.this.f15952k.setSelection(bg.this.f15952k.getText().length());
                    } catch (Exception e2) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("error", e2.getMessage());
                        com.bytedance.android.live.core.d.c.a("ttlive_emoji_fragment_error", 1, hashMap);
                    }
                }
                bg.this.u.a(bg.this.r);
            }
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public boolean f15942a;

    /* renamed from: b  reason: collision with root package name */
    public ar.b f15943b;

    /* renamed from: c  reason: collision with root package name */
    public ar.a f15944c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f15945d;

    /* renamed from: e  reason: collision with root package name */
    boolean f15946e;

    /* renamed from: f  reason: collision with root package name */
    public a f15947f = a.Keyboard;

    /* renamed from: g  reason: collision with root package name */
    InputFilter f15948g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f15949h;

    /* renamed from: i  reason: collision with root package name */
    boolean f15950i;

    /* renamed from: j  reason: collision with root package name */
    public String f15951j;

    /* renamed from: k  reason: collision with root package name */
    public CommentEditText f15952k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f15953l;

    /* renamed from: m  reason: collision with root package name */
    BarrageView f15954m;
    ViewPager n;
    ViewGroup o;
    public LiveButton p;
    public com.bytedance.android.c.a.c q;
    public com.bytedance.android.c.a.a r;
    int s;
    public boolean t;
    public final a.AbstractC0093a u = new a.AbstractC0093a() {
        /* class com.bytedance.android.livesdk.chatroom.ui.bg.AnonymousClass2 */

        static {
            Covode.recordClassIndex(8824);
        }

        @Override // com.bytedance.android.c.a.c.a
        public final void a_() {
            bg.this.b();
        }

        @Override // com.bytedance.android.c.a.a.AbstractC0093a
        public final void b() {
            bg.this.e();
        }

        @Override // com.bytedance.android.c.a.a.AbstractC0093a
        public final boolean a() {
            return TextUtils.isEmpty(bg.this.f15951j);
        }

        @Override // com.bytedance.android.live.e.a.a.a
        public final void b_() {
            bg.this.f15952k.dispatchKeyEvent(new KeyEvent(0, 67));
        }

        @Override // com.bytedance.android.c.a.c.a
        public final void a(com.bytedance.android.c.a.c cVar) {
            if (cVar == bg.this.q) {
                bg.this.p.setEnabled(!cVar.d());
            }
        }

        @Override // com.bytedance.android.live.e.a.a.a
        public final void a(com.bytedance.android.live.base.model.emoji.a aVar) {
            int i2;
            String string;
            if (aVar != null && aVar.f7397a != null) {
                int length = bg.this.f15952k.getText().length() + aVar.f7397a.length();
                if (bg.this.f15949h) {
                    i2 = 15;
                } else {
                    i2 = 100;
                }
                if (length > i2) {
                    if (bg.this.f15949h) {
                        string = bg.this.getString(R.string.gpn);
                    } else {
                        string = bg.this.getString(R.string.gos, 100);
                    }
                    ao.a(y.e(), string, 0);
                } else if (!TextUtils.isEmpty(aVar.f7397a)) {
                    bg.this.f15952k.getText().insert(bg.this.f15952k.getSelectionStart(), aVar.f7397a);
                }
            }
        }
    };
    final List<com.bytedance.android.c.a.c> v = new ArrayList();
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;

    static {
        Covode.recordClassIndex(8822);
    }

    @Override // com.bytedance.android.live.common.keyboard.c
    public final void a(boolean z2, int i2) {
        if (z2) {
            this.K = SystemClock.uptimeMillis();
            if (this.f15947f != a.Keyboard) {
                this.f15947f = a.Keyboard;
            }
            com.bytedance.android.livesdk.chatroom.g.c.a("open keyboard");
            this.f15945d = true;
            this.D.setImageResource(2131234451);
            this.G.setVisibility(8);
            com.bytedance.android.livesdk.an.a.a().a(new s(i2, true));
        } else if (this.f15947f == a.Panel) {
            this.C.setVisibility(0);
            this.D.setImageResource(2131234452);
            if (this.G.getVisibility() != 0) {
                this.G.setVisibility(0);
                this.G.post(new bn(this));
            }
            com.bytedance.android.livesdk.an.a.a().a(new s(y.d(R.dimen.wc) + y.d(R.dimen.wd) + y.a(1.0f), true));
        } else {
            com.bytedance.android.livesdk.chatroom.g.c.a("close keyboard");
            if (!LiveCommentInputDialogDismissFixSetting.getValue().f18706a || SystemClock.uptimeMillis() - this.K >= LiveCommentInputDialogDismissFixSetting.getValue().f18707b) {
                c();
            } else {
                com.bytedance.android.livesdk.chatroom.g.c.a("Unexpected close keyboard");
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.ar
    public final void b() {
        g();
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f15942a = false;
    }

    public final void g() {
        if (this.f15952k != null) {
            o.b(getContext(), this.f15952k);
        }
    }

    private void h() {
        for (com.bytedance.android.c.a.c cVar : this.v) {
            cVar.c(this.f15950i);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.ar
    public final void a() {
        b bVar;
        if (isAdded() && !this.f15950i && (bVar = this.J) != null) {
            bVar.a((List<? extends EmoteModel>) null);
        }
    }

    public final void c() {
        if (this.f15945d) {
            this.f15945d = false;
            this.C.setVisibility(4);
            try {
                dismiss();
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.x = false;
        BarrageView barrageView = this.f15954m;
        if (barrageView != null) {
            barrageView.clearAnimation();
            this.f15954m = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        com.bytedance.android.live.common.keyboard.a keyBoardObservable = this.C.getKeyBoardObservable();
        if (keyBoardObservable.f8827b != null) {
            keyBoardObservable.f8827b.remove(this);
        }
    }

    /* access modifiers changed from: package-private */
    public enum a {
        Keyboard,
        Panel,
        Close;

        static {
            Covode.recordClassIndex(8831);
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if (isAdded()) {
            if (this.f15950i) {
                this.f15952k.setText("");
                this.f15953l.setText(R.string.eb_);
                this.f15952k.setEnabled(false);
                return;
            }
            this.f15952k.setText(this.f15951j);
            if (!TextUtils.isEmpty(this.f15951j) && !com.bytedance.android.live.uikit.c.a.a(getContext())) {
                this.f15952k.setSelection(this.f15951j.length());
            }
            this.f15952k.setTextSize(1, 17.0f);
            if (this.f15949h) {
                this.f15953l.setText(R.string.gms);
            } else {
                this.f15953l.setText(R.string.e8e);
            }
            this.f15952k.setEnabled(true);
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        com.bytedance.android.c.a.c cVar;
        MethodCollector.i(1958);
        this.H.removeAllViews();
        if (this.f15947f != a.Panel || (cVar = this.q) == null) {
            this.H.setVisibility(8);
            this.I.setVisibility(0);
            this.f15952k.requestFocus();
            MethodCollector.o(1958);
            return;
        }
        View c2 = cVar.c(this.H);
        if (c2 != null) {
            this.H.addView(c2, -1, -1);
            this.H.setVisibility(0);
            this.I.setVisibility(8);
            MethodCollector.o(1958);
            return;
        }
        this.H.setVisibility(8);
        this.I.setVisibility(0);
        this.f15952k.requestFocus();
        MethodCollector.o(1958);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.bytedance.android.live.common.keyboard.a keyBoardObservable = this.C.getKeyBoardObservable();
        if (keyBoardObservable.f8827b == null) {
            keyBoardObservable.f8827b = new ArrayList();
        }
        keyBoardObservable.f8827b.add(this);
        if (this.x && this.f15947f == a.Keyboard) {
            this.x = false;
            a(200, 1, 5);
        } else if (this.f15947f == a.Keyboard) {
            this.f15952k.post(new Runnable() {
                /* class com.bytedance.android.livesdk.chatroom.ui.bg.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(8827);
                }

                public final void run() {
                    try {
                        bg.this.f15952k.requestFocus();
                        com.bytedance.android.live.core.c.a.a(4, "KeyboardAction", "show");
                        o.a(bg.this.getContext(), bg.this.f15952k);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            });
            this.f15952k.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                /* class com.bytedance.android.livesdk.chatroom.ui.bg.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(8828);
                }

                public final void onFocusChange(View view, boolean z) {
                    view.postDelayed(new Runnable() {
                        /* class com.bytedance.android.livesdk.chatroom.ui.bg.AnonymousClass6.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(8829);
                        }

                        public final void run() {
                            if (bg.this.isAdded() && bg.this.getContext() != null) {
                                if (bg.this.getActivity() != null) {
                                    bg.this.getActivity().getWindow().setSoftInputMode(48);
                                }
                                if (!bg.this.f15945d) {
                                    com.bytedance.android.live.core.c.a.a(4, "KeyboardAction", "show");
                                    o.a(bg.this.getContext(), bg.this.f15952k);
                                }
                            }
                        }
                    }, 100);
                    bg.this.f15952k.setOnFocusChangeListener(null);
                }
            });
        }
    }

    public final void e() {
        ar.b bVar = this.f15943b;
        if (bVar != null) {
            bVar.a();
        }
        if (!u.a().b().e()) {
            if (getActivity() == null) {
                ao.a(y.e(), (int) R.string.gm5);
                return;
            }
            f b2 = u.a().b();
            e activity = getActivity();
            j.a a2 = j.a();
            a2.f14158a = y.a((int) R.string.gvz);
            a2.f14161d = "comment_live";
            a2.f14160c = 1000;
            b2.a(activity, a2.a()).b(new g());
        } else if (!u.a().b().a(h.COMMENT)) {
            if (this.f15949h && ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).isNeedProtectMinor()) {
                ao.a(y.e(), (int) R.string.gte);
            } else if (this.f15943b != null && this.f15952k.getText() != null) {
                String obj = this.f15952k.getText().toString();
                for (int i2 = 0; i2 < obj.length(); i2++) {
                    if (!Character.isWhitespace(obj.charAt(i2))) {
                        if (obj.length() > 0) {
                            this.f15943b.a(obj, this.f15949h, this.s);
                            this.s = 0;
                            return;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.ar
    public final void a(ar.b bVar) {
        this.f15943b = bVar;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.x = this.f15945d;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    public final void a(int i2) {
        com.bytedance.android.c.a.c cVar = this.v.get(i2);
        this.q = cVar;
        for (int i3 = 0; i3 < this.v.size(); i3++) {
            if (i3 != i2) {
                this.v.get(i3).d(false);
            }
        }
        cVar.d(true);
        a(cVar);
        f();
    }

    public final void b(boolean z2) {
        if (z2) {
            this.E.setImageResource(2131234703);
            androidx.core.widget.e.a(this.E, (ColorStateList) null);
            return;
        }
        this.E.setImageResource(2131234702);
        ImageView imageView = this.E;
        androidx.core.widget.e.a(imageView, ColorStateList.valueOf(com.bytedance.android.live.design.b.a(imageView, (int) R.attr.ama)));
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15942a = true;
        setStyle(1, R.style.a2t);
        setCancelable(true);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        this.f15949h = arguments.getBoolean("live.intent.extra.DANMU_OPEN", false);
        this.y = arguments.getBoolean("live.intent.extra.IS_BROADCASTER", false);
        this.f15950i = arguments.getBoolean("live.intent.extra.USER_BANNED", false);
        this.z = arguments.getBoolean("live.intent.extra.USER_BANNED_WHOLE_LIVE", false);
        this.f15951j = arguments.getString("live.intent.extra.INPUT", "");
        this.A = arguments.getBoolean("live.inter.extra.CAN_DANMU", true);
        this.B = arguments.getBoolean("live.inter.extra.IS_OFFICIAL", false);
        LiveInputDialogAnimationSetting.INSTANCE.setDisable(this.y);
        int i2 = arguments.getInt("live.intent.extra.INPUT_MODE", 0);
        this.w = i2;
        if (i2 == 2) {
            this.f15947f = a.Panel;
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(false);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.addFlags(32);
            if (!LiveInputDialogAnimationSetting.INSTANCE.hasAnimation() || Build.VERSION.SDK_INT < 30) {
                window.setSoftInputMode(3);
            } else {
                window.setSoftInputMode(19);
            }
            if ((getActivity() != null && getActivity().getRequestedOrientation() == 0) || (!this.y && !com.bytedance.android.live.core.f.d.a(getActivity()))) {
                window.addFlags(1024);
            }
            window.clearFlags(2);
        }
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.d
    public final void onDismiss(DialogInterface dialogInterface) {
        com.bytedance.android.livesdk.chatroom.g.c.a("Dialog onDismiss");
        com.bytedance.android.livesdk.g.a().c();
        com.bytedance.android.livesdk.an.a.a().a(new s(0, false));
        super.onDismiss(dialogInterface);
        if (this.f15943b != null) {
            com.bytedance.android.livesdk.chatroom.model.f fVar = new com.bytedance.android.livesdk.chatroom.model.f();
            fVar.f15760b = this.y;
            fVar.f15761c = this.f15950i;
            fVar.f15762d = this.z;
            fVar.f15759a = this.f15949h;
            fVar.f15763e = this.f15951j;
            fVar.f15764f = this.A;
            b bVar = this.J;
            if (bVar != null) {
                fVar.a(bVar.f6817b);
            }
            this.f15943b.a(fVar);
            this.f15943b = null;
            this.f15945d = false;
        }
        this.t = false;
    }

    public final void a(com.bytedance.android.c.a.c cVar) {
        this.p.setText(cVar.b());
        this.p.setEnabled(!cVar.d());
        ViewGroup.LayoutParams layoutParams = this.p.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = cVar.f6830i;
            this.p.setLayoutParams(layoutParams);
        }
        b(cVar.d());
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.ar
    public final void a(com.bytedance.android.livesdk.event.b bVar) {
        if (isAdded()) {
            if (this.f15950i && bVar.f17179a) {
                return;
            }
            if (this.f15950i || bVar.f17179a) {
                this.f15950i = bVar.f17179a;
                this.z = bVar.f17180b;
                d();
                h();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.ar
    public final void a(String str) {
        if (isAdded() && !this.f15950i) {
            this.f15951j = str;
            d();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.ar
    public final void a(boolean z2) {
        if (isAdded() && !this.f15950i) {
            if (this.f15949h) {
                if (z2) {
                    return;
                }
            } else if (!z2) {
                return;
            }
            this.f15949h = z2;
            if (z2) {
                this.f15954m.a(true);
            } else {
                this.f15954m.a();
            }
            d();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.ar
    public final void a(Activity activity, String str) {
        show(((e) activity).getSupportFragmentManager(), str);
    }

    @Override // androidx.fragment.app.d
    public final void show(i iVar, String str) {
        com.bytedance.android.livesdk.g.a().b();
        super.show(iVar, str);
    }

    @Override // androidx.fragment.app.d
    public final void showNow(i iVar, String str) {
        com.bytedance.android.livesdk.g.a().b();
        super.showNow(iVar, str);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i2;
        boolean z2;
        Bundle arguments;
        String str;
        super.onViewCreated(view, bundle);
        this.f15952k.addTextChangedListener(this.M);
        this.f15954m.setOnClickListener(this.L);
        this.D.setOnClickListener(this.L);
        if (this.B) {
            n.a(this.f15954m, 8);
        }
        boolean z3 = true;
        if (!((com.bytedance.android.livesdkapi.host.c) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdkapi.host.c.class)).b() || this.w == 2) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(this);
        if (a2 != null) {
            if (l.a(a2.b(bc.class), (Object) true)) {
                str = "chat_room";
            } else {
                str = "bubble";
            }
            com.bytedance.android.livesdk.ab.b a3 = b.a.a("livesdk_comment_pannel_show");
            a3.a(a2);
            a3.a("is_emoji", i2);
            a3.a("comment_pannel_type", str);
            com.bytedance.android.livesdk.chatroom.g.b.a(a3);
            com.bytedance.android.livesdk.chatroom.g.b.a(a3, a2);
            a3.b();
        }
        Context context = view.getContext();
        com.bytedance.android.c.a.a aVar = new com.bytedance.android.c.a.a(context);
        this.r = aVar;
        ar.a aVar2 = this.f15944c;
        if (aVar2 == null || aVar2.a()) {
            z2 = true;
        } else {
            z2 = false;
        }
        aVar.f6828g = z2;
        com.bytedance.android.c.a.a aVar3 = this.r;
        a.AbstractC0093a aVar4 = this.u;
        aVar3.f6815a = aVar4;
        aVar3.a(aVar4);
        if (this.w != 2) {
            this.v.add(this.r);
            this.D.setVisibility(0);
        } else {
            this.D.setVisibility(8);
        }
        if (this.w != 1) {
            com.bytedance.android.c.a.b bVar = new com.bytedance.android.c.a.b(context);
            this.J = bVar;
            ar.a aVar5 = this.f15944c;
            if (aVar5 != null && !aVar5.a()) {
                z3 = false;
            }
            bVar.f6828g = z3;
            com.bytedance.android.c.a.b bVar2 = this.J;
            AnonymousClass4 r0 = new b.a() {
                /* class com.bytedance.android.livesdk.chatroom.ui.bg.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(8826);
                }

                @Override // com.bytedance.android.live.e.a.a.a
                public final void a(com.bytedance.android.live.base.model.emoji.a aVar) {
                }

                @Override // com.bytedance.android.live.e.a.a.a
                public final void b_() {
                }

                @Override // com.bytedance.android.c.a.c.a
                public final void a_() {
                    bg.this.b();
                }

                @Override // com.bytedance.android.c.a.c.a
                public final void a(com.bytedance.android.c.a.c cVar) {
                    if (cVar == bg.this.q) {
                        bg.this.a(cVar);
                    }
                }

                @Override // com.bytedance.android.c.a.b.a
                public final void a(List<? extends EmoteModel> list) {
                    if (bg.this.f15943b != null) {
                        bg.this.f15943b.a(list);
                    }
                }
            };
            bVar2.f6819d = r0;
            bVar2.a(r0);
            this.v.add(this.J);
        }
        h();
        d();
        if (!this.f15950i && this.f15949h) {
            this.f15954m.a(false);
        }
        this.f15954m.setVisibility(8);
        if (this.J != null && (arguments = getArguments()) != null) {
            this.J.a(arguments.getParcelableArrayList("live.intent.extra.EMOTES"));
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2, int i2, int i3) {
        CommentEditText commentEditText = this.f15952k;
        if (commentEditText != null && i2 <= i3) {
            commentEditText.postDelayed(new bl(this, j2, i2, i3), j2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.b9h, viewGroup, false);
        this.C = (MeasureLinearLayout) a2;
        boolean z2 = true;
        if (EnableLiveKeyboardWithHeightSetting.INSTANCE.getValue() && getActivity() != null && getActivity().getRequestedOrientation() == 1) {
            this.C.f8822a = new com.bytedance.android.live.common.keyboard.b();
        }
        KeyboardShadowView keyboardShadowView = (KeyboardShadowView) this.C.findViewById(R.id.fjm);
        this.F = keyboardShadowView;
        keyboardShadowView.setActivity(getActivity());
        KeyboardShadowView keyboardShadowView2 = this.F;
        if (!this.y || (getActivity() != null && getActivity().getRequestedOrientation() == 0)) {
            z2 = false;
        }
        keyboardShadowView2.setShowStatusBar(z2);
        this.D = (ImageView) a2.findViewById(R.id.czj);
        ImageView imageView = (ImageView) a2.findViewById(R.id.dyp);
        this.E = imageView;
        imageView.setOnClickListener(new bi(this));
        this.f15954m = (BarrageView) a2.findViewById(R.id.rj);
        CommentEditText commentEditText = (CommentEditText) a2.findViewById(R.id.ate);
        this.f15952k = commentEditText;
        commentEditText.f15799a.add(new bj(this));
        this.f15952k.addTextChangedListener(this.M);
        this.f15952k.setOnKeyListener(new bk(this));
        this.f15953l = (TextView) a2.findViewById(R.id.atf);
        BarrageView barrageView = this.f15954m;
        if (this.A) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        n.a(barrageView, i2);
        if (!this.A) {
            this.f15949h = false;
        }
        this.G = (LinearLayout) a2.findViewById(R.id.avc);
        this.n = (ViewPager) a2.findViewById(R.id.bq7);
        this.o = (ViewGroup) a2.findViewById(R.id.bq5);
        this.p = (LiveButton) a2.findViewById(R.id.bq6);
        this.H = (ViewGroup) a2.findViewById(R.id.bq4);
        this.I = a2.findViewById(R.id.bq0);
        if (getDialog() != null) {
            this.F.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.android.livesdk.chatroom.ui.bg.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(8825);
                }

                public final void onClick(View view) {
                    bg.this.f15947f = a.Close;
                    bg.this.g();
                    if (bg.this.f15944c != null) {
                        bg.this.f15944c.b();
                        try {
                            bg.this.c();
                            bg.this.dismiss();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            });
        }
        return a2;
    }
}
