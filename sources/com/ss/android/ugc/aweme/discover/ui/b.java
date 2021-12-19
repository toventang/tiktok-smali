package com.ss.android.ugc.aweme.discover.ui;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.common.ae;
import com.ss.android.ugc.aweme.common.f.e;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.discover.DiscoveryServiceImpl;
import com.ss.android.ugc.aweme.discover.e.o;
import com.ss.android.ugc.aweme.discover.model.KeyboardModel;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchStateData;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.ss.android.ugc.aweme.performance.k;
import com.ss.android.ugc.aweme.search.k.bj;
import com.ss.android.ugc.aweme.search.k.bk;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.model.d;
import com.ss.android.ugc.aweme.search.n.h;
import com.ss.android.ugc.aweme.utils.he;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public abstract class b extends com.ss.android.ugc.aweme.base.f.a implements SearchIntermediateView.c, i, j {
    protected static long v = 1000;
    private String A;

    /* renamed from: a  reason: collision with root package name */
    View f82354a;

    /* renamed from: b  reason: collision with root package name */
    EditText f82355b;

    /* renamed from: c  reason: collision with root package name */
    TuxIconView f82356c;

    /* renamed from: d  reason: collision with root package name */
    View f82357d;

    /* renamed from: e  reason: collision with root package name */
    TextView f82358e;

    /* renamed from: j  reason: collision with root package name */
    ImageView f82359j;

    /* renamed from: k  reason: collision with root package name */
    FrameLayout f82360k;

    /* renamed from: l  reason: collision with root package name */
    SearchIntermediateView f82361l;

    /* renamed from: m  reason: collision with root package name */
    KeyboardModel f82362m;
    protected SearchStateViewModel n;
    protected String o;
    SearchIntermediateViewModel p;
    protected SearchStateData q;
    protected boolean r;
    f.a.b.b s;
    protected d t;
    protected long u;
    protected Word w;
    private boolean y;
    private he z;

    private static String b(boolean z2) {
        return z2 ? "default_search_keyword" : "normal_search";
    }

    /* access modifiers changed from: protected */
    public String A() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void a(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    public abstract void b(View view);

    /* access modifiers changed from: protected */
    public abstract void b(String str);

    /* access modifiers changed from: protected */
    public abstract void c(d dVar);

    /* access modifiers changed from: protected */
    public void c(String str) {
    }

    /* access modifiers changed from: protected */
    public void d(d dVar) {
    }

    /* access modifiers changed from: protected */
    public boolean e(String str) {
        return false;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(324, new g(b.class, "onSearchSugCompletionEvent", o.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public abstract int h();

    /* access modifiers changed from: protected */
    public abstract int i();

    /* access modifiers changed from: protected */
    public abstract void j();

    /* access modifiers changed from: protected */
    public void n() {
    }

    /* access modifiers changed from: package-private */
    public abstract String r();

    /* access modifiers changed from: package-private */
    public abstract void t();

    /* access modifiers changed from: protected */
    public boolean v() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean y() {
        return false;
    }

    /* access modifiers changed from: protected */
    public String z() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void C() {
        com.ss.android.ugc.aweme.search.o.a.a();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        b(view);
        return false;
    }

    protected static String m() {
        return com.ss.android.ugc.aweme.search.b.b.f120981a.a(-1);
    }

    static {
        Covode.recordClassIndex(51266);
    }

    /* access modifiers changed from: protected */
    public void c() {
        new Handler().postDelayed(new d(this), 800);
    }

    /* access modifiers changed from: protected */
    public void s() {
        getActivity().getWindow().setSoftInputMode(50);
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        if ("homepage_follow".equals(r()) || "homepage_hot".equals(r())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final String q() {
        String r2 = r();
        h fetchMutableData = com.ss.android.ugc.aweme.search.n.d.fetchMutableData();
        if (fetchMutableData == null || fetchMutableData.getSearchPosition().isEmpty()) {
            return r2;
        }
        return fetchMutableData.getSearchPosition();
    }

    public final int w() {
        Integer value = this.n.searchState.getValue();
        if (value == null) {
            return i();
        }
        return value.intValue();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void B() {
        n();
        String obj = this.f82355b.getText().toString();
        l.d(obj, "");
        com.ss.android.ugc.aweme.search.o.a.f121550a = obj;
        com.ss.android.ugc.aweme.search.o.a.f121551b = System.currentTimeMillis();
        this.f82355b.setText("");
        this.f82355b.requestFocus();
        this.f82355b.setCursorVisible(true);
        this.f82355b.setSelection(0);
        c("cancel");
        KeyboardUtils.b(this.f82355b);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.s = t.a(t.b(com.ss.android.ugc.aweme.compliance.api.a.r()), f.e(), e.f82554a).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new f(this));
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.s = t.b(com.ss.android.ugc.aweme.compliance.api.a.r()).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new k(this));
    }

    /* access modifiers changed from: protected */
    public final boolean p() {
        com.ss.android.ugc.aweme.search.model.b bVar;
        if (getActivity() == null || (bVar = SearchEnterViewModel.a.a(requireActivity()).f82794a) == null) {
            return false;
        }
        return "1".equals(bVar.obtainLogData("is_from_video"));
    }

    /* access modifiers changed from: protected */
    public final void e() {
        com.ss.android.ugc.aweme.search.model.b bVar;
        if (getActivity() != null && (bVar = SearchEnterViewModel.a.a(getActivity()).f82794a) != null && !TextUtils.isEmpty(bVar.getSearchHint())) {
            String str = (String) bVar.obtainLogData("hint_group_id");
            if (TextUtils.isEmpty(str)) {
                str = bVar.getSearchHintWordId();
            }
            b(new a(bVar.getSearchHint(), str, (String) bVar.obtainLogData("hint_imp_id")));
        }
    }

    /* access modifiers changed from: protected */
    public final void u() {
        if (v()) {
            String obj = this.f82355b.getText().toString();
            int selectionStart = this.f82355b.getSelectionStart();
            if (this.y) {
                selectionStart = this.f82355b.getText().length();
            }
            com.ss.android.ugc.aweme.search.o.a.f121554e = selectionStart;
            this.y = false;
            if (this.f82361l.a()) {
                this.f82361l.a(obj);
                return;
            }
            this.f82361l.a(obj);
            this.f82361l.setOpenSugFromState(w());
            b(3);
        }
    }

    /* access modifiers changed from: protected */
    public void o() {
        this.f82359j.setOnClickListener(new g(this));
        this.f82356c.setOnClickListener(new h(this));
        this.f82358e.setOnTouchListener(new aj() {
            /* class com.ss.android.ugc.aweme.discover.ui.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(51267);
            }

            @Override // com.ss.android.ugc.aweme.discover.ui.aj
            public final void a(View view) {
                if (b.this.f82355b != null) {
                    b.this.d(b.this.f82355b.getText().toString());
                    b.this.f("click_search");
                }
            }
        });
        he heVar = this.z;
        EditText editText = this.f82355b;
        if (editText != null) {
            editText.addTextChangedListener(new TextWatcher() {
                /* class com.ss.android.ugc.aweme.utils.he.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(93626);
                }

                public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                public final void afterTextChanged(Editable editable) {
                    he heVar = he.this;
                    String obj = editable.toString();
                    if (TextUtils.isEmpty(obj)) {
                        heVar.f143060c = true;
                    } else if (!heVar.f143060c) {
                    } else {
                        if (TextUtils.isEmpty(heVar.f143059b)) {
                            heVar.f143058a.add(obj);
                            heVar.f143059b = obj;
                            return;
                        }
                        int length = heVar.f143059b.length();
                        int length2 = obj.length();
                        if (length == length2) {
                            return;
                        }
                        if (length > length2) {
                            heVar.b();
                        } else if (!obj.startsWith(heVar.f143059b)) {
                            heVar.b();
                        } else {
                            heVar.f143058a.add(obj.substring(length));
                            heVar.f143059b = obj;
                        }
                    }
                }
            });
        }
        new a(com.ss.android.ugc.aweme.search.b.b.f120981a.a(-1));
        e();
        this.f82355b.setHint(com.ss.android.ugc.aweme.search.b.b.f120981a.a(-1));
        this.f82355b.setFilters(new InputFilter[]{new ae()});
        this.f82355b.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.ugc.aweme.discover.ui.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(51268);
            }

            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            public final void afterTextChanged(Editable editable) {
                String obj = editable.toString();
                l.d(obj, "");
                long currentTimeMillis = System.currentTimeMillis();
                k kVar = new k(obj);
                kVar.f114813a = currentTimeMillis;
                com.ss.android.ugc.aweme.performance.l.f114819a.put(obj, kVar);
                b.this.a((CharSequence) obj);
            }
        });
        this.f82355b.setOnTouchListener(new i(this));
        this.f82355b.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            /* class com.ss.android.ugc.aweme.discover.ui.b.AnonymousClass3 */

            static {
                Covode.recordClassIndex(51269);
            }

            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                if (i2 != 3) {
                    return true;
                }
                b.this.d(b.this.f82355b.getText().toString());
                b.this.f("default_click_keyboard");
                return true;
            }
        });
        if (getActivity() != null) {
            KeyboardModel keyboardModel = (KeyboardModel) androidx.lifecycle.ae.a(getActivity(), (ad.b) null).a(KeyboardModel.class);
            this.f82362m = keyboardModel;
            keyboardModel.getKeyboardStatus().observe(getActivity(), new u<Integer>() {
                /* class com.ss.android.ugc.aweme.discover.ui.b.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(51270);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Integer num) {
                    Integer num2 = num;
                    if (num2 == null) {
                        return;
                    }
                    if (num2.intValue() == 1) {
                        KeyboardUtils.b(b.this.f82355b);
                    } else if (num2.intValue() == 0) {
                        KeyboardUtils.c(b.this.f82355b);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        if (r1.equals("homepage_hot") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        if (r1.equals("discovery") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0085, code lost:
        if (r1.equals("homepage_follow") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0088, code lost:
        r2 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x() {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.b.x():void");
    }

    /* access modifiers changed from: protected */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f82367a;

        /* renamed from: b  reason: collision with root package name */
        String f82368b;

        /* renamed from: c  reason: collision with root package name */
        String f82369c;

        static {
            Covode.recordClassIndex(51271);
        }

        a(String str) {
            this(str, "");
        }

        a(String str, String str2) {
            this.f82367a = str;
            this.f82368b = str2;
        }

        public a(String str, String str2, String str3) {
            this.f82367a = str;
            this.f82368b = str2;
            this.f82369c = str3;
        }
    }

    /* access modifiers changed from: protected */
    public void a(a aVar) {
        b(aVar);
    }

    /* access modifiers changed from: protected */
    public void d(String str) {
        a(str, false);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView.c
    public final void a(int i2) {
        this.f82355b.setHint(com.ss.android.ugc.aweme.search.b.b.f120981a.a(i2));
    }

    protected static boolean a(String str) {
        int a2 = com.ss.android.ugc.aweme.search.j.a();
        for (int i2 = 0; i2 < a2; i2++) {
            if (TextUtils.equals(str, com.ss.android.ugc.aweme.search.b.b.f120981a.a(i2))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView.c
    public void b(d dVar) {
        if (SearchStateViewModel.isSearchIntermediate(w()) && !TextUtils.isEmpty(dVar.getKeyword())) {
            c(dVar);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(d dVar) {
        com.ss.android.ugc.aweme.search.h.f121133a.a(dVar);
        d(dVar);
        c(dVar);
        KeyboardUtils.c(this.f82355b);
    }

    public void b(int i2) {
        this.n.setSearchState(i2);
        this.q.getSearchState().setValue(Integer.valueOf(i2));
        if (SearchStateViewModel.isSearchIntermediate(i2)) {
            this.f82360k.setVisibility(4);
        } else {
            this.f82360k.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public final void f(String str) {
        String str2;
        EditText editText = this.f82355b;
        if (editText != null) {
            str2 = editText.getText().toString();
            if (TextUtils.isEmpty(str2)) {
                str2 = this.f82355b.getHint().toString();
            }
        } else {
            str2 = "";
        }
        ((c) new com.ss.android.ugc.aweme.search.k.u().c("enter_method", str)).b(str2).f();
    }

    @r
    public void onSearchSugCompletionEvent(o oVar) {
        String str;
        if (ab_() && oVar != null && (str = oVar.f80968a) != null && str.length() != 0 && this.f82361l.getVisibility() == 0) {
            this.y = true;
            this.f82355b.setText(str);
            this.f82355b.setSelection(str.length());
            this.f82355b.setCursorVisible(true);
            KeyboardUtils.b(this.f82355b);
        }
    }

    /* access modifiers changed from: protected */
    public void a(View view) {
        this.f82354a = view.findViewById(R.id.b_u);
        this.f82355b = (EditText) view.findViewById(R.id.ay6);
        this.f82356c = (TuxIconView) view.findViewById(R.id.y1);
        this.f82357d = view.findViewById(R.id.dw1);
        this.f82358e = (TextView) view.findViewById(R.id.f6o);
        this.f82359j = (ImageView) view.findViewById(R.id.qc);
        this.f82360k = (FrameLayout) view.findViewById(R.id.b94);
        this.f82361l = (SearchIntermediateView) view.findViewById(R.id.dv4);
    }

    /* access modifiers changed from: protected */
    public final void b(a aVar) {
        if (aVar != null) {
            this.f82355b.setHint(aVar.f82367a);
            this.w = new Word(aVar.f82368b, aVar.f82367a);
            com.ss.android.ugc.aweme.search.model.b bVar = SearchEnterViewModel.a.a(getActivity()).f82794a;
            if (bVar != null && bVar.getInboxWord() != null) {
                this.w.setId(bVar.getInboxWord().getId());
                this.w.setWordPosition(bVar.getInboxWord().getWordPosition());
                this.w.setImplId(bVar.getInboxWord().getImplId());
            } else if (aVar.f82369c != null) {
                this.w.setImplId(aVar.f82369c);
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.n = (SearchStateViewModel) androidx.lifecycle.ae.a(getActivity(), (ad.b) null).a(SearchStateViewModel.class);
        this.z = new he();
        a(getArguments());
        this.p = (SearchIntermediateViewModel) androidx.lifecycle.ae.a(getActivity(), (ad.b) null).a(SearchIntermediateViewModel.class);
        this.q = (SearchStateData) androidx.lifecycle.ae.a(this, (ad.b) null).a(SearchStateData.class);
        this.n.isLeavingSearchPage.observe(this, new c(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Boolean bool) {
        this.r = bool.booleanValue();
        if (bool.booleanValue()) {
            c();
        }
    }

    public final void a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f82356c.getVisibility() == 8) {
            this.f82356c.setVisibility(0);
        } else if (TextUtils.isEmpty(charSequence) && this.f82356c.getVisibility() == 0) {
            this.f82356c.setVisibility(8);
        }
        if (!TextUtils.equals(this.A, charSequence)) {
            String charSequence2 = charSequence.toString();
            if (!TextUtils.isEmpty(this.A) && TextUtils.isEmpty(charSequence2) && (!this.r)) {
                b("cancel");
            }
            this.A = charSequence2;
            if (TextUtils.isEmpty(charSequence)) {
                if (w() != 1) {
                    t();
                }
            } else if (w() != 2) {
                u();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z2) {
        SearchIntermediateView searchIntermediateView = this.f82361l;
        searchIntermediateView.f82151d.a(z2);
        SearchIntermediateViewModel searchIntermediateViewModel = searchIntermediateView.f82148a;
        if (searchIntermediateViewModel == null) {
            l.a("intermediateViewModel");
        }
        searchIntermediateViewModel.hideIntermediate();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.b$b  reason: collision with other inner class name */
    static class C1932b {

        /* renamed from: a  reason: collision with root package name */
        ITpcConsentService f82374a;

        /* renamed from: b  reason: collision with root package name */
        boolean f82375b;

        /* renamed from: c  reason: collision with root package name */
        WeakReference<Activity> f82376c;

        static {
            Covode.recordClassIndex(51272);
        }

        public C1932b(ITpcConsentService iTpcConsentService, Activity activity) {
            this.f82374a = iTpcConsentService;
            this.f82375b = iTpcConsentService.a((com.ss.android.ugc.aweme.compliance.api.services.consent.a) null);
            this.f82376c = new WeakReference<>(activity);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        b(i());
        e.b(this.f82354a);
        SearchIntermediateView searchIntermediateView = this.f82361l;
        l.d(this, "");
        l.d(this, "");
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            l.b();
        }
        l.b(activity, "");
        searchIntermediateView.f82149b = this;
        searchIntermediateView.f82153f = com.ss.android.ugc.aweme.search.h.f121133a.a((Activity) getActivity());
        androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
        l.b(childFragmentManager, "");
        searchIntermediateView.f82150c = childFragmentManager;
        ac a2 = androidx.lifecycle.ae.a(activity, (ad.b) null).a(SearchIntermediateViewModel.class);
        l.b(a2, "");
        searchIntermediateView.f82148a = (SearchIntermediateViewModel) a2;
        SearchIntermediateViewModel searchIntermediateViewModel = searchIntermediateView.f82148a;
        if (searchIntermediateViewModel == null) {
            l.a("intermediateViewModel");
        }
        searchIntermediateViewModel.getIntermediateState().observe(this, searchIntermediateView.f82155h);
        SearchIntermediateViewModel searchIntermediateViewModel2 = searchIntermediateView.f82148a;
        if (searchIntermediateViewModel2 == null) {
            l.a("intermediateViewModel");
        }
        searchIntermediateViewModel2.getSearchTabIndex().observe(this, searchIntermediateView.f82156i);
        this.f82361l.setOnDispatchTouchEventListener(new j(this));
        o();
        j();
        androidx.fragment.app.e activity2 = getActivity();
        if (com.ss.android.ugc.aweme.compliance.api.a.r().a((com.ss.android.ugc.aweme.compliance.api.services.consent.a) null) && activity2 != null && !activity2.isFinishing()) {
            com.ss.android.ugc.aweme.compliance.api.a.r().a(activity2, "deeplink");
        }
        s();
    }

    /* access modifiers changed from: protected */
    public final void a(String str, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        String str2;
        String id;
        String trim = str.trim();
        if (!TextUtils.isEmpty(trim)) {
            long currentTimeMillis = System.currentTimeMillis();
            this.u = currentTimeMillis;
            if (currentTimeMillis - this.u >= v) {
                if (z2) {
                    d dVar = this.t;
                    if (dVar == null || !dVar.isOpenNewSearchContainer()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (!p() || !z3) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    SearchIntermediateViewModel searchIntermediateViewModel = this.p;
                    if (searchIntermediateViewModel == null || !searchIntermediateViewModel.backFromSearchResult) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    String str3 = "search_bar_outer";
                    if (!z5 || (!g() && z4)) {
                        str2 = str3;
                    } else {
                        str2 = "search_bar_inner";
                    }
                    if (!(true ^ SearchEnterViewModel.a.a(requireActivity()).a())) {
                        str3 = str2;
                    }
                    bk w2 = new bj().y(q()).a(SearchEnterViewModel.a.a(getActivity()).f82794a.obtainLogData("tab_name")).d((Integer) 0).v(str3).w(trim);
                    Word word = this.w;
                    String str4 = "";
                    if (word == null) {
                        id = str4;
                    } else {
                        id = word.getId();
                    }
                    c cVar = (c) w2.i(id);
                    Word word2 = this.w;
                    if (word2 != null) {
                        str4 = word2.getImplId();
                    }
                    ((bk) cVar.d(str4).a((Integer) -1)).x(trim).f();
                }
                a(new d().setKeyword(trim).setSearchFrom(b(z2)).setOpenNewSearchContainer(new AtomicBoolean(false).get()));
                this.z.a();
                com.ss.android.ugc.aweme.discover.g.a aVar = (com.ss.android.ugc.aweme.discover.g.a) this.f82361l.getFragment();
                if (aVar != null && getActivity() != null) {
                    aVar.aX_();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (DiscoveryServiceImpl.g().e()) {
            View a2 = com.a.b.a.a(getContext(), h(), viewGroup, false);
            a(a2);
            return a2;
        } else if (DiscoveryServiceImpl.g().f()) {
            View a3 = com.a.b.c.a(getActivity(), h(), viewGroup, false);
            a(a3);
            return a3;
        } else {
            View inflate = com.ss.android.ugc.aweme.performance.j.INSTANCE.inflate(layoutInflater, getContext(), h(), viewGroup);
            a(inflate);
            return inflate;
        }
    }
}
