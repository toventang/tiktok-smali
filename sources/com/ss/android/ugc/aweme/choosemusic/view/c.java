package com.ss.android.ugc.aweme.choosemusic.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel;
import com.ss.android.ugc.aweme.choosemusic.c.a;
import com.ss.android.ugc.aweme.choosemusic.h.d.c;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.discover.h.b;
import com.ss.android.ugc.aweme.discover.helper.i;
import com.ss.android.ugc.aweme.music.k.a;
import com.ss.android.ugc.aweme.search.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.g.e;
import com.ss.android.ugc.aweme.search.h;
import com.ss.android.ugc.aweme.setting.bl;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;

public abstract class c {
    private int A;
    private TextWatcher B;

    /* renamed from: a  reason: collision with root package name */
    public a f70810a;

    /* renamed from: b  reason: collision with root package name */
    public b f70811b;

    /* renamed from: c  reason: collision with root package name */
    ViewStub f70812c;

    /* renamed from: d  reason: collision with root package name */
    public LinearLayout f70813d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f70814e;

    /* renamed from: f  reason: collision with root package name */
    ImageView f70815f;

    /* renamed from: g  reason: collision with root package name */
    public ViewGroup f70816g;

    /* renamed from: h  reason: collision with root package name */
    public TextView f70817h;

    /* renamed from: i  reason: collision with root package name */
    public LinearLayout f70818i;

    /* renamed from: j  reason: collision with root package name */
    public EditText f70819j;

    /* renamed from: k  reason: collision with root package name */
    public SearchResultView f70820k;

    /* renamed from: l  reason: collision with root package name */
    TuxIconView f70821l;

    /* renamed from: m  reason: collision with root package name */
    public FrameLayout f70822m;
    public LinearLayout n;
    StarTcmItem o;
    CommerceTipsItem p;
    public FrameLayout q;
    public View r;
    public View s;
    MusicSearchStateViewModel t;
    public ValueAnimator u;
    public ValueAnimator v;
    int w;
    public Fragment x;
    public com.ss.android.ugc.aweme.search.g.b y;
    public boolean z;

    static {
        Covode.recordClassIndex(43634);
    }

    /* access modifiers changed from: protected */
    public abstract void c();

    /* access modifiers changed from: protected */
    public abstract void d();

    public final void i() {
        EditText editText = this.f70819j;
        if (editText != null) {
            editText.clearFocus();
        }
    }

    public final void b() {
        this.y = null;
        this.f70811b.a("music", this.x);
    }

    public final String h() {
        return this.f70819j.getText().toString();
    }

    public final String k() {
        EditText editText = this.f70819j;
        if (editText == null) {
            return "";
        }
        return editText.getText().toString();
    }

