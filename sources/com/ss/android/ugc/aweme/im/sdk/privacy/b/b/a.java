package com.ss.android.ugc.aweme.im.sdk.privacy.b.b;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.ss.android.ugc.aweme.compliance.api.model.p;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.im.sdk.privacy.viewmodel.MessagingPrivacyViewModel;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class a extends Fragment implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public static final C2602a f102920f = new C2602a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f102921a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f102922b;

    /* renamed from: c  reason: collision with root package name */
    public TuxButton f102923c;

    /* renamed from: d  reason: collision with root package name */
    TuxTextView f102924d;

    /* renamed from: e  reason: collision with root package name */
    TuxTextView f102925e;

    /* renamed from: g  reason: collision with root package name */
    private TuxButton f102926g;

    /* renamed from: h  reason: collision with root package name */
    private final h f102927h = i.a((h.f.a.a) new f(this));

    /* renamed from: i  reason: collision with root package name */
    private HashMap f102928i;

    public interface b {
        static {
            Covode.recordClassIndex(65977);
        }

        void onCancel();

        void onSetPrivacyValue(int i2);
    }

    static {
        Covode.recordClassIndex(65975);
    }

    private final MessagingPrivacyViewModel a() {
        return (MessagingPrivacyViewModel) this.f102927h.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.b.b.a$a  reason: collision with other inner class name */
    public static final class C2602a {
        static {
            Covode.recordClassIndex(65976);
        }

        private C2602a() {
        }

        public /* synthetic */ C2602a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f102928i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static final class f extends m implements h.f.a.a<MessagingPrivacyViewModel> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(65981);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MessagingPrivacyViewModel invoke() {
            a aVar = this.this$0;
            l.d(aVar, "");
            ac a2 = ae.a(aVar, (ad.b) null).a(MessagingPrivacyViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f102930a;

        static {
            Covode.recordClassIndex(65979);
        }

        d(a aVar) {
            this.f102930a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            p pVar = (p) obj;
            b bVar = this.f102930a.f102921a;
            if (bVar != null) {
                bVar.onSetPrivacyValue(pVar.getValue());
            }
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f102929a;

        static {
            Covode.recordClassIndex(65978);
        }

        c(a aVar) {
            this.f102929a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            TuxButton tuxButton = this.f102929a.f102923c;
            if (tuxButton == null) {
                l.a("okButton");
            }
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            tuxButton.setEnabled(z);
            RecyclerView recyclerView = this.f102929a.f102922b;
            if (recyclerView == null) {
                l.a("recyclerView");
            }
            RecyclerView.a adapter = recyclerView.getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.privacy.ui.adapter.MessagingPrivacyAdapter");
            com.ss.android.ugc.aweme.im.sdk.privacy.b.a.a aVar = (com.ss.android.ugc.aweme.im.sdk.privacy.b.a.a) adapter;
            int i2 = aVar.f102915a;
            aVar.f102915a = n.a((List) aVar.f102917c, obj);
            if (i2 != -1 && i2 != aVar.f102915a) {
                aVar.notifyItemChanged(i2, false);
            }
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f102931a;

        static {
            Covode.recordClassIndex(65980);
        }

        e(a aVar) {
            this.f102931a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                a aVar = this.f102931a;
                if (booleanValue) {
                    TuxTextView tuxTextView = aVar.f102924d;
                    if (tuxTextView == null) {
                        l.a("headerText");
                    }
                    tuxTextView.setText(aVar.getResources().getString(R.string.b9r));
                    TuxTextView tuxTextView2 = aVar.f102925e;
                    if (tuxTextView2 == null) {
                        l.a("descText");
                    }
                    tuxTextView2.setText(aVar.getResources().getString(R.string.b9q));
                    return;
                }
                TuxTextView tuxTextView3 = aVar.f102924d;
                if (tuxTextView3 == null) {
                    l.a("headerText");
                }
                tuxTextView3.setText(aVar.getResources().getString(R.string.b_2));
                TuxTextView tuxTextView4 = aVar.f102925e;
                if (tuxTextView4 == null) {
                    l.a("descText");
                }
                tuxTextView4.setText(androidx.core.f.b.a(aVar.getResources().getString(R.string.b_1), 0));
            }
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        TuxButton tuxButton = this.f102923c;
        if (tuxButton == null) {
            l.a("okButton");
        }
        if (l.a(view, tuxButton)) {
            MessagingPrivacyViewModel a2 = a();
            p value = a2.f102945d.getValue();
            if (value != null) {
                a2.f102948g.a(a2.f102949h.setChatAuthority(value.getValue()).b(a2.f102952k).a(a2.f102951j).b(new MessagingPrivacyViewModel.b(value, a2)));
                return;
            }
            return;
        }
        TuxButton tuxButton2 = this.f102926g;
        if (tuxButton2 == null) {
            l.a("cancelButton");
        }
        if (l.a(view, tuxButton2)) {
            a().a(false);
            b bVar = this.f102921a;
            if (bVar != null) {
                bVar.onCancel();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<p> list;
        String str;
        int i2;
        int i3;
        String str2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getInt("chat_set_extra");
        }
        IPrivacyService d2 = PrivacyServiceImpl.d();
        l.b(d2, "");
        boolean z = false;
        o a2 = d2.a(0, "chatsets");
        View findViewById = view.findViewById(R.id.b9g);
        l.b(findViewById, "");
        this.f102924d = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.b9e);
        l.b(findViewById2, "");
        this.f102925e = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.za);
        l.b(findViewById3, "");
        this.f102923c = (TuxButton) findViewById3;
        View findViewById4 = view.findViewById(R.id.z_);
        l.b(findViewById4, "");
        this.f102926g = (TuxButton) findViewById4;
        View findViewById5 = view.findViewById(R.id.czx);
        l.b(findViewById5, "");
        RecyclerView recyclerView = (RecyclerView) findViewById5;
        this.f102922b = recyclerView;
        if (recyclerView == null) {
            l.a("recyclerView");
        }
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        MessagingPrivacyViewModel a3 = a();
        if (a2 == null || (list = a2.getValues()) == null) {
            list = z.INSTANCE;
        }
        recyclerView.setAdapter(new com.ss.android.ugc.aweme.im.sdk.privacy.b.a.a(a3, list));
        Drawable c2 = y.c(R.drawable.ars);
        if (c2 == null) {
            l.b();
        }
        com.ss.android.ugc.aweme.ai.b bVar = new com.ss.android.ugc.aweme.ai.b(c2);
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.l5);
        bVar.f66334a = dimensionPixelSize;
        bVar.f66335b = dimensionPixelSize;
        recyclerView.a(bVar);
        MessagingPrivacyViewModel a4 = a();
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString("enter_from_extra")) == null) {
            str = "";
        }
        l.b(str, "");
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            i2 = arguments3.getInt("user_type_extra");
        } else {
            i2 = 0;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            i3 = arguments4.getInt("open_count_extra");
        } else {
            i3 = 0;
        }
        l.d(str, "");
        a4.f102944c = str;
        if (i2 == 1) {
            str2 = "existing";
        } else if (i2 != 2) {
            str2 = "non_teenager";
        } else {
            str2 = "new";
        }
        a4.f102943b = str2;
        a4.f102942a = i3;
        t<Boolean> tVar = a4.f102947f;
        if (i2 == 1) {
            z = true;
        }
        tVar.setValue(Boolean.valueOf(z));
        a4.f102945d.observe(this, new c(this));
        a4.f102946e.observe(this, new d(this));
        a4.f102947f.observe(this, new e(this));
        String str3 = a4.f102944c;
        String str4 = a4.f102943b;
        int i4 = a4.f102942a;
        androidx.c.a aVar = new androidx.c.a();
        aVar.put("enter_from", str3);
        aVar.put("user_type", str4);
        aVar.put("times", String.valueOf(i4));
        r.a("show_dm_permission_pop_up", aVar);
        TuxButton tuxButton = this.f102923c;
        if (tuxButton == null) {
            l.a("okButton");
        }
        tuxButton.setOnClickListener(this);
        TuxButton tuxButton2 = this.f102926g;
        if (tuxButton2 == null) {
            l.a("cancelButton");
        }
        tuxButton2.setOnClickListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a4w, viewGroup, false);
    }
}
