package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.d;
import com.bytedance.tux.navigation.a.g;
import com.bytedance.tux.sheet.c;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.f;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public final class be extends Fragment implements com.bytedance.tux.navigation.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f131472b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public SelectSaveLocalOptionActivity.b f131473a;

    /* renamed from: c  reason: collision with root package name */
    private RecyclerView f131474c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f131475d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f131476e;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f131477f;

    static {
        Covode.recordClassIndex(86123);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(86124);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ be f131478a;

        static {
            Covode.recordClassIndex(86125);
        }

        @Override // com.bytedance.tux.navigation.a.d
        public final void a() {
            a.b.a(this.f131478a, c.d.f45284a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(be beVar) {
            this.f131478a = beVar;
        }
    }

    public static final class c implements SelectSaveLocalOptionActivity.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ be f131479a;

        static {
            Covode.recordClassIndex(86126);
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
        @Override // com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity.b
        public final void a() {
            /*
                r1 = this;
                com.ss.android.ugc.aweme.shortvideo.ui.be r0 = r1.f131479a
                com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity$b r0 = r0.f131473a
                if (r0 == 0) goto L_0x0009
                r0.a()
            L_0x0009:
                com.ss.android.ugc.aweme.shortvideo.ui.be r0 = r1.f131479a
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.be.c.a():void");
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
        @Override // com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity.b
        public final void b() {
            /*
                r1 = this;
                com.ss.android.ugc.aweme.shortvideo.ui.be r0 = r1.f131479a
                com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity$b r0 = r0.f131473a
                if (r0 == 0) goto L_0x0009
                r0.b()
            L_0x0009:
                com.ss.android.ugc.aweme.shortvideo.ui.be r0 = r1.f131479a
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.be.c.b():void");
        }

        c(be beVar) {
            this.f131479a = beVar;
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
        @Override // com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity.b
        public final void a(int r2) {
            /*
                r1 = this;
                com.ss.android.ugc.aweme.shortvideo.ui.be r0 = r1.f131479a
                com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity$b r0 = r0.f131473a
                if (r0 == 0) goto L_0x0009
                r0.a(r2)
            L_0x0009:
                com.ss.android.ugc.aweme.shortvideo.ui.be r0 = r1.f131479a
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.be.c.a(int):void");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f131477f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.tux.navigation.a
    public final TuxNavBar.a a() {
        String str;
        TuxNavBar.a b2 = new TuxNavBar.a().b(new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark_small).a((d) new b(this)));
        g gVar = new g();
        Context context = getContext();
        if (context == null || (str = context.getString(R.string.fg_)) == null) {
            str = "";
        }
        l.b(str, "");
        TuxNavBar.a a2 = b2.a(gVar.a(str));
        a2.f45188d = true;
        return a2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context != null) {
            try {
                this.f131473a = (VideoPublishActivity) context;
            } catch (Exception e2) {
                bj.b(e2.toString());
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.a1k, viewGroup, false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f131475d = arguments.getBoolean("mute_download");
            this.f131476e = arguments.getBoolean("download_grayTag");
        }
        View findViewById = a2.findViewById(R.id.dr2);
        l.b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f131474c = recyclerView;
        if (recyclerView == null) {
            l.a("mRv");
        }
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        if (!f.a("android.permission.WRITE_EXTERNAL_STORAGE") || getArguments() == null) {
            i2 = 0;
        } else {
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                l.b();
            }
            i2 = arguments2.getInt("extra_save_option", 0);
        }
        List<Integer> list = SelectSaveLocalOptionActivity.f131144e;
        boolean z = this.f131475d;
        boolean z2 = this.f131476e;
        e requireActivity = requireActivity();
        l.b(requireActivity, "");
        recyclerView.setAdapter(new SelectSaveLocalOptionActivity.c(list, i2, z, z2, requireActivity, new c(this)));
        return a2;
    }
}
