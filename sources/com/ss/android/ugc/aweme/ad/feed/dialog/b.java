package com.ss.android.ugc.aweme.ad.feed.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ad.feed.dialog.DislikeReasonApi;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.j;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public final class b extends d implements View.OnClickListener {

    /* renamed from: g  reason: collision with root package name */
    public static final a f65824g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    boolean f65825a = true;

    /* renamed from: b  reason: collision with root package name */
    final f.a.b.a f65826b;

    /* renamed from: c  reason: collision with root package name */
    final AwemeRawAd f65827c;

    /* renamed from: d  reason: collision with root package name */
    final String f65828d;

    /* renamed from: e  reason: collision with root package name */
    final d f65829e;

    /* renamed from: f  reason: collision with root package name */
    final Long f65830f;

    /* renamed from: h  reason: collision with root package name */
    private final List<com.ss.android.ugc.aweme.commercialize.model.d> f65831h;

    /* renamed from: i  reason: collision with root package name */
    private HashMap f65832i;

    static {
        Covode.recordClassIndex(40502);
    }

    private View a(int i2) {
        if (this.f65832i == null) {
            this.f65832i = new HashMap();
        }
        View view = (View) this.f65832i.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f65832i.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40503);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static b a(AwemeRawAd awemeRawAd, String str, d dVar, Long l2) {
            l.d(dVar, "");
            return new b(awemeRawAd, str, dVar, l2);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f65826b.dispose();
        HashMap hashMap = this.f65832i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.fg);
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (view != null && view.getId() == R.id.bve) {
            this.f65825a = false;
            dismiss();
            this.f65829e.a();
            e activity = getActivity();
            if (activity != null) {
                l.b(activity, "");
                new com.bytedance.tux.g.b(activity).e(R.string.b9b).b();
            }
            r.onEventV3("cancel_subcategory");
        }
    }

    @Override // androidx.fragment.app.d
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f65825a) {
            this.f65829e.a();
            r.onEventV3("cancel_subcategory");
            e activity = getActivity();
            if (activity != null) {
                l.b(activity, "");
                new com.bytedance.tux.g.b(activity).e(R.string.b9b).b();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        a aVar;
        Window window;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.setGravity(80);
            window.setLayout(-1, -2);
        }
        RecyclerView recyclerView = (RecyclerView) a(R.id.dr9);
        l.b(recyclerView, "");
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.dr9);
        l.b(recyclerView2, "");
        List<com.ss.android.ugc.aweme.commercialize.model.d> list = this.f65831h;
        if (list != null) {
            aVar = new a(list, new C1471b(this));
        } else {
            aVar = null;
        }
        recyclerView2.setAdapter(aVar);
        RecyclerView recyclerView3 = (RecyclerView) a(R.id.dr9);
        l.b(recyclerView3, "");
        recyclerView3.setOverScrollMode(2);
        ((TuxIconView) a(R.id.bve)).setOnClickListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.x8, viewGroup, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.dialog.b$b  reason: collision with other inner class name */
    static final /* synthetic */ class C1471b extends j implements q<String, String, Integer, z> {
        static {
            Covode.recordClassIndex(40504);
        }

        C1471b(b bVar) {
            super(3, bVar, b.class, "onViewHolderClick", "onViewHolderClick(Ljava/lang/String;Ljava/lang/String;I)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(String str, String str2, Integer num) {
            String str3;
            String str4;
            String logExtra;
            Long creativeId;
            Long adId;
            String str5 = str;
            int intValue = num.intValue();
            String str6 = "";
            l.d(str5, str6);
            l.d(str2, str6);
            b bVar = (b) this.receiver;
            bVar.f65825a = false;
            bVar.dismiss();
            bVar.f65829e.a();
            e activity = bVar.getActivity();
            if (activity != null) {
                l.b(activity, str6);
                new com.bytedance.tux.g.b(activity).a(str5).b();
            }
            r.a("dislike_subcategory", new com.ss.android.ugc.aweme.app.f.d().a("option_id", intValue).f66730a);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reasons", str2);
            f.a.b.a aVar = bVar.f65826b;
            Object a2 = RetrofitFactory.a().b(DislikeReasonApi.a.f65818a).d().a(DislikeReasonApi.class);
            l.b(a2, str6);
            DislikeReasonApi dislikeReasonApi = (DislikeReasonApi) a2;
            String str7 = bVar.f65828d;
            if (str7 == null) {
                str7 = str6;
            }
            AwemeRawAd awemeRawAd = bVar.f65827c;
            if (awemeRawAd == null || (adId = awemeRawAd.getAdId()) == null || (str3 = String.valueOf(adId.longValue())) == null) {
                str3 = str6;
            }
            AwemeRawAd awemeRawAd2 = bVar.f65827c;
            if (awemeRawAd2 == null || (creativeId = awemeRawAd2.getCreativeId()) == null || (str4 = String.valueOf(creativeId.longValue())) == null) {
                str4 = str6;
            }
            String jSONObject2 = jSONObject.toString();
            l.b(jSONObject2, str6);
            AwemeRawAd awemeRawAd3 = bVar.f65827c;
            if (!(awemeRawAd3 == null || (logExtra = awemeRawAd3.getLogExtra()) == null)) {
                str6 = logExtra;
            }
            aVar.a(dislikeReasonApi.submitReason(str7, str3, str4, jSONObject2, str6, String.valueOf(bVar.f65830f)).b(f.a.h.a.b(f.a.k.a.f158006c)).g());
            return z.f158842a;
        }
    }

    public b(AwemeRawAd awemeRawAd, String str, d dVar, Long l2) {
        List<com.ss.android.ugc.aweme.commercialize.model.d> list;
        com.ss.android.ugc.aweme.commercialize.model.b dislikeInfo;
        l.d(dVar, "");
        this.f65827c = awemeRawAd;
        this.f65828d = str;
        this.f65829e = dVar;
        this.f65830f = l2;
        if (awemeRawAd == null || (dislikeInfo = awemeRawAd.getDislikeInfo()) == null) {
            list = null;
        } else {
            list = dislikeInfo.getCategoryList();
        }
        this.f65831h = list;
        this.f65826b = new f.a.b.a();
    }
}
