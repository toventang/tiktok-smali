package com.ss.android.ugc.aweme.im.sdk.chat.feature.story;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.ies.im.core.api.b.g;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.o;
import com.ss.android.ugc.aweme.emoji.sysemoji.g;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.EmojiContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStoryContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputViewDelegate;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view.SoftInputResizeFuncLayoutView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view.b;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.view.SearchableEditText;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.u;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public final class StoryInputView implements com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.a, com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b, b.a {

    /* renamed from: g  reason: collision with root package name */
    public static final String f101028g = StoryInputView.class.getSimpleName();

    /* renamed from: h  reason: collision with root package name */
    public static final a f101029h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public SearchableEditText f101030a;

    /* renamed from: b  reason: collision with root package name */
    public TuxIconView f101031b;

    /* renamed from: c  reason: collision with root package name */
    public TuxIconView f101032c;

    /* renamed from: d  reason: collision with root package name */
    public View f101033d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a f101034e;

    /* renamed from: f  reason: collision with root package name */
    public final ViewGroup f101035f;

    /* renamed from: i  reason: collision with root package name */
    private final ViewGroup f101036i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f101037j = h.i.a((h.f.a.a) new f(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f101038k = h.i.a((h.f.a.a) new b(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h f101039l = h.i.a((h.f.a.a) new l(this));

    /* renamed from: m  reason: collision with root package name */
    private final h.h f101040m = h.i.a((h.f.a.a) new c(this));
    private com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.b n;
    private SoftInputResizeFuncLayoutView o;
    private b.AbstractC2490b p;
    private final h.h q = h.i.a((h.f.a.a) new g(this));
    private final h.h r = h.i.a((h.f.a.a) new h(this));
    private final h.h s = h.i.a((h.f.a.a) new m(this));
    private int t = 4;
    private int u = -1;
    private boolean v = true;
    private boolean w = true;
    private boolean x;
    private final com.ss.android.ugc.aweme.im.sdk.chat.data.a y;
    private final ShareStoryContent z;

    private final int f() {
        return ((Number) this.f101038k.getValue()).intValue();
    }

    private final int g() {
        return ((Number) this.f101039l.getValue()).intValue();
    }

    private final int h() {
        return ((Number) this.f101040m.getValue()).intValue();
    }

    private final View.OnClickListener i() {
        return (View.OnClickListener) this.q.getValue();
    }

    private final TextWatcher j() {
        return (TextWatcher) this.s.getValue();
    }

    public final com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b a() {
        return (com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b) this.f101037j.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.a
    public final void a(ai aiVar) {
        h.f.b.l.d(aiVar, "");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final void a(com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.d dVar) {
        h.f.b.l.d(dVar, "");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final void a(b.a aVar) {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final void onPause() {
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.c.onPause(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final void onResume() {
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.c.onResume(this);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64626);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final void a(String str) {
        h.f.b.l.d(str, "");
        if (!TextUtils.isEmpty(str)) {
            SearchableEditText searchableEditText = this.f101030a;
            if (searchableEditText == null) {
                h.f.b.l.a("editText");
            }
            Editable text = searchableEditText.getText();
            if (text == null || text.length() + str.length() <= 6000) {
                if (this.u == -1) {
                    a(-2);
                }
                SearchableEditText searchableEditText2 = this.f101030a;
                if (searchableEditText2 == null) {
                    h.f.b.l.a("editText");
                }
                searchableEditText2.a(str);
                return;
            }
            new com.bytedance.tux.g.b(this.f101036i).e(R.string.cfv).b();
        }
    }

    public final void a(boolean z2) {
        TuxIconView tuxIconView = this.f101032c;
        if (tuxIconView == null) {
            h.f.b.l.a("sendBtn");
        }
        boolean isActivated = tuxIconView.isActivated();
        TuxIconView tuxIconView2 = this.f101032c;
        if (tuxIconView2 == null) {
            h.f.b.l.a("sendBtn");
        }
        tuxIconView2.setActivated(z2);
        TuxIconView tuxIconView3 = this.f101032c;
        if (tuxIconView3 == null) {
            h.f.b.l.a("sendBtn");
        }
        tuxIconView3.setTintColorRes(z2 ? R.attr.ay : R.attr.bd);
        if (z2 && !isActivated) {
            TuxIconView tuxIconView4 = this.f101032c;
            if (tuxIconView4 == null) {
                h.f.b.l.a("sendBtn");
            }
            com.ss.android.ugc.aweme.im.sdk.common.ui.widget.a.b.a(tuxIconView4);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(List<? extends com.ss.android.ugc.aweme.emoji.g.a> list) {
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.b bVar = this.n;
        if (bVar == null) {
            h.f.b.l.a("emojiSearchView");
        }
        bVar.a(list);
    }

    static final class g extends h.f.b.m implements h.f.a.a<View.OnClickListener> {
        final /* synthetic */ StoryInputView this$0;

        static {
            Covode.recordClassIndex(64632);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(StoryInputView storyInputView) {
            super(0);
            this.this$0 = storyInputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View.OnClickListener invoke() {
            return new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.story.StoryInputView.g.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f101043a;

                static {
                    Covode.recordClassIndex(64633);
                }

                {
                    this.f101043a = r1;
                }

                public final void onClick(View view) {
                    androidx.fragment.app.e eVar;
                    Activity activity;
                    ClickAgent.onClick(view);
                    h.f.b.l.d(view, "");
                    if (!u.a(view, 500)) {
                        if (h.f.b.l.a(view, StoryInputView.a(this.f101043a.this$0))) {
                            String str = StoryInputView.f101028g;
                            h.f.b.l.b(str, "");
                            com.ss.android.ugc.aweme.im.service.m.a.b(str, "on edit text click");
                            this.f101043a.this$0.e();
                            this.f101043a.this$0.a(-2);
                            return;
                        }
                        TuxIconView tuxIconView = this.f101043a.this$0.f101032c;
                        if (tuxIconView == null) {
                            h.f.b.l.a("sendBtn");
                        }
                        if (h.f.b.l.a(view, tuxIconView)) {
                            String str2 = StoryInputView.f101028g;
                            h.f.b.l.b(str2, "");
                            com.ss.android.ugc.aweme.im.service.m.a.b(str2, "on send button click");
                            this.f101043a.this$0.a().q();
                        } else if (h.f.b.l.a(view, StoryInputView.b(this.f101043a.this$0))) {
                            String str3 = StoryInputView.f101028g;
                            h.f.b.l.b(str3, "");
                            com.ss.android.ugc.aweme.im.service.m.a.b(str3, "on emoji button click");
                            StoryInputView.b(this.f101043a.this$0).setSelected(!StoryInputView.b(this.f101043a.this$0).isSelected());
                            if (StoryInputView.b(this.f101043a.this$0).isSelected()) {
                                StoryInputView.b(this.f101043a.this$0).setIconRes(R.raw.icon_3pt_keyboard);
                                StoryInputView.b(this.f101043a.this$0).setTintColor(R.attr.bc);
                                this.f101043a.this$0.a(1);
                                return;
                            }
                            this.f101043a.this$0.e();
                            this.f101043a.this$0.a(-2);
                        } else if (h.f.b.l.a(view, this.f101043a.this$0.f101034e.e())) {
                            String str4 = StoryInputView.f101028g;
                            h.f.b.l.b(str4, "");
                            com.ss.android.ugc.aweme.im.service.m.a.b(str4, "on gif emoji click");
                            boolean c2 = this.f101043a.this$0.c();
                            if (c2) {
                                new com.bytedance.tux.g.b(view).e(R.string.b9n).b();
                            } else if (!c2) {
                                Context b2 = this.f101043a.this$0.b();
                                while (true) {
                                    eVar = null;
                                    if (b2 != null) {
                                        if (!(b2 instanceof Activity)) {
                                            if (!(b2 instanceof ContextWrapper)) {
                                                break;
                                            }
                                            b2 = ((ContextWrapper) b2).getBaseContext();
                                        } else {
                                            activity = (Activity) b2;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                activity = null;
                                if (activity instanceof androidx.fragment.app.e) {
                                    eVar = activity;
                                }
                                androidx.fragment.app.e eVar2 = eVar;
                                if (eVar2 != null) {
                                    a.c.a(eVar2, new q<View, com.ss.android.ugc.aweme.emoji.b.a, Integer, z>(this) {
                                        /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.story.StoryInputView.g.AnonymousClass1.AnonymousClass1 */
                                        final /* synthetic */ AnonymousClass1 this$0;

                                        static {
                                            Covode.recordClassIndex(64634);
                                        }

                                        {
                                            this.this$0 = r2;
                                        }

                                        /* Return type fixed from 'java.lang.Object' to match base method */
                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                                        @Override // h.f.a.q
                                        public final /* synthetic */ z invoke(View view, com.ss.android.ugc.aweme.emoji.b.a aVar, Integer num) {
                                            com.ss.android.ugc.aweme.emoji.b.a aVar2 = aVar;
                                            num.intValue();
                                            h.f.b.l.d(view, "");
                                            h.f.b.l.d(aVar2, "");
                                            com.ss.android.ugc.aweme.emoji.g.a aVar3 = aVar2.f89106d;
                                            h.f.b.l.b(aVar3, "");
                                            com.ss.android.ugc.aweme.emoji.d.a.b.a(aVar3);
                                            this.this$0.f101043a.this$0.a().a(aVar2);
                                            return z.f158842a;
                                        }
                                    });
                                }
                            }
                        }
                    }
                }
            };
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<View.OnKeyListener> {
        final /* synthetic */ StoryInputView this$0;

        static {
            Covode.recordClassIndex(64635);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(StoryInputView storyInputView) {
            super(0);
            this.this$0 = storyInputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View.OnKeyListener invoke() {
            return new View.OnKeyListener(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.story.StoryInputView.h.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h f101044a;

                static {
                    Covode.recordClassIndex(64636);
                }

                {
                    this.f101044a = r1;
                }

                public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                    if (!h.f.b.l.a(view, StoryInputView.a(this.f101044a.this$0)) || i2 != 4) {
                        return false;
                    }
                    h.f.b.l.b(keyEvent, "");
                    if (keyEvent.getAction() == 0) {
                        return this.f101044a.this$0.r();
                    }
                    return false;
                }
            };
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ StoryInputView this$0;

        static {
            Covode.recordClassIndex(64641);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(StoryInputView storyInputView) {
            super(0);
            this.this$0 = storyInputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new o(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.story.StoryInputView.m.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ m f101048a;

                static {
                    Covode.recordClassIndex(64642);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f101048a = r1;
                }

                @Override // com.ss.android.ugc.aweme.base.ui.o
                public final void afterTextChanged(Editable editable) {
                    int i2;
                    boolean z;
                    h.f.b.l.d(editable, "");
                    String obj = editable.toString();
                    int length = obj.length() - 1;
                    int i3 = 0;
                    boolean z2 = false;
                    while (i3 <= length) {
                        if (!z2) {
                            i2 = i3;
                        } else {
                            i2 = length;
                        }
                        if (h.f.b.l.a(obj.charAt(i2), 32) <= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z2) {
                            if (!z) {
                                break;
                            }
                            length--;
                        } else if (!z) {
                            z2 = true;
                        } else {
                            i3++;
                        }
                    }
                    if (TextUtils.isEmpty(obj.subSequence(i3, length + 1).toString())) {
                        this.f101048a.this$0.f101034e.a(false);
                        this.f101048a.this$0.a(false);
                    } else {
                        this.f101048a.this$0.f101034e.a(true);
                        this.f101048a.this$0.a(true);
                    }
                    this.f101048a.this$0.d();
                }

                @Override // com.ss.android.ugc.aweme.base.ui.o
                public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    h.f.b.l.d(charSequence, "");
                    Object tag = StoryInputView.a(this.f101048a.this$0).getTag(R.id.v);
                    if (!(tag instanceof CharSequence)) {
                        tag = null;
                    }
                    CharSequence charSequence2 = (CharSequence) tag;
                    if (charSequence2 == null || !TextUtils.equals(charSequence2, charSequence)) {
                        StoryInputView storyInputView = this.f101048a.this$0;
                        if (com.ss.android.ugc.aweme.emoji.systembigemoji.a.b()) {
                            return;
                        }
                        if (TextUtils.isEmpty(charSequence)) {
                            storyInputView.a((List<? extends com.ss.android.ugc.aweme.emoji.g.a>) null);
                        } else {
                            storyInputView.a(com.ss.android.ugc.aweme.emoji.systembigemoji.a.a(charSequence.toString()));
                        }
                    } else {
                        StoryInputView.a(this.f101048a.this$0).setTag(R.id.v, null);
                    }
                }
            };
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<InputViewDelegate> {
        final /* synthetic */ StoryInputView this$0;

        static {
            Covode.recordClassIndex(64631);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(StoryInputView storyInputView) {
            super(0);
            this.this$0 = storyInputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ InputViewDelegate invoke() {
            StoryInputView storyInputView = this.this$0;
            storyInputView.b();
            return new InputViewDelegate(storyInputView);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final void m() {
        SearchableEditText searchableEditText = this.f101030a;
        if (searchableEditText == null) {
            h.f.b.l.a("editText");
        }
        searchableEditText.setText("");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final void n() {
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView = this.o;
        if (softInputResizeFuncLayoutView == null) {
            h.f.b.l.a("inputPanelView");
        }
        softInputResizeFuncLayoutView.a(-1);
    }

    static final class b extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ StoryInputView this$0;

        static {
            Covode.recordClassIndex(64627);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(StoryInputView storyInputView) {
            super(0);
            this.this$0 = storyInputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(androidx.core.content.a.f.b(this.this$0.b().getResources(), R.color.c5, null));
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ StoryInputView this$0;

        static {
            Covode.recordClassIndex(64628);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(StoryInputView storyInputView) {
            super(0);
            this.this$0 = storyInputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(androidx.core.content.a.f.b(this.this$0.b().getResources(), R.color.c5, null));
        }
    }

    static final class e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryInputView f101042a;

        static {
            Covode.recordClassIndex(64630);
        }

        e(StoryInputView storyInputView) {
            this.f101042a = storyInputView;
        }

        public final void onGlobalLayout() {
            View view = this.f101042a.f101033d;
            if (view == null) {
                h.f.b.l.a("editLayout");
            }
            if (view.getVisibility() != 0) {
                this.f101042a.n();
            }
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ StoryInputView this$0;

        static {
            Covode.recordClassIndex(64640);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(StoryInputView storyInputView) {
            super(0);
            this.this$0 = storyInputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(androidx.core.content.a.f.b(this.this$0.b().getResources(), R.color.bx, null));
        }
    }

    static {
        Covode.recordClassIndex(64625);
    }

    private void k() {
        SearchableEditText searchableEditText = this.f101030a;
        if (searchableEditText == null) {
            h.f.b.l.a("editText");
        }
        searchableEditText.setVisibility(0);
        this.t = 4;
    }

    public final Context b() {
        Context context = this.f101036i.getContext();
        h.f.b.l.b(context, "");
        return context;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final void onDestroy() {
        String str = f101028g;
        h.f.b.l.b(str, "");
        com.ss.android.ugc.aweme.im.service.m.a.b(str, "onDestroy");
        this.f101034e.g();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final boolean r() {
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView = this.o;
        if (softInputResizeFuncLayoutView == null) {
            h.f.b.l.a("inputPanelView");
        }
        if (softInputResizeFuncLayoutView.a()) {
            n();
        }
        return false;
    }

    public final void d() {
        if (!this.w) {
            SearchableEditText searchableEditText = this.f101030a;
            if (searchableEditText == null) {
                h.f.b.l.a("editText");
            }
            searchableEditText.setVisibility(8);
        }
        if (!this.v) {
            TuxIconView tuxIconView = this.f101031b;
            if (tuxIconView == null) {
                h.f.b.l.a("emojiBtn");
            }
            tuxIconView.setVisibility(8);
        }
    }

    public final void e() {
        TuxIconView tuxIconView = this.f101031b;
        if (tuxIconView == null) {
            h.f.b.l.a("emojiBtn");
        }
        tuxIconView.setIconRes(R.raw.icon_3pt_dm_emoji);
        TuxIconView tuxIconView2 = this.f101031b;
        if (tuxIconView2 == null) {
            h.f.b.l.a("emojiBtn");
        }
        tuxIconView2.setTintColor(R.attr.bc);
        TuxIconView tuxIconView3 = this.f101031b;
        if (tuxIconView3 == null) {
            h.f.b.l.a("emojiBtn");
        }
        tuxIconView3.setSelected(false);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final void l() {
        KeyEvent keyEvent = new KeyEvent(0, 67);
        SearchableEditText searchableEditText = this.f101030a;
        if (searchableEditText == null) {
            h.f.b.l.a("editText");
        }
        if (!searchableEditText.a()) {
            SearchableEditText searchableEditText2 = this.f101030a;
            if (searchableEditText2 == null) {
                h.f.b.l.a("editText");
            }
            searchableEditText2.dispatchKeyEvent(keyEvent);
        }
    }

    public final boolean c() {
        if ((this.y.isAuthorSupporterChat() && com.ss.android.ugc.aweme.im.sdk.chat.b.c.a.b()) || this.y.isGroupChat()) {
            return false;
        }
        IMUser a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.a(String.valueOf(b.a.c(this.y.getConversationId())), com.ss.android.ugc.aweme.im.sdk.common.controller.e.c.a(this.y.getConversationId()));
        if (a2 == null) {
            return true;
        }
        if (a2.getFollowStatus() == 2 || com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a(a2)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final void q() {
        String str;
        String str2;
        String str3;
        ShareStoryContent shareStoryContent;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        long currentTimeMillis = System.currentTimeMillis();
        SearchableEditText searchableEditText = this.f101030a;
        if (searchableEditText == null) {
            h.f.b.l.a("editText");
        }
        Editable text = searchableEditText.getText();
        if (text != null) {
            h.f.b.l.b(text, "");
            String obj = text.toString();
            int length = obj.length() - 1;
            int i4 = 0;
            boolean z4 = false;
            while (i4 <= length) {
                if (!z4) {
                    i3 = i4;
                } else {
                    i3 = length;
                }
                if (h.f.b.l.a(obj.charAt(i3), 32) <= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z4) {
                    if (!z3) {
                        break;
                    }
                    length--;
                } else if (!z3) {
                    z4 = true;
                } else {
                    i4++;
                }
            }
            if (TextUtils.isEmpty(obj.subSequence(i4, length + 1).toString())) {
                SearchableEditText searchableEditText2 = this.f101030a;
                if (searchableEditText2 == null) {
                    h.f.b.l.a("editText");
                }
                new com.bytedance.tux.g.b(searchableEditText2).e(R.string.cg6).b();
            } else if (text.length() > 6000) {
                SearchableEditText searchableEditText3 = this.f101030a;
                if (searchableEditText3 == null) {
                    h.f.b.l.a("editText");
                }
                new com.bytedance.tux.g.b(searchableEditText3).a(com.bytedance.ies.ugc.appcontext.d.a().getResources().getString(R.string.cfv)).b();
            } else {
                TextContent.Companion companion = TextContent.Companion;
                String obj2 = text.toString();
                int length2 = obj2.length() - 1;
                int i5 = 0;
                boolean z5 = false;
                while (i5 <= length2) {
                    if (!z5) {
                        i2 = i5;
                    } else {
                        i2 = length2;
                    }
                    if (h.f.b.l.a(obj2.charAt(i2), 32) <= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z5) {
                        if (!z2) {
                            break;
                        }
                        length2--;
                    } else if (!z2) {
                        z5 = true;
                    } else {
                        i5++;
                    }
                }
                TextContent obtain = companion.obtain(obj2.subSequence(i5, length2 + 1).toString());
                obtain.setSendStartTime(Long.valueOf(currentTimeMillis));
                com.ss.android.ugc.aweme.im.sdk.common.controller.g.a.a(this.y.getConversationId(), obtain);
                ArrayList arrayList = new ArrayList();
                String conversationId = this.y.getConversationId();
                ShareStoryContent shareStoryContent2 = this.z;
                if (shareStoryContent2 == null || (str = shareStoryContent2.getItemId()) == null) {
                    str = "";
                }
                if (!b.b(conversationId, str) && (shareStoryContent = this.z) != null) {
                    String conversationId2 = this.y.getConversationId();
                    String itemId = shareStoryContent.getItemId();
                    h.f.b.l.b(itemId, "");
                    b.a(conversationId2, itemId);
                    arrayList.add(shareStoryContent);
                }
                arrayList.add(obtain);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ShareStoryContent shareStoryContent3 = this.z;
                if (shareStoryContent3 == null || (str2 = shareStoryContent3.getItemId()) == null) {
                    str2 = "";
                }
                linkedHashMap.put("from_group_id", str2);
                ShareStoryContent shareStoryContent4 = this.z;
                if (shareStoryContent4 == null || (str3 = shareStoryContent4.getStoryCollectionId()) == null) {
                    str3 = "";
                }
                linkedHashMap.put("from_story_collection_id", str3);
                g.a.a().b(this.y.getConversationId()).a(arrayList).a(linkedHashMap).a(new j(this));
                SearchableEditText searchableEditText4 = this.f101030a;
                if (searchableEditText4 == null) {
                    h.f.b.l.a("editText");
                }
                searchableEditText4.setText("");
            }
        }
    }

    public static final class i implements com.bytedance.ies.im.core.api.b.a.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryInputView f101045a;

        static {
            Covode.recordClassIndex(64637);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(StoryInputView storyInputView) {
            this.f101045a = storyInputView;
        }

        @Override // com.bytedance.ies.im.core.api.b.a.e
        public final void a(ai aiVar) {
            String str = StoryInputView.f101028g;
            h.f.b.l.b(str, "");
            com.ss.android.ugc.aweme.im.service.m.a.b(str, "sendBigEmoji onSendSuccess: ".concat(String.valueOf(aiVar)));
            if (aiVar == null || aiVar.getMsgType() != 1025) {
                new com.bytedance.tux.g.b(this.f101045a.f101035f).e(R.string.hj).b();
            }
        }

        @Override // com.bytedance.ies.im.core.api.b.a.e
        public final void a(ai aiVar, com.bytedance.im.core.d.u uVar) {
            String str = StoryInputView.f101028g;
            h.f.b.l.b(str, "");
            com.ss.android.ugc.aweme.im.service.m.a.b(str, "sendBigEmoji onSendFailure: ".concat(String.valueOf(uVar)));
            if (aiVar == null || aiVar.getMsgType() != 1025) {
                new com.bytedance.tux.g.b(this.f101045a.f101035f).e(R.string.hk).b();
            }
        }
    }

    public static final class j implements com.bytedance.ies.im.core.api.b.a.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryInputView f101046a;

        static {
            Covode.recordClassIndex(64638);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(StoryInputView storyInputView) {
            this.f101046a = storyInputView;
        }

        @Override // com.bytedance.ies.im.core.api.b.a.e
        public final void a(ai aiVar) {
            String str = StoryInputView.f101028g;
            h.f.b.l.b(str, "");
            com.ss.android.ugc.aweme.im.service.m.a.b(str, "sendMsg onSendSuccess onSendSuccess: ".concat(String.valueOf(aiVar)));
            if (aiVar == null || aiVar.getMsgType() != 1025) {
                new com.bytedance.tux.g.b(this.f101046a.f101035f).e(R.string.hj).b();
            }
        }

        @Override // com.bytedance.ies.im.core.api.b.a.e
        public final void a(ai aiVar, com.bytedance.im.core.d.u uVar) {
            String str = StoryInputView.f101028g;
            h.f.b.l.b(str, "");
            com.ss.android.ugc.aweme.im.service.m.a.b(str, "sendMsg onSendFailed onSendSuccess: ".concat(String.valueOf(aiVar)));
            if (aiVar == null || aiVar.getMsgType() != 1025) {
                new com.bytedance.tux.g.b(this.f101046a.f101035f).e(R.string.hk).b();
            }
        }
    }

    public static final class k extends o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.a f101047a;

        static {
            Covode.recordClassIndex(64639);
        }

        k(b.a aVar) {
            this.f101047a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.base.ui.o
        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            h.f.b.l.d(charSequence, "");
            this.f101047a.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.a
    public final void b(int i2) {
        this.f101036i.setVisibility(i2);
    }

    public static final /* synthetic */ SearchableEditText a(StoryInputView storyInputView) {
        SearchableEditText searchableEditText = storyInputView.f101030a;
        if (searchableEditText == null) {
            h.f.b.l.a("editText");
        }
        return searchableEditText;
    }

    public static final /* synthetic */ TuxIconView b(StoryInputView storyInputView) {
        TuxIconView tuxIconView = storyInputView.f101031b;
        if (tuxIconView == null) {
            h.f.b.l.a("emojiBtn");
        }
        return tuxIconView;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final void a(b.a aVar) {
        h.f.b.l.d(aVar, "");
        SearchableEditText searchableEditText = this.f101030a;
        if (searchableEditText == null) {
            h.f.b.l.a("editText");
        }
        searchableEditText.addTextChangedListener(new k(aVar));
    }

    private final void b(boolean z2) {
        int h2;
        if (this.x != z2) {
            this.x = z2;
            SearchableEditText searchableEditText = this.f101030a;
            if (searchableEditText == null) {
                h.f.b.l.a("editText");
            }
            if (z2) {
                h2 = f();
            } else {
                h2 = h();
            }
            searchableEditText.setHintTextColor(h2);
            SearchableEditText searchableEditText2 = this.f101030a;
            if (searchableEditText2 == null) {
                h.f.b.l.a("editText");
            }
            searchableEditText2.setTextColor(g());
            SearchableEditText searchableEditText3 = this.f101030a;
            if (searchableEditText3 == null) {
                h.f.b.l.a("editText");
            }
            searchableEditText3.setSelected(z2);
            TuxIconView tuxIconView = this.f101031b;
            if (tuxIconView == null) {
                h.f.b.l.a("emojiBtn");
            }
            tuxIconView.setActivated(z2);
            if (z2) {
                k();
            }
            View view = this.f101033d;
            if (view == null) {
                h.f.b.l.a("editLayout");
            }
            view.setBackgroundResource(R.drawable.aqn);
            d();
        }
    }

    public final void a(int i2) {
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.b bVar = this.n;
        if (bVar == null) {
            h.f.b.l.a("emojiSearchView");
        }
        bVar.a(null);
        if (i2 == -2) {
            String str = f101028g;
            h.f.b.l.b(str, "");
            com.ss.android.ugc.aweme.im.service.m.a.b(str, "switchPanel SOFT_KEYBOARD");
            SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView = this.o;
            if (softInputResizeFuncLayoutView == null) {
                h.f.b.l.a("inputPanelView");
            }
            softInputResizeFuncLayoutView.c();
        } else if (i2 == -1) {
            String str2 = f101028g;
            h.f.b.l.b(str2, "");
            com.ss.android.ugc.aweme.im.service.m.a.b(str2, "switchPanel NONE");
            n();
        } else if (i2 == 1) {
            String str3 = f101028g;
            h.f.b.l.b(str3, "");
            com.ss.android.ugc.aweme.im.service.m.a.b(str3, "switchPanel EMOJI_PANEL");
            SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView2 = this.o;
            if (softInputResizeFuncLayoutView2 == null) {
                h.f.b.l.a("inputPanelView");
            }
            if (softInputResizeFuncLayoutView2.b() == 1) {
                h.f.b.l.b(str3, "");
                com.ss.android.ugc.aweme.im.service.m.a.b(str3, "switchPanel currentPanelType == EMOJI_PANEL");
                n();
                return;
            }
            this.f101034e.f();
            SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView3 = this.o;
            if (softInputResizeFuncLayoutView3 == null) {
                h.f.b.l.a("inputPanelView");
            }
            softInputResizeFuncLayoutView3.a(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final void a(com.ss.android.ugc.aweme.emoji.b.a aVar) {
        String str;
        ShareStoryContent shareStoryContent;
        h.f.b.l.d(aVar, "");
        com.ss.android.ugc.aweme.emoji.g.a aVar2 = aVar.f89106d;
        h.f.b.l.b(aVar2, "");
        int stickerType = aVar2.getStickerType();
        if ((stickerType == 10 || stickerType == 2 || stickerType == 3) && c()) {
            TuxIconView tuxIconView = this.f101032c;
            if (tuxIconView == null) {
                h.f.b.l.a("sendBtn");
            }
            new com.bytedance.tux.g.b(tuxIconView).e(R.string.b9n).b();
            return;
        }
        ArrayList arrayList = new ArrayList();
        String conversationId = this.y.getConversationId();
        ShareStoryContent shareStoryContent2 = this.z;
        if (shareStoryContent2 == null || (str = shareStoryContent2.getItemId()) == null) {
            str = "";
        }
        if (!b.b(conversationId, str) && (shareStoryContent = this.z) != null) {
            String conversationId2 = this.y.getConversationId();
            String itemId = shareStoryContent.getItemId();
            h.f.b.l.b(itemId, "");
            b.a(conversationId2, itemId);
            arrayList.add(shareStoryContent);
        }
        EmojiContent obtain = EmojiContent.obtain(aVar.f89106d);
        h.f.b.l.b(obtain, "");
        arrayList.add(obtain);
        g.a.a().b(this.y.getConversationId()).a(arrayList).a(new i(this));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final void a(b.AbstractC2490b bVar) {
        h.f.b.l.d(bVar, "");
        this.p = bVar;
    }

    static final class d implements View.OnFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryInputView f101041a;

        static {
            Covode.recordClassIndex(64629);
        }

        d(StoryInputView storyInputView) {
            this.f101041a = storyInputView;
        }

        public final void onFocusChange(View view, boolean z) {
            if (!z) {
                this.f101041a.n();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view.b.a
    public final void a(int i2, View view) {
        int i3 = 0;
        if (i2 == -2) {
            String str = f101028g;
            h.f.b.l.b(str, "");
            com.ss.android.ugc.aweme.im.service.m.a.b(str, "onPanelChange SOFT_KEYBOARD");
            b(true);
            e();
        } else if (i2 == -1) {
            String str2 = f101028g;
            h.f.b.l.b(str2, "");
            com.ss.android.ugc.aweme.im.service.m.a.b(str2, "onPanelChange NONE");
            if (this.v) {
                TuxIconView tuxIconView = this.f101031b;
                if (tuxIconView == null) {
                    h.f.b.l.a("emojiBtn");
                }
                if (tuxIconView.isSelected()) {
                    e();
                }
            }
            b(false);
        } else if (i2 == 1) {
            String str3 = f101028g;
            h.f.b.l.b(str3, "");
            com.ss.android.ugc.aweme.im.service.m.a.b(str3, "onPanelChange EMOJI_PANEL");
            b(true);
        }
        b.AbstractC2490b bVar = this.p;
        if (bVar != null) {
            if (i2 == -1) {
                i3 = 8;
            }
            bVar.a(i3);
        }
        this.u = i2;
    }

    public StoryInputView(ViewGroup viewGroup, com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar, ShareStoryContent shareStoryContent) {
        h.f.b.l.d(viewGroup, "");
        h.f.b.l.d(aVar, "");
        this.f101035f = viewGroup;
        this.y = aVar;
        this.z = shareStoryContent;
        if (aVar.isAuthorSupporterChat()) {
            this.w = com.ss.android.ugc.aweme.im.sdk.chat.b.c.a.a();
            this.v = com.ss.android.ugc.aweme.im.sdk.chat.b.c.a.c();
        }
        View findViewById = viewGroup.findViewById(R.id.bq8);
        h.f.b.l.b(findViewById, "");
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        this.f101036i = viewGroup2;
        View findViewById2 = viewGroup.findViewById(R.id.coq);
        h.f.b.l.b(findViewById2, "");
        this.f101030a = (SearchableEditText) findViewById2;
        View findViewById3 = viewGroup.findViewById(R.id.aso);
        h.f.b.l.b(findViewById3, "");
        this.f101033d = findViewById3;
        View findViewById4 = viewGroup.findViewById(R.id.av5);
        h.f.b.l.b(findViewById4, "");
        this.f101031b = (TuxIconView) findViewById4;
        View findViewById5 = viewGroup.findViewById(R.id.dyg);
        h.f.b.l.b(findViewById5, "");
        this.f101032c = (TuxIconView) findViewById5;
        View findViewById6 = viewGroup.findViewById(R.id.e2c);
        h.f.b.l.b(findViewById6, "");
        findViewById6.setVisibility(8);
        TuxIconView tuxIconView = this.f101032c;
        if (tuxIconView == null) {
            h.f.b.l.a("sendBtn");
        }
        tuxIconView.setVisibility(0);
        View findViewById7 = viewGroup.findViewById(R.id.d1k);
        h.f.b.l.b(findViewById7, "");
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView = (SoftInputResizeFuncLayoutView) findViewById7;
        this.o = softInputResizeFuncLayoutView;
        if (softInputResizeFuncLayoutView == null) {
            h.f.b.l.a("inputPanelView");
        }
        softInputResizeFuncLayoutView.setOuterView(viewGroup2);
        SearchableEditText searchableEditText = this.f101030a;
        if (searchableEditText == null) {
            h.f.b.l.a("editText");
        }
        softInputResizeFuncLayoutView.setEditText(searchableEditText);
        softInputResizeFuncLayoutView.setResizable(true);
        this.n = new com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.b(this, viewGroup2, aVar.getConversationId());
        d();
        SearchableEditText searchableEditText2 = this.f101030a;
        if (searchableEditText2 == null) {
            h.f.b.l.a("editText");
        }
        searchableEditText2.removeTextChangedListener(j());
        searchableEditText2.addTextChangedListener(j());
        searchableEditText2.setFilters(new InputFilter[]{new ad(searchableEditText2)});
        searchableEditText2.setOnClickListener(i());
        searchableEditText2.setOnFocusChangeListener(new d(this));
        TuxIconView tuxIconView2 = this.f101032c;
        if (tuxIconView2 == null) {
            h.f.b.l.a("sendBtn");
        }
        tuxIconView2.setOnClickListener(i());
        TuxIconView tuxIconView3 = this.f101031b;
        if (tuxIconView3 == null) {
            h.f.b.l.a("emojiBtn");
        }
        tuxIconView3.setOnClickListener(i());
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView2 = this.o;
        if (softInputResizeFuncLayoutView2 == null) {
            h.f.b.l.a("inputPanelView");
        }
        softInputResizeFuncLayoutView2.setOnPanelChangeListener(this);
        softInputResizeFuncLayoutView2.setOnClickListener(i());
        View view = this.f101033d;
        if (view == null) {
            h.f.b.l.a("editLayout");
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new e(this));
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView3 = this.o;
        if (softInputResizeFuncLayoutView3 == null) {
            h.f.b.l.a("inputPanelView");
        }
        a.b d2 = new a.b(this, softInputResizeFuncLayoutView3).f().c().d();
        g.a.a();
        if (com.ss.android.ugc.aweme.emoji.sysemoji.h.b(1)) {
            d2.b();
        } else {
            d2.a();
        }
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a g2 = d2.e().g();
        this.f101034e = g2;
        g2.a(i());
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView4 = this.o;
        if (softInputResizeFuncLayoutView4 == null) {
            h.f.b.l.a("inputPanelView");
        }
        softInputResizeFuncLayoutView4.a(g2.f89109b);
    }
}
