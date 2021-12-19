package com.ss.android.ugc.aweme.im.service.share.b;

import android.app.Activity;
import android.app.Dialog;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.f;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.d;
import h.f.b.l;
import java.util.List;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final Dialog f103938a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup f103939b = null;

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f103940c;

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f103941d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f103942e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f103943f;

    /* renamed from: g  reason: collision with root package name */
    public final d f103944g;

    /* renamed from: h  reason: collision with root package name */
    public final List<f> f103945h;

    /* renamed from: i  reason: collision with root package name */
    public final NestedScrollView.b f103946i;

    static {
        Covode.recordClassIndex(66582);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Activity activity, Dialog dialog, SharePackage sharePackage, FrameLayout frameLayout, RecyclerView recyclerView, LinearLayout linearLayout, TextView textView, d dVar, List<f> list, NestedScrollView.b bVar) {
        super(activity, sharePackage);
        l.d(activity, "");
        l.d(dialog, "");
        l.d(sharePackage, "");
        l.d(list, "");
        this.f103938a = dialog;
        this.f103940c = frameLayout;
        this.f103941d = recyclerView;
        this.f103942e = linearLayout;
        this.f103943f = textView;
        this.f103944g = dVar;
        this.f103945h = list;
        this.f103946i = bVar;
    }
}
