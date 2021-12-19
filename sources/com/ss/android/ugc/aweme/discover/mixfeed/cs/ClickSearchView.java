package com.ss.android.ugc.aweme.discover.mixfeed.cs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.a.at;
import com.ss.android.ugc.aweme.discover.model.suggest.ClickSearchWord;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.g;
import com.ss.android.ugc.aweme.search.k.az;
import com.ss.android.ugc.aweme.search.k.bj;
import com.ss.android.ugc.aweme.search.k.bk;
import com.ss.android.ugc.aweme.search.k.bl;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.search.n.d;
import com.ss.android.ugc.aweme.utils.by;
import com.ss.android.ugc.aweme.utils.cb;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.z;
import h.z;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class ClickSearchView extends FrameLayout {

    /* renamed from: k  reason: collision with root package name */
    private static final a f81651k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    View f81652a;

    /* renamed from: b  reason: collision with root package name */
    View f81653b;

    /* renamed from: c  reason: collision with root package name */
    View f81654c;

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f81655d;

    /* renamed from: e  reason: collision with root package name */
    public int f81656e;

    /* renamed from: f  reason: collision with root package name */
    public r f81657f;

    /* renamed from: g  reason: collision with root package name */
    public b f81658g;

    /* renamed from: h  reason: collision with root package name */
    private List<? extends View> f81659h;

    /* renamed from: i  reason: collision with root package name */
    private final Set<View> f81660i;

    /* renamed from: j  reason: collision with root package name */
    private h.f.a.b<? super View, z> f81661j;

    static {
        Covode.recordClassIndex(50740);
    }

    public ClickSearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    static final class a {
        static {
            Covode.recordClassIndex(50741);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super android.view.View, h.z>, h.f.a.b<android.view.View, h.z> */
    public final h.f.a.b<View, z> getOnCloseClickListener() {
        return this.f81661j;
    }

    public final boolean b() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void a() {
        ViewParent parent = getParent();
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            List<? extends View> list = this.f81659h;
            if ((list == null || !list.contains(childAt)) && childAt != this) {
                l.b(childAt, "");
                if (childAt.getVisibility() == 0) {
                    childAt.setVisibility(4);
                    this.f81660i.add(childAt);
                }
            }
        }
    }

    public final void c() {
        if (b()) {
            setVisibility(4);
        }
        if (!this.f81660i.isEmpty()) {
            Iterator<T> it = this.f81660i.iterator();
            while (it.hasNext()) {
                it.next().setVisibility(0);
            }
            this.f81660i.clear();
        }
    }

    private final void d() {
        if (this.f81653b == null) {
            View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.axa, this, false);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2.getLayoutParams());
            layoutParams.gravity = 80;
            a2.setLayoutParams(layoutParams);
            this.f81653b = a2;
            addView(a2);
            View view = this.f81653b;
            if (view == null) {
                l.b();
            }
            this.f81655d = (LinearLayout) view.findViewById(R.id.fnb);
            View view2 = this.f81653b;
            if (view2 == null) {
                l.b();
            }
            View findViewById = view2.findViewById(R.id.y3);
            findViewById.setOnClickListener(new e(this));
            this.f81654c = findViewById;
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ClickSearchView f81662a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f81663b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f81664c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f81665d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f81666e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f81667f;

        static {
            Covode.recordClassIndex(50742);
        }

        b(ClickSearchView clickSearchView, b bVar, r rVar, List list, int i2, boolean z) {
            this.f81662a = clickSearchView;
            this.f81663b = bVar;
            this.f81664c = rVar;
            this.f81665d = list;
            this.f81666e = i2;
            this.f81667f = z;
        }

        public final void run() {
            Drawable a2;
            int i2;
            MethodCollector.i(2779);
            this.f81662a.f81658g = this.f81663b;
            this.f81662a.f81657f = this.f81664c;
            ClickSearchView clickSearchView = this.f81662a;
            List list = this.f81665d;
            int i3 = this.f81666e;
            int width = clickSearchView.getWidth();
            boolean z = this.f81667f;
            LinearLayout linearLayout = clickSearchView.f81655d;
            int i4 = 0;
            if (linearLayout != null) {
                if (linearLayout.getChildCount() > 0) {
                    linearLayout.removeAllViews();
                }
                int paddingLeft = (width - linearLayout.getPaddingLeft()) - linearLayout.getPaddingRight();
                list.size();
                z.c cVar = new z.c();
                cVar.element = 0;
                for (ClickSearchWord clickSearchWord : n.d((Iterable) list, 3)) {
                    Word word = clickSearchWord.wordRecord;
                    if (word != null) {
                        word.getWord();
                    }
                    Context context = clickSearchView.getContext();
                    l.b(context, "");
                    TuxTextView tuxTextView = new TuxTextView(context, null, i4, 6);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, com.ss.android.ugc.aweme.discover.mixfeed.d.b.f81718b);
                    layoutParams.bottomMargin = (int) by.a(8);
                    tuxTextView.setLayoutParams(layoutParams);
                    tuxTextView.setMaxLines(2);
                    tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                    tuxTextView.setGravity(17);
                    if (at.a()) {
                        a2 = cb.a(tuxTextView.getResources().getColor(R.color.a2s), by.a(2));
                    } else {
                        a2 = androidx.core.content.b.a(tuxTextView.getContext(), (int) R.drawable.be3);
                    }
                    tuxTextView.setBackground(a2);
                    int i5 = com.ss.android.ugc.aweme.discover.mixfeed.d.b.f81717a;
                    tuxTextView.setPadding(i5, i4, i5, i4);
                    tuxTextView.setTextColor(androidx.core.content.b.c(tuxTextView.getContext(), R.color.a9));
                    if (at.a()) {
                        tuxTextView.setTuxFont(62);
                    } else {
                        tuxTextView.setTuxFont(52);
                    }
                    com.bytedance.ies.dmt.ui.f.c.a(tuxTextView, 0.5f);
                    String str = null;
                    tuxTextView.setOnClickListener(new c(tuxTextView, clickSearchWord, clickSearchView, cVar, i3, paddingLeft, linearLayout));
                    if (com.ss.android.ugc.aweme.discover.mixfeed.d.a.a()) {
                        tuxTextView.setOnLongClickListener(new d(tuxTextView, clickSearchWord, clickSearchView, cVar, i3, paddingLeft, linearLayout));
                    }
                    tuxTextView.setText(clickSearchWord.word);
                    tuxTextView.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                    if (tuxTextView.getLineCount() > 1) {
                        ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
                        layoutParams2.height = com.ss.android.ugc.aweme.discover.mixfeed.d.b.f81719c;
                        tuxTextView.setLayoutParams(layoutParams2);
                    }
                    ViewGroup.LayoutParams layoutParams3 = tuxTextView.getLayoutParams();
                    if (!(layoutParams3 instanceof LinearLayout.LayoutParams)) {
                        layoutParams3 = null;
                    }
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                    if (layoutParams4 != null) {
                        i2 = layoutParams4.topMargin + layoutParams4.height + layoutParams4.bottomMargin;
                    } else {
                        i2 = 0;
                    }
                    if (cVar.element + i2 <= i3) {
                        cVar.element += i2;
                        linearLayout.addView(tuxTextView);
                        b bVar = clickSearchView.f81658g;
                        String str2 = bVar != null ? bVar.f81707c : null;
                        b bVar2 = clickSearchView.f81658g;
                        String str3 = bVar2 != null ? bVar2.f81706b : null;
                        r rVar = clickSearchView.f81657f;
                        l.d(clickSearchWord, "");
                        if (!clickSearchWord.isShowed) {
                            bl blVar = new bl();
                            Word word2 = clickSearchWord.wordRecord;
                            bk x = ((bk) blVar.v(word2 != null ? word2.getWordSource() : null).a(rVar != null ? rVar.f121274i : null).d(rVar != null ? rVar.f121275j : null)).x(str2);
                            Word word3 = clickSearchWord.wordRecord;
                            bk w = x.d(word3 != null ? Integer.valueOf(word3.getWordPosition()) : null).w(clickSearchWord.word).y("general").w(clickSearchWord.word);
                            Word word4 = clickSearchWord.wordRecord;
                            if (word4 != null) {
                                str = word4.getId();
                            }
                            w.i(str).a(new com.ss.android.ugc.aweme.app.f.d().a("enter_group_id", str3).f66730a).f();
                            clickSearchWord.isShowed = true;
                        }
                    }
                    paddingLeft = paddingLeft;
                    cVar = cVar;
                    i4 = 0;
                }
                clickSearchView.a();
                if (clickSearchView.getVisibility() != 0) {
                    clickSearchView.setVisibility(0);
                    if (z) {
                        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                        alphaAnimation.setDuration(300);
                        View view = clickSearchView.f81652a;
                        if (view == null) {
                            l.b();
                        }
                        view.startAnimation(alphaAnimation);
                        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                        translateAnimation.setDuration(300);
                        View view2 = clickSearchView.f81653b;
                        if (view2 == null) {
                            l.b();
                        }
                        view2.startAnimation(translateAnimation);
                    }
                }
                i4 = linearLayout.getChildCount();
            }
            clickSearchView.f81656e = i4;
            com.ss.android.ugc.aweme.discover.mixfeed.d.e.a("click_recom", this.f81662a.f81656e, this.f81663b.f81707c, this.f81663b.f81706b, this.f81664c);
            MethodCollector.o(2779);
        }
    }

    public final void setOnCloseClickListener(h.f.a.b<? super View, h.z> bVar) {
        this.f81661j = bVar;
    }

    public final void setAlwaysShowingViews(List<? extends View> list) {
        if (list != null) {
            this.f81659h = list;
        }
    }

    static final class d implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TuxTextView f81675a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ClickSearchWord f81676b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ClickSearchView f81677c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.c f81678d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f81679e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f81680f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ LinearLayout f81681g;

        static {
            Covode.recordClassIndex(50744);
        }

        d(TuxTextView tuxTextView, ClickSearchWord clickSearchWord, ClickSearchView clickSearchView, z.c cVar, int i2, int i3, LinearLayout linearLayout) {
            this.f81675a = tuxTextView;
            this.f81676b = clickSearchWord;
            this.f81677c = clickSearchView;
            this.f81678d = cVar;
            this.f81679e = i2;
            this.f81680f = i3;
            this.f81681g = linearLayout;
        }

        public final boolean onLongClick(View view) {
            Context context = this.f81675a.getContext();
            l.b(context, "");
            com.ss.android.ugc.aweme.discover.mixfeed.d.e.a(context, this.f81677c.f81657f, this.f81676b.wordRecord, "click_recom");
            return true;
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TuxTextView f81668a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ClickSearchWord f81669b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ClickSearchView f81670c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.c f81671d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f81672e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f81673f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ LinearLayout f81674g;

        static {
            Covode.recordClassIndex(50743);
        }

        c(TuxTextView tuxTextView, ClickSearchWord clickSearchWord, ClickSearchView clickSearchView, z.c cVar, int i2, int i3, LinearLayout linearLayout) {
            this.f81668a = tuxTextView;
            this.f81669b = clickSearchWord;
            this.f81670c = clickSearchView;
            this.f81671d = cVar;
            this.f81672e = i2;
            this.f81673f = i3;
            this.f81674g = linearLayout;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            String str4;
            Integer num;
            String str5;
            String str6;
            ClickAgent.onClick(view);
            ClickSearchWord clickSearchWord = this.f81669b;
            b bVar = this.f81670c.f81658g;
            String str7 = null;
            if (bVar != null) {
                str = bVar.f81707c;
            } else {
                str = null;
            }
            b bVar2 = this.f81670c.f81658g;
            if (bVar2 != null) {
                str2 = bVar2.f81706b;
            } else {
                str2 = null;
            }
            r rVar = this.f81670c.f81657f;
            l.d(clickSearchWord, "");
            bj bjVar = new bj();
            Word word = clickSearchWord.wordRecord;
            if (word != null) {
                str3 = word.getId();
            } else {
                str3 = null;
            }
            bk bkVar = (bk) bjVar.i(str3);
            Word word2 = clickSearchWord.wordRecord;
            if (word2 != null) {
                str4 = word2.getWordSource();
            } else {
                str4 = null;
            }
            bk v = bkVar.v(str4);
            Word word3 = clickSearchWord.wordRecord;
            if (word3 != null) {
                num = Integer.valueOf(word3.getWordPosition());
            } else {
                num = null;
            }
            bk w = v.d(num).w(clickSearchWord.word);
            if (rVar != null) {
                str5 = rVar.f121274i;
            } else {
                str5 = null;
            }
            com.ss.android.ugc.aweme.search.k.c a2 = w.a(str5);
            if (rVar != null) {
                str6 = rVar.f121275j;
            } else {
                str6 = null;
            }
            ((bk) a2.d(str6)).x(str).w(clickSearchWord.word).y("general").a(new com.ss.android.ugc.aweme.app.f.d().a("enter_group_id", str2).f66730a).f();
            com.ss.android.ugc.aweme.search.model.d dVar = new com.ss.android.ugc.aweme.search.model.d();
            r rVar2 = this.f81670c.f81657f;
            if (rVar2 != null) {
                str7 = rVar2.f121274i;
            }
            com.ss.android.ugc.aweme.search.model.d keyword = dVar.setLastSearchId(str7).setSearchFrom("click_recom").setKeyword(this.f81669b.word);
            Context context = this.f81668a.getContext();
            l.b(keyword, "");
            g.a(context, keyword, keyword.getSearchEnterParam(), null, d.a.a());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ClickSearchView f81682a;

        static {
            Covode.recordClassIndex(50745);
        }

        e(ClickSearchView clickSearchView) {
            this.f81682a = clickSearchView;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            ClickAgent.onClick(view);
            this.f81682a.c();
            h.f.a.b<View, h.z> onCloseClickListener = this.f81682a.getOnCloseClickListener();
            if (onCloseClickListener != null) {
                onCloseClickListener.invoke(this.f81682a);
            }
            bk c2 = new az().v("click_recom").c(Integer.valueOf(this.f81682a.f81656e));
            r rVar = this.f81682a.f81657f;
            String str4 = null;
            if (rVar != null) {
                str = rVar.f121274i;
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.search.k.c a2 = c2.a(str);
            r rVar2 = this.f81682a.f81657f;
            if (rVar2 != null) {
                str2 = rVar2.f121275j;
            } else {
                str2 = null;
            }
            bk bkVar = (bk) a2.d(str2);
            b bVar = this.f81682a.f81658g;
            if (bVar != null) {
                str3 = bVar.f81707c;
            } else {
                str3 = null;
            }
            com.ss.android.ugc.aweme.search.k.c q = bkVar.x(str3).y("general").q("clear");
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            b bVar2 = this.f81682a.f81658g;
            if (bVar2 != null) {
                str4 = bVar2.f81706b;
            }
            q.a(dVar.a("enter_group_id", str4).f66730a).f();
        }
    }

    private /* synthetic */ ClickSearchView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ClickSearchView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(4120);
        this.f81660i = new HashSet();
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setBackground(androidx.core.content.b.a(context, (int) R.drawable.be0));
        this.f81652a = view;
        addView(view);
        d();
        MethodCollector.o(4120);
    }
}
