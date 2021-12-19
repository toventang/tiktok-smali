package com.bytedance.android.live.liveinteract.multiguest.opt.b.a;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.f;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.multiguest.a.a.a;
import com.bytedance.android.live.liveinteract.multiguest.g.a.j;
import com.bytedance.android.live.liveinteract.platform.common.g.i;
import com.bytedance.android.live.liveinteract.platform.common.g.o;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.l.a;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.widget.g;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.ArrayList;
import java.util.List;

public class a extends g implements CompoundButton.OnCheckedChangeListener, a.b, com.bytedance.android.live.liveinteract.multiguest.opt.a.a.a {

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.android.live.liveinteract.multiguest.a.a.a f11409a;

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b f11410b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f11411c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f11412d;

    /* renamed from: e  reason: collision with root package name */
    private View f11413e;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView f11414f;

    /* renamed from: g  reason: collision with root package name */
    private SwitchCompat f11415g;

    /* renamed from: h  reason: collision with root package name */
    private final h f11416h;

    static {
        Covode.recordClassIndex(6150);
    }

    private final com.bytedance.android.livesdk.l.a f() {
        return (com.bytedance.android.livesdk.l.a) this.f11416h.getValue();
    }

    @Override // com.bytedance.android.livesdk.widget.g
    public int b() {
        return R.layout.b74;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.a.a.a
    public final void c(long j2) {
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.a.a.a
    public final void d(long j2) {
    }

    static final class c extends m implements h.f.a.a<com.bytedance.android.livesdk.l.a> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(6153);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.livesdk.l.a invoke() {
            a.C0382a aVar = new a.C0382a(this.$context);
            aVar.f18266c = false;
            return aVar.a();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.a.a.a
    public final void a() {
        e();
        if (isShowing()) {
            dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.widget.g
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11410b.f11308c = null;
        e();
    }

    public final void e() {
        if (f().isShowing()) {
            f().dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.a.a.a
    public final void c() {
        e();
        SwitchCompat switchCompat = this.f11415g;
        if (switchCompat == null) {
            l.a("mSwitch");
        }
        switchCompat.setOnCheckedChangeListener(null);
        SwitchCompat switchCompat2 = this.f11415g;
        if (switchCompat2 == null) {
            l.a("mSwitch");
        }
        switchCompat2.setChecked(true);
        SwitchCompat switchCompat3 = this.f11415g;
        if (switchCompat3 == null) {
            l.a("mSwitch");
        }
        switchCompat3.setOnCheckedChangeListener(this);
        ao.a(getContext(), (int) R.string.grw);
    }

    public final void d() {
        int b2 = this.f11409a.b();
        TextView textView = this.f11411c;
        if (textView == null) {
            l.a("mTitleView");
        }
        Context context = getContext();
        l.b(context, "");
        textView.setText(context.getResources().getQuantityString(R.plurals.fn, b2, Integer.valueOf(b2)));
        int a2 = com.bytedance.android.livesdk.b.a.d.a().x - this.f11409a.a();
        if (a2 < 0) {
            a2 = 0;
        }
        TextView textView2 = this.f11412d;
        if (textView2 == null) {
            l.a("mDescriptionView");
        }
        textView2.setText(f.a(R.string.e54, Integer.valueOf(a2)));
        if (this.f11409a.getItemCount() > 0) {
            View view = this.f11413e;
            if (view == null) {
                l.a("mEmptyView");
            }
            view.setVisibility(8);
            RecyclerView recyclerView = this.f11414f;
            if (recyclerView == null) {
                l.a("mRecyclerView");
            }
            recyclerView.setVisibility(0);
            return;
        }
        View view2 = this.f11413e;
        if (view2 == null) {
            l.a("mEmptyView");
        }
        view2.setVisibility(0);
        RecyclerView recyclerView2 = this.f11414f;
        if (recyclerView2 == null) {
            l.a("mRecyclerView");
        }
        recyclerView2.setVisibility(8);
    }

    @Override // com.bytedance.android.livesdk.widget.g
    public void onCreate(Bundle bundle) {
        a(bundle, null);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.a.a.a
    public final void b(long j2) {
        if (this.f22610i) {
            this.f11409a.a(j2);
            d();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.a.a.a
    public final void b(Throwable th) {
        if (this.f22610i) {
            com.bytedance.android.livesdk.utils.f.a(getContext(), th, (int) R.string.grj);
        }
    }

    public static List<com.bytedance.android.livesdk.chatroom.model.b.e> a(List<com.bytedance.android.livesdk.chatroom.model.b.e> list) {
        List g2;
        if (list == null || (g2 = n.g((Iterable) list)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : g2) {
            com.bytedance.android.livesdk.chatroom.model.b.e eVar = (com.bytedance.android.livesdk.chatroom.model.b.e) obj;
            if (eVar.f15726g == 2 || (eVar.f15724e == 2 && eVar.f15726g == 3)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void a(int i2) {
        f().a(getContext().getString(i2));
        if (!f().isShowing()) {
            f().show();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.a.a.a
    public final void a(long j2) {
        if (this.f22610i) {
            e();
            com.bytedance.android.live.liveinteract.multiguest.a.a.a aVar = this.f11409a;
            int size = aVar.f11027b.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    com.bytedance.android.livesdk.chatroom.model.b.e eVar = aVar.f11027b.get(i2);
                    if (eVar != null && eVar.f15722c != null && eVar.f15722c.getId() == j2) {
                        eVar.f15724e = 2;
                        eVar.f15723d = System.currentTimeMillis() / 1000;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            aVar.notifyItemChanged(i2);
            d();
            if (isShowing()) {
                dismiss();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.a.a.b
    public final void a(User user) {
        l.d(user, "");
        if (this.f22610i) {
            String a2 = y.a((int) R.string.e0e, user.displayId);
            b.a aVar = new b.a(getContext());
            aVar.f18284a = a2;
            aVar.b(R.string.e0f).a(R.string.ei8, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC0223a(this, user), false).b(R.string.eid, (DialogInterface.OnClickListener) b.f11419a, false).a().show();
            i.c();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.a.a.a
    public final void a(Throwable th) {
        e();
        if (this.f22610i) {
            com.bytedance.android.livesdk.utils.f.a(getContext(), th, (int) R.string.grk);
        }
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final b f11419a = new b();

        static {
            Covode.recordClassIndex(6152);
        }

        b() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            i.a(0);
            dialogInterface.dismiss();
        }
    }

    static final class e implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CompoundButton f11421a;

        static {
            Covode.recordClassIndex(6155);
        }

        e(CompoundButton compoundButton) {
            this.f11421a = compoundButton;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            CompoundButton compoundButton = this.f11421a;
            if (compoundButton == null) {
                l.b();
            }
            compoundButton.setChecked(true);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.b.a.a$a  reason: collision with other inner class name */
    static final class DialogInterface$OnClickListenerC0223a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11417a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f11418b;

        static {
            Covode.recordClassIndex(6151);
        }

        DialogInterface$OnClickListenerC0223a(a aVar, User user) {
            this.f11417a = aVar;
            this.f11418b = user;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            String str = "";
            l.d(dialogInterface, str);
            i.a(1);
            dialogInterface.dismiss();
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar = this.f11417a.f11410b;
            long id = this.f11418b.getId();
            String secUid = this.f11418b.getSecUid();
            if (secUid != null) {
                str = secUid;
            }
            bVar.a(id, str, "kickout_with_popup_confirm");
        }
    }

    static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11420a;

        static {
            Covode.recordClassIndex(6154);
        }

        d(a aVar) {
            this.f11420a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            dialogInterface.dismiss();
            this.f11420a.a(R.string.grc);
            this.f11420a.f11410b.a(LinkApi.c.USER_CLICK, PrivacyCert.Builder.Companion.with("bpea-527").usage("").tag("turn off guest requests").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            com.bytedance.android.live.liveinteract.platform.common.g.b.d("manual_close");
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!z) {
            if (!com.bytedance.android.live.liveinteract.multilive.anchor.e.c.a()) {
                ao.a(y.e(), (int) R.string.eh6);
            } else if (this.f11409a.getItemCount() <= 0) {
                a(R.string.grc);
                this.f11410b.a(LinkApi.c.USER_CLICK, PrivacyCert.Builder.Companion.with("bpea-526").usage("").tag("finish link mic").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                com.bytedance.android.live.liveinteract.platform.common.g.b.d("manual_close");
            } else {
                b.a b2 = new b.a(getContext()).a(R.string.eof).b(R.string.eog).a(R.string.eoe, (DialogInterface.OnClickListener) new d(this), false).b(R.string.eid, (DialogInterface.OnClickListener) new e(compoundButton), false);
                b2.f18296m = false;
                b2.a().show();
            }
        }
    }

    public final void a(Bundle bundle, com.bytedance.android.live.liveinteract.api.b.n nVar) {
        super.onCreate(bundle);
        View findViewById = findViewById(R.id.djs);
        l.b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f11414f = recyclerView;
        if (recyclerView == null) {
            l.a("mRecyclerView");
        }
        recyclerView.a(new j());
        RecyclerView recyclerView2 = this.f11414f;
        if (recyclerView2 == null) {
            l.a("mRecyclerView");
        }
        getContext();
        recyclerView2.setLayoutManager(new SSLinearLayoutManager(0));
        RecyclerView recyclerView3 = this.f11414f;
        if (recyclerView3 == null) {
            l.a("mRecyclerView");
        }
        recyclerView3.setAdapter(this.f11409a);
        View findViewById2 = findViewById(R.id.en9);
        l.b(findViewById2, "");
        SwitchCompat switchCompat = (SwitchCompat) findViewById2;
        this.f11415g = switchCompat;
        if (switchCompat == null) {
            l.a("mSwitch");
        }
        switchCompat.setOnCheckedChangeListener(this);
        View findViewById3 = findViewById(R.id.title);
        l.b(findViewById3, "");
        this.f11411c = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.akm);
        l.b(findViewById4, "");
        this.f11412d = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.avo);
        l.b(findViewById5, "");
        this.f11413e = findViewById5;
        d();
        o.a(this.f11409a.b(), nVar);
        this.f11409a.c();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.a.a.b
    public final void a(long j2, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (this.f22610i) {
            a(R.string.grl);
            this.f11410b.a(j2, str, str2, 1, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar, List<com.bytedance.android.livesdk.chatroom.model.b.e> list) {
        super(context);
        l.d(context, "");
        l.d(bVar, "");
        this.f11410b = bVar;
        this.f11416h = h.i.a((h.f.a.a) new c(context));
        this.f11409a = new com.bytedance.android.live.liveinteract.multiguest.a.a.a(this, a(list), 0);
        bVar.f11308c = this;
    }
}
