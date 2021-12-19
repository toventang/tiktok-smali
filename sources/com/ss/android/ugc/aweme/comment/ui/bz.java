package com.ss.android.ugc.aweme.comment.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.widget.Widget;
import com.bytedance.widget.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.o;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.comment.a;
import com.ss.android.ugc.aweme.comment.adapter.ae;
import com.ss.android.ugc.aweme.comment.adapter.b;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.model.CommentAtSummonFriendItem;
import com.ss.android.ugc.aweme.comment.model.CommentAtUser;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.comment.util.w;
import com.ss.android.ugc.aweme.comment.widget.d;
import com.ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget;
import com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget;
import com.ss.android.ugc.aweme.comment.widgets.SearchGifWidgetV2;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.ss.android.ugc.aweme.detail.ui.FadeImageView;
import com.ss.android.ugc.aweme.emoji.emojichoose.c;
import com.ss.android.ugc.aweme.emoji.sysemoji.g;
import com.ss.android.ugc.aweme.emoji.sysemoji.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.an;

public final class bz extends com.ss.android.ugc.aweme.common.f.b implements DialogInterface.OnShowListener, TextWatcher, dd, com.ss.android.ugc.aweme.common.keyboard.c {
    private static final String[] ag = {"😁", "🥰", "😂", "😳", "😏", "😅", "🥺", "😌", "😬", "😊", "😎"};
    LinearLayout A;
    View B;
    ImageView C;
    SmartImageView D;
    TuxTextView E;
    com.ss.android.ugc.aweme.emoji.emojichoose.c F;
    public b G;
    public a H;
    public c I;
    protected boolean J;
    protected boolean K;
    protected int L;
    protected boolean M;
    protected boolean N;
    public boolean O;
    protected int P;
    protected boolean Q = false;
    protected boolean R = false;
    public Aweme S;
    public BaseSearchGifWidget T;
    public com.ss.android.ugc.aweme.comment.a U;
    public boolean V = false;
    com.ss.android.ugc.aweme.comment.b W;
    public CommentVideoModel.Type X = CommentVideoModel.Type.NONE;
    com.bytedance.ies.dmt.ui.tooltip.a Y;
    public GiftViewModel Z = null;

    /* renamed from: a  reason: collision with root package name */
    ConstraintLayout f72648a;
    private boolean aA = true;
    public long aa;
    public com.bytedance.ies.dmt.ui.tooltip.a ab;
    public IVideoGiftService ac = VideoGiftService.l();
    private d ah;
    private bv ai;
    private Pattern aj = Pattern.compile("^\\s*$");
    private ValueAnimator ak;
    private com.ss.android.ugc.aweme.emoji.g.a al;
    private int[] am = null;
    private boolean an = false;
    private CharSequence ao = null;
    private com.ss.android.ugc.aweme.comment.adapter.b ap;
    private Set<String> aq = new HashSet();
    private List<String> ar = new ArrayList();
    private com.ss.android.ugc.aweme.emoji.i.b.a as = new com.ss.android.ugc.aweme.emoji.i.b.a();
    private com.ss.android.ugc.aweme.comment.util.c at = new com.ss.android.ugc.aweme.comment.util.c() {
        /* class com.ss.android.ugc.aweme.comment.ui.bz.AnonymousClass1 */

        static {
            Covode.recordClassIndex(44756);
        }

        @Override // com.ss.android.ugc.aweme.comment.util.c
        public final void a() {
            bz.this.c();
        }
    };
    private CharSequence au;
    private boolean av = true;
    private a aw;
    private View ax = null;
    private View ay = null;
    private boolean az = false;

    /* renamed from: b  reason: collision with root package name */
    FadeImageView f72649b;

    /* renamed from: c  reason: collision with root package name */
    SmartCircleImageView f72650c;

    /* renamed from: d  reason: collision with root package name */
    public MentionEditText f72651d;

    /* renamed from: e  reason: collision with root package name */
    TuxIconView f72652e;

    /* renamed from: f  reason: collision with root package name */
    TuxIconView f72653f;

    /* renamed from: g  reason: collision with root package name */
    FadeImageView f72654g;

    /* renamed from: h  reason: collision with root package name */
    public TuxIconView f72655h;

    /* renamed from: i  reason: collision with root package name */
    View f72656i;

    /* renamed from: j  reason: collision with root package name */
    View f72657j;

    /* renamed from: k  reason: collision with root package name */
    View f72658k;

    /* renamed from: l  reason: collision with root package name */
    CommentAtSearchLayout f72659l;

    /* renamed from: m  reason: collision with root package name */
    View f72660m;
    RemoteImageView n;
    View o;
    AppCompatCheckBox p;
    LinearLayout q;
    ClipLinearLayout r;
    MeasureLinearLayout s;
    ImageView t;
    View u;
    ViewGroup v;
    TextView w;
    RecyclerView x;
    CommentAtSearchLoadingView y;
    TuxTextView z;

    public interface a {
        static {
            Covode.recordClassIndex(44768);
        }

        void a(String str, CharSequence charSequence, String str2, int i2, LogPbBean logPbBean);

        void b(String str, CharSequence charSequence, String str2, int i2, LogPbBean logPbBean);

        void e(String str);
    }

    public interface b {
        static {
            Covode.recordClassIndex(44769);
        }

        void a(int i2, int i3, int i4, String str, String str2, CommentAtSummonFriendItem commentAtSummonFriendItem);

        void a(CommentVideoModel.Type type);

        void a(User user);

        void a(CharSequence charSequence, List<TextExtraStruct> list, com.ss.android.ugc.aweme.emoji.g.a aVar, boolean z, boolean z2);

        void a(String str, int i2);

        void b(User user);

        void b(CharSequence charSequence);

        void b(String str);

        void c(String str);

        void c(boolean z);

        void h();

        int i();
    }

    public interface c {
        static {
            Covode.recordClassIndex(44770);
        }

        void a(com.ss.android.ugc.aweme.emoji.g.a aVar);

        void j();
    }

