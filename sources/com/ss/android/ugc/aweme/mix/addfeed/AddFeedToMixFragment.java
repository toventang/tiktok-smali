package com.ss.android.ugc.aweme.mix.addfeed;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.h.v;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.PowerStub;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.servicimpl.SplitVideoServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.y;
import h.w;
import h.z;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

public final class AddFeedToMixFragment extends Fragment implements c, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: i  reason: collision with root package name */
    public static final c f109709i = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Aweme f109710a;

    /* renamed from: b  reason: collision with root package name */
    public String f109711b = "";

    /* renamed from: c  reason: collision with root package name */
    public boolean f109712c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.mix.api.b f109713d;

    /* renamed from: e  reason: collision with root package name */
    public String f109714e = "";

    /* renamed from: f  reason: collision with root package name */
    public String f109715f = "";

    /* renamed from: g  reason: collision with root package name */
    public String f109716g = "";

    /* renamed from: h  reason: collision with root package name */
    public boolean f109717h;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f109718j = h.i.a((h.f.a.a) new n(this));

    /* renamed from: k  reason: collision with root package name */
    private TuxNavBar.a f109719k;

    /* renamed from: l  reason: collision with root package name */
    private final h.f.a.b<f, z> f109720l = new l(this);

    /* renamed from: m  reason: collision with root package name */
    private SparseArray f109721m;

    static {
        Covode.recordClassIndex(70241);
    }

    public final View a(int i2) {
        if (this.f109721m == null) {
            this.f109721m = new SparseArray();
        }
        View view = (View) this.f109721m.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f109721m.put(i2, findViewById);
        return findViewById;
    }

    public final GetMixListViewModel a() {
        return (GetMixListViewModel) this.f109718j.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(114, new org.greenrobot.eventbus.g(AddFeedToMixFragment.class, "onCreateMixListSuccess", com.ss.android.ugc.aweme.mix.b.d.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public static final class c {
        static {
            Covode.recordClassIndex(70249);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    public static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        public UrlModel f109731a;

        /* renamed from: b  reason: collision with root package name */
        public int f109732b;

        /* renamed from: c  reason: collision with root package name */
        public String f109733c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f109734d;

        static {
            Covode.recordClassIndex(70248);
        }

        @Override // com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment.d
        public final boolean a() {
            return this.f109734d;
        }

        private b() {
            super((byte) 0);
            this.f109731a = null;
            this.f109732b = 0;
            this.f109733c = null;
            this.f109734d = false;
        }

        public final int hashCode() {
            int i2;
            UrlModel urlModel = this.f109731a;
            int i3 = 0;
            if (urlModel != null) {
                i2 = urlModel.hashCode();
            } else {
                i2 = 0;
            }
            int i4 = ((i2 * 31) + this.f109732b) * 31;
            String str = this.f109733c;
            if (str != null) {
                i3 = str.hashCode();
            }
            int i5 = (i4 + i3) * 31;
            boolean z = this.f109734d;
            if (z) {
                z = true;
            }
            int i6 = z ? 1 : 0;
            int i7 = z ? 1 : 0;
            int i8 = z ? 1 : 0;
            return i5 + i6;
        }

        public final String toString() {
            return "AddFeedToMixListItem(cover=" + this.f109731a + ", type=" + this.f109732b + ", mixId=" + this.f109733c + ", select=" + this.f109734d + ")";
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        @Override // com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment.d
        public final void a(boolean z) {
            this.f109734d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!h.f.b.l.a(this.f109731a, bVar.f109731a) || this.f109732b != bVar.f109732b || !h.f.b.l.a((Object) this.f109733c, (Object) bVar.f109733c) || this.f109734d != bVar.f109734d) {
                return false;
            }
            return true;
        }
    }

    public static class d implements com.bytedance.ies.powerlist.b.a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f109735a;

        /* renamed from: e  reason: collision with root package name */
        public String f109736e;

        static {
            Covode.recordClassIndex(70250);
        }

        @Override // com.bytedance.ies.powerlist.b.a
        public final Object c(com.bytedance.ies.powerlist.b.a aVar) {
            return null;
        }

        public boolean a() {
            return this.f109735a;
        }

        private d() {
            this.f109735a = false;
            this.f109736e = null;
        }

        public /* synthetic */ d(byte b2) {
            this();
        }

        public void a(boolean z) {
            this.f109735a = z;
        }

        @Override // com.bytedance.ies.powerlist.b.a
        public final boolean b(com.bytedance.ies.powerlist.b.a aVar) {
            return aVar.equals(this);
        }

        @Override // com.bytedance.ies.powerlist.b.a
        public final boolean a(com.bytedance.ies.powerlist.b.a aVar) {
            return aVar.equals(this);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ View $view$inlined;
        final /* synthetic */ AddFeedToMixFragment this$0;

        static {
            Covode.recordClassIndex(70255);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(AddFeedToMixFragment addFeedToMixFragment, View view) {
            super(0);
            this.this$0 = addFeedToMixFragment;
            this.$view$inlined = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            /*
                r1 = this;
                com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment r0 = r1.this$0
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                h.z r0 = h.z.f158842a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment.i.invoke():java.lang.Object");
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ View $view$inlined;
        final /* synthetic */ AddFeedToMixFragment this$0;

        static {
            Covode.recordClassIndex(70254);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(AddFeedToMixFragment addFeedToMixFragment, View view) {
            super(0);
            this.this$0 = addFeedToMixFragment;
            this.$view$inlined = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            AddFeedToMixFragment.a(this.$view$inlined);
            this.this$0.b();
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f109721m;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<GetMixListViewModel> {
        final /* synthetic */ AddFeedToMixFragment this$0;

        static {
            Covode.recordClassIndex(70261);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(AddFeedToMixFragment addFeedToMixFragment) {
            super(0);
            this.this$0 = addFeedToMixFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ GetMixListViewModel invoke() {
            ac a2 = ae.a(this.this$0, (ad.b) null).a(GetMixListViewModel.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = getView();
        if (view != null) {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            view.setOnKeyListener(m.f109749a);
        }
    }

    public final void b() {
        try {
            androidx.fragment.app.i fragmentManager = getFragmentManager();
            if (fragmentManager != null) {
                fragmentManager.a().a(R.anim.dq, R.anim.dx).a(this).d();
            }
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    public static final class AddFeedToMixListCell extends PowerCell<b> {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ h.k.i[] f109722a = {new y(AddFeedToMixListCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/mix/addfeed/IMixFeedControl;", 0)};

        /* renamed from: b  reason: collision with root package name */
        private final h.h.d f109723b = new a(this);

        static {
            Covode.recordClassIndex(70242);
        }

        public final c a() {
            return (c) this.f109723b.a(this, f109722a[0]);
        }

        public static final class a implements h.h.d<Object, c> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ PowerCell f109724a;

            static {
                Covode.recordClassIndex(70243);
            }

            public a(PowerCell powerCell) {
                this.f109724a = powerCell;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
                if (r0 == null) goto L_0x004b;
             */
            @Override // h.h.d
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ com.ss.android.ugc.aweme.mix.addfeed.c a(java.lang.Object r6, h.k.i r7) {
                /*
                // Method dump skipped, instructions count: 149
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment.AddFeedToMixListCell.a.a(java.lang.Object, h.k.i):java.lang.Object");
            }
        }

        @Override // com.bytedance.ies.powerlist.PowerCell
        public final View a(ViewGroup viewGroup) {
            h.f.b.l.d(viewGroup, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ako, viewGroup, false);
            h.f.b.l.b(a2, "");
            return a2;
        }

        static final class b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AddFeedToMixListCell f109725a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f109726b;

            static {
                Covode.recordClassIndex(70244);
            }

            b(AddFeedToMixListCell addFeedToMixListCell, b bVar) {
                this.f109725a = addFeedToMixListCell;
                this.f109726b = bVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.CheckBox");
                CheckBox checkBox = (CheckBox) view;
                if (!checkBox.isChecked()) {
                    GetMixListViewModel getMixListViewModel = (GetMixListViewModel) PowerCell.b(this.f109725a, GetMixListViewModel.class);
                    if (getMixListViewModel == null || !getMixListViewModel.f109781j) {
                        checkBox.setChecked(!checkBox.isChecked());
                        return;
                    }
                    GetMixListViewModel getMixListViewModel2 = (GetMixListViewModel) PowerCell.b(this.f109725a, GetMixListViewModel.class);
                    if (getMixListViewModel2 != null) {
                        getMixListViewModel2.a(-1, (d) null);
                    }
                }
                c a2 = this.f109725a.a();
                if (a2 != null) {
                    a2.a(new f(checkBox.isChecked(), this.f109726b.f109733c, this.f109725a.getAdapterPosition(), this.f109726b));
                }
            }
        }

        static final class d implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AddFeedToMixListCell f109729a;

            static {
                Covode.recordClassIndex(70246);
            }

            d(AddFeedToMixListCell addFeedToMixListCell) {
                this.f109729a = addFeedToMixListCell;
            }

            public final void onClick(View view) {
                Context context;
                String str;
                String str2;
                Aweme aweme;
                ClickAgent.onClick(view);
                if (view != null && (context = view.getContext()) != null) {
                    Bundle bundle = new Bundle();
                    GetMixListViewModel getMixListViewModel = (GetMixListViewModel) PowerCell.b(this.f109729a, GetMixListViewModel.class);
                    if (!(getMixListViewModel == null || (aweme = getMixListViewModel.f109778g) == null)) {
                        bundle.putSerializable("key_mix_add_aweme_info", aweme);
                    }
                    IMixFeedService k2 = MixFeedService.k();
                    GetMixListViewModel getMixListViewModel2 = (GetMixListViewModel) PowerCell.b(this.f109729a, GetMixListViewModel.class);
                    if (getMixListViewModel2 == null || (str = getMixListViewModel2.f109779h) == null) {
                        str = "";
                    }
                    GetMixListViewModel getMixListViewModel3 = (GetMixListViewModel) PowerCell.b(this.f109729a, GetMixListViewModel.class);
                    if (getMixListViewModel3 == null || (str2 = getMixListViewModel3.f109780i) == null) {
                        str2 = "";
                    }
                    k2.a(context, bundle, 3, str, str2);
                }
            }
        }

        static final class c implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AddFeedToMixListCell f109727a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f109728b;

            static {
                Covode.recordClassIndex(70245);
            }

            c(AddFeedToMixListCell addFeedToMixListCell, b bVar) {
                this.f109727a = addFeedToMixListCell;
                this.f109728b = bVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                View view2 = this.f109727a.itemView;
                h.f.b.l.b(view2, "");
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view2.findViewById(R.id.bsm);
                h.f.b.l.b(appCompatCheckBox, "");
                if (appCompatCheckBox.isChecked()) {
                    GetMixListViewModel getMixListViewModel = (GetMixListViewModel) PowerCell.b(this.f109727a, GetMixListViewModel.class);
                    if (getMixListViewModel != null && getMixListViewModel.f109781j) {
                        GetMixListViewModel getMixListViewModel2 = (GetMixListViewModel) PowerCell.b(this.f109727a, GetMixListViewModel.class);
                        if (getMixListViewModel2 != null) {
                            getMixListViewModel2.a(-1, (d) null);
                        }
                    } else {
                        return;
                    }
                }
                View view3 = this.f109727a.itemView;
                h.f.b.l.b(view3, "");
                AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) view3.findViewById(R.id.bsm);
                h.f.b.l.b(appCompatCheckBox2, "");
                View view4 = this.f109727a.itemView;
                h.f.b.l.b(view4, "");
                AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) view4.findViewById(R.id.bsm);
                h.f.b.l.b(appCompatCheckBox3, "");
                appCompatCheckBox2.setChecked(true ^ appCompatCheckBox3.isChecked());
                c a2 = this.f109727a.a();
                if (a2 != null) {
                    View view5 = this.f109727a.itemView;
                    h.f.b.l.b(view5, "");
                    AppCompatCheckBox appCompatCheckBox4 = (AppCompatCheckBox) view5.findViewById(R.id.bsm);
                    h.f.b.l.b(appCompatCheckBox4, "");
                    a2.a(new f(appCompatCheckBox4.isChecked(), this.f109728b.f109733c, this.f109727a.getAdapterPosition(), this.f109728b));
                }
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
        @Override // com.bytedance.ies.powerlist.PowerCell
        public final /* synthetic */ void a(b bVar) {
            b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            int i2 = bVar2.f109732b;
            if (i2 == 0) {
                View view = this.itemView;
                h.f.b.l.b(view, "");
                ((TuxIconView) view.findViewById(R.id.bsd)).setBackgroundResource(2131233210);
                View view2 = this.itemView;
                h.f.b.l.b(view2, "");
                ((TuxTextView) view2.findViewById(R.id.bsh)).setTuxFont(42);
                View view3 = this.itemView;
                h.f.b.l.b(view3, "");
                ((TuxTextView) view3.findViewById(R.id.bsh)).setText(R.string.awh);
                View view4 = this.itemView;
                h.f.b.l.b(view4, "");
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view4.findViewById(R.id.bsm);
                h.f.b.l.b(appCompatCheckBox, "");
                appCompatCheckBox.setVisibility(8);
                View view5 = this.itemView;
                h.f.b.l.b(view5, "");
                ((AutoRTLImageView) view5.findViewById(R.id.bsn)).setBackgroundResource(2131233199);
                View view6 = this.itemView;
                h.f.b.l.b(view6, "");
                AutoRTLImageView autoRTLImageView = (AutoRTLImageView) view6.findViewById(R.id.bsn);
                h.f.b.l.b(autoRTLImageView, "");
                autoRTLImageView.setVisibility(0);
                this.itemView.setOnClickListener(new d(this));
            } else if (i2 == 1) {
                View view7 = this.itemView;
                h.f.b.l.b(view7, "");
                ((TuxIconView) view7.findViewById(R.id.bsd)).setBackgroundResource(2131233213);
                View view8 = this.itemView;
                h.f.b.l.b(view8, "");
                ((TuxTextView) view8.findViewById(R.id.bsh)).setTuxFont(41);
                View view9 = this.itemView;
                h.f.b.l.b(view9, "");
                TuxTextView tuxTextView = (TuxTextView) view9.findViewById(R.id.bsh);
                h.f.b.l.b(tuxTextView, "");
                tuxTextView.setText(bVar2.f109736e);
                View view10 = this.itemView;
                h.f.b.l.b(view10, "");
                AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) view10.findViewById(R.id.bsm);
                h.f.b.l.b(appCompatCheckBox2, "");
                appCompatCheckBox2.setChecked(bVar2.f109734d);
                View view11 = this.itemView;
                h.f.b.l.b(view11, "");
                ((AppCompatCheckBox) view11.findViewById(R.id.bsm)).setOnClickListener(new b(this, bVar2));
                View view12 = this.itemView;
                h.f.b.l.b(view12, "");
                AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) view12.findViewById(R.id.bsn);
                h.f.b.l.b(autoRTLImageView2, "");
                autoRTLImageView2.setVisibility(8);
                View view13 = this.itemView;
                h.f.b.l.b(view13, "");
                AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) view13.findViewById(R.id.bsm);
                h.f.b.l.b(appCompatCheckBox3, "");
                appCompatCheckBox3.setVisibility(0);
                this.itemView.setOnClickListener(new c(this, bVar2));
            }
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f109730a;

        static {
            Covode.recordClassIndex(70247);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && this.f109730a == ((a) obj).f109730a;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.f109730a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "AddButtonPowerData(buttonEnabled=" + this.f109730a + ")";
        }

        public a(boolean z) {
            this.f109730a = z;
        }
    }

    public static final class k extends com.bytedance.s.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddFeedToMixFragment f109748a;

        static {
            Covode.recordClassIndex(70258);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(AddFeedToMixFragment addFeedToMixFragment) {
            this.f109748a = addFeedToMixFragment;
        }

        @Override // com.bytedance.s.a.a
        public final void a(Exception exc) {
            super.a(exc);
            DmtStatusView dmtStatusView = (DmtStatusView) this.f109748a.a(R.id.hk);
            if (dmtStatusView != null) {
                dmtStatusView.h();
            }
        }

        @Override // com.bytedance.s.a.a
        public final void a(boolean z) {
            super.a(z);
            DmtStatusView dmtStatusView = (DmtStatusView) this.f109748a.a(R.id.hk);
            if (dmtStatusView != null) {
                dmtStatusView.setVisibility(8);
            }
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddFeedToMixFragment f109743a;

        static {
            Covode.recordClassIndex(70253);
        }

        g(AddFeedToMixFragment addFeedToMixFragment) {
            this.f109743a = addFeedToMixFragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f109743a.a().b();
        }
    }

    public static void a(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) a(view.getContext(), "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddFeedToMixFragment f109744a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f109745b;

        static {
            Covode.recordClassIndex(70256);
        }

        j(AddFeedToMixFragment addFeedToMixFragment, View view) {
            this.f109744a = addFeedToMixFragment;
            this.f109745b = view;
        }

        public static final class a implements com.ss.android.ugc.aweme.mix.api.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Aweme f109746a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ j f109747b;

            static {
                Covode.recordClassIndex(70257);
            }

            @Override // com.ss.android.ugc.aweme.mix.api.a
            public final void b(boolean z) {
            }

            /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
                	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                	at java.base/java.util.Objects.checkIndex(Objects.java:359)
                	at java.base/java.util.ArrayList.get(ArrayList.java:427)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                */
            @Override // com.ss.android.ugc.aweme.mix.api.a
            public final void a(boolean r4) {
                /*
                    r3 = this;
                    com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$j r0 = r3.f109747b
                    com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment r1 = r0.f109744a
                    r0 = 2131362696(0x7f0a0388, float:1.834518E38)
                    android.view.View r1 = r1.a(r0)
                    com.bytedance.tux.button.TuxButton r1 = (com.bytedance.tux.button.TuxButton) r1
                    r0 = 0
                    r1.setLoading(r0)
                    if (r4 == 0) goto L_0x0046
                    com.ss.android.ugc.aweme.feed.model.PlayListInfo r1 = new com.ss.android.ugc.aweme.feed.model.PlayListInfo
                    r1.<init>()
                    com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$j r0 = r3.f109747b
                    com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment r0 = r0.f109744a
                    java.lang.String r0 = r0.f109711b
                    r1.setMixId(r0)
                    com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$j r0 = r3.f109747b
                    com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment r0 = r0.f109744a
                    java.lang.String r0 = r0.f109714e
                    r1.setMixName(r0)
                    com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$j r0 = r3.f109747b
                    com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment r0 = r0.f109744a
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f109710a
                    if (r0 == 0) goto L_0x0034
                    r0.playlist_info = r1
                L_0x0034:
                    com.ss.android.ugc.aweme.mix.b.j r2 = new com.ss.android.ugc.aweme.mix.b.j
                    r1 = 1
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.f109746a
                    r2.<init>(r1, r0)
                    com.ss.android.ugc.d.a.c.a(r2)
                    com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment$j r0 = r3.f109747b
                    com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment r0 = r0.f109744a
                    com.bytedance.tux.sheet.sheet.a.b.a(r0)
                L_0x0046:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment.j.a.a(boolean):void");
            }

            a(Aweme aweme, j jVar) {
                this.f109746a = aweme;
                this.f109747b = jVar;
            }
        }

        public final void onClick(View view) {
            boolean z;
            String str;
            ClickAgent.onClick(view);
            boolean z2 = true;
            if (this.f109744a.getActivity() != null) {
                if (this.f109744a.f109712c) {
                    com.ss.android.ugc.aweme.mix.api.b bVar = this.f109744a.f109713d;
                    if (bVar != null) {
                        bVar.chooseMixResult(this.f109744a.f109711b, this.f109744a.f109714e);
                    }
                    this.f109744a.b();
                } else {
                    ((TuxButton) this.f109744a.a(R.id.xp)).setLoading(true);
                    Aweme aweme = this.f109744a.f109710a;
                    if (aweme != null) {
                        androidx.fragment.app.e activity = this.f109744a.getActivity();
                        if (activity == null) {
                            h.f.b.l.b();
                        }
                        h.f.b.l.b(activity, "");
                        Aweme aweme2 = this.f109744a.f109710a;
                        if (aweme2 == null) {
                            h.f.b.l.b();
                        }
                        String str2 = this.f109744a.f109711b;
                        if (str2 == null) {
                            h.f.b.l.b();
                        }
                        com.ss.android.ugc.aweme.mix.d.a.a(activity, aweme2, str2, MixFeedApi.b.VIDEOADD.getOperation(), new a(aweme, this), this.f109744a.f109715f, this.f109744a.f109716g);
                    }
                }
                AddFeedToMixFragment.a(this.f109745b);
            }
            AddFeedToMixFragment addFeedToMixFragment = this.f109744a;
            if (TextUtils.isEmpty(addFeedToMixFragment.f109711b) || TextUtils.isEmpty(addFeedToMixFragment.f109714e)) {
                z = false;
            } else {
                z = true;
            }
            if (!TextUtils.isEmpty(addFeedToMixFragment.f109711b) || TextUtils.isEmpty(addFeedToMixFragment.f109714e)) {
                z2 = false;
            }
            if (z) {
                str = "exist";
            } else if (z2) {
                str = "new";
            } else {
                str = "";
            }
            String str3 = addFeedToMixFragment.f109711b;
            String str4 = addFeedToMixFragment.f109715f;
            h.f.b.l.d(str, "");
            r.a("add_split_to_playlist", new com.ss.android.ugc.aweme.app.f.d().a("playlist_id", str3).a("playlist_status", str).a("enter_from", str4).f66730a);
            if (h.f.b.l.a((Object) str, (Object) "new")) {
                com.ss.android.ugc.aweme.mix.a.a.b(addFeedToMixFragment.f109715f, addFeedToMixFragment.f109716g);
            }
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onCreateMixListSuccess(com.ss.android.ugc.aweme.mix.b.d dVar) {
        h.f.b.l.d(dVar, "");
        if (!dVar.f109815e && dVar.f109811a && !TextUtils.isEmpty(dVar.f109813c) && !TextUtils.isEmpty(dVar.f109812b)) {
            ((DmtStatusView) a(R.id.hk)).f();
            GetMixListViewModel a2 = a();
            String str = dVar.f109813c;
            h.f.b.l.d(str, "");
            a2.f109777f = str;
            a2.f109772a = -1;
            a2.f109773b = null;
            a().b();
            if (!TextUtils.isEmpty(dVar.f109813c)) {
                this.f109711b = dVar.f109813c;
                this.f109714e = dVar.f109812b;
                TuxButton tuxButton = (TuxButton) a(R.id.xp);
                h.f.b.l.b(tuxButton, "");
                tuxButton.setEnabled(true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.addfeed.c
    public final void a(a aVar) {
        h.f.b.l.d(aVar, "");
        TuxButton tuxButton = (TuxButton) a(R.id.xp);
        if (tuxButton != null) {
            tuxButton.setEnabled(aVar.f109730a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        String str;
        boolean z;
        String str2;
        String str3;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str4 = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("key_add_mix_aweme");
        } else {
            serializable = null;
        }
        this.f109710a = (Aweme) serializable;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("key_choosed_mix_id");
        } else {
            str = null;
        }
        this.f109711b = str;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str4 = arguments3.getString("key_choosed_mix_name");
        }
        this.f109714e = str4;
        a().f109778g = this.f109710a;
        GetMixListViewModel a2 = a();
        String str5 = this.f109711b;
        if (str5 == null) {
            str5 = "";
        }
        h.f.b.l.d(str5, "");
        a2.f109777f = str5;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            z = arguments4.getBoolean("key_full_scrren", false);
        } else {
            z = false;
        }
        this.f109712c = z;
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (str2 = arguments5.getString("enter_from")) == null) {
            str2 = "";
        }
        this.f109715f = str2;
        Bundle arguments6 = getArguments();
        if (arguments6 == null || (str3 = arguments6.getString("enter_method")) == null) {
            str3 = "";
        }
        this.f109716g = str3;
        GetMixListViewModel a3 = a();
        String str6 = this.f109715f;
        String str7 = this.f109716g;
        h.f.b.l.d(str6, "");
        h.f.b.l.d(str7, "");
        a3.f109779h = str6;
        a3.f109780i = str7;
        if (this.f109712c) {
            a().f109774c = false;
            a().f109781j = true;
        }
        if (SplitVideoServiceImpl.a().showPlayList() || SplitVideoServiceImpl.a().playListAutoTake()) {
            a().f109775d = true;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<f, z> {
        final /* synthetic */ AddFeedToMixFragment this$0;

        static {
            Covode.recordClassIndex(70259);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(AddFeedToMixFragment addFeedToMixFragment) {
            super(1);
            this.this$0 = addFeedToMixFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(f fVar) {
            boolean z;
            d dVar;
            Integer num;
            f fVar2 = fVar;
            h.f.b.l.d(fVar2, "");
            boolean z2 = false;
            if (!this.this$0.f109712c || !this.this$0.f109717h) {
                z = false;
            } else {
                z = true;
            }
            TuxButton tuxButton = (TuxButton) this.this$0.a(R.id.xp);
            h.f.b.l.b(tuxButton, "");
            if (this.this$0.a().f109772a != -1 || fVar2.f109739a || z) {
                z2 = true;
            }
            tuxButton.setEnabled(z2);
            PowerList powerList = (PowerList) this.this$0.a(R.id.de3);
            h.f.b.l.b(powerList, "");
            com.bytedance.ies.powerlist.b.a b2 = powerList.getState().b(fVar2.f109741c);
            if (!(b2 instanceof d)) {
                b2 = null;
            }
            d dVar2 = (d) b2;
            if (dVar2 != null) {
                dVar2.a(fVar2.f109739a);
                PowerList powerList2 = (PowerList) this.this$0.a(R.id.de3);
                h.f.b.l.b(powerList2, "");
                powerList2.getState().b(fVar2.f109741c, dVar2);
            }
            TuxButton tuxButton2 = (TuxButton) this.this$0.a(R.id.xp);
            h.f.b.l.b(tuxButton2, "");
            if (tuxButton2.isEnabled()) {
                TuxButton tuxButton3 = (TuxButton) this.this$0.a(R.id.xp);
                Resources resources = this.this$0.getResources();
                if (resources != null) {
                    num = Integer.valueOf(resources.getColor(R.color.f159928l));
                } else {
                    num = null;
                }
                tuxButton3.setTextColor(num.intValue());
            }
            if (fVar2.f109739a && (dVar = this.this$0.a().f109773b) != null) {
                dVar.a(true ^ dVar.a());
                PowerList powerList3 = (PowerList) this.this$0.a(R.id.de3);
                h.f.b.l.b(powerList3, "");
                powerList3.getState().b(this.this$0.a().f109772a, dVar);
            }
            if (fVar2.f109739a) {
                this.this$0.f109711b = fVar2.f109740b;
                this.this$0.f109714e = fVar2.f109742d.f109736e;
            } else {
                this.this$0.f109711b = "";
                this.this$0.f109714e = "";
            }
            if (fVar2.f109739a) {
                GetMixListViewModel a2 = this.this$0.a();
                int i2 = fVar2.f109741c;
                PowerList powerList4 = (PowerList) this.this$0.a(R.id.de3);
                h.f.b.l.b(powerList4, "");
                com.bytedance.ies.powerlist.b.a b3 = powerList4.getState().b(fVar2.f109741c);
                Objects.requireNonNull(b3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment.MixListItem");
                a2.a(i2, (d) b3);
            } else {
                this.this$0.a().a(-1, (d) null);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.addfeed.c
    public final void a(e eVar) {
        h.f.b.l.d(eVar, "");
        if (eVar.f109737a) {
            this.f109714e = eVar.f109738b;
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.addfeed.c
    public final void a(f fVar) {
        h.f.b.l.d(fVar, "");
        this.f109720l.invoke(fVar);
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public boolean f109737a;

        /* renamed from: b  reason: collision with root package name */
        public String f109738b;

        static {
            Covode.recordClassIndex(70251);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f109737a == eVar.f109737a && h.f.b.l.a(this.f109738b, eVar.f109738b);
        }

        public final int hashCode() {
            boolean z = this.f109737a;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            String str = this.f109738b;
            return i5 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "MixNamePowerData(btnAble=" + this.f109737a + ", mixName=" + this.f109738b + ")";
        }

        public e(boolean z, String str) {
            this.f109737a = z;
            this.f109738b = str;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(2540);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(2540);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MethodCollector.i(2526);
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        DmtStatusView dmtStatusView = (DmtStatusView) a(R.id.hk);
        DmtStatusView.a a2 = DmtStatusView.a.a(getContext());
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.al4, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.biq);
        h.f.b.l.b(findViewById, "");
        View findViewById2 = inflate.findViewById(R.id.f9l);
        h.f.b.l.b(findViewById2, "");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.eyc);
        h.f.b.l.b(findViewById3, "");
        TextView textView2 = (TextView) findViewById3;
        ((AutoRTLImageView) findViewById).setBackgroundResource(2131232658);
        if (getContext() != null) {
            textView.setText(R.string.dht);
            textView2.setVisibility(8);
        }
        h.f.b.l.b(inflate, "");
        DmtStatusView.a a3 = a2.b(inflate).a(R.string.g21, new g(this));
        a3.f33605g = 0;
        dmtStatusView.setBuilder(a3);
        ((DmtStatusView) a(R.id.hk)).f();
        this.f109719k = new TuxNavBar.a();
        v.e(view);
        TuxNavBar.a aVar = this.f109719k;
        if (aVar == null) {
            h.f.b.l.a("navActions");
        }
        if (this.f109712c) {
            com.bytedance.tux.navigation.a.b a4 = new com.bytedance.tux.navigation.a.b().a(R.raw.icon_arrow_left_ltr);
            a4.f45194b = true;
            aVar.a(a4.a((h.f.a.a<z>) new h(this, view)));
            View a5 = a(R.id.a14);
            h.f.b.l.b(a5, "");
            a5.setVisibility(0);
            TuxButton tuxButton = (TuxButton) a(R.id.xp);
            h.f.b.l.b(tuxButton, "");
            tuxButton.setText(getResources().getText(R.string.bba));
        } else {
            com.bytedance.tux.navigation.a.b a6 = new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark);
            a6.f45194b = true;
            aVar.b(a6.a((h.f.a.a<z>) new i(this, view)));
            View a7 = a(R.id.a14);
            h.f.b.l.b(a7, "");
            a7.setVisibility(8);
        }
        com.bytedance.tux.navigation.a.g gVar = new com.bytedance.tux.navigation.a.g();
        String string = getString(R.string.pk);
        h.f.b.l.b(string, "");
        aVar.a(gVar.a(string));
        TuxNavBar tuxNavBar = (TuxNavBar) a(R.id.csl);
        TuxNavBar.a aVar2 = this.f109719k;
        if (aVar2 == null) {
            h.f.b.l.a("navActions");
        }
        tuxNavBar.setNavActions(aVar2);
        ((TuxNavBar) a(R.id.csl)).a(true);
        if (!TextUtils.isEmpty(this.f109711b) && !TextUtils.isEmpty(this.f109714e)) {
            TuxButton tuxButton2 = (TuxButton) a(R.id.xp);
            h.f.b.l.b(tuxButton2, "");
            tuxButton2.setEnabled(true);
            this.f109717h = true;
        }
        RecyclerView recyclerView = (RecyclerView) a(R.id.de3);
        h.f.b.l.b(recyclerView, "");
        RecyclerView.a adapter = recyclerView.getAdapter();
        if (adapter != null) {
            PowerStub g2 = ((PowerAdapter) adapter).g();
            if (g2 != null) {
                com.bytedance.ies.powerlist.a.b e2 = g2.e();
                if (!e2.a().containsKey(AddFeedToMixFragment.class)) {
                    e2.a().put(AddFeedToMixFragment.class, this);
                } else {
                    RuntimeException runtimeException = new RuntimeException("already contains control type :" + AddFeedToMixFragment.class);
                    MethodCollector.o(2526);
                    throw runtimeException;
                }
            }
            ((PowerList) a(R.id.de3)).a(AddFeedToMixListCell.class, DefaultMixListCell.class);
            ((PowerList) a(R.id.de3)).a(a().a());
            RecyclerView recyclerView2 = (RecyclerView) a(R.id.de3);
            h.f.b.l.b(recyclerView2, "");
            recyclerView2.setItemAnimator(null);
            ((TuxButton) a(R.id.xp)).setOnClickListener(new j(this, view));
            ((PowerList) a(R.id.de3)).a(new k(this));
            a().b();
            EventBus.a(EventBus.a(), this);
            MethodCollector.o(2526);
            return;
        }
        w wVar = new w("null cannot be cast to non-null type");
        MethodCollector.o(2526);
        throw wVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.akx, viewGroup, false);
    }

    static final class m implements View.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        public static final m f109749a = new m();

        static {
            Covode.recordClassIndex(70260);
        }

        m() {
        }

        public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
            h.f.b.l.d(view, "");
            h.f.b.l.d(keyEvent, "");
            if (i2 == 4 && keyEvent.getAction() == 1) {
                return true;
            }
            return false;
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public boolean f109739a;

        /* renamed from: b  reason: collision with root package name */
        public String f109740b;

        /* renamed from: c  reason: collision with root package name */
        public int f109741c;

        /* renamed from: d  reason: collision with root package name */
        public d f109742d;

        static {
            Covode.recordClassIndex(70252);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f109739a == fVar.f109739a && h.f.b.l.a(this.f109740b, fVar.f109740b) && this.f109741c == fVar.f109741c && h.f.b.l.a(this.f109742d, fVar.f109742d);
        }

        public final int hashCode() {
            boolean z = this.f109739a;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            String str = this.f109740b;
            int i6 = 0;
            int hashCode = (((i5 + (str != null ? str.hashCode() : 0)) * 31) + this.f109741c) * 31;
            d dVar = this.f109742d;
            if (dVar != null) {
                i6 = dVar.hashCode();
            }
            return hashCode + i6;
        }

        public final String toString() {
            return "MixPowerData(btnAble=" + this.f109739a + ", selectedMixId=" + this.f109740b + ", position=" + this.f109741c + ", item=" + this.f109742d + ")";
        }

        public f(boolean z, String str, int i2, d dVar) {
            h.f.b.l.d(dVar, "");
            this.f109739a = z;
            this.f109740b = str;
            this.f109741c = i2;
            this.f109742d = dVar;
        }
    }
}
