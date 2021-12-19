package com.ss.android.ugc.aweme.comment.widgets;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ar;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.comment.adapter.ae;
import com.zhiliaoapp.musically.R;
import h.f.a.a;
import h.f.b.l;
import h.z;

public final class SearchGifWidgetV2 extends BaseSearchGifWidget implements TextWatcher, View.OnClickListener, TextView.OnEditorActionListener, ar<a>, au {

    /* renamed from: g  reason: collision with root package name */
    private final a<z> f73086g;

    /* renamed from: h  reason: collision with root package name */
    private final ae f73087h;

    /* renamed from: i  reason: collision with root package name */
    private final a<z> f73088i;

    /* renamed from: j  reason: collision with root package name */
    private final String f73089j;

    static {
        Covode.recordClassIndex(45023);
    }

    public final void afterTextChanged(Editable editable) {
    }

    @Override // com.bytedance.widget.Widget
    public final int b() {
        return R.layout.jb;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget
    public final void l() {
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget
    public final void m() {
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget
    public final void n() {
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
    }

    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentJediWidget, com.ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget, com.bytedance.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget
    public final boolean p() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget
    public final CharSequence o() {
        return "";
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* synthetic */ a d() {
        return new a();
    }

    public SearchGifWidgetV2(a<z> aVar, ae aeVar, a<z> aVar2, String str) {
        l.d(aVar, "");
        l.d(aeVar, "");
        l.d(aVar2, "");
        l.d(str, "");
        this.f73086g = aVar;
        this.f73087h = aeVar;
        this.f73088i = aVar2;
        this.f73089j = str;
    }
}
