package com.ss.android.ugc.tools.infosticker.view.internal.main;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.story.h.c.a.b;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.ss.android.ugc.tools.utils.p;
import com.ss.android.ugc.tools.view.widget.j;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.l;
import h.m;
import java.util.concurrent.TimeUnit;

public class g implements com.ss.android.ugc.tools.infosticker.view.internal.g {

    /* renamed from: a  reason: collision with root package name */
    public EditText f149699a;

    /* renamed from: b  reason: collision with root package name */
    View f149700b;

    /* renamed from: c  reason: collision with root package name */
    h f149701c;

    /* renamed from: d  reason: collision with root package name */
    final f.a.l.c<com.bytedance.jedi.a.c.f<String>> f149702d;

    /* renamed from: e  reason: collision with root package name */
    final f.a.l.c<Boolean> f149703e;

    /* renamed from: f  reason: collision with root package name */
    boolean f149704f;

    /* renamed from: g  reason: collision with root package name */
    public View f149705g;

    /* renamed from: h  reason: collision with root package name */
    com.ss.android.ugc.aweme.story.h.c.a.b f149706h;

    /* renamed from: i  reason: collision with root package name */
    final h f149707i = new h(this);

    /* renamed from: j  reason: collision with root package name */
    public final ViewGroup f149708j;

    /* renamed from: k  reason: collision with root package name */
    public final h.f.a.a<com.ss.android.ugc.tools.infosticker.view.a.c<ProviderEffect>> f149709k;

    /* renamed from: l  reason: collision with root package name */
    final View f149710l;

    /* renamed from: m  reason: collision with root package name */
    final Activity f149711m;
    final boolean n;
    private ViewGroup o;
    private View p;
    private final h.h q = h.i.a(m.NONE, new C4040g(this));
    private final a r = new a(this);
    private final String s;

    static {
        Covode.recordClassIndex(98568);
    }

