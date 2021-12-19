package com.bytedance.android.live.wallet.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.CurrencyInfo;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.UserBalance;
import com.bytedance.android.live.wallet.model.g;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Arrays;
import java.util.List;

public final class a extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public int f13006a;

    /* renamed from: b  reason: collision with root package name */
    public final b f13007b;

    /* renamed from: c  reason: collision with root package name */
    public int f13008c;

    /* renamed from: d  reason: collision with root package name */
    public int f13009d;

    /* renamed from: e  reason: collision with root package name */
    public int f13010e;

    /* renamed from: f  reason: collision with root package name */
    public int f13011f;

    /* renamed from: g  reason: collision with root package name */
    private final Drawable f13012g;

    /* renamed from: h  reason: collision with root package name */
    private final List<com.bytedance.android.livesdk.wallet.c> f13013h;

    public interface b {
        static {
            Covode.recordClassIndex(7234);
        }

        void a(int i2, int i3);

        void a(com.bytedance.android.livesdk.wallet.c cVar, int i2);

        void a(boolean z, int i2, com.bytedance.android.livesdk.wallet.c cVar);
    }

    static {
        Covode.recordClassIndex(7232);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f13013h.size();
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BalanceStructExtra f13022a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f13023b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BalanceStruct f13024c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ RecyclerView.ViewHolder f13025d;

        static {
            Covode.recordClassIndex(7236);
        }

        d(BalanceStructExtra balanceStructExtra, a aVar, BalanceStruct balanceStruct, RecyclerView.ViewHolder viewHolder) {
            this.f13022a = balanceStructExtra;
            this.f13023b = aVar;
            this.f13024c = balanceStruct;
            this.f13025d = viewHolder;
        }

        public final void onClick(View view) {
            this.f13023b.f13007b.a(-1, this.f13023b.f13011f);
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f13026a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecyclerView.ViewHolder f13027b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f13028c;

        static {
            Covode.recordClassIndex(7237);
        }

        e(a aVar, RecyclerView.ViewHolder viewHolder, g gVar) {
            this.f13026a = aVar;
            this.f13027b = viewHolder;
            this.f13028c = gVar;
        }

        public final void onClick(View view) {
            this.f13026a.f13007b.a(-2, this.f13026a.f13011f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return this.f13013h.get(i2).f22410f;
    }

    public static final class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f13018a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f13019b;

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f13020c;

        /* renamed from: d  reason: collision with root package name */
        public final TextView f13021d;

        static {
            Covode.recordClassIndex(7235);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(view);
            l.d(view, "");
            this.f13018a = (TextView) view.findViewById(R.id.alt);
            this.f13019b = (TextView) view.findViewById(R.id.d99);
            this.f13020c = (ViewGroup) view.findViewById(R.id.ceo);
            this.f13021d = (TextView) view.findViewById(R.id.bc_);
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f13029a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.wallet.c f13030b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f13031c;

        static {
            Covode.recordClassIndex(7238);
        }

        f(a aVar, com.bytedance.android.livesdk.wallet.c cVar, int i2) {
            this.f13029a = aVar;
            this.f13030b = cVar;
            this.f13031c = i2;
        }

        public final void onClick(View view) {
            this.f13029a.f13007b.a(this.f13030b, 0);
            this.f13029a.f13006a = this.f13031c;
            this.f13029a.notifyDataSetChanged();
            this.f13029a.f13010e = -1;
            this.f13029a.f13008c = -1;
            this.f13029a.f13009d = -1;
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.adapter.a$a  reason: collision with other inner class name */
    public final class C0272a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f13014a;

        /* renamed from: b  reason: collision with root package name */
        private final TextView f13015b;

        /* renamed from: c  reason: collision with root package name */
        private final TextView f13016c;

        /* renamed from: d  reason: collision with root package name */
        private final ImageView f13017d;

        static {
            Covode.recordClassIndex(7233);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0272a(a aVar, View view) {
            super(view);
            l.d(view, "");
            this.f13014a = aVar;
            this.f13015b = (TextView) view.findViewById(R.id.ax_);
            this.f13016c = (TextView) view.findViewById(R.id.ax4);
            this.f13017d = (ImageView) view.findViewById(R.id.ax1);
        }

        public final void a(String str, long j2, long j3, int i2, int i3) {
            String str2;
            Drawable c2 = y.c(2131234418);
            int i4 = 1;
            if (c2 != null) {
                int a2 = y.a(13.0f);
                c2.setBounds(0, 0, a2, a2);
                com.bytedance.android.livesdk.widget.f fVar = new com.bytedance.android.livesdk.widget.f(c2);
                StringBuilder sb = new StringBuilder();
                if (str == null) {
                    str = "";
                }
                StringBuilder append = sb.append(str);
                double d2 = (double) j2;
                double pow = Math.pow(10.0d, 2.0d);
                Double.isNaN(d2);
                String a3 = com.a.a("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d2 / pow)}, 1));
                l.b(a3, "");
                String sb2 = append.append(a3).append(" ( ").toString();
                String str3 = ". " + j3 + " )";
                View view = this.itemView;
                l.b(view, "");
                String string = view.getContext().getString(i3, sb2 + str3);
                l.b(string, "");
                SpannableString spannableString = new SpannableString(string);
                spannableString.setSpan(fVar, string.length() - str3.length(), (string.length() - str3.length()) + 1, 33);
                TextView textView = this.f13016c;
                if (textView != null) {
                    textView.setText(spannableString);
                }
            }
            if (this.f13014a.f13011f == 2) {
                TextView textView2 = this.f13015b;
                if (textView2 != null) {
                    textView2.setEnabled(true);
                }
                TextView textView3 = this.f13016c;
                if (textView3 != null) {
                    textView3.setEnabled(true);
                }
                ImageView imageView = this.f13017d;
                if (imageView != null) {
                    imageView.setEnabled(true);
                }
            } else {
                TextView textView4 = this.f13015b;
                if (textView4 != null) {
                    textView4.setEnabled(false);
                }
                TextView textView5 = this.f13016c;
                if (textView5 != null) {
                    textView5.setEnabled(false);
                }
                ImageView imageView2 = this.f13017d;
                if (imageView2 != null) {
                    imageView2.setEnabled(false);
                }
            }
            com.bytedance.android.livesdk.ab.b a4 = b.a.a("livesdk_recharge_exchange_entrance_show").a().a("request_page", "live_detail");
            if (i2 == -1) {
                str2 = "ug_exchange";
            } else {
                str2 = "anchor_income";
            }
            com.bytedance.android.livesdk.ab.b a5 = a4.a("charge_reason", str2);
            if (this.f13014a.f13011f != 2) {
                i4 = 0;
            }
            a5.a("could_exchange", i4).a("is_anchor", p.f() ? 1 : 0).b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        long j2;
        int i3;
        UserBalance userBalance;
        Context context;
        l.d(viewHolder, "");
        String str = null;
        if (viewHolder instanceof c) {
            com.bytedance.android.livesdk.wallet.c cVar = this.f13013h.get(i2);
            if (cVar.f22410f == 0) {
                c cVar2 = (c) viewHolder;
                TextView textView = cVar2.f13018a;
                if (textView != null) {
                    textView.setText(String.valueOf(cVar.f22408d));
                }
                Drawable drawable = this.f13012g;
                if (drawable != null) {
                    ViewGroup viewGroup = cVar2.f13020c;
                    if (viewGroup != null) {
                        context = viewGroup.getContext();
                    } else {
                        context = null;
                    }
                    if (com.bytedance.android.live.uikit.c.a.a(context)) {
                        TextView textView2 = cVar2.f13018a;
                        if (textView2 != null) {
                            textView2.setCompoundDrawables(null, null, drawable, null);
                        }
                    } else {
                        TextView textView3 = cVar2.f13018a;
                        if (textView3 != null) {
                            textView3.setCompoundDrawables(drawable, null, null, null);
                        }
                    }
                }
            } else {
                TextView textView4 = ((c) viewHolder).f13018a;
                if (textView4 != null) {
                    View view = viewHolder.itemView;
                    l.b(view, "");
                    textView4.setText(view.getContext().getString(R.string.dzo));
                }
            }
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IGiftService.class);
            l.b(a2, "");
            if (((IGiftService) a2).isFirstRecharge() && cVar.f22409e > 0) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("+");
                stringBuffer.append(cVar.f22409e);
                View view2 = viewHolder.itemView;
                l.b(view2, "");
                if (com.bytedance.android.live.uikit.c.a.a(view2.getContext())) {
                    int i4 = Build.VERSION.SDK_INT;
                    TextView textView5 = ((c) viewHolder).f13021d;
                    if (textView5 != null) {
                        textView5.setBackground(y.c(R.drawable.bqk));
                    }
                }
                c cVar3 = (c) viewHolder;
                TextView textView6 = cVar3.f13021d;
                if (textView6 != null) {
                    textView6.setText(stringBuffer.toString());
                }
                TextView textView7 = cVar3.f13021d;
                if (textView7 != null) {
                    textView7.setVisibility(0);
                }
            }
            if (i2 == this.f13006a) {
                ViewGroup viewGroup2 = ((c) viewHolder).f13020c;
                if (viewGroup2 != null) {
                    viewGroup2.setBackground(y.c(R.drawable.bw9));
                }
            } else {
                ViewGroup viewGroup3 = ((c) viewHolder).f13020c;
                if (viewGroup3 != null) {
                    viewGroup3.setBackground(y.c(R.drawable.bw_));
                }
            }
            if (cVar.f22410f == 0) {
                TextView textView8 = ((c) viewHolder).f13019b;
                if (textView8 != null) {
                    textView8.setText(cVar.f22407c);
                }
            } else {
                TextView textView9 = ((c) viewHolder).f13019b;
                if (textView9 != null) {
                    View view3 = viewHolder.itemView;
                    l.b(view3, "");
                    textView9.setText(view3.getContext().getString(R.string.dzp));
                }
            }
            viewHolder.itemView.setOnTouchListener(new ai());
            viewHolder.itemView.setOnClickListener(new f(this, cVar, i2));
        } else if (viewHolder instanceof C0272a) {
            int itemViewType = getItemViewType(i2);
            if (itemViewType == -2) {
                com.bytedance.android.live.wallet.d walletCenter = ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter();
                l.b(walletCenter, "");
                g f2 = walletCenter.f();
                l.b(f2, "");
                BalanceStructExtra balanceStructExtra = f2.f13235d;
                if (balanceStructExtra != null) {
                    C0272a aVar = (C0272a) viewHolder;
                    CurrencyInfo currencyInfo = balanceStructExtra.getCurrencyInfo();
                    if (currencyInfo != null) {
                        str = currencyInfo.getSymbol();
                    }
                    RevenueExchange revenueExchange = f2.f13234c;
                    if (revenueExchange != null) {
                        j2 = revenueExchange.getBalance();
                    } else {
                        j2 = 0;
                    }
                    long maxCoins = balanceStructExtra.getMaxCoins();
                    RevenueExchange revenueExchange2 = f2.f13234c;
                    if (revenueExchange2 == null || !revenueExchange2.isRevenue()) {
                        i3 = R.string.e4d;
                    } else {
                        i3 = R.string.e4e;
                    }
                    aVar.a(str, j2, maxCoins, -2, i3);
                    viewHolder.itemView.setOnClickListener(new e(this, viewHolder, f2));
                }
            } else if (itemViewType != -1) {
                p.a(viewHolder.itemView);
            } else {
                com.bytedance.android.live.wallet.d walletCenter2 = ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter();
                l.b(walletCenter2, "");
                BalanceStruct e2 = walletCenter2.e();
                BalanceStructExtra exchangeInfo = e2.getExchangeInfo();
                if (exchangeInfo != null && (userBalance = e2.getUserBalance()) != null) {
                    C0272a aVar2 = (C0272a) viewHolder;
                    CurrencyInfo currencyInfo2 = exchangeInfo.getCurrencyInfo();
                    if (currencyInfo2 != null) {
                        str = currencyInfo2.getSymbol();
                    }
                    aVar2.a(str, userBalance.getBalance(), exchangeInfo.getMaxCoins(), -1, R.string.e26);
                    viewHolder.itemView.setOnClickListener(new d(exchangeInfo, this, e2, viewHolder));
                }
            }
        }
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(9448);
        l.d(viewGroup, "");
        if (i2 == -1 || i2 == -2) {
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b_n, viewGroup, false);
            l.b(a3, "");
            viewHolder = new C0272a(aVar, a3);
        } else {
            View a4 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b_f, viewGroup, false);
            l.b(a4, "");
            viewHolder = new c(a4);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.profile.ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        MethodCollector.o(9448);
        return viewHolder;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.bytedance.android.livesdk.wallet.c> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends com.bytedance.android.livesdk.wallet.c> list, b bVar, int i2, int i3, int i4, int i5) {
        l.d(list, "");
        l.d(bVar, "");
        this.f13013h = list;
        this.f13007b = bVar;
        this.f13008c = i2;
        this.f13009d = i3;
        this.f13010e = i4;
        this.f13011f = i5;
        Drawable c2 = y.c(2131234418);
        this.f13012g = c2;
        int a2 = y.a(16.0f);
        int i6 = 0;
        if (c2 != null) {
            c2.setBounds(0, 0, a2, a2);
        }
        this.f13006a = this.f13011f != 2 ? 1 : i6;
        int i7 = this.f13008c;
        if (i7 != -1) {
            this.f13006a = i7;
        } else {
            int i8 = this.f13009d;
            if (i8 != -1) {
                this.f13006a = i8;
            } else {
                int i9 = this.f13010e;
                if (i9 != -1) {
                    this.f13006a = i9;
                }
            }
        }
        if (this.f13006a < list.size()) {
            bVar.a((com.bytedance.android.livesdk.wallet.c) list.get(this.f13006a), 1);
        }
    }
}
