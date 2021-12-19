package com.ss.android.ugc.aweme.contentlanguage;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.contentlanguage.api.LanguageApi;
import com.ss.android.ugc.aweme.contentlanguage.j;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.user.e;
import com.ss.android.ugc.aweme.user.f;
import com.ss.android.ugc.aweme.views.o;
import com.zhiliaoapp.musically.R;
import f.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class i extends o implements View.OnClickListener, n {

    /* renamed from: a  reason: collision with root package name */
    public h f78184a;

    /* renamed from: b  reason: collision with root package name */
    public String f78185b;

    /* renamed from: c  reason: collision with root package name */
    public long f78186c;

    /* renamed from: d  reason: collision with root package name */
    private final o f78187d = new o();

    /* renamed from: e  reason: collision with root package name */
    private final LanguageApi f78188e = ((LanguageApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(LanguageApi.class));

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<String> f78189f = new ArrayList<>();

    static {
        Covode.recordClassIndex(48475);
    }

    public static final class b implements z<BaseResponse> {
        static {
            Covode.recordClassIndex(48477);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            l.d(baseResponse, "");
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        b();
    }

    @Override // com.ss.android.ugc.aweme.views.o
    public final void onStart() {
        super.onStart();
        this.f78186c = System.currentTimeMillis();
    }

    private final void d() {
        ArrayList<String> arrayList;
        float f2;
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.za);
        l.b(tuxTextView, "");
        h hVar = this.f78184a;
        if (hVar != null) {
            arrayList = hVar.f78173b;
        } else {
            arrayList = null;
        }
        tuxTextView.setEnabled(!com.bytedance.common.utility.collection.b.a((Collection) arrayList));
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.za);
        l.b(tuxTextView2, "");
        TuxTextView tuxTextView3 = (TuxTextView) findViewById(R.id.za);
        l.b(tuxTextView3, "");
        if (tuxTextView3.isEnabled()) {
            f2 = 1.0f;
        } else {
            f2 = 0.5f;
        }
        tuxTextView2.setAlpha(f2);
    }

    @Override // com.ss.android.ugc.aweme.views.o
    public final void aj_() {
        super.aj_();
        this.f144695l = (int) n.b(getContext(), 280.0f);
        double b2 = (double) n.b(getContext());
        Double.isNaN(b2);
        this.f144696m = (int) (b2 * 0.67d);
    }

    public final void b() {
        if (this.f78186c > 0) {
            d a2 = new d().a("enter_from", this.f78185b).a("duration", System.currentTimeMillis() - this.f78186c).a("icon_load", this.f78189f.size());
            Integer a3 = HybridABInfoService.b().a();
            if (a3 != null) {
                a2.a("is_ab_backend_resp_received", a3.intValue());
            }
            r.a("popup_duration", a2.f66730a);
            this.f78186c = 0;
            this.f78189f.size();
        }
    }

    private final void c() {
        setCanceledOnTouchOutside(false);
        setOnShowListener(new a(this));
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.title);
        l.b(tuxTextView, "");
        tuxTextView.setText(b.a().getTitle());
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.ak7);
        l.b(tuxTextView2, "");
        tuxTextView2.setText(b.a().getText());
        ((TuxTextView) findViewById(R.id.za)).setOnClickListener(this);
        d();
        ((TuxIconView) findViewById(R.id.y3)).setOnClickListener(this);
        this.f78184a = new h(this.f78185b, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.djs);
        l.b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(2));
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.djs);
        l.b(recyclerView2, "");
        recyclerView2.setAdapter(this.f78184a);
        ((RecyclerView) findViewById(R.id.djs)).a(new m());
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.n
    public final void a(String str) {
        l.d(str, "");
        d();
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.n
    public final void b(String str) {
        if (!TextUtils.isEmpty(str) && !h.a.n.a((Iterable) this.f78189f, (Object) str)) {
            ArrayList<String> arrayList = this.f78189f;
            if (str == null) {
                l.b();
            }
            arrayList.add(str);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f78190a;

        static {
            Covode.recordClassIndex(48476);
        }

        a(i iVar) {
            this.f78190a = iVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            String str;
            j.a.a().c();
            d a2 = new d().a("enter_from", this.f78190a.f78185b);
            if (f.a(e.f142364k.a())) {
                str = "1";
            } else {
                str = "0";
            }
            d a3 = a2.a("is_login", str);
            Integer a4 = HybridABInfoService.b().a();
            if (a4 != null) {
                a3.a("is_ab_backend_resp_received", a4.intValue());
            }
            r.a("show_content_language_popup", a3.f66730a);
        }
    }

    public final void onClick(View view) {
        ArrayList<String> arrayList;
        ClickAgent.onClick(view);
        Integer num = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        }
        if (num != null) {
            if (num.intValue() == R.id.y3) {
                r.a("choose_content_language_popup", new d().a("enter_from", this.f78185b).a("language_type", "cancel").f66730a);
                dismiss();
            } else if (num.intValue() == R.id.za) {
                h hVar = this.f78184a;
                if (hVar == null || (arrayList = hVar.f78173b) == null || com.bytedance.common.utility.collection.b.a((Collection) arrayList)) {
                    r.a("click_content_language_popup", new d().a("enter_from", this.f78185b).a("language_type", "ok").a("click_type", "null").f66730a);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                int i2 = 0;
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                    if (i2 != arrayList.size() - 1) {
                        sb.append(",");
                    }
                    i2++;
                }
                if (f.a(e.f142364k.a())) {
                    this.f78188e.setContentLanguage("content_language", sb.toString(), 1).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new b());
                } else {
                    o oVar = this.f78187d;
                    String sb2 = sb.toString();
                    l.b(sb2, "");
                    oVar.a(sb2);
                }
                r.a("choose_content_language_popup", new d().a("enter_from", this.f78185b).a("language_type", sb.toString()).f66730a);
                dismiss();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(Context context, String str) {
        super(context);
        l.d(context, "");
        l.d(str, "");
        this.f78185b = str;
        setContentView(R.layout.x6);
        c();
    }
}