    public final com.ss.android.ugc.tools.infosticker.view.a.c<ProviderEffect> c() {
        return (com.ss.android.ugc.tools.infosticker.view.a.c) this.q.getValue();
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.g$g  reason: collision with other inner class name */
    static final class C4040g extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.tools.infosticker.view.a.c<ProviderEffect>> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(98575);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4040g(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ com.ss.android.ugc.tools.infosticker.view.a.c<ProviderEffect> invoke() {
            return this.this$0.f149709k.invoke();
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.g
    public final t<Boolean> b() {
        t<Boolean> c2 = this.f149703e.c();
        l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.g
    public final void a() {
        if (this.f149699a != null) {
            EditText editText = this.f149699a;
            if (editText == null) {
                l.a("searchEditView");
            }
            KeyboardUtils.c(editText, this.f149708j.getContext());
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        EditText editText = this.f149699a;
        if (editText == null) {
            l.a("searchEditView");
        }
        editText.setText("");
        a("");
        View view = this.f149700b;
        if (view == null) {
            l.a("clearQueryButton");
        }
        view.setVisibility(8);
    }

    static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f149719a;

        static {
            Covode.recordClassIndex(98577);
        }

        i(g gVar) {
            this.f149719a = gVar;
        }

        public final void run() {
            g.a(this.f149719a).requestFocus();
            g.a(this.f149719a).setCursorVisible(true);
            KeyboardUtils.b(g.a(this.f149719a), this.f149719a.f149708j.getContext());
        }
    }

    private final void e() {
        if (this.f149699a == null) {
            View a2 = com.a.a(LayoutInflater.from(this.f149708j.getContext()), R.layout.b4r, this.f149708j, true);
            l.b(a2, "");
            this.f149705g = a2;
            if (a2 == null) {
                l.a("content");
            }
            View findViewById = a2.findViewById(R.id.dp3);
            l.b(findViewById, "");
            this.o = (ViewGroup) findViewById;
            View view = this.f149705g;
            if (view == null) {
                l.a("content");
            }
            View findViewById2 = view.findViewById(R.id.f6h);
            l.b(findViewById2, "");
            this.f149699a = (EditText) findViewById2;
            View view2 = this.f149705g;
            if (view2 == null) {
                l.a("content");
            }
            View findViewById3 = view2.findViewById(R.id.y0);
            l.b(findViewById3, "");
            this.f149700b = findViewById3;
            View view3 = this.f149705g;
            if (view3 == null) {
                l.a("content");
            }
            View findViewById4 = view3.findViewById(R.id.f6j);
            l.b(findViewById4, "");
            this.p = findViewById4;
            Context context = this.f149708j.getContext();
            l.b(context, "");
            View view4 = this.f149705g;
            if (view4 == null) {
                l.a("content");
            }
            View view5 = this.p;
            if (view5 == null) {
                l.a("hideListButton");
            }
            ViewGroup viewGroup = this.o;
            if (viewGroup == null) {
                l.a("searchContainer");
            }
            this.f149701c = new h(context, view4, view5, viewGroup);
            EditText editText = this.f149699a;
            if (editText == null) {
                l.a("searchEditView");
            }
            editText.clearFocus();
            EditText editText2 = this.f149699a;
            if (editText2 == null) {
                l.a("searchEditView");
            }
            editText2.setCursorVisible(false);
            String str = this.s;
            if (str != null) {
                EditText editText3 = this.f149699a;
                if (editText3 == null) {
                    l.a("searchEditView");
                }
                editText3.setHint(str);
            }
            EditText editText4 = this.f149699a;
            if (editText4 == null) {
                l.a("searchEditView");
            }
            editText4.setOnEditorActionListener(new b(this));
            EditText editText5 = this.f149699a;
            if (editText5 == null) {
                l.a("searchEditView");
            }
            editText5.addTextChangedListener(this.r);
            EditText editText6 = this.f149699a;
            if (editText6 == null) {
                l.a("searchEditView");
            }
            editText6.setOnTouchListener(new c(this));
            View view6 = this.f149700b;
            if (view6 == null) {
                l.a("clearQueryButton");
            }
            view6.setOnClickListener(new d(this));
            View view7 = this.p;
            if (view7 == null) {
                l.a("hideListButton");
            }
            view7.setOnClickListener(new e(this));
            this.f149702d.d(600, TimeUnit.MILLISECONDS).a(f.a.a.b.a.a()).a(new f(this), p.f150012a);
        }
    }

    public static final class a implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f149712a;

        static {
            Covode.recordClassIndex(98569);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(g gVar) {
            this.f149712a = gVar;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            g gVar = this.f149712a;
            if (editable != null) {
                str = editable.toString();
            } else {
                str = null;
            }
            View view = gVar.f149700b;
            if (view == null) {
                l.a("clearQueryButton");
            }
            int i2 = 0;
            if (str == null || str.length() == 0) {
                i2 = 8;
            }
            view.setVisibility(i2);
            gVar.f149702d.onNext(com.bytedance.jedi.a.c.g.a(str));
        }
    }

    public static final class h implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f149718a;

        static {
            Covode.recordClassIndex(98576);
        }

        @Override // com.ss.android.ugc.aweme.story.h.c.a.b.a
        public final void c(int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(g gVar) {
            this.f149718a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.story.h.c.a.b.a
        public final void a(int i2) {
            this.f149718a.c();
        }

        @Override // com.ss.android.ugc.aweme.story.h.c.a.b.a
        public final void b(int i2) {
            this.f149718a.c();
        }
    }

    public final void a(String str) {
        c().a(str);
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f149715a;

        static {
            Covode.recordClassIndex(98572);
        }

        d(g gVar) {
            this.f149715a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f149715a.d();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f<com.bytedance.jedi.a.c.f<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f149717a;

        static {
            Covode.recordClassIndex(98574);
        }

        f(g gVar) {
            this.f149717a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.bytedance.jedi.a.c.f<? extends String> fVar) {
            this.f149717a.a((String) fVar.a());
        }
    }

    public static final /* synthetic */ EditText a(g gVar) {
        EditText editText = gVar.f149699a;
        if (editText == null) {
            l.a("searchEditView");
        }
        return editText;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.g
    public final void a(boolean z) {
        int i2;
        ViewGroup viewGroup = this.f149708j;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        viewGroup.setVisibility(i2);
        if (z) {
            e();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f149716a;

        static {
            Covode.recordClassIndex(98573);
        }

        e(g gVar) {
            this.f149716a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            g gVar = this.f149716a;
            gVar.f149704f = false;
            gVar.d();
            gVar.f149710l.setVisibility(8);
            EditText editText = gVar.f149699a;
            if (editText == null) {
                l.a("searchEditView");
            }
            KeyboardUtils.c(editText, gVar.f149708j.getContext());
            EditText editText2 = gVar.f149699a;
            if (editText2 == null) {
                l.a("searchEditView");
            }
            editText2.clearFocus();
            EditText editText3 = gVar.f149699a;
            if (editText3 == null) {
                l.a("searchEditView");
            }
            editText3.setCursorVisible(false);
            if (gVar.n) {
                h hVar = gVar.f149701c;
                if (hVar == null) {
                    l.a("showHideAnim");
                }
                hVar.a(false);
            }
            com.ss.android.ugc.aweme.story.h.c.a.b bVar = gVar.f149706h;
            if (bVar != null) {
                bVar.a();
            }
            gVar.f149706h = null;
            gVar.f149703e.onNext(false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f149714a;

        static {
            Covode.recordClassIndex(98571);
        }

        c(g gVar) {
            this.f149714a = gVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            l.b(motionEvent, "");
            if (motionEvent.getAction() == 1) {
                g gVar = this.f149714a;
                if (!gVar.f149704f) {
                    gVar.f149704f = true;
                    gVar.f149710l.setVisibility(0);
                    gVar.c().cD_();
                    EditText editText = gVar.f149699a;
                    if (editText == null) {
                        l.a("searchEditView");
                    }
                    editText.post(new i(gVar));
                    if (gVar.n) {
                        h hVar = gVar.f149701c;
                        if (hVar == null) {
                            l.a("showHideAnim");
                        }
                        hVar.a(true);
                    }
                    Activity activity = gVar.f149711m;
                    com.ss.android.ugc.aweme.story.h.c.a.b bVar = null;
                    if (activity != null) {
                        bVar = new com.ss.android.ugc.aweme.story.h.c.a.b(activity, null);
                    }
                    gVar.f149706h = bVar;
                    com.ss.android.ugc.aweme.story.h.c.a.b bVar2 = gVar.f149706h;
                    if (bVar2 != null) {
                        bVar2.a(gVar.f149707i);
                    }
                    gVar.f149703e.onNext(true);
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements TextView.OnEditorActionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f149713a;

        static {
            Covode.recordClassIndex(98570);
        }

        b(g gVar) {
            this.f149713a = gVar;
        }

        public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            String str;
            if (i2 != 3) {
                return false;
            }
            g gVar = this.f149713a;
            EditText editText = gVar.f149699a;
            if (editText == null) {
                l.a("searchEditView");
            }
            Editable text = editText.getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            if (str == null || str.length() == 0) {
                j.a.a(gVar.f149708j.getContext(), (int) R.string.h36, 0).a();
            } else {
                gVar.a(str);
            }
            return true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.infosticker.view.a.c<com.ss.android.ugc.effectmanager.effect.model.ProviderEffect>> */
    /* JADX WARN: Multi-variable type inference failed */
    public g(ViewGroup viewGroup, h.f.a.a<? extends com.ss.android.ugc.tools.infosticker.view.a.c<ProviderEffect>> aVar, View view, Activity activity, String str, boolean z) {
        l.d(viewGroup, "");
        l.d(aVar, "");
        l.d(view, "");
        this.f149708j = viewGroup;
        this.f149709k = aVar;
        this.f149710l = view;
        this.f149711m = activity;
        this.s = str;
        this.n = z;
        f.a.l.c<com.bytedance.jedi.a.c.f<String>> cVar = new f.a.l.c<>();
        l.b(cVar, "");
        this.f149702d = cVar;
        f.a.l.c<Boolean> cVar2 = new f.a.l.c<>();
        l.b(cVar2, "");
        this.f149703e = cVar2;
        viewGroup.setVisibility(8);
    }
}
