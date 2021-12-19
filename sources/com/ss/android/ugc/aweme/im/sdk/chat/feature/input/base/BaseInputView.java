package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.emoji.sysemoji.g;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view.SoftInputResizeFuncLayoutView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view.b;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.top.SafeConversationConfirmation;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.top.ui.ChatTopTip;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.view.SearchableEditText;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ad;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public abstract class BaseInputView implements View.OnClickListener, View.OnTouchListener, b, b.a {

    /* renamed from: a  reason: collision with root package name */
    protected SearchableEditText f100671a;

    /* renamed from: b  reason: collision with root package name */
    protected TuxIconView f100672b;

    /* renamed from: c  reason: collision with root package name */
    protected TuxIconView f100673c;

    /* renamed from: d  reason: collision with root package name */
    protected View f100674d;

    /* renamed from: e  reason: collision with root package name */
    protected SoftInputResizeFuncLayoutView f100675e;

    /* renamed from: f  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a f100676f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f100677g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f100678h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f100679i;

    /* renamed from: j  reason: collision with root package name */
    private b.AbstractC2490b f100680j;

    /* renamed from: k  reason: collision with root package name */
    private final h f100681k = i.a((h.f.a.a) new e(this));

    /* renamed from: l  reason: collision with root package name */
    private b.a f100682l;

    /* renamed from: m  reason: collision with root package name */
    private int f100683m = -1;
    private final h n = i.a((h.f.a.a) new f(this));

    static {
        Covode.recordClassIndex(64402);
    }

    public abstract a.b a(a.b bVar);

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final void a(d dVar) {
        l.d(dVar, "");
    }

    /* access modifiers changed from: protected */
    public final b g() {
        return (b) this.f100681k.getValue();
    }

    public abstract void o();

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public void onPause() {
        c.onPause(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public void onResume() {
        c.onResume(this);
    }

    public abstract void p();

    /* access modifiers changed from: protected */
    public final void a(SearchableEditText searchableEditText) {
        l.d(searchableEditText, "");
        this.f100671a = searchableEditText;
    }

    /* access modifiers changed from: protected */
    public final void a(SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView) {
        l.d(softInputResizeFuncLayoutView, "");
        this.f100675e = softInputResizeFuncLayoutView;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public void a(String str) {
        l.d(str, "");
        if (!TextUtils.isEmpty(str)) {
            l.d(str, "");
            SearchableEditText searchableEditText = this.f100671a;
            if (searchableEditText == null) {
                l.a("editText");
            }
            Editable text = searchableEditText.getText();
            if (text != null && text.length() + str.length() > 6000) {
                Activity activity = null;
                if (1 != 0) {
                    Context i2 = i();
                    while (true) {
                        if (i2 != null) {
                            if (!(i2 instanceof Activity)) {
                                if (!(i2 instanceof ContextWrapper)) {
                                    break;
                                }
                                i2 = ((ContextWrapper) i2).getBaseContext();
                            } else {
                                activity = (Activity) i2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.e.b(activity);
                    return;
                }
            }
            if (this.f100683m == -1) {
                a(-2);
            }
            SearchableEditText searchableEditText2 = this.f100671a;
            if (searchableEditText2 == null) {
                l.a("editText");
            }
            searchableEditText2.a(str);
        }
    }

    public final void a(boolean z) {
        TuxIconView tuxIconView = this.f100672b;
        if (tuxIconView == null) {
            l.a("emojiBtn");
        }
        tuxIconView.setTuxIcon(z ? t() : s());
        TuxIconView tuxIconView2 = this.f100672b;
        if (tuxIconView2 == null) {
            l.a("emojiBtn");
        }
        tuxIconView2.setSelected(z);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final void a(b.a aVar) {
        this.f100682l = aVar;
    }

    static final class f extends m implements h.f.a.a<View.OnKeyListener> {
        final /* synthetic */ BaseInputView this$0;

        static {
            Covode.recordClassIndex(64408);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(BaseInputView baseInputView) {
            super(0);
            this.this$0 = baseInputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View.OnKeyListener invoke() {
            return new View.OnKeyListener(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f100688a;

                static {
                    Covode.recordClassIndex(64409);
                }

                {
                    this.f100688a = r1;
                }

                public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                    if (!l.a(view, this.f100688a.this$0.a()) || i2 != 4) {
                        return false;
                    }
                    l.b(keyEvent, "");
                    if (keyEvent.getAction() == 0) {
                        return this.f100688a.this$0.r();
                    }
                    return false;
                }
            };
        }
    }

    private static com.bytedance.tux.c.a s() {
        return com.bytedance.tux.c.c.a(a.f100684a);
    }

    private static com.bytedance.tux.c.a t() {
        return com.bytedance.tux.c.c.a(b.f100685a);
    }

    static final class e extends m implements h.f.a.a<InputViewDelegate> {
        final /* synthetic */ BaseInputView this$0;

        static {
            Covode.recordClassIndex(64407);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(BaseInputView baseInputView) {
            super(0);
            this.this$0 = baseInputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ InputViewDelegate invoke() {
            BaseInputView baseInputView = this.this$0;
            baseInputView.i();
            return new InputViewDelegate(baseInputView);
        }
    }

    /* access modifiers changed from: protected */
    public final SearchableEditText a() {
        SearchableEditText searchableEditText = this.f100671a;
        if (searchableEditText == null) {
            l.a("editText");
        }
        return searchableEditText;
    }

    /* access modifiers changed from: protected */
    public final TuxIconView b() {
        TuxIconView tuxIconView = this.f100672b;
        if (tuxIconView == null) {
            l.a("emojiBtn");
        }
        return tuxIconView;
    }

    /* access modifiers changed from: protected */
    public final TuxIconView c() {
        TuxIconView tuxIconView = this.f100673c;
        if (tuxIconView == null) {
            l.a("sendBtn");
        }
        return tuxIconView;
    }

    /* access modifiers changed from: protected */
    public final View d() {
        View view = this.f100674d;
        if (view == null) {
            l.a("editLayout");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    public final SoftInputResizeFuncLayoutView e() {
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView = this.f100675e;
        if (softInputResizeFuncLayoutView == null) {
            l.a("inputPanelView");
        }
        return softInputResizeFuncLayoutView;
    }

    /* access modifiers changed from: protected */
    public final com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a f() {
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a aVar = this.f100676f;
        if (aVar == null) {
            l.a("emojiChoosePanelV2");
        }
        return aVar;
    }

    public final boolean h() {
        if (this.f100676f != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final void m() {
        SearchableEditText searchableEditText = this.f100671a;
        if (searchableEditText == null) {
            l.a("editText");
        }
        searchableEditText.setText("");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final void n() {
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView = this.f100675e;
        if (softInputResizeFuncLayoutView == null) {
            l.a("inputPanelView");
        }
        softInputResizeFuncLayoutView.a(-1);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public void onDestroy() {
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a aVar = this.f100676f;
        if (aVar == null) {
            l.a("emojiChoosePanelV2");
        }
        aVar.g();
    }

    static final class d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseInputView f100687a;

        static {
            Covode.recordClassIndex(64406);
        }

        d(BaseInputView baseInputView) {
            this.f100687a = baseInputView;
        }

        public final void onGlobalLayout() {
            if (this.f100687a.d().getVisibility() != 0) {
                this.f100687a.n();
            }
        }
    }

    public final Context i() {
        SearchableEditText searchableEditText = this.f100671a;
        if (searchableEditText == null) {
            l.a("editText");
        }
        Context context = searchableEditText.getContext();
        l.b(context, "");
        return context;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final void l() {
        KeyEvent keyEvent = new KeyEvent(0, 67);
        SearchableEditText searchableEditText = this.f100671a;
        if (searchableEditText == null) {
            l.a("editText");
        }
        if (!searchableEditText.a()) {
            SearchableEditText searchableEditText2 = this.f100671a;
            if (searchableEditText2 == null) {
                l.a("editText");
            }
            searchableEditText2.dispatchKeyEvent(keyEvent);
        }
    }

    public void j() {
        TuxIconView tuxIconView = this.f100673c;
        if (tuxIconView == null) {
            l.a("sendBtn");
        }
        tuxIconView.setOnClickListener(this);
        TuxIconView tuxIconView2 = this.f100672b;
        if (tuxIconView2 == null) {
            l.a("emojiBtn");
        }
        tuxIconView2.setOnClickListener(this);
        SearchableEditText searchableEditText = this.f100671a;
        if (searchableEditText == null) {
            l.a("editText");
        }
        searchableEditText.setFilters(new InputFilter[]{new ad(searchableEditText)});
        searchableEditText.setOnKeyListener((View.OnKeyListener) this.n.getValue());
        searchableEditText.setOnClickListener(this);
        searchableEditText.setOnTouchListener(this);
        searchableEditText.setOnFocusChangeListener(new c(this));
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView = this.f100675e;
        if (softInputResizeFuncLayoutView == null) {
            l.a("inputPanelView");
        }
        softInputResizeFuncLayoutView.setOnPanelChangeListener(this);
        softInputResizeFuncLayoutView.setOnClickListener(this);
        View view = this.f100674d;
        if (view == null) {
            l.a("editLayout");
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new d(this));
    }

    public final void k() {
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView = this.f100675e;
        if (softInputResizeFuncLayoutView == null) {
            l.a("inputPanelView");
        }
        a.b bVar = new a.b(this, softInputResizeFuncLayoutView);
        a.b a2 = a(bVar);
        if (a2 != null) {
            bVar = a2;
        }
        g.a.a();
        if (com.ss.android.ugc.aweme.emoji.sysemoji.h.b(1)) {
            bVar.b();
        } else {
            bVar.a();
        }
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a g2 = bVar.e().g();
        this.f100676f = g2;
        if (g2 == null) {
            l.a("emojiChoosePanelV2");
        }
        g2.a(this);
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView2 = this.f100675e;
        if (softInputResizeFuncLayoutView2 == null) {
            l.a("inputPanelView");
        }
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a aVar = this.f100676f;
        if (aVar == null) {
            l.a("emojiChoosePanelV2");
        }
        softInputResizeFuncLayoutView2.a(aVar.f89109b);
        SearchableEditText searchableEditText = this.f100671a;
        if (searchableEditText == null) {
            l.a("editText");
        }
        softInputResizeFuncLayoutView2.setEditText(searchableEditText);
        softInputResizeFuncLayoutView2.setResizable(true);
    }

    public static final class g implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.a f100689a;

        static {
            Covode.recordClassIndex(64410);
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        g(b.a aVar) {
            this.f100689a = aVar;
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            l.d(charSequence, "");
            b.a aVar = this.f100689a;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(View view) {
        l.d(view, "");
        this.f100674d = view;
    }

    /* access modifiers changed from: protected */
    public final void b(TuxIconView tuxIconView) {
        l.d(tuxIconView, "");
        this.f100673c = tuxIconView;
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f100684a = new a();

        static {
            Covode.recordClassIndex(64403);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_3pt_dm_emoji;
            aVar2.f44754f = true;
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f100685a = new b();

        static {
            Covode.recordClassIndex(64404);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_3pt_keyboard;
            aVar2.f44754f = true;
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(TuxIconView tuxIconView) {
        l.d(tuxIconView, "");
        this.f100672b = tuxIconView;
    }

    public void b(boolean z) {
        if (this.f100677g != z) {
            this.f100677g = z;
            SearchableEditText searchableEditText = this.f100671a;
            if (searchableEditText == null) {
                l.a("editText");
            }
            searchableEditText.setSelected(z);
            TuxIconView tuxIconView = this.f100672b;
            if (tuxIconView == null) {
                l.a("emojiBtn");
            }
            tuxIconView.setActivated(z);
        }
    }

    public void a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        if (this.f100673c == null || this.f100672b == null || this.f100671a == null || this.f100675e == null || this.f100674d == null) {
            throw new Exception("Initialize views inside initViewRefs() method of child class");
        }
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView = this.f100675e;
        if (softInputResizeFuncLayoutView == null) {
            l.a("inputPanelView");
        }
        SearchableEditText searchableEditText = this.f100671a;
        if (searchableEditText == null) {
            l.a("editText");
        }
        softInputResizeFuncLayoutView.setEditText(searchableEditText);
        softInputResizeFuncLayoutView.setResizable(true);
    }

    public void a(int i2) {
        ChatTopTip chatTopTip;
        SafeConversationConfirmation safeConversationConfirmation;
        if (i2 == -2) {
            SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView = this.f100675e;
            if (softInputResizeFuncLayoutView == null) {
                l.a("inputPanelView");
            }
            softInputResizeFuncLayoutView.c();
            o();
        } else if (i2 == -1) {
            n();
            return;
        } else if (i2 == 1) {
            SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView2 = this.f100675e;
            if (softInputResizeFuncLayoutView2 == null) {
                l.a("inputPanelView");
            }
            if (softInputResizeFuncLayoutView2.b() == 1) {
                n();
                return;
            }
            com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a aVar = this.f100676f;
            if (aVar == null) {
                l.a("emojiChoosePanelV2");
            }
            aVar.f();
            SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView3 = this.f100675e;
            if (softInputResizeFuncLayoutView3 == null) {
                l.a("inputPanelView");
            }
            softInputResizeFuncLayoutView3.a(1);
            p();
        } else if (!(i2 == -2 || i2 == 1)) {
            return;
        }
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.e.d()) {
            SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView4 = this.f100675e;
            if (softInputResizeFuncLayoutView4 == null) {
                l.a("inputPanelView");
            }
            Context context = softInputResizeFuncLayoutView4.getContext();
            l.b(context, "");
            while (context != null) {
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity != null && (safeConversationConfirmation = (SafeConversationConfirmation) activity.findViewById(R.id.dcf)) != null && safeConversationConfirmation.getVisibility() == 0) {
                        safeConversationConfirmation.getViewModel().a(1);
                        safeConversationConfirmation.setVisibility(8);
                        return;
                    }
                    return;
                } else if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    return;
                }
            }
        } else if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.e.c()) {
            SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView5 = this.f100675e;
            if (softInputResizeFuncLayoutView5 == null) {
                l.a("inputPanelView");
            }
            Context context2 = softInputResizeFuncLayoutView5.getContext();
            l.b(context2, "");
            while (context2 != null) {
                if (context2 instanceof Activity) {
                    Activity activity2 = (Activity) context2;
                    if (activity2 != null && (chatTopTip = (ChatTopTip) activity2.findViewById(R.id.a50)) != null) {
                        chatTopTip.a();
                        return;
                    }
                    return;
                } else if (context2 instanceof ContextWrapper) {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                } else {
                    return;
                }
            }
        }
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 500)) {
            SearchableEditText searchableEditText = this.f100671a;
            if (searchableEditText == null) {
                l.a("editText");
            }
            if (!l.a(view, searchableEditText)) {
                TuxIconView tuxIconView = this.f100673c;
                if (tuxIconView == null) {
                    l.a("sendBtn");
                }
                if (l.a(view, tuxIconView)) {
                    g().q();
                    return;
                }
                TuxIconView tuxIconView2 = this.f100672b;
                if (tuxIconView2 == null) {
                    l.a("emojiBtn");
                }
                if (l.a(view, tuxIconView2)) {
                    TuxIconView tuxIconView3 = this.f100672b;
                    if (tuxIconView3 == null) {
                        l.a("emojiBtn");
                    }
                    TuxIconView tuxIconView4 = this.f100672b;
                    if (tuxIconView4 == null) {
                        l.a("emojiBtn");
                    }
                    tuxIconView3.setSelected(!tuxIconView4.isSelected());
                    TuxIconView tuxIconView5 = this.f100672b;
                    if (tuxIconView5 == null) {
                        l.a("emojiBtn");
                    }
                    if (tuxIconView5.isSelected()) {
                        a(1);
                    } else {
                        a(-2);
                    }
                    TuxIconView tuxIconView6 = this.f100672b;
                    if (tuxIconView6 == null) {
                        l.a("emojiBtn");
                    }
                    a(tuxIconView6.isSelected());
                }
            } else if (this.f100679i) {
                a(false);
                a(-2);
            } else {
                this.f100679i = true;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final void a(b.a aVar) {
        SearchableEditText searchableEditText = this.f100671a;
        if (searchableEditText == null) {
            l.a("editText");
        }
        searchableEditText.addTextChangedListener(new g(aVar));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final void a(b.AbstractC2490b bVar) {
        this.f100680j = bVar;
    }

    static final class c implements View.OnFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseInputView f100686a;

        static {
            Covode.recordClassIndex(64405);
        }

        c(BaseInputView baseInputView) {
            this.f100686a = baseInputView;
        }

        public final void onFocusChange(View view, boolean z) {
            if (!z) {
                this.f100686a.n();
            }
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        l.d(view, "");
        l.d(motionEvent, "");
        SearchableEditText searchableEditText = this.f100671a;
        if (searchableEditText == null) {
            l.a("editText");
        }
        if (l.a(view, searchableEditText) && motionEvent.getAction() == 1 && !this.f100678h) {
            a(false);
            a(-2);
            this.f100678h = true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (r5 == -1) goto L_0x000c;
     */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view.b.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r5, android.view.View r6) {
        /*
            r4 = this;
            r3 = -2
            r1 = -1
            r0 = 1
            r2 = 0
            if (r5 == r3) goto L_0x0042
            if (r5 == r1) goto L_0x0023
            if (r5 == r0) goto L_0x001f
            if (r5 != r1) goto L_0x000e
        L_0x000c:
            r2 = 8
        L_0x000e:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b$b r0 = r4.f100680j
            if (r0 == 0) goto L_0x0015
            r0.a(r2)
        L_0x0015:
            r4.f100683m = r5
            com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view.b$a r0 = r4.f100682l
            if (r0 == 0) goto L_0x001e
            r0.a(r5, r6)
        L_0x001e:
            return
        L_0x001f:
            r4.b(r0)
            goto L_0x000e
        L_0x0023:
            com.bytedance.tux.icon.TuxIconView r1 = r4.f100672b
            if (r1 != 0) goto L_0x002c
            java.lang.String r0 = "emojiBtn"
            h.f.b.l.a(r0)
        L_0x002c:
            boolean r0 = r1.isSelected()
            if (r0 == 0) goto L_0x0035
            r4.a(r2)
        L_0x0035:
            r4.b(r2)
            com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a r0 = r4.f100676f
            if (r0 != 0) goto L_0x000c
            java.lang.String r0 = "emojiChoosePanelV2"
            h.f.b.l.a(r0)
            goto L_0x000c
        L_0x0042:
            r4.b(r0)
            r4.a(r2)
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView.a(int, android.view.View):void");
    }
}
