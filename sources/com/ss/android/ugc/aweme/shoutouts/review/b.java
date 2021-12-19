package com.ss.android.ugc.aweme.shoutouts.review;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsPublishReviewApi;
import com.ss.android.ugc.aweme.shoutouts.review.view.ShoutOutRatingBar;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.v;
import h.z;
import java.util.Objects;

public final class b extends Fragment implements View.OnClickListener {

    /* renamed from: g  reason: collision with root package name */
    public static final a f133350g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public TuxTextView f133351a;

    /* renamed from: b  reason: collision with root package name */
    public AbstractC3455b f133352b;

    /* renamed from: c  reason: collision with root package name */
    public int f133353c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f133354d;

    /* renamed from: e  reason: collision with root package name */
    public TuxButton f133355e;

    /* renamed from: f  reason: collision with root package name */
    public EditText f133356f;

    /* renamed from: h  reason: collision with root package name */
    private View f133357h;

    /* renamed from: i  reason: collision with root package name */
    private ShoutOutRatingBar f133358i;

    /* renamed from: j  reason: collision with root package name */
    private final String f133359j;

    /* renamed from: k  reason: collision with root package name */
    private final String f133360k;

    /* renamed from: l  reason: collision with root package name */
    private SparseArray f133361l;

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.b$b  reason: collision with other inner class name */
    public interface AbstractC3455b {
        static {
            Covode.recordClassIndex(87225);
        }

        void a();
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f133377a = new e();

        static {
            Covode.recordClassIndex(87228);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(87223);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87224);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class i implements KeyboardUtils.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f133381a;

        static {
            Covode.recordClassIndex(87232);
        }

        @Override // com.ss.android.ugc.aweme.base.utils.KeyboardUtils.a
        public final void b() {
            this.f133381a.f133354d = true;
            TuxTextView tuxTextView = this.f133381a.f133351a;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(0);
            }
        }

