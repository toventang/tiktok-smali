package com.ss.android.ugc.aweme.feed.adapter;

import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import h.f.b.l;

public final class be {

    /* renamed from: a  reason: collision with root package name */
    public final TuxTextView f91696a;

    /* renamed from: b  reason: collision with root package name */
    public final View f91697b;

    /* renamed from: c  reason: collision with root package name */
    public final TuxIconView f91698c;

    /* renamed from: d  reason: collision with root package name */
    public final TuxIconView f91699d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f91700e;

    /* renamed from: f  reason: collision with root package name */
    public final FrameLayout f91701f;

    /* renamed from: g  reason: collision with root package name */
    public SparseArray<Integer> f91702g;

    static {
        Covode.recordClassIndex(57734);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be)) {
            return false;
        }
        be beVar = (be) obj;
        return l.a(this.f91696a, beVar.f91696a) && l.a(this.f91697b, beVar.f91697b) && l.a(this.f91698c, beVar.f91698c) && l.a(this.f91699d, beVar.f91699d) && l.a(this.f91700e, beVar.f91700e) && l.a(this.f91701f, beVar.f91701f) && l.a(this.f91702g, beVar.f91702g);
    }

    public final int hashCode() {
        TuxTextView tuxTextView = this.f91696a;
        int i2 = 0;
        int hashCode = (tuxTextView != null ? tuxTextView.hashCode() : 0) * 31;
        View view = this.f91697b;
        int hashCode2 = (hashCode + (view != null ? view.hashCode() : 0)) * 31;
        TuxIconView tuxIconView = this.f91698c;
        int hashCode3 = (hashCode2 + (tuxIconView != null ? tuxIconView.hashCode() : 0)) * 31;
        TuxIconView tuxIconView2 = this.f91699d;
        int hashCode4 = (hashCode3 + (tuxIconView2 != null ? tuxIconView2.hashCode() : 0)) * 31;
        TextView textView = this.f91700e;
        int hashCode5 = (hashCode4 + (textView != null ? textView.hashCode() : 0)) * 31;
        FrameLayout frameLayout = this.f91701f;
        int hashCode6 = (hashCode5 + (frameLayout != null ? frameLayout.hashCode() : 0)) * 31;
        SparseArray<Integer> sparseArray = this.f91702g;
        if (sparseArray != null) {
            i2 = sparseArray.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "VideoShareViewProvider(shareTipsTv=" + this.f91696a + ", shareTipsRl=" + this.f91697b + ", shareLeftIcon=" + this.f91698c + ", shareRightEnter=" + this.f91699d + ", shareRightUndo=" + this.f91700e + ", bottomView=" + this.f91701f + ", bottomChildren=" + this.f91702g + ")";
    }

    public final void a(SparseArray<Integer> sparseArray) {
        l.d(sparseArray, "");
        this.f91702g = sparseArray;
    }

    public /* synthetic */ be(TuxTextView tuxTextView, View view, TuxIconView tuxIconView, TuxIconView tuxIconView2, TextView textView) {
        this(tuxTextView, view, tuxIconView, tuxIconView2, textView, null, new SparseArray());
    }

    public be(TuxTextView tuxTextView, View view, TuxIconView tuxIconView, TuxIconView tuxIconView2, TextView textView, FrameLayout frameLayout, SparseArray<Integer> sparseArray) {
        l.d(sparseArray, "");
        this.f91696a = tuxTextView;
        this.f91697b = view;
        this.f91698c = tuxIconView;
        this.f91699d = tuxIconView2;
        this.f91700e = textView;
        this.f91701f = frameLayout;
        this.f91702g = sparseArray;
    }
}
