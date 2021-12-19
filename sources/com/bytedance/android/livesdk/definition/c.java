package com.bytedance.android.livesdk.definition;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.model.n;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveRadioButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.n.k;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.br;
import com.bytedance.android.livesdk.j.bx;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.di;
import com.bytedance.android.livesdk.j.g;
import com.bytedance.android.livesdk.j.h;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.ap;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdkapi.depend.d.q;
import com.bytedance.android.livesdkapi.depend.model.live.j;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.kakao.usermgmt.StringSet;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class c extends v implements f {

    /* renamed from: c  reason: collision with root package name */
    public static final a f16901c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f16902a;

    /* renamed from: b  reason: collision with root package name */
    public C0348c f16903b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f16904d = true;

    /* renamed from: e  reason: collision with root package name */
    private RecyclerView f16905e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f16906f;

    /* renamed from: g  reason: collision with root package name */
    private HashMap f16907g;

    static {
        Covode.recordClassIndex(9394);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f16907g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f16907g == null) {
            this.f16907g = new HashMap();
        }
        View view = (View) this.f16907g.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f16907g.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(9395);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(Context context, boolean z) {
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putBoolean("key_is_preview", z);
            if (context instanceof androidx.fragment.app.e) {
                cVar.setArguments(bundle);
                i supportFragmentManager = ((androidx.fragment.app.e) context).getSupportFragmentManager();
                l.b(supportFragmentManager, "");
                cVar.show(supportFragmentManager, "LiveDefinitionSelectionDialog");
            }
        }
    }

    @Override // com.bytedance.android.livesdk.definition.f
    public final void d() {
        dismiss();
    }

    /* renamed from: com.bytedance.android.livesdk.definition.c$c  reason: collision with other inner class name */
    public static final class C0348c extends RecyclerView.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public int f16912a;

        /* renamed from: b  reason: collision with root package name */
        public Handler f16913b = new Handler(Looper.getMainLooper());

        /* renamed from: c  reason: collision with root package name */
        public boolean f16914c;

        /* renamed from: d  reason: collision with root package name */
        public final List<d> f16915d;

        /* renamed from: e  reason: collision with root package name */
        public final DataChannel f16916e;

        /* renamed from: f  reason: collision with root package name */
        public final f f16917f;

        /* renamed from: g  reason: collision with root package name */
        private final RecyclerView f16918g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f16919h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f16920i;

        static {
            Covode.recordClassIndex(9397);
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return a(this, viewGroup, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final int getItemCount() {
            return this.f16915d.size();
        }

        /* renamed from: com.bytedance.android.livesdk.definition.c$c$b */
        static final class b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0348c f16927a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f16928b;

            static {
                Covode.recordClassIndex(9400);
            }

            b(C0348c cVar, b bVar) {
                this.f16927a = cVar;
                this.f16928b = bVar;
            }

            public final void onClick(View view) {
                this.f16927a.a(this.f16928b);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.definition.c$c$c  reason: collision with other inner class name */
        static final class View$OnClickListenerC0349c implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0348c f16929a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f16930b;

            static {
                Covode.recordClassIndex(9401);
            }

            View$OnClickListenerC0349c(C0348c cVar, b bVar) {
                this.f16929a = cVar;
                this.f16930b = bVar;
            }

            public final void onClick(View view) {
                this.f16929a.a(this.f16930b);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.livesdk.definition.c$c$a */
        public static final class a implements q {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0348c f16921a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f16922b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f16923c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f16924d;

            static {
                Covode.recordClassIndex(9398);
            }

            a(C0348c cVar, int i2, String str, int i3) {
                this.f16921a = cVar;
                this.f16922b = i2;
                this.f16923c = str;
                this.f16924d = i3;
            }

            @Override // com.bytedance.android.livesdkapi.depend.d.q
            public final void a(final boolean z) {
                this.f16921a.f16913b.post(new Runnable(this) {
                    /* class com.bytedance.android.livesdk.definition.c.C0348c.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f16925a;

                    static {
                        Covode.recordClassIndex(9399);
                    }

                    {
                        this.f16925a = r1;
                    }

                    public final void run() {
                        if (z) {
                            n.a aVar = new n.a();
                            aVar.f7938b = this.f16925a.f16921a.f16915d.get(this.f16925a.f16922b).b();
                            aVar.f7937a = this.f16925a.f16921a.f16915d.get(this.f16925a.f16922b).a();
                            DataChannel dataChannel = this.f16925a.f16921a.f16916e;
                            if (dataChannel != null) {
                                dataChannel.b(com.bytedance.android.livesdk.j.i.class, aVar);
                            }
                            if (NetworkUtils.isWifi(y.e())) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                String str = aVar.f7937a;
                                l.b(str, "");
                                linkedHashMap.put(StringSet.name, str);
                                String str2 = aVar.f7938b;
                                l.b(str2, "");
                                linkedHashMap.put("sdk_key", str2);
                                com.bytedance.android.livesdk.ap.b<Map<String, String>> bVar = com.bytedance.android.livesdk.ap.a.cQ;
                                l.b(bVar, "");
                                com.bytedance.android.livesdk.ap.c.a(bVar, linkedHashMap);
                                com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class);
                                l.b(a2, "");
                                k b2 = ((com.bytedance.android.live.i.a.d) a2).getLivePlayControllerManager().b(this.f16925a.f16923c);
                                if (b2 != null) {
                                    b2.e(false);
                                }
                                C0348c cVar = this.f16925a.f16921a;
                                String str3 = aVar.f7937a;
                                l.b(str3, "");
                                ao.a(y.e(), cVar.a(R.string.em7, str3), 0);
                            } else {
                                C0348c cVar2 = this.f16925a.f16921a;
                                String str4 = aVar.f7937a;
                                l.b(str4, "");
                                ao.a(y.e(), cVar2.a(R.string.dzq, str4), 0);
                            }
                            C0348c cVar3 = this.f16925a.f16921a;
                            String str5 = aVar.f7938b;
                            l.b(str5, "");
                            cVar3.a(str5, false);
                            this.f16925a.f16921a.a(this.f16925a.f16922b);
                            this.f16925a.f16921a.b(this.f16925a.f16924d);
                            this.f16925a.f16921a.f16912a = this.f16925a.f16922b;
                            this.f16925a.f16921a.f16917f.d();
                        }
                        this.f16925a.f16921a.f16914c = false;
                    }
                });
            }
        }

        public final void a(int i2) {
            RecyclerView.ViewHolder viewHolder;
            com.bytedance.android.live.core.c.a.a(4, "LiveDefinitionSelectionDialog", "selectItemUI. position=".concat(String.valueOf(i2)));
            this.f16915d.get(i2).f16934c = true;
            RecyclerView recyclerView = this.f16918g;
            if (recyclerView != null) {
                viewHolder = recyclerView.f(i2);
            } else {
                viewHolder = null;
            }
            b bVar = (b) viewHolder;
            if (bVar != null) {
                ConstraintLayout constraintLayout = bVar.f16908a;
                if (constraintLayout != null) {
                    constraintLayout.setSelected(true);
                }
                LiveTextView liveTextView = bVar.f16909b;
                if (liveTextView != null) {
                    liveTextView.setSelected(true);
                }
                LiveRadioButton liveRadioButton = bVar.f16910c;
                if (liveRadioButton != null) {
                    liveRadioButton.setChecked(true);
                }
            }
        }

        public final void b(int i2) {
            RecyclerView.ViewHolder viewHolder;
            com.bytedance.android.live.core.c.a.a(4, "LiveDefinitionSelectionDialog", "unSelectItem. position=".concat(String.valueOf(i2)));
            this.f16915d.get(i2).f16934c = false;
            RecyclerView recyclerView = this.f16918g;
            if (recyclerView != null) {
                viewHolder = recyclerView.f(i2);
            } else {
                viewHolder = null;
            }
            b bVar = (b) viewHolder;
            if (bVar != null) {
                ConstraintLayout constraintLayout = bVar.f16908a;
                if (constraintLayout != null) {
                    constraintLayout.setSelected(false);
                }
                LiveTextView liveTextView = bVar.f16909b;
                if (liveTextView != null) {
                    liveTextView.setSelected(false);
                }
                LiveRadioButton liveRadioButton = bVar.f16910c;
                if (liveRadioButton != null) {
                    liveRadioButton.setChecked(false);
                }
            }
        }

        public final void a(b bVar) {
            int adapterPosition;
            int i2;
            if (this.f16914c || (adapterPosition = bVar.getAdapterPosition()) == (i2 = this.f16912a)) {
                return;
            }
            if (this.f16920i) {
                this.f16914c = true;
                com.bytedance.android.live.core.c.a.a(4, "LiveDefinitionSelectionDialog", "handleAnchorItemSelect. oldPosition=" + i2 + ". ; newPosition=" + adapterPosition + ",  newResolution=" + this.f16915d.get(adapterPosition).b() + '.');
                n.a aVar = new n.a();
                aVar.f7938b = this.f16915d.get(adapterPosition).b();
                aVar.f7937a = this.f16915d.get(adapterPosition).a();
                DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.v.class, aVar);
                HashMap hashMap = new HashMap();
                String str = aVar.f7937a;
                l.b(str, "");
                hashMap.put(StringSet.name, str);
                String str2 = aVar.f7938b;
                l.b(str2, "");
                hashMap.put("sdk_key", str2);
                com.bytedance.android.livesdk.ap.b<Map<String, String>> bVar2 = com.bytedance.android.livesdk.ap.a.cR;
                l.b(bVar2, "");
                com.bytedance.android.livesdk.ap.c.a(bVar2, hashMap);
                String str3 = aVar.f7938b;
                l.b(str3, "");
                a(str3, true);
                a(adapterPosition);
                b(i2);
                this.f16912a = adapterPosition;
                this.f16917f.d();
                this.f16914c = false;
                return;
            }
            this.f16914c = true;
            String b2 = this.f16915d.get(adapterPosition).b();
            com.bytedance.android.livesdkapi.session.f fVar = f.a.f23366a;
            l.b(fVar, "");
            EnterRoomLinkSession a2 = fVar.a();
            l.b(a2, "");
            String str4 = a2.f23354b.f23299c.E;
            if (str4 == null) {
                str4 = "";
            }
            com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class);
            l.b(a3, "");
            k b3 = ((com.bytedance.android.live.i.a.d) a3).getLivePlayControllerManager().b(str4);
            if (b3 != null) {
                b3.a(b2, new a(this, adapterPosition, str4, i2));
            }
        }

        public final String a(int i2, String str) {
            Context context;
            String string;
            RecyclerView recyclerView = this.f16918g;
            if (recyclerView != null) {
                context = recyclerView.getContext();
            } else {
                context = null;
            }
            Activity a2 = com.bytedance.android.live.core.f.a.a(context);
            if (a2 == null || (string = a2.getString(i2, new Object[]{str})) == null) {
                return "";
            }
            return string;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(b bVar, int i2) {
            b bVar2 = bVar;
            l.d(bVar2, "");
            d dVar = this.f16915d.get(i2);
            l.d(dVar, "");
            LiveRadioButton liveRadioButton = bVar2.f16910c;
            if (liveRadioButton != null) {
                liveRadioButton.setClickable(false);
            }
            LiveTextView liveTextView = bVar2.f16909b;
            if (liveTextView != null) {
                liveTextView.setText(dVar.a());
            }
            LiveRadioButton liveRadioButton2 = bVar2.f16910c;
            if (liveRadioButton2 != null) {
                liveRadioButton2.setChecked(dVar.f16934c);
            }
            ConstraintLayout constraintLayout = bVar2.f16908a;
            if (constraintLayout != null) {
                constraintLayout.setSelected(dVar.f16934c);
            }
            LiveTextView liveTextView2 = bVar2.f16909b;
            if (liveTextView2 != null) {
                liveTextView2.setSelected(dVar.f16934c);
            }
            LiveTextView liveTextView3 = bVar2.f16909b;
            if (liveTextView3 != null) {
                liveTextView3.setOnClickListener(new b(this, bVar2));
            }
            if (this.f16919h) {
                bVar2.itemView.setOnClickListener(new View$OnClickListenerC0349c(this, bVar2));
            }
        }

        public final void a(String str, boolean z) {
            Object obj;
            String str2;
            String str3;
            String str4;
            Map map;
            Map map2;
            String str5;
            com.bytedance.android.livesdkapi.depend.model.live.i iVar;
            DataChannel dataChannel = this.f16916e;
            if (dataChannel != null) {
                obj = dataChannel.b(di.class);
            } else {
                obj = null;
            }
            String valueOf = String.valueOf(obj);
            String str6 = "";
            if (valueOf == null) {
                valueOf = str6;
            }
            DataChannel dataChannel2 = this.f16916e;
            if (dataChannel2 == null || (iVar = (com.bytedance.android.livesdkapi.depend.model.live.i) dataChannel2.b(bx.class)) == null) {
                str2 = str6;
            } else {
                str2 = j.a(iVar);
            }
            boolean z2 = this.f16919h;
            String str7 = "0";
            if (z2) {
                str3 = str7;
            } else if (!z2) {
                str3 = "1";
            } else {
                throw new h.n();
            }
            DataChannel dataChannel3 = this.f16916e;
            if (!(dataChannel3 == null || (map2 = (Map) dataChannel3.b(g.class)) == null || (str5 = (String) map2.get("sdk_key")) == null)) {
                str6 = str5;
            }
            try {
                DataChannel dataChannel4 = this.f16916e;
                if (dataChannel4 == null || (map = (Map) dataChannel4.b(g.class)) == null || (str4 = (String) map.get("start_time")) == null) {
                    str4 = String.valueOf(System.currentTimeMillis());
                }
                str7 = String.valueOf((System.currentTimeMillis() - Long.parseLong(str4)) / 1000);
            } catch (Exception e2) {
                com.bytedance.android.live.core.c.a.a(4, "LiveDefinitionSelectionDialog", "reportSelectSuccess. catch exception=".concat(String.valueOf(e2)));
            }
            if (z) {
                a.a();
            } else {
                a.a(valueOf, str2, str3, str7, str6, "normal", str);
            }
        }

        private static RecyclerView.ViewHolder a(C0348c cVar, ViewGroup viewGroup, int i2) {
            int i3;
            boolean a2;
            MethodCollector.i(2678);
            l.d(viewGroup, "");
            if (cVar.f16919h) {
                i3 = R.layout.b6_;
            } else {
                i3 = R.layout.b6a;
            }
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), i3, viewGroup, false);
            l.b(a3, "");
            b bVar = new b(a3, cVar.f16919h);
            try {
                if (bVar.itemView.getParent() != null) {
                    try {
                        a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a2) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                        com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(bVar.itemView);
                        }
                    }
                }
            } catch (Exception e2) {
                ai.a(e2);
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            gg.f143005a = bVar.getClass().getName();
            MethodCollector.o(2678);
            return bVar;
        }

        public C0348c(RecyclerView recyclerView, List<d> list, boolean z, boolean z2, DataChannel dataChannel, f fVar) {
            l.d(list, "");
            l.d(fVar, "");
            this.f16918g = recyclerView;
            this.f16915d = list;
            this.f16919h = z;
            this.f16920i = z2;
            this.f16916e = dataChannel;
            this.f16917f = fVar;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f16915d.get(i2).f16934c) {
                    this.f16912a = i2;
                    return;
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        boolean z;
        int i2;
        int i3;
        int a2;
        int i4;
        Boolean bool;
        DataChannel dataChannel = this.p;
        if (dataChannel == null || (bool = (Boolean) dataChannel.b(cp.class)) == null) {
            z = true;
        } else {
            z = bool.booleanValue();
        }
        this.f16904d = z;
        if (z) {
            i2 = R.style.a2z;
            if (z) {
                i3 = 80;
            } else {
                if (z) {
                    throw new h.n();
                }
                i3 = 5;
            }
        } else {
            i2 = R.style.a30;
            i3 = 5;
        }
        int i5 = -1;
        if (z) {
            a2 = -1;
        } else if (!z) {
            a2 = (int) ap.a(getContext(), 427.0f);
        } else {
            throw new h.n();
        }
        boolean z2 = this.f16904d;
        if (z2) {
            i5 = -2;
            i4 = R.layout.b69;
        } else if (!z2) {
            i4 = R.layout.b6b;
        } else {
            throw new h.n();
        }
        v.b bVar = new v.b(i4);
        bVar.f22375b = i2;
        bVar.f22385l = 48;
        bVar.f22380g = i3;
        bVar.f22381h = a2;
        bVar.f22382i = i5;
        return bVar;
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f16931a;

        static {
            Covode.recordClassIndex(9404);
        }

        f(c cVar) {
            this.f16931a = cVar;
        }

        public final void onClick(View view) {
            this.f16931a.dismiss();
        }
    }

    static final class d extends m implements h.f.a.b<z, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(9402);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            l.d(zVar, "");
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(com.bytedance.android.live.design.a.a.a(getActivity()));
        l.b(cloneInContext, "");
        return cloneInContext;
    }

    static final class e extends m implements h.f.a.b<String, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(9403);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            C0348c cVar;
            String str2 = str;
            l.d(str2, "");
            com.bytedance.android.live.core.c.a.a(4, "LiveDefinitionSelectionDialog", "onResolutionDegrade. newResolution=".concat(String.valueOf(str2)));
            if (!this.this$0.f16902a && (cVar = this.this$0.f16903b) != null) {
                l.d(str2, "");
                int i2 = 0;
                if (str2.length() != 0) {
                    int size = cVar.f16915d.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        } else if (l.a((Object) str2, (Object) cVar.f16915d.get(i3).b())) {
                            i2 = i3;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (i2 != cVar.f16912a) {
                        cVar.b(cVar.f16912a);
                        cVar.a(i2);
                        cVar.f16912a = i2;
                    }
                }
            }
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        String str;
        String str2;
        String str3;
        String g2;
        com.bytedance.android.livesdkapi.depend.model.live.i iVar;
        Long l2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("key_is_preview");
        } else {
            z = false;
        }
        this.f16902a = z;
        DataChannel dataChannel = this.p;
        String str4 = "";
        if (dataChannel == null || (l2 = (Long) dataChannel.b(di.class)) == null || (str = String.valueOf(l2.longValue())) == null) {
            str = str4;
        }
        DataChannel dataChannel2 = this.p;
        if (dataChannel2 == null || (iVar = (com.bytedance.android.livesdkapi.depend.model.live.i) dataChannel2.b(bx.class)) == null) {
            str2 = str4;
        } else {
            str2 = j.a(iVar);
        }
        boolean z2 = this.f16904d;
        if (z2) {
            str3 = "0";
        } else if (!z2) {
            str3 = "1";
        } else {
            throw new h.n();
        }
        if (this.f16902a) {
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_live_anchor_definition_selection_page_show");
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            l.b(b2, str4);
            a2.a("anchor_id", b2.c()).a("screen_share").b();
        } else {
            l.d(str, str4);
            l.d(str2, str4);
            l.d(str3, str4);
            com.bytedance.android.livesdkapi.session.f fVar = f.a.f23366a;
            l.b(fVar, str4);
            EnterRoomLinkSession a3 = fVar.a();
            l.b(a3, str4);
            String str5 = a3.f23354b.f23299c.E;
            if (str5 == null) {
                str5 = str4;
            }
            com.bytedance.android.live.base.a a4 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class);
            l.b(a4, str4);
            k b3 = ((com.bytedance.android.live.i.a.d) a4).getLivePlayControllerManager().b(str5);
            if (!(b3 == null || (g2 = b3.g()) == null)) {
                str4 = g2;
            }
            b.a.a("livesdk_live_definition_selection_page_show").a("anchor_id", a.b()).a("room_id", str).a("room_orientation", str3).a("current_definition", str4).a(str2).b();
        }
        DataChannel dataChannel3 = this.p;
        if (dataChannel3 != null) {
            dataChannel3.a((androidx.lifecycle.m) this, br.class, (h.f.a.b) new d(this));
        }
        DataChannel dataChannel4 = this.p;
        if (dataChannel4 != null) {
            dataChannel4.a((androidx.lifecycle.m) this, h.class, (h.f.a.b) new e(this));
        }
    }

    public static final class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public ConstraintLayout f16908a;

        /* renamed from: b  reason: collision with root package name */
        public LiveTextView f16909b;

        /* renamed from: c  reason: collision with root package name */
        public LiveRadioButton f16910c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f16911d;

        static {
            Covode.recordClassIndex(9396);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view, boolean z) {
            super(view);
            l.d(view, "");
            this.f16911d = z;
            this.f16908a = (ConstraintLayout) view.findViewById(R.id.a6k);
            this.f16909b = (LiveTextView) view.findViewById(R.id.ey9);
            this.f16910c = (LiveRadioButton) view.findViewById(R.id.dgm);
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<d> a2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        this.f16905e = (RecyclerView) view.findViewById(R.id.ers);
        ImageView imageView = (ImageView) view.findViewById(R.id.erq);
        this.f16906f = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new f(this));
        }
        com.bytedance.android.live.core.c.a.a(4, "LiveDefinitionSelectionDialog", "isPreviewPager:" + this.f16902a);
        RecyclerView recyclerView = this.f16905e;
        if (recyclerView != null) {
            view.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        }
        boolean z = this.f16902a;
        if (z) {
            a2 = e.a(this);
        } else if (!z) {
            a2 = e.a();
        } else {
            throw new h.n();
        }
        C0348c cVar = new C0348c(this.f16905e, a2, this.f16904d, this.f16902a, this.p, this);
        this.f16903b = cVar;
        RecyclerView recyclerView2 = this.f16905e;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(cVar);
        }
    }
}