    public final void f() {
        this.f70822m.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = this.f70818i.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            this.f70818i.setLayoutParams(layoutParams);
        }
    }

    public final void g() {
        if (this.f70810a.getActivity() != null) {
            this.f70819j.post(new e(this));
        }
    }

    public final void j() {
        EditText editText = this.f70819j;
        if (editText != null) {
            editText.setText("");
        }
        FrameLayout frameLayout = this.q;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        SearchResultView searchResultView = this.f70820k;
        if (searchResultView != null) {
            searchResultView.setVisibility(8);
        }
        KeyboardUtils.c(this.f70819j);
    }

    private Map<String, String> m() {
        HashMap hashMap = new HashMap();
        hashMap.put("search_keyword", k());
        hashMap.put("search_id", this.f70810a.g());
        hashMap.put("search_type", "music_create");
        hashMap.put("enter_from", "search_music");
        return hashMap;
    }

    public final void e() {
        this.f70814e.setVisibility(8);
        this.f70817h.setVisibility(8);
        this.f70816g.setVisibility(0);
        f();
        View view = this.r;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.s;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    private void n() {
        this.f70819j.setOnEditorActionListener(this.f70810a);
        this.f70819j.addTextChangedListener(this.B);
        this.f70819j.setOnTouchListener(new i(this));
        d();
        this.f70818i.setOnClickListener(this.f70810a);
        this.f70814e.setOnClickListener(this.f70810a);
        this.f70817h.setOnClickListener(this.f70810a);
        this.f70821l.setOnClickListener(new j(this));
        this.f70819j.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.ugc.aweme.choosemusic.view.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(43635);
            }

            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            public final void afterTextChanged(Editable editable) {
                if (TextUtils.isEmpty(editable.toString())) {
                    c.this.f70821l.setVisibility(8);
                    c.a.a("");
                    return;
                }
                c.this.f70821l.setVisibility(0);
            }
        });
        this.f70820k.setOnDispatchTouchEventListener(new k(this));
        if (this.f70811b.c()) {
            this.f70816g.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.choosemusic.view.c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(43636);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    if (c.this.x == null) {
                        c cVar = c.this;
                        cVar.x = cVar.f70811b.a("music", c.this.z, new e() {
                            /* class com.ss.android.ugc.aweme.choosemusic.view.c.AnonymousClass2.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(43637);
                            }

                            @Override // com.ss.android.ugc.aweme.search.g.e
                            public final void a(com.ss.android.ugc.aweme.search.g.b bVar) {
                                c.this.y = bVar;
                            }
                        });
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("search_keyword", c.this.k());
                    hashMap.put("search_id", c.this.f70810a.g());
                    hashMap.put("search_type", "music_create");
                    hashMap.put("enter_from", "search_music");
                    c.this.f70811b.a((androidx.fragment.app.e) view.getContext(), c.this.x, new View.OnClickListener() {
                        /* class com.ss.android.ugc.aweme.choosemusic.view.c.AnonymousClass2.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(43638);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            if (c.this.y != null) {
                                c.this.f70810a.a(c.this.y);
                                c.this.a(true, c.this.y.isDefaultOption());
                            }
                            c.this.f70811b.a(c.this.y, c.this.x);
                            if (c.this.f70810a.h() != null) {
                                c.this.f70810a.h().n = false;
                            }
                        }
                    }, new View.OnClickListener() {
                        /* class com.ss.android.ugc.aweme.choosemusic.view.c.AnonymousClass2.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(43639);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            if (c.this.f70810a.h() != null) {
                                c.this.f70810a.h().n = false;
                            }
                        }
                    }, hashMap);
                    if (c.this.f70810a.h() != null) {
                        c.this.f70810a.h().n = true;
                    }
                }
            });
        }
    }

    public final void a() {
        this.n.setOnClickListener(this.f70810a);
        if ((CommerceMediaServiceImpl.f().b() || CommerceMediaServiceImpl.f().e()) && a.C2857a.a("show_commerce_tips", (Boolean) true, "music_sp")) {
            this.p.setVisibility(0);
        } else {
            this.p.setVisibility(8);
        }
        this.p.setUnderView(this.q);
        c();
        this.o.setUnderView(this.q);
    }

    public final void l() {
        if (this.f70812c.getParent() != null) {
            View inflate = this.f70812c.inflate();
            this.f70813d = (LinearLayout) inflate.findViewById(R.id.cgf);
            this.f70818i = (LinearLayout) inflate.findViewById(R.id.dp3);
            this.f70819j = (EditText) inflate.findViewById(R.id.f6i);
            this.f70821l = (TuxIconView) inflate.findViewById(R.id.bvd);
            this.f70822m = (FrameLayout) inflate.findViewById(R.id.awn);
            this.f70814e = (TextView) inflate.findViewById(R.id.f6j);
            this.f70817h = (TextView) inflate.findViewById(R.id.f6k);
            this.f70820k = (SearchResultView) inflate.findViewById(R.id.ae7);
            this.f70815f = (ImageView) inflate.findViewById(R.id.c10);
            this.f70816g = (ViewGroup) inflate.findViewById(R.id.dus);
            n();
        }
    }

    private void a(boolean z2) {
        boolean z3;
        Context context = this.q.getContext();
        Fragment fragment = this.x;
        if ((context instanceof androidx.fragment.app.e) && fragment != null) {
            b f2 = h.f121133a.f();
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) context;
            Map<String, String> m2 = m();
            if (this.z == z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            f2.a(new i.a(eVar, fragment, "music", m2, z2, z3));
        }
    }

    public final void a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f70819j.setText(charSequence);
            if (!TextUtils.isEmpty(this.f70819j.getText())) {
                this.f70819j.setSelection(charSequence.length());
            }
        }
    }

    public final void a(boolean z2, boolean z3) {
        a(z2);
        this.z = z2;
        if (z2) {
            this.f70816g.setClickable(true);
            if (!z3) {
                this.f70815f.setImageResource(2131233576);
            } else {
                this.f70815f.setImageResource(2131233575);
            }
        } else if (h.f121133a.f().a("music")) {
            this.f70816g.setClickable(true);
            this.f70815f.setImageResource(2131233575);
        } else {
            this.f70816g.setClickable(false);
            this.f70815f.setImageResource(2131233574);
        }
    }

    public c(View view, com.ss.android.ugc.aweme.choosemusic.c.a aVar, int i2, TextWatcher textWatcher) {
        View decorView;
        this.f70810a = aVar;
        this.A = i2;
        this.B = textWatcher;
        if (!(aVar == null || aVar.getActivity() == null)) {
            MusicSearchStateViewModel musicSearchStateViewModel = (MusicSearchStateViewModel) ae.a(this.f70810a.getActivity(), (ad.b) null).a(MusicSearchStateViewModel.class);
            this.t = musicSearchStateViewModel;
            musicSearchStateViewModel.d().observe(this.f70810a, new d(this));
            Window window = this.f70810a.getActivity().getWindow();
            if (!(window == null || (decorView = window.getDecorView()) == null)) {
                this.r = decorView.findViewById(R.id.qb);
                View findViewById = decorView.findViewById(R.id.due);
                this.s = findViewById;
                if (findViewById != null) {
                    findViewById.setOnClickListener(this.f70810a);
                }
            }
        }
        this.f70812c = (ViewStub) view.findViewById(R.id.fjr);
        this.n = (LinearLayout) view.findViewById(R.id.dp1);
        this.o = (StarTcmItem) view.findViewById(R.id.bsx);
        this.p = (CommerceTipsItem) view.findViewById(R.id.brz);
        this.q = (FrameLayout) view.findViewById(R.id.ae8);
        this.w = n.a(view.getContext());
        this.f70811b = SearchServiceImpl.t().f();
        if (!bl.a()) {
            l();
        }
    }
}
