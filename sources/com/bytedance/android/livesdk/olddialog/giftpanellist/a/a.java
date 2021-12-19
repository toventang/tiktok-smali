package com.bytedance.android.livesdk.olddialog.giftpanellist.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.dialogv2.b.c;
import com.bytedance.android.livesdk.firstrecharge.d;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeStyleSetting;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.olddialog.giftpanellist.c.b;
import com.bytedance.android.livesdk.olddialog.giftpanellist.c.f;
import com.bytedance.android.livesdk.olddialog.giftpanellist.c.g;
import com.bytedance.android.livesdk.olddialog.giftpanellist.c.j;
import com.bytedance.android.livesdk.olddialog.giftpanellist.c.m;
import com.bytedance.android.livesdk.olddialog.giftpanellist.c.n;
import com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftPanelWidget;
import com.bytedance.android.livesdk.service.a.a;
import com.bytedance.android.livesdk.service.c.a.a;
import com.bytedance.android.livesdk.z.c.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class a extends RecyclerView.a<b> implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public b f20022a;

    /* renamed from: b  reason: collision with root package name */
    public long f20023b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f20024c;

    /* renamed from: d  reason: collision with root package name */
    public AbstractC0407a f20025d;

    /* renamed from: e  reason: collision with root package name */
    public long f20026e;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedList<com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b>> f20027f = new LinkedList<>();

    /* renamed from: g  reason: collision with root package name */
    public long f20028g;

    /* renamed from: h  reason: collision with root package name */
    public DataChannel f20029h;

    /* renamed from: i  reason: collision with root package name */
    public LiveNewGiftPanelWidget.a f20030i;

    /* renamed from: j  reason: collision with root package name */
    private com.bytedance.android.livesdk.gift.model.a.b f20031j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f20032k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f20033l;

    /* renamed from: m  reason: collision with root package name */
    private n f20034m = new n() {
        /* class com.bytedance.android.livesdk.olddialog.giftpanellist.a.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(11830);
        }

        @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.n
        public final void a() {
            if (a.this.f20025d != null) {
                a.this.f20025d.b();
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.olddialog.giftpanellist.a.a$a  reason: collision with other inner class name */
    public interface AbstractC0407a {
        static {
            Covode.recordClassIndex(11831);
        }

        void a();

        void a(int i2);

        void a(int i2, int i3);

        void a(com.bytedance.android.livesdk.gift.model.a.b bVar, String str, String str2);

        void a(String str, String str2);

        void b();
    }

    static {
        Covode.recordClassIndex(11829);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b.a
    public final com.bytedance.android.livesdk.gift.model.a.b a() {
        return this.f20031j;
    }

    public final void b() {
        b bVar = this.f20022a;
        if (bVar != null) {
            bVar.h();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        return this.f20027f.size();
    }

    public final void c() {
        b bVar = this.f20022a;
        if (bVar != null && !(bVar instanceof j)) {
            bVar.b(this.f20023b);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* bridge */ /* synthetic */ void onViewDetachedFromWindow(b bVar) {
        super.onViewDetachedFromWindow(bVar);
    }

    private void d(long j2) {
        b bVar = this.f20022a;
        if (bVar != null) {
            bVar.a(j2);
        }
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b.a
    public final void a(b bVar) {
        this.f20022a = bVar;
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b.a
    public final boolean b(long j2) {
        if (this.f20026e != j2) {
            return false;
        }
        this.f20026e = 0;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public long getItemId(int i2) {
        return this.f20027f.get(i2).d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i2) {
        return this.f20027f.get(i2).f17863a;
    }

    public final void a(long j2) {
        if (!d.u.d() || (LiveFirstRechargeStyleSetting.INSTANCE.getValue() && !d.u.e())) {
            this.f20028g = j2;
        } else if (d.u.f()) {
            this.f20028g = d.u.i();
        } else {
            this.f20028g = 0;
        }
    }

    public final int c(long j2) {
        Iterator<com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b>> it = this.f20027f.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> next = it.next();
            if (next.d() == j2 && next.f17863a != 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final void a(List<com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b>> list) {
        int i2;
        int size = (((list.size() - 1) / 8) + 1) * 8;
        com.bytedance.android.livesdk.gift.model.a.b[] bVarArr = new com.bytedance.android.livesdk.gift.model.a.b[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            bVarArr[i4] = new com.bytedance.android.livesdk.dialogv2.b.a();
        }
        for (com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar : list) {
            int i5 = i3 / 8;
            int i6 = i3 % 8;
            if (i6 < 4) {
                i2 = i6 * 2;
            } else {
                i2 = ((i6 - 4) * 2) + 1;
            }
            int i7 = i2 + (i5 * 8);
            i3++;
            if (i7 < size) {
                bVarArr[i7] = bVar;
            }
        }
        List asList = Arrays.asList(bVarArr);
        androidx.recyclerview.widget.j.a(new com.bytedance.android.livesdk.service.b.b(this.f20027f, asList), true).a(this);
        this.f20027f.clear();
        this.f20027f.addAll(asList);
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b.a
    public final void a(String str, String str2) {
        this.f20025d.a(str, str2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ void onBindViewHolder(b bVar, int i2) {
        b bVar2 = bVar;
        com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar3 = this.f20027f.get(i2);
        if (bVar3 == null) {
            return;
        }
        if (bVar3.f17863a == 0) {
            bVar2.itemView.setVisibility(4);
            return;
        }
        if (this.f20028g == bVar3.d()) {
            this.f20022a = bVar2;
            this.f20031j = bVar3;
            bVar2.b();
            this.f20022a.b(this.f20023b);
            if (bVar3 instanceof c) {
                LiveNewGiftPanelWidget.a aVar = this.f20030i;
                Long valueOf = Long.valueOf(bVar3.d());
                Boolean.valueOf(this.f20032k);
                aVar.a(true, valueOf, ((com.bytedance.android.livesdk.gift.model.a.a) bVar3).e());
            }
        }
        if (bVar3.f17863a == 9) {
            boolean e2 = d.u.e();
            if (bVar2 instanceof com.bytedance.android.livesdk.olddialog.giftpanellist.c.a) {
                ((com.bytedance.android.livesdk.olddialog.giftpanellist.c.a) bVar2).f20040a = e2;
            }
        }
        bVar2.a(bVar3, i2 / 8);
    }

    public b a(ViewGroup viewGroup, int i2) {
        b gVar;
        if (i2 == 1) {
            gVar = new g(com.a.a(LayoutInflater.from(this.f20024c), R.layout.bak, viewGroup, false));
        } else if (i2 == 2) {
            gVar = new j(com.a.a(LayoutInflater.from(this.f20024c), R.layout.ban, viewGroup, false));
        } else if (i2 == 9) {
            gVar = new com.bytedance.android.livesdk.olddialog.giftpanellist.c.a(com.a.a(LayoutInflater.from(this.f20024c), R.layout.baj, viewGroup, false));
        } else if (i2 != 10) {
            gVar = new f(com.a.a(LayoutInflater.from(this.f20024c), R.layout.ban, viewGroup, false));
        } else {
            gVar = new m(com.a.a(LayoutInflater.from(this.f20024c), R.layout.bao, viewGroup, false), this.f20034m);
        }
        gVar.a(this);
        gVar.f20061i = this.f20029h;
        return gVar;
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b.a
    public final void a(com.bytedance.android.livesdk.gift.model.a.b bVar, b bVar2) {
        String str;
        String str2;
        AbstractC0407a aVar = this.f20025d;
        if (aVar != null) {
            aVar.a();
        }
        this.f20028g = bVar.d();
        boolean z = false;
        if (this.f20031j != bVar) {
            a.C0445a.C0446a.f21161a.f21160a = false;
            a.C0452a.C0453a.f21303a.a();
            if (bVar instanceof c) {
                LiveNewGiftPanelWidget.a aVar2 = this.f20030i;
                Long valueOf = Long.valueOf(bVar.d());
                Boolean.valueOf(this.f20032k);
                aVar2.a(false, valueOf, ((com.bytedance.android.livesdk.gift.model.a.a) bVar).e());
            }
            b bVar3 = this.f20022a;
            if (bVar3 != null) {
                bVar3.h();
                this.f20022a.c();
            }
            bVar2.b();
            this.f20022a = bVar2;
            if (a.C0498a.f22936a.f22931a && !(bVar2 instanceof j)) {
                c();
            }
            this.f20031j = bVar;
        } else if (this.f20025d != null) {
            if (((u) bVar.f17864b).L != null) {
                z = ((u) bVar.f17864b).L.f19780b;
            }
            if (((bVar instanceof c) || ((bVar instanceof com.bytedance.android.livesdk.dialogv2.b.b) && d.u.e())) && !a.C0498a.f22936a.f22931a && !z) {
                if (!((u) bVar.f17864b).a()) {
                    d(bVar.d());
                }
                AbstractC0407a aVar3 = this.f20025d;
                if (a.C0445a.C0446a.f21161a.f21160a) {
                    str = "call";
                } else {
                    str = "click";
                }
                if (bVar2.e()) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                aVar3.a(bVar, str, str2);
            } else if (bVar instanceof com.bytedance.android.livesdk.dialogv2.b.d) {
                if (!bVar.g()) {
                    d(bVar.d());
                }
                this.f20025d.a(bVar, "", "");
            } else if ((bVar instanceof com.bytedance.android.livesdk.dialogv2.b.b) && !a.C0498a.f22936a.f22931a) {
                d.u.a(this.f20024c, "first_recharge");
            }
        }
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b.a
    public final void a(b bVar, long j2, com.bytedance.android.livesdk.gift.model.a.b bVar2) {
        AbstractC0407a aVar = this.f20025d;
        if (aVar != null) {
            aVar.a();
        }
        this.f20028g = j2;
        if (this.f20031j != bVar2) {
            b bVar3 = this.f20022a;
            if (bVar3 != null) {
                bVar3.h();
                bVar.c();
            }
            bVar.b();
            this.f20022a = bVar;
            this.f20031j = bVar2;
        }
    }

    a(Context context, AbstractC0407a aVar, boolean z) {
        this.f20024c = context;
        this.f20025d = aVar;
        this.f20032k = z;
        this.f20033l = true;
        this.f20023b = a.C0498a.f22936a.f22933c;
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        b a3 = aVar.a(viewGroup, i2);
        try {
            if (a3.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a3.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a3.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(a3.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = a3.getClass().getName();
        return a3;
    }
}