        @Override // com.ss.android.ugc.aweme.base.utils.KeyboardUtils.a
        public final void c() {
            String obj;
            Integer valueOf;
            TuxTextView tuxTextView;
            this.f133381a.f133354d = false;
            EditText editText = this.f133381a.f133356f;
            if (editText == null) {
                l.a("etInput");
            }
            Editable text = editText.getText();
            if (text != null && (obj = text.toString()) != null && (valueOf = Integer.valueOf(obj.length())) != null && valueOf.intValue() == 0 && (tuxTextView = this.f133381a.f133351a) != null) {
                tuxTextView.setVisibility(8);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(b bVar) {
            this.f133381a = bVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f133361l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public static final class h implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f133380a;

        static {
            Covode.recordClassIndex(87231);
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(b bVar) {
            this.f133380a = bVar;
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            Integer num;
            TuxTextView tuxTextView;
            if (charSequence != null) {
                num = Integer.valueOf(charSequence.length());
            } else {
                num = null;
            }
            h.j.g gVar = new h.j.g(0, 200);
            if (num != null && gVar.a(num.intValue())) {
                TuxTextView tuxTextView2 = this.f133380a.f133351a;
                if (tuxTextView2 != null) {
                    tuxTextView2.setVisibility(0);
                }
                if (!(charSequence == null || (tuxTextView = this.f133380a.f133351a) == null)) {
                    tuxTextView.setText(charSequence.length() + "/200");
                }
                if (num != null && num.intValue() == 200) {
                    SpannableString spannableString = new SpannableString("200/200");
                    spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FF4C3A")), 0, p.a((CharSequence) spannableString, '/', 0, false, 6), 17);
                    TuxTextView tuxTextView3 = this.f133380a.f133351a;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setText(spannableString);
                    }
                }
            }
        }
    }

    public static final /* synthetic */ TuxButton a(b bVar) {
        TuxButton tuxButton = bVar.f133355e;
        if (tuxButton == null) {
            l.a("btnSubmit");
        }
        return tuxButton;
    }

    static final class g implements ShoutOutRatingBar.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f133379a;

        static {
            Covode.recordClassIndex(87230);
        }

        g(b bVar) {
            this.f133379a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.shoutouts.review.view.ShoutOutRatingBar.a
        public final void a(float f2) {
            this.f133379a.f133353c = (int) f2;
            if (this.f133379a.f133353c > 0 && this.f133379a.getContext() != null) {
                b.a(this.f133379a).setEnabled(true);
            }
        }
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f133375a;

        static {
            Covode.recordClassIndex(87226);
        }

        c(b bVar) {
            this.f133375a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            b.a(this.f133375a).setLoading(false);
            new com.bytedance.tux.g.b(this.f133375a).a(this.f133375a.getResources().getString(R.string.g4e)).b();
        }
    }

    static final class f extends m implements h.f.a.b<com.bytedance.tux.c.e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f133378a = new f();

        static {
            Covode.recordClassIndex(87229);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.e eVar) {
            com.bytedance.tux.c.e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44775a = -1;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44783i = Float.valueOf(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            eVar2.f44784j = Float.valueOf(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()));
            return z.f158842a;
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f133376a;

        static {
            Covode.recordClassIndex(87227);
        }

        d(b bVar) {
            this.f133376a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (((BaseResponse) obj).status_code == 0) {
                new com.bytedance.tux.g.b(this.f133376a).a(this.f133376a.getResources().getString(R.string.h8c)).b();
                Context context = this.f133376a.getContext();
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context).finish();
            } else {
                new com.bytedance.tux.g.b(this.f133376a).a(this.f133376a.getResources().getString(R.string.g4e)).b();
            }
            b.a(this.f133376a).setLoading(false);
        }
    }

    public final void onClick(View view) {
        String str;
        ClickAgent.onClick(view);
        if (view != null) {
            int id = view.getId();
            if (id == R.id.zt) {
                ShoutOutRatingBar shoutOutRatingBar = this.f133358i;
                if (shoutOutRatingBar == null) {
                    l.a("ratingBar");
                }
                if (shoutOutRatingBar.getStarStep() > 0.0f) {
                    TuxButton tuxButton = this.f133355e;
                    if (tuxButton == null) {
                        l.a("btnSubmit");
                    }
                    tuxButton.setLoading(true);
                    Object a2 = RetrofitFactory.a().a(Api.f66569d).a(ShoutoutsPublishReviewApi.class);
                    l.b(a2, "");
                    ShoutoutsPublishReviewApi shoutoutsPublishReviewApi = (ShoutoutsPublishReviewApi) a2;
                    String str2 = this.f133359j;
                    String str3 = this.f133360k;
                    int i2 = this.f133353c;
                    EditText editText = this.f133356f;
                    if (editText == null) {
                        l.a("etInput");
                    }
                    shoutoutsPublishReviewApi.publishReview(str2, str3, i2, editText.getText().toString()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(this)).a(new d(this), e.f133377a);
                    h.p[] pVarArr = new h.p[4];
                    pVarArr[0] = v.a("enter_from", "chat");
                    pVarArr[1] = v.a("order_id", this.f133360k);
                    pVarArr[2] = v.a("score", String.valueOf(this.f133353c));
                    EditText editText2 = this.f133356f;
                    if (editText2 == null) {
                        l.a("etInput");
                    }
                    if (TextUtils.isEmpty(editText2.getText().toString())) {
                        str = "0";
                    } else {
                        str = "1";
                    }
                    pVarArr[3] = v.a("review_text", str);
                    r.a("show_review_pop_up", ag.a(pVarArr));
                    return;
                }
                new com.bytedance.tux.g.b(this).a(getResources().getString(R.string.h8_)).b();
            } else if (id == R.id.bve) {
                AbstractC3455b bVar = this.f133352b;
                if (bVar != null) {
                    bVar.a();
                }
            } else if (id != R.id.sy) {
            } else {
                if (this.f133354d) {
                    View view2 = this.f133357h;
                    if (view2 == null) {
                        l.a("bgGray");
                    }
                    KeyboardUtils.c(view2);
                    return;
                }
                AbstractC3455b bVar2 = this.f133352b;
                if (bVar2 != null) {
                    bVar2.a();
                }
            }
        }
    }

    private b(String str, String str2) {
        this.f133359j = str;
        this.f133360k = str2;
    }

    public /* synthetic */ b(String str, String str2, byte b2) {
        this(str, str2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.b0h, viewGroup, false);
        View findViewById = a2.findViewById(R.id.sy);
        l.b(findViewById, "");
        this.f133357h = findViewById;
        if (findViewById == null) {
            l.a("bgGray");
        }
        findViewById.setOnClickListener(this);
        if (viewGroup != null) {
            View findViewById2 = a2.findViewById(R.id.dqe);
            com.bytedance.tux.c.e a3 = com.bytedance.tux.c.f.a(f.f133378a);
            Context context = viewGroup.getContext();
            l.b(context, "");
            findViewById2.setBackground(a3.a(context));
            findViewById2.setClickable(true);
        }
        View findViewById3 = a2.findViewById(R.id.bve);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(this);
        }
        View findViewById4 = a2.findViewById(R.id.zt);
        l.b(findViewById4, "");
        TuxButton tuxButton = (TuxButton) findViewById4;
        this.f133355e = tuxButton;
        if (tuxButton == null) {
            l.a("btnSubmit");
        }
        tuxButton.setEnabled(false);
        TuxButton tuxButton2 = this.f133355e;
        if (tuxButton2 == null) {
            l.a("btnSubmit");
        }
        tuxButton2.setOnClickListener(this);
        TuxTextView tuxTextView = (TuxTextView) a2.findViewById(R.id.ews);
        this.f133351a = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setText("0/200");
        }
        View findViewById5 = a2.findViewById(R.id.dhb);
        l.b(findViewById5, "");
        ShoutOutRatingBar shoutOutRatingBar = (ShoutOutRatingBar) findViewById5;
        this.f133358i = shoutOutRatingBar;
        if (shoutOutRatingBar == null) {
            l.a("ratingBar");
        }
        shoutOutRatingBar.setOnRatingChangeListener(new g(this));
        View findViewById6 = a2.findViewById(R.id.ay0);
        l.b(findViewById6, "");
        EditText editText = (EditText) findViewById6;
        this.f133356f = editText;
        if (editText == null) {
            l.a("etInput");
        }
        editText.addTextChangedListener(new h(this));
        Context context2 = getContext();
        Objects.requireNonNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        KeyboardUtils.a((androidx.lifecycle.m) context2, viewGroup, new i(this));
        r.a("show_review_pop_up", ag.a(v.a("enter_from", "chat"), v.a("order_id", this.f133360k)));
        return a2;
    }
}