    private static String d(int i2) {
        return i2 == 2 ? "favorite" : i2 == 3 ? "recent" : "recommend";
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(boolean z2) {
        this.N = z2;
        if (z2) {
            this.f72651d.setFilters(new InputFilter[]{new com.ss.android.ugc.aweme.comment.widget.c(60)});
            bv bvVar = this.ai;
            if (bvVar != null) {
                bvVar.f72637a = 60;
            }
        } else {
            this.f72651d.setFilters(new InputFilter[]{new com.ss.android.ugc.aweme.comment.widget.c(100)});
            bv bvVar2 = this.ai;
            if (bvVar2 != null) {
                bvVar2.f72637a = 100;
            }
        }
        b bVar = this.G;
        if (bVar != null) {
            bVar.c(z2);
        }
    }

    public final boolean a() {
        return this.Q || this.R;
    }

    public final boolean a(String str, String str2, String str3) {
        return this.f72651d.a(str, str2, str3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0151  */
    @Override // com.ss.android.ugc.aweme.common.keyboard.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r10, int r11) {
        /*
        // Method dump skipped, instructions count: 432
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.ui.bz.a(boolean, int):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2, boolean z3) {
        Editable text = this.f72651d.getText();
        if (!TextUtils.isEmpty(this.f72651d.getHint())) {
            this.au = this.f72651d.getHint();
        }
        boolean z4 = false;
        boolean z5 = true;
        if ((text == null || text.length() <= 0) && this.al == null) {
            a aVar = this.aw;
            if (this.X == CommentVideoModel.Type.NONE) {
                z5 = false;
            }
            aVar.a(false, z3, z5);
            this.f72651d.setHint(this.au);
            return;
        }
        a aVar2 = this.aw;
        if (this.X != CommentVideoModel.Type.NONE) {
            z4 = true;
        }
        aVar2.a(true, z2, z4);
    }

    public final void b() {
        this.Q = false;
        this.R = false;
    }

    public final void f() {
        com.ss.android.ugc.aweme.comment.b bVar = this.W;
        if (bVar != null) {
            bVar.a(this.f72651d);
        }
    }

    public final void d() {
        KeyboardUtils.c(this.f72651d);
        dismiss();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j() {
        b bVar;
        if (a() && (bVar = this.G) != null) {
            bVar.b("box");
        }
        a(0);
        b();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void m() {
        com.ss.android.ugc.aweme.comment.b bVar = this.W;
        if (bVar != null) {
            bVar.o = "keyboard_enter";
            this.W.f("keyboard_dialog");
        }
        c();
    }

    static {
        Covode.recordClassIndex(44755);
    }

    private void n() {
        if (this.am == null) {
            int[] iArr = new int[2];
            this.f72651d.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            this.am = iArr2;
            iArr2[0] = iArr[0];
            iArr2[1] = (int) (((float) iArr[1]) + n.b(com.bytedance.ies.ugc.appcontext.d.a(), -15.0f));
        }
    }

    private boolean o() {
        if (getArguments() == null) {
            return false;
        }
        if (getArguments().getInt("viewType") == 1 || getArguments().getInt("viewType") == 2) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (!com.ss.android.ugc.aweme.account.b.g().isLogin() || !this.K) {
            return false;
        }
        if (this.f72651d.getTextExtraStructList() == null || this.f72651d.getTextExtraStructList().size() < 5) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i() {
        if (!this.R) {
            if (this.Q) {
                this.Q = false;
                b(false);
                c(true);
            } else {
                c(0);
            }
            this.R = true;
            com.ss.android.ugc.aweme.comment.b bVar = this.W;
            if (bVar != null) {
                bVar.a("click_gift_icon");
                return;
            }
            return;
        }
        a(0);
        b();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void k() {
        b bVar = this.G;
        if (bVar != null) {
            if (this.Q) {
                bVar.b("icon");
            } else {
                bVar.h();
            }
        }
        if (!this.Q) {
            if (this.R) {
                this.R = false;
                c(false);
                b(true);
            } else {
                c(0);
            }
            this.Q = true;
            return;
        }
        a(0);
        b();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void l() {
        if (this.G != null) {
            this.V = true;
            if (!a()) {
                int selectionStart = this.f72651d.getSelectionStart();
                Editable text = this.f72651d.getText();
                if (text != null) {
                    text.insert(selectionStart, "@");
                    return;
                }
                return;
            }
            this.an = true;
            a(0);
            b();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        f.a.b.b bVar;
        MentionEditText mentionEditText;
        super.onDestroy();
        com.ss.android.ugc.aweme.comment.b bVar2 = this.W;
        if (!(bVar2 == null || (mentionEditText = this.f72651d) == null || !bVar2.p.contains(mentionEditText))) {
            bVar2.p.remove(mentionEditText);
        }
        com.ss.android.ugc.aweme.comment.a aVar = this.U;
        if (!(aVar == null || (bVar = aVar.f71261g.f72889b) == null)) {
            bVar.dispose();
        }
        com.ss.android.ugc.aweme.emoji.emojichoose.c cVar = this.F;
        if (cVar != null) {
            an.b(cVar.f89217i);
            if (cVar.f89218j.f89225c) {
                l.d(cVar, "");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final void onPause() {
        e activity;
        ViewGroup viewGroup;
        MethodCollector.i(4578);
        super.onPause();
        this.s.getKeyBoardObservable().b(this);
        if (!(!com.ss.android.ugc.aweme.comment.d.e.a() || (activity = getActivity()) == null || this.ax == null || (viewGroup = (ViewGroup) activity.findViewById(16908290)) == null)) {
            viewGroup.removeView(this.ax);
        }
        MethodCollector.o(4578);
    }

    @Override // com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.s.getKeyBoardObservable().a(this);
        this.f72651d.requestFocus();
        if (a()) {
            c(200);
        } else if (!com.ss.android.ugc.aweme.comment.d.e.a()) {
            a(200);
        } else if (this.av) {
            this.av = false;
        } else {
            a(0);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        try {
            Window window = getDialog().getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                if (com.ss.android.ugc.aweme.comment.d.e.a()) {
                    attributes.dimAmount = 0.0f;
                    attributes.windowAnimations = 0;
                } else {
                    attributes.dimAmount = 0.15f;
                }
                window.setAttributes(attributes);
            }
        } catch (Exception unused) {
        }
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public final void c() {
        int i2;
        b bVar = this.G;
        if (bVar != null) {
            bVar.a(this.f72651d.getText(), this.f72651d.getTextExtraStructList(), this.al, this.N, false);
            this.as.b();
            com.ss.android.ugc.aweme.emoji.i.b.a aVar = this.as;
            Editable text = this.f72651d.getText();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (!TextUtils.isEmpty(text)) {
                Matcher matcher = com.ss.android.ugc.aweme.emoji.i.b.b.f89350a.matcher(text);
                while (matcher.find()) {
                    String group = matcher.group();
                    if (aVar.a(group)) {
                        Integer num = (Integer) linkedHashMap.get(group);
                        if (num == null || num.intValue() <= 0) {
                            i2 = 1;
                        } else {
                            i2 = Integer.valueOf(num.intValue() + 1);
                        }
                        l.b(group, "");
                        linkedHashMap.put(group, i2);
                    }
                }
            }
            com.ss.android.ugc.aweme.comment.m.b.a(linkedHashMap);
        }
    }

    @Override // androidx.fragment.app.d
    public final void dismiss() {
        this.ai = null;
        ValueAnimator valueAnimator = this.ak;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.ak.cancel();
            this.t.setVisibility(8);
        }
        this.T.n();
        try {
            super.dismiss();
        } catch (IllegalStateException unused) {
            super.dismissAllowingStateLoss();
        }
        c cVar = this.I;
        if (cVar != null) {
            cVar.a(this.al);
        }
        this.al = null;
        if (this.X != CommentVideoModel.Type.NONE) {
            this.f72649b.setVisibility(8);
            if (this.J) {
                this.f72653f.setVisibility(0);
                this.J = false;
            }
            com.bytedance.ies.dmt.ui.tooltip.a aVar = this.Y;
            if (aVar != null) {
                aVar.dismiss();
            }
        }
        if (this.f72651d != null && Build.VERSION.SDK_INT < 23) {
            this.f72651d.setCursorVisible(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.ui.dd
    public final void e() {
        n();
        int height = this.f72657j.getHeight();
        int height2 = this.f72658k.getHeight();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) height);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation.setDuration(300);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, (float) height2, 0.0f);
        translateAnimation2.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation2.setDuration(300);
        translateAnimation.setAnimationListener(new Animation.AnimationListener() {
            /* class com.ss.android.ugc.aweme.comment.ui.bz.AnonymousClass12 */

            static {
                Covode.recordClassIndex(44759);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                bz.this.f72657j.setVisibility(8);
            }
        });
        translateAnimation2.setAnimationListener(new Animation.AnimationListener() {
            /* class com.ss.android.ugc.aweme.comment.ui.bz.AnonymousClass2 */

            static {
                Covode.recordClassIndex(44760);
            }

            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                bz.this.f72658k.setAlpha(1.0f);
                bz.this.f72658k.setVisibility(0);
                bz.this.T.l();
            }
        });
        this.f72657j.startAnimation(translateAnimation);
        this.f72658k.startAnimation(translateAnimation2);
    }

    public final void h() {
        this.T.m();
        int height = this.f72657j.getHeight();
        int height2 = this.f72658k.getHeight();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) height, 0.0f);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation.setDuration(300);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) height2));
        animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animationSet.setDuration(300);
        translateAnimation.setAnimationListener(new Animation.AnimationListener() {
            /* class com.ss.android.ugc.aweme.comment.ui.bz.AnonymousClass3 */

            static {
                Covode.recordClassIndex(44761);
            }

            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                bz.this.f72657j.setVisibility(0);
            }
        });
        animationSet.setAnimationListener(new Animation.AnimationListener() {
            /* class com.ss.android.ugc.aweme.comment.ui.bz.AnonymousClass4 */

            static {
                Covode.recordClassIndex(44762);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                bz.this.f72658k.setAlpha(0.0f);
                bz.this.f72658k.setVisibility(8);
                bz.this.f72651d.requestFocus();
                if (!bz.this.a()) {
                    bz.this.U.a(bz.this.f72651d.getSelectionStart(), bz.this.f72651d.getText());
                    bz.this.f72653f.setIconRes(R.raw.icon_emoji);
                    KeyboardUtils.b(bz.this.f72651d);
                    return;
                }
                bz.this.f72659l.b();
                bz.this.f72653f.setIconRes(R.raw.icon_keyboard_circle);
                KeyboardUtils.c(bz.this.f72651d);
            }
        });
        this.f72657j.startAnimation(translateAnimation);
        this.f72658k.startAnimation(animationSet);
    }

    public final void a(com.ss.android.ugc.aweme.emoji.g.a aVar) {
        this.al = aVar;
        this.W.b(aVar);
    }

    public final void onShow(DialogInterface dialogInterface) {
        c cVar = this.I;
        if (cVar != null) {
            cVar.j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MeasureLinearLayout measureLinearLayout = this.s;
        if (measureLinearLayout != null) {
            measureLinearLayout.a();
        }
    }

    public static String b(com.ss.android.ugc.aweme.emoji.g.a aVar) {
        if (aVar == null || aVar.getAnimateUrl() == null) {
            return "";
        }
        return aVar.getAnimateUrl().getUri();
    }

    private void c(int i2) {
        cj cjVar = new cj(this);
        if (i2 == 0) {
            cjVar.run();
        } else {
            this.f72651d.postDelayed(cjVar, (long) i2);
        }
    }

    public final void afterTextChanged(Editable editable) {
        boolean z2;
        com.ss.android.ugc.aweme.emoji.i.b.b.a(this.f72651d);
        f();
        if (this.f72654g.getVisibility() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        a(z2, true);
    }

    private void b(boolean z2) {
        int i2;
        int i3;
        TuxIconView tuxIconView = this.f72653f;
        if (z2) {
            i2 = R.raw.icon_keyboard_circle;
        } else {
            i2 = R.raw.icon_emoji;
        }
        tuxIconView.setIconRes(i2);
        d dVar = this.ah;
        if (z2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        dVar.a(i3);
    }

    private void c(boolean z2) {
        float f2;
        int i2;
        if (z2) {
            this.f72655h.setIconRes(R.raw.icon_color_gift);
            this.f72655h.a();
        } else {
            this.f72655h.setIconRes(R.raw.icon_gift);
            this.f72655h.setTintColorRes(R.attr.bc);
            TuxIconView tuxIconView = this.f72655h;
            if (o()) {
                f2 = 1.0f;
            } else {
                f2 = 0.5f;
            }
            tuxIconView.setAlpha(f2);
        }
        LinearLayout linearLayout = this.A;
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001d  */
    @Override // androidx.fragment.app.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Dialog onCreateDialog(android.os.Bundle r7) {
        /*
            r6 = this;
            android.app.Dialog r5 = super.onCreateDialog(r7)
            android.view.Window r4 = r5.getWindow()
            android.os.Bundle r3 = r6.getArguments()
            r2 = 19
            r1 = 1
            if (r3 == 0) goto L_0x0038
            java.lang.String r0 = "showEmojiPanel"
            boolean r0 = r3.getBoolean(r0)
            if (r0 == 0) goto L_0x002d
            r6.Q = r1
        L_0x001b:
            if (r4 == 0) goto L_0x0025
            r4.setSoftInputMode(r2)
            r0 = 80
            r4.setGravity(r0)
        L_0x0025:
            r0 = 0
            r5.setCanceledOnTouchOutside(r0)
            r5.setCancelable(r1)
            return r5
        L_0x002d:
            java.lang.String r0 = "showGiftPanel"
            boolean r0 = r3.getBoolean(r0)
            if (r0 == 0) goto L_0x0038
            r6.R = r1
            goto L_0x001b
        L_0x0038:
            r2 = 20
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.ui.bz.onCreateDialog(android.os.Bundle):android.app.Dialog");
    }

    public final void a(int i2) {
        ci ciVar = new ci(this);
        if (i2 == 0) {
            ciVar.run();
        } else {
            this.f72651d.postDelayed(ciVar, (long) i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.ui.dd
    public final void b(int i2) {
        String str;
        a aVar = this.H;
        if (aVar != null) {
            if (i2 == 2) {
                str = "favorite";
            } else if (i2 == 3 || i2 == 4) {
                str = "recommend";
            } else {
                str = "system";
            }
            aVar.e(str);
        }
    }

    @Override // androidx.fragment.app.d, com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (com.ss.android.ugc.aweme.comment.d.e.a()) {
            setStyle(1, R.style.uv);
        } else {
            setStyle(1, R.style.uu);
        }
        GiftViewModel giftViewModel = this.Z;
        if (giftViewModel != null) {
            giftViewModel.d().removeObservers(getActivity());
            this.Z.b().removeObservers(getActivity());
            this.Z.c().removeObservers(getActivity());
            this.Z.d().setValue(-1L);
        }
    }

    public final void a(com.ss.android.ugc.aweme.comment.b bVar) {
        this.W = bVar;
        MentionEditText mentionEditText = this.f72651d;
        if (mentionEditText != null) {
            bVar.b(mentionEditText);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v70, resolved type: java.util.List<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.d, com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        UrlModel animateUrl;
        String str;
        String str2;
        String str3;
        int i8;
        MethodCollector.i(943);
        super.onActivityCreated(bundle);
        if (this.U == null) {
            this.U = new com.ss.android.ugc.aweme.comment.a();
        }
        com.ss.android.ugc.aweme.comment.a aVar = this.U;
        aVar.f71260f = "";
        w wVar = aVar.f71261g;
        a.c cVar = new a.c(aVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        l.d(cVar, "");
        l.d(timeUnit, "");
        t a2 = t.a(new w.c(wVar));
        l.b(a2, "");
        wVar.f72889b = a2.d(300, timeUnit).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new w.d(cVar));
        RecyclerView recyclerView = this.x;
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        com.ss.android.ugc.aweme.comment.adapter.b bVar = new com.ss.android.ugc.aweme.comment.adapter.b(this.S);
        this.ap = bVar;
        this.x.setAdapter(bVar);
        this.z.setOnClickListener(new cn(this));
        com.ss.android.ugc.aweme.comment.a aVar2 = this.U;
        AnonymousClass9 r0 = new a.b() {
            /* class com.ss.android.ugc.aweme.comment.ui.bz.AnonymousClass9 */

            static {
                Covode.recordClassIndex(44767);
            }

            @Override // com.ss.android.ugc.aweme.comment.a.b
            public final void a() {
                bz.this.f72659l.b();
            }

            @Override // com.ss.android.ugc.aweme.comment.a.b
            public final void b() {
                bz.this.z.setVisibility(8);
                bz.this.x.setVisibility(0);
                bz.this.f72659l.a();
            }

            @Override // com.ss.android.ugc.aweme.comment.a.b
            public final void c() {
                bz.this.z.setVisibility(0);
                bz.this.x.setVisibility(8);
            }

            @Override // com.ss.android.ugc.aweme.comment.a.b
            public final void a(boolean z) {
                bz.this.y.a(!z);
                if (z) {
                    bz.this.y.setVisibility(8);
                } else {
                    bz.this.y.setVisibility(0);
                }
            }

            @Override // com.ss.android.ugc.aweme.comment.a.b
            public final boolean a(String str) {
                return TextUtils.equals(str, com.ss.android.ugc.aweme.comment.a.a(bz.this.f72651d.getSelectionStart(), bz.this.f72651d.getEditableText(), true));
            }
        };
        l.d(r0, "");
        aVar2.f71255a = r0;
        com.ss.android.ugc.aweme.comment.a aVar3 = this.U;
        com.ss.android.ugc.aweme.comment.adapter.b bVar2 = this.ap;
        l.d(bVar2, "");
        aVar3.f71256b = bVar2;
        this.ap.a((h.a) new co(this));
        this.ap.f71340a = new b.AbstractC1609b() {
            /* class com.ss.android.ugc.aweme.comment.ui.bz.AnonymousClass10 */

            static {
                Covode.recordClassIndex(44757);
            }

            private static boolean a() {
                try {
                    return f.a.f68431a.c();
                } catch (Exception unused) {
                    return false;
                }
            }

            @Override // com.ss.android.ugc.aweme.comment.adapter.b.AbstractC1609b
            public final void a(User user) {
                if (user != null) {
                    Context context = bz.this.getContext();
                    if (context == null) {
                        context = com.bytedance.ies.ugc.appcontext.d.a();
                    }
                    if (!j.f107226e || !j.b() || j.c()) {
                        j.f107226e = a();
                    }
                    if (!j.f107226e) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.de8).a();
                    } else if (!bz.this.f72659l.f72465b) {
                        bz.this.G.a(user);
                        new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.ci6).a();
                        bz.this.f72651d.setText("");
                        bz.this.d();
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.comment.adapter.b.AbstractC1609b
            public final void a(int i2, CommentAtSummonFriendItem commentAtSummonFriendItem) {
                int i3;
                if (!bz.this.f72659l.f72465b) {
                    if (commentAtSummonFriendItem.isMentionBlocked) {
                        new com.bytedance.tux.g.b(bz.this).e(R.string.d3f).b();
                        return;
                    }
                    bz.this.f72659l.b();
                    Editable text = bz.this.f72651d.getText();
                    int selectionStart = bz.this.f72651d.getSelectionStart();
                    String a2 = com.ss.android.ugc.aweme.comment.a.a(selectionStart, bz.this.f72651d.getText(), false);
                    if (a2 == null) {
                        a2 = "";
                    }
                    if (text != null) {
                        text.delete(selectionStart - a2.length(), selectionStart);
                    }
                    User user = CommentAtUser.Companion.toUser(commentAtSummonFriendItem.mUser);
                    if (user != null) {
                        String nickname = user.getNickname();
                        if (bz.this.a(in.b(user), commentAtSummonFriendItem.mUser.uid, commentAtSummonFriendItem.mUser.secUid)) {
                            b bVar = bz.this.G;
                            int length = a2.length();
                            if (nickname != null) {
                                i3 = nickname.length();
                            } else {
                                i3 = 0;
                            }
                            bVar.a(length, i3, i2 + 1, a2, user.getUid(), commentAtSummonFriendItem);
                            bz.this.G.b(user);
                        } else if (bz.this.getContext() != null) {
                            new com.bytedance.tux.g.b(bz.this).e(R.string.t6).b();
                        }
                    }
                }
            }
        };
        this.f72651d.addTextChangedListener(new o() {
            /* class com.ss.android.ugc.aweme.comment.ui.bz.AnonymousClass11 */

            static {
                Covode.recordClassIndex(44758);
            }

            @Override // com.ss.android.ugc.aweme.base.ui.o
            public final void afterTextChanged(Editable editable) {
                if (bz.this.g() && !bz.this.a() && !bz.this.f72659l.f72466c) {
                    bz.this.U.a(bz.this.f72651d.getSelectionStart(), editable);
                }
                bz.this.f();
            }

            @Override // com.ss.android.ugc.aweme.base.ui.o
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                if (!TextUtils.isEmpty(charSequence) && i4 > 0) {
                    if ('@' == charSequence.toString().charAt((i2 + i4) - 1) && bz.this.g()) {
                        bz.this.f72659l.a();
                        if (bz.this.G != null) {
                            if (bz.this.V) {
                                bz.this.G.c("button");
                            } else {
                                bz.this.G.c("input");
                            }
                            if (bz.this.a()) {
                                bz.this.G.b("icon");
                                bz.this.a(0);
                                bz.this.b();
                            }
                        }
                        bz.this.V = false;
                    } else if (bz.this.f72651d.getTextExtraStructList() != null && bz.this.f72651d.getTextExtraStructList().size() >= 5) {
                        new com.bytedance.tux.g.b(bz.this).e(R.string.d2y).b();
                    }
                }
            }
        });
        this.f72651d.setHighlightColor(androidx.core.content.b.c(getContext(), R.color.f159922f));
        getDialog().getWindow().setLayout(-1, -1);
        getDialog().setOnShowListener(this);
        boolean z5 = false;
        if (com.ss.android.ugc.aweme.comment.d.e.a()) {
            a(0);
        }
        if (getArguments() == null || !getArguments().getBoolean("isCommentDesc", false)) {
            z2 = false;
        } else {
            z2 = true;
        }
        int i9 = 2;
        if (z2 && com.ss.android.ugc.aweme.story.d.a.d(this.S) && com.ss.android.ugc.aweme.story.c.b.a() == 2) {
            this.E.setVisibility(0);
        }
        this.f72654g.setOnClickListener(new cw(this));
        this.f72652e.setOnClickListener(new cx(this));
        this.f72649b.setOnClickListener(new cy(this));
        this.f72653f.setOnClickListener(new cz(this));
        TuxIconView tuxIconView = this.f72653f;
        if (this.Q) {
            i2 = R.raw.icon_keyboard_circle;
        } else {
            i2 = R.raw.icon_emoji;
        }
        tuxIconView.setIconRes(i2);
        d dVar = new d(this.q);
        this.ah = dVar;
        da daVar = new da(this);
        l.d(daVar, "");
        dVar.f73043a = daVar;
        this.f72651d.setMentionTextColor(androidx.core.content.b.c(com.bytedance.ies.ugc.appcontext.d.a(), R.color.bx));
        this.f72651d.setMentionTextTypeface(1);
        this.f72651d.setOnMentionInputListener(new db(this));
        this.f72651d.setOnClickListener(new cc(this));
        this.s.setOnClickListener(new cd(this));
        this.s.findViewById(R.id.ad7).setOnClickListener(ce.f72680a);
        this.p.setOnCheckedChangeListener(new cf(this));
        this.o.setOnClickListener(new cg(this));
        TuxIconView tuxIconView2 = this.f72655h;
        if (this.ac.a(this.S)) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        tuxIconView2.setVisibility(i3);
        if (!this.ac.a(this.S) || !o() || this.Z == null) {
            GiftViewModel giftViewModel = this.Z;
            if (!(giftViewModel == null || giftViewModel.b().getValue() == null)) {
                this.Z.b().setValue(null);
            }
        } else {
            if (this.A != null) {
                Aweme aweme = this.S;
                if (aweme != null) {
                    str = aweme.getGroupId();
                } else {
                    str = "";
                }
                Aweme aweme2 = this.S;
                if (aweme2 != null) {
                    str2 = aweme2.getAuthorUid();
                } else {
                    str2 = "";
                }
                if (getArguments() != null) {
                    str3 = getArguments().getString("enterFrom");
                } else {
                    str3 = "";
                }
                if (!(getActivity() == null || this.S == null || this.Z == null)) {
                    this.A.addView(new com.ss.android.ugc.aweme.comment.gift.b(this, this.A, getActivity(), this.Z, this.at, str3, str, str2).f71813b);
                    LinearLayout linearLayout = this.A;
                    if (this.R) {
                        i8 = 0;
                    } else {
                        i8 = 8;
                    }
                    linearLayout.setVisibility(i8);
                }
            }
            this.Z.e();
            this.Z.b().observe(getActivity(), new cp(this));
            this.Z.d().observe(getActivity(), cq.f72694a);
            this.D.setOnClickListener(new cr(this));
            this.C.setOnClickListener(new cs(this));
        }
        c(this.R);
        if (o()) {
            this.f72655h.setOnClickListener(new ct(this));
        } else {
            this.f72655h.setOnClickListener(new cu(this));
        }
        v a3 = r.a(com.ss.android.ugc.aweme.base.v.a(com.ss.android.ugc.aweme.account.b.g().getCurUser().getAvatarThumb()));
        a3.E = this.f72650c;
        a3.c();
        this.f72650c.setVisibility(0);
        if (com.ss.android.ugc.aweme.comment.d.e.a()) {
            this.ay.setVisibility(0);
            ObjectAnimator.ofFloat(this.ay, "alpha", 0.0f, 1.0f).start();
            WindowManager.LayoutParams attributes = getDialog().getWindow().getAttributes();
            if (!(attributes == null || (attributes.softInputMode & 3) == 0)) {
                ObjectAnimator.ofFloat(this.s, "translationY", (float) n.b(this.s.getContext()), 0.0f).start();
            }
        } else {
            a(false, true);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.an = arguments.getBoolean("clickAt");
            int i10 = arguments.getInt("maxLength");
            this.P = i10;
            if (i10 > 0) {
                this.f72651d.setFilters(new InputFilter[]{new com.ss.android.ugc.aweme.comment.widget.c(this.P)});
            }
            com.ss.android.ugc.aweme.emoji.g.a aVar4 = this.al;
            if (!(aVar4 == null || (animateUrl = aVar4.getAnimateUrl()) == null)) {
                this.f72660m.setVisibility(0);
                this.o.setVisibility(0);
                l.d(aVar4, "");
                int b2 = (int) n.b(com.bytedance.ies.ugc.appcontext.d.a(), 60.0f);
                int[] iArr = (aVar4.getWidth() == 0 || aVar4.getHeight() == 0) ? new int[]{b2, b2} : new int[]{Math.min((aVar4.getWidth() / aVar4.getHeight()) * b2, (int) n.b(com.bytedance.ies.ugc.appcontext.d.a(), 107.0f)), b2};
                this.f72660m.getLayoutParams().width = iArr[0];
                this.f72660m.requestLayout();
                com.ss.android.ugc.aweme.base.e.a(this.n, animateUrl, iArr[0], iArr[1]);
            }
            CharSequence charSequence = arguments.getCharSequence("hint");
            if (charSequence != null) {
                this.f72651d.setHint(charSequence);
                this.f72651d.setMaxLines(1);
                this.f72651d.setEllipsize(TextUtils.TruncateAt.END);
            }
            User user = (User) arguments.getSerializable("user");
            if (user != null) {
                this.f72651d.setHint(com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.fcj, in.a(user)));
                b bVar3 = this.G;
                if (bVar3 != null) {
                    bVar3.b(this.f72651d.getHint());
                }
            }
            this.f72651d.addTextChangedListener(this);
            HashSet hashSet = (HashSet) arguments.getSerializable("atUserSet");
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    User user2 = (User) it.next();
                    a(in.b(user2), user2.getUid(), user2.getSecUid());
                }
            }
            User user3 = (User) arguments.getSerializable("atUser");
            if (user3 != null) {
                a(in.b(user3), user3.getUid(), user3.getSecUid());
            }
            if (com.ss.android.ugc.aweme.comment.d.e.a()) {
                a(false, false);
            } else {
                a(true, true);
            }
            boolean z6 = arguments.getBoolean("showAt");
            TuxIconView tuxIconView3 = this.f72652e;
            if (z6) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            tuxIconView3.setVisibility(i5);
            this.K = z6;
            this.L = arguments.getInt("viewType");
            boolean z7 = arguments.getBoolean("canForward");
            this.M = z7;
            if (!z7 || this.L == 4) {
                z3 = false;
            } else {
                z3 = true;
            }
            AppCompatCheckBox appCompatCheckBox = this.p;
            if (z3) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            appCompatCheckBox.setVisibility(i6);
            if (!this.M || z3) {
                z4 = false;
            } else {
                z4 = true;
            }
            this.N = z4;
            this.p.setTextColor(androidx.core.content.b.c(getContext(), R.color.of));
            if (this.q != null) {
                if (this.ai == null) {
                    this.ai = new bv(this.f72651d, this.P, this);
                }
                com.ss.android.ugc.aweme.emoji.sysemoji.h.f89395e.c();
                c.a aVar5 = new c.a(this.ai, this.q);
                g.a.a();
                if (com.ss.android.ugc.aweme.emoji.sysemoji.h.b(2)) {
                    aVar5.f89219a.f89227e = true;
                    aVar5.f89219a.f89230h.add(5);
                } else {
                    aVar5.f89219a.f89223a = true;
                    aVar5.f89219a.f89230h.add(1);
                }
                aVar5.f89219a.f89229g = 2;
                com.ss.android.ugc.aweme.emoji.emojichoose.c cVar2 = new com.ss.android.ugc.aweme.emoji.emojichoose.c(aVar5.f89220b, aVar5.f89219a, aVar5.f89221c, (byte) 0);
                this.F = cVar2;
                this.q.addView(cVar2.f89109b);
            }
            d dVar2 = this.ah;
            if (this.Q) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            dVar2.a(i7);
            if (this.r != null) {
                if (this.ai == null) {
                    this.ai = new bv(this.f72651d, this.P, this);
                }
                if (this.aq != null && this.ar.size() <= 0) {
                    if (this.aq.size() == 0) {
                        g.a.a();
                        List<i> a4 = g.a(2);
                        if (a4 != null && !a4.isEmpty()) {
                            for (i iVar : a4) {
                                this.aq.add(iVar.getPreviewEmoji());
                            }
                        } else if (this.r.getVisibility() == 0) {
                            this.r.setVisibility(4);
                        }
                    }
                    if (this.aq.size() > 0 && this.ar.size() == 0) {
                        for (Object obj : new ArrayList(Arrays.asList(ag))) {
                            if (this.aq.contains(obj)) {
                                this.ar.add(obj);
                            }
                        }
                    }
                }
                if (this.ar.size() > 0) {
                    int a5 = n.a(getContext());
                    int b3 = (int) n.b(getContext(), 40.0f);
                    int b4 = (int) n.b(getContext(), 4.0f);
                    int b5 = a5 - (((int) n.b(getContext(), 8.0f)) * 2);
                    int i11 = (b5 + b4) / (b4 + b3);
                    if (i11 >= 9) {
                        i9 = 9;
                    } else if (i11 > 0) {
                        i9 = i11;
                    }
                    List<String> list = this.ar;
                    int min = Math.min(i9, list.size());
                    this.r.addView(new com.ss.android.ugc.aweme.emoji.f.b(this.ai, this.r, list.subList(0, min), new com.ss.android.ugc.aweme.emoji.f.c(min, (b5 - (b3 * min)) / (min - 1)), min).f89109b);
                }
            }
            if (!com.ss.android.ugc.aweme.comment.d.e.a()) {
                b(!a(), true);
            }
            if (this.X != CommentVideoModel.Type.NONE) {
                this.f72650c.setVisibility(8);
                this.f72649b.setVisibility(0);
                this.aw.a(false, 1);
                this.aw.b(false, true, false);
                if (this.f72653f.getVisibility() == 0) {
                    z5 = true;
                }
                this.J = z5;
                if (z5) {
                    this.f72653f.setVisibility(8);
                }
            } else {
                this.f72649b.setVisibility(8);
            }
        }
        if (bundle != null) {
            try {
                super.dismiss();
                MethodCollector.o(943);
            } catch (IllegalStateException unused) {
                i4 = 943;
                super.dismissAllowingStateLoss();
            }
        } else {
            i4 = 943;
            MethodCollector.o(i4);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        com.bytedance.widget.c a2 = c.a.a(this, view);
        cm cmVar = new cm(this);
        AnonymousClass5 r3 = new ae() {
            /* class com.ss.android.ugc.aweme.comment.ui.bz.AnonymousClass5 */

            static {
                Covode.recordClassIndex(44763);
            }

            @Override // com.ss.android.ugc.aweme.comment.adapter.ae
            public final void b(com.ss.android.ugc.aweme.emoji.g.a aVar, int i2) {
                bz.this.b("search", bz.b(aVar), i2, aVar.getLogPb());
            }

            @Override // com.ss.android.ugc.aweme.comment.adapter.ae
            public final void a(com.ss.android.ugc.aweme.emoji.g.a aVar, int i2) {
                bz.this.a(aVar);
                bz.this.a("search", bz.b(aVar), i2, aVar.getLogPb());
                bz.this.a(true, true);
                bz.this.h();
            }
        };
        cv cvVar = new cv(this);
        Aweme aweme = this.S;
        if (aweme == null || aweme.getAid() == null) {
            str = "";
        } else {
            str = this.S.getAid();
        }
        if (com.ss.android.ugc.aweme.comment.d.e.a()) {
            this.T = new SearchGifWidgetV2(cmVar, r3, cvVar, str);
        } else {
            this.T = new SearchGifWidget(cmVar, r3, cvVar, str);
        }
        a2.a(R.id.c7s, (Widget) this.T, false);
        com.ss.android.ugc.aweme.comment.b bVar = this.W;
        if (bVar != null) {
            bVar.b(this.f72651d);
            com.ss.android.ugc.aweme.comment.b.a(this.f72651d, (int) R.color.bx);
        }
        if (!j.f72756a) {
            j.f72759d = System.currentTimeMillis();
        }
        if (SettingsManager.a().a("keyboard_show_judge_by_screen_height", true)) {
            this.s.setKeyBoardObservable(new com.ss.android.ugc.aweme.common.keyboard.b());
        }
    }

    private void b(final boolean z2, boolean z3) {
        ValueAnimator ofFloat;
        if (this.r != null && this.ar.size() > 0) {
            int i2 = 0;
            if (z3) {
                this.r.setVisibility(0);
                if (com.ss.android.ugc.aweme.comment.d.e.a()) {
                    this.r.measure(0, 0);
                    int measuredHeight = this.r.getMeasuredHeight();
                    if (z2) {
                        ((ViewGroup.MarginLayoutParams) this.r.getLayoutParams()).bottomMargin = -measuredHeight;
                        this.r.setClipHeight(measuredHeight);
                    } else {
                        ((ViewGroup.MarginLayoutParams) this.r.getLayoutParams()).bottomMargin = 0;
                        this.r.setClipHeight(0);
                    }
                    this.r.requestLayout();
                }
                float[] fArr = {0.0f, 1.0f};
                if (z2) {
                    // fill-array-data instruction
                    fArr[0] = 1.0f;
                    fArr[1] = 0.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                ofFloat.setDuration(150L);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.ss.android.ugc.aweme.comment.ui.bz.AnonymousClass7 */

                    static {
                        Covode.recordClassIndex(44765);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        int measuredHeight = (int) (((float) bz.this.r.getMeasuredHeight()) * floatValue);
                        ((ViewGroup.MarginLayoutParams) bz.this.r.getLayoutParams()).bottomMargin = -measuredHeight;
                        bz.this.r.setAlpha(1.0f - floatValue);
                        bz.this.r.setClipHeight(measuredHeight);
                        bz.this.r.requestLayout();
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    /* class com.ss.android.ugc.aweme.comment.ui.bz.AnonymousClass8 */

                    static {
                        Covode.recordClassIndex(44766);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        int i2;
                        super.onAnimationEnd(animator);
                        ClipLinearLayout clipLinearLayout = bz.this.r;
                        if (z2) {
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                        clipLinearLayout.setVisibility(i2);
                    }
                });
                ofFloat.start();
                return;
            }
            ClipLinearLayout clipLinearLayout = this.r;
            if (!z2) {
                i2 = 8;
            }
            clipLinearLayout.setVisibility(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.ui.dd
    public final void a(String str, int i2) {
        b bVar = this.G;
        if (bVar != null) {
            bVar.a(str, i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.ui.dd
    public final void b(com.ss.android.ugc.aweme.emoji.g.a aVar, int i2, int i3) {
        b(d(i2), b(aVar), i3, aVar.getLogPb());
    }

    public static bz a(int i2, boolean z2, String str) {
        bz bzVar = new bz();
        Bundle bundle = new Bundle();
        bundle.putInt("viewType", i2);
        bundle.putBoolean("canForward", z2);
        bundle.putString("enterFrom", str);
        bzVar.setArguments(bundle);
        return bzVar;
    }

    @Override // com.ss.android.ugc.aweme.comment.ui.dd
    public final void a(com.ss.android.ugc.aweme.emoji.g.a aVar, int i2, int i3) {
        n();
        a(aVar);
        a(d(i2), b(aVar), i3, aVar.getLogPb());
        a(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2;
        if (com.ss.android.ugc.aweme.comment.d.e.a()) {
            a2 = com.a.b.c.a(getActivity(), R.layout.id, viewGroup, false);
        } else {
            a2 = com.a.a(layoutInflater, R.layout.id, viewGroup, false);
        }
        this.f72649b = (FadeImageView) a2.findViewById(R.id.dlj);
        this.f72650c = (SmartCircleImageView) a2.findViewById(R.id.a9v);
        this.f72651d = (MentionEditText) a2.findViewById(R.id.a_7);
        this.f72648a = (ConstraintLayout) a2.findViewById(R.id.a_6);
        this.f72652e = (TuxIconView) a2.findViewById(R.id.btt);
        this.f72653f = (TuxIconView) a2.findViewById(R.id.bwl);
        this.f72655h = (TuxIconView) a2.findViewById(R.id.bx_);
        this.f72654g = (FadeImageView) a2.findViewById(R.id.aa2);
        this.f72656i = a2.findViewById(R.id.c5a);
        this.f72657j = a2.findViewById(R.id.c64);
        this.f72658k = a2.findViewById(R.id.c7s);
        this.f72659l = (CommentAtSearchLayout) a2.findViewById(R.id.a1g);
        this.f72660m = a2.findViewById(R.id.c5w);
        this.n = (RemoteImageView) a2.findViewById(R.id.bal);
        this.o = a2.findViewById(R.id.bam);
        this.p = (AppCompatCheckBox) a2.findViewById(R.id.a35);
        this.q = (LinearLayout) a2.findViewById(R.id.d1k);
        this.r = (ClipLinearLayout) a2.findViewById(R.id.d1l);
        this.s = (MeasureLinearLayout) a2.findViewById(R.id.d0u);
        this.t = (ImageView) a2.findViewById(R.id.ban);
        this.u = a2.findViewById(R.id.c5z);
        this.v = (ViewGroup) a2.findViewById(R.id.a_0);
        this.w = (TextView) a2.findViewById(R.id.ejl);
        this.x = (RecyclerView) a2.findViewById(R.id.drn);
        this.y = (CommentAtSearchLoadingView) a2.findViewById(R.id.ci9);
        this.z = (TuxTextView) a2.findViewById(R.id.ez8);
        this.A = (LinearLayout) a2.findViewById(R.id.bbg);
        this.B = a2.findViewById(R.id.dxy);
        this.C = (ImageView) a2.findViewById(R.id.dkr);
        this.D = (SmartImageView) a2.findViewById(R.id.dxz);
        this.E = (TuxTextView) a2.findViewById(R.id.etv);
        this.ay = a2.findViewById(R.id.qq);
        if (com.ss.android.ugc.aweme.comment.d.e.a()) {
            this.f72656i.setVisibility(4);
            this.f72656i.postDelayed(new cb(this), 500);
        }
        this.f72659l.setVisibilityChangeListener(ca.f72676a);
        this.aw = new a(this.f72648a);
        return a2;
    }

    public static bz a(int i2, boolean z2, String str, Bundle bundle) {
        bz a2 = a(i2, z2, str);
        Bundle arguments = a2.getArguments();
        if (arguments != null) {
            arguments.putAll(bundle);
        }
        return a2;
    }

    public static void a(Aweme aweme, String str, String str2, String str3) {
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str2).a("group_id", ac.e(aweme)).a("author_id", ac.a(aweme));
        if (str3.equals("show_gift_tooltip")) {
            com.ss.android.ugc.aweme.common.r.a("show_gift_tooltip", a2.f66730a);
            return;
        }
        a2.a("enter_method", str);
        com.ss.android.ugc.aweme.common.r.a("dismiss_gift_tooltip", a2.f66730a);
    }

    public final void b(String str, String str2, int i2, LogPbBean logPbBean) {
        a aVar = this.H;
        if (aVar != null) {
            aVar.b(str, this.T.o(), str2, i2, logPbBean);
        }
    }

    public final void a(String str, String str2, int i2, LogPbBean logPbBean) {
        a aVar = this.H;
        if (aVar != null) {
            aVar.a(str, this.T.o(), str2, i2, logPbBean);
        }
    }
}
