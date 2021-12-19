package com.ss.android.ugc.aweme.account.agegate.b;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.agegate.api.CalculateDoBApi;
import com.ss.android.ugc.aweme.account.agegate.d.c;
import com.ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker;
import com.ss.android.ugc.aweme.account.experiment.a;
import com.ss.android.ugc.aweme.account.login.f.a;
import com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator;
import com.ss.android.ugc.aweme.account.ui.InputWithIndicator;
import com.ss.android.ugc.aweme.account.ui.LoadingButton;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.utils.hk;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class a extends b implements DatePicker.a {
    private final h.h A = h.i.a((h.f.a.a) d.f62637a);
    private f.a.b.b B;
    private HashMap C;

    /* renamed from: a  reason: collision with root package name */
    public int f62630a;

    /* renamed from: b  reason: collision with root package name */
    public int f62631b;

    /* renamed from: c  reason: collision with root package name */
    public int f62632c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f62633d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f62634e = true;

    /* renamed from: j  reason: collision with root package name */
    public long f62635j;
    private final h.h y = h.i.a((h.f.a.a) C1373a.f62636a);
    private Date z;

    static {
        Covode.recordClassIndex(38556);
    }

    private final f.a.l.c<Boolean> E() {
        return (f.a.l.c) this.A.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.account.agegate.b.b
    public final View c(int i2) {
        if (this.C == null) {
            this.C = new HashMap();
        }
        View view = (View) this.C.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.C.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.account.agegate.b.b
    public final void h() {
        HashMap hashMap = this.C;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.a$a  reason: collision with other inner class name */
    static final class C1373a extends m implements h.f.a.a<com.ss.android.ugc.aweme.account.agegate.d.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1373a f62636a = new C1373a();

        static {
            Covode.recordClassIndex(38557);
        }

        C1373a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.account.agegate.d.c invoke() {
            return new com.ss.android.ugc.aweme.account.agegate.d.c();
        }
    }

    static final class d extends m implements h.f.a.a<f.a.l.c<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f62637a = new d();

        static {
            Covode.recordClassIndex(38560);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.l.c<Boolean> invoke() {
            return new f.a.l.c();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.bytedance.analytics.b.a(this);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        if (a.b.a()) {
            return R.layout.he;
        }
        return R.layout.hf;
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.b.b, com.ss.android.ugc.aweme.account.agegate.e.a
    public final void e() {
        f.a.b.b bVar;
        super.e();
        f.a.b.b bVar2 = this.B;
        if (!(bVar2 == null || bVar2.isDisposed() || (bVar = this.B) == null)) {
            bVar.dispose();
        }
        this.B = E().d(200, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new e(this));
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.account.agegate.b.b, androidx.fragment.app.Fragment
    public final void onStart() {
        String str;
        super.onStart();
        InputWithIndicator inputWithIndicator = (InputWithIndicator) c(R.id.ib);
        String str2 = null;
        if (inputWithIndicator != null) {
            str = inputWithIndicator.getText();
        } else {
            str = null;
        }
        if (hk.a(str)) {
            com.ss.android.ugc.aweme.account.agegate.d.a i2 = i();
            InputWithIndicator inputWithIndicator2 = (InputWithIndicator) c(R.id.ib);
            if (inputWithIndicator2 != null) {
                str2 = inputWithIndicator2.getText();
            }
            Date a2 = i2.a(str2);
            if (a2 != null) {
                ((DatePicker) c(R.id.i7)).a(a2);
                com.ss.android.ugc.aweme.account.agegate.d.a i3 = i();
                Calendar calendar = i3.f62766b.getCalendar();
                calendar.setTime(a2);
                i3.a(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.b.b
    public final void g() {
        String str;
        String str2;
        InputWithIndicator inputWithIndicator;
        EditText editText;
        super.g();
        ((DatePicker) c(R.id.i7)).f62899a = this;
        InputWithIndicator inputWithIndicator2 = (InputWithIndicator) c(R.id.ie);
        int i2 = 8;
        if (inputWithIndicator2 == null || inputWithIndicator2.getVisibility() != 8) {
            a(false);
        } else {
            InputWithIndicator inputWithIndicator3 = (InputWithIndicator) c(R.id.ib);
            if (!(inputWithIndicator3 == null || (editText = inputWithIndicator3.getEditText()) == null)) {
                editText.setInputType(0);
            }
        }
        if (((b) this).f62650m) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT);
                Bundle arguments = getArguments();
                if (arguments == null || (str = arguments.getString("default_dob")) == null) {
                    str = "";
                }
                Date parse = simpleDateFormat.parse(str);
                Calendar instance = Calendar.getInstance();
                Bundle arguments2 = getArguments();
                if (arguments2 == null || (str2 = arguments2.getString("upper_bound_date")) == null) {
                    str2 = "";
                }
                instance.setTime(simpleDateFormat.parse(str2));
                com.ss.android.ugc.aweme.account.agegate.b.a((DatePicker) c(R.id.i7), instance, parse);
                if (this.n == 2 && (inputWithIndicator = (InputWithIndicator) c(R.id.ib)) != null) {
                    String format = DateFormat.getDateInstance(1, new Locale(((ILanguageService) com.ss.android.ugc.aweme.a.a(ILanguageService.class)).a(), com.ss.android.ugc.aweme.language.d.a())).format(parse);
                    l.b(format, "");
                    inputWithIndicator.setText(format);
                }
            } catch (Exception unused) {
                com.ss.android.ugc.aweme.account.agegate.b.a((DatePicker) c(R.id.i7), null);
            }
            a(c(R.id.i9), new f(this));
        } else {
            com.ss.android.ugc.aweme.account.agegate.b.a((DatePicker) c(R.id.i7), this.z);
            a(c(R.id.i9), new g(this));
        }
        TuxTextView tuxTextView = (TuxTextView) c(R.id.czd);
        l.b(tuxTextView, "");
        if (com.ss.android.ugc.aweme.account.experiment.c.a() && this.f62633d) {
            i2 = 0;
        }
        tuxTextView.setVisibility(i2);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.account.agegate.b.b, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        super.onDestroyView();
        DateFormat dateInstance = DateFormat.getDateInstance(3, new Locale(((ILanguageService) com.ss.android.ugc.aweme.a.a(ILanguageService.class)).a(), com.ss.android.ugc.aweme.language.d.a()));
        Objects.requireNonNull(dateInstance, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        String localizedPattern = ((SimpleDateFormat) dateInstance).toLocalizedPattern();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        l.b(localizedPattern, "");
        Locale locale = Locale.ROOT;
        l.b(locale, "");
        Objects.requireNonNull(localizedPattern, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = localizedPattern.toLowerCase(locale);
        l.b(lowerCase, "");
        int length = lowerCase.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = lowerCase.charAt(i2);
            if (!hashSet.contains(Character.valueOf(charAt))) {
                if (charAt == 'd') {
                    arrayList.add("dd");
                } else if (charAt == 'm') {
                    arrayList.add("mm");
                } else if (charAt == 'y') {
                    arrayList.add("yyyy");
                }
                hashSet.add(Character.valueOf(charAt));
            }
        }
        String a2 = n.a(arrayList, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62);
        int i3 = this.f62630a;
        int i4 = this.f62631b;
        int i5 = this.f62632c;
        boolean z2 = this.f62633d;
        boolean z3 = ((b) this).f62650m;
        l.d(a2, "");
        if (z3) {
            str = "age_edit_scroll_results";
        } else {
            str = "age_scroll_result";
        }
        r.a(str, new com.ss.android.ugc.aweme.account.a.b.a().a("default_format", a2).a("day", i3).a("month", i4).a("year", i5).a("selected_cnt", Math.max(i3, Math.max(i4, i5))).a("is_submit", z2 ? 1 : 0).f62575a);
        this.f62630a = 0;
        this.f62631b = 0;
        this.f62632c = 0;
        h();
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ h.f.a.b $showDialog;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(38558);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, h.f.a.b bVar) {
            super(1);
            this.this$0 = aVar;
            this.$showDialog = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = num.intValue();
            this.this$0.b(false);
            this.$showDialog.invoke(Integer.valueOf(intValue));
            return z.f158842a;
        }
    }

    static final class h extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(38566);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.c(R.string.asg, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.account.agegate.b.a.h.AnonymousClass1 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(38567);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    r.a("age_edit_confirm_popup_result", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", "age_edit_page").a("is_confirm", 1).f62575a);
                    this.this$0.this$0.i().a(!((b) this.this$0.this$0).f62649l, ((b) this.this$0.this$0).f62650m);
                    return z.f158842a;
                }
            });
            bVar2.a(R.string.bjc, AnonymousClass2.f62641a);
            return z.f158842a;
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f62638a;

        static {
            Covode.recordClassIndex(38561);
        }

        e(a aVar) {
            this.f62638a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            l.b(bool, "");
            if (bool.booleanValue()) {
                a aVar = this.f62638a;
                InputWithIndicator inputWithIndicator = (InputWithIndicator) aVar.c(R.id.ib);
                l.b(inputWithIndicator, "");
                IBinder windowToken = inputWithIndicator.getWindowToken();
                l.b(windowToken, "");
                aVar.a(windowToken);
            }
            this.f62638a.a(bool.booleanValue());
        }
    }

    static final class i extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(38569);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            if (com.ss.android.ugc.aweme.account.experiment.c.a()) {
                bVar2.a(R.string.c7, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                    /* class com.ss.android.ugc.aweme.account.agegate.b.a.i.AnonymousClass1 */
                    final /* synthetic */ i this$0;

                    static {
                        Covode.recordClassIndex(38570);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                        String str;
                        l.d(aVar, "");
                        com.ss.android.ugc.aweme.account.a.b.a a2 = new com.ss.android.ugc.aweme.account.a.b.a().a("result", "ok");
                        if (((b) this.this$0.this$0).f62649l) {
                            str = "existing";
                        } else {
                            str = "new";
                        }
                        r.a("confirmation_pop_up_response", a2.a("user_type", str).f62575a);
                        TuxTextView tuxTextView = (TuxTextView) this.this$0.this$0.c(R.id.czd);
                        l.b(tuxTextView, "");
                        tuxTextView.setVisibility(0);
                        return z.f158842a;
                    }
                });
            } else {
                bVar2.a(R.string.fha, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                    /* class com.ss.android.ugc.aweme.account.agegate.b.a.i.AnonymousClass2 */
                    final /* synthetic */ i this$0;

                    static {
                        Covode.recordClassIndex(38571);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                        String str;
                        l.d(aVar, "");
                        com.ss.android.ugc.aweme.account.a.b.a a2 = new com.ss.android.ugc.aweme.account.a.b.a().a("result", "go_back_to_edit");
                        if (((b) this.this$0.this$0).f62649l) {
                            str = "existing";
                        } else {
                            str = "new";
                        }
                        r.a("confirmation_pop_up_response", a2.a("user_type", str).f62575a);
                        return z.f158842a;
                    }
                });
                bVar2.a(R.string.fh_, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                    /* class com.ss.android.ugc.aweme.account.agegate.b.a.i.AnonymousClass3 */
                    final /* synthetic */ i this$0;

                    static {
                        Covode.recordClassIndex(38572);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                        String str;
                        l.d(aVar, "");
                        com.ss.android.ugc.aweme.account.a.b.a a2 = new com.ss.android.ugc.aweme.account.a.b.a().a("result", "confirm_date");
                        if (((b) this.this$0.this$0).f62649l) {
                            str = "existing";
                        } else {
                            str = "new";
                        }
                        r.a("confirmation_pop_up_response", a2.a("user_type", str).f62575a);
                        this.this$0.this$0.i().a(!((b) this.this$0.this$0).f62649l, ((b) this.this$0.this$0).f62650m);
                        return z.f158842a;
                    }
                });
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.b.b, com.ss.android.ugc.aweme.account.agegate.e.a
    public final void b(int i2) {
        ((InputResultIndicator) c(R.id.ic)).a(false);
        ((InputWithIndicator) c(R.id.ie)).getEditText().setEnabled(false);
        super.b(i2);
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f62639a;

        static {
            Covode.recordClassIndex(38562);
        }

        f(a aVar) {
            this.f62639a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("click_age_edit_confirm", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", this.f62639a.x()).a("enter_from", "age_edit_page").a("input_time", System.currentTimeMillis() - this.f62639a.f62635j).f62575a);
            this.f62639a.f62633d = true;
            ((b) this.f62639a).f62648k = 0;
            this.f62639a.f62635j = 0;
            this.f62639a.b(true);
            this.f62639a.a(2, new h.f.a.b<Integer, z>(this) {
                /* class com.ss.android.ugc.aweme.account.agegate.b.a.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(38563);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(Integer num) {
                    Editable editable;
                    int i2;
                    EditText editText;
                    int intValue = num.intValue();
                    a aVar = this.this$0.f62639a;
                    if (aVar.getActivity() != null) {
                        r.a("show_age_edit_confirm_popup", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", "age_edit_page").f62575a);
                        androidx.fragment.app.e activity = aVar.getActivity();
                        if (activity == null) {
                            l.b();
                        }
                        l.b(activity, "");
                        com.bytedance.tux.dialog.b bVar = new com.bytedance.tux.dialog.b(activity);
                        Object[] objArr = new Object[1];
                        InputWithIndicator inputWithIndicator = (InputWithIndicator) aVar.c(R.id.ib);
                        if (inputWithIndicator == null || (editText = inputWithIndicator.getEditText()) == null || (editable = editText.getText()) == null) {
                            editable = "";
                        }
                        objArr[0] = editable;
                        com.bytedance.tux.dialog.b a2 = com.bytedance.tux.dialog.b.c.a(bVar.b(aVar.getString(R.string.qq, objArr)).d(aVar.a(intValue)), new h(aVar));
                        androidx.fragment.app.e activity2 = aVar.getActivity();
                        if (activity2 == null) {
                            l.b();
                        }
                        l.b(activity2, "");
                        TuxTextView tuxTextView = new TuxTextView(activity2, null, 0, 6);
                        if (aVar.o == 1) {
                            i2 = R.string.h7k;
                        } else {
                            i2 = R.string.qp;
                        }
                        tuxTextView.setText(aVar.getString(i2));
                        tuxTextView.setTuxFont(41);
                        tuxTextView.setTextColor(androidx.core.content.b.c(tuxTextView.getContext(), R.color.c4));
                        tuxTextView.setGravity(17);
                        ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.a.c.a(a2, tuxTextView).a(false)).a().b().show();
                    }
                    return z.f158842a;
                }
            });
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f62640a;

        static {
            Covode.recordClassIndex(38564);
        }

        g(a aVar) {
            this.f62640a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("choose_birthday_next", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", this.f62640a.x()).f62575a);
            ((b) this.f62640a).f62648k = 0;
            if (com.bytedance.ies.abmock.b.a().a(true, "age_gate_only_year_confirm_dialog", false) == com.ss.android.ugc.aweme.account.experiment.d.f62980a && this.f62640a.f62634e && this.f62640a.f62632c > 0 && this.f62640a.f62631b == 0 && this.f62640a.f62630a == 0) {
                this.f62640a.b(true);
                this.f62640a.a(1, new h.f.a.b<Integer, z>(this) {
                    /* class com.ss.android.ugc.aweme.account.agegate.b.a.g.AnonymousClass1 */
                    final /* synthetic */ g this$0;

                    static {
                        Covode.recordClassIndex(38565);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(Integer num) {
                        String str;
                        String str2;
                        num.intValue();
                        a aVar = this.this$0.f62640a;
                        if (aVar.getActivity() != null) {
                            com.ss.android.ugc.aweme.account.a.b.a a2 = new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", "only_scroll_year");
                            if (((b) aVar).f62649l) {
                                str = "existing";
                            } else {
                                str = "new";
                            }
                            r.a("show_confirmation_pop_up", a2.a("user_type", str).f62575a);
                            InputWithIndicator inputWithIndicator = (InputWithIndicator) aVar.c(R.id.ib);
                            if (inputWithIndicator == null || (str2 = inputWithIndicator.getText()) == null) {
                                str2 = "";
                            }
                            androidx.fragment.app.e activity = aVar.getActivity();
                            if (activity == null) {
                                l.b();
                            }
                            l.b(activity, "");
                            com.bytedance.tux.dialog.b a3 = new com.bytedance.tux.dialog.b(activity).b(aVar.getString(R.string.fh8));
                            String string = aVar.getString(R.string.fh7, str2);
                            l.b(string, "");
                            com.bytedance.tux.dialog.b c2 = a3.d(aVar.a(string, str2));
                            if (com.bytedance.ies.abmock.b.a().a(true, "age_gate_only_year_confirm_dialog_desc", false) == com.ss.android.ugc.aweme.account.experiment.b.f62976a) {
                                androidx.fragment.app.e activity2 = aVar.getActivity();
                                if (activity2 == null) {
                                    l.b();
                                }
                                l.b(activity2, "");
                                TuxTextView tuxTextView = new TuxTextView(activity2, null, 0, 6);
                                tuxTextView.setText(aVar.getString(R.string.fh9));
                                tuxTextView.setTuxFont(41);
                                tuxTextView.setTextColor(androidx.core.content.b.c(tuxTextView.getContext(), R.color.c4));
                                tuxTextView.setGravity(17);
                                com.bytedance.tux.dialog.a.c.a(c2, tuxTextView);
                            }
                            ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a(c2, new i(aVar)).a(false)).a().b().show();
                            aVar.f62634e = false;
                        }
                        return z.f158842a;
                    }
                });
            } else {
                this.f62640a.i().a(!((b) this.f62640a).f62649l, ((b) this.f62640a).f62650m);
            }
            this.f62640a.f62633d = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final SpannableStringBuilder a(int i2) {
        int i3;
        Locale locale = Locale.ROOT;
        Resources resources = getResources();
        if (this.o == 1) {
            i3 = R.plurals.ip;
        } else {
            i3 = R.plurals.o;
        }
        String quantityString = resources.getQuantityString(i3, i2);
        l.b(quantityString, "");
        String a2 = com.a.a(locale, quantityString, Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
        l.b(a2, "");
        int a3 = p.a((CharSequence) a2, String.valueOf(i2), 0, false, 6);
        int length = String.valueOf(i2).length() + a3;
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a2);
            Context context = getContext();
            if (context == null) {
                l.b();
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(context, R.color.bx)), a3, length, 18);
            spannableStringBuilder.setSpan(new StyleSpan(1), a3, length, 18);
            return spannableStringBuilder;
        } catch (Exception unused) {
            return new SpannableStringBuilder(a2);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.e.a
    public final void b(boolean z2) {
        if (!ab_()) {
            return;
        }
        if (z2) {
            ((InputResultIndicator) c(R.id.ic)).a(true);
            ((InputWithIndicator) c(R.id.ie)).getEditText().setEnabled(true);
            LinearLayout linearLayout = (LinearLayout) c(R.id.i_);
            l.b(linearLayout, "");
            linearLayout.setVisibility(8);
            ((LoadingButton) c(R.id.i9)).a(true);
            return;
        }
        ((LoadingButton) c(R.id.i9)).b(true);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.e.a
    public final void a(String str) {
        InputWithIndicator inputWithIndicator = (InputWithIndicator) c(R.id.ib);
        if (inputWithIndicator != null) {
            if (str == null) {
                str = "";
            }
            inputWithIndicator.setText(str);
        }
    }

    public final void a(boolean z2) {
        int i2;
        DatePicker datePicker = (DatePicker) c(R.id.i7);
        l.b(datePicker, "");
        int i3 = 0;
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        datePicker.setVisibility(i2);
        Button button = (Button) c(R.id.ia);
        l.b(button, "");
        if (!z2) {
            i3 = 8;
        }
        button.setVisibility(i3);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.b.b
    public final void a(View view, boolean z2) {
        l.d(view, "");
        super.a(view, z2);
        E().onNext(Boolean.valueOf(z2));
    }

    /* access modifiers changed from: package-private */
    public final SpannableStringBuilder a(String str, String str2) {
        int a2 = p.a((CharSequence) str, str2, 0, false, 6);
        int length = str2.length() + a2;
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            Context context = getContext();
            if (context == null) {
                l.b();
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(context, R.color.bx)), a2, length, 18);
            spannableStringBuilder.setSpan(new com.bytedance.tux.f.a.b(42), a2, length, 18);
            return spannableStringBuilder;
        } catch (Exception unused) {
            return new SpannableStringBuilder(str);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.m<Integer, String, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(38559);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Integer num, String str) {
            int intValue = num.intValue();
            String str2 = str;
            l.d(str2, "");
            this.this$0.b(false);
            if (intValue == 56004) {
                this.this$0.c(str2);
            } else {
                com.ss.android.ugc.aweme.account.agegate.util.f.a(this.this$0.a(new a.e(intValue)));
                if (b.r.contains(Integer.valueOf(intValue))) {
                    this.this$0.a(str2, intValue);
                } else {
                    com.bytedance.tux.g.b bVar = new com.bytedance.tux.g.b(this.this$0);
                    if (TextUtils.isEmpty(str2)) {
                        str2 = this.this$0.getString(R.string.g21);
                        l.b(str2, "");
                    }
                    bVar.a(str2).b();
                }
            }
            return z.f158842a;
        }
    }

    public final void a(int i2, h.f.a.b<? super Integer, z> bVar) {
        boolean z2;
        this.y.getValue();
        String d2 = ((com.ss.android.ugc.aweme.account.agegate.model.b) i().f76396h).d();
        l.b(d2, "");
        b bVar2 = new b(this, bVar);
        c cVar = new c(this);
        int i3 = 1;
        if (((b) this).f62649l || ((b) this).f62650m) {
            z2 = false;
        } else {
            z2 = true;
        }
        l.d(d2, "");
        l.d(bVar2, "");
        l.d(cVar, "");
        if (!z2) {
            i3 = 2;
        }
        l.d(d2, "");
        CalculateDoBApi.a.f62623a.calculateDoB(d2, i2, i3).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c.a(bVar2, cVar), new c.b(cVar));
    }

    @Override // com.ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker.a
    public final void a(DatePicker datePicker, int i2, int i3, int i4, Calendar calendar, int i5) {
        l.d(datePicker, "");
        l.d(calendar, "");
        i().a(i2, i3, i4);
        ((InputResultIndicator) c(R.id.ic)).a(true);
        ((InputWithIndicator) c(R.id.ie)).getEditText().setEnabled(true);
        LinearLayout linearLayout = (LinearLayout) c(R.id.i_);
        l.b(linearLayout, "");
        linearLayout.setVisibility(8);
        if (this.f62635j == 0) {
            this.f62635j = System.currentTimeMillis();
        }
        this.z = calendar.getTime();
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3 && this.f62630a == 0) {
                    this.f62630a = Math.max(this.f62631b, this.f62632c) + 1;
                }
            } else if (this.f62631b == 0) {
                this.f62631b = Math.max(this.f62630a, this.f62632c) + 1;
            }
        } else if (this.f62632c == 0) {
            this.f62632c = Math.max(this.f62630a, this.f62631b) + 1;
        }
    }
}
