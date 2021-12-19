package com.ss.android.ugc.aweme.account.login.recover;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.login.v;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public final class g extends RecyclerView.a<d> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f63607c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f63608a;

    /* renamed from: b  reason: collision with root package name */
    public final List<c> f63609b;

    /* renamed from: d  reason: collision with root package name */
    private final v[] f63610d = v.values();

    /* renamed from: e  reason: collision with root package name */
    private final Context f63611e;

    /* renamed from: f  reason: collision with root package name */
    private final String f63612f;

    /* renamed from: g  reason: collision with root package name */
    private final String f63613g;

    /* renamed from: h  reason: collision with root package name */
    private final Boolean f63614h;

    public interface b {
        static {
            Covode.recordClassIndex(39220);
        }

        void a(int i2, e eVar);
    }

    static {
        Covode.recordClassIndex(39218);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ d onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39219);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c implements Serializable {
        private e authType;
        private String methodInfo;
        private String methodName;
        private int methodType;

        static {
            Covode.recordClassIndex(39221);
        }

        public final e getAuthType() {
            return this.authType;
        }

        public final String getMethodInfo() {
            return this.methodInfo;
        }

        public final String getMethodName() {
            return this.methodName;
        }

        public final int getMethodType() {
            return this.methodType;
        }

        public final void setAuthType(e eVar) {
            this.authType = eVar;
        }

        public final void setMethodInfo(String str) {
            this.methodInfo = str;
        }

        public final void setMethodName(String str) {
            this.methodName = str;
        }

        public final void setMethodType(int i2) {
            this.methodType = i2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f63609b.size() + 2;
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f63623a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f63624b;

        static {
            Covode.recordClassIndex(39223);
        }

        e(g gVar, int i2) {
            this.f63623a = gVar;
            this.f63624b = i2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f63624b > 1) {
                b bVar = this.f63623a.f63608a;
                if (bVar == null) {
                    l.a("onItemClick");
                }
                bVar.a(this.f63623a.f63609b.get(this.f63624b - 2).getMethodType(), this.f63623a.f63609b.get(this.f63624b - 2).getAuthType());
            }
        }
    }

    public static final class d extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TuxTextView f63615a;

        /* renamed from: b  reason: collision with root package name */
        public final TuxTextView f63616b;

        /* renamed from: c  reason: collision with root package name */
        public final AvatarImageView f63617c;

        /* renamed from: d  reason: collision with root package name */
        public final RelativeLayout f63618d;

        /* renamed from: e  reason: collision with root package name */
        public final TuxTextView f63619e;

        /* renamed from: f  reason: collision with root package name */
        public final TuxTextView f63620f;

        /* renamed from: g  reason: collision with root package name */
        public final RemoteImageView f63621g;

        /* renamed from: h  reason: collision with root package name */
        public final AutoRTLImageView f63622h;

        static {
            Covode.recordClassIndex(39222);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(view);
            l.d(view, "");
            View findViewById = view.findViewById(R.id.evw);
            l.b(findViewById, "");
            this.f63615a = (TuxTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.f_f);
            l.b(findViewById2, "");
            this.f63616b = (TuxTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.bk3);
            l.b(findViewById3, "");
            this.f63617c = (AvatarImageView) findViewById3;
            View findViewById4 = view.findViewById(R.id.doj);
            l.b(findViewById4, "");
            this.f63618d = (RelativeLayout) findViewById4;
            View findViewById5 = view.findViewById(R.id.f2w);
            l.b(findViewById5, "");
            this.f63619e = (TuxTextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.f2v);
            l.b(findViewById6, "");
            this.f63620f = (TuxTextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.bl2);
            l.b(findViewById7, "");
            this.f63621g = (RemoteImageView) findViewById7;
            View findViewById8 = view.findViewById(R.id.bk2);
            l.b(findViewById8, "");
            this.f63622h = (AutoRTLImageView) findViewById8;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(d dVar, int i2) {
        d dVar2 = dVar;
        l.d(dVar2, "");
        if (i2 == 0) {
            dVar2.f63615a.setVisibility(8);
            dVar2.f63616b.setVisibility(8);
            dVar2.f63618d.setVisibility(8);
            dVar2.f63617c.setVisibility(0);
            if (!TextUtils.isEmpty(this.f63613g)) {
                com.ss.android.ugc.aweme.base.e.b(dVar2.f63617c, this.f63613g, -1, -1);
            }
        } else if (i2 != 1) {
            int i3 = i2 - 2;
            if (i3 < this.f63609b.size() && i3 >= 0) {
                c cVar = this.f63609b.get(i3);
                if (cVar != null) {
                    dVar2.f63615a.setVisibility(8);
                    dVar2.f63616b.setVisibility(8);
                    dVar2.f63618d.setVisibility(0);
                    dVar2.f63617c.setVisibility(8);
                    dVar2.f63622h.setVisibility(0);
                    int methodType = cVar.getMethodType();
                    if (methodType == 1) {
                        com.ss.android.ugc.aweme.base.e.a(dVar2.f63621g, 2131231098);
                        dVar2.f63620f.setText(cVar.getMethodInfo());
                        dVar2.f63619e.setText(cVar.getMethodName());
                    } else if (methodType == 2) {
                        com.ss.android.ugc.aweme.base.e.a(dVar2.f63621g, 2131231097);
                        dVar2.f63620f.setText(cVar.getMethodInfo());
                        dVar2.f63619e.setText(cVar.getMethodName());
                    } else if (methodType == 3) {
                        dVar2.f63622h.setVisibility(8);
                        e authType = cVar.getAuthType();
                        if (authType != null) {
                            switch (h.f63625a[authType.ordinal()]) {
                                case 1:
                                    com.ss.android.ugc.aweme.base.e.a(dVar2.f63621g, 2131231063);
                                    break;
                                case 2:
                                    com.ss.android.ugc.aweme.base.e.a(dVar2.f63621g, 2131231068);
                                    break;
                                case 3:
                                    com.ss.android.ugc.aweme.base.e.a(dVar2.f63621g, 2131231064);
                                    break;
                                case 4:
                                    com.ss.android.ugc.aweme.base.e.a(dVar2.f63621g, 2131231067);
                                    break;
                                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                                    com.ss.android.ugc.aweme.base.e.a(dVar2.f63621g, 2131231066);
                                    break;
                                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                                    com.ss.android.ugc.aweme.base.e.a(dVar2.f63621g, 2131231065);
                                    break;
                                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                                    com.ss.android.ugc.aweme.base.e.a(dVar2.f63621g, 2131231069);
                                    break;
                                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                                    dVar2.f63622h.setVisibility(8);
                                    com.ss.android.ugc.aweme.base.e.a(dVar2.f63621g, 2131231144);
                                    break;
                            }
                        }
                        dVar2.f63620f.setText(cVar.getMethodInfo());
                        dVar2.f63619e.setText(cVar.getMethodName());
                        v[] vVarArr = this.f63610d;
                        int length = vVarArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                String vVar = vVarArr[i4].toString();
                                Objects.requireNonNull(vVar, "null cannot be cast to non-null type java.lang.String");
                                String lowerCase = vVar.toLowerCase();
                                l.b(lowerCase, "");
                                String valueOf = String.valueOf(cVar.getAuthType());
                                Objects.requireNonNull(valueOf, "null cannot be cast to non-null type java.lang.String");
                                String lowerCase2 = valueOf.toLowerCase();
                                l.b(lowerCase2, "");
                                if (l.a((Object) lowerCase, (Object) lowerCase2)) {
                                    dVar2.f63622h.setVisibility(0);
                                } else {
                                    i4++;
                                }
                            }
                        }
                    }
                }
            } else {
                return;
            }
        } else {
            dVar2.f63618d.setVisibility(8);
            dVar2.f63617c.setVisibility(8);
            dVar2.f63615a.setVisibility(0);
            dVar2.f63616b.setVisibility(0);
            if (!TextUtils.isEmpty(this.f63612f)) {
                dVar2.f63615a.setText(this.f63612f);
            }
        }
        dVar2.itemView.setOnClickListener(new e(this, i2));
    }

    private static RecyclerView.ViewHolder a(g gVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(8907);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(gVar.f63611e), R.layout.hz, viewGroup, false);
        l.b(a3, "");
        d dVar = new d(a3);
        try {
            if (dVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(dVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) dVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(dVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = dVar.getClass().getName();
        MethodCollector.o(8907);
        return dVar;
    }

    public g(Context context, List<c> list, String str, String str2, Boolean bool) {
        l.d(list, "");
        this.f63611e = context;
        this.f63609b = list;
        this.f63612f = str;
        this.f63613g = str2;
        this.f63614h = bool;
    }
}
