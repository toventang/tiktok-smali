package com.ss.android.ugc.aweme.comment.gift;

import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.a.w;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.List;
import java.util.MissingFormatArgumentException;

public final class g extends RecyclerView.a<h> {

    /* renamed from: a  reason: collision with root package name */
    GiftStruct[] f71874a = new GiftStruct[0];

    /* renamed from: b  reason: collision with root package name */
    final int f71875b;

    /* renamed from: c  reason: collision with root package name */
    private long f71876c = -1;

    /* renamed from: d  reason: collision with root package name */
    private final LayoutInflater f71877d;

    /* renamed from: e  reason: collision with root package name */
    private final Fragment f71878e;

    /* renamed from: f  reason: collision with root package name */
    private final e f71879f;

    /* renamed from: g  reason: collision with root package name */
    private final GiftViewModel f71880g;

    /* renamed from: h  reason: collision with root package name */
    private final String f71881h;

    /* renamed from: i  reason: collision with root package name */
    private final String f71882i;

    /* renamed from: j  reason: collision with root package name */
    private final String f71883j;

    /* renamed from: k  reason: collision with root package name */
    private final String f71884k;

    static {
        Covode.recordClassIndex(44203);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ h onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f71874a.length;
    }

    public final void a(long j2) {
        this.f71876c = j2;
        notifyDataSetChanged();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(h hVar, int i2) {
        List<String> list;
        String str;
        String quantityString;
        List<String> urlList;
        String str2;
        h hVar2 = hVar;
        l.d(hVar2, "");
        GiftStruct giftStruct = this.f71874a[i2];
        long j2 = this.f71876c;
        if (giftStruct != null) {
            hVar2.f71886a = giftStruct;
            UrlModel imageList = giftStruct.getImageList();
            if (imageList != null) {
                list = imageList.getUrlList();
            } else {
                list = null;
            }
            if (list != null && !list.isEmpty()) {
                View findViewById = hVar2.itemView.findViewById(R.id.bba);
                l.b(findViewById, "");
                SmartImageView smartImageView = (SmartImageView) findViewById;
                UrlModel imageList2 = giftStruct.getImageList();
                if (!(imageList2 == null || (urlList = imageList2.getUrlList()) == null || (str2 = (String) n.h((List) urlList)) == null)) {
                    v a2 = r.a(str2);
                    a2.E = smartImageView;
                    a2.v = w.CENTER_INSIDE;
                    a2.c();
                }
            }
            View findViewById2 = hVar2.f71889d.findViewById(R.id.bau);
            l.b(findViewById2, "");
            TextView textView = (TextView) findViewById2;
            try {
                str = hVar2.f71890e.getResources().getQuantityString(R.plurals.j_, giftStruct.getDiamondCount(), Integer.valueOf(giftStruct.getDiamondCount()));
                l.b(str, "");
            } catch (MissingFormatArgumentException unused) {
                if (giftStruct.getDiamondCount() <= 1) {
                    quantityString = hVar2.f71890e.getResources().getQuantityString(R.plurals.iu, 1, 1);
                } else {
                    quantityString = hVar2.f71890e.getResources().getQuantityString(R.plurals.iu, 2, 2);
                }
                l.b(quantityString, "");
                str = giftStruct.getDiamondCount() + ' ' + quantityString;
            }
            textView.setText(str);
            View findViewById3 = hVar2.f71889d.findViewById(R.id.bbe);
            l.b(findViewById3, "");
            TuxTextView tuxTextView = (TuxTextView) findViewById3;
            tuxTextView.setMinTextSize(10.0f);
            tuxTextView.setText(giftStruct.getName());
            if (giftStruct.getId() == j2) {
                hVar2.f71889d.setBackgroundResource(R.drawable.lx);
            } else {
                hVar2.f71889d.setBackground(null);
            }
            hVar2.f71887b = j2;
            hVar2.f71889d.setVisibility(0);
            return;
        }
        hVar2.f71889d.setVisibility(4);
    }

    private static RecyclerView.ViewHolder a(g gVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(1164);
        l.d(viewGroup, "");
        View a3 = a.a(gVar.f71877d, R.layout.im, null, false);
        l.b(a3, "");
        h hVar = new h(a3, gVar.f71878e, gVar.f71879f, gVar.f71881h, gVar.f71880g, gVar.f71882i, gVar.f71883j, gVar.f71884k);
        Point point = new Point();
        int b2 = (int) com.bytedance.common.utility.n.b(gVar.f71879f, 24.0f);
        WindowManager windowManager = gVar.f71879f.getWindowManager();
        l.b(windowManager, "");
        windowManager.getDefaultDisplay().getSize(point);
        ConstraintLayout.a aVar = new ConstraintLayout.a((point.x - b2) / 4, (int) com.bytedance.common.utility.n.b(gVar.f71879f, 100.0f));
        View view = hVar.itemView;
        l.b(view, "");
        view.setLayoutParams(aVar);
        h hVar2 = hVar;
        try {
            if (hVar2.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(hVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) hVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(hVar2.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = hVar2.getClass().getName();
        MethodCollector.o(1164);
        return hVar2;
    }

    public g(Fragment fragment, e eVar, GiftViewModel giftViewModel, String str, String str2, String str3, String str4) {
        l.d(fragment, "");
        l.d(eVar, "");
        l.d(giftViewModel, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.f71878e = fragment;
        this.f71879f = eVar;
        this.f71880g = giftViewModel;
        this.f71881h = str;
        this.f71882i = str2;
        this.f71883j = str3;
        this.f71884k = str4;
        LayoutInflater from = LayoutInflater.from(eVar);
        l.b(from, "");
        this.f71877d = from;
        this.f71875b = 8;
        giftViewModel.b().observe(eVar, new u(this) {
            /* class com.ss.android.ugc.aweme.comment.gift.g.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f71885a;

            static {
                Covode.recordClassIndex(44204);
            }

            {
                this.f71885a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                GiftStruct giftStruct = (GiftStruct) obj;
                if (giftStruct != null) {
                    this.f71885a.a(giftStruct.getId());
                } else {
                    this.f71885a.a(-1);
                }
            }
        });
    }
}
