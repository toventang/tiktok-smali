package com.ss.android.ugc.aweme.social.widget.card.rec.cell;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.lifecycle.ac;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.widget.card.rec.vm.SelectedCardVM;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.v;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class RecUserSelectCell extends PowerCell<b> {

    /* renamed from: a  reason: collision with root package name */
    public TuxCheckBox f133833a;

    /* renamed from: b  reason: collision with root package name */
    private SmartAvatarImageView f133834b;

    /* renamed from: j  reason: collision with root package name */
    private TuxTextView f133835j;

    /* renamed from: k  reason: collision with root package name */
    private TuxTextView f133836k;

    /* renamed from: l  reason: collision with root package name */
    private MutualRelationView f133837l;

    /* renamed from: m  reason: collision with root package name */
    private final h f133838m = i.a((h.f.a.a) new d(this));

    static {
        Covode.recordClassIndex(87556);
    }

    public final SelectedCardVM a() {
        return (SelectedCardVM) this.f133838m.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int j() {
        return R.layout.b13;
    }

    static final class d extends m implements h.f.a.a<SelectedCardVM> {
        final /* synthetic */ RecUserSelectCell this$0;

        static {
            Covode.recordClassIndex(87560);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(RecUserSelectCell recUserSelectCell) {
            super(0);
            this.this$0 = recUserSelectCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SelectedCardVM invoke() {
            ac b2 = PowerCell.b(this.this$0, SelectedCardVM.class);
            if (b2 != null || (b2 = PowerCell.a(this.this$0, SelectedCardVM.class)) != null) {
                return b2;
            }
            throw new IllegalStateException("current cell not attach context");
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void l() {
        super.l();
        SelectedCardVM a2 = a();
        T t = this.f34234d;
        if (t == null) {
            l.b();
        }
        b bVar = (b) t;
        l.d(bVar, "");
        String uid = bVar.f133856a.getUid();
        if (!a2.o.contains(uid)) {
            Set<String> set = a2.o;
            l.b(uid, "");
            set.add(uid);
            com.ss.android.ugc.aweme.social.widget.card.c.c.a(bVar.f133856a, a2.f133896a, a2.f133897b, u.a.SHOW, a2.f133898c);
        }
    }

    public static final /* synthetic */ TuxCheckBox a(RecUserSelectCell recUserSelectCell) {
        TuxCheckBox tuxCheckBox = recUserSelectCell.f133833a;
        if (tuxCheckBox == null) {
            l.a("selectView");
        }
        return tuxCheckBox;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecUserSelectCell f133842a;

        static {
            Covode.recordClassIndex(87558);
        }

        b(RecUserSelectCell recUserSelectCell) {
            this.f133842a = recUserSelectCell;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            RecUserSelectCell.a(this.f133842a).setChecked(!RecUserSelectCell.a(this.f133842a).isChecked());
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecUserSelectCell f133839a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f133840b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ User f133841c;

        static {
            Covode.recordClassIndex(87557);
        }

        a(RecUserSelectCell recUserSelectCell, b bVar, User user) {
            this.f133839a = recUserSelectCell;
            this.f133840b = bVar;
            this.f133841c = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SelectedCardVM a2 = this.f133839a.a();
            b bVar = this.f133840b;
            l.d(bVar, "");
            com.ss.android.ugc.aweme.social.widget.card.c.c.a(bVar.f133856a, u.c.POP_UP, null, ag.a(v.a("enter_from", a2.f133896a), v.a("enter_method", a2.f133897b)));
            User user = this.f133841c;
            l.b(view, "");
            Context context = view.getContext();
            l.b(context, "");
            com.ss.android.ugc.aweme.social.widget.a.a.a(user, context, this.f133839a.a().f133896a, this.f133839a.a().f133897b, null, null, 24);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = super.a(viewGroup);
        View findViewById = a2.findViewById(R.id.ow);
        l.b(findViewById, "");
        this.f133834b = (SmartAvatarImageView) findViewById;
        View findViewById2 = a2.findViewById(R.id.cv9);
        l.b(findViewById2, "");
        this.f133835j = (TuxTextView) findViewById2;
        View findViewById3 = a2.findViewById(R.id.di0);
        l.b(findViewById3, "");
        this.f133836k = (TuxTextView) findViewById3;
        View findViewById4 = a2.findViewById(R.id.crt);
        l.b(findViewById4, "");
        this.f133837l = (MutualRelationView) findViewById4;
        View findViewById5 = a2.findViewById(R.id.dx7);
        l.b(findViewById5, "");
        this.f133833a = (TuxCheckBox) findViewById5;
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(b bVar) {
        b bVar2 = bVar;
        l.d(bVar2, "");
        super.a((com.bytedance.ies.powerlist.b.a) bVar2);
        User user = bVar2.f133856a;
        TuxTextView tuxTextView = this.f133835j;
        if (tuxTextView == null) {
            l.a("nicknameView");
        }
        com.ss.android.ugc.aweme.social.widget.a.a.a(tuxTextView, user);
        SmartAvatarImageView smartAvatarImageView = this.f133834b;
        if (smartAvatarImageView == null) {
            l.a("avatarView");
        }
        UrlModel avatarThumb = user.getAvatarThumb();
        l.b(avatarThumb, "");
        com.ss.android.ugc.aweme.social.widget.a.a.a(smartAvatarImageView, avatarThumb);
        TuxTextView tuxTextView2 = this.f133836k;
        if (tuxTextView2 == null) {
            l.a("reasonView");
        }
        MutualRelationView mutualRelationView = this.f133837l;
        if (mutualRelationView == null) {
            l.a("mutualView");
        }
        com.ss.android.ugc.aweme.social.widget.a.a.a(user, tuxTextView2, mutualRelationView);
        TuxCheckBox tuxCheckBox = this.f133833a;
        if (tuxCheckBox == null) {
            l.a("selectView");
        }
        tuxCheckBox.setChecked(bVar2.f133857b);
        SmartAvatarImageView smartAvatarImageView2 = this.f133834b;
        if (smartAvatarImageView2 == null) {
            l.a("avatarView");
        }
        smartAvatarImageView2.setOnClickListener(new a(this, bVar2, user));
        this.itemView.setOnClickListener(new b(this));
        TuxCheckBox tuxCheckBox2 = this.f133833a;
        if (tuxCheckBox2 == null) {
            l.a("selectView");
        }
        tuxCheckBox2.setOnCheckedChangeListener(new c(this, bVar2));
    }

    static final class c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecUserSelectCell f133843a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f133844b;

        static {
            Covode.recordClassIndex(87559);
        }

        c(RecUserSelectCell recUserSelectCell, b bVar) {
            this.f133843a = recUserSelectCell;
            this.f133844b = bVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SelectedCardVM a2 = this.f133843a.a();
            b bVar = this.f133844b;
            boolean isChecked = RecUserSelectCell.a(this.f133843a).isChecked();
            l.d(bVar, "");
            bVar.f133857b = isChecked;
            List<b> value = a2.f133902g.getValue();
            int i2 = 0;
            if (value != null) {
                Iterator<T> it = value.iterator();
                while (it.hasNext()) {
                    i2 += it.next().f133857b ? 1 : 0;
                }
            }
            a2.f133904i.postValue(Integer.valueOf(i2));
        }
    }
}
