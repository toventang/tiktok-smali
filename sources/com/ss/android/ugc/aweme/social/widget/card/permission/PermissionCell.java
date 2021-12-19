package com.ss.android.ugc.aweme.social.widget.card.permission;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.keva.Keva;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.a.a;
import com.ss.android.ugc.aweme.social.widget.card.a.f;
import com.ss.android.ugc.aweme.social.widget.card.j;
import com.ss.android.ugc.aweme.social.widget.card.permission.c;
import com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.Map;
import java.util.Objects;

public abstract class PermissionCell<T extends c> extends PowerCell<T> implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public SocialCardVM f133809a;

    /* renamed from: b  reason: collision with root package name */
    final h f133810b = i.a((h.f.a.a) new a(this));

    /* renamed from: j  reason: collision with root package name */
    public T f133811j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f133812k;

    /* renamed from: l  reason: collision with root package name */
    private final h f133813l = i.a((h.f.a.a) new e(this));

    /* renamed from: m  reason: collision with root package name */
    private View f133814m;

    static {
        Covode.recordClassIndex(87534);
    }

    public final SocialCardVM a() {
        return (SocialCardVM) this.f133813l.getValue();
    }

    /* access modifiers changed from: protected */
    public void a(TuxButton tuxButton) {
        l.d(tuxButton, "");
    }

    /* access modifiers changed from: protected */
    public void a(TuxIconView tuxIconView) {
        l.d(tuxIconView, "");
    }

    /* access modifiers changed from: protected */
    public void a(TuxTextView tuxTextView) {
        l.d(tuxTextView, "");
    }

    /* access modifiers changed from: protected */
    public abstract int b();

    /* access modifiers changed from: protected */
    public void b(ViewGroup viewGroup) {
        l.d(viewGroup, "");
    }

    /* access modifiers changed from: protected */
    public void b(TuxTextView tuxTextView) {
        l.d(tuxTextView, "");
    }

    static final class a extends m implements h.f.a.a<com.bytedance.tux.sheet.a.a> {
        final /* synthetic */ PermissionCell this$0;

        static {
            Covode.recordClassIndex(87535);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(PermissionCell permissionCell) {
            super(0);
            this.this$0 = permissionCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.tux.sheet.a.a$e[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.tux.sheet.a.a invoke() {
            return new a.b().a(new a.e().a(R.string.b5g).b(1).a(new h.f.a.b<View, z>(this) {
                /* class com.ss.android.ugc.aweme.social.widget.card.permission.PermissionCell.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(87536);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(View view) {
                    l.d(view, "");
                    this.this$0.this$0.a().b(PermissionCell.a(this.this$0.this$0));
                    return z.f158842a;
                }
            })).b();
        }
    }

    static final class e extends m implements h.f.a.a<SocialCardVM> {
        final /* synthetic */ PermissionCell this$0;

        static {
            Covode.recordClassIndex(87540);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(PermissionCell permissionCell) {
            super(0);
            this.this$0 = permissionCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SocialCardVM invoke() {
            Object obj = this.this$0.f133809a;
            if (obj != null || (obj = PowerCell.b(this.this$0, SocialCardVM.class)) != null || (obj = PowerCell.a(this.this$0, SocialCardVM.class)) != null) {
                return obj;
            }
            throw new IllegalStateException("Where am I? the activity is null!");
        }
    }

    public void onGlobalLayout() {
        View view = this.f133814m;
        if (view == null) {
            l.a("container");
        }
        if (view.getGlobalVisibleRect(new Rect())) {
            SocialCardVM a2 = a();
            T t = this.f133811j;
            if (t == null) {
                l.a("permissionItem");
            }
            a2.a((com.bytedance.ies.powerlist.b.a) t);
            View view2 = this.f133814m;
            if (view2 == null) {
                l.a("container");
            }
            view2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* access modifiers changed from: private */
    public void a(T t) {
        l.d(t, "");
        this.f133811j = t;
    }

    public static final /* synthetic */ c a(PermissionCell permissionCell) {
        T t = permissionCell.f133811j;
        if (t == null) {
            l.a("permissionItem");
        }
        return t;
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PermissionCell f133818a;

        static {
            Covode.recordClassIndex(87539);
        }

        d(PermissionCell permissionCell) {
            this.f133818a = permissionCell;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f133818a.a().b(PermissionCell.a(this.f133818a));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.social.widget.card.permission.PermissionCell<T extends com.ss.android.ugc.aweme.social.widget.card.permission.c> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Object obj) {
        l.d(obj, "");
        a((c) obj);
    }

    static final class c implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PermissionCell f133816a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f133817b;

        static {
            Covode.recordClassIndex(87538);
        }

        c(PermissionCell permissionCell, View view) {
            this.f133816a = permissionCell;
            this.f133817b = view;
        }

        public final boolean onLongClick(View view) {
            Context context = ((ViewGroup) this.f133817b).getContext();
            if (!(context instanceof androidx.fragment.app.e)) {
                context = null;
            }
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) context;
            if (eVar == null) {
                return false;
            }
            ((androidx.fragment.app.d) this.f133816a.f133810b.getValue()).show(eVar.getSupportFragmentManager(), PermissionCell.a(this.f133816a).f133825a.name());
            return true;
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PermissionCell f133815a;

        static {
            Covode.recordClassIndex(87537);
        }

        b(PermissionCell permissionCell) {
            this.f133815a = permissionCell;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SocialCardVM a2 = this.f133815a.a();
            c a3 = PermissionCell.a(this.f133815a);
            l.d(a3, "");
            com.ss.android.ugc.aweme.social.widget.card.a.b b2 = a2.b();
            f fVar = a3.f133825a;
            l.d(fVar, "");
            b2.b();
            Keva a4 = b2.a();
            a4.storeInt(com.ss.android.ugc.aweme.social.widget.card.a.b.a("key_exp_count_", fVar), 0);
            a4.storeInt(com.ss.android.ugc.aweme.social.widget.card.a.b.a("key_delete_count_", fVar), 0);
            a4.storeLong(com.ss.android.ugc.aweme.social.widget.card.a.b.a("key_delete_hide_ts_", fVar), -1);
            a4.storeLong(com.ss.android.ugc.aweme.social.widget.card.a.b.a("key_auto_hide_ts_", fVar), -1);
            j jVar = a2.f133913e;
            if (jVar != null) {
                jVar.a(a3.f133825a, com.ss.android.ugc.aweme.social.widget.card.a.e.ON_CLICK, null);
            }
            f fVar2 = a3.f133825a;
            Map<String, String> map = a2.f133914f;
            l.d(fVar2, "");
            com.ss.android.ugc.aweme.social.widget.card.c.b.a(fVar2, "find_friends", map);
            a2.s.postValue(a3);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), b(), viewGroup, false);
        l.b(a2, "");
        this.f133814m = a2;
        if (a2 == null) {
            l.a("container");
        }
        TuxIconView tuxIconView = (TuxIconView) a2.findViewById(R.id.d3g);
        TuxTextView tuxTextView = (TuxTextView) a2.findViewById(R.id.d3o);
        TuxTextView tuxTextView2 = (TuxTextView) a2.findViewById(R.id.d3d);
        TuxButton tuxButton = (TuxButton) a2.findViewById(R.id.d3e);
        TuxIconView tuxIconView2 = (TuxIconView) a2.findViewById(R.id.d3c);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a2;
        b(viewGroup2);
        l.b(tuxIconView, "");
        a(tuxIconView);
        l.b(tuxTextView, "");
        a(tuxTextView);
        l.b(tuxTextView2, "");
        b(tuxTextView2);
        if (tuxIconView2 != null) {
            l.d(tuxIconView2, "");
        }
        l.b(tuxButton, "");
        a(tuxButton);
        viewGroup2.getViewTreeObserver().addOnGlobalLayoutListener(this);
        a2.setOnClickListener(new b(this));
        if (this.f133812k) {
            a2.setOnLongClickListener(new c(this, a2));
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(8);
            }
        } else if (tuxIconView2 != null) {
            tuxIconView2.setOnClickListener(new d(this));
        }
        View view = this.f133814m;
        if (view == null) {
            l.a("container");
        }
        return view;
    }
}
