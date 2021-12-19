package com.ss.android.ugc.aweme.choosemusic.c;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.choosemusic.a.l;
import com.ss.android.ugc.aweme.choosemusic.view.aa;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.views.RtlViewPager;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.z;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class am extends com.ss.android.ugc.aweme.base.f.a implements u<com.ss.android.ugc.aweme.arch.widgets.base.b> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f70438c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f70439a;

    /* renamed from: b  reason: collision with root package name */
    String f70440b;

    /* renamed from: d  reason: collision with root package name */
    private DmtTabLayout f70441d;

    /* renamed from: e  reason: collision with root package name */
    private RtlViewPager f70442e;

    /* renamed from: j  reason: collision with root package name */
    private TextTitleBar f70443j;

    /* renamed from: k  reason: collision with root package name */
    private TuxStatusView f70444k;

    /* renamed from: l  reason: collision with root package name */
    private l f70445l;

    /* renamed from: m  reason: collision with root package name */
    private String f70446m;
    private boolean n;
    private String o;
    private int p;
    private DataCenter q;
    private com.ss.android.ugc.aweme.choosemusic.model.b r;
    private int s;
    private int t;
    private int u;
    private HashMap v;

    static {
        Covode.recordClassIndex(43443);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43444);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ am this$0;

        static {
            Covode.recordClassIndex(43447);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(am amVar) {
            super(0);
            this.this$0 = amVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.b();
            this.this$0.a();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.v;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final void a() {
        com.ss.android.ugc.aweme.choosemusic.model.b bVar = this.r;
        if (bVar != null) {
            bVar.b(this.f70446m, this.p, this.u);
        }
    }

    public final void b() {
        TuxStatusView tuxStatusView = this.f70444k;
        if (tuxStatusView == null) {
            h.f.b.l.a("statusView");
        }
        tuxStatusView.setVisibility(0);
        TuxStatusView tuxStatusView2 = this.f70444k;
        if (tuxStatusView2 == null) {
            h.f.b.l.a("statusView");
        }
        tuxStatusView2.a();
    }

    private void c() {
        TuxStatusView tuxStatusView = this.f70444k;
        if (tuxStatusView == null) {
            h.f.b.l.a("statusView");
        }
        tuxStatusView.setVisibility(0);
        TuxStatusView tuxStatusView2 = this.f70444k;
        if (tuxStatusView2 == null) {
            h.f.b.l.a("statusView");
        }
        tuxStatusView2.setStatus(com.ss.android.ugc.aweme.tux.a.g.a.b(new TuxStatusView.c(), new d(this)));
    }

    public static final class b implements DmtTabLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ am f70447a;

        static {
            Covode.recordClassIndex(43445);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(am amVar) {
            this.f70447a = amVar;
        }

        @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.c
        public final void b(DmtTabLayout.f fVar) {
            Integer num;
            Resources resources;
            if (!(fVar == null || fVar.f33753f == null)) {
                View view = fVar.f33753f;
                Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.view.MusicTabItemView");
                aa aaVar = (aa) view;
                Context context = aaVar.f70781a;
                if (!(context == null || (resources = context.getResources()) == null)) {
                    aaVar.setTextColor(resources.getColor(R.color.c2));
                }
            }
            am amVar = this.f70447a;
            if (fVar != null) {
                num = Integer.valueOf(fVar.f33752e);
            } else {
                num = null;
            }
            amVar.a(num);
        }

        @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.c
        public final void a(DmtTabLayout.f fVar) {
            if (fVar != null) {
                if (fVar.f33753f != null) {
                    View view = fVar.f33753f;
                    Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.view.MusicTabItemView");
                    ((aa) view).a();
                }
                if (fVar.f33748a != null && (fVar.f33748a instanceof String)) {
                    am amVar = this.f70447a;
                    String str = amVar.f70439a;
                    Object obj = fVar.f33748a;
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                    String str2 = (String) obj;
                    com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", amVar.f70440b);
                    if (str == null) {
                        str = "";
                    }
                    com.ss.android.ugc.aweme.app.f.d a3 = a2.a("category_name", str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    r.a("change_song_language_tab", a3.a("tab_name", str2).f66730a);
                }
            }
        }
    }

    public static final class c implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ am f70448a;

        static {
            Covode.recordClassIndex(43446);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(am amVar) {
            this.f70448a = amVar;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            if (this.f70448a.getActivity() != null) {
                e activity = this.f70448a.getActivity();
                if (activity == null) {
                    h.f.b.l.b();
                }
                activity.onBackPressed();
            }
        }
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f70446m = arguments.getString("music_class_id");
            this.f70439a = arguments.getString("music_class_name");
            this.f70440b = arguments.getString("music_class_enter_from");
            this.n = arguments.getBoolean("music_class_is_hot", false);
            this.o = arguments.getString("music_class_enter_method");
            this.s = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
            this.p = arguments.getInt("music_class_level");
            this.u = arguments.getInt("sound_page_scene", 0);
        }
    }

    private static boolean a(Context context) {
        if (context != null) {
            try {
                Object a2 = a(context, "connectivity");
                if (a2 != null) {
                    NetworkInfo a3 = a((ConnectivityManager) a2);
                    if (a3 == null || !a3.isAvailable()) {
                        return false;
                    }
                    return true;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    public final void a(Integer num) {
        ArrayList<af> arrayList;
        af afVar = null;
        if (num != null) {
            int intValue = num.intValue();
            l lVar = this.f70445l;
            if (!(lVar == null || (arrayList = lVar.f70310a) == null)) {
                afVar = arrayList.get(intValue);
            }
        }
        if (afVar instanceof af) {
            RecyclerView.a k2 = afVar.k();
            if (k2 instanceof com.ss.android.ugc.aweme.choosemusic.a.b) {
                ((com.ss.android.ugc.aweme.choosemusic.a.b) k2).a();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        com.ss.android.ugc.aweme.arch.b<String, Object> bVar2;
        List<MusicCollectionItem> list;
        ArrayList<MusicCollectionItem> arrayList;
        MusicCollectionItem musicCollectionItem;
        ArrayList<MusicCollectionItem> arrayList2;
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar3 = bVar;
        if (bVar3 != null) {
            String str = bVar3.f67014a;
            int hashCode = str.hashCode();
            if (hashCode != -314811087) {
                if (hashCode == -252789122 && str.equals("second_level_music_list")) {
                    TuxStatusView tuxStatusView = this.f70444k;
                    if (tuxStatusView == null) {
                        h.f.b.l.a("statusView");
                    }
                    tuxStatusView.setVisibility(8);
                    DataCenter dataCenter = this.q;
                    if (dataCenter != null) {
                        bVar2 = (com.ss.android.ugc.aweme.arch.b) dataCenter.a("second_level_music_list");
                        if (bVar2 != null) {
                            list = (List) bVar2.a("list_collection_data");
                        }
                        list = null;
                    } else {
                        bVar2 = null;
                        list = null;
                    }
                    if (com.bytedance.common.utility.collection.b.a((Collection) list)) {
                        TuxStatusView tuxStatusView2 = this.f70444k;
                        if (tuxStatusView2 == null) {
                            h.f.b.l.a("statusView");
                        }
                        tuxStatusView2.setVisibility(0);
                        TuxStatusView tuxStatusView3 = this.f70444k;
                        if (tuxStatusView3 == null) {
                            h.f.b.l.a("statusView");
                        }
                        TuxStatusView.c cVar = new TuxStatusView.c();
                        String string = getString(R.string.cn4);
                        h.f.b.l.b(string, "");
                        tuxStatusView3.setStatus(cVar.a((CharSequence) string));
                        return;
                    }
                    if (list != null) {
                        int i2 = 0;
                        for (MusicCollectionItem musicCollectionItem2 : list) {
                            l lVar = this.f70445l;
                            if (!(lVar == null || (arrayList2 = lVar.f70311b) == null)) {
                                arrayList2.add(musicCollectionItem2);
                            }
                            if (this.p == 1) {
                                if (i2 == 0) {
                                    l lVar2 = this.f70445l;
                                    if (lVar2 != null) {
                                        lVar2.a(musicCollectionItem2.mcId, musicCollectionItem2.mcName, musicCollectionItem2.isHot, bVar2, this.u);
                                    }
                                } else {
                                    l lVar3 = this.f70445l;
                                    if (lVar3 != null) {
                                        lVar3.a(musicCollectionItem2.mcId, musicCollectionItem2.mcName, musicCollectionItem2.isHot, null, this.u);
                                    }
                                }
                            }
                            i2++;
                        }
                    }
                    RtlViewPager rtlViewPager = this.f70442e;
                    if (rtlViewPager == null) {
                        h.f.b.l.a("mSecondLevelViewPager");
                    }
                    rtlViewPager.setAdapter(this.f70445l);
                    DmtTabLayout dmtTabLayout = this.f70441d;
                    if (dmtTabLayout == null) {
                        h.f.b.l.a("mSecondLevelTabLayout");
                    }
                    RtlViewPager rtlViewPager2 = this.f70442e;
                    if (rtlViewPager2 == null) {
                        h.f.b.l.a("mSecondLevelViewPager");
                    }
                    dmtTabLayout.setupWithViewPager(rtlViewPager2);
                    DmtTabLayout dmtTabLayout2 = this.f70441d;
                    if (dmtTabLayout2 == null) {
                        h.f.b.l.a("mSecondLevelTabLayout");
                    }
                    int tabCount = dmtTabLayout2.getTabCount();
                    for (int i3 = 0; i3 < tabCount; i3++) {
                        aa aaVar = new aa(getContext());
                        l lVar4 = this.f70445l;
                        String str2 = (lVar4 == null || (arrayList = lVar4.f70311b) == null || (musicCollectionItem = arrayList.get(i3)) == null) ? null : musicCollectionItem.mcName;
                        DmtTabLayout dmtTabLayout3 = this.f70441d;
                        if (dmtTabLayout3 == null) {
                            h.f.b.l.a("mSecondLevelTabLayout");
                        }
                        DmtTabLayout.f b2 = dmtTabLayout3.b(i3);
                        aaVar.setText(str2);
                        if (b2 != null) {
                            b2.a(aaVar);
                            b2.f33748a = str2;
                        }
                        if (i3 == 0) {
                            aaVar.a();
                        }
                        DmtTabLayout dmtTabLayout4 = this.f70441d;
                        if (dmtTabLayout4 == null) {
                            h.f.b.l.a("mSecondLevelTabLayout");
                        }
                        int tabCount2 = dmtTabLayout4.getTabCount();
                        DmtTabLayout dmtTabLayout5 = this.f70441d;
                        if (dmtTabLayout5 == null) {
                            h.f.b.l.a("mSecondLevelTabLayout");
                        }
                        View d2 = dmtTabLayout5.d(i3);
                        if (d2 != null) {
                            if (i3 == 0) {
                                if (tabCount2 == 1) {
                                    int i4 = this.t;
                                    a(d2, i4, i4);
                                } else {
                                    a(d2, this.t, -1);
                                }
                            } else if (i3 == tabCount2 - 1) {
                                a(d2, -1, this.t);
                            }
                        }
                    }
                    DmtTabLayout dmtTabLayout6 = this.f70441d;
                    if (dmtTabLayout6 == null) {
                        h.f.b.l.a("mSecondLevelTabLayout");
                    }
                    dmtTabLayout6.a(new b(this));
                }
            } else if (str.equals("status_second_level_music_list")) {
                Integer num = (Integer) bVar3.a();
                if (num == null || num.intValue() != 0) {
                    c();
                }
            }
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(4715);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
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
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(4715);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        RtlViewPager rtlViewPager = this.f70442e;
        if (rtlViewPager == null) {
            h.f.b.l.a("mSecondLevelViewPager");
        }
        rtlViewPager.setOffscreenPageLimit(1);
        androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
        h.f.b.l.b(childFragmentManager, "");
        this.f70445l = new l(childFragmentManager, this.f70446m, this.f70439a, this.f70440b, this.s, this.n, this.o, this.p);
        DmtTabLayout dmtTabLayout = this.f70441d;
        if (dmtTabLayout == null) {
            h.f.b.l.a("mSecondLevelTabLayout");
        }
        dmtTabLayout.setTabMode(0);
        DmtTabLayout dmtTabLayout2 = this.f70441d;
        if (dmtTabLayout2 == null) {
            h.f.b.l.a("mSecondLevelTabLayout");
        }
        dmtTabLayout2.setTabMaxWidth(Integer.MAX_VALUE);
        if (!a(getContext())) {
            c();
        } else {
            a();
        }
    }

    private static void a(View view, int i2, int i3) {
        if (i2 != -1 || i3 != -1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (i2 != -1) {
                int i4 = Build.VERSION.SDK_INT;
                marginLayoutParams.setMarginStart(i2);
            }
            if (i3 != -1) {
                int i5 = Build.VERSION.SDK_INT;
                marginLayoutParams.setMarginEnd(i3);
            }
            view.setLayoutParams(marginLayoutParams);
            view.invalidate();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.a1m, viewGroup, false);
        View findViewById = a2.findViewById(R.id.dwa);
        h.f.b.l.b(findViewById, "");
        this.f70441d = (DmtTabLayout) findViewById;
        View findViewById2 = a2.findViewById(R.id.dwd);
        h.f.b.l.b(findViewById2, "");
        this.f70442e = (RtlViewPager) findViewById2;
        View findViewById3 = a2.findViewById(R.id.cr2);
        h.f.b.l.b(findViewById3, "");
        this.f70444k = (TuxStatusView) findViewById3;
        View findViewById4 = a2.findViewById(R.id.em8);
        h.f.b.l.b(findViewById4, "");
        TextTitleBar textTitleBar = (TextTitleBar) findViewById4;
        this.f70443j = textTitleBar;
        if (textTitleBar == null) {
            h.f.b.l.a("textTitleBar");
        }
        textTitleBar.setOnTitleBarClickListener(new c(this));
        TextTitleBar textTitleBar2 = this.f70443j;
        if (textTitleBar2 == null) {
            h.f.b.l.a("textTitleBar");
        }
        textTitleBar2.setColorMode(0);
        TextTitleBar textTitleBar3 = this.f70443j;
        if (textTitleBar3 == null) {
            h.f.b.l.a("textTitleBar");
        }
        textTitleBar3.setTitle(this.f70439a);
        b();
        this.t = (int) n.b(getActivity(), 16.0f);
        if (this.q == null) {
            this.q = DataCenter.a(ae.a(this, (ad.b) null), this);
        }
        DataCenter dataCenter = this.q;
        if (dataCenter != null) {
            dataCenter.a("status_second_level_music_list", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        }
        DataCenter dataCenter2 = this.q;
        if (dataCenter2 != null) {
            dataCenter2.a("second_level_music_list", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        }
        this.r = new com.ss.android.ugc.aweme.choosemusic.model.b(getContext(), this.q);
        return a2;
    }
}
