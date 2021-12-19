package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.als.l;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.geofencing.PublishSettingItem;
import com.ss.android.ugc.aweme.shortvideo.publish.v;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class ax extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    public static final a f131423c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public e f131424a;

    /* renamed from: b  reason: collision with root package name */
    public l<Boolean> f131425b;

    /* renamed from: d  reason: collision with root package name */
    private View f131426d;

    /* renamed from: e  reason: collision with root package name */
    private RecyclerView f131427e;

    /* renamed from: f  reason: collision with root package name */
    private PublishSettingItem f131428f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f131429g;

    /* renamed from: h  reason: collision with root package name */
    private HashMap f131430h;

    static {
        Covode.recordClassIndex(86099);
    }

    public void a() {
        HashMap hashMap = this.f131430h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(86100);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final VideoPublishViewModel b() {
        JediViewModel a2 = t.a(requireActivity()).a(VideoPublishViewModel.class);
        h.f.b.l.b(a2, "");
        return (VideoPublishViewModel) a2;
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ax f131432a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f131433b;

        static {
            Covode.recordClassIndex(86102);
        }

        c(ax axVar, boolean z) {
            this.f131432a = axVar;
            this.f131433b = z;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.port.in.l.f115658a.z().a(this.f131432a.getActivity(), this.f131433b);
        }
    }

    public final void a(boolean z) {
        if (z) {
            PublishSettingItem publishSettingItem = this.f131428f;
            if (publishSettingItem != null) {
                publishSettingItem.setSubtitle(R.string.g3d);
                return;
            }
            return;
        }
        PublishSettingItem publishSettingItem2 = this.f131428f;
        if (publishSettingItem2 != null) {
            publishSettingItem2.setSubtitle("");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ax f131431a;

        static {
            Covode.recordClassIndex(86101);
        }

        b(ax axVar) {
            this.f131431a = axVar;
        }

        public final void onClick(View view) {
            i supportFragmentManager;
            ClickAgent.onClick(view);
            e activity = this.f131431a.getActivity();
            if (!(activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null)) {
                supportFragmentManager.c();
            }
            l<Boolean> lVar = this.f131431a.f131425b;
            if (lVar == null) {
                h.f.b.l.a("fromPublishSettingPanel");
            }
            lVar.a((Boolean) true);
        }
    }

    public void a(View view) {
        TextView textView;
        boolean z;
        boolean z2;
        h.f.b.l.d(view, "");
        this.f131426d = view.findViewById(R.id.bvg);
        this.f131427e = (RecyclerView) view.findViewById(R.id.k6);
        this.f131425b = b().f131942d;
        View view2 = this.f131426d;
        if (view2 != null) {
            view2.setOnClickListener(new b(this));
        }
        PublishSettingItem publishSettingItem = (PublishSettingItem) view.findViewById(R.id.ws);
        this.f131428f = publishSettingItem;
        String str = null;
        if (publishSettingItem != null) {
            textView = publishSettingItem.getBottomHintTextView();
        } else {
            textView = null;
        }
        this.f131429g = textView;
        if (textView != null) {
            Context context = getContext();
            if (context != null) {
                str = context.getString(R.string.a3x);
            }
            textView.setText(str);
        }
        PublishSettingItem publishSettingItem2 = this.f131428f;
        if (publishSettingItem2 != null) {
            publishSettingItem2.setVisibility(8);
        }
        TextView textView2 = this.f131429g;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("key_enable_sponsor");
        } else {
            z = false;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z2 = arguments2.getBoolean("key_general_music");
        } else {
            z2 = false;
        }
        if (z) {
            PublishSettingItem publishSettingItem3 = this.f131428f;
            if (publishSettingItem3 != null) {
                publishSettingItem3.setVisibility(0);
            }
            PublishSettingItem publishSettingItem4 = this.f131428f;
            if (publishSettingItem4 != null) {
                publishSettingItem4.setDrawableLeft(2131232440);
            }
            PublishSettingItem publishSettingItem5 = this.f131428f;
            if (publishSettingItem5 != null) {
                publishSettingItem5.setTitle(R.string.a3t);
            }
            String h2 = com.ss.android.ugc.aweme.port.in.l.f115658a.z().h();
            if (TextUtils.equals(h2, "1") || TextUtils.equals(h2, "2")) {
                a(true);
            } else {
                a(false);
            }
            PublishSettingItem publishSettingItem6 = this.f131428f;
            if (publishSettingItem6 != null) {
                publishSettingItem6.setDrawableRight(2131230994);
            }
            TextView textView3 = this.f131429g;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            r.onEventV3("tcm_bctoggle_show");
            PublishSettingItem publishSettingItem7 = this.f131428f;
            if (publishSettingItem7 != null) {
                publishSettingItem7.setOnClickListener(new c(this, z2));
            }
        }
        List<v> list = b().f131939a;
        if (list.isEmpty()) {
            RecyclerView recyclerView = this.f131427e;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.f131427e;
        if (recyclerView2 != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            recyclerView2.setLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        RecyclerView recyclerView3 = this.f131427e;
        if (recyclerView3 != null) {
            getContext();
            recyclerView3.setLayoutManager(new LinearLayoutManager());
        }
        e eVar = new e(list);
        this.f131424a = eVar;
        RecyclerView recyclerView4 = this.f131427e;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(eVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.ah2, viewGroup, false);
        h.f.b.l.b(a2, "");
        a(a2);
        return a2;
    }
}
