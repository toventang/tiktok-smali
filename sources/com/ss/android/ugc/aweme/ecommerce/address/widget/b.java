package com.ss.android.ugc.aweme.ecommerce.address.widget;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class b extends com.ss.android.ugc.aweme.ecommerce.common.a.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f84616e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public h.f.a.b<? super List<Region>, z> f84617a = e.f84626a;

    /* renamed from: b  reason: collision with root package name */
    public h.f.a.b<? super List<Region>, z> f84618b = d.f84625a;

    /* renamed from: c  reason: collision with root package name */
    public h.f.a.a<z> f84619c = C2021b.f84623a;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e f84620d;

    /* renamed from: m  reason: collision with root package name */
    private SparseArray f84621m;

    static {
        Covode.recordClassIndex(52816);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.a.e, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final View a(int i2) {
        if (this.f84621m == null) {
            this.f84621m = new SparseArray();
        }
        View view = (View) this.f84621m.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f84621m.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.a.e, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final void a() {
        SparseArray sparseArray = this.f84621m;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.ecommerce.common.a.e, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52817);
        }

        private a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.b$a$a  reason: collision with other inner class name */
        public static final class C2020a extends m implements h.f.a.b<List<? extends Region>, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final C2020a f84622a = new C2020a();

            static {
                Covode.recordClassIndex(52818);
            }

            C2020a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(List<? extends Region> list) {
                l.d(list, "");
                return z.f158842a;
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static void a(boolean z, String str, int i2, i iVar, String str2, h.f.a.a<z> aVar, h.f.a.b<? super List<Region>, z> bVar, h.f.a.b<? super List<Region>, z> bVar2) {
            l.d(aVar, "");
            l.d(bVar, "");
            l.d(bVar2, "");
            if (iVar != null) {
                b bVar3 = new b();
                Bundle bundle = new Bundle();
                if (str != null) {
                    bundle.putString("geo_name_id", str);
                }
                bundle.putBoolean("needs_dim", z);
                if (i2 <= 0) {
                    i2 = Integer.MAX_VALUE;
                }
                bundle.putInt("level_count", i2);
                bundle.putString("page_info", str2);
                bVar3.setArguments(bundle);
                bVar3.f84617a = bVar;
                bVar3.f84618b = bVar2;
                bVar3.f84619c = aVar;
                bVar3.show(iVar, "");
            }
        }

        public static /* synthetic */ void a(boolean z, String str, int i2, i iVar, String str2, h.f.a.a aVar, h.f.a.b bVar, h.f.a.b bVar2, int i3) {
            boolean z2 = z;
            String str3 = str;
            h.f.a.b bVar3 = bVar2;
            if ((i3 & 1) != 0) {
                z2 = true;
            }
            String str4 = null;
            if ((i3 & 2) != 0) {
                str3 = null;
            }
            if ((i3 & 16) == 0) {
                str4 = str2;
            }
            if ((i3 & 128) != 0) {
                bVar3 = C2020a.f84622a;
            }
            a(z2, str3, i2, iVar, str4, aVar, bVar, bVar3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.b$b  reason: collision with other inner class name */
    static final class C2021b extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2021b f84623a = new C2021b();

        static {
            Covode.recordClassIndex(52819);
        }

        C2021b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(52824);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            Dialog dialog = this.this$0.getDialog();
            if (dialog != null) {
                this.this$0.onCancel(dialog);
            }
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    public b() {
        super((byte) 0);
    }

    public static final class c implements DialogInterface.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f84624a;

        static {
            Covode.recordClassIndex(52820);
        }

        c(b bVar) {
            this.f84624a = bVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
            if (i2 != 4 || keyEvent == null || keyEvent.getAction() != 1) {
                return false;
            }
            com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e eVar = this.f84624a.f84620d;
            if (eVar == null) {
                l.a("regionPickerWrapper");
            }
            return eVar.b();
        }
    }

    static final class d extends m implements h.f.a.b<List<? extends Region>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f84625a = new d();

        static {
            Covode.recordClassIndex(52821);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends Region> list) {
            l.d(list, "");
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.b<List<? extends Region>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f84626a = new e();

        static {
            Covode.recordClassIndex(52822);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends Region> list) {
            l.d(list, "");
            return z.f158842a;
        }
    }

    static final class h extends m implements h.f.a.b<List<? extends Region>, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(52825);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends Region> list) {
            l.d(list, "");
            this.this$0.f84618b.invoke(list);
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.d
    public final void onCancel(DialogInterface dialogInterface) {
        l.d(dialogInterface, "");
        super.onCancel(dialogInterface);
        this.f84619c.invoke();
    }

    static final class f extends m implements h.f.a.b<List<? extends Region>, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(52823);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends Region> list) {
            l.d(list, "");
            this.this$0.dismiss();
            this.this$0.f84617a.invoke(list);
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.d, androidx.appcompat.app.i, com.google.android.material.bottomsheet.b, com.ss.android.ugc.aweme.ecommerce.common.a.e
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(48);
        }
        onCreateDialog.setOnKeyListener(new c(this));
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final void onCreate(Bundle bundle) {
        String str;
        int i2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str2 = null;
        if (arguments != null) {
            str = arguments.getString("geo_name_id");
        } else {
            str = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            i2 = arguments2.getInt("level_count");
        } else {
            i2 = Integer.MAX_VALUE;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str2 = arguments3.getString("page_info");
        }
        this.f84620d = e.d.a(str, null, i2, true, str2, 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e eVar = this.f84620d;
        if (eVar == null) {
            l.a("regionPickerWrapper");
        }
        com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e.a(eVar, null, new g(this), new f(this), new h(this), 1);
        n a2 = getChildFragmentManager().a();
        FrameLayout frameLayout = (FrameLayout) a(R.id.b92);
        l.b(frameLayout, "");
        int id = frameLayout.getId();
        com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e eVar2 = this.f84620d;
        if (eVar2 == null) {
            l.a("regionPickerWrapper");
        }
        a2.a(id, eVar2).c();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.oo, viewGroup, false);
    }
}
